package com.jagex;

import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;
import com.jagex.util.Cache;

public class CacheableNode_Sub1_Sub1_Sub6_ extends CacheableNode_Sub1_Sub1_Sub6 {

    public static Cache aCache_1696 = new Cache(260);
    public int anInt1687;
    public boolean aBoolean1688;
    public String aString1689;
    public byte aByte1690;
    public int anInt1691;
    public int anInt1692;
    public int anInt1693;
    public int anInt1694;
    public int anInt1695;
    public int anInt1697;
    public int anInt1698;
    public int anInt1699;
    public int[] anIntArray1700;
    public boolean aBoolean1701;
    public int anInt1702;
    public int[] anIntArray1703;
    public boolean aBoolean1704;
    public byte aByte1705;
    public int anInt1706;
    public int anInt1707;
    public byte aByte1708;
    public long aLong1709;
    public long aLong1710;
    public int anInt1711;
    public int anInt1712;
    public int anInt1713;
    public CacheableNode_Sub1_Sub1_Sub4 aClass13_Sub1_Sub1_Sub4_1714;
    public int anInt1715;
    public Class47 aClass47_1716;

    public CacheableNode_Sub1_Sub1_Sub6_() {
        aBoolean1688 = false;
        aByte1690 = -78;
        anInt1698 = -2372;
        anIntArray1700 = new int[5];
        aBoolean1701 = false;
        anIntArray1703 = new int[12];
        aBoolean1704 = true;
        aByte1705 = -26;
        aByte1708 = 42;
        aLong1710 = -1L;
    }

    public boolean method291(boolean flag) {
        try {
            if (!flag) {
                throw new NullPointerException();
            }
            return aBoolean1701;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("70043, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public CacheableNode_Sub1_Sub1_Sub4 method295(int i) {
        try {
            if (i != -37578) {
                aBoolean1704 = !aBoolean1704;
            }
            if (aClass47_1716 != null) {
                int j = -1;
                if (super.anInt1597 >= 0 && super.anInt1600 == 0) {
                    j = Class50.aClass50Array800[super.anInt1597].anIntArray802[super.anInt1598];
                } else if (super.anInt1620 >= 0) {
                    j = Class50.aClass50Array800[super.anInt1620].anIntArray802[super.anInt1621];
                }
                CacheableNode_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = aClass47_1716.method582(-1, j, true, null);
                return class13_sub1_sub1_sub4;
            }
            long l = aLong1709;
            int k = -1;
            int i1 = -1;
            int j1 = -1;
            int k1 = -1;
            if (super.anInt1597 >= 0 && super.anInt1600 == 0) {
                Class50 class50 = Class50.aClass50Array800[super.anInt1597];
                k = class50.anIntArray802[super.anInt1598];
                if (super.anInt1620 >= 0 && super.anInt1620 != super.anInt1584) {
                    i1 = Class50.aClass50Array800[super.anInt1620].anIntArray802[super.anInt1621];
                }
                if (class50.anInt809 >= 0) {
                    j1 = class50.anInt809;
                    l += j1 - anIntArray1703[5] << 40;
                }
                if (class50.anInt810 >= 0) {
                    k1 = class50.anInt810;
                    l += k1 - anIntArray1703[3] << 48;
                }
            } else if (super.anInt1620 >= 0) {
                k = Class50.aClass50Array800[super.anInt1620].anIntArray802[super.anInt1621];
            }
            CacheableNode_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_1 = (CacheableNode_Sub1_Sub1_Sub4) aCache_1696.get(l);
            if (class13_sub1_sub1_sub4_1 == null) {
                boolean flag = false;
                for (int l1 = 0; l1 < 12; l1++) {
                    int j2 = anIntArray1703[l1];
                    if (k1 >= 0 && l1 == 3) {
                        j2 = k1;
                    }
                    if (j1 >= 0 && l1 == 5) {
                        j2 = j1;
                    }
                    if (j2 >= 256 && j2 < 512 && !Class4.aClass4Array65[j2 - 256].method177(true)) {
                        flag = true;
                    }
                    if (j2 >= 512 && !ItemDefinition.method505(j2 - 512).method504((byte) 9, anInt1687)) {
                        flag = true;
                    }
                }
                if (flag) {
                    if (aLong1710 != -1L) {
                        class13_sub1_sub1_sub4_1 = (CacheableNode_Sub1_Sub1_Sub4) aCache_1696.get(aLong1710);
                    }
                    if (class13_sub1_sub1_sub4_1 == null) {
                        return null;
                    }
                }
            }
            if (class13_sub1_sub1_sub4_1 == null) {
                CacheableNode_Sub1_Sub1_Sub4[] aclass13_sub1_sub1_sub4 = new CacheableNode_Sub1_Sub1_Sub4[12];
                int i2 = 0;
                for (int k2 = 0; k2 < 12; k2++) {
                    int l2 = anIntArray1703[k2];
                    if (k1 >= 0 && k2 == 3) {
                        l2 = k1;
                    }
                    if (j1 >= 0 && k2 == 5) {
                        l2 = j1;
                    }
                    if (l2 >= 256 && l2 < 512) {
                        CacheableNode_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_3 = Class4.aClass4Array65[l2 - 256].method178(0);
                        if (class13_sub1_sub1_sub4_3 != null) {
                            aclass13_sub1_sub1_sub4[i2++] = class13_sub1_sub1_sub4_3;
                        }
                    }
                    if (l2 >= 512) {
                        CacheableNode_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_4 = ItemDefinition.method505(l2 - 512).method507(4, anInt1687);
                        if (class13_sub1_sub1_sub4_4 != null) {
                            aclass13_sub1_sub1_sub4[i2++] = class13_sub1_sub1_sub4_4;
                        }
                    }
                }
                class13_sub1_sub1_sub4_1 = new CacheableNode_Sub1_Sub1_Sub4(i2, (byte) 61, aclass13_sub1_sub1_sub4);
                for (int i3 = 0; i3 < 5; i3++) {
                    if (anIntArray1700[i3] != 0) {
                        class13_sub1_sub1_sub4_1.method279(Game.anIntArrayArray829[i3][0], Game.anIntArrayArray829[i3][anIntArray1700[i3]]);
                        if (i3 == 1) {
                            class13_sub1_sub1_sub4_1.method279(Game.anIntArray913[0], Game.anIntArray913[anIntArray1700[i3]]);
                        }
                    }
                }
                class13_sub1_sub1_sub4_1.method272(true);
                class13_sub1_sub1_sub4_1.method282(64, 850, -30, -50, -30, true);
                aCache_1696.put(class13_sub1_sub1_sub4_1, l);
                aLong1710 = l;
            }
            if (aBoolean1688) {
                return class13_sub1_sub1_sub4_1;
            }
            CacheableNode_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_2 = CacheableNode_Sub1_Sub1_Sub4.aClass13_Sub1_Sub1_Sub4_1491;
            class13_sub1_sub1_sub4_2.method267(Class8.method189(k, 19953) & Class8.method189(i1, 19953), aByte1705, class13_sub1_sub1_sub4_1);
            if (k != -1 && i1 != -1) {
                class13_sub1_sub1_sub4_2.method274(aByte1708, Class50.aClass50Array800[super.anInt1597].anIntArray806, i1, k);
            } else if (k != -1) {
                class13_sub1_sub1_sub4_2.method273(k, false);
            }
            class13_sub1_sub1_sub4_2.method269(0);
            class13_sub1_sub1_sub4_2.anIntArrayArray1528 = null;
            class13_sub1_sub1_sub4_2.anIntArrayArray1527 = null;
            return class13_sub1_sub1_sub4_2;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("70765, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public CacheableNode_Sub1_Sub1_Sub4 method296(int i) {
        try {
            if (!aBoolean1701) {
                return null;
            }
            if (aClass47_1716 != null) {
                return aClass47_1716.method583(524);
            }
            boolean flag = false;
            for (int j = 0; j < 12; j++) {
                int k = anIntArray1703[j];
                if (k >= 256 && k < 512 && !Class4.aClass4Array65[k - 256].method179(-1743)) {
                    flag = true;
                }
                if (k >= 512 && !ItemDefinition.method505(k - 512).method506(5, anInt1687)) {
                    flag = true;
                }
            }
            if (flag) {
                return null;
            }
            CacheableNode_Sub1_Sub1_Sub4[] aclass13_sub1_sub1_sub4 = new CacheableNode_Sub1_Sub1_Sub4[12];
            int l = 0;
            for (int i1 = 0; i1 < 12; i1++) {
                int j1 = anIntArray1703[i1];
                if (j1 >= 256 && j1 < 512) {
                    CacheableNode_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_1 = Class4.aClass4Array65[j1 - 256].method180(aByte1690);
                    if (class13_sub1_sub1_sub4_1 != null) {
                        aclass13_sub1_sub1_sub4[l++] = class13_sub1_sub1_sub4_1;
                    }
                }
                if (j1 >= 512) {
                    CacheableNode_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_2 = ItemDefinition.method505(j1 - 512).method512(anInt1687, (byte) -34);
                    if (class13_sub1_sub1_sub4_2 != null) {
                        aclass13_sub1_sub1_sub4[l++] = class13_sub1_sub1_sub4_2;
                    }
                }
            }
            i = 64 / i;
            CacheableNode_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = new CacheableNode_Sub1_Sub1_Sub4(l, (byte) 61, aclass13_sub1_sub1_sub4);
            for (int k1 = 0; k1 < 5; k1++) {
                if (anIntArray1700[k1] != 0) {
                    class13_sub1_sub1_sub4.method279(Game.anIntArrayArray829[k1][0], Game.anIntArrayArray829[k1][anIntArray1700[k1]]);
                    if (k1 == 1) {
                        class13_sub1_sub1_sub4.method279(Game.anIntArray913[0], Game.anIntArray913[anIntArray1700[k1]]);
                    }
                }
            }
            return class13_sub1_sub1_sub4;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("66077, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public CacheableNode_Sub1_Sub1_Sub4 method256(int i) {
        try {
            if (!aBoolean1701) {
                return null;
            }
            CacheableNode_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = method295(-37578);
            if (class13_sub1_sub1_sub4 == null) {
                return null;
            }
            super.anInt1590 = class13_sub1_sub1_sub4.anInt1377;
            class13_sub1_sub1_sub4.aBoolean1529 = true;
            if (aBoolean1688) {
                return class13_sub1_sub1_sub4;
            }
            if (super.anInt1592 != -1 && super.anInt1593 != -1) {
                Class40 class40 = Class40.aClass40Array685[super.anInt1592];
                CacheableNode_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_2 = class40.method530();
                if (class13_sub1_sub1_sub4_2 != null) {
                    CacheableNode_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_3 = new CacheableNode_Sub1_Sub1_Sub4(false, Class8.method189(super.anInt1593, 19953), 629, class13_sub1_sub1_sub4_2, true);
                    class13_sub1_sub1_sub4_3.method278(0, -991, -super.anInt1596, 0);
                    class13_sub1_sub1_sub4_3.method272(true);
                    class13_sub1_sub1_sub4_3.method273(class40.aClass50_689.anIntArray802[super.anInt1593], false);
                    class13_sub1_sub1_sub4_3.anIntArrayArray1528 = null;
                    class13_sub1_sub1_sub4_3.anIntArrayArray1527 = null;
                    if (class40.anInt692 != 128 || class40.anInt693 != 128) {
                        class13_sub1_sub1_sub4_3.method281(class40.anInt692, class40.anInt692, class40.anInt693, (byte) 0);
                    }
                    class13_sub1_sub1_sub4_3.method282(64 + class40.anInt695, 850 + class40.anInt696, -30, -50, -30, true);
                    CacheableNode_Sub1_Sub1_Sub4[] aclass13_sub1_sub1_sub4_1 = {
                            class13_sub1_sub1_sub4, class13_sub1_sub1_sub4_3
                    };
                    class13_sub1_sub1_sub4 = new CacheableNode_Sub1_Sub1_Sub4(aclass13_sub1_sub1_sub4_1, 0, true, 2);
                }
            }
            if (aClass13_Sub1_Sub1_Sub4_1714 != null) {
                if (Game.pulseCycle >= anInt1707) {
                    aClass13_Sub1_Sub1_Sub4_1714 = null;
                }
                if (Game.pulseCycle >= anInt1706 && Game.pulseCycle < anInt1707) {
                    CacheableNode_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4_1 = aClass13_Sub1_Sub1_Sub4_1714;
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
                    CacheableNode_Sub1_Sub1_Sub4[] aclass13_sub1_sub1_sub4 = {
                            class13_sub1_sub1_sub4, class13_sub1_sub1_sub4_1
                    };
                    class13_sub1_sub1_sub4 = new CacheableNode_Sub1_Sub1_Sub4(aclass13_sub1_sub1_sub4, 0, true, 2);
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
            if (i <= 0) {
                anInt1698 = -244;
            }
            return class13_sub1_sub1_sub4;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("37920, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method297(Buffer buffer, int i) {
        try {
            buffer.position = 0;
            anInt1687 = buffer.readUByte();
            anInt1715 = buffer.readUByte();
            aClass47_1716 = null;
            anInt1702 = 0;
            for (int j = 0; j < 12; j++) {
                int k = buffer.readUByte();
                if (k == 0) {
                    anIntArray1703[j] = 0;
                    continue;
                }
                int i1 = buffer.readUByte();
                anIntArray1703[j] = (k << 8) + i1;
                if (j == 0 && anIntArray1703[0] == 65535) {
                    aClass47_1716 = Class47.getDefinition(buffer.readUShortBE());
                    break;
                }
                if (anIntArray1703[j] >= 512 && anIntArray1703[j] - 512 < ItemDefinition.anInt669) {
                    int l1 = ItemDefinition.method505(anIntArray1703[j] - 512).anInt641;
                    if (l1 != 0) {
                        anInt1702 = l1;
                    }
                }
            }
            for (int l = 0; l < 5; l++) {
                int j1 = buffer.readUByte();
                if (j1 < 0 || j1 >= Game.anIntArrayArray829[l].length) {
                    j1 = 0;
                }
                anIntArray1700[l] = j1;
            }
            super.anInt1584 = buffer.readUShortBE();
            if (super.anInt1584 == 65535) {
                super.anInt1584 = -1;
            }
            super.anInt1585 = buffer.readUShortBE();
            if (super.anInt1585 == 65535) {
                super.anInt1585 = -1;
            }
            super.anInt1570 = buffer.readUShortBE();
            if (super.anInt1570 == 65535) {
                super.anInt1570 = -1;
            }
            super.anInt1571 = buffer.readUShortBE();
            if (super.anInt1571 == 65535) {
                super.anInt1571 = -1;
            }
            super.anInt1572 = buffer.readUShortBE();
            if (super.anInt1572 == 65535) {
                super.anInt1572 = -1;
            }
            super.anInt1573 = buffer.readUShortBE();
            if (super.anInt1573 == 65535) {
                super.anInt1573 = -1;
            }
            super.anInt1607 = buffer.readUShortBE();
            if (super.anInt1607 == 65535) {
                super.anInt1607 = -1;
            }
            aString1689 = Class24.method450(Class24.method447(buffer.readLongBE(), 0), 0);
            if (i != 0) {
                aBoolean1704 = !aBoolean1704;
            }
            anInt1697 = buffer.readUByte();
            anInt1695 = buffer.readUShortBE();
            aBoolean1701 = true;
            aLong1709 = 0L;
            for (int k1 = 0; k1 < 12; k1++) {
                aLong1709 <<= 4;
                if (anIntArray1703[k1] >= 256) {
                    aLong1709 += anIntArray1703[k1] - 256;
                }
            }
            if (anIntArray1703[0] >= 256) {
                aLong1709 += anIntArray1703[0] - 256 >> 4;
            }
            if (anIntArray1703[1] >= 256) {
                aLong1709 += anIntArray1703[1] - 256 >> 8;
            }
            for (int i2 = 0; i2 < 5; i2++) {
                aLong1709 <<= 3;
                aLong1709 += anIntArray1700[i2];
            }
            aLong1709 <<= 1;
            aLong1709 += anInt1687;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("22638, " + buffer + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

}
