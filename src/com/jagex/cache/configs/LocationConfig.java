package com.jagex.cache.configs;

import com.jagex.renderable.animation.AnimationFrame;
import com.jagex.Game;
import com.jagex.graphics.Model;
import com.jagex.cache.CacheArchive;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;
import com.jagex.update.GameUpdateClient;
import com.jagex.util.Cache;

public class LocationConfig {

    public static Model[] aClass13_Sub1_Sub1_Sub4Array239 = new Model[4];
    public static int anInt245;
    public static Cache aCache_248 = new Cache(500);
    public static Cache aCache_249 = new Cache(30);
    public static int anInt252;
    public static Game aGame254;
    public static Buffer aBuffer_267;
    public static boolean isLowMemory;
    public static LocationConfig[] aLocationConfigArray278;
    public static int[] anIntArray287;
    public boolean aBoolean240;
    public int[] anIntArray241;
    public int[] anIntArray242;
    public int[] anIntArray243;
    public boolean aBoolean244;
    public int anInt246;
    public int anInt247;
    public int anInt250;
    public boolean aBoolean251;
    public int anInt253;
    public int anInt255;
    public boolean aBoolean256;
    public int anInt257;
    public boolean aBoolean258;
    public int anInt259;
    public boolean aBoolean260;
    public String[] options;
    public boolean aBoolean262;
    public boolean aBoolean263;
    public boolean aBoolean264;
    public byte aByte265;
    public int anInt266;
    public int anInt268;
    public int anInt269;
    public boolean aBoolean270;
    public int anInt271;
    public boolean aBoolean273;
    public int anInt274;
    public String name;
    public byte[] aByteArray276;
    public int anInt277;
    public int[] anIntArray279;
    public byte aByte280;
    public int anInt281;
    public int anInt282;
    public int anInt283;
    public int anInt284;
    public int anInt285;
    public boolean aBoolean286;
    public int anInt288;
    public int[] anIntArray289;

    public LocationConfig() {
        aBoolean244 = false;
        aBoolean256 = true;
        anInt268 = -1;
        anInt271 = -36669;
        anInt284 = 6;
    }

    public static void method416() {
        aCache_248 = null;
        aCache_249 = null;
        anIntArray287 = null;
        aLocationConfigArray278 = null;
        aBuffer_267 = null;
    }

    public static LocationConfig readDefinition(int i) {
        for (int j = 0; j < 20; j++) {
            if (aLocationConfigArray278[j].anInt268 == i) {
                return aLocationConfigArray278[j];
            }
        }
        anInt245 = (anInt245 + 1) % 20;
        LocationConfig locationConfig = aLocationConfigArray278[anInt245];
        aBuffer_267.position = anIntArray287[i];
        locationConfig.anInt268 = i;
        locationConfig.method417();
        locationConfig.method420(aBuffer_267, 26421);
        return locationConfig;
    }

    public static void method426(CacheArchive cacheArchive) {
        aBuffer_267 = new Buffer(cacheArchive.readFile("loc.dat", null));
        Buffer buffer = new Buffer(cacheArchive.readFile("loc.idx", null));
        anInt252 = buffer.readUShortBE();
        anIntArray287 = new int[anInt252];
        int i = 2;
        for (int j = 0; j < anInt252; j++) {
            anIntArray287[j] = i;
            i += buffer.readUShortBE();
        }
        aLocationConfigArray278 = new LocationConfig[20];
        for (int k = 0; k < 20; k++) {
            aLocationConfigArray278[k] = new LocationConfig();
        }
    }

    public void method417() {
        anIntArray241 = null;
        anIntArray289 = null;
        name = null;
        aByteArray276 = null;
        anIntArray242 = null;
        anIntArray279 = null;
        anInt259 = 1;
        anInt253 = 1;
        aBoolean258 = true;
        aBoolean270 = true;
        aBoolean260 = false;
        aBoolean263 = false;
        aBoolean240 = false;
        aBoolean251 = false;
        anInt282 = -1;
        anInt269 = 16;
        aByte280 = 0;
        aByte265 = 0;
        options = null;
        anInt250 = -1;
        anInt255 = -1;
        aBoolean273 = false;
        aBoolean286 = true;
        anInt283 = 128;
        anInt281 = 128;
        anInt274 = 128;
        anInt285 = 0;
        anInt247 = 0;
        anInt277 = 0;
        anInt288 = 0;
        aBoolean264 = false;
        aBoolean262 = false;
        anInt266 = -1;
        anInt246 = -1;
        anInt257 = -1;
        anIntArray243 = null;
    }

    public Model method419(int i, int j, int k, int l, int i1, int j1, int k1) {
        Model class13_sub1_sub1_sub4 = method422(k1, j, i, false);
        if (class13_sub1_sub1_sub4 == null) {
            return null;
        }
        if (aBoolean263 || aBoolean240) {
            class13_sub1_sub1_sub4 = new Model(class13_sub1_sub1_sub4, 0, aBoolean240, aBoolean263);
        }
        if (aBoolean263) {
            int l1 = (k + l + i1 + j1) / 4;
            for (int i2 = 0; i2 < class13_sub1_sub1_sub4.anInt1496; i2++) {
                int j2 = class13_sub1_sub1_sub4.anIntArray1497[i2];
                int k2 = class13_sub1_sub1_sub4.anIntArray1499[i2];
                int l2 = k + ((l - k) * (j2 + 64)) / 128;
                int i3 = j1 + ((i1 - j1) * (j2 + 64)) / 128;
                int j3 = l2 + ((i3 - l2) * (k2 + 64)) / 128;
                class13_sub1_sub1_sub4.anIntArray1498[i2] += j3 - l1;
            }
            class13_sub1_sub1_sub4.method270(false);
        }
        return class13_sub1_sub1_sub4;
    }

    public void method420(Buffer buffer, int i) {
        try {
            if (i != 26421) {
                for (int j = 1; j > 0; j++) {
                }
            }
            int k = -1;
            label0:
            do {
                int l;
                do {
                    l = buffer.readUByte();
                    if (l == 0) {
                        break label0;
                    }
                    if (l == 1) {
                        int i1 = buffer.readUByte();
                        if (i1 > 0) {
                            if (anIntArray241 == null || isLowMemory) {
                                anIntArray289 = new int[i1];
                                anIntArray241 = new int[i1];
                                for (int i2 = 0; i2 < i1; i2++) {
                                    anIntArray241[i2] = buffer.readUShortBE();
                                    anIntArray289[i2] = buffer.readUByte();
                                }
                            } else {
                                buffer.position += i1 * 3;
                            }
                        }
                    } else if (l == 2) {
                        name = buffer.readString();
                    } else if (l == 3) {
                        aByteArray276 = buffer.readStringBytes();
                    } else if (l == 5) {
                        int j1 = buffer.readUByte();
                        if (j1 > 0) {
                            if (anIntArray241 == null || isLowMemory) {
                                anIntArray289 = null;
                                anIntArray241 = new int[j1];
                                for (int j2 = 0; j2 < j1; j2++) {
                                    anIntArray241[j2] = buffer.readUShortBE();
                                }
                            } else {
                                buffer.position += j1 * 2;
                            }
                        }
                    } else if (l == 14) {
                        anInt259 = buffer.readUByte();
                    } else if (l == 15) {
                        anInt253 = buffer.readUByte();
                    } else if (l == 17) {
                        aBoolean258 = false;
                    } else if (l == 18) {
                        aBoolean270 = false;
                    } else if (l == 19) {
                        k = buffer.readUByte();
                        if (k == 1) {
                            aBoolean260 = true;
                        }
                    } else if (l == 21) {
                        aBoolean263 = true;
                    } else if (l == 22) {
                        aBoolean240 = true;
                    } else if (l == 23) {
                        aBoolean251 = true;
                    } else if (l == 24) {
                        anInt282 = buffer.readUShortBE();
                        if (anInt282 == 65535) {
                            anInt282 = -1;
                        }
                    } else if (l == 28) {
                        anInt269 = buffer.readUByte();
                    } else if (l == 29) {
                        aByte280 = buffer.readByte();
                    } else if (l == 39) {
                        aByte265 = buffer.readByte();
                    } else if (l >= 30 && l < 39) {
                        if (options == null) {
                            options = new String[5];
                        }
                        options[l - 30] = buffer.readString();
                        if (options[l - 30].equalsIgnoreCase("hidden")) {
                            options[l - 30] = null;
                        }
                    } else if (l == 40) {
                        int k1 = buffer.readUByte();
                        anIntArray242 = new int[k1];
                        anIntArray279 = new int[k1];
                        for (int k2 = 0; k2 < k1; k2++) {
                            anIntArray242[k2] = buffer.readUShortBE();
                            anIntArray279[k2] = buffer.readUShortBE();
                        }
                    } else if (l == 60) {
                        anInt250 = buffer.readUShortBE();
                    } else if (l == 62) {
                        aBoolean273 = true;
                    } else if (l == 64) {
                        aBoolean286 = false;
                    } else if (l == 65) {
                        anInt283 = buffer.readUShortBE();
                    } else if (l == 66) {
                        anInt281 = buffer.readUShortBE();
                    } else if (l == 67) {
                        anInt274 = buffer.readUShortBE();
                    } else if (l == 68) {
                        anInt255 = buffer.readUShortBE();
                    } else if (l == 69) {
                        anInt285 = buffer.readUByte();
                    } else if (l == 70) {
                        anInt247 = buffer.readShortBE();
                    } else if (l == 71) {
                        anInt277 = buffer.readShortBE();
                    } else if (l == 72) {
                        anInt288 = buffer.readShortBE();
                    } else if (l == 73) {
                        aBoolean264 = true;
                    } else if (l == 74) {
                        aBoolean262 = true;
                    } else {
                        if (l != 75) {
                            continue;
                        }
                        anInt266 = buffer.readUByte();
                    }
                    continue label0;
                } while (l != 77);
                anInt246 = buffer.readUShortBE();
                if (anInt246 == 65535) {
                    anInt246 = -1;
                }
                anInt257 = buffer.readUShortBE();
                if (anInt257 == 65535) {
                    anInt257 = -1;
                }
                int l1 = buffer.readUByte();
                anIntArray243 = new int[l1 + 1];
                for (int l2 = 0; l2 <= l1; l2++) {
                    anIntArray243[l2] = buffer.readUShortBE();
                    if (anIntArray243[l2] == 65535) {
                        anIntArray243[l2] = -1;
                    }
                }
            } while (true);
            if (k == -1) {
                aBoolean260 = anIntArray241 != null && (anIntArray289 == null || anIntArray289[0] == 10);
                if (options != null) {
                    aBoolean260 = true;
                }
            }
            if (aBoolean262) {
                aBoolean258 = false;
                aBoolean270 = false;
            }
            if (anInt266 == -1) {
                anInt266 = aBoolean258 ? 1 : 0;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("62681, " + buffer + ", " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public boolean method421(int i) {
        try {
            if (i != anInt271) {
                aBoolean256 = !aBoolean256;
            }
            if (anIntArray241 == null) {
                return true;
            }
            boolean flag = true;
            for (int j = 0; j < anIntArray241.length; j++) {
                flag &= Model.method266(anIntArray241[j] & 0xffff);
            }
            return flag;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("83070, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method422(int i, int j, int k, boolean flag) {
        try {
            Model class13_sub1_sub1_sub4 = null;
            if (flag) {
                aBoolean244 = !aBoolean244;
            }
            long l;
            if (anIntArray289 == null) {
                if (k != 10) {
                    return null;
                }
                l = (long) ((anInt268 << 6) + j) + ((long) (i + 1) << 32);
                Model class13_sub1_sub1_sub4_1 = (Model) aCache_249.get(l);
                if (class13_sub1_sub1_sub4_1 != null) {
                    return class13_sub1_sub1_sub4_1;
                }
                if (anIntArray241 == null) {
                    return null;
                }
                boolean flag2 = aBoolean273 ^ (j > 3);
                int k1 = anIntArray241.length;
                for (int l1 = 0; l1 < k1; l1++) {
                    int k2 = anIntArray241[l1];
                    if (flag2) {
                        k2 += 0x10000;
                    }
                    class13_sub1_sub1_sub4 = (Model) aCache_248.get(k2);
                    if (class13_sub1_sub1_sub4 == null) {
                        class13_sub1_sub1_sub4 = Model.getModel(k2 & 0xffff);
                        if (class13_sub1_sub1_sub4 == null) {
                            return null;
                        }
                        if (flag2) {
                            class13_sub1_sub1_sub4.method280(true);
                        }
                        aCache_248.put(class13_sub1_sub1_sub4, k2);
                    }
                    if (k1 > 1) {
                        aClass13_Sub1_Sub1_Sub4Array239[l1] = class13_sub1_sub1_sub4;
                    }
                }
                if (k1 > 1) {
                    class13_sub1_sub1_sub4 = new Model(k1, (byte) 61, aClass13_Sub1_Sub1_Sub4Array239);
                }
            } else {
                int i1 = -1;
                for (int j1 = 0; j1 < anIntArray289.length; j1++) {
                    if (anIntArray289[j1] != k) {
                        continue;
                    }
                    i1 = j1;
                    break;
                }
                if (i1 == -1) {
                    return null;
                }
                l = (long) ((anInt268 << 6) + (i1 << 3) + j) + ((long) (i + 1) << 32);
                Model class13_sub1_sub1_sub4_2 = (Model) aCache_249.get(l);
                if (class13_sub1_sub1_sub4_2 != null) {
                    return class13_sub1_sub1_sub4_2;
                }
                int i2 = anIntArray241[i1];
                boolean flag4 = aBoolean273 ^ (j > 3);
                if (flag4) {
                    i2 += 0x10000;
                }
                class13_sub1_sub1_sub4 = (Model) aCache_248.get(i2);
                if (class13_sub1_sub1_sub4 == null) {
                    class13_sub1_sub1_sub4 = Model.getModel(i2 & 0xffff);
                    if (class13_sub1_sub1_sub4 == null) {
                        return null;
                    }
                    if (flag4) {
                        class13_sub1_sub1_sub4.method280(true);
                    }
                    aCache_248.put(class13_sub1_sub1_sub4, i2);
                }
            }
            boolean flag1;
            flag1 = anInt283 != 128 || anInt281 != 128 || anInt274 != 128;
            boolean flag3;
            flag3 = anInt247 != 0 || anInt277 != 0 || anInt288 != 0;
            Model class13_sub1_sub1_sub4_3 = new Model(j == 0 && i == -1 && !flag1 && !flag3, AnimationFrame.method189(i, 19953), 629, class13_sub1_sub1_sub4, anIntArray242 == null);
            if (i != -1) {
                class13_sub1_sub1_sub4_3.method272();
                class13_sub1_sub1_sub4_3.method273(i);
                class13_sub1_sub1_sub4_3.anIntArrayArray1528 = null;
                class13_sub1_sub1_sub4_3.anIntArrayArray1527 = null;
            }
            while (j-- > 0) {
                class13_sub1_sub1_sub4_3.method276(-32823);
            }
            if (anIntArray242 != null) {
                for (int j2 = 0; j2 < anIntArray242.length; j2++) {
                    class13_sub1_sub1_sub4_3.method279(anIntArray242[j2], anIntArray279[j2]);
                }
            }
            if (flag1) {
                class13_sub1_sub1_sub4_3.method281(anInt283, anInt274, anInt281, (byte) 0);
            }
            if (flag3) {
                class13_sub1_sub1_sub4_3.method278(anInt288, -991, anInt277, anInt247);
            }
            class13_sub1_sub1_sub4_3.method282(64 + aByte280, 768 + aByte265 * 5, -50, -10, -50, !aBoolean240);
            if (anInt266 == 1) {
                class13_sub1_sub1_sub4_3.anInt1524 = class13_sub1_sub1_sub4_3.anInt1377;
            }
            aCache_249.put(class13_sub1_sub1_sub4_3, l);
            return class13_sub1_sub1_sub4_3;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("4845, " + i + ", " + j + ", " + k + ", " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method423(int i, GameUpdateClient gameUpdateClient) {
        try {
            if (anIntArray241 == null) {
                return;
            }
            for (int j = 0; j < anIntArray241.length; j++) {
                gameUpdateClient.loadExtra(0, anIntArray241[j] & 0xffff);
            }
            if (i != 2402) {
                anInt284 = 36;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("17097, " + i + ", " + gameUpdateClient + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public LocationConfig method424(int i) {
        try {
            if (i != 2) {
                anInt284 = 98;
            }
            int j = -1;
            if (anInt246 != -1) {
                VariableBitConfig variableBitConfig = VariableBitConfig.aVariableBitConfigArray439[anInt246];
                int k = variableBitConfig.anInt441;
                int l = variableBitConfig.anInt442;
                int i1 = variableBitConfig.anInt443;
                int j1 = Game.anIntArray1271[i1 - l];
                j = aGame254.anIntArray1149[k] >> l & j1;
            } else if (anInt257 != -1) {
                j = aGame254.anIntArray1149[anInt257];
            }
            if (j < 0 || j >= anIntArray243.length || anIntArray243[j] == -1) {
                return null;
            } else {
                return readDefinition(anIntArray243[j]);
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("92561, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method425(int i, int j) {
        try {
            if (j != 3) {
                throw new NullPointerException();
            }
            if (anIntArray289 == null) {
                if (anIntArray241 == null) {
                    return true;
                }
                if (i != 10) {
                    return true;
                }
                boolean flag = true;
                for (int l = 0; l < anIntArray241.length; l++) {
                    flag &= Model.method266(anIntArray241[l] & 0xffff);
                }
                return flag;
            }
            for (int k = 0; k < anIntArray289.length; k++) {
                if (anIntArray289[k] == i) {
                    return Model.method266(anIntArray241[k] & 0xffff);
                }
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("22749, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

}
