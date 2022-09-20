package com.jagex;

import com.jagex.sign.Signlink;

public class Class39
{

    public int anInt671;
    public boolean aBoolean672;
    public boolean aBoolean673;
    public boolean aBoolean674;
    public boolean aBoolean675;
    public int anInt676;
    public boolean aBoolean677;
    public int anInt678;
    public int anInt679;
    public int anInt680;
    public int anInt681;
    public int anIntArrayArray682[][];

    public Class39(int i, int j, int k)
    {
        anInt671 = 36;
        aBoolean672 = true;
        aBoolean673 = true;
        aBoolean674 = true;
        aBoolean675 = false;
        anInt676 = -965;
        aBoolean677 = false;
        try
        {
            anInt678 = 0;
            anInt679 = 0;
            anInt680 = j;
            anInt681 = k;
            anIntArrayArray682 = new int[anInt680][anInt681];
            method516();
            i = 77 / i;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("90336, " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method516()
    {
        for(int i = 0; i < anInt680; i++)
        {
            for(int j = 0; j < anInt681; j++)
            {
                if(i == 0 || j == 0 || i == anInt680 - 1 || j == anInt681 - 1)
                {
                    anIntArrayArray682[i][j] = 0xffffff;
                } else
                {
                    anIntArrayArray682[i][j] = 0x1000000;
                }
            }
        }
    }

    public void method517(int i, int j, boolean flag, int k, int l, int i1)
    {
        try
        {
            k -= anInt678;
            i -= anInt679;
            if(l <= 0)
            {
                return;
            }
            if(j == 0)
            {
                if(i1 == 0)
                {
                    method520(k, i, 128);
                    method520(k - 1, i, 8);
                }
                if(i1 == 1)
                {
                    method520(k, i, 2);
                    method520(k, i + 1, 32);
                }
                if(i1 == 2)
                {
                    method520(k, i, 8);
                    method520(k + 1, i, 128);
                }
                if(i1 == 3)
                {
                    method520(k, i, 32);
                    method520(k, i - 1, 2);
                }
            }
            if(j == 1 || j == 3)
            {
                if(i1 == 0)
                {
                    method520(k, i, 1);
                    method520(k - 1, i + 1, 16);
                }
                if(i1 == 1)
                {
                    method520(k, i, 4);
                    method520(k + 1, i + 1, 64);
                }
                if(i1 == 2)
                {
                    method520(k, i, 16);
                    method520(k + 1, i - 1, 1);
                }
                if(i1 == 3)
                {
                    method520(k, i, 64);
                    method520(k - 1, i - 1, 4);
                }
            }
            if(j == 2)
            {
                if(i1 == 0)
                {
                    method520(k, i, 130);
                    method520(k - 1, i, 8);
                    method520(k, i + 1, 32);
                }
                if(i1 == 1)
                {
                    method520(k, i, 10);
                    method520(k, i + 1, 32);
                    method520(k + 1, i, 128);
                }
                if(i1 == 2)
                {
                    method520(k, i, 40);
                    method520(k + 1, i, 128);
                    method520(k, i - 1, 2);
                }
                if(i1 == 3)
                {
                    method520(k, i, 160);
                    method520(k, i - 1, 2);
                    method520(k - 1, i, 8);
                }
            }
            if(flag)
            {
                if(j == 0)
                {
                    if(i1 == 0)
                    {
                        method520(k, i, 0x10000);
                        method520(k - 1, i, 4096);
                    }
                    if(i1 == 1)
                    {
                        method520(k, i, 1024);
                        method520(k, i + 1, 16384);
                    }
                    if(i1 == 2)
                    {
                        method520(k, i, 4096);
                        method520(k + 1, i, 0x10000);
                    }
                    if(i1 == 3)
                    {
                        method520(k, i, 16384);
                        method520(k, i - 1, 1024);
                    }
                }
                if(j == 1 || j == 3)
                {
                    if(i1 == 0)
                    {
                        method520(k, i, 512);
                        method520(k - 1, i + 1, 8192);
                    }
                    if(i1 == 1)
                    {
                        method520(k, i, 2048);
                        method520(k + 1, i + 1, 32768);
                    }
                    if(i1 == 2)
                    {
                        method520(k, i, 8192);
                        method520(k + 1, i - 1, 512);
                    }
                    if(i1 == 3)
                    {
                        method520(k, i, 32768);
                        method520(k - 1, i - 1, 2048);
                    }
                }
                if(j == 2)
                {
                    if(i1 == 0)
                    {
                        method520(k, i, 0x10400);
                        method520(k - 1, i, 4096);
                        method520(k, i + 1, 16384);
                    }
                    if(i1 == 1)
                    {
                        method520(k, i, 5120);
                        method520(k, i + 1, 16384);
                        method520(k + 1, i, 0x10000);
                    }
                    if(i1 == 2)
                    {
                        method520(k, i, 20480);
                        method520(k + 1, i, 0x10000);
                        method520(k, i - 1, 1024);
                    }
                    if(i1 == 3)
                    {
                        method520(k, i, 0x14000);
                        method520(k, i - 1, 1024);
                        method520(k - 1, i, 4096);
                        return;
                    }
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("94763, " + i + ", " + j + ", " + flag + ", " + k + ", " + l + ", " + i1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method518(int i, boolean flag, int j, int k, int l, byte byte0, int i1)
    {
        try
        {
            int j1 = 256;
            if(flag)
            {
                j1 += 0x20000;
            }
            l -= anInt678;
            if(byte0 != -63)
            {
                aBoolean672 = !aBoolean672;
            }
            i1 -= anInt679;
            if(i == 1 || i == 3)
            {
                int k1 = k;
                k = j;
                j = k1;
            }
            for(int l1 = l; l1 < l + k; l1++)
            {
                if(l1 >= 0 && l1 < anInt680)
                {
                    for(int i2 = i1; i2 < i1 + j; i2++)
                    {
                        if(i2 >= 0 && i2 < anInt681)
                        {
                            method520(l1, i2, j1);
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("54614, " + i + ", " + flag + ", " + j + ", " + k + ", " + l + ", " + byte0 + ", " + i1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method519(int i, int j, boolean flag)
    {
        try
        {
            j -= anInt678;
            i -= anInt679;
            if(!flag)
            {
                return;
            } else
            {
                anIntArrayArray682[j][i] |= 0x200000;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("30201, " + i + ", " + j + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method520(int i, int j, int k)
    {
        anIntArrayArray682[i][j] |= k;
    }

    public void method521(boolean flag, int i, int j, int k, int l, boolean flag1)
    {
        try
        {
            l -= anInt678;
            j -= anInt679;
            if(!flag)
            {
                aBoolean672 = !aBoolean672;
            }
            if(k == 0)
            {
                if(i == 0)
                {
                    method523(l, 128, j, false);
                    method523(l - 1, 8, j, false);
                }
                if(i == 1)
                {
                    method523(l, 2, j, false);
                    method523(l, 32, j + 1, false);
                }
                if(i == 2)
                {
                    method523(l, 8, j, false);
                    method523(l + 1, 128, j, false);
                }
                if(i == 3)
                {
                    method523(l, 32, j, false);
                    method523(l, 2, j - 1, false);
                }
            }
            if(k == 1 || k == 3)
            {
                if(i == 0)
                {
                    method523(l, 1, j, false);
                    method523(l - 1, 16, j + 1, false);
                }
                if(i == 1)
                {
                    method523(l, 4, j, false);
                    method523(l + 1, 64, j + 1, false);
                }
                if(i == 2)
                {
                    method523(l, 16, j, false);
                    method523(l + 1, 1, j - 1, false);
                }
                if(i == 3)
                {
                    method523(l, 64, j, false);
                    method523(l - 1, 4, j - 1, false);
                }
            }
            if(k == 2)
            {
                if(i == 0)
                {
                    method523(l, 130, j, false);
                    method523(l - 1, 8, j, false);
                    method523(l, 32, j + 1, false);
                }
                if(i == 1)
                {
                    method523(l, 10, j, false);
                    method523(l, 32, j + 1, false);
                    method523(l + 1, 128, j, false);
                }
                if(i == 2)
                {
                    method523(l, 40, j, false);
                    method523(l + 1, 128, j, false);
                    method523(l, 2, j - 1, false);
                }
                if(i == 3)
                {
                    method523(l, 160, j, false);
                    method523(l, 2, j - 1, false);
                    method523(l - 1, 8, j, false);
                }
            }
            if(flag1)
            {
                if(k == 0)
                {
                    if(i == 0)
                    {
                        method523(l, 0x10000, j, false);
                        method523(l - 1, 4096, j, false);
                    }
                    if(i == 1)
                    {
                        method523(l, 1024, j, false);
                        method523(l, 16384, j + 1, false);
                    }
                    if(i == 2)
                    {
                        method523(l, 4096, j, false);
                        method523(l + 1, 0x10000, j, false);
                    }
                    if(i == 3)
                    {
                        method523(l, 16384, j, false);
                        method523(l, 1024, j - 1, false);
                    }
                }
                if(k == 1 || k == 3)
                {
                    if(i == 0)
                    {
                        method523(l, 512, j, false);
                        method523(l - 1, 8192, j + 1, false);
                    }
                    if(i == 1)
                    {
                        method523(l, 2048, j, false);
                        method523(l + 1, 32768, j + 1, false);
                    }
                    if(i == 2)
                    {
                        method523(l, 8192, j, false);
                        method523(l + 1, 512, j - 1, false);
                    }
                    if(i == 3)
                    {
                        method523(l, 32768, j, false);
                        method523(l - 1, 2048, j - 1, false);
                    }
                }
                if(k == 2)
                {
                    if(i == 0)
                    {
                        method523(l, 0x10400, j, false);
                        method523(l - 1, 4096, j, false);
                        method523(l, 16384, j + 1, false);
                    }
                    if(i == 1)
                    {
                        method523(l, 5120, j, false);
                        method523(l, 16384, j + 1, false);
                        method523(l + 1, 0x10000, j, false);
                    }
                    if(i == 2)
                    {
                        method523(l, 20480, j, false);
                        method523(l + 1, 0x10000, j, false);
                        method523(l, 1024, j - 1, false);
                    }
                    if(i == 3)
                    {
                        method523(l, 0x14000, j, false);
                        method523(l, 1024, j - 1, false);
                        method523(l - 1, 4096, j, false);
                        return;
                    }
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("62320, " + flag + ", " + i + ", " + j + ", " + k + ", " + l + ", " + flag1 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method522(int i, int j, int k, boolean flag, int l, int i1, int j1)
    {
        try
        {
            int k1 = 256;
            if(flag)
            {
                k1 += 0x20000;
            }
            i -= anInt678;
            if(i1 != 6)
            {
                return;
            }
            j1 -= anInt679;
            if(k == 1 || k == 3)
            {
                int l1 = l;
                l = j;
                j = l1;
            }
            for(int i2 = i; i2 < i + l; i2++)
            {
                if(i2 >= 0 && i2 < anInt680)
                {
                    for(int j2 = j1; j2 < j1 + j; j2++)
                    {
                        if(j2 >= 0 && j2 < anInt681)
                        {
                            method523(i2, k1, j2, false);
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("85000, " + i + ", " + j + ", " + k + ", " + flag + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method523(int i, int j, int k, boolean flag)
    {
        try
        {
            anIntArrayArray682[i][k] &= 0xffffff - j;
            if(flag)
            {
                aBoolean673 = !aBoolean673;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("2471, " + i + ", " + j + ", " + k + ", " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method524(int i, boolean flag, int j)
    {
        try
        {
            i -= anInt678;
            j -= anInt679;
            if(!flag)
            {
                aBoolean673 = !aBoolean673;
            }
            anIntArrayArray682[i][j] &= 0xdfffff;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("933, " + i + ", " + flag + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method525(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        try
        {
            if(l == i && j == k)
            {
                return true;
            }
            l -= anInt678;
            j -= anInt679;
            i1 = 39 / i1;
            i -= anInt678;
            k -= anInt679;
            if(k1 == 0)
            {
                if(j1 == 0)
                {
                    if(l == i - 1 && j == k)
                    {
                        return true;
                    }
                    if(l == i && j == k + 1 && (anIntArrayArray682[l][j] & 0x1280120) == 0)
                    {
                        return true;
                    }
                    if(l == i && j == k - 1 && (anIntArrayArray682[l][j] & 0x1280102) == 0)
                    {
                        return true;
                    }
                } else
                if(j1 == 1)
                {
                    if(l == i && j == k + 1)
                    {
                        return true;
                    }
                    if(l == i - 1 && j == k && (anIntArrayArray682[l][j] & 0x1280108) == 0)
                    {
                        return true;
                    }
                    if(l == i + 1 && j == k && (anIntArrayArray682[l][j] & 0x1280180) == 0)
                    {
                        return true;
                    }
                } else
                if(j1 == 2)
                {
                    if(l == i + 1 && j == k)
                    {
                        return true;
                    }
                    if(l == i && j == k + 1 && (anIntArrayArray682[l][j] & 0x1280120) == 0)
                    {
                        return true;
                    }
                    if(l == i && j == k - 1 && (anIntArrayArray682[l][j] & 0x1280102) == 0)
                    {
                        return true;
                    }
                } else
                if(j1 == 3)
                {
                    if(l == i && j == k - 1)
                    {
                        return true;
                    }
                    if(l == i - 1 && j == k && (anIntArrayArray682[l][j] & 0x1280108) == 0)
                    {
                        return true;
                    }
                    if(l == i + 1 && j == k && (anIntArrayArray682[l][j] & 0x1280180) == 0)
                    {
                        return true;
                    }
                }
            }
            if(k1 == 2)
            {
                if(j1 == 0)
                {
                    if(l == i - 1 && j == k)
                    {
                        return true;
                    }
                    if(l == i && j == k + 1)
                    {
                        return true;
                    }
                    if(l == i + 1 && j == k && (anIntArrayArray682[l][j] & 0x1280180) == 0)
                    {
                        return true;
                    }
                    if(l == i && j == k - 1 && (anIntArrayArray682[l][j] & 0x1280102) == 0)
                    {
                        return true;
                    }
                } else
                if(j1 == 1)
                {
                    if(l == i - 1 && j == k && (anIntArrayArray682[l][j] & 0x1280108) == 0)
                    {
                        return true;
                    }
                    if(l == i && j == k + 1)
                    {
                        return true;
                    }
                    if(l == i + 1 && j == k)
                    {
                        return true;
                    }
                    if(l == i && j == k - 1 && (anIntArrayArray682[l][j] & 0x1280102) == 0)
                    {
                        return true;
                    }
                } else
                if(j1 == 2)
                {
                    if(l == i - 1 && j == k && (anIntArrayArray682[l][j] & 0x1280108) == 0)
                    {
                        return true;
                    }
                    if(l == i && j == k + 1 && (anIntArrayArray682[l][j] & 0x1280120) == 0)
                    {
                        return true;
                    }
                    if(l == i + 1 && j == k)
                    {
                        return true;
                    }
                    if(l == i && j == k - 1)
                    {
                        return true;
                    }
                } else
                if(j1 == 3)
                {
                    if(l == i - 1 && j == k)
                    {
                        return true;
                    }
                    if(l == i && j == k + 1 && (anIntArrayArray682[l][j] & 0x1280120) == 0)
                    {
                        return true;
                    }
                    if(l == i + 1 && j == k && (anIntArrayArray682[l][j] & 0x1280180) == 0)
                    {
                        return true;
                    }
                    if(l == i && j == k - 1)
                    {
                        return true;
                    }
                }
            }
            if(k1 == 9)
            {
                if(l == i && j == k + 1 && (anIntArrayArray682[l][j] & 0x20) == 0)
                {
                    return true;
                }
                if(l == i && j == k - 1 && (anIntArrayArray682[l][j] & 2) == 0)
                {
                    return true;
                }
                if(l == i - 1 && j == k && (anIntArrayArray682[l][j] & 8) == 0)
                {
                    return true;
                }
                if(l == i + 1 && j == k && (anIntArrayArray682[l][j] & 0x80) == 0)
                {
                    return true;
                }
            }
            return false;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("50749, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method526(int i, int j, int k, int l, int i1, int j1, boolean flag)
    {
        try
        {
            if(!flag)
            {
                aBoolean674 = !aBoolean674;
            }
            if(j == i && i1 == j1)
            {
                return true;
            }
            j -= anInt678;
            i1 -= anInt679;
            i -= anInt678;
            j1 -= anInt679;
            if(l == 6 || l == 7)
            {
                if(l == 7)
                {
                    k = k + 2 & 3;
                }
                if(k == 0)
                {
                    if(j == i + 1 && i1 == j1 && (anIntArrayArray682[j][i1] & 0x80) == 0)
                    {
                        return true;
                    }
                    if(j == i && i1 == j1 - 1 && (anIntArrayArray682[j][i1] & 2) == 0)
                    {
                        return true;
                    }
                } else
                if(k == 1)
                {
                    if(j == i - 1 && i1 == j1 && (anIntArrayArray682[j][i1] & 8) == 0)
                    {
                        return true;
                    }
                    if(j == i && i1 == j1 - 1 && (anIntArrayArray682[j][i1] & 2) == 0)
                    {
                        return true;
                    }
                } else
                if(k == 2)
                {
                    if(j == i - 1 && i1 == j1 && (anIntArrayArray682[j][i1] & 8) == 0)
                    {
                        return true;
                    }
                    if(j == i && i1 == j1 + 1 && (anIntArrayArray682[j][i1] & 0x20) == 0)
                    {
                        return true;
                    }
                } else
                if(k == 3)
                {
                    if(j == i + 1 && i1 == j1 && (anIntArrayArray682[j][i1] & 0x80) == 0)
                    {
                        return true;
                    }
                    if(j == i && i1 == j1 + 1 && (anIntArrayArray682[j][i1] & 0x20) == 0)
                    {
                        return true;
                    }
                }
            }
            if(l == 8)
            {
                if(j == i && i1 == j1 + 1 && (anIntArrayArray682[j][i1] & 0x20) == 0)
                {
                    return true;
                }
                if(j == i && i1 == j1 - 1 && (anIntArrayArray682[j][i1] & 2) == 0)
                {
                    return true;
                }
                if(j == i - 1 && i1 == j1 && (anIntArrayArray682[j][i1] & 8) == 0)
                {
                    return true;
                }
                if(j == i + 1 && i1 == j1 && (anIntArrayArray682[j][i1] & 0x80) == 0)
                {
                    return true;
                }
            }
            return false;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("81672, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method527(int i, int j, int k, int l, int i1, int j1, int k1,
            int l1)
    {
        try
        {
            if(j1 >= 0)
            {
                throw new NullPointerException();
            }
            int i2 = (k1 + k) - 1;
            int j2 = (j + i) - 1;
            if(l >= k1 && l <= i2 && i1 >= j && i1 <= j2)
            {
                return true;
            }
            if(l == k1 - 1 && i1 >= j && i1 <= j2 && (anIntArrayArray682[l - anInt678][i1 - anInt679] & 8) == 0 && (l1 & 8) == 0)
            {
                return true;
            }
            if(l == i2 + 1 && i1 >= j && i1 <= j2 && (anIntArrayArray682[l - anInt678][i1 - anInt679] & 0x80) == 0 && (l1 & 2) == 0)
            {
                return true;
            }
            if(i1 == j - 1 && l >= k1 && l <= i2 && (anIntArrayArray682[l - anInt678][i1 - anInt679] & 2) == 0 && (l1 & 4) == 0)
            {
                return true;
            }
            return i1 == j2 + 1 && l >= k1 && l <= i2 && (anIntArrayArray682[l - anInt678][i1 - anInt679] & 0x20) == 0 && (l1 & 1) == 0;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("93475, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
