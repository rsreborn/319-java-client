package com.jagex;

import com.jagex.sign.Signlink;

public class Class3 {

    public int anInt49;
    public boolean aBoolean50;
    public boolean aBoolean51;
    public boolean aBoolean52;
    public int anInt53;
    public int anInt54;
    public Class13_Sub1 aClass13_Sub1_55;
    public int anInt56;
    public int anInt57;
    public Class49 aClass49_58;
    public Class21 aClass21_59;

    public Class3(int i, int j) {
        anInt49 = 36;
        aBoolean50 = false;
        aBoolean51 = true;
        aBoolean52 = false;
        aClass13_Sub1_55 = new Class13_Sub1();
        aClass21_59 = new Class21(14716);
        try {
            anInt56 = i;
            if (j <= 0) {
                aBoolean52 = !aBoolean52;
            }
            anInt57 = i;
            aClass49_58 = new Class49(1024, aBoolean50);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("35599, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Class13_Sub1 method172(long l) {
        Class13_Sub1 class13_sub1 = (Class13_Sub1) aClass49_58.method589(l);
        if (class13_sub1 != null) {
            aClass21_59.method439(class13_sub1);
            anInt54++;
        } else {
            anInt53++;
        }
        return class13_sub1;
    }

    public void method173(Class13_Sub1 class13_sub1, long l, int i) {
        try {
            if (anInt57 == 0) {
                Class13_Sub1 class13_sub1_1 = aClass21_59.method440();
                class13_sub1_1.method253();
                class13_sub1_1.method254();
                if (class13_sub1_1 == aClass13_Sub1_55) {
                    Class13_Sub1 class13_sub1_2 = aClass21_59.method440();
                    class13_sub1_2.method253();
                    class13_sub1_2.method254();
                }
            } else {
                anInt57--;
            }
            aClass49_58.method590(l, class13_sub1, (byte) 5);
            if (i != 9388) {
                anInt49 = 361;
            }
            aClass21_59.method439(class13_sub1);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("71111, " + class13_sub1 + ", " + l + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method174() {
        do {
            Class13_Sub1 class13_sub1 = aClass21_59.method440();
            if (class13_sub1 != null) {
                class13_sub1.method253();
                class13_sub1.method254();
            } else {
                anInt57 = anInt56;
                return;
            }
        } while (true);
    }
}
