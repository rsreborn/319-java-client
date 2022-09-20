package com.jagex;

import com.jagex.sign.signlink;

public class Class22
{

    public int anInt363;
    public static int anInt364;
    public static Class22 aClass22Array365[];
    public static int anInt366;
    public static int anIntArray367[];
    public String aString368;
    public int anInt369;
    public int anInt370;
    public boolean aBoolean371;
    public boolean aBoolean372;
    public int anInt373;
    public boolean aBoolean374;
    public int anInt375;
    public int anInt376;
    public boolean aBoolean377;
    public int anInt378;

    public static void method444(Class1 class1, byte byte0)
    {
        try
        {
            Class13_Sub1_Sub2 class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, class1.method149("varp.dat", null));
            anInt366 = 0;
            anInt364 = class13_sub1_sub2.method313();
            if(byte0 != 72)
            {
                return;
            }
            if(aClass22Array365 == null)
            {
                aClass22Array365 = new Class22[anInt364];
            }
            if(anIntArray367 == null)
            {
                anIntArray367 = new int[anInt364];
            }
            for(int i = 0; i < anInt364; i++)
            {
                if(aClass22Array365[i] == null)
                {
                    aClass22Array365[i] = new Class22();
                }
                aClass22Array365[i].method445(i, 40848, class13_sub1_sub2);
            }
            if(class13_sub1_sub2.anInt1399 != class13_sub1_sub2.aByteArray1398.length)
            {
                System.out.println("varptype load mismatch");
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("22263, " + class1 + ", " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method445(int i, int j, Class13_Sub1_Sub2 class13_sub1_sub2)
    {
        try
        {
            if(j != anInt363)
            {
                anInt363 = -362;
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
                    anInt369 = class13_sub1_sub2.method311();
                } else
                if(k == 2)
                {
                    anInt370 = class13_sub1_sub2.method311();
                } else
                if(k == 3)
                {
                    aBoolean371 = true;
                    anIntArray367[anInt366++] = i;
                } else
                if(k == 4)
                {
                    aBoolean372 = false;
                } else
                if(k == 5)
                {
                    anInt373 = class13_sub1_sub2.method313();
                } else
                if(k == 6)
                {
                    aBoolean374 = true;
                } else
                if(k == 7)
                {
                    anInt375 = class13_sub1_sub2.method316();
                } else
                if(k == 8)
                {
                    anInt376 = 1;
                    aBoolean377 = true;
                } else
                if(k == 10)
                {
                    aString368 = class13_sub1_sub2.method318();
                } else
                if(k == 11)
                {
                    aBoolean377 = true;
                } else
                if(k == 12)
                {
                    anInt378 = class13_sub1_sub2.method316();
                } else
                if(k == 13)
                {
                    anInt376 = 2;
                } else
                {
                    System.out.println("Error unrecognised config code: " + k);
                }
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("88500, " + i + ", " + j + ", " + class13_sub1_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class22()
    {
        anInt363 = 40848;
        aBoolean371 = false;
        aBoolean372 = true;
        aBoolean374 = false;
        aBoolean377 = false;
        anInt378 = -1;
    }
}
