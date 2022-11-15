package com.jagex;

public class ISAACCipher {

    public static final int GOLDEN_RATIO = 0x9e3779b9;

    public int count;
    public int[] rsl;
    public int[] mem;
    public int accumulator;
    public int result;
    public int counter;

    public ISAACCipher(int[] seed) {
        mem = new int[256];
        rsl = new int[256];
        System.arraycopy(seed, 0, rsl, 0, seed.length);
        init();
    }

    public int nextInt() {
        if (count-- == 0) {
            isaac();
            count = 255;
        }
        return rsl[count];
    }

    public void isaac() {
        result += ++counter;
        for (int i = 0; i < 256; i++) {
            int j = mem[i];
            if ((i & 3) == 0) {
                accumulator ^= accumulator << 13;
            } else if ((i & 3) == 1) {
                accumulator ^= accumulator >>> 6;
            } else if ((i & 3) == 2) {
                accumulator ^= accumulator << 2;
            } else if ((i & 3) == 3) {
                accumulator ^= accumulator >>> 16;
            }
            accumulator += mem[i + 128 & 0xff];
            int k;
            mem[i] = k = mem[(j & 0x3fc) >> 2] + accumulator + result;
            rsl[i] = result = mem[(k >> 8 & 0x3fc) >> 2] + j;
        }
    }

    public void init() {
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l = i1 = j1 = k1 = l1 = i2 = j2 = k2 = GOLDEN_RATIO;
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
            l += rsl[j];
            i1 += rsl[j + 1];
            j1 += rsl[j + 2];
            k1 += rsl[j + 3];
            l1 += rsl[j + 4];
            i2 += rsl[j + 5];
            j2 += rsl[j + 6];
            k2 += rsl[j + 7];
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
            mem[j] = l;
            mem[j + 1] = i1;
            mem[j + 2] = j1;
            mem[j + 3] = k1;
            mem[j + 4] = l1;
            mem[j + 5] = i2;
            mem[j + 6] = j2;
            mem[j + 7] = k2;
        }
        for (int k = 0; k < 256; k += 8) {
            l += mem[k];
            i1 += mem[k + 1];
            j1 += mem[k + 2];
            k1 += mem[k + 3];
            l1 += mem[k + 4];
            i2 += mem[k + 5];
            j2 += mem[k + 6];
            k2 += mem[k + 7];
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
            mem[k] = l;
            mem[k + 1] = i1;
            mem[k + 2] = j1;
            mem[k + 3] = k1;
            mem[k + 4] = l1;
            mem[k + 5] = i2;
            mem[k + 6] = j2;
            mem[k + 7] = k2;
        }
        isaac();
        count = 256;
    }
}
