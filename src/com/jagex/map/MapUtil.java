package com.jagex.map;

public class MapUtil {

    public static int getOffsetX(int x, int y, int orientation) {
        orientation &= 3;
        if (orientation == 0) {
            return x;
        }
        if (orientation == 1) {
            return y;
        }
        if (orientation == 2) {
            return 7 - x;
        }
        return 7 - y;
    }

    public static int getOffsetY(int x, int y, int orientation) {
        orientation &= 3;
        if (orientation == 0) {
            return y;
        }
        if (orientation == 1) {
            return 7 - x;
        }
        if (orientation == 2) {
            return 7 - y;
        }

        return x;
    }

    public static int getLocationOffsetX(int x, int y, int width, int length, int orientation) {
        orientation &= 3;
        if (orientation == 0) {
            return x;
        }
        if (orientation == 1) {
            return 7 - y - (width - 1);
        }
        if (orientation == 2) {
            return 7 - x - (length - 1);
        }
        return y;
    }

    public static int getLocationOffsetY(int x, int y, int width, int length, int orientation) {
        orientation &= 3;
        if (orientation == 0) {
            return y;
        }
        if (orientation == 1) {
            return x;
        }
        if (orientation == 2) {
            return 7 - y - (width - 1);
        }
        return 7 - x - (length - 1);
    }
}
