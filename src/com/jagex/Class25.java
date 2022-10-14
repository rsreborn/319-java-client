package com.jagex;/* com.jagex.Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.jagex.cache.configs.FloorConfig;
import com.jagex.cache.configs.LocationConfig;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;
import com.jagex.update.GameUpdateClient;

public class Class25 {
    public static boolean aBoolean407;
    public static int[] anIntArray409 = {16, 32, 64, 128};
    public static int[] anIntArray411 = {1, 2, 4, 8};
    public static int anInt414 = 932;
    public static int anInt416;
    public static int anInt420 = 12258;
    public static int anInt422 = (int) (Math.random() * 17.0) - 8;
    public static int anInt425 = (int) (Math.random() * 33.0) - 16;
    public static int anInt426 = 99;
    public static int[] anIntArray430 = {0, -1, 0, 1};
    public static int[] anIntArray432 = {1, 0, -1, 0};
    public static boolean aBoolean433 = true;
    public int[] anIntArray402;
    public int[] anIntArray403;
    public int[] anIntArray404;
    public int[] anIntArray405;
    public int[] anIntArray406;
    public int[][][] anIntArrayArrayArray408;
    public byte[][][] aByteArrayArrayArray410;
    public byte aByte412 = 4;
    public int[][][] anIntArrayArrayArray413;
    public boolean aBoolean415 = true;
    public boolean aBoolean417 = false;
    public byte[][][] aByteArrayArrayArray418;
    public boolean aBoolean419 = true;
    public int[][] anIntArrayArray421;
    public byte[][][] aByteArrayArrayArray423;
    public byte[][][] aByteArrayArrayArray424;
    public int anInt427;
    public int anInt428;
    public byte aByte429 = -111;
    public byte[][][] aByteArrayArrayArray431;
    public boolean aBoolean434 = true;
    public byte[][][] aByteArrayArrayArray435;

    public Class25(int[][][] is, int i, int i_207_, int i_208_,
                   byte[][][] is_209_) {
        try {
            anInt426 = 99;
            anInt427 = i_207_;
            anInt428 = i;
            anIntArrayArrayArray413 = is;
            aByteArrayArrayArray418 = is_209_;
            aByteArrayArrayArray410 = new byte[4][anInt427][anInt428];
            aByteArrayArrayArray423 = new byte[4][anInt427][anInt428];
            aByteArrayArrayArray435 = new byte[4][anInt427][anInt428];
            aByteArrayArrayArray431 = new byte[4][anInt427][anInt428];
            while (i_208_ >= 0)
                aBoolean434 = !aBoolean434;
            anIntArrayArrayArray408 = new int[4][anInt427 + 1][anInt428 + 1];
            aByteArrayArrayArray424 = new byte[4][anInt427 + 1][anInt428 + 1];
            anIntArrayArray421 = new int[anInt427 + 1][anInt428 + 1];
            anIntArray402 = new int[anInt428];
            anIntArray403 = new int[anInt428];
            anIntArray404 = new int[anInt428];
            anIntArray405 = new int[anInt428];
            anIntArray406 = new int[anInt428];
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("47143, " + is + ", " + i + ", " + i_207_
                    + ", " + i_208_ + ", " + is_209_ + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public static int method452(int i, int i_0_) {
        if (i == -1)
            return 12345678;
        i_0_ = i_0_ * (i & 0x7f) / 128;
        if (i_0_ < 2)
            i_0_ = 2;
        else if (i_0_ > 126)
            i_0_ = 126;
        return (i & 0xff80) + i_0_;
    }

    public static void method454(int i, int i_20_, Class39 class39, int i_21_,
                                 int i_22_, int i_23_, int i_24_, byte i_25_,
                                 Class10 class10, int i_26_, int[][][] is) {
        try {
            int i_27_ = is[i_22_][i_24_][i_21_];
            int i_28_ = is[i_22_][i_24_ + 1][i_21_];
            int i_29_ = is[i_22_][i_24_ + 1][i_21_ + 1];
            int i_30_ = is[i_22_][i_24_][i_21_ + 1];
            int i_31_ = i_27_ + i_28_ + i_29_ + i_30_ >> 2;
            if (i_25_ != 75)
                anInt414 = -138;
            LocationConfig locationConfig = LocationConfig.readDefinition(i);
            int i_32_ = i_24_ + (i_21_ << 7) + (i << 14) + 1073741824;
            if (!locationConfig.aBoolean260)
                i_32_ += -2147483648;
            byte i_33_ = (byte) ((i_23_ << 6) + i_20_);
            if (i_20_ == 22) {
                CacheableNode_Sub1_ class13_sub1_sub1;
                if (locationConfig.anInt282 == -1 && locationConfig.anIntArray243 == null)
                    class13_sub1_sub1
                            = locationConfig.method419(22, i_23_, i_27_, i_28_, i_29_,
                            i_30_, -1);
                else
                    class13_sub1_sub1
                            = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                            i_23_, locationConfig.anInt282,
                            i_28_, true, 22, 29895,
                            i);
                class10.method200(class13_sub1_sub1, i_26_, false, i_32_,
                        i_21_, i_33_, i_24_, i_31_);
                if (locationConfig.aBoolean258 && locationConfig.aBoolean260)
                    class39.method519(i_21_, i_24_, true);
            } else if (i_20_ == 10 || i_20_ == 11) {
                CacheableNode_Sub1_ class13_sub1_sub1;
                if (locationConfig.anInt282 == -1 && locationConfig.anIntArray243 == null)
                    class13_sub1_sub1
                            = locationConfig.method419(10, i_23_, i_27_, i_28_, i_29_,
                            i_30_, -1);
                else
                    class13_sub1_sub1
                            = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                            i_23_, locationConfig.anInt282,
                            i_28_, true, 10, 29895,
                            i);
                if (class13_sub1_sub1 != null) {
                    int i_34_ = 0;
                    if (i_20_ == 11)
                        i_34_ += 256;
                    int i_35_;
                    int i_36_;
                    if (i_23_ == 1 || i_23_ == 3) {
                        i_35_ = locationConfig.anInt253;
                        i_36_ = locationConfig.anInt259;
                    } else {
                        i_35_ = locationConfig.anInt259;
                        i_36_ = locationConfig.anInt253;
                    }
                    class10.method204(i_36_, i_33_, i_31_, i_24_, i_34_, i_35_,
                            i_21_, 22342, i_32_, i_26_,
                            class13_sub1_sub1);
                }
                if (locationConfig.aBoolean258)
                    class39.method518(i_23_, locationConfig.aBoolean270,
                            locationConfig.anInt253, locationConfig.anInt259,
                            i_24_, (byte) -63, i_21_);
            } else if (i_20_ >= 12) {
                CacheableNode_Sub1_ class13_sub1_sub1;
                if (locationConfig.anInt282 == -1 && locationConfig.anIntArray243 == null)
                    class13_sub1_sub1
                            = locationConfig.method419(i_20_, i_23_, i_27_, i_28_, i_29_,
                            i_30_, -1);
                else
                    class13_sub1_sub1
                            = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                            i_23_, locationConfig.anInt282,
                            i_28_, true, i_20_, 29895,
                            i);
                class10.method204(1, i_33_, i_31_, i_24_, 0, 1, i_21_, 22342,
                        i_32_, i_26_, class13_sub1_sub1);
                if (locationConfig.aBoolean258)
                    class39.method518(i_23_, locationConfig.aBoolean270,
                            locationConfig.anInt253, locationConfig.anInt259,
                            i_24_, (byte) -63, i_21_);
            } else if (i_20_ == 0) {
                CacheableNode_Sub1_ class13_sub1_sub1;
                if (locationConfig.anInt282 == -1 && locationConfig.anIntArray243 == null)
                    class13_sub1_sub1
                            = locationConfig.method419(0, i_23_, i_27_, i_28_, i_29_,
                            i_30_, -1);
                else
                    class13_sub1_sub1
                            = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                            i_23_, locationConfig.anInt282,
                            i_28_, true, 0, 29895, i);
                class10.method202(class13_sub1_sub1, i_26_, aBoolean407, null,
                        i_24_, i_33_, i_32_, i_31_,
                        anIntArray411[i_23_], 0, i_21_);
                if (locationConfig.aBoolean258)
                    class39.method517(i_21_, i_20_, locationConfig.aBoolean270, i_24_,
                            544, i_23_);
            } else if (i_20_ == 1) {
                CacheableNode_Sub1_ class13_sub1_sub1;
                if (locationConfig.anInt282 == -1 && locationConfig.anIntArray243 == null)
                    class13_sub1_sub1
                            = locationConfig.method419(1, i_23_, i_27_, i_28_, i_29_,
                            i_30_, -1);
                else
                    class13_sub1_sub1
                            = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                            i_23_, locationConfig.anInt282,
                            i_28_, true, 1, 29895, i);
                class10.method202(class13_sub1_sub1, i_26_, aBoolean407, null,
                        i_24_, i_33_, i_32_, i_31_,
                        anIntArray409[i_23_], 0, i_21_);
                if (locationConfig.aBoolean258)
                    class39.method517(i_21_, i_20_, locationConfig.aBoolean270, i_24_,
                            544, i_23_);
            } else if (i_20_ == 2) {
                int i_37_ = i_23_ + 1 & 0x3;
                CacheableNode_Sub1_ class13_sub1_sub1;
                CacheableNode_Sub1_ class13_sub1_sub1_38_;
                if (locationConfig.anInt282 == -1 && locationConfig.anIntArray243 == null) {
                    class13_sub1_sub1
                            = locationConfig.method419(2, 4 + i_23_, i_27_, i_28_, i_29_,
                            i_30_, -1);
                    class13_sub1_sub1_38_
                            = locationConfig.method419(2, i_37_, i_27_, i_28_, i_29_,
                            i_30_, -1);
                } else {
                    class13_sub1_sub1
                            = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                            4 + i_23_,
                            locationConfig.anInt282, i_28_,
                            true, 2, 29895, i);
                    class13_sub1_sub1_38_
                            = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                            i_37_, locationConfig.anInt282,
                            i_28_, true, 2, 29895, i);
                }
                class10.method202(class13_sub1_sub1, i_26_, aBoolean407,
                        class13_sub1_sub1_38_, i_24_, i_33_, i_32_,
                        i_31_, anIntArray411[i_23_],
                        anIntArray411[i_37_], i_21_);
                if (locationConfig.aBoolean258)
                    class39.method517(i_21_, i_20_, locationConfig.aBoolean270, i_24_,
                            544, i_23_);
            } else if (i_20_ == 3) {
                CacheableNode_Sub1_ class13_sub1_sub1;
                if (locationConfig.anInt282 == -1 && locationConfig.anIntArray243 == null)
                    class13_sub1_sub1
                            = locationConfig.method419(3, i_23_, i_27_, i_28_, i_29_,
                            i_30_, -1);
                else
                    class13_sub1_sub1
                            = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                            i_23_, locationConfig.anInt282,
                            i_28_, true, 3, 29895, i);
                class10.method202(class13_sub1_sub1, i_26_, aBoolean407, null,
                        i_24_, i_33_, i_32_, i_31_,
                        anIntArray409[i_23_], 0, i_21_);
                if (locationConfig.aBoolean258)
                    class39.method517(i_21_, i_20_, locationConfig.aBoolean270, i_24_,
                            544, i_23_);
            } else if (i_20_ == 9) {
                CacheableNode_Sub1_ class13_sub1_sub1;
                if (locationConfig.anInt282 == -1 && locationConfig.anIntArray243 == null)
                    class13_sub1_sub1
                            = locationConfig.method419(i_20_, i_23_, i_27_, i_28_, i_29_,
                            i_30_, -1);
                else
                    class13_sub1_sub1
                            = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                            i_23_, locationConfig.anInt282,
                            i_28_, true, i_20_, 29895,
                            i);
                class10.method204(1, i_33_, i_31_, i_24_, 0, 1, i_21_, 22342,
                        i_32_, i_26_, class13_sub1_sub1);
                if (locationConfig.aBoolean258)
                    class39.method518(i_23_, locationConfig.aBoolean270,
                            locationConfig.anInt253, locationConfig.anInt259,
                            i_24_, (byte) -63, i_21_);
            } else {
                if (locationConfig.aBoolean263) {
                    if (i_23_ == 1) {
                        int i_39_ = i_30_;
                        i_30_ = i_29_;
                        i_29_ = i_28_;
                        i_28_ = i_27_;
                        i_27_ = i_39_;
                    } else if (i_23_ == 2) {
                        int i_40_ = i_30_;
                        i_30_ = i_28_;
                        i_28_ = i_40_;
                        i_40_ = i_29_;
                        i_29_ = i_27_;
                        i_27_ = i_40_;
                    } else if (i_23_ == 3) {
                        int i_41_ = i_30_;
                        i_30_ = i_27_;
                        i_27_ = i_28_;
                        i_28_ = i_29_;
                        i_29_ = i_41_;
                    }
                }
                if (i_20_ == 4) {
                    CacheableNode_Sub1_ class13_sub1_sub1;
                    if (locationConfig.anInt282 == -1
                            && locationConfig.anIntArray243 == null)
                        class13_sub1_sub1
                                = locationConfig.method419(4, 0, i_27_, i_28_, i_29_,
                                i_30_, -1);
                    else
                        class13_sub1_sub1
                                = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                                0, locationConfig.anInt282,
                                i_28_, true, 4, 29895,
                                i);
                    class10.method203(i_24_, i_32_, i_33_, i_23_ * 512, i_31_,
                            0, anIntArray411[i_23_], (byte) -122,
                            i_21_, i_26_, class13_sub1_sub1, 0);
                } else if (i_20_ == 5) {
                    int i_42_ = 16;
                    int i_43_ = class10.method220(i_26_, i_24_, i_21_);
                    if (i_43_ > 0)
                        i_42_
                                = LocationConfig.readDefinition(i_43_ >> 14 & 0x7fff).anInt269;
                    CacheableNode_Sub1_ class13_sub1_sub1;
                    if (locationConfig.anInt282 == -1
                            && locationConfig.anIntArray243 == null)
                        class13_sub1_sub1
                                = locationConfig.method419(4, 0, i_27_, i_28_, i_29_,
                                i_30_, -1);
                    else
                        class13_sub1_sub1
                                = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                                0, locationConfig.anInt282,
                                i_28_, true, 4, 29895,
                                i);
                    class10.method203(i_24_, i_32_, i_33_, i_23_ * 512, i_31_,
                            anIntArray430[i_23_] * i_42_,
                            anIntArray411[i_23_], (byte) -122, i_21_,
                            i_26_, class13_sub1_sub1,
                            anIntArray432[i_23_] * i_42_);
                } else if (i_20_ == 6) {
                    CacheableNode_Sub1_ class13_sub1_sub1;
                    if (locationConfig.anInt282 == -1
                            && locationConfig.anIntArray243 == null)
                        class13_sub1_sub1
                                = locationConfig.method419(4, 0, i_27_, i_28_, i_29_,
                                i_30_, -1);
                    else
                        class13_sub1_sub1
                                = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                                0, locationConfig.anInt282,
                                i_28_, true, 4, 29895,
                                i);
                    class10.method203(i_24_, i_32_, i_33_, i_23_, i_31_, 0,
                            256, (byte) -122, i_21_, i_26_,
                            class13_sub1_sub1, 0);
                } else if (i_20_ == 7) {
                    CacheableNode_Sub1_ class13_sub1_sub1;
                    if (locationConfig.anInt282 == -1
                            && locationConfig.anIntArray243 == null)
                        class13_sub1_sub1
                                = locationConfig.method419(4, 0, i_27_, i_28_, i_29_,
                                i_30_, -1);
                    else
                        class13_sub1_sub1
                                = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                                0, locationConfig.anInt282,
                                i_28_, true, 4, 29895,
                                i);
                    class10.method203(i_24_, i_32_, i_33_, i_23_, i_31_, 0,
                            512, (byte) -122, i_21_, i_26_,
                            class13_sub1_sub1, 0);
                } else if (i_20_ == 8) {
                    CacheableNode_Sub1_ class13_sub1_sub1;
                    if (locationConfig.anInt282 == -1
                            && locationConfig.anIntArray243 == null)
                        class13_sub1_sub1
                                = locationConfig.method419(4, 0, i_27_, i_28_, i_29_,
                                i_30_, -1);
                    else
                        class13_sub1_sub1
                                = new CacheableNode_Sub1_Sub1_Sub2(i_30_, i_27_, i_29_,
                                0, locationConfig.anInt282,
                                i_28_, true, 4, 29895,
                                i);
                    class10.method203(i_24_, i_32_, i_33_, i_23_, i_31_, 0,
                            768, (byte) -122, i_21_, i_26_,
                            class13_sub1_sub1, 0);
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("3566, " + i + ", " + i_20_ + ", " + class39
                    + ", " + i_21_ + ", " + i_22_ + ", " + i_23_
                    + ", " + i_24_ + ", " + i_25_ + ", " + class10
                    + ", " + i_26_ + ", " + is + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public static int method456(int i, int i_56_, int i_57_) {
        int i_58_ = i / i_57_;
        int i_59_ = i & i_57_ - 1;
        int i_60_ = i_56_ / i_57_;
        int i_61_ = i_56_ & i_57_ - 1;
        int i_62_ = method472(i_58_, i_60_);
        int i_63_ = method472(i_58_ + 1, i_60_);
        int i_64_ = method472(i_58_, i_60_ + 1);
        int i_65_ = method472(i_58_ + 1, i_60_ + 1);
        int i_66_ = method460(i_62_, i_63_, i_59_, i_57_);
        int i_67_ = method460(i_64_, i_65_, i_59_, i_57_);
        return method460(i_66_, i_67_, i_61_, i_57_);
    }

    public static int method460(int i, int i_191_, int i_192_, int i_193_) {
        int i_194_ = (65536 - (CacheableNode_Sub1_Sub4_.anIntArray1635
                [i_192_ * 1024 / i_193_])
                >> 1);
        return (i * (65536 - i_194_) >> 16) + (i_191_ * i_194_ >> 16);
    }

    public static int method462(int i, int i_204_) {
        int i_205_ = i + i_204_ * 57;
        i_205_ = i_205_ << 13 ^ i_205_;
        int i_206_ = (i_205_ * (i_205_ * i_205_ * 15731 + 789221) + 1376312589
                & 0x7fffffff);
        return i_206_ >> 19 & 0xff;
    }

    public static boolean method464(int i, int i_236_, int i_237_, byte[] is) {
        try {
            boolean bool = true;
            Buffer buffer
                    = new Buffer(is);
            int i_238_ = -1;
            if (i != 0)
                throw new NullPointerException();
            for (; ; ) {
                int i_239_ = buffer.readUSmart();
                if (i_239_ == 0)
                    break;
                i_238_ += i_239_;
                int i_240_ = 0;
                boolean bool_241_ = false;
                for (; ; ) {
                    if (bool_241_) {
                        int i_242_ = buffer.readUSmart();
                        if (i_242_ == 0)
                            break;
                        buffer.readUByte();
                    } else {
                        int i_243_ = buffer.readUSmart();
                        if (i_243_ == 0)
                            break;
                        i_240_ += i_243_ - 1;
                        int i_244_ = i_240_ & 0x3f;
                        int i_245_ = i_240_ >> 6 & 0x3f;
                        int i_246_ = buffer.readUByte() >> 2;
                        int i_247_ = i_245_ + i_236_;
                        int i_248_ = i_244_ + i_237_;
                        if (i_247_ > 0 && i_248_ > 0 && i_247_ < 103
                                && i_248_ < 103) {
                            LocationConfig locationConfig = LocationConfig.readDefinition(i_238_);
                            if (i_246_ != 22 || !aBoolean433
                                    || locationConfig.aBoolean260
                                    || locationConfig.aBoolean264) {
                                bool &= locationConfig.method421(-36669);
                                bool_241_ = true;
                            }
                        }
                    }
                }
            }
            return bool;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("97753, " + i + ", " + i_236_ + ", " + i_237_
                    + ", " + is + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public static boolean method467(int i, int i_255_, int i_256_) {
        try {
            if (i_255_ != 0) {
                for (int i_257_ = 1; i_257_ > 0; i_257_++) {
                    /* empty */
                }
            }
            LocationConfig locationConfig = LocationConfig.readDefinition(i);
            if (i_256_ == 11)
                i_256_ = 10;
            if (i_256_ >= 5 && i_256_ <= 8)
                i_256_ = 4;
            return locationConfig.method425(i_256_, 3);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("89504, " + i + ", " + i_255_ + ", " + i_256_
                    + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public static void method468(GameUpdateClient gameUpdateClient, int i,
                                 Buffer buffer) {
        try {
            if (i <= 0)
                anInt420 = -409;
            int i_258_ = -1;
            for (; ; ) {
                int i_259_ = buffer.readUSmart();
                if (i_259_ == 0)
                    break;
                i_258_ += i_259_;
                LocationConfig locationConfig = LocationConfig.readDefinition(i_258_);
                locationConfig.method423(2402, gameUpdateClient);
                for (; ; ) {
                    int i_260_ = buffer.readUSmart();
                    if (i_260_ == 0)
                        break;
                    buffer.readUByte();
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("41445, " + gameUpdateClient + ", " + i + ", "
                    + buffer + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public static int method471(int i, int i_272_) {
        int i_273_ = (method456(i + 45365, i_272_ + 91923, 4) - 128
                + (method456(i + 10294, i_272_ + 37821, 2) - 128 >> 1)
                + (method456(i, i_272_, 1) - 128 >> 2));
        i_273_ = (int) ((double) i_273_ * 0.3) + 35;
        if (i_273_ < 10)
            i_273_ = 10;
        else if (i_273_ > 60)
            i_273_ = 60;
        return i_273_;
    }

    public static int method472(int i, int i_274_) {
        int i_275_
                = (method462(i - 1, i_274_ - 1) + method462(i + 1, i_274_ - 1)
                + method462(i - 1, i_274_ + 1) + method462(i + 1, i_274_ + 1));
        int i_276_ = (method462(i - 1, i_274_) + method462(i + 1, i_274_)
                + method462(i, i_274_ - 1) + method462(i, i_274_ + 1));
        int i_277_ = method462(i, i_274_);
        return i_275_ / 16 + i_276_ / 8 + i_277_ / 4;
    }

    public void method453(int i, Class39[] class39s, int i_1_, int i_2_,
                          Class10 class10, int i_3_, boolean bool, int i_4_,
                          int i_5_, int i_6_, byte[] is) {
        try {
            Buffer buffer
                    = new Buffer(is);
            if (!bool)
                aBoolean419 = !aBoolean419;
            int i_7_ = -1;
            for (; ; ) {
                int i_8_ = buffer.readUSmart();
                if (i_8_ == 0)
                    break;
                i_7_ += i_8_;
                int i_9_ = 0;
                for (; ; ) {
                    int i_10_ = buffer.readUSmart();
                    if (i_10_ == 0)
                        break;
                    i_9_ += i_10_ - 1;
                    int i_11_ = i_9_ & 0x3f;
                    int i_12_ = i_9_ >> 6 & 0x3f;
                    int i_13_ = i_9_ >> 12;
                    int i_14_ = buffer.readUByte();
                    int i_15_ = i_14_ >> 2;
                    int i_16_ = i_14_ & 0x3;
                    if (i_13_ == i_3_ && i_12_ >= i && i_12_ < i + 8
                            && i_11_ >= i_4_ && i_11_ < i_4_ + 8) {
                        LocationConfig locationConfig = LocationConfig.readDefinition(i_7_);
                        int i_17_
                                = (i_6_
                                + Class42.method571(i_1_, locationConfig.anInt259,
                                i_11_ & 0x7, i_12_ & 0x7,
                                locationConfig.anInt253, 9));
                        int i_18_
                                = i_2_ + Class42.method572(i_12_ & 0x7, -454,
                                locationConfig.anInt253,
                                i_11_ & 0x7,
                                locationConfig.anInt259, i_1_);
                        if (i_17_ > 0 && i_18_ > 0 && i_17_ < 103
                                && i_18_ < 103) {
                            int i_19_ = i_13_;
                            if ((aByteArrayArrayArray418[1][i_17_][i_18_]
                                    & 0x2)
                                    == 2)
                                i_19_--;
                            Class39 class39 = null;
                            if (i_19_ >= 0)
                                class39 = class39s[i_19_];
                            method463(i_7_, i_15_, i_16_ + i_1_ & 0x3, i_17_,
                                    0, i_5_, class39, class10, i_18_);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("35204, " + i + ", " + class39s + ", " + i_1_
                    + ", " + i_2_ + ", " + class10 + ", " + i_3_
                    + ", " + bool + ", " + i_4_ + ", " + i_5_
                    + ", " + i_6_ + ", " + is + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method455(int i, int i_44_, int i_45_, int i_46_, byte[] is,
                          Class39[] class39s, int i_47_, int i_48_, int i_49_,
                          int i_50_) {
        try {
            for (int i_51_ = 0; i_51_ < 8; i_51_++) {
                for (int i_52_ = 0; i_52_ < 8; i_52_++) {
                    if (i_50_ + i_51_ > 0 && i_50_ + i_51_ < 103
                            && i_44_ + i_52_ > 0 && i_44_ + i_52_ < 103)
                        class39s[i].anIntArrayArray682[i_50_ + i_51_]
                                [i_44_ + i_52_]
                                &= ~0x1000000;
                }
            }
            if (i_48_ != 6)
                anInt414 = 120;
            Buffer buffer
                    = new Buffer(is);
            for (int i_53_ = 0; i_53_ < 4; i_53_++) {
                for (int i_54_ = 0; i_54_ < 64; i_54_++) {
                    for (int i_55_ = 0; i_55_ < 64; i_55_++) {
                        if (i_53_ == i_45_ && i_54_ >= i_46_
                                && i_54_ < i_46_ + 8 && i_55_ >= i_47_
                                && i_55_ < i_47_ + 8)
                            method461(0, 0,
                                    i_50_ + Class42.method569(false, i_49_,
                                            i_54_ & 0x7,
                                            i_55_ & 0x7),
                                    buffer, 27458,
                                    i_44_ + Class42.method570(i_49_, 0,
                                            i_55_ & 0x7,
                                            i_54_ & 0x7),
                                    i, i_49_);
                        else
                            method461(0, 0, -1, buffer, 27458, -1,
                                    0, 0);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("56873, " + i + ", " + i_44_ + ", " + i_45_
                    + ", " + i_46_ + ", " + is + ", " + class39s
                    + ", " + i_47_ + ", " + i_48_ + ", " + i_49_
                    + ", " + i_50_ + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method457(boolean bool, byte[] is, Class39[] class39s, int i,
                          Class10 class10, int i_68_) {
        try {
            Buffer buffer
                    = new Buffer(is);
            if (!bool) {
                for (int i_69_ = 1; i_69_ > 0; i_69_++) {
                    /* empty */
                }
            }
            int i_70_ = -1;
            for (; ; ) {
                int i_71_ = buffer.readUSmart();
                if (i_71_ == 0)
                    break;
                i_70_ += i_71_;
                int i_72_ = 0;
                for (; ; ) {
                    int i_73_ = buffer.readUSmart();
                    if (i_73_ == 0)
                        break;
                    i_72_ += i_73_ - 1;
                    int i_74_ = i_72_ & 0x3f;
                    int i_75_ = i_72_ >> 6 & 0x3f;
                    int i_76_ = i_72_ >> 12;
                    int i_77_ = buffer.readUByte();
                    int i_78_ = i_77_ >> 2;
                    int i_79_ = i_77_ & 0x3;
                    int i_80_ = i_75_ + i_68_;
                    int i_81_ = i_74_ + i;
                    if (i_80_ > 0 && i_81_ > 0 && i_80_ < 103 && i_81_ < 103) {
                        int i_82_ = i_76_;
                        if ((aByteArrayArrayArray418[1][i_80_][i_81_] & 0x2)
                                == 2)
                            i_82_--;
                        Class39 class39 = null;
                        if (i_82_ >= 0)
                            class39 = class39s[i_82_];
                        method463(i_70_, i_78_, i_79_, i_80_, 0, i_76_,
                                class39, class10, i_81_);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("95150, " + bool + ", " + is + ", " + class39s
                    + ", " + i + ", " + class10 + ", " + i_68_
                    + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method458(Class10 class10, byte i, Class39[] class39s) {
        try {
            for (int i_83_ = 0; i_83_ < 4; i_83_++) {
                for (int i_84_ = 0; i_84_ < 104; i_84_++) {
                    for (int i_85_ = 0; i_85_ < 104; i_85_++) {
                        if ((aByteArrayArrayArray418[i_83_][i_84_][i_85_]
                                & 0x1)
                                == 1) {
                            int i_86_ = i_83_;
                            if ((aByteArrayArrayArray418[1][i_84_][i_85_]
                                    & 0x2)
                                    == 2)
                                i_86_--;
                            if (i_86_ >= 0)
                                class39s[i_86_].method519(i_85_, i_84_, true);
                        }
                    }
                }
            }
            anInt422 += (int) (Math.random() * 5.0) - 2;
            if (anInt422 < -8)
                anInt422 = -8;
            if (anInt422 > 8)
                anInt422 = 8;
            anInt425 += (int) (Math.random() * 5.0) - 2;
            if (anInt425 < -16)
                anInt425 = -16;
            if (anInt425 > 16)
                anInt425 = 16;
            for (int i_87_ = 0; i_87_ < 4; i_87_++) {
                byte[][] is = aByteArrayArrayArray424[i_87_];
                int i_88_ = 96;
                int i_89_ = 768;
                int i_90_ = -50;
                int i_91_ = -10;
                int i_92_ = -50;
                int i_93_
                        = (int) Math.sqrt(i_90_ * i_90_ + i_91_ * i_91_
                        + i_92_ * i_92_);
                int i_94_ = i_89_ * i_93_ >> 8;
                for (int i_95_ = 1; i_95_ < anInt428 - 1; i_95_++) {
                    for (int i_96_ = 1; i_96_ < anInt427 - 1; i_96_++) {
                        int i_97_
                                = (anIntArrayArrayArray413[i_87_][i_96_ + 1][i_95_]
                                - (anIntArrayArrayArray413[i_87_][i_96_ - 1]
                                [i_95_]));
                        int i_98_
                                = (anIntArrayArrayArray413[i_87_][i_96_][i_95_ + 1]
                                - (anIntArrayArrayArray413[i_87_][i_96_]
                                [i_95_ - 1]));
                        int i_99_
                                = (int) Math.sqrt(i_97_ * i_97_ + 65536
                                + i_98_ * i_98_);
                        int i_100_ = (i_97_ << 8) / i_99_;
                        int i_101_ = 65536 / i_99_;
                        int i_102_ = (i_98_ << 8) / i_99_;
                        int i_103_ = i_88_ + (i_90_ * i_100_ + i_91_ * i_101_
                                + i_92_ * i_102_) / i_94_;
                        int i_104_ = ((is[i_96_ - 1][i_95_] >> 2)
                                + (is[i_96_ + 1][i_95_] >> 3)
                                + (is[i_96_][i_95_ - 1] >> 2)
                                + (is[i_96_][i_95_ + 1] >> 3)
                                + (is[i_96_][i_95_] >> 1));
                        anIntArrayArray421[i_96_][i_95_] = i_103_ - i_104_;
                    }
                }
                for (int i_105_ = 0; i_105_ < anInt428; i_105_++) {
                    anIntArray402[i_105_] = 0;
                    anIntArray403[i_105_] = 0;
                    anIntArray404[i_105_] = 0;
                    anIntArray405[i_105_] = 0;
                    anIntArray406[i_105_] = 0;
                }
                for (int i_106_ = -5; i_106_ < anInt427 + 5; i_106_++) {
                    for (int i_107_ = 0; i_107_ < anInt428; i_107_++) {
                        int i_108_ = i_106_ + 5;
                        if (i_108_ >= 0 && i_108_ < anInt427) {
                            int i_109_ = ((aByteArrayArrayArray410[i_87_]
                                    [i_108_][i_107_])
                                    & 0xff);
                            if (i_109_ > 0) {
                                FloorConfig floorConfig
                                        = FloorConfig.aFloorConfigArray489[i_109_ - 1];
                                anIntArray402[i_107_] += floorConfig.anInt498;
                                anIntArray403[i_107_] += floorConfig.anInt496;
                                anIntArray404[i_107_] += floorConfig.anInt497;
                                anIntArray405[i_107_] += floorConfig.anInt499;
                                anIntArray406[i_107_]++;
                            }
                        }
                        int i_110_ = i_106_ - 5;
                        if (i_110_ >= 0 && i_110_ < anInt427) {
                            int i_111_ = ((aByteArrayArrayArray410[i_87_]
                                    [i_110_][i_107_])
                                    & 0xff);
                            if (i_111_ > 0) {
                                FloorConfig floorConfig
                                        = FloorConfig.aFloorConfigArray489[i_111_ - 1];
                                anIntArray402[i_107_] -= floorConfig.anInt498;
                                anIntArray403[i_107_] -= floorConfig.anInt496;
                                anIntArray404[i_107_] -= floorConfig.anInt497;
                                anIntArray405[i_107_] -= floorConfig.anInt499;
                                anIntArray406[i_107_]--;
                            }
                        }
                    }
                    if (i_106_ >= 1 && i_106_ < anInt427 - 1) {
                        int i_112_ = 0;
                        int i_113_ = 0;
                        int i_114_ = 0;
                        int i_115_ = 0;
                        int i_116_ = 0;
                        for (int i_117_ = -5; i_117_ < anInt428 + 5;
                             i_117_++) {
                            int i_118_ = i_117_ + 5;
                            if (i_118_ >= 0 && i_118_ < anInt428) {
                                i_112_ += anIntArray402[i_118_];
                                i_113_ += anIntArray403[i_118_];
                                i_114_ += anIntArray404[i_118_];
                                i_115_ += anIntArray405[i_118_];
                                i_116_ += anIntArray406[i_118_];
                            }
                            int i_119_ = i_117_ - 5;
                            if (i_119_ >= 0 && i_119_ < anInt428) {
                                i_112_ -= anIntArray402[i_119_];
                                i_113_ -= anIntArray403[i_119_];
                                i_114_ -= anIntArray404[i_119_];
                                i_115_ -= anIntArray405[i_119_];
                                i_116_ -= anIntArray406[i_119_];
                            }
                            if (i_117_ >= 1 && i_117_ < anInt428 - 1
                                    && (!aBoolean433
                                    || ((aByteArrayArrayArray418[0][i_106_]
                                    [i_117_])
                                    & 0x2) != 0
                                    || (((aByteArrayArrayArray418[i_87_]
                                    [i_106_][i_117_])
                                    & 0x10) == 0
                                    && method466(i_87_, (byte) 2, i_117_,
                                    i_106_) == anInt416))) {
                                if (i_87_ < anInt426)
                                    anInt426 = i_87_;
                                int i_120_ = ((aByteArrayArrayArray410[i_87_]
                                        [i_106_][i_117_])
                                        & 0xff);
                                int i_121_ = ((aByteArrayArrayArray423[i_87_]
                                        [i_106_][i_117_])
                                        & 0xff);
                                if (i_120_ > 0 || i_121_ > 0) {
                                    int i_122_ = (anIntArrayArrayArray413
                                            [i_87_][i_106_][i_117_]);
                                    int i_123_ = (anIntArrayArrayArray413
                                            [i_87_][i_106_ + 1][i_117_]);
                                    int i_124_
                                            = (anIntArrayArrayArray413[i_87_]
                                            [i_106_ + 1][i_117_ + 1]);
                                    int i_125_ = (anIntArrayArrayArray413
                                            [i_87_][i_106_][i_117_ + 1]);
                                    int i_126_
                                            = anIntArrayArray421[i_106_][i_117_];
                                    int i_127_ = (anIntArrayArray421
                                            [i_106_ + 1][i_117_]);
                                    int i_128_ = (anIntArrayArray421
                                            [i_106_ + 1][i_117_ + 1]);
                                    int i_129_ = (anIntArrayArray421[i_106_]
                                            [i_117_ + 1]);
                                    int i_130_ = -1;
                                    int i_131_ = -1;
                                    if (i_120_ > 0) {
                                        int i_132_ = i_112_ * 256 / i_115_;
                                        int i_133_ = i_113_ / i_116_;
                                        int i_134_ = i_114_ / i_116_;
                                        i_130_ = method465(i_132_, i_133_,
                                                i_134_);
                                        i_132_ = i_132_ + anInt422 & 0xff;
                                        i_134_ += anInt425;
                                        if (i_134_ < 0)
                                            i_134_ = 0;
                                        else if (i_134_ > 255)
                                            i_134_ = 255;
                                        i_131_ = method465(i_132_, i_133_,
                                                i_134_);
                                    }
                                    if (i_87_ > 0) {
                                        boolean bool = i_120_ != 0
                                                || (aByteArrayArrayArray435[i_87_]
                                                [i_106_][i_117_]) == 0;
                                        if (i_121_ > 0
                                                && !(FloorConfig.aFloorConfigArray489
                                                [i_121_ - 1].aBoolean494))
                                            bool = false;
                                        if (bool && i_122_ == i_123_
                                                && i_122_ == i_124_
                                                && i_122_ == i_125_)
                                            anIntArrayArrayArray408[i_87_]
                                                    [i_106_][i_117_]
                                                    |= 0x924;
                                    }
                                    int i_135_ = 0;
                                    if (i_130_ != -1)
                                        i_135_ = (CacheableNode_Sub1_Sub4_
                                                .anIntArray1646
                                                [method452(i_131_, 96)]);
                                    if (i_121_ == 0)
                                        class10.method199
                                                (i_87_, i_106_, i_117_, 0, 0, -1,
                                                        i_122_, i_123_, i_124_, i_125_,
                                                        method452(i_130_, i_126_),
                                                        method452(i_130_, i_127_),
                                                        method452(i_130_, i_128_),
                                                        method452(i_130_, i_129_), 0, 0,
                                                        0, 0, i_135_, 0);
                                    else {
                                        int i_136_ = ((aByteArrayArrayArray435
                                                [i_87_][i_106_][i_117_])
                                                + 1);
                                        byte i_137_
                                                = (aByteArrayArrayArray431[i_87_]
                                                [i_106_][i_117_]);
                                        FloorConfig floorConfig
                                                = (FloorConfig.aFloorConfigArray489
                                                [i_121_ - 1]);
                                        int i_138_ = floorConfig.anInt492;
                                        int i_139_;
                                        int i_140_;
                                        if (i_138_ >= 0) {
                                            i_139_ = (CacheableNode_Sub1_Sub4_
                                                    .method369
                                                            (i_138_, aBoolean417));
                                            i_140_ = -1;
                                        } else if (floorConfig.anInt491
                                                == 16711935) {
                                            i_139_ = 0;
                                            i_140_ = -2;
                                            i_138_ = -1;
                                        } else {
                                            i_140_
                                                    = method465(floorConfig.anInt495,
                                                    floorConfig.anInt496,
                                                    floorConfig.anInt497);
                                            i_139_
                                                    = (CacheableNode_Sub1_Sub4_
                                                    .anIntArray1646
                                                    [method469(floorConfig.anInt500,
                                                    96)]);
                                        }
                                        class10.method199
                                                (i_87_, i_106_, i_117_, i_136_,
                                                        i_137_, i_138_, i_122_, i_123_,
                                                        i_124_, i_125_,
                                                        method452(i_130_, i_126_),
                                                        method452(i_130_, i_127_),
                                                        method452(i_130_, i_128_),
                                                        method452(i_130_, i_129_),
                                                        method469(i_140_, i_126_),
                                                        method469(i_140_, i_127_),
                                                        method469(i_140_, i_128_),
                                                        method469(i_140_, i_129_), i_135_,
                                                        i_139_);
                                    }
                                }
                            }
                        }
                    }
                }
                for (int i_141_ = 1; i_141_ < anInt428 - 1; i_141_++) {
                    for (int i_142_ = 1; i_142_ < anInt427 - 1; i_142_++)
                        class10.method198(i_87_, i_142_, i_141_,
                                method466(i_87_, (byte) 2, i_141_,
                                        i_142_));
                }
            }
            class10.method225(-50, 64, 768, 5227, -50, -10);
            if (i != 6)
                aBoolean434 = !aBoolean434;
            for (int i_143_ = 0; i_143_ < anInt427; i_143_++) {
                for (int i_144_ = 0; i_144_ < anInt428; i_144_++) {
                    if ((aByteArrayArrayArray418[1][i_143_][i_144_] & 0x2)
                            == 2)
                        class10.method196(i_144_, true, i_143_);
                }
            }
            int i_145_ = 1;
            int i_146_ = 2;
            int i_147_ = 4;
            for (int i_148_ = 0; i_148_ < 4; i_148_++) {
                if (i_148_ > 0) {
                    i_145_ <<= 3;
                    i_146_ <<= 3;
                    i_147_ <<= 3;
                }
                for (int i_149_ = 0; i_149_ <= i_148_; i_149_++) {
                    for (int i_150_ = 0; i_150_ <= anInt428; i_150_++) {
                        for (int i_151_ = 0; i_151_ <= anInt427; i_151_++) {
                            if (((anIntArrayArrayArray408[i_149_][i_151_]
                                    [i_150_])
                                    & i_145_)
                                    != 0) {
                                int i_152_ = i_150_;
                                int i_153_ = i_150_;
                                int i_154_ = i_149_;
                                int i_155_ = i_149_;
                                for (/**/; i_152_ > 0; i_152_--) {
                                    if (((anIntArrayArrayArray408[i_149_]
                                            [i_151_][i_152_ - 1])
                                            & i_145_)
                                            == 0)
                                        break;
                                }
                                for (/**/; i_153_ < anInt428; i_153_++) {
                                    if (((anIntArrayArrayArray408[i_149_]
                                            [i_151_][i_153_ + 1])
                                            & i_145_)
                                            == 0)
                                        break;
                                }
                                while_1_:
                                for (/**/; i_154_ > 0; i_154_--) {
                                    for (int i_156_ = i_152_; i_156_ <= i_153_;
                                         i_156_++) {
                                        if (((anIntArrayArrayArray408
                                                [i_154_ - 1][i_151_][i_156_])
                                                & i_145_)
                                                == 0)
                                            break while_1_;
                                    }
                                }
                                while_2_:
                                for (/**/; i_155_ < i_148_; i_155_++) {
                                    for (int i_157_ = i_152_; i_157_ <= i_153_;
                                         i_157_++) {
                                        if (((anIntArrayArrayArray408
                                                [i_155_ + 1][i_151_][i_157_])
                                                & i_145_)
                                                == 0)
                                            break while_2_;
                                    }
                                }
                                int i_158_ = ((i_155_ + 1 - i_154_)
                                        * (i_153_ - i_152_ + 1));
                                if (i_158_ >= 8) {
                                    int i_159_ = 240;
                                    int i_160_ = ((anIntArrayArrayArray413
                                            [i_155_][i_151_][i_152_])
                                            - i_159_);
                                    int i_161_ = (anIntArrayArrayArray413
                                            [i_154_][i_151_][i_152_]);
                                    Class10.method197(i_161_, i_148_, true, 1,
                                            i_152_ * 128,
                                            i_151_ * 128, i_160_,
                                            i_151_ * 128,
                                            i_153_ * 128 + 128);
                                    for (int i_162_ = i_154_; i_162_ <= i_155_;
                                         i_162_++) {
                                        for (int i_163_ = i_152_;
                                             i_163_ <= i_153_; i_163_++)
                                            anIntArrayArrayArray408[i_162_]
                                                    [i_151_][i_163_]
                                                    &= i_145_ ^ 0xffffffff;
                                    }
                                }
                            }
                            if (((anIntArrayArrayArray408[i_149_][i_151_]
                                    [i_150_])
                                    & i_146_)
                                    != 0) {
                                int i_164_ = i_151_;
                                int i_165_ = i_151_;
                                int i_166_ = i_149_;
                                int i_167_ = i_149_;
                                for (/**/; i_164_ > 0; i_164_--) {
                                    if (((anIntArrayArrayArray408[i_149_]
                                            [i_164_ - 1][i_150_])
                                            & i_146_)
                                            == 0)
                                        break;
                                }
                                for (/**/; i_165_ < anInt427; i_165_++) {
                                    if (((anIntArrayArrayArray408[i_149_]
                                            [i_165_ + 1][i_150_])
                                            & i_146_)
                                            == 0)
                                        break;
                                }
                                while_3_:
                                for (/**/; i_166_ > 0; i_166_--) {
                                    for (int i_168_ = i_164_; i_168_ <= i_165_;
                                         i_168_++) {
                                        if (((anIntArrayArrayArray408
                                                [i_166_ - 1][i_168_][i_150_])
                                                & i_146_)
                                                == 0)
                                            break while_3_;
                                    }
                                }
                                while_4_:
                                for (/**/; i_167_ < i_148_; i_167_++) {
                                    for (int i_169_ = i_164_; i_169_ <= i_165_;
                                         i_169_++) {
                                        if (((anIntArrayArrayArray408
                                                [i_167_ + 1][i_169_][i_150_])
                                                & i_146_)
                                                == 0)
                                            break while_4_;
                                    }
                                }
                                int i_170_ = ((i_167_ + 1 - i_166_)
                                        * (i_165_ - i_164_ + 1));
                                if (i_170_ >= 8) {
                                    int i_171_ = 240;
                                    int i_172_ = ((anIntArrayArrayArray413
                                            [i_167_][i_164_][i_150_])
                                            - i_171_);
                                    int i_173_ = (anIntArrayArrayArray413
                                            [i_166_][i_164_][i_150_]);
                                    Class10.method197(i_173_, i_148_, true, 2,
                                            i_150_ * 128,
                                            i_164_ * 128, i_172_,
                                            i_165_ * 128 + 128,
                                            i_150_ * 128);
                                    for (int i_174_ = i_166_; i_174_ <= i_167_;
                                         i_174_++) {
                                        for (int i_175_ = i_164_;
                                             i_175_ <= i_165_; i_175_++)
                                            anIntArrayArrayArray408[i_174_]
                                                    [i_175_][i_150_]
                                                    &= i_146_ ^ 0xffffffff;
                                    }
                                }
                            }
                            if (((anIntArrayArrayArray408[i_149_][i_151_]
                                    [i_150_])
                                    & i_147_)
                                    != 0) {
                                int i_176_ = i_151_;
                                int i_177_ = i_151_;
                                int i_178_ = i_150_;
                                int i_179_ = i_150_;
                                for (/**/; i_178_ > 0; i_178_--) {
                                    if (((anIntArrayArrayArray408[i_149_]
                                            [i_151_][i_178_ - 1])
                                            & i_147_)
                                            == 0)
                                        break;
                                }
                                for (/**/; i_179_ < anInt428; i_179_++) {
                                    if (((anIntArrayArrayArray408[i_149_]
                                            [i_151_][i_179_ + 1])
                                            & i_147_)
                                            == 0)
                                        break;
                                }
                                while_5_:
                                for (/**/; i_176_ > 0; i_176_--) {
                                    for (int i_180_ = i_178_; i_180_ <= i_179_;
                                         i_180_++) {
                                        if (((anIntArrayArrayArray408[i_149_]
                                                [i_176_ - 1][i_180_])
                                                & i_147_)
                                                == 0)
                                            break while_5_;
                                    }
                                }
                                while_6_:
                                for (/**/; i_177_ < anInt427; i_177_++) {
                                    for (int i_181_ = i_178_; i_181_ <= i_179_;
                                         i_181_++) {
                                        if (((anIntArrayArrayArray408[i_149_]
                                                [i_177_ + 1][i_181_])
                                                & i_147_)
                                                == 0)
                                            break while_6_;
                                    }
                                }
                                if ((i_177_ - i_176_ + 1) * (i_179_ - i_178_
                                        + 1)
                                        >= 4) {
                                    int i_182_ = (anIntArrayArrayArray413
                                            [i_149_][i_176_][i_178_]);
                                    Class10.method197(i_182_, i_148_, true, 4,
                                            i_178_ * 128,
                                            i_176_ * 128, i_182_,
                                            i_177_ * 128 + 128,
                                            i_179_ * 128 + 128);
                                    for (int i_183_ = i_176_; i_183_ <= i_177_;
                                         i_183_++) {
                                        for (int i_184_ = i_178_;
                                             i_184_ <= i_179_; i_184_++)
                                            anIntArrayArrayArray408[i_149_]
                                                    [i_183_][i_184_]
                                                    &= i_147_ ^ 0xffffffff;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("80819, " + class10 + ", " + i + ", "
                    + class39s + ", "
                    + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method459(int i, byte i_185_, int i_186_, int i_187_,
                          int i_188_) {
        try {
            if (i_185_ != 46)
                aBoolean434 = !aBoolean434;
            for (int i_189_ = i_188_; i_189_ <= i_188_ + i_186_; i_189_++) {
                for (int i_190_ = i; i_190_ <= i + i_187_; i_190_++) {
                    if (i_190_ >= 0 && i_190_ < anInt427 && i_189_ >= 0
                            && i_189_ < anInt428) {
                        aByteArrayArrayArray424[0][i_190_][i_189_]
                                = (byte) 127;
                        if (i_190_ == i && i_190_ > 0)
                            anIntArrayArrayArray413[0][i_190_][i_189_]
                                    = (anIntArrayArrayArray413[0][i_190_ - 1]
                                    [i_189_]);
                        if (i_190_ == i + i_187_ && i_190_ < anInt427 - 1)
                            anIntArrayArrayArray413[0][i_190_][i_189_]
                                    = (anIntArrayArrayArray413[0][i_190_ + 1]
                                    [i_189_]);
                        if (i_189_ == i_188_ && i_189_ > 0)
                            anIntArrayArrayArray413[0][i_190_][i_189_]
                                    = (anIntArrayArrayArray413[0][i_190_]
                                    [i_189_ - 1]);
                        if (i_189_ == i_188_ + i_186_ && i_189_ < anInt428 - 1)
                            anIntArrayArrayArray413[0][i_190_][i_189_]
                                    = (anIntArrayArrayArray413[0][i_190_]
                                    [i_189_ + 1]);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("75042, " + i + ", " + i_185_ + ", " + i_186_
                    + ", " + i_187_ + ", " + i_188_ + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method461(int i, int i_195_, int i_196_,
                          Buffer buffer, int i_197_,
                          int i_198_, int i_199_, int i_200_) {
        try {
            if (i_197_ == 27458) {
                if (i_196_ >= 0 && i_196_ < 104 && i_198_ >= 0
                        && i_198_ < 104) {
                    aByteArrayArrayArray418[i_199_][i_196_][i_198_] = (byte) 0;
                    for (; ; ) {
                        int i_201_ = buffer.readUByte();
                        if (i_201_ == 0) {
                            if (i_199_ == 0)
                                anIntArrayArrayArray413[0][i_196_][i_198_]
                                        = -method471(932731 + i_196_ + i,
                                        556238 + i_198_ + i_195_) * 8;
                            else {
                                anIntArrayArrayArray413[i_199_][i_196_][i_198_]
                                        = (anIntArrayArrayArray413[i_199_ - 1]
                                        [i_196_][i_198_]) - 240;
                                break;
                            }
                            break;
                        }
                        if (i_201_ == 1) {
                            int i_202_ = buffer.readUByte();
                            if (i_202_ == 1)
                                i_202_ = 0;
                            if (i_199_ == 0)
                                anIntArrayArrayArray413[0][i_196_][i_198_]
                                        = -i_202_ * 8;
                            else {
                                anIntArrayArrayArray413[i_199_][i_196_][i_198_]
                                        = (anIntArrayArrayArray413[i_199_ - 1]
                                        [i_196_][i_198_]) - i_202_ * 8;
                                break;
                            }
                            break;
                        }
                        if (i_201_ <= 49) {
                            aByteArrayArrayArray423[i_199_][i_196_][i_198_]
                                    = buffer.readByte();
                            aByteArrayArrayArray435[i_199_][i_196_][i_198_]
                                    = (byte) ((i_201_ - 2) / 4);
                            aByteArrayArrayArray431[i_199_][i_196_][i_198_]
                                    = (byte) (i_201_ - 2 + i_200_ & 0x3);
                        } else if (i_201_ <= 81)
                            aByteArrayArrayArray418[i_199_][i_196_][i_198_]
                                    = (byte) (i_201_ - 49);
                        else
                            aByteArrayArrayArray410[i_199_][i_196_][i_198_]
                                    = (byte) (i_201_ - 81);
                    }
                } else {
                    for (; ; ) {
                        int i_203_ = buffer.readUByte();
                        if (i_203_ == 0)
                            break;
                        if (i_203_ == 1) {
                            buffer.readUByte();
                            break;
                        }
                        if (i_203_ <= 49)
                            buffer.readUByte();
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("40984, " + i + ", " + i_195_ + ", " + i_196_
                    + ", " + buffer + ", " + i_197_
                    + ", " + i_198_ + ", " + i_199_ + ", "
                    + i_200_ + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method463(int i, int i_210_, int i_211_, int i_212_,
                          int i_213_, int i_214_, Class39 class39,
                          Class10 class10, int i_215_) {
        try {
            if (!aBoolean433
                    || (aByteArrayArrayArray418[0][i_212_][i_215_] & 0x2) != 0
                    || (((aByteArrayArrayArray418[i_214_][i_212_][i_215_] & 0x10)
                    == 0)
                    && (method466(i_214_, (byte) 2, i_215_, i_212_)
                    == anInt416))) {
                if (i_214_ < anInt426)
                    anInt426 = i_214_;
                int i_216_ = anIntArrayArrayArray413[i_214_][i_212_][i_215_];
                int i_217_
                        = anIntArrayArrayArray413[i_214_][i_212_ + 1][i_215_];
                int i_218_
                        = anIntArrayArrayArray413[i_214_][i_212_ + 1][i_215_ + 1];
                int i_219_
                        = anIntArrayArrayArray413[i_214_][i_212_][i_215_ + 1];
                int i_220_ = i_216_ + i_217_ + i_218_ + i_219_ >> 2;
                LocationConfig locationConfig = LocationConfig.readDefinition(i);
                int i_221_ = i_212_ + (i_215_ << 7) + (i << 14) + 1073741824;
                if (!locationConfig.aBoolean260)
                    i_221_ += -2147483648;
                byte i_222_ = (byte) ((i_211_ << 6) + i_210_);
                if (i_213_ != 0)
                    aBoolean419 = !aBoolean419;
                if (i_210_ == 22) {
                    if (!aBoolean433 || locationConfig.aBoolean260
                            || locationConfig.aBoolean264) {
                        CacheableNode_Sub1_ class13_sub1_sub1;
                        if (locationConfig.anInt282 == -1
                                && locationConfig.anIntArray243 == null)
                            class13_sub1_sub1
                                    = locationConfig.method419(22, i_211_, i_216_, i_217_,
                                    i_218_, i_219_, -1);
                        else
                            class13_sub1_sub1
                                    = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                    i_218_, i_211_,
                                    locationConfig.anInt282,
                                    i_217_, true, 22,
                                    29895, i);
                        class10.method200(class13_sub1_sub1, i_214_, false,
                                i_221_, i_215_, i_222_, i_212_,
                                i_220_);
                        if (locationConfig.aBoolean258 && locationConfig.aBoolean260
                                && class39 != null)
                            class39.method519(i_215_, i_212_, true);
                    }
                } else if (i_210_ == 10 || i_210_ == 11) {
                    CacheableNode_Sub1_ class13_sub1_sub1;
                    if (locationConfig.anInt282 == -1
                            && locationConfig.anIntArray243 == null)
                        class13_sub1_sub1
                                = locationConfig.method419(10, i_211_, i_216_, i_217_,
                                i_218_, i_219_, -1);
                    else
                        class13_sub1_sub1
                                = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                i_218_, i_211_,
                                locationConfig.anInt282,
                                i_217_, true, 10,
                                29895, i);
                    if (class13_sub1_sub1 != null) {
                        int i_223_ = 0;
                        if (i_210_ == 11)
                            i_223_ += 256;
                        int i_224_;
                        int i_225_;
                        if (i_211_ == 1 || i_211_ == 3) {
                            i_224_ = locationConfig.anInt253;
                            i_225_ = locationConfig.anInt259;
                        } else {
                            i_224_ = locationConfig.anInt259;
                            i_225_ = locationConfig.anInt253;
                        }
                        if (class10.method204(i_225_, i_222_, i_220_, i_212_,
                                i_223_, i_224_, i_215_, 22342,
                                i_221_, i_214_,
                                class13_sub1_sub1)
                                && locationConfig.aBoolean286) {
                            Model class13_sub1_sub1_sub4;
                            if (class13_sub1_sub1
                                    instanceof Model)
                                class13_sub1_sub1_sub4
                                        = ((Model)
                                        class13_sub1_sub1);
                            else
                                class13_sub1_sub1_sub4
                                        = locationConfig.method419(10, i_211_, i_216_,
                                        i_217_, i_218_, i_219_,
                                        -1);
                            if (class13_sub1_sub1_sub4 != null) {
                                for (int i_226_ = 0; i_226_ <= i_224_;
                                     i_226_++) {
                                    for (int i_227_ = 0; i_227_ <= i_225_;
                                         i_227_++) {
                                        int i_228_
                                                = (class13_sub1_sub1_sub4.anInt1520
                                                / 4);
                                        if (i_228_ > 30)
                                            i_228_ = 30;
                                        if (i_228_ > (aByteArrayArrayArray424
                                                [i_214_][i_212_ + i_226_]
                                                [i_215_ + i_227_]))
                                            aByteArrayArrayArray424[i_214_]
                                                    [i_212_ + i_226_]
                                                    [i_215_ + i_227_]
                                                    = (byte) i_228_;
                                    }
                                }
                            }
                        }
                    }
                    if (locationConfig.aBoolean258 && class39 != null)
                        class39.method518(i_211_, locationConfig.aBoolean270,
                                locationConfig.anInt253, locationConfig.anInt259,
                                i_212_, (byte) -63, i_215_);
                } else if (i_210_ >= 12) {
                    CacheableNode_Sub1_ class13_sub1_sub1;
                    if (locationConfig.anInt282 == -1
                            && locationConfig.anIntArray243 == null)
                        class13_sub1_sub1
                                = locationConfig.method419(i_210_, i_211_, i_216_, i_217_,
                                i_218_, i_219_, -1);
                    else
                        class13_sub1_sub1
                                = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                i_218_, i_211_,
                                locationConfig.anInt282,
                                i_217_, true, i_210_,
                                29895, i);
                    class10.method204(1, i_222_, i_220_, i_212_, 0, 1, i_215_,
                            22342, i_221_, i_214_,
                            class13_sub1_sub1);
                    if (i_210_ >= 12 && i_210_ <= 17 && i_210_ != 13
                            && i_214_ > 0)
                        anIntArrayArrayArray408[i_214_][i_212_][i_215_]
                                |= 0x924;
                    if (locationConfig.aBoolean258 && class39 != null)
                        class39.method518(i_211_, locationConfig.aBoolean270,
                                locationConfig.anInt253, locationConfig.anInt259,
                                i_212_, (byte) -63, i_215_);
                } else if (i_210_ == 0) {
                    CacheableNode_Sub1_ class13_sub1_sub1;
                    if (locationConfig.anInt282 == -1
                            && locationConfig.anIntArray243 == null)
                        class13_sub1_sub1
                                = locationConfig.method419(0, i_211_, i_216_, i_217_,
                                i_218_, i_219_, -1);
                    else
                        class13_sub1_sub1
                                = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                i_218_, i_211_,
                                locationConfig.anInt282,
                                i_217_, true, 0,
                                29895, i);
                    class10.method202(class13_sub1_sub1, i_214_, aBoolean407,
                            null, i_212_, i_222_, i_221_, i_220_,
                            anIntArray411[i_211_], 0, i_215_);
                    if (i_211_ == 0) {
                        if (locationConfig.aBoolean286) {
                            aByteArrayArrayArray424[i_214_][i_212_][i_215_]
                                    = (byte) 50;
                            aByteArrayArrayArray424[i_214_][i_212_][i_215_ + 1]
                                    = (byte) 50;
                        }
                        if (locationConfig.aBoolean251)
                            anIntArrayArrayArray408[i_214_][i_212_][i_215_]
                                    |= 0x249;
                    } else if (i_211_ == 1) {
                        if (locationConfig.aBoolean286) {
                            aByteArrayArrayArray424[i_214_][i_212_][i_215_ + 1]
                                    = (byte) 50;
                            aByteArrayArrayArray424[i_214_][i_212_ + 1][(i_215_
                                    + 1)]
                                    = (byte) 50;
                        }
                        if (locationConfig.aBoolean251)
                            anIntArrayArrayArray408[i_214_][i_212_][i_215_ + 1]
                                    |= 0x492;
                    } else if (i_211_ == 2) {
                        if (locationConfig.aBoolean286) {
                            aByteArrayArrayArray424[i_214_][i_212_ + 1][i_215_]
                                    = (byte) 50;
                            aByteArrayArrayArray424[i_214_][i_212_ + 1][(i_215_
                                    + 1)]
                                    = (byte) 50;
                        }
                        if (locationConfig.aBoolean251)
                            anIntArrayArrayArray408[i_214_][i_212_ + 1][i_215_]
                                    |= 0x249;
                    } else if (i_211_ == 3) {
                        if (locationConfig.aBoolean286) {
                            aByteArrayArrayArray424[i_214_][i_212_][i_215_]
                                    = (byte) 50;
                            aByteArrayArrayArray424[i_214_][i_212_ + 1][i_215_]
                                    = (byte) 50;
                        }
                        if (locationConfig.aBoolean251)
                            anIntArrayArrayArray408[i_214_][i_212_][i_215_]
                                    |= 0x492;
                    }
                    if (locationConfig.aBoolean258 && class39 != null)
                        class39.method517(i_215_, i_210_, locationConfig.aBoolean270,
                                i_212_, 544, i_211_);
                    if (locationConfig.anInt269 != 16)
                        class10.method210(locationConfig.anInt269, 533, i_215_,
                                i_212_, i_214_);
                } else if (i_210_ == 1) {
                    CacheableNode_Sub1_ class13_sub1_sub1;
                    if (locationConfig.anInt282 == -1
                            && locationConfig.anIntArray243 == null)
                        class13_sub1_sub1
                                = locationConfig.method419(1, i_211_, i_216_, i_217_,
                                i_218_, i_219_, -1);
                    else
                        class13_sub1_sub1
                                = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                i_218_, i_211_,
                                locationConfig.anInt282,
                                i_217_, true, 1,
                                29895, i);
                    class10.method202(class13_sub1_sub1, i_214_, aBoolean407,
                            null, i_212_, i_222_, i_221_, i_220_,
                            anIntArray409[i_211_], 0, i_215_);
                    if (locationConfig.aBoolean286) {
                        if (i_211_ == 0)
                            aByteArrayArrayArray424[i_214_][i_212_][i_215_ + 1]
                                    = (byte) 50;
                        else if (i_211_ == 1)
                            aByteArrayArrayArray424[i_214_][i_212_ + 1][(i_215_
                                    + 1)]
                                    = (byte) 50;
                        else if (i_211_ == 2)
                            aByteArrayArrayArray424[i_214_][i_212_ + 1][i_215_]
                                    = (byte) 50;
                        else if (i_211_ == 3)
                            aByteArrayArrayArray424[i_214_][i_212_][i_215_]
                                    = (byte) 50;
                    }
                    if (locationConfig.aBoolean258 && class39 != null)
                        class39.method517(i_215_, i_210_, locationConfig.aBoolean270,
                                i_212_, 544, i_211_);
                } else if (i_210_ == 2) {
                    int i_229_ = i_211_ + 1 & 0x3;
                    CacheableNode_Sub1_ class13_sub1_sub1;
                    CacheableNode_Sub1_ class13_sub1_sub1_230_;
                    if (locationConfig.anInt282 == -1
                            && locationConfig.anIntArray243 == null) {
                        class13_sub1_sub1
                                = locationConfig.method419(2, 4 + i_211_, i_216_, i_217_,
                                i_218_, i_219_, -1);
                        class13_sub1_sub1_230_
                                = locationConfig.method419(2, i_229_, i_216_, i_217_,
                                i_218_, i_219_, -1);
                    } else {
                        class13_sub1_sub1
                                = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                i_218_, 4 + i_211_,
                                locationConfig.anInt282,
                                i_217_, true, 2,
                                29895, i);
                        class13_sub1_sub1_230_
                                = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                i_218_, i_229_,
                                locationConfig.anInt282,
                                i_217_, true, 2,
                                29895, i);
                    }
                    class10.method202(class13_sub1_sub1, i_214_, aBoolean407,
                            class13_sub1_sub1_230_, i_212_, i_222_,
                            i_221_, i_220_, anIntArray411[i_211_],
                            anIntArray411[i_229_], i_215_);
                    if (locationConfig.aBoolean251) {
                        if (i_211_ == 0) {
                            anIntArrayArrayArray408[i_214_][i_212_][i_215_]
                                    |= 0x249;
                            anIntArrayArrayArray408[i_214_][i_212_][i_215_ + 1]
                                    |= 0x492;
                        } else if (i_211_ == 1) {
                            anIntArrayArrayArray408[i_214_][i_212_][i_215_ + 1]
                                    |= 0x492;
                            anIntArrayArrayArray408[i_214_][i_212_ + 1][i_215_]
                                    |= 0x249;
                        } else if (i_211_ == 2) {
                            anIntArrayArrayArray408[i_214_][i_212_ + 1][i_215_]
                                    |= 0x249;
                            anIntArrayArrayArray408[i_214_][i_212_][i_215_]
                                    |= 0x492;
                        } else if (i_211_ == 3) {
                            anIntArrayArrayArray408[i_214_][i_212_][i_215_]
                                    |= 0x492;
                            anIntArrayArrayArray408[i_214_][i_212_][i_215_]
                                    |= 0x249;
                        }
                    }
                    if (locationConfig.aBoolean258 && class39 != null)
                        class39.method517(i_215_, i_210_, locationConfig.aBoolean270,
                                i_212_, 544, i_211_);
                    if (locationConfig.anInt269 != 16)
                        class10.method210(locationConfig.anInt269, 533, i_215_,
                                i_212_, i_214_);
                } else if (i_210_ == 3) {
                    CacheableNode_Sub1_ class13_sub1_sub1;
                    if (locationConfig.anInt282 == -1
                            && locationConfig.anIntArray243 == null)
                        class13_sub1_sub1
                                = locationConfig.method419(3, i_211_, i_216_, i_217_,
                                i_218_, i_219_, -1);
                    else
                        class13_sub1_sub1
                                = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                i_218_, i_211_,
                                locationConfig.anInt282,
                                i_217_, true, 3,
                                29895, i);
                    class10.method202(class13_sub1_sub1, i_214_, aBoolean407,
                            null, i_212_, i_222_, i_221_, i_220_,
                            anIntArray409[i_211_], 0, i_215_);
                    if (locationConfig.aBoolean286) {
                        if (i_211_ == 0)
                            aByteArrayArrayArray424[i_214_][i_212_][i_215_ + 1]
                                    = (byte) 50;
                        else if (i_211_ == 1)
                            aByteArrayArrayArray424[i_214_][i_212_ + 1][(i_215_
                                    + 1)]
                                    = (byte) 50;
                        else if (i_211_ == 2)
                            aByteArrayArrayArray424[i_214_][i_212_ + 1][i_215_]
                                    = (byte) 50;
                        else if (i_211_ == 3)
                            aByteArrayArrayArray424[i_214_][i_212_][i_215_]
                                    = (byte) 50;
                    }
                    if (locationConfig.aBoolean258 && class39 != null)
                        class39.method517(i_215_, i_210_, locationConfig.aBoolean270,
                                i_212_, 544, i_211_);
                } else if (i_210_ == 9) {
                    CacheableNode_Sub1_ class13_sub1_sub1;
                    if (locationConfig.anInt282 == -1
                            && locationConfig.anIntArray243 == null)
                        class13_sub1_sub1
                                = locationConfig.method419(i_210_, i_211_, i_216_, i_217_,
                                i_218_, i_219_, -1);
                    else
                        class13_sub1_sub1
                                = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                i_218_, i_211_,
                                locationConfig.anInt282,
                                i_217_, true, i_210_,
                                29895, i);
                    class10.method204(1, i_222_, i_220_, i_212_, 0, 1, i_215_,
                            22342, i_221_, i_214_,
                            class13_sub1_sub1);
                    if (locationConfig.aBoolean258 && class39 != null)
                        class39.method518(i_211_, locationConfig.aBoolean270,
                                locationConfig.anInt253, locationConfig.anInt259,
                                i_212_, (byte) -63, i_215_);
                } else {
                    if (locationConfig.aBoolean263) {
                        if (i_211_ == 1) {
                            int i_231_ = i_219_;
                            i_219_ = i_218_;
                            i_218_ = i_217_;
                            i_217_ = i_216_;
                            i_216_ = i_231_;
                        } else if (i_211_ == 2) {
                            int i_232_ = i_219_;
                            i_219_ = i_217_;
                            i_217_ = i_232_;
                            i_232_ = i_218_;
                            i_218_ = i_216_;
                            i_216_ = i_232_;
                        } else if (i_211_ == 3) {
                            int i_233_ = i_219_;
                            i_219_ = i_216_;
                            i_216_ = i_217_;
                            i_217_ = i_218_;
                            i_218_ = i_233_;
                        }
                    }
                    if (i_210_ == 4) {
                        CacheableNode_Sub1_ class13_sub1_sub1;
                        if (locationConfig.anInt282 == -1
                                && locationConfig.anIntArray243 == null)
                            class13_sub1_sub1
                                    = locationConfig.method419(4, 0, i_216_, i_217_,
                                    i_218_, i_219_, -1);
                        else
                            class13_sub1_sub1
                                    = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                    i_218_, 0,
                                    locationConfig.anInt282,
                                    i_217_, true, 4,
                                    29895, i);
                        class10.method203(i_212_, i_221_, i_222_, i_211_ * 512,
                                i_220_, 0, anIntArray411[i_211_],
                                (byte) -122, i_215_, i_214_,
                                class13_sub1_sub1, 0);
                    } else if (i_210_ == 5) {
                        int i_234_ = 16;
                        int i_235_ = class10.method220(i_214_, i_212_, i_215_);
                        if (i_235_ > 0)
                            i_234_ = (LocationConfig.readDefinition(i_235_ >> 14 & 0x7fff)
                                    .anInt269);
                        CacheableNode_Sub1_ class13_sub1_sub1;
                        if (locationConfig.anInt282 == -1
                                && locationConfig.anIntArray243 == null)
                            class13_sub1_sub1
                                    = locationConfig.method419(4, 0, i_216_, i_217_,
                                    i_218_, i_219_, -1);
                        else
                            class13_sub1_sub1
                                    = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                    i_218_, 0,
                                    locationConfig.anInt282,
                                    i_217_, true, 4,
                                    29895, i);
                        class10.method203(i_212_, i_221_, i_222_, i_211_ * 512,
                                i_220_,
                                anIntArray430[i_211_] * i_234_,
                                anIntArray411[i_211_], (byte) -122,
                                i_215_, i_214_, class13_sub1_sub1,
                                anIntArray432[i_211_] * i_234_);
                    } else if (i_210_ == 6) {
                        CacheableNode_Sub1_ class13_sub1_sub1;
                        if (locationConfig.anInt282 == -1
                                && locationConfig.anIntArray243 == null)
                            class13_sub1_sub1
                                    = locationConfig.method419(4, 0, i_216_, i_217_,
                                    i_218_, i_219_, -1);
                        else
                            class13_sub1_sub1
                                    = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                    i_218_, 0,
                                    locationConfig.anInt282,
                                    i_217_, true, 4,
                                    29895, i);
                        class10.method203(i_212_, i_221_, i_222_, i_211_,
                                i_220_, 0, 256, (byte) -122, i_215_,
                                i_214_, class13_sub1_sub1, 0);
                    } else if (i_210_ == 7) {
                        CacheableNode_Sub1_ class13_sub1_sub1;
                        if (locationConfig.anInt282 == -1
                                && locationConfig.anIntArray243 == null)
                            class13_sub1_sub1
                                    = locationConfig.method419(4, 0, i_216_, i_217_,
                                    i_218_, i_219_, -1);
                        else
                            class13_sub1_sub1
                                    = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                    i_218_, 0,
                                    locationConfig.anInt282,
                                    i_217_, true, 4,
                                    29895, i);
                        class10.method203(i_212_, i_221_, i_222_, i_211_,
                                i_220_, 0, 512, (byte) -122, i_215_,
                                i_214_, class13_sub1_sub1, 0);
                    } else if (i_210_ == 8) {
                        CacheableNode_Sub1_ class13_sub1_sub1;
                        if (locationConfig.anInt282 == -1
                                && locationConfig.anIntArray243 == null)
                            class13_sub1_sub1
                                    = locationConfig.method419(4, 0, i_216_, i_217_,
                                    i_218_, i_219_, -1);
                        else
                            class13_sub1_sub1
                                    = new CacheableNode_Sub1_Sub1_Sub2(i_219_, i_216_,
                                    i_218_, 0,
                                    locationConfig.anInt282,
                                    i_217_, true, 4,
                                    29895, i);
                        class10.method203(i_212_, i_221_, i_222_, i_211_,
                                i_220_, 0, 768, (byte) -122, i_215_,
                                i_214_, class13_sub1_sub1, 0);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("41913, " + i + ", " + i_210_ + ", " + i_211_
                    + ", " + i_212_ + ", " + i_213_ + ", "
                    + i_214_ + ", " + class39 + ", " + class10
                    + ", " + i_215_ + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public int method465(int i, int i_249_, int i_250_) {
        if (i_250_ > 179)
            i_249_ /= 2;
        if (i_250_ > 192)
            i_249_ /= 2;
        if (i_250_ > 217)
            i_249_ /= 2;
        if (i_250_ > 243)
            i_249_ /= 2;
        int i_251_ = (i / 4 << 10) + (i_249_ / 32 << 7) + i_250_ / 2;
        return i_251_;
    }

    public int method466(int i, byte i_252_, int i_253_, int i_254_) {
        try {
            if (i_252_ == 2)
                i_252_ = (byte) 0;
            else
                return 3;
            if ((aByteArrayArrayArray418[i][i_254_][i_253_] & 0x8) != 0)
                return 0;
            if (i > 0
                    && (aByteArrayArrayArray418[1][i_254_][i_253_] & 0x2) != 0)
                return i - 1;
            return i;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("54450, " + i + ", " + i_252_ + ", " + i_253_
                    + ", " + i_254_ + ", "
                    + runtimeexception);
            throw new RuntimeException();
        }
    }

    public int method469(int i, int i_261_) {
        if (i == -2)
            return 12345678;
        if (i == -1) {
            if (i_261_ < 0)
                i_261_ = 0;
            else if (i_261_ > 127)
                i_261_ = 127;
            i_261_ = 127 - i_261_;
            return i_261_;
        }
        i_261_ = i_261_ * (i & 0x7f) / 128;
        if (i_261_ < 2)
            i_261_ = 2;
        else if (i_261_ > 126)
            i_261_ = 126;
        return (i & 0xff80) + i_261_;
    }

    public void method470(byte[] is, byte i, int i_262_, int i_263_,
                          int i_264_, int i_265_, Class39[] class39s) {
        do {
            try {
                for (int i_266_ = 0; i_266_ < 4; i_266_++) {
                    for (int i_267_ = 0; i_267_ < 64; i_267_++) {
                        for (int i_268_ = 0; i_268_ < 64; i_268_++) {
                            if (i_264_ + i_267_ > 0 && i_264_ + i_267_ < 103
                                    && i_265_ + i_268_ > 0
                                    && i_265_ + i_268_ < 103)
                                class39s[i_266_].anIntArrayArray682
                                        [i_264_ + i_267_][i_265_ + i_268_]
                                        &= ~0x1000000;
                        }
                    }
                }
                Buffer buffer
                        = new Buffer(is);
                for (int i_269_ = 0; i_269_ < 4; i_269_++) {
                    for (int i_270_ = 0; i_270_ < 64; i_270_++) {
                        for (int i_271_ = 0; i_271_ < 64; i_271_++)
                            method461(i_263_, i_262_, i_270_ + i_264_,
                                    buffer, 27458,
                                    i_271_ + i_265_, i_269_, 0);
                    }
                }
                if (i == aByte412)
                    break;
                aBoolean434 = !aBoolean434;
            } catch (RuntimeException runtimeexception) {
                Signlink.reportError("89157, " + is + ", " + i + ", " + i_262_
                        + ", " + i_263_ + ", " + i_264_ + ", "
                        + i_265_ + ", " + class39s + ", "
                        + runtimeexception);
                throw new RuntimeException();
            }
            break;
        } while (false);
    }
}
