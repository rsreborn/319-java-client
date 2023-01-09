package com.jagex.cache.configs;

import com.jagex.graphics.Model;
import com.jagex.cache.CacheArchive;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;

// Identikit
public class IdentikitConfig {

    public static int anInt64;
    public static IdentikitConfig[] aIdentikitConfigArray65;
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

    public IdentikitConfig() {
        aBoolean60 = true;
        aBoolean61 = true;
        anInt62 = 34249;
        anInt63 = -22144;
        anInt66 = -1;
        anIntArray68 = new int[6];
        anIntArray69 = new int[6];
        aBoolean71 = false;
    }

    public static void method175(CacheArchive cacheArchive, byte byte0) {
        try {
            Buffer buffer = new Buffer(cacheArchive.readFile("idk.dat", null));
            anInt64 = buffer.readUShortBE();
            if (aIdentikitConfigArray65 == null) {
                aIdentikitConfigArray65 = new IdentikitConfig[anInt64];
            }
            for (int i = 0; i < anInt64; i++) {
                if (aIdentikitConfigArray65[i] == null) {
                    aIdentikitConfigArray65[i] = new IdentikitConfig();
                }
                aIdentikitConfigArray65[i].method176(buffer, 26421);
            }
            if (byte0 != 72) {
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("48764, " + cacheArchive + ", " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method176(Buffer buffer, int i) {
        try {
            if (i != 26421) {
                aBoolean60 = !aBoolean60;
            }
            do {
                int j = buffer.readUByte();
                if (j == 0) {
                    return;
                }
                if (j == 1) {
                    anInt66 = buffer.readUByte();
                } else if (j == 2) {
                    int k = buffer.readUByte();
                    anIntArray67 = new int[k];
                    for (int l = 0; l < k; l++) {
                        anIntArray67[l] = buffer.readUShortBE();
                    }
                } else if (j == 3) {
                    aBoolean71 = true;
                } else if (j >= 40 && j < 50) {
                    anIntArray68[j - 40] = buffer.readUShortBE();
                } else if (j >= 50 && j < 60) {
                    anIntArray69[j - 50] = buffer.readUShortBE();
                } else if (j >= 60 && j < 70) {
                    anIntArray70[j - 60] = buffer.readUShortBE();
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
                if (!Model.method266(anIntArray67[i])) {
                    flag1 = false;
                }
            }
            return flag1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("99392, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method178(int i) {
        try {
            if (anIntArray67 == null) {
                return null;
            }
            Model[] aclass13_sub1_sub1_sub4 = new Model[anIntArray67.length];
            for (int j = 0; j < anIntArray67.length; j++) {
                aclass13_sub1_sub1_sub4[j] = Model.getModel(anIntArray67[j]);
            }
            Model class13_sub1_sub1_sub4;
            if (aclass13_sub1_sub1_sub4.length == 1) {
                class13_sub1_sub1_sub4 = aclass13_sub1_sub1_sub4[0];
            } else {
                class13_sub1_sub1_sub4 = new Model(aclass13_sub1_sub1_sub4.length, (byte) 61, aclass13_sub1_sub1_sub4);
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
                if (anIntArray70[j] != -1 && !Model.method266(anIntArray70[j])) {
                    flag = false;
                }
            }
            return flag;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("66451, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method180(byte byte0) {
        try {
            Model[] aclass13_sub1_sub1_sub4 = new Model[5];
            int i = 0;
            for (int j = 0; j < 5; j++) {
                if (anIntArray70[j] != -1) {
                    aclass13_sub1_sub1_sub4[i++] = Model.getModel(anIntArray70[j]);
                }
            }
            Model class13_sub1_sub1_sub4 = new Model(i, (byte) 61, aclass13_sub1_sub1_sub4);
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
