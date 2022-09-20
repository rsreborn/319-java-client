package com.jagex;

import com.jagex.sign.Signlink;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class BufferedConnection implements Runnable {

    public InputStream inputStream;
    public OutputStream outputStream;
    public Socket socket;
    public boolean closed;
    public GameShell gameShell;
    public byte[] buffer;
    public int writerPosition;
    public int bufferPosition;
    public boolean writing;
    public boolean ioError;

    public BufferedConnection(Socket socket, int i, GameShell gameShell) throws IOException {
        closed = false;
        writing = false;
        ioError = false;
        try {
            i = 43 / i;
            this.gameShell = gameShell;
            this.socket = socket;
            this.socket.setSoTimeout(30000);
            this.socket.setTcpNoDelay(true);
            this.inputStream = this.socket.getInputStream();
            this.outputStream = this.socket.getOutputStream();
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("55650, " + socket + ", " + i + ", " + gameShell + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void close() {
        closed = true;
        try {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException _ex) {
            System.out.println("Error closing stream");
        }

        writing = false;
        synchronized (this) {
            notify();
        }
        buffer = null;
    }

    public int read() throws IOException {
        if (closed) {
            return 0;
        } else {
            return inputStream.read();
        }
    }

    public int getAvailable() throws IOException {
        if (closed) {
            return 0;
        } else {
            return inputStream.available();
        }
    }

    public void read(byte[] bytes, int offset, int length) throws IOException {
        if (closed) {
            return;
        }
        int bytesRead;
        for (; length > 0; length -= bytesRead) {
            bytesRead = inputStream.read(bytes, offset, length);
            if (bytesRead <= 0) {
                throw new IOException("EOF");
            }
            offset += bytesRead;
        }
    }

    public void write(byte[] bytes, int offset, int length)
            throws IOException {
        try {
            if (closed) {
                return;
            }
            if (ioError) {
                ioError = false;
                throw new IOException("Error in writer thread");
            }
            if (buffer == null) {
                buffer = new byte[5000];
            }
            synchronized (this) {
                for (int position = 0; position < length; position++) {
                    buffer[bufferPosition] = bytes[position + offset];
                    bufferPosition = (bufferPosition + 1) % 5000;
                    if (bufferPosition == (writerPosition + 4900) % 5000) {
                        throw new IOException("buffer overflow");
                    }
                }
                if (!writing) {
                    writing = true;
                    gameShell.method12(this, 3);
                }
                notify();
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("59331, " + Arrays.toString(bytes) + ", " + offset + ", " + length + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void run() {
        while (writing) {
            int writerLength;
            int writerOffset;
            synchronized (this) {
                if (bufferPosition == writerPosition) {
                    try {
                        wait();
                    } catch (InterruptedException _ex) {
                    }
                }
                if (!writing) {
                    return;
                }
                writerOffset = writerPosition;
                if (bufferPosition >= writerPosition) {
                    writerLength = bufferPosition - writerPosition;
                } else {
                    writerLength = 5000 - writerPosition;
                }
            }
            if (writerLength > 0) {
                try {
                    outputStream.write(buffer, writerOffset, writerLength);
                } catch (IOException _ex) {
                    ioError = true;
                }
                writerPosition = (writerPosition + writerLength) % 5000;
                try {
                    if (bufferPosition == writerPosition) {
                        outputStream.flush();
                    }
                } catch (IOException _ex) {
                    ioError = true;
                }
            }
        }
    }

    public void printDebug() {
        try {
            System.out.println("dummy:" + closed);
            System.out.println("tcycl:" + writerPosition);
            System.out.println("tnum:" + bufferPosition);
            System.out.println("writer:" + writing);
            System.out.println("ioerror:" + ioError);
            try {
                System.out.println("available:" + getAvailable());
                return;
            } catch (IOException _ex) {
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("93333, " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
