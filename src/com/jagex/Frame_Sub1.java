package com.jagex;

import com.jagex.sign.Signlink;

import java.awt.*;

public class Frame_Sub1 extends Frame {

    public GameShell gameShell;

    public Frame_Sub1(GameShell gameShell, int startingHeight, int startingWidth) {
        try {
            this.gameShell = gameShell;
            setTitle("Jagex");
            setResizable(false);
            setSize(startingWidth + 8, startingHeight + 28);
            show();
            toFront();
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("11982, " + gameShell + ", " + startingHeight + ", " + startingWidth + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public Graphics getGraphics() {
        Graphics g = super.getGraphics();
        g.translate(4, 24); //4 24
        return g;
    }

    public void update(Graphics g) {
        gameShell.update(g);
    }

    public void paint(Graphics g) {
        gameShell.paint(g);
    }
}
