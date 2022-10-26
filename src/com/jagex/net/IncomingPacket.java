package com.jagex.net;

public enum IncomingPacket {

    LOGOUT(49),

    UPDATE_ACTIVE_MAP_REGION(228),
    CONSTRUCT_MAP_REGION(52),

    ADD_CHATBOX_MESSAGE(50),

    DISPLAY_WIDGET(188),
    DISPLAY_CHATBOX_WIDGET(200),

    DISPLAY_SYSTEM_UPDATE(103),

    SET_WIDGET_ITEM_MODEL(172),
    SET_WIDGET_PLAYER_HEAD(252),

    SET_WIDGET_NPC_HEAD(157),

    SET_WIDGET_ANIMATION(95),

    SET_SKILL(211),

    UPDATE_WIDGET_STRING(127),
    UPDATE_WIDGET_ITEM_CONTAINER(221),

    CLOSE_WIDGETS(143),

    SHOW_WELCOME_SCREEN(178),
    SHOW_SIDEBAR_AND_WIDGET(229),
    FLASH_SIDEBAR_ICON(168),

    PLAYER_UPDATING(76),
    NPC_UPDATING(249),

    TEMPORARY_ENDING_PACKET(500);

    private final int packetId;

    IncomingPacket(int packetId) {
        this.packetId = packetId;
    }

    public boolean equals(int opcode) {
        return opcode == this.packetId;
    }
}
