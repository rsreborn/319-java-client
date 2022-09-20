package com.jagex;

import com.jagex.sign.Signlink;

public class Class6 {

    public static int anInt131;
    public int anInt120;
    public int[] anIntArray121;
    public int[] anIntArray122;
    public int anInt123;
    public int anInt124;
    public int anInt125;
    public int anInt126;
    public int anInt127;
    public int anInt128;
    public int anInt129;
    public int anInt130;

    public Class6() {
    }

    public void method181(Buffer buffer, int i) {
        try {
            if (i != 26421) {
                throw new NullPointerException();
            } else {
                anInt125 = buffer.readUnsignedByte();
                anInt123 = buffer.readInt();
                anInt124 = buffer.readInt();
                method182(buffer, false);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("94648, " + buffer + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method182(Buffer buffer, boolean flag) {
        try {
            anInt120 = buffer.readUnsignedByte();
            anIntArray121 = new int[anInt120];
            if (flag) {
                return;
            }
            anIntArray122 = new int[anInt120];
            for (int i = 0; i < anInt120; i++) {
                anIntArray121[i] = buffer.readUnsignedShort();
                anIntArray122[i] = buffer.readUnsignedShort();
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("33098, " + buffer + ", " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method183(byte byte0) {
        try {
            if (byte0 == 6) {
                byte0 = 0;
            } else {
                for (int i = 1; i > 0; i++) {
                }
            }
            anInt126 = 0;
            anInt127 = 0;
            anInt128 = 0;
            anInt129 = 0;
            anInt130 = 0;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("74317, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method184(int i, int j) {
        try {
            if (anInt130 >= anInt126) {
                anInt129 = anIntArray122[anInt127++] << 15;
                if (anInt127 >= anInt120) {
                    anInt127 = anInt120 - 1;
                }
                anInt126 = (int) (((double) anIntArray121[anInt127] / 65536D) * (double) i);
                if (anInt126 > anInt130) {
                    anInt128 = ((anIntArray122[anInt127] << 15) - anInt129) / (anInt126 - anInt130);
                }
            }
            anInt129 += anInt128;
            j = 11 / j;
            anInt130++;
            return anInt129 - anInt128 >> 15;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("54424, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
