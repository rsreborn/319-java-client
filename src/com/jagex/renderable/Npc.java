package com.jagex.renderable;

import com.jagex.renderable.animation.AnimationFrame;
import com.jagex.cache.configs.NpcConfig;
import com.jagex.cache.configs.SequenceConfig;
import com.jagex.cache.configs.SpotAnimationConfig;
import com.jagex.graphics.Model;
import com.jagex.sign.Signlink;

public class Npc extends Entity {

    public NpcConfig aNpcConfig_1717;

    public Npc() {
    }

    public Model method298(int i) {
        try {
            if (super.anInt1597 >= 0 && super.anInt1600 == 0) {
                int j = SequenceConfig.aSequenceConfigArray800[super.anInt1597].anIntArray802[super.anInt1598];
                int l = -1;
                if (super.anInt1620 >= 0 && super.anInt1620 != super.anInt1584) {
                    l = SequenceConfig.aSequenceConfigArray800[super.anInt1620].anIntArray802[super.anInt1621];
                }
                return aNpcConfig_1717.method582(l, j, true, SequenceConfig.aSequenceConfigArray800[super.anInt1597].anIntArray806);
            }
            int k = -1;
            if (i != -37578) {
                throw new NullPointerException();
            }
            if (super.anInt1620 >= 0) {
                k = SequenceConfig.aSequenceConfigArray800[super.anInt1620].anIntArray802[super.anInt1621];
            }
            return aNpcConfig_1717.method582(-1, k, true, null);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("45943, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method291(boolean flag) {
        try {
            if (!flag) {
                throw new NullPointerException();
            }
            return aNpcConfig_1717 != null;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("19439, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method256(int i) {
        try {
            if (aNpcConfig_1717 == null) {
                return null;
            }
            Model class13_sub1_sub1_sub4 = method298(-37578);
            if (i <= 0) {
                for (int j = 1; j > 0; j++) {
                }
            }
            if (class13_sub1_sub1_sub4 == null) {
                return null;
            }
            super.anInt1590 = class13_sub1_sub1_sub4.anInt1377;
            if (super.anInt1592 != -1 && super.anInt1593 != -1) {
                SpotAnimationConfig spotAnimationConfig = SpotAnimationConfig.aSpotAnimationConfigArray685[super.anInt1592];
                Model class13_sub1_sub1_sub4_1 = spotAnimationConfig.method530();
                if (class13_sub1_sub1_sub4_1 != null) {
                    int k = spotAnimationConfig.aSequenceConfig_689.anIntArray802[super.anInt1593];
                    Model class13_sub1_sub1_sub4_2 = new Model(false, AnimationFrame.method189(k, 19953), 629, class13_sub1_sub1_sub4_1, true);
                    class13_sub1_sub1_sub4_2.method278(0, -991, -super.anInt1596, 0);
                    class13_sub1_sub1_sub4_2.method272(true);
                    class13_sub1_sub1_sub4_2.method273(k, false);
                    class13_sub1_sub1_sub4_2.anIntArrayArray1528 = null;
                    class13_sub1_sub1_sub4_2.anIntArrayArray1527 = null;
                    if (spotAnimationConfig.anInt692 != 128 || spotAnimationConfig.anInt693 != 128) {
                        class13_sub1_sub1_sub4_2.method281(spotAnimationConfig.anInt692, spotAnimationConfig.anInt692, spotAnimationConfig.anInt693, (byte) 0);
                    }
                    class13_sub1_sub1_sub4_2.method282(64 + spotAnimationConfig.anInt695, 850 + spotAnimationConfig.anInt696, -30, -50, -30, true);
                    Model[] aclass13_sub1_sub1_sub4 = {
                            class13_sub1_sub1_sub4, class13_sub1_sub1_sub4_2
                    };
                    class13_sub1_sub1_sub4 = new Model(aclass13_sub1_sub1_sub4, 0, true, 2);
                }
            }
            if (aNpcConfig_1717.aByte768 == 1) {
                class13_sub1_sub1_sub4.aBoolean1529 = true;
            }
            return class13_sub1_sub1_sub4;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("82665, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
