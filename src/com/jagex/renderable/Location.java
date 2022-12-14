package com.jagex.renderable;

import com.jagex.Game;
import com.jagex.cache.configs.SequenceConfig;
import com.jagex.cache.configs.LocationConfig;
import com.jagex.cache.configs.VariableBitConfig;
import com.jagex.graphics.Model;
import com.jagex.sign.Signlink;

public class Location extends Renderable {

    public static Game aGame1469;
    public int anInt1459;
    public int anInt1460;
    public int anInt1461;
    public int anInt1462;
    public int anInt1463;
    public int anInt1464;
    public int anInt1465;
    public int anInt1466;
    public int[] anIntArray1467;
    public boolean aBoolean1468;
    public SequenceConfig aSequenceConfig_1470;
    public int anInt1471;
    public int anInt1472;
    public int anInt1473;
    public int anInt1474;

    public Location(int i, int j, int k, int l, int i1, int j1, boolean flag,
                    int k1, int l1, int i2) {
        aBoolean1468 = false;
        anInt1472 = 525;
        try {
            anInt1464 = i2;
            anInt1465 = k1;
            anInt1466 = l;
            anInt1459 = j;
            anInt1460 = j1;
            anInt1461 = k;
            anInt1462 = i;
            if (i1 != -1) {
                aSequenceConfig_1470 = SequenceConfig.sequences[i1];
                anInt1463 = 0;
                anInt1471 = Game.pulseCycle;
                if (flag && aSequenceConfig_1470.anInt805 != -1) {
                    anInt1463 = (int) (Math.random() * (double) aSequenceConfig_1470.anInt801);
                    anInt1471 -= (int) (Math.random() * (double) aSequenceConfig_1470.method592(0, anInt1463));
                }
            }
            LocationConfig locationConfig = LocationConfig.readDefinition(anInt1464);
            if (l1 != 29895) {
                aBoolean1468 = !aBoolean1468;
            }
            anInt1473 = locationConfig.anInt246;
            anInt1474 = locationConfig.anInt257;
            anIntArray1467 = locationConfig.anIntArray243;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("49381, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + flag + ", " + k1 + ", " + l1 + ", " + i2 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Model getRotatedModel() {
        int j = -1;
        if (aSequenceConfig_1470 != null) {
            int k = Game.pulseCycle - anInt1471;
            if (k > 100 && aSequenceConfig_1470.anInt805 > 0) {
                k = 100;
            }
            while (k > aSequenceConfig_1470.method592(0, anInt1463)) {
                k -= aSequenceConfig_1470.method592(0, anInt1463);
                anInt1463++;
                if (anInt1463 < aSequenceConfig_1470.anInt801) {
                    continue;
                }
                anInt1463 -= aSequenceConfig_1470.anInt805;
                if (anInt1463 >= 0 && anInt1463 < aSequenceConfig_1470.anInt801) {
                    continue;
                }
                aSequenceConfig_1470 = null;
                break;
            }
            anInt1471 = Game.pulseCycle - k;
            if (aSequenceConfig_1470 != null) {
                j = aSequenceConfig_1470.anIntArray802[anInt1463];
            }
        }
        LocationConfig locationConfig;
        if (anIntArray1467 != null) {
            locationConfig = method259(2);
        } else {
            locationConfig = LocationConfig.readDefinition(anInt1464);
        }
        if (locationConfig == null) {
            return null;
        } else {
            Model class13_sub1_sub1_sub4 = locationConfig.method419(anInt1465, anInt1466, anInt1459, anInt1460, anInt1461, anInt1462, j);
            return class13_sub1_sub1_sub4;
        }
    }

    public LocationConfig method259(int i) {
        try {
            int j = -1;
            if (i < 2 || i > 2) {
                anInt1472 = -408;
            }
            if (anInt1473 != -1) {
                VariableBitConfig variableBitConfig = VariableBitConfig.aVariableBitConfigArray439[anInt1473];
                int k = variableBitConfig.anInt441;
                int l = variableBitConfig.anInt442;
                int i1 = variableBitConfig.anInt443;
                int j1 = Game.anIntArray1271[i1 - l];
                j = aGame1469.anIntArray1149[k] >> l & j1;
            } else if (anInt1474 != -1) {
                j = aGame1469.anIntArray1149[anInt1474];
            }
            if (j < 0 || j >= anIntArray1467.length || anIntArray1467[j] == -1) {
                return null;
            } else {
                return LocationConfig.readDefinition(anIntArray1467[j]);
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("90506, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
