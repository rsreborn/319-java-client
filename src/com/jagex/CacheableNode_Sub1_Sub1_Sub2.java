package com.jagex;

import com.jagex.cache.configs.SeqConfig;
import com.jagex.cache.configs.LocConfig;
import com.jagex.cache.configs.VarbitConfig;
import com.jagex.sign.Signlink;

public class CacheableNode_Sub1_Sub1_Sub2 extends CacheableNode_Sub1_ {

    public static Game aGame1469;
    public int anInt1459;
    public int anInt1460;
    public int anInt1461;
    public int anInt1462;
    public int anInt1463;
    public int anInt1464;
    public int anInt1465;
    public int anInt1466;
    public int[] anIntArray1467;
    public boolean aBoolean1468;
    public SeqConfig aSeqConfig_1470;
    public int anInt1471;
    public int anInt1472;
    public int anInt1473;
    public int anInt1474;

    public CacheableNode_Sub1_Sub1_Sub2(int i, int j, int k, int l, int i1, int j1, boolean flag,
                                        int k1, int l1, int i2) {
        aBoolean1468 = false;
        anInt1472 = 525;
        try {
            anInt1464 = i2;
            anInt1465 = k1;
            anInt1466 = l;
            anInt1459 = j;
            anInt1460 = j1;
            anInt1461 = k;
            anInt1462 = i;
            if (i1 != -1) {
                aSeqConfig_1470 = SeqConfig.aSeqConfigArray800[i1];
                anInt1463 = 0;
                anInt1471 = Game.pulseCycle;
                if (flag && aSeqConfig_1470.anInt805 != -1) {
                    anInt1463 = (int) (Math.random() * (double) aSeqConfig_1470.anInt801);
                    anInt1471 -= (int) (Math.random() * (double) aSeqConfig_1470.method592(0, anInt1463));
                }
            }
            LocConfig locConfig = LocConfig.readDefinition(anInt1464);
            if (l1 != 29895) {
                aBoolean1468 = !aBoolean1468;
            }
            anInt1473 = locConfig.anInt246;
            anInt1474 = locConfig.anInt257;
            anIntArray1467 = locConfig.anIntArray243;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("49381, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + flag + ", " + k1 + ", " + l1 + ", " + i2 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method256(int i) {
        try {
            i = 97 / i;
            int j = -1;
            if (aSeqConfig_1470 != null) {
                int k = Game.pulseCycle - anInt1471;
                if (k > 100 && aSeqConfig_1470.anInt805 > 0) {
                    k = 100;
                }
                while (k > aSeqConfig_1470.method592(0, anInt1463)) {
                    k -= aSeqConfig_1470.method592(0, anInt1463);
                    anInt1463++;
                    if (anInt1463 < aSeqConfig_1470.anInt801) {
                        continue;
                    }
                    anInt1463 -= aSeqConfig_1470.anInt805;
                    if (anInt1463 >= 0 && anInt1463 < aSeqConfig_1470.anInt801) {
                        continue;
                    }
                    aSeqConfig_1470 = null;
                    break;
                }
                anInt1471 = Game.pulseCycle - k;
                if (aSeqConfig_1470 != null) {
                    j = aSeqConfig_1470.anIntArray802[anInt1463];
                }
            }
            LocConfig locConfig;
            if (anIntArray1467 != null) {
                locConfig = method259(2);
            } else {
                locConfig = LocConfig.readDefinition(anInt1464);
            }
            if (locConfig == null) {
                return null;
            } else {
                Model class13_sub1_sub1_sub4 = locConfig.method419(anInt1465, anInt1466, anInt1459, anInt1460, anInt1461, anInt1462, j);
                return class13_sub1_sub1_sub4;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("43386, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public LocConfig method259(int i) {
        try {
            int j = -1;
            if (i < 2 || i > 2) {
                anInt1472 = -408;
            }
            if (anInt1473 != -1) {
                VarbitConfig varbitConfig = VarbitConfig.aVarbitConfigArray439[anInt1473];
                int k = varbitConfig.anInt441;
                int l = varbitConfig.anInt442;
                int i1 = varbitConfig.anInt443;
                int j1 = Game.anIntArray1271[i1 - l];
                j = aGame1469.anIntArray1149[k] >> l & j1;
            } else if (anInt1474 != -1) {
                j = aGame1469.anIntArray1149[anInt1474];
            }
            if (j < 0 || j >= anIntArray1467.length || anIntArray1467[j] == -1) {
                return null;
            } else {
                return LocConfig.readDefinition(anIntArray1467[j]);
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("90506, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
