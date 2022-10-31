package com.jagex.renderable;

import com.jagex.cache.configs.SequenceConfig;
import com.jagex.sign.Signlink;

public class Entity extends Renderable {

    public int anInt1566;
    public boolean[] aBooleanArray1567;
    public int anInt1568;
    public boolean aBoolean1569;
    public int walkingAnimation;
    public int turnAroundAnimation;
    public int turnRightAnimation;
    public int turnLeftAnimation;
    public boolean aBoolean1574;
    public int anInt1575;
    public int anInt1576;
    public int anInt1577;
    public int anInt1578;
    public int anInt1579;
    public int anInt1580;
    public int anInt1581;
    public int anInt1582;
    public int anInt1583;
    public int idleAnimation;
    public int standTurnAnimation;
    public String forceChat;
    public int anInt1587;
    public int anInt1588;
    public int anInt1589;
    public int anInt1590;
    public int anInt1591;
    public int graphic;
    public int anInt1593;
    public int anInt1594;
    public int graphicDelay;
    public int graphicHeight;
    public int emoteAnimation;
    public int anInt1598;
    public int anInt1599;
    public int animationDelay;
    public int anInt1601;
    public int interactingEntity;
    public int textCycle;
    public int cycleStatus;
    public int anInt1605;
    public int anInt1606;
    public int runAnimation;
    public boolean aBoolean1608;
    public int anInt1609;
    public int pulseCycle;
    public int anInt1611;
    public int[] anIntArray1612;
    public int[] anIntArray1613;
    public int[] hitCycles;
    public int[] anIntArray1615;
    public int[] anIntArray1616;
    public int anInt1617;
    public int anInt1618;
    public int anInt1619;
    public int anInt1620;
    public int anInt1621;
    public int anInt1622;

    public Entity() {
        aBooleanArray1567 = new boolean[10];
        aBoolean1569 = false;
        walkingAnimation = -1;
        turnAroundAnimation = -1;
        turnRightAnimation = -1;
        turnLeftAnimation = -1;
        aBoolean1574 = false;
        idleAnimation = -1;
        standTurnAnimation = -1;
        anInt1590 = 200;
        graphic = -1;
        emoteAnimation = -1;
        interactingEntity = -1;
        textCycle = 100;
        cycleStatus = -1000;
        runAnimation = -1;
        aBoolean1608 = true;
        anInt1611 = 1;
        anIntArray1612 = new int[4];
        anIntArray1613 = new int[4];
        hitCycles = new int[4];
        anIntArray1615 = new int[10];
        anIntArray1616 = new int[10];
        anInt1618 = 32;
        anInt1620 = -1;
    }

    public void method290(byte byte0) {
        try {
            anInt1591 = 0;
            anInt1619 = 0;
            if (byte0 != 5) {
                aBoolean1608 = !aBoolean1608;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("61562, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public boolean isVisible() {
        return false;
    }

    public void method292(int i, int j, boolean flag) {
        try {
            int k = anIntArray1615[0];
            int l = anIntArray1616[0];
            if (i == 0) {
                k--;
                l++;
            }
            if (i == 1) {
                l++;
            }
            if (i == 2) {
                k++;
                l++;
            }
            if (i == 3) {
                k--;
            }
            if (i == 4) {
                k++;
            }
            if (i == 5) {
                k--;
                l--;
            }
            if (i == 6) {
                l--;
            }
            if (i == 7) {
                k++;
                l--;
            }
            if (emoteAnimation != -1 && SequenceConfig.sequences[emoteAnimation].anInt813 == 1) {
                emoteAnimation = -1;
            }
            if (anInt1591 < 9) {
                anInt1591++;
            }
            for (int i1 = anInt1591; i1 > 0; i1--) {
                anIntArray1615[i1] = anIntArray1615[i1 - 1];
                anIntArray1616[i1] = anIntArray1616[i1 - 1];
                aBooleanArray1567[i1] = aBooleanArray1567[i1 - 1];
            }
            if (j <= 0) {
                return;
            } else {
                anIntArray1615[0] = k;
                anIntArray1616[0] = l;
                aBooleanArray1567[0] = flag;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("13598, " + i + ", " + j + ", " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void damage(int i, int k, int cycle) {
        for (int index = 0; index < 4; index++) {
            if (hitCycles[index] <= cycle) {
                anIntArray1612[index] = i;
                anIntArray1613[index] = k;
                hitCycles[index] = cycle + 70;
                return;
            }
        }
    }

    public void method294(boolean flag, int i, int j, byte byte0) {
        try {
            if (emoteAnimation != -1 && SequenceConfig.sequences[emoteAnimation].anInt813 == 1) {
                emoteAnimation = -1;
            }
            if (!flag) {
                int k = i - anIntArray1615[0];
                int l = j - anIntArray1616[0];
                if (k >= -8 && k <= 8 && l >= -8 && l <= 8) {
                    if (anInt1591 < 9) {
                        anInt1591++;
                    }
                    for (int i1 = anInt1591; i1 > 0; i1--) {
                        anIntArray1615[i1] = anIntArray1615[i1 - 1];
                        anIntArray1616[i1] = anIntArray1616[i1 - 1];
                        aBooleanArray1567[i1] = aBooleanArray1567[i1 - 1];
                    }
                    anIntArray1615[0] = i;
                    anIntArray1616[0] = j;
                    aBooleanArray1567[0] = false;
                    return;
                }
            }
            anInt1591 = 0;
            anInt1619 = 0;
            anInt1568 = 0;
            anIntArray1615[0] = i;
            if (byte0 != 103) {
                return;
            } else {
                anIntArray1616[0] = j;
                anInt1587 = anIntArray1615[0] * 128 + anInt1611 * 64;
                anInt1588 = anIntArray1616[0] * 128 + anInt1611 * 64;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("71514, " + flag + ", " + i + ", " + j + ", " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
