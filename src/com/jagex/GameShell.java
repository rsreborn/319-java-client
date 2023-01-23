package com.jagex;

import com.jagex.graphics.ProducingGraphicsBuffer;
import com.jagex.graphics.Sprite;
import com.jagex.sign.Signlink;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class GameShell extends Applet
        implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    public static int anInt37;
    public byte aByte1;
    public byte aByte2;
    public boolean aBoolean3;
    public int anInt4;
    public int anInt5;
    public boolean aBoolean6;
    public int anInt7;
    public int anInt8;
    public int anInt9;
    public long[] aLongArray10;
    public int anInt11;
    public boolean aBoolean12;
    public int initialWidth;
    public int initialHeight;
    public Graphics aGraphics15;
    public ProducingGraphicsBuffer aProducingGraphicsBuffer_16;
    public Sprite[] aClass13_Sub1_Sub4_Sub4Array17;
    public GameFrame gameFrame;
    public boolean aBoolean19;
    public boolean aBoolean20;
    public int idleTime;
    public int anInt22;
    public int mouseX;
    public int mouseY;
    public int anInt25;
    public int anInt26;
    public int anInt27;
    public long aLong28;
    public int clickType;
    public int clickX;
    public int clickY;
    public long aLong32;
    public int[] anIntArray33;
    public int[] anIntArray34;
    public int anInt35;
    public int anInt36;

    public GameShell() {
        aByte1 = -55;
        aByte2 = -19;
        aBoolean3 = false;
        anInt4 = -22144;
        aBoolean6 = true;
        anInt8 = 20;
        anInt9 = 1;
        aLongArray10 = new long[10];
        aBoolean12 = false;
        aClass13_Sub1_Sub4_Sub4Array17 = new Sprite[6];
        aBoolean19 = true;
        aBoolean20 = true;
        anIntArray33 = new int[128];
        anIntArray34 = new int[128];
    }

    public void method1(int height, int width) {
        initialWidth = width;
        initialHeight = height;
        System.out.println("Height " + height + " Width " + width + " Initial Height " + initialHeight + " Initial Width " + initialWidth);
        gameFrame = new GameFrame(this, initialHeight, initialWidth);
        aGraphics15 = getGameFrame().getGraphics();
        aProducingGraphicsBuffer_16 = new ProducingGraphicsBuffer(getGameFrame(), initialWidth, initialHeight);
        method12(this, 1);
    }

    public void method2(int height, int width) {
        initialWidth = width;
        initialHeight = height;
        aGraphics15 = getGameFrame().getGraphics();
        aProducingGraphicsBuffer_16 = new ProducingGraphicsBuffer(getGameFrame(), initialWidth, initialHeight);
        method12(this, 1);
    }

    public void run() {
        getGameFrame().addMouseListener(this);
        getGameFrame().addMouseMotionListener(this);
        getGameFrame().addKeyListener(this);
        getGameFrame().addFocusListener(this);
        if (gameFrame != null) {
            gameFrame.addWindowListener(this);
        }
        updateLoadingBar("Loading...", 0);
        method6();
        int i = 0;
        int j = 256;
        int k = 1;
        int i1 = 0;
        int j1 = 0;
        for (int k1 = 0; k1 < 10; k1++) {
            aLongArray10[k1] = System.currentTimeMillis();
        }
        long l = System.currentTimeMillis();
        while (anInt7 >= 0) {
            if (anInt7 > 0) {
                anInt7--;
                if (anInt7 == 0) {
                    method3(7);
                    return;
                }
            }
            int i2 = j;
            int j2 = k;
            j = 300;
            k = 1;
            long l1 = System.currentTimeMillis();
            if (aLongArray10[i] == 0L) {
                j = i2;
                k = j2;
            } else if (l1 > aLongArray10[i]) {
                j = (int) ((long) (2560 * anInt8) / (l1 - aLongArray10[i]));
            }
            if (j < 25) {
                j = 25;
            }
            if (j > 256) {
                j = 256;
                k = (int) ((long) anInt8 - (l1 - aLongArray10[i]) / 10L);
            }
            if (k > anInt8) {
                k = anInt8;
            }
            aLongArray10[i] = l1;
            i = (i + 1) % 10;
            if (k > 1) {
                for (int k2 = 0; k2 < 10; k2++) {
                    if (aLongArray10[k2] != 0L) {
                        aLongArray10[k2] += k;
                    }
                }
            }
            if (k < anInt9) {
                k = anInt9;
            }
            try {
                Thread.sleep(k);
            } catch (InterruptedException _ex) {
                j1++;
            }
            for (; i1 < 256; i1 += j) {
                clickType = anInt25;
                clickX = anInt26;
                clickY = anInt27;
                aLong32 = aLong28;
                anInt25 = 0;
                method7(aByte2);
                anInt35 = anInt36;
            }
            i1 &= 0xff;
            if (anInt8 > 0) {
                anInt11 = (1000 * j) / (anInt8 * 256);
            }
            method9(false);
            if (aBoolean12) {
                System.out.println("ntime:" + l1);
                for (int l2 = 0; l2 < 10; l2++) {
                    int i3 = ((i - l2 - 1) + 20) % 10;
                    System.out.println("otim" + i3 + ":" + aLongArray10[i3]);
                }
                System.out.println("fps:" + anInt11 + " ratio:" + j + " count:" + i1);
                System.out.println("del:" + k + " deltime:" + anInt8 + " mindel:" + anInt9);
                System.out.println("intex:" + j1 + " opos:" + i);
                aBoolean12 = false;
                j1 = 0;
            }
        }
        if (anInt7 == -1) {
            method3(7);
        }
    }

    public void method3(int i) {
        try {
            anInt7 = -2;
            method8(427);
            if (gameFrame != null) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception _ex) {
                }
                try {
                    System.exit(0);
                } catch (Throwable _ex) {
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("85361, " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method4(int i) {
        anInt8 = 1000 / i;
    }

    public void start() {
        if (anInt7 >= 0) {
            anInt7 = 0;
        }
    }

    public void stop() {
        if (anInt7 >= 0) {
            anInt7 = 4000 / anInt8;
        }
    }

    public void destroy() {
        anInt7 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception _ex) {
        }
        if (anInt7 == -1) {
            method3(7);
        }
    }

    public void update(Graphics g) {
        if (aGraphics15 == null) {
            aGraphics15 = g;
        }
        aBoolean19 = true;
        method10();
    }

    public void paint(Graphics g) {
        if (aGraphics15 == null) {
            aGraphics15 = g;
        }
        aBoolean19 = true;
        method10();
    }

    public void mousePressed(MouseEvent mouseEvent) {
        int i = mouseEvent.getX();
        int j = mouseEvent.getY();
        if (gameFrame != null) {
            i -= 4;
            j -= 22;
        }
        idleTime = 0;
        anInt26 = i;
        anInt27 = j;
        aLong28 = System.currentTimeMillis();
        if (mouseEvent.isMetaDown()) {
            anInt25 = 2;
            anInt22 = 2;
        } else {
            anInt25 = 1;
            anInt22 = 1;
        }
    }

    public void mouseReleased(MouseEvent mouseevent) {
        idleTime = 0;
        anInt22 = 0;
    }

    public void mouseClicked(MouseEvent mouseevent) {
    }

    public void mouseEntered(MouseEvent mouseevent) {
    }

    public void mouseExited(MouseEvent mouseevent) {
        idleTime = 0;
        mouseX = -1;
        mouseY = -1;
    }

    public void mouseDragged(MouseEvent mouseevent) {
        int mouseX = mouseevent.getX();
        int mouseY = mouseevent.getY();
        if (gameFrame != null) {
            mouseX -= 4;
            mouseY -= 22;
        }
        idleTime = 0;
        this.mouseX = mouseX;
        this.mouseY = mouseY;
    }

    public void mouseMoved(MouseEvent mouseevent) {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if (gameFrame != null) {
            i -= 4;
            j -= 22;
        }
        idleTime = 0;
        mouseX = i;
        mouseY = j;
    }

    public void keyPressed(KeyEvent keyevent) {
        idleTime = 0;
        int i = keyevent.getKeyCode();
        int j = keyevent.getKeyChar();
        if (j < 30) {
            j = 0;
        }
        if (i == 37) {
            j = 1;
        }
        if (i == 39) {
            j = 2;
        }
        if (i == 38) {
            j = 3;
        }
        if (i == 40) {
            j = 4;
        }
        if (i == 17) {
            j = 5;
        }
        if (i == 8) {
            j = 8;
        }
        if (i == 127) {
            j = 8;
        }
        if (i == 9) {
            j = 9;
        }
        if (i == 10) {
            j = 10;
        }
        if (i >= 112 && i <= 123) {
            j = (1008 + i) - 112;
        }
        if (i == 36) {
            j = 1000;
        }
        if (i == 35) {
            j = 1001;
        }
        if (i == 33) {
            j = 1002;
        }
        if (i == 34) {
            j = 1003;
        }
        if (j > 0 && j < 128) {
            anIntArray33[j] = 1;
        }
        if (j > 4) {
            anIntArray34[anInt36] = j;
            anInt36 = anInt36 + 1 & 0x7f;
        }
    }

    public void keyReleased(KeyEvent keyevent) {
        idleTime = 0;
        int i = keyevent.getKeyCode();
        char c = keyevent.getKeyChar();
        if (c < '\036') {
            c = '\0';
        }
        if (i == 37) {
            c = '\001';
        }
        if (i == 39) {
            c = '\002';
        }
        if (i == 38) {
            c = '\003';
        }
        if (i == 40) {
            c = '\004';
        }
        if (i == 17) {
            c = '\005';
        }
        if (i == 8) {
            c = '\b';
        }
        if (i == 127) {
            c = '\b';
        }
        if (i == 9) {
            c = '\t';
        }
        if (i == 10) {
            c = '\n';
        }
        if (c > 0 && c < '\200') {
            anIntArray33[c] = 0;
        }
    }

    public void keyTyped(KeyEvent keyevent) {
    }

    public int method5(boolean flag) {
        try {
            if (!flag) {
                anInt5 = 187;
            }
            int i = -1;
            if (anInt36 != anInt35) {
                i = anIntArray34[anInt35];
                anInt35 = anInt35 + 1 & 0x7f;
            }
            return i;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("34606, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void focusGained(FocusEvent focusevent) {
        aBoolean20 = true;
        aBoolean19 = true;
        method10();
    }

    public void focusLost(FocusEvent focusevent) {
        aBoolean20 = false;
        for (int i = 0; i < 128; i++) {
            anIntArray33[i] = 0;
        }
    }

    public void windowActivated(WindowEvent windowevent) {
    }

    public void windowClosed(WindowEvent windowevent) {
    }

    public void windowClosing(WindowEvent windowevent) {
        destroy();
    }

    public void windowDeactivated(WindowEvent windowevent) {
    }

    public void windowDeiconified(WindowEvent windowevent) {
    }

    public void windowIconified(WindowEvent windowevent) {
    }

    public void windowOpened(WindowEvent windowevent) {
    }

    public void method6() {
    }

    public void method7(byte byte0) {

    }

    public void method8(int i) {

    }

    public void method9(boolean flag) {

    }

    public void method10() {

    }

    public Component getGameFrame() {
        if (gameFrame != null) {
            return gameFrame;
        } else {
            return this;
        }
    }

    public void method12(Runnable runnable, int i) {
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setPriority(i);
    }

    public void updateLoadingBar(String text, int percentage) {
        while (aGraphics15 == null) {
            aGraphics15 = getGameFrame().getGraphics();
            try {
                getGameFrame().repaint();
            } catch (Exception _ex) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception _ex) {
            }
        }
        java.awt.Font font = new java.awt.Font("Helvetica", 1, 13);
        FontMetrics fontmetrics = getGameFrame().getFontMetrics(font);
        java.awt.Font font1 = new java.awt.Font("Helvetica", 0, 13);
        getGameFrame().getFontMetrics(font1);
        if (aBoolean19) {
            aGraphics15.setColor(Color.black);
            aGraphics15.fillRect(0, 0, initialWidth, initialHeight);
            aBoolean19 = false;
        }
        Color color = new Color(140, 17, 17);
        int k = initialHeight / 2 - 18;
        aGraphics15.setColor(color);
        aGraphics15.drawRect(initialWidth / 2 - 152, k, 304, 34);
        aGraphics15.fillRect(initialWidth / 2 - 150, k + 2, percentage * 3, 30);
        aGraphics15.setColor(Color.black);
        aGraphics15.fillRect((initialWidth / 2 - 150) + percentage * 3, k + 2, 300 - percentage * 3, 30);
        aGraphics15.setFont(font);
        aGraphics15.setColor(Color.white);
        aGraphics15.drawString(text, (initialWidth - fontmetrics.stringWidth(text)) / 2, k + 22);
    }
}
