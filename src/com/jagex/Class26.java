package com.jagex;

import com.jagex.sign.signlink;

public class Class26
{

    public static boolean aBoolean436;
    public int anInt437;
    public static int anInt438;
    public static Class26 aClass26Array439[];
    public String aString440;
    public int anInt441;
    public int anInt442;
    public int anInt443;
    public boolean aBoolean444;
    public int anInt445;
    public int anInt446;

    public static void method473(Class1 class1, byte byte0)
    {
        try
        {
            Class13_Sub1_Sub2 class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, class1.method149("varbit.dat", null));
            anInt438 = class13_sub1_sub2.method313();
            if(aClass26Array439 == null)
            {
                aClass26Array439 = new Class26[anInt438];
            }
            for(int i = 0; i < anInt438; i++)
            {
                if(aClass26Array439[i] == null)
                {
                    aClass26Array439[i] = new Class26();
                }
                aClass26Array439[i].method474(i, 40848, class13_sub1_sub2);
                if(aClass26Array439[i].aBoolean444)
                {
                    Class22.aClass22Array365[aClass26Array439[i].anInt441].aBoolean377 = true;
                }
            }
            if(byte0 != 72)
            {
                aBoolean436 = !aBoolean436;
            }
            if(class13_sub1_sub2.anInt1399 != class13_sub1_sub2.aByteArray1398.length)
            {
                System.out.println("varbit load mismatch");
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("40928, " + class1 + ", " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method474(int i, int j, Class13_Sub1_Sub2 class13_sub1_sub2)
    {
        try
        {
            if(j != anInt437)
            {
                return;
            }
            do
            {
                int k = class13_sub1_sub2.method311();
                if(k == 0)
                {
                    return;
                }
                if(k == 1)
                {
                    anInt441 = class13_sub1_sub2.method313();
                    anInt442 = class13_sub1_sub2.method311();
                    anInt443 = class13_sub1_sub2.method311();
                } else
                if(k == 10)
                {
                    aString440 = class13_sub1_sub2.method318();
                } else
                if(k == 2)
                {
                    aBoolean444 = true;
                } else
                if(k == 3)
                {
                    anInt445 = class13_sub1_sub2.method316();
                } else
                if(k == 4)
                {
                    anInt446 = class13_sub1_sub2.method316();
                } else
                {
                    System.out.println("Error unrecognised config code: " + k);
                }
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("41080, " + i + ", " + j + ", " + class13_sub1_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class26()
    {
        anInt437 = 40848;
        aBoolean444 = false;
        anInt445 = -1;
    }
}
