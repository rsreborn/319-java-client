package com.jagex.util;

public class Cache {

    public int capacity;
    public int remaining;
    public Queue queue;
    public HashTable hashTable;

    public Cache(int size) {
        this.capacity = size;
        this.remaining = size;
        this.queue = new Queue();
        this.hashTable = new HashTable(1024);
    }

    public CacheableNode get(long id) {
        CacheableNode cacheableNode = (CacheableNode) hashTable.get(id);
        if (cacheableNode != null) {
            queue.push(cacheableNode);
        }
        return cacheableNode;
    }

    public void put(CacheableNode node, long id) {
        if (remaining == 0) {
            CacheableNode oldestNode = queue.pop();
            oldestNode.remove();
            oldestNode.clear();
        } else {
            remaining--;
        }
        hashTable.put(node, id);
        queue.push(node);
    }

    public void removeAll() {
        do {
            CacheableNode node = queue.pop();
            if (node != null) {
                node.remove();
                node.clear();
            } else {
                remaining = capacity;
                return;
            }
        } while (true);
    }
}
