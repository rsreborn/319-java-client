package com.jagex.renderable;

import com.jagex.graphics.Model;
import com.jagex.util.CacheableNode;

public class Renderable extends CacheableNode {

    public boolean aBoolean1375;
    public VertexNormal[] aVertexNormalArray1376;
    public int anInt1377;

    public Renderable() {
        aBoolean1375 = false;
        anInt1377 = 1000;
    }

    public void method255(int i, int j, int k, int l, int i1, int j1, int k1,
                          int l1, int i2) {
        Model class13_sub1_sub1_sub4 = getRotatedModel();
        if (class13_sub1_sub1_sub4 != null) {
            anInt1377 = class13_sub1_sub1_sub4.anInt1377;
            class13_sub1_sub1_sub4.method255(i, j, k, l, i1, j1, k1, l1, i2);
        }
    }

    public Model getRotatedModel() {
        return null;
    }
}
