package com.jagex;

import com.jagex.renderable.animation.AnimationFrame;
import com.jagex.cache.CacheArchive;
import com.jagex.cache.configs.NpcConfig;
import com.jagex.cache.configs.ObjectConfig;
import com.jagex.graphics.Font;
import com.jagex.graphics.Model;
import com.jagex.graphics.Sprite;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;
import com.jagex.util.Cache;
import com.jagex.util.StringUtil;

public class Widget {

    public static Widget[] widgets;
    public static int anInt546;
    public static Cache modelCache = new Cache(30);
    public static Cache spriteCache;
    public int anInt534;
    public int anInt535;
    public int anInt536;
    public int anInt537;
    public boolean isItemSwappable;
    public Sprite[] sprites;
    public int anInt540;
    public int modelType;
    public int modelId;
    public int hasHover;
    public int enabledColor;
    public int[] anIntArray545;
    public String[] options;
    public String disabledText;
    public int[] children;
    public int disabledTextColor;
    public boolean isTextCentered;
    public boolean isItemUsable;
    public String aString553;
    public int itemSpritePaddingY;
    public boolean isFilled;
    public int[] anIntArray556;
    public int[] childY;
    public int anInt558;
    public boolean hasDropShadow;
    public int[] spriteY;
    public boolean hiddenUntilHovered;
    public byte alpha;
    public String aString563;
    public String hoverText;
    public Sprite enabledSprite;
    public int enabledHoverColor;
    public int anInt568;
    public Sprite disabledSprite;
    public int type;
    public int anInt571;
    public int anInt572;
    public int parentId;
    public int anInt574;
    public int[] itemContainerItemIds;
    public int contentType;
    public boolean aBoolean578;
    public int[] itemContainerItemAmounts;
    public int[] spriteX;
    public int[][] cs1Opcodes;
    public int width;
    public Font fonts;
    public boolean isInventory;
    public int height;
    public int anInt587;
    public int anInt588;
    public String enabledText;
    public int anInt590;
    public int[] childX;
    public int id;
    public int anInt593;
    public boolean aBoolean594;
    public int anInt595;
    public int disabledHoverColor;
    public int actionType;
    public int scrollLimit;
    public int itemSpritePaddingX;

    public Widget() {
    }

    public static void method498(int i, Model class13_sub1_sub1_sub4, int j, int k) {
        try {
            modelCache.removeAll();
            if (j != 0) {
                return;
            }
            if (class13_sub1_sub1_sub4 != null && i != 4) {
                modelCache.put(class13_sub1_sub1_sub4, (i << 16) + k);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("49636, " + i + ", " + class13_sub1_sub1_sub4 + ", " + j + ", " + k + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public static Sprite readSprite(int i, boolean flag, CacheArchive cacheArchive, String s) {
        try {
            if (flag) {
                anInt546 = -374;
            }
            long l = (StringUtil.encodeBase37(s) << 8) + (long) i;
            Sprite class13_sub1_sub4_sub4 = (Sprite) spriteCache.get(l);
            if (class13_sub1_sub4_sub4 != null) {
                return class13_sub1_sub4_sub4;
            }
            try {
                class13_sub1_sub4_sub4 = new Sprite(cacheArchive, s, i);
                spriteCache.put(class13_sub1_sub4_sub4, l);
            } catch (Exception _ex) {
                return null;
            }
            return class13_sub1_sub4_sub4;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("88345, " + i + ", " + flag + ", " + cacheArchive + ", " + s + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void load(CacheArchive widgetCacheArchive, CacheArchive mediaCacheArchive, Font[] fonts) {
        try {
            spriteCache = new Cache(50000);
            Buffer buffer = new Buffer(widgetCacheArchive.readFile("data", null));
            int parentId = -1;
            int id = buffer.readUShortBE();
            widgets = new Widget[id];
            while (buffer.position < buffer.payload.length) {
                int widgetIndex = buffer.readUShortBE();
                if (widgetIndex == 65535) {
                    parentId = buffer.readUShortBE();
                    widgetIndex = buffer.readUShortBE();
                }
                Widget widget = widgets[widgetIndex] = new Widget();
                widget.id = widgetIndex;
                widget.parentId = parentId;
                widget.type = buffer.readUByte();
                widget.actionType = buffer.readUByte();
                widget.contentType = buffer.readUShortBE();
                widget.width = buffer.readUShortBE();
                widget.height = buffer.readUShortBE();
                widget.alpha = (byte) buffer.readUByte();
                widget.hasHover = buffer.readUByte();
                if (widget.hasHover != 0) {
                    widget.hasHover = (widget.hasHover - 1 << 8) + buffer.readUByte();
                } else {
                    widget.hasHover = -1;
                }
                int i1 = buffer.readUByte();
                if (i1 > 0) {
                    widget.anIntArray545 = new int[i1];
                    widget.anIntArray556 = new int[i1];
                    for (int j1 = 0; j1 < i1; j1++) {
                        widget.anIntArray545[j1] = buffer.readUByte();
                        widget.anIntArray556[j1] = buffer.readUShortBE();
                    }
                }
                int cs1Length = buffer.readUByte();
                if (cs1Length > 0) {
                    widget.cs1Opcodes = new int[cs1Length][];
                    for (int blockIndex = 0; blockIndex < cs1Length; blockIndex++) {
                        int cs1BlockLength = buffer.readUShortBE();
                        widget.cs1Opcodes[blockIndex] = new int[cs1BlockLength];
                        for (int cs1OpcodeIndex = 0; cs1OpcodeIndex < cs1BlockLength; cs1OpcodeIndex++) {
                            widget.cs1Opcodes[blockIndex][cs1OpcodeIndex] = buffer.readUShortBE();
                        }
                    }
                }
                if (widget.type == 0) {
                    widget.scrollLimit = buffer.readUShortBE();
                    widget.hiddenUntilHovered = buffer.readUByte() == 1;
                    int childrenCount = buffer.readUShortBE();
                    widget.children = new int[childrenCount];
                    widget.childX = new int[childrenCount];
                    widget.childY = new int[childrenCount];
                    for (int child = 0; child < childrenCount; child++) {
                        widget.children[child] = buffer.readUShortBE();
                        widget.childX[child] = buffer.readShortBE();
                        widget.childY[child] = buffer.readShortBE();
                    }
                }
                if (widget.type == 1) {
                    widget.anInt574 = buffer.readUShortBE();
                    widget.aBoolean594 = buffer.readUByte() == 1;
                }
                if (widget.type == 2) {
                    widget.itemContainerItemIds = new int[widget.width * widget.height];
                    widget.itemContainerItemAmounts = new int[widget.width * widget.height];

                    widget.isItemSwappable = buffer.readUByte() == 1;
                    widget.isInventory = buffer.readUByte() == 1;
                    widget.isItemUsable = buffer.readUByte() == 1;
                    widget.aBoolean578 = buffer.readUByte() == 1;

                    widget.itemSpritePaddingX = buffer.readUByte();
                    widget.itemSpritePaddingY = buffer.readUByte();

                    widget.spriteX = new int[20];
                    widget.spriteY = new int[20];
                    widget.sprites = new Sprite[20];

                    for (int index = 0; index < 20; index++) {
                        int hasSprite = buffer.readUByte();
                        if (hasSprite == 1) {
                            widget.spriteX[index] = buffer.readShortBE();
                            widget.spriteY[index] = buffer.readShortBE();
                            String spriteName = buffer.readString();
                            if (mediaCacheArchive != null && spriteName.length() > 0) {
                                int spriteId = spriteName.lastIndexOf(",");
                                widget.sprites[index] = readSprite(Integer.parseInt(spriteName.substring(spriteId + 1)), false, mediaCacheArchive, spriteName.substring(0, spriteId));
                            }
                        }
                    }
                    widget.options = new String[5];
                    for (int optionId = 0; optionId < 5; optionId++) {
                        widget.options[optionId] = buffer.readString();
                        if (widget.options[optionId].length() == 0) {
                            widget.options[optionId] = null;
                        }
                    }
                }
                if (widget.type == 3) {
                    widget.isFilled = buffer.readUByte() == 1;
                }
                if (widget.type == 4 || widget.type == 1) {
                    widget.isTextCentered = buffer.readUByte() == 1;
                    int font = buffer.readUByte();
                    if (fonts != null) {
                        widget.fonts = fonts[font];
                    }
                    widget.hasDropShadow = buffer.readUByte() == 1;
                }
                if (widget.type == 4) {
                    widget.disabledText = buffer.readString();
                    widget.enabledText = buffer.readString();
                }
                if (widget.type == 1 || widget.type == 3 || widget.type == 4) {
                    widget.disabledTextColor = buffer.readIntBE();
                }
                if (widget.type == 3 || widget.type == 4) {
                    widget.enabledColor = buffer.readIntBE();
                    widget.disabledHoverColor = buffer.readIntBE();
                    widget.enabledHoverColor = buffer.readIntBE();
                }
                if (widget.type == 5) {
                    String spriteName = buffer.readString();
                    if (mediaCacheArchive != null && spriteName.length() > 0) {
                        int i4 = spriteName.lastIndexOf(",");
                        widget.disabledSprite = readSprite(Integer.parseInt(spriteName.substring(i4 + 1)), false, mediaCacheArchive, spriteName.substring(0, i4));
                    }
                    spriteName = buffer.readString();
                    if (mediaCacheArchive != null && spriteName.length() > 0) {
                        int j4 = spriteName.lastIndexOf(",");
                        widget.enabledSprite = readSprite(Integer.parseInt(spriteName.substring(j4 + 1)), false, mediaCacheArchive, spriteName.substring(0, j4));
                    }
                }
                if (widget.type == 6) {
                    int l = buffer.readUByte();
                    if (l != 0) {
                        widget.modelType = 1;
                        widget.modelId = (l - 1 << 8) + buffer.readUByte();
                    }
                    l = buffer.readUByte();
                    if (l != 0) {
                        widget.anInt587 = 1;
                        widget.anInt588 = (l - 1 << 8) + buffer.readUByte();
                    }
                    l = buffer.readUByte();
                    if (l != 0) {
                        widget.anInt571 = (l - 1 << 8) + buffer.readUByte();
                    } else {
                        widget.anInt571 = -1;
                    }
                    l = buffer.readUByte();
                    if (l != 0) {
                        widget.anInt572 = (l - 1 << 8) + buffer.readUByte();
                    } else {
                        widget.anInt572 = -1;
                    }
                    widget.anInt534 = buffer.readUShortBE();
                    widget.anInt535 = buffer.readUShortBE();
                    widget.anInt536 = buffer.readUShortBE();
                }
                if (widget.type == 7) {
                    widget.itemContainerItemIds = new int[widget.width * widget.height];
                    widget.itemContainerItemAmounts = new int[widget.width * widget.height];
                    widget.isTextCentered = buffer.readUByte() == 1;
                    int l2 = buffer.readUByte();
                    if (fonts != null) {
                        widget.fonts = fonts[l2];
                    }
                    widget.hasDropShadow = buffer.readUByte() == 1;
                    widget.disabledTextColor = buffer.readIntBE();
                    widget.itemSpritePaddingX = buffer.readShortBE();
                    widget.itemSpritePaddingY = buffer.readShortBE();
                    widget.isInventory = buffer.readUByte() == 1;
                    widget.options = new String[5];
                    for (int k4 = 0; k4 < 5; k4++) {
                        widget.options[k4] = buffer.readString();
                        if (widget.options[k4].length() == 0) {
                            widget.options[k4] = null;
                        }
                    }
                }
                if (widget.actionType == 2 || widget.type == 2) {
                    widget.aString563 = buffer.readString();
                    widget.aString553 = buffer.readString();
                    widget.anInt558 = buffer.readUShortBE();
                }
                if (widget.actionType == 1 || widget.actionType == 4 || widget.actionType == 5 || widget.actionType == 6) {
                    widget.hoverText = buffer.readString();
                    if (widget.hoverText.length() == 0) {
                        if (widget.actionType == 1) {
                            widget.hoverText = "Ok";
                        }
                        if (widget.actionType == 4) {
                            widget.hoverText = "Select";
                        }
                        if (widget.actionType == 5) {
                            widget.hoverText = "Select";
                        }
                        if (widget.actionType == 6) {
                            widget.hoverText = "Continue";
                        }
                    }
                }
            }
            spriteCache = null;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("68183, " + widgetCacheArchive + ", " + mediaCacheArchive + ", " + fonts + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method497(int i, int j) {
        Model class13_sub1_sub1_sub4 = (Model) modelCache.get((i << 16) + j);
        if (class13_sub1_sub1_sub4 != null) {
            return class13_sub1_sub1_sub4;
        }
        if (i == 1) {
            class13_sub1_sub1_sub4 = Model.method265((byte) 4, j);
        }
        if (i == 2) {
            class13_sub1_sub1_sub4 = NpcConfig.getDefinition(j).getHeadModel(524);
        }
        if (i == 3) {
            class13_sub1_sub1_sub4 = Game.localPlayer.getHeadModel();
        }
        if (i == 4) {
            class13_sub1_sub1_sub4 = ObjectConfig.lookup(j).method513(-453, 50);
        }
        if (i == 5) {
            class13_sub1_sub1_sub4 = null;
        }
        if (class13_sub1_sub1_sub4 != null) {
            modelCache.put(class13_sub1_sub1_sub4, (i << 16) + j);
        }
        return class13_sub1_sub1_sub4;
    }

    public Model method499(int i, int j, boolean flag, boolean flag1) {
        try {
            if (!flag) {
                anInt593 = -416;
            }
            Model class13_sub1_sub1_sub4;
            if (flag1) {
                class13_sub1_sub1_sub4 = method497(anInt587, anInt588);
            } else {
                class13_sub1_sub1_sub4 = method497(modelType, modelId);
            }
            if (class13_sub1_sub1_sub4 == null) {
                return null;
            }
            if (j == -1 && i == -1 && class13_sub1_sub1_sub4.anIntArray1510 == null) {
                return class13_sub1_sub1_sub4;
            }
            Model class13_sub1_sub1_sub4_1 = new Model(false, AnimationFrame.method189(j, 19953) & AnimationFrame.method189(i, 19953), 629, class13_sub1_sub1_sub4, true);
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
