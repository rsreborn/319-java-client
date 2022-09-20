package com.jagex;

import com.jagex.sign.Signlink;

public class Class48
        implements Runnable {

    public Object anObject787;
    public int[] anIntArray788;
    public Game aGame789;
    public int[] anIntArray790;
    public int anInt791;
    public boolean aBoolean792;

    public Class48(byte byte0, Game game1) {
        anObject787 = new Object();
        anIntArray788 = new int[500];
        anIntArray790 = new int[500];
        aBoolean792 = true;
        try {
            aGame789 = game1;
            if (byte0 != -123) {
                throw new NullPointerException();
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("50244, " + byte0 + ", " + game1 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void run() {
        while (aBoolean792) {
            synchronized (anObject787) {
                if (anInt791 < 500) {
                    anIntArray788[anInt791] = aGame789.anInt23;
                    anIntArray790[anInt791] = aGame789.anInt24;
                    anInt791++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception _ex) {
            }
        }
    }
}
