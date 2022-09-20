package com.jagex;

import com.jagex.sign.Signlink;

import java.awt.*;

public class Frame_Sub1 extends Frame {

    public boolean aBoolean38;
    public GameShell gameShelll;

    public Frame_Sub1(GameShell gameShell, int i, int j, int k) {
        aBoolean38 = false;
        try {
            gameShelll = gameShell;
            setTitle("Jagex");
            setResizable(false);
            show();
            toFront();
            resize(k + 8, i + 28);
            if (j <= 0) {
                aBoolean38 = !aBoolean38;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("11982, " + gameShell + ", " + i + ", " + j + ", " + k + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public Graphics getGraphics() {
        Graphics g = super.getGraphics();
        g.translate(4, 24);
        return g;
    }

    public void update(Graphics g) {
        gameShelll.update(g);
    }

    public void paint(Graphics g) {
        gameShelll.paint(g);
    }
}
