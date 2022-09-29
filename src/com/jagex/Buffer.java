package com.jagex;

import com.jagex.sign.Signlink;

import java.math.BigInteger;

public class Buffer extends Class13_Sub1 {

    public static int[] anIntArray1401;
    public final int[] BIT_MASKS = {
            0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
            1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff,
            0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
            0x3fffffff, 0x7fffffff, -1
    };
    public static int anInt1404;
    public static int anInt1405;
    public static int anInt1406;
    public static Class12 aClass12_1407 = new Class12(36944);
    public static Class12 aClass12_1408 = new Class12(36944);
    public static Class12 aClass12_1409 = new Class12(36944);
    public static char[] aCharArray1410 = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', '+', '/'
    };
    public static boolean aBoolean1411;

    static {
        anIntArray1401 = new int[256];
        for (int j = 0; j < 256; j++) {
            int i = j;
            for (int k = 0; k < 8; k++) {
                if ((i & 1) == 1) {
                    i = i >>> 1 ^ 0xedb88320;
                } else {
                    i >>>= 1;
                }
            }
            anIntArray1401[j] = i;
        }
    }

    public int anInt1379;
    public byte aByte1380;
    public int anInt1381;
    public boolean aBoolean1382;
    public boolean aBoolean1383;
    public byte aByte1384;
    public byte aByte1385;
    public int anInt1386;
    public int anInt1387;
    public int anInt1388;
    public int anInt1389;
    public int anInt1390;
    public int anInt1391;
    public int anInt1392;
    public int anInt1393;
    public boolean aBoolean1394;
    public boolean aBoolean1395;
    public boolean aBoolean1396;
    public int anInt1397;
    public byte[] payload;
    public int position;
    public int bitPosition;
    public ISAACCipher isaacCipher;

    public Buffer(boolean flag) {
        anInt1379 = 36;
        aByte1380 = 5;
        anInt1381 = -45536;
        aBoolean1382 = true;
        aBoolean1383 = true;
        aByte1384 = 21;
        aByte1385 = 97;
        anInt1386 = 6;
        anInt1387 = -267;
        anInt1388 = -25124;
        anInt1389 = 7270;
        anInt1390 = 7;
        anInt1391 = 7;
        anInt1392 = 12258;
        anInt1393 = -986;
        aBoolean1394 = false;
        aBoolean1395 = true;
        aBoolean1396 = false;
        try {
            if (!flag) {
                throw new NullPointerException();
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("4524, " + flag + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public Buffer(byte[] bytes) {
        anInt1379 = 36;
        aByte1380 = 5;
        anInt1381 = -45536;
        aBoolean1382 = true;
        aBoolean1383 = true;
        aByte1384 = 21;
        aByte1385 = 97;
        anInt1386 = 6;
        anInt1387 = -267;
        anInt1388 = -25124;
        anInt1389 = 7270;
        anInt1390 = 7;
        anInt1391 = 7;
        anInt1392 = 12258;
        anInt1393 = -986;
        aBoolean1394 = false;
        aBoolean1395 = true;
        aBoolean1396 = false;
        payload = bytes;
        position = 0;
    }

    public static Buffer method299(int i, int j) {
        try {
            synchronized (aClass12_1408) {
                Buffer buffer_2 = null;
                if (j == 0 && anInt1404 > 0) {
                    anInt1404--;
                    buffer_2 = (Buffer) aClass12_1407.method247();
                } else if (j == 1 && anInt1405 > 0) {
                    anInt1405--;
                    buffer_2 = (Buffer) aClass12_1408.method247();
                } else if (j == 2 && anInt1406 > 0) {
                    anInt1406--;
                    buffer_2 = (Buffer) aClass12_1409.method247();
                }
                if (buffer_2 != null) {
                    buffer_2.position = 0;
                    Buffer buffer = buffer_2;
                    return buffer;
                }
            }
            Buffer buffer = new Buffer(true);
            if (i <= 0) {
                throw new NullPointerException();
            }
            buffer.position = 0;
            if (j == 0) {
                buffer.payload = new byte[100];
            } else if (j == 1) {
                buffer.payload = new byte[5000];
            } else {
                buffer.payload = new byte[30000];
            }
            return buffer;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("52304, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void writeOpcode(int opcode) {
        payload[position++] = (byte) (opcode + isaacCipher.nextInt());
    }

    public void writeByte(int value) {
        payload[position++] = (byte) value;
    }

    public void writeShort(int value) {
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) value;
    }

    public void writeLittleEndianShort(int value) {
        payload[position++] = (byte) value;
        payload[position++] = (byte) (value >> 8);
    }

    public void writeTriByte(int value) {
        payload[position++] = (byte) (value >> 16);
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) value;
    }

    public void writeInt(int value) {
        payload[position++] = (byte) (value >> 24);
        payload[position++] = (byte) (value >> 16);
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) value;
    }

    public void writeLittleEndianInt(int value) {
            payload[position++] = (byte) value;
            payload[position++] = (byte) (value >> 8);
            payload[position++] = (byte) (value >> 16);
            payload[position++] = (byte) (value >> 24);
    }

    public void writeLong(long value) {
        payload[position++] = (byte) (int) (value >> 56);
        payload[position++] = (byte) (int) (value >> 48);
        payload[position++] = (byte) (int) (value >> 40);
        payload[position++] = (byte) (int) (value >> 32);
        payload[position++] = (byte) (int) (value >> 24);
        payload[position++] = (byte) (int) (value >> 16);
        payload[position++] = (byte) (int) (value >> 8);
        payload[position++] = (byte) (int) value;
    }

    public void writeString(String string) {
        string.getBytes(0, string.length(), payload, position);
        position += string.length();
        payload[position++] = 10;
    }

    public void writeBytes(byte[] bytes, int offset, int length) {
        for (int l = offset; l < offset + length; l++) {
            payload[position++] = bytes[l];
        }
    }

    public void writeSizeByte(int length) {
        payload[position - length - 1] = (byte) length;
    }

    public int readUnsignedByte() {
        return payload[position++] & 0xff;
    }

    public byte readByte() {
        return payload[position++];
    }

    public int readUnsignedShort() {
        position += 2;
        return ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
    }

    public int readShort() {
        position += 2;
        int i = ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
        if (i > 32767) {
            i -= 0x10000;
        }
        return i;
    }

    public int readTriByte() {
        position += 3;
        return ((payload[position - 3] & 0xff) << 16) + ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
    }

    public int readInt() {
        position += 4;
        return ((payload[position - 4] & 0xff) << 24) + ((payload[position - 3] & 0xff) << 16) + ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
    }

    public long readLong(int i) {
        long msi = (long) readInt() & 0xffffffffL;
        long lsi = (long) readInt() & 0xffffffffL;
        return (msi << 32) + lsi;
    }

    public String readString() {
        int start = position;
        while (payload[position++] != 10) ;
        return new String(payload, start, position - start - 1);
    }

    public byte[] readStringBytes() {
        int start = position;

        while (payload[position++] != 10) ;
        byte[] bytes = new byte[position - start - 1];
        for (int i = start; i < position - 1; i++) {
            bytes[i - start] = payload[i];
        }
        return bytes;
    }

    public void readBytes(byte[] bytes, int start, int length) {
        for (int pos = start; pos < start + length; pos++) {
            bytes[pos] = payload[position++];
        }
    }

    public void initBitAccess() {
        bitPosition = position * 8;
    }

    public int readBits(int i, int j) {
        try {
            int k = bitPosition >> 3;
            int l = 8 - (bitPosition & 7);
            int i1 = 0;
            j = 98 / j;
            bitPosition += i;
            for (; i > l; l = 8) {
                i1 += (payload[k++] & BIT_MASKS[l]) << i - l;
                i -= l;
            }
            if (i == l) {
                i1 += payload[k] & BIT_MASKS[l];
            } else {
                i1 += payload[k] >> l - i & BIT_MASKS[i];
            }
            return i1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("38428, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void finishBitAccess(int i) {
        position = (bitPosition + 7) / 8;
    }

    public int readSmart() {
        int peek = payload[position] & 0xff;
        if (peek < 128) {
            return readUnsignedByte() - 64;
        } else {
            return readUnsignedShort() - 49152;
        }
    }

    public int readUnsignedSmart() {
        int peek = payload[position] & 0xff;
        if (peek < 128) {
            return readUnsignedByte();
        } else {
            return readUnsignedShort() - 32768;
        }
    }

    public void encrypt(BigInteger key, BigInteger modulus) {
            int i = position;
            position = 0;
            byte[] abyte0 = new byte[i];
            readBytes(abyte0, 0, i);
            BigInteger biginteger2 = new BigInteger(abyte0);
            BigInteger biginteger3 = biginteger2.modPow(key, modulus);

            byte[] abyte1 = biginteger3.toByteArray();
            position = 0;
            writeByte(abyte1.length);
            writeBytes(abyte1, 0, abyte1.length);
    }

    public void writeByteA(int value) {
        payload[position++] = (byte) (value + 128);
    }

    public void writeInvertedByte(int value) {
        payload[position++] = (byte) (-value);
    }

    public void writeByteS(int value) {
        payload[position++] = (byte) (128 - value);
    }

    public int readUnsignedByteA(int i) {
        try {
            if (i <= 0) {
                aBoolean1396 = !aBoolean1396;
            }
            return payload[position++] - 128 & 0xff;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("55072, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int readUnsignedByteC() {
        return -payload[position++] & 0xff;
    }

    public int method332(byte byte0) {
        try {
            if (byte0 == 7) {
                byte0 = 0;
            } else {
                aBoolean1395 = !aBoolean1395;
            }
            return 128 - payload[position++] & 0xff;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("15887, " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public byte method333(int i) {
        try {
            if (i != anInt1389) {
                anInt1387 = -148;
            }
            return (byte) (payload[position++] - 128);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("75814, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public byte method334(byte byte0) {
        try {
            if (byte0 != -78) {
                for (int i = 1; i > 0; i++) {
                }
            }
            return (byte) (-payload[position++]);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("48119, " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void writeLEShort(int value) {
        payload[position++] = (byte) value;
        payload[position++] = (byte) (value >> 8);

    }

    public void writeShortA(int value) {
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) (value + 128);
    }

    public void writeLEShortA(int i, int value) {
        payload[position++] = (byte) (value + 128);
        payload[position++] = (byte) (value >> 8);
    }

    public int readUnsignedLittleEndianShort() {
        position += 2;
        return ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
    }

    public int readUnsignedShortA() {
        position += 2;
        return ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] - 128 & 0xff);
    }

    public int readUnsignedLittleEndianShortA() {
        position += 2;
        return ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] - 128 & 0xff);
    }

    public int method341(int i) {
        try {
            if (i >= 0) {
                return anInt1387;
            }
            position += 2;
            int j = ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
            if (j > 32767) {
                j -= 0x10000;
            }
            return j;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("95516, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int method342() {
        position += 2;
        int j = ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] - 128 & 0xff);
        if (j > 32767) {
            j -= 0x10000;
        }
        return j;
    }

    public int method343(boolean flag) {
        try {
            position += 2;
            if (!flag) {
                aBoolean1394 = !aBoolean1394;
            }
            int i = ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] - 128 & 0xff);
            if (i > 32767) {
                i -= 0x10000;
            }
            return i;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("42864, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int method344(int i) {
        try {
            position += 3;
            if (i != 5) {
                return 1;
            } else {
                return ((payload[position - 1] & 0xff) << 16) + ((payload[position - 2] & 0xff) << 8) + (payload[position - 3] & 0xff);
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("86442, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void writeLEInt(int value) {
        payload[position++] = (byte) value;
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) (value >> 16);
        payload[position++] = (byte) (value >> 24);
    }

    public int readLEInt() {
        position += 4;
        return ((payload[position - 1] & 0xff) << 24) + ((payload[position - 2] & 0xff) << 16) + ((payload[position - 3] & 0xff) << 8) + (payload[position - 4] & 0xff);
    }

    public int method347(int i) {
        try {
            if (i < 7 || i > 7) {
                for (int j = 1; j > 0; j++) {
                }
            }
            position += 4;
            return ((payload[position - 2] & 0xff) << 24) + ((payload[position - 1] & 0xff) << 16) + ((payload[position - 4] & 0xff) << 8) + (payload[position - 3] & 0xff);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("74336, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int readMiddleEndianInt2(int i) {
        position += 4;
        return ((payload[position - 3] & 0xff) << 24) + ((payload[position - 4] & 0xff) << 16) + ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
    }

    public void method349(byte[] abyte0, int i, boolean flag, int j) {
        try {
            if (!flag) {
                aBoolean1395 = !aBoolean1395;
            }
            for (int k = (i + j) - 1; k >= i; k--) {
                payload[position++] = (byte) (abyte0[k] + 128);
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("63347, " + abyte0 + ", " + i + ", " + flag + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method350(boolean flag, int i, byte[] abyte0, int j) {
        try {
            if (flag) {
                return;
            }
            for (int k = j; k < j + i; k++) {
                abyte0[k] = (byte) (payload[position++] - 128);
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("76887, " + flag + ", " + i + ", " + abyte0 + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
