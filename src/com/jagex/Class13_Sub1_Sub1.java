package com.jagex;

import com.jagex.sign.Signlink;

public class Class13_Sub1_Sub1 extends Class13_Sub1 {

    public static boolean aBoolean1378;
    public boolean aBoolean1375;
    public Class7[] aClass7Array1376;
    public int anInt1377;

    public Class13_Sub1_Sub1() {
        aBoolean1375 = false;
        anInt1377 = 1000;
    }

    public void method255(int i, int j, int k, int l, int i1, int j1, int k1,
                          int l1, int i2) {
        Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = method256(718);
        if (class13_sub1_sub1_sub4 != null) {
            anInt1377 = class13_sub1_sub1_sub4.anInt1377;
            class13_sub1_sub1_sub4.method255(i, j, k, l, i1, j1, k1, l1, i2);
        }
    }

    public Class13_Sub1_Sub1_Sub4 method256(int i) {
        try {
            if (i <= 0) {
                aBoolean1375 = !aBoolean1375;
            }
            return null;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("32294, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
