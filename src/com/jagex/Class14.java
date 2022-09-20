package com.jagex;

import com.jagex.sign.signlink;

public class Class14
{

    public static Class13_Sub1_Sub1_Sub4 aClass13_Sub1_Sub1_Sub4Array239[] = new Class13_Sub1_Sub1_Sub4[4];
    public boolean aBoolean240;
    public int anIntArray241[];
    public int anIntArray242[];
    public int anIntArray243[];
    public boolean aBoolean244;
    public static int anInt245;
    public int anInt246;
    public int anInt247;
    public static Class3 aClass3_248 = new Class3(500, 31);
    public static Class3 aClass3_249 = new Class3(30, 31);
    public int anInt250;
    public boolean aBoolean251;
    public static int anInt252;
    public int anInt253;
    public static Game aGame254;
    public int anInt255;
    public boolean aBoolean256;
    public int anInt257;
    public boolean aBoolean258;
    public int anInt259;
    public boolean aBoolean260;
    public String aStringArray261[];
    public boolean aBoolean262;
    public boolean aBoolean263;
    public boolean aBoolean264;
    public byte aByte265;
    public int anInt266;
    public static Class13_Sub1_Sub2 aClass13_Sub1_Sub2_267;
    public int anInt268;
    public int anInt269;
    public boolean aBoolean270;
    public int anInt271;
    public static boolean aBoolean272;
    public boolean aBoolean273;
    public int anInt274;
    public String aString275;
    public byte aByteArray276[];
    public int anInt277;
    public static Class14 aClass14Array278[];
    public int anIntArray279[];
    public byte aByte280;
    public int anInt281;
    public int anInt282;
    public int anInt283;
    public int anInt284;
    public int anInt285;
    public boolean aBoolean286;
    public static int anIntArray287[];
    public int anInt288;
    public int anIntArray289[];

    public static void method416(int i)
    {
        try
        {
            if(i != 47779)
            {
                return;
            } else
            {
                aClass3_248 = null;
                aClass3_249 = null;
                anIntArray287 = null;
                aClass14Array278 = null;
                aClass13_Sub1_Sub2_267 = null;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("69394, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method417()
    {
        anIntArray241 = null;
        anIntArray289 = null;
        aString275 = null;
        aByteArray276 = null;
        anIntArray242 = null;
        anIntArray279 = null;
        anInt259 = 1;
        anInt253 = 1;
        aBoolean258 = true;
        aBoolean270 = true;
        aBoolean260 = false;
        aBoolean263 = false;
        aBoolean240 = false;
        aBoolean251 = false;
        anInt282 = -1;
        anInt269 = 16;
        aByte280 = 0;
        aByte265 = 0;
        aStringArray261 = null;
        anInt250 = -1;
        anInt255 = -1;
        aBoolean273 = false;
        aBoolean286 = true;
        anInt283 = 128;
        anInt281 = 128;
        anInt274 = 128;
        anInt285 = 0;
        anInt247 = 0;
        anInt277 = 0;
        anInt288 = 0;
        aBoolean264 = false;
        aBoolean262 = false;
        anInt266 = -1;
        anInt246 = -1;
        anInt257 = -1;
        anIntArray243 = null;
    }

    public static Class14 method418(int i)
    {
        for(int j = 0; j < 20; j++)
        {
            if(aClass14Array278[j].anInt268 == i)
            {
                return aClass14Array278[j];
            }
        }
        anInt245 = (anInt245 + 1) % 20;
        Class14 class14 = aClass14Array278[anInt245];
        aClass13_Sub1_Sub2_267.anInt1399 = anIntArray287[i];
        class14.anInt268 = i;
        class14.method417();
        class14.method420(aClass13_Sub1_Sub2_267, 26421);
        return class14;
    }

    public Class13_Sub1_Sub1_Sub4 method419(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = method422(k1, j, i, false);
        if(class13_sub1_sub1_sub4 == null)
        {
            return null;
        }
        if(aBoolean263 || aBoolean240)
        {
            class13_sub1_sub1_sub4 = new Class13_Sub1_Sub1_Sub4(class13_sub1_sub1_sub4, 0, aBoolean240, aBoolean263);
        }
        if(aBoolean263)
        {
            int l1 = (k + l + i1 + j1) / 4;
            for(int i2 = 0; i2 < class13_sub1_sub1_sub4.anInt1496; i2++)
            {
                int j2 = class13_sub1_sub1_sub4.anIntArray1497[i2];
                int k2 = class13_sub1_sub1_sub4.anIntArray1499[i2];
                int l2 = k + ((l - k) * (j2 + 64)) / 128;
                int i3 = j1 + ((i1 - j1) * (j2 + 64)) / 128;
                int j3 = l2 + ((i3 - l2) * (k2 + 64)) / 128;
                class13_sub1_sub1_sub4.anIntArray1498[i2] += j3 - l1;
            }
            class13_sub1_sub1_sub4.method270(false);
        }
        return class13_sub1_sub1_sub4;
    }

    public void method420(Class13_Sub1_Sub2 class13_sub1_sub2, int i)
    {
        try
        {
            if(i != 26421)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            int k = -1;
label0:
            do
            {
                int l;
                do
                {
                    l = class13_sub1_sub2.readUnsignedByte();
                    if(l == 0)
                    {
                        break label0;
                    }
                    if(l == 1)
                    {
                        int i1 = class13_sub1_sub2.readUnsignedByte();
                        if(i1 > 0)
                        {
                            if(anIntArray241 == null || aBoolean272)
                            {
                                anIntArray289 = new int[i1];
                                anIntArray241 = new int[i1];
                                for(int i2 = 0; i2 < i1; i2++)
                                {
                                    anIntArray241[i2] = class13_sub1_sub2.readUnsignedShort();
                                    anIntArray289[i2] = class13_sub1_sub2.readUnsignedByte();
                                }
                            } else
                            {
                                class13_sub1_sub2.anInt1399 += i1 * 3;
                            }
                        }
                    } else
                    if(l == 2)
                    {
                        aString275 = class13_sub1_sub2.method318();
                    } else
                    if(l == 3)
                    {
                        aByteArray276 = class13_sub1_sub2.method319(true);
                    } else
                    if(l == 5)
                    {
                        int j1 = class13_sub1_sub2.readUnsignedByte();
                        if(j1 > 0)
                        {
                            if(anIntArray241 == null || aBoolean272)
                            {
                                anIntArray289 = null;
                                anIntArray241 = new int[j1];
                                for(int j2 = 0; j2 < j1; j2++)
                                {
                                    anIntArray241[j2] = class13_sub1_sub2.readUnsignedShort();
                                }
                            } else
                            {
                                class13_sub1_sub2.anInt1399 += j1 * 2;
                            }
                        }
                    } else
                    if(l == 14)
                    {
                        anInt259 = class13_sub1_sub2.readUnsignedByte();
                    } else
                    if(l == 15)
                    {
                        anInt253 = class13_sub1_sub2.readUnsignedByte();
                    } else
                    if(l == 17)
                    {
                        aBoolean258 = false;
                    } else
                    if(l == 18)
                    {
                        aBoolean270 = false;
                    } else
                    if(l == 19)
                    {
                        k = class13_sub1_sub2.readUnsignedByte();
                        if(k == 1)
                        {
                            aBoolean260 = true;
                        }
                    } else
                    if(l == 21)
                    {
                        aBoolean263 = true;
                    } else
                    if(l == 22)
                    {
                        aBoolean240 = true;
                    } else
                    if(l == 23)
                    {
                        aBoolean251 = true;
                    } else
                    if(l == 24)
                    {
                        anInt282 = class13_sub1_sub2.readUnsignedShort();
                        if(anInt282 == 65535)
                        {
                            anInt282 = -1;
                        }
                    } else
                    if(l == 28)
                    {
                        anInt269 = class13_sub1_sub2.readUnsignedByte();
                    } else
                    if(l == 29)
                    {
                        aByte280 = class13_sub1_sub2.method312();
                    } else
                    if(l == 39)
                    {
                        aByte265 = class13_sub1_sub2.method312();
                    } else
                    if(l >= 30 && l < 39)
                    {
                        if(aStringArray261 == null)
                        {
                            aStringArray261 = new String[5];
                        }
                        aStringArray261[l - 30] = class13_sub1_sub2.method318();
                        if(aStringArray261[l - 30].equalsIgnoreCase("hidden"))
                        {
                            aStringArray261[l - 30] = null;
                        }
                    } else
                    if(l == 40)
                    {
                        int k1 = class13_sub1_sub2.readUnsignedByte();
                        anIntArray242 = new int[k1];
                        anIntArray279 = new int[k1];
                        for(int k2 = 0; k2 < k1; k2++)
                        {
                            anIntArray242[k2] = class13_sub1_sub2.readUnsignedShort();
                            anIntArray279[k2] = class13_sub1_sub2.readUnsignedShort();
                        }
                    } else
                    if(l == 60)
                    {
                        anInt250 = class13_sub1_sub2.readUnsignedShort();
                    } else
                    if(l == 62)
                    {
                        aBoolean273 = true;
                    } else
                    if(l == 64)
                    {
                        aBoolean286 = false;
                    } else
                    if(l == 65)
                    {
                        anInt283 = class13_sub1_sub2.readUnsignedShort();
                    } else
                    if(l == 66)
                    {
                        anInt281 = class13_sub1_sub2.readUnsignedShort();
                    } else
                    if(l == 67)
                    {
                        anInt274 = class13_sub1_sub2.readUnsignedShort();
                    } else
                    if(l == 68)
                    {
                        anInt255 = class13_sub1_sub2.readUnsignedShort();
                    } else
                    if(l == 69)
                    {
                        anInt285 = class13_sub1_sub2.readUnsignedByte();
                    } else
                    if(l == 70)
                    {
                        anInt247 = class13_sub1_sub2.method314();
                    } else
                    if(l == 71)
                    {
                        anInt277 = class13_sub1_sub2.method314();
                    } else
                    if(l == 72)
                    {
                        anInt288 = class13_sub1_sub2.method314();
                    } else
                    if(l == 73)
                    {
                        aBoolean264 = true;
                    } else
                    if(l == 74)
                    {
                        aBoolean262 = true;
                    } else
                    {
                        if(l != 75)
                        {
                            continue;
                        }
                        anInt266 = class13_sub1_sub2.readUnsignedByte();
                    }
                    continue label0;
                } while(l != 77);
                anInt246 = class13_sub1_sub2.readUnsignedShort();
                if(anInt246 == 65535)
                {
                    anInt246 = -1;
                }
                anInt257 = class13_sub1_sub2.readUnsignedShort();
                if(anInt257 == 65535)
                {
                    anInt257 = -1;
                }
                int l1 = class13_sub1_sub2.readUnsignedByte();
                anIntArray243 = new int[l1 + 1];
                for(int l2 = 0; l2 <= l1; l2++)
                {
                    anIntArray243[l2] = class13_sub1_sub2.readUnsignedShort();
                    if(anIntArray243[l2] == 65535)
                    {
                        anIntArray243[l2] = -1;
                    }
                }
            } while(true);
            if(k == -1)
            {
                aBoolean260 = false;
                if(anIntArray241 != null && (anIntArray289 == null || anIntArray289[0] == 10))
                {
                    aBoolean260 = true;
                }
                if(aStringArray261 != null)
                {
                    aBoolean260 = true;
                }
            }
            if(aBoolean262)
            {
                aBoolean258 = false;
                aBoolean270 = false;
            }
            if(anInt266 == -1)
            {
                anInt266 = aBoolean258 ? 1 : 0;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("62681, " + class13_sub1_sub2 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public boolean method421(int i)
    {
        try
        {
            if(i != anInt271)
            {
                aBoolean256 = !aBoolean256;
            }
            if(anIntArray241 == null)
            {
                return true;
            }
            boolean flag = true;
            for(int j = 0; j < anIntArray241.length; j++)
            {
                flag &= Class13_Sub1_Sub1_Sub4.method266(anIntArray241[j] & 0xffff);
            }
            return flag;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("83070, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub1_Sub4 method422(int i, int j, int k, boolean flag)
    {
        try
        {
            Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = null;
            if(flag)
            {
                aBoolean244 = !aBoolean244;
            }
            long l;
            if(anIntArray289 == null)
            {
                if(k != 10)
                {
                    return null;
                }
                l = (long)((anInt268 << 6) + j) + ((long)(i + 1) << 32);
                Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_1 = (Class13_Sub1_Sub1_Sub4)aClass3_249.method172(l);
                if(class13_sub1_sub1_sub4_1 != null)
                {
                    return class13_sub1_sub1_sub4_1;
                }
                if(anIntArray241 == null)
                {
                    return null;
                }
                boolean flag2 = aBoolean273 ^ (j > 3);
                int k1 = anIntArray241.length;
                for(int l1 = 0; l1 < k1; l1++)
                {
                    int k2 = anIntArray241[l1];
                    if(flag2)
                    {
                        k2 += 0x10000;
                    }
                    class13_sub1_sub1_sub4 = (Class13_Sub1_Sub1_Sub4)aClass3_248.method172(k2);
                    if(class13_sub1_sub1_sub4 == null)
                    {
                        class13_sub1_sub1_sub4 = Class13_Sub1_Sub1_Sub4.method265((byte)4, k2 & 0xffff);
                        if(class13_sub1_sub1_sub4 == null)
                        {
                            return null;
                        }
                        if(flag2)
                        {
                            class13_sub1_sub1_sub4.method280(true);
                        }
                        aClass3_248.method173(class13_sub1_sub1_sub4, k2, 9388);
                    }
                    if(k1 > 1)
                    {
                        aClass13_Sub1_Sub1_Sub4Array239[l1] = class13_sub1_sub1_sub4;
                    }
                }
                if(k1 > 1)
                {
                    class13_sub1_sub1_sub4 = new Class13_Sub1_Sub1_Sub4(k1, (byte)61, aClass13_Sub1_Sub1_Sub4Array239);
                }
            } else
            {
                int i1 = -1;
                for(int j1 = 0; j1 < anIntArray289.length; j1++)
                {
                    if(anIntArray289[j1] != k)
                    {
                        continue;
                    }
                    i1 = j1;
                    break;
                }
                if(i1 == -1)
                {
                    return null;
                }
                l = (long)((anInt268 << 6) + (i1 << 3) + j) + ((long)(i + 1) << 32);
                Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_2 = (Class13_Sub1_Sub1_Sub4)aClass3_249.method172(l);
                if(class13_sub1_sub1_sub4_2 != null)
                {
                    return class13_sub1_sub1_sub4_2;
                }
                int i2 = anIntArray241[i1];
                boolean flag4 = aBoolean273 ^ (j > 3);
                if(flag4)
                {
                    i2 += 0x10000;
                }
                class13_sub1_sub1_sub4 = (Class13_Sub1_Sub1_Sub4)aClass3_248.method172(i2);
                if(class13_sub1_sub1_sub4 == null)
                {
                    class13_sub1_sub1_sub4 = Class13_Sub1_Sub1_Sub4.method265((byte)4, i2 & 0xffff);
                    if(class13_sub1_sub1_sub4 == null)
                    {
                        return null;
                    }
                    if(flag4)
                    {
                        class13_sub1_sub1_sub4.method280(true);
                    }
                    aClass3_248.method173(class13_sub1_sub1_sub4, i2, 9388);
                }
            }
            boolean flag1;
            if(anInt283 != 128 || anInt281 != 128 || anInt274 != 128)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            boolean flag3;
            if(anInt247 != 0 || anInt277 != 0 || anInt288 != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_3 = new Class13_Sub1_Sub1_Sub4(j == 0 && i == -1 && !flag1 && !flag3, Class8.method189(i, 19953), 629, class13_sub1_sub1_sub4, anIntArray242 == null);
            if(i != -1)
            {
                class13_sub1_sub1_sub4_3.method272(true);
                class13_sub1_sub1_sub4_3.method273(i, false);
                class13_sub1_sub1_sub4_3.anIntArrayArray1528 = null;
                class13_sub1_sub1_sub4_3.anIntArrayArray1527 = null;
            }
            while(j-- > 0)
            {
                class13_sub1_sub1_sub4_3.method276(-32823);
            }
            if(anIntArray242 != null)
            {
                for(int j2 = 0; j2 < anIntArray242.length; j2++)
                {
                    class13_sub1_sub1_sub4_3.method279(anIntArray242[j2], anIntArray279[j2]);
                }
            }
            if(flag1)
            {
                class13_sub1_sub1_sub4_3.method281(anInt283, anInt274, anInt281, (byte)0);
            }
            if(flag3)
            {
                class13_sub1_sub1_sub4_3.method278(anInt288, -991, anInt277, anInt247);
            }
            class13_sub1_sub1_sub4_3.method282(64 + aByte280, 768 + aByte265 * 5, -50, -10, -50, !aBoolean240);
            if(anInt266 == 1)
            {
                class13_sub1_sub1_sub4_3.anInt1524 = ((Class13_Sub1_Sub1) (class13_sub1_sub1_sub4_3)).anInt1377;
            }
            aClass3_249.method173(class13_sub1_sub1_sub4_3, l, 9388);
            return class13_sub1_sub1_sub4_3;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("4845, " + i + ", " + j + ", " + k + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method423(int i, Class2_Sub1 class2_sub1)
    {
        try
        {
            if(anIntArray241 == null)
            {
                return;
            }
            for(int j = 0; j < anIntArray241.length; j++)
            {
                class2_sub1.method157(0, anIntArray241[j] & 0xffff, 0);
            }
            if(i != 2402)
            {
                anInt284 = 36;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("17097, " + i + ", " + class2_sub1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Class14 method424(int i)
    {
        try
        {
            if(i != 2)
            {
                anInt284 = 98;
            }
            int j = -1;
            if(anInt246 != -1)
            {
                Class26 class26 = Class26.aClass26Array439[anInt246];
                int k = class26.anInt441;
                int l = class26.anInt442;
                int i1 = class26.anInt443;
                int j1 = Game.anIntArray1271[i1 - l];
                j = aGame254.anIntArray1149[k] >> l & j1;
            } else
            if(anInt257 != -1)
            {
                j = aGame254.anIntArray1149[anInt257];
            }
            if(j < 0 || j >= anIntArray243.length || anIntArray243[j] == -1)
            {
                return null;
            } else
            {
                return method418(anIntArray243[j]);
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("92561, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method425(int i, int j)
    {
        try
        {
            if(j != 3)
            {
                throw new NullPointerException();
            }
            if(anIntArray289 == null)
            {
                if(anIntArray241 == null)
                {
                    return true;
                }
                if(i != 10)
                {
                    return true;
                }
                boolean flag = true;
                for(int l = 0; l < anIntArray241.length; l++)
                {
                    flag &= Class13_Sub1_Sub1_Sub4.method266(anIntArray241[l] & 0xffff);
                }
                return flag;
            }
            for(int k = 0; k < anIntArray289.length; k++)
            {
                if(anIntArray289[k] == i)
                {
                    return Class13_Sub1_Sub1_Sub4.method266(anIntArray241[k] & 0xffff);
                }
            }
            return true;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("22749, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method426(Class1 class1)
    {
        aClass13_Sub1_Sub2_267 = new Class13_Sub1_Sub2(-351, class1.method149("loc.dat", null));
        Class13_Sub1_Sub2 class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, class1.method149("loc.idx", null));
        anInt252 = class13_sub1_sub2.readUnsignedShort();
        anIntArray287 = new int[anInt252];
        int i = 2;
        for(int j = 0; j < anInt252; j++)
        {
            anIntArray287[j] = i;
            i += class13_sub1_sub2.readUnsignedShort();
        }
        aClass14Array278 = new Class14[20];
        for(int k = 0; k < 20; k++)
        {
            aClass14Array278[k] = new Class14();
        }
    }

    public Class14()
    {
        aBoolean244 = false;
        aBoolean256 = true;
        anInt268 = -1;
        anInt271 = -36669;
        anInt284 = 6;
    }

}
