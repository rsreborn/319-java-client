package com.jagex;

import com.jagex.sign.Signlink;

public class Class35
{

    public int anInt529;
    public int anInt530;
    public int anIntArray531[];
    public int anIntArrayArray532[][];

    public Class35(Class13_Sub1_Sub2 class13_sub1_sub2, boolean flag)
    {
        anInt529 = -22144;
        try
        {
            anInt530 = class13_sub1_sub2.readUnsignedByte();
            anIntArray531 = new int[anInt530];
            anIntArrayArray532 = new int[anInt530][];
            if(flag)
            {
                anInt529 = -3;
            }
            for(int i = 0; i < anInt530; i++)
            {
                anIntArray531[i] = class13_sub1_sub2.readUnsignedByte();
            }
            for(int j = 0; j < anInt530; j++)
            {
                int k = class13_sub1_sub2.readUnsignedByte();
                anIntArrayArray532[j] = new int[k];
                for(int l = 0; l < k; l++)
                {
                    anIntArrayArray532[j][l] = class13_sub1_sub2.readUnsignedByte();
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("6800, " + class13_sub1_sub2 + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
