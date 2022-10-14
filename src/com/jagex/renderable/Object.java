package com.jagex.renderable;

import com.jagex.cache.configs.ObjectConfig;
import com.jagex.renderable.Renderable;
import com.jagex.graphics.Model;
import com.jagex.sign.Signlink;

public class Object extends Renderable {

    public int anInt1563;
    public int anInt1564;
    public boolean aBoolean1565;

    public Object() {
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
