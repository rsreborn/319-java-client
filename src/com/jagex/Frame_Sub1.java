package com.jagex;

import java.awt.*;
import com.jagex.sign.signlink;

public class Frame_Sub1 extends Frame
{

    public boolean aBoolean38;
    public Applet_Sub1 anApplet_Sub1_39;

    public Frame_Sub1(Applet_Sub1 applet_sub1, int i, int j, int k)
    {
        aBoolean38 = false;
        try
        {
            anApplet_Sub1_39 = applet_sub1;
            setTitle("Jagex");
            setResizable(false);
            show();
            toFront();
            resize(k + 8, i + 28);
            if(j <= 0)
            {
                aBoolean38 = !aBoolean38;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reportError("11982, " + applet_sub1 + ", " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Graphics getGraphics()
    {
        Graphics g = super.getGraphics();
        g.translate(4, 24);
        return g;
    }

    public void update(Graphics g)
    {
        anApplet_Sub1_39.update(g);
    }

    public void paint(Graphics g)
    {
        anApplet_Sub1_39.paint(g);
    }
}
