package com.jagex;

import com.jagex.sign.signlink;

public class Class45
{

    public static boolean aBoolean728 = true;
    public static char aCharArray729[] = new char[100];
    public static Class13_Sub1_Sub2 aClass13_Sub1_Sub2_730 = new Class13_Sub1_Sub2(-351, new byte[100]);
    public static char aCharArray731[] = {
        ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r',
        'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p',
        'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2',
        '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?',
        '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\',
        '\'', '@', '#', '+', '=', '\243', '$', '%', '"', '[',
        ']'
    };

    public static String method573(Class13_Sub1_Sub2 class13_sub1_sub2, int i, int j)
    {
        try
        {
            int k = 0;
            int l = -1;
            for(int i1 = 0; i1 < j; i1++)
            {
                int j1 = class13_sub1_sub2.readUnsignedByte();
                int k1 = j1 >> 4 & 0xf;
                if(l == -1)
                {
                    if(k1 < 13)
                    {
                        aCharArray729[k++] = aCharArray731[k1];
                    } else
                    {
                        l = k1;
                    }
                } else
                {
                    aCharArray729[k++] = aCharArray731[((l << 4) + k1) - 195];
                    l = -1;
                }
                k1 = j1 & 0xf;
                if(l == -1)
                {
                    if(k1 < 13)
                    {
                        aCharArray729[k++] = aCharArray731[k1];
                    } else
                    {
                        l = k1;
                    }
                } else
                {
                    aCharArray729[k++] = aCharArray731[((l << 4) + k1) - 195];
                    l = -1;
                }
            }
            boolean flag = true;
            for(int l1 = 0; l1 < k; l1++)
            {
                char c = aCharArray729[l1];
                if(flag && c >= 'a' && c <= 'z')
                {
                    aCharArray729[l1] += '\uFFE0';
                    flag = false;
                }
                if(c == '.' || c == '!' || c == '?')
                {
                    flag = true;
                }
            }
            if(i != 0)
            {
                aBoolean728 = !aBoolean728;
            }
            return new String(aCharArray729, 0, k);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("46851, " + class13_sub1_sub2 + ", " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method574(Class13_Sub1_Sub2 class13_sub1_sub2, int i, String s)
    {
        try
        {
            if(s.length() > 80)
            {
                s = s.substring(0, 80);
            }
            s = s.toLowerCase();
            if(i != -45468)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            int k = -1;
            for(int l = 0; l < s.length(); l++)
            {
                char c = s.charAt(l);
                int i1 = 0;
                for(int j1 = 0; j1 < aCharArray731.length; j1++)
                {
                    if(c != aCharArray731[j1])
                    {
                        continue;
                    }
                    i1 = j1;
                    break;
                }
                if(i1 > 12)
                {
                    i1 += 195;
                }
                if(k == -1)
                {
                    if(i1 < 13)
                    {
                        k = i1;
                    } else
                    {
                        class13_sub1_sub2.method301(i1);
                    }
                } else
                if(i1 < 13)
                {
                    class13_sub1_sub2.method301((k << 4) + i1);
                    k = -1;
                } else
                {
                    class13_sub1_sub2.method301((k << 4) + (i1 >> 4));
                    k = i1 & 0xf;
                }
            }
            if(k != -1)
            {
                class13_sub1_sub2.method301(k << 4);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("18403, " + class13_sub1_sub2 + ", " + i + ", " + s + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public static String method575(boolean flag, String s)
    {
        try
        {
            aClass13_Sub1_Sub2_730.anInt1399 = 0;
            method574(aClass13_Sub1_Sub2_730, -45468, s);
            int i = aClass13_Sub1_Sub2_730.anInt1399;
            aClass13_Sub1_Sub2_730.anInt1399 = 0;
            String s1 = method573(aClass13_Sub1_Sub2_730, 0, i);
            if(flag)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            return s1;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("57390, " + flag + ", " + s + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

}
