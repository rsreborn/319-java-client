package com.jagex.cache.configs;

import com.jagex.Class8;
import com.jagex.Game;
import com.jagex.Model;
import com.jagex.cache.CacheArchive;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;
import com.jagex.util.Cache;

public class NpcConfig {

    public static NpcConfig[] aNpcConfigArray757;
    public static Buffer aBuffer_758;
    public static Cache aCache_759 = new Cache(30);
    public static int[] anIntArray761;
    public static int anInt763;
    public static int anInt775;
    public static Game aGame777;
    public static int anInt780;
    public int anInt745;
    public int anInt746;
    public String[] aStringArray747;
    public int anInt748;
    public int anInt749;
    public int[] anIntArray750;
    public int[] anIntArray751;
    public boolean aBoolean752;
    public int anInt753;
    public byte[] aByteArray754;
    public int anInt755;
    public int anInt756;
    public int anInt760;
    public boolean aBoolean762;
    public int anInt764;
    public String aString765;
    public int[] anIntArray766;
    public int anInt767;
    public byte aByte768;
    public int[] anIntArray769;
    public long aLong770;
    public int anInt771;
    public int anInt772;
    public int anInt773;
    public byte aByte774;
    public int anInt776;
    public int anInt778;
    public byte aByte779;
    public int anInt781;
    public boolean aBoolean782;
    public int[] anIntArray783;
    public boolean aBoolean784;
    public int anInt785;
    public int anInt786;

    public NpcConfig() {
        anInt745 = 128;
        anInt746 = -1;
        anInt748 = -1;
        anInt749 = -1;
        aBoolean752 = true;
        anInt753 = -1;
        anInt756 = -1;
        anInt760 = 32;
        aBoolean762 = false;
        anInt764 = -1;
        anInt767 = -1;
        aByte768 = 1;
        aLong770 = -1L;
        anInt771 = 128;
        anInt772 = -1;
        anInt773 = -1;
        aByte774 = 42;
        anInt778 = -1;
        aByte779 = -26;
        anInt781 = -49493;
        aBoolean782 = false;
        aBoolean784 = true;
        anInt785 = -1;
        anInt786 = -1;
    }

    public static NpcConfig getDefinition(int i) {
        for (int j = 0; j < 20; j++) {
            if (aNpcConfigArray757[j].aLong770 == (long) i) {
                return aNpcConfigArray757[j];
            }
        }
        anInt780 = (anInt780 + 1) % 20;
        NpcConfig npcConfig = aNpcConfigArray757[anInt780] = new NpcConfig();
        aBuffer_758.position = anIntArray761[i];
        npcConfig.aLong770 = i;
        npcConfig.method586(aBuffer_758, 26421);
        return npcConfig;
    }

    public static void method587(CacheArchive cacheArchive) {
        aBuffer_758 = new Buffer(cacheArchive.readFile("npc.dat", null));
        Buffer buffer = new Buffer(cacheArchive.readFile("npc.idx", null));
        anInt775 = buffer.readUShortBE();
        anIntArray761 = new int[anInt775];
        int i = 2;
        for (int j = 0; j < anInt775; j++) {
            anIntArray761[j] = i;
            i += buffer.readUShortBE();
        }
        aNpcConfigArray757 = new NpcConfig[20];
        for (int k = 0; k < 20; k++) {
            aNpcConfigArray757[k] = new NpcConfig();
        }
    }

    public static void method588(int i) {
        try {
            if (i != 47779) {
                anInt763 = -14;
            }
            aCache_759 = null;
            anIntArray761 = null;
            aNpcConfigArray757 = null;
            aBuffer_758 = null;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("41198, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Model method582(int i, int j, boolean flag, int[] ai) {
        try {
            if (!flag) {
                aBoolean762 = !aBoolean762;
            }
            if (anIntArray751 != null) {
                NpcConfig npcConfig = method584((byte) 0);
                if (npcConfig == null) {
                    return null;
                } else {
                    return npcConfig.method582(i, j, true, ai);
                }
            }
            Model class13_sub1_sub1_sub4 = (Model) aCache_759.get(aLong770);
            if (class13_sub1_sub1_sub4 == null) {
                boolean flag1 = false;
                for (int k = 0; k < anIntArray769.length; k++) {
                    if (!Model.method266(anIntArray769[k])) {
                        flag1 = true;
                    }
                }
                if (flag1) {
                    return null;
                }
                Model[] aclass13_sub1_sub1_sub4 = new Model[anIntArray769.length];
                for (int l = 0; l < anIntArray769.length; l++) {
                    aclass13_sub1_sub1_sub4[l] = Model.method265((byte) 4, anIntArray769[l]);
                }
                if (aclass13_sub1_sub1_sub4.length == 1) {
                    class13_sub1_sub1_sub4 = aclass13_sub1_sub1_sub4[0];
                } else {
                    class13_sub1_sub1_sub4 = new Model(aclass13_sub1_sub1_sub4.length, (byte) 61, aclass13_sub1_sub1_sub4);
                }
                if (anIntArray750 != null) {
                    for (int i1 = 0; i1 < anIntArray750.length; i1++) {
                        class13_sub1_sub1_sub4.method279(anIntArray750[i1], anIntArray783[i1]);
                    }
                }
                class13_sub1_sub1_sub4.method272(true);
                class13_sub1_sub1_sub4.method282(64 + anInt776, 850 + anInt755, -30, -50, -30, true);
                aCache_759.put(class13_sub1_sub1_sub4, aLong770);
            }
            Model class13_sub1_sub1_sub4_1 = Model.aClass13_Sub1_Sub1_Sub4_1491;
            class13_sub1_sub1_sub4_1.method267(Class8.method189(j, 19953) & Class8.method189(i, 19953), aByte779, class13_sub1_sub1_sub4);
            if (j != -1 && i != -1) {
                class13_sub1_sub1_sub4_1.method274(aByte774, ai, i, j);
            } else if (j != -1) {
                class13_sub1_sub1_sub4_1.method273(j, false);
            }
            if (anInt771 != 128 || anInt745 != 128) {
                class13_sub1_sub1_sub4_1.method281(anInt771, anInt771, anInt745, (byte) 0);
            }
            class13_sub1_sub1_sub4_1.method269(0);
            class13_sub1_sub1_sub4_1.anIntArrayArray1528 = null;
            class13_sub1_sub1_sub4_1.anIntArrayArray1527 = null;
            if (aByte768 == 1) {
                class13_sub1_sub1_sub4_1.aBoolean1529 = true;
            }
            return class13_sub1_sub1_sub4_1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("29112, " + i + ", " + j + ", " + flag + ", " + ai + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method583(int i) {
        try {
            i = 78 / i;
            if (anIntArray751 != null) {
                NpcConfig npcConfig = method584((byte) 0);
                if (npcConfig == null) {
                    return null;
                } else {
                    return npcConfig.method583(524);
                }
            }
            if (anIntArray766 == null) {
                return null;
            }
            boolean flag = false;
            for (int j = 0; j < anIntArray766.length; j++) {
                if (!Model.method266(anIntArray766[j])) {
                    flag = true;
                }
            }
            if (flag) {
                return null;
            }
            Model[] aclass13_sub1_sub1_sub4 = new Model[anIntArray766.length];
            for (int k = 0; k < anIntArray766.length; k++) {
                aclass13_sub1_sub1_sub4[k] = Model.method265((byte) 4, anIntArray766[k]);
            }
            Model class13_sub1_sub1_sub4;
            if (aclass13_sub1_sub1_sub4.length == 1) {
                class13_sub1_sub1_sub4 = aclass13_sub1_sub1_sub4[0];
            } else {
                class13_sub1_sub1_sub4 = new Model(aclass13_sub1_sub1_sub4.length, (byte) 61, aclass13_sub1_sub1_sub4);
            }
            if (anIntArray750 != null) {
                for (int l = 0; l < anIntArray750.length; l++) {
                    class13_sub1_sub1_sub4.method279(anIntArray750[l], anIntArray783[l]);
                }
            }
            return class13_sub1_sub1_sub4;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("50384, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public NpcConfig method584(byte byte0) {
        try {
            int i = -1;
            if (byte0 != 0) {
                for (int j = 1; j > 0; j++) {
                }
            }
            if (anInt767 != -1) {
                VariableBitConfig variableBitConfig = VariableBitConfig.aVariableBitConfigArray439[anInt767];
                int k = variableBitConfig.anInt441;
                int l = variableBitConfig.anInt442;
                int i1 = variableBitConfig.anInt443;
                int j1 = Game.anIntArray1271[i1 - l];
                i = aGame777.anIntArray1149[k] >> l & j1;
            } else if (anInt764 != -1) {
                i = aGame777.anIntArray1149[anInt764];
            }
            if (i < 0 || i >= anIntArray751.length || anIntArray751[i] == -1) {
                return null;
            } else {
                return getDefinition(anIntArray751[i]);
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("99223, " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method586(Buffer buffer, int i) {
        try {
            if (i != 26421) {
                anInt781 = -6;
            }
            do {
                int j = buffer.readUByte();
                if (j == 0) {
                    return;
                }
                if (j == 1) {
                    int k = buffer.readUByte();
                    anIntArray769 = new int[k];
                    for (int k1 = 0; k1 < k; k1++) {
                        anIntArray769[k1] = buffer.readUShortBE();
                    }
                } else if (j == 2) {
                    aString765 = buffer.readString();
                } else if (j == 3) {
                    aByteArray754 = buffer.readStringBytes();
                } else if (j == 12) {
                    aByte768 = buffer.readByte();
                } else if (j == 13) {
                    anInt748 = buffer.readUShortBE();
                } else if (j == 14) {
                    anInt778 = buffer.readUShortBE();
                } else if (j == 17) {
                    anInt778 = buffer.readUShortBE();
                    anInt785 = buffer.readUShortBE();
                    anInt773 = buffer.readUShortBE();
                    anInt786 = buffer.readUShortBE();
                } else if (j >= 30 && j < 40) {
                    if (aStringArray747 == null) {
                        aStringArray747 = new String[5];
                    }
                    aStringArray747[j - 30] = buffer.readString();
                    if (aStringArray747[j - 30].equalsIgnoreCase("hidden")) {
                        aStringArray747[j - 30] = null;
                    }
                } else if (j == 40) {
                    int l = buffer.readUByte();
                    anIntArray750 = new int[l];
                    anIntArray783 = new int[l];
                    for (int l1 = 0; l1 < l; l1++) {
                        anIntArray750[l1] = buffer.readUShortBE();
                        anIntArray783[l1] = buffer.readUShortBE();
                    }
                } else if (j == 60) {
                    int i1 = buffer.readUByte();
                    anIntArray766 = new int[i1];
                    for (int i2 = 0; i2 < i1; i2++) {
                        anIntArray766[i2] = buffer.readUShortBE();
                    }
                } else if (j == 90) {
                    anInt746 = buffer.readUShortBE();
                } else if (j == 91) {
                    anInt772 = buffer.readUShortBE();
                } else if (j == 92) {
                    anInt753 = buffer.readUShortBE();
                } else if (j == 93) {
                    aBoolean752 = false;
                } else if (j == 95) {
                    anInt756 = buffer.readUShortBE();
                } else if (j == 97) {
                    anInt771 = buffer.readUShortBE();
                } else if (j == 98) {
                    anInt745 = buffer.readUShortBE();
                } else if (j == 99) {
                    aBoolean782 = true;
                } else if (j == 100) {
                    anInt776 = buffer.readByte();
                } else if (j == 101) {
                    anInt755 = buffer.readByte() * 5;
                } else if (j == 102) {
                    anInt749 = buffer.readUShortBE();
                } else if (j == 103) {
                    anInt760 = buffer.readUShortBE();
                } else if (j == 106) {
                    anInt767 = buffer.readUShortBE();
                    if (anInt767 == 65535) {
                        anInt767 = -1;
                    }
                    anInt764 = buffer.readUShortBE();
                    if (anInt764 == 65535) {
                        anInt764 = -1;
                    }
                    int j1 = buffer.readUByte();
                    anIntArray751 = new int[j1 + 1];
                    for (int j2 = 0; j2 <= j1; j2++) {
                        anIntArray751[j2] = buffer.readUShortBE();
                        if (anIntArray751[j2] == 65535) {
                            anIntArray751[j2] = -1;
                        }
                    }
                } else if (j == 107) {
                    aBoolean784 = false;
                }
            } while (true);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("711, " + buffer + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

}
