package com.jagex.util;

public class CacheableNode extends Node {

    public CacheableNode next;
    public CacheableNode previous;

    public void clear() {
        if (previous != null) {
            previous.next = next;
            next.previous = previous;
            next = null;
            previous = null;
        }
    }
}
