package com.jagex.compress;

public class Bzip2Context {

    public static int[] tt;
    public byte[] compressedData;
    public int nextIn;
    public int compressedLength;
    public int totalInLo32;
    public int anInt85;
    public byte[] decompressedData;
    public int anInt87;
    public int decompressedLength;
    public int anInt89;
    public int anInt90;
    public byte stateOutCh;
    public int stateOutLen;
    public boolean randomisedBlock;
    public int bsBuff;
    public int bsLive;
    public int blockSize100k;
    public int anInt97;
    public int origPtr;
    public int tPos;
    public int anInt100;
    public int[] unzftab;
    public int nBlockUsed;
    public int[] cftab;
    public int nInUse;
    public boolean[] inUse;
    public boolean[] inUse16;
    public byte[] seqToUnseq;
    public byte[] mtfa;
    public int[] mtfbase;
    public byte[] selector;
    public byte[] selectorMtf;
    public byte[][] lengths;
    public int[][] limit;
    public int[][] base;
    public int[][] perm;
    public int[] minLens;
    public int nBlock;

    public Bzip2Context() {
        unzftab = new int[256];
        cftab = new int[257];
        inUse = new boolean[256];
        inUse16 = new boolean[16];
        seqToUnseq = new byte[256];
        mtfa = new byte[4096];
        mtfbase = new int[16];
        selector = new byte[18002];
        selectorMtf = new byte[18002];
        lengths = new byte[6][258];
        limit = new int[6][258];
        base = new int[6][258];
        perm = new int[6][258];
        minLens = new int[6];
    }
}
