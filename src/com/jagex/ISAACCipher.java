package com.jagex;

import com.jagex.sign.signlink;

public class ISAACCipher {

    public int anInt145;
    public int anIntArray146[];
    public int anIntArray147[];
    public int anInt148;
    public int anInt149;
    public int anInt150;

    public ISAACCipher(int i, int ai[]) {
        try {
            anIntArray147 = new int[256];
            anIntArray146 = new int[256];
            for (int j = 0; j < ai.length; j++) {
                anIntArray146[j] = ai[j];
            }
            if (i != 0) {
                throw new NullPointerException();
            } else {
                method192();
                return;
            }
        } catch (RuntimeException runtimeException) {
            signlink.reportError("86621, " + i + ", " + ai + ", " + runtimeException.toString());
        }
        throw new RuntimeException();
    }

    public int method190() {
        if (anInt145-- == 0) {
            method191();
            anInt145 = 255;
        }
        return anIntArray146[anInt145];
    }

    public void method191() {
        anInt149 += ++anInt150;
        for (int i = 0; i < 256; i++) {
            int j = anIntArray147[i];
            if ((i & 3) == 0) {
                anInt148 ^= anInt148 << 13;
            } else if ((i & 3) == 1) {
                anInt148 ^= anInt148 >>> 6;
            } else if ((i & 3) == 2) {
                anInt148 ^= anInt148 << 2;
            } else if ((i & 3) == 3) {
                anInt148 ^= anInt148 >>> 16;
            }
            anInt148 += anIntArray147[i + 128 & 0xff];
            int k;
            anIntArray147[i] = k = anIntArray147[(j & 0x3fc) >> 2] + anInt148 + anInt149;
            anIntArray146[i] = anInt149 = anIntArray147[(k >> 8 & 0x3fc) >> 2] + j;
        }
    }

    public void method192() {
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l = i1 = j1 = k1 = l1 = i2 = j2 = k2 = 0x9e3779b9;
        for (int i = 0; i < 4; i++) {
            l ^= i1 << 11;
            k1 += l;
            i1 += j1;
            i1 ^= j1 >>> 2;
            l1 += i1;
            j1 += k1;
            j1 ^= k1 << 8;
            i2 += j1;
            k1 += l1;
            k1 ^= l1 >>> 16;
            j2 += k1;
            l1 += i2;
            l1 ^= i2 << 10;
            k2 += l1;
            i2 += j2;
            i2 ^= j2 >>> 4;
            l += i2;
            j2 += k2;
            j2 ^= k2 << 8;
            i1 += j2;
            k2 += l;
            k2 ^= l >>> 9;
            j1 += k2;
            l += i1;
        }
        for (int j = 0; j < 256; j += 8) {
            l += anIntArray146[j];
            i1 += anIntArray146[j + 1];
            j1 += anIntArray146[j + 2];
            k1 += anIntArray146[j + 3];
            l1 += anIntArray146[j + 4];
            i2 += anIntArray146[j + 5];
            j2 += anIntArray146[j + 6];
            k2 += anIntArray146[j + 7];
            l ^= i1 << 11;
            k1 += l;
            i1 += j1;
            i1 ^= j1 >>> 2;
            l1 += i1;
            j1 += k1;
            j1 ^= k1 << 8;
            i2 += j1;
            k1 += l1;
            k1 ^= l1 >>> 16;
            j2 += k1;
            l1 += i2;
            l1 ^= i2 << 10;
            k2 += l1;
            i2 += j2;
            i2 ^= j2 >>> 4;
            l += i2;
            j2 += k2;
            j2 ^= k2 << 8;
            i1 += j2;
            k2 += l;
            k2 ^= l >>> 9;
            j1 += k2;
            l += i1;
            anIntArray147[j] = l;
            anIntArray147[j + 1] = i1;
            anIntArray147[j + 2] = j1;
            anIntArray147[j + 3] = k1;
            anIntArray147[j + 4] = l1;
            anIntArray147[j + 5] = i2;
            anIntArray147[j + 6] = j2;
            anIntArray147[j + 7] = k2;
        }
        for (int k = 0; k < 256; k += 8) {
            l += anIntArray147[k];
            i1 += anIntArray147[k + 1];
            j1 += anIntArray147[k + 2];
            k1 += anIntArray147[k + 3];
            l1 += anIntArray147[k + 4];
            i2 += anIntArray147[k + 5];
            j2 += anIntArray147[k + 6];
            k2 += anIntArray147[k + 7];
            l ^= i1 << 11;
            k1 += l;
            i1 += j1;
            i1 ^= j1 >>> 2;
            l1 += i1;
            j1 += k1;
            j1 ^= k1 << 8;
            i2 += j1;
            k1 += l1;
            k1 ^= l1 >>> 16;
            j2 += k1;
            l1 += i2;
            l1 ^= i2 << 10;
            k2 += l1;
            i2 += j2;
            i2 ^= j2 >>> 4;
            l += i2;
            j2 += k2;
            j2 ^= k2 << 8;
            i1 += j2;
            k2 += l;
            k2 ^= l >>> 9;
            j1 += k2;
            l += i1;
            anIntArray147[k] = l;
            anIntArray147[k + 1] = i1;
            anIntArray147[k + 2] = j1;
            anIntArray147[k + 3] = k1;
            anIntArray147[k + 4] = l1;
            anIntArray147[k + 5] = i2;
            anIntArray147[k + 6] = j2;
            anIntArray147[k + 7] = k2;
        }
        method191();
        anInt145 = 256;
    }
}
