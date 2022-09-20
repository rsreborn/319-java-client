package com.jagex;

import com.jagex.sign.Signlink;

public class Class42
{

    public static int anInt716;

    public static int method569(boolean flag, int i, int j, int k)
    {
        try
        {
            i &= 3;
            if(flag)
            {
                return 1;
            }
            if(i == 0)
            {
                return j;
            }
            if(i == 1)
            {
                return k;
            }
            if(i == 2)
            {
                return 7 - j;
            } else
            {
                return 7 - k;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("88570, " + flag + ", " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method570(int i, int j, int k, int l)
    {
        try
        {
            if(j != 0)
            {
                return 4;
            }
            i &= 3;
            if(i == 0)
            {
                return k;
            }
            if(i == 1)
            {
                return 7 - l;
            }
            if(i == 2)
            {
                return 7 - k;
            } else
            {
                return l;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("96241, " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method571(int i, int j, int k, int l, int i1, int j1)
    {
        try
        {
            i &= 3;
            if(j1 != 9)
            {
                anInt716 = 0;
            }
            if(i == 0)
            {
                return l;
            }
            if(i == 1)
            {
                return k;
            }
            if(i == 2)
            {
                return 7 - l - (j - 1);
            } else
            {
                return 7 - k - (i1 - 1);
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("42712, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method572(int i, int j, int k, int l, int i1, int j1)
    {
        try
        {
            if(j >= 0)
            {
                anInt716 = 360;
            }
            j1 &= 3;
            if(j1 == 0)
            {
                return l;
            }
            if(j1 == 1)
            {
                return 7 - i - (i1 - 1);
            }
            if(j1 == 2)
            {
                return 7 - l - (k - 1);
            } else
            {
                return i;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("77796, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
