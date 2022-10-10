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

public class GameUpdateClient extends Class2 implements Runnable {
    public LinkedList aLinkedList_1293 = new LinkedList();
    public Queue aQueue_1294 = new Queue();
    public int anInt1295 = -22144;
    public GameUpdateNode gameUpdateNode;
    public byte[][] filePriorities = new byte[4][];
    public byte[] inputBuffer = new byte[500];
    public boolean dataExpected = false;
    public OutputStream updateServerOutputStream;
    public boolean running = true;
    public byte[] modelFileIndexes;
    public int[] animIndexes;
    public int offset;
    public int readable;
    public int[][] fileVersions = new int[4][];
    public int highestPriority;
    public int immediateRequestsSent;
    public int anInt1309;
    public Socket updateServerSocket;
    public long aLong1311;
    public int[] regionPreloadFlags;
    public int anInt1313 = 5;
    public byte aByte1314 = 50;
    public int[] midiIndexes;
    public CRC32 crc32 = new CRC32();
    public int[] regionLandscapeIndexes;
    public String message = "";
    public Game game;
    public int[] regionCoordHashes;
    public int sinceKeepAlive;
    public LinkedList pendingRequests = new LinkedList();
    public int[][] fileChecksums = new int[4][];
    public boolean aBoolean1324 = false;
    public int idleCycles;
    public int cycle;
    public byte[] deflateOut = new byte[65000];
    public LinkedList aLinkedList_1328 = new LinkedList();
    public int anInt1329;
    public LinkedList completed = new LinkedList();
    public InputStream updateServerInputStream;
    public int[] regionMapIndexes;
    public int anInt1333;
    public LinkedList aLinkedList_1334 = new LinkedList();
    public int anInt1335;

    public void method151(int i) {
        try {
            immediateRequestsSent = 0;
            anInt1309 = 0;
            GameUpdateNode class13_sub1_sub3
                    = (GameUpdateNode) pendingRequests.first();
            if (i == 27519) {
                for (/**/; class13_sub1_sub3 != null;
                         class13_sub1_sub3
                                 = (GameUpdateNode) pendingRequests.next()) {
                    if (class13_sub1_sub3.immediate)
                        immediateRequestsSent++;
                    else
                        anInt1309++;
                }
                while (immediateRequestsSent < 10) {
                    class13_sub1_sub3
                            = (GameUpdateNode) aLinkedList_1293.pop();
                    if (class13_sub1_sub3 == null)
                        break;
                    if ((filePriorities[class13_sub1_sub3.type]
                            [class13_sub1_sub3.id])
                            != 0)
                        anInt1329++;
                    filePriorities[class13_sub1_sub3.type]
                            [class13_sub1_sub3.id]
                            = (byte) 0;
                    pendingRequests.pushBack(class13_sub1_sub3);
                    immediateRequestsSent++;
                    sendRequest(0, class13_sub1_sub3);
                    dataExpected = true;
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("54544, " + i + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method152(int i) {
        try {
            GameUpdateNode class13_sub1_sub3;
            synchronized (aLinkedList_1334) {
                class13_sub1_sub3
                        = (GameUpdateNode) aLinkedList_1334.pop();
            }
            while (i >= 0)
                aBoolean1324 = !aBoolean1324;
            while (class13_sub1_sub3 != null) {
                dataExpected = true;
                byte[] is = null;
                if (game.cacheIndexes[0] != null)
                    is = game.cacheIndexes
                            [class13_sub1_sub3.type + 1]
                            .readFile(class13_sub1_sub3.id);
                if (!method168((fileChecksums
                                [class13_sub1_sub3.type]
                                [class13_sub1_sub3.id]),
                        is, -286,
                        (fileVersions
                                [class13_sub1_sub3.type]
                                [class13_sub1_sub3.id])))
                    is = null;
                synchronized (aLinkedList_1334) {
                    if (is == null)
                        aLinkedList_1293.pushBack(class13_sub1_sub3);
                    else {
                        class13_sub1_sub3.buffer = is;
                        synchronized (completed) {
                            completed.pushBack(class13_sub1_sub3);
                        }
                    }
                    class13_sub1_sub3
                            = (GameUpdateNode) aLinkedList_1334.pop();
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("31218, " + i + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public boolean midiIndex1(int midiIndex) {
        return midiIndexes[midiIndex] == 1;
    }

    public int getModelId(int modelIndex) {
        return modelFileIndexes[modelIndex] & 0xff;
    }

    public boolean method155(int i, int i_2_) {
        try {
            for (int i_3_ = 0; i_3_ < regionCoordHashes.length; i_3_++) {
                if (regionLandscapeIndexes[i_3_] == i_2_)
                    return true;
            }
            if (i != anInt1313)
                throw new NullPointerException();
            return false;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("72770, " + i + ", " + i_2_ + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method156(int i, int i_4_) {
        if (i >= 0 && i <= fileVersions.length && i_4_ >= 0
                && i_4_ <= fileVersions[i].length
                && fileVersions[i][i_4_] != 0) {
            synchronized (aQueue_1294) {
                for (GameUpdateNode class13_sub1_sub3
                     = (GameUpdateNode) aQueue_1294.first();
                     class13_sub1_sub3 != null;
                     class13_sub1_sub3
                             = (GameUpdateNode) aQueue_1294.next()) {
                    if (class13_sub1_sub3.type == i
                            && class13_sub1_sub3.id == i_4_)
                        return;
                }
                GameUpdateNode class13_sub1_sub3 = new GameUpdateNode();
                class13_sub1_sub3.type = i;
                class13_sub1_sub3.id = i_4_;
                class13_sub1_sub3.immediate = true;
                synchronized (aLinkedList_1334) {
                    aLinkedList_1334.pushBack(class13_sub1_sub3);
                }
                aQueue_1294.push(class13_sub1_sub3);
            }
        }
    }

    public void method157(int i, int i_5_, int i_6_) {
        try {
            if (game.cacheIndexes[0] != null
                    && fileVersions[i][i_5_] != 0
                    && filePriorities[i][i_5_] != 0 && highestPriority != 0) {
                GameUpdateNode class13_sub1_sub3 = new GameUpdateNode();
                class13_sub1_sub3.type = i;
                class13_sub1_sub3.id = i_5_;
                if (i_6_ != 0)
                    anInt1295 = -413;
                class13_sub1_sub3.immediate = false;
                synchronized (aLinkedList_1328) {
                    aLinkedList_1328.pushBack(class13_sub1_sub3);
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("49822, " + i + ", " + i_5_ + ", " + i_6_
                    + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public int method158(byte i) {
        try {
            if (i != aByte1314)
                return 0;
            return animIndexes.length;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("53573, " + i + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void sendRequest(int i, GameUpdateNode gameUpdateNode) {
        try {
            if (i != 0) {
                for (int i_7_ = 1; i_7_ > 0; i_7_++) {
                    /* empty */
                }
            }
            try {
                if (updateServerSocket == null) {
                    long l = System.currentTimeMillis();
                    if (l - aLong1311 < 4000L)
                        return;
                    aLong1311 = l;
                    updateServerSocket = game.openSocket(43594 + Game.anInt952);
                    updateServerInputStream = updateServerSocket.getInputStream();
                    updateServerOutputStream = updateServerSocket.getOutputStream();
                    updateServerOutputStream.write(15);
                    for (int i_8_ = 0; i_8_ < 8; i_8_++)
                        updateServerInputStream.read();
                    idleCycles = 0;
                }
                inputBuffer[0] = (byte) gameUpdateNode.type;
                inputBuffer[1] = (byte) (gameUpdateNode.id >> 8);
                inputBuffer[2] = (byte) gameUpdateNode.id;
                if (gameUpdateNode.immediate)
                    inputBuffer[3] = (byte) 2;
                else if (!game.loggedIn)
                    inputBuffer[3] = (byte) 1;
                else
                    inputBuffer[3] = (byte) 0;
                updateServerOutputStream.write(inputBuffer, 0, 4);
                sinceKeepAlive = 0;
                anInt1333 = -10000;
            } catch (IOException ioexception) {
                try {
                    updateServerSocket.close();
                } catch (Exception exception) {
                    /* empty */
                }
                updateServerSocket = null;
                updateServerInputStream = null;
                updateServerOutputStream = null;
                readable = 0;
                anInt1333++;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("65491, " + i + ", " + gameUpdateNode
                    + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public int method160(int i, int i_9_, int i_10_, int i_11_) {
        try {
            int i_12_ = (i << 8) + i_9_;
            if (i_11_ != 8347) {
                for (int i_13_ = 1; i_13_ > 0; i_13_++) {
                    /* empty */
                }
            }
            for (int i_14_ = 0; i_14_ < regionCoordHashes.length; i_14_++) {
                if (regionCoordHashes[i_14_] == i_12_) {
                    if (i_10_ == 0)
                        return regionMapIndexes[i_14_];
                    return regionLandscapeIndexes[i_14_];
                }
            }
            return -1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("42843, " + i + ", " + i_9_ + ", " + i_10_
                    + ", " + i_11_ + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void stop() {
        running = false;
    }

    public void setPriority(int i, int i_15_, byte i_16_, boolean bool) {
        try {
            if (game.cacheIndexes[0] != null
                    && fileVersions[i][i_15_] != 0) {
                byte[] is
                        = game.cacheIndexes[i + 1].readFile(i_15_
                );
                if (bool) {
                    for (int i_17_ = 1; i_17_ > 0; i_17_++) {
                        /* empty */
                    }
                }
                if (!method168(fileChecksums[i][i_15_], is, -286,
                        fileVersions[i][i_15_])) {
                    filePriorities[i][i_15_] = i_16_;
                    if (i_16_ > highestPriority)
                        highestPriority = i_16_;
                    anInt1335++;
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("96532, " + i + ", " + i_15_ + ", " + i_16_
                    + ", " + bool + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public int getFileVersionCount(int versionlistIndex) {
        return fileVersions[versionlistIndex].length;
    }

    public void method164(int i) {
        while_0_:
        do {
            try {
                if (i != 0) {
                    for (int i_19_ = 1; i_19_ > 0; i_19_++) {
                        /* empty */
                    }
                }
                for (; ; ) {
                    if (immediateRequestsSent != 0)
                        break while_0_;
                    if (anInt1309 >= 10)
                        break;
                    if (highestPriority == 0)
                        break;
                    GameUpdateNode class13_sub1_sub3;
                    synchronized (aLinkedList_1328) {
                        class13_sub1_sub3
                                = (GameUpdateNode) aLinkedList_1328.pop();
                    }
                    while (class13_sub1_sub3 != null) {
                        if ((filePriorities[class13_sub1_sub3.type]
                                [class13_sub1_sub3.id])
                                != 0) {
                            filePriorities
                                    [class13_sub1_sub3.type]
                                    [class13_sub1_sub3.id]
                                    = (byte) 0;
                            pendingRequests.pushBack(class13_sub1_sub3);
                            sendRequest(0, class13_sub1_sub3);
                            dataExpected = true;
                            if (anInt1329 < anInt1335)
                                anInt1329++;
                            message
                                    = ("Loading extra files - "
                                    + anInt1329 * 100 / anInt1335 + "%");
                            anInt1309++;
                            if (anInt1309 == 10)
                                return;
                        }
                        synchronized (aLinkedList_1328) {
                            class13_sub1_sub3 = ((GameUpdateNode)
                                    aLinkedList_1328.pop());
                        }
                    }
                    for (int i_20_ = 0; i_20_ < 4; i_20_++) {
                        byte[] is = filePriorities[i_20_];
                        int i_21_ = is.length;
                        for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
                            if (is[i_22_] == highestPriority) {
                                is[i_22_] = (byte) 0;
                                class13_sub1_sub3 = new GameUpdateNode();
                                class13_sub1_sub3.type = i_20_;
                                class13_sub1_sub3.id = i_22_;
                                class13_sub1_sub3.immediate = false;
                                pendingRequests.pushBack(class13_sub1_sub3);
                                sendRequest(0, class13_sub1_sub3);
                                dataExpected = true;
                                if (anInt1329 < anInt1335)
                                    anInt1329++;
                                message
                                        = ("Loading extra files - "
                                        + anInt1329 * 100 / anInt1335 + "%");
                                anInt1309++;
                                if (anInt1309 == 10)
                                    return;
                            }
                        }
                    }
                    highestPriority--;
                }
            } catch (RuntimeException runtimeexception) {
                Signlink.reportError("5568, " + i + ", "
                        + runtimeexception);
                throw new RuntimeException();
            }
            break;
        } while (false);
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
                gameUpdateNode = null;

                for (GameUpdateNode updateNode = ((GameUpdateNode) pendingRequests.first()); updateNode != null; updateNode = ((GameUpdateNode) pendingRequests.next())) {
                    if (updateNode.type == type && updateNode.id == id) {
                        gameUpdateNode = updateNode;
                    }

                    if (gameUpdateNode != null) {
                        updateNode.cyclesSinceSent = 0;
                    }
                }

                if (gameUpdateNode != null) {
                    idleCycles = 0;
                    if (size == 0) {
                        Signlink.reportError("Rej: " + type + "," + id);
                        gameUpdateNode.buffer = null;

                        if (gameUpdateNode.immediate) {
                            synchronized (completed) {
                                completed.pushBack(gameUpdateNode);
                            }
                        } else {
                            gameUpdateNode.remove();
                        }

                        gameUpdateNode = null;
                    } else {
                        if ((gameUpdateNode.buffer == null) && chunk == 0) {
                            gameUpdateNode.buffer = new byte[size];
                        }

                        if ((gameUpdateNode.buffer == null) && chunk != 0) {
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
            if (gameUpdateNode != null) {
                buffer = gameUpdateNode.buffer;
                bufferOffset = offset;
            }

            for (int i = 0; i < readable; i += updateServerInputStream.read(buffer, i + bufferOffset, (readable - i))) {}

            if (readable + offset >= buffer.length && gameUpdateNode != null) {
                if (game.cacheIndexes[0] != null) {
                    game.cacheIndexes[gameUpdateNode.type + 1].writeFile(buffer, gameUpdateNode.id, buffer.length);
                }

                if (!gameUpdateNode.immediate && gameUpdateNode.type == 3) {
                    gameUpdateNode.immediate = true;
                    gameUpdateNode.type = 93;
                }

                if (gameUpdateNode.immediate) {
                    synchronized (completed) {
                        completed.pushBack(gameUpdateNode);
                    }
                } else {
                    gameUpdateNode.remove();
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

    public void method166(int i) {
        try {
            synchronized (aLinkedList_1328) {
                aLinkedList_1328.clear();
            }
            i = 78 / i;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("83594, " + i + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public int method167() {
        synchronized (aQueue_1294) {
            return aQueue_1294.size();
        }
    }

    public boolean method168(int i, byte[] is, int i_31_, int i_32_) {
        try {
            if (i_31_ >= 0)
                aBoolean1324 = !aBoolean1324;
            if (is == null || is.length < 2)
                return false;
            int i_33_ = is.length - 2;
            int i_34_ = ((is[i_33_] & 0xff) << 8) + (is[i_33_ + 1] & 0xff);
            crc32.reset();
            crc32.update(is, 0, i_33_);
            int i_35_ = (int) crc32.getValue();
            if (i_34_ != i_32_)
                return false;
			return i_35_ == i;
		} catch (RuntimeException runtimeexception) {
            Signlink.reportError("84545, " + i + ", " + is + ", " + i_31_
                    + ", " + i_32_ + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method150(int i) {
        method156(0, i);
    }

    public void readVersionlist(CacheArchive versionlistArchive, Game game) {
        String[] versionFileNames = {"model_version", "anim_version", "midi_version", "map_version"};
        for (int i = 0; i < 4; i++) {
            byte[] versionFileData = versionlistArchive.readFile(versionFileNames[i], null);
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
            byte[] checksumFileData = versionlistArchive.readFile(checksumFileNames[i], null);
            int fileCount = checksumFileData.length / 4;
            Buffer buffer = new Buffer(checksumFileData);
            fileChecksums[i] = new int[fileCount];
            for (int j = 0; j < fileCount; j++) {
                fileChecksums[i][j] = buffer.readIntBE();
            }
        }

        byte[] indexFileData = versionlistArchive.readFile("model_index", null);
        int fileCount = fileVersions[0].length;
        modelFileIndexes = new byte[fileCount];
        for (int i = 0; i < fileCount; i++) {
            if (i < indexFileData.length) {
                modelFileIndexes[i] = indexFileData[i];
            } else {
                modelFileIndexes[i] = (byte) 0;
            }
        }

        indexFileData = versionlistArchive.readFile("map_index", null);
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

        indexFileData = versionlistArchive.readFile("anim_index", null);
        buffer = new Buffer(indexFileData);
        fileCount = indexFileData.length / 2;
        animIndexes = new int[fileCount];
        for (int i = 0; i < fileCount; i++) {
            animIndexes[i] = buffer.readUShortBE();
        }

        indexFileData = versionlistArchive.readFile("midi_index", null);
        buffer = new Buffer(indexFileData);
        fileCount = indexFileData.length;
        midiIndexes = new int[fileCount];
        for (int i = 0; i < fileCount; i++) {
            midiIndexes[i] = buffer.readUByte();
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
                    method152(-289);
                    method151(27519);

                    if (immediateRequestsSent == 0 && i >= 5) {
                        break;
                    }

                    method164(0);

                    if (updateServerInputStream != null) {
                        handleResponse();
                    }
                }

                boolean idle = false;

                for (GameUpdateNode updateNode = (GameUpdateNode) pendingRequests.first(); updateNode != null; updateNode = (GameUpdateNode) pendingRequests.next()) {
                    if (updateNode.immediate) {
                        idle = true;
                        updateNode.cyclesSinceSent++;
                        if (updateNode.cyclesSinceSent > 50) {
                            updateNode.cyclesSinceSent = 0;
                            sendRequest(0, updateNode);
                        }
                    }
                }

                if (!idle) {
                    for (GameUpdateNode updateNode = (GameUpdateNode) pendingRequests.first(); updateNode != null; updateNode = ((GameUpdateNode) pendingRequests.next())) {
                        idle = true;
                        updateNode.cyclesSinceSent++;
                        if (updateNode.cyclesSinceSent > 50) {
                            updateNode.cyclesSinceSent = 0;
                            sendRequest(0, updateNode);
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
                    sinceKeepAlive++;
                    if (sinceKeepAlive > 500) {
                        sinceKeepAlive = 0;
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
        try {
            int regionCount = regionCoordHashes.length;
            for (int i = 0; i < regionCount; i++) {
                if (forcePreload || regionPreloadFlags[i] != 0) {
                    setPriority(3, regionLandscapeIndexes[i], (byte) 2, false);
                    setPriority(3, regionMapIndexes[i], (byte) 2, false);
                }
            }
        } catch (RuntimeException runtimeException) {
            Signlink.reportError("GameUpdateClient.preloadRegions, " + forcePreload + ", " + runtimeException);
            throw new RuntimeException();
        }
    }

    public GameUpdateNode next() {
        GameUpdateNode updateNode;
        synchronized (completed) {
            updateNode = (GameUpdateNode) completed.pop();
        }

        if (updateNode == null) {
            return null;
        }

        synchronized (aQueue_1294) {
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
