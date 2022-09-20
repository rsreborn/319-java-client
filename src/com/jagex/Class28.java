package com.jagex;

import java.io.*;
import com.jagex.sign.Signlink;

public class Class28
{

    public boolean aBoolean456;
    public static byte aByteArray457[] = new byte[520];
    public RandomAccessFile aRandomAccessFile458;
    public RandomAccessFile aRandomAccessFile459;
    public int anInt460;
    public int anInt461;

    public Class28(int i, int j, int k, RandomAccessFile randomaccessfile, RandomAccessFile randomaccessfile1)
    {
        aBoolean456 = false;
        anInt461 = 65000;
        try
        {
            anInt460 = k;
            aRandomAccessFile458 = randomaccessfile;
            aRandomAccessFile459 = randomaccessfile1;
            i = 92 / i;
            anInt461 = j;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("15737, " + i + ", " + j + ", " + k + ", " + randomaccessfile + ", " + randomaccessfile1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public synchronized byte[] method481(int i, int j)
    {
        try
        {
            if(j != 26421)
            {
                throw new NullPointerException();
            }
            try
            {
                method484(i * 6, aRandomAccessFile459, 492);
                int i1;
                for(int k = 0; k < 6; k += i1)
                {
                    i1 = aRandomAccessFile459.read(aByteArray457, k, 6 - k);
                    if(i1 == -1)
                    {
                        return null;
                    }
                }
                int j1 = ((aByteArray457[0] & 0xff) << 16) + ((aByteArray457[1] & 0xff) << 8) + (aByteArray457[2] & 0xff);
                int k1 = ((aByteArray457[3] & 0xff) << 16) + ((aByteArray457[4] & 0xff) << 8) + (aByteArray457[5] & 0xff);
                if(j1 < 0 || j1 > anInt461)
                {
                    return null;
                }
                if(k1 <= 0 || (long)k1 > aRandomAccessFile458.length() / 520L)
                {
                    return null;
                }
                byte abyte0[] = new byte[j1];
                int l1 = 0;
                for(int i2 = 0; l1 < j1; i2++)
                {
                    if(k1 == 0)
                    {
                        return null;
                    }
                    method484(k1 * 520, aRandomAccessFile458, 492);
                    int l = 0;
                    int j2 = j1 - l1;
                    if(j2 > 512)
                    {
                        j2 = 512;
                    }
                    int k2;
                    for(; l < j2 + 8; l += k2)
                    {
                        k2 = aRandomAccessFile458.read(aByteArray457, l, (j2 + 8) - l);
                        if(k2 == -1)
                        {
                            return null;
                        }
                    }
                    int l2 = ((aByteArray457[0] & 0xff) << 8) + (aByteArray457[1] & 0xff);
                    int i3 = ((aByteArray457[2] & 0xff) << 8) + (aByteArray457[3] & 0xff);
                    int j3 = ((aByteArray457[4] & 0xff) << 16) + ((aByteArray457[5] & 0xff) << 8) + (aByteArray457[6] & 0xff);
                    int k3 = aByteArray457[7] & 0xff;
                    if(l2 != i || i3 != i2 || k3 != anInt460)
                    {
                        return null;
                    }
                    if(j3 < 0 || (long)j3 > aRandomAccessFile458.length() / 520L)
                    {
                        return null;
                    }
                    for(int l3 = 0; l3 < j2; l3++)
                    {
                        abyte0[l1++] = aByteArray457[l3 + 8];
                    }
                    k1 = j3;
                }
                return abyte0;
            }
            catch(IOException _ex)
            {
                return null;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("99939, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public synchronized boolean method482(byte abyte0[], int i, int j, int k)
    {
        try
        {
            boolean flag = method483(j, true, 7, k, abyte0);
            while(i >= 0)
            {
                aBoolean456 = !aBoolean456;
            }
            if(!flag)
            {
                flag = method483(j, false, 7, k, abyte0);
            }
            return flag;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("16765, " + abyte0 + ", " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public synchronized boolean method483(int i, boolean flag, int j, int k, byte abyte0[])
    {
        try
        {
            if(j < 7 || j > 7)
            {
                for(int l = 1; l > 0; l++)
                {
                }
            }
            try
            {
                int i1;
                if(flag)
                {
                    method484(i * 6, aRandomAccessFile459, 492);
                    int l1;
                    for(int j1 = 0; j1 < 6; j1 += l1)
                    {
                        l1 = aRandomAccessFile459.read(aByteArray457, j1, 6 - j1);
                        if(l1 == -1)
                        {
                            return false;
                        }
                    }
                    i1 = ((aByteArray457[3] & 0xff) << 16) + ((aByteArray457[4] & 0xff) << 8) + (aByteArray457[5] & 0xff);
                    if(i1 <= 0 || (long)i1 > aRandomAccessFile458.length() / 520L)
                    {
                        return false;
                    }
                } else
                {
                    i1 = (int)((aRandomAccessFile458.length() + 519L) / 520L);
                    if(i1 == 0)
                    {
                        i1 = 1;
                    }
                }
                aByteArray457[0] = (byte)(k >> 16);
                aByteArray457[1] = (byte)(k >> 8);
                aByteArray457[2] = (byte)k;
                aByteArray457[3] = (byte)(i1 >> 16);
                aByteArray457[4] = (byte)(i1 >> 8);
                aByteArray457[5] = (byte)i1;
                method484(i * 6, aRandomAccessFile459, 492);
                aRandomAccessFile459.write(aByteArray457, 0, 6);
                int k1 = 0;
                for(int i2 = 0; k1 < k; i2++)
                {
                    int j2 = 0;
                    if(flag)
                    {
                        method484(i1 * 520, aRandomAccessFile458, 492);
                        int k2;
                        int i3;
                        for(k2 = 0; k2 < 8; k2 += i3)
                        {
                            i3 = aRandomAccessFile458.read(aByteArray457, k2, 8 - k2);
                            if(i3 == -1)
                            {
                                break;
                            }
                        }
                        if(k2 == 8)
                        {
                            int j3 = ((aByteArray457[0] & 0xff) << 8) + (aByteArray457[1] & 0xff);
                            int k3 = ((aByteArray457[2] & 0xff) << 8) + (aByteArray457[3] & 0xff);
                            j2 = ((aByteArray457[4] & 0xff) << 16) + ((aByteArray457[5] & 0xff) << 8) + (aByteArray457[6] & 0xff);
                            int l3 = aByteArray457[7] & 0xff;
                            if(j3 != i || k3 != i2 || l3 != anInt460)
                            {
                                return false;
                            }
                            if(j2 < 0 || (long)j2 > aRandomAccessFile458.length() / 520L)
                            {
                                return false;
                            }
                        }
                    }
                    if(j2 == 0)
                    {
                        flag = false;
                        j2 = (int)((aRandomAccessFile458.length() + 519L) / 520L);
                        if(j2 == 0)
                        {
                            j2++;
                        }
                        if(j2 == i1)
                        {
                            j2++;
                        }
                    }
                    if(k - k1 <= 512)
                    {
                        j2 = 0;
                    }
                    aByteArray457[0] = (byte)(i >> 8);
                    aByteArray457[1] = (byte)i;
                    aByteArray457[2] = (byte)(i2 >> 8);
                    aByteArray457[3] = (byte)i2;
                    aByteArray457[4] = (byte)(j2 >> 16);
                    aByteArray457[5] = (byte)(j2 >> 8);
                    aByteArray457[6] = (byte)j2;
                    aByteArray457[7] = (byte)anInt460;
                    method484(i1 * 520, aRandomAccessFile458, 492);
                    aRandomAccessFile458.write(aByteArray457, 0, 8);
                    int l2 = k - k1;
                    if(l2 > 512)
                    {
                        l2 = 512;
                    }
                    aRandomAccessFile458.write(abyte0, k1, l2);
                    k1 += l2;
                    i1 = j2;
                }
                return true;
            }
            catch(IOException _ex)
            {
                return false;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("90224, " + i + ", " + flag + ", " + j + ", " + k + ", " + abyte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public synchronized void method484(int i, RandomAccessFile randomaccessfile, int j)
        throws IOException
    {
        try
        {
            if(j <= 0)
            {
                aBoolean456 = !aBoolean456;
            }
            if(i < 0 || i > 0x3c00000)
            {
                System.out.println("Badseek - pos:" + i + " len:" + randomaccessfile.length());
                i = 0x3c00000;
                try
                {
                    Thread.sleep(1000L);
                }
                catch(Exception _ex)
                {
                }
            }
            randomaccessfile.seek(i);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("945, " + i + ", " + randomaccessfile + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

}
