package com.jagex.sound;

import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;

public class Synthesizer {

    public static int anInt300 = 788;
    public static int[] anIntArray319;
    public static int[] anIntArray320;
    public static int[] anIntArray321;
    public static int[] anIntArray322 = new int[5];
    public static int[] anIntArray323 = new int[5];
    public static int[] anIntArray324 = new int[5];
    public static int[] anIntArray325 = new int[5];
    public static int[] anIntArray326 = new int[5];
    public boolean aBoolean301;
    public Envelope aEnvelope_302;
    public Envelope aEnvelope_303;
    public Envelope aEnvelope_304;
    public Envelope aEnvelope_305;
    public Envelope aEnvelope_306;
    public Envelope aEnvelope_307;
    public Envelope aEnvelope_308;
    public Envelope aEnvelope_309;
    public int[] anIntArray310;
    public int[] anIntArray311;
    public int[] anIntArray312;
    public int anInt313;
    public int anInt314;
    public Filter aFilter_315;
    public Envelope aEnvelope_316;
    public int anInt317;
    public int anInt318;

    public Synthesizer() {
        aBoolean301 = false;
        anIntArray310 = new int[5];
        anIntArray311 = new int[5];
        anIntArray312 = new int[5];
        anInt314 = 100;
        anInt317 = 500;
    }

    public static void method435() {
        anIntArray320 = new int[32768];
        for (int i = 0; i < 32768; i++) {
            if (Math.random() > 0.5D) {
                anIntArray320[i] = 1;
            } else {
                anIntArray320[i] = -1;
            }
        }
        anIntArray321 = new int[32768];
        for (int j = 0; j < 32768; j++) {
            anIntArray321[j] = (int) (Math.sin((double) j / 5215.1903000000002D) * 16384D);
        }
        anIntArray319 = new int[0x35d54];
    }

    public int[] method436(int i, int j) {
        for (int k = 0; k < i; k++) {
            anIntArray319[k] = 0;
        }
        if (j < 10) {
            return anIntArray319;
        }
        double d = (double) i / ((double) j + 0.0D);
        aEnvelope_302.method183((byte) 6);
        aEnvelope_303.method183((byte) 6);
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        if (aEnvelope_304 != null) {
            aEnvelope_304.method183((byte) 6);
            aEnvelope_305.method183((byte) 6);
            l = (int) (((double) (aEnvelope_304.anInt124 - aEnvelope_304.anInt123) * 32.768000000000001D) / d);
            i1 = (int) (((double) aEnvelope_304.anInt123 * 32.768000000000001D) / d);
        }
        int k1 = 0;
        int l1 = 0;
        int i2 = 0;
        if (aEnvelope_306 != null) {
            aEnvelope_306.method183((byte) 6);
            aEnvelope_307.method183((byte) 6);
            k1 = (int) (((double) (aEnvelope_306.anInt124 - aEnvelope_306.anInt123) * 32.768000000000001D) / d);
            l1 = (int) (((double) aEnvelope_306.anInt123 * 32.768000000000001D) / d);
        }
        for (int j2 = 0; j2 < 5; j2++) {
            if (anIntArray310[j2] != 0) {
                anIntArray322[j2] = 0;
                anIntArray323[j2] = (int) ((double) anIntArray312[j2] * d);
                anIntArray324[j2] = (anIntArray310[j2] << 14) / 100;
                anIntArray325[j2] = (int) (((double) (aEnvelope_302.anInt124 - aEnvelope_302.anInt123) * 32.768000000000001D * Math.pow(1.0057929410678534D, anIntArray311[j2])) / d);
                anIntArray326[j2] = (int) (((double) aEnvelope_302.anInt123 * 32.768000000000001D) / d);
            }
        }
        for (int k2 = 0; k2 < i; k2++) {
            int l2 = aEnvelope_302.method184(i, anInt300);
            int j4 = aEnvelope_303.method184(i, anInt300);
            if (aEnvelope_304 != null) {
                int j5 = aEnvelope_304.method184(i, anInt300);
                int j6 = aEnvelope_305.method184(i, anInt300);
                l2 += method437(j1, j6, -534, aEnvelope_304.anInt125) >> 1;
                j1 += (j5 * l >> 16) + i1;
            }
            if (aEnvelope_306 != null) {
                int k5 = aEnvelope_306.method184(i, anInt300);
                int k6 = aEnvelope_307.method184(i, anInt300);
                j4 = j4 * ((method437(i2, k6, -534, aEnvelope_306.anInt125) >> 1) + 32768) >> 15;
                i2 += (k5 * k1 >> 16) + l1;
            }
            for (int l5 = 0; l5 < 5; l5++) {
                if (anIntArray310[l5] != 0) {
                    int l6 = k2 + anIntArray323[l5];
                    if (l6 < i) {
                        anIntArray319[l6] += method437(anIntArray322[l5], j4 * anIntArray324[l5] >> 15, -534, aEnvelope_302.anInt125);
                        anIntArray322[l5] += (l2 * anIntArray325[l5] >> 16) + anIntArray326[l5];
                    }
                }
            }
        }
        if (aEnvelope_308 != null) {
            aEnvelope_308.method183((byte) 6);
            aEnvelope_309.method183((byte) 6);
            int i3 = 0;
            boolean flag = false;
            boolean flag1 = true;
            for (int i7 = 0; i7 < i; i7++) {
                int k7 = aEnvelope_308.method184(i, anInt300);
                int i8 = aEnvelope_309.method184(i, anInt300);
                int k4;
                if (flag1) {
                    k4 = aEnvelope_308.anInt123 + ((aEnvelope_308.anInt124 - aEnvelope_308.anInt123) * k7 >> 8);
                } else {
                    k4 = aEnvelope_308.anInt123 + ((aEnvelope_308.anInt124 - aEnvelope_308.anInt123) * i8 >> 8);
                }
                if ((i3 += 256) >= k4) {
                    i3 = 0;
                    flag1 = !flag1;
                }
                if (flag1) {
                    anIntArray319[i7] = 0;
                }
            }
        }
        if (anInt313 > 0 && anInt314 > 0) {
            int j3 = (int) ((double) anInt313 * d);
            for (int l4 = j3; l4 < i; l4++) {
                anIntArray319[l4] += (anIntArray319[l4 - j3] * anInt314) / 100;
            }
        }
        if (aFilter_315.anIntArray465[0] > 0 || aFilter_315.anIntArray465[1] > 0) {
            aEnvelope_316.method183((byte) 6);
            int k3 = aEnvelope_316.method184(i + 1, anInt300);
            int i5 = aFilter_315.method488(0, 0, (float) k3 / 65536F);
            int i6 = aFilter_315.method488(1, 0, (float) k3 / 65536F);
            if (i >= i5 + i6) {
                int j7 = 0;
                int l7 = i6;
                if (l7 > i - i5) {
                    l7 = i - i5;
                }
                for (; j7 < l7; j7++) {
                    int j8 = (int) ((long) anIntArray319[j7 + i5] * (long) Filter.anInt472 >> 16);
                    for (int k8 = 0; k8 < i5; k8++) {
                        j8 += (int) ((long) anIntArray319[(j7 + i5) - 1 - k8] * (long) Filter.anIntArrayArray470[0][k8] >> 16);
                    }
                    for (int j9 = 0; j9 < j7; j9++) {
                        j8 -= (int) ((long) anIntArray319[j7 - 1 - j9] * (long) Filter.anIntArrayArray470[1][j9] >> 16);
                    }
                    anIntArray319[j7] = j8;
                    k3 = aEnvelope_316.method184(i + 1, anInt300);
                }
                char c = '\200';
                l7 = c;
                do {
                    if (l7 > i - i5) {
                        l7 = i - i5;
                    }
                    for (; j7 < l7; j7++) {
                        int l8 = (int) ((long) anIntArray319[j7 + i5] * (long) Filter.anInt472 >> 16);
                        for (int k9 = 0; k9 < i5; k9++) {
                            l8 += (int) ((long) anIntArray319[(j7 + i5) - 1 - k9] * (long) Filter.anIntArrayArray470[0][k9] >> 16);
                        }
                        for (int i10 = 0; i10 < i6; i10++) {
                            l8 -= (int) ((long) anIntArray319[j7 - 1 - i10] * (long) Filter.anIntArrayArray470[1][i10] >> 16);
                        }
                        anIntArray319[j7] = l8;
                        k3 = aEnvelope_316.method184(i + 1, anInt300);
                    }
                    if (j7 >= i - i5) {
                        break;
                    }
                    i5 = aFilter_315.method488(0, 0, (float) k3 / 65536F);
                    i6 = aFilter_315.method488(1, 0, (float) k3 / 65536F);
                    l7 += c;
                } while (true);
                for (; j7 < i; j7++) {
                    int i9 = 0;
                    for (int l9 = (j7 + i5) - i; l9 < i5; l9++) {
                        i9 += (int) ((long) anIntArray319[(j7 + i5) - 1 - l9] * (long) Filter.anIntArrayArray470[0][l9] >> 16);
                    }
                    for (int j10 = 0; j10 < i6; j10++) {
                        i9 -= (int) ((long) anIntArray319[j7 - 1 - j10] * (long) Filter.anIntArrayArray470[1][j10] >> 16);
                    }
                    anIntArray319[j7] = i9;
                    int l3 = aEnvelope_316.method184(i + 1, anInt300);
                }
            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (anIntArray319[i4] < -32768) {
                anIntArray319[i4] = -32768;
            }
            if (anIntArray319[i4] > 32767) {
                anIntArray319[i4] = 32767;
            }
        }
        return anIntArray319;
    }

    public int method437(int i, int j, int k, int l) {
        try {
            while (k >= 0) {
                aBoolean301 = !aBoolean301;
            }
            if (l == 1) {
                if ((i & 0x7fff) < 16384) {
                    return j;
                } else {
                    return -j;
                }
            }
            if (l == 2) {
                return anIntArray321[i & 0x7fff] * j >> 14;
            }
            if (l == 3) {
                return ((i & 0x7fff) * j >> 14) - j;
            }
            if (l == 4) {
                return anIntArray320[i / 2607 & 0x7fff] * j;
            } else {
                return 0;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("77704, " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method438(Buffer buffer, int i) {
        try {
            aEnvelope_302 = new Envelope();
            aEnvelope_302.method181(buffer, 26421);
            aEnvelope_303 = new Envelope();
            aEnvelope_303.method181(buffer, 26421);
            int j = buffer.readUByte();
            if (j != 0) {
                buffer.position--;
                aEnvelope_304 = new Envelope();
                aEnvelope_304.method181(buffer, 26421);
                aEnvelope_305 = new Envelope();
                aEnvelope_305.method181(buffer, 26421);
            }
            j = buffer.readUByte();
            if (j != 0) {
                buffer.position--;
                aEnvelope_306 = new Envelope();
                aEnvelope_306.method181(buffer, 26421);
                aEnvelope_307 = new Envelope();
                aEnvelope_307.method181(buffer, 26421);
            }
            j = buffer.readUByte();
            if (j != 0) {
                buffer.position--;
                aEnvelope_308 = new Envelope();
                aEnvelope_308.method181(buffer, 26421);
                aEnvelope_309 = new Envelope();
                aEnvelope_309.method181(buffer, 26421);
            }
            for (int k = 0; k < 10; k++) {
                int l = buffer.readUSmart();
                if (l == 0) {
                    break;
                }
                anIntArray310[k] = l;
                anIntArray311[k] = buffer.readSmart();
                anIntArray312[k] = buffer.readUSmart();
            }
            anInt313 = buffer.readUSmart();
            anInt314 = buffer.readUSmart();
            if (i != 26421) {
                throw new NullPointerException();
            } else {
                anInt317 = buffer.readUShortBE();
                anInt318 = buffer.readUShortBE();
                aFilter_315 = new Filter();
                aEnvelope_316 = new Envelope();
                aFilter_315.method489(aEnvelope_316, 40848, buffer);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("20739, " + buffer + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

}
