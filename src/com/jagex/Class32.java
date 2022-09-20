package com.jagex;

import com.jagex.sign.Signlink;

public class Class32 {

    public static int anInt488;
    public static Class32[] aClass32Array489;
    public String aString490;
    public int anInt491;
    public int anInt492;
    public boolean aBoolean493;
    public boolean aBoolean494;
    public int anInt495;
    public int anInt496;
    public int anInt497;
    public int anInt498;
    public int anInt499;
    public int anInt500;

    public Class32() {
        anInt492 = -1;
        aBoolean493 = false;
        aBoolean494 = true;
    }

    public static void method493(Class1 class1, byte byte0) {
        try {
            if (byte0 != 72) {
                return;
            }
            Buffer buffer = new Buffer(-351, class1.method149("flo.dat", null));
            anInt488 = buffer.readUnsignedShort();
            if (aClass32Array489 == null) {
                aClass32Array489 = new Class32[anInt488];
            }
            for (int i = 0; i < anInt488; i++) {
                if (aClass32Array489[i] == null) {
                    aClass32Array489[i] = new Class32();
                }
                aClass32Array489[i].method494(buffer, 26421);
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("75176, " + class1 + ", " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method494(Buffer buffer, int i) {
        try {
            if (i != 26421) {
                throw new NullPointerException();
            }
            do {
                int j = buffer.readUnsignedByte();
                if (j == 0) {
                    return;
                }
                if (j == 1) {
                    anInt491 = buffer.readTriByte();
                    method495((byte) 68, anInt491);
                } else if (j == 2) {
                    anInt492 = buffer.readUnsignedByte();
                } else if (j == 3) {
                    aBoolean493 = true;
                } else if (j == 5) {
                    aBoolean494 = false;
                } else if (j == 6) {
                    aString490 = buffer.readString();
                } else if (j == 7) {
                    int k = anInt495;
                    int l = anInt496;
                    int i1 = anInt497;
                    int j1 = anInt498;
                    int k1 = buffer.readTriByte();
                    method495((byte) 68, k1);
                    anInt495 = k;
                    anInt496 = l;
                    anInt497 = i1;
                    anInt498 = j1;
                    anInt499 = j1;
                } else {
                    System.out.println("Error unrecognised config code: " + j);
                }
            } while (true);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("47725, " + buffer + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method495(byte byte0, int i) {
        try {
            double d = (double) (i >> 16 & 0xff) / 256D;
            double d1 = (double) (i >> 8 & 0xff) / 256D;
            double d2 = (double) (i & 0xff) / 256D;
            double d3 = d;
            if (d1 < d3) {
                d3 = d1;
            }
            if (d2 < d3) {
                d3 = d2;
            }
            double d4 = d;
            if (d1 > d4) {
                d4 = d1;
            }
            if (d2 > d4) {
                d4 = d2;
            }
            double d5 = 0.0D;
            double d6 = 0.0D;
            double d7 = (d3 + d4) / 2D;
            if (d3 != d4) {
                if (d7 < 0.5D) {
                    d6 = (d4 - d3) / (d4 + d3);
                }
                if (d7 >= 0.5D) {
                    d6 = (d4 - d3) / (2D - d4 - d3);
                }
                if (d == d4) {
                    d5 = (d1 - d2) / (d4 - d3);
                } else if (d1 == d4) {
                    d5 = 2D + (d2 - d) / (d4 - d3);
                } else if (d2 == d4) {
                    d5 = 4D + (d - d1) / (d4 - d3);
                }
            }
            d5 /= 6D;
            anInt495 = (int) (d5 * 256D);
            anInt496 = (int) (d6 * 256D);
            anInt497 = (int) (d7 * 256D);
            if (anInt496 < 0) {
                anInt496 = 0;
            } else if (anInt496 > 255) {
                anInt496 = 255;
            }
            if (anInt497 < 0) {
                anInt497 = 0;
            } else if (anInt497 > 255) {
                anInt497 = 255;
            }
            if (d7 > 0.5D) {
                anInt499 = (int) ((1.0D - d7) * d6 * 512D);
            } else {
                anInt499 = (int) (d7 * d6 * 512D);
            }
            if (anInt499 < 1) {
                anInt499 = 1;
            }
            anInt498 = (int) (d5 * (double) anInt499);
            int j = (anInt495 + (int) (Math.random() * 16D)) - 8;
            if (j < 0) {
                j = 0;
            } else if (j > 255) {
                j = 255;
            }
            int k = (anInt496 + (int) (Math.random() * 48D)) - 24;
            if (k < 0) {
                k = 0;
            } else if (k > 255) {
                k = 255;
            }
            int l = (anInt497 + (int) (Math.random() * 48D)) - 24;
            if (byte0 != 68) {
                for (int i1 = 1; i1 > 0; i1++) {
                }
            }
            if (l < 0) {
                l = 0;
            } else if (l > 255) {
                l = 255;
            }
            anInt500 = method496(j, k, l);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("92653, " + byte0 + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int method496(int i, int j, int k) {
        if (k > 179) {
            j /= 2;
        }
        if (k > 192) {
            j /= 2;
        }
        if (k > 217) {
            j /= 2;
        }
        if (k > 243) {
            j /= 2;
        }
        int l = (i / 4 << 10) + (j / 32 << 7) + k / 2;
        return l;
    }
}
