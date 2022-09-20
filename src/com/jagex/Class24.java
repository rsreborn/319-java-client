package com.jagex;

import com.jagex.sign.signlink;

public class Class24
{

    public static int anInt396 = 7270;
    public static int anInt397 = 161;
    public static boolean aBoolean398 = true;
    public static boolean aBoolean399 = true;
    public static int anInt400 = 60;
    public static char aCharArray401[] = {
        '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
        't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2',
        '3', '4', '5', '6', '7', '8', '9'
    };

    public static long method446(String s)
    {
        long l = 0L;
        for(int i = 0; i < s.length() && i < 12; i++)
        {
            char c = s.charAt(i);
            l *= 37L;
            if(c >= 'A' && c <= 'Z')
            {
                l += (1 + c) - 65;
            } else
            if(c >= 'a' && c <= 'z')
            {
                l += (1 + c) - 97;
            } else
            if(c >= '0' && c <= '9')
            {
                l += (27 + c) - 48;
            }
        }
        for(; l % 37L == 0L && l != 0L; l /= 37L)
        {
        }
        return l;
    }

    public static String method447(long l, int i)
    {
        try
        {
            if(i != 0)
            {
                anInt396 = -277;
            }
            if(l <= 0L || l >= 0x5b5b57f8a98a5dd1L)
            {
                return "invalid_name";
            }
            if(l % 37L == 0L)
            {
                return "invalid_name";
            }
            int j = 0;
            char ac[] = new char[12];
            while(l != 0L)
            {
                long l1 = l;
                l /= 37L;
                ac[11 - j++] = aCharArray401[(int)(l1 - l * 37L)];
            }
            return new String(ac, 12 - j, j);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("50315, " + l + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static long method448(byte byte0, String s)
    {
        try
        {
            if(byte0 != 23)
            {
                throw new NullPointerException();
            }
            s = s.toUpperCase();
            long l = 0L;
            for(int i = 0; i < s.length(); i++)
            {
                l = (l * 61L + (long)s.charAt(i)) - 32L;
                l = l + (l >> 56) & 0xffffffffffffffL;
            }
            return l;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("34643, " + byte0 + ", " + s + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static String method449(int i, boolean flag)
    {
        try
        {
            if(flag)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            return (i >> 24 & 0xff) + "." + (i >> 16 & 0xff) + "." + (i >> 8 & 0xff) + "." + (i & 0xff);
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("46986, " + i + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static String method450(String s, int i)
    {
        try
        {
            if(i < 0 || i > 0)
            {
                aBoolean399 = !aBoolean399;
            }
            if(s.length() > 0)
            {
                char ac[] = s.toCharArray();
                for(int j = 0; j < ac.length; j++)
                {
                    if(ac[j] == '_')
                    {
                        ac[j] = ' ';
                        if(j + 1 < ac.length && ac[j + 1] >= 'a' && ac[j + 1] <= 'z')
                        {
                            ac[j + 1] = (char)((ac[j + 1] + 65) - 97);
                        }
                    }
                }
                if(ac[0] >= 'a' && ac[0] <= 'z')
                {
                    ac[0] = (char)((ac[0] + 65) - 97);
                }
                return new String(ac);
            } else
            {
                return s;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("67660, " + s + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static String method451(String s, boolean flag)
    {
        try
        {
            if(!flag)
            {
                throw new NullPointerException();
            }
            StringBuffer stringbuffer = new StringBuffer();
            for(int i = 0; i < s.length(); i++)
            {
                stringbuffer.append("*");
            }
            return stringbuffer.toString();
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("57272, " + s + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

}
