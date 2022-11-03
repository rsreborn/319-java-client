package com.jagex.renderable;

import com.jagex.Game;
import com.jagex.renderable.animation.AnimationFrame;
import com.jagex.cache.configs.*;
import com.jagex.graphics.Model;
import com.jagex.io.Buffer;
import com.jagex.util.Cache;
import com.jagex.util.StringUtil;

public class Player extends Entity {

    public static Cache modelCache = new Cache(260);
    public int bodyType;
    public boolean aBoolean1688;
    public String username;
    public byte aByte1690;
    public int anInt1691;
    public int anInt1692;
    public int anInt1693;
    public int anInt1694;
    public int skillLevel;
    public int combatLevel;
    public int anInt1698;
    public int anInt1699;
    public int[] appearanceColors;
    public boolean visible;
    public int teamIndex;
    public int[] appearanceData;
    public boolean aBoolean1704;
    public byte aByte1705;
    public int anInt1706;
    public int anInt1707;
    public byte aByte1708;
    public long appearanceHash;
    public long aLong1710;
    public int anInt1711;
    public int anInt1712;
    public int anInt1713;
    public Model model;
    public int headIcon;
    public NpcConfig npcTransformation;

    public Player() {
        aBoolean1688 = false;
        aByte1690 = -78;
        anInt1698 = -2372;
        appearanceColors = new int[5];
        visible = false;
        appearanceData = new int[12];
        aBoolean1704 = true;
        aByte1705 = -26;
        aByte1708 = 42;
        aLong1710 = -1L;
    }

    public boolean isVisible() {
        return visible;
    }

    public Model getAnimatedModel() {
        if (npcTransformation != null) {
            int frame = -1;
            if (super.emoteAnimation >= 0 && super.animationDelay == 0) {
                frame = SequenceConfig.sequences[super.emoteAnimation].anIntArray802[super.anInt1598];
            } else if (super.anInt1620 >= 0) {
                frame = SequenceConfig.sequences[super.anInt1620].anIntArray802[super.anInt1621];
            }
            Model npcTransformationModel = npcTransformation.method582(-1, frame, true, null);
            return npcTransformationModel;
        }

        long l = appearanceHash;
        int k = -1;
        int i1 = -1;
        int j1 = -1;
        int k1 = -1;
        if (super.emoteAnimation >= 0 && super.animationDelay == 0) {
            SequenceConfig sequenceConfig = SequenceConfig.sequences[super.emoteAnimation];
            k = sequenceConfig.anIntArray802[super.anInt1598];
            if (super.anInt1620 >= 0 && super.anInt1620 != super.idleAnimation) {
                i1 = SequenceConfig.sequences[super.anInt1620].anIntArray802[super.anInt1621];
            }
            if (sequenceConfig.anInt809 >= 0) {
                j1 = sequenceConfig.anInt809;
                l += j1 - appearanceData[5] << 40;
            }
            if (sequenceConfig.anInt810 >= 0) {
                k1 = sequenceConfig.anInt810;
                l += k1 - appearanceData[3] << 48;
            }
        } else if (super.anInt1620 >= 0) {
            k = SequenceConfig.sequences[super.anInt1620].anIntArray802[super.anInt1621];
        }
        Model class13_sub1_sub1_sub4_1 = (Model) modelCache.get(l);
        if (class13_sub1_sub1_sub4_1 == null) {
            boolean flag = false;
            for (int l1 = 0; l1 < 12; l1++) {
                int j2 = appearanceData[l1];
                if (k1 >= 0 && l1 == 3) {
                    j2 = k1;
                }
                if (j1 >= 0 && l1 == 5) {
                    j2 = j1;
                }
                if (j2 >= 256 && j2 < 512 && !IdentikitConfig.aIdentikitConfigArray65[j2 - 256].method177(true)) {
                    flag = true;
                }
                if (j2 >= 512 && !ObjectConfig.lookup(j2 - 512).method504((byte) 9, bodyType)) {
                    flag = true;
                }
            }
            if (flag) {
                if (aLong1710 != -1L) {
                    class13_sub1_sub1_sub4_1 = (Model) modelCache.get(aLong1710);
                }
                if (class13_sub1_sub1_sub4_1 == null) {
                    return null;
                }
            }
        }
        if (class13_sub1_sub1_sub4_1 == null) {
            Model[] aclass13_sub1_sub1_sub4 = new Model[12];
            int i2 = 0;
            for (int k2 = 0; k2 < 12; k2++) {
                int l2 = appearanceData[k2];
                if (k1 >= 0 && k2 == 3) {
                    l2 = k1;
                }
                if (j1 >= 0 && k2 == 5) {
                    l2 = j1;
                }
                if (l2 >= 256 && l2 < 512) {
                    Model class13_sub1_sub1_sub4_3 = IdentikitConfig.aIdentikitConfigArray65[l2 - 256].method178(0);
                    if (class13_sub1_sub1_sub4_3 != null) {
                        aclass13_sub1_sub1_sub4[i2++] = class13_sub1_sub1_sub4_3;
                    }
                }
                if (l2 >= 512) {
                    Model class13_sub1_sub1_sub4_4 = ObjectConfig.lookup(l2 - 512).method507(4, bodyType);
                    if (class13_sub1_sub1_sub4_4 != null) {
                        aclass13_sub1_sub1_sub4[i2++] = class13_sub1_sub1_sub4_4;
                    }
                }
            }
            class13_sub1_sub1_sub4_1 = new Model(i2, (byte) 61, aclass13_sub1_sub1_sub4);
            for (int i3 = 0; i3 < 5; i3++) {
                if (appearanceColors[i3] != 0) {
                    class13_sub1_sub1_sub4_1.method279(Game.playerAppearanceColors[i3][0], Game.playerAppearanceColors[i3][appearanceColors[i3]]);
                    if (i3 == 1) {
                        class13_sub1_sub1_sub4_1.method279(Game.anIntArray913[0], Game.anIntArray913[appearanceColors[i3]]);
                    }
                }
            }
            class13_sub1_sub1_sub4_1.method272(true);
            class13_sub1_sub1_sub4_1.method282(64, 850, -30, -50, -30, true);
            modelCache.put(class13_sub1_sub1_sub4_1, l);
            aLong1710 = l;
        }
        if (aBoolean1688) {
            return class13_sub1_sub1_sub4_1;
        }
        Model class13_sub1_sub1_sub4_2 = Model.aClass13_Sub1_Sub1_Sub4_1491;
        class13_sub1_sub1_sub4_2.method267(AnimationFrame.method189(k, 19953) & AnimationFrame.method189(i1, 19953), aByte1705, class13_sub1_sub1_sub4_1);
        if (k != -1 && i1 != -1) {
            class13_sub1_sub1_sub4_2.method274(aByte1708, SequenceConfig.sequences[super.emoteAnimation].anIntArray806, i1, k);
        } else if (k != -1) {
            class13_sub1_sub1_sub4_2.method273(k, false);
        }
        class13_sub1_sub1_sub4_2.method269(0);
        class13_sub1_sub1_sub4_2.anIntArrayArray1528 = null;
        class13_sub1_sub1_sub4_2.anIntArrayArray1527 = null;
        return class13_sub1_sub1_sub4_2;
    }

    public Model getHeadModel() {
        if (!visible) {
            return null;
        }
        if (npcTransformation != null) {
            return npcTransformation.getHeadModel(524);
        }
        boolean flag = false;
        for (int j = 0; j < 12; j++) {
            int k = appearanceData[j];
            if (k >= 256 && k < 512 && !IdentikitConfig.aIdentikitConfigArray65[k - 256].method179(-1743)) {
                flag = true;
            }
            if (k >= 512 && !ObjectConfig.lookup(k - 512).method506(5, bodyType)) {
                flag = true;
            }
        }
        if (flag) {
            return null;
        }
        Model[] aclass13_sub1_sub1_sub4 = new Model[12];
        int l = 0;
        for (int i1 = 0; i1 < 12; i1++) {
            int j1 = appearanceData[i1];
            if (j1 >= 256 && j1 < 512) {
                Model class13_sub1_sub1_sub4_1 = IdentikitConfig.aIdentikitConfigArray65[j1 - 256].method180(aByte1690);
                if (class13_sub1_sub1_sub4_1 != null) {
                    aclass13_sub1_sub1_sub4[l++] = class13_sub1_sub1_sub4_1;
                }
            }
            if (j1 >= 512) {
                Model class13_sub1_sub1_sub4_2 = ObjectConfig.lookup(j1 - 512).method512(bodyType, (byte) -34);
                if (class13_sub1_sub1_sub4_2 != null) {
                    aclass13_sub1_sub1_sub4[l++] = class13_sub1_sub1_sub4_2;
                }
            }
        }
        Model class13_sub1_sub1_sub4 = new Model(l, (byte) 61, aclass13_sub1_sub1_sub4);
        for (int k1 = 0; k1 < 5; k1++) {
            if (appearanceColors[k1] != 0) {
                class13_sub1_sub1_sub4.method279(Game.playerAppearanceColors[k1][0], Game.playerAppearanceColors[k1][appearanceColors[k1]]);
                if (k1 == 1) {
                    class13_sub1_sub1_sub4.method279(Game.anIntArray913[0], Game.anIntArray913[appearanceColors[k1]]);
                }
            }
        }
        return class13_sub1_sub1_sub4;
    }

    public Model getRotatedModel() {
        if (!visible) {
            return null;
        }
        Model class13_sub1_sub1_sub4 = getAnimatedModel();
        if (class13_sub1_sub1_sub4 == null) {
            return null;
        }
        super.anInt1590 = class13_sub1_sub1_sub4.anInt1377;
        class13_sub1_sub1_sub4.aBoolean1529 = true;
        if (aBoolean1688) {
            return class13_sub1_sub1_sub4;
        }
        if (super.graphic != -1 && super.anInt1593 != -1) {
            SpotAnimationConfig spotAnimationConfig = SpotAnimationConfig.aSpotAnimationConfigArray685[super.graphic];
            Model class13_sub1_sub1_sub4_2 = spotAnimationConfig.method530();
            if (class13_sub1_sub1_sub4_2 != null) {
                Model class13_sub1_sub1_sub4_3 = new Model(false, AnimationFrame.method189(super.anInt1593, 19953), 629, class13_sub1_sub1_sub4_2, true);
                class13_sub1_sub1_sub4_3.method278(0, -991, -super.graphicHeight, 0);
                class13_sub1_sub1_sub4_3.method272(true);
                class13_sub1_sub1_sub4_3.method273(spotAnimationConfig.aSequenceConfig_689.anIntArray802[super.anInt1593], false);
                class13_sub1_sub1_sub4_3.anIntArrayArray1528 = null;
                class13_sub1_sub1_sub4_3.anIntArrayArray1527 = null;
                if (spotAnimationConfig.anInt692 != 128 || spotAnimationConfig.anInt693 != 128) {
                    class13_sub1_sub1_sub4_3.method281(spotAnimationConfig.anInt692, spotAnimationConfig.anInt692, spotAnimationConfig.anInt693, (byte) 0);
                }
                class13_sub1_sub1_sub4_3.method282(64 + spotAnimationConfig.anInt695, 850 + spotAnimationConfig.anInt696, -30, -50, -30, true);
                Model[] aclass13_sub1_sub1_sub4_1 = {
                        class13_sub1_sub1_sub4, class13_sub1_sub1_sub4_3
                };
                class13_sub1_sub1_sub4 = new Model(aclass13_sub1_sub1_sub4_1, 0, true, 2);
            }
        }
        if (model != null) {
            if (Game.pulseCycle >= anInt1707) {
                model = null;
            }
            if (Game.pulseCycle >= anInt1706 && Game.pulseCycle < anInt1707) {
                Model class13_sub1_sub1_sub4_1 = model;
                class13_sub1_sub1_sub4_1.method278(anInt1713 - super.anInt1588, -991, anInt1712 - anInt1699, anInt1711 - super.anInt1587);
                if (super.anInt1609 == 512) {
                    class13_sub1_sub1_sub4_1.method276(-32823);
                    class13_sub1_sub1_sub4_1.method276(-32823);
                    class13_sub1_sub1_sub4_1.method276(-32823);
                } else if (super.anInt1609 == 1024) {
                    class13_sub1_sub1_sub4_1.method276(-32823);
                    class13_sub1_sub1_sub4_1.method276(-32823);
                } else if (super.anInt1609 == 1536) {
                    class13_sub1_sub1_sub4_1.method276(-32823);
                }
                Model[] aclass13_sub1_sub1_sub4 = {
                        class13_sub1_sub1_sub4, class13_sub1_sub1_sub4_1
                };
                class13_sub1_sub1_sub4 = new Model(aclass13_sub1_sub1_sub4, 0, true, 2);
                if (super.anInt1609 == 512) {
                    class13_sub1_sub1_sub4_1.method276(-32823);
                } else if (super.anInt1609 == 1024) {
                    class13_sub1_sub1_sub4_1.method276(-32823);
                    class13_sub1_sub1_sub4_1.method276(-32823);
                } else if (super.anInt1609 == 1536) {
                    class13_sub1_sub1_sub4_1.method276(-32823);
                    class13_sub1_sub1_sub4_1.method276(-32823);
                    class13_sub1_sub1_sub4_1.method276(-32823);
                }
                class13_sub1_sub1_sub4_1.method278(super.anInt1588 - anInt1713, -991, anInt1699 - anInt1712, super.anInt1587 - anInt1711);
            }
        }
        class13_sub1_sub1_sub4.aBoolean1529 = true;
        return class13_sub1_sub1_sub4;
    }

    public void syncAppearance(Buffer buffer) {
        buffer.position = 0;
        bodyType = buffer.readUByte();
        headIcon = buffer.readUByte();
        npcTransformation = null;
        teamIndex = 0;

        for (int i = 0; i < 12; i++) {
            int upperByte = buffer.readUByte();
            if (upperByte == 0) {
                appearanceData[i] = 0;
                continue;
            }

            int lowerByte = buffer.readUByte();
            appearanceData[i] = (upperByte << 8) + lowerByte;

            if (i == 0 && appearanceData[0] == 65535) {
                npcTransformation = NpcConfig.getDefinition(buffer.readUShortBE());
                break;
            }

            if (appearanceData[i] >= 512 && appearanceData[i] - 512 < ObjectConfig.anInt669) {
                int itemTeamIndex = ObjectConfig.lookup(appearanceData[i] - 512).teamIndex;
                if (itemTeamIndex != 0) {
                    teamIndex = itemTeamIndex;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            int color = buffer.readUByte();
            if (color < 0 || color >= Game.playerAppearanceColors[i].length) {
                color = 0;
            }

            appearanceColors[i] = color;
        }

        super.idleAnimation = buffer.readUShortBE();
        if (super.idleAnimation == 65535) {
            super.idleAnimation = -1;
        }

        super.standTurnAnimation = buffer.readUShortBE();
        if (super.standTurnAnimation == 65535) {
            super.standTurnAnimation = -1;
        }

        super.walkingAnimation = buffer.readUShortBE();
        if (super.walkingAnimation == 65535) {
            super.walkingAnimation = -1;
        }

        super.turnAroundAnimation = buffer.readUShortBE();
        if (super.turnAroundAnimation == 65535) {
            super.turnAroundAnimation = -1;
        }

        super.turnRightAnimation = buffer.readUShortBE();
        if (super.turnRightAnimation == 65535) {
            super.turnRightAnimation = -1;
        }

        super.turnLeftAnimation = buffer.readUShortBE();
        if (super.turnLeftAnimation == 65535) {
            super.turnLeftAnimation = -1;
        }

        super.runAnimation = buffer.readUShortBE();
        if (super.runAnimation == 65535) {
            super.runAnimation = -1;
        }

        username = StringUtil.format(StringUtil.decodeBase37Username(buffer.readLongBE()));
        combatLevel = buffer.readUByte();
        skillLevel = buffer.readUShortBE();
        visible = true;
        appearanceHash = 0L;

        for (int i = 0; i < 12; i++) {
            appearanceHash <<= 4;
            if (appearanceData[i] >= 256) {
                appearanceHash += appearanceData[i] - 256;
            }
        }

        if (appearanceData[0] >= 256) {
            appearanceHash += appearanceData[0] - 256 >> 4;
        }

        if (appearanceData[1] >= 256) {
            appearanceHash += appearanceData[1] - 256 >> 8;
        }

        for (int i = 0; i < 5; i++) {
            appearanceHash <<= 3;
            appearanceHash += appearanceColors[i];
        }

        appearanceHash <<= 1;
        appearanceHash += bodyType;
    }

}
