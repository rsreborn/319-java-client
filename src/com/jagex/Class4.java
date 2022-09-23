package com.jagex;

import com.jagex.sign.Signlink;

public class Class4 {

    public static int anInt64;
    public static Class4[] aClass4Array65;
    public boolean aBoolean60;
    public boolean aBoolean61;
    public int anInt62;
    public int anInt63;
    public int anInt66;
    public int[] anIntArray67;
    public int[] anIntArray68;
    public int[] anIntArray69;
    public int[] anIntArray70 = {
            -1, -1, -1, -1, -1
    };
    public boolean aBoolean71;

    public Class4() {
        aBoolean60 = true;
        aBoolean61 = true;
        anInt62 = 34249;
        anInt63 = -22144;
        anInt66 = -1;
        anIntArray68 = new int[6];
        anIntArray69 = new int[6];
        aBoolean71 = false;
    }

    public static void method175(Archive archive, byte byte0) {
        try {
            Buffer buffer = new Buffer(archive.readFile("idk.dat", null));
            anInt64 = buffer.readUnsignedShort();
            if (aClass4Array65 == null) {
                aClass4Array65 = new Class4[anInt64];
            }
            for (int i = 0; i < anInt64; i++) {
                if (aClass4Array65[i] == null) {
                    aClass4Array65[i] = new Class4();
                }
                aClass4Array65[i].method176(buffer, 26421);
            }
            if (byte0 != 72) {
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("48764, " + archive + ", " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method176(Buffer buffer, int i) {
        try {
            if (i != 26421) {
                aBoolean60 = !aBoolean60;
            }
            do {
                int j = buffer.readUnsignedByte();
                if (j == 0) {
                    return;
                }
                if (j == 1) {
                    anInt66 = buffer.readUnsignedByte();
                } else if (j == 2) {
                    int k = buffer.readUnsignedByte();
                    anIntArray67 = new int[k];
                    for (int l = 0; l < k; l++) {
                        anIntArray67[l] = buffer.readUnsignedShort();
                    }
                } else if (j == 3) {
                    aBoolean71 = true;
                } else if (j >= 40 && j < 50) {
                    anIntArray68[j - 40] = buffer.readUnsignedShort();
                } else if (j >= 50 && j < 60) {
                    anIntArray69[j - 50] = buffer.readUnsignedShort();
                } else if (j >= 60 && j < 70) {
                    anIntArray70[j - 60] = buffer.readUnsignedShort();
                } else {
                    System.out.println("Error unrecognised config code: " + j);
                }
            } while (true);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("56659, " + buffer + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method177(boolean flag) {
        try {
            if (!flag) {
                anInt63 = -311;
            }
            if (anIntArray67 == null) {
                return true;
            }
            boolean flag1 = true;
            for (int i = 0; i < anIntArray67.length; i++) {
                if (!Class13_Sub1_Sub1_Sub4.method266(anIntArray67[i])) {
                    flag1 = false;
                }
            }
            return flag1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("99392, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub1_Sub4 method178(int i) {
        try {
            if (anIntArray67 == null) {
                return null;
            }
            Class13_Sub1_Sub1_Sub4[] aclass13_sub1_sub1_sub4 = new Class13_Sub1_Sub1_Sub4[anIntArray67.length];
            for (int j = 0; j < anIntArray67.length; j++) {
                aclass13_sub1_sub1_sub4[j] = Class13_Sub1_Sub1_Sub4.method265((byte) 4, anIntArray67[j]);
            }
            Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4;
            if (aclass13_sub1_sub1_sub4.length == 1) {
                class13_sub1_sub1_sub4 = aclass13_sub1_sub1_sub4[0];
            } else {
                class13_sub1_sub1_sub4 = new Class13_Sub1_Sub1_Sub4(aclass13_sub1_sub1_sub4.length, (byte) 61, aclass13_sub1_sub1_sub4);
            }
            for (int k = 0; k < 6; k++) {
                if (anIntArray68[k] == 0) {
                    break;
                }
                class13_sub1_sub1_sub4.method279(anIntArray68[k], anIntArray69[k]);
            }
            if (i != 0) {
                for (int l = 1; l > 0; l++) {
                }
            }
            return class13_sub1_sub1_sub4;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("75971, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method179(int i) {
        try {
            if (i != -1743) {
                anInt62 = -92;
            }
            boolean flag = true;
            for (int j = 0; j < 5; j++) {
                if (anIntArray70[j] != -1 && !Class13_Sub1_Sub1_Sub4.method266(anIntArray70[j])) {
                    flag = false;
                }
            }
            return flag;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("66451, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub1_Sub4 method180(byte byte0) {
        try {
            Class13_Sub1_Sub1_Sub4[] aclass13_sub1_sub1_sub4 = new Class13_Sub1_Sub1_Sub4[5];
            int i = 0;
            for (int j = 0; j < 5; j++) {
                if (anIntArray70[j] != -1) {
                    aclass13_sub1_sub1_sub4[i++] = Class13_Sub1_Sub1_Sub4.method265((byte) 4, anIntArray70[j]);
                }
            }
            Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = new Class13_Sub1_Sub1_Sub4(i, (byte) 61, aclass13_sub1_sub1_sub4);
            if (byte0 != -78) {
                aBoolean61 = !aBoolean61;
            }
            for (int k = 0; k < 6; k++) {
                if (anIntArray68[k] == 0) {
                    break;
                }
                class13_sub1_sub1_sub4.method279(anIntArray68[k], anIntArray69[k]);
            }
            return class13_sub1_sub1_sub4;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("97100, " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
