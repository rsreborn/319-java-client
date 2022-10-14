package com.jagex.cache.configs;

import com.jagex.graphics.Model;
import com.jagex.cache.CacheArchive;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;
import com.jagex.util.Cache;

public class SpotAnimationConfig {

    public static int anInt683;
    public static int anInt684;
    public static SpotAnimationConfig[] aSpotAnimationConfigArray685;
    public static Cache aCache_697 = new Cache(30);
    public int anInt686;
    public int anInt687;
    public int anInt688;
    public SequenceConfig aSequenceConfig_689;
    public int[] anIntArray690;
    public int[] anIntArray691;
    public int anInt692;
    public int anInt693;
    public int anInt694;
    public int anInt695;
    public int anInt696;

    public SpotAnimationConfig() {
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
            anInt684 = buffer.readUShortBE();
            if (aSpotAnimationConfigArray685 == null) {
                aSpotAnimationConfigArray685 = new SpotAnimationConfig[anInt684];
            }
            for (int i = 0; i < anInt684; i++) {
                if (aSpotAnimationConfigArray685[i] == null) {
                    aSpotAnimationConfigArray685[i] = new SpotAnimationConfig();
                }
                aSpotAnimationConfigArray685[i].anInt686 = i;
                aSpotAnimationConfigArray685[i].method529(buffer, 26421);
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
                int j = buffer.readUByte();
                if (j == 0) {
                    return;
                }
                if (j == 1) {
                    anInt687 = buffer.readUShortBE();
                } else if (j == 2) {
                    anInt688 = buffer.readUShortBE();
                    if (SequenceConfig.aSequenceConfigArray800 != null) {
                        aSequenceConfig_689 = SequenceConfig.aSequenceConfigArray800[anInt688];
                    }
                } else if (j == 4) {
                    anInt692 = buffer.readUShortBE();
                } else if (j == 5) {
                    anInt693 = buffer.readUShortBE();
                } else if (j == 6) {
                    anInt694 = buffer.readUShortBE();
                } else if (j == 7) {
                    anInt695 = buffer.readUByte();
                } else if (j == 8) {
                    anInt696 = buffer.readUByte();
                } else if (j >= 40 && j < 50) {
                    anIntArray690[j - 40] = buffer.readUShortBE();
                } else if (j >= 50 && j < 60) {
                    anIntArray691[j - 50] = buffer.readUShortBE();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + j);
                }
            } while (true);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("15841, " + buffer + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method530() {
        Model class13_sub1_sub1_sub4 = (Model) aCache_697.get(anInt686);
        if (class13_sub1_sub1_sub4 != null) {
            return class13_sub1_sub1_sub4;
        }
        class13_sub1_sub1_sub4 = Model.method265((byte) 4, anInt687);
        if (class13_sub1_sub1_sub4 == null) {
            return null;
        }
        for (int i = 0; i < 6; i++) {
            if (anIntArray690[0] != 0) {
                class13_sub1_sub1_sub4.method279(anIntArray690[i], anIntArray691[i]);
            }
        }
        aCache_697.put(class13_sub1_sub1_sub4, anInt686);
        return class13_sub1_sub1_sub4;
    }

}
