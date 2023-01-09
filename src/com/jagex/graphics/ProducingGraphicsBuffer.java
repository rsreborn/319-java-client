package com.jagex.graphics;

import java.awt.*;
import java.awt.image.*;

public class ProducingGraphicsBuffer implements ImageProducer, ImageObserver {

    public int[] pixels;
    public int width;
    public int height;
    public ColorModel colorModel;
    public ImageConsumer imageConsumer;
    public Image image;

    public ProducingGraphicsBuffer(Component component, int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];
        colorModel = new DirectColorModel(32, 0xff0000, 65280, 255);
        image = component.createImage(this);
        drawPixels();
        component.prepareImage(image, this);
        drawPixels();
        component.prepareImage(image, this);
        drawPixels();
        component.prepareImage(image, this);
        createRasterizer();
    }

    public void createRasterizer() {
        Rasterizer.createRasterizer(pixels, height, width);
    }

    public void drawGraphics(Graphics graphics, int x, int y) {
        drawPixels();
        graphics.drawImage(image, x, y, this);
    }

    public synchronized void drawPixels() {
        if (imageConsumer != null) {
            imageConsumer.setPixels(0, 0, width, height, colorModel, pixels, 0, width);
            imageConsumer.imageComplete(2);
        }
    }

    public synchronized void addConsumer(ImageConsumer imageConsumer) {
        this.imageConsumer = imageConsumer;
        imageConsumer.setDimensions(width, height);
        imageConsumer.setProperties(null);
        imageConsumer.setColorModel(colorModel);
        imageConsumer.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer imageConsumer) {
        return this.imageConsumer == imageConsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageConsumer) {
        if (this.imageConsumer == imageConsumer) {
            this.imageConsumer = null;
        }
    }

    public void startProduction(ImageConsumer imageConsumer) {
        addConsumer(imageConsumer);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
        System.out.println("TDLR");
    }

    public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1) {
        return true;
    }
}
