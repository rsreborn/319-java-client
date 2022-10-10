package com.jagex;

import com.jagex.sign.Signlink;
import com.jagex.util.CacheableNode;
import com.jagex.util.HashTable;
import com.jagex.util.Queue;

public class Cache {

    public int anInt49;
    public boolean aBoolean50;
    public boolean aBoolean51;
    public boolean aBoolean52;
    public int anInt53;
    public int anInt54;
    public CacheableNode aClass13_Sub1_55;
    public int anInt56;
    public int anInt57;
    public HashTable aHashTable_58;
    public Queue aQueue_59;

    public Cache(int i, int j) {
        anInt49 = 36;
        aBoolean50 = false;
        aBoolean51 = true;
        aBoolean52 = false;
        aClass13_Sub1_55 = new CacheableNode();
        aQueue_59 = new Queue();
        try {
            anInt56 = i;
            if (j <= 0) {
                aBoolean52 = !aBoolean52;
            }
            anInt57 = i;
            aHashTable_58 = new HashTable(1024);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("35599, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public CacheableNode method172(long l) {
        CacheableNode class13_sub1 = (CacheableNode) aHashTable_58.get(l);
        if (class13_sub1 != null) {
            aQueue_59.push(class13_sub1);
            anInt54++;
        } else {
            anInt53++;
        }
        return class13_sub1;
    }

    public void method173(CacheableNode class13_sub1, long l, int i) {
        try {
            if (anInt57 == 0) {
                CacheableNode class13_sub1_1 = aQueue_59.pop();
                class13_sub1_1.remove();
                class13_sub1_1.clear();
                if (class13_sub1_1 == aClass13_Sub1_55) {
                    CacheableNode class13_sub1_2 = aQueue_59.pop();
                    class13_sub1_2.remove();
                    class13_sub1_2.clear();
                }
            } else {
                anInt57--;
            }
            aHashTable_58.put(l, class13_sub1);
            if (i != 9388) {
                anInt49 = 361;
            }
            aQueue_59.push(class13_sub1);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("71111, " + class13_sub1 + ", " + l + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method174() {
        do {
            CacheableNode class13_sub1 = aQueue_59.pop();
            if (class13_sub1 != null) {
                class13_sub1.remove();
                class13_sub1.clear();
            } else {
                anInt57 = anInt56;
                return;
            }
        } while (true);
    }
}
