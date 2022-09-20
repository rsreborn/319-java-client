package com.jagex;

import com.jagex.sign.signlink;

public class Class27
{

    public int anInt447;
    public boolean aBoolean448;
    public static Class27 aClass27Array449[] = new Class27[5000];
    public static int anIntArray450[] = new int[5000];
    public static byte aByteArray451[];
    public static Class13_Sub1_Sub2 aClass13_Sub1_Sub2_452;
    public Class17 aClass17Array453[];
    public int anInt454;
    public int anInt455;

    public Class27(byte byte0)
    {
        anInt447 = 1;
        aBoolean448 = true;
        aClass17Array453 = new Class17[10];
        try
        {
            if(byte0 != 9)
            {
                throw new NullPointerException();
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("30937, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static void method475(Class13_Sub1_Sub2 class13_sub1_sub2, byte byte0)
    {
        try
        {
            if(byte0 != 72)
            {
                return;
            }
            aByteArray451 = new byte[0x6baa8];
            aClass13_Sub1_Sub2_452 = new Class13_Sub1_Sub2(-351, aByteArray451);
            Class17.method435();
            do
            {
                int i = class13_sub1_sub2.method313();
                if(i == 65535)
                {
                    return;
                }
                aClass27Array449[i] = new Class27((byte)9);
                aClass27Array449[i].method477(class13_sub1_sub2, 26421);
                anIntArray450[i] = aClass27Array449[i].method478(false);
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("66826, " + class13_sub1_sub2 + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static Class13_Sub1_Sub2 method476(byte byte0, int i, int j)
    {
        try
        {
            if(byte0 != -97)
            {
                throw new NullPointerException();
            }
            if(aClass27Array449[i] != null)
            {
                Class27 class27 = aClass27Array449[i];
                return class27.method479(j, 0);
            } else
            {
                return null;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("38598, " + byte0 + ", " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method477(Class13_Sub1_Sub2 class13_sub1_sub2, int i)
    {
        try
        {
            for(int j = 0; j < 10; j++)
            {
                int k = class13_sub1_sub2.method311();
                if(k != 0)
                {
                    class13_sub1_sub2.anInt1399--;
                    aClass17Array453[j] = new Class17();
                    aClass17Array453[j].method438(class13_sub1_sub2, 26421);
                }
            }
            if(i != 26421)
            {
                aBoolean448 = !aBoolean448;
            }
            anInt454 = class13_sub1_sub2.method313();
            anInt455 = class13_sub1_sub2.method313();
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("73125, " + class13_sub1_sub2 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method478(boolean flag)
    {
        try
        {
            int i = 0x98967f;
            if(flag)
            {
                return 2;
            }
            for(int j = 0; j < 10; j++)
            {
                if(aClass17Array453[j] != null && aClass17Array453[j].anInt318 / 20 < i)
                {
                    i = aClass17Array453[j].anInt318 / 20;
                }
            }
            if(anInt454 < anInt455 && anInt454 / 20 < i)
            {
                i = anInt454 / 20;
            }
            if(i == 0x98967f || i == 0)
            {
                return 0;
            }
            for(int k = 0; k < 10; k++)
            {
                if(aClass17Array453[k] != null)
                {
                    aClass17Array453[k].anInt318 -= i * 20;
                }
            }
            if(anInt454 < anInt455)
            {
                anInt454 -= i * 20;
                anInt455 -= i * 20;
            }
            return i;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("23085, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub2 method479(int i, int j)
    {
        try
        {
            int k = method480(i);
            aClass13_Sub1_Sub2_452.anInt1399 = 0;
            aClass13_Sub1_Sub2_452.method305(0x52494646);
            aClass13_Sub1_Sub2_452.method306(36 + k, anInt447);
            aClass13_Sub1_Sub2_452.method305(0x57415645);
            aClass13_Sub1_Sub2_452.method305(0x666d7420);
            aClass13_Sub1_Sub2_452.method306(16, anInt447);
            aClass13_Sub1_Sub2_452.method303(true, 1);
            aClass13_Sub1_Sub2_452.method303(true, 1);
            aClass13_Sub1_Sub2_452.method306(22050, anInt447);
            aClass13_Sub1_Sub2_452.method306(22050, anInt447);
            aClass13_Sub1_Sub2_452.method303(true, 1);
            if(j != 0)
            {
                for(int l = 1; l > 0; l++)
                {
                }
            }
            aClass13_Sub1_Sub2_452.method303(true, 8);
            aClass13_Sub1_Sub2_452.method305(0x64617461);
            aClass13_Sub1_Sub2_452.method306(k, anInt447);
            aClass13_Sub1_Sub2_452.anInt1399 += k;
            return aClass13_Sub1_Sub2_452;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("2801, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method480(int i)
    {
        int j = 0;
        for(int k = 0; k < 10; k++)
        {
            if(aClass17Array453[k] != null && aClass17Array453[k].anInt317 + aClass17Array453[k].anInt318 > j)
            {
                j = aClass17Array453[k].anInt317 + aClass17Array453[k].anInt318;
            }
        }
        if(j == 0)
        {
            return 0;
        }
        int l = (22050 * j) / 1000;
        int i1 = (22050 * anInt454) / 1000;
        int j1 = (22050 * anInt455) / 1000;
        if(i1 < 0 || i1 > l || j1 < 0 || j1 > l || i1 >= j1)
        {
            i = 0;
        }
        int k1 = l + (j1 - i1) * (i - 1);
        for(int l1 = 44; l1 < k1 + 44; l1++)
        {
            aByteArray451[l1] = -128;
        }
        for(int i2 = 0; i2 < 10; i2++)
        {
            if(aClass17Array453[i2] != null)
            {
                int j2 = (aClass17Array453[i2].anInt317 * 22050) / 1000;
                int i3 = (aClass17Array453[i2].anInt318 * 22050) / 1000;
                int ai[] = aClass17Array453[i2].method436(j2, aClass17Array453[i2].anInt317);
                for(int l3 = 0; l3 < j2; l3++)
                {
                    aByteArray451[l3 + i3 + 44] += (byte)(ai[l3] >> 8);
                }
            }
        }
        if(i > 1)
        {
            i1 += 44;
            j1 += 44;
            l += 44;
            int k2 = (k1 += 44) - l;
            for(int j3 = l - 1; j3 >= j1; j3--)
            {
                aByteArray451[j3 + k2] = aByteArray451[j3];
            }
            for(int k3 = 1; k3 < i; k3++)
            {
                int l2 = (j1 - i1) * k3;
                for(int i4 = i1; i4 < j1; i4++)
                {
                    aByteArray451[i4 + l2] = aByteArray451[i4];
                }
            }
            k1 -= 44;
        }
        return k1;
    }

}
