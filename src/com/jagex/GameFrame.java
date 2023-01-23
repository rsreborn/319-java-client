package com.jagex;

import java.awt.*;

public class GameFrame extends Frame {

    public GameShell gameShell;

    public GameFrame(GameShell gameShell, int startingHeight, int startingWidth) {
        this.gameShell = gameShell;
        setTitle("Jagex");
        setResizable(false);
        setSize(startingWidth + 8, startingHeight + 28);
        setVisible(true);
        toFront();
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
