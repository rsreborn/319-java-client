package com.jagex;

import com.jagex.sign.signlink;

public class Class36
{

    public static Class36 aClass36Array533[];
    public int anInt534;
    public int anInt535;
    public int anInt536;
    public int anInt537;
    public boolean aBoolean538;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4Array539[];
    public int anInt540;
    public int anInt541;
    public int anInt542;
    public int anInt543;
    public int anInt544;
    public int anIntArray545[];
    public static int anInt546;
    public String aStringArray547[];
    public String aString548;
    public int anIntArray549[];
    public int anInt550;
    public boolean aBoolean551;
    public boolean aBoolean552;
    public String aString553;
    public int anInt554;
    public boolean aBoolean555;
    public int anIntArray556[];
    public int anIntArray557[];
    public int anInt558;
    public boolean aBoolean559;
    public int anIntArray560[];
    public boolean aBoolean561;
    public byte aByte562;
    public String aString563;
    public String aString564;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_565;
    public int anInt566;
    public static boolean aBoolean567 = true;
    public int anInt568;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_569;
    public int anInt570;
    public int anInt571;
    public int anInt572;
    public int anInt573;
    public int anInt574;
    public static Class3 aClass3_575 = new Class3(30, 31);
    public int anIntArray576[];
    public int anInt577;
    public boolean aBoolean578;
    public int anIntArray579[];
    public int anIntArray580[];
    public int anIntArrayArray581[][];
    public int anInt582;
    public Class13_Sub1_Sub4_Sub2 aClass13_Sub1_Sub4_Sub2_583;
    public static Class3 aClass3_584;
    public boolean aBoolean585;
    public int anInt586;
    public int anInt587;
    public int anInt588;
    public String aString589;
    public int anInt590;
    public int anIntArray591[];
    public int anInt592;
    public int anInt593;
    public boolean aBoolean594;
    public int anInt595;
    public int anInt596;
    public int anInt597;
    public int anInt598;
    public int anInt599;

    public Class13_Sub1_Sub1_Sub4 method497(int i, int j)
    {
        Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = (Class13_Sub1_Sub1_Sub4)aClass3_575.method172((i << 16) + j);
        if(class13_sub1_sub1_sub4 != null)
        {
            return class13_sub1_sub1_sub4;
        }
        if(i == 1)
        {
            class13_sub1_sub1_sub4 = Class13_Sub1_Sub1_Sub4.method265((byte)4, j);
        }
        if(i == 2)
        {
            class13_sub1_sub1_sub4 = Class47.method585(j).method583(524);
        }
        if(i == 3)
        {
            class13_sub1_sub1_sub4 = Game.aClass13_Sub1_Sub1_Sub6_Sub1_997.method296(242);
        }
        if(i == 4)
        {
            class13_sub1_sub1_sub4 = Class38.method505(j).method513(-453, 50);
        }
        if(i == 5)
        {
            class13_sub1_sub1_sub4 = null;
        }
        if(class13_sub1_sub1_sub4 != null)
        {
            aClass3_575.method173(class13_sub1_sub1_sub4, (i << 16) + j, 9388);
        }
        return class13_sub1_sub1_sub4;
    }

    public static void method498(int i, Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4, int j, int k)
    {
        try
        {
            aClass3_575.method174();
            if(j != 0)
            {
                return;
            }
            if(class13_sub1_sub1_sub4 != null && i != 4)
            {
                aClass3_575.method173(class13_sub1_sub1_sub4, (i << 16) + k, 9388);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("49636, " + i + ", " + class13_sub1_sub1_sub4 + ", " + j + ", " + k + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Class13_Sub1_Sub1_Sub4 method499(int i, int j, boolean flag, boolean flag1)
    {
        try
        {
            if(!flag)
            {
                anInt593 = -416;
            }
            Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4;
            if(flag1)
            {
                class13_sub1_sub1_sub4 = method497(anInt587, anInt588);
            } else
            {
                class13_sub1_sub1_sub4 = method497(anInt541, anInt542);
            }
            if(class13_sub1_sub1_sub4 == null)
            {
                return null;
            }
            if(j == -1 && i == -1 && class13_sub1_sub1_sub4.anIntArray1510 == null)
            {
                return class13_sub1_sub1_sub4;
            }
            Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_1 = new Class13_Sub1_Sub1_Sub4(false, Class8.method189(j, 19953) & Class8.method189(i, 19953), 629, class13_sub1_sub1_sub4, true);
            if(j != -1 || i != -1)
            {
                class13_sub1_sub1_sub4_1.method272(true);
            }
            if(j != -1)
            {
                class13_sub1_sub1_sub4_1.method273(j, false);
            }
            if(i != -1)
            {
                class13_sub1_sub1_sub4_1.method273(i, false);
            }
            class13_sub1_sub1_sub4_1.method282(64, 768, -50, -10, -50, true);
            return class13_sub1_sub1_sub4_1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("85215, " + i + ", " + j + ", " + flag + ", " + flag1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static Class13_Sub1_Sub4_Sub4 method500(int i, boolean flag, Class1 class1, String s)
    {
        try
        {
            if(flag)
            {
                anInt546 = -374;
            }
            long l = (Class24.method448((byte)23, s) << 8) + (long)i;
            Class13_Sub1_Sub4_Sub4 class13_sub1_sub4_sub4 = (Class13_Sub1_Sub4_Sub4)aClass3_584.method172(l);
            if(class13_sub1_sub4_sub4 != null)
            {
                return class13_sub1_sub4_sub4;
            }
            try
            {
                class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(class1, s, i);
                aClass3_584.method173(class13_sub1_sub4_sub4, l, 9388);
            }
            catch(Exception _ex)
            {
                return null;
            }
            return class13_sub1_sub4_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("88345, " + i + ", " + flag + ", " + class1 + ", " + s + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method501(Class1 class1, boolean flag, Class1 class1_1, Class13_Sub1_Sub4_Sub2 aclass13_sub1_sub4_sub2[])
    {
        try
        {
            aClass3_584 = new Class3(50000, 31);
            Class13_Sub1_Sub2 class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, class1.method149("data", null));
            int i = -1;
            if(!flag)
            {
                aBoolean567 = !aBoolean567;
            }
            int j = class13_sub1_sub2.method313();
            aClass36Array533 = new Class36[j];
            while(class13_sub1_sub2.anInt1399 < class13_sub1_sub2.aByteArray1398.length)
            {
                int k = class13_sub1_sub2.method313();
                if(k == 65535)
                {
                    i = class13_sub1_sub2.method313();
                    k = class13_sub1_sub2.method313();
                }
                Class36 class36 = aClass36Array533[k] = new Class36();
                class36.anInt592 = k;
                class36.anInt573 = i;
                class36.anInt570 = class13_sub1_sub2.method311();
                class36.anInt597 = class13_sub1_sub2.method311();
                class36.anInt577 = class13_sub1_sub2.method313();
                class36.anInt582 = class13_sub1_sub2.method313();
                class36.anInt586 = class13_sub1_sub2.method313();
                class36.aByte562 = (byte)class13_sub1_sub2.method311();
                class36.anInt543 = class13_sub1_sub2.method311();
                if(class36.anInt543 != 0)
                {
                    class36.anInt543 = (class36.anInt543 - 1 << 8) + class13_sub1_sub2.method311();
                } else
                {
                    class36.anInt543 = -1;
                }
                int i1 = class13_sub1_sub2.method311();
                if(i1 > 0)
                {
                    class36.anIntArray545 = new int[i1];
                    class36.anIntArray556 = new int[i1];
                    for(int j1 = 0; j1 < i1; j1++)
                    {
                        class36.anIntArray545[j1] = class13_sub1_sub2.method311();
                        class36.anIntArray556[j1] = class13_sub1_sub2.method313();
                    }
                }
                int k1 = class13_sub1_sub2.method311();
                if(k1 > 0)
                {
                    class36.anIntArrayArray581 = new int[k1][];
                    for(int l1 = 0; l1 < k1; l1++)
                    {
                        int i3 = class13_sub1_sub2.method313();
                        class36.anIntArrayArray581[l1] = new int[i3];
                        for(int l4 = 0; l4 < i3; l4++)
                        {
                            class36.anIntArrayArray581[l1][l4] = class13_sub1_sub2.method313();
                        }
                    }
                }
                if(class36.anInt570 == 0)
                {
                    class36.anInt598 = class13_sub1_sub2.method313();
                    class36.aBoolean561 = class13_sub1_sub2.method311() == 1;
                    int i2 = class13_sub1_sub2.method313();
                    class36.anIntArray549 = new int[i2];
                    class36.anIntArray591 = new int[i2];
                    class36.anIntArray557 = new int[i2];
                    for(int j3 = 0; j3 < i2; j3++)
                    {
                        class36.anIntArray549[j3] = class13_sub1_sub2.method313();
                        class36.anIntArray591[j3] = class13_sub1_sub2.method314();
                        class36.anIntArray557[j3] = class13_sub1_sub2.method314();
                    }
                }
                if(class36.anInt570 == 1)
                {
                    class36.anInt574 = class13_sub1_sub2.method313();
                    class36.aBoolean594 = class13_sub1_sub2.method311() == 1;
                }
                if(class36.anInt570 == 2)
                {
                    class36.anIntArray576 = new int[class36.anInt582 * class36.anInt586];
                    class36.anIntArray579 = new int[class36.anInt582 * class36.anInt586];
                    class36.aBoolean538 = class13_sub1_sub2.method311() == 1;
                    class36.aBoolean585 = class13_sub1_sub2.method311() == 1;
                    class36.aBoolean552 = class13_sub1_sub2.method311() == 1;
                    class36.aBoolean578 = class13_sub1_sub2.method311() == 1;
                    class36.anInt599 = class13_sub1_sub2.method311();
                    class36.anInt554 = class13_sub1_sub2.method311();
                    class36.anIntArray580 = new int[20];
                    class36.anIntArray560 = new int[20];
                    class36.aClass13_Sub1_Sub4_Sub4Array539 = new Class13_Sub1_Sub4_Sub4[20];
                    for(int j2 = 0; j2 < 20; j2++)
                    {
                        int k3 = class13_sub1_sub2.method311();
                        if(k3 == 1)
                        {
                            class36.anIntArray580[j2] = class13_sub1_sub2.method314();
                            class36.anIntArray560[j2] = class13_sub1_sub2.method314();
                            String s1 = class13_sub1_sub2.method318();
                            if(class1_1 != null && s1.length() > 0)
                            {
                                int i5 = s1.lastIndexOf(",");
                                class36.aClass13_Sub1_Sub4_Sub4Array539[j2] = method500(Integer.parseInt(s1.substring(i5 + 1)), false, class1_1, s1.substring(0, i5));
                            }
                        }
                    }
                    class36.aStringArray547 = new String[5];
                    for(int l3 = 0; l3 < 5; l3++)
                    {
                        class36.aStringArray547[l3] = class13_sub1_sub2.method318();
                        if(class36.aStringArray547[l3].length() == 0)
                        {
                            class36.aStringArray547[l3] = null;
                        }
                    }
                }
                if(class36.anInt570 == 3)
                {
                    class36.aBoolean555 = class13_sub1_sub2.method311() == 1;
                }
                if(class36.anInt570 == 4 || class36.anInt570 == 1)
                {
                    class36.aBoolean551 = class13_sub1_sub2.method311() == 1;
                    int k2 = class13_sub1_sub2.method311();
                    if(aclass13_sub1_sub4_sub2 != null)
                    {
                        class36.aClass13_Sub1_Sub4_Sub2_583 = aclass13_sub1_sub4_sub2[k2];
                    }
                    class36.aBoolean559 = class13_sub1_sub2.method311() == 1;
                }
                if(class36.anInt570 == 4)
                {
                    class36.aString548 = class13_sub1_sub2.method318();
                    class36.aString589 = class13_sub1_sub2.method318();
                }
                if(class36.anInt570 == 1 || class36.anInt570 == 3 || class36.anInt570 == 4)
                {
                    class36.anInt550 = class13_sub1_sub2.method316();
                }
                if(class36.anInt570 == 3 || class36.anInt570 == 4)
                {
                    class36.anInt544 = class13_sub1_sub2.method316();
                    class36.anInt596 = class13_sub1_sub2.method316();
                    class36.anInt566 = class13_sub1_sub2.method316();
                }
                if(class36.anInt570 == 5)
                {
                    String s = class13_sub1_sub2.method318();
                    if(class1_1 != null && s.length() > 0)
                    {
                        int i4 = s.lastIndexOf(",");
                        class36.aClass13_Sub1_Sub4_Sub4_569 = method500(Integer.parseInt(s.substring(i4 + 1)), false, class1_1, s.substring(0, i4));
                    }
                    s = class13_sub1_sub2.method318();
                    if(class1_1 != null && s.length() > 0)
                    {
                        int j4 = s.lastIndexOf(",");
                        class36.aClass13_Sub1_Sub4_Sub4_565 = method500(Integer.parseInt(s.substring(j4 + 1)), false, class1_1, s.substring(0, j4));
                    }
                }
                if(class36.anInt570 == 6)
                {
                    int l = class13_sub1_sub2.method311();
                    if(l != 0)
                    {
                        class36.anInt541 = 1;
                        class36.anInt542 = (l - 1 << 8) + class13_sub1_sub2.method311();
                    }
                    l = class13_sub1_sub2.method311();
                    if(l != 0)
                    {
                        class36.anInt587 = 1;
                        class36.anInt588 = (l - 1 << 8) + class13_sub1_sub2.method311();
                    }
                    l = class13_sub1_sub2.method311();
                    if(l != 0)
                    {
                        class36.anInt571 = (l - 1 << 8) + class13_sub1_sub2.method311();
                    } else
                    {
                        class36.anInt571 = -1;
                    }
                    l = class13_sub1_sub2.method311();
                    if(l != 0)
                    {
                        class36.anInt572 = (l - 1 << 8) + class13_sub1_sub2.method311();
                    } else
                    {
                        class36.anInt572 = -1;
                    }
                    class36.anInt534 = class13_sub1_sub2.method313();
                    class36.anInt535 = class13_sub1_sub2.method313();
                    class36.anInt536 = class13_sub1_sub2.method313();
                }
                if(class36.anInt570 == 7)
                {
                    class36.anIntArray576 = new int[class36.anInt582 * class36.anInt586];
                    class36.anIntArray579 = new int[class36.anInt582 * class36.anInt586];
                    class36.aBoolean551 = class13_sub1_sub2.method311() == 1;
                    int l2 = class13_sub1_sub2.method311();
                    if(aclass13_sub1_sub4_sub2 != null)
                    {
                        class36.aClass13_Sub1_Sub4_Sub2_583 = aclass13_sub1_sub4_sub2[l2];
                    }
                    class36.aBoolean559 = class13_sub1_sub2.method311() == 1;
                    class36.anInt550 = class13_sub1_sub2.method316();
                    class36.anInt599 = class13_sub1_sub2.method314();
                    class36.anInt554 = class13_sub1_sub2.method314();
                    class36.aBoolean585 = class13_sub1_sub2.method311() == 1;
                    class36.aStringArray547 = new String[5];
                    for(int k4 = 0; k4 < 5; k4++)
                    {
                        class36.aStringArray547[k4] = class13_sub1_sub2.method318();
                        if(class36.aStringArray547[k4].length() == 0)
                        {
                            class36.aStringArray547[k4] = null;
                        }
                    }
                }
                if(class36.anInt597 == 2 || class36.anInt570 == 2)
                {
                    class36.aString563 = class13_sub1_sub2.method318();
                    class36.aString553 = class13_sub1_sub2.method318();
                    class36.anInt558 = class13_sub1_sub2.method313();
                }
                if(class36.anInt597 == 1 || class36.anInt597 == 4 || class36.anInt597 == 5 || class36.anInt597 == 6)
                {
                    class36.aString564 = class13_sub1_sub2.method318();
                    if(class36.aString564.length() == 0)
                    {
                        if(class36.anInt597 == 1)
                        {
                            class36.aString564 = "Ok";
                        }
                        if(class36.anInt597 == 4)
                        {
                            class36.aString564 = "Select";
                        }
                        if(class36.anInt597 == 5)
                        {
                            class36.aString564 = "Select";
                        }
                        if(class36.anInt597 == 6)
                        {
                            class36.aString564 = "Continue";
                        }
                    }
                }
            }
            aClass3_584 = null;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("68183, " + class1 + ", " + flag + ", " + class1_1 + ", " + aclass13_sub1_sub4_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method502(int i, byte byte0, int j)
    {
        try
        {
            int k = anIntArray576[i];
            anIntArray576[i] = anIntArray576[j];
            if(byte0 == 0)
            {
                byte0 = 0;
            } else
            {
                return;
            }
            anIntArray576[j] = k;
            k = anIntArray579[i];
            anIntArray579[i] = anIntArray579[j];
            anIntArray579[j] = k;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("23341, " + i + ", " + byte0 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class36()
    {
    }

}
