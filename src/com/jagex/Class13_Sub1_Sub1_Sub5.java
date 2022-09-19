package com.jagex;

import com.jagex.sign.signlink;

public class Class13_Sub1_Sub1_Sub5 extends Class13_Sub1_Sub1
{

    public int anInt1563;
    public int anInt1564;
    public boolean aBoolean1565;

    public Class13_Sub1_Sub1_Sub4 method256(int i)
    {
        try
        {
            if(i <= 0)
            {
                aBoolean1565 = !aBoolean1565;
            }
            Class38 class38 = Class38.method505(anInt1563);
            return class38.method509(anInt1564);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("47430, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub1_Sub5()
    {
        aBoolean1565 = false;
    }
}
