package com.jagex;

import com.jagex.sign.Signlink;

public class Class29
{

    public int anInt462;
    public boolean aBoolean463;
    public int anInt464;
    public int anIntArray465[];
    public int anIntArrayArrayArray466[][][];
    public int anIntArrayArrayArray467[][][];
    public int anIntArray468[];
    public static float aFloatArrayArray469[][] = new float[2][8];
    public static int anIntArrayArray470[][] = new int[2][8];
    public static float aFloat471;
    public static int anInt472;

    public float method485(float f, int i, int j, int k)
    {
        try
        {
            float f1 = (float)anIntArrayArrayArray467[j][0][k] + f * (float)(anIntArrayArrayArray467[j][1][k] - anIntArrayArrayArray467[j][0][k]);
            if(i >= 0)
            {
                anInt462 = 15;
            }
            f1 *= 0.001525879F;
            return 1.0F - (float)Math.pow(10D, -f1 / 20F);
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("17456, " + f + ", " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public float method486(float f, boolean flag)
    {
        try
        {
            float f1 = 32.7032F * (float)Math.pow(2D, f);
            if(!flag)
            {
                anInt462 = -398;
            }
            return (f1 * 3.141593F) / 11025F;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("14901, " + f + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public float method487(int i, float f, int j, int k)
    {
        try
        {
            float f1 = (float)anIntArrayArrayArray466[i][0][k] + f * (float)(anIntArrayArrayArray466[i][1][k] - anIntArrayArrayArray466[i][0][k]);
            if(j <= 0)
            {
                throw new NullPointerException();
            } else
            {
                f1 *= 0.0001220703F;
                return method486(f1, aBoolean463);
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("64420, " + i + ", " + f + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method488(int i, int j, float f)
    {
        try
        {
            if(i == 0)
            {
                float f1 = (float)anIntArray468[0] + (float)(anIntArray468[1] - anIntArray468[0]) * f;
                f1 *= 0.003051758F;
                aFloat471 = (float)Math.pow(0.10000000000000001D, f1 / 20F);
                anInt472 = (int)(aFloat471 * 65536F);
            }
            if(anIntArray465[i] == 0)
            {
                return 0;
            }
            float f2 = method485(f, -508, i, 0);
            if(j != 0)
            {
                return anInt462;
            }
            aFloatArrayArray469[i][0] = -2F * f2 * (float)Math.cos(method487(i, f, 923, 0));
            aFloatArrayArray469[i][1] = f2 * f2;
            for(int k = 1; k < anIntArray465[i]; k++)
            {
                float f3 = method485(f, -508, i, k);
                float f4 = -2F * f3 * (float)Math.cos(method487(i, f, 923, k));
                float f5 = f3 * f3;
                aFloatArrayArray469[i][k * 2 + 1] = aFloatArrayArray469[i][k * 2 - 1] * f5;
                aFloatArrayArray469[i][k * 2] = aFloatArrayArray469[i][k * 2 - 1] * f4 + aFloatArrayArray469[i][k * 2 - 2] * f5;
                for(int j1 = k * 2 - 1; j1 >= 2; j1--)
                {
                    aFloatArrayArray469[i][j1] += aFloatArrayArray469[i][j1 - 1] * f4 + aFloatArrayArray469[i][j1 - 2] * f5;
                }
                aFloatArrayArray469[i][1] += aFloatArrayArray469[i][0] * f4 + f5;
                aFloatArrayArray469[i][0] += f4;
            }
            if(i == 0)
            {
                for(int l = 0; l < anIntArray465[0] * 2; l++)
                {
                    aFloatArrayArray469[0][l] *= aFloat471;
                }
            }
            for(int i1 = 0; i1 < anIntArray465[i] * 2; i1++)
            {
                anIntArrayArray470[i][i1] = (int)(aFloatArrayArray469[i][i1] * 65536F);
            }
            return anIntArray465[i] * 2;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("12887, " + i + ", " + j + ", " + f + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method489(Class6 class6, int i, Class13_Sub1_Sub2 class13_sub1_sub2)
    {
        try
        {
            int j = class13_sub1_sub2.readUnsignedByte();
            anIntArray465[0] = j >> 4;
            anIntArray465[1] = j & 0xf;
            if(i != anInt464)
            {
                aBoolean463 = !aBoolean463;
            }
            if(j != 0)
            {
                anIntArray468[0] = class13_sub1_sub2.readUnsignedShort();
                anIntArray468[1] = class13_sub1_sub2.readUnsignedShort();
                int k = class13_sub1_sub2.readUnsignedByte();
                for(int l = 0; l < 2; l++)
                {
                    for(int i1 = 0; i1 < anIntArray465[l]; i1++)
                    {
                        anIntArrayArrayArray466[l][0][i1] = class13_sub1_sub2.readUnsignedShort();
                        anIntArrayArrayArray467[l][0][i1] = class13_sub1_sub2.readUnsignedShort();
                    }
                }
                for(int j1 = 0; j1 < 2; j1++)
                {
                    for(int k1 = 0; k1 < anIntArray465[j1]; k1++)
                    {
                        if((k & 1 << j1 * 4 << k1) != 0)
                        {
                            anIntArrayArrayArray466[j1][1][k1] = class13_sub1_sub2.readUnsignedShort();
                            anIntArrayArrayArray467[j1][1][k1] = class13_sub1_sub2.readUnsignedShort();
                        } else
                        {
                            anIntArrayArrayArray466[j1][1][k1] = anIntArrayArrayArray466[j1][0][k1];
                            anIntArrayArrayArray467[j1][1][k1] = anIntArrayArrayArray467[j1][0][k1];
                        }
                    }
                }
                if(k != 0 || anIntArray468[1] != anIntArray468[0])
                {
                    class6.method182(class13_sub1_sub2, false);
                }
                return;
            } else
            {
                anIntArray468[0] = anIntArray468[1] = 0;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("23814, " + class6 + ", " + i + ", " + class13_sub1_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class29()
    {
        anInt462 = -168;
        aBoolean463 = true;
        anInt464 = 40848;
        anIntArray465 = new int[2];
        anIntArrayArrayArray466 = new int[2][2][4];
        anIntArrayArrayArray467 = new int[2][2][4];
        anIntArray468 = new int[2];
    }

}
