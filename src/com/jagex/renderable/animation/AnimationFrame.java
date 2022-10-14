package com.jagex.renderable.animation;

import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;

public class AnimationFrame {

    public static AnimationFrame[] aAnimationFrameArray136;
    public static boolean[] aBooleanArray144;
    public int anInt137;
    public AnimationFrameBase aAnimationFrameBase_138;
    public int anInt139;
    public int[] anIntArray140;
    public int[] anIntArray141;
    public int[] anIntArray142;
    public int[] anIntArray143;

    public AnimationFrame() {
    }

    public static void method185(int i) {
        aAnimationFrameArray136 = new AnimationFrame[i + 1];
        aBooleanArray144 = new boolean[i + 1];
        for (int j = 0; j < i + 1; j++) {
            aBooleanArray144[j] = true;
        }
    }

    public static void method186(int i, byte[] abyte0) {
        Buffer buffer = new Buffer(abyte0);
        buffer.position = abyte0.length - 8;
        int j = buffer.readUShortBE();
        int k = buffer.readUShortBE();
        int l = buffer.readUShortBE();
        int i1 = buffer.readUShortBE();
        int j1 = 0;
        Buffer class13_sub1_sub2_1 = new Buffer(abyte0);
        class13_sub1_sub2_1.position = j1;
        j1 += j + 2;
        Buffer buffer_2 = new Buffer(abyte0);
        buffer_2.position = j1;
        j1 += k;
        Buffer buffer_3 = new Buffer(abyte0);
        buffer_3.position = j1;
        j1 += l;
        Buffer buffer_4 = new Buffer(abyte0);
        buffer_4.position = j1;
        j1 += i1;
        Buffer buffer_5 = new Buffer(abyte0);
        buffer_5.position = j1;
        AnimationFrameBase animationFrameBase = new AnimationFrameBase(buffer_5);
        int k1 = class13_sub1_sub2_1.readUShortBE();
        int[] ai = new int[500];
        int[] ai1 = new int[500];
        int[] ai2 = new int[500];
        int[] ai3 = new int[500];
        for (int l1 = 0; l1 < k1; l1++) {
            int i2 = class13_sub1_sub2_1.readUShortBE();
            AnimationFrame animationFrame = aAnimationFrameArray136[i2] = new AnimationFrame();
            animationFrame.anInt137 = buffer_4.readUByte();
            animationFrame.aAnimationFrameBase_138 = animationFrameBase;
            int j2 = class13_sub1_sub2_1.readUByte();
            int k2 = -1;
            int l2 = 0;
            for (int i3 = 0; i3 < j2; i3++) {
                int j3 = buffer_2.readUByte();
                if (j3 > 0) {
                    if (animationFrameBase.anIntArray531[i3] != 0) {
                        for (int l3 = i3 - 1; l3 > k2; l3--) {
                            if (animationFrameBase.anIntArray531[l3] != 0) {
                                continue;
                            }
                            ai[l2] = l3;
                            ai1[l2] = 0;
                            ai2[l2] = 0;
                            ai3[l2] = 0;
                            l2++;
                            break;
                        }
                    }
                    ai[l2] = i3;
                    char c = '\0';
                    if (animationFrameBase.anIntArray531[i3] == 3) {
                        c = '\200';
                    }
                    if ((j3 & 1) != 0) {
                        ai1[l2] = buffer_3.readSmart();
                    } else {
                        ai1[l2] = c;
                    }
                    if ((j3 & 2) != 0) {
                        ai2[l2] = buffer_3.readSmart();
                    } else {
                        ai2[l2] = c;
                    }
                    if ((j3 & 4) != 0) {
                        ai3[l2] = buffer_3.readSmart();
                    } else {
                        ai3[l2] = c;
                    }
                    k2 = i3;
                    l2++;
                    if (animationFrameBase.anIntArray531[i3] == 5) {
                        aBooleanArray144[i2] = false;
                    }
                }
            }
            animationFrame.anInt139 = l2;
            animationFrame.anIntArray140 = new int[l2];
            animationFrame.anIntArray141 = new int[l2];
            animationFrame.anIntArray142 = new int[l2];
            animationFrame.anIntArray143 = new int[l2];
            for (int k3 = 0; k3 < l2; k3++) {
                animationFrame.anIntArray140[k3] = ai[k3];
                animationFrame.anIntArray141[k3] = ai1[k3];
                animationFrame.anIntArray142[k3] = ai2[k3];
                animationFrame.anIntArray143[k3] = ai3[k3];
            }
        }
    }

    public static void method187(int i) {
        try {
            if (i != 47779) {
                for (int j = 1; j > 0; j++) {
                }
            }
            aAnimationFrameArray136 = null;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("58180, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static AnimationFrame method188(byte byte0, int i) {
        try {
            if (byte0 == 4) {
                byte0 = 0;
            } else {
                throw new NullPointerException();
            }
            if (aAnimationFrameArray136 == null) {
                return null;
            } else {
                return aAnimationFrameArray136[i];
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("4768, " + byte0 + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static boolean method189(int i, int j) {
        try {
            if (j != 19953) {
                for (int k = 1; k > 0; k++) {
                }
            }
            return i == -1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("62535, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
