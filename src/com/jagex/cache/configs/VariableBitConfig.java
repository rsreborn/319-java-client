package com.jagex.cache.configs;

import com.jagex.cache.CacheArchive;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;

public class VariableBitConfig {

    public static boolean aBoolean436;
    public static int anInt438;
    public static VariableBitConfig[] aVariableBitConfigArray439;
    public int anInt437;
    public String aString440;
    public int anInt441;
    public int anInt442;
    public int anInt443;
    public boolean aBoolean444;
    public int anInt445;
    public int anInt446;

    public VariableBitConfig() {
        anInt437 = 40848;
        aBoolean444 = false;
        anInt445 = -1;
    }

    public static void method473(CacheArchive cacheArchive, byte byte0) {
        try {
            Buffer buffer = new Buffer(cacheArchive.readFile("varbit.dat", null));
            anInt438 = buffer.readUShortBE();
            if (aVariableBitConfigArray439 == null) {
                aVariableBitConfigArray439 = new VariableBitConfig[anInt438];
            }
            for (int i = 0; i < anInt438; i++) {
                if (aVariableBitConfigArray439[i] == null) {
                    aVariableBitConfigArray439[i] = new VariableBitConfig();
                }
                aVariableBitConfigArray439[i].method474(i, 40848, buffer);
                if (aVariableBitConfigArray439[i].aBoolean444) {
                    VariablePlayerConfig.aVariablePlayerConfigArray365[aVariableBitConfigArray439[i].anInt441].aBoolean377 = true;
                }
            }
            if (byte0 != 72) {
                aBoolean436 = !aBoolean436;
            }
            if (buffer.position != buffer.payload.length) {
                System.out.println("varbit load mismatch");
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("40928, " + cacheArchive + ", " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method474(int i, int j, Buffer buffer) {
        try {
            if (j != anInt437) {
                return;
            }
            do {
                int k = buffer.readUByte();
                if (k == 0) {
                    return;
                }
                if (k == 1) {
                    anInt441 = buffer.readUShortBE();
                    anInt442 = buffer.readUByte();
                    anInt443 = buffer.readUByte();
                } else if (k == 10) {
                    aString440 = buffer.readString();
                } else if (k == 2) {
                    aBoolean444 = true;
                } else if (k == 3) {
                    anInt445 = buffer.readIntBE();
                } else if (k == 4) {
                    anInt446 = buffer.readIntBE();
                } else {
                    System.out.println("Error unrecognised config code: " + k);
                }
            } while (true);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("41080, " + i + ", " + j + ", " + buffer + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
