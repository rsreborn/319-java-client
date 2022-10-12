package com.jagex.update;

import com.jagex.util.CacheableNode;

public class GameUpdateRequest extends CacheableNode {

    public byte[] buffer;
    public int cyclesSinceSent;
    public int type;
    public boolean mandatory;
    public int file;

    public GameUpdateRequest() {
        mandatory = true;
    }
}
