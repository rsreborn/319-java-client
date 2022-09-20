package com.jagex;/* com.jagex.Class2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

import com.jagex.sign.signlink;

public class Class2_Sub1 extends Class2 implements Runnable
{
    public int anInt1292 = 12258;
    public Class12 aClass12_1293 = new Class12(36944);
    public Class21 aClass21_1294 = new Class21(14716);
    public int anInt1295 = -22144;
    public Class13_Sub1_Sub3 aClass13_Sub1_Sub3_1296;
    public byte[][] aByteArrayArray1297 = new byte[4][];
    public byte[] aByteArray1298 = new byte[500];
    public boolean aBoolean1299 = false;
    public OutputStream anOutputStream1300;
    public boolean aBoolean1301 = true;
    public byte[] aByteArray1302;
    public int[] anIntArray1303;
    public int anInt1304;
    public int anInt1305;
    public int[][] anIntArrayArray1306 = new int[4][];
    public int anInt1307;
    public int anInt1308;
    public int anInt1309;
    public Socket aSocket1310;
    public long aLong1311;
    public int[] anIntArray1312;
    public int anInt1313 = 5;
    public byte aByte1314 = 50;
    public int[] anIntArray1315;
    public CRC32 aCRC32_1316 = new CRC32();
    public int[] anIntArray1317;
    public String aString1318 = "";
    public Game aGame1319;
    public int[] anIntArray1320;
    public int anInt1321;
    public Class12 aClass12_1322 = new Class12(36944);
    public int[][] anIntArrayArray1323 = new int[4][];
    public boolean aBoolean1324 = false;
    public int anInt1325;
    public int anInt1326;
    public byte[] aByteArray1327 = new byte[65000];
    public Class12 aClass12_1328 = new Class12(36944);
    public int anInt1329;
    public Class12 aClass12_1330 = new Class12(36944);
    public InputStream anInputStream1331;
    public int[] anIntArray1332;
    public int anInt1333;
    public Class12 aClass12_1334 = new Class12(36944);
    public int anInt1335;
    
    public void method151(int i) {
	try {
	    anInt1308 = 0;
	    anInt1309 = 0;
	    Class13_Sub1_Sub3 class13_sub1_sub3
		= (Class13_Sub1_Sub3) aClass12_1322.method248();
	    if (i == 27519) {
		for (/**/; class13_sub1_sub3 != null;
		     class13_sub1_sub3
			 = (Class13_Sub1_Sub3) aClass12_1322.method250(-475)) {
		    if (class13_sub1_sub3.aBoolean1415)
			anInt1308++;
		    else
			anInt1309++;
		}
		while (anInt1308 < 10) {
		    class13_sub1_sub3
			= (Class13_Sub1_Sub3) aClass12_1293.method247();
		    if (class13_sub1_sub3 == null)
			break;
		    if ((aByteArrayArray1297[class13_sub1_sub3.anInt1414]
			 [class13_sub1_sub3.anInt1416])
			!= 0)
			anInt1329++;
		    aByteArrayArray1297[class13_sub1_sub3.anInt1414]
			[class13_sub1_sub3.anInt1416]
			= (byte) 0;
		    aClass12_1322.method245(class13_sub1_sub3);
		    anInt1308++;
		    method159(0, class13_sub1_sub3);
		    aBoolean1299 = true;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("54544, " + i + ", "
				 + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public void method152(int i) {
	try {
	    Class13_Sub1_Sub3 class13_sub1_sub3;
	    synchronized (aClass12_1334) {
		class13_sub1_sub3
		    = (Class13_Sub1_Sub3) aClass12_1334.method247();
	    }
	    while (i >= 0)
		aBoolean1324 = !aBoolean1324;
	    while (class13_sub1_sub3 != null) {
		aBoolean1299 = true;
		byte[] is = null;
		if (aGame1319.aClass28Array1264[0] != null)
		    is = aGame1319.aClass28Array1264
			     [class13_sub1_sub3.anInt1414 + 1]
			     .method481(class13_sub1_sub3.anInt1416, 26421);
		if (!method168((anIntArrayArray1323
				[class13_sub1_sub3.anInt1414]
				[class13_sub1_sub3.anInt1416]),
			       is, -286,
			       (anIntArrayArray1306
				[class13_sub1_sub3.anInt1414]
				[class13_sub1_sub3.anInt1416])))
		    is = null;
		synchronized (aClass12_1334) {
		    if (is == null)
			aClass12_1293.method245(class13_sub1_sub3);
		    else {
			class13_sub1_sub3.aByteArray1412 = is;
			synchronized (aClass12_1330) {
			    aClass12_1330.method245(class13_sub1_sub3);
			}
		    }
		    class13_sub1_sub3
			= (Class13_Sub1_Sub3) aClass12_1334.method247();
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("31218, " + i + ", "
				 + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public boolean method153(int i, int i_0_) {
	try {
	    if (i < 7 || i > 7) {
		for (int i_1_ = 1; i_1_ > 0; i_1_++) {
		    /* empty */
		}
	    }
	    if (anIntArray1315[i_0_] == 1)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("17836, " + i + ", " + i_0_ + ", "
				 + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public int method154(boolean bool, int i) {
	try {
	    if (!bool)
		anInt1292 = 490;
	    return aByteArray1302[i] & 0xff;
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("55143, " + bool + ", " + i + ", "
				 + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public boolean method155(int i, int i_2_) {
	try {
	    for (int i_3_ = 0; i_3_ < anIntArray1320.length; i_3_++) {
		if (anIntArray1317[i_3_] == i_2_)
		    return true;
	    }
	    if (i != anInt1313)
		throw new NullPointerException();
	    return false;
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("72770, " + i + ", " + i_2_ + ", "
				 + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public void method156(int i, int i_4_) {
	if (i >= 0 && i <= anIntArrayArray1306.length && i_4_ >= 0
	    && i_4_ <= anIntArrayArray1306[i].length
	    && anIntArrayArray1306[i][i_4_] != 0) {
	    synchronized (aClass21_1294) {
		for (Class13_Sub1_Sub3 class13_sub1_sub3
			 = (Class13_Sub1_Sub3) aClass21_1294.method441();
		     class13_sub1_sub3 != null;
		     class13_sub1_sub3
			 = (Class13_Sub1_Sub3) aClass21_1294.method442(-475)) {
		    if (class13_sub1_sub3.anInt1414 == i
			&& class13_sub1_sub3.anInt1416 == i_4_)
			return;
		}
		Class13_Sub1_Sub3 class13_sub1_sub3 = new Class13_Sub1_Sub3();
		class13_sub1_sub3.anInt1414 = i;
		class13_sub1_sub3.anInt1416 = i_4_;
		class13_sub1_sub3.aBoolean1415 = true;
		synchronized (aClass12_1334) {
		    aClass12_1334.method245(class13_sub1_sub3);
		}
		aClass21_1294.method439(class13_sub1_sub3);
	    }
	}
    }
    
    public void method157(int i, int i_5_, int i_6_) {
	try {
	    if (aGame1319.aClass28Array1264[0] != null
		&& anIntArrayArray1306[i][i_5_] != 0
		&& aByteArrayArray1297[i][i_5_] != 0 && anInt1307 != 0) {
		Class13_Sub1_Sub3 class13_sub1_sub3 = new Class13_Sub1_Sub3();
		class13_sub1_sub3.anInt1414 = i;
		class13_sub1_sub3.anInt1416 = i_5_;
		if (i_6_ != 0)
		    anInt1295 = -413;
		class13_sub1_sub3.aBoolean1415 = false;
		synchronized (aClass12_1328) {
		    aClass12_1328.method245(class13_sub1_sub3);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("49822, " + i + ", " + i_5_ + ", " + i_6_
				 + ", " + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public int method158(byte i) {
	try {
	    if (i != aByte1314)
		return 0;
	    return anIntArray1303.length;
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("53573, " + i + ", "
				 + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public void method159(int i, Class13_Sub1_Sub3 class13_sub1_sub3) {
	try {
	    if (i != 0) {
		for (int i_7_ = 1; i_7_ > 0; i_7_++) {
		    /* empty */
		}
	    }
	    try {
		if (aSocket1310 == null) {
		    long l = System.currentTimeMillis();
		    if (l - aLong1311 < 4000L)
			return;
		    aLong1311 = l;
		    aSocket1310
			= aGame1319.method135(43594 + Game.anInt952);
		    anInputStream1331 = aSocket1310.getInputStream();
		    anOutputStream1300 = aSocket1310.getOutputStream();
		    anOutputStream1300.write(15);
		    for (int i_8_ = 0; i_8_ < 8; i_8_++)
			anInputStream1331.read();
		    anInt1325 = 0;
		}
		aByteArray1298[0] = (byte) class13_sub1_sub3.anInt1414;
		aByteArray1298[1] = (byte) (class13_sub1_sub3.anInt1416 >> 8);
		aByteArray1298[2] = (byte) class13_sub1_sub3.anInt1416;
		if (class13_sub1_sub3.aBoolean1415)
		    aByteArray1298[3] = (byte) 2;
		else if (!aGame1319.aBoolean851)
		    aByteArray1298[3] = (byte) 1;
		else
		    aByteArray1298[3] = (byte) 0;
		anOutputStream1300.write(aByteArray1298, 0, 4);
		anInt1321 = 0;
		anInt1333 = -10000;
	    } catch (IOException ioexception) {
		try {
		    aSocket1310.close();
		} catch (Exception exception) {
		    /* empty */
		}
		aSocket1310 = null;
		anInputStream1331 = null;
		anOutputStream1300 = null;
		anInt1305 = 0;
		anInt1333++;
	    }
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("65491, " + i + ", " + class13_sub1_sub3
				 + ", " + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public int method160(int i, int i_9_, int i_10_, int i_11_) {
	try {
	    int i_12_ = (i << 8) + i_9_;
	    if (i_11_ != 8347) {
		for (int i_13_ = 1; i_13_ > 0; i_13_++) {
		    /* empty */
		}
	    }
	    for (int i_14_ = 0; i_14_ < anIntArray1320.length; i_14_++) {
		if (anIntArray1320[i_14_] == i_12_) {
		    if (i_10_ == 0)
			return anIntArray1332[i_14_];
		    return anIntArray1317[i_14_];
		}
	    }
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("42843, " + i + ", " + i_9_ + ", " + i_10_
				 + ", " + i_11_ + ", "
				 + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public void method161() {
	aBoolean1301 = false;
    }
    
    public void method162(int i, int i_15_, byte i_16_, boolean bool) {
	try {
	    if (aGame1319.aClass28Array1264[0] != null
		&& anIntArrayArray1306[i][i_15_] != 0) {
		byte[] is
		    = aGame1319.aClass28Array1264[i + 1].method481(i_15_,
								     26421);
		if (bool) {
		    for (int i_17_ = 1; i_17_ > 0; i_17_++) {
			/* empty */
		    }
		}
		if (!method168(anIntArrayArray1323[i][i_15_], is, -286,
			       anIntArrayArray1306[i][i_15_])) {
		    aByteArrayArray1297[i][i_15_] = i_16_;
		    if (i_16_ > anInt1307)
			anInt1307 = i_16_;
		    anInt1335++;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("96532, " + i + ", " + i_15_ + ", " + i_16_
				 + ", " + bool + ", "
				 + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public int method163(int i, int i_18_) {
	try {
	    if (i >= 0)
		aBoolean1324 = !aBoolean1324;
	    return anIntArrayArray1306[i_18_].length;
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("11092, " + i + ", " + i_18_ + ", "
				 + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public void method164(int i) {
    while_0_:
	do {
	    try {
		if (i != 0) {
		    for (int i_19_ = 1; i_19_ > 0; i_19_++) {
			/* empty */
		    }
		}
		for (;;) {
		    if (anInt1308 != 0)
			break while_0_;
		    if (anInt1309 >= 10)
			break;
		    if (anInt1307 == 0)
			break;
		    Class13_Sub1_Sub3 class13_sub1_sub3;
		    synchronized (aClass12_1328) {
			class13_sub1_sub3
			    = (Class13_Sub1_Sub3) aClass12_1328.method247();
		    }
		    while (class13_sub1_sub3 != null) {
			if ((aByteArrayArray1297[class13_sub1_sub3.anInt1414]
			     [class13_sub1_sub3.anInt1416])
			    != 0) {
			    aByteArrayArray1297
				[class13_sub1_sub3.anInt1414]
				[class13_sub1_sub3.anInt1416]
				= (byte) 0;
			    aClass12_1322.method245(class13_sub1_sub3);
			    method159(0, class13_sub1_sub3);
			    aBoolean1299 = true;
			    if (anInt1329 < anInt1335)
				anInt1329++;
			    aString1318
				= ("Loading extra files - "
				   + anInt1329 * 100 / anInt1335 + "%");
			    anInt1309++;
			    if (anInt1309 == 10)
				return;
			}
			synchronized (aClass12_1328) {
			    class13_sub1_sub3 = ((Class13_Sub1_Sub3)
						 aClass12_1328.method247());
			}
		    }
		    for (int i_20_ = 0; i_20_ < 4; i_20_++) {
			byte[] is = aByteArrayArray1297[i_20_];
			int i_21_ = is.length;
			for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
			    if (is[i_22_] == anInt1307) {
				is[i_22_] = (byte) 0;
				class13_sub1_sub3 = new Class13_Sub1_Sub3();
				class13_sub1_sub3.anInt1414 = i_20_;
				class13_sub1_sub3.anInt1416 = i_22_;
				class13_sub1_sub3.aBoolean1415 = false;
				aClass12_1322.method245(class13_sub1_sub3);
				method159(0, class13_sub1_sub3);
				aBoolean1299 = true;
				if (anInt1329 < anInt1335)
				    anInt1329++;
				aString1318
				    = ("Loading extra files - "
				       + anInt1329 * 100 / anInt1335 + "%");
				anInt1309++;
				if (anInt1309 == 10)
				    return;
			    }
			}
		    }
		    anInt1307--;
		}
	    } catch (RuntimeException runtimeexception) {
		signlink.reportError("5568, " + i + ", "
				     + runtimeexception.toString());
		throw new RuntimeException();
	    }
	    break;
	} while (false);
    }
    
    public void method165(int i) {
	do {
	    try {
		if (i == 4717) {
		    try {
			int i_23_ = anInputStream1331.available();
			if (anInt1305 == 0 && i_23_ >= 6) {
			    aBoolean1299 = true;
			    for (int i_24_ = 0; i_24_ < 6;
				 i_24_
				     += anInputStream1331.read(aByteArray1298,
							       i_24_,
							       6 - i_24_)) {
				/* empty */
			    }
			    int i_25_ = aByteArray1298[0] & 0xff;
			    int i_26_ = (((aByteArray1298[1] & 0xff) << 8)
					 + (aByteArray1298[2] & 0xff));
			    int i_27_ = (((aByteArray1298[3] & 0xff) << 8)
					 + (aByteArray1298[4] & 0xff));
			    int i_28_ = aByteArray1298[5] & 0xff;
			    aClass13_Sub1_Sub3_1296 = null;
			    for (Class13_Sub1_Sub3 class13_sub1_sub3
				     = ((Class13_Sub1_Sub3)
					aClass12_1322.method248());
				 class13_sub1_sub3 != null;
				 class13_sub1_sub3
				     = ((Class13_Sub1_Sub3)
					aClass12_1322.method250(-475))) {
				if (class13_sub1_sub3.anInt1414 == i_25_
				    && class13_sub1_sub3.anInt1416 == i_26_)
				    aClass13_Sub1_Sub3_1296
					= class13_sub1_sub3;
				if (aClass13_Sub1_Sub3_1296 != null)
				    class13_sub1_sub3.anInt1413 = 0;
			    }
			    if (aClass13_Sub1_Sub3_1296 != null) {
				anInt1325 = 0;
				if (i_27_ == 0) {
				    signlink.reportError("Rej: " + i_25_ + ","
							 + i_26_);
				    aClass13_Sub1_Sub3_1296.aByteArray1412
					= null;
				    if (aClass13_Sub1_Sub3_1296.aBoolean1415) {
					synchronized (aClass12_1330) {
					    aClass12_1330.method245
						(aClass13_Sub1_Sub3_1296);
					}
				    } else
					aClass13_Sub1_Sub3_1296.method253();
				    aClass13_Sub1_Sub3_1296 = null;
				} else {
				    if ((aClass13_Sub1_Sub3_1296.aByteArray1412
					 == null)
					&& i_28_ == 0)
					aClass13_Sub1_Sub3_1296.aByteArray1412
					    = new byte[i_27_];
				    if ((aClass13_Sub1_Sub3_1296.aByteArray1412
					 == null)
					&& i_28_ != 0)
					throw new IOException
						  ("missing start of file");
				}
			    }
			    anInt1304 = i_28_ * 500;
			    anInt1305 = 500;
			    if (anInt1305 > i_27_ - i_28_ * 500)
				anInt1305 = i_27_ - i_28_ * 500;
			}
			if (anInt1305 <= 0 || i_23_ < anInt1305)
			    break;
			aBoolean1299 = true;
			byte[] is = aByteArray1298;
			int i_29_ = 0;
			if (aClass13_Sub1_Sub3_1296 != null) {
			    is = aClass13_Sub1_Sub3_1296.aByteArray1412;
			    i_29_ = anInt1304;
			}
			for (int i_30_ = 0; i_30_ < anInt1305;
			     i_30_ += anInputStream1331.read(is, i_30_ + i_29_,
							     (anInt1305
							      - i_30_))) {
			    /* empty */
			}
			if (anInt1305 + anInt1304 >= is.length
			    && aClass13_Sub1_Sub3_1296 != null) {
			    if (aGame1319.aClass28Array1264[0] != null)
				aGame1319.aClass28Array1264
				    [aClass13_Sub1_Sub3_1296.anInt1414 + 1]
				    .method482
				    (is, -739,
				     aClass13_Sub1_Sub3_1296.anInt1416,
				     is.length);
			    if (!aClass13_Sub1_Sub3_1296.aBoolean1415
				&& aClass13_Sub1_Sub3_1296.anInt1414 == 3) {
				aClass13_Sub1_Sub3_1296.aBoolean1415 = true;
				aClass13_Sub1_Sub3_1296.anInt1414 = 93;
			    }
			    if (aClass13_Sub1_Sub3_1296.aBoolean1415) {
				synchronized (aClass12_1330) {
				    aClass12_1330
					.method245(aClass13_Sub1_Sub3_1296);
				}
			    } else
				aClass13_Sub1_Sub3_1296.method253();
			}
			anInt1305 = 0;
		    } catch (IOException ioexception) {
			try {
			    aSocket1310.close();
			} catch (Exception exception) {
			    /* empty */
			}
			aSocket1310 = null;
			anInputStream1331 = null;
			anOutputStream1300 = null;
			anInt1305 = 0;
		    }
		    break;
		}
		break;
	    } catch (RuntimeException runtimeexception) {
		signlink.reportError("41756, " + i + ", "
				     + runtimeexception.toString());
		throw new RuntimeException();
	    }
	} while (false);
    }
    
    public void method166(int i) {
	try {
	    synchronized (aClass12_1328) {
		aClass12_1328.method252();
	    }
	    i = 78 / i;
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("83594, " + i + ", "
				 + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public int method167() {
	synchronized (aClass21_1294) {
	    return aClass21_1294.method443();
	}
    }
    
    public boolean method168(int i, byte[] is, int i_31_, int i_32_) {
	try {
	    if (i_31_ >= 0)
		aBoolean1324 = !aBoolean1324;
	    if (is == null || is.length < 2)
		return false;
	    int i_33_ = is.length - 2;
	    int i_34_ = ((is[i_33_] & 0xff) << 8) + (is[i_33_ + 1] & 0xff);
	    aCRC32_1316.reset();
	    aCRC32_1316.update(is, 0, i_33_);
	    int i_35_ = (int) aCRC32_1316.getValue();
	    if (i_34_ != i_32_)
		return false;
	    if (i_35_ != i)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("84545, " + i + ", " + is + ", " + i_31_
				 + ", " + i_32_ + ", "
				 + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public void method150(int i) {
	method156(0, i);
    }
    
    public void method169(Class1 class1, Game var_game) {
	String[] strings = { "model_version", "anim_version", "midi_version",
			     "map_version" };
	for (int i = 0; i < 4; i++) {
	    byte[] is = class1.method149(strings[i], null);
	    int i_36_ = is.length / 2;
	    Class13_Sub1_Sub2 class13_sub1_sub2
		= new Class13_Sub1_Sub2(-351, is);
	    anIntArrayArray1306[i] = new int[i_36_];
	    aByteArrayArray1297[i] = new byte[i_36_];
	    for (int i_37_ = 0; i_37_ < i_36_; i_37_++)
		anIntArrayArray1306[i][i_37_] = class13_sub1_sub2.readUnsignedShort();
	}
	String[] strings_38_
	    = { "model_crc", "anim_crc", "midi_crc", "map_crc" };
	for (int i = 0; i < 4; i++) {
	    byte[] is = class1.method149(strings_38_[i], null);
	    int i_39_ = is.length / 4;
	    Class13_Sub1_Sub2 class13_sub1_sub2
		= new Class13_Sub1_Sub2(-351, is);
	    anIntArrayArray1323[i] = new int[i_39_];
	    for (int i_40_ = 0; i_40_ < i_39_; i_40_++)
		anIntArrayArray1323[i][i_40_] = class13_sub1_sub2.method316();
	}
	byte[] is = class1.method149("model_index", null);
	int i = anIntArrayArray1306[0].length;
	aByteArray1302 = new byte[i];
	for (int i_41_ = 0; i_41_ < i; i_41_++) {
	    if (i_41_ < is.length)
		aByteArray1302[i_41_] = is[i_41_];
	    else
		aByteArray1302[i_41_] = (byte) 0;
	}
	is = class1.method149("map_index", null);
	Class13_Sub1_Sub2 class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, is);
	i = is.length / 7;
	anIntArray1320 = new int[i];
	anIntArray1332 = new int[i];
	anIntArray1317 = new int[i];
	anIntArray1312 = new int[i];
	for (int i_42_ = 0; i_42_ < i; i_42_++) {
	    anIntArray1320[i_42_] = class13_sub1_sub2.readUnsignedShort();
	    anIntArray1332[i_42_] = class13_sub1_sub2.readUnsignedShort();
	    anIntArray1317[i_42_] = class13_sub1_sub2.readUnsignedShort();
	    anIntArray1312[i_42_] = class13_sub1_sub2.readUnsignedByte();
	}
	is = class1.method149("anim_index", null);
	class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, is);
	i = is.length / 2;
	anIntArray1303 = new int[i];
	for (int i_43_ = 0; i_43_ < i; i_43_++)
	    anIntArray1303[i_43_] = class13_sub1_sub2.readUnsignedShort();
	is = class1.method149("midi_index", null);
	class13_sub1_sub2 = new Class13_Sub1_Sub2(-351, is);
	i = is.length;
	anIntArray1315 = new int[i];
	for (int i_44_ = 0; i_44_ < i; i_44_++)
	    anIntArray1315[i_44_] = class13_sub1_sub2.readUnsignedByte();
	aGame1319 = var_game;
	aBoolean1301 = true;
	aGame1319.method12(this, 2);
    }
    
    public void run() {
	try {
	    while (aBoolean1301) {
		anInt1326++;
		int i = 20;
		if (anInt1307 == 0 && aGame1319.aClass28Array1264[0] != null)
		    i = 50;
		try {
		    Thread.sleep((long) i);
		} catch (Exception exception) {
		    /* empty */
		}
		aBoolean1299 = true;
		for (int i_45_ = 0; i_45_ < 100; i_45_++) {
		    if (!aBoolean1299)
			break;
		    aBoolean1299 = false;
		    method152(-289);
		    method151(27519);
		    if (anInt1308 == 0 && i_45_ >= 5)
			break;
		    method164(0);
		    if (anInputStream1331 != null)
			method165(4717);
		}
		boolean bool = false;
		for (Class13_Sub1_Sub3 class13_sub1_sub3
			 = (Class13_Sub1_Sub3) aClass12_1322.method248();
		     class13_sub1_sub3 != null;
		     class13_sub1_sub3
			 = (Class13_Sub1_Sub3) aClass12_1322.method250(-475)) {
		    if (class13_sub1_sub3.aBoolean1415) {
			bool = true;
			class13_sub1_sub3.anInt1413++;
			if (class13_sub1_sub3.anInt1413 > 50) {
			    class13_sub1_sub3.anInt1413 = 0;
			    method159(0, class13_sub1_sub3);
			}
		    }
		}
		if (!bool) {
		    for (Class13_Sub1_Sub3 class13_sub1_sub3
			     = (Class13_Sub1_Sub3) aClass12_1322.method248();
			 class13_sub1_sub3 != null;
			 class13_sub1_sub3 = ((Class13_Sub1_Sub3)
					      aClass12_1322.method250(-475))) {
			bool = true;
			class13_sub1_sub3.anInt1413++;
			if (class13_sub1_sub3.anInt1413 > 50) {
			    class13_sub1_sub3.anInt1413 = 0;
			    method159(0, class13_sub1_sub3);
			}
		    }
		}
		if (bool) {
		    anInt1325++;
		    if (anInt1325 > 750) {
			try {
			    aSocket1310.close();
			} catch (Exception exception) {
			    /* empty */
			}
			aSocket1310 = null;
			anInputStream1331 = null;
			anOutputStream1300 = null;
			anInt1305 = 0;
		    }
		} else {
		    anInt1325 = 0;
		    aString1318 = "";
		}
		if (aGame1319.aBoolean851 && aSocket1310 != null
		    && anOutputStream1300 != null
		    && (anInt1307 > 0
			|| aGame1319.aClass28Array1264[0] == null)) {
		    anInt1321++;
		    if (anInt1321 > 500) {
			anInt1321 = 0;
			aByteArray1298[0] = (byte) 0;
			aByteArray1298[1] = (byte) 0;
			aByteArray1298[2] = (byte) 0;
			aByteArray1298[3] = (byte) 10;
			try {
			    anOutputStream1300.write(aByteArray1298, 0, 4);
			} catch (IOException ioexception) {
			    anInt1325 = 5000;
			}
		    }
		}
	    }
	} catch (Exception exception) {
	    signlink.reportError("od_ex " + exception.getMessage());
	}
    }
    
    public void method170(int i, boolean bool) {
	try {
	    int i_46_ = anIntArray1320.length;
	    if (i < 0) {
		for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
		    if (bool || anIntArray1312[i_47_] != 0) {
			method162(3, anIntArray1317[i_47_], (byte) 2, false);
			method162(3, anIntArray1332[i_47_], (byte) 2, false);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    signlink.reportError("9908, " + i + ", " + bool + ", "
				 + runtimeexception.toString());
	    throw new RuntimeException();
	}
    }
    
    public Class13_Sub1_Sub3 method171() {
	Class13_Sub1_Sub3 class13_sub1_sub3;
	synchronized (aClass12_1330) {
	    class13_sub1_sub3 = (Class13_Sub1_Sub3) aClass12_1330.method247();
	}
	if (class13_sub1_sub3 == null)
	    return null;
	synchronized (aClass21_1294) {
	    class13_sub1_sub3.method254();
	}
	if (class13_sub1_sub3.aByteArray1412 == null)
	    return class13_sub1_sub3;
	int i = 0;
	try {
	    GZIPInputStream gzipinputstream
		= new GZIPInputStream(new ByteArrayInputStream
				      (class13_sub1_sub3.aByteArray1412));
	    for (;;) {
		if (i == aByteArray1327.length)
		    throw new RuntimeException("buffer overflow!");
		int i_48_ = gzipinputstream.read(aByteArray1327, i,
						 aByteArray1327.length - i);
		if (i_48_ == -1)
		    break;
		i += i_48_;
	    }
	} catch (IOException ioexception) {
	    throw new RuntimeException("error unzipping");
	}
	class13_sub1_sub3.aByteArray1412 = new byte[i];
	for (int i_49_ = 0; i_49_ < i; i_49_++)
	    class13_sub1_sub3.aByteArray1412[i_49_] = aByteArray1327[i_49_];
	return class13_sub1_sub3;
    }
}
