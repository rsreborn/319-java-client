package com.jagex;

import java.math.BigInteger;
import com.jagex.sign.Signlink;

public class Class13_Sub1_Sub2 extends Class13_Sub1
{

    public int anInt1379;
    public byte aByte1380;
    public int anInt1381;
    public boolean aBoolean1382;
    public boolean aBoolean1383;
    public byte aByte1384;
    public byte aByte1385;
    public int anInt1386;
    public int anInt1387;
    public int anInt1388;
    public int anInt1389;
    public int anInt1390;
    public int anInt1391;
    public int anInt1392;
    public int anInt1393;
    public boolean aBoolean1394;
    public boolean aBoolean1395;
    public boolean aBoolean1396;
    public int anInt1397;
    public byte payload[];
    public int position;
    public int anInt1400;
    public static int anIntArray1401[];
    public static int BIT_MASKS[] = {
        0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
        1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff,
        0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
        0x3fffffff, 0x7fffffff, -1
    };
    public ISAACCipher aISAACCipher_1403;
    public static int anInt1404;
    public static int anInt1405;
    public static int anInt1406;
    public static Class12 aClass12_1407 = new Class12(36944);
    public static Class12 aClass12_1408 = new Class12(36944);
    public static Class12 aClass12_1409 = new Class12(36944);
    public static char aCharArray1410[] = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
        'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
        'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', '+', '/'
    };
    public static boolean aBoolean1411;

    public static Class13_Sub1_Sub2 method299(int i, int j)
    {
        try
        {
            synchronized(aClass12_1408)
            {
                Class13_Sub1_Sub2 class13_sub1_sub2_2 = null;
                if(j == 0 && anInt1404 > 0)
                {
                    anInt1404--;
                    class13_sub1_sub2_2 = (Class13_Sub1_Sub2) aClass12_1407.method247();
                } else
                if(j == 1 && anInt1405 > 0)
                {
                    anInt1405--;
                    class13_sub1_sub2_2 = (Class13_Sub1_Sub2) aClass12_1408.method247();
                } else
                if(j == 2 && anInt1406 > 0)
                {
                    anInt1406--;
                    class13_sub1_sub2_2 = (Class13_Sub1_Sub2) aClass12_1409.method247();
                }
                if(class13_sub1_sub2_2 != null)
                {
                    class13_sub1_sub2_2.position = 0;
                    Class13_Sub1_Sub2 class13_sub1_sub2 = class13_sub1_sub2_2;
                    return class13_sub1_sub2;
                }
            }
            Class13_Sub1_Sub2 class13_sub1_sub2_1 = new Class13_Sub1_Sub2(true);
            if(i <= 0)
            {
                throw new NullPointerException();
            }
            class13_sub1_sub2_1.position = 0;
            if(j == 0)
            {
                class13_sub1_sub2_1.payload = new byte[100];
            } else
            if(j == 1)
            {
                class13_sub1_sub2_1.payload = new byte[5000];
            } else
            {
                class13_sub1_sub2_1.payload = new byte[30000];
            }
            return class13_sub1_sub2_1;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("52304, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public Class13_Sub1_Sub2(boolean flag)
    {
        anInt1379 = 36;
        aByte1380 = 5;
        anInt1381 = -45536;
        aBoolean1382 = true;
        aBoolean1383 = true;
        aByte1384 = 21;
        aByte1385 = 97;
        anInt1386 = 6;
        anInt1387 = -267;
        anInt1388 = -25124;
        anInt1389 = 7270;
        anInt1390 = 7;
        anInt1391 = 7;
        anInt1392 = 12258;
        anInt1393 = -986;
        aBoolean1394 = false;
        aBoolean1395 = true;
        aBoolean1396 = false;
        try
        {
            if(!flag)
            {
                throw new NullPointerException();
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("4524, " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Class13_Sub1_Sub2(int i, byte abyte0[])
    {
        anInt1379 = 36;
        aByte1380 = 5;
        anInt1381 = -45536;
        aBoolean1382 = true;
        aBoolean1383 = true;
        aByte1384 = 21;
        aByte1385 = 97;
        anInt1386 = 6;
        anInt1387 = -267;
        anInt1388 = -25124;
        anInt1389 = 7270;
        anInt1390 = 7;
        anInt1391 = 7;
        anInt1392 = 12258;
        anInt1393 = -986;
        aBoolean1394 = false;
        aBoolean1395 = true;
        aBoolean1396 = false;
        try
        {
            while(i >= 0)
            {
                throw new NullPointerException();
            }
            payload = abyte0;
            position = 0;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("14039, " + i + ", " + abyte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method300(int i, int j)
    {
        try
        {
            payload[position++] = (byte)(j + aISAACCipher_1403.method190());
            if(i <= 0)
            {
                aBoolean1394 = !aBoolean1394;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("2451, " + i + ", " + j + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void writeByte(int i)
    {
        payload[position++] = (byte)i;
    }

    public void method302(int i)
    {
        payload[position++] = (byte)(i >> 8);
        payload[position++] = (byte)i;
    }

    public void method303(boolean flag, int i)
    {
        try
        {
            if(!flag)
            {
                anInt1397 = -50;
            }
            payload[position++] = (byte)i;
            payload[position++] = (byte)(i >> 8);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("46351, " + flag + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method304(int i)
    {
        payload[position++] = (byte)(i >> 16);
        payload[position++] = (byte)(i >> 8);
        payload[position++] = (byte)i;
    }

    public void writeInt(int i)
    {
        payload[position++] = (byte)(i >> 24);
        payload[position++] = (byte)(i >> 16);
        payload[position++] = (byte)(i >> 8);
        payload[position++] = (byte)i;
    }

    public void method306(int i, int j)
    {
        try
        {
            if(j < 1 || j > 1)
            {
                return;
            } else
            {
                payload[position++] = (byte)i;
                payload[position++] = (byte)(i >> 8);
                payload[position++] = (byte)(i >> 16);
                payload[position++] = (byte)(i >> 24);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("64059, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method307(long l, int i)
    {
        try
        {
            payload[position++] = (byte)(int)(l >> 56);
            if(i != 20652)
            {
                return;
            } else
            {
                payload[position++] = (byte)(int)(l >> 48);
                payload[position++] = (byte)(int)(l >> 40);
                payload[position++] = (byte)(int)(l >> 32);
                payload[position++] = (byte)(int)(l >> 24);
                payload[position++] = (byte)(int)(l >> 16);
                payload[position++] = (byte)(int)(l >> 8);
                payload[position++] = (byte)(int)l;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("14300, " + l + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void writeString(String s)
    {
        s.getBytes(0, s.length(), payload, position);
        position += s.length();
        payload[position++] = 10;
    }

    public void method309(int i, int j, int k, byte abyte0[])
    {
        try
        {
            if(k <= 0)
            {
                return;
            }
            for(int l = j; l < j + i; l++)
            {
                payload[position++] = abyte0[l];
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("88039, " + i + ", " + j + ", " + k + ", " + abyte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method310(int i, int j)
    {
        try
        {
            payload[position - j - 1] = (byte)j;
            if(i != 5469)
            {
                anInt1379 = 29;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("82372, " + i + ", " + j + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public int readUnsignedByte()
    {
        return payload[position++] & 0xff;
    }

    public byte readByte()
    {
        return payload[position++];
    }

    public int readUnsignedShort()
    {
        position += 2;
        return ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
    }

    public int method314()
    {
        position += 2;
        int i = ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
        if(i > 32767)
        {
            i -= 0x10000;
        }
        return i;
    }

    public int method315()
    {
        position += 3;
        return ((payload[position - 3] & 0xff) << 16) + ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
    }

    public int readInt()
    {
        position += 4;
        return ((payload[position - 4] & 0xff) << 24) + ((payload[position - 3] & 0xff) << 16) + ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
    }

    public long readLong(int i)
    {
        long msi = (long) readInt() & 0xffffffffL;
        long lsi = (long) readInt() & 0xffffffffL;
        return (msi << 32) + lsi;
    }

    public String readString()
    {
        int start = position;
        while(payload[position++] != 10);
        return new String(payload, start, position - start - 1);
    }

    public byte[] method319(boolean flag)
    {
        try
        {
            int i = position;
            if(!flag)
            {
                anInt1397 = -199;
            }
            while(payload[position++] != 10) ;
            byte abyte0[] = new byte[position - i - 1];
            for(int j = i; j < position - 1; j++)
            {
                abyte0[j - i] = payload[j];
            }
            return abyte0;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("95156, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method320(byte abyte0[], int i, int j, int k)
    {
        try
        {
            if(k != 0)
            {
                for(int l = 1; l > 0; l++)
                {
                }
            }
            for(int i1 = j; i1 < j + i; i1++)
            {
                abyte0[i1] = payload[position++];
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("53995, " + abyte0 + ", " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method321(int i)
    {
        try
        {
            if(i >= 0)
            {
                aBoolean1382 = !aBoolean1382;
            }
            anInt1400 = position * 8;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("11263, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int readBits(int i, int j)
    {
        try
        {
            int k = anInt1400 >> 3;
            int l = 8 - (anInt1400 & 7);
            int i1 = 0;
            j = 98 / j;
            anInt1400 += i;
            for(; i > l; l = 8)
            {
                i1 += (payload[k++] & BIT_MASKS[l]) << i - l;
                i -= l;
            }
            if(i == l)
            {
                i1 += payload[k] & BIT_MASKS[l];
            } else
            {
                i1 += payload[k] >> l - i & BIT_MASKS[i];
            }
            return i1;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("38428, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method323(int i)
    {
        try
        {
            if(i < 3 || i > 3)
            {
                anInt1381 = 11;
            }
            position = (anInt1400 + 7) / 8;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("42282, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method324()
    {
        int i = payload[position] & 0xff;
        if(i < 128)
        {
            return readUnsignedByte() - 64;
        } else
        {
            return readUnsignedShort() - 49152;
        }
    }

    public int method325()
    {
        int i = payload[position] & 0xff;
        if(i < 128)
        {
            return readUnsignedByte();
        } else
        {
            return readUnsignedShort() - 32768;
        }
    }

    public void method326(BigInteger modulus, BigInteger key, boolean flag)
    {
        try
        {
            int i = position;
            position = 0;
            byte abyte0[] = new byte[i];
            method320(abyte0, i, 0, 0);
            BigInteger biginteger2 = new BigInteger(abyte0);
            BigInteger biginteger3 = biginteger2.modPow(key, modulus);
            if(!flag)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            byte abyte1[] = biginteger3.toByteArray();
            position = 0;
            writeByte(abyte1.length);
            method309(abyte1.length, 0, anInt1379, abyte1);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("25524, " + modulus + ", " + key + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method327(int i, int j)
    {
        try
        {
            payload[position++] = (byte)(j + 128);
            i = 59 / i;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("2664, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method328(int i, int j)
    {
        try
        {
            if(i <= 0)
            {
                aBoolean1382 = !aBoolean1382;
            }
            payload[position++] = (byte)(-j);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("46151, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method329(int i, int j)
    {
        try
        {
            if(j < 0 || j > 0)
            {
                for(int k = 1; k > 0; k++)
                {
                }
            }
            payload[position++] = (byte)(128 - i);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("23611, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int readUnsignedByteA(int i)
    {
        try
        {
            if(i <= 0)
            {
                aBoolean1396 = !aBoolean1396;
            }
            return payload[position++] - 128 & 0xff;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("55072, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int readUnsignedByteC(int i)
    {
        try
        {
            if(i != 19179)
            {
                return anInt1387;
            } else
            {
                return -payload[position++] & 0xff;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("73655, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method332(byte byte0)
    {
        try
        {
            if(byte0 == 7)
            {
                byte0 = 0;
            } else
            {
                aBoolean1395 = !aBoolean1395;
            }
            return 128 - payload[position++] & 0xff;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("15887, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public byte method333(int i)
    {
        try
        {
            if(i != anInt1389)
            {
                anInt1387 = -148;
            }
            return (byte)(payload[position++] - 128);
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("75814, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public byte method334(byte byte0)
    {
        try
        {
            if(byte0 != -78)
            {
                for(int i = 1; i > 0; i++)
                {
                }
            }
            return (byte)(-payload[position++]);
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("48119, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method335(int i, int j)
    {
        try
        {
            payload[position++] = (byte)j;
            if(i < 0 || i > 0)
            {
                return;
            } else
            {
                payload[position++] = (byte)(j >> 8);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("53874, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method336(boolean flag, int i)
    {
        try
        {
            if(flag)
            {
                return;
            } else
            {
                payload[position++] = (byte)(i >> 8);
                payload[position++] = (byte)(i + 128);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("77025, " + flag + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method337(int i, int j)
    {
        try
        {
            if(i != anInt1390)
            {
                anInt1388 = -75;
            }
            payload[position++] = (byte)(j + 128);
            payload[position++] = (byte)(j >> 8);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("72029, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int readUnsignedLittleEndianShort()
    {       position += 2;
            return ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
    }

    public int method339(boolean flag)
    {
        try
        {
            position += 2;
            if(!flag)
            {
                return 2;
            } else
            {
                return ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] - 128 & 0xff);
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("50487, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int readUnsignedLittleEndianShortA()
    {
        position += 2;
        return ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] - 128 & 0xff);
    }

    public int method341(int i)
    {
        try
        {
            if(i >= 0)
            {
                return anInt1387;
            }
            position += 2;
            int j = ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
            if(j > 32767)
            {
                j -= 0x10000;
            }
            return j;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("95516, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method342(int i)
    {
        try
        {
            while(i >= 0)
            {
                anInt1386 = 37;
            }
            position += 2;
            int j = ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] - 128 & 0xff);
            if(j > 32767)
            {
                j -= 0x10000;
            }
            return j;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("97418, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method343(boolean flag)
    {
        try
        {
            position += 2;
            if(!flag)
            {
                aBoolean1394 = !aBoolean1394;
            }
            int i = ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] - 128 & 0xff);
            if(i > 32767)
            {
                i -= 0x10000;
            }
            return i;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("42864, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method344(int i)
    {
        try
        {
            position += 3;
            if(i != 5)
            {
                return 1;
            } else
            {
                return ((payload[position - 1] & 0xff) << 16) + ((payload[position - 2] & 0xff) << 8) + (payload[position - 3] & 0xff);
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("86442, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method345(int i, int j)
    {
        try
        {
            payload[position++] = (byte)i;
            payload[position++] = (byte)(i >> 8);
            payload[position++] = (byte)(i >> 16);
            payload[position++] = (byte)(i >> 24);
            j = 70 / j;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("94570, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method346(byte byte0)
    {
        try
        {
            if(byte0 == 1)
            {
                byte0 = 0;
            } else
            {
                return anInt1379;
            }
            position += 4;
            return ((payload[position - 1] & 0xff) << 24) + ((payload[position - 2] & 0xff) << 16) + ((payload[position - 3] & 0xff) << 8) + (payload[position - 4] & 0xff);
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("39973, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int method347(int i)
    {
        try
        {
            if(i < 7 || i > 7)
            {
                for(int j = 1; j > 0; j++)
                {
                }
            }
            position += 4;
            return ((payload[position - 2] & 0xff) << 24) + ((payload[position - 1] & 0xff) << 16) + ((payload[position - 4] & 0xff) << 8) + (payload[position - 3] & 0xff);
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("74336, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public int readMiddleEndianInt2(int i)
    {
        position += 4;
        return ((payload[position - 3] & 0xff) << 24) + ((payload[position - 4] & 0xff) << 16) + ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
    }

    public void method349(byte abyte0[], int i, boolean flag, int j)
    {
        try
        {
            if(!flag)
            {
                aBoolean1395 = !aBoolean1395;
            }
            for(int k = (i + j) - 1; k >= i; k--)
            {
                payload[position++] = (byte)(abyte0[k] + 128);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("63347, " + abyte0 + ", " + i + ", " + flag + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method350(boolean flag, int i, byte abyte0[], int j)
    {
        try
        {
            if(flag)
            {
                return;
            }
            for(int k = j; k < j + i; k++)
            {
                abyte0[k] = (byte)(payload[position++] - 128);
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reportError("76887, " + flag + ", " + i + ", " + abyte0 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    static
    {
        anIntArray1401 = new int[256];
        for(int j = 0; j < 256; j++)
        {
            int i = j;
            for(int k = 0; k < 8; k++)
            {
                if((i & 1) == 1)
                {
                    i = i >>> 1 ^ 0xedb88320;
                } else
                {
                    i >>>= 1;
                }
            }
            anIntArray1401[j] = i;
        }
    }
}
