package com.jagex;

import com.jagex.cache.configs.ObjectConfig;
import com.jagex.sign.Signlink;

public class CacheableNode_Sub1_Sub1_Sub5 extends CacheableNode_Sub1_ {

    public int anInt1563;
    public int anInt1564;
    public boolean aBoolean1565;

    public CacheableNode_Sub1_Sub1_Sub5() {
        aBoolean1565 = false;
    }

    public Model method256(int i) {
        try {
            if (i <= 0) {
                aBoolean1565 = !aBoolean1565;
            }
            ObjectConfig objectConfig = ObjectConfig.method505(anInt1563);
            return objectConfig.method509(anInt1564);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("47430, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
