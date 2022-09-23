package com.jagex;

import com.jagex.sign.Signlink;

public class Archive {

    public int anInt40;
    public boolean aBoolean41;
    public byte[] aByteArray42;
    public int anInt43;
    public int[] anIntArray44;
    public int[] anIntArray45;
    public int[] anIntArray46;
    public int[] anIntArray47;
    public boolean aBoolean48;

    public Archive(byte[] abyte0, int i) {
        anInt40 = 782;
        aBoolean41 = true;
        try {
            i = 75 / i;
            method148(abyte0, 44570);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("30653, " + abyte0 + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method148(byte[] abyte0, int i) {
        try {
            Buffer buffer = new Buffer(abyte0);
            int j = buffer.readTriByte();
            int k = buffer.readTriByte();
            if (k != j) {
                byte[] abyte1 = new byte[j];
                Class16.method427(abyte1, j, abyte0, k, 6);
                aByteArray42 = abyte1;
                buffer = new Buffer(aByteArray42);
                aBoolean48 = true;
            } else {
                aByteArray42 = abyte0;
                aBoolean48 = false;
            }
            anInt43 = buffer.readUnsignedShort();
            anIntArray44 = new int[anInt43];
            anIntArray45 = new int[anInt43];
            anIntArray46 = new int[anInt43];
            anIntArray47 = new int[anInt43];
            int l = buffer.position + anInt43 * 10;
            if (i != 44570) {
                return;
            }
            for (int i1 = 0; i1 < anInt43; i1++) {
                anIntArray44[i1] = buffer.readInt();
                anIntArray45[i1] = buffer.readTriByte();
                anIntArray46[i1] = buffer.readTriByte();
                anIntArray47[i1] = l;
                l += anIntArray46[i1];
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("21233, " + abyte0 + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public byte[] readFile(String s, byte[] abyte0) {
        int i = 0;
        s = s.toUpperCase();
        for (int j = 0; j < s.length(); j++) {
            i = (i * 61 + s.charAt(j)) - 32;
        }
        for (int k = 0; k < anInt43; k++) {
            if (anIntArray44[k] == i) {
                if (abyte0 == null) {
                    abyte0 = new byte[anIntArray45[k]];
                }
                if (!aBoolean48) {
                    Class16.method427(abyte0, anIntArray45[k], aByteArray42, anIntArray46[k], anIntArray47[k]);
                } else {
                    for (int l = 0; l < anIntArray45[k]; l++) {
                        abyte0[l] = aByteArray42[anIntArray47[k] + l];
                    }
                }
                return abyte0;
            }
        }
        return null;
    }
}
