package com.jagex;

public enum OutgoingPacket {

    NOTHING(1);

    private final int packetId;

    OutgoingPacket(int packetId) {
        this.packetId = packetId;
    }

    public boolean equals(int opcode) {
        return opcode == this.packetId;
    }
}
