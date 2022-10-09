package com.jagex.compress;

public class Bzip2 {

    public static Bzip2Context context = new Bzip2Context();

    public static int decompressBzip2(byte[] decompressedData, int decompressedLength, byte[] compressedData, int compressedLength, int k) {
        synchronized (context) {
            context.compressedData = compressedData;
            context.nextIn = k;
            context.decompressedData = decompressedData;
            context.anInt87 = 0;
            context.compressedLength = compressedLength;
            context.decompressedLength = decompressedLength;
            context.bsLive = 0;
            context.bsBuff = 0;
            context.totalInLo32 = 0;
            context.anInt85 = 0;
            context.anInt89 = 0;
            context.anInt90 = 0;
            context.anInt97 = 0;
            decompress(context);
            decompressedLength -= context.decompressedLength;
            return decompressedLength;
        }
    }

    public static void method428(Bzip2Context bzip2Context) {
        byte byte4 = bzip2Context.stateOutCh;
        int i = bzip2Context.stateOutLen;
        int j = bzip2Context.nBlockUsed;
        int k = bzip2Context.anInt100;
        int[] ai = Bzip2Context.tt;
        int l = bzip2Context.tPos;
        byte[] abyte0 = bzip2Context.decompressedData;
        int i1 = bzip2Context.anInt87;
        int j1 = bzip2Context.decompressedLength;
        int k1 = j1;
        int l1 = bzip2Context.nBlock + 1;
        label0:
        do {
            if (i > 0) {
                do {
                    if (j1 == 0) {
                        break label0;
                    }
                    if (i == 1) {
                        break;
                    }
                    abyte0[i1] = byte4;
                    i--;
                    i1++;
                    j1--;
                } while (true);
                if (j1 == 0) {
                    i = 1;
                    break;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
            }
            boolean flag = true;
            while (flag) {
                flag = false;
                if (j == l1) {
                    i = 0;
                    break label0;
                }
                byte4 = (byte) k;
                l = ai[l];
                byte byte0 = (byte) (l & 0xff);
                l >>= 8;
                j++;
                if (byte0 != k) {
                    k = byte0;
                    if (j1 == 0) {
                        i = 1;
                    } else {
                        abyte0[i1] = byte4;
                        i1++;
                        j1--;
                        flag = true;
                        continue;
                    }
                    break label0;
                }
                if (j != l1) {
                    continue;
                }
                if (j1 == 0) {
                    i = 1;
                    break label0;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
                flag = true;
            }
            i = 2;
            l = ai[l];
            byte byte1 = (byte) (l & 0xff);
            l >>= 8;
            if (++j != l1) {
                if (byte1 != k) {
                    k = byte1;
                } else {
                    i = 3;
                    l = ai[l];
                    byte byte2 = (byte) (l & 0xff);
                    l >>= 8;
                    if (++j != l1) {
                        if (byte2 != k) {
                            k = byte2;
                        } else {
                            l = ai[l];
                            byte byte3 = (byte) (l & 0xff);
                            l >>= 8;
                            j++;
                            i = (byte3 & 0xff) + 4;
                            l = ai[l];
                            k = (byte) (l & 0xff);
                            l >>= 8;
                            j++;
                        }
                    }
                }
            }
        } while (true);
        int i2 = bzip2Context.anInt89;
        bzip2Context.anInt89 += k1 - j1;
        if (bzip2Context.anInt89 < i2) {
            bzip2Context.anInt90++;
        }
        bzip2Context.stateOutCh = byte4;
        bzip2Context.stateOutLen = i;
        bzip2Context.nBlockUsed = j;
        bzip2Context.anInt100 = k;
        Bzip2Context.tt = ai;
        bzip2Context.tPos = l;
        bzip2Context.decompressedData = abyte0;
        bzip2Context.anInt87 = i1;
        bzip2Context.decompressedLength = j1;
    }

    public static void decompress(Bzip2Context bzip2Context) {
        int gMinLen = 0;
        int[] gLimit = null;
        int[] gBase = null;
        int[] gPerm = null;
        bzip2Context.blockSize100k = 1;
        if (Bzip2Context.tt == null) {
            Bzip2Context.tt = new int[bzip2Context.blockSize100k * 0x186a0];
        }
        boolean run = true;
        while (run) {
            byte uc = getUChar(bzip2Context);
            if (uc == 23) {
                return;
            }
            uc = getUChar(bzip2Context);
            uc = getUChar(bzip2Context);
            uc = getUChar(bzip2Context);
            uc = getUChar(bzip2Context);
            uc = getUChar(bzip2Context);
            bzip2Context.anInt97++;
            uc = getUChar(bzip2Context);
            uc = getUChar(bzip2Context);
            uc = getUChar(bzip2Context);
            uc = getUChar(bzip2Context);
            uc = getBit(bzip2Context);
            bzip2Context.randomisedBlock = uc != 0;
            if (bzip2Context.randomisedBlock) {
                System.out.println("PANIC! RANDOMISED BLOCK!");
            }
            bzip2Context.origPtr = 0;
            uc = getUChar(bzip2Context);
            bzip2Context.origPtr = bzip2Context.origPtr << 8 | uc & 0xff;
            uc = getUChar(bzip2Context);
            bzip2Context.origPtr = bzip2Context.origPtr << 8 | uc & 0xff;
            uc = getUChar(bzip2Context);
            bzip2Context.origPtr = bzip2Context.origPtr << 8 | uc & 0xff;
            for (int i = 0; i < 16; i++) {
                byte bit = getBit(bzip2Context);
                bzip2Context.inUse16[i] = bit == 1;
            }
            for (int i = 0; i < 256; i++) {
                bzip2Context.inUse[i] = false;
            }
            for (int i = 0; i < 16; i++) {
                if (bzip2Context.inUse16[i]) {
                    for (int j = 0; j < 16; j++) {
                        byte bit = getBit(bzip2Context);
                        if (bit == 1) {
                            bzip2Context.inUse[i * 16 + j] = true;
                        }
                    }
                }
            }
            makeMaps(bzip2Context);
            int alphaSize = bzip2Context.nInUse + 2;
            int nGroups = getBits(3, bzip2Context);
            int nSelectors = getBits(15, bzip2Context);
            for (int i = 0; i < nSelectors; i++) {
                int count = 0;
                do {
                    byte bit = getBit(bzip2Context);
                    if (bit == 0) {
                        break;
                    }
                    count++;
                } while (true);
                bzip2Context.selectorMtf[i] = (byte) count;
            }

            byte[] pos = new byte[6];
            for (byte v = 0; v < nGroups; v++) {
                pos[v] = v;
            }
            for (int i = 0; i < nSelectors; i++) {
                byte v = bzip2Context.selectorMtf[i];
                byte temp = pos[v];
                for (; v > 0; v--) {
                    pos[v] = pos[v - 1];
                }
                pos[0] = temp;
                bzip2Context.selector[i] = temp;
            }
            for (int t = 0; t < nGroups; t++) {
                int curr = getBits(5, bzip2Context);
                for (int i = 0; i < alphaSize; i++) {
                    do {
                        byte bit = getBit(bzip2Context);
                        if (bit == 0) {
                            break;
                        }
                        bit = getBit(bzip2Context);
                        if (bit == 0) {
                            curr++;
                        } else {
                            curr--;
                        }
                    } while (true);
                    bzip2Context.lengths[t][i] = (byte) curr;
                }

            }
            for (int t = 0; t < nGroups; t++) {
                byte minLen = 32;
                int maxLen = 0;
                for (int i = 0; i < alphaSize; i++) {
                    if (bzip2Context.lengths[t][i] > maxLen) {
                        maxLen = bzip2Context.lengths[t][i];
                    }
                    if (bzip2Context.lengths[t][i] < minLen) {
                        minLen = bzip2Context.lengths[t][i];
                    }
                }
                method434(bzip2Context.limit[t], bzip2Context.base[t], bzip2Context.perm[t], bzip2Context.lengths[t], minLen, maxLen, alphaSize);
                bzip2Context.minLens[t] = minLen;
            }
            int eob = bzip2Context.nInUse + 1;
            // int l5 = 0x186a0 * bzip2Context.blockSize100k; // unused
            int groupNumber = -1;
            int groupPos = 0;
            for (int i = 0; i <= 255; i++) {
                bzip2Context.unzftab[i] = 0;
            }
            int kk = 4095;
            for (int i = 15; i >= 0; i--) {
                for (int j = 15; j >= 0; j--) {
                    bzip2Context.mtfa[kk] = (byte) (i * 16 + j);
                    kk--;
                }
                bzip2Context.mtfbase[i] = kk + 1;
            }
            int nblock = 0;
            if (groupPos == 0) {
                groupNumber++;
                groupPos = 50;
                byte gSel = bzip2Context.selector[groupNumber];
                gMinLen = bzip2Context.minLens[gSel];
                gLimit = bzip2Context.limit[gSel];
                gPerm = bzip2Context.perm[gSel];
                gBase = bzip2Context.base[gSel];
            }
            groupPos--;
            int zn = gMinLen;
            int zvec;
            byte zj;
            for (zvec = getBits(zn, bzip2Context); zvec > gLimit[zn]; zvec = zvec << 1 | zj) {
                zn++;
                zj = getBit(bzip2Context);
            }
            for (int nextSym = gPerm[zvec - gBase[zn]]; nextSym != eob; ) {
                if (nextSym == 0 || nextSym == 1) {
                    int es = -1;
                    int n = 1;
                    do {
                        if (nextSym == 0) {
                            es += n;
                        } else if (nextSym == 1) {
                            es += 2 * n;
                        }
                        n *= 2;
                        if (groupPos == 0) {
                            groupNumber++;
                            groupPos = 50;
                            byte gSel = bzip2Context.selector[groupNumber];
                            gMinLen = bzip2Context.minLens[gSel];
                            gLimit = bzip2Context.limit[gSel];
                            gPerm = bzip2Context.perm[gSel];
                            gBase = bzip2Context.base[gSel];
                        }
                        groupPos--;
                        int zn_ = gMinLen;
                        int zvec_;
                        byte zj_;
                        for (zvec_ = getBits(zn_, bzip2Context); zvec_ > gLimit[zn_]; zvec_ = zvec_ << 1 | zj_) {
                            zn_++;
                            zj_ = getBit(bzip2Context);
                        }
                        nextSym = gPerm[zvec_ - gBase[zn_]];
                    } while (nextSym == 0 || nextSym == 1);
                    es++;
                    byte ec = bzip2Context.seqToUnseq[bzip2Context.mtfa[bzip2Context.mtfbase[0]] & 0xff];
                    bzip2Context.unzftab[ec & 0xff] += es;
                    for (; es > 0; es--) {
                        Bzip2Context.tt[nblock] = ec & 0xff;
                        nblock++;
                    }
                } else {
                    int nn = nextSym - 1;
                    byte uc_;
                    if (nn < 16) {
                        int nbase = bzip2Context.mtfbase[0];
                        uc_ = bzip2Context.mtfa[nbase + nn];
                        for (; nn > 3; nn -= 4) {
                            int k11 = nbase + nn;
                            bzip2Context.mtfa[k11] = bzip2Context.mtfa[k11 - 1];
                            bzip2Context.mtfa[k11 - 1] = bzip2Context.mtfa[k11 - 2];
                            bzip2Context.mtfa[k11 - 2] = bzip2Context.mtfa[k11 - 3];
                            bzip2Context.mtfa[k11 - 3] = bzip2Context.mtfa[k11 - 4];
                        }
                        for (; nn > 0; nn--) {
                            bzip2Context.mtfa[nbase + nn] = bzip2Context.mtfa[(nbase + nn) - 1];
                        }
                        bzip2Context.mtfa[nbase] = uc_;
                    } else {
                        int l10 = nn / 16;
                        int i11 = nn % 16;
                        int k10 = bzip2Context.mtfbase[l10] + i11;
                        uc_ = bzip2Context.mtfa[k10];
                        for (; k10 > bzip2Context.mtfbase[l10]; k10--) {
                            bzip2Context.mtfa[k10] = bzip2Context.mtfa[k10 - 1];
                        }
                        bzip2Context.mtfbase[l10]++;
                        for (; l10 > 0; l10--) {
                            bzip2Context.mtfbase[l10]--;
                            bzip2Context.mtfa[bzip2Context.mtfbase[l10]] = bzip2Context.mtfa[(bzip2Context.mtfbase[l10 - 1] + 16) - 1];
                        }
                        bzip2Context.mtfbase[0]--;
                        bzip2Context.mtfa[bzip2Context.mtfbase[0]] = uc_;
                        if (bzip2Context.mtfbase[0] == 0) {
                            int i10 = 4095;
                            for (int k9 = 15; k9 >= 0; k9--) {
                                for (int l9 = 15; l9 >= 0; l9--) {
                                    bzip2Context.mtfa[i10] = bzip2Context.mtfa[bzip2Context.mtfbase[k9] + l9];
                                    i10--;
                                }
                                bzip2Context.mtfbase[k9] = i10 + 1;
                            }
                        }
                    }
                    bzip2Context.unzftab[bzip2Context.seqToUnseq[uc_ & 0xff] & 0xff]++;
                    Bzip2Context.tt[nblock] = bzip2Context.seqToUnseq[uc_ & 0xff] & 0xff;
                    nblock++;
                    if (groupPos == 0) {
                        groupNumber++;
                        groupPos = 50;
                        byte byte14 = bzip2Context.selector[groupNumber];
                        gMinLen = bzip2Context.minLens[byte14];
                        gLimit = bzip2Context.limit[byte14];
                        gPerm = bzip2Context.perm[byte14];
                        gBase = bzip2Context.base[byte14];
                    }
                    groupPos--;
                    int k7 = gMinLen;
                    int j8;
                    byte bit;
                    for (j8 = getBits(k7, bzip2Context); j8 > gLimit[k7]; j8 = j8 << 1 | bit) {
                        k7++;
                        bit = getBit(bzip2Context);
                    }
                    nextSym = gPerm[j8 - gBase[k7]];
                }
            }

            bzip2Context.stateOutLen = 0;
            bzip2Context.stateOutCh = 0;
            bzip2Context.cftab[0] = 0;
            for (int i = 1; i <= 256; i++) {
                bzip2Context.cftab[i] = bzip2Context.unzftab[i - 1];
            }
            for (int i = 1; i <= 256; i++) {
                bzip2Context.cftab[i] += bzip2Context.cftab[i - 1];
            }
            for (int i = 0; i < nblock; i++) {
                byte b = (byte) (Bzip2Context.tt[i] & 0xff);
                Bzip2Context.tt[bzip2Context.cftab[b & 0xff]] |= i << 8;
                bzip2Context.cftab[b & 0xff]++;
            }
            bzip2Context.tPos = Bzip2Context.tt[bzip2Context.origPtr] >> 8;
            bzip2Context.nBlockUsed = 0;
            bzip2Context.tPos = Bzip2Context.tt[bzip2Context.tPos];
            bzip2Context.anInt100 = (byte) (bzip2Context.tPos & 0xff);
            bzip2Context.tPos >>= 8;
            bzip2Context.nBlockUsed++;
            bzip2Context.nBlock = nblock;
            method428(bzip2Context);
            run = bzip2Context.nBlockUsed == bzip2Context.nBlock + 1 && bzip2Context.stateOutLen == 0;
        }
    }

    public static byte getUChar(Bzip2Context bzip2Context) {
        return (byte) getBits(8, bzip2Context);
    }

    public static byte getBit(Bzip2Context bzip2Context) {
        return (byte) getBits(1, bzip2Context);
    }

    public static int getBits(int bitCount, Bzip2Context bzip2Context) {
        int j;
        do {
            if (bzip2Context.bsLive >= bitCount) {
                int k = bzip2Context.bsBuff >> bzip2Context.bsLive - bitCount & (1 << bitCount) - 1;
                bzip2Context.bsLive -= bitCount;
                j = k;
                break;
            }
            bzip2Context.bsBuff = bzip2Context.bsBuff << 8 | bzip2Context.compressedData[bzip2Context.nextIn] & 0xff;
            bzip2Context.bsLive += 8;
            bzip2Context.nextIn++;
            bzip2Context.compressedLength--;
            bzip2Context.totalInLo32++;
            if (bzip2Context.totalInLo32 == 0) {
                bzip2Context.anInt85++;
            }
        } while (true);
        return j;
    }

    public static void makeMaps(Bzip2Context bzip2Context) {
        bzip2Context.nInUse = 0;
        for (int i = 0; i < 256; i++) {
            if (bzip2Context.inUse[i]) {
                bzip2Context.seqToUnseq[bzip2Context.nInUse] = (byte) i;
                bzip2Context.nInUse++;
            }
        }
    }

    public static void method434(int[] ai, int[] ai1, int[] ai2, byte[] abyte0, int i, int j, int k) {
        int l = 0;
        for (int i1 = i; i1 <= j; i1++) {
            for (int l2 = 0; l2 < k; l2++) {
                if (abyte0[l2] == i1) {
                    ai2[l] = l2;
                    l++;
                }
            }
        }
        for (int j1 = 0; j1 < 23; j1++) {
            ai1[j1] = 0;
        }
        for (int k1 = 0; k1 < k; k1++) {
            ai1[abyte0[k1] + 1]++;
        }
        for (int l1 = 1; l1 < 23; l1++) {
            ai1[l1] += ai1[l1 - 1];
        }
        for (int i2 = 0; i2 < 23; i2++) {
            ai[i2] = 0;
        }
        int i3 = 0;
        for (int j2 = i; j2 <= j; j2++) {
            i3 += ai1[j2 + 1] - ai1[j2];
            ai[j2] = i3 - 1;
            i3 <<= 1;
        }
        for (int k2 = i + 1; k2 <= j; k2++) {
            ai1[k2] = (ai[k2 - 1] + 1 << 1) - ai1[k2];
        }
    }

}
