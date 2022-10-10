package com.jagex;

import com.jagex.cache.CacheArchive;
import com.jagex.sign.Signlink;

import java.util.Random;

public class Font extends Node_Sub1_Sub4 {

    public int anInt1648;
    public int anInt1649;
    public int anInt1650;
    public int anInt1651;
    public boolean aBoolean1652;
    public byte[][] aByteArrayArray1653;
    public int[] anIntArray1654;
    public int[] anIntArray1655;
    public int[] anIntArray1656;
    public int[] anIntArray1657;
    public int[] anIntArray1658;
    public int anInt1659;
    public Random aRandom1660;
    public boolean aBoolean1661;

    public Font(String s, CacheArchive cacheArchive, boolean flag, int i) {
        anInt1648 = -40024;
        anInt1649 = 6;
        aBoolean1652 = false;
        aByteArrayArray1653 = new byte[256][];
        anIntArray1654 = new int[256];
        anIntArray1655 = new int[256];
        anIntArray1656 = new int[256];
        anIntArray1657 = new int[256];
        anIntArray1658 = new int[256];
        aRandom1660 = new Random();
        aBoolean1661 = false;
        try {
            Buffer buffer = new Buffer(cacheArchive.readFile(s + ".dat", null));
            Buffer class13_sub1_sub2_1 = new Buffer(cacheArchive.readFile("index.dat", null));
            byte byte0 = -1;
            class13_sub1_sub2_1.position = buffer.readUnsignedShort() + 4;
            int k = class13_sub1_sub2_1.readUnsignedByte();
            if (i != anInt1649) {
                throw new NullPointerException();
            }
            if (k > 0) {
                class13_sub1_sub2_1.position += 3 * (k - 1);
            }
            for (int l = 0; l < 256; l++) {
                int j = l;
                anIntArray1656[l] = class13_sub1_sub2_1.readUnsignedByte();
                anIntArray1657[l] = class13_sub1_sub2_1.readUnsignedByte();
                int i1 = anIntArray1654[l] = class13_sub1_sub2_1.readUnsignedShort();
                int j1 = anIntArray1655[l] = class13_sub1_sub2_1.readUnsignedShort();
                int k1 = class13_sub1_sub2_1.readUnsignedByte();
                int l1 = i1 * j1;
                aByteArrayArray1653[l] = new byte[l1];
                if (k1 == 0) {
                    for (int i2 = 0; i2 < l1; i2++) {
                        aByteArrayArray1653[l][i2] = buffer.readByte();
                    }
                } else if (k1 == 1) {
                    for (int j2 = 0; j2 < i1; j2++) {
                        for (int l2 = 0; l2 < j1; l2++) {
                            aByteArrayArray1653[l][j2 + l2 * i1] = buffer.readByte();
                        }
                    }
                }
                if (j1 > anInt1659 && l < 128) {
                    anInt1659 = j1;
                }
                anIntArray1656[l] = 1;
                anIntArray1658[l] = i1 + 2;
                int k2 = 0;
                for (int i3 = j1 / 7; i3 < j1; i3++) {
                    k2 += aByteArrayArray1653[l][i3 * i1];
                }
                if (k2 <= j1 / 7) {
                    anIntArray1658[l]--;
                    anIntArray1656[l] = 0;
                }
                k2 = 0;
                for (int j3 = j1 / 7; j3 < j1; j3++) {
                    k2 += aByteArrayArray1653[l][(i1 - 1) + j3 * i1];
                }
                if (k2 <= j1 / 7) {
                    anIntArray1658[l]--;
                }
            }
            if (flag) {
                anIntArray1658[32] = anIntArray1658[73];
                return;
            } else {
                anIntArray1658[32] = anIntArray1658[105];
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("91897, " + s + ", " + cacheArchive + ", " + flag + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method380(int i, boolean flag, String s, int j, int k) {
        try {
            if (flag) {
                for (int l = 1; l > 0; l++) {
                }
            }
            method385((byte) -96, s, k, j - method384(s, 0), i);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("82776, " + i + ", " + flag + ", " + s + ", " + j + ", " + k + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method381(int i, int j, int k, int l, String s) {
        try {
            method385((byte) -96, s, j, i - method384(s, 0) / 2, l);
            if (k < 6 || k > 6) {
                anInt1648 = -373;
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("91627, " + i + ", " + j + ", " + k + ", " + l + ", " + s + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method382(int i, boolean flag, String s, int j, int k, boolean flag1) {
        try {
            if (flag1) {
                for (int l = 1; l > 0; l++) {
                }
            }
            method389(flag, i - method383(3, s) / 2, (byte) 8, j, k, s);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("84269, " + i + ", " + flag + ", " + s + ", " + j + ", " + k + ", " + flag1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int method383(int i, String s) {
        try {
            if (i != 3) {
                for (int j = 1; j > 0; j++) {
                }
            }
            if (s == null) {
                return 0;
            }
            int k = 0;
            for (int l = 0; l < s.length(); l++) {
                if (s.charAt(l) == '@' && l + 4 < s.length() && s.charAt(l + 4) == '@') {
                    l += 4;
                } else {
                    k += anIntArray1658[s.charAt(l)];
                }
            }
            return k;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("71598, " + i + ", " + s + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int method384(String s, int i) {
        try {
            if (i != 0) {
                anInt1649 = -202;
            }
            if (s == null) {
                return 0;
            }
            int j = 0;
            for (int k = 0; k < s.length(); k++) {
                j += anIntArray1658[s.charAt(k)];
            }
            return j;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("10623, " + s + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method385(byte byte0, String s, int i, int j, int k) {
        try {
            if (s == null) {
                return;
            }
            k -= anInt1659;
            if (byte0 != -96) {
                return;
            }
            for (int l = 0; l < s.length(); l++) {
                char c = s.charAt(l);
                if (c != ' ') {
                    method392(aByteArrayArray1653[c], j + anIntArray1656[c], k + anIntArray1657[c], anIntArray1654[c], anIntArray1655[c], i);
                }
                j += anIntArray1658[c];
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("36940, " + byte0 + ", " + s + ", " + i + ", " + j + ", " + k + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method386(int i, int j, int k, int l, int i1, String s) {
        try {
            if (s == null) {
                return;
            }
            i1 -= method384(s, 0) / 2;
            i -= anInt1659;
            while (k >= 0) {
                anInt1649 = -458;
            }
            for (int j1 = 0; j1 < s.length(); j1++) {
                char c = s.charAt(j1);
                if (c != ' ') {
                    method392(aByteArrayArray1653[c], i1 + anIntArray1656[c], i + anIntArray1657[c] + (int) (Math.sin((double) j1 / 2D + (double) l / 5D) * 5D), anIntArray1654[c], anIntArray1655[c], j);
                }
                i1 += anIntArray1658[c];
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("95818, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + s + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method387(int i, int j, String s, int k, int l, int i1) {
        try {
            if (s == null) {
                return;
            }
            i1 -= method384(s, 0) / 2;
            i -= anInt1659;
            for (int j1 = 0; j1 < s.length(); j1++) {
                char c = s.charAt(j1);
                if (c != ' ') {
                    method392(aByteArrayArray1653[c], i1 + anIntArray1656[c] + (int) (Math.sin((double) j1 / 5D + (double) k / 5D) * 5D), i + anIntArray1657[c] + (int) (Math.sin((double) j1 / 3D + (double) k / 5D) * 5D), anIntArray1654[c], anIntArray1655[c], l);
                }
                i1 += anIntArray1658[c];
            }
            if (j != -11986) {
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("53445, " + i + ", " + j + ", " + s + ", " + k + ", " + l + ", " + i1 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method388(int i, String s, int j, int k, int l, int i1, int j1) {
        try {
            j = 76 / j;
            if (s == null) {
                return;
            }
            double d = 7D - (double) i / 8D;
            if (d < 0.0D) {
                d = 0.0D;
            }
            k -= method384(s, 0) / 2;
            l -= anInt1659;
            for (int k1 = 0; k1 < s.length(); k1++) {
                char c = s.charAt(k1);
                if (c != ' ') {
                    method392(aByteArrayArray1653[c], k + anIntArray1656[c], l + anIntArray1657[c] + (int) (Math.sin((double) k1 / 1.5D + (double) i1) * d), anIntArray1654[c], anIntArray1655[c], j1);
                }
                k += anIntArray1658[c];
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("78800, " + i + ", " + s + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method389(boolean flag, int i, byte byte0, int j, int k, String s) {
        try {
            aBoolean1661 = false;
            int l = i;
            if (s == null) {
                return;
            }
            j -= anInt1659;
            if (byte0 != 8) {
                aBoolean1652 = !aBoolean1652;
            }
            for (int i1 = 0; i1 < s.length(); i1++) {
                if (s.charAt(i1) == '@' && i1 + 4 < s.length() && s.charAt(i1 + 4) == '@') {
                    int j1 = method391(anInt1650, s.substring(i1 + 1, i1 + 4));
                    if (j1 != -1) {
                        k = j1;
                    }
                    i1 += 4;
                } else {
                    char c = s.charAt(i1);
                    if (c != ' ') {
                        if (flag) {
                            method392(aByteArrayArray1653[c], i + anIntArray1656[c] + 1, j + anIntArray1657[c] + 1, anIntArray1654[c], anIntArray1655[c], 0);
                        }
                        method392(aByteArrayArray1653[c], i + anIntArray1656[c], j + anIntArray1657[c], anIntArray1654[c], anIntArray1655[c], k);
                    }
                    i += anIntArray1658[c];
                }
            }
            if (aBoolean1661) {
                Node_Sub1_Sub4.method359((byte) -40, 0x800000, l, j + (int) ((double) anInt1659 * 0.69999999999999996D), i - l);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("12006, " + flag + ", " + i + ", " + byte0 + ", " + j + ", " + k + ", " + s + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method390(boolean flag, int i, int j, int k, int l, String s, int i1) {
        try {
            if (s == null) {
                return;
            }
            aRandom1660.setSeed(i1);
            int j1 = 192 + (aRandom1660.nextInt() & 0x1f);
            j -= anInt1659;
            for (int k1 = 0; k1 < s.length(); k1++) {
                if (s.charAt(k1) == '@' && k1 + 4 < s.length() && s.charAt(k1 + 4) == '@') {
                    int l1 = method391(anInt1650, s.substring(k1 + 1, k1 + 4));
                    if (l1 != -1) {
                        i = l1;
                    }
                    k1 += 4;
                } else {
                    char c = s.charAt(k1);
                    if (c != ' ') {
                        if (flag) {
                            method394(0, l + anIntArray1656[c] + 1, (byte) 9, anIntArray1654[c], j + anIntArray1657[c] + 1, aByteArrayArray1653[c], 192, anIntArray1655[c]);
                        }
                        method394(i, l + anIntArray1656[c], (byte) 9, anIntArray1654[c], j + anIntArray1657[c], aByteArrayArray1653[c], j1, anIntArray1655[c]);
                    }
                    l += anIntArray1658[c];
                    if ((aRandom1660.nextInt() & 3) == 0) {
                        l++;
                    }
                }
            }
            if (k <= 0) {
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("10204, " + flag + ", " + i + ", " + j + ", " + k + ", " + l + ", " + s + ", " + i1 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public int method391(int i, String s) {
        try {
            if (i != 0) {
                anInt1651 = 139;
            }
            if (s.equals("red")) {
                return 0xff0000;
            }
            if (s.equals("gre")) {
                return 65280;
            }
            if (s.equals("blu")) {
                return 255;
            }
            if (s.equals("yel")) {
                return 0xffff00;
            }
            if (s.equals("cya")) {
                return 65535;
            }
            if (s.equals("mag")) {
                return 0xff00ff;
            }
            if (s.equals("whi")) {
                return 0xffffff;
            }
            if (s.equals("bla")) {
                return 0;
            }
            if (s.equals("lre")) {
                return 0xff9040;
            }
            if (s.equals("dre")) {
                return 0x800000;
            }
            if (s.equals("dbl")) {
                return 128;
            }
            if (s.equals("or1")) {
                return 0xffb000;
            }
            if (s.equals("or2")) {
                return 0xff7000;
            }
            if (s.equals("or3")) {
                return 0xff3000;
            }
            if (s.equals("gr1")) {
                return 0xc0ff00;
            }
            if (s.equals("gr2")) {
                return 0x80ff00;
            }
            if (s.equals("gr3")) {
                return 0x40ff00;
            }
            if (s.equals("str")) {
                aBoolean1661 = true;
            }
            if (s.equals("end")) {
                aBoolean1661 = false;
            }
            return -1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("44527, " + i + ", " + s + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method392(byte[] abyte0, int i, int j, int k, int l, int i1) {
        int j1 = i + j * Node_Sub1_Sub4.anInt1424;
        int k1 = Node_Sub1_Sub4.anInt1424 - k;
        int l1 = 0;
        int i2 = 0;
        if (j < Node_Sub1_Sub4.anInt1426) {
            int j2 = Node_Sub1_Sub4.anInt1426 - j;
            l -= j2;
            j = Node_Sub1_Sub4.anInt1426;
            i2 += j2 * k;
            j1 += j2 * Node_Sub1_Sub4.anInt1424;
        }
        if (j + l >= Node_Sub1_Sub4.anInt1427) {
            l -= ((j + l) - Node_Sub1_Sub4.anInt1427) + 1;
        }
        if (i < Node_Sub1_Sub4.anInt1428) {
            int k2 = Node_Sub1_Sub4.anInt1428 - i;
            k -= k2;
            i = Node_Sub1_Sub4.anInt1428;
            i2 += k2;
            j1 += k2;
            l1 += k2;
            k1 += k2;
        }
        if (i + k >= Node_Sub1_Sub4.anInt1429) {
            int l2 = ((i + k) - Node_Sub1_Sub4.anInt1429) + 1;
            k -= l2;
            l1 += l2;
            k1 += l2;
        }
        if (k <= 0 || l <= 0) {
            return;
        } else {
            method393(Node_Sub1_Sub4.anIntArray1423, abyte0, i1, i2, j1, k, l, k1, l1);
            return;
        }
    }

    public void method393(int[] ai, byte[] abyte0, int i, int j, int k, int l, int i1,
                          int j1, int k1) {
        int l1 = -(l >> 2);
        l = -(l & 3);
        for (int i2 = -i1; i2 < 0; i2++) {
            for (int j2 = l1; j2 < 0; j2++) {
                if (abyte0[j++] != 0) {
                    ai[k++] = i;
                } else {
                    k++;
                }
                if (abyte0[j++] != 0) {
                    ai[k++] = i;
                } else {
                    k++;
                }
                if (abyte0[j++] != 0) {
                    ai[k++] = i;
                } else {
                    k++;
                }
                if (abyte0[j++] != 0) {
                    ai[k++] = i;
                } else {
                    k++;
                }
            }
            for (int k2 = l; k2 < 0; k2++) {
                if (abyte0[j++] != 0) {
                    ai[k++] = i;
                } else {
                    k++;
                }
            }
            k += j1;
            j += k1;
        }
    }

    public void method394(int i, int j, byte byte0, int k, int l, byte[] abyte0, int i1,
                          int j1) {
        try {
            int k1 = j + l * Node_Sub1_Sub4.anInt1424;
            int l1 = Node_Sub1_Sub4.anInt1424 - k;
            int i2 = 0;
            int j2 = 0;
            if (l < Node_Sub1_Sub4.anInt1426) {
                int k2 = Node_Sub1_Sub4.anInt1426 - l;
                j1 -= k2;
                l = Node_Sub1_Sub4.anInt1426;
                j2 += k2 * k;
                k1 += k2 * Node_Sub1_Sub4.anInt1424;
            }
            if (l + j1 >= Node_Sub1_Sub4.anInt1427) {
                j1 -= ((l + j1) - Node_Sub1_Sub4.anInt1427) + 1;
            }
            if (j < Node_Sub1_Sub4.anInt1428) {
                int l2 = Node_Sub1_Sub4.anInt1428 - j;
                k -= l2;
                j = Node_Sub1_Sub4.anInt1428;
                j2 += l2;
                k1 += l2;
                i2 += l2;
                l1 += l2;
            }
            if (j + k >= Node_Sub1_Sub4.anInt1429) {
                int i3 = ((j + k) - Node_Sub1_Sub4.anInt1429) + 1;
                k -= i3;
                i2 += i3;
                l1 += i3;
            }
            if (k <= 0 || j1 <= 0) {
                return;
            }
            method395(i1, 0, i2, k, l1, j1, Node_Sub1_Sub4.anIntArray1423, i, j2, abyte0, k1);
            if (byte0 != 9) {
                for (int j3 = 1; j3 > 0; j3++) {
                }
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("21887, " + i + ", " + j + ", " + byte0 + ", " + k + ", " + l + ", " + abyte0 + ", " + i1 + ", " + j1 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method395(int i, int j, int k, int l, int i1, int j1, int[] ai,
                          int k1, int l1, byte[] abyte0, int i2) {
        try {
            k1 = ((k1 & 0xff00ff) * i & 0xff00ff00) + ((k1 & 0xff00) * i & 0xff0000) >> 8;
            i = 256 - i;
            for (int j2 = -j1; j2 < 0; j2++) {
                for (int k2 = -l; k2 < 0; k2++) {
                    if (abyte0[l1++] != 0) {
                        int l2 = ai[i2];
                        ai[i2++] = (((l2 & 0xff00ff) * i & 0xff00ff00) + ((l2 & 0xff00) * i & 0xff0000) >> 8) + k1;
                    } else {
                        i2++;
                    }
                }
                i2 += i1;
                l1 += k;
            }
            if (j != 0) {
                anInt1650 = 193;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("48386, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + ai + ", " + k1 + ", " + l1 + ", " + abyte0 + ", " + i2 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }
}
