package com.jagex;

public enum IncomingPacket {

    UPDATE_ACTIVE_MAP_REGION(228),
    CONSTRUCT_MAP_REGION(52),

    TEMPORARY_ENDING_PACKET(500);

    private int packetId;

    IncomingPacket(int packetId) {
        this.packetId = packetId;
    }

    public boolean equals(int opcode) {
        return opcode == this.packetId;
    }
}
