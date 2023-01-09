package com.jagex.util;

import com.jagex.Game;

public class MouseCapturer implements Runnable {

    public Object objectLock;
    public Game game;
    public int[] coordsX;
    public int[] coordsY;
    public int coord;
    public boolean isCapturing;

    public MouseCapturer(Game game) {
        objectLock = new Object();
        coordsX = new int[500];
        coordsY = new int[500];
        isCapturing = true;
        this.game = game;
    }

    public void run() {
        while (isCapturing) {
            synchronized (objectLock) {
                if (coord < 500) {
                    coordsX[coord] = game.mouseX;
                    coordsY[coord] = game.mouseY;
                    coord++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception _ex) {
            }
        }
    }
}
