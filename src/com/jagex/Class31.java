package com.jagex;

import java.awt.*;
import java.awt.image.*;

import com.jagex.sign.signlink;

public class Class31
    implements ImageProducer, ImageObserver
{

    public boolean aBoolean480;
    public int anInt481;
    public int anIntArray482[];
    public int anInt483;
    public int anInt484;
    public ColorModel aColorModel485;
    public ImageConsumer anImageConsumer486;
    public Image anImage487;

    public Class31(boolean flag, int i, Component component, int j)
    {
        aBoolean480 = true;
        anInt481 = -22144;
        try
        {
            anInt483 = i;
            anInt484 = j;
            anIntArray482 = new int[i * j];
            aColorModel485 = new DirectColorModel(32, 0xff0000, 65280, 255);
            if(!flag)
            {
                anInt481 = 73;
            }
            anImage487 = component.createImage(this);
            method492();
            component.prepareImage(anImage487, this);
            method492();
            component.prepareImage(anImage487, this);
            method492();
            component.prepareImage(anImage487, this);
            method490(false);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("13339, " + flag + ", " + i + ", " + component + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method490(boolean flag)
    {
        try
        {
            if(flag)
            {
                for(int i = 1; i > 0; i++)
                {
                }
            }
            Class13_Sub1_Sub4.method351(0, anIntArray482, anInt484, anInt483);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("97839, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method491(Graphics g, int i, boolean flag, int j)
    {
        try
        {
            method492();
            g.drawImage(anImage487, j, i, this);
            if(flag)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("63280, " + g + ", " + i + ", " + flag + ", " + j + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public synchronized void addConsumer(ImageConsumer imageconsumer)
    {
        anImageConsumer486 = imageconsumer;
        imageconsumer.setDimensions(anInt483, anInt484);
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(aColorModel485);
        imageconsumer.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer imageconsumer)
    {
        return anImageConsumer486 == imageconsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageconsumer)
    {
        if(anImageConsumer486 == imageconsumer)
        {
            anImageConsumer486 = null;
        }
    }

    public void startProduction(ImageConsumer imageconsumer)
    {
        addConsumer(imageconsumer);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer)
    {
        System.out.println("TDLR");
    }

    public synchronized void method492()
    {
        if(anImageConsumer486 == null)
        {
            return;
        } else
        {
            anImageConsumer486.setPixels(0, 0, anInt483, anInt484, aColorModel485, anIntArray482, 0, anInt483);
            anImageConsumer486.imageComplete(2);
            return;
        }
    }

    public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1)
    {
        return true;
    }
}
