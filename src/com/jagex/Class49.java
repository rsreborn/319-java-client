package com.jagex;

import com.jagex.util.Node;
import com.jagex.sign.Signlink;

public class Class49 {

    public int anInt795;
    public Node[] aNodeArray796;

    public Class49(int i) {
        anInt795 = i;
        aNodeArray796 = new Node[i];
        for (int j = 0; j < i; j++) {
            Node node = aNodeArray796[j] = new Node();
            node.next = node;
            node.previous = node;
        }
    }

    public Node method589(long l) {
        Node node = aNodeArray796[(int) (l & (long) (anInt795 - 1))];
        for (Node node_1 = node.next; node_1 != node; node_1 = node_1.next) {
            if (node_1.id == l) {
                return node_1;
            }
        }
        return null;
    }

    public void method590(long l, Node node) {
        if (node.previous != null) {
            node.remove();
        }
        Node node_1 = aNodeArray796[(int) (l & (long) (anInt795 - 1))];
        node.previous = node_1.previous;
        node.next = node_1;
        node.previous.next = node;
        node.next.previous = node;
        node.id = l;
    }
}
