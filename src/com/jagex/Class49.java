package com.jagex;

import com.jagex.sign.Signlink;

public class Class49
{

    public int anInt793;
    public boolean aBoolean794;
    public int anInt795;
    public Class13 aClass13Array796[];

    public Class49(int i, boolean flag)
    {
        anInt793 = -16631;
        aBoolean794 = false;
        try
        {
            if(flag)
            {
                aBoolean794 = !aBoolean794;
            }
            anInt795 = i;
            aClass13Array796 = new Class13[i];
            for(int j = 0; j < i; j++)
            {
                Class13 class13 = aClass13Array796[j] = new Class13();
                class13.aClass13_236 = class13;
                class13.aClass13_237 = class13;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("39702, " + i + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class13 method589(long l)
    {
        Class13 class13 = aClass13Array796[(int)(l & (long)(anInt795 - 1))];
        for(Class13 class13_1 = class13.aClass13_236; class13_1 != class13; class13_1 = class13_1.aClass13_236)
        {
            if(class13_1.aLong235 == l)
            {
                return class13_1;
            }
        }
        return null;
    }

    public void method590(long l, Class13 class13, byte byte0)
    {
        try
        {
            if(byte0 == 5)
            {
                byte0 = 0;
            } else
            {
                for(int i = 1; i > 0; i++)
                {
                }
            }
            if(class13.aClass13_237 != null)
            {
                class13.method253();
            }
            Class13 class13_1 = aClass13Array796[(int)(l & (long)(anInt795 - 1))];
            class13.aClass13_237 = class13_1.aClass13_237;
            class13.aClass13_236 = class13_1;
            class13.aClass13_237.aClass13_236 = class13;
            class13.aClass13_236.aClass13_237 = class13;
            class13.aLong235 = l;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("10056, " + l + ", " + class13 + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
