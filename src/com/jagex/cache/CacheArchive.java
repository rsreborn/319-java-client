package com.jagex.cache;

import com.jagex.io.Buffer;
import com.jagex.compress.Bzip2;
import com.jagex.sign.Signlink;

public class CacheArchive {
    public byte[] decompressedData;
    public int fileCount;
    public int[] fileNameHashes;
    public int[] decompressedFileLengths;
    public int[] compressedFileLengths;
    public int[] fileDataOffsets;
    public boolean compressed;

    public CacheArchive(byte[] archiveData) {
        try {
            readArchive(archiveData);
            return;
        } catch (RuntimeException runtimeException) {
            Signlink.reportError("CacheArchive, " + archiveData + ", " + runtimeException);
        }
        throw new RuntimeException();
    }

    public void readArchive(byte[] archiveData) {
        try {
            Buffer buffer = new Buffer(archiveData);
            int decompressedLength = buffer.readMediumBE();
            int compressedLength = buffer.readMediumBE();
            if (compressedLength == decompressedLength) {
                decompressedData = archiveData;
                compressed = false;
            } else {
                byte[] decompressedData = new byte[decompressedLength];
                Bzip2.decompressBzip2(decompressedData, decompressedLength, archiveData, compressedLength, 6);
                this.decompressedData = decompressedData;
                buffer = new Buffer(this.decompressedData);
                compressed = true;
            }
            fileCount = buffer.readUShortBE();
            fileNameHashes = new int[fileCount];
            decompressedFileLengths = new int[fileCount];
            compressedFileLengths = new int[fileCount];
            fileDataOffsets = new int[fileCount];
            int offset = buffer.position + fileCount * 10;
            for (int i = 0; i < fileCount; i++) {
                fileNameHashes[i] = buffer.readIntBE();
                decompressedFileLengths[i] = buffer.readMediumBE();
                compressedFileLengths[i] = buffer.readMediumBE();
                fileDataOffsets[i] = offset;
                offset += compressedFileLengths[i];
            }
            return;
        } catch (RuntimeException runtimeException) {
            Signlink.reportError("CacheArchive.decodeArchive, " + archiveData + ", " + runtimeException);
        }
        throw new RuntimeException();
    }

    public byte[] readFile(String fileName, byte[] fileData) {
        int nameHash = 0;
        fileName = fileName.toUpperCase();
        for (int j = 0; j < fileName.length(); j++) {
            nameHash = (nameHash * 61 + fileName.charAt(j)) - 32;
        }
        for (int i = 0; i < fileCount; i++) {
            if (fileNameHashes[i] == nameHash) {
                if (fileData == null) {
                    fileData = new byte[decompressedFileLengths[i]];
                }
                if (compressed) {
                    if (decompressedFileLengths[i] >= 0) {
                        System.arraycopy(decompressedData, fileDataOffsets[i], fileData, 0, decompressedFileLengths[i]);
                    }
                } else {
                    Bzip2.decompressBzip2(fileData, decompressedFileLengths[i], decompressedData, compressedFileLengths[i], fileDataOffsets[i]);
                }
                return fileData;
            }
        }
        return null;
    }
}
