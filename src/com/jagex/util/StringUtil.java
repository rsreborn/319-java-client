package com.jagex.util;

public class StringUtil {
    public static char[] BASE_37_CHARACTERS = {
            '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2',
            '3', '4', '5', '6', '7', '8', '9'
    };

    public static long encodeBase37Username(String username) {
        long l = 0L;
        for (int i = 0; i < username.length() && i < 12; i++) {
            char c = username.charAt(i);
            l *= 37L;
            if (c >= 'A' && c <= 'Z') {
                l += (1 + c) - 65;
            } else if (c >= 'a' && c <= 'z') {
                l += (1 + c) - 97;
            } else if (c >= '0' && c <= '9') {
                l += (27 + c) - 48;
            }
        }
        return l;
    }

    public static String decodeBase37Username(long username) {
        if (username <= 0L || username >= 0x5b5b57f8a98a5dd1L) {
            return "invalid_name";
        }
        if (username % 37L == 0L) {
            return "invalid_name";
        }
        int j = 0;
        char[] ac = new char[12];
        while (username != 0L) {
            long l1 = username;
            username /= 37L;
            ac[11 - j++] = BASE_37_CHARACTERS[(int) (l1 - username * 37L)];
        }
        return new String(ac, 12 - j, j);
    }

    public static long encodeBase37(String s) {
        s = s.toUpperCase();
        long l = 0L;
        for (int i = 0; i < s.length(); i++) {
            l = (l * 61L + (long) s.charAt(i)) - 32L;
            l = l + (l >> 56) & 0xffffffffffffffL;
        }
        return l;
    }

    public static String decodeIp(int ip) {
        return (ip >> 24 & 0xff) + "." + (ip >> 16 & 0xff) + "." + (ip >> 8 & 0xff) + "." + (ip & 0xff);
    }

    public static String format(String s) {
        if (s.length() > 0) {
            char[] ac = s.toCharArray();
            for (int j = 0; j < ac.length; j++) {
                if (ac[j] == '_') {
                    ac[j] = ' ';
                    if (j + 1 < ac.length && ac[j + 1] >= 'a' && ac[j + 1] <= 'z') {
                        ac[j + 1] = (char) ((ac[j + 1] + 65) - 97);
                    }
                }
            }
            if (ac[0] >= 'a' && ac[0] <= 'z') {
                ac[0] = (char) ((ac[0] + 65) - 97);
            }
            return new String(ac);
        } else {
            return s;
        }
    }

    public static String censorString(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            stringBuffer.append("*");
        }
        return stringBuffer.toString();
    }

}
