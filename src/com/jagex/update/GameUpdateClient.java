package com.jagex.update;

import com.jagex.Game;
import com.jagex.cache.CacheArchive;
import com.jagex.io.Buffer;
import com.jagex.util.LinkedList;
import com.jagex.sign.Signlink;
import com.jagex.util.Queue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

public class GameUpdateClient implements Runnable {

    public Game game;
    public CRC32 crc32 = new CRC32();
    public GameUpdateRequest gameUpdateRequest;
    public InputStream updateServerInputStream;
    public Socket updateServerSocket;
    public OutputStream updateServerOutputStream;
    public LinkedList mandatoryRequests = new LinkedList();
    public Queue immediateRequests = new Queue();
    public LinkedList extras = new LinkedList();
    public LinkedList pendingRequests = new LinkedList();
    public LinkedList completedRequests = new LinkedList();
    public LinkedList unrequested = new LinkedList();
    public int totalRequestCount;
    public int requestedCount;
    public int extrasRequestedCount;
    public int completedRequestCount;
    public byte[][] filePriorities = new byte[4][];
    public int[][] fileChecksums = new int[4][];
    public int[][] fileVersions = new int[4][];
    public byte[] modelFileIndexes;
    public int[] animIndexes;
    public int[] regionPreloadFlags;
    public int[] midiPriorities;
    public int[] regionMapIndexes;
    public int[] regionLandscapeIndexes;
    public String message = "";
    public byte[] inputBuffer = new byte[500];
    public boolean dataExpected = false;
    public boolean running = true;
    public int offset;
    public int readable;
    public int highestPriority;
    public long lastRequestTime;
    public int[] regionCoordHashes;
    public int inactiveTime;
    public int idleCycles;
    public int cycle;
    public byte[] deflateOut = new byte[65000];
    public int errors;

    public void requestMandatory() {
        requestedCount = 0;
        extrasRequestedCount = 0;
        GameUpdateRequest pendingRequest = (GameUpdateRequest) pendingRequests.first();

        for (/**/; pendingRequest != null; pendingRequest = (GameUpdateRequest) pendingRequests.next()) {
            if (pendingRequest.mandatory) {
                requestedCount++;
            } else {
                extrasRequestedCount++;
            }
        }

        while (requestedCount < 10) {
            pendingRequest = (GameUpdateRequest) unrequested.pop();
            if (pendingRequest == null) {
                break;
            }

            if ((filePriorities[pendingRequest.type][pendingRequest.file]) != 0) {
                completedRequestCount++;
            }

            filePriorities[pendingRequest.type][pendingRequest.file] = (byte) 0;
            pendingRequests.pushBack(pendingRequest);
            requestedCount++;
            sendRequest(pendingRequest);
            dataExpected = true;
        }
    }

    public void loadMandatory() {
        GameUpdateRequest request;

        synchronized (mandatoryRequests) {
            request = (GameUpdateRequest) mandatoryRequests.pop();
        }

        while (request != null) {
            dataExpected = true;
            byte[] data = null;
            if (game.cacheIndexes[0] != null) {
                data = game.cacheIndexes[request.type + 1].readFile(request.file);
            }

            if (!verify(data, (fileChecksums[request.type][request.file]), (fileVersions[request.type][request.file]))) {
                data = null;
            }

            synchronized (mandatoryRequests) {
                if (data == null) {
                    unrequested.pushBack(request);
                } else {
                    request.buffer = data;
                    synchronized (completedRequests) {
                        completedRequests.pushBack(request);
                    }
                }

                request = (GameUpdateRequest) mandatoryRequests.pop();
            }
        }
    }

    public boolean highPriorityMidi(int midiIndex) {
        return midiPriorities[midiIndex] == 1;
    }

    public int getModelAttributes(int modelIndex) {
        return modelFileIndexes[modelIndex] & 0xff;
    }

    public boolean landscapeExists(int landscapeIndex) {
        for (int i = 0; i < regionCoordHashes.length; i++) {
            if (regionLandscapeIndexes[i] == landscapeIndex) {
                return true;
            }
        }

        return false;
    }

    public void requestFile(int type, int file) {
        if (type >= 0 && type <= fileVersions.length && file >= 0 && file <= fileVersions[type].length && fileVersions[type][file] != 0) {
            synchronized (immediateRequests) {
                for (GameUpdateRequest updateNode = (GameUpdateRequest) immediateRequests.first(); updateNode != null; updateNode = (GameUpdateRequest) immediateRequests.next()) {
                    if (updateNode.type == type && updateNode.file == file) {
                        return;
                    }
                }

                GameUpdateRequest updateNode = new GameUpdateRequest();
                updateNode.type = type;
                updateNode.file = file;
                updateNode.mandatory = true;

                synchronized (mandatoryRequests) {
                    mandatoryRequests.pushBack(updateNode);
                }

                immediateRequests.push(updateNode);
            }
        }
    }

    public void loadExtra(int type, int file) {
        if (game.cacheIndexes[0] != null && fileVersions[type][file] != 0 && filePriorities[type][file] != 0 && highestPriority != 0) {
            GameUpdateRequest request = new GameUpdateRequest();
            request.type = type;
            request.file = file;
            request.mandatory = false;

            synchronized (extras) {
                extras.pushBack(request);
            }
        }
    }

    public int animCount() {
        return animIndexes.length;
    }

    public void sendRequest(GameUpdateRequest request) {
        try {
            if (updateServerSocket == null) {
                long currentTime = System.currentTimeMillis();
                if (currentTime - lastRequestTime < 4000L) {
                    return;
                }

                lastRequestTime = currentTime;
                updateServerSocket = game.openSocket(43594 + Game.portOffset);
                updateServerInputStream = updateServerSocket.getInputStream();
                updateServerOutputStream = updateServerSocket.getOutputStream();
                updateServerOutputStream.write(15);

                for (int i = 0; i < 8; i++) {
                    updateServerInputStream.read();
                }

                idleCycles = 0;
            }

            inputBuffer[0] = (byte) request.type;
            inputBuffer[1] = (byte) (request.file >> 8);
            inputBuffer[2] = (byte) request.file;

            if (request.mandatory) {
                inputBuffer[3] = (byte) 2;
            } else if (!game.loggedIn) {
                inputBuffer[3] = (byte) 1;
            } else {
                inputBuffer[3] = (byte) 0;
            }

            updateServerOutputStream.write(inputBuffer, 0, 4);
            inactiveTime = 0;
            errors = -10000;
        } catch (IOException e) {
            try {
                updateServerSocket.close();
            } catch (Exception ignored) {}

            updateServerSocket = null;
            updateServerInputStream = null;
            updateServerOutputStream = null;
            readable = 0;
            errors++;
        }
    }

    public int getRegionIndex(int regionX, int regionY, int type) {
        int hash = (regionX << 8) + regionY;
        for (int i = 0; i < regionCoordHashes.length; i++) {
            if (regionCoordHashes[i] == hash) {
                if (type == 0) {
                    return regionMapIndexes[i];
                }

                return regionLandscapeIndexes[i];
            }
        }
        return -1;
    }

    public void stop() {
        running = false;
    }

    public void requestExtra(int type, int file, byte priority) {
        if (game.cacheIndexes[0] != null && fileVersions[type][file] != 0) {
            byte[] data = game.cacheIndexes[type + 1].readFile(file);

            if (!verify(data, fileChecksums[type][file], fileVersions[type][file])) {
                filePriorities[type][file] = priority;

                if (priority > highestPriority) {
                    highestPriority = priority;
                }

                totalRequestCount++;
            }
        }
    }

    public int getFileVersionCount(int type) {
        return fileVersions[type].length;
    }

    public void loadExtras() {
        for (; ; ) {
            if (requestedCount != 0) {
                break;
            }
            if (extrasRequestedCount >= 10) {
                break;
            }
            if (highestPriority == 0) {
                break;
            }

            GameUpdateRequest request;
            synchronized (extras) {
                request = (GameUpdateRequest) extras.pop();
            }

            while (request != null) {
                if ((filePriorities[request.type][request.file]) != 0) {
                    filePriorities[request.type][request.file] = (byte) 0;
                    pendingRequests.pushBack(request);
                    sendRequest(request);
                    dataExpected = true;

                    if (completedRequestCount < totalRequestCount) {
                        completedRequestCount++;
                    }

                    message = ("Loading extra files - " +
                            (completedRequestCount * 100 / totalRequestCount) + "%");
                    extrasRequestedCount++;
                    if (extrasRequestedCount == 10) {
                        return;
                    }
                }

                synchronized (extras) {
                    request = ((GameUpdateRequest) extras.pop());
                }
            }

            for (int type = 0; type < 4; type++) {
                byte[] data = filePriorities[type];
                int size = data.length;

                for (int file = 0; file < size; file++) {
                    if (data[file] == highestPriority) {
                        data[file] = (byte) 0;
                        request = new GameUpdateRequest();
                        request.type = type;
                        request.file = file;
                        request.mandatory = false;
                        pendingRequests.pushBack(request);
                        sendRequest(request);
                        dataExpected = true;

                        if (completedRequestCount < totalRequestCount) {
                            completedRequestCount++;
                        }

                        message = ("Loading extra files - " +
                                (completedRequestCount * 100 / totalRequestCount) + "%");
                        extrasRequestedCount++;
                        if (extrasRequestedCount == 10) {
                            return;
                        }
                    }
                }
            }

            highestPriority--;
        }
    }

    public void handleResponse() {
        try {
            int available = updateServerInputStream.available();

            if (readable == 0 && available >= 6) {
                dataExpected = true;

                for (int i = 0; i < 6; i += updateServerInputStream.read(inputBuffer, i, 6 - i)) {}

                int type = inputBuffer[0] & 0xff;
                int id = (((inputBuffer[1] & 0xff) << 8) + (inputBuffer[2] & 0xff));
                int size = (((inputBuffer[3] & 0xff) << 8) + (inputBuffer[4] & 0xff));
                int chunk = inputBuffer[5] & 0xff;
                gameUpdateRequest = null;

                for (GameUpdateRequest updateNode = ((GameUpdateRequest) pendingRequests.first()); updateNode != null; updateNode = ((GameUpdateRequest) pendingRequests.next())) {
                    if (updateNode.type == type && updateNode.file == id) {
                        gameUpdateRequest = updateNode;
                    }

                    if (gameUpdateRequest != null) {
                        updateNode.cyclesSinceSent = 0;
                    }
                }

                if (gameUpdateRequest != null) {
                    idleCycles = 0;
                    if (size == 0) {
                        Signlink.reportError("Rej: " + type + "," + id);
                        gameUpdateRequest.buffer = null;

                        if (gameUpdateRequest.mandatory) {
                            synchronized (completedRequests) {
                                completedRequests.pushBack(gameUpdateRequest);
                            }
                        } else {
                            gameUpdateRequest.remove();
                        }

                        gameUpdateRequest = null;
                    } else {
                        if ((gameUpdateRequest.buffer == null) && chunk == 0) {
                            gameUpdateRequest.buffer = new byte[size];
                        }

                        if ((gameUpdateRequest.buffer == null) && chunk != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }

                offset = chunk * 500;
                readable = 500;

                if (readable > size - chunk * 500) {
                    readable = size - chunk * 500;
                }
            }

            if (readable <= 0 || available < readable) {
                return;
            }

            dataExpected = true;
            byte[] buffer = inputBuffer;
            int bufferOffset = 0;
            if (gameUpdateRequest != null) {
                buffer = gameUpdateRequest.buffer;
                bufferOffset = offset;
            }

            for (int i = 0; i < readable; i += updateServerInputStream.read(buffer, i + bufferOffset, (readable - i))) {}

            if (readable + offset >= buffer.length && gameUpdateRequest != null) {
                if (game.cacheIndexes[0] != null) {
                    game.cacheIndexes[gameUpdateRequest.type + 1].writeFile(buffer, gameUpdateRequest.file, buffer.length);
                }

                if (!gameUpdateRequest.mandatory && gameUpdateRequest.type == 3) {
                    gameUpdateRequest.mandatory = true;
                    gameUpdateRequest.type = 93;
                }

                if (gameUpdateRequest.mandatory) {
                    synchronized (completedRequests) {
                        completedRequests.pushBack(gameUpdateRequest);
                    }
                } else {
                    gameUpdateRequest.remove();
                }
            }

            readable = 0;
        } catch (IOException ioException) {
            try {
                updateServerSocket.close();
            } catch (Exception ignored) {}

            updateServerSocket = null;
            updateServerInputStream = null;
            updateServerOutputStream = null;
            readable = 0;
        }
    }

    public void clearExtras() {
        synchronized (extras) {
            extras.clear();
        }
    }

    public int immediateRequestCount() {
        synchronized (immediateRequests) {
            return immediateRequests.size();
        }
    }

    public boolean verify(byte[] data, int cacheChecksum, int cacheVersion) {
        if (data == null || data.length < 2) {
            return false;
        }

        int fileLength = data.length - 2;
        int fileVersion = ((data[fileLength] & 0xff) << 8) + (data[fileLength + 1] & 0xff);
        crc32.reset();
        crc32.update(data, 0, fileLength);
        int calculatedChecksum = (int) crc32.getValue();
        if (fileVersion != cacheVersion) {
            return false;
        }

        return calculatedChecksum == cacheChecksum;
    }

    public void requestFile(int file) {
        requestFile(0, file);
    }

    public void readVersionlist(CacheArchive archive, Game game) {
        String[] versionFileNames = {"model_version", "anim_version", "midi_version", "map_version"};
        for (int i = 0; i < 4; i++) {
            byte[] versionFileData = archive.readFile(versionFileNames[i], null);
            int fileCount = versionFileData.length / 2;
            Buffer buffer = new Buffer(versionFileData);
            fileVersions[i] = new int[fileCount];
            filePriorities[i] = new byte[fileCount];
            for (int j = 0; j < fileCount; j++) {
                fileVersions[i][j] = buffer.readUShortBE();
            }
        }

        String[] checksumFileNames = {"model_crc", "anim_crc", "midi_crc", "map_crc"};
        for (int i = 0; i < 4; i++) {
            byte[] checksumFileData = archive.readFile(checksumFileNames[i], null);
            int fileCount = checksumFileData.length / 4;
            Buffer buffer = new Buffer(checksumFileData);
            fileChecksums[i] = new int[fileCount];
            for (int j = 0; j < fileCount; j++) {
                fileChecksums[i][j] = buffer.readIntBE();
            }
        }

        byte[] indexFileData = archive.readFile("model_index", null);
        int fileCount = fileVersions[0].length;
        modelFileIndexes = new byte[fileCount];
        for (int i = 0; i < fileCount; i++) {
            if (i < indexFileData.length) {
                modelFileIndexes[i] = indexFileData[i];
            } else {
                modelFileIndexes[i] = (byte) 0;
            }
        }

        indexFileData = archive.readFile("map_index", null);
        Buffer buffer = new Buffer(indexFileData);
        fileCount = indexFileData.length / 7;
        regionCoordHashes = new int[fileCount];
        regionMapIndexes = new int[fileCount];
        regionLandscapeIndexes = new int[fileCount];
        regionPreloadFlags = new int[fileCount];
        for (int i = 0; i < fileCount; i++) {
            regionCoordHashes[i] = buffer.readUShortBE();
            regionMapIndexes[i] = buffer.readUShortBE();
            regionLandscapeIndexes[i] = buffer.readUShortBE();
            regionPreloadFlags[i] = buffer.readUByte();
        }

        indexFileData = archive.readFile("anim_index", null);
        buffer = new Buffer(indexFileData);
        fileCount = indexFileData.length / 2;
        animIndexes = new int[fileCount];
        for (int i = 0; i < fileCount; i++) {
            animIndexes[i] = buffer.readUShortBE();
        }

        indexFileData = archive.readFile("midi_index", null);
        buffer = new Buffer(indexFileData);
        fileCount = indexFileData.length;
        midiPriorities = new int[fileCount];
        for (int i = 0; i < fileCount; i++) {
            midiPriorities[i] = buffer.readUByte();
        }

        this.game = game;
        running = true;
        this.game.method12(this, 2);
    }

    public void run() {
        try {
            while (running) {
                cycle++;
                int sleepTime = 20;
                if (highestPriority == 0 && game.cacheIndexes[0] != null)
                    sleepTime = 50;
                try {
                    Thread.sleep(sleepTime);
                } catch (Exception ignored) {}

                dataExpected = true;
                for (int i = 0; i < 100; i++) {
                    if (!dataExpected) {
                        break;
                    }

                    dataExpected = false;
                    loadMandatory();
                    requestMandatory();

                    if (requestedCount == 0 && i >= 5) {
                        break;
                    }

                    loadExtras();

                    if (updateServerInputStream != null) {
                        handleResponse();
                    }
                }

                boolean idle = false;

                for (GameUpdateRequest updateNode = (GameUpdateRequest) pendingRequests.first(); updateNode != null; updateNode = (GameUpdateRequest) pendingRequests.next()) {
                    if (updateNode.mandatory) {
                        idle = true;
                        updateNode.cyclesSinceSent++;
                        if (updateNode.cyclesSinceSent > 50) {
                            updateNode.cyclesSinceSent = 0;
                            sendRequest(updateNode);
                        }
                    }
                }

                if (!idle) {
                    for (GameUpdateRequest updateNode = (GameUpdateRequest) pendingRequests.first(); updateNode != null; updateNode = ((GameUpdateRequest) pendingRequests.next())) {
                        idle = true;
                        updateNode.cyclesSinceSent++;
                        if (updateNode.cyclesSinceSent > 50) {
                            updateNode.cyclesSinceSent = 0;
                            sendRequest(updateNode);
                        }
                    }
                }

                if (idle) {
                    idleCycles++;
                    if (idleCycles > 750) {
                        try {
                            updateServerSocket.close();
                        } catch (Exception ignored) {}

                        updateServerSocket = null;
                        updateServerInputStream = null;
                        updateServerOutputStream = null;
                        readable = 0;
                    }
                } else {
                    idleCycles = 0;
                    message = "";
                }

                if (game.loggedIn && updateServerSocket != null && updateServerOutputStream != null && (highestPriority > 0 || game.cacheIndexes[0] == null)) {
                    inactiveTime++;
                    if (inactiveTime > 500) {
                        inactiveTime = 0;
                        inputBuffer[0] = (byte) 0;
                        inputBuffer[1] = (byte) 0;
                        inputBuffer[2] = (byte) 0;
                        inputBuffer[3] = (byte) 10;

                        try {
                            updateServerOutputStream.write(inputBuffer, 0, 4);
                        } catch (IOException ioexception) {
                            idleCycles = 5000;
                        }
                    }
                }
            }
        } catch (Exception exception) {
            Signlink.reportError("GameUpdateClient.run " + exception.getMessage());
        }
    }

    public void preloadRegions(boolean forcePreload) {
        int regionCount = regionCoordHashes.length;
        for (int i = 0; i < regionCount; i++) {
            if (forcePreload || regionPreloadFlags[i] != 0) {
                requestExtra(3, regionLandscapeIndexes[i], (byte) 2);
                requestExtra(3, regionMapIndexes[i], (byte) 2);
            }
        }
    }

    public GameUpdateRequest next() {
        GameUpdateRequest updateNode;
        synchronized (completedRequests) {
            updateNode = (GameUpdateRequest) completedRequests.pop();
        }

        if (updateNode == null) {
            return null;
        }

        synchronized (immediateRequests) {
            updateNode.clear();
        }

        if (updateNode.buffer == null) {
            return updateNode;
        }

        int offset = 0;
        try {
            GZIPInputStream gzipInputStream = new GZIPInputStream(new ByteArrayInputStream(updateNode.buffer));
            for (; ; ) {
                if (offset == deflateOut.length) {
                    throw new RuntimeException("buffer overflow!");
                }

                int z = gzipInputStream.read(deflateOut, offset, deflateOut.length - offset);
                if (z == -1) {
                    break;
                }

                offset += z;
            }
        } catch (IOException ioException) {
            throw new RuntimeException("error unzipping");
        }

        updateNode.buffer = new byte[offset];
        System.arraycopy(deflateOut, 0, updateNode.buffer, 0, offset);

        return updateNode;
    }
}
