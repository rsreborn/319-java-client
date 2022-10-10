package com.jagex.util;

public class HashTable {

    public int size;
    public Node[] cache;

    public HashTable(int size) {
        this.size = size;
        cache = new Node[size];
        for (int nodeId = 0; nodeId < size; nodeId++) {
            Node node = cache[nodeId] = new Node();
            node.next = node;
            node.previous = node;
        }
    }

    public Node get(long l) {
        Node bucket = cache[(int) (l & (long) (size - 1))];
        for (Node node = bucket.next; node != bucket; node = node.next) {
            if (node.id == l) {
                return node;
            }
        }
        return null;
    }

    public void put(Node node, long id) {
        if (node.previous != null) {
            node.remove();
        }
        Node bucket = cache[(int) (id & (long) (size - 1))];
        node.previous = bucket.previous;
        node.next = bucket;
        node.previous.next = node;
        node.next.previous = node;
        node.id = id;
    }
}
