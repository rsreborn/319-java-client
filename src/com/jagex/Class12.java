package com.jagex;

import com.jagex.sign.Signlink;

public class Class12 {

    public boolean aBoolean231;
    public int anInt232;
    public Class13 aClass13_233;
    public Class13 aClass13_234;

    public Class12(int i) {
        aBoolean231 = true;
        anInt232 = 46358;
        aClass13_233 = new Class13();
        try {
            aClass13_233.aClass13_236 = aClass13_233;
            if (i != 36944) {
                throw new NullPointerException();
            } else {
                aClass13_233.aClass13_237 = aClass13_233;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("7078, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method245(Class13 class13) {
        if (class13.aClass13_237 != null) {
            class13.method253();
        }
        class13.aClass13_237 = aClass13_233.aClass13_237;
        class13.aClass13_236 = aClass13_233;
        class13.aClass13_237.aClass13_236 = class13;
        class13.aClass13_236.aClass13_237 = class13;
    }

    public void method246(Class13 class13, int i) {
        try {
            if (class13.aClass13_237 != null) {
                class13.method253();
            }
            class13.aClass13_237 = aClass13_233;
            class13.aClass13_236 = aClass13_233.aClass13_236;
            class13.aClass13_237.aClass13_236 = class13;
            if (i < 5 || i > 5) {
                for (int j = 1; j > 0; j++) {
                }
            }
            class13.aClass13_236.aClass13_237 = class13;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("95816, " + class13 + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Class13 method247() {
        Class13 class13 = aClass13_233.aClass13_236;
        if (class13 == aClass13_233) {
            return null;
        } else {
            class13.method253();
            return class13;
        }
    }

    public Class13 method248() {
        Class13 class13 = aClass13_233.aClass13_236;
        if (class13 == aClass13_233) {
            aClass13_234 = null;
            return null;
        } else {
            aClass13_234 = class13.aClass13_236;
            return class13;
        }
    }

    public Class13 method249(boolean flag) {
        try {
            Class13 class13 = aClass13_233.aClass13_237;
            if (class13 == aClass13_233) {
                aClass13_234 = null;
                return null;
            }
            aClass13_234 = class13.aClass13_237;
            if (!flag) {
                throw new NullPointerException();
            } else {
                return class13;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("65433, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Class13 method250(int i) {
        try {
            while (i >= 0) {
                anInt232 = -376;
            }
            Class13 class13 = aClass13_234;
            if (class13 == aClass13_233) {
                aClass13_234 = null;
                return null;
            } else {
                aClass13_234 = class13.aClass13_236;
                return class13;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("82557, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Class13 method251(int i) {
        try {
            if (i != 0) {
                throw new NullPointerException();
            }
            Class13 class13 = aClass13_234;
            if (class13 == aClass13_233) {
                aClass13_234 = null;
                return null;
            } else {
                aClass13_234 = class13.aClass13_237;
                return class13;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("64503, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method252() {
        if (aClass13_233.aClass13_236 == aClass13_233) {
            return;
        }
        do {
            Class13 class13 = aClass13_233.aClass13_236;
            if (class13 == aClass13_233) {
                return;
            }
            class13.method253();
        } while (true);
    }
}
