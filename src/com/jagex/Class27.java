package com.jagex;

import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;

public class Class27 {

    public static Class27[] aClass27Array449 = new Class27[5000];
    public static int[] anIntArray450 = new int[5000];
    public static byte[] aByteArray451;
    public static Buffer aBuffer_452;
    public int anInt447;
    public boolean aBoolean448;
    public Class17[] aClass17Array453;
    public int anInt454;
    public int anInt455;

    public Class27(byte byte0) {
        anInt447 = 1;
        aBoolean448 = true;
        aClass17Array453 = new Class17[10];
        try {
            if (byte0 != 9) {
                throw new NullPointerException();
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("30937, " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public static void method475(Buffer buffer, byte byte0) {
        try {
            if (byte0 != 72) {
                return;
            }
            aByteArray451 = new byte[0x6baa8];
            aBuffer_452 = new Buffer(aByteArray451);
            Class17.method435();
            do {
                int i = buffer.readUShortBE();
                if (i == 65535) {
                    return;
                }
                aClass27Array449[i] = new Class27((byte) 9);
                aClass27Array449[i].method477(buffer, 26421);
                anIntArray450[i] = aClass27Array449[i].method478(false);
            } while (true);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("66826, " + buffer + ", " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static Buffer method476(byte byte0, int i, int j) {
        try {
            if (byte0 != -97) {
                throw new NullPointerException();
            }
            if (aClass27Array449[i] != null) {
                Class27 class27 = aClass27Array449[i];
                return class27.method479(j, 0);
            } else {
                return null;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("38598, " + byte0 + ", " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method477(Buffer buffer, int i) {
        try {
            for (int j = 0; j < 10; j++) {
                int k = buffer.readUByte();
                if (k != 0) {
                    buffer.position--;
                    aClass17Array453[j] = new Class17();
                    aClass17Array453[j].method438(buffer, 26421);
                }
            }
            if (i != 26421) {
                aBoolean448 = !aBoolean448;
            }
            anInt454 = buffer.readUShortBE();
            anInt455 = buffer.readUShortBE();
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("73125, " + buffer + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int method478(boolean flag) {
        try {
            int i = 0x98967f;
            if (flag) {
                return 2;
            }
            for (int j = 0; j < 10; j++) {
                if (aClass17Array453[j] != null && aClass17Array453[j].anInt318 / 20 < i) {
                    i = aClass17Array453[j].anInt318 / 20;
                }
            }
            if (anInt454 < anInt455 && anInt454 / 20 < i) {
                i = anInt454 / 20;
            }
            if (i == 0x98967f || i == 0) {
                return 0;
            }
            for (int k = 0; k < 10; k++) {
                if (aClass17Array453[k] != null) {
                    aClass17Array453[k].anInt318 -= i * 20;
                }
            }
            if (anInt454 < anInt455) {
                anInt454 -= i * 20;
                anInt455 -= i * 20;
            }
            return i;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("23085, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Buffer method479(int i, int j) {
        try {
            int k = method480(i);
            aBuffer_452.position = 0;
            aBuffer_452.writeIntBE(0x52494646);
            aBuffer_452.writeIntLE(36 + k);
            aBuffer_452.writeIntBE(0x57415645);
            aBuffer_452.writeIntBE(0x666d7420);
            aBuffer_452.writeIntLE(16);
            aBuffer_452.writeShortLE(1);
            aBuffer_452.writeShortLE(1);
            aBuffer_452.writeIntLE(22050);
            aBuffer_452.writeIntLE(22050);
            aBuffer_452.writeShortLE(1);
            if (j != 0) {
                for (int l = 1; l > 0; l++) {
                }
            }
            aBuffer_452.writeShortLE(8);
            aBuffer_452.writeIntBE(0x64617461);
            aBuffer_452.writeIntLE(k);
            aBuffer_452.position += k;
            return aBuffer_452;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("2801, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int method480(int i) {
        int j = 0;
        for (int k = 0; k < 10; k++) {
            if (aClass17Array453[k] != null && aClass17Array453[k].anInt317 + aClass17Array453[k].anInt318 > j) {
                j = aClass17Array453[k].anInt317 + aClass17Array453[k].anInt318;
            }
        }
        if (j == 0) {
            return 0;
        }
        int l = (22050 * j) / 1000;
        int i1 = (22050 * anInt454) / 1000;
        int j1 = (22050 * anInt455) / 1000;
        if (i1 < 0 || i1 > l || j1 < 0 || j1 > l || i1 >= j1) {
            i = 0;
        }
        int k1 = l + (j1 - i1) * (i - 1);
        for (int l1 = 44; l1 < k1 + 44; l1++) {
            aByteArray451[l1] = -128;
        }
        for (int i2 = 0; i2 < 10; i2++) {
            if (aClass17Array453[i2] != null) {
                int j2 = (aClass17Array453[i2].anInt317 * 22050) / 1000;
                int i3 = (aClass17Array453[i2].anInt318 * 22050) / 1000;
                int[] ai = aClass17Array453[i2].method436(j2, aClass17Array453[i2].anInt317);
                for (int l3 = 0; l3 < j2; l3++) {
                    aByteArray451[l3 + i3 + 44] += (byte) (ai[l3] >> 8);
                }
            }
        }
        if (i > 1) {
            i1 += 44;
            j1 += 44;
            l += 44;
            int k2 = (k1 += 44) - l;
            for (int j3 = l - 1; j3 >= j1; j3--) {
                aByteArray451[j3 + k2] = aByteArray451[j3];
            }
            for (int k3 = 1; k3 < i; k3++) {
                int l2 = (j1 - i1) * k3;
                for (int i4 = i1; i4 < j1; i4++) {
                    aByteArray451[i4 + l2] = aByteArray451[i4];
                }
            }
            k1 -= 44;
        }
        return k1;
    }

}
