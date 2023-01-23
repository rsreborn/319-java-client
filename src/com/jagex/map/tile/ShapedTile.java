package com.jagex.map.tile;

import com.jagex.sign.Signlink;

public class ShapedTile {

    public static int[] anIntArray519 = new int[6];
    public static int[] anIntArray520 = new int[6];
    public static int[] anIntArray521 = new int[6];
    public static int[] anIntArray522 = new int[6];
    public static int[] anIntArray523 = new int[6];
    public static int[] anIntArray524 = {
            1, 0
    };
    public static int[] anIntArray525 = {
            2, 1
    };
    public static int[] anIntArray526 = {
            3, 3
    };
    public static int[][] anIntArrayArray527 = {
            {
                    1, 3, 5, 7
            }, {
            1, 3, 5, 7
    }, {
            1, 3, 5, 7
    }, {
            1, 3, 5, 7, 6
    }, {
            1, 3, 5, 7, 6
    }, {
            1, 3, 5, 7, 6
    }, {
            1, 3, 5, 7, 6
    }, {
            1, 3, 5, 7, 2, 6
    }, {
            1, 3, 5, 7, 2, 8
    }, {
            1, 3, 5, 7, 2, 8
    }, {
            1, 3, 5, 7, 11, 12
    }, {
            1, 3, 5, 7, 11, 12
    }, {
            1, 3, 5, 7, 13, 14
    }
    };
    public static int[][] anIntArrayArray528 = {
            {
                    0, 1, 2, 3, 0, 0, 1, 3
            }, {
            1, 1, 2, 3, 1, 0, 1, 3
    }, {
            0, 1, 2, 3, 1, 0, 1, 3
    }, {
            0, 0, 1, 2, 0, 0, 2, 4, 1, 0,
            4, 3
    }, {
            0, 0, 1, 4, 0, 0, 4, 3, 1, 1,
            2, 4
    }, {
            0, 0, 4, 3, 1, 0, 1, 2, 1, 0,
            2, 4
    }, {
            0, 1, 2, 4, 1, 0, 1, 4, 1, 0,
            4, 3
    }, {
            0, 4, 1, 2, 0, 4, 2, 5, 1, 0,
            4, 5, 1, 0, 5, 3
    }, {
            0, 4, 1, 2, 0, 4, 2, 3, 0, 4,
            3, 5, 1, 0, 4, 5
    }, {
            0, 0, 4, 5, 1, 4, 1, 2, 1, 4,
            2, 3, 1, 4, 3, 5
    }, {
            0, 0, 1, 5, 0, 1, 4, 5, 0, 1,
            2, 4, 1, 0, 5, 3, 1, 5, 4, 3,
            1, 4, 2, 3
    }, {
            1, 0, 1, 5, 1, 1, 4, 5, 1, 1,
            2, 4, 0, 0, 5, 3, 0, 5, 4, 3,
            0, 4, 2, 3
    }, {
            1, 0, 5, 4, 1, 0, 1, 5, 0, 0,
            4, 3, 0, 4, 5, 3, 0, 5, 2, 3,
            0, 1, 2, 5
    }
    };
    public int anInt503;
    public int[] anIntArray504;
    public int[] anIntArray505;
    public int[] anIntArray506;
    public int[] anIntArray507;
    public int[] anIntArray508;
    public int[] anIntArray509;
    public int[] anIntArray510;
    public int[] anIntArray511;
    public int[] anIntArray512;
    public int[] anIntArray513;
    public boolean aBoolean514;
    public int anInt515;
    public int anInt516;
    public int anInt517;
    public int anInt518;

    public ShapedTile(int i, int j, int k, int l, int i1, int j1, int k1,
                      int l1, int i2, int j2, int k2, int l2, int i3, int j3,
                      int k3, int l3, int i4, int j4, boolean flag, int k4) {
        anInt503 = 4;
        aBoolean514 = true;
        try {
            if (!flag) {
                anInt503 = -1;
            }
            if (j4 != i1 || j4 != j || j4 != l3) {
                aBoolean514 = false;
            }
            anInt515 = l1;
            anInt516 = j1;
            anInt517 = i3;
            anInt518 = i;
            char c = '\200';
            int l4 = c / 2;
            int i5 = c / 4;
            int j5 = (c * 3) / 4;
            int[] ai = anIntArrayArray527[l1];
            int k5 = ai.length;
            anIntArray504 = new int[k5];
            anIntArray505 = new int[k5];
            anIntArray506 = new int[k5];
            int[] ai1 = new int[k5];
            int[] ai2 = new int[k5];
            int l5 = j3 * c;
            int i6 = j2 * c;
            for (int j6 = 0; j6 < k5; j6++) {
                int k6 = ai[j6];
                if ((k6 & 1) == 0 && k6 <= 8) {
                    k6 = (k6 - j1 - j1 - 1 & 7) + 1;
                }
                if (k6 > 8 && k6 <= 12) {
                    k6 = (k6 - 9 - j1 & 3) + 9;
                }
                if (k6 > 12 && k6 <= 16) {
                    k6 = (k6 - 13 - j1 & 3) + 13;
                }
                int l6;
                int j7;
                int l7;
                int j8;
                int i9;
                if (k6 == 1) {
                    l6 = l5;
                    j7 = i6;
                    l7 = j4;
                    j8 = k;
                    i9 = l;
                } else if (k6 == 2) {
                    l6 = l5 + l4;
                    j7 = i6;
                    l7 = j4 + i1 >> 1;
                    j8 = k + k2 >> 1;
                    i9 = l + i2 >> 1;
                } else if (k6 == 3) {
                    l6 = l5 + c;
                    j7 = i6;
                    l7 = i1;
                    j8 = k2;
                    i9 = i2;
                } else if (k6 == 4) {
                    l6 = l5 + c;
                    j7 = i6 + l4;
                    l7 = i1 + j >> 1;
                    j8 = k2 + i4 >> 1;
                    i9 = i2 + k3 >> 1;
                } else if (k6 == 5) {
                    l6 = l5 + c;
                    j7 = i6 + c;
                    l7 = j;
                    j8 = i4;
                    i9 = k3;
                } else if (k6 == 6) {
                    l6 = l5 + l4;
                    j7 = i6 + c;
                    l7 = j + l3 >> 1;
                    j8 = i4 + l2 >> 1;
                    i9 = k3 + k4 >> 1;
                } else if (k6 == 7) {
                    l6 = l5;
                    j7 = i6 + c;
                    l7 = l3;
                    j8 = l2;
                    i9 = k4;
                } else if (k6 == 8) {
                    l6 = l5;
                    j7 = i6 + l4;
                    l7 = l3 + j4 >> 1;
                    j8 = l2 + k >> 1;
                    i9 = k4 + l >> 1;
                } else if (k6 == 9) {
                    l6 = l5 + l4;
                    j7 = i6 + i5;
                    l7 = j4 + i1 >> 1;
                    j8 = k + k2 >> 1;
                    i9 = l + i2 >> 1;
                } else if (k6 == 10) {
                    l6 = l5 + j5;
                    j7 = i6 + l4;
                    l7 = i1 + j >> 1;
                    j8 = k2 + i4 >> 1;
                    i9 = i2 + k3 >> 1;
                } else if (k6 == 11) {
                    l6 = l5 + l4;
                    j7 = i6 + j5;
                    l7 = j + l3 >> 1;
                    j8 = i4 + l2 >> 1;
                    i9 = k3 + k4 >> 1;
                } else if (k6 == 12) {
                    l6 = l5 + i5;
                    j7 = i6 + l4;
                    l7 = l3 + j4 >> 1;
                    j8 = l2 + k >> 1;
                    i9 = k4 + l >> 1;
                } else if (k6 == 13) {
                    l6 = l5 + i5;
                    j7 = i6 + i5;
                    l7 = j4;
                    j8 = k;
                    i9 = l;
                } else if (k6 == 14) {
                    l6 = l5 + j5;
                    j7 = i6 + i5;
                    l7 = i1;
                    j8 = k2;
                    i9 = i2;
                } else if (k6 == 15) {
                    l6 = l5 + j5;
                    j7 = i6 + j5;
                    l7 = j;
                    j8 = i4;
                    i9 = k3;
                } else {
                    l6 = l5 + i5;
                    j7 = i6 + j5;
                    l7 = l3;
                    j8 = l2;
                    i9 = k4;
                }
                anIntArray504[j6] = l6;
                anIntArray505[j6] = l7;
                anIntArray506[j6] = j7;
                ai1[j6] = j8;
                ai2[j6] = i9;
            }
            int[] ai3 = anIntArrayArray528[l1];
            int i7 = ai3.length / 4;
            anIntArray510 = new int[i7];
            anIntArray511 = new int[i7];
            anIntArray512 = new int[i7];
            anIntArray507 = new int[i7];
            anIntArray508 = new int[i7];
            anIntArray509 = new int[i7];
            if (k1 != -1) {
                anIntArray513 = new int[i7];
            }
            int k7 = 0;
            for (int i8 = 0; i8 < i7; i8++) {
                int k8 = ai3[k7];
                int j9 = ai3[k7 + 1];
                int l9 = ai3[k7 + 2];
                int i10 = ai3[k7 + 3];
                k7 += 4;
                if (j9 < 4) {
                    j9 = j9 - j1 & 3;
                }
                if (l9 < 4) {
                    l9 = l9 - j1 & 3;
                }
                if (i10 < 4) {
                    i10 = i10 - j1 & 3;
                }
                anIntArray510[i8] = j9;
                anIntArray511[i8] = l9;
                anIntArray512[i8] = i10;
                if (k8 == 0) {
                    anIntArray507[i8] = ai1[j9];
                    anIntArray508[i8] = ai1[l9];
                    anIntArray509[i8] = ai1[i10];
                    if (anIntArray513 != null) {
                        anIntArray513[i8] = -1;
                    }
                } else {
                    anIntArray507[i8] = ai2[j9];
                    anIntArray508[i8] = ai2[l9];
                    anIntArray509[i8] = ai2[i10];
                    if (anIntArray513 != null) {
                        anIntArray513[i8] = k1;
                    }
                }
            }
            int l8 = j4;
            int k9 = i1;
            if (i1 < l8) {
                l8 = i1;
            }
            if (i1 > k9) {
                k9 = i1;
            }
            if (j < l8) {
                l8 = j;
            }
            if (j > k9) {
                k9 = j;
            }
            if (l3 < l8) {
                l8 = l3;
            }
            if (l3 > k9) {
                k9 = l3;
            }
            l8 /= 14;
            k9 /= 14;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("44954, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + i2 + ", " + j2 + ", " + k2 + ", " + l2 + ", " + i3 + ", " + j3 + ", " + k3 + ", " + l3 + ", " + i4 + ", " + j4 + ", " + flag + ", " + k4 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

}
