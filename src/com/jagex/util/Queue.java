package com.jagex.util;

import com.jagex.sign.Signlink;
import com.jagex.util.CacheableNode;

public class Queue {

    public CacheableNode head;
    public CacheableNode current;

    public Queue() {
        head = new CacheableNode();
        head.next = head;
        head.previous = head;
    }

    public void push(CacheableNode node) {
        if (node.previous != null) {
            node.clear();
        }
        node.previous = head.previous;
        node.next = head;
        node.previous.next = node;
        node.next.previous = node;
    }

    public CacheableNode pop() {
        CacheableNode node = head.next;
        if (node == head) {
            return null;
        } else {
            node.clear();
            return node;
        }
    }

    public CacheableNode first() {
        CacheableNode node = head.next;
        if (node == head) {
            current = null;
            return null;
        } else {
            current = node.next;
            return node;
        }
    }

    public CacheableNode next() {
        CacheableNode node = current;
        if (node == head) {
            current = null;
            return null;
        } else {
            current = node.next;
            return node;
        }
    }

    public int size() {
        int size = 0;
        for (CacheableNode node = head.next; node != head; node = node.next) {
            size++;
        }
        return size;
    }
}
