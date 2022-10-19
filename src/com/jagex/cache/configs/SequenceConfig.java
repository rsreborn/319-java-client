package com.jagex.cache.configs;

import com.jagex.renderable.animation.AnimationFrame;
import com.jagex.cache.CacheArchive;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;

public class SequenceConfig {

    public static int anInt797 = 12258;
    public static int anInt799;
    public static SequenceConfig[] sequences;
    public static int anInt816;
    public boolean aBoolean798;
    public int anInt801;
    public int[] anIntArray802;
    public int[] anIntArray803;
    public int[] anIntArray804;
    public int anInt805;
    public int[] anIntArray806;
    public boolean aBoolean807;
    public int anInt808;
    public int anInt809;
    public int anInt810;
    public int anInt811;
    public int anInt812;
    public int anInt813;
    public int anInt814;
    public int anInt815;

    public SequenceConfig() {
        aBoolean798 = false;
        anInt805 = -1;
        aBoolean807 = false;
        anInt808 = 5;
        anInt809 = -1;
        anInt810 = -1;
        anInt811 = 99;
        anInt812 = -1;
        anInt813 = -1;
        anInt814 = 2;
    }

    public static void method591(CacheArchive cacheArchive, byte byte0) {
        try {
            Buffer buffer = new Buffer(cacheArchive.readFile("seq.dat", null));
            anInt799 = buffer.readUShortBE();
            if (byte0 != 72) {
                anInt797 = -421;
            }
            if (sequences == null) {
                sequences = new SequenceConfig[anInt799];
            }
            for (int i = 0; i < anInt799; i++) {
                if (sequences[i] == null) {
                    sequences[i] = new SequenceConfig();
                }
                sequences[i].method593(buffer, 26421);
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("59847, " + cacheArchive + ", " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int method592(int i, int j) {
        try {
            int k = anIntArray804[j];
            if (i != 0) {
                return anInt797;
            }
            if (k == 0) {
                AnimationFrame animationFrame = AnimationFrame.method188((byte) 4, anIntArray802[j]);
                if (animationFrame != null) {
                    k = anIntArray804[j] = animationFrame.anInt137;
                }
            }
            if (k == 0) {
                k = 1;
            }
            return k;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("57090, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method593(Buffer buffer, int i) {
        try {
            if (i != 26421) {
                aBoolean798 = !aBoolean798;
            }
            do {
                int j = buffer.readUByte();
                if (j == 0) {
                    break;
                }
                if (j == 1) {
                    anInt801 = buffer.readUByte();
                    anIntArray802 = new int[anInt801];
                    anIntArray803 = new int[anInt801];
                    anIntArray804 = new int[anInt801];
                    for (int k = 0; k < anInt801; k++) {
                        anIntArray802[k] = buffer.readUShortBE();
                        anIntArray803[k] = buffer.readUShortBE();
                        if (anIntArray803[k] == 65535) {
                            anIntArray803[k] = -1;
                        }
                        anIntArray804[k] = buffer.readUShortBE();
                    }
                } else if (j == 2) {
                    anInt805 = buffer.readUShortBE();
                } else if (j == 3) {
                    int l = buffer.readUByte();
                    anIntArray806 = new int[l + 1];
                    for (int i1 = 0; i1 < l; i1++) {
                        anIntArray806[i1] = buffer.readUByte();
                    }
                    anIntArray806[l] = 0x98967f;
                } else if (j == 4) {
                    aBoolean807 = true;
                } else if (j == 5) {
                    anInt808 = buffer.readUByte();
                } else if (j == 6) {
                    anInt809 = buffer.readUShortBE();
                } else if (j == 7) {
                    anInt810 = buffer.readUShortBE();
                } else if (j == 8) {
                    anInt811 = buffer.readUByte();
                } else if (j == 9) {
                    anInt812 = buffer.readUByte();
                } else if (j == 10) {
                    anInt813 = buffer.readUByte();
                } else if (j == 11) {
                    anInt814 = buffer.readUByte();
                } else if (j == 12) {
                    anInt815 = buffer.readIntBE();
                } else {
                    System.out.println("Error unrecognised seq config code: " + j);
                }
            } while (true);
            if (anInt801 == 0) {
                anInt801 = 1;
                anIntArray802 = new int[1];
                anIntArray802[0] = -1;
                anIntArray803 = new int[1];
                anIntArray803[0] = -1;
                anIntArray804 = new int[1];
                anIntArray804[0] = -1;
            }
            if (anInt812 == -1) {
                if (anIntArray806 != null) {
                    anInt812 = 2;
                } else {
                    anInt812 = 0;
                }
            }
            if (anInt813 == -1) {
                if (anIntArray806 != null) {
                    anInt813 = 2;
                    return;
                } else {
                    anInt813 = 0;
                    return;
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("43214, " + buffer + ", " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

}
