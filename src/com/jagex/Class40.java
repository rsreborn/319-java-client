package com.jagex;

import com.jagex.sign.Signlink;

public class Class40
{

    public static int anInt683;
    public static int anInt684;
    public static Class40 aClass40Array685[];
    public int anInt686;
    public int anInt687;
    public int anInt688;
    public Class50 aClass50_689;
    public int anIntArray690[];
    public int anIntArray691[];
    public int anInt692;
    public int anInt693;
    public int anInt694;
    public int anInt695;
    public int anInt696;
    public static Class3 aClass3_697 = new Class3(30, 31);

    public static void method528(Class1 class1, byte byte0)
    {
        try
        {
            Class13_Sub1_Sub2 class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, class1.method149("spotanim.dat", null));
            if(byte0 != 72)
            {
                anInt683 = -170;
            }
            anInt684 = class13_sub1_sub2.readUnsignedShort();
            if(aClass40Array685 == null)
            {
                aClass40Array685 = new Class40[anInt684];
            }
            for(int i = 0; i < anInt684; i++)
            {
                if(aClass40Array685[i] == null)
                {
                    aClass40Array685[i] = new Class40();
                }
                aClass40Array685[i].anInt686 = i;
                aClass40Array685[i].method529(class13_sub1_sub2, 26421);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("95120, " + class1 + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method529(Class13_Sub1_Sub2 class13_sub1_sub2, int i)
    {
        try
        {
            if(i != 26421)
            {
                anInt683 = -226;
            }
            do
            {
                int j = class13_sub1_sub2.readUnsignedByte();
                if(j == 0)
                {
                    return;
                }
                if(j == 1)
                {
                    anInt687 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(j == 2)
                {
                    anInt688 = class13_sub1_sub2.readUnsignedShort();
                    if(Class50.aClass50Array800 != null)
                    {
                        aClass50_689 = Class50.aClass50Array800[anInt688];
                    }
                } else
                if(j == 4)
                {
                    anInt692 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(j == 5)
                {
                    anInt693 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(j == 6)
                {
                    anInt694 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(j == 7)
                {
                    anInt695 = class13_sub1_sub2.readUnsignedByte();
                } else
                if(j == 8)
                {
                    anInt696 = class13_sub1_sub2.readUnsignedByte();
                } else
                if(j >= 40 && j < 50)
                {
                    anIntArray690[j - 40] = class13_sub1_sub2.readUnsignedShort();
                } else
                if(j >= 50 && j < 60)
                {
                    anIntArray691[j - 50] = class13_sub1_sub2.readUnsignedShort();
                } else
                {
                    System.out.println("Error unrecognised spotanim config code: " + j);
                }
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("15841, " + class13_sub1_sub2 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub1_Sub4 method530()
    {
        Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = (Class13_Sub1_Sub1_Sub4)aClass3_697.method172(anInt686);
        if(class13_sub1_sub1_sub4 != null)
        {
            return class13_sub1_sub1_sub4;
        }
        class13_sub1_sub1_sub4 = Class13_Sub1_Sub1_Sub4.method265((byte)4, anInt687);
        if(class13_sub1_sub1_sub4 == null)
        {
            return null;
        }
        for(int i = 0; i < 6; i++)
        {
            if(anIntArray690[0] != 0)
            {
                class13_sub1_sub1_sub4.method279(anIntArray690[i], anIntArray691[i]);
            }
        }
        aClass3_697.method173(class13_sub1_sub1_sub4, anInt686, 9388);
        return class13_sub1_sub1_sub4;
    }

    public Class40()
    {
        anInt688 = -1;
        anIntArray690 = new int[6];
        anIntArray691 = new int[6];
        anInt692 = 128;
        anInt693 = 128;
    }

}
