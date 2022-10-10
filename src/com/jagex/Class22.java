package com.jagex;

import com.jagex.cache.CacheArchive;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;

public class Class22 {

    public static int anInt364;
    public static Class22[] aClass22Array365;
    public static int anInt366;
    public static int[] anIntArray367;
    public int anInt363;
    public String aString368;
    public int anInt369;
    public int anInt370;
    public boolean aBoolean371;
    public boolean aBoolean372;
    public int anInt373;
    public boolean aBoolean374;
    public int anInt375;
    public int anInt376;
    public boolean aBoolean377;
    public int anInt378;

    public Class22() {
        anInt363 = 40848;
        aBoolean371 = false;
        aBoolean372 = true;
        aBoolean374 = false;
        aBoolean377 = false;
        anInt378 = -1;
    }

    public static void method444(CacheArchive cacheArchive, byte byte0) {
        try {
            Buffer buffer = new Buffer(cacheArchive.readFile("varp.dat", null));
            anInt366 = 0;
            anInt364 = buffer.readUShortBE();
            if (byte0 != 72) {
                return;
            }
            if (aClass22Array365 == null) {
                aClass22Array365 = new Class22[anInt364];
            }
            if (anIntArray367 == null) {
                anIntArray367 = new int[anInt364];
            }
            for (int i = 0; i < anInt364; i++) {
                if (aClass22Array365[i] == null) {
                    aClass22Array365[i] = new Class22();
                }
                aClass22Array365[i].method445(i, 40848, buffer);
            }
            if (buffer.position != buffer.payload.length) {
                System.out.println("varptype load mismatch");
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("22263, " + cacheArchive + ", " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method445(int i, int j, Buffer buffer) {
        try {
            if (j != anInt363) {
                anInt363 = -362;
            }
            do {
                int k = buffer.readUByte();
                if (k == 0) {
                    return;
                }
                if (k == 1) {
                    anInt369 = buffer.readUByte();
                } else if (k == 2) {
                    anInt370 = buffer.readUByte();
                } else if (k == 3) {
                    aBoolean371 = true;
                    anIntArray367[anInt366++] = i;
                } else if (k == 4) {
                    aBoolean372 = false;
                } else if (k == 5) {
                    anInt373 = buffer.readUShortBE();
                } else if (k == 6) {
                    aBoolean374 = true;
                } else if (k == 7) {
                    anInt375 = buffer.readIntBE();
                } else if (k == 8) {
                    anInt376 = 1;
                    aBoolean377 = true;
                } else if (k == 10) {
                    aString368 = buffer.readString();
                } else if (k == 11) {
                    aBoolean377 = true;
                } else if (k == 12) {
                    anInt378 = buffer.readIntBE();
                } else if (k == 13) {
                    anInt376 = 2;
                } else {
                    System.out.println("Error unrecognised config code: " + k);
                }
            } while (true);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("88500, " + i + ", " + j + ", " + buffer + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
