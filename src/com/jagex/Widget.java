package com.jagex;

import com.jagex.sign.Signlink;

public class Widget {

    public static Widget[] widgets;
    public static int anInt546;
    public static boolean aBoolean567 = true;
    public static Class3 aClass3_575 = new Class3(30, 31);
    public static Class3 aClass3_584;
    public int anInt534;
    public int anInt535;
    public int anInt536;
    public int anInt537;
    public boolean aBoolean538;
    public Class13_Sub1_Sub4_Sub4[] sprites;
    public int anInt540;
    public int modelType;
    public int anInt542;
    public int anInt543;
    public int anInt544;
    public int[] anIntArray545;
    public String[] aStringArray547;
    public String aString548;
    public int[] children;
    public int anInt550;
    public boolean aBoolean551;
    public boolean aBoolean552;
    public String aString553;
    public int anInt554;
    public boolean aBoolean555;
    public int[] anIntArray556;
    public int[] childY;
    public int anInt558;
    public boolean aBoolean559;
    public int[] anIntArray560;
    public boolean hiddenUntilHovered;
    public byte aByte562;
    public String aString563;
    public String aString564;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_565;
    public int anInt566;
    public int anInt568;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_569;
    public int type;
    public int anInt571;
    public int anInt572;
    public int parentId;
    public int anInt574;
    public int[] itemContainerItemIds;
    public int anInt577;
    public boolean aBoolean578;
    public int[] itemContainerItemAmounts;
    public int[] anIntArray580;
    public int[][] anIntArrayArray581;
    public int width;
    public Class13_Sub1_Sub4_Sub2 aClass13_Sub1_Sub4_Sub2_583;
    public boolean aBoolean585;
    public int height;
    public int anInt587;
    public int anInt588;
    public String aString589;
    public int anInt590;
    public int[] childX;
    public int id;
    public int anInt593;
    public boolean aBoolean594;
    public int anInt595;
    public int anInt596;
    public int anInt597;
    public int scrollLimit;
    public int anInt599;

    public Widget() {
    }

    public static void method498(int i, Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4, int j, int k) {
        try {
            aClass3_575.method174();
            if (j != 0) {
                return;
            }
            if (class13_sub1_sub1_sub4 != null && i != 4) {
                aClass3_575.method173(class13_sub1_sub1_sub4, (i << 16) + k, 9388);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("49636, " + i + ", " + class13_sub1_sub1_sub4 + ", " + j + ", " + k + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public static Class13_Sub1_Sub4_Sub4 method500(int i, boolean flag, Class1 class1, String s) {
        try {
            if (flag) {
                anInt546 = -374;
            }
            long l = (Class24.method448((byte) 23, s) << 8) + (long) i;
            Class13_Sub1_Sub4_Sub4 class13_sub1_sub4_sub4 = (Class13_Sub1_Sub4_Sub4) aClass3_584.method172(l);
            if (class13_sub1_sub4_sub4 != null) {
                return class13_sub1_sub4_sub4;
            }
            try {
                class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(class1, s, i);
                aClass3_584.method173(class13_sub1_sub4_sub4, l, 9388);
            } catch (Exception _ex) {
                return null;
            }
            return class13_sub1_sub4_sub4;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("88345, " + i + ", " + flag + ", " + class1 + ", " + s + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void method501(Class1 class1, Class1 class1_1, Class13_Sub1_Sub4_Sub2[] aclass13_sub1_sub4_sub2) {
        try {
            aClass3_584 = new Class3(50000, 31);
            Buffer buffer = new Buffer(-351, class1.readFile("data", null));
            int parentId = -1;
            int j = buffer.readUnsignedShort();
            widgets = new Widget[j];
            while (buffer.position < buffer.payload.length) {
                int widgetIndex = buffer.readUnsignedShort();
                if (widgetIndex == 65535) {
                    parentId = buffer.readUnsignedShort();
                    widgetIndex = buffer.readUnsignedShort();
                }
                Widget widget = widgets[widgetIndex] = new Widget();
                widget.id = widgetIndex;
                widget.parentId = parentId;
                widget.type = buffer.readUnsignedByte();
                widget.anInt597 = buffer.readUnsignedByte();
                widget.anInt577 = buffer.readUnsignedShort();
                widget.width = buffer.readUnsignedShort();
                widget.height = buffer.readUnsignedShort();
                widget.aByte562 = (byte) buffer.readUnsignedByte();
                widget.anInt543 = buffer.readUnsignedByte();
                if (widget.anInt543 != 0) {
                    widget.anInt543 = (widget.anInt543 - 1 << 8) + buffer.readUnsignedByte();
                } else {
                    widget.anInt543 = -1;
                }
                int i1 = buffer.readUnsignedByte();
                if (i1 > 0) {
                    widget.anIntArray545 = new int[i1];
                    widget.anIntArray556 = new int[i1];
                    for (int j1 = 0; j1 < i1; j1++) {
                        widget.anIntArray545[j1] = buffer.readUnsignedByte();
                        widget.anIntArray556[j1] = buffer.readUnsignedShort();
                    }
                }
                int k1 = buffer.readUnsignedByte();
                if (k1 > 0) {
                    widget.anIntArrayArray581 = new int[k1][];
                    for (int l1 = 0; l1 < k1; l1++) {
                        int i3 = buffer.readUnsignedShort();
                        widget.anIntArrayArray581[l1] = new int[i3];
                        for (int l4 = 0; l4 < i3; l4++) {
                            widget.anIntArrayArray581[l1][l4] = buffer.readUnsignedShort();
                        }
                    }
                }
                if (widget.type == 0) {
                    widget.scrollLimit = buffer.readUnsignedShort();
                    widget.hiddenUntilHovered = buffer.readUnsignedByte() == 1;
                    int childrenCount = buffer.readUnsignedShort();
                    widget.children = new int[childrenCount];
                    widget.childX = new int[childrenCount];
                    widget.childY = new int[childrenCount];
                    for (int child = 0; child < childrenCount; child++) {
                        widget.children[child] = buffer.readUnsignedShort();
                        widget.childX[child] = buffer.readShort();
                        widget.childY[child] = buffer.readShort();
                    }
                }
                if (widget.type == 1) {
                    widget.anInt574 = buffer.readUnsignedShort();
                    widget.aBoolean594 = buffer.readUnsignedByte() == 1;
                }
                if (widget.type == 2) {
                    widget.itemContainerItemIds = new int[widget.width * widget.height];
                    widget.itemContainerItemAmounts = new int[widget.width * widget.height];
                    widget.aBoolean538 = buffer.readUnsignedByte() == 1;
                    widget.aBoolean585 = buffer.readUnsignedByte() == 1;
                    widget.aBoolean552 = buffer.readUnsignedByte() == 1;
                    widget.aBoolean578 = buffer.readUnsignedByte() == 1;
                    widget.anInt599 = buffer.readUnsignedByte();
                    widget.anInt554 = buffer.readUnsignedByte();
                    widget.anIntArray580 = new int[20];
                    widget.anIntArray560 = new int[20];
                    widget.sprites = new Class13_Sub1_Sub4_Sub4[20];
                    for (int index = 0; index < 20; index++) {
                        int k3 = buffer.readUnsignedByte();
                        if (k3 == 1) {
                            widget.anIntArray580[index] = buffer.readShort();
                            widget.anIntArray560[index] = buffer.readShort();
                            String s1 = buffer.readString();
                            if (class1_1 != null && s1.length() > 0) {
                                int i5 = s1.lastIndexOf(",");
                                widget.sprites[index] = method500(Integer.parseInt(s1.substring(i5 + 1)), false, class1_1, s1.substring(0, i5));
                            }
                        }
                    }
                    widget.aStringArray547 = new String[5];
                    for (int l3 = 0; l3 < 5; l3++) {
                        widget.aStringArray547[l3] = buffer.readString();
                        if (widget.aStringArray547[l3].length() == 0) {
                            widget.aStringArray547[l3] = null;
                        }
                    }
                }
                if (widget.type == 3) {
                    widget.aBoolean555 = buffer.readUnsignedByte() == 1;
                }
                if (widget.type == 4 || widget.type == 1) {
                    widget.aBoolean551 = buffer.readUnsignedByte() == 1;
                    int k2 = buffer.readUnsignedByte();
                    if (aclass13_sub1_sub4_sub2 != null) {
                        widget.aClass13_Sub1_Sub4_Sub2_583 = aclass13_sub1_sub4_sub2[k2];
                    }
                    widget.aBoolean559 = buffer.readUnsignedByte() == 1;
                }
                if (widget.type == 4) {
                    widget.aString548 = buffer.readString();
                    widget.aString589 = buffer.readString();
                }
                if (widget.type == 1 || widget.type == 3 || widget.type == 4) {
                    widget.anInt550 = buffer.readInt();
                }
                if (widget.type == 3 || widget.type == 4) {
                    widget.anInt544 = buffer.readInt();
                    widget.anInt596 = buffer.readInt();
                    widget.anInt566 = buffer.readInt();
                }
                if (widget.type == 5) {
                    String s = buffer.readString();
                    if (class1_1 != null && s.length() > 0) {
                        int i4 = s.lastIndexOf(",");
                        widget.aClass13_Sub1_Sub4_Sub4_569 = method500(Integer.parseInt(s.substring(i4 + 1)), false, class1_1, s.substring(0, i4));
                    }
                    s = buffer.readString();
                    if (class1_1 != null && s.length() > 0) {
                        int j4 = s.lastIndexOf(",");
                        widget.aClass13_Sub1_Sub4_Sub4_565 = method500(Integer.parseInt(s.substring(j4 + 1)), false, class1_1, s.substring(0, j4));
                    }
                }
                if (widget.type == 6) {
                    int l = buffer.readUnsignedByte();
                    if (l != 0) {
                        widget.modelType = 1;
                        widget.anInt542 = (l - 1 << 8) + buffer.readUnsignedByte();
                    }
                    l = buffer.readUnsignedByte();
                    if (l != 0) {
                        widget.anInt587 = 1;
                        widget.anInt588 = (l - 1 << 8) + buffer.readUnsignedByte();
                    }
                    l = buffer.readUnsignedByte();
                    if (l != 0) {
                        widget.anInt571 = (l - 1 << 8) + buffer.readUnsignedByte();
                    } else {
                        widget.anInt571 = -1;
                    }
                    l = buffer.readUnsignedByte();
                    if (l != 0) {
                        widget.anInt572 = (l - 1 << 8) + buffer.readUnsignedByte();
                    } else {
                        widget.anInt572 = -1;
                    }
                    widget.anInt534 = buffer.readUnsignedShort();
                    widget.anInt535 = buffer.readUnsignedShort();
                    widget.anInt536 = buffer.readUnsignedShort();
                }
                if (widget.type == 7) {
                    widget.itemContainerItemIds = new int[widget.width * widget.height];
                    widget.itemContainerItemAmounts = new int[widget.width * widget.height];
                    widget.aBoolean551 = buffer.readUnsignedByte() == 1;
                    int l2 = buffer.readUnsignedByte();
                    if (aclass13_sub1_sub4_sub2 != null) {
                        widget.aClass13_Sub1_Sub4_Sub2_583 = aclass13_sub1_sub4_sub2[l2];
                    }
                    widget.aBoolean559 = buffer.readUnsignedByte() == 1;
                    widget.anInt550 = buffer.readInt();
                    widget.anInt599 = buffer.readShort();
                    widget.anInt554 = buffer.readShort();
                    widget.aBoolean585 = buffer.readUnsignedByte() == 1;
                    widget.aStringArray547 = new String[5];
                    for (int k4 = 0; k4 < 5; k4++) {
                        widget.aStringArray547[k4] = buffer.readString();
                        if (widget.aStringArray547[k4].length() == 0) {
                            widget.aStringArray547[k4] = null;
                        }
                    }
                }
                if (widget.anInt597 == 2 || widget.type == 2) {
                    widget.aString563 = buffer.readString();
                    widget.aString553 = buffer.readString();
                    widget.anInt558 = buffer.readUnsignedShort();
                }
                if (widget.anInt597 == 1 || widget.anInt597 == 4 || widget.anInt597 == 5 || widget.anInt597 == 6) {
                    widget.aString564 = buffer.readString();
                    if (widget.aString564.length() == 0) {
                        if (widget.anInt597 == 1) {
                            widget.aString564 = "Ok";
                        }
                        if (widget.anInt597 == 4) {
                            widget.aString564 = "Select";
                        }
                        if (widget.anInt597 == 5) {
                            widget.aString564 = "Select";
                        }
                        if (widget.anInt597 == 6) {
                            widget.aString564 = "Continue";
                        }
                    }
                }
            }
            aClass3_584 = null;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("68183, " + class1 + ", " + class1_1 + ", " + aclass13_sub1_sub4_sub2 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub1_Sub4 method497(int i, int j) {
        Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = (Class13_Sub1_Sub1_Sub4) aClass3_575.method172((i << 16) + j);
        if (class13_sub1_sub1_sub4 != null) {
            return class13_sub1_sub1_sub4;
        }
        if (i == 1) {
            class13_sub1_sub1_sub4 = Class13_Sub1_Sub1_Sub4.method265((byte) 4, j);
        }
        if (i == 2) {
            class13_sub1_sub1_sub4 = Class47.getDefinition(j).method583(524);
        }
        if (i == 3) {
            class13_sub1_sub1_sub4 = Game.aClass13_Sub1_Sub1_Sub6_Sub1_997.method296(242);
        }
        if (i == 4) {
            class13_sub1_sub1_sub4 = ItemDefinition.method505(j).method513(-453, 50);
        }
        if (i == 5) {
            class13_sub1_sub1_sub4 = null;
        }
        if (class13_sub1_sub1_sub4 != null) {
            aClass3_575.method173(class13_sub1_sub1_sub4, (i << 16) + j, 9388);
        }
        return class13_sub1_sub1_sub4;
    }

    public Class13_Sub1_Sub1_Sub4 method499(int i, int j, boolean flag, boolean flag1) {
        try {
            if (!flag) {
                anInt593 = -416;
            }
            Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4;
            if (flag1) {
                class13_sub1_sub1_sub4 = method497(anInt587, anInt588);
            } else {
                class13_sub1_sub1_sub4 = method497(modelType, anInt542);
            }
            if (class13_sub1_sub1_sub4 == null) {
                return null;
            }
            if (j == -1 && i == -1 && class13_sub1_sub1_sub4.anIntArray1510 == null) {
                return class13_sub1_sub1_sub4;
            }
            Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_1 = new Class13_Sub1_Sub1_Sub4(false, Class8.method189(j, 19953) & Class8.method189(i, 19953), 629, class13_sub1_sub1_sub4, true);
            if (j != -1 || i != -1) {
                class13_sub1_sub1_sub4_1.method272(true);
            }
            if (j != -1) {
                class13_sub1_sub1_sub4_1.method273(j, false);
            }
            if (i != -1) {
                class13_sub1_sub1_sub4_1.method273(i, false);
            }
            class13_sub1_sub1_sub4_1.method282(64, 768, -50, -10, -50, true);
            return class13_sub1_sub1_sub4_1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("85215, " + i + ", " + j + ", " + flag + ", " + flag1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method502(int i, byte byte0, int j) {
        try {
            int k = itemContainerItemIds[i];
            itemContainerItemIds[i] = itemContainerItemIds[j];
            if (byte0 == 0) {
                byte0 = 0;
            } else {
                return;
            }
            itemContainerItemIds[j] = k;
            k = itemContainerItemAmounts[i];
            itemContainerItemAmounts[i] = itemContainerItemAmounts[j];
            itemContainerItemAmounts[j] = k;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("23341, " + i + ", " + byte0 + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

}
