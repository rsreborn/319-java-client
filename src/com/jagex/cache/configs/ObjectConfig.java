package com.jagex.cache.configs;

import com.jagex.graphics.Rasterizer;
import com.jagex.graphics.Rasterizer3D;
import com.jagex.graphics.Sprite;
import com.jagex.graphics.Model;
import com.jagex.cache.CacheArchive;
import com.jagex.io.Buffer;
import com.jagex.sign.Signlink;
import com.jagex.util.Cache;

public class ObjectConfig {

    public static ObjectConfig[] aObjectConfigArray620;
    public static boolean aBoolean638 = true;
    public static int anInt645;
    public static int[] anIntArray655;
    public static Cache aCache_660 = new Cache(50);
    public static Cache aCache_661 = new Cache(100);
    public static Buffer aBuffer_665;
    public static boolean aBoolean667 = true;
    public static int anInt669;
    public int modelScale;
    public int anInt619;
    public int anInt621;
    public byte[] examine;
    public int anInt623;
    public int anInt624;
    public int anInt625;
    public int anInt626;
    public int[] anIntArray627;
    public int anInt628;
    public int anInt629;
    public byte aByte630;
    public int[] anIntArray631;
    public byte aByte632;
    public int anInt633;
    public int anInt634;
    public int anInt635;
    public int[] anIntArray636;
    public int anInt637;
    public String[] aStringArray639;
    public int anInt640;
    public int teamIndex;
    public int anInt642;
    public String[] aStringArray643;
    public int anInt644;
    public int[] anIntArray646;
    public int anInt647;
    public int anInt648;
    public String itemName;
    public boolean aBoolean650;
    public int anInt651;
    public int anInt652;
    public int anInt653;
    public int anInt654;
    public int anInt656;
    public int anInt657;
    public int anInt658;
    public int anInt659;
    public boolean aBoolean662;
    public int anInt663;
    public int anInt664;
    public int anInt666;
    public int anInt668;
    public int anInt670;

    public ObjectConfig() {
        anInt619 = 4;
        anInt623 = -25124;
        anInt633 = -1;
        anInt652 = 5;
    }

    public static Sprite method503(int i, int j, int k, boolean flag) {
        try {
            if (k == 0) {
                Sprite class13_sub1_sub4_sub4 = (Sprite) aCache_661.get(i);
                if (class13_sub1_sub4_sub4 != null && class13_sub1_sub4_sub4.anInt1686 != j && class13_sub1_sub4_sub4.anInt1686 != -1) {
                    class13_sub1_sub4_sub4.remove();
                    class13_sub1_sub4_sub4 = null;
                }
                if (class13_sub1_sub4_sub4 != null) {
                    return class13_sub1_sub4_sub4;
                }
            }
            ObjectConfig objectConfig = lookup(i);
            if (objectConfig.anIntArray636 == null) {
                j = -1;
            }
            if (j > 1) {
                int l = -1;
                for (int i1 = 0; i1 < 10; i1++) {
                    if (j >= objectConfig.anIntArray627[i1] && objectConfig.anIntArray627[i1] != 0) {
                        l = objectConfig.anIntArray636[i1];
                    }
                }
                if (l != -1) {
                    objectConfig = lookup(l);
                }
            }
            Model class13_sub1_sub1_sub4 = objectConfig.method509(1);
            if (class13_sub1_sub1_sub4 == null) {
                return null;
            }
            Sprite class13_sub1_sub4_sub4_2 = null;
            if (objectConfig.anInt642 != -1) {
                class13_sub1_sub4_sub4_2 = method503(objectConfig.anInt644, 10, -1, aBoolean638);
                if (class13_sub1_sub4_sub4_2 == null) {
                    return null;
                }
            }
            Sprite class13_sub1_sub4_sub4_1 = new Sprite(32, 32);
            int j1 = Rasterizer3D.anInt1630;
            int k1 = Rasterizer3D.anInt1631;
            int[] ai = Rasterizer3D.anIntArray1636;
            int[] ai1 = Rasterizer.pixels;
            int l1 = Rasterizer.width;
            int i2 = Rasterizer.height;
            int j2 = Rasterizer.anInt1428;
            int k2 = Rasterizer.anInt1429;
            int l2 = Rasterizer.anInt1426;
            int i3 = Rasterizer.anInt1427;
            Rasterizer3D.aBoolean1628 = false;
            Rasterizer.createRasterizer(class13_sub1_sub4_sub4_1.anIntArray1680, 32, 32);
            Rasterizer.method356(0, 0, 0, 32, 32);
            Rasterizer3D.method364(true);
            int j3 = objectConfig.modelScale;
            if (k == -1) {
                j3 = (int) ((double) j3 * 1.5D);
            }
            if (k > 0) {
                j3 = (int) ((double) j3 * 1.04D);
            }
            int k3 = Rasterizer3D.anIntArray1634[objectConfig.anInt670] * j3 >> 16;
            int l3 = Rasterizer3D.anIntArray1635[objectConfig.anInt670] * j3 >> 16;
            class13_sub1_sub1_sub4.method285(0, objectConfig.anInt663, objectConfig.anInt666, objectConfig.anInt670, objectConfig.anInt656, k3 + class13_sub1_sub1_sub4.anInt1377 / 2 + objectConfig.anInt628, l3 + objectConfig.anInt628);
            for (int l4 = 31; l4 >= 0; l4--) {
                for (int i4 = 31; i4 >= 0; i4--) {
                    if (class13_sub1_sub4_sub4_1.anIntArray1680[l4 + i4 * 32] == 0) {
                        if (l4 > 0 && class13_sub1_sub4_sub4_1.anIntArray1680[(l4 - 1) + i4 * 32] > 1) {
                            class13_sub1_sub4_sub4_1.anIntArray1680[l4 + i4 * 32] = 1;
                        } else if (i4 > 0 && class13_sub1_sub4_sub4_1.anIntArray1680[l4 + (i4 - 1) * 32] > 1) {
                            class13_sub1_sub4_sub4_1.anIntArray1680[l4 + i4 * 32] = 1;
                        } else if (l4 < 31 && class13_sub1_sub4_sub4_1.anIntArray1680[l4 + 1 + i4 * 32] > 1) {
                            class13_sub1_sub4_sub4_1.anIntArray1680[l4 + i4 * 32] = 1;
                        } else if (i4 < 31 && class13_sub1_sub4_sub4_1.anIntArray1680[l4 + (i4 + 1) * 32] > 1) {
                            class13_sub1_sub4_sub4_1.anIntArray1680[l4 + i4 * 32] = 1;
                        }
                    }
                }
            }
            if (k > 0) {
                for (int i5 = 31; i5 >= 0; i5--) {
                    for (int j4 = 31; j4 >= 0; j4--) {
                        if (class13_sub1_sub4_sub4_1.anIntArray1680[i5 + j4 * 32] == 0) {
                            if (i5 > 0 && class13_sub1_sub4_sub4_1.anIntArray1680[(i5 - 1) + j4 * 32] == 1) {
                                class13_sub1_sub4_sub4_1.anIntArray1680[i5 + j4 * 32] = k;
                            } else if (j4 > 0 && class13_sub1_sub4_sub4_1.anIntArray1680[i5 + (j4 - 1) * 32] == 1) {
                                class13_sub1_sub4_sub4_1.anIntArray1680[i5 + j4 * 32] = k;
                            } else if (i5 < 31 && class13_sub1_sub4_sub4_1.anIntArray1680[i5 + 1 + j4 * 32] == 1) {
                                class13_sub1_sub4_sub4_1.anIntArray1680[i5 + j4 * 32] = k;
                            } else if (j4 < 31 && class13_sub1_sub4_sub4_1.anIntArray1680[i5 + (j4 + 1) * 32] == 1) {
                                class13_sub1_sub4_sub4_1.anIntArray1680[i5 + j4 * 32] = k;
                            }
                        }
                    }
                }
            } else if (k == 0) {
                for (int j5 = 31; j5 >= 0; j5--) {
                    for (int k4 = 31; k4 >= 0; k4--) {
                        if (class13_sub1_sub4_sub4_1.anIntArray1680[j5 + k4 * 32] == 0 && j5 > 0 && k4 > 0 && class13_sub1_sub4_sub4_1.anIntArray1680[(j5 - 1) + (k4 - 1) * 32] > 0) {
                            class13_sub1_sub4_sub4_1.anIntArray1680[j5 + k4 * 32] = 0x302020;
                        }
                    }
                }
            }
            if (objectConfig.anInt642 != -1) {
                int k5 = class13_sub1_sub4_sub4_2.anInt1685;
                int l5 = class13_sub1_sub4_sub4_2.anInt1686;
                class13_sub1_sub4_sub4_2.anInt1685 = 32;
                class13_sub1_sub4_sub4_2.anInt1686 = 32;
                class13_sub1_sub4_sub4_2.method408(0, (byte) 83, 0);
                class13_sub1_sub4_sub4_2.anInt1685 = k5;
                class13_sub1_sub4_sub4_2.anInt1686 = l5;
            }
            if (k == 0) {
                aCache_661.put(class13_sub1_sub4_sub4_1, i);
            }
            Rasterizer.createRasterizer(ai1, i2, l1);
            Rasterizer.method353(k2, i3, l2, j2);
            if (!flag) {
                aBoolean638 = !aBoolean638;
            }
            Rasterizer3D.anInt1630 = j1;
            Rasterizer3D.anInt1631 = k1;
            Rasterizer3D.anIntArray1636 = ai;
            Rasterizer3D.aBoolean1628 = true;
            if (objectConfig.aBoolean662) {
                class13_sub1_sub4_sub4_1.anInt1685 = 33;
            } else {
                class13_sub1_sub4_sub4_1.anInt1685 = 32;
            }
            class13_sub1_sub4_sub4_1.anInt1686 = j;
            return class13_sub1_sub4_sub4_1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("28803, " + i + ", " + j + ", " + k + ", " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static ObjectConfig lookup(int i) {
        for (int j = 0; j < 10; j++) {
            if (aObjectConfigArray620[j].anInt633 == i) {
                return aObjectConfigArray620[j];
            }
        }
        anInt645 = (anInt645 + 1) % 10;
        ObjectConfig objectConfig = aObjectConfigArray620[anInt645];
        aBuffer_665.position = anIntArray655[i];
        objectConfig.anInt633 = i;
        objectConfig.method514();
        objectConfig.method510(aBuffer_665, 26421);
        if (objectConfig.anInt642 != -1) {
            objectConfig.method508(143);
        }
        if (!aBoolean667 && objectConfig.aBoolean650) {
            objectConfig.itemName = "Members Object";
            objectConfig.examine = "Login to a members' server to use this object.".getBytes();
            objectConfig.aStringArray643 = null;
            objectConfig.aStringArray639 = null;
            objectConfig.teamIndex = 0;
        }
        return objectConfig;
    }

    public static void method511() {
        aCache_660 = null;
        aCache_661 = null;
        anIntArray655 = null;
        aObjectConfigArray620 = null;
        aBuffer_665 = null;
    }

    public static void method515(CacheArchive cacheArchive) {
        aBuffer_665 = new Buffer(cacheArchive.readFile("obj.dat", null));
        Buffer buffer = new Buffer(cacheArchive.readFile("obj.idx", null));
        anInt669 = buffer.readUShortBE();
        anIntArray655 = new int[anInt669];
        int i = 2;
        for (int j = 0; j < anInt669; j++) {
            anIntArray655[j] = i;
            i += buffer.readUShortBE();
        }
        aObjectConfigArray620 = new ObjectConfig[10];
        for (int k = 0; k < 10; k++) {
            aObjectConfigArray620[k] = new ObjectConfig();
        }
    }

    public boolean method504(byte byte0, int i) {
        try {
            int j = anInt647;
            int k = anInt664;
            int l = anInt659;
            if (i == 1) {
                j = anInt654;
                k = anInt640;
                l = anInt648;
            }
            if (j == -1) {
                return true;
            }
            boolean flag = true;
            if (byte0 == 9) {
                byte0 = 0;
            } else {
                anInt623 = 192;
            }
            if (!Model.method266(j)) {
                flag = false;
            }
            if (k != -1 && !Model.method266(k)) {
                flag = false;
            }
            if (l != -1 && !Model.method266(l)) {
                flag = false;
            }
            return flag;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("36006, " + byte0 + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method506(int i, int j) {
        try {
            if (i != anInt652) {
                anInt623 = 321;
            }
            int k = anInt624;
            int l = anInt653;
            if (j == 1) {
                k = anInt651;
                l = anInt657;
            }
            if (k == -1) {
                return true;
            }
            boolean flag = Model.method266(k);
            if (l != -1 && !Model.method266(l)) {
                flag = false;
            }
            return flag;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("39858, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method507(int i, int j) {
        try {
            int k = anInt647;
            int l = anInt664;
            int i1 = anInt659;
            if (i != anInt619) {
                throw new NullPointerException();
            }
            if (j == 1) {
                k = anInt654;
                l = anInt640;
                i1 = anInt648;
            }
            if (k == -1) {
                return null;
            }
            Model class13_sub1_sub1_sub4 = Model.getModel(k);
            if (l != -1) {
                if (i1 != -1) {
                    Model class13_sub1_sub1_sub4_1 = Model.getModel(l);
                    Model class13_sub1_sub1_sub4_3 = Model.getModel(i1);
                    Model[] aclass13_sub1_sub1_sub4_1 = {
                            class13_sub1_sub1_sub4, class13_sub1_sub1_sub4_1, class13_sub1_sub1_sub4_3
                    };
                    class13_sub1_sub1_sub4 = new Model(3, (byte) 61, aclass13_sub1_sub1_sub4_1);
                } else {
                    Model class13_sub1_sub1_sub4_2 = Model.getModel(l);
                    Model[] aclass13_sub1_sub1_sub4 = {
                            class13_sub1_sub1_sub4, class13_sub1_sub1_sub4_2
                    };
                    class13_sub1_sub1_sub4 = new Model(2, (byte) 61, aclass13_sub1_sub1_sub4);
                }
            }
            if (j == 0 && aByte632 != 0) {
                class13_sub1_sub1_sub4.method278(0, -991, aByte632, 0);
            }
            if (j == 1 && aByte630 != 0) {
                class13_sub1_sub1_sub4.method278(0, -991, aByte630, 0);
            }
            if (anIntArray646 != null) {
                for (int j1 = 0; j1 < anIntArray646.length; j1++) {
                    class13_sub1_sub1_sub4.method279(anIntArray646[j1], anIntArray631[j1]);
                }
            }
            return class13_sub1_sub1_sub4;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("95666, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method508(int i) {
        try {
            ObjectConfig objectConfig = lookup(anInt642);
            anInt668 = objectConfig.anInt668;
            modelScale = objectConfig.modelScale;
            anInt670 = objectConfig.anInt670;
            anInt663 = objectConfig.anInt663;
            anInt666 = objectConfig.anInt666;
            anInt656 = objectConfig.anInt656;
            anInt628 = objectConfig.anInt628;
            anIntArray646 = objectConfig.anIntArray646;
            if (i <= 0) {
                for (int j = 1; j > 0; j++) {
                }
            }
            anIntArray631 = objectConfig.anIntArray631;
            ObjectConfig objectConfig_1 = lookup(anInt644);
            itemName = objectConfig_1.itemName;
            aBoolean650 = objectConfig_1.aBoolean650;
            anInt637 = objectConfig_1.anInt637;
            String s = "a";
            char c = objectConfig_1.itemName.charAt(0);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                s = "an";
            }
            examine = ("Swap this note at any bank for " + s + " " + objectConfig_1.itemName + ".").getBytes();
            aBoolean662 = true;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("15365, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method509(int i) {
        if (anIntArray636 != null && i > 1) {
            int j = -1;
            for (int k = 0; k < 10; k++) {
                if (i >= anIntArray627[k] && anIntArray627[k] != 0) {
                    j = anIntArray636[k];
                }
            }
            if (j != -1) {
                return lookup(j).method509(1);
            }
        }
        Model class13_sub1_sub1_sub4 = (Model) aCache_660.get(anInt633);
        if (class13_sub1_sub1_sub4 != null) {
            return class13_sub1_sub1_sub4;
        }
        class13_sub1_sub1_sub4 = Model.getModel(anInt668);
        if (class13_sub1_sub1_sub4 == null) {
            return null;
        }
        if (anInt658 != 128 || anInt635 != 128 || anInt621 != 128) {
            class13_sub1_sub1_sub4.method281(anInt658, anInt621, anInt635, (byte) 0);
        }
        if (anIntArray646 != null) {
            for (int l = 0; l < anIntArray646.length; l++) {
                class13_sub1_sub1_sub4.method279(anIntArray646[l], anIntArray631[l]);
            }
        }
        class13_sub1_sub1_sub4.method282(64 + anInt625, 768 + anInt629, -50, -10, -50, true);
        class13_sub1_sub1_sub4.aBoolean1529 = true;
        aCache_660.put(class13_sub1_sub1_sub4, anInt633);
        return class13_sub1_sub1_sub4;
    }

    public void method510(Buffer buffer, int i) {
        try {
            if (i != 26421) {
                for (int j = 1; j > 0; j++) {
                }
            }
            do {
                int k = buffer.readUByte();
                if (k == 0) {
                    return;
                }
                if (k == 1) {
                    anInt668 = buffer.readUShortBE();
                } else if (k == 2) {
                    itemName = buffer.readString();
                } else if (k == 3) {
                    examine = buffer.readStringBytes();
                } else if (k == 4) {
                    modelScale = buffer.readUShortBE();
                } else if (k == 5) {
                    anInt670 = buffer.readUShortBE();
                } else if (k == 6) {
                    anInt663 = buffer.readUShortBE();
                } else if (k == 7) {
                    anInt656 = buffer.readUShortBE();
                    if (anInt656 > 32767) {
                        anInt656 -= 0x10000;
                    }
                } else if (k == 8) {
                    anInt628 = buffer.readUShortBE();
                    if (anInt628 > 32767) {
                        anInt628 -= 0x10000;
                    }
                } else if (k == 10) {
                    anInt634 = buffer.readUShortBE();
                } else if (k == 11) {
                    aBoolean662 = true;
                } else if (k == 12) {
                    anInt637 = buffer.readIntBE();
                } else if (k == 16) {
                    aBoolean650 = true;
                } else if (k == 23) {
                    anInt647 = buffer.readUShortBE();
                    aByte632 = buffer.readByte();
                } else if (k == 24) {
                    anInt664 = buffer.readUShortBE();
                } else if (k == 25) {
                    anInt654 = buffer.readUShortBE();
                    aByte630 = buffer.readByte();
                } else if (k == 26) {
                    anInt640 = buffer.readUShortBE();
                } else if (k >= 30 && k < 35) {
                    if (aStringArray643 == null) {
                        aStringArray643 = new String[5];
                    }
                    aStringArray643[k - 30] = buffer.readString();
                    if (aStringArray643[k - 30].equalsIgnoreCase("hidden")) {
                        aStringArray643[k - 30] = null;
                    }
                } else if (k >= 35 && k < 40) {
                    if (aStringArray639 == null) {
                        aStringArray639 = new String[5];
                    }
                    aStringArray639[k - 35] = buffer.readString();
                } else if (k == 40) {
                    int l = buffer.readUByte();
                    anIntArray646 = new int[l];
                    anIntArray631 = new int[l];
                    for (int i1 = 0; i1 < l; i1++) {
                        anIntArray646[i1] = buffer.readUShortBE();
                        anIntArray631[i1] = buffer.readUShortBE();
                    }
                } else if (k == 78) {
                    anInt659 = buffer.readUShortBE();
                } else if (k == 79) {
                    anInt648 = buffer.readUShortBE();
                } else if (k == 90) {
                    anInt624 = buffer.readUShortBE();
                } else if (k == 91) {
                    anInt651 = buffer.readUShortBE();
                } else if (k == 92) {
                    anInt653 = buffer.readUShortBE();
                } else if (k == 93) {
                    anInt657 = buffer.readUShortBE();
                } else if (k == 95) {
                    anInt666 = buffer.readUShortBE();
                } else if (k == 97) {
                    anInt644 = buffer.readUShortBE();
                } else if (k == 98) {
                    anInt642 = buffer.readUShortBE();
                } else if (k >= 100 && k < 110) {
                    if (anIntArray636 == null) {
                        anIntArray636 = new int[10];
                        anIntArray627 = new int[10];
                    }
                    anIntArray636[k - 100] = buffer.readUShortBE();
                    anIntArray627[k - 100] = buffer.readUShortBE();
                } else if (k == 110) {
                    anInt658 = buffer.readUShortBE();
                } else if (k == 111) {
                    anInt635 = buffer.readUShortBE();
                } else if (k == 112) {
                    anInt621 = buffer.readUShortBE();
                } else if (k == 113) {
                    anInt625 = buffer.readByte();
                } else if (k == 114) {
                    anInt629 = buffer.readByte() * 5;
                } else if (k == 115) {
                    teamIndex = buffer.readUByte();
                }
            } while (true);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("349, " + buffer + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method512(int i, byte byte0) {
        try {
            int j = anInt624;
            int k = anInt653;
            if (byte0 != -34) {
                aBoolean638 = !aBoolean638;
            }
            if (i == 1) {
                j = anInt651;
                k = anInt657;
            }
            if (j == -1) {
                return null;
            }
            Model class13_sub1_sub1_sub4 = Model.getModel(j);
            if (k != -1) {
                Model class13_sub1_sub1_sub4_1 = Model.getModel(k);
                Model[] aclass13_sub1_sub1_sub4 = {
                        class13_sub1_sub1_sub4, class13_sub1_sub1_sub4_1
                };
                class13_sub1_sub1_sub4 = new Model(2, (byte) 61, aclass13_sub1_sub1_sub4);
            }
            if (anIntArray646 != null) {
                for (int l = 0; l < anIntArray646.length; l++) {
                    class13_sub1_sub1_sub4.method279(anIntArray646[l], anIntArray631[l]);
                }
            }
            return class13_sub1_sub1_sub4;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("32538, " + i + ", " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model method513(int j) {
        if (anIntArray636 != null && j > 1) {
            int k = -1;
            for (int l = 0; l < 10; l++) {
                if (j >= anIntArray627[l] && anIntArray627[l] != 0) {
                    k = anIntArray636[l];
                }
            }
            if (k != -1) {
                return lookup(k).method513(1);
            }
        }
        Model class13_sub1_sub1_sub4 = Model.getModel(anInt668);
        if (class13_sub1_sub1_sub4 == null) {
            return null;
        }
        if (anIntArray646 != null) {
            for (int i1 = 0; i1 < anIntArray646.length; i1++) {
                class13_sub1_sub1_sub4.method279(anIntArray646[i1], anIntArray631[i1]);
            }
        }
        return class13_sub1_sub1_sub4;
    }

    public void method514() {
        anInt668 = 0;
        itemName = null;
        examine = null;
        anIntArray646 = null;
        anIntArray631 = null;
        modelScale = 2000;
        anInt670 = 0;
        anInt663 = 0;
        anInt666 = 0;
        anInt656 = 0;
        anInt628 = 0;
        anInt634 = -1;
        aBoolean662 = false;
        anInt637 = 1;
        aBoolean650 = false;
        aStringArray643 = null;
        aStringArray639 = null;
        anInt647 = -1;
        anInt664 = -1;
        aByte632 = 0;
        anInt654 = -1;
        anInt640 = -1;
        aByte630 = 0;
        anInt659 = -1;
        anInt648 = -1;
        anInt624 = -1;
        anInt653 = -1;
        anInt651 = -1;
        anInt657 = -1;
        anIntArray636 = null;
        anIntArray627 = null;
        anInt644 = -1;
        anInt642 = -1;
        anInt658 = 128;
        anInt635 = 128;
        anInt621 = 128;
        anInt625 = 0;
        anInt629 = 0;
        teamIndex = 0;
    }

}
