package com.jagex;

import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;

public class Class45 {

    public static boolean aBoolean728 = true;
    public static char[] aCharArray729 = new char[100];
    public static Buffer aBuffer_730 = new Buffer(new byte[100]);
    public static char[] aCharArray731 = {
            ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r',
            'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p',
            'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2',
            '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?',
            '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\',
            '\'', '@', '#', '+', '=', '\243', '$', '%', '"', '[',
            ']'
    };

    public static String method573(Buffer buffer, int i, int j) {
        try {
            int k = 0;
            int l = -1;
            for (int i1 = 0; i1 < j; i1++) {
                int j1 = buffer.readUByte();
                int k1 = j1 >> 4 & 0xf;
                if (l == -1) {
                    if (k1 < 13) {
                        aCharArray729[k++] = aCharArray731[k1];
                    } else {
                        l = k1;
                    }
                } else {
                    aCharArray729[k++] = aCharArray731[((l << 4) + k1) - 195];
                    l = -1;
                }
                k1 = j1 & 0xf;
                if (l == -1) {
                    if (k1 < 13) {
                        aCharArray729[k++] = aCharArray731[k1];
                    } else {
                        l = k1;
                    }
                } else {
                    aCharArray729[k++] = aCharArray731[((l << 4) + k1) - 195];
                    l = -1;
                }
            }
            boolean flag = true;
            for (int l1 = 0; l1 < k; l1++) {
                char c = aCharArray729[l1];
                if (flag && c >= 'a' && c <= 'z') {
                    aCharArray729[l1] += '\uFFE0';
                    flag = false;
                }
                if (c == '.' || c == '!' || c == '?') {
                    flag = true;
                }
            }
            if (i != 0) {
                aBoolean728 = !aBoolean728;
            }
            return new String(aCharArray729, 0, k);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("46851, " + buffer + ", " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void method574(Buffer buffer, int i, String s) {
        try {
            if (s.length() > 80) {
                s = s.substring(0, 80);
            }
            s = s.toLowerCase();
            if (i != -45468) {
                for (int j = 1; j > 0; j++) {
                }
            }
            int k = -1;
            for (int l = 0; l < s.length(); l++) {
                char c = s.charAt(l);
                int i1 = 0;
                for (int j1 = 0; j1 < aCharArray731.length; j1++) {
                    if (c != aCharArray731[j1]) {
                        continue;
                    }
                    i1 = j1;
                    break;
                }
                if (i1 > 12) {
                    i1 += 195;
                }
                if (k == -1) {
                    if (i1 < 13) {
                        k = i1;
                    } else {
                        buffer.writeByte(i1);
                    }
                } else if (i1 < 13) {
                    buffer.writeByte((k << 4) + i1);
                    k = -1;
                } else {
                    buffer.writeByte((k << 4) + (i1 >> 4));
                    k = i1 & 0xf;
                }
            }
            if (k != -1) {
                buffer.writeByte(k << 4);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("18403, " + buffer + ", " + i + ", " + s + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public static String method575(boolean flag, String s) {
        try {
            aBuffer_730.position = 0;
            method574(aBuffer_730, -45468, s);
            int i = aBuffer_730.position;
            aBuffer_730.position = 0;
            String s1 = method573(aBuffer_730, 0, i);
            if (flag) {
                for (int j = 1; j > 0; j++) {
                }
            }
            return s1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("57390, " + flag + ", " + s + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

}
