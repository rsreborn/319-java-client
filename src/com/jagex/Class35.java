package com.jagex;

import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;

public class Class35 {

    public int anInt529;
    public int anInt530;
    public int[] anIntArray531;
    public int[][] anIntArrayArray532;

    public Class35(Buffer buffer, boolean flag) {
        anInt529 = -22144;
        try {
            anInt530 = buffer.readUByte();
            anIntArray531 = new int[anInt530];
            anIntArrayArray532 = new int[anInt530][];
            if (flag) {
                anInt529 = -3;
            }
            for (int i = 0; i < anInt530; i++) {
                anIntArray531[i] = buffer.readUByte();
            }
            for (int j = 0; j < anInt530; j++) {
                int k = buffer.readUByte();
                anIntArrayArray532[j] = new int[k];
                for (int l = 0; l < k; l++) {
                    anIntArrayArray532[j][l] = buffer.readUByte();
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("6800, " + buffer + ", " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
