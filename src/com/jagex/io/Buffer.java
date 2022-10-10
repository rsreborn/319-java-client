package com.jagex.io;

import com.jagex.ISAACCipher;
import com.jagex.util.CacheableNode;

import java.math.BigInteger;

public class Buffer extends CacheableNode {

    public byte[] payload;
    public int position;
    public int bitPosition;
    public ISAACCipher isaacCipher;

    public final int[] BIT_MASKS = {
        0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
        1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff,
        0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
        0x3fffffff, 0x7fffffff, -1
    };

    public Buffer() { }

    public Buffer(byte[] bytes) {
        payload = bytes;
        position = 0;
    }

    public static Buffer allocate(int sizeMode) {
        Buffer buffer = new Buffer();
        buffer.position = 0;
        if (sizeMode == 0) {
            buffer.payload = new byte[100];
        } else if (sizeMode == 1) {
            buffer.payload = new byte[5000];
        } else {
            buffer.payload = new byte[30000];
        }
        return buffer;
    }

    public void writeOpcode(int opcode) {
        payload[position++] = (byte) (opcode + isaacCipher.nextInt());
    }

    public void writeByte(int value) {
        payload[position++] = (byte) value;
    }

    public void writeShortBE(int value) {
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) value;
    }

    public void writeShortLE(int value) {
        payload[position++] = (byte) value;
        payload[position++] = (byte) (value >> 8);
    }

    public void writeMiddleBE(int value) {
        payload[position++] = (byte) (value >> 16);
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) value;
    }

    public void writeIntBE(int value) {
        payload[position++] = (byte) (value >> 24);
        payload[position++] = (byte) (value >> 16);
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) value;
    }

    public void writeIntLE(int value) {
        payload[position++] = (byte) value;
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) (value >> 16);
        payload[position++] = (byte) (value >> 24);
    }

    public void writeLongBE(long value) {
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
        for (int pos = offset; pos < offset + length; pos++) {
            payload[position++] = bytes[pos];
        }
    }

    public void writeSizeByte(int length) {
        payload[position - length - 1] = (byte) length;
    }

    public int readUByte() {
        return payload[position++] & 0xff;
    }

    public int readUByteA() {
        return payload[position++] - 128 & 0xff;
    }

    public int readUByteC() {
        return -payload[position++] & 0xff;
    }

    public int readUByteS() {
        return 128 - payload[position++] & 0xff;
    }

    public byte readByte() {
        return payload[position++];
    }

    public byte readByteA() {
        return (byte) (payload[position++] - 128);
    }

    public byte readByteC() {
        return (byte) (-payload[position++]);
    }

    public int readUShortBE() {
        position += 2;
        return ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
    }

    public int readUShortLE() {
        position += 2;
        return ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
    }

    public int readUShortBEA() {
        position += 2;
        return ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] - 128 & 0xff);
    }

    public int readUShortLEA() {
        position += 2;
        return ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] - 128 & 0xff);
    }

    public int readShortBE() {
        position += 2;
        int value = ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
        if (value > 32767) {
            value -= 0x10000;
        }
        return value;
    }

    public int readShortLE() {
        position += 2;
        int value = ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
        if (value > 32767) {
            value -= 0x10000;
        }
        return value;
    }

    public int readShortBEA() {
        position += 2;
        int value = ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] - 128 & 0xff);
        if (value > 32767) {
            value -= 0x10000;
        }
        return value;
    }

    public int readShortLEA() {
        position += 2;
        int value = ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] - 128 & 0xff);
        if (value > 32767) {
            value -= 0x10000;
        }
        return value;
    }

    public int readUSmart() {
        int peek = payload[position] & 0xff;
        if (peek < 128) {
            return readUByte();
        } else {
            return readUShortBE() - 32768;
        }
    }

    public int readSmart() {
        int peek = payload[position] & 0xff;
        if (peek < 128) {
            return readUByte() - 64;
        } else {
            return readUShortBE() - 49152;
        }
    }

    public int readMediumBE() {
        position += 3;
        return ((payload[position - 3] & 0xff) << 16) + ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
    }

    public int readIntBE() {
        position += 4;
        return ((payload[position - 4] & 0xff) << 24) + ((payload[position - 3] & 0xff) << 16) + ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
    }

    public long readLongBE() {
        long msi = (long) readIntBE() & 0xffffffffL;
        long lsi = (long) readIntBE() & 0xffffffffL;
        return (msi << 32) + lsi;
    }

    public String readString() {
        int start = position;
        while (payload[position++] != 10);
        return new String(payload, start, position - start - 1);
    }

    public byte[] readStringBytes() {
        int start = position;

        while (payload[position++] != 10);
        byte[] bytes = new byte[position - start - 1];
        for (int i = start; i < position - 1; i++) {
            bytes[i - start] = payload[i];
        }
        return bytes;
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

    public void writeShortA(int value) {
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) (value + 128);
    }

    public void writeShortLEA(int i, int value) {
        payload[position++] = (byte) (value + 128);
        payload[position++] = (byte) (value >> 8);
    }

    public int getMediumLE() {
        position += 3;
        return ((payload[position - 1] & 0xff) << 16) + ((payload[position - 2] & 0xff) << 8) + (payload[position - 3] & 0xff);
    }

    public int readIntLE() {
        position += 4;
        return ((payload[position - 1] & 0xff) << 24) + ((payload[position - 2] & 0xff) << 16) + ((payload[position - 3] & 0xff) << 8) + (payload[position - 4] & 0xff);
    }

    public int readIntME1() {
        position += 4;
        return ((payload[position - 2] & 0xff) << 24) + ((payload[position - 1] & 0xff) << 16) + ((payload[position - 4] & 0xff) << 8) + (payload[position - 3] & 0xff);
    }

    public int readInt2ME(int i) {
        position += 4;
        return ((payload[position - 3] & 0xff) << 24) + ((payload[position - 4] & 0xff) << 16) + ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
    }

    public void readBytes(byte[] bytes, int start, int length) {
        for (int pos = start; pos < start + length; pos++) {
            bytes[pos] = payload[position++];
        }
    }

    public void readBytesA(byte[] bytes, int start, int length) {
        for (int pos = start; pos < start + length; pos++) {
            bytes[pos] = (byte) (payload[position++] - 128);
        }
    }

    public void readBytesReverseA(byte[] bytes, int start, int length) {
        for (int pos = (start + length) - 1; pos >= start; pos--) {
            payload[position++] = (byte) (bytes[pos] + 128);
        }
    }

    public void initBitAccess() {
        bitPosition = position * 8;
    }

    public void finishBitAccess() {
        position = (bitPosition + 7) / 8;
    }

    public int readBits(int numBits) {
        int k = bitPosition >> 3;
        int l = 8 - (bitPosition & 7);
        int value = 0;
        bitPosition += numBits;
        for (; numBits > l; l = 8) {
            value += (payload[k++] & BIT_MASKS[l]) << numBits - l;
            numBits -= l;
        }
        if (numBits == l) {
            value += payload[k] & BIT_MASKS[l];
        } else {
            value += payload[k] >> l - numBits & BIT_MASKS[numBits];
        }
        return value;
    }

    public void encrypt(BigInteger key, BigInteger modulus) {
        int length = position;
        position = 0;
        byte[] bytes = new byte[length];
        readBytes(bytes, 0, length);
        BigInteger biginteger2 = new BigInteger(bytes);
        BigInteger biginteger3 = biginteger2.modPow(key, modulus);

        byte[] encrypted = biginteger3.toByteArray();
        position = 0;
        writeByte(encrypted.length);
        writeBytes(encrypted, 0, encrypted.length);
    }
}
