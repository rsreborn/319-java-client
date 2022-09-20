package com.jagex;

import com.jagex.sign.signlink;

public class Class41
{

    public static int anInt698;
    public static int anInt699 = 40848;
    public static byte aByte700 = 18;
    public static byte aByte701 = 5;
    public static byte aByte702 = 4;
    public static byte aByte703 = 2;
    public static boolean aBoolean704;
    public static boolean aBoolean705 = true;
    public static int anInt706;
    public static boolean aBoolean707 = true;
    public static int[] anIntArray708;
    public static char aCharArrayArray709[][];
    public static byte aByteArrayArrayArray710[][][];
    public static char aCharArrayArray711[][];
    public static char aCharArrayArray712[][];
    public static int anIntArray713[];
    public static String aStringArray714[] = {
        "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"
    };
    public static boolean aBoolean715;

    public static void method531(Class1 class1)
    {
        Class13_Sub1_Sub2 class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, class1.method149("fragmentsenc.txt", null));
        Class13_Sub1_Sub2 class13_sub1_sub2_1 = new Class13_Sub1_Sub2(-351, class1.method149("badenc.txt", null));
        Class13_Sub1_Sub2 class13_sub1_sub2_2 = new Class13_Sub1_Sub2(-351, class1.method149("domainenc.txt", null));
        Class13_Sub1_Sub2 class13_sub1_sub2_3 = new Class13_Sub1_Sub2(-351, class1.method149("tldlist.txt", null));
        method532(class13_sub1_sub2, class13_sub1_sub2_1, class13_sub1_sub2_2, class13_sub1_sub2_3);
    }

    public static void method532(Class13_Sub1_Sub2 class13_sub1_sub2, Class13_Sub1_Sub2 class13_sub1_sub2_1, Class13_Sub1_Sub2 class13_sub1_sub2_2, Class13_Sub1_Sub2 class13_sub1_sub2_3)
    {
        method534((byte)5, class13_sub1_sub2_1);
        method535(9, class13_sub1_sub2_2);
        method536(class13_sub1_sub2, (byte)2);
        method533((byte)6, class13_sub1_sub2_3);
    }

    public static void method533(byte byte0, Class13_Sub1_Sub2 class13_sub1_sub2)
    {
        try
        {
            if(byte0 != 6)
            {
                aBoolean707 = !aBoolean707;
            }
            int i = class13_sub1_sub2.method316();
            aCharArrayArray712 = new char[i][];
            anIntArray713 = new int[i];
            for(int j = 0; j < i; j++)
            {
                anIntArray713[j] = class13_sub1_sub2.readUnsignedByte();
                char ac[] = new char[class13_sub1_sub2.readUnsignedByte()];
                for(int k = 0; k < ac.length; k++)
                {
                    ac[k] = (char)class13_sub1_sub2.readUnsignedByte();
                }
                aCharArrayArray712[j] = ac;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("8437, " + byte0 + ", " + class13_sub1_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method534(byte byte0, Class13_Sub1_Sub2 class13_sub1_sub2)
    {
        try
        {
            int i = class13_sub1_sub2.method316();
            if(byte0 == 5)
            {
                byte0 = 0;
            } else
            {
                return;
            }
            aCharArrayArray709 = new char[i][];
            aByteArrayArrayArray710 = new byte[i][][];
            method537(9, aByteArrayArrayArray710, class13_sub1_sub2, aCharArrayArray709);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("98724, " + byte0 + ", " + class13_sub1_sub2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method535(int i, Class13_Sub1_Sub2 class13_sub1_sub2)
    {
        try
        {
            int j = class13_sub1_sub2.method316();
            aCharArrayArray711 = new char[j][];
            method538(true, class13_sub1_sub2, aCharArrayArray711);
            if(i != 9)
            {
                anInt706 = 138;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("76838, " + i + ", " + class13_sub1_sub2 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static void method536(Class13_Sub1_Sub2 class13_sub1_sub2, byte byte0)
    {
        try
        {
            if(byte0 == 2)
            {
                byte0 = 0;
            } else
            {
                return;
            }
            anIntArray708 = new int[class13_sub1_sub2.method316()];
            for(int i = 0; i < anIntArray708.length; i++)
            {
                anIntArray708[i] = class13_sub1_sub2.readUnsignedShort();
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("78769, " + class13_sub1_sub2 + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method537(int i, byte abyte0[][][], Class13_Sub1_Sub2 class13_sub1_sub2, char ac[][])
    {
        try
        {
            for(int j = 0; j < ac.length; j++)
            {
                char ac1[] = new char[class13_sub1_sub2.readUnsignedByte()];
                for(int k = 0; k < ac1.length; k++)
                {
                    ac1[k] = (char)class13_sub1_sub2.readUnsignedByte();
                }
                ac[j] = ac1;
                byte abyte1[][] = new byte[class13_sub1_sub2.readUnsignedByte()][2];
                for(int l = 0; l < abyte1.length; l++)
                {
                    abyte1[l][0] = (byte)class13_sub1_sub2.readUnsignedByte();
                    abyte1[l][1] = (byte)class13_sub1_sub2.readUnsignedByte();
                }
                if(abyte1.length > 0)
                {
                    abyte0[j] = abyte1;
                }
            }
            if(i != 9)
            {
                aBoolean705 = !aBoolean705;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("68000, " + i + ", " + abyte0 + ", " + class13_sub1_sub2 + ", " + ac + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static void method538(boolean flag, Class13_Sub1_Sub2 class13_sub1_sub2, char ac[][])
    {
        try
        {
            if(!flag)
            {
                anInt698 = -155;
            }
            for(int i = 0; i < ac.length; i++)
            {
                char ac1[] = new char[class13_sub1_sub2.readUnsignedByte()];
                for(int j = 0; j < ac1.length; j++)
                {
                    ac1[j] = (char)class13_sub1_sub2.readUnsignedByte();
                }
                ac[i] = ac1;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("15617, " + flag + ", " + class13_sub1_sub2 + ", " + ac + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method539(boolean flag, char ac[])
    {
        try
        {
            if(flag)
            {
                for(int i = 1; i > 0; i++)
                {
                }
            }
            int j = 0;
            for(int k = 0; k < ac.length; k++)
            {
                if(method540(aByte700, ac[k]))
                {
                    ac[j] = ac[k];
                } else
                {
                    ac[j] = ' ';
                }
                if(j == 0 || ac[j] != ' ' || ac[j - 1] != ' ')
                {
                    j++;
                }
            }
            for(int l = j; l < ac.length; l++)
            {
                ac[l] = ' ';
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("39252, " + flag + ", " + ac + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method540(byte byte0, char c)
    {
        try
        {
            if(byte0 != 18)
            {
                throw new NullPointerException();
            }
            return c >= ' ' && c <= '\177' || c == ' ' || c == '\n' || c == '\t' || c == '\243' || c == '\u20AC';
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("48804, " + byte0 + ", " + c + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static String method541(boolean flag, String s)
    {
        try
        {
            long l = System.currentTimeMillis();
            if(flag)
            {
                throw new NullPointerException();
            }
            char ac[] = s.toCharArray();
            method539(false, ac);
            String s1 = (new String(ac)).trim();
            ac = s1.toLowerCase().toCharArray();
            String s2 = s1.toLowerCase();
            method549(ac, 808);
            method544(ac, true);
            method545(ac, -49800);
            method558(ac, 708);
            for(int i = 0; i < aStringArray714.length; i++)
            {
                for(int j = -1; (j = s2.indexOf(aStringArray714[i], j + 1)) != -1;)
                {
                    char ac1[] = aStringArray714[i].toCharArray();
                    for(int k = 0; k < ac1.length; k++)
                    {
                        ac[k + j] = ac1[k];
                    }
                }
            }
            method542(69, ac, s1.toCharArray());
            method543(ac, -994);
            long l1 = System.currentTimeMillis();
            return (new String(ac)).trim();
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("86379, " + flag + ", " + s + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method542(int i, char ac[], char ac1[])
    {
        try
        {
            i = 60 / i;
            for(int j = 0; j < ac1.length; j++)
            {
                if(ac[j] != '*' && method566(ac1[j], false))
                {
                    ac[j] = ac1[j];
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("25217, " + i + ", " + ac + ", " + ac1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method543(char ac[], int i)
    {
        try
        {
            boolean flag = true;
            if(i >= 0)
            {
                aBoolean707 = !aBoolean707;
            }
            for(int j = 0; j < ac.length; j++)
            {
                char c = ac[j];
                if(method563(c, false))
                {
                    if(flag)
                    {
                        if(method565(c, aBoolean704))
                        {
                            flag = false;
                        }
                    } else
                    if(method566(c, false))
                    {
                        ac[j] = (char)((c + 97) - 65);
                    }
                } else
                {
                    flag = true;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("51595, " + ac + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method544(char ac[], boolean flag)
    {
        try
        {
            for(int i = 0; i < 2; i++)
            {
                for(int j = aCharArrayArray709.length - 1; j >= 0; j--)
                {
                    method553(ac, aByteArrayArrayArray710[j], (byte)-27, aCharArrayArray709[j]);
                }
            }
            if(!flag)
            {
                for(int k = 1; k > 0; k++)
                {
                }
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("92183, " + ac + ", " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static void method545(char ac[], int i)
    {
        try
        {
            char ac1[] = (char[])ac.clone();
            char ac2[] = {
                '(', 'a', ')'
            };
            method553(ac1, null, (byte)-27, ac2);
            char ac3[] = (char[])ac.clone();
            char ac4[] = {
                'd', 'o', 't'
            };
            if(i != -49800)
            {
                anInt698 = -150;
            }
            method553(ac3, null, (byte)-27, ac4);
            for(int j = aCharArrayArray711.length - 1; j >= 0; j--)
            {
                method546(ac3, ac, aCharArrayArray711[j], false, ac1);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("8361, " + ac + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method546(char ac[], char ac1[], char ac2[], boolean flag, char ac3[])
    {
        try
        {
            if(ac2.length > ac1.length)
            {
                return;
            }
            boolean flag1 = true;
            if(flag)
            {
                return;
            }
            int i;
            for(int j = 0; j <= ac1.length - ac2.length; j += i)
            {
                int k = j;
                int l = 0;
                i = 1;
                while(k < ac1.length)
                {
                    int i1 = 0;
                    char c = ac1[k];
                    char c1 = '\0';
                    if(k + 1 < ac1.length)
                    {
                        c1 = ac1[k + 1];
                    }
                    if(l < ac2.length && (i1 = method555(ac2[l], 0, c, c1)) > 0)
                    {
                        k += i1;
                        l++;
                        continue;
                    }
                    if(l == 0)
                    {
                        break;
                    }
                    if((i1 = method555(ac2[l - 1], 0, c, c1)) > 0)
                    {
                        k += i1;
                        if(l == 1)
                        {
                            i++;
                        }
                        continue;
                    }
                    if(l >= ac2.length || !method561(c, 0))
                    {
                        break;
                    }
                    k++;
                }
                if(l >= ac2.length)
                {
                    boolean flag2 = false;
                    int j1 = method547(ac1, j, (byte)5, ac3);
                    int k1 = method548(0, ac1, k - 1, ac);
                    if(j1 > 2 || k1 > 2)
                    {
                        flag2 = true;
                    }
                    if(flag2)
                    {
                        for(int l1 = j; l1 < k; l1++)
                        {
                            ac1[l1] = '*';
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("50437, " + ac + ", " + ac1 + ", " + ac2 + ", " + flag + ", " + ac3 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method547(char ac[], int i, byte byte0, char ac1[])
    {
        try
        {
            if(byte0 == 5)
            {
                byte0 = 0;
            } else
            {
                return 3;
            }
            if(i == 0)
            {
                return 2;
            }
            for(int j = i - 1; j >= 0; j--)
            {
                if(!method561(ac[j], 0))
                {
                    break;
                }
                if(ac[j] == '@')
                {
                    return 3;
                }
            }
            int k = 0;
            for(int l = i - 1; l >= 0; l--)
            {
                if(!method561(ac1[l], 0))
                {
                    break;
                }
                if(ac1[l] == '*')
                {
                    k++;
                }
            }
            if(k >= 3)
            {
                return 4;
            }
            return !method561(ac[i - 1], 0) ? 0 : 1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("41949, " + ac + ", " + i + ", " + byte0 + ", " + ac1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method548(int i, char ac[], int j, char ac1[])
    {
        try
        {
            if(i != 0)
            {
                aBoolean705 = !aBoolean705;
            }
            if(j + 1 == ac.length)
            {
                return 2;
            }
            for(int k = j + 1; k < ac.length; k++)
            {
                if(!method561(ac[k], 0))
                {
                    break;
                }
                if(ac[k] == '.' || ac[k] == ',')
                {
                    return 3;
                }
            }
            int l = 0;
            for(int i1 = j + 1; i1 < ac.length; i1++)
            {
                if(!method561(ac1[i1], 0))
                {
                    break;
                }
                if(ac1[i1] == '*')
                {
                    l++;
                }
            }
            if(l >= 3)
            {
                return 4;
            }
            return !method561(ac[j + 1], 0) ? 0 : 1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("77059, " + i + ", " + ac + ", " + j + ", " + ac1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method549(char ac[], int i)
    {
        try
        {
            char ac1[] = (char[])ac.clone();
            char ac2[] = {
                'd', 'o', 't'
            };
            method553(ac1, null, (byte)-27, ac2);
            char ac3[] = (char[])ac.clone();
            char ac4[] = {
                's', 'l', 'a', 's', 'h'
            };
            if(i <= 0)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            method553(ac3, null, (byte)-27, ac4);
            for(int k = 0; k < aCharArrayArray712.length; k++)
            {
                method550(anIntArray713[k], ac3, aCharArrayArray712[k], (byte)5, ac1, ac);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("96410, " + ac + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method550(int i, char ac[], char ac1[], byte byte0, char ac2[], char ac3[])
    {
        try
        {
            if(ac1.length > ac3.length)
            {
                return;
            }
            boolean flag = true;
            if(byte0 != aByte701)
            {
                for(int k = 1; k > 0; k++)
                {
                }
            }
            int j;
            for(int l = 0; l <= ac3.length - ac1.length; l += j)
            {
                int i1 = l;
                int j1 = 0;
                j = 1;
                while(i1 < ac3.length)
                {
                    int k1 = 0;
                    char c = ac3[i1];
                    char c1 = '\0';
                    if(i1 + 1 < ac3.length)
                    {
                        c1 = ac3[i1 + 1];
                    }
                    if(j1 < ac1.length && (k1 = method555(ac1[j1], 0, c, c1)) > 0)
                    {
                        i1 += k1;
                        j1++;
                        continue;
                    }
                    if(j1 == 0)
                    {
                        break;
                    }
                    if((k1 = method555(ac1[j1 - 1], 0, c, c1)) > 0)
                    {
                        i1 += k1;
                        if(j1 == 1)
                        {
                            j++;
                        }
                        continue;
                    }
                    if(j1 >= ac1.length || !method561(c, 0))
                    {
                        break;
                    }
                    i1++;
                }
                if(j1 >= ac1.length)
                {
                    boolean flag1 = false;
                    int l1 = method551((byte)-100, ac3, ac2, l);
                    int i2 = method552(ac3, i1 - 1, ac, 35);
                    if(i == 1 && l1 > 0 && i2 > 0)
                    {
                        flag1 = true;
                    }
                    if(i == 2 && (l1 > 2 && i2 > 0 || l1 > 0 && i2 > 2))
                    {
                        flag1 = true;
                    }
                    if(i == 3 && l1 > 0 && i2 > 2)
                    {
                        flag1 = true;
                    }
                    boolean _tmp = i == 3 && l1 > 2 && i2 > 0;
                    if(flag1)
                    {
                        int j2 = l;
                        int k2 = i1 - 1;
                        if(l1 > 2)
                        {
                            if(l1 == 4)
                            {
                                boolean flag2 = false;
                                for(int i3 = j2 - 1; i3 >= 0; i3--)
                                {
                                    if(flag2)
                                    {
                                        if(ac2[i3] != '*')
                                        {
                                            break;
                                        }
                                        j2 = i3;
                                    } else
                                    if(ac2[i3] == '*')
                                    {
                                        j2 = i3;
                                        flag2 = true;
                                    }
                                }
                            }
                            boolean flag3 = false;
                            for(int j3 = j2 - 1; j3 >= 0; j3--)
                            {
                                if(flag3)
                                {
                                    if(method561(ac3[j3], 0))
                                    {
                                        break;
                                    }
                                    j2 = j3;
                                } else
                                if(!method561(ac3[j3], 0))
                                {
                                    flag3 = true;
                                    j2 = j3;
                                }
                            }
                        }
                        if(i2 > 2)
                        {
                            if(i2 == 4)
                            {
                                boolean flag4 = false;
                                for(int k3 = k2 + 1; k3 < ac3.length; k3++)
                                {
                                    if(flag4)
                                    {
                                        if(ac[k3] != '*')
                                        {
                                            break;
                                        }
                                        k2 = k3;
                                    } else
                                    if(ac[k3] == '*')
                                    {
                                        k2 = k3;
                                        flag4 = true;
                                    }
                                }
                            }
                            boolean flag5 = false;
                            for(int l3 = k2 + 1; l3 < ac3.length; l3++)
                            {
                                if(flag5)
                                {
                                    if(method561(ac3[l3], 0))
                                    {
                                        break;
                                    }
                                    k2 = l3;
                                } else
                                if(!method561(ac3[l3], 0))
                                {
                                    flag5 = true;
                                    k2 = l3;
                                }
                            }
                        }
                        for(int l2 = j2; l2 <= k2; l2++)
                        {
                            ac3[l2] = '*';
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("47742, " + i + ", " + ac + ", " + ac1 + ", " + byte0 + ", " + ac2 + ", " + ac3 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method551(byte byte0, char ac[], char ac1[], int i)
    {
        try
        {
            if(byte0 != -100)
            {
                aBoolean705 = !aBoolean705;
            }
            if(i == 0)
            {
                return 2;
            }
            for(int j = i - 1; j >= 0; j--)
            {
                if(!method561(ac[j], 0))
                {
                    break;
                }
                if(ac[j] == ',' || ac[j] == '.')
                {
                    return 3;
                }
            }
            int k = 0;
            for(int l = i - 1; l >= 0; l--)
            {
                if(!method561(ac1[l], 0))
                {
                    break;
                }
                if(ac1[l] == '*')
                {
                    k++;
                }
            }
            if(k >= 3)
            {
                return 4;
            }
            return !method561(ac[i - 1], 0) ? 0 : 1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("98967, " + byte0 + ", " + ac + ", " + ac1 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method552(char ac[], int i, char ac1[], int j)
    {
        try
        {
            if(i + 1 == ac.length)
            {
                return 2;
            }
            for(int k = i + 1; k < ac.length; k++)
            {
                if(!method561(ac[k], 0))
                {
                    break;
                }
                if(ac[k] == '\\' || ac[k] == '/')
                {
                    return 3;
                }
            }
            j = 26 / j;
            int l = 0;
            for(int i1 = i + 1; i1 < ac.length; i1++)
            {
                if(!method561(ac1[i1], 0))
                {
                    break;
                }
                if(ac1[i1] == '*')
                {
                    l++;
                }
            }
            if(l >= 5)
            {
                return 4;
            }
            return !method561(ac[i + 1], 0) ? 0 : 1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("76165, " + ac + ", " + i + ", " + ac1 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method553(char ac[], byte abyte0[][], byte byte0, char ac1[])
    {
        try
        {
            if(byte0 != -27)
            {
                aBoolean705 = !aBoolean705;
            }
            if(ac1.length > ac.length)
            {
                return;
            }
            boolean flag = true;
            int i;
            for(int j = 0; j <= ac.length - ac1.length; j += i)
            {
                int k = j;
                int l = 0;
                int i1 = 0;
                i = 1;
                boolean flag1 = false;
                boolean flag2 = false;
                boolean flag3 = false;
                while(k < ac.length && (!flag2 || !flag3))
                {
                    int j1 = 0;
                    char c = ac[k];
                    char c2 = '\0';
                    if(k + 1 < ac.length)
                    {
                        c2 = ac[k + 1];
                    }
                    if(l < ac1.length && (j1 = method556((byte)9, c2, ac1[l], c)) > 0)
                    {
                        if(j1 == 1 && method564((byte)2, c))
                        {
                            flag2 = true;
                        }
                        if(j1 == 2 && (method564((byte)2, c) || method564((byte)2, c2)))
                        {
                            flag2 = true;
                        }
                        k += j1;
                        l++;
                        continue;
                    }
                    if(l == 0)
                    {
                        break;
                    }
                    if((j1 = method556((byte)9, c2, ac1[l - 1], c)) > 0)
                    {
                        k += j1;
                        if(l == 1)
                        {
                            i++;
                        }
                        continue;
                    }
                    if(l >= ac1.length || !method562(true, c))
                    {
                        break;
                    }
                    if(method561(c, 0) && c != '\'')
                    {
                        flag1 = true;
                    }
                    if(method564((byte)2, c))
                    {
                        flag3 = true;
                    }
                    k++;
                    if((++i1 * 100) / (k - j) > 90)
                    {
                        break;
                    }
                }
                if(l >= ac1.length && (!flag2 || !flag3))
                {
                    boolean flag4 = true;
                    if(!flag1)
                    {
                        char c1 = ' ';
                        if(j - 1 >= 0)
                        {
                            c1 = ac[j - 1];
                        }
                        char c3 = ' ';
                        if(k < ac.length)
                        {
                            c3 = ac[k];
                        }
                        byte byte1 = method557(c1, aByte702);
                        byte byte2 = method557(c3, aByte702);
                        if(abyte0 != null && method554(false, byte2, abyte0, byte1))
                        {
                            flag4 = false;
                        }
                    } else
                    {
                        boolean flag5 = false;
                        boolean flag6 = false;
                        if(j - 1 < 0 || method561(ac[j - 1], 0) && ac[j - 1] != '\'')
                        {
                            flag5 = true;
                        }
                        if(k >= ac.length || method561(ac[k], 0) && ac[k] != '\'')
                        {
                            flag6 = true;
                        }
                        if(!flag5 || !flag6)
                        {
                            boolean flag7 = false;
                            int j2 = j - 2;
                            if(flag5)
                            {
                                j2 = j;
                            }
                            for(; !flag7 && j2 < k; j2++)
                            {
                                if(j2 >= 0 && (!method561(ac[j2], 0) || ac[j2] == '\''))
                                {
                                    char ac2[] = new char[3];
                                    int i3;
                                    for(i3 = 0; i3 < 3; i3++)
                                    {
                                        if(j2 + i3 >= ac.length || method561(ac[j2 + i3], 0) && ac[j2 + i3] != '\'')
                                        {
                                            break;
                                        }
                                        ac2[i3] = ac[j2 + i3];
                                    }
                                    boolean flag8 = true;
                                    if(i3 == 0)
                                    {
                                        flag8 = false;
                                    }
                                    if(i3 < 3 && j2 - 1 >= 0 && (!method561(ac[j2 - 1], 0) || ac[j2 - 1] == '\''))
                                    {
                                        flag8 = false;
                                    }
                                    if(flag8 && !method567(0, ac2))
                                    {
                                        flag7 = true;
                                    }
                                }
                            }
                            if(!flag7)
                            {
                                flag4 = false;
                            }
                        }
                    }
                    if(flag4)
                    {
                        int k1 = 0;
                        int l1 = 0;
                        int i2 = -1;
                        for(int k2 = j; k2 < k; k2++)
                        {
                            if(method564((byte)2, ac[k2]))
                            {
                                k1++;
                            } else
                            if(method563(ac[k2], false))
                            {
                                l1++;
                                i2 = k2;
                            }
                        }
                        if(i2 > -1)
                        {
                            k1 -= k - 1 - i2;
                        }
                        if(k1 <= l1)
                        {
                            for(int l2 = j; l2 < k; l2++)
                            {
                                ac[l2] = '*';
                            }
                        } else
                        {
                            i = 1;
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("18672, " + ac + ", " + abyte0 + ", " + byte0 + ", " + ac1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method554(boolean flag, byte byte0, byte abyte0[][], byte byte1)
    {
        try
        {
            if(flag)
            {
                for(int i = 1; i > 0; i++)
                {
                }
            }
            int j = 0;
            if(abyte0[j][0] == byte1 && abyte0[j][1] == byte0)
            {
                return true;
            }
            int k = abyte0.length - 1;
            if(abyte0[k][0] == byte1 && abyte0[k][1] == byte0)
            {
                return true;
            }
            do
            {
                int l = (j + k) / 2;
                if(abyte0[l][0] == byte1 && abyte0[l][1] == byte0)
                {
                    return true;
                }
                if(byte1 < abyte0[l][0] || byte1 == abyte0[l][0] && byte0 < abyte0[l][1])
                {
                    k = l;
                } else
                {
                    j = l;
                }
            } while(j != k && j + 1 != k);
            return false;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("63814, " + flag + ", " + byte0 + ", " + abyte0 + ", " + byte1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method555(char c, int i, char c1, char c2)
    {
        try
        {
            if(i != 0)
            {
                aBoolean705 = !aBoolean705;
            }
            if(c == c1)
            {
                return 1;
            }
            if(c == 'o' && c1 == '0')
            {
                return 1;
            }
            if(c == 'o' && c1 == '(' && c2 == ')')
            {
                return 2;
            }
            if(c == 'c' && (c1 == '(' || c1 == '<' || c1 == '['))
            {
                return 1;
            }
            if(c == 'e' && c1 == '\u20AC')
            {
                return 1;
            }
            if(c == 's' && c1 == '$')
            {
                return 1;
            }
            return c != 'l' || c1 != 'i' ? 0 : 1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("9193, " + c + ", " + i + ", " + c1 + ", " + c2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method556(byte byte0, char c, char c1, char c2)
    {
        try
        {
            if(byte0 != 9)
            {
                aBoolean705 = !aBoolean705;
            }
            if(c1 == c2)
            {
                return 1;
            }
            if(c1 >= 'a' && c1 <= 'm')
            {
                if(c1 == 'a')
                {
                    if(c2 == '4' || c2 == '@' || c2 == '^')
                    {
                        return 1;
                    }
                    return c2 != '/' || c != '\\' ? 0 : 2;
                }
                if(c1 == 'b')
                {
                    if(c2 == '6' || c2 == '8')
                    {
                        return 1;
                    }
                    return (c2 != '1' || c != '3') && (c2 != 'i' || c != '3') ? 0 : 2;
                }
                if(c1 == 'c')
                {
                    return c2 != '(' && c2 != '<' && c2 != '{' && c2 != '[' ? 0 : 1;
                }
                if(c1 == 'd')
                {
                    return (c2 != '[' || c != ')') && (c2 != 'i' || c != ')') ? 0 : 2;
                }
                if(c1 == 'e')
                {
                    return c2 != '3' && c2 != '\u20AC' ? 0 : 1;
                }
                if(c1 == 'f')
                {
                    if(c2 == 'p' && c == 'h')
                    {
                        return 2;
                    }
                    return c2 != '\243' ? 0 : 1;
                }
                if(c1 == 'g')
                {
                    return c2 != '9' && c2 != '6' && c2 != 'q' ? 0 : 1;
                }
                if(c1 == 'h')
                {
                    return c2 != '#' ? 0 : 1;
                }
                if(c1 == 'i')
                {
                    return c2 != 'y' && c2 != 'l' && c2 != 'j' && c2 != '1' && c2 != '!' && c2 != ':' && c2 != ';' && c2 != '|' ? 0 : 1;
                }
                if(c1 == 'j')
                {
                    return 0;
                }
                if(c1 == 'k')
                {
                    return 0;
                }
                if(c1 == 'l')
                {
                    return c2 != '1' && c2 != '|' && c2 != 'i' ? 0 : 1;
                }
                if(c1 == 'm')
                {
                    return 0;
                }
            }
            if(c1 >= 'n' && c1 <= 'z')
            {
                if(c1 == 'n')
                {
                    return 0;
                }
                if(c1 == 'o')
                {
                    if(c2 == '0' || c2 == '*')
                    {
                        return 1;
                    }
                    return (c2 != '(' || c != ')') && (c2 != '[' || c != ']') && (c2 != '{' || c != '}') && (c2 != '<' || c != '>') ? 0 : 2;
                }
                if(c1 == 'p')
                {
                    return 0;
                }
                if(c1 == 'q')
                {
                    return 0;
                }
                if(c1 == 'r')
                {
                    return 0;
                }
                if(c1 == 's')
                {
                    return c2 != '5' && c2 != 'z' && c2 != '$' && c2 != '2' ? 0 : 1;
                }
                if(c1 == 't')
                {
                    return c2 != '7' && c2 != '+' ? 0 : 1;
                }
                if(c1 == 'u')
                {
                    if(c2 == 'v')
                    {
                        return 1;
                    }
                    return (c2 != '\\' || c != '/') && (c2 != '\\' || c != '|') && (c2 != '|' || c != '/') ? 0 : 2;
                }
                if(c1 == 'v')
                {
                    return (c2 != '\\' || c != '/') && (c2 != '\\' || c != '|') && (c2 != '|' || c != '/') ? 0 : 2;
                }
                if(c1 == 'w')
                {
                    return c2 != 'v' || c != 'v' ? 0 : 2;
                }
                if(c1 == 'x')
                {
                    return (c2 != ')' || c != '(') && (c2 != '}' || c != '{') && (c2 != ']' || c != '[') && (c2 != '>' || c != '<') ? 0 : 2;
                }
                if(c1 == 'y')
                {
                    return 0;
                }
                if(c1 == 'z')
                {
                    return 0;
                }
            }
            if(c1 >= '0' && c1 <= '9')
            {
                if(c1 == '0')
                {
                    if(c2 == 'o' || c2 == 'O')
                    {
                        return 1;
                    }
                    return (c2 != '(' || c != ')') && (c2 != '{' || c != '}') && (c2 != '[' || c != ']') ? 0 : 2;
                }
                if(c1 == '1')
                {
                    return c2 != 'l' ? 0 : 1;
                } else
                {
                    return 0;
                }
            }
            if(c1 == ',')
            {
                return c2 != '.' ? 0 : 1;
            }
            if(c1 == '.')
            {
                return c2 != ',' ? 0 : 1;
            }
            if(c1 == '!')
            {
                return c2 != 'i' ? 0 : 1;
            } else
            {
                return 0;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("1728, " + byte0 + ", " + c + ", " + c1 + ", " + c2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static byte method557(char c, byte byte0)
    {
        try
        {
            if(byte0 == 4)
            {
                byte0 = 0;
            } else
            {
                for(int i = 1; i > 0; i++)
                {
                }
            }
            if(c >= 'a' && c <= 'z')
            {
                return (byte)((c - 97) + 1);
            }
            if(c == '\'')
            {
                return 28;
            }
            if(c >= '0' && c <= '9')
            {
                return (byte)((c - 48) + 29);
            } else
            {
                return 27;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("56877, " + c + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method558(char ac[], int i)
    {
        try
        {
            int j = 0;
            int k = 0;
            if(i <= 0)
            {
                for(int l = 1; l > 0; l++)
                {
                }
            }
            int i1 = 0;
            int j1 = 0;
            while((j = method559(ac, false, k)) != -1)
            {
                boolean flag = false;
                for(int k1 = k; k1 >= 0 && k1 < j && !flag; k1++)
                {
                    if(!method561(ac[k1], 0) && !method562(true, ac[k1]))
                    {
                        flag = true;
                    }
                }
                if(flag)
                {
                    i1 = 0;
                }
                if(i1 == 0)
                {
                    j1 = j;
                }
                k = method560((byte)3, ac, j);
                int l1 = 0;
                for(int i2 = j; i2 < k; i2++)
                {
                    l1 = (l1 * 10 + ac[i2]) - 48;
                }
                if(l1 > 255 || k - j > 8)
                {
                    i1 = 0;
                } else
                {
                    i1++;
                }
                if(i1 == 4)
                {
                    for(int j2 = j1; j2 < k; j2++)
                    {
                        ac[j2] = '*';
                    }
                    i1 = 0;
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("32736, " + ac + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method559(char ac[], boolean flag, int i)
    {
        try
        {
            if(flag)
            {
                anInt699 = -280;
            }
            for(int j = i; j < ac.length && j >= 0; j++)
            {
                if(ac[j] >= '0' && ac[j] <= '9')
                {
                    return j;
                }
            }
            return -1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("73371, " + ac + ", " + flag + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method560(byte byte0, char ac[], int i)
    {
        try
        {
            if(byte0 != 3)
            {
                anInt698 = 105;
            }
            for(int j = i; j < ac.length && j >= 0; j++)
            {
                if(ac[j] < '0' || ac[j] > '9')
                {
                    return j;
                }
            }
            return ac.length;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("47614, " + byte0 + ", " + ac + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method561(char c, int i)
    {
        try
        {
            if(i != 0)
            {
                anInt699 = -232;
            }
            return !method563(c, false) && !method564((byte)2, c);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("46429, " + c + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method562(boolean flag, char c)
    {
        try
        {
            if(!flag)
            {
                throw new NullPointerException();
            }
            if(c < 'a' || c > 'z')
            {
                return true;
            }
            return c == 'v' || c == 'x' || c == 'j' || c == 'q' || c == 'z';
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("20825, " + flag + ", " + c + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method563(char c, boolean flag)
    {
        try
        {
            if(flag)
            {
                throw new NullPointerException();
            }
            return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("18646, " + c + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method564(byte byte0, char c)
    {
        try
        {
            if(byte0 != aByte703)
            {
                throw new NullPointerException();
            }
            return c >= '0' && c <= '9';
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("85071, " + byte0 + ", " + c + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method565(char c, boolean flag)
    {
        try
        {
            if(flag)
            {
                throw new NullPointerException();
            }
            return c >= 'a' && c <= 'z';
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("72651, " + c + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method566(char c, boolean flag)
    {
        try
        {
            if(flag)
            {
                aBoolean704 = !aBoolean704;
            }
            return c >= 'A' && c <= 'Z';
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("39795, " + c + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static boolean method567(int i, char ac[])
    {
        try
        {
            boolean flag = true;
            for(int j = 0; j < ac.length; j++)
            {
                if(!method564((byte)2, ac[j]) && ac[j] != 0)
                {
                    flag = false;
                }
            }
            if(i != 0)
            {
                throw new NullPointerException();
            }
            if(flag)
            {
                return true;
            }
            int k = method568(ac, 69);
            int l = 0;
            int i1 = anIntArray708.length - 1;
            if(k == anIntArray708[l] || k == anIntArray708[i1])
            {
                return true;
            }
            do
            {
                int j1 = (l + i1) / 2;
                if(k == anIntArray708[j1])
                {
                    return true;
                }
                if(k < anIntArray708[j1])
                {
                    i1 = j1;
                } else
                {
                    l = j1;
                }
            } while(l != i1 && l + 1 != i1);
            return false;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("449, " + i + ", " + ac + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static int method568(char ac[], int i)
    {
        try
        {
            if(ac.length > 6)
            {
                return 0;
            }
            int j = 0;
            for(int k = 0; k < ac.length; k++)
            {
                char c = ac[ac.length - k - 1];
                if(c >= 'a' && c <= 'z')
                {
                    j = j * 38 + ((c - 97) + 1);
                } else
                if(c == '\'')
                {
                    j = j * 38 + 27;
                } else
                if(c >= '0' && c <= '9')
                {
                    j = j * 38 + ((c - 48) + 28);
                } else
                if(c != 0)
                {
                    return 0;
                }
            }
            if(i <= 0)
            {
                anInt706 = 296;
            }
            return j;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("16339, " + ac + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

}
