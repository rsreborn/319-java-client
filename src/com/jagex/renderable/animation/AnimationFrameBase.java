package com.jagex.renderable.animation;

import com.jagex.io.Buffer;

public class AnimationFrameBase {

    public int anInt530;
    public int[] anIntArray531;
    public int[][] anIntArrayArray532;

    public AnimationFrameBase(Buffer buffer) {
        anInt530 = buffer.readUByte();
        anIntArray531 = new int[anInt530];
        anIntArrayArray532 = new int[anInt530][];
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
    }
}
