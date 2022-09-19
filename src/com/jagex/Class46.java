package com.jagex;

import java.io.*;
import java.net.Socket;
import com.jagex.sign.signlink;

public class Class46
    implements Runnable
{

    public int anInt732;
    public boolean aBoolean733;
    public boolean aBoolean734;
    public InputStream anInputStream735;
    public OutputStream anOutputStream736;
    public Socket aSocket737;
    public boolean aBoolean738;
    public Applet_Sub1 anApplet_Sub1_739;
    public byte aByteArray740[];
    public int anInt741;
    public int anInt742;
    public boolean aBoolean743;
    public boolean aBoolean744;

    public Class46(Socket socket, int i, Applet_Sub1 applet_sub1)
        throws IOException
    {
        anInt732 = -168;
        aBoolean733 = false;
        aBoolean734 = true;
        aBoolean738 = false;
        aBoolean743 = false;
        aBoolean744 = false;
        try
        {
            i = 43 / i;
            anApplet_Sub1_739 = applet_sub1;
            aSocket737 = socket;
            aSocket737.setSoTimeout(30000);
            aSocket737.setTcpNoDelay(true);
            anInputStream735 = aSocket737.getInputStream();
            anOutputStream736 = aSocket737.getOutputStream();
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("55650, " + socket + ", " + i + ", " + applet_sub1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method576()
    {
        aBoolean738 = true;
        try
        {
            if(anInputStream735 != null)
            {
                anInputStream735.close();
            }
            if(anOutputStream736 != null)
            {
                anOutputStream736.close();
            }
            if(aSocket737 != null)
            {
                aSocket737.close();
            }
        }
        catch(IOException _ex)
        {
            System.out.println("Error closing stream");
        }
        aBoolean743 = false;
        synchronized(this)
        {
            notify();
        }
        aByteArray740 = null;
    }

    public int method577()
        throws IOException
    {
        if(aBoolean738)
        {
            return 0;
        } else
        {
            return anInputStream735.read();
        }
    }

    public int method578()
        throws IOException
    {
        if(aBoolean738)
        {
            return 0;
        } else
        {
            return anInputStream735.available();
        }
    }

    public void method579(byte abyte0[], int i, int j)
        throws IOException
    {
        if(aBoolean738)
        {
            return;
        }
        int k;
        for(; j > 0; j -= k)
        {
            k = anInputStream735.read(abyte0, i, j);
            if(k <= 0)
            {
                throw new IOException("EOF");
            }
            i += k;
        }
    }

    public void method580(byte abyte0[], int i, int j, byte byte0)
        throws IOException
    {
        try
        {
            if(aBoolean738)
            {
                return;
            }
            if(aBoolean744)
            {
                aBoolean744 = false;
                throw new IOException("Error in writer thread");
            }
            if(aByteArray740 == null)
            {
                aByteArray740 = new byte[5000];
            }
            synchronized(this)
            {
                for(int k = 0; k < j; k++)
                {
                    aByteArray740[anInt742] = abyte0[k + i];
                    anInt742 = (anInt742 + 1) % 5000;
                    if(anInt742 == (anInt741 + 4900) % 5000)
                    {
                        throw new IOException("buffer overflow");
                    }
                }
                if(!aBoolean743)
                {
                    aBoolean743 = true;
                    anApplet_Sub1_739.method12(this, 3);
                }
                notify();
            }
            if(byte0 != 9)
            {
                anInt732 = 101;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("59331, " + abyte0 + ", " + i + ", " + j + ", " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void run()
    {
        while(aBoolean743)
        {
            int i;
            int j;
            synchronized(this)
            {
                if(anInt742 == anInt741)
                {
                    try
                    {
                        wait();
                    }
                    catch(InterruptedException _ex)
                    {
                    }
                }
                if(!aBoolean743)
                {
                    return;
                }
                j = anInt741;
                if(anInt742 >= anInt741)
                {
                    i = anInt742 - anInt741;
                } else
                {
                    i = 5000 - anInt741;
                }
            }
            if(i > 0)
            {
                try
                {
                    anOutputStream736.write(aByteArray740, j, i);
                }
                catch(IOException _ex)
                {
                    aBoolean744 = true;
                }
                anInt741 = (anInt741 + i) % 5000;
                try
                {
                    if(anInt742 == anInt741)
                    {
                        anOutputStream736.flush();
                    }
                }
                catch(IOException _ex)
                {
                    aBoolean744 = true;
                }
            }
        }
    }

    public void method581(int i)
    {
        try
        {
            System.out.println("dummy:" + aBoolean738);
            System.out.println("tcycl:" + anInt741);
            System.out.println("tnum:" + anInt742);
            System.out.println("writer:" + aBoolean743);
            while(i >= 0)
            {
                aBoolean733 = !aBoolean733;
            }
            System.out.println("ioerror:" + aBoolean744);
            try
            {
                System.out.println("available:" + method578());
                return;
            }
            catch(IOException _ex)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("93333, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
