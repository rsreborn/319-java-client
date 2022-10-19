package com.jagex.renderable;

import com.jagex.cache.configs.ObjectConfig;
import com.jagex.graphics.Model;

public class Object extends Renderable {

    public int anInt1563;
    public int anInt1564;
    public boolean aBoolean1565;

    public Object() {
        aBoolean1565 = false;
    }

    public Model getRotatedModel() {
        ObjectConfig objectConfig = ObjectConfig.lookup(anInt1563);
        return objectConfig.method509(anInt1564);
    }
}
