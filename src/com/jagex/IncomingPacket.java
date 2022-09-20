package com.jagex;

public enum IncomingPacket {

    UPDATE_ACTIVE_MAP_REGION(228),
    CONSTRUCT_MAP_REGION(52),

    ADD_CHATBOX_MESSAGE(50),

    CLOSE_ALL_WIDGETS(188),
    SET_WIDGET_ITEM_MODEL(172),

    SHOW_SIDEBAR_AND_WIDGET(229),

    PLAYER_UPDATING(76),

    TEMPORARY_ENDING_PACKET(500);

    private int packetId;

    IncomingPacket(int packetId) {
        this.packetId = packetId;
    }

    public boolean equals(int opcode) {
        return opcode == this.packetId;
    }
}
