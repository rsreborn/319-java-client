package com.jagex;

import com.jagex.sign.signlink;

public class Class50
{

    public static int anInt797 = 12258;
    public boolean aBoolean798;
    public static int anInt799;
    public static Class50 aClass50Array800[];
    public int anInt801;
    public int anIntArray802[];
    public int anIntArray803[];
    public int anIntArray804[];
    public int anInt805;
    public int anIntArray806[];
    public boolean aBoolean807;
    public int anInt808;
    public int anInt809;
    public int anInt810;
    public int anInt811;
    public int anInt812;
    public int anInt813;
    public int anInt814;
    public int anInt815;
    public static int anInt816;

    public static void method591(Class1 class1, byte byte0)
    {
        try
        {
            Class13_Sub1_Sub2 class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, class1.method149("seq.dat", null));
            anInt799 = class13_sub1_sub2.readUnsignedShort();
            if(byte0 != 72)
            {
                anInt797 = -421;
            }
            if(aClass50Array800 == null)
            {
                aClass50Array800 = new Class50[anInt799];
            }
            for(int i = 0; i < anInt799; i++)
            {
                if(aClass50Array800[i] == null)
                {
                    aClass50Array800[i] = new Class50();
                }
                aClass50Array800[i].method593(class13_sub1_sub2, 26421);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("59847, " + class1 + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method592(int i, int j)
    {
        try
        {
            int k = anIntArray804[j];
            if(i != 0)
            {
                return anInt797;
            }
            if(k == 0)
            {
                Class8 class8 = Class8.method188((byte)4, anIntArray802[j]);
                if(class8 != null)
                {
                    k = anIntArray804[j] = class8.anInt137;
                }
            }
            if(k == 0)
            {
                k = 1;
            }
            return k;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("57090, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method593(Class13_Sub1_Sub2 class13_sub1_sub2, int i)
    {
        try
        {
            if(i != 26421)
            {
                aBoolean798 = !aBoolean798;
            }
            do
            {
                int j = class13_sub1_sub2.readUnsignedByte();
                if(j == 0)
                {
                    break;
                }
                if(j == 1)
                {
                    anInt801 = class13_sub1_sub2.readUnsignedByte();
                    anIntArray802 = new int[anInt801];
                    anIntArray803 = new int[anInt801];
                    anIntArray804 = new int[anInt801];
                    for(int k = 0; k < anInt801; k++)
                    {
                        anIntArray802[k] = class13_sub1_sub2.readUnsignedShort();
                        anIntArray803[k] = class13_sub1_sub2.readUnsignedShort();
                        if(anIntArray803[k] == 65535)
                        {
                            anIntArray803[k] = -1;
                        }
                        anIntArray804[k] = class13_sub1_sub2.readUnsignedShort();
                    }
                } else
                if(j == 2)
                {
                    anInt805 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(j == 3)
                {
                    int l = class13_sub1_sub2.readUnsignedByte();
                    anIntArray806 = new int[l + 1];
                    for(int i1 = 0; i1 < l; i1++)
                    {
                        anIntArray806[i1] = class13_sub1_sub2.readUnsignedByte();
                    }
                    anIntArray806[l] = 0x98967f;
                } else
                if(j == 4)
                {
                    aBoolean807 = true;
                } else
                if(j == 5)
                {
                    anInt808 = class13_sub1_sub2.readUnsignedByte();
                } else
                if(j == 6)
                {
                    anInt809 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(j == 7)
                {
                    anInt810 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(j == 8)
                {
                    anInt811 = class13_sub1_sub2.readUnsignedByte();
                } else
                if(j == 9)
                {
                    anInt812 = class13_sub1_sub2.readUnsignedByte();
                } else
                if(j == 10)
                {
                    anInt813 = class13_sub1_sub2.readUnsignedByte();
                } else
                if(j == 11)
                {
                    anInt814 = class13_sub1_sub2.readUnsignedByte();
                } else
                if(j == 12)
                {
                    anInt815 = class13_sub1_sub2.readInt();
                } else
                {
                    System.out.println("Error unrecognised seq config code: " + j);
                }
            } while(true);
            if(anInt801 == 0)
            {
                anInt801 = 1;
                anIntArray802 = new int[1];
                anIntArray802[0] = -1;
                anIntArray803 = new int[1];
                anIntArray803[0] = -1;
                anIntArray804 = new int[1];
                anIntArray804[0] = -1;
            }
            if(anInt812 == -1)
            {
                if(anIntArray806 != null)
                {
                    anInt812 = 2;
                } else
                {
                    anInt812 = 0;
                }
            }
            if(anInt813 == -1)
            {
                if(anIntArray806 != null)
                {
                    anInt813 = 2;
                    return;
                } else
                {
                    anInt813 = 0;
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("43214, " + class13_sub1_sub2 + ", " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Class50()
    {
        aBoolean798 = false;
        anInt805 = -1;
        aBoolean807 = false;
        anInt808 = 5;
        anInt809 = -1;
        anInt810 = -1;
        anInt811 = 99;
        anInt812 = -1;
        anInt813 = -1;
        anInt814 = 2;
    }

}
