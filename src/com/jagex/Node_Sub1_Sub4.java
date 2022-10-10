package com.jagex;

import com.jagex.sign.Signlink;

public class Node_Sub1_Sub4 extends Node_Sub1 {

    public static int anInt1417 = 418;
    public static int anInt1418 = 7;
    public static boolean aBoolean1419 = true;
    public static byte aByte1420 = 4;
    public static byte aByte1421 = -40;
    public static int anInt1422;
    public static int[] anIntArray1423;
    public static int anInt1424;
    public static int anInt1425;
    public static int anInt1426;
    public static int anInt1427;
    public static int anInt1428;
    public static int anInt1429;
    public static int anInt1430;
    public static int anInt1431;
    public static int anInt1432;
    public static boolean aBoolean1433;

    public Node_Sub1_Sub4() {
    }

    public static void method351(int i, int[] ai, int j, int k) {
        try {
            anIntArray1423 = ai;
            if (i != 0) {
                aBoolean1419 = !aBoolean1419;
            }
            anInt1424 = k;
            anInt1425 = j;
            method353(k, (byte) -12, j, 0, 0);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("32339, " + i + ", " + ai + ", " + j + ", " + k + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void method352(int i) {
        try {
            anInt1428 = 0;
            anInt1426 = 0;
            anInt1429 = anInt1424;
            anInt1427 = anInt1425;
            anInt1430 = anInt1429 - 1;
            i = 22 / i;
            anInt1431 = anInt1429 / 2;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("39268, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void method353(int i, byte byte0, int j, int k, int l) {
        try {
            if (l < 0) {
                l = 0;
            }
            if (k < 0) {
                k = 0;
            }
            if (i > anInt1424) {
                i = anInt1424;
            }
            if (j > anInt1425) {
                j = anInt1425;
            }
            anInt1428 = l;
            anInt1426 = k;
            anInt1429 = i;
            anInt1427 = j;
            if (byte0 != -12) {
                return;
            } else {
                anInt1430 = anInt1429 - 1;
                anInt1431 = anInt1429 / 2;
                anInt1432 = anInt1427 / 2;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("79222, " + i + ", " + byte0 + ", " + j + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method354(boolean flag) {
        try {
            if (flag) {
                for (int i = 1; i > 0; i++) {
                }
            }
            int j = anInt1424 * anInt1425;
            for (int k = 0; k < j; k++) {
                anIntArray1423[k] = 0;
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("25728, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void method355(int i, int j, int k, int l, int i1, int j1, int k1) {
        try {
            if (j != 0) {
                anInt1418 = -483;
            }
            if (j1 < anInt1428) {
                i -= anInt1428 - j1;
                j1 = anInt1428;
            }
            if (k < anInt1426) {
                l -= anInt1426 - k;
                k = anInt1426;
            }
            if (j1 + i > anInt1429) {
                i = anInt1429 - j1;
            }
            if (k + l > anInt1427) {
                l = anInt1427 - k;
            }
            int l1 = 256 - k1;
            int i2 = (i1 >> 16 & 0xff) * k1;
            int j2 = (i1 >> 8 & 0xff) * k1;
            int k2 = (i1 & 0xff) * k1;
            int k3 = anInt1424 - i;
            int l3 = j1 + k * anInt1424;
            for (int i4 = 0; i4 < l; i4++) {
                for (int j4 = -i; j4 < 0; j4++) {
                    int l2 = (anIntArray1423[l3] >> 16 & 0xff) * l1;
                    int i3 = (anIntArray1423[l3] >> 8 & 0xff) * l1;
                    int j3 = (anIntArray1423[l3] & 0xff) * l1;
                    int k4 = ((i2 + l2 >> 8) << 16) + ((j2 + i3 >> 8) << 8) + (k2 + j3 >> 8);
                    anIntArray1423[l3++] = k4;
                }
                l3 += k3;
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("28521, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void method356(boolean flag, int i, int j, int k, int l, int i1) {
        try {
            if (flag) {
                aBoolean1419 = !aBoolean1419;
            }
            if (i < anInt1428) {
                l -= anInt1428 - i;
                i = anInt1428;
            }
            if (j < anInt1426) {
                i1 -= anInt1426 - j;
                j = anInt1426;
            }
            if (i + l > anInt1429) {
                l = anInt1429 - i;
            }
            if (j + i1 > anInt1427) {
                i1 = anInt1427 - j;
            }
            int j1 = anInt1424 - l;
            int k1 = i + j * anInt1424;
            for (int l1 = -i1; l1 < 0; l1++) {
                for (int i2 = -l; i2 < 0; i2++) {
                    anIntArray1423[k1++] = k;
                }
                k1 += j1;
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("51097, " + flag + ", " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void method357(byte byte0, int i, int j, int k, int l, int i1) {
        try {
            method359((byte) -40, l, j, i, i1);
            method359((byte) -40, l, j, (i + k) - 1, i1);
            if (byte0 != aByte1420) {
                anInt1422 = -196;
            }
            method361(j, k, l, i, -38103);
            method361((j + i1) - 1, k, l, i, -38103);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("48152, " + byte0 + ", " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void method358(int i, int j, boolean flag, int k, int l, int i1, int j1) {
        try {
            method360(l, true, k, i, j, i1);
            method360(l, true, k, i, j, (i1 + j1) - 1);
            if (flag) {
                return;
            }
            if (j1 >= 3) {
                method362(i1 + 1, j1 - 2, j, -4954, k, l);
                method362(i1 + 1, j1 - 2, (j + i) - 1, -4954, k, l);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("67583, " + i + ", " + j + ", " + flag + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public static void method359(byte byte0, int i, int j, int k, int l) {
        try {
            if (byte0 != aByte1421) {
                anInt1417 = -359;
            }
            if (k < anInt1426 || k >= anInt1427) {
                return;
            }
            if (j < anInt1428) {
                l -= anInt1428 - j;
                j = anInt1428;
            }
            if (j + l > anInt1429) {
                l = anInt1429 - j;
            }
            int i1 = j + k * anInt1424;
            for (int j1 = 0; j1 < l; j1++) {
                anIntArray1423[i1 + j1] = i;
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("23797, " + byte0 + ", " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void method360(int i, boolean flag, int j, int k, int l, int i1) {
        try {
            if (i1 < anInt1426 || i1 >= anInt1427) {
                return;
            }
            if (l < anInt1428) {
                k -= anInt1428 - l;
                l = anInt1428;
            }
            if (l + k > anInt1429) {
                k = anInt1429 - l;
            }
            int j1 = 256 - j;
            int k1 = (i >> 16 & 0xff) * j;
            int l1 = (i >> 8 & 0xff) * j;
            int i2 = (i & 0xff) * j;
            if (!flag) {
                return;
            }
            int i3 = l + i1 * anInt1424;
            for (int j3 = 0; j3 < k; j3++) {
                int j2 = (anIntArray1423[i3] >> 16 & 0xff) * j1;
                int k2 = (anIntArray1423[i3] >> 8 & 0xff) * j1;
                int l2 = (anIntArray1423[i3] & 0xff) * j1;
                int k3 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8) + (i2 + l2 >> 8);
                anIntArray1423[i3++] = k3;
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("82292, " + i + ", " + flag + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void method361(int i, int j, int k, int l, int i1) {
        try {
            if (i1 != -38103) {
                aBoolean1419 = !aBoolean1419;
            }
            if (i < anInt1428 || i >= anInt1429) {
                return;
            }
            if (l < anInt1426) {
                j -= anInt1426 - l;
                l = anInt1426;
            }
            if (l + j > anInt1427) {
                j = anInt1427 - l;
            }
            int j1 = i + l * anInt1424;
            for (int k1 = 0; k1 < j; k1++) {
                anIntArray1423[j1 + k1 * anInt1424] = k;
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("37664, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void method362(int i, int j, int k, int l, int i1, int j1) {
        try {
            if (k < anInt1428 || k >= anInt1429) {
                return;
            }
            if (i < anInt1426) {
                j -= anInt1426 - i;
                i = anInt1426;
            }
            if (i + j > anInt1427) {
                j = anInt1427 - i;
            }
            int k1 = 256 - i1;
            int l1 = (j1 >> 16 & 0xff) * i1;
            int i2 = (j1 >> 8 & 0xff) * i1;
            int j2 = (j1 & 0xff) * i1;
            int j3 = k + i * anInt1424;
            for (int k3 = 0; k3 < j; k3++) {
                int k2 = (anIntArray1423[j3] >> 16 & 0xff) * k1;
                int l2 = (anIntArray1423[j3] >> 8 & 0xff) * k1;
                int i3 = (anIntArray1423[j3] & 0xff) * k1;
                int l3 = ((l1 + k2 >> 8) << 16) + ((i2 + l2 >> 8) << 8) + (j2 + i3 >> 8);
                anIntArray1423[j3] = l3;
                j3 += anInt1424;
            }
            if (l != -4954) {
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("29479, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

}
