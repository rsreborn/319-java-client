package com.jagex;

import com.jagex.sign.signlink;

public class Class17
{

    public static int anInt300 = 788;
    public boolean aBoolean301;
    public Class6 aClass6_302;
    public Class6 aClass6_303;
    public Class6 aClass6_304;
    public Class6 aClass6_305;
    public Class6 aClass6_306;
    public Class6 aClass6_307;
    public Class6 aClass6_308;
    public Class6 aClass6_309;
    public int anIntArray310[];
    public int anIntArray311[];
    public int anIntArray312[];
    public int anInt313;
    public int anInt314;
    public Class29 aClass29_315;
    public Class6 aClass6_316;
    public int anInt317;
    public int anInt318;
    public static int anIntArray319[];
    public static int anIntArray320[];
    public static int anIntArray321[];
    public static int anIntArray322[] = new int[5];
    public static int anIntArray323[] = new int[5];
    public static int anIntArray324[] = new int[5];
    public static int anIntArray325[] = new int[5];
    public static int anIntArray326[] = new int[5];

    public static void method435()
    {
        anIntArray320 = new int[32768];
        for(int i = 0; i < 32768; i++)
        {
            if(Math.random() > 0.5D)
            {
                anIntArray320[i] = 1;
            } else
            {
                anIntArray320[i] = -1;
            }
        }
        anIntArray321 = new int[32768];
        for(int j = 0; j < 32768; j++)
        {
            anIntArray321[j] = (int)(Math.sin((double)j / 5215.1903000000002D) * 16384D);
        }
        anIntArray319 = new int[0x35d54];
    }

    public int[] method436(int i, int j)
    {
        for(int k = 0; k < i; k++)
        {
            anIntArray319[k] = 0;
        }
        if(j < 10)
        {
            return anIntArray319;
        }
        double d = (double)i / ((double)j + 0.0D);
        aClass6_302.method183((byte)6);
        aClass6_303.method183((byte)6);
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        if(aClass6_304 != null)
        {
            aClass6_304.method183((byte)6);
            aClass6_305.method183((byte)6);
            l = (int)(((double)(aClass6_304.anInt124 - aClass6_304.anInt123) * 32.768000000000001D) / d);
            i1 = (int)(((double)aClass6_304.anInt123 * 32.768000000000001D) / d);
        }
        int k1 = 0;
        int l1 = 0;
        int i2 = 0;
        if(aClass6_306 != null)
        {
            aClass6_306.method183((byte)6);
            aClass6_307.method183((byte)6);
            k1 = (int)(((double)(aClass6_306.anInt124 - aClass6_306.anInt123) * 32.768000000000001D) / d);
            l1 = (int)(((double)aClass6_306.anInt123 * 32.768000000000001D) / d);
        }
        for(int j2 = 0; j2 < 5; j2++)
        {
            if(anIntArray310[j2] != 0)
            {
                anIntArray322[j2] = 0;
                anIntArray323[j2] = (int)((double)anIntArray312[j2] * d);
                anIntArray324[j2] = (anIntArray310[j2] << 14) / 100;
                anIntArray325[j2] = (int)(((double)(aClass6_302.anInt124 - aClass6_302.anInt123) * 32.768000000000001D * Math.pow(1.0057929410678534D, anIntArray311[j2])) / d);
                anIntArray326[j2] = (int)(((double)aClass6_302.anInt123 * 32.768000000000001D) / d);
            }
        }
        for(int k2 = 0; k2 < i; k2++)
        {
            int l2 = aClass6_302.method184(i, anInt300);
            int j4 = aClass6_303.method184(i, anInt300);
            if(aClass6_304 != null)
            {
                int j5 = aClass6_304.method184(i, anInt300);
                int j6 = aClass6_305.method184(i, anInt300);
                l2 += method437(j1, j6, -534, aClass6_304.anInt125) >> 1;
                j1 += (j5 * l >> 16) + i1;
            }
            if(aClass6_306 != null)
            {
                int k5 = aClass6_306.method184(i, anInt300);
                int k6 = aClass6_307.method184(i, anInt300);
                j4 = j4 * ((method437(i2, k6, -534, aClass6_306.anInt125) >> 1) + 32768) >> 15;
                i2 += (k5 * k1 >> 16) + l1;
            }
            for(int l5 = 0; l5 < 5; l5++)
            {
                if(anIntArray310[l5] != 0)
                {
                    int l6 = k2 + anIntArray323[l5];
                    if(l6 < i)
                    {
                        anIntArray319[l6] += method437(anIntArray322[l5], j4 * anIntArray324[l5] >> 15, -534, aClass6_302.anInt125);
                        anIntArray322[l5] += (l2 * anIntArray325[l5] >> 16) + anIntArray326[l5];
                    }
                }
            }
        }
        if(aClass6_308 != null)
        {
            aClass6_308.method183((byte)6);
            aClass6_309.method183((byte)6);
            int i3 = 0;
            boolean flag = false;
            boolean flag1 = true;
            for(int i7 = 0; i7 < i; i7++)
            {
                int k7 = aClass6_308.method184(i, anInt300);
                int i8 = aClass6_309.method184(i, anInt300);
                int k4;
                if(flag1)
                {
                    k4 = aClass6_308.anInt123 + ((aClass6_308.anInt124 - aClass6_308.anInt123) * k7 >> 8);
                } else
                {
                    k4 = aClass6_308.anInt123 + ((aClass6_308.anInt124 - aClass6_308.anInt123) * i8 >> 8);
                }
                if((i3 += 256) >= k4)
                {
                    i3 = 0;
                    flag1 = !flag1;
                }
                if(flag1)
                {
                    anIntArray319[i7] = 0;
                }
            }
        }
        if(anInt313 > 0 && anInt314 > 0)
        {
            int j3 = (int)((double)anInt313 * d);
            for(int l4 = j3; l4 < i; l4++)
            {
                anIntArray319[l4] += (anIntArray319[l4 - j3] * anInt314) / 100;
            }
        }
        if(aClass29_315.anIntArray465[0] > 0 || aClass29_315.anIntArray465[1] > 0)
        {
            aClass6_316.method183((byte)6);
            int k3 = aClass6_316.method184(i + 1, anInt300);
            int i5 = aClass29_315.method488(0, 0, (float)k3 / 65536F);
            int i6 = aClass29_315.method488(1, 0, (float)k3 / 65536F);
            if(i >= i5 + i6)
            {
                int j7 = 0;
                int l7 = i6;
                if(l7 > i - i5)
                {
                    l7 = i - i5;
                }
                for(; j7 < l7; j7++)
                {
                    int j8 = (int)((long)anIntArray319[j7 + i5] * (long)Class29.anInt472 >> 16);
                    for(int k8 = 0; k8 < i5; k8++)
                    {
                        j8 += (int)((long)anIntArray319[(j7 + i5) - 1 - k8] * (long)Class29.anIntArrayArray470[0][k8] >> 16);
                    }
                    for(int j9 = 0; j9 < j7; j9++)
                    {
                        j8 -= (int)((long)anIntArray319[j7 - 1 - j9] * (long)Class29.anIntArrayArray470[1][j9] >> 16);
                    }
                    anIntArray319[j7] = j8;
                    k3 = aClass6_316.method184(i + 1, anInt300);
                }
                char c = '\200';
                l7 = c;
                do
                {
                    if(l7 > i - i5)
                    {
                        l7 = i - i5;
                    }
                    for(; j7 < l7; j7++)
                    {
                        int l8 = (int)((long)anIntArray319[j7 + i5] * (long)Class29.anInt472 >> 16);
                        for(int k9 = 0; k9 < i5; k9++)
                        {
                            l8 += (int)((long)anIntArray319[(j7 + i5) - 1 - k9] * (long)Class29.anIntArrayArray470[0][k9] >> 16);
                        }
                        for(int i10 = 0; i10 < i6; i10++)
                        {
                            l8 -= (int)((long)anIntArray319[j7 - 1 - i10] * (long)Class29.anIntArrayArray470[1][i10] >> 16);
                        }
                        anIntArray319[j7] = l8;
                        k3 = aClass6_316.method184(i + 1, anInt300);
                    }
                    if(j7 >= i - i5)
                    {
                        break;
                    }
                    i5 = aClass29_315.method488(0, 0, (float)k3 / 65536F);
                    i6 = aClass29_315.method488(1, 0, (float)k3 / 65536F);
                    l7 += c;
                } while(true);
                for(; j7 < i; j7++)
                {
                    int i9 = 0;
                    for(int l9 = (j7 + i5) - i; l9 < i5; l9++)
                    {
                        i9 += (int)((long)anIntArray319[(j7 + i5) - 1 - l9] * (long)Class29.anIntArrayArray470[0][l9] >> 16);
                    }
                    for(int j10 = 0; j10 < i6; j10++)
                    {
                        i9 -= (int)((long)anIntArray319[j7 - 1 - j10] * (long)Class29.anIntArrayArray470[1][j10] >> 16);
                    }
                    anIntArray319[j7] = i9;
                    int l3 = aClass6_316.method184(i + 1, anInt300);
                }
            }
        }
        for(int i4 = 0; i4 < i; i4++)
        {
            if(anIntArray319[i4] < -32768)
            {
                anIntArray319[i4] = -32768;
            }
            if(anIntArray319[i4] > 32767)
            {
                anIntArray319[i4] = 32767;
            }
        }
        return anIntArray319;
    }

    public int method437(int i, int j, int k, int l)
    {
        try
        {
            while(k >= 0)
            {
                aBoolean301 = !aBoolean301;
            }
            if(l == 1)
            {
                if((i & 0x7fff) < 16384)
                {
                    return j;
                } else
                {
                    return -j;
                }
            }
            if(l == 2)
            {
                return anIntArray321[i & 0x7fff] * j >> 14;
            }
            if(l == 3)
            {
                return ((i & 0x7fff) * j >> 14) - j;
            }
            if(l == 4)
            {
                return anIntArray320[i / 2607 & 0x7fff] * j;
            } else
            {
                return 0;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("77704, " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method438(Class13_Sub1_Sub2 class13_sub1_sub2, int i)
    {
        try
        {
            aClass6_302 = new Class6();
            aClass6_302.method181(class13_sub1_sub2, 26421);
            aClass6_303 = new Class6();
            aClass6_303.method181(class13_sub1_sub2, 26421);
            int j = class13_sub1_sub2.method311();
            if(j != 0)
            {
                class13_sub1_sub2.anInt1399--;
                aClass6_304 = new Class6();
                aClass6_304.method181(class13_sub1_sub2, 26421);
                aClass6_305 = new Class6();
                aClass6_305.method181(class13_sub1_sub2, 26421);
            }
            j = class13_sub1_sub2.method311();
            if(j != 0)
            {
                class13_sub1_sub2.anInt1399--;
                aClass6_306 = new Class6();
                aClass6_306.method181(class13_sub1_sub2, 26421);
                aClass6_307 = new Class6();
                aClass6_307.method181(class13_sub1_sub2, 26421);
            }
            j = class13_sub1_sub2.method311();
            if(j != 0)
            {
                class13_sub1_sub2.anInt1399--;
                aClass6_308 = new Class6();
                aClass6_308.method181(class13_sub1_sub2, 26421);
                aClass6_309 = new Class6();
                aClass6_309.method181(class13_sub1_sub2, 26421);
            }
            for(int k = 0; k < 10; k++)
            {
                int l = class13_sub1_sub2.method325();
                if(l == 0)
                {
                    break;
                }
                anIntArray310[k] = l;
                anIntArray311[k] = class13_sub1_sub2.method324();
                anIntArray312[k] = class13_sub1_sub2.method325();
            }
            anInt313 = class13_sub1_sub2.method325();
            anInt314 = class13_sub1_sub2.method325();
            if(i != 26421)
            {
                throw new NullPointerException();
            } else
            {
                anInt317 = class13_sub1_sub2.method313();
                anInt318 = class13_sub1_sub2.method313();
                aClass29_315 = new Class29();
                aClass6_316 = new Class6();
                aClass29_315.method489(aClass6_316, 40848, class13_sub1_sub2);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("20739, " + class13_sub1_sub2 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class17()
    {
        aBoolean301 = false;
        anIntArray310 = new int[5];
        anIntArray311 = new int[5];
        anIntArray312 = new int[5];
        anInt314 = 100;
        anInt317 = 500;
    }

}
