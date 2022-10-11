package com.jagex.update;

import com.jagex.util.CacheableNode;

public class GameUpdateNode extends CacheableNode {

    public byte[] buffer;
    public int cyclesSinceSent;
    public int type;
    public boolean immediate;
    public int id;

    public GameUpdateNode() {
        immediate = true;
    }
}
