package com.jagex;

import com.jagex.renderable.animation.AnimationFrame;
import com.jagex.cache.CacheArchive;
import com.jagex.cache.configs.NpcConfig;
import com.jagex.cache.configs.ObjectConfig;
import com.jagex.graphics.Font;
import com.jagex.graphics.Model;
import com.jagex.graphics.Sprite;
import com.jagex.io.Buffer;
import com.jagex.util.Cache;
import com.jagex.util.StringUtil;

public class Widget {

    public static Widget[] widgets;
    public static Cache modelCache = new Cache(30);
    public static Cache spriteCache;

    public int modelZoom;
    public int modelRotationX;
    public int modelRotationY;
    public int anInt537;
    public boolean isItemSwappable;
    public Sprite[] sprites;
    public int anInt540;
    public int modelType;
    public int modelId;
    public int hasHover;
    public int enabledColor;
    public int[] conditionTypes;
    public String[] options;
    public String disabledText;
    public int[] children;
    public int disabledTextColor;
    public boolean isTextCentered;
    public boolean isItemUsable;
    public String aString553;
    public int itemSpritePaddingY;
    public boolean isFilled;
    public int[] conditionValues;
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
    public int animationId;
    public int animationIdActive;
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
    public int modelTypeActive;
    public int modelIdActive;
    public String enabledText;
    public int anInt590;
    public int[] childX;
    public int id;
    public boolean aBoolean594;
    public int anInt595;
    public int disabledHoverColor;
    public int actionType;
    public int scrollLimit;
    public int itemSpritePaddingX;

    public Widget() {
    }

    public static void method498(int i, Model class13_sub1_sub1_sub4, int j, int k) {
        modelCache.removeAll();
        if (j != 0) {
            return;
        }
        if (class13_sub1_sub1_sub4 != null && i != 4) {
            modelCache.put(class13_sub1_sub1_sub4, (i << 16) + k);
        }
    }

    public static Sprite readSprite(CacheArchive cacheArchive, String spriteName, int spriteId) {
        long spriteHash = (StringUtil.encodeBase37(spriteName) << 8) + (long) spriteId;
        Sprite sprite = (Sprite) spriteCache.get(spriteHash);
        if (sprite != null) {
            return sprite;
        }
        try {
            sprite = new Sprite(cacheArchive, spriteName, spriteId);
            spriteCache.put(sprite, spriteHash);
        } catch (Exception _ex) {
            return null;
        }
        return sprite;
    }

    public static void load(CacheArchive widgetCacheArchive, CacheArchive mediaCacheArchive, Font[] fonts) {
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
                widget.conditionTypes = new int[i1];
                widget.conditionValues = new int[i1];
                for (int conditionCount = 0; conditionCount < i1; conditionCount++) {
                    widget.conditionTypes[conditionCount] = buffer.readUByte();
                    widget.conditionValues[conditionCount] = buffer.readUShortBE();
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
                            widget.sprites[index] = readSprite(mediaCacheArchive, spriteName.substring(0, spriteId), Integer.parseInt(spriteName.substring(spriteId + 1)));
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
                    widget.disabledSprite = readSprite(mediaCacheArchive, spriteName.substring(0, i4), Integer.parseInt(spriteName.substring(i4 + 1)));
                }
                spriteName = buffer.readString();
                if (mediaCacheArchive != null && spriteName.length() > 0) {
                    int j4 = spriteName.lastIndexOf(",");
                    widget.enabledSprite = readSprite(mediaCacheArchive, spriteName.substring(0, j4), Integer.parseInt(spriteName.substring(j4 + 1)));
                }
            }
            if (widget.type == 6) {
                int widgetId = buffer.readUByte();
                if (widgetId != 0) {
                    widget.modelType = 1;
                    widget.modelId = (widgetId - 1 << 8) + buffer.readUByte();
                }
                widgetId = buffer.readUByte();
                if (widgetId != 0) {
                    widget.modelTypeActive = 1;
                    widget.modelIdActive = (widgetId - 1 << 8) + buffer.readUByte();
                }
                widgetId = buffer.readUByte();
                if (widgetId != 0) {
                    widget.animationId = (widgetId - 1 << 8) + buffer.readUByte();
                } else {
                    widget.animationId = -1;
                }
                widgetId = buffer.readUByte();
                if (widgetId != 0) {
                    widget.animationIdActive = (widgetId - 1 << 8) + buffer.readUByte();
                } else {
                    widget.animationIdActive = -1;
                }
                widget.modelZoom = buffer.readUShortBE();
                widget.modelRotationX = buffer.readUShortBE();
                widget.modelRotationY = buffer.readUShortBE();
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
    }

    public Model getModel(int modelType, int modelId) {
        Model model = (Model) modelCache.get(((long) modelType << 16) + modelId);
        if (model != null) {
            return model;
        }
        if (modelType == 1) {
            model = Model.getModel(modelId);
        }
        if (modelType == 2) {
            model = NpcConfig.getDefinition(modelId).getHeadModel();
        }
        if (modelType == 3) {
            model = Game.localPlayer.getHeadModel();
        }
        if (modelType == 4) {
            model = ObjectConfig.lookup(modelId).method513(50);
        }
        if (modelType == 5) {
            model = null;
        }
        if (model != null) {
            modelCache.put(model, (modelType << 16) + modelId);
        }
        return model;
    }

    public Model getAnimatedModel(int i, int j, boolean flag1) {
        Model model;
        if (flag1) {
            model = getModel(modelTypeActive, modelIdActive);
        } else {
            model = getModel(modelType, modelId);
        }
        if (model == null) {
            return null;
        }
        if (j == -1 && i == -1 && model.anIntArray1510 == null) {
            return model;
        }
        Model animatedModel = new Model(false, AnimationFrame.method189(j, 19953) & AnimationFrame.method189(i, 19953), 629, model, true);
        if (j != -1 || i != -1) {
            animatedModel.method272();
        }
        if (j != -1) {
            animatedModel.method273(j);
        }
        if (i != -1) {
            animatedModel.method273(i);
        }
        animatedModel.method282(64, 768, -50, -10, -50, true);
        return animatedModel;
    }

    public void swapItems(int originalSlot, int newSlot) {
        int originalItem = itemContainerItemIds[originalSlot];
        itemContainerItemIds[originalSlot] = itemContainerItemIds[newSlot];
        itemContainerItemIds[newSlot] = originalItem;
        originalItem = itemContainerItemAmounts[originalSlot];
        itemContainerItemAmounts[originalSlot] = itemContainerItemAmounts[newSlot];
        itemContainerItemAmounts[newSlot] = originalItem;
    }
}
