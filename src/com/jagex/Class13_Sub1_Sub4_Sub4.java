package com.jagex;

import java.awt.*;
import java.awt.image.PixelGrabber;

import com.jagex.sign.Signlink;

public class Class13_Sub1_Sub4_Sub4 extends Class13_Sub1_Sub4
{

    public int anInt1675;
    public boolean aBoolean1676;
    public byte aByte1677;
    public int anInt1678;
    public boolean aBoolean1679;
    public int anIntArray1680[];
    public int anInt1681;
    public int anInt1682;
    public int anInt1683;
    public int anInt1684;
    public int anInt1685;
    public int anInt1686;

    public Class13_Sub1_Sub4_Sub4(int i, int j)
    {
        anInt1675 = 47637;
        aBoolean1676 = false;
        aByte1677 = 6;
        anInt1678 = 834;
        aBoolean1679 = false;
        anIntArray1680 = new int[i * j];
        anInt1681 = anInt1685 = i;
        anInt1682 = anInt1686 = j;
        anInt1683 = anInt1684 = 0;
    }

    public Class13_Sub1_Sub4_Sub4(byte abyte0[], Component component)
    {
        anInt1675 = 47637;
        aBoolean1676 = false;
        aByte1677 = 6;
        anInt1678 = 834;
        aBoolean1679 = false;
        try
        {
            Image image = Toolkit.getDefaultToolkit().createImage(abyte0);
            MediaTracker mediatracker = new MediaTracker(component);
            mediatracker.addImage(image, 0);
            mediatracker.waitForAll();
            anInt1681 = image.getWidth(component);
            anInt1682 = image.getHeight(component);
            anInt1685 = anInt1681;
            anInt1686 = anInt1682;
            anInt1683 = 0;
            anInt1684 = 0;
            anIntArray1680 = new int[anInt1681 * anInt1682];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1681, anInt1682, anIntArray1680, 0, anInt1681);
            pixelgrabber.grabPixels();
            return;
        }
        catch(Exception _ex)
        {
            System.out.println("Error converting jpg");
        }
    }

    public Class13_Sub1_Sub4_Sub4(Class1 class1, String s, int i)
    {
        anInt1675 = 47637;
        aBoolean1676 = false;
        aByte1677 = 6;
        anInt1678 = 834;
        aBoolean1679 = false;
        Class13_Sub1_Sub2 class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, class1.method149(s + ".dat", null));
        Class13_Sub1_Sub2 class13_sub1_sub2_1 = new Class13_Sub1_Sub2(-351, class1.method149("index.dat", null));
        class13_sub1_sub2_1.position = class13_sub1_sub2.readUnsignedShort();
        anInt1685 = class13_sub1_sub2_1.readUnsignedShort();
        anInt1686 = class13_sub1_sub2_1.readUnsignedShort();
        int j = class13_sub1_sub2_1.readUnsignedByte();
        int ai[] = new int[j];
        for(int k = 0; k < j - 1; k++)
        {
            ai[k + 1] = class13_sub1_sub2_1.method315();
            if(ai[k + 1] == 0)
            {
                ai[k + 1] = 1;
            }
        }
        for(int l = 0; l < i; l++)
        {
            class13_sub1_sub2_1.position += 2;
            class13_sub1_sub2.position += class13_sub1_sub2_1.readUnsignedShort() * class13_sub1_sub2_1.readUnsignedShort();
            class13_sub1_sub2_1.position++;
        }
        anInt1683 = class13_sub1_sub2_1.readUnsignedByte();
        anInt1684 = class13_sub1_sub2_1.readUnsignedByte();
        anInt1681 = class13_sub1_sub2_1.readUnsignedShort();
        anInt1682 = class13_sub1_sub2_1.readUnsignedShort();
        int i1 = class13_sub1_sub2_1.readUnsignedByte();
        int j1 = anInt1681 * anInt1682;
        anIntArray1680 = new int[j1];
        if(i1 == 0)
        {
            for(int k1 = 0; k1 < j1; k1++)
            {
                anIntArray1680[k1] = ai[class13_sub1_sub2.readUnsignedByte()];
            }
            return;
        }
        if(i1 == 1)
        {
            for(int l1 = 0; l1 < anInt1681; l1++)
            {
                for(int i2 = 0; i2 < anInt1682; i2++)
                {
                    anIntArray1680[l1 + i2 * anInt1681] = ai[class13_sub1_sub2.readUnsignedByte()];
                }
            }
        }
    }

    public void method403(boolean flag)
    {
        try
        {
            if(flag)
            {
                aBoolean1679 = !aBoolean1679;
            }
            Class13_Sub1_Sub4.method351(0, anIntArray1680, anInt1682, anInt1681);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("37582, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method404(int i, int j, byte byte0, int k)
    {
        try
        {
            for(int l = 0; l < anIntArray1680.length; l++)
            {
                int i1 = anIntArray1680[l];
                if(i1 != 0)
                {
                    int j1 = i1 >> 16 & 0xff;
                    j1 += j;
                    if(j1 < 1)
                    {
                        j1 = 1;
                    } else
                    if(j1 > 255)
                    {
                        j1 = 255;
                    }
                    int k1 = i1 >> 8 & 0xff;
                    k1 += i;
                    if(k1 < 1)
                    {
                        k1 = 1;
                    } else
                    if(k1 > 255)
                    {
                        k1 = 255;
                    }
                    int l1 = i1 & 0xff;
                    l1 += k;
                    if(l1 < 1)
                    {
                        l1 = 1;
                    } else
                    if(l1 > 255)
                    {
                        l1 = 255;
                    }
                    anIntArray1680[l] = (j1 << 16) + (k1 << 8) + l1;
                }
            }
            if(byte0 != aByte1677)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("30401, " + i + ", " + j + ", " + byte0 + ", " + k + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method405(int i)
    {
        try
        {
            if(i <= 0)
            {
                aBoolean1679 = !aBoolean1679;
            }
            int ai[] = new int[anInt1685 * anInt1686];
            for(int j = 0; j < anInt1682; j++)
            {
                for(int k = 0; k < anInt1681; k++)
                {
                    ai[(j + anInt1684) * anInt1685 + (k + anInt1683)] = anIntArray1680[j * anInt1681 + k];
                }
            }
            anIntArray1680 = ai;
            anInt1681 = anInt1685;
            anInt1682 = anInt1686;
            anInt1683 = 0;
            anInt1684 = 0;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("26341, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method406(int i, int j, int k)
    {
        try
        {
            i += anInt1683;
            j += anInt1684;
            int l = i + j * Class13_Sub1_Sub4.anInt1424;
            int i1 = 0;
            int j1 = anInt1682;
            int k1 = anInt1681;
            int l1 = Class13_Sub1_Sub4.anInt1424 - k1;
            int i2 = 0;
            if(j < Class13_Sub1_Sub4.anInt1426)
            {
                int j2 = Class13_Sub1_Sub4.anInt1426 - j;
                j1 -= j2;
                j = Class13_Sub1_Sub4.anInt1426;
                i1 += j2 * k1;
                l += j2 * Class13_Sub1_Sub4.anInt1424;
            }
            if(j + j1 > Class13_Sub1_Sub4.anInt1427)
            {
                j1 -= (j + j1) - Class13_Sub1_Sub4.anInt1427;
            }
            if(i < Class13_Sub1_Sub4.anInt1428)
            {
                int k2 = Class13_Sub1_Sub4.anInt1428 - i;
                k1 -= k2;
                i = Class13_Sub1_Sub4.anInt1428;
                i1 += k2;
                l += k2;
                i2 += k2;
                l1 += k2;
            }
            if(i + k1 > Class13_Sub1_Sub4.anInt1429)
            {
                int l2 = (i + k1) - Class13_Sub1_Sub4.anInt1429;
                k1 -= l2;
                i2 += l2;
                l1 += l2;
            }
            if(k1 <= 0 || j1 <= 0)
            {
                return;
            }
            method407(l, i2, l1, j1, k1, i1, anIntArray1680, 5, Class13_Sub1_Sub4.anIntArray1423);
            if(k <= 0)
            {
                anInt1678 = 287;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("27980, " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method407(int i, int j, int k, int l, int i1, int j1, int ai[],
            int k1, int ai1[])
    {
        try
        {
            int l1 = -(i1 >> 2);
            i1 = -(i1 & 3);
            if(k1 != 5)
            {
                return;
            }
            for(int i2 = -l; i2 < 0; i2++)
            {
                for(int j2 = l1; j2 < 0; j2++)
                {
                    ai1[i++] = ai[j1++];
                    ai1[i++] = ai[j1++];
                    ai1[i++] = ai[j1++];
                    ai1[i++] = ai[j1++];
                }
                for(int k2 = i1; k2 < 0; k2++)
                {
                    ai1[i++] = ai[j1++];
                }
                i += k;
                j1 += j;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("43532, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + ai + ", " + k1 + ", " + ai1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method408(int i, byte byte0, int j)
    {
        try
        {
            j += anInt1683;
            if(byte0 != 83)
            {
                for(int k = 1; k > 0; k++)
                {
                }
            }
            i += anInt1684;
            int l = j + i * Class13_Sub1_Sub4.anInt1424;
            int i1 = 0;
            int j1 = anInt1682;
            int k1 = anInt1681;
            int l1 = Class13_Sub1_Sub4.anInt1424 - k1;
            int i2 = 0;
            if(i < Class13_Sub1_Sub4.anInt1426)
            {
                int j2 = Class13_Sub1_Sub4.anInt1426 - i;
                j1 -= j2;
                i = Class13_Sub1_Sub4.anInt1426;
                i1 += j2 * k1;
                l += j2 * Class13_Sub1_Sub4.anInt1424;
            }
            if(i + j1 > Class13_Sub1_Sub4.anInt1427)
            {
                j1 -= (i + j1) - Class13_Sub1_Sub4.anInt1427;
            }
            if(j < Class13_Sub1_Sub4.anInt1428)
            {
                int k2 = Class13_Sub1_Sub4.anInt1428 - j;
                k1 -= k2;
                j = Class13_Sub1_Sub4.anInt1428;
                i1 += k2;
                l += k2;
                i2 += k2;
                l1 += k2;
            }
            if(j + k1 > Class13_Sub1_Sub4.anInt1429)
            {
                int l2 = (j + k1) - Class13_Sub1_Sub4.anInt1429;
                k1 -= l2;
                i2 += l2;
                l1 += l2;
            }
            if(k1 <= 0 || j1 <= 0)
            {
                return;
            } else
            {
                method409(Class13_Sub1_Sub4.anIntArray1423, anIntArray1680, 0, i1, l, k1, j1, l1, i2);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("64924, " + i + ", " + byte0 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method409(int ai[], int ai1[], int i, int j, int k, int l, int i1,
            int j1, int k1)
    {
        int l1 = -(l >> 2);
        l = -(l & 3);
        for(int i2 = -i1; i2 < 0; i2++)
        {
            for(int j2 = l1; j2 < 0; j2++)
            {
                i = ai1[j++];
                if(i != 0)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
                i = ai1[j++];
                if(i != 0)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
                i = ai1[j++];
                if(i != 0)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
                i = ai1[j++];
                if(i != 0)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
            }
            for(int k2 = l; k2 < 0; k2++)
            {
                i = ai1[j++];
                if(i != 0)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
            }
            k += j1;
            j += k1;
        }
    }

    public void method410(int i, int j, int k, int l)
    {
        try
        {
            i += anInt1683;
            l += anInt1684;
            int i1 = i + l * Class13_Sub1_Sub4.anInt1424;
            int j1 = 0;
            if(j < 8 || j > 8)
            {
                for(int k1 = 1; k1 > 0; k1++)
                {
                }
            }
            int l1 = anInt1682;
            int i2 = anInt1681;
            int j2 = Class13_Sub1_Sub4.anInt1424 - i2;
            int k2 = 0;
            if(l < Class13_Sub1_Sub4.anInt1426)
            {
                int l2 = Class13_Sub1_Sub4.anInt1426 - l;
                l1 -= l2;
                l = Class13_Sub1_Sub4.anInt1426;
                j1 += l2 * i2;
                i1 += l2 * Class13_Sub1_Sub4.anInt1424;
            }
            if(l + l1 > Class13_Sub1_Sub4.anInt1427)
            {
                l1 -= (l + l1) - Class13_Sub1_Sub4.anInt1427;
            }
            if(i < Class13_Sub1_Sub4.anInt1428)
            {
                int i3 = Class13_Sub1_Sub4.anInt1428 - i;
                i2 -= i3;
                i = Class13_Sub1_Sub4.anInt1428;
                j1 += i3;
                i1 += i3;
                k2 += i3;
                j2 += i3;
            }
            if(i + i2 > Class13_Sub1_Sub4.anInt1429)
            {
                int j3 = (i + i2) - Class13_Sub1_Sub4.anInt1429;
                i2 -= j3;
                k2 += j3;
                j2 += j3;
            }
            if(i2 <= 0 || l1 <= 0)
            {
                return;
            } else
            {
                method411(true, i2, l1, anIntArray1680, j2, k2, k, 0, i1, Class13_Sub1_Sub4.anIntArray1423, j1);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("59902, " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method411(boolean flag, int i, int j, int ai[], int k, int l, int i1,
            int j1, int k1, int ai1[], int l1)
    {
        try
        {
            int i2 = 256 - i1;
            if(!flag)
            {
                return;
            }
            for(int j2 = -j; j2 < 0; j2++)
            {
                for(int k2 = -i; k2 < 0; k2++)
                {
                    j1 = ai[l1++];
                    if(j1 != 0)
                    {
                        int l2 = ai1[k1];
                        ai1[k1++] = ((j1 & 0xff00ff) * i1 + (l2 & 0xff00ff) * i2 & 0xff00ff00) + ((j1 & 0xff00) * i1 + (l2 & 0xff00) * i2 & 0xff0000) >> 8;
                    } else
                    {
                        k1++;
                    }
                }
                k1 += k;
                l1 += l;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("60837, " + flag + ", " + i + ", " + j + ", " + ai + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + ai1 + ", " + l1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method412(int ai[], int ai1[], int i, int j, int k, int l, int i1,
            int j1, int k1, int l1, int i2)
    {
        try
        {
            if(i2 >= 0)
            {
                aBoolean1676 = !aBoolean1676;
            }
            try
            {
                int j2 = -i1 / 2;
                int k2 = -i / 2;
                int l2 = (int)(Math.sin((double)l / 326.11000000000001D) * 65536D);
                int i3 = (int)(Math.cos((double)l / 326.11000000000001D) * 65536D);
                l2 = l2 * j >> 8;
                i3 = i3 * j >> 8;
                int j3 = (k1 << 16) + (k2 * l2 + j2 * i3);
                int k3 = (j1 << 16) + (k2 * i3 - j2 * l2);
                int l3 = k + l1 * Class13_Sub1_Sub4.anInt1424;
                for(l1 = 0; l1 < i; l1++)
                {
                    int i4 = ai[l1];
                    int j4 = l3 + i4;
                    int k4 = j3 + i3 * i4;
                    int l4 = k3 - l2 * i4;
                    for(k = -ai1[l1]; k < 0; k++)
                    {
                        Class13_Sub1_Sub4.anIntArray1423[j4++] = anIntArray1680[(k4 >> 16) + (l4 >> 16) * anInt1681];
                        k4 += i3;
                        l4 -= l2;
                    }
                    j3 += l2;
                    k3 += i3;
                    l3 += Class13_Sub1_Sub4.anInt1424;
                }
                return;
            }
            catch(Exception _ex)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("32703, " + ai + ", " + ai1 + ", " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + i2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method413(int i, int j, int k, int l, int i1, double d,
            byte byte0, int j1, int k1)
    {
        try
        {
            if(byte0 != -98)
            {
                return;
            }
            try
            {
                int l1 = -j / 2;
                int i2 = -i1 / 2;
                int j2 = (int)(Math.sin(d) * 65536D);
                int k2 = (int)(Math.cos(d) * 65536D);
                j2 = j2 * i >> 8;
                k2 = k2 * i >> 8;
                int l2 = (l << 16) + (i2 * j2 + l1 * k2);
                int i3 = (k << 16) + (i2 * k2 - l1 * j2);
                int j3 = k1 + j1 * Class13_Sub1_Sub4.anInt1424;
                for(j1 = 0; j1 < i1; j1++)
                {
                    int k3 = j3;
                    int l3 = l2;
                    int i4 = i3;
                    for(k1 = -j; k1 < 0; k1++)
                    {
                        int j4 = anIntArray1680[(l3 >> 16) + (i4 >> 16) * anInt1681];
                        if(j4 != 0)
                        {
                            Class13_Sub1_Sub4.anIntArray1423[k3++] = j4;
                        } else
                        {
                            k3++;
                        }
                        l3 += k2;
                        i4 -= j2;
                    }
                    l2 += j2;
                    i3 += k2;
                    j3 += Class13_Sub1_Sub4.anInt1424;
                }
                return;
            }
            catch(Exception _ex)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("95668, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + d + ", " + byte0 + ", " + j1 + ", " + k1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method414(int i, int j, Class13_Sub1_Sub4_Sub3 class13_sub1_sub4_sub3, byte byte0)
    {
        try
        {
            j += anInt1683;
            i += anInt1684;
            int k = j + i * Class13_Sub1_Sub4.anInt1424;
            int l = 0;
            int i1 = anInt1682;
            int j1 = anInt1681;
            int k1 = Class13_Sub1_Sub4.anInt1424 - j1;
            int l1 = 0;
            if(byte0 == 6)
            {
                byte0 = 0;
            } else
            {
                anInt1675 = 447;
            }
            if(i < Class13_Sub1_Sub4.anInt1426)
            {
                int i2 = Class13_Sub1_Sub4.anInt1426 - i;
                i1 -= i2;
                i = Class13_Sub1_Sub4.anInt1426;
                l += i2 * j1;
                k += i2 * Class13_Sub1_Sub4.anInt1424;
            }
            if(i + i1 > Class13_Sub1_Sub4.anInt1427)
            {
                i1 -= (i + i1) - Class13_Sub1_Sub4.anInt1427;
            }
            if(j < Class13_Sub1_Sub4.anInt1428)
            {
                int j2 = Class13_Sub1_Sub4.anInt1428 - j;
                j1 -= j2;
                j = Class13_Sub1_Sub4.anInt1428;
                l += j2;
                k += j2;
                l1 += j2;
                k1 += j2;
            }
            if(j + j1 > Class13_Sub1_Sub4.anInt1429)
            {
                int k2 = (j + j1) - Class13_Sub1_Sub4.anInt1429;
                j1 -= k2;
                l1 += k2;
                k1 += k2;
            }
            if(j1 <= 0 || i1 <= 0)
            {
                return;
            } else
            {
                method415(l, 0, class13_sub1_sub4_sub3.aByteArray1667, i1, 381, l1, k, k1, j1, anIntArray1680, Class13_Sub1_Sub4.anIntArray1423);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("30777, " + i + ", " + j + ", " + class13_sub1_sub4_sub3 + ", " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method415(int i, int j, byte abyte0[], int k, int l, int i1, int j1,
            int k1, int l1, int ai[], int ai1[])
    {
        try
        {
            int i2 = -(l1 >> 2);
            l1 = -(l1 & 3);
            for(int j2 = -k; j2 < 0; j2++)
            {
                for(int k2 = i2; k2 < 0; k2++)
                {
                    j = ai[i++];
                    if(j != 0 && abyte0[j1] == 0)
                    {
                        ai1[j1++] = j;
                    } else
                    {
                        j1++;
                    }
                    j = ai[i++];
                    if(j != 0 && abyte0[j1] == 0)
                    {
                        ai1[j1++] = j;
                    } else
                    {
                        j1++;
                    }
                    j = ai[i++];
                    if(j != 0 && abyte0[j1] == 0)
                    {
                        ai1[j1++] = j;
                    } else
                    {
                        j1++;
                    }
                    j = ai[i++];
                    if(j != 0 && abyte0[j1] == 0)
                    {
                        ai1[j1++] = j;
                    } else
                    {
                        j1++;
                    }
                }
                for(int l2 = l1; l2 < 0; l2++)
                {
                    j = ai[i++];
                    if(j != 0 && abyte0[j1] == 0)
                    {
                        ai1[j1++] = j;
                    } else
                    {
                        j1++;
                    }
                }
                j1 += k1;
                i += i1;
            }
            l = 27 / l;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("34859, " + i + ", " + j + ", " + abyte0 + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + ai + ", " + ai1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
