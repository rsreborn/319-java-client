package com.jagex.cache;

import com.jagex.sign.Signlink;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CacheIndex {

    public static byte[] buffer = new byte[520];
    public RandomAccessFile dataFile;
    public RandomAccessFile indexFile;
    public int indexNumber;
    public int maxLength;

    public CacheIndex(int maxLength, int indexNumber, RandomAccessFile dataFile, RandomAccessFile indexFile) {
        this.indexNumber = indexNumber;
        this.dataFile = dataFile;
        this.indexFile = indexFile;
        this.maxLength = maxLength;
    }

    public synchronized byte[] readFile(int fileNumber) {
        try {
            try {
                setReadPosition(fileNumber * 6, indexFile);
                int totalRead;
                for (int i = 0; i < 6; i += totalRead) {
                    totalRead = indexFile.read(buffer, i, 6 - i);
                    if (totalRead == -1) {
                        return null;
                    }
                }

                int fileLength = ((buffer[0] & 0xff) << 16) + ((buffer[1] & 0xff) << 8) + (buffer[2] & 0xff);
                int sectorPos = ((buffer[3] & 0xff) << 16) + ((buffer[4] & 0xff) << 8) + (buffer[5] & 0xff);

                if (fileLength < 0 || fileLength > maxLength) {
                    return null;
                }
                if (sectorPos <= 0 || (long) sectorPos > dataFile.length() / 520L) {
                    return null;
                }

                byte[] fileData = new byte[fileLength];
                int dataRead = 0;

                for (int i = 0; dataRead < fileLength; i++) {
                    if (sectorPos == 0) {
                        return null;
                    }

                    setReadPosition(sectorPos * 520, dataFile);

                    int j = 0;
                    int remaining = fileLength - dataRead;

                    if (remaining > 512) {
                        remaining = 512;
                    }

                    int k;
                    for (; j < remaining + 8; j += k) {
                        k = dataFile.read(buffer, j, (remaining + 8) - j);
                        if (k == -1) {
                            return null;
                        }
                    }

                    int sectorFileNumber = ((buffer[0] & 0xff) << 8) + (buffer[1] & 0xff);
                    int sectorFilePartNumber = ((buffer[2] & 0xff) << 8) + (buffer[3] & 0xff);
                    int sectorNumber = ((buffer[4] & 0xff) << 16) + ((buffer[5] & 0xff) << 8) + (buffer[6] & 0xff);
                    int sectorIndexNumber = buffer[7] & 0xff;

                    if (fileNumber != sectorFileNumber || sectorFilePartNumber != i || sectorIndexNumber != indexNumber) {
                        return null;
                    }

                    if (sectorNumber < 0 || (long) sectorNumber > dataFile.length() / 520L) {
                        return null;
                    }

                    for (int l = 0; l < remaining; l++) {
                        fileData[dataRead++] = buffer[l + 8];
                    }

                    sectorPos = sectorNumber;
                }

                return fileData;
            } catch (IOException ignored) {
                return null;
            }
        } catch (RuntimeException runtimeException) {
            Signlink.reportError("CacheIndex.readFile, " + fileNumber + ", " + runtimeException);
        }

        throw new RuntimeException();
    }

    public synchronized boolean writeFile(byte[] fileData, int fileNumber, int fileLength) {
        try {
            boolean fileWritten = writeFile(fileData, fileNumber, fileLength, true);
            if (!fileWritten) {
                fileWritten = writeFile(fileData, fileNumber, fileLength, false);
            }
            return fileWritten;
        } catch (RuntimeException runtimeException) {
            Signlink.reportError("CacheIndex.writeFile, " + fileData + ", " + fileNumber + ", " + fileLength + ", " + runtimeException);
        }

        throw new RuntimeException();
    }

    public synchronized boolean writeFile(byte[] fileData, int fileNumber, int fileLength, boolean overwrite) {
        try {
            try {
                int sectorPos;

                if (overwrite) {
                    setReadPosition(fileNumber * 6, indexFile);

                    int read;
                    for (int i = 0; i < 6; i += read) {
                        read = indexFile.read(buffer, i, 6 - i);
                        if (read == -1) {
                            return false;
                        }
                    }

                    sectorPos = ((buffer[3] & 0xff) << 16) + ((buffer[4] & 0xff) << 8) + (buffer[5] & 0xff);

                    if (sectorPos <= 0 || (long) sectorPos > dataFile.length() / 520L) {
                        return false;
                    }
                } else {
                    sectorPos = (int) ((dataFile.length() + 519L) / 520L);

                    if (sectorPos == 0) {
                        sectorPos = 1;
                    }
                }

                // Index file data - fileLength & sectorPos
                buffer[0] = (byte) (fileLength >> 16);
                buffer[1] = (byte) (fileLength >> 8);
                buffer[2] = (byte) fileLength;
                buffer[3] = (byte) (sectorPos >> 16);
                buffer[4] = (byte) (sectorPos >> 8);
                buffer[5] = (byte) sectorPos;

                setReadPosition(fileNumber * 6, indexFile);

                indexFile.write(buffer, 0, 6);

                int written = 0;

                for (int filePartNumber = 0; written < fileLength; filePartNumber++) {
                    int sectorNumber = 0;

                    if (overwrite) {
                        setReadPosition(sectorPos * 520, dataFile);
                        int available;
                        int read;

                        for (available = 0; available < 8; available += read) {
                            read = dataFile.read(buffer, available, 8 - available);
                            if (read == -1) {
                                break;
                            }
                        }

                        if (available == 8) {
                            int sectorFileNumber = ((buffer[0] & 0xff) << 8) + (buffer[1] & 0xff);
                            int sectorFilePartNumber = ((buffer[2] & 0xff) << 8) + (buffer[3] & 0xff);
                            sectorNumber = ((buffer[4] & 0xff) << 16) + ((buffer[5] & 0xff) << 8) + (buffer[6] & 0xff);
                            int sectorIndexNumber = buffer[7] & 0xff;

                            if (sectorFileNumber != fileNumber || sectorFilePartNumber != filePartNumber || sectorIndexNumber != indexNumber) {
                                return false;
                            }

                            if (sectorNumber < 0 || (long) sectorNumber > dataFile.length() / 520L) {
                                return false;
                            }
                        }
                    }

                    if (sectorNumber == 0) {
                        overwrite = false;

                        sectorNumber = (int) ((dataFile.length() + 519L) / 520L);

                        if (sectorNumber == 0) {
                            sectorNumber++;
                        }

                        if (sectorNumber == sectorPos) {
                            sectorNumber++;
                        }
                    }

                    if (fileLength - written <= 512) {
                        sectorNumber = 0;
                    }

                    // Data file sector header - fileNumber & filePartNumber & sectorNumber & indexNumber
                    buffer[0] = (byte) (fileNumber >> 8);
                    buffer[1] = (byte) fileNumber;
                    buffer[2] = (byte) (filePartNumber >> 8);
                    buffer[3] = (byte) filePartNumber;
                    buffer[4] = (byte) (sectorNumber >> 16);
                    buffer[5] = (byte) (sectorNumber >> 8);
                    buffer[6] = (byte) sectorNumber;
                    buffer[7] = (byte) indexNumber;

                    setReadPosition(sectorPos * 520, dataFile);
                    dataFile.write(buffer, 0, 8);

                    int sectorLength = fileLength - written;
                    if (sectorLength > 512) {
                        sectorLength = 512;
                    }

                    dataFile.write(fileData, written, sectorLength);
                    written += sectorLength;
                    sectorPos = sectorNumber;
                }

                return true;
            } catch (IOException ignored) {
                return false;
            }
        } catch (RuntimeException runtimeException) {
            Signlink.reportError("CacheIndex.writeFile, " + fileData + ", " + fileNumber + ", " + fileLength + ", " + overwrite + ", " + runtimeException);
        }

        throw new RuntimeException();
    }

    public synchronized void setReadPosition(int position, RandomAccessFile file) throws IOException {
        try {
            if (position < 0 || position > 0x3c00000) {
                System.out.println("Badseek - pos:" + position + " len:" + file.length());
                position = 0x3c00000;
                try {
                    Thread.sleep(1000L);
                } catch (Exception ignored) {}
            }

            file.seek(position);
            return;
        } catch (RuntimeException runtimeException) {
            Signlink.reportError("CacheIndex.setReadPosition, " + position + ", " + file + ", " + runtimeException);
        }

        throw new RuntimeException();
    }

}
