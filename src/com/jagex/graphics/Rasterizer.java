package com.jagex.graphics;

import com.jagex.util.CacheableNode;

public class Rasterizer extends CacheableNode {

    public static int[] pixels;
    public static int width;
    public static int height;
    public static int anInt1426;
    public static int anInt1427;
    public static int anInt1428;
    public static int anInt1429;
    public static int anInt1430;
    public static int anInt1431;
    public static int anInt1432;

    public Rasterizer() {
    }

    public static void createRasterizer(int[] pixels, int height, int width) {
        Rasterizer.pixels = pixels;
        Rasterizer.width = width;
        Rasterizer.height = height;
        method353(width, height, 0, 0);
    }

    public static void method352() {
        anInt1428 = 0;
        anInt1426 = 0;
        anInt1429 = width;
        anInt1427 = height;
        anInt1430 = anInt1429 - 1;
        anInt1431 = anInt1429 / 2;
    }

    public static void method353(int width, int height, int k, int l) {
        if (l < 0) {
            l = 0;
        }
        if (k < 0) {
            k = 0;
        }
        if (width > Rasterizer.width) {
            width = Rasterizer.width;
        }
        if (height > Rasterizer.height) {
            height = Rasterizer.height;
        }
        anInt1428 = l;
        anInt1426 = k;
        anInt1429 = width;
        anInt1427 = height;
        anInt1430 = anInt1429 - 1;
        anInt1431 = anInt1429 / 2;
        anInt1432 = anInt1427 / 2;
    }

    public static void resetPixels() {
        int totalPixels = width * height;
        for (int pixel = 0; pixel < totalPixels; pixel++) {
            pixels[pixel] = 0;
        }
    }

    public static void method355(int i, int j, int k, int l, int i1, int j1, int k1) {
        if (j1 < anInt1428) {
            i -= anInt1428 - j1;
            j1 = anInt1428;
        }
        if (k < anInt1426) {
            l -= anInt1426 - k;
            k = anInt1426;
        }
        if (j1 + i > anInt1429) {
            i = anInt1429 - j1;
        }
        if (k + l > anInt1427) {
            l = anInt1427 - k;
        }
        int l1 = 256 - k1;
        int i2 = (i1 >> 16 & 0xff) * k1;
        int j2 = (i1 >> 8 & 0xff) * k1;
        int k2 = (i1 & 0xff) * k1;
        int k3 = width - i;
        int l3 = j1 + k * width;
        for (int i4 = 0; i4 < l; i4++) {
            for (int j4 = -i; j4 < 0; j4++) {
                int l2 = (pixels[l3] >> 16 & 0xff) * l1;
                int i3 = (pixels[l3] >> 8 & 0xff) * l1;
                int j3 = (pixels[l3] & 0xff) * l1;
                int k4 = ((i2 + l2 >> 8) << 16) + ((j2 + i3 >> 8) << 8) + (k2 + j3 >> 8);
                pixels[l3++] = k4;
            }
            l3 += k3;
        }
    }

    public static void method356(int i, int j, int k, int l, int i1) {
        if (i < anInt1428) {
            l -= anInt1428 - i;
            i = anInt1428;
        }
        if (j < anInt1426) {
            i1 -= anInt1426 - j;
            j = anInt1426;
        }
        if (i + l > anInt1429) {
            l = anInt1429 - i;
        }
        if (j + i1 > anInt1427) {
            i1 = anInt1427 - j;
        }
        int j1 = width - l;
        int k1 = i + j * width;
        for (int l1 = -i1; l1 < 0; l1++) {
            for (int i2 = -l; i2 < 0; i2++) {
                pixels[k1++] = k;
            }
            k1 += j1;
        }
    }

    public static void method357(int i, int j, int k, int l, int i1) {
        method359(l, j, i, i1);
        method359(l, j, (i + k) - 1, i1);
        method361(j, k, l, i);
        method361((j + i1) - 1, k, l, i);
    }

    public static void method358(int i, int j, boolean flag, int k, int l, int i1, int j1) {
        method360(l, k, i, j, i1);
        method360(l, k, i, j, (i1 + j1) - 1);

        if (j1 >= 3) {
            method362(i1 + 1, j1 - 2, j, k, l);
            method362(i1 + 1, j1 - 2, (j + i) - 1, k, l);
            return;
        }
    }

    public static void method359(int i, int j, int k, int l) {
        if (k < anInt1426 || k >= anInt1427) {
            return;
        }
        if (j < anInt1428) {
            l -= anInt1428 - j;
            j = anInt1428;
        }
        if (j + l > anInt1429) {
            l = anInt1429 - j;
        }
        int i1 = j + k * width;
        for (int j1 = 0; j1 < l; j1++) {
            pixels[i1 + j1] = i;
        }
    }

    public static void method360(int color, int alpha, int k, int l, int i1) {
        if (i1 < anInt1426 || i1 >= anInt1427) {
            return;
        }
        if (l < anInt1428) {
            k -= anInt1428 - l;
            l = anInt1428;
        }
        if (l + k > anInt1429) {
            k = anInt1429 - l;
        }
        int a = 256 - alpha;
        int red = (color >> 16 & 0xff) * alpha;
        int green = (color >> 8 & 0xff) * alpha;
        int blue = (color & 0xff) * alpha;
        int pixel = l + i1 * width;
        for (int j3 = 0; j3 < k; j3++) {
            int j2 = (pixels[pixel] >> 16 & 0xff) * a;
            int k2 = (pixels[pixel] >> 8 & 0xff) * a;
            int l2 = (pixels[pixel] & 0xff) * a;
            int k3 = ((red + j2 >> 8) << 16) + ((green + k2 >> 8) << 8) + (blue + l2 >> 8);
            pixels[pixel++] = k3;
        }
    }

    public static void method361(int i, int j, int k, int l) {
        if (i < anInt1428 || i >= anInt1429) {
            return;
        }
        if (l < anInt1426) {
            j -= anInt1426 - l;
            l = anInt1426;
        }
        if (l + j > anInt1427) {
            j = anInt1427 - l;
        }
        int j1 = i + l * width;
        for (int k1 = 0; k1 < j; k1++) {
            pixels[j1 + k1 * width] = k;
        }
    }

    public static void method362(int i, int j, int k, int i1, int j1) {
        if (k < anInt1428 || k >= anInt1429) {
            return;
        }
        if (i < anInt1426) {
            j -= anInt1426 - i;
            i = anInt1426;
        }
        if (i + j > anInt1427) {
            j = anInt1427 - i;
        }
        int k1 = 256 - i1;
        int l1 = (j1 >> 16 & 0xff) * i1;
        int i2 = (j1 >> 8 & 0xff) * i1;
        int j2 = (j1 & 0xff) * i1;
        int j3 = k + i * width;
        for (int k3 = 0; k3 < j; k3++) {
            int k2 = (pixels[j3] >> 16 & 0xff) * k1;
            int l2 = (pixels[j3] >> 8 & 0xff) * k1;
            int i3 = (pixels[j3] & 0xff) * k1;
            int l3 = ((l1 + k2 >> 8) << 16) + ((i2 + l2 >> 8) << 8) + (j2 + i3 >> 8);
            pixels[j3] = l3;
            j3 += width;
        }
    }
}
