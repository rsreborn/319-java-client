package com.jagex;

import com.jagex.cache.CacheArchive;
import com.jagex.sign.Signlink;

public class Class40 {

    public static int anInt683;
    public static int anInt684;
    public static Class40[] aClass40Array685;
    public static Cache aCache_697 = new Cache(30, 31);
    public int anInt686;
    public int anInt687;
    public int anInt688;
    public Class50 aClass50_689;
    public int[] anIntArray690;
    public int[] anIntArray691;
    public int anInt692;
    public int anInt693;
    public int anInt694;
    public int anInt695;
    public int anInt696;

    public Class40() {
        anInt688 = -1;
        anIntArray690 = new int[6];
        anIntArray691 = new int[6];
        anInt692 = 128;
        anInt693 = 128;
    }

    public static void method528(CacheArchive cacheArchive, byte byte0) {
        try {
            Buffer buffer = new Buffer(cacheArchive.readFile("spotanim.dat", null));
            if (byte0 != 72) {
                anInt683 = -170;
            }
            anInt684 = buffer.readUnsignedShort();
            if (aClass40Array685 == null) {
                aClass40Array685 = new Class40[anInt684];
            }
            for (int i = 0; i < anInt684; i++) {
                if (aClass40Array685[i] == null) {
                    aClass40Array685[i] = new Class40();
                }
                aClass40Array685[i].anInt686 = i;
                aClass40Array685[i].method529(buffer, 26421);
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("95120, " + cacheArchive + ", " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method529(Buffer buffer, int i) {
        try {
            if (i != 26421) {
                anInt683 = -226;
            }
            do {
                int j = buffer.readUnsignedByte();
                if (j == 0) {
                    return;
                }
                if (j == 1) {
                    anInt687 = buffer.readUnsignedShort();
                } else if (j == 2) {
                    anInt688 = buffer.readUnsignedShort();
                    if (Class50.aClass50Array800 != null) {
                        aClass50_689 = Class50.aClass50Array800[anInt688];
                    }
                } else if (j == 4) {
                    anInt692 = buffer.readUnsignedShort();
                } else if (j == 5) {
                    anInt693 = buffer.readUnsignedShort();
                } else if (j == 6) {
                    anInt694 = buffer.readUnsignedShort();
                } else if (j == 7) {
                    anInt695 = buffer.readUnsignedByte();
                } else if (j == 8) {
                    anInt696 = buffer.readUnsignedByte();
                } else if (j >= 40 && j < 50) {
                    anIntArray690[j - 40] = buffer.readUnsignedShort();
                } else if (j >= 50 && j < 60) {
                    anIntArray691[j - 50] = buffer.readUnsignedShort();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + j);
                }
            } while (true);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("15841, " + buffer + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub1_Sub4 method530() {
        Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = (Class13_Sub1_Sub1_Sub4) aCache_697.method172(anInt686);
        if (class13_sub1_sub1_sub4 != null) {
            return class13_sub1_sub1_sub4;
        }
        class13_sub1_sub1_sub4 = Class13_Sub1_Sub1_Sub4.method265((byte) 4, anInt687);
        if (class13_sub1_sub1_sub4 == null) {
            return null;
        }
        for (int i = 0; i < 6; i++) {
            if (anIntArray690[0] != 0) {
                class13_sub1_sub1_sub4.method279(anIntArray690[i], anIntArray691[i]);
            }
        }
        aCache_697.method173(class13_sub1_sub1_sub4, anInt686, 9388);
        return class13_sub1_sub1_sub4;
    }

}
