package com.jagex.util;

import com.jagex.io.Buffer;

public class ChatMessageCodec {

    public static char[] message = new char[100];
    public static Buffer messageBuffer = new Buffer(new byte[100]);
    public static final char[] VALID_CHARACTERS = {
            ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r',
            'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p',
            'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2',
            '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?',
            '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\',
            '\'', '@', '#', '+', '=', '\243', '$', '%', '"', '[',
            ']'
    };

    public static String decode(Buffer buffer, int length) {
        int k = 0;
        int l = -1;
        for (int i1 = 0; i1 < length; i1++) {
            int j1 = buffer.readUByte();
            int k1 = j1 >> 4 & 0xf;
            if (l == -1) {
                if (k1 < 13) {
                    message[k++] = VALID_CHARACTERS[k1];
                } else {
                    l = k1;
                }
            } else {
                message[k++] = VALID_CHARACTERS[((l << 4) + k1) - 195];
                l = -1;
            }
            k1 = j1 & 0xf;
            if (l == -1) {
                if (k1 < 13) {
                    message[k++] = VALID_CHARACTERS[k1];
                } else {
                    l = k1;
                }
            } else {
                message[k++] = VALID_CHARACTERS[((l << 4) + k1) - 195];
                l = -1;
            }
        }
        boolean flag = true;
        for (int l1 = 0; l1 < k; l1++) {
            char c = message[l1];
            if (flag && c >= 'a' && c <= 'z') {
                message[l1] += '\uFFE0';
                flag = false;
            }
            if (c == '.' || c == '!' || c == '?') {
                flag = true;
            }
        }

        return new String(message, 0, k);
    }

    public static void encode(Buffer buffer, String chatMessage) {
        if (chatMessage.length() > 80) {
            chatMessage = chatMessage.substring(0, 80);
        }
        chatMessage = chatMessage.toLowerCase();

        int k = -1;
        for (int l = 0; l < chatMessage.length(); l++) {
            char c = chatMessage.charAt(l);
            int i1 = 0;
            for (int j1 = 0; j1 < VALID_CHARACTERS.length; j1++) {
                if (c != VALID_CHARACTERS[j1]) {
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
        }
    }

    public static String verify(String chatMessage) {
        messageBuffer.position = 0;
        encode(messageBuffer, chatMessage);
        int length = messageBuffer.position;
        messageBuffer.position = 0;
        return decode(messageBuffer, length);
    }

}
