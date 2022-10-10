package com.jagex;

import com.jagex.sign.Signlink;

public class CacheableNode_Sub1_Sub1_ extends CacheableNode_Sub1_ {

    public double aDouble1434;
    public double aDouble1435;
    public double aDouble1436;
    public double aDouble1437;
    public int anInt1438;
    public int anInt1439;
    public int anInt1440;
    public boolean aBoolean1441;
    public int anInt1442;
    public int anInt1443;
    public int anInt1444;
    public double aDouble1445;
    public Class40 aClass40_1446;
    public double aDouble1447;
    public double aDouble1448;
    public double aDouble1449;
    public int anInt1450;
    public int anInt1451;
    public int anInt1452;
    public int anInt1453;
    public int anInt1454;
    public int anInt1455;
    public int anInt1456;
    public int anInt1457;
    public int anInt1458;

    public CacheableNode_Sub1_Sub1_(int i, int j, int k, int l, int i1, int j1, int k1,
                                    int l1, byte byte0, int i2, int j2, int k2) {
        aBoolean1441 = false;
        try {
            aClass40_1446 = Class40.aClass40Array685[j];
            anInt1442 = l1;
            anInt1455 = j1;
            anInt1456 = k1;
            anInt1457 = k;
            anInt1450 = i;
            anInt1451 = l;
            anInt1438 = i2;
            anInt1439 = k2;
            anInt1440 = j2;
            anInt1458 = i1;
            aBoolean1441 = false;
            if (byte0 != 1) {
                throw new NullPointerException();
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("94871, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + byte0 + ", " + i2 + ", " + j2 + ", " + k2 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method257(int i, int j) {
        try {
            aBoolean1441 = true;
            aDouble1447 += aDouble1434 * (double) i;
            aDouble1448 += aDouble1435 * (double) i;
            aDouble1449 += aDouble1437 * (double) i + 0.5D * aDouble1445 * (double) i * (double) i;
            aDouble1437 += aDouble1445 * (double) i;
            if (j <= 0) {
                return;
            }
            anInt1443 = (int) (Math.atan2(aDouble1434, aDouble1435) * 325.94900000000001D) + 1024 & 0x7ff;
            anInt1444 = (int) (Math.atan2(aDouble1437, aDouble1436) * 325.94900000000001D) & 0x7ff;
            if (aClass40_1446.aClass50_689 != null) {
                for (anInt1453 += i; anInt1453 > aClass40_1446.aClass50_689.method592(0, anInt1452); ) {
                    anInt1453 -= aClass40_1446.aClass50_689.method592(0, anInt1452) + 1;
                    anInt1452++;
                    if (anInt1452 >= aClass40_1446.aClass50_689.anInt801) {
                        anInt1452 = 0;
                    }
                }
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("77757, " + i + ", " + j + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public Model method256(int i) {
        try {
            Model class13_sub1_sub1_sub4 = aClass40_1446.method530();
            if (class13_sub1_sub1_sub4 == null) {
                return null;
            }
            int j = -1;
            if (aClass40_1446.aClass50_689 != null) {
                j = aClass40_1446.aClass50_689.anIntArray802[anInt1452];
            }
            Model class13_sub1_sub1_sub4_1 = new Model(false, Class8.method189(j, 19953), 629, class13_sub1_sub1_sub4, true);
            i = 63 / i;
            if (j != -1) {
                class13_sub1_sub1_sub4_1.method272(true);
                class13_sub1_sub1_sub4_1.method273(j, false);
                class13_sub1_sub1_sub4_1.anIntArrayArray1528 = null;
                class13_sub1_sub1_sub4_1.anIntArrayArray1527 = null;
            }
            if (aClass40_1446.anInt692 != 128 || aClass40_1446.anInt693 != 128) {
                class13_sub1_sub1_sub4_1.method281(aClass40_1446.anInt692, aClass40_1446.anInt692, aClass40_1446.anInt693, (byte) 0);
            }
            class13_sub1_sub1_sub4_1.method277((byte) 76, anInt1444);
            class13_sub1_sub1_sub4_1.method282(64 + aClass40_1446.anInt695, 850 + aClass40_1446.anInt696, -30, -50, -30, true);
            return class13_sub1_sub1_sub4_1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("48721, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method258(int i, int j, int k, int l, int i1) {
        try {
            if (!aBoolean1441) {
                double d = i1 - anInt1455;
                double d2 = k - anInt1456;
                double d3 = Math.sqrt(d * d + d2 * d2);
                aDouble1447 = (double) anInt1455 + (d * (double) anInt1439) / d3;
                aDouble1448 = (double) anInt1456 + (d2 * (double) anInt1439) / d3;
                aDouble1449 = anInt1457;
            }
            double d1 = (anInt1451 + 1) - l;
            if (j != 0) {
                anInt1454 = 239;
            }
            aDouble1434 = ((double) i1 - aDouble1447) / d1;
            aDouble1435 = ((double) k - aDouble1448) / d1;
            aDouble1436 = Math.sqrt(aDouble1434 * aDouble1434 + aDouble1435 * aDouble1435);
            if (!aBoolean1441) {
                aDouble1437 = -aDouble1436 * Math.tan((double) anInt1438 * 0.02454369D);
            }
            aDouble1445 = (2D * ((double) i - aDouble1449 - aDouble1437 * d1)) / (d1 * d1);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("96979, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
