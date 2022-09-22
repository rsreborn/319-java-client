package com.jagex;

public enum OutgoingPacket {

    IDLE_PACKET(63), // Equivalent to 0 in 317

    CLOSE_WIDGET(199),

    LOAD_REGION(226),// is equivalent to 220 iin 317
    LOAD_REGION_BETWEEN_SCREENS(25),  // is equivalent to 121 in 317

    UNKNOWN_CAMERA_THING(223),
    UNKNOWN_INTERFACES_THING(49),

    PLAYER_COMMAND(192),

    ATTACK_NPC(111),
    FIRST_CLICK_NPC(41),

    BUTTON_CLICK(189),

    EQUIP_ITEM(123),



    ANTI_CHEAT_UNKNOWN(205), // Equivalent to 246 in 317

    NOTHING(1);

    private final int packetId;

    OutgoingPacket(int packetId) {
        this.packetId = packetId;
    }

    public boolean equals(int opcode) {
        return opcode == this.packetId;
    }
}
