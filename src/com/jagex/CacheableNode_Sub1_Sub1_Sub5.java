package com.jagex;

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
            ItemDefinition itemDefinition = ItemDefinition.method505(anInt1563);
            return itemDefinition.method509(anInt1564);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("47430, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
