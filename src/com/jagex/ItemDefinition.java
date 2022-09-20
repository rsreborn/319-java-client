package com.jagex;

import com.jagex.sign.signlink;

public class ItemDefinition
{

    public int modelScale;
    public int anInt619;
    public static ItemDefinition aItemDefinitionArray620[];
    public int anInt621;
    public byte aByteArray622[];
    public int anInt623;
    public int anInt624;
    public int anInt625;
    public int anInt626;
    public int anIntArray627[];
    public int anInt628;
    public int anInt629;
    public byte aByte630;
    public int anIntArray631[];
    public byte aByte632;
    public int anInt633;
    public int anInt634;
    public int anInt635;
    public int anIntArray636[];
    public int anInt637;
    public static boolean aBoolean638 = true;
    public String aStringArray639[];
    public int anInt640;
    public int anInt641;
    public int anInt642;
    public String aStringArray643[];
    public int anInt644;
    public static int anInt645;
    public int anIntArray646[];
    public int anInt647;
    public int anInt648;
    public String aString649;
    public boolean aBoolean650;
    public int anInt651;
    public int anInt652;
    public int anInt653;
    public int anInt654;
    public static int anIntArray655[];
    public int anInt656;
    public int anInt657;
    public int anInt658;
    public int anInt659;
    public static Class3 aClass3_660 = new Class3(50, 31);
    public static Class3 aClass3_661 = new Class3(100, 31);
    public boolean aBoolean662;
    public int anInt663;
    public int anInt664;
    public static Class13_Sub1_Sub2 aClass13_Sub1_Sub2_665;
    public int anInt666;
    public static boolean aBoolean667 = true;
    public int anInt668;
    public static int anInt669;
    public int anInt670;

    public static Class13_Sub1_Sub4_Sub4 method503(int i, int j, int k, boolean flag)
    {
        try
        {
            if(k == 0)
            {
                Class13_Sub1_Sub4_Sub4 class13_sub1_sub4_sub4 = (Class13_Sub1_Sub4_Sub4)aClass3_661.method172(i);
                if(class13_sub1_sub4_sub4 != null && class13_sub1_sub4_sub4.anInt1686 != j && class13_sub1_sub4_sub4.anInt1686 != -1)
                {
                    class13_sub1_sub4_sub4.method253();
                    class13_sub1_sub4_sub4 = null;
                }
                if(class13_sub1_sub4_sub4 != null)
                {
                    return class13_sub1_sub4_sub4;
                }
            }
            ItemDefinition itemDefinition = method505(i);
            if(itemDefinition.anIntArray636 == null)
            {
                j = -1;
            }
            if(j > 1)
            {
                int l = -1;
                for(int i1 = 0; i1 < 10; i1++)
                {
                    if(j >= itemDefinition.anIntArray627[i1] && itemDefinition.anIntArray627[i1] != 0)
                    {
                        l = itemDefinition.anIntArray636[i1];
                    }
                }
                if(l != -1)
                {
                    itemDefinition = method505(l);
                }
            }
            Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = itemDefinition.method509(1);
            if(class13_sub1_sub1_sub4 == null)
            {
                return null;
            }
            Class13_Sub1_Sub4_Sub4 class13_sub1_sub4_sub4_2 = null;
            if(itemDefinition.anInt642 != -1)
            {
                class13_sub1_sub4_sub4_2 = method503(itemDefinition.anInt644, 10, -1, aBoolean638);
                if(class13_sub1_sub4_sub4_2 == null)
                {
                    return null;
                }
            }
            Class13_Sub1_Sub4_Sub4 class13_sub1_sub4_sub4_1 = new Class13_Sub1_Sub4_Sub4(32, 32);
            int j1 = Class13_Sub1_Sub4_Sub1.anInt1630;
            int k1 = Class13_Sub1_Sub4_Sub1.anInt1631;
            int ai[] = Class13_Sub1_Sub4_Sub1.anIntArray1636;
            int ai1[] = Class13_Sub1_Sub4.anIntArray1423;
            int l1 = Class13_Sub1_Sub4.anInt1424;
            int i2 = Class13_Sub1_Sub4.anInt1425;
            int j2 = Class13_Sub1_Sub4.anInt1428;
            int k2 = Class13_Sub1_Sub4.anInt1429;
            int l2 = Class13_Sub1_Sub4.anInt1426;
            int i3 = Class13_Sub1_Sub4.anInt1427;
            Class13_Sub1_Sub4_Sub1.aBoolean1628 = false;
            Class13_Sub1_Sub4.method351(0, class13_sub1_sub4_sub4_1.anIntArray1680, 32, 32);
            Class13_Sub1_Sub4.method356(false, 0, 0, 0, 32, 32);
            Class13_Sub1_Sub4_Sub1.method364(true);
            int j3 = itemDefinition.modelScale;
            if(k == -1)
            {
                j3 = (int)((double)j3 * 1.5D);
            }
            if(k > 0)
            {
                j3 = (int)((double)j3 * 1.04D);
            }
            int k3 = Class13_Sub1_Sub4_Sub1.anIntArray1634[itemDefinition.anInt670] * j3 >> 16;
            int l3 = Class13_Sub1_Sub4_Sub1.anIntArray1635[itemDefinition.anInt670] * j3 >> 16;
            class13_sub1_sub1_sub4.method285(0, itemDefinition.anInt663, itemDefinition.anInt666, itemDefinition.anInt670, itemDefinition.anInt656, k3 + ((Class13_Sub1_Sub1) (class13_sub1_sub1_sub4)).anInt1377 / 2 + itemDefinition.anInt628, l3 + itemDefinition.anInt628);
            for(int l4 = 31; l4 >= 0; l4--)
            {
                for(int i4 = 31; i4 >= 0; i4--)
                {
                    if(class13_sub1_sub4_sub4_1.anIntArray1680[l4 + i4 * 32] == 0)
                    {
                        if(l4 > 0 && class13_sub1_sub4_sub4_1.anIntArray1680[(l4 - 1) + i4 * 32] > 1)
                        {
                            class13_sub1_sub4_sub4_1.anIntArray1680[l4 + i4 * 32] = 1;
                        } else
                        if(i4 > 0 && class13_sub1_sub4_sub4_1.anIntArray1680[l4 + (i4 - 1) * 32] > 1)
                        {
                            class13_sub1_sub4_sub4_1.anIntArray1680[l4 + i4 * 32] = 1;
                        } else
                        if(l4 < 31 && class13_sub1_sub4_sub4_1.anIntArray1680[l4 + 1 + i4 * 32] > 1)
                        {
                            class13_sub1_sub4_sub4_1.anIntArray1680[l4 + i4 * 32] = 1;
                        } else
                        if(i4 < 31 && class13_sub1_sub4_sub4_1.anIntArray1680[l4 + (i4 + 1) * 32] > 1)
                        {
                            class13_sub1_sub4_sub4_1.anIntArray1680[l4 + i4 * 32] = 1;
                        }
                    }
                }
            }
            if(k > 0)
            {
                for(int i5 = 31; i5 >= 0; i5--)
                {
                    for(int j4 = 31; j4 >= 0; j4--)
                    {
                        if(class13_sub1_sub4_sub4_1.anIntArray1680[i5 + j4 * 32] == 0)
                        {
                            if(i5 > 0 && class13_sub1_sub4_sub4_1.anIntArray1680[(i5 - 1) + j4 * 32] == 1)
                            {
                                class13_sub1_sub4_sub4_1.anIntArray1680[i5 + j4 * 32] = k;
                            } else
                            if(j4 > 0 && class13_sub1_sub4_sub4_1.anIntArray1680[i5 + (j4 - 1) * 32] == 1)
                            {
                                class13_sub1_sub4_sub4_1.anIntArray1680[i5 + j4 * 32] = k;
                            } else
                            if(i5 < 31 && class13_sub1_sub4_sub4_1.anIntArray1680[i5 + 1 + j4 * 32] == 1)
                            {
                                class13_sub1_sub4_sub4_1.anIntArray1680[i5 + j4 * 32] = k;
                            } else
                            if(j4 < 31 && class13_sub1_sub4_sub4_1.anIntArray1680[i5 + (j4 + 1) * 32] == 1)
                            {
                                class13_sub1_sub4_sub4_1.anIntArray1680[i5 + j4 * 32] = k;
                            }
                        }
                    }
                }
            } else
            if(k == 0)
            {
                for(int j5 = 31; j5 >= 0; j5--)
                {
                    for(int k4 = 31; k4 >= 0; k4--)
                    {
                        if(class13_sub1_sub4_sub4_1.anIntArray1680[j5 + k4 * 32] == 0 && j5 > 0 && k4 > 0 && class13_sub1_sub4_sub4_1.anIntArray1680[(j5 - 1) + (k4 - 1) * 32] > 0)
                        {
                            class13_sub1_sub4_sub4_1.anIntArray1680[j5 + k4 * 32] = 0x302020;
                        }
                    }
                }
            }
            if(itemDefinition.anInt642 != -1)
            {
                int k5 = class13_sub1_sub4_sub4_2.anInt1685;
                int l5 = class13_sub1_sub4_sub4_2.anInt1686;
                class13_sub1_sub4_sub4_2.anInt1685 = 32;
                class13_sub1_sub4_sub4_2.anInt1686 = 32;
                class13_sub1_sub4_sub4_2.method408(0, (byte)83, 0);
                class13_sub1_sub4_sub4_2.anInt1685 = k5;
                class13_sub1_sub4_sub4_2.anInt1686 = l5;
            }
            if(k == 0)
            {
                aClass3_661.method173(class13_sub1_sub4_sub4_1, i, 9388);
            }
            Class13_Sub1_Sub4.method351(0, ai1, i2, l1);
            Class13_Sub1_Sub4.method353(k2, (byte)-12, i3, l2, j2);
            if(!flag)
            {
                aBoolean638 = !aBoolean638;
            }
            Class13_Sub1_Sub4_Sub1.anInt1630 = j1;
            Class13_Sub1_Sub4_Sub1.anInt1631 = k1;
            Class13_Sub1_Sub4_Sub1.anIntArray1636 = ai;
            Class13_Sub1_Sub4_Sub1.aBoolean1628 = true;
            if(itemDefinition.aBoolean662)
            {
                class13_sub1_sub4_sub4_1.anInt1685 = 33;
            } else
            {
                class13_sub1_sub4_sub4_1.anInt1685 = 32;
            }
            class13_sub1_sub4_sub4_1.anInt1686 = j;
            return class13_sub1_sub4_sub4_1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("28803, " + i + ", " + j + ", " + k + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method504(byte byte0, int i)
    {
        try
        {
            int j = anInt647;
            int k = anInt664;
            int l = anInt659;
            if(i == 1)
            {
                j = anInt654;
                k = anInt640;
                l = anInt648;
            }
            if(j == -1)
            {
                return true;
            }
            boolean flag = true;
            if(byte0 == 9)
            {
                byte0 = 0;
            } else
            {
                anInt623 = 192;
            }
            if(!Class13_Sub1_Sub1_Sub4.method266(j))
            {
                flag = false;
            }
            if(k != -1 && !Class13_Sub1_Sub1_Sub4.method266(k))
            {
                flag = false;
            }
            if(l != -1 && !Class13_Sub1_Sub1_Sub4.method266(l))
            {
                flag = false;
            }
            return flag;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("36006, " + byte0 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static ItemDefinition method505(int i)
    {
        for(int j = 0; j < 10; j++)
        {
            if(aItemDefinitionArray620[j].anInt633 == i)
            {
                return aItemDefinitionArray620[j];
            }
        }
        anInt645 = (anInt645 + 1) % 10;
        ItemDefinition itemDefinition = aItemDefinitionArray620[anInt645];
        aClass13_Sub1_Sub2_665.anInt1399 = anIntArray655[i];
        itemDefinition.anInt633 = i;
        itemDefinition.method514();
        itemDefinition.method510(aClass13_Sub1_Sub2_665, 26421);
        if(itemDefinition.anInt642 != -1)
        {
            itemDefinition.method508(143);
        }
        if(!aBoolean667 && itemDefinition.aBoolean650)
        {
            itemDefinition.aString649 = "Members Object";
            itemDefinition.aByteArray622 = "Login to a members' server to use this object.".getBytes();
            itemDefinition.aStringArray643 = null;
            itemDefinition.aStringArray639 = null;
            itemDefinition.anInt641 = 0;
        }
        return itemDefinition;
    }

    public boolean method506(int i, int j)
    {
        try
        {
            if(i != anInt652)
            {
                anInt623 = 321;
            }
            int k = anInt624;
            int l = anInt653;
            if(j == 1)
            {
                k = anInt651;
                l = anInt657;
            }
            if(k == -1)
            {
                return true;
            }
            boolean flag = true;
            if(!Class13_Sub1_Sub1_Sub4.method266(k))
            {
                flag = false;
            }
            if(l != -1 && !Class13_Sub1_Sub1_Sub4.method266(l))
            {
                flag = false;
            }
            return flag;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("39858, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub1_Sub4 method507(int i, int j)
    {
        try
        {
            int k = anInt647;
            int l = anInt664;
            int i1 = anInt659;
            if(i != anInt619)
            {
                throw new NullPointerException();
            }
            if(j == 1)
            {
                k = anInt654;
                l = anInt640;
                i1 = anInt648;
            }
            if(k == -1)
            {
                return null;
            }
            Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = Class13_Sub1_Sub1_Sub4.method265((byte)4, k);
            if(l != -1)
            {
                if(i1 != -1)
                {
                    Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_1 = Class13_Sub1_Sub1_Sub4.method265((byte)4, l);
                    Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_3 = Class13_Sub1_Sub1_Sub4.method265((byte)4, i1);
                    Class13_Sub1_Sub1_Sub4 aclass13_sub1_sub1_sub4_1[] = {
                        class13_sub1_sub1_sub4, class13_sub1_sub1_sub4_1, class13_sub1_sub1_sub4_3
                    };
                    class13_sub1_sub1_sub4 = new Class13_Sub1_Sub1_Sub4(3, (byte)61, aclass13_sub1_sub1_sub4_1);
                } else
                {
                    Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_2 = Class13_Sub1_Sub1_Sub4.method265((byte)4, l);
                    Class13_Sub1_Sub1_Sub4 aclass13_sub1_sub1_sub4[] = {
                        class13_sub1_sub1_sub4, class13_sub1_sub1_sub4_2
                    };
                    class13_sub1_sub1_sub4 = new Class13_Sub1_Sub1_Sub4(2, (byte)61, aclass13_sub1_sub1_sub4);
                }
            }
            if(j == 0 && aByte632 != 0)
            {
                class13_sub1_sub1_sub4.method278(0, -991, aByte632, 0);
            }
            if(j == 1 && aByte630 != 0)
            {
                class13_sub1_sub1_sub4.method278(0, -991, aByte630, 0);
            }
            if(anIntArray646 != null)
            {
                for(int j1 = 0; j1 < anIntArray646.length; j1++)
                {
                    class13_sub1_sub1_sub4.method279(anIntArray646[j1], anIntArray631[j1]);
                }
            }
            return class13_sub1_sub1_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("95666, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method508(int i)
    {
        try
        {
            ItemDefinition itemDefinition = method505(anInt642);
            anInt668 = itemDefinition.anInt668;
            modelScale = itemDefinition.modelScale;
            anInt670 = itemDefinition.anInt670;
            anInt663 = itemDefinition.anInt663;
            anInt666 = itemDefinition.anInt666;
            anInt656 = itemDefinition.anInt656;
            anInt628 = itemDefinition.anInt628;
            anIntArray646 = itemDefinition.anIntArray646;
            if(i <= 0)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            anIntArray631 = itemDefinition.anIntArray631;
            ItemDefinition itemDefinition_1 = method505(anInt644);
            aString649 = itemDefinition_1.aString649;
            aBoolean650 = itemDefinition_1.aBoolean650;
            anInt637 = itemDefinition_1.anInt637;
            String s = "a";
            char c = itemDefinition_1.aString649.charAt(0);
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                s = "an";
            }
            aByteArray622 = ("Swap this note at any bank for " + s + " " + itemDefinition_1.aString649 + ".").getBytes();
            aBoolean662 = true;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("15365, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub1_Sub4 method509(int i)
    {
        if(anIntArray636 != null && i > 1)
        {
            int j = -1;
            for(int k = 0; k < 10; k++)
            {
                if(i >= anIntArray627[k] && anIntArray627[k] != 0)
                {
                    j = anIntArray636[k];
                }
            }
            if(j != -1)
            {
                return method505(j).method509(1);
            }
        }
        Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = (Class13_Sub1_Sub1_Sub4)aClass3_660.method172(anInt633);
        if(class13_sub1_sub1_sub4 != null)
        {
            return class13_sub1_sub1_sub4;
        }
        class13_sub1_sub1_sub4 = Class13_Sub1_Sub1_Sub4.method265((byte)4, anInt668);
        if(class13_sub1_sub1_sub4 == null)
        {
            return null;
        }
        if(anInt658 != 128 || anInt635 != 128 || anInt621 != 128)
        {
            class13_sub1_sub1_sub4.method281(anInt658, anInt621, anInt635, (byte)0);
        }
        if(anIntArray646 != null)
        {
            for(int l = 0; l < anIntArray646.length; l++)
            {
                class13_sub1_sub1_sub4.method279(anIntArray646[l], anIntArray631[l]);
            }
        }
        class13_sub1_sub1_sub4.method282(64 + anInt625, 768 + anInt629, -50, -10, -50, true);
        class13_sub1_sub1_sub4.aBoolean1529 = true;
        aClass3_660.method173(class13_sub1_sub1_sub4, anInt633, 9388);
        return class13_sub1_sub1_sub4;
    }

    public void method510(Class13_Sub1_Sub2 class13_sub1_sub2, int i)
    {
        try
        {
            if(i != 26421)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            do
            {
                int k = class13_sub1_sub2.readUnsignedByte();
                if(k == 0)
                {
                    return;
                }
                if(k == 1)
                {
                    anInt668 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 2)
                {
                    aString649 = class13_sub1_sub2.method318();
                } else
                if(k == 3)
                {
                    aByteArray622 = class13_sub1_sub2.method319(true);
                } else
                if(k == 4)
                {
                    modelScale = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 5)
                {
                    anInt670 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 6)
                {
                    anInt663 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 7)
                {
                    anInt656 = class13_sub1_sub2.readUnsignedShort();
                    if(anInt656 > 32767)
                    {
                        anInt656 -= 0x10000;
                    }
                } else
                if(k == 8)
                {
                    anInt628 = class13_sub1_sub2.readUnsignedShort();
                    if(anInt628 > 32767)
                    {
                        anInt628 -= 0x10000;
                    }
                } else
                if(k == 10)
                {
                    anInt634 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 11)
                {
                    aBoolean662 = true;
                } else
                if(k == 12)
                {
                    anInt637 = class13_sub1_sub2.method316();
                } else
                if(k == 16)
                {
                    aBoolean650 = true;
                } else
                if(k == 23)
                {
                    anInt647 = class13_sub1_sub2.readUnsignedShort();
                    aByte632 = class13_sub1_sub2.method312();
                } else
                if(k == 24)
                {
                    anInt664 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 25)
                {
                    anInt654 = class13_sub1_sub2.readUnsignedShort();
                    aByte630 = class13_sub1_sub2.method312();
                } else
                if(k == 26)
                {
                    anInt640 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k >= 30 && k < 35)
                {
                    if(aStringArray643 == null)
                    {
                        aStringArray643 = new String[5];
                    }
                    aStringArray643[k - 30] = class13_sub1_sub2.method318();
                    if(aStringArray643[k - 30].equalsIgnoreCase("hidden"))
                    {
                        aStringArray643[k - 30] = null;
                    }
                } else
                if(k >= 35 && k < 40)
                {
                    if(aStringArray639 == null)
                    {
                        aStringArray639 = new String[5];
                    }
                    aStringArray639[k - 35] = class13_sub1_sub2.method318();
                } else
                if(k == 40)
                {
                    int l = class13_sub1_sub2.readUnsignedByte();
                    anIntArray646 = new int[l];
                    anIntArray631 = new int[l];
                    for(int i1 = 0; i1 < l; i1++)
                    {
                        anIntArray646[i1] = class13_sub1_sub2.readUnsignedShort();
                        anIntArray631[i1] = class13_sub1_sub2.readUnsignedShort();
                    }
                } else
                if(k == 78)
                {
                    anInt659 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 79)
                {
                    anInt648 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 90)
                {
                    anInt624 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 91)
                {
                    anInt651 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 92)
                {
                    anInt653 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 93)
                {
                    anInt657 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 95)
                {
                    anInt666 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 97)
                {
                    anInt644 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 98)
                {
                    anInt642 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k >= 100 && k < 110)
                {
                    if(anIntArray636 == null)
                    {
                        anIntArray636 = new int[10];
                        anIntArray627 = new int[10];
                    }
                    anIntArray636[k - 100] = class13_sub1_sub2.readUnsignedShort();
                    anIntArray627[k - 100] = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 110)
                {
                    anInt658 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 111)
                {
                    anInt635 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 112)
                {
                    anInt621 = class13_sub1_sub2.readUnsignedShort();
                } else
                if(k == 113)
                {
                    anInt625 = class13_sub1_sub2.method312();
                } else
                if(k == 114)
                {
                    anInt629 = class13_sub1_sub2.method312() * 5;
                } else
                if(k == 115)
                {
                    anInt641 = class13_sub1_sub2.readUnsignedByte();
                }
            } while(true);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("349, " + class13_sub1_sub2 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method511(int i)
    {
        try
        {
            aClass3_660 = null;
            aClass3_661 = null;
            if(i != 47779)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            anIntArray655 = null;
            aItemDefinitionArray620 = null;
            aClass13_Sub1_Sub2_665 = null;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("59319, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub1_Sub4 method512(int i, byte byte0)
    {
        try
        {
            int j = anInt624;
            int k = anInt653;
            if(byte0 != -34)
            {
                aBoolean638 = !aBoolean638;
            }
            if(i == 1)
            {
                j = anInt651;
                k = anInt657;
            }
            if(j == -1)
            {
                return null;
            }
            Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = Class13_Sub1_Sub1_Sub4.method265((byte)4, j);
            if(k != -1)
            {
                Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_1 = Class13_Sub1_Sub1_Sub4.method265((byte)4, k);
                Class13_Sub1_Sub1_Sub4 aclass13_sub1_sub1_sub4[] = {
                    class13_sub1_sub1_sub4, class13_sub1_sub1_sub4_1
                };
                class13_sub1_sub1_sub4 = new Class13_Sub1_Sub1_Sub4(2, (byte)61, aclass13_sub1_sub1_sub4);
            }
            if(anIntArray646 != null)
            {
                for(int l = 0; l < anIntArray646.length; l++)
                {
                    class13_sub1_sub1_sub4.method279(anIntArray646[l], anIntArray631[l]);
                }
            }
            return class13_sub1_sub1_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("32538, " + i + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub1_Sub4 method513(int i, int j)
    {
        try
        {
            while(i >= 0)
            {
                anInt626 = 265;
            }
            if(anIntArray636 != null && j > 1)
            {
                int k = -1;
                for(int l = 0; l < 10; l++)
                {
                    if(j >= anIntArray627[l] && anIntArray627[l] != 0)
                    {
                        k = anIntArray636[l];
                    }
                }
                if(k != -1)
                {
                    return method505(k).method513(-453, 1);
                }
            }
            Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = Class13_Sub1_Sub1_Sub4.method265((byte)4, anInt668);
            if(class13_sub1_sub1_sub4 == null)
            {
                return null;
            }
            if(anIntArray646 != null)
            {
                for(int i1 = 0; i1 < anIntArray646.length; i1++)
                {
                    class13_sub1_sub1_sub4.method279(anIntArray646[i1], anIntArray631[i1]);
                }
            }
            return class13_sub1_sub1_sub4;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("1360, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method514()
    {
        anInt668 = 0;
        aString649 = null;
        aByteArray622 = null;
        anIntArray646 = null;
        anIntArray631 = null;
        modelScale = 2000;
        anInt670 = 0;
        anInt663 = 0;
        anInt666 = 0;
        anInt656 = 0;
        anInt628 = 0;
        anInt634 = -1;
        aBoolean662 = false;
        anInt637 = 1;
        aBoolean650 = false;
        aStringArray643 = null;
        aStringArray639 = null;
        anInt647 = -1;
        anInt664 = -1;
        aByte632 = 0;
        anInt654 = -1;
        anInt640 = -1;
        aByte630 = 0;
        anInt659 = -1;
        anInt648 = -1;
        anInt624 = -1;
        anInt653 = -1;
        anInt651 = -1;
        anInt657 = -1;
        anIntArray636 = null;
        anIntArray627 = null;
        anInt644 = -1;
        anInt642 = -1;
        anInt658 = 128;
        anInt635 = 128;
        anInt621 = 128;
        anInt625 = 0;
        anInt629 = 0;
        anInt641 = 0;
    }

    public static void method515(Class1 class1)
    {
        aClass13_Sub1_Sub2_665 = new Class13_Sub1_Sub2(-351, class1.method149("obj.dat", null));
        Class13_Sub1_Sub2 class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, class1.method149("obj.idx", null));
        anInt669 = class13_sub1_sub2.readUnsignedShort();
        anIntArray655 = new int[anInt669];
        int i = 2;
        for(int j = 0; j < anInt669; j++)
        {
            anIntArray655[j] = i;
            i += class13_sub1_sub2.readUnsignedShort();
        }
        aItemDefinitionArray620 = new ItemDefinition[10];
        for(int k = 0; k < 10; k++)
        {
            aItemDefinitionArray620[k] = new ItemDefinition();
        }
    }

    public ItemDefinition()
    {
        anInt619 = 4;
        anInt623 = -25124;
        anInt633 = -1;
        anInt652 = 5;
    }

}
