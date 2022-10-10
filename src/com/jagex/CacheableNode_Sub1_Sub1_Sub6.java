package com.jagex;

import com.jagex.sign.Signlink;

public class CacheableNode_Sub1_Sub1_Sub6 extends CacheableNode_Sub1_ {

    public int anInt1566;
    public boolean[] aBooleanArray1567;
    public int anInt1568;
    public boolean aBoolean1569;
    public int anInt1570;
    public int anInt1571;
    public int anInt1572;
    public int anInt1573;
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
    public int anInt1584;
    public int anInt1585;
    public String aString1586;
    public int anInt1587;
    public int anInt1588;
    public int anInt1589;
    public int anInt1590;
    public int anInt1591;
    public int anInt1592;
    public int anInt1593;
    public int anInt1594;
    public int anInt1595;
    public int anInt1596;
    public int anInt1597;
    public int anInt1598;
    public int anInt1599;
    public int anInt1600;
    public int anInt1601;
    public int anInt1602;
    public int anInt1603;
    public int anInt1604;
    public int anInt1605;
    public int anInt1606;
    public int anInt1607;
    public boolean aBoolean1608;
    public int anInt1609;
    public int pulseCycle;
    public int anInt1611;
    public int[] anIntArray1612;
    public int[] anIntArray1613;
    public int[] anIntArray1614;
    public int[] anIntArray1615;
    public int[] anIntArray1616;
    public int anInt1617;
    public int anInt1618;
    public int anInt1619;
    public int anInt1620;
    public int anInt1621;
    public int anInt1622;

    public CacheableNode_Sub1_Sub1_Sub6() {
        aBooleanArray1567 = new boolean[10];
        aBoolean1569 = false;
        anInt1570 = -1;
        anInt1571 = -1;
        anInt1572 = -1;
        anInt1573 = -1;
        aBoolean1574 = false;
        anInt1584 = -1;
        anInt1585 = -1;
        anInt1590 = 200;
        anInt1592 = -1;
        anInt1597 = -1;
        anInt1602 = -1;
        anInt1603 = 100;
        anInt1604 = -1000;
        anInt1607 = -1;
        aBoolean1608 = true;
        anInt1611 = 1;
        anIntArray1612 = new int[4];
        anIntArray1613 = new int[4];
        anIntArray1614 = new int[4];
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

    public boolean method291(boolean flag) {
        try {
            if (!flag) {
                aBoolean1574 = !aBoolean1574;
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("59087, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
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
            if (anInt1597 != -1 && Class50.aClass50Array800[anInt1597].anInt813 == 1) {
                anInt1597 = -1;
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

    public void method293(int i, boolean flag, int j, int k) {
        try {
            for (int l = 0; l < 4; l++) {
                if (anIntArray1614[l] <= j) {
                    anIntArray1612[l] = i;
                    anIntArray1613[l] = k;
                    anIntArray1614[l] = j + 70;
                    return;
                }
            }
            if (!flag) {
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("72298, " + i + ", " + flag + ", " + j + ", " + k + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method294(boolean flag, int i, int j, byte byte0) {
        try {
            if (anInt1597 != -1 && Class50.aClass50Array800[anInt1597].anInt813 == 1) {
                anInt1597 = -1;
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
