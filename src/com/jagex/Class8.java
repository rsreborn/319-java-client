package com.jagex;

import com.jagex.sign.signlink;

public class Class8
{

    public static Class8 aClass8Array136[];
    public int anInt137;
    public Class35 aClass35_138;
    public int anInt139;
    public int anIntArray140[];
    public int anIntArray141[];
    public int anIntArray142[];
    public int anIntArray143[];
    public static boolean aBooleanArray144[];

    public static void method185(int i)
    {
        aClass8Array136 = new Class8[i + 1];
        aBooleanArray144 = new boolean[i + 1];
        for(int j = 0; j < i + 1; j++)
        {
            aBooleanArray144[j] = true;
        }
    }

    public static void method186(int i, byte abyte0[])
    {
        try
        {
            Class13_Sub1_Sub2 class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, abyte0);
            class13_sub1_sub2.anInt1399 = abyte0.length - 8;
            int j = class13_sub1_sub2.method313();
            int k = class13_sub1_sub2.method313();
            int l = class13_sub1_sub2.method313();
            int i1 = class13_sub1_sub2.method313();
            int j1 = 0;
            Class13_Sub1_Sub2 class13_sub1_sub2_1 = new Class13_Sub1_Sub2(-351, abyte0);
            class13_sub1_sub2_1.anInt1399 = j1;
            j1 += j + 2;
            Class13_Sub1_Sub2 class13_sub1_sub2_2 = new Class13_Sub1_Sub2(-351, abyte0);
            class13_sub1_sub2_2.anInt1399 = j1;
            j1 += k;
            Class13_Sub1_Sub2 class13_sub1_sub2_3 = new Class13_Sub1_Sub2(-351, abyte0);
            class13_sub1_sub2_3.anInt1399 = j1;
            j1 += l;
            Class13_Sub1_Sub2 class13_sub1_sub2_4 = new Class13_Sub1_Sub2(-351, abyte0);
            class13_sub1_sub2_4.anInt1399 = j1;
            j1 += i1;
            Class13_Sub1_Sub2 class13_sub1_sub2_5;
            for(class13_sub1_sub2_5 = new Class13_Sub1_Sub2(-351, abyte0); i >= 0;)
            {
                return;
            }
            class13_sub1_sub2_5.anInt1399 = j1;
            Class35 class35 = new Class35(class13_sub1_sub2_5, false);
            int k1 = class13_sub1_sub2_1.method313();
            int ai[] = new int[500];
            int ai1[] = new int[500];
            int ai2[] = new int[500];
            int ai3[] = new int[500];
            for(int l1 = 0; l1 < k1; l1++)
            {
                int i2 = class13_sub1_sub2_1.method313();
                Class8 class8 = aClass8Array136[i2] = new Class8();
                class8.anInt137 = class13_sub1_sub2_4.method311();
                class8.aClass35_138 = class35;
                int j2 = class13_sub1_sub2_1.method311();
                int k2 = -1;
                int l2 = 0;
                for(int i3 = 0; i3 < j2; i3++)
                {
                    int j3 = class13_sub1_sub2_2.method311();
                    if(j3 > 0)
                    {
                        if(class35.anIntArray531[i3] != 0)
                        {
                            for(int l3 = i3 - 1; l3 > k2; l3--)
                            {
                                if(class35.anIntArray531[l3] != 0)
                                {
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
                        if(class35.anIntArray531[i3] == 3)
                        {
                            c = '\200';
                        }
                        if((j3 & 1) != 0)
                        {
                            ai1[l2] = class13_sub1_sub2_3.method324();
                        } else
                        {
                            ai1[l2] = c;
                        }
                        if((j3 & 2) != 0)
                        {
                            ai2[l2] = class13_sub1_sub2_3.method324();
                        } else
                        {
                            ai2[l2] = c;
                        }
                        if((j3 & 4) != 0)
                        {
                            ai3[l2] = class13_sub1_sub2_3.method324();
                        } else
                        {
                            ai3[l2] = c;
                        }
                        k2 = i3;
                        l2++;
                        if(class35.anIntArray531[i3] == 5)
                        {
                            aBooleanArray144[i2] = false;
                        }
                    }
                }
                class8.anInt139 = l2;
                class8.anIntArray140 = new int[l2];
                class8.anIntArray141 = new int[l2];
                class8.anIntArray142 = new int[l2];
                class8.anIntArray143 = new int[l2];
                for(int k3 = 0; k3 < l2; k3++)
                {
                    class8.anIntArray140[k3] = ai[k3];
                    class8.anIntArray141[k3] = ai1[k3];
                    class8.anIntArray142[k3] = ai2[k3];
                    class8.anIntArray143[k3] = ai3[k3];
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("14652, " + i + ", " + abyte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method187(int i)
    {
        try
        {
            if(i != 47779)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            aClass8Array136 = null;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("58180, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static Class8 method188(byte byte0, int i)
    {
        try
        {
            if(byte0 == 4)
            {
                byte0 = 0;
            } else
            {
                throw new NullPointerException();
            }
            if(aClass8Array136 == null)
            {
                return null;
            } else
            {
                return aClass8Array136[i];
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("4768, " + byte0 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method189(int i, int j)
    {
        try
        {
            if(j != 19953)
            {
                for(int k = 1; k > 0; k++)
                {
                }
            }
            return i == -1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("62535, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class8()
    {
    }
}
