package com.jagex;

import com.jagex.cache.configs.SpotAnimConfig;
import com.jagex.sign.Signlink;

public class CacheableNode_Sub1_Sub1_Sub3 extends CacheableNode_Sub1_ {

    public SpotAnimConfig aSpotAnimConfig_1475;
    public int anInt1476;
    public int anInt1477;
    public int anInt1478;
    public boolean aBoolean1479;
    public int anInt1480;
    public int anInt1481;
    public int anInt1482;
    public int anInt1483;
    public int anInt1484;

    public CacheableNode_Sub1_Sub1_Sub3(int i, int j, int k, int l, int i1, byte byte0, int j1,
                                        int k1) {
        anInt1476 = -22144;
        aBoolean1479 = false;
        try {
            aSpotAnimConfig_1475 = SpotAnimConfig.aSpotAnimConfigArray685[j];
            anInt1480 = l;
            anInt1481 = k;
            anInt1482 = i1;
            if (byte0 == 6) {
                byte0 = 0;
            } else {
                anInt1476 = -228;
            }
            anInt1483 = j1;
            anInt1484 = i + k1;
            aBoolean1479 = false;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("34394, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + byte0 + ", " + j1 + ", " + k1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method256(int i) {
        try {
            Model class13_sub1_sub1_sub4 = aSpotAnimConfig_1475.method530();
            if (class13_sub1_sub1_sub4 == null) {
                return null;
            }
            int j = aSpotAnimConfig_1475.aSeqConfig_689.anIntArray802[anInt1477];
            Model class13_sub1_sub1_sub4_1 = new Model(false, Class8.method189(j, 19953), 629, class13_sub1_sub1_sub4, true);
            i = 95 / i;
            if (!aBoolean1479) {
                class13_sub1_sub1_sub4_1.method272(true);
                class13_sub1_sub1_sub4_1.method273(j, false);
                class13_sub1_sub1_sub4_1.anIntArrayArray1528 = null;
                class13_sub1_sub1_sub4_1.anIntArrayArray1527 = null;
            }
            if (aSpotAnimConfig_1475.anInt692 != 128 || aSpotAnimConfig_1475.anInt693 != 128) {
                class13_sub1_sub1_sub4_1.method281(aSpotAnimConfig_1475.anInt692, aSpotAnimConfig_1475.anInt692, aSpotAnimConfig_1475.anInt693, (byte) 0);
            }
            if (aSpotAnimConfig_1475.anInt694 != 0) {
                if (aSpotAnimConfig_1475.anInt694 == 90) {
                    class13_sub1_sub1_sub4_1.method276(-32823);
                }
                if (aSpotAnimConfig_1475.anInt694 == 180) {
                    class13_sub1_sub1_sub4_1.method276(-32823);
                    class13_sub1_sub1_sub4_1.method276(-32823);
                }
                if (aSpotAnimConfig_1475.anInt694 == 270) {
                    class13_sub1_sub1_sub4_1.method276(-32823);
                    class13_sub1_sub1_sub4_1.method276(-32823);
                    class13_sub1_sub1_sub4_1.method276(-32823);
                }
            }
            class13_sub1_sub1_sub4_1.method282(64 + aSpotAnimConfig_1475.anInt695, 850 + aSpotAnimConfig_1475.anInt696, -30, -50, -30, true);
            return class13_sub1_sub1_sub4_1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("11505, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method260(byte byte0, int i) {
        try {
            anInt1478 += i;
            if (byte0 != 4) {
                return;
            }
            while (anInt1478 > aSpotAnimConfig_1475.aSeqConfig_689.method592(0, anInt1477)) {
                anInt1478 -= aSpotAnimConfig_1475.aSeqConfig_689.method592(0, anInt1477) + 1;
                anInt1477++;
                if (anInt1477 >= aSpotAnimConfig_1475.aSeqConfig_689.anInt801 && (anInt1477 < 0 || anInt1477 >= aSpotAnimConfig_1475.aSeqConfig_689.anInt801)) {
                    anInt1477 = 0;
                    aBoolean1479 = true;
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("86520, " + byte0 + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
