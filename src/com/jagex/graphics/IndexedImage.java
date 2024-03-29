package com.jagex.graphics;

import com.jagex.cache.CacheArchive;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;

public class IndexedImage extends Rasterizer {

    public int anInt1662;
    public boolean aBoolean1663;
    public boolean aBoolean1664;
    public byte aByte1665;
    public int anInt1666;
    public byte[] aByteArray1667;
    public int[] anIntArray1668;
    public int anInt1669;
    public int anInt1670;
    public int anInt1671;
    public int anInt1672;
    public int anInt1673;
    public int anInt1674;

    public IndexedImage(CacheArchive cacheArchive, String s, int i) {
        anInt1662 = -16631;
        aBoolean1663 = true;
        aBoolean1664 = false;
        aByte1665 = 6;
        anInt1666 = 809;
        Buffer buffer = new Buffer(cacheArchive.readFile(s + ".dat", null));
        Buffer class13_sub1_sub2_1 = new Buffer(cacheArchive.readFile("index.dat", null));
        class13_sub1_sub2_1.position = buffer.readUShortBE();
        anInt1673 = class13_sub1_sub2_1.readUShortBE();
        anInt1674 = class13_sub1_sub2_1.readUShortBE();
        int j = class13_sub1_sub2_1.readUByte();
        anIntArray1668 = new int[j];
        for (int k = 0; k < j - 1; k++) {
            anIntArray1668[k + 1] = class13_sub1_sub2_1.readMediumBE();
        }
        for (int l = 0; l < i; l++) {
            class13_sub1_sub2_1.position += 2;
            buffer.position += class13_sub1_sub2_1.readUShortBE() * class13_sub1_sub2_1.readUShortBE();
            class13_sub1_sub2_1.position++;
        }
        anInt1671 = class13_sub1_sub2_1.readUByte();
        anInt1672 = class13_sub1_sub2_1.readUByte();
        anInt1669 = class13_sub1_sub2_1.readUShortBE();
        anInt1670 = class13_sub1_sub2_1.readUShortBE();
        int i1 = class13_sub1_sub2_1.readUByte();
        int j1 = anInt1669 * anInt1670;
        aByteArray1667 = new byte[j1];
        if (i1 == 0) {
            for (int k1 = 0; k1 < j1; k1++) {
                aByteArray1667[k1] = buffer.readByte();
            }
            return;
        }
        if (i1 == 1) {
            for (int l1 = 0; l1 < anInt1669; l1++) {
                for (int i2 = 0; i2 < anInt1670; i2++) {
                    aByteArray1667[l1 + i2 * anInt1669] = buffer.readByte();
                }
            }
        }
    }

    public void method396(boolean flag) {
        try {
            anInt1673 /= 2;
            anInt1674 /= 2;
            byte[] abyte0 = new byte[anInt1673 * anInt1674];
            int i = 0;
            for (int j = 0; j < anInt1670; j++) {
                for (int k = 0; k < anInt1669; k++) {
                    abyte0[(k + anInt1671 >> 1) + (j + anInt1672 >> 1) * anInt1673] = aByteArray1667[i++];
                }
            }
            if (!flag) {
                aBoolean1664 = !aBoolean1664;
            }
            aByteArray1667 = abyte0;
            anInt1669 = anInt1673;
            anInt1670 = anInt1674;
            anInt1671 = 0;
            anInt1672 = 0;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("29262, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method397(int i) {
        try {
            if (anInt1669 == anInt1673 && anInt1670 == anInt1674) {
                return;
            }
            byte[] abyte0 = new byte[anInt1673 * anInt1674];
            int j = 0;
            for (int k = 0; k < anInt1670; k++) {
                for (int l = 0; l < anInt1669; l++) {
                    abyte0[l + anInt1671 + (k + anInt1672) * anInt1673] = aByteArray1667[j++];
                }
            }
            i = 92 / i;
            aByteArray1667 = abyte0;
            anInt1669 = anInt1673;
            anInt1670 = anInt1674;
            anInt1671 = 0;
            anInt1672 = 0;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("83641, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void flipHorizontal() {
        byte[] abyte0 = new byte[anInt1669 * anInt1670];
        int i = 0;
        for (int j = 0; j < anInt1670; j++) {
            for (int k = anInt1669 - 1; k >= 0; k--) {
                abyte0[i++] = aByteArray1667[k + j * anInt1669];
            }
        }
        aByteArray1667 = abyte0;
        anInt1671 = anInt1673 - anInt1669 - anInt1671;
    }

    public void flipVertical() {
        byte[] abyte0 = new byte[anInt1669 * anInt1670];
        int j = 0;
        for (int k = anInt1670 - 1; k >= 0; k--) {
            for (int l = 0; l < anInt1669; l++) {
                abyte0[j++] = aByteArray1667[l + k * anInt1669];
            }
        }
        aByteArray1667 = abyte0;
        anInt1672 = anInt1674 - anInt1670 - anInt1672;
    }

    public void method400(int i, int j, byte byte0, int k) {
        for (int l = 0; l < anIntArray1668.length; l++) {
            int i1 = anIntArray1668[l] >> 16 & 0xff;
            i1 += j;
            if (i1 < 0) {
                i1 = 0;
            } else if (i1 > 255) {
                i1 = 255;
            }
            int j1 = anIntArray1668[l] >> 8 & 0xff;
            j1 += i;
            if (j1 < 0) {
                j1 = 0;
            } else if (j1 > 255) {
                j1 = 255;
            }
            int k1 = anIntArray1668[l] & 0xff;
            k1 += k;
            if (k1 < 0) {
                k1 = 0;
            } else if (k1 > 255) {
                k1 = 255;
            }
            anIntArray1668[l] = (i1 << 16) + (j1 << 8) + k1;
        }
    }

    public void method401(int i, int j) {
        j += anInt1671;
        i += anInt1672;
        int k = j + i * Rasterizer.width;
        int l = 0;
        int i1 = anInt1670;
        int j1 = anInt1669;
        int k1 = Rasterizer.width - j1;
        int l1 = 0;
        if (i < Rasterizer.anInt1426) {
            int i2 = Rasterizer.anInt1426 - i;
            i1 -= i2;
            i = Rasterizer.anInt1426;
            l += i2 * j1;
            k += i2 * Rasterizer.width;
        }
        if (i + i1 > Rasterizer.anInt1427) {
            i1 -= (i + i1) - Rasterizer.anInt1427;
        }
        if (j < Rasterizer.anInt1428) {
            int j2 = Rasterizer.anInt1428 - j;
            j1 -= j2;
            j = Rasterizer.anInt1428;
            l += j2;
            k += j2;
            l1 += j2;
            k1 += j2;
        }
        if (j + j1 > Rasterizer.anInt1429) {
            int k2 = (j + j1) - Rasterizer.anInt1429;
            j1 -= k2;
            l1 += k2;
            k1 += k2;
        }
        if (j1 <= 0 || i1 <= 0) {
            return;
        } else {
            method402(l, (byte) 114, j1, l1, aByteArray1667, k1, k, Rasterizer.pixels, anIntArray1668, i1);
            return;
        }
    }

    public void method402(int i, byte byte0, int j, int k, byte[] abyte0, int l, int i1,
                          int[] ai, int[] ai1, int j1) {
        try {
            int k1 = -(j >> 2);
            j = -(j & 3);
            for (int l1 = -j1; l1 < 0; l1++) {
                for (int i2 = k1; i2 < 0; i2++) {
                    byte byte1 = abyte0[i++];
                    if (byte1 != 0) {
                        ai[i1++] = ai1[byte1 & 0xff];
                    } else {
                        i1++;
                    }
                    byte1 = abyte0[i++];
                    if (byte1 != 0) {
                        ai[i1++] = ai1[byte1 & 0xff];
                    } else {
                        i1++;
                    }
                    byte1 = abyte0[i++];
                    if (byte1 != 0) {
                        ai[i1++] = ai1[byte1 & 0xff];
                    } else {
                        i1++;
                    }
                    byte1 = abyte0[i++];
                    if (byte1 != 0) {
                        ai[i1++] = ai1[byte1 & 0xff];
                    } else {
                        i1++;
                    }
                }
                for (int k2 = j; k2 < 0; k2++) {
                    byte byte2 = abyte0[i++];
                    if (byte2 != 0) {
                        ai[i1++] = ai1[byte2 & 0xff];
                    } else {
                        i1++;
                    }
                }
                i1 += l;
                i += k;
            }
            if (byte0 != 114) {
                for (int j2 = 1; j2 > 0; j2++) {
                }
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("80004, " + i + ", " + byte0 + ", " + j + ", " + k + ", " + abyte0 + ", " + l + ", " + i1 + ", " + ai + ", " + ai1 + ", " + j1 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }
}
