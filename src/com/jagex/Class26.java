package com.jagex;

import com.jagex.sign.Signlink;

public class Class26 {

    public static boolean aBoolean436;
    public static int anInt438;
    public static Class26[] aClass26Array439;
    public int anInt437;
    public String aString440;
    public int anInt441;
    public int anInt442;
    public int anInt443;
    public boolean aBoolean444;
    public int anInt445;
    public int anInt446;

    public Class26() {
        anInt437 = 40848;
        aBoolean444 = false;
        anInt445 = -1;
    }

    public static void method473(Archive archive, byte byte0) {
        try {
            Buffer buffer = new Buffer(archive.readFile("varbit.dat", null));
            anInt438 = buffer.readUnsignedShort();
            if (aClass26Array439 == null) {
                aClass26Array439 = new Class26[anInt438];
            }
            for (int i = 0; i < anInt438; i++) {
                if (aClass26Array439[i] == null) {
                    aClass26Array439[i] = new Class26();
                }
                aClass26Array439[i].method474(i, 40848, buffer);
                if (aClass26Array439[i].aBoolean444) {
                    Class22.aClass22Array365[aClass26Array439[i].anInt441].aBoolean377 = true;
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
            Signlink.reportError("40928, " + archive + ", " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method474(int i, int j, Buffer buffer) {
        try {
            if (j != anInt437) {
                return;
            }
            do {
                int k = buffer.readUnsignedByte();
                if (k == 0) {
                    return;
                }
                if (k == 1) {
                    anInt441 = buffer.readUnsignedShort();
                    anInt442 = buffer.readUnsignedByte();
                    anInt443 = buffer.readUnsignedByte();
                } else if (k == 10) {
                    aString440 = buffer.readString();
                } else if (k == 2) {
                    aBoolean444 = true;
                } else if (k == 3) {
                    anInt445 = buffer.readInt();
                } else if (k == 4) {
                    anInt446 = buffer.readInt();
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
