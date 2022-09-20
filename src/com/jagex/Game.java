package com.jagex;

import com.jagex.sign.Signlink;

import java.applet.AppletContext;
import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;

public class Game extends GameShell {

    public static int[][] anIntArrayArray829 = {
        {
                6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433,
                2983, 54193
        }, {
            8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153,
            56621, 4783, 1341, 16578, 35003, 25239
        }, {
                25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094,
                10153, 56621, 4783, 1341, 16578, 35003
        }, {
                4626, 11146, 6439, 12, 4758, 10270
        }, {
                4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574
        }
    };
    public static boolean aBoolean860;
    public static int[] anIntArray913 = {
            9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145,
            58654, 5027, 1457, 16565, 34991, 25486
    };
    public static boolean aBoolean914;
    public static int anInt916;
    public static int anInt942;
    public static int anInt951 = 10;
    public static int anInt952;
    public static boolean aBoolean953 = true;
    public static boolean aBoolean954;
    public static int anInt957;
    public static int anInt958;
    public static boolean aBoolean962;
    public static int anInt963;
    public static String aString966 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    public static int[] anIntArray968;
    public static int anInt986;
    public static Class13_Sub1_Sub1_Sub6_Sub1 aClass13_Sub1_Sub1_Sub6_Sub1_997;
    public static int anInt998;
    public static BigInteger rsaKey = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    public static int anInt1074;
    public static int anInt1077;
    public static BigInteger rsaModulus = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    public static int pulseCycle;
    public static int anInt1142;
    public static int anInt1144;
    public static int anInt1151;
    public static int anInt1153;
    public static int anInt1156;
    public static int anInt1158;
    public static int anInt1170 = 34249;
    public static int anInt1202;
    public static int anInt1238 = -42505;
    public static boolean aBoolean1240 = true;
    public static int anInt1260;
    public static int[] anIntArray1271;
    public static int anInt1272;
    public static int anInt1281;

    static {
        anIntArray968 = new int[99];
        int i = 0;
        for (int j = 0; j < 99; j++) {
            int l = j + 1;
            int i1 = (int) ((double) l + 300D * Math.pow(2D, (double) l / 7D));
            i += i1;
            anIntArray968[j] = i / 4;
        }
        anIntArray1271 = new int[32];
        i = 2;
        for (int k = 0; k < 32; k++) {
            anIntArray1271[k] = i - 1;
            i += i;
        }
    }

    public int[][] anIntArrayArray817;
    public int anInt818;
    public long aLong819;
    public int anInt820;
    public int anInt821;
    public int anInt822;
    public int anInt823;
    public int anInt824;
    public int hasMembershipAndIsOnFreeToPlayWorld;
    public boolean aBoolean826;
    public String aString827;
    public long serverSeed;
    public int anInt830;
    public int[] anIntArray831;
    public int[] anIntArray832;
    public int anInt833;
    public int anInt834;
    public int anInt835;
    public int anInt836;
    public int anInt837;
    public Class13_Sub1_Sub4_Sub3[] aClass13_Sub1_Sub4_Sub3Array838;
    public int[] anIntArray839;
    public String[] aStringArray840;
    public String[] aStringArray841;
    public boolean aBoolean842;
    public int[] anIntArray843;
    public int[] anIntArray844;
    public int[] anIntArray845;
    public int[] anIntArray846;
    public int[] anIntArray847;
    public boolean aBoolean848;
    public int[] anIntArray849;
    public int[] anIntArray850;
    public boolean aBoolean851;
    public int packetSize;
    public int opcode;
    public int anInt854;
    public int anInt855;
    public int anInt856;
    public int[] anIntArray857;
    public int[] anIntArray858;
    public int[] anIntArray859;
    public int anInt861;
    public int anInt862;
    public boolean aBoolean863;
    public int anInt864;
    public Class48 aClass48_865;
    public volatile boolean aBoolean866;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_867;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_868;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_869;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_870;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_871;
    public int anInt872;
    public Class2_Sub1 aClass2_Sub1_873;
    public int anInt874;
    public Class31 aClass31_875;
    public Class31 aClass31_876;
    public Class31 aClass31_877;
    public Class31 aClass31_878;
    public Class31 aClass31_879;
    public Class31 aClass31_880;
    public Class31 aClass31_881;
    public Class31 aClass31_882;
    public Class31 aClass31_883;
    public int anInt884;
    public int anInt885;
    public int anInt886;
    public int anInt887;
    public int anInt888;
    public int anInt889;
    public int anInt890;
    public Class13_Sub1_Sub4_Sub2 aClass13_Sub1_Sub4_Sub2_891;
    public Class13_Sub1_Sub4_Sub2 aClass13_Sub1_Sub4_Sub2_892;
    public Class13_Sub1_Sub4_Sub2 aClass13_Sub1_Sub4_Sub2_893;
    public Class13_Sub1_Sub4_Sub2 aClass13_Sub1_Sub4_Sub2_894;
    public int anInt895;
    public int anInt896;
    public int anInt897;
    public Class13_Sub1_Sub1_Sub6_Sub1[] players;
    public int anInt899;
    public int[] playerList;
    public int anInt901;
    public int[] anIntArray902;
    public Buffer[] aBufferArray903;
    public int anInt904;
    public int anInt905;
    public int anInt906;
    public int anInt907;
    public int[] anIntArray908;
    public int[] anIntArray909;
    public int[] anIntArray910;
    public int[] anIntArray911;
    public int[] anIntArray912;
    public int[] anIntArray915;
    public int anInt917;
    public int daysSinceLastLogin;
    public int anInt919;
    public int anInt920;
    public int anInt921;
    public int anInt922;
    public int anInt923;
    public int anInt924;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_925;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_926;
    public int anInt927;
    public Buffer aBuffer_928;
    public int anInt929;
    public int anInt930;
    public int anInt931;
    public int anInt932;
    public int anInt933;
    public int anInt934;
    public int anInt935;
    public int anInt936;
    public int[] anIntArray937;
    public int[] anIntArray938;
    public int[] anIntArray939;
    public int anInt940;
    public byte[] aByteArray941;
    public int anInt943;
    public boolean aBoolean944;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_945;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_946;
    public Class39[] aClass39Array947;
    public int[] anIntArray948;
    public int anInt949;
    public int anInt950;
    public int anInt955;
    public int unreadMessagesCount;
    public int[] anIntArray959;
    public int[] anIntArray960;
    public String[] aStringArray961;
    public String aString964;
    public int anInt965;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_967;
    public Class12[][][] aClass12ArrayArrayArray969;
    public int[] anIntArray970;
    public boolean aBoolean971;
    public int anInt972;
    public int anInt973;
    public int anInt974;
    public int anInt975;
    public String aString976;
    public boolean aBoolean977;
    public boolean aBoolean978;
    public int anInt979;
    public int anInt980;
    public int anInt981;
    public Class12 aClass12_982;
    public int[] anIntArray983;
    public int anInt984;
    public int anInt985;
    public boolean aBoolean987;
    public int anInt988;
    public boolean aBoolean989;
    public long[] aLongArray990;
    public Class1 aClass1_991;
    public int anInt992;
    public long[] aLongArray993;
    public boolean aBoolean994;
    public int anInt995;
    public int anInt996;
    public int anInt999;
    public int[] anIntArray1000;
    public BufferedConnection gameConnection;
    public int lastLoginAddress;
    public String[] aStringArray1003;
    public int anInt1004;
    public int anInt1005;
    public int anInt1006;
    public int anInt1007;
    public int anInt1008;
    public int anInt1009;
    public boolean aBoolean1010;
    public int[] anIntArray1011;
    public int anInt1012;
    public boolean aBoolean1013;
    public int anInt1014;
    public int anInt1015;
    public int anInt1016;
    public boolean aBoolean1017;
    public int[] anIntArray1018 = {
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1
    };
    public int anInt1019;
    public int anInt1020;
    public int anInt1021;
    public int anInt1022;
    public boolean aBoolean1023;
    public byte aByte1024;
    public int anInt1025;
    public int anInt1026;
    public int anInt1027;
    public int anInt1028;
    public String aString1029;
    public int anInt1030;
    public String[] aStringArray1031;
    public boolean[] aBooleanArray1032;
    public long aLong1033;
    public boolean aBoolean1034;
    public int anInt1035;
    public int anInt1036;
    public int anInt1037;
    public int anInt1038;
    public int anInt1039;
    public int anInt1040;
    public int anInt1041;
    public int anInt1042;
    public int[] anIntArray1043;
    public int[] anIntArray1044;
    public int[] anIntArray1045;
    public volatile boolean aBoolean1046;
    public volatile boolean aBoolean1047;
    public boolean aBoolean1048;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_1049;
    public Widget aWidget_1050;
    public boolean aBoolean1051;
    public int anInt1052;
    public int anInt1053;
    public int anInt1054;
    public int anInt1055;
    public int anInt1056;
    public int anInt1057;
    public int anInt1058;
    public int anInt1059;
    public int anInt1060;
    public int anInt1061;
    public int anInt1062;
    public byte aByte1063;
    public CRC32 aCRC32_1065;
    public byte aByte1066;
    public int anInt1067;
    public boolean aBoolean1068;
    public boolean aBoolean1069;
    public boolean aBoolean1070;
    public int anInt1071;
    public int[] anIntArray1072;
    public int anInt1073;
    public int anInt1075;
    public int anInt1076;
    public int anInt1078;
    public int anInt1079;
    public boolean aBoolean1080;
    public int anInt1081;
    public int anInt1083;
    public int anInt1084;
    public int anInt1085;
    public int anInt1086;
    public int anInt1087;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1088;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1089;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1090;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1091;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1092;
    public int anInt1093;
    public int anInt1094;
    public int daysSinceRecoveryQuestionsUpdated;
    public int[][] anIntArrayArray1097;
    public int anInt1098;
    public boolean aBoolean1099;
    public Buffer outBuffer;
    public int anInt1101;
    public int anInt1102;
    public int[] anIntArray1103;
    public int[] anIntArray1104;
    public int[] anIntArray1105;
    public int[] anIntArray1106;
    public int[] anIntArray1107;
    public int[] anIntArray1108;
    public int[] anIntArray1109;
    public String[] aStringArray1110;
    public int anInt1111;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1112;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1113;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1114;
    public int anInt1115;
    public int[] anIntArray1116;
    public boolean[] aBooleanArray1117;
    public int anInt1118;
    public int anInt1119;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1120;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1121;
    public long aLong1122;
    public Class13_Sub1_Sub4_Sub3[] aClass13_Sub1_Sub4_Sub3Array1123;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_1124;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_1125;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_1126;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_1127;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_1128;
    public int anInt1129;
    public int[] anIntArray1130;
    public int[] anIntArray1131;
    public int anInt1132;
    public int anInt1133;
    public int anInt1134;
    public int anInt1135;
    public int anInt1136;
    public boolean aBoolean1137;
    public int anInt1138;
    public int anInt1139;
    public int[] anIntArray1140;
    public int anInt1141;
    public int anInt1143;
    public Class13_Sub1_Sub4_Sub4[] aClass13_Sub1_Sub4_Sub4Array1145;
    public byte[][] aByteArrayArray1146;
    public boolean aBoolean1147;
    public boolean aBoolean1148;
    public int[] anIntArray1149;
    public int anInt1150;
    public Class12 aClass12_1152;
    public boolean aBoolean1154;
    public Class13_Sub1_Sub4_Sub3[] aClass13_Sub1_Sub4_Sub3Array1155;
    public int anInt1157;
    public int anInt1159;
    public String aString1160;
    public int anInt1161;
    public int anInt1162;
    public ISAACCipher isaacCipher;
    public byte[][][] aByteArrayArrayArray1164;
    public int anInt1165;
    public int anInt1166;
    public int anInt1167;
    public int anInt1168;
    public boolean aBoolean1169;
    public int[] anIntArray1171;
    public byte aByte1172;
    public int anInt1173;
    public String aString1174;
    public String aString1175;
    public int anInt1176;
    public int anInt1177;
    public int[] anIntArray1178 = {
            0xffff00, 0xff0000, 65280, 65535, 0xff00ff, 0xffffff
    };
    public byte[][] aByteArrayArray1179;
    public int anInt1180;
    public Class13_Sub1_Sub4_Sub3[] aClass13_Sub1_Sub4_Sub3Array1181;
    public int anInt1182;
    public int anInt1183;
    public int anInt1184;
    public int anInt1185;
    public Class31 aClass31_1186;
    public Class31 aClass31_1187;
    public Class31 aClass31_1188;
    public Class13_Sub1_Sub4_Sub4[] aClass13_Sub1_Sub4_Sub4Array1189;
    public int[] anIntArray1190;
    public int anInt1191;
    public int anInt1192;
    public boolean aBoolean1193;
    public boolean aBoolean1194;
    public int[] anIntArray1195;
    public String aString1196;
    public int anInt1197;
    public Class10 aClass10_1198;
    public Class12 aClass12_1199;
    public int[] anIntArray1200;
    public Class13_Sub1_Sub4_Sub4[] aClass13_Sub1_Sub4_Sub4Array1201;
    public int anInt1203;
    public int anInt1204;
    public int anInt1205;
    public int anInt1206;
    public int[] anIntArray1207;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1208;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1209;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1210;
    public Class31 aClass31_1211;
    public Class31 aClass31_1212;
    public Class31 aClass31_1213;
    public Class31 aClass31_1214;
    public int anInt1215;
    public boolean aBoolean1216;
    public int anInt1217;
    public String aString1218;
    public Socket aSocket1219;
    public int anInt1220;
    public int anInt1221;
    public int anInt1222;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_1223;
    public int[] anIntArray1224;
    public int anInt1225;
    public int[][][] anIntArrayArrayArray1226;
    public int anInt1227;
    public int[][] anIntArrayArray1228;
    public int anInt1229;
    public String aString1230;
    public int anInt1231;
    public int anInt1232;
    public int[] anIntArray1233 = {
            0, 0, 0, 0, 1, 1, 1, 1, 1, 2,
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
            2, 2, 3
    };
    public boolean aBoolean1234;
    public boolean aBoolean1235;
    public Class13_Sub1_Sub4_Sub4[] aClass13_Sub1_Sub4_Sub4Array1236;
    public boolean aBoolean1237;
    public boolean aBoolean1239;
    public int anInt1241;
    public Buffer buffer;
    public long aLong1243;
    public boolean aBoolean1244;
    public Class31 aClass31_1245;
    public Class31 aClass31_1246;
    public Class31 aClass31_1247;
    public Class31 aClass31_1248;
    public Class31 aClass31_1249;
    public Class31 aClass31_1250;
    public Class31 aClass31_1251;
    public Class31 aClass31_1252;
    public Class31 aClass31_1253;
    public int anInt1254;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1255;
    public Class13_Sub1_Sub4_Sub3 aClass13_Sub1_Sub4_Sub3_1256;
    public int anInt1257;
    public int anInt1258;
    public boolean aBoolean1259;
    public int anInt1261;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_1262;
    public Class13_Sub1_Sub4_Sub4 aClass13_Sub1_Sub4_Sub4_1263;
    public Class28[] aClass28Array1264;
    public int anInt1265;
    public Class13_Sub1_Sub4_Sub4[] aClass13_Sub1_Sub4_Sub4Array1266;
    public int[][][] anIntArrayArrayArray1267;
    public int anInt1268;
    public int anInt1269;
    public int anInt1270;
    public String username;
    public String password;
    public int anInt1275;
    public int anInt1276;
    public int[] anIntArray1277;
    public int[] anIntArray1278;
    public int anInt1279;
    public String aString1280;
    public Buffer aBuffer_1282;
    public Class13_Sub1_Sub1_Sub6_Sub2[] aClass13_Sub1_Sub1_Sub6_Sub2Array1283;
    public int anInt1284;
    public int[] anIntArray1285;
    public boolean aBoolean1286;
    public int anInt1287;
    public int anInt1288;
    public int anInt1289;
    public int anInt1290;

    public Game() {
        anIntArrayArray817 = new int[104][104];
        aBoolean826 = true;
        anIntArray831 = new int[1000];
        anIntArray832 = new int[1000];
        aClass13_Sub1_Sub4_Sub3Array838 = new Class13_Sub1_Sub4_Sub3[2];
        anIntArray839 = new int[100];
        aStringArray840 = new String[100];
        aStringArray841 = new String[100];
        aBoolean842 = false;
        anIntArray847 = new int[151];
        aBoolean848 = false;
        anIntArray849 = new int[5];
        anIntArray850 = new int[200];
        aBoolean851 = false;
        aBoolean863 = true;
        anInt864 = 3;
        aBoolean866 = false;
        anInt872 = -220;
        anInt874 = -1;
        anInt886 = 78;
        anInt895 = -22144;
        anInt896 = 2048;
        anInt897 = 2047;
        players = new Class13_Sub1_Sub1_Sub6_Sub1[anInt896];
        playerList = new int[anInt896];
        anIntArray902 = new int[anInt896];
        aBufferArray903 = new Buffer[anInt896];
        anInt904 = -1;
        anInt905 = 46358;
        anInt906 = 0x766654;
        anIntArray908 = new int[Class44.anInt725];
        anIntArray909 = new int[500];
        anIntArray910 = new int[500];
        anIntArray911 = new int[500];
        anIntArray912 = new int[500];
        anIntArray915 = new int[256];
        anInt917 = 7;
        anInt919 = 12258;
        anInt921 = 128;
        aBuffer_928 = Buffer.method299(816, 1);
        aByteArray941 = new byte[16384];
        aBoolean944 = true;
        aClass39Array947 = new Class39[4];
        anIntArray948 = new int[50];
        anInt949 = 0x4d4233;
        anInt950 = -1;
        anIntArray959 = new int[4000];
        anIntArray960 = new int[4000];
        aStringArray961 = new String[500];
        aString964 = "";
        aClass12ArrayArrayArray969 = new Class12[4][104][104];
        anIntArray970 = new int[2000];
        aBoolean971 = false;
        anInt972 = 1;
        aBoolean977 = false;
        aBoolean978 = false;
        aClass12_982 = new Class12(36944);
        anIntArray983 = new int[Class44.anInt725];
        aBoolean987 = false;
        aBoolean989 = false;
        aLongArray990 = new long[100];
        anInt992 = 9;
        aLongArray993 = new long[200];
        aBoolean994 = true;
        anIntArray1000 = new int[151];
        aStringArray1003 = new String[200];
        anInt1009 = 215;
        aBoolean1010 = true;
        anIntArray1011 = new int[7];
        aBoolean1013 = true;
        anInt1014 = 7;
        anInt1016 = -1;
        aBoolean1017 = false;
        aBoolean1023 = false;
        aByte1024 = 2;
        aStringArray1031 = new String[5];
        aBooleanArray1032 = new boolean[5];
        aBoolean1034 = false;
        anInt1036 = 1;
        anIntArray1045 = new int[Class44.anInt725];
        aBoolean1046 = false;
        aBoolean1047 = false;
        aBoolean1048 = false;
        aWidget_1050 = new Widget();
        aBoolean1051 = false;
        anInt1052 = 36;
        aByte1063 = 2;
        aCRC32_1065 = new CRC32();
        aByte1066 = 4;
        aBoolean1068 = true;
        aBoolean1069 = false;
        aBoolean1070 = false;
        anIntArray1072 = new int[1000];
        anInt1073 = 6;
        anInt1076 = 2;
        anInt1078 = -1;
        anInt1079 = -1;
        aBoolean1080 = true;
        anInt1087 = -1;
        anInt1093 = 395;
        anIntArrayArray1097 = new int[104][104];
        aBoolean1099 = false;
        outBuffer = Buffer.method299(816, 1);
        anInt1102 = 50;
        anIntArray1103 = new int[anInt1102];
        anIntArray1104 = new int[anInt1102];
        anIntArray1105 = new int[anInt1102];
        anIntArray1106 = new int[anInt1102];
        anIntArray1107 = new int[anInt1102];
        anIntArray1108 = new int[anInt1102];
        anIntArray1109 = new int[anInt1102];
        aStringArray1110 = new String[anInt1102];
        anInt1111 = 0x332d25;
        anIntArray1116 = new int[5];
        aBooleanArray1117 = new boolean[5];
        aClass13_Sub1_Sub4_Sub3Array1123 = new Class13_Sub1_Sub4_Sub3[100];
        aBoolean1137 = false;
        anInt1139 = 100;
        anIntArray1140 = new int[100];
        anInt1143 = -1;
        aClass13_Sub1_Sub4_Sub4Array1145 = new Class13_Sub1_Sub4_Sub4[1000];
        aBoolean1147 = true;
        aBoolean1148 = false;
        anIntArray1149 = new int[2000];
        anInt1150 = 308;
        aClass12_1152 = new Class12(36944);
        aBoolean1154 = false;
        anInt1162 = 1;
        anInt1165 = -1;
        aBoolean1169 = false;
        anIntArray1171 = new int[33];
        aByte1172 = 7;
        anInt1173 = 208;
        aString1174 = "";
        aString1175 = "";
        aClass13_Sub1_Sub4_Sub3Array1181 = new Class13_Sub1_Sub4_Sub3[13];
        anInt1182 = 0x23201b;
        anInt1185 = 60;
        aClass13_Sub1_Sub4_Sub4Array1189 = new Class13_Sub1_Sub4_Sub4[100];
        anIntArray1190 = new int[5];
        anInt1191 = -1;
        aBoolean1193 = true;
        aBoolean1194 = false;
        anIntArray1195 = new int[5];
        aString1196 = "";
        aClass12_1199 = new Class12(36944);
        anIntArray1200 = new int[33];
        aClass13_Sub1_Sub4_Sub4Array1201 = new Class13_Sub1_Sub4_Sub4[8];
        anInt1203 = 932;
        anInt1204 = -670;
        anInt1206 = 2;
        anIntArray1207 = new int[50];
        aBoolean1216 = false;
        anInt1217 = -1;
        aString1218 = "";
        anIntArray1224 = new int[5];
        anInt1225 = 60;
        anIntArrayArrayArray1226 = new int[4][13][13];
        anIntArrayArray1228 = new int[104][104];
        anInt1229 = -1;
        aString1230 = "";
        aBoolean1234 = false;
        aBoolean1235 = false;
        aClass13_Sub1_Sub4_Sub4Array1236 = new Class13_Sub1_Sub4_Sub4[20];
        aBoolean1237 = false;
        aBoolean1239 = false;
        buffer = Buffer.method299(816, 1);
        aBoolean1244 = false;
        anInt1258 = 2;
        aBoolean1259 = false;
        anInt1261 = -1;
        aClass28Array1264 = new Class28[5];
        anInt1265 = 4;
        aClass13_Sub1_Sub4_Sub4Array1266 = new Class13_Sub1_Sub4_Sub4[20];
        anInt1268 = -49493;
        username = "";
        password = "";
        anInt1276 = -1;
        anIntArray1277 = new int[9];
        anIntArray1278 = new int[50];
        anInt1279 = -22144;
        aString1280 = "";
        aBuffer_1282 = new Buffer(-351, new byte[5000]);
        aClass13_Sub1_Sub1_Sub6_Sub2Array1283 = new Class13_Sub1_Sub1_Sub6_Sub2[16384];
        anIntArray1285 = new int[16384];
        aBoolean1286 = false;
        anInt1287 = -49493;
    }

    public static String method29(int i, int j) {
        try {
            while (j >= 0) {
                throw new NullPointerException();
            }
            if (i < 0x186a0) {
                return String.valueOf(i);
            }
            if (i < 0x989680) {
                return i / 1000 + "K";
            } else {
                return i / 0xf4240 + "M";
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("80775, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            System.out.println("RS2 user com.jagex.client - release #" + 319);
            if (args.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            anInt951 = Integer.parseInt(args[0]);
            anInt952 = Integer.parseInt(args[1]);
            if (args[2].equals("lowmem")) {
                method106(8);
            } else if (args[2].equals("highmem")) {
                method85(true);
            } else {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            if (args[3].equals("free")) {
                aBoolean953 = false;
            } else if (args[3].equals("members")) {
                aBoolean953 = true;
            } else {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            Signlink.storeid = Integer.parseInt(args[4]);
            Signlink.startpriv(InetAddress.getLocalHost());
            Game game1 = new Game();
            game1.method1(503, (byte) -55, 765);
            game1.loadRSAKeys();
            return;
        } catch (Exception exception) {
            return;
        }
    }

    public static String method58(int i, int j) {
        try {
            while (i >= 0) {
                for (int k = 1; k > 0; k++) {
                }
            }
            String s = String.valueOf(j);
            for (int l = s.length() - 3; l > 0; l -= 3) {
                s = s.substring(0, l) + "," + s.substring(l);
            }
            if (s.length() > 8) {
                s = "@gre@" + s.substring(0, s.length() - 8) + " million @whi@(" + s + ")";
            } else if (s.length() > 4) {
                s = "@cya@" + s.substring(0, s.length() - 4) + "K @whi@(" + s + ")";
            }
            return " " + s;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("53115, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static void method85(boolean flag) {
        try {
            Class10.aBoolean162 = false;
            if (!flag) {
                for (int i = 1; i > 0; i++) {
                }
            }
            Class13_Sub1_Sub4_Sub1.aBoolean1625 = false;
            aBoolean954 = false;
            Class25.aBoolean433 = false;
            Class14.aBoolean272 = false;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("91380, " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static void method106(int i) {
        try {
            Class10.aBoolean162 = true;
            Class13_Sub1_Sub4_Sub1.aBoolean1625 = true;
            aBoolean954 = true;
            Class25.aBoolean433 = true;
            if (i < 8 || i > 8) {
                return;
            } else {
                Class14.aBoolean272 = true;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("30709, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static String method137(int i, int j, int k) {
        try {
            if (k <= 0) {
                throw new NullPointerException();
            }
            int l = j - i;
            if (l < -9) {
                return "@red@";
            }
            if (l < -6) {
                return "@or3@";
            }
            if (l < -3) {
                return "@or2@";
            }
            if (l < 0) {
                return "@or1@";
            }
            if (l > 9) {
                return "@gre@";
            }
            if (l > 6) {
                return "@gr3@";
            }
            if (l > 3) {
                return "@gr2@";
            }
            if (l > 0) {
                return "@gr1@";
            } else {
                return "@yel@";
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("45450, " + i + ", " + j + ", " + k + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    private void loadRSAKeys() {
        try {
            final ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./data/public.key"));
            rsaModulus = (BigInteger) oin.readObject();
            rsaKey = (BigInteger) oin.readObject();
        } catch (final Exception ex) {
            System.err.println("Cannot find public RSA key file! Shutting down...");
            System.exit(1);
        }
    }

    public void method14(int i, int j, int k, int l, int i1, int j1) {
        try {
            int k1 = aClass10_1198.method220(k, l, i1);
            if (k1 != 0) {
                int l1 = aClass10_1198.method224(k, l, i1, k1);
                int l2 = l1 >> 6 & 3;
                int j3 = l1 & 0x1f;
                int l3 = i;
                if (k1 > 0) {
                    l3 = j1;
                }
                int[] ai = aClass13_Sub1_Sub4_Sub4_1223.anIntArray1680;
                int l4 = 24624 + l * 4 + (103 - i1) * 512 * 4;
                int j5 = k1 >> 14 & 0x7fff;
                Class14 class14_2 = Class14.method418(j5);
                if (class14_2.anInt255 != -1) {
                    Class13_Sub1_Sub4_Sub3 class13_sub1_sub4_sub3_2 = aClass13_Sub1_Sub4_Sub3Array1123[class14_2.anInt255];
                    if (class13_sub1_sub4_sub3_2 != null) {
                        int j6 = (class14_2.anInt259 * 4 - class13_sub1_sub4_sub3_2.anInt1669) / 2;
                        int k6 = (class14_2.anInt253 * 4 - class13_sub1_sub4_sub3_2.anInt1670) / 2;
                        class13_sub1_sub4_sub3_2.method401(48 + (104 - i1 - class14_2.anInt253) * 4 + k6, (byte) 83, 48 + l * 4 + j6);
                    }
                } else {
                    if (j3 == 0 || j3 == 2) {
                        if (l2 == 0) {
                            ai[l4] = l3;
                            ai[l4 + 512] = l3;
                            ai[l4 + 1024] = l3;
                            ai[l4 + 1536] = l3;
                        } else if (l2 == 1) {
                            ai[l4] = l3;
                            ai[l4 + 1] = l3;
                            ai[l4 + 2] = l3;
                            ai[l4 + 3] = l3;
                        } else if (l2 == 2) {
                            ai[l4 + 3] = l3;
                            ai[l4 + 3 + 512] = l3;
                            ai[l4 + 3 + 1024] = l3;
                            ai[l4 + 3 + 1536] = l3;
                        } else if (l2 == 3) {
                            ai[l4 + 1536] = l3;
                            ai[l4 + 1536 + 1] = l3;
                            ai[l4 + 1536 + 2] = l3;
                            ai[l4 + 1536 + 3] = l3;
                        }
                    }
                    if (j3 == 3) {
                        if (l2 == 0) {
                            ai[l4] = l3;
                        } else if (l2 == 1) {
                            ai[l4 + 3] = l3;
                        } else if (l2 == 2) {
                            ai[l4 + 3 + 1536] = l3;
                        } else if (l2 == 3) {
                            ai[l4 + 1536] = l3;
                        }
                    }
                    if (j3 == 2) {
                        if (l2 == 3) {
                            ai[l4] = l3;
                            ai[l4 + 512] = l3;
                            ai[l4 + 1024] = l3;
                            ai[l4 + 1536] = l3;
                        } else if (l2 == 0) {
                            ai[l4] = l3;
                            ai[l4 + 1] = l3;
                            ai[l4 + 2] = l3;
                            ai[l4 + 3] = l3;
                        } else if (l2 == 1) {
                            ai[l4 + 3] = l3;
                            ai[l4 + 3 + 512] = l3;
                            ai[l4 + 3 + 1024] = l3;
                            ai[l4 + 3 + 1536] = l3;
                        } else if (l2 == 2) {
                            ai[l4 + 1536] = l3;
                            ai[l4 + 1536 + 1] = l3;
                            ai[l4 + 1536 + 2] = l3;
                            ai[l4 + 1536 + 3] = l3;
                        }
                    }
                }
            }
            k1 = aClass10_1198.method222(k, l, i1);
            if (k1 != 0) {
                int i2 = aClass10_1198.method224(k, l, i1, k1);
                int i3 = i2 >> 6 & 3;
                int k3 = i2 & 0x1f;
                int i4 = k1 >> 14 & 0x7fff;
                Class14 class14_1 = Class14.method418(i4);
                if (class14_1.anInt255 != -1) {
                    Class13_Sub1_Sub4_Sub3 class13_sub1_sub4_sub3_1 = aClass13_Sub1_Sub4_Sub3Array1123[class14_1.anInt255];
                    if (class13_sub1_sub4_sub3_1 != null) {
                        int k5 = (class14_1.anInt259 * 4 - class13_sub1_sub4_sub3_1.anInt1669) / 2;
                        int l5 = (class14_1.anInt253 * 4 - class13_sub1_sub4_sub3_1.anInt1670) / 2;
                        class13_sub1_sub4_sub3_1.method401(48 + (104 - i1 - class14_1.anInt253) * 4 + l5, (byte) 83, 48 + l * 4 + k5);
                    }
                } else if (k3 == 9) {
                    int i5 = 0xeeeeee;
                    if (k1 > 0) {
                        i5 = 0xee0000;
                    }
                    int[] ai1 = aClass13_Sub1_Sub4_Sub4_1223.anIntArray1680;
                    int i6 = 24624 + l * 4 + (103 - i1) * 512 * 4;
                    if (i3 == 0 || i3 == 2) {
                        ai1[i6 + 1536] = i5;
                        ai1[i6 + 1024 + 1] = i5;
                        ai1[i6 + 512 + 2] = i5;
                        ai1[i6 + 3] = i5;
                    } else {
                        ai1[i6] = i5;
                        ai1[i6 + 512 + 1] = i5;
                        ai1[i6 + 1024 + 2] = i5;
                        ai1[i6 + 1536 + 3] = i5;
                    }
                }
            }
            k1 = aClass10_1198.method223(k, l, i1);
            if (j < 3 || j > 3) {
                for (int j2 = 1; j2 > 0; j2++) {
                }
            }
            if (k1 != 0) {
                int k2 = k1 >> 14 & 0x7fff;
                Class14 class14 = Class14.method418(k2);
                if (class14.anInt255 != -1) {
                    Class13_Sub1_Sub4_Sub3 class13_sub1_sub4_sub3 = aClass13_Sub1_Sub4_Sub3Array1123[class14.anInt255];
                    if (class13_sub1_sub4_sub3 != null) {
                        int j4 = (class14.anInt259 * 4 - class13_sub1_sub4_sub3.anInt1669) / 2;
                        int k4 = (class14.anInt253 * 4 - class13_sub1_sub4_sub3.anInt1670) / 2;
                        class13_sub1_sub4_sub3.method401(48 + (104 - i1 - class14.anInt253) * 4 + k4, (byte) 83, 48 + l * 4 + j4);
                        return;
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("73486, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public int method15(int i, int j, int k, int l) {
        try {
            int i1 = 256 - k;
            if (l != 7340) {
                aClass12ArrayArrayArray969 = null;
            }
            return ((j & 0xff00ff) * i1 + (i & 0xff00ff) * k & 0xff00ff00) + ((j & 0xff00) * i1 + (i & 0xff00) * k & 0xff0000) >> 8;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("27317, " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method16(int i) {
        try {
            if (aClass31_1245 != null) {
                return;
            }
            super.aClass31_16 = null;
            aClass31_1214 = null;
            aClass31_1212 = null;
            if (i != 35437) {
                method6();
            }
            aClass31_1211 = null;
            aClass31_1213 = null;
            aClass31_1186 = null;
            aClass31_1187 = null;
            aClass31_1188 = null;
            aClass31_1248 = new Class31(true, 128, method11(736), 265);
            Class13_Sub1_Sub4.method354(false);
            aClass31_1249 = new Class31(true, 128, method11(736), 265);
            Class13_Sub1_Sub4.method354(false);
            aClass31_1245 = new Class31(true, 509, method11(736), 171);
            Class13_Sub1_Sub4.method354(false);
            aClass31_1246 = new Class31(true, 360, method11(736), 132);
            Class13_Sub1_Sub4.method354(false);
            aClass31_1247 = new Class31(true, 360, method11(736), 200);
            Class13_Sub1_Sub4.method354(false);
            aClass31_1250 = new Class31(true, 202, method11(736), 238);
            Class13_Sub1_Sub4.method354(false);
            aClass31_1251 = new Class31(true, 203, method11(736), 238);
            Class13_Sub1_Sub4.method354(false);
            aClass31_1252 = new Class31(true, 74, method11(736), 94);
            Class13_Sub1_Sub4.method354(false);
            aClass31_1253 = new Class31(true, 75, method11(736), 94);
            Class13_Sub1_Sub4.method354(false);
            if (aClass1_991 != null) {
                method32(736);
                method122(8);
            }
            aBoolean1216 = true;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("1902, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method17(int i, int j) {
        try {
            if (j != 9) {
                throw new NullPointerException();
            }
            if (i < 0) {
                return false;
            }
            int k = anIntArray911[i];
            if (k >= 2000) {
                k -= 2000;
            }
            return k == 39;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("66940, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method18(int i) {
        try {
            if (i < 5 || i > 5) {
                anInt1052 = isaacCipher.method190();
            }
            if (anInt1094 != 0) {
                return;
            }
            if (super.anInt29 == 1) {
                int j = super.anInt30 - 25 - 550;
                int k = super.anInt31 - 5 - 4;
                if (j >= 0 && k >= 0 && j < 146 && k < 151) {
                    j -= 73;
                    k -= 75;
                    int l = anInt922 + anInt1205 & 0x7ff;
                    int i1 = Class13_Sub1_Sub4_Sub1.anIntArray1634[l];
                    int j1 = Class13_Sub1_Sub4_Sub1.anIntArray1635[l];
                    i1 = i1 * (anInt1035 + 256) >> 8;
                    j1 = j1 * (anInt1035 + 256) >> 8;
                    int k1 = k * i1 + j * j1 >> 11;
                    int l1 = k * j1 - j * i1 >> 11;
                    int i2 = aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 + k1 >> 7;
                    int j2 = aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 - l1 >> 7;
                    boolean flag = method46(true, 0, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 1, 0, 0, j2, i2, 0);
                    if (flag) {
                        aBuffer_928.writeByte(j);
                        aBuffer_928.writeByte(k);
                        aBuffer_928.writeShort(anInt922);
                        aBuffer_928.writeByte(57);
                        aBuffer_928.writeByte(anInt1205);
                        aBuffer_928.writeByte(anInt1035);
                        aBuffer_928.writeByte(89);
                        aBuffer_928.writeShort(aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587);
                        aBuffer_928.writeShort(aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588);
                        aBuffer_928.writeByte(anInt1081);
                        aBuffer_928.writeByte(63);
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("35611, " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method19(int i) {
        try {
            if (anInt856 > 0) {
                logout(anInt1268);
                return;
            }
            aClass31_1213.method490(false);
            aClass13_Sub1_Sub4_Sub2_892.method381(257, 0, 6, 144, "Connection lost");
            aClass13_Sub1_Sub4_Sub2_892.method381(256, 0xffffff, 6, 143, "Connection lost");
            aClass13_Sub1_Sub4_Sub2_892.method381(257, 0, 6, 159, "Please wait - attempting to reestablish");
            aClass13_Sub1_Sub4_Sub2_892.method381(256, 0xffffff, 6, 158, "Please wait - attempting to reestablish");
            aClass31_1213.method491(super.aGraphics15, 4, false, 4);
            anInt1094 = 0;
            packetSize += i;
            anInt1221 = 0;
            BufferedConnection bufferedConnection = gameConnection;
            aBoolean851 = false;
            anInt995 = 0;
            method56(username, password, true);
            if (!aBoolean851) {
                logout(anInt1268);
            }
            try {
                bufferedConnection.close();
                return;
            } catch (Exception _ex) {
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("81057, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method20(boolean flag, boolean flag1) {
        try {
            method16(35437);
            aClass31_1247.method490(false);
            aClass13_Sub1_Sub4_Sub3_1120.method401(0, (byte) 83, 0);
            aBoolean851 &= flag;
            char c = '\u0168';
            char c1 = '\310';
            if (anInt1220 == 0) {
                int i = c1 / 2 + 80;
                aClass13_Sub1_Sub4_Sub2_891.method382(c / 2, true, aClass2_Sub1_873.aString1318, i, 0x75a9a9, false);
                i = c1 / 2 - 20;
                aClass13_Sub1_Sub4_Sub2_893.method382(c / 2, true, "Welcome to RuneScape", i, 0xffff00, false);
                i += 30;
                int l = c / 2 - 80;
                int k1 = c1 / 2 + 20;
                aClass13_Sub1_Sub4_Sub3_1121.method401(k1 - 20, (byte) 83, l - 73);
                aClass13_Sub1_Sub4_Sub2_893.method382(l, true, "New User", k1 + 5, 0xffffff, false);
                l = c / 2 + 80;
                aClass13_Sub1_Sub4_Sub3_1121.method401(k1 - 20, (byte) 83, l - 73);
                aClass13_Sub1_Sub4_Sub2_893.method382(l, true, "Existing User", k1 + 5, 0xffffff, false);
            }
            if (anInt1220 == 2) {
                int j = c1 / 2 - 40;
                if (aString1174.length() > 0) {
                    aClass13_Sub1_Sub4_Sub2_893.method382(c / 2, true, aString1174, j - 15, 0xffff00, false);
                    aClass13_Sub1_Sub4_Sub2_893.method382(c / 2, true, aString1175, j, 0xffff00, false);
                    j += 30;
                } else {
                    aClass13_Sub1_Sub4_Sub2_893.method382(c / 2, true, aString1175, j - 7, 0xffff00, false);
                    j += 30;
                }
                aClass13_Sub1_Sub4_Sub2_893.method389(true, c / 2 - 90, (byte) 8, j, 0xffffff, "Username: " + username + ((anInt965 == 0) & (pulseCycle % 40 < 20) ? "@yel@|" : ""));
                j += 15;
                aClass13_Sub1_Sub4_Sub2_893.method389(true, c / 2 - 88, (byte) 8, j, 0xffffff, "Password: " + Class24.method451(password, true) + ((anInt965 == 1) & (pulseCycle % 40 < 20) ? "@yel@|" : ""));
                j += 15;
                if (!flag1) {
                    int i1 = c / 2 - 80;
                    int l1 = c1 / 2 + 50;
                    aClass13_Sub1_Sub4_Sub3_1121.method401(l1 - 20, (byte) 83, i1 - 73);
                    aClass13_Sub1_Sub4_Sub2_893.method382(i1, true, "Login", l1 + 5, 0xffffff, false);
                    i1 = c / 2 + 80;
                    aClass13_Sub1_Sub4_Sub3_1121.method401(l1 - 20, (byte) 83, i1 - 73);
                    aClass13_Sub1_Sub4_Sub2_893.method382(i1, true, "Cancel", l1 + 5, 0xffffff, false);
                }
            }
            if (anInt1220 == 3) {
                aClass13_Sub1_Sub4_Sub2_893.method382(c / 2, true, "Create a free account", c1 / 2 - 60, 0xffff00, false);
                int k = c1 / 2 - 35;
                aClass13_Sub1_Sub4_Sub2_893.method382(c / 2, true, "To create a new account you need to", k, 0xffffff, false);
                k += 15;
                aClass13_Sub1_Sub4_Sub2_893.method382(c / 2, true, "go back to the main RuneScape webpage", k, 0xffffff, false);
                k += 15;
                aClass13_Sub1_Sub4_Sub2_893.method382(c / 2, true, "and choose the red 'create account'", k, 0xffffff, false);
                k += 15;
                aClass13_Sub1_Sub4_Sub2_893.method382(c / 2, true, "button at the top right of that page.", k, 0xffffff, false);
                k += 15;
                int j1 = c / 2;
                int i2 = c1 / 2 + 50;
                aClass13_Sub1_Sub4_Sub3_1121.method401(i2 - 20, (byte) 83, j1 - 73);
                aClass13_Sub1_Sub4_Sub2_893.method382(j1, true, "Cancel", i2 + 5, 0xffffff, false);
            }
            aClass31_1247.method491(super.aGraphics15, 171, false, 202);
            if (aBoolean1216) {
                aBoolean1216 = false;
                aClass31_1245.method491(super.aGraphics15, 0, false, 128);
                aClass31_1246.method491(super.aGraphics15, 371, false, 202);
                aClass31_1250.method491(super.aGraphics15, 265, false, 0);
                aClass31_1251.method491(super.aGraphics15, 265, false, 562);
                aClass31_1252.method491(super.aGraphics15, 171, false, 128);
                aClass31_1253.method491(super.aGraphics15, 171, false, 562);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("22199, " + flag + ", " + flag1 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method21(long l, int i) {
        try {
            if (l == 0L) {
                return;
            }
            for (int j = 0; j < anInt1098; j++) {
                if (aLongArray990[j] != l) {
                    continue;
                }
                anInt1098--;
                aBoolean1148 = true;
                for (int k = j; k < anInt1098; k++) {
                    aLongArray990[k] = aLongArray990[k + 1];
                }
                aBuffer_928.method300(64);
                aBuffer_928.writeLong(l);
                break;
            }
            if (i >= 0) {
                aClass12ArrayArrayArray969 = null;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("86168, " + l + ", " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method22(int i) {
        try {
            i = 90 / i;
            if (aBoolean954 && anInt1254 == 2 && Class25.anInt416 != anInt1166) {
                aClass31_1213.method490(false);
                aClass13_Sub1_Sub4_Sub2_892.method381(257, 0, 6, 151, "Loading - please wait.");
                aClass13_Sub1_Sub4_Sub2_892.method381(256, 0xffffff, 6, 150, "Loading - please wait.");
                aClass31_1213.method491(super.aGraphics15, 4, false, 4);
                anInt1254 = 1;
                aLong1243 = System.currentTimeMillis();
            }
            if (anInt1254 == 1) {
                int j = method23(-20);
                if (j != 0 && System.currentTimeMillis() - aLong1243 > 0x57e40L) {
                    Signlink.reportError(username + " glcfb " + serverSeed + "," + j + "," + aBoolean954 + "," + aClass28Array1264[0] + "," + aClass2_Sub1_873.method167() + "," + anInt1166 + "," + anInt984 + "," + anInt985);
                    aLong1243 = System.currentTimeMillis();
                }
            }
            if (anInt1254 == 2 && anInt1166 != anInt1191) {
                anInt1191 = anInt1166;
                method63(8, anInt1166);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("19892, " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public int method23(int i) {
        try {
            for (int j = 0; j < aByteArrayArray1146.length; j++) {
                if (aByteArrayArray1146[j] == null && anIntArray938[j] != -1) {
                    return -1;
                }
                if (aByteArrayArray1179[j] == null && anIntArray939[j] != -1) {
                    return -2;
                }
            }
            boolean flag = true;
            for (int k = 0; k < aByteArrayArray1146.length; k++) {
                byte[] abyte0 = aByteArrayArray1179[k];
                if (abyte0 != null) {
                    int l = (anIntArray937[k] >> 8) * 64 - anInt1083;
                    int i1 = (anIntArray937[k] & 0xff) * 64 - anInt1084;
                    if (aBoolean971) {
                        l = 10;
                        i1 = 10;
                    }
                    flag &= Class25.method464(0, l, i1, abyte0);
                }
            }
            if (i >= 0) {
                aClass12ArrayArrayArray969 = null;
            }
            if (!flag) {
                return -3;
            }
            if (aBoolean1259) {
                return -4;
            } else {
                anInt1254 = 2;
                Class25.anInt416 = anInt1166;
                method91(aBoolean1237);
                aBuffer_928.method300(25);
                return 0;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("53916, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public String getParameter(String s) {
        if (Signlink.mainapp != null) {
            return Signlink.mainapp.getParameter(s);
        } else {
            return super.getParameter(s);
        }
    }

    public void method24(int i, int j, int k) {
        try {
            if (j <= 0) {
                opcode = buffer.readUnsignedByte();
            }
            int l = 0;
            for (int i1 = 0; i1 < 100; i1++) {
                if (aStringArray841[i1] == null) {
                    continue;
                }
                int j1 = anIntArray839[i1];
                int k1 = (70 - l * 14) + anInt1019 + 4;
                if (k1 < -20) {
                    break;
                }
                String s = aStringArray840[i1];
                boolean flag = false;
                if (s != null && s.startsWith("@cr1@")) {
                    s = s.substring(5);
                    boolean flag1 = true;
                }
                if (s != null && s.startsWith("@cr2@")) {
                    s = s.substring(5);
                    byte byte0 = 2;
                }
                if (j1 == 0) {
                    l++;
                }
                if ((j1 == 1 || j1 == 2) && (j1 == 1 || anInt1159 == 0 || anInt1159 == 1 && method71(s, 771))) {
                    if (k > k1 - 14 && k <= k1 && !s.equals(aClass13_Sub1_Sub1_Sub6_Sub1_997.aString1689)) {
                        if (anInt1037 >= 1) {
                            aStringArray961[anInt1167] = "Report abuse @whi@" + s;
                            anIntArray911[anInt1167] = 820;
                            anInt1167++;
                        }
                        aStringArray961[anInt1167] = "Add ignore @whi@" + s;
                        anIntArray911[anInt1167] = 775;
                        anInt1167++;
                        aStringArray961[anInt1167] = "Add friend @whi@" + s;
                        anIntArray911[anInt1167] = 39;
                        anInt1167++;
                    }
                    l++;
                }
                if ((j1 == 3 || j1 == 7) && anInt920 == 0 && (j1 == 7 || anInt1129 == 0 || anInt1129 == 1 && method71(s, 771))) {
                    if (k > k1 - 14 && k <= k1) {
                        if (anInt1037 >= 1) {
                            aStringArray961[anInt1167] = "Report abuse @whi@" + s;
                            anIntArray911[anInt1167] = 820;
                            anInt1167++;
                        }
                        aStringArray961[anInt1167] = "Add ignore @whi@" + s;
                        anIntArray911[anInt1167] = 775;
                        anInt1167++;
                        aStringArray961[anInt1167] = "Add friend @whi@" + s;
                        anIntArray911[anInt1167] = 39;
                        anInt1167++;
                    }
                    l++;
                }
                if (j1 == 4 && (anInt1290 == 0 || anInt1290 == 1 && method71(s, 771))) {
                    if (k > k1 - 14 && k <= k1) {
                        aStringArray961[anInt1167] = "Accept trade @whi@" + s;
                        anIntArray911[anInt1167] = 270;
                        anInt1167++;
                    }
                    l++;
                }
                if ((j1 == 5 || j1 == 6) && anInt920 == 0 && anInt1129 < 2) {
                    l++;
                }
                if (j1 == 8 && (anInt1290 == 0 || anInt1290 == 1 && method71(s, 771))) {
                    if (k > k1 - 14 && k <= k1) {
                        aStringArray961[anInt1167] = "Accept challenge @whi@" + s;
                        anIntArray911[anInt1167] = 818;
                        anInt1167++;
                    }
                    l++;
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("49080, " + i + ", " + j + ", " + k + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method25(boolean flag) {
        try {
            char c = '\u0100';
            for (int i = 10; i < 117; i++) {
                int j = (int) (Math.random() * 100D);
                if (j < 50) {
                    anIntArray1130[i + (c - 2 << 7)] = 255;
                }
            }
            if (flag) {
                aBuffer_928.writeByte(98);
            }
            for (int k = 0; k < 100; k++) {
                int l = (int) (Math.random() * 124D) + 2;
                int j1 = (int) (Math.random() * 128D) + 128;
                int j2 = l + (j1 << 7);
                anIntArray1130[j2] = 192;
            }
            for (int i1 = 1; i1 < c - 1; i1++) {
                for (int k1 = 1; k1 < 127; k1++) {
                    int k2 = k1 + (i1 << 7);
                    anIntArray1131[k2] = (anIntArray1130[k2 - 1] + anIntArray1130[k2 + 1] + anIntArray1130[k2 - 128] + anIntArray1130[k2 + 128]) / 4;
                }
            }
            anInt1184 += 128;
            if (anInt1184 > anIntArray1043.length) {
                anInt1184 -= anIntArray1043.length;
                int l1 = (int) (Math.random() * 12D);
                method103(aClass13_Sub1_Sub4_Sub3Array1155[l1], (byte) 9);
            }
            for (int i2 = 1; i2 < c - 1; i2++) {
                for (int l2 = 1; l2 < 127; l2++) {
                    int j3 = l2 + (i2 << 7);
                    int l3 = anIntArray1131[j3 + 128] - anIntArray1043[j3 + anInt1184 & anIntArray1043.length - 1] / 5;
                    if (l3 < 0) {
                        l3 = 0;
                    }
                    anIntArray1130[j3] = l3;
                }
            }
            for (int i3 = 0; i3 < c - 1; i3++) {
                anIntArray915[i3] = anIntArray915[i3 + 1];
            }
            anIntArray915[c - 1] = (int) (Math.sin((double) pulseCycle / 14D) * 16D + Math.sin((double) pulseCycle / 15D) * 14D + Math.sin((double) pulseCycle / 16D) * 12D);
            if (anInt1176 > 0) {
                anInt1176 -= 4;
            }
            if (anInt1177 > 0) {
                anInt1177 -= 4;
            }
            if (anInt1176 == 0 && anInt1177 == 0) {
                int k3 = (int) (Math.random() * 2000D);
                if (k3 == 0) {
                    anInt1176 = 1024;
                }
                if (k3 == 1) {
                    anInt1177 = 1024;
                    return;
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("68159, " + flag + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void updatePlayers(Buffer buffer, int i, int size) {
        try {
            if (i < 9 || i > 9) {
                method6();
            }
            anInt1071 = 0;
            anInt901 = 0;
            method120(size, buffer, true);
            method136(buffer, size, 1);
            method117(buffer, size, 964);
            method81(buffer, size, false);
            for (int k = 0; k < anInt1071; k++) {
                int index = anIntArray1072[k];
                if (players[index].pulseCycle != pulseCycle) {
                    players[index] = null;
                }
            }
            if (buffer.position != size) {
                Signlink.reportError("Error packet size mismatch in getplayer pos:" + buffer.position + " psize:" + size);
                throw new RuntimeException("eek");
            }
            for (int i1 = 0; i1 < anInt899; i1++) {
                if (players[playerList[i1]] == null) {
                    Signlink.reportError(username + " null entry in pl list - pos:" + i1 + " size:" + anInt899);
                    throw new RuntimeException("eek");
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("27490, " + buffer + ", " + i + ", " + size + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method27(byte byte0, int i) {
        try {
            if (byte0 != 66) {
                anInt917 = isaacCipher.method190();
            }
            if (i < 0) {
                return;
            }
            if (anInt1141 != 0) {
                anInt1141 = 0;
                aBoolean1169 = true;
            }
            int j = anIntArray909[i];
            int k = anIntArray910[i];
            int l = anIntArray911[i];
            int i1 = anIntArray912[i];
            if (l >= 2000) {
                l -= 2000;
            }
            if (l == 952) {
                boolean flag = method46(false, 0, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 0, k, j, 0);
                if (!flag) {
                    flag = method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, k, j, 0);
                }
                anInt929 = super.anInt30;
                anInt930 = super.anInt31;
                anInt932 = 2;
                anInt931 = 0;
                aBuffer_928.method300(98);
                aBuffer_928.method337(anInt1014, j + anInt1083);
                aBuffer_928.writeShort(i1);
                aBuffer_928.writeShort(k + anInt1084);
            }
            if (l == 47) {
                method92(i1, false, j, k);
                aBuffer_928.method300(211);
                aBuffer_928.writeShort(k + anInt1084);
                aBuffer_928.writeShort(i1 >> 14 & 0x7fff);
                aBuffer_928.method337(anInt1014, j + anInt1083);
            }
            if (l == 755 && !aBoolean1048) {
                aBuffer_928.method300(46);
                aBuffer_928.writeShort(k);
                aBoolean1048 = true;
            }
            if (l == 707) {
                aBuffer_928.method300(33);
                aBuffer_928.writeShort(k);
                aBuffer_928.method336(false, i1);
                aBuffer_928.method335(0, j);
                anInt933 = 0;
                anInt934 = k;
                anInt935 = j;
                anInt936 = 2;
                if (Widget.aWidgetArray533[k].anInt573 == anInt1217) {
                    anInt936 = 1;
                }
                if (Widget.aWidgetArray533[k].anInt573 == anInt1016) {
                    anInt936 = 3;
                }
            }
            if (l == 559) {
                boolean flag1 = method46(false, 0, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 0, k, j, 0);
                if (!flag1) {
                    flag1 = method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, k, j, 0);
                }
                anInt929 = super.anInt30;
                anInt930 = super.anInt31;
                anInt932 = 2;
                anInt931 = 0;
                aBuffer_928.method300(184);
                aBuffer_928.writeShort(j + anInt1083);
                aBuffer_928.writeShort(anInt974);
                aBuffer_928.method336(false, k + anInt1084);
                aBuffer_928.writeShort(i1);
            }
            if (l == 69) {
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[i1];
                if (class13_sub1_sub1_sub6_sub2 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub2.anIntArray1616[0], class13_sub1_sub1_sub6_sub2.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    aBuffer_928.method300(111);
                    aBuffer_928.method337(anInt1014, i1);
                }
            }
            if (l == 607) {
                boolean flag2 = method46(false, 0, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 0, k, j, 0);
                if (!flag2) {
                    flag2 = method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, k, j, 0);
                }
                anInt929 = super.anInt30;
                anInt930 = super.anInt31;
                anInt932 = 2;
                anInt931 = 0;
                aBuffer_928.method300(132);
                aBuffer_928.method335(0, i1);
                aBuffer_928.writeShort(j + anInt1083);
                aBuffer_928.writeShort(k + anInt1084);
            }
            if (l == 672) {
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2_1 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[i1];
                if (class13_sub1_sub1_sub6_sub2_1 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub2_1.anIntArray1616[0], class13_sub1_sub1_sub6_sub2_1.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    aBuffer_928.method300(4);
                    aBuffer_928.method336(false, i1);
                }
            }
            if (l == 11) {
                aBuffer_928.method300(6);
                aBuffer_928.method335(0, j);
                aBuffer_928.method335(0, i1);
                aBuffer_928.writeShort(k);
                anInt933 = 0;
                anInt934 = k;
                anInt935 = j;
                anInt936 = 2;
                if (Widget.aWidgetArray533[k].anInt573 == anInt1217) {
                    anInt936 = 1;
                }
                if (Widget.aWidgetArray533[k].anInt573 == anInt1016) {
                    anInt936 = 3;
                }
            }
            if (l == 352) {
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1 = players[i1];
                if (class13_sub1_sub1_sub6_sub1 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub1.anIntArray1616[0], class13_sub1_sub1_sub6_sub1.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    anInt998++;
                    if (anInt998 >= 100) {
                        aBuffer_928.method300(244);
                        aBuffer_928.writeShort(11630);
                        anInt998 = 0;
                    }
                    aBuffer_928.method300(70);
                    aBuffer_928.method335(0, i1);
                }
            }
            if (l == 238) {
                boolean flag3 = method46(false, 0, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 0, k, j, 0);
                if (!flag3) {
                    flag3 = method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, k, j, 0);
                }
                anInt929 = super.anInt30;
                anInt930 = super.anInt31;
                anInt932 = 2;
                anInt931 = 0;
                anInt1142++;
                if (anInt1142 >= 140) {
                    aBuffer_928.method300(29);
                    aBuffer_928.writeTriByte(0x720282);
                    anInt1142 = 0;
                }
                aBuffer_928.method300(183);
                aBuffer_928.method336(false, k + anInt1084);
                aBuffer_928.writeShort(i1);
                aBuffer_928.method335(0, j + anInt1083);
            }
            if (l == 275) {
                method92(i1, false, j, k);
                aBuffer_928.method300(128);
                aBuffer_928.method336(false, i1 >> 14 & 0x7fff);
                aBuffer_928.method336(false, k + anInt1084);
                aBuffer_928.method337(anInt1014, j + anInt1083);
            }
            if (l == 1733) {
                ItemDefinition itemDefinition = ItemDefinition.method505(i1);
                String s4;
                if (itemDefinition.aByteArray622 != null) {
                    s4 = new String(itemDefinition.aByteArray622);
                } else {
                    s4 = "It's a " + itemDefinition.aString649 + ".";
                }
                method70(0, s4, "", (byte) 117);
            }
            if (l == 13) {
                aBuffer_928.method300(228);
                aBuffer_928.method335(0, i1);
                aBuffer_928.method335(0, j);
                aBuffer_928.method335(0, k);
                anInt933 = 0;
                anInt934 = k;
                anInt935 = j;
                anInt936 = 2;
                if (Widget.aWidgetArray533[k].anInt573 == anInt1217) {
                    anInt936 = 1;
                }
                if (Widget.aWidgetArray533[k].anInt573 == anInt1016) {
                    anInt936 = 3;
                }
            }
            if (l == 753) {
                boolean flag4 = method46(false, 0, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 0, k, j, 0);
                if (!flag4) {
                    flag4 = method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, k, j, 0);
                }
                anInt929 = super.anInt30;
                anInt930 = super.anInt31;
                anInt932 = 2;
                anInt931 = 0;
                aBuffer_928.method300(149);
                aBuffer_928.method337(anInt1014, k + anInt1084);
                aBuffer_928.writeShort(j + anInt1083);
                aBuffer_928.writeShort(i1);
            }
            if (l == 7) {
                String s = aStringArray961[i];
                int k1 = s.indexOf("@whi@");
                if (k1 != -1) {
                    long l3 = Class24.method446(s.substring(k1 + 5).trim());
                    int j3 = -1;
                    for (int i4 = 0; i4 < anInt1054; i4++) {
                        if (aLongArray993[i4] != l3) {
                            continue;
                        }
                        j3 = i4;
                        break;
                    }
                    if (j3 != -1 && anIntArray850[j3] > 0) {
                        aBoolean1169 = true;
                        anInt1141 = 0;
                        aBoolean1017 = true;
                        aString1218 = "";
                        anInt943 = 3;
                        aLong1033 = aLongArray993[j3];
                        aString1196 = "Enter message to send to " + aStringArray1003[j3];
                    }
                }
            }
            if (l == 71) {
                anInt1156 += k;
                if (anInt1156 >= 117) {
                    aBuffer_928.method300(207);
                    aBuffer_928.writeShort(43551);
                    anInt1156 = 0;
                }
                aBuffer_928.method300(83);
                aBuffer_928.method335(0, i1);
                aBuffer_928.writeShort(j);
                aBuffer_928.method337(anInt1014, k);
                anInt933 = 0;
                anInt934 = k;
                anInt935 = j;
                anInt936 = 2;
                if (Widget.aWidgetArray533[k].anInt573 == anInt1217) {
                    anInt936 = 1;
                }
                if (Widget.aWidgetArray533[k].anInt573 == anInt1016) {
                    anInt936 = 3;
                }
            }
            if (l == 79) {
                aBuffer_928.method300(47);
                aBuffer_928.method335(0, j);
                aBuffer_928.method337(anInt1014, i1);
                aBuffer_928.writeShort(anInt974);
                aBuffer_928.method337(anInt1014, k);
                anInt933 = 0;
                anInt934 = k;
                anInt935 = j;
                anInt936 = 2;
                if (Widget.aWidgetArray533[k].anInt573 == anInt1217) {
                    anInt936 = 1;
                }
                if (Widget.aWidgetArray533[k].anInt573 == anInt1016) {
                    anInt936 = 3;
                }
            }
            if (l == 259) {
                anInt942 += j;
                if (anInt942 >= 114) {
                    aBuffer_928.method300(186);
                    aBuffer_928.writeByte(175);
                    anInt942 = 0;
                }
                method92(i1, false, j, k);
                aBuffer_928.method300(17);
                aBuffer_928.method337(anInt1014, i1 >> 14 & 0x7fff);
                aBuffer_928.method336(false, k + anInt1084);
                aBuffer_928.writeShort(j + anInt1083);
            }
            if (l == 326) {
                boolean flag5 = method46(false, 0, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 0, k, j, 0);
                if (!flag5) {
                    flag5 = method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, k, j, 0);
                }
                anInt929 = super.anInt30;
                anInt930 = super.anInt31;
                anInt932 = 2;
                anInt931 = 0;
                aBuffer_928.method300(18);
                aBuffer_928.method337(anInt1014, anInt1027);
                aBuffer_928.method335(0, j + anInt1083);
                aBuffer_928.method337(anInt1014, anInt1028);
                aBuffer_928.method336(false, k + anInt1084);
                aBuffer_928.writeShort(i1);
                aBuffer_928.method337(anInt1014, anInt1026);
            }
            if (l == 650) {
                aBuffer_928.method300(115);
                aBuffer_928.method336(false, k);
                aBuffer_928.method336(false, i1);
                aBuffer_928.method337(anInt1014, j);
                anInt933 = 0;
                anInt934 = k;
                anInt935 = j;
                anInt936 = 2;
                if (Widget.aWidgetArray533[k].anInt573 == anInt1217) {
                    anInt936 = 1;
                }
                if (Widget.aWidgetArray533[k].anInt573 == anInt1016) {
                    anInt936 = 3;
                }
            }
            if (l == 257) {
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2_2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[i1];
                if (class13_sub1_sub1_sub6_sub2_2 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub2_2.anIntArray1616[0], class13_sub1_sub1_sub6_sub2_2.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    aBuffer_928.method300(103);
                    aBuffer_928.method337(anInt1014, i1);
                }
            }
            if (l == 195) {
                anInt1025 = 1;
                anInt1026 = j;
                anInt1027 = k;
                anInt1028 = i1;
                aString1029 = ItemDefinition.method505(i1).aString649;
                anInt973 = 0;
                aBoolean1148 = true;
                return;
            }
            if (l == 1870) {
                ItemDefinition itemDefinition_1 = ItemDefinition.method505(i1);
                Widget widget_4 = Widget.aWidgetArray533[k];
                String s5;
                if (widget_4 != null && widget_4.anIntArray579[j] >= 0x186a0) {
                    s5 = widget_4.anIntArray579[j] + " x " + itemDefinition_1.aString649;
                } else if (itemDefinition_1.aByteArray622 != null) {
                    s5 = new String(itemDefinition_1.aByteArray622);
                } else {
                    s5 = "It's a " + itemDefinition_1.aString649 + ".";
                }
                method70(0, s5, "", (byte) 117);
            }
            if (l == 426) {
                aBuffer_928.method300(123);
                aBuffer_928.method335(0, i1);
                aBuffer_928.method336(false, j);
                aBuffer_928.method335(0, k);
                anInt933 = 0;
                anInt934 = k;
                anInt935 = j;
                anInt936 = 2;
                if (Widget.aWidgetArray533[k].anInt573 == anInt1217) {
                    anInt936 = 1;
                }
                if (Widget.aWidgetArray533[k].anInt573 == anInt1016) {
                    anInt936 = 3;
                }
            }
            if (l == 1210) {
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2_3 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[i1];
                if (class13_sub1_sub1_sub6_sub2_3 != null) {
                    Class47 class47 = class13_sub1_sub1_sub6_sub2_3.aClass47_1717;
                    if (class47.anIntArray751 != null) {
                        class47 = class47.method584((byte) 0);
                    }
                    if (class47 != null) {
                        String s7;
                        if (class47.aByteArray754 != null) {
                            s7 = new String(class47.aByteArray754);
                        } else {
                            s7 = "It's a " + class47.aString765 + ".";
                        }
                        method70(0, s7, "", (byte) 117);
                    }
                }
            }
            if (l == 682) {
                aBuffer_928.method300(189);
                aBuffer_928.writeShort(k);
                Widget widget = Widget.aWidgetArray533[k];
                if (widget.anIntArrayArray581 != null && widget.anIntArrayArray581[0][0] == 5) {
                    int l1 = widget.anIntArrayArray581[0][1];
                    if (anIntArray1149[l1] != widget.anIntArray556[0]) {
                        anIntArray1149[l1] = widget.anIntArray556[0];
                        method64(true, l1);
                        aBoolean1148 = true;
                    }
                }
            }
            if (l == 307) {
                method92(i1, false, j, k);
                aBuffer_928.method300(154);
                aBuffer_928.method335(0, i1 >> 14 & 0x7fff);
                aBuffer_928.method337(anInt1014, k + anInt1084);
                aBuffer_928.method337(anInt1014, j + anInt1083);
            }
            if (l == 345) {
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1_1 = players[i1];
                if (class13_sub1_sub1_sub6_sub1_1 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub1_1.anIntArray1616[0], class13_sub1_sub1_sub6_sub1_1.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    aBuffer_928.method300(156);
                    aBuffer_928.method335(0, i1);
                }
            }
            if (l == 183) {
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1_2 = players[i1];
                if (class13_sub1_sub1_sub6_sub1_2 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub1_2.anIntArray1616[0], class13_sub1_sub1_sub6_sub1_2.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    aBuffer_928.method300(107);
                    aBuffer_928.method337(anInt1014, anInt974);
                    aBuffer_928.writeShort(i1);
                }
            }
            if (l == 582) {
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2_4 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[i1];
                if (class13_sub1_sub1_sub6_sub2_4 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub2_4.anIntArray1616[0], class13_sub1_sub1_sub6_sub2_4.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    aBuffer_928.method300(55);
                    aBuffer_928.writeShort(i1);
                    aBuffer_928.method337(anInt1014, anInt974);
                }
            }
            if (l == 1877) {
                int j1 = i1 >> 14 & 0x7fff;
                Class14 class14 = Class14.method418(j1);
                String s8;
                if (class14.aByteArray276 != null) {
                    s8 = new String(class14.aByteArray276);
                } else {
                    s8 = "It's a " + class14.aString275 + ".";
                }
                method70(0, s8, "", (byte) 117);
            }
            if (l == 219) {
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1_3 = players[i1];
                if (class13_sub1_sub1_sub6_sub1_3 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub1_3.anIntArray1616[0], class13_sub1_sub1_sub6_sub1_3.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    aBuffer_928.method300(175);
                    aBuffer_928.method337(anInt1014, i1);
                }
            }
            if (l == 222) {
                aBuffer_928.method300(114);
                aBuffer_928.writeShort(j);
                aBuffer_928.method336(false, k);
                aBuffer_928.method336(false, i1);
                anInt933 = 0;
                anInt934 = k;
                anInt935 = j;
                anInt936 = 2;
                if (Widget.aWidgetArray533[k].anInt573 == anInt1217) {
                    anInt936 = 1;
                }
                if (Widget.aWidgetArray533[k].anInt573 == anInt1016) {
                    anInt936 = 3;
                }
            }
            if (l == 270 || l == 818) {
                String s1 = aStringArray961[i];
                int i2 = s1.indexOf("@whi@");
                if (i2 != -1) {
                    s1 = s1.substring(i2 + 5).trim();
                    String s9 = Class24.method450(Class24.method447(Class24.method446(s1), 0), 0);
                    boolean flag8 = false;
                    for (int k3 = 0; k3 < anInt899; k3++) {
                        Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1_7 = players[playerList[k3]];
                        if (class13_sub1_sub1_sub6_sub1_7 == null || class13_sub1_sub1_sub6_sub1_7.aString1689 == null || !class13_sub1_sub1_sub6_sub1_7.aString1689.equalsIgnoreCase(s9)) {
                            continue;
                        }
                        method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub1_7.anIntArray1616[0], class13_sub1_sub1_sub6_sub1_7.anIntArray1615[0], 0);
                        if (l == 270) {
                            aBuffer_928.method300(134);
                            aBuffer_928.method335(0, playerList[k3]);
                        }
                        if (l == 818) {
                            anInt998++;
                            if (anInt998 >= 100) {
                                aBuffer_928.method300(244);
                                aBuffer_928.writeShort(11630);
                                anInt998 = 0;
                            }
                            aBuffer_928.method300(70);
                            aBuffer_928.method335(0, playerList[k3]);
                        }
                        flag8 = true;
                        break;
                    }
                    if (!flag8) {
                        method70(0, "Unable to find " + s9, "", (byte) 117);
                    }
                }
            }
            if (l == 456 && method92(i1, false, j, k)) {
                aBuffer_928.method300(161);
                aBuffer_928.writeShort(anInt974);
                aBuffer_928.method337(anInt1014, i1 >> 14 & 0x7fff);
                aBuffer_928.writeShort(j + anInt1083);
                aBuffer_928.method336(false, k + anInt1084);
            }
            if (l == 813) {
                Widget widget_1 = Widget.aWidgetArray533[k];
                anInt973 = 1;
                anInt974 = k;
                anInt975 = widget_1.anInt558;
                anInt1025 = 0;
                aBoolean1148 = true;
                String s6 = widget_1.aString563;
                if (s6.indexOf(" ") != -1) {
                    s6 = s6.substring(0, s6.indexOf(" "));
                }
                String s10 = widget_1.aString563;
                if (s10.indexOf(" ") != -1) {
                    s10 = s10.substring(s10.indexOf(" ") + 1);
                }
                aString976 = s6 + " " + widget_1.aString553 + " " + s10;
                if (anInt975 == 16) {
                    aBoolean1148 = true;
                    anInt864 = 3;
                    aBoolean1286 = true;
                }
                return;
            }
            if (l == 947 && method92(i1, false, j, k)) {
                aBuffer_928.method300(125);
                aBuffer_928.method337(anInt1014, anInt1028);
                aBuffer_928.writeShort(k + anInt1084);
                aBuffer_928.method337(anInt1014, j + anInt1083);
                aBuffer_928.writeShort(anInt1026);
                aBuffer_928.method336(false, anInt1027);
                aBuffer_928.method337(anInt1014, i1 >> 14 & 0x7fff);
            }
            if (l == 820) {
                String s2 = aStringArray961[i];
                int j2 = s2.indexOf("@whi@");
                if (j2 != -1) {
                    if (anInt1217 == -1) {
                        method140(6);
                        aString1230 = s2.substring(j2 + 5).trim();
                        aBoolean1034 = false;
                        for (int i3 = 0; i3 < Widget.aWidgetArray533.length; i3++) {
                            if (Widget.aWidgetArray533[i3] == null || Widget.aWidgetArray533[i3].anInt577 != 600) {
                                continue;
                            }
                            anInt1165 = anInt1217 = Widget.aWidgetArray533[i3].anInt573;
                            break;
                        }
                    } else {
                        method70(0, "Please close the interface you have open before using 'report abuse'", "", (byte) 117);
                    }
                }
            }
            if (l == 514) {
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1_4 = players[i1];
                if (class13_sub1_sub1_sub6_sub1_4 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub1_4.anIntArray1616[0], class13_sub1_sub1_sub6_sub1_4.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    aBuffer_928.method300(187);
                    aBuffer_928.writeShort(i1);
                }
            }
            if (l == 678) {
                aBuffer_928.method300(169);
                aBuffer_928.method337(anInt1014, k);
                aBuffer_928.method337(anInt1014, i1);
                aBuffer_928.writeShort(j);
                anInt933 = 0;
                anInt934 = k;
                anInt935 = j;
                anInt936 = 2;
                if (Widget.aWidgetArray533[k].anInt573 == anInt1217) {
                    anInt936 = 1;
                }
                if (Widget.aWidgetArray533[k].anInt573 == anInt1016) {
                    anInt936 = 3;
                }
            }
            if (l == 616) {
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2_5 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[i1];
                if (class13_sub1_sub1_sub6_sub2_5 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub2_5.anIntArray1616[0], class13_sub1_sub1_sub6_sub2_5.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    anInt1077++;
                    if (anInt1077 >= 63) {
                        aBuffer_928.method300(54);
                        aBuffer_928.writeTriByte(0x91c665);
                        anInt1077 = 0;
                    }
                    aBuffer_928.method300(229);
                    aBuffer_928.method335(0, i1);
                }
            }
            if (l == 447) {
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2_6 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[i1];
                if (class13_sub1_sub1_sub6_sub2_6 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub2_6.anIntArray1616[0], class13_sub1_sub1_sub6_sub2_6.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    aBuffer_928.method300(88);
                    aBuffer_928.method336(false, i1);
                    aBuffer_928.method336(false, anInt1026);
                    aBuffer_928.method335(0, anInt1028);
                    aBuffer_928.writeShort(anInt1027);
                }
            }
            if (l == 894) {
                aBuffer_928.method300(188);
                aBuffer_928.method336(false, k);
                aBuffer_928.writeShort(anInt1026);
                aBuffer_928.method337(anInt1014, j);
                aBuffer_928.writeShort(i1);
                aBuffer_928.method336(false, anInt1028);
                aBuffer_928.method337(anInt1014, anInt1027);
                anInt933 = 0;
                anInt934 = k;
                anInt935 = j;
                anInt936 = 2;
                if (Widget.aWidgetArray533[k].anInt573 == anInt1217) {
                    anInt936 = 1;
                }
                if (Widget.aWidgetArray533[k].anInt573 == anInt1016) {
                    anInt936 = 3;
                }
            }
            if (l == 654) {
                aBuffer_928.method300(189);
                aBuffer_928.writeShort(k);
                Widget widget_2 = Widget.aWidgetArray533[k];
                if (widget_2.anIntArrayArray581 != null && widget_2.anIntArrayArray581[0][0] == 5) {
                    int k2 = widget_2.anIntArrayArray581[0][1];
                    anIntArray1149[k2] = 1 - anIntArray1149[k2];
                    method64(true, k2);
                    aBoolean1148 = true;
                }
            }
            if (l == 546) {
                boolean flag6 = method46(false, 0, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 0, k, j, 0);
                if (!flag6) {
                    flag6 = method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, k, j, 0);
                }
                anInt929 = super.anInt30;
                anInt930 = super.anInt31;
                anInt932 = 2;
                anInt931 = 0;
                aBuffer_928.method300(202);
                aBuffer_928.method336(false, i1);
                aBuffer_928.method337(anInt1014, j + anInt1083);
                aBuffer_928.method336(false, k + anInt1084);
            }
            if (l == 1574) {
                method92(i1, false, j, k);
                aBuffer_928.method300(0);
                aBuffer_928.method335(0, j + anInt1083);
                aBuffer_928.writeShort(k + anInt1084);
                aBuffer_928.writeShort(i1 >> 14 & 0x7fff);
            }
            if (l == 812) {
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1_5 = players[i1];
                if (class13_sub1_sub1_sub6_sub1_5 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub1_5.anIntArray1616[0], class13_sub1_sub1_sub6_sub1_5.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    aBuffer_928.method300(134);
                    aBuffer_928.method335(0, i1);
                }
            }
            if (l == 758) {
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1_6 = players[i1];
                if (class13_sub1_sub1_sub6_sub1_6 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub1_6.anIntArray1616[0], class13_sub1_sub1_sub6_sub1_6.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    aBuffer_928.method300(212);
                    aBuffer_928.method337(anInt1014, anInt1027);
                    aBuffer_928.method337(anInt1014, anInt1026);
                    aBuffer_928.writeShort(anInt1028);
                    aBuffer_928.method336(false, i1);
                }
            }
            if (l == 324) {
                method140(6);
            }
            if (l == 333) {
                aBuffer_928.method300(136);
                aBuffer_928.method335(0, k);
                aBuffer_928.method335(0, i1);
                aBuffer_928.method337(anInt1014, j);
                anInt933 = 0;
                anInt934 = k;
                anInt935 = j;
                anInt936 = 2;
                if (Widget.aWidgetArray533[k].anInt573 == anInt1217) {
                    anInt936 = 1;
                }
                if (Widget.aWidgetArray533[k].anInt573 == anInt1016) {
                    anInt936 = 3;
                }
            }
            if (l == 39 || l == 775 || l == 785 || l == 781) {
                String s3 = aStringArray961[i];
                int l2 = s3.indexOf("@whi@");
                if (l2 != -1) {
                    long l4 = Class24.method446(s3.substring(l2 + 5).trim());
                    if (l == 39) {
                        method45(688, l4);
                    }
                    if (l == 775) {
                        method77(l4, 1);
                    }
                    if (l == 785) {
                        method123(1, l4);
                    }
                    if (l == 781) {
                        method21(l4, -224);
                    }
                }
            }
            if (l == 291) {
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2_7 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[i1];
                if (class13_sub1_sub1_sub6_sub2_7 != null) {
                    method46(false, 1, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, 0, 1, class13_sub1_sub1_sub6_sub2_7.anIntArray1616[0], class13_sub1_sub1_sub6_sub2_7.anIntArray1615[0], 0);
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 2;
                    anInt931 = 0;
                    aBuffer_928.method300(49);
                    aBuffer_928.writeShort(i1);
                }
            }
            if (l == 190) {
                Widget widget_3 = Widget.aWidgetArray533[k];
                boolean flag7 = true;
                if (widget_3.anInt577 > 0) {
                    flag7 = method49((byte) 1, widget_3);
                }
                if (flag7) {
                    aBuffer_928.method300(189);
                    aBuffer_928.writeShort(k);
                }
            }
            if (l == 770) {
                if (!aBoolean989) {
                    aClass10_1198.method232(super.anInt31 - 4, true, super.anInt30 - 4);
                } else {
                    aClass10_1198.method232(k - 4, true, j - 4);
                }
            }
            if (l == 31) {
                aBuffer_928.method300(165);
                aBuffer_928.method337(anInt1014, j);
                aBuffer_928.writeShort(i1);
                aBuffer_928.method337(anInt1014, k);
                anInt933 = 0;
                anInt934 = k;
                anInt935 = j;
                anInt936 = 2;
                if (Widget.aWidgetArray533[k].anInt573 == anInt1217) {
                    anInt936 = 1;
                }
                if (Widget.aWidgetArray533[k].anInt573 == anInt1016) {
                    anInt936 = 3;
                }
            }
            anInt1025 = 0;
            anInt973 = 0;
            aBoolean1148 = true;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("43037, " + byte0 + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method28(boolean flag) {
        try {
            method145(0);
            if (anInt932 == 1) {
                aClass13_Sub1_Sub4_Sub4Array1201[anInt931 / 100].method408(anInt930 - 8 - 4, (byte) 83, anInt929 - 8 - 4);
                anInt986++;
                if (anInt986 > 152) {
                    anInt986 = 0;
                    aBuffer_928.method300(181);
                    aBuffer_928.writeTriByte(0x565a19);
                }
            }
            if (anInt932 == 2) {
                aClass13_Sub1_Sub4_Sub4Array1201[4 + anInt931 / 100].method408(anInt930 - 8 - 4, (byte) 83, anInt929 - 8 - 4);
            }
            if (anInt1143 != -1) {
                method74(anInt1241, true, anInt1143);
                method67(Widget.aWidgetArray533[anInt1143], 0, 0, 0, 988);
            }
            if (anInt1217 != -1) {
                method74(anInt1241, true, anInt1217);
                method67(Widget.aWidgetArray533[anInt1217], 0, 0, 0, 988);
            }
            method87((byte) 9);
            if (flag) {
                for (int i = 1; i > 0; i++) {
                }
            }
            if (!aBoolean989) {
                method114(false);
                method86(false);
            } else if (anInt820 == 0) {
                method60(45234);
            }
            if (anInt887 == 1) {
                aClass13_Sub1_Sub4_Sub4Array1236[1].method408(296, (byte) 83, 472);
            }
            if (aBoolean962) {
                char c = '\u01FB';
                int k = 20;
                int i1 = 0xffff00;
                if (super.anInt11 < 15) {
                    i1 = 0xff0000;
                }
                aClass13_Sub1_Sub4_Sub2_892.method380(k, aBoolean1235, "Fps:" + super.anInt11, c, i1);
                k += 15;
                Runtime runtime = Runtime.getRuntime();
                int j1 = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                i1 = 0xffff00;
                if (j1 > 0x2000000 && aBoolean954) {
                    i1 = 0xff0000;
                }
                aClass13_Sub1_Sub4_Sub2_892.method380(k, aBoolean1235, "Mem:" + j1 + "k", c, 0xffff00);
                k += 15;
            }
            if (anInt1269 != 0) {
                int j = anInt1269 / 50;
                int l = j / 60;
                j %= 60;
                if (j < 10) {
                    aClass13_Sub1_Sub4_Sub2_892.method385((byte) -96, "System update in: " + l + ":0" + j, 0xffff00, 4, 329);
                    return;
                } else {
                    aClass13_Sub1_Sub4_Sub2_892.method385((byte) -96, "System update in: " + l + ":" + j, 0xffff00, 4, 329);
                    return;
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("68914, " + flag + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method9(boolean flag) {
        try {
            if (aBoolean1239 || aBoolean1234 || aBoolean842) {
                method51(aByte1024);
                return;
            }
            anInt1202++;
            if (flag) {
                for (int i = 1; i > 0; i++) {
                }
            }
            if (!aBoolean851) {
                method20(true, false);
            } else {
                method132(-24986);
            }
            anInt1067 = 0;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("42419, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public AppletContext getAppletContext() {
        if (Signlink.mainapp != null) {
            return Signlink.mainapp.getAppletContext();
        } else {
            return super.getAppletContext();
        }
    }

    public boolean parseIncomingPacket(int i) {
        try {
            if (i <= 0) {
                anInt1052 = 143;
            }
            if (gameConnection == null) {
                return false;
            }
            try {
                int available = gameConnection.getAvailable();
                if (available == 0) {
                    return false;
                }
                if (opcode == -1) {
                    gameConnection.read(buffer.payload, 0, 1);
                    opcode = buffer.payload[0] & 0xff;
                    if (isaacCipher != null) {
                        opcode = opcode - isaacCipher.method190() & 0xff;
                    }
                    packetSize = Class33.PACKET_SIZES[opcode];
                    available--;
                }
                if (packetSize == -1) {
                    if (available > 0) {
                        gameConnection.read(buffer.payload, 0, 1);
                        packetSize = buffer.payload[0] & 0xff;
                        available--;
                    } else {
                        return false;
                    }
                }
                if (packetSize == -2) {
                    if (available > 1) {
                        gameConnection.read(buffer.payload, 0, 2);
                        buffer.position = 0;
                        packetSize = buffer.readUnsignedShort();
                        available -= 2;
                    } else {
                        return false;
                    }
                }
                if (available < packetSize) {
                    return false;
                }
                buffer.position = 0;
                gameConnection.read(buffer.payload, 0, packetSize);
                anInt854 = 0;
                anInt890 = anInt889;
                anInt889 = anInt888;
                anInt888 = opcode;
                if (IncomingPacket.SHOW_SIDEBAR_AND_WIDGET.equals(opcode)) {
                    int widgetId = buffer.readUnsignedShort();
                    int tabId = buffer.readUnsignedByteA(856);
                    if (widgetId == 65535) {
                        widgetId = -1;
                    }
                    anIntArray1018[tabId] = widgetId;
                    aBoolean1148 = true;
                    aBoolean1286 = true;
                    opcode = -1;
                    return true;
                }
                if (opcode == 4) {
                    aBoolean848 = true;
                    anInt833 = buffer.readUnsignedByte();
                    anInt834 = buffer.readUnsignedByte();
                    anInt835 = buffer.readUnsignedShort();
                    anInt836 = buffer.readUnsignedByte();
                    anInt837 = buffer.readUnsignedByte();
                    if (anInt837 >= 100) {
                        anInt1004 = anInt833 * 128 + 64;
                        anInt1006 = anInt834 * 128 + 64;
                        anInt1005 = method80(anInt1166, 781, anInt1006, anInt1004) - anInt835;
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 252) {
                    int l = buffer.readUnsignedLittleEndianShortA();
                    Widget.aWidgetArray533[l].modelType = 3;
                    if (aClass13_Sub1_Sub1_Sub6_Sub1_997.aClass47_1716 == null) {
                        Widget.aWidgetArray533[l].anInt542 = (aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1700[0] << 25) + (aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1700[4] << 20) + (aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1703[0] << 15) + (aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1703[8] << 10) + (aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1703[11] << 5) + aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1703[1];
                    } else {
                        Widget.aWidgetArray533[l].anInt542 = (int) (0x12345678L + aClass13_Sub1_Sub1_Sub6_Sub1_997.aClass47_1716.aLong770);
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 31) {
                    anInt1098 = packetSize / 8;
                    for (int i1 = 0; i1 < anInt1098; i1++) {
                        aLongArray990[i1] = buffer.readLong(0);
                    }
                    opcode = -1;
                    return true;
                }
                if (IncomingPacket.ADD_CHATBOX_MESSAGE.equals(opcode)) {
                    String s = buffer.readString();
                    if (s.endsWith(":tradereq:")) {
                        String s3 = s.substring(0, s.indexOf(":"));
                        long l15 = Class24.method446(s3);
                        boolean flag1 = false;
                        for (int j26 = 0; j26 < anInt1098; j26++) {
                            if (aLongArray990[j26] != l15) {
                                continue;
                            }
                            flag1 = true;
                            break;
                        }
                        if (!flag1 && anInt1180 == 0) {
                            method70(4, "wishes to trade with you.", s3, (byte) 117);
                        }
                    } else if (s.endsWith(":duelreq:")) {
                        String s4 = s.substring(0, s.indexOf(":"));
                        long l16 = Class24.method446(s4);
                        boolean flag2 = false;
                        for (int k26 = 0; k26 < anInt1098; k26++) {
                            if (aLongArray990[k26] != l16) {
                                continue;
                            }
                            flag2 = true;
                            break;
                        }
                        if (!flag2 && anInt1180 == 0) {
                            method70(8, "wishes to duel with you.", s4, (byte) 117);
                        }
                    } else if (s.endsWith(":chalreq:")) {
                        String s5 = s.substring(0, s.indexOf(":"));
                        long l17 = Class24.method446(s5);
                        boolean flag3 = false;
                        for (int l26 = 0; l26 < anInt1098; l26++) {
                            if (aLongArray990[l26] != l17) {
                                continue;
                            }
                            flag3 = true;
                            break;
                        }
                        if (!flag3 && anInt1180 == 0) {
                            String s8 = s.substring(s.indexOf(":") + 1, s.length() - 9);
                            method70(8, s8, s5, (byte) 117);
                        }
                    } else {
                        method70(0, s, "", (byte) 117);
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 232) {
                    int j1 = buffer.readMiddleEndianInt2(anInt919);
                    int i10 = buffer.readUnsignedLittleEndianShortA();
                    anIntArray970[i10] = j1;
                    if (anIntArray1149[i10] != j1) {
                        anIntArray1149[i10] = j1;
                        method64(true, i10);
                        aBoolean1148 = true;
                        if (anInt1276 != -1) {
                            aBoolean1169 = true;
                        }
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 127) {
                    String s1 = buffer.readString();
                    int j10 = buffer.readUnsignedShort();
                    Widget.aWidgetArray533[j10].aString548 = s1;
                    if (Widget.aWidgetArray533[j10].anInt573 == anIntArray1018[anInt864]) {
                        aBoolean1148 = true;
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 133) {
                    int k1 = buffer.readUnsignedShort();
                    Widget widget = Widget.aWidgetArray533[k1];
                    for (int i16 = 0; i16 < widget.anIntArray576.length; i16++) {
                        widget.anIntArray576[i16] = -1;
                        widget.anIntArray576[i16] = 0;
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 2) {
                    int l1 = buffer.readUnsignedLittleEndianShort();
                    if (l1 == 65535) {
                        l1 = -1;
                    }
                    if (l1 != anInt1229 && aBoolean826 && !aBoolean954 && anInt1157 == 0) {
                        anInt1012 = l1;
                        aBoolean1013 = true;
                        aClass2_Sub1_873.method156(2, anInt1012);
                    }
                    anInt1229 = l1;
                    opcode = -1;
                    return true;
                }
                if (opcode == 220) {
                    int i2 = buffer.readUnsignedShort();
                    int k10 = buffer.method344(5);
                    if (aBoolean826 && !aBoolean954) {
                        anInt1012 = i2;
                        aBoolean1013 = false;
                        aClass2_Sub1_873.method156(2, anInt1012);
                        anInt1157 = k10;
                    }
                    opcode = -1;
                    return true;
                }
                if (IncomingPacket.CLOSE_ALL_WIDGETS.equals(opcode)) {
                    int j2 = buffer.readUnsignedLittleEndianShortA();
                    method79(j2, anInt1119);
                    if (anInt874 != -1) {
                        anInt874 = -1;
                        aBoolean1148 = true;
                        aBoolean1286 = true;
                    }
                    if (anInt1016 != -1) {
                        anInt1016 = -1;
                        aBoolean1169 = true;
                    }
                    if (anInt1141 != 0) {
                        anInt1141 = 0;
                        aBoolean1169 = true;
                    }
                    anInt1217 = j2;
                    aBoolean1048 = false;
                    opcode = -1;
                    return true;
                }
                if (opcode == 227) {
                    if (anInt864 == 12) {
                        aBoolean1148 = true;
                    }
                    anInt1192 = buffer.readUnsignedByte();
                    opcode = -1;
                    return true;
                }
                if (opcode == 54) {
                    for (int k2 = 0; k2 < players.length; k2++) {
                        if (players[k2] != null) {
                            players[k2].anInt1597 = -1;
                        }
                    }
                    for (int l10 = 0; l10 < aClass13_Sub1_Sub1_Sub6_Sub2Array1283.length; l10++) {
                        if (aClass13_Sub1_Sub1_Sub6_Sub2Array1283[l10] != null) {
                            aClass13_Sub1_Sub1_Sub6_Sub2Array1283[l10].anInt1597 = -1;
                        }
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 247 || opcode == 106 || opcode == 218 || opcode == 248 || opcode == 36 || opcode == 209 || opcode == 12 || opcode == 251 || opcode == 109 || opcode == 96 || opcode == 152) {
                    method34(6, buffer, opcode);
                    opcode = -1;
                    return true;
                }
                if (opcode == 44) {
                    int l2 = buffer.readUnsignedByte();
                    int i11 = buffer.readUnsignedByte();
                    int j16 = buffer.readUnsignedByte();
                    int l20 = buffer.readUnsignedByte();
                    aBooleanArray1117[l2] = true;
                    anIntArray1195[l2] = i11;
                    anIntArray1224[l2] = j16;
                    anIntArray1116[l2] = l20;
                    anIntArray849[l2] = 0;
                    opcode = -1;
                    return true;
                }
                if (IncomingPacket.PLAYER_UPDATING.equals(opcode)) {
                    updatePlayers(buffer, 9, packetSize);
                    aBoolean1259 = false;
                    opcode = -1;
                    return true;
                }
                if (opcode == 78) {
                    anInt1055 = buffer.readUnsignedByte();
                    aBoolean1148 = true;
                    opcode = -1;
                    return true;
                }
                if (opcode == 147) {
                    int i3 = buffer.readUnsignedShort();
                    boolean flag = buffer.readUnsignedByte() == 1;
                    Widget.aWidgetArray533[i3].aBoolean561 = flag;
                    opcode = -1;
                    return true;
                }
                if (opcode == 13) {
                    anInt887 = buffer.readUnsignedByte();
                    opcode = -1;
                    return true;
                }
                if (opcode == 136) {
                    int j3 = buffer.readUnsignedShort();
                    int j11 = buffer.readUnsignedShort();
                    Widget.aWidgetArray533[j11].modelType = 1;
                    Widget.aWidgetArray533[j11].anInt542 = j3;
                    opcode = -1;
                    return true;
                }
                if (opcode == 62) {
                    int k3 = buffer.readUnsignedLittleEndianShortA();
                    int k11 = buffer.method339(true);
                    Widget widget_3 = Widget.aWidgetArray533[k11];
                    if (widget_3 != null && widget_3.anInt570 == 0) {
                        if (k3 < 0) {
                            k3 = 0;
                        }
                        if (k3 > widget_3.anInt598 - widget_3.anInt586) {
                            k3 = widget_3.anInt598 - widget_3.anInt586;
                        }
                        widget_3.anInt595 = k3;
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 64) {
                    int l3 = buffer.readUnsignedShort();
                    int l11 = buffer.readUnsignedByte();
                    int k16 = buffer.readUnsignedShort();
                    if (aBoolean1010 && !aBoolean954 && anInt1057 < 50) {
                        anIntArray1278[anInt1057] = l3;
                        anIntArray1207[anInt1057] = l11;
                        anIntArray948[anInt1057] = k16 + Class27.anIntArray450[l3];
                        anInt1057++;
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 103) {
                    anInt1269 = buffer.readUnsignedShort() * 30;
                    opcode = -1;
                    return true;
                }
                if (IncomingPacket.SET_WIDGET_ITEM_MODEL.equals(opcode)) {
                    int i4 = buffer.method339(true);
                    int i12 = buffer.readUnsignedLittleEndianShort();
                    int i17 = buffer.readUnsignedLittleEndianShort();
                    if (i4 == 65535) {
                        Widget.aWidgetArray533[i17].modelType = 0;
                        opcode = -1;
                        return true;
                    } else {
                        ItemDefinition itemDefinition = ItemDefinition.method505(i4);
                        Widget.aWidgetArray533[i17].modelType = 4;
                        Widget.aWidgetArray533[i17].anInt542 = i4;
                        Widget.aWidgetArray533[i17].anInt535 = itemDefinition.anInt670;
                        Widget.aWidgetArray533[i17].anInt536 = itemDefinition.anInt663;
                        Widget.aWidgetArray533[i17].anInt534 = (itemDefinition.modelScale * 100) / i12;
                        opcode = -1;
                        return true;
                    }
                }
                if (opcode == 157) {
                    int j4 = buffer.readUnsignedLittleEndianShort();
                    int j12 = buffer.method339(true);
                    Widget.aWidgetArray533[j12].modelType = 2;
                    Widget.aWidgetArray533[j12].anInt542 = j4;
                    opcode = -1;
                    return true;
                }
                if (opcode == 246) {
                    int k4 = buffer.method342(-89);
                    anInt1276 = k4;
                    aBoolean1169 = true;
                    opcode = -1;
                    return true;
                }
                if (opcode == 87) {
                    anInt1159 = buffer.readUnsignedByte();
                    anInt1129 = buffer.readUnsignedByte();
                    anInt1290 = buffer.readUnsignedByte();
                    aBoolean1137 = true;
                    aBoolean1169 = true;
                    opcode = -1;
                    return true;
                }
                if (opcode == 219) {
                    int l4 = buffer.readUnsignedLittleEndianShortA();
                    int k12 = buffer.readUnsignedLittleEndianShort();
                    int j17 = buffer.readUnsignedLittleEndianShortA();
                    int i21 = buffer.readUnsignedLittleEndianShortA();
                    Widget.aWidgetArray533[k12].anInt535 = i21;
                    Widget.aWidgetArray533[k12].anInt536 = l4;
                    Widget.aWidgetArray533[k12].anInt534 = j17;
                    opcode = -1;
                    return true;
                }
                if (opcode == 168) {
                    anInt1087 = buffer.readUnsignedByte();
                    if (anInt1087 == anInt864) {
                        if (anInt1087 == 3) {
                            anInt864 = 1;
                        } else {
                            anInt864 = 3;
                        }
                        aBoolean1148 = true;
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 179) {
                    anInt1094 = buffer.readUnsignedByte();
                    opcode = -1;
                    return true;
                }
                if (opcode == 211) {
                    aBoolean1148 = true;
                    int i5 = buffer.readMiddleEndianInt2(anInt919);
                    int l12 = buffer.readUnsignedByteA(856);
                    int k17 = buffer.readUnsignedByteC(19179);
                    anIntArray1045[k17] = i5;
                    anIntArray908[k17] = l12;
                    anIntArray983[k17] = 1;
                    for (int j21 = 0; j21 < 98; j21++) {
                        if (i5 >= anIntArray968[j21]) {
                            anIntArray983[k17] = j21 + 2;
                        }
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 143) {
                    if (anInt874 != -1) {
                        anInt874 = -1;
                        aBoolean1148 = true;
                        aBoolean1286 = true;
                    }
                    if (anInt1016 != -1) {
                        anInt1016 = -1;
                        aBoolean1169 = true;
                    }
                    if (anInt1141 != 0) {
                        anInt1141 = 0;
                        aBoolean1169 = true;
                    }
                    anInt1217 = -1;
                    aBoolean1048 = false;
                    opcode = -1;
                    return true;
                }
                if (opcode == 105) {
                    anInt1231 = buffer.readUnsignedByte();
                    anInt1232 = buffer.readUnsignedByteC(19179);
                    opcode = -1;
                    return true;
                }
                if (opcode == 15) {
                    anInt864 = buffer.readUnsignedByteC(19179);
                    aBoolean1148 = true;
                    aBoolean1286 = true;
                    opcode = -1;
                    return true;
                }
                if (opcode == 59) {
                    byte byte0 = buffer.method334((byte) -78);
                    int i13 = buffer.readUnsignedLittleEndianShortA();
                    anIntArray970[i13] = byte0;
                    if (anIntArray1149[i13] != byte0) {
                        anIntArray1149[i13] = byte0;
                        method64(true, i13);
                        aBoolean1148 = true;
                        if (anInt1276 != -1) {
                            aBoolean1169 = true;
                        }
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 191) {
                    int j5 = buffer.method342(-89);
                    if (j5 >= 0) {
                        method79(j5, anInt1119);
                    }
                    anInt1143 = j5;
                    opcode = -1;
                    return true;
                }
                if (opcode == 253) {
                    int k5 = buffer.readUnsignedLittleEndianShortA();
                    method79(k5, anInt1119);
                    if (anInt1016 != -1) {
                        anInt1016 = -1;
                        aBoolean1169 = true;
                    }
                    if (anInt1141 != 0) {
                        anInt1141 = 0;
                        aBoolean1169 = true;
                    }
                    anInt874 = k5;
                    aBoolean1148 = true;
                    aBoolean1286 = true;
                    anInt1217 = -1;
                    aBoolean1048 = false;
                    opcode = -1;
                    return true;
                }
                if (opcode == 104) {
                    aBoolean1017 = false;
                    anInt1141 = 1;
                    aString964 = "";
                    aBoolean1169 = true;
                    opcode = -1;
                    return true;
                }
                if (IncomingPacket.SHOW_WELCOME_SCREEN.equals(opcode)) {
                    daysSinceLastLogin = buffer.readUnsignedShort();
                    lastLoginAddress = buffer.readMiddleEndianInt2(anInt919);
                    hasMembershipAndIsOnFreeToPlayWorld = buffer.readUnsignedByteA(856);
                    daysSinceRecoveryQuestionsUpdated = buffer.readUnsignedByteA(856);
                    unreadMessagesCount = buffer.readUnsignedLittleEndianShortA();
                    if (lastLoginAddress != 0 && anInt1217 == -1) {
                        Signlink.dnslookup(Class24.method449(lastLoginAddress, false));
                        method140(6);
                        char c = '\u028A';
                        if (daysSinceRecoveryQuestionsUpdated != 201 || hasMembershipAndIsOnFreeToPlayWorld == 1) {
                            c = '\u028F';
                        }
                        aString1230 = "";
                        aBoolean1034 = false;
                        for (int j13 = 0; j13 < Widget.aWidgetArray533.length; j13++) {
                            if (Widget.aWidgetArray533[j13] == null || Widget.aWidgetArray533[j13].anInt577 != c) {
                                continue;
                            }
                            anInt1217 = Widget.aWidgetArray533[j13].anInt573;
                            break;
                        }
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 92) {
                    int l5 = buffer.readUnsignedShort();
                    int k13 = buffer.method341(-26);
                    int i18 = buffer.method343(true);
                    Widget widget_5 = Widget.aWidgetArray533[l5];
                    widget_5.anInt537 = k13;
                    widget_5.anInt590 = i18;
                    opcode = -1;
                    return true;
                }
                if (opcode == 221) {
                    aBoolean1148 = true;
                    int i6 = buffer.readUnsignedShort();
                    Widget widget_1 = Widget.aWidgetArray533[i6];
                    int j18 = buffer.readUnsignedShort();
                    for (int k21 = 0; k21 < j18; k21++) {
                        int k23 = buffer.readUnsignedByte();
                        if (k23 == 255) {
                            k23 = buffer.method346((byte) 1);
                        }
                        widget_1.anIntArray576[k21] = buffer.method339(true);
                        widget_1.anIntArray579[k21] = k23;
                    }
                    for (int l23 = j18; l23 < widget_1.anIntArray576.length; l23++) {
                        widget_1.anIntArray576[l23] = 0;
                        widget_1.anIntArray579[l23] = 0;
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 55) {
                    anInt988 = buffer.readUnsignedByte();
                    anInt950 = buffer.readUnsignedShort();
                    opcode = -1;
                    return true;
                }
                if (opcode == 213) {
                    long l6 = buffer.readLong(0);
                    int k18 = buffer.readUnsignedByte();
                    String s7 = Class24.method450(Class24.method447(l6, 0), 0);
                    for (int i24 = 0; i24 < anInt1054; i24++) {
                        if (l6 != aLongArray993[i24]) {
                            continue;
                        }
                        if (anIntArray850[i24] != k18) {
                            anIntArray850[i24] = k18;
                            aBoolean1148 = true;
                            if (k18 > 0) {
                                method70(5, s7 + " has logged in.", "", (byte) 117);
                            }
                            if (k18 == 0) {
                                method70(5, s7 + " has logged out.", "", (byte) 117);
                            }
                        }
                        s7 = null;
                        break;
                    }
                    if (s7 != null && anInt1054 < 200) {
                        aLongArray993[anInt1054] = l6;
                        aStringArray1003[anInt1054] = s7;
                        anIntArray850[anInt1054] = k18;
                        anInt1054++;
                        aBoolean1148 = true;
                    }
                    for (boolean flag5 = false; !flag5; ) {
                        flag5 = true;
                        for (int l28 = 0; l28 < anInt1054 - 1; l28++) {
                            if (anIntArray850[l28] != anInt951 && anIntArray850[l28 + 1] == anInt951 || anIntArray850[l28] == 0 && anIntArray850[l28 + 1] != 0) {
                                int k30 = anIntArray850[l28];
                                anIntArray850[l28] = anIntArray850[l28 + 1];
                                anIntArray850[l28 + 1] = k30;
                                String s10 = aStringArray1003[l28];
                                aStringArray1003[l28] = aStringArray1003[l28 + 1];
                                aStringArray1003[l28 + 1] = s10;
                                long l32 = aLongArray993[l28];
                                aLongArray993[l28] = aLongArray993[l28 + 1];
                                aLongArray993[l28 + 1] = l32;
                                aBoolean1148 = true;
                                flag5 = false;
                            }
                        }
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 95) {
                    int j6 = buffer.method339(true);
                    int l13 = buffer.readShort();
                    Widget widget_4 = Widget.aWidgetArray533[j6];
                    widget_4.anInt571 = l13;
                    if (l13 == -1) {
                        widget_4.anInt568 = 0;
                        widget_4.anInt540 = 0;
                    }
                    opcode = -1;
                    return true;
                }
                if (IncomingPacket.NPC_UPDATING.equals(opcode)) {
                    updateNpcs(packetSize, buffer, (byte) -48);
                    opcode = -1;
                    return true;
                }
                if (opcode == 240) {
                    aBoolean1017 = false;
                    anInt1141 = 2;
                    aString964 = "";
                    aBoolean1169 = true;
                    opcode = -1;
                    return true;
                }
                if (opcode == 102) {
                    aBoolean1148 = true;
                    int k6 = buffer.readUnsignedShort();
                    Widget widget_2 = Widget.aWidgetArray533[k6];
                    while (buffer.position < packetSize) {
                        int l18 = buffer.readUnsignedSmart();
                        int l21 = buffer.readUnsignedShort();
                        int j24 = buffer.readUnsignedByte();
                        if (j24 == 255) {
                            j24 = buffer.readInt();
                        }
                        if (l18 >= 0 && l18 < widget_2.anIntArray576.length) {
                            widget_2.anIntArray576[l18] = l21;
                            widget_2.anIntArray579[l18] = j24;
                        }
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 49) {
                    logout(anInt1268);
                    opcode = -1;
                    return false;
                }
                if (opcode == 70) {
                    aBoolean848 = true;
                    anInt1038 = buffer.readUnsignedByte();
                    anInt1039 = buffer.readUnsignedByte();
                    anInt1040 = buffer.readUnsignedShort();
                    anInt1041 = buffer.readUnsignedByte();
                    anInt1042 = buffer.readUnsignedByte();
                    if (anInt1042 >= 100) {
                        int i7 = anInt1038 * 128 + 64;
                        int i14 = anInt1039 * 128 + 64;
                        int i19 = method80(anInt1166, 781, i14, i7) - anInt1040;
                        int i22 = i7 - anInt1004;
                        int k24 = i19 - anInt1005;
                        int i27 = i14 - anInt1006;
                        int i29 = (int) Math.sqrt(i22 * i22 + i27 * i27);
                        anInt1007 = (int) (Math.atan2(k24, i29) * 325.94900000000001D) & 0x7ff;
                        anInt1008 = (int) (Math.atan2(i22, i27) * -325.94900000000001D) & 0x7ff;
                        if (anInt1007 < 128) {
                            anInt1007 = 128;
                        }
                        if (anInt1007 > 383) {
                            anInt1007 = 383;
                        }
                    }
                    opcode = -1;
                    return true;
                }
                if (IncomingPacket.UPDATE_ACTIVE_MAP_REGION.equals(opcode) || IncomingPacket.CONSTRUCT_MAP_REGION.equals(opcode)) {
                    int regionX = anInt984;
                    int regionY = anInt985;
                    if (IncomingPacket.UPDATE_ACTIVE_MAP_REGION.equals(opcode)) {
                        regionX = buffer.readUnsignedShort();
                        regionY = buffer.readUnsignedLittleEndianShort();
                        aBoolean971 = false;
                    }
                    if (IncomingPacket.CONSTRUCT_MAP_REGION.equals(opcode)) {
                        regionX = buffer.readUnsignedLittleEndianShort();
                        buffer.initBitAccess();
                        for (int j19 = 0; j19 < 4; j19++) {
                            for (int j22 = 0; j22 < 13; j22++) {
                                for (int l24 = 0; l24 < 13; l24++) {
                                    int j27 = buffer.readBits(1, 195);
                                    if (j27 == 1) {
                                        anIntArrayArrayArray1226[j19][j22][l24] = buffer.readBits(26, 195);
                                    } else {
                                        anIntArrayArrayArray1226[j19][j22][l24] = -1;
                                    }
                                }
                            }
                        }
                        buffer.finishBitAccess(3);
                        regionY = buffer.readUnsignedLittleEndianShort();
                        aBoolean971 = true;
                    }
                    if (anInt984 == regionX && anInt985 == regionY && anInt1254 == 2) {
                        opcode = -1;
                        return true;
                    }
                    anInt984 = regionX;
                    anInt985 = regionY;
                    anInt1083 = (anInt984 - 6) * 8;
                    anInt1084 = (anInt985 - 6) * 8;
                    aBoolean1051 = (anInt984 / 8 == 48 || anInt984 / 8 == 49) && anInt985 / 8 == 48;
                    if (anInt984 / 8 == 48 && anInt985 / 8 == 148) {
                        aBoolean1051 = true;
                    }
                    anInt1254 = 1;
                    aLong1243 = System.currentTimeMillis();
                    aClass31_1213.method490(false);
                    aClass13_Sub1_Sub4_Sub2_892.method381(257, 0, 6, 151, "Loading - please wait.");
                    aClass13_Sub1_Sub4_Sub2_892.method381(256, 0xffffff, 6, 150, "Loading - please wait.");
                    aClass31_1213.method491(super.aGraphics15, 4, false, 4);
                    if (opcode == 228) {
                        int k19 = 0;
                        for (int k22 = (anInt984 - 6) / 8; k22 <= (anInt984 + 6) / 8; k22++) {
                            for (int i25 = (anInt985 - 6) / 8; i25 <= (anInt985 + 6) / 8; i25++) {
                                k19++;
                            }
                        }
                        aByteArrayArray1146 = new byte[k19][];
                        aByteArrayArray1179 = new byte[k19][];
                        anIntArray937 = new int[k19];
                        anIntArray938 = new int[k19];
                        anIntArray939 = new int[k19];
                        k19 = 0;
                        for (int j25 = (anInt984 - 6) / 8; j25 <= (anInt984 + 6) / 8; j25++) {
                            for (int k27 = (anInt985 - 6) / 8; k27 <= (anInt985 + 6) / 8; k27++) {
                                anIntArray937[k19] = (j25 << 8) + k27;
                                if (aBoolean1051 && (k27 == 49 || k27 == 149 || k27 == 147 || j25 == 50 || j25 == 49 && k27 == 47)) {
                                    anIntArray938[k19] = -1;
                                    anIntArray939[k19] = -1;
                                    k19++;
                                } else {
                                    int j29 = anIntArray938[k19] = aClass2_Sub1_873.method160(j25, k27, 0, 8347);
                                    if (j29 != -1) {
                                        aClass2_Sub1_873.method156(3, j29);
                                    }
                                    int l30 = anIntArray939[k19] = aClass2_Sub1_873.method160(j25, k27, 1, 8347);
                                    if (l30 != -1) {
                                        aClass2_Sub1_873.method156(3, l30);
                                    }
                                    k19++;
                                }
                            }
                        }
                    }
                    if (opcode == 52) {
                        int l19 = 0;
                        int[] ai = new int[676];
                        for (int k25 = 0; k25 < 4; k25++) {
                            for (int l27 = 0; l27 < 13; l27++) {
                                for (int k29 = 0; k29 < 13; k29++) {
                                    int i31 = anIntArrayArrayArray1226[k25][l27][k29];
                                    if (i31 != -1) {
                                        int l31 = i31 >> 14 & 0x3ff;
                                        int j32 = i31 >> 3 & 0x7ff;
                                        int i33 = (l31 / 8 << 8) + j32 / 8;
                                        for (int k33 = 0; k33 < l19; k33++) {
                                            if (ai[k33] != i33) {
                                                continue;
                                            }
                                            i33 = -1;
                                            break;
                                        }
                                        if (i33 != -1) {
                                            ai[l19++] = i33;
                                        }
                                    }
                                }
                            }
                        }
                        aByteArrayArray1146 = new byte[l19][];
                        aByteArrayArray1179 = new byte[l19][];
                        anIntArray937 = new int[l19];
                        anIntArray938 = new int[l19];
                        anIntArray939 = new int[l19];
                        for (int i28 = 0; i28 < l19; i28++) {
                            int l29 = anIntArray937[i28] = ai[i28];
                            int j31 = l29 >> 8 & 0xff;
                            int i32 = l29 & 0xff;
                            int k32 = anIntArray938[i28] = aClass2_Sub1_873.method160(j31, i32, 0, 8347);
                            if (k32 != -1) {
                                aClass2_Sub1_873.method156(3, k32);
                            }
                            int j33 = anIntArray939[i28] = aClass2_Sub1_873.method160(j31, i32, 1, 8347);
                            if (j33 != -1) {
                                aClass2_Sub1_873.method156(3, j33);
                            }
                        }
                    }
                    int i20 = anInt1083 - anInt1085;
                    int l22 = anInt1084 - anInt1086;
                    anInt1085 = anInt1083;
                    anInt1086 = anInt1084;
                    for (int l25 = 0; l25 < 16384; l25++) {
                        Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[l25];
                        if (class13_sub1_sub1_sub6_sub2 != null) {
                            for (int i30 = 0; i30 < 10; i30++) {
                                class13_sub1_sub1_sub6_sub2.anIntArray1615[i30] -= i20;
                                class13_sub1_sub1_sub6_sub2.anIntArray1616[i30] -= l22;
                            }
                            class13_sub1_sub1_sub6_sub2.anInt1587 -= i20 * 128;
                            class13_sub1_sub1_sub6_sub2.anInt1588 -= l22 * 128;
                        }
                    }
                    for (int j28 = 0; j28 < anInt896; j28++) {
                        Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1 = players[j28];
                        if (class13_sub1_sub1_sub6_sub1 != null) {
                            for (int k31 = 0; k31 < 10; k31++) {
                                class13_sub1_sub1_sub6_sub1.anIntArray1615[k31] -= i20;
                                class13_sub1_sub1_sub6_sub1.anIntArray1616[k31] -= l22;
                            }
                            class13_sub1_sub1_sub6_sub1.anInt1587 -= i20 * 128;
                            class13_sub1_sub1_sub6_sub1.anInt1588 -= l22 * 128;
                        }
                    }
                    aBoolean1259 = true;
                    byte byte1 = 0;
                    byte byte2 = 104;
                    byte byte3 = 1;
                    if (i20 < 0) {
                        byte1 = 103;
                        byte2 = -1;
                        byte3 = -1;
                    }
                    byte byte4 = 0;
                    byte byte5 = 104;
                    byte byte6 = 1;
                    if (l22 < 0) {
                        byte4 = 103;
                        byte5 = -1;
                        byte6 = -1;
                    }
                    for (int l33 = byte1; l33 != byte2; l33 += byte3) {
                        for (int i34 = byte4; i34 != byte5; i34 += byte6) {
                            int j34 = l33 + i20;
                            int k34 = i34 + l22;
                            for (int l34 = 0; l34 < 4; l34++) {
                                if (j34 >= 0 && k34 >= 0 && j34 < 104 && k34 < 104) {
                                    aClass12ArrayArrayArray969[l34][l33][i34] = aClass12ArrayArrayArray969[l34][j34][k34];
                                } else {
                                    aClass12ArrayArrayArray969[l34][l33][i34] = null;
                                }
                            }
                        }
                    }
                    for (Class13_Sub3 class13_sub3_1 = (Class13_Sub3) aClass12_1152.method248(); class13_sub3_1 != null; class13_sub3_1 = (Class13_Sub3) aClass12_1152.method250(-475)) {
                        class13_sub3_1.anInt1365 -= i20;
                        class13_sub3_1.anInt1366 -= l22;
                        if (class13_sub3_1.anInt1365 < 0 || class13_sub3_1.anInt1366 < 0 || class13_sub3_1.anInt1365 >= 104 || class13_sub3_1.anInt1366 >= 104) {
                            class13_sub3_1.method253();
                        }
                    }
                    if (anInt1221 != 0) {
                        anInt1221 -= i20;
                        anInt1222 -= l22;
                    }
                    aBoolean848 = false;
                    opcode = -1;
                    return true;
                }
                if (opcode == 137) {
                    int k7 = buffer.method332(aByte1172);
                    int k14 = buffer.readUnsignedByte();
                    String s6 = buffer.readString();
                    if (k14 >= 1 && k14 <= 5) {
                        if (s6.equalsIgnoreCase("null")) {
                            s6 = null;
                        }
                        aStringArray1031[k14 - 1] = s6;
                        aBooleanArray1032[k14 - 1] = k7 == 0;
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 20) {
                    int l7 = buffer.readUnsignedLittleEndianShortA();
                    int l14 = buffer.readUnsignedLittleEndianShort();
                    if (anInt1016 != -1) {
                        anInt1016 = -1;
                        aBoolean1169 = true;
                    }
                    if (anInt1141 != 0) {
                        anInt1141 = 0;
                        aBoolean1169 = true;
                    }
                    anInt1217 = l7;
                    anInt874 = l14;
                    aBoolean1148 = true;
                    aBoolean1286 = true;
                    aBoolean1048 = false;
                    opcode = -1;
                    return true;
                }
                if (opcode == 53) {
                    aBoolean848 = false;
                    for (int i8 = 0; i8 < 5; i8++) {
                        aBooleanArray1117[i8] = false;
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 126) {
                    anInt1232 = buffer.readUnsignedByteC(19179);
                    anInt1231 = buffer.readUnsignedByte();
                    for (int j8 = anInt1231; j8 < anInt1231 + 8; j8++) {
                        for (int i15 = anInt1232; i15 < anInt1232 + 8; i15++) {
                            if (aClass12ArrayArrayArray969[anInt1166][j8][i15] != null) {
                                aClass12ArrayArrayArray969[anInt1166][j8][i15] = null;
                                method52(j8, i15);
                            }
                        }
                    }
                    for (Class13_Sub3 class13_sub3 = (Class13_Sub3) aClass12_1152.method248(); class13_sub3 != null; class13_sub3 = (Class13_Sub3) aClass12_1152.method250(-475)) {
                        if (class13_sub3.anInt1365 >= anInt1231 && class13_sub3.anInt1365 < anInt1231 + 8 && class13_sub3.anInt1366 >= anInt1232 && class13_sub3.anInt1366 < anInt1232 + 8 && class13_sub3.anInt1363 == anInt1166) {
                            class13_sub3.anInt1371 = 0;
                        }
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 132) {
                    if (anInt864 == 12) {
                        aBoolean1148 = true;
                    }
                    anInt1288 = buffer.readShort();
                    opcode = -1;
                    return true;
                }
                if (opcode == 200) {
                    int k8 = buffer.readUnsignedShort();
                    method79(k8, anInt1119);
                    if (anInt874 != -1) {
                        anInt874 = -1;
                        aBoolean1148 = true;
                        aBoolean1286 = true;
                    }
                    anInt1016 = k8;
                    aBoolean1169 = true;
                    anInt1217 = -1;
                    aBoolean1048 = false;
                    opcode = -1;
                    return true;
                }
                if (opcode == 174) {
                    anInt1221 = 0;
                    opcode = -1;
                    return true;
                }
                if (opcode == 128) {
                    int l8 = buffer.readUnsignedShort();
                    int j15 = buffer.readUnsignedLittleEndianShort();
                    int j20 = l8 >> 10 & 0x1f;
                    int i23 = l8 >> 5 & 0x1f;
                    int i26 = l8 & 0x1f;
                    Widget.aWidgetArray533[j15].anInt550 = (j20 << 19) + (i23 << 11) + (i26 << 3);
                    opcode = -1;
                    return true;
                }
                if (opcode == 11) {
                    anInt1227 = buffer.readUnsignedByte();
                    if (anInt1227 == 1) {
                        anInt1015 = buffer.readUnsignedShort();
                    }
                    if (anInt1227 >= 2 && anInt1227 <= 6) {
                        if (anInt1227 == 2) {
                            anInt1135 = 64;
                            anInt1136 = 64;
                        }
                        if (anInt1227 == 3) {
                            anInt1135 = 0;
                            anInt1136 = 64;
                        }
                        if (anInt1227 == 4) {
                            anInt1135 = 128;
                            anInt1136 = 64;
                        }
                        if (anInt1227 == 5) {
                            anInt1135 = 64;
                            anInt1136 = 0;
                        }
                        if (anInt1227 == 6) {
                            anInt1135 = 64;
                            anInt1136 = 128;
                        }
                        anInt1227 = 2;
                        anInt1132 = buffer.readUnsignedShort();
                        anInt1133 = buffer.readUnsignedShort();
                        anInt1134 = buffer.readUnsignedByte();
                    }
                    if (anInt1227 == 10) {
                        anInt999 = buffer.readUnsignedShort();
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 224) {
                    for (int i9 = 0; i9 < anIntArray1149.length; i9++) {
                        if (anIntArray1149[i9] != anIntArray970[i9]) {
                            anIntArray1149[i9] = anIntArray970[i9];
                            method64(true, i9);
                            aBoolean1148 = true;
                        }
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 235) {
                    anInt1231 = buffer.readUnsignedByte();
                    anInt1232 = buffer.readUnsignedByteA(856);
                    while (buffer.position < packetSize) {
                        int j9 = buffer.readUnsignedByte();
                        method34(6, buffer, j9);
                    }
                    opcode = -1;
                    return true;
                }
                if (opcode == 187) {
                    long l9 = buffer.readLong(0);
                    int k20 = buffer.readInt();
                    int j23 = buffer.readUnsignedByte();
                    boolean flag4 = false;
                    for (int k28 = 0; k28 < 100; k28++) {
                        if (anIntArray1140[k28] != k20) {
                            continue;
                        }
                        flag4 = true;
                        break;
                    }
                    if (j23 <= 1) {
                        for (int j30 = 0; j30 < anInt1098; j30++) {
                            if (aLongArray990[j30] != l9) {
                                continue;
                            }
                            flag4 = true;
                            break;
                        }
                    }
                    if (!flag4 && anInt1180 == 0) {
                        try {
                            anIntArray1140[anInt1030] = k20;
                            anInt1030 = (anInt1030 + 1) % 100;
                            String s9 = Class45.method573(buffer, 0, packetSize - 13);
                            if (j23 != 3) {
                                s9 = Class41.method541(false, s9);
                            }
                            if (j23 == 2 || j23 == 3) {
                                method70(7, s9, "@cr2@" + Class24.method450(Class24.method447(l9, 0), 0), (byte) 117);
                            } else if (j23 == 1) {
                                method70(7, s9, "@cr1@" + Class24.method450(Class24.method447(l9, 0), 0), (byte) 117);
                            } else {
                                method70(3, s9, Class24.method450(Class24.method447(l9, 0), 0), (byte) 117);
                            }
                        } catch (Exception exception1) {
                            Signlink.reportError("cde1");
                        }
                    }
                    opcode = -1;
                    return true;
                }
                Signlink.reportError("T1 - " + opcode + "," + packetSize + " - " + anInt889 + "," + anInt890);
                logout(anInt1268);
            } catch (IOException _ex) {
                method19(0);
            } catch (Exception exception) {
                String s2 = "T2 - " + opcode + "," + anInt889 + "," + anInt890 + " - " + packetSize + "," + (anInt1083 + aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0]) + "," + (anInt1084 + aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0]) + " - ";
                for (int k15 = 0; k15 < packetSize && k15 < 50; k15++) {
                    s2 = s2 + buffer.payload[k15] + ",";
                }
                Signlink.reportError(s2);
                logout(anInt1268);
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("40192, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method31(byte byte0) {
        try {
            if (anInt1025 == 0 && anInt973 == 0) {
                aStringArray961[anInt1167] = "Walk here";
                anIntArray911[anInt1167] = 770;
                anIntArray909[anInt1167] = super.anInt23;
                anIntArray910[anInt1167] = super.anInt24;
                anInt1167++;
            }
            int i = -1;
            for (int j = 0; j < Class13_Sub1_Sub1_Sub4.anInt1557; j++) {
                int k = Class13_Sub1_Sub1_Sub4.anIntArray1558[j];
                int l = k & 0x7f;
                int i1 = k >> 7 & 0x7f;
                int j1 = k >> 29 & 3;
                int k1 = k >> 14 & 0x7fff;
                if (k == i) {
                    continue;
                }
                i = k;
                if (j1 == 2 && aClass10_1198.method224(anInt1166, l, i1, k) >= 0) {
                    Class14 class14 = Class14.method418(k1);
                    if (class14.anIntArray243 != null) {
                        class14 = class14.method424(2);
                    }
                    if (class14 == null) {
                        continue;
                    }
                    if (anInt1025 == 1) {
                        aStringArray961[anInt1167] = "Use " + aString1029 + " with @cya@" + class14.aString275;
                        anIntArray911[anInt1167] = 947;
                        anIntArray912[anInt1167] = k;
                        anIntArray909[anInt1167] = l;
                        anIntArray910[anInt1167] = i1;
                        anInt1167++;
                    } else if (anInt973 == 1) {
                        if ((anInt975 & 4) == 4) {
                            aStringArray961[anInt1167] = aString976 + " @cya@" + class14.aString275;
                            anIntArray911[anInt1167] = 456;
                            anIntArray912[anInt1167] = k;
                            anIntArray909[anInt1167] = l;
                            anIntArray910[anInt1167] = i1;
                            anInt1167++;
                        }
                    } else {
                        if (class14.aStringArray261 != null) {
                            for (int l1 = 4; l1 >= 0; l1--) {
                                if (class14.aStringArray261[l1] != null) {
                                    aStringArray961[anInt1167] = class14.aStringArray261[l1] + " @cya@" + class14.aString275;
                                    if (l1 == 0) {
                                        anIntArray911[anInt1167] = 307;
                                    }
                                    if (l1 == 1) {
                                        anIntArray911[anInt1167] = 275;
                                    }
                                    if (l1 == 2) {
                                        anIntArray911[anInt1167] = 47;
                                    }
                                    if (l1 == 3) {
                                        anIntArray911[anInt1167] = 259;
                                    }
                                    if (l1 == 4) {
                                        anIntArray911[anInt1167] = 1574;
                                    }
                                    anIntArray912[anInt1167] = k;
                                    anIntArray909[anInt1167] = l;
                                    anIntArray910[anInt1167] = i1;
                                    anInt1167++;
                                }
                            }
                        }
                        aStringArray961[anInt1167] = "Examine @cya@" + class14.aString275;
                        anIntArray911[anInt1167] = 1877;
                        anIntArray912[anInt1167] = class14.anInt268 << 14;
                        anIntArray909[anInt1167] = l;
                        anIntArray910[anInt1167] = i1;
                        anInt1167++;
                    }
                }
                if (j1 == 1) {
                    Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[k1];
                    if (class13_sub1_sub1_sub6_sub2.aClass47_1717.aByte768 == 1 && (class13_sub1_sub1_sub6_sub2.anInt1587 & 0x7f) == 64 && (class13_sub1_sub1_sub6_sub2.anInt1588 & 0x7f) == 64) {
                        for (int i2 = 0; i2 < anInt1284; i2++) {
                            Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2_1 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[anIntArray1285[i2]];
                            if (class13_sub1_sub1_sub6_sub2_1 != null && class13_sub1_sub1_sub6_sub2_1 != class13_sub1_sub1_sub6_sub2 && class13_sub1_sub1_sub6_sub2_1.aClass47_1717.aByte768 == 1 && class13_sub1_sub1_sub6_sub2_1.anInt1587 == class13_sub1_sub1_sub6_sub2.anInt1587 && class13_sub1_sub1_sub6_sub2_1.anInt1588 == class13_sub1_sub1_sub6_sub2.anInt1588) {
                                method133(anIntArray1285[i2], -313, l, i1, class13_sub1_sub1_sub6_sub2_1.aClass47_1717);
                            }
                        }
                        for (int k2 = 0; k2 < anInt899; k2++) {
                            Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1_1 = players[playerList[k2]];
                            if (class13_sub1_sub1_sub6_sub1_1 != null && class13_sub1_sub1_sub6_sub1_1.anInt1587 == class13_sub1_sub1_sub6_sub2.anInt1587 && class13_sub1_sub1_sub6_sub1_1.anInt1588 == class13_sub1_sub1_sub6_sub2.anInt1588) {
                                method72(class13_sub1_sub1_sub6_sub1_1, playerList[k2], i1, l, aBoolean978);
                            }
                        }
                    }
                    method133(k1, -313, l, i1, class13_sub1_sub1_sub6_sub2.aClass47_1717);
                }
                if (j1 == 0) {
                    Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1 = players[k1];
                    if ((class13_sub1_sub1_sub6_sub1.anInt1587 & 0x7f) == 64 && (class13_sub1_sub1_sub6_sub1.anInt1588 & 0x7f) == 64) {
                        for (int j2 = 0; j2 < anInt1284; j2++) {
                            Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2_2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[anIntArray1285[j2]];
                            if (class13_sub1_sub1_sub6_sub2_2 != null && class13_sub1_sub1_sub6_sub2_2.aClass47_1717.aByte768 == 1 && class13_sub1_sub1_sub6_sub2_2.anInt1587 == class13_sub1_sub1_sub6_sub1.anInt1587 && class13_sub1_sub1_sub6_sub2_2.anInt1588 == class13_sub1_sub1_sub6_sub1.anInt1588) {
                                method133(anIntArray1285[j2], -313, l, i1, class13_sub1_sub1_sub6_sub2_2.aClass47_1717);
                            }
                        }
                        for (int l2 = 0; l2 < anInt899; l2++) {
                            Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1_2 = players[playerList[l2]];
                            if (class13_sub1_sub1_sub6_sub1_2 != null && class13_sub1_sub1_sub6_sub1_2 != class13_sub1_sub1_sub6_sub1 && class13_sub1_sub1_sub6_sub1_2.anInt1587 == class13_sub1_sub1_sub6_sub1.anInt1587 && class13_sub1_sub1_sub6_sub1_2.anInt1588 == class13_sub1_sub1_sub6_sub1.anInt1588) {
                                method72(class13_sub1_sub1_sub6_sub1_2, playerList[l2], i1, l, aBoolean978);
                            }
                        }
                    }
                    method72(class13_sub1_sub1_sub6_sub1, k1, i1, l, aBoolean978);
                }
                if (j1 == 3) {
                    Class12 class12 = aClass12ArrayArrayArray969[anInt1166][l][i1];
                    if (class12 != null) {
                        for (Class13_Sub1_Sub1_Sub5 class13_sub1_sub1_sub5 = (Class13_Sub1_Sub1_Sub5) class12.method249(true); class13_sub1_sub1_sub5 != null; class13_sub1_sub1_sub5 = (Class13_Sub1_Sub1_Sub5) class12.method251(0)) {
                            ItemDefinition itemDefinition = ItemDefinition.method505(class13_sub1_sub1_sub5.anInt1563);
                            if (anInt1025 == 1) {
                                aStringArray961[anInt1167] = "Use " + aString1029 + " with @lre@" + itemDefinition.aString649;
                                anIntArray911[anInt1167] = 326;
                                anIntArray912[anInt1167] = class13_sub1_sub1_sub5.anInt1563;
                                anIntArray909[anInt1167] = l;
                                anIntArray910[anInt1167] = i1;
                                anInt1167++;
                            } else if (anInt973 == 1) {
                                if ((anInt975 & 1) == 1) {
                                    aStringArray961[anInt1167] = aString976 + " @lre@" + itemDefinition.aString649;
                                    anIntArray911[anInt1167] = 559;
                                    anIntArray912[anInt1167] = class13_sub1_sub1_sub5.anInt1563;
                                    anIntArray909[anInt1167] = l;
                                    anIntArray910[anInt1167] = i1;
                                    anInt1167++;
                                }
                            } else {
                                for (int i3 = 4; i3 >= 0; i3--) {
                                    if (itemDefinition.aStringArray643 != null && itemDefinition.aStringArray643[i3] != null) {
                                        aStringArray961[anInt1167] = itemDefinition.aStringArray643[i3] + " @lre@" + itemDefinition.aString649;
                                        if (i3 == 0) {
                                            anIntArray911[anInt1167] = 753;
                                        }
                                        if (i3 == 1) {
                                            anIntArray911[anInt1167] = 546;
                                        }
                                        if (i3 == 2) {
                                            anIntArray911[anInt1167] = 607;
                                        }
                                        if (i3 == 3) {
                                            anIntArray911[anInt1167] = 952;
                                        }
                                        if (i3 == 4) {
                                            anIntArray911[anInt1167] = 238;
                                        }
                                        anIntArray912[anInt1167] = class13_sub1_sub1_sub5.anInt1563;
                                        anIntArray909[anInt1167] = l;
                                        anIntArray910[anInt1167] = i1;
                                        anInt1167++;
                                    } else if (i3 == 2) {
                                        aStringArray961[anInt1167] = "Take @lre@" + itemDefinition.aString649;
                                        anIntArray911[anInt1167] = 607;
                                        anIntArray912[anInt1167] = class13_sub1_sub1_sub5.anInt1563;
                                        anIntArray909[anInt1167] = l;
                                        anIntArray910[anInt1167] = i1;
                                        anInt1167++;
                                    }
                                }
                                aStringArray961[anInt1167] = "Examine @lre@" + itemDefinition.aString649;
                                anIntArray911[anInt1167] = 1733;
                                anIntArray912[anInt1167] = class13_sub1_sub1_sub5.anInt1563;
                                anIntArray909[anInt1167] = l;
                                anIntArray910[anInt1167] = i1;
                                anInt1167++;
                            }
                        }
                    }
                }
            }
            if (byte0 != -83) {
                anInt818 = -256;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("92808, " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method32(int i) {
        try {
            byte[] abyte0 = aClass1_991.method149("title.dat", null);
            Class13_Sub1_Sub4_Sub4 class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(abyte0, this);
            aClass31_1248.method490(false);
            class13_sub1_sub4_sub4.method406(0, 0, 902);
            aClass31_1249.method490(false);
            class13_sub1_sub4_sub4.method406(-637, 0, 902);
            aClass31_1245.method490(false);
            class13_sub1_sub4_sub4.method406(-128, 0, 902);
            aClass31_1246.method490(false);
            class13_sub1_sub4_sub4.method406(-202, -371, 902);
            aClass31_1247.method490(false);
            class13_sub1_sub4_sub4.method406(-202, -171, 902);
            aClass31_1250.method490(false);
            class13_sub1_sub4_sub4.method406(0, -265, 902);
            aClass31_1251.method490(false);
            class13_sub1_sub4_sub4.method406(-562, -265, 902);
            aClass31_1252.method490(false);
            class13_sub1_sub4_sub4.method406(-128, -171, 902);
            aClass31_1253.method490(false);
            class13_sub1_sub4_sub4.method406(-562, -171, 902);
            i = 94 / i;
            int[] ai = new int[class13_sub1_sub4_sub4.anInt1681];
            for (int j = 0; j < class13_sub1_sub4_sub4.anInt1682; j++) {
                for (int k = 0; k < class13_sub1_sub4_sub4.anInt1681; k++) {
                    ai[k] = class13_sub1_sub4_sub4.anIntArray1680[(class13_sub1_sub4_sub4.anInt1681 - k - 1) + class13_sub1_sub4_sub4.anInt1681 * j];
                }
                for (int l = 0; l < class13_sub1_sub4_sub4.anInt1681; l++) {
                    class13_sub1_sub4_sub4.anIntArray1680[l + class13_sub1_sub4_sub4.anInt1681 * j] = ai[l];
                }
            }
            aClass31_1248.method490(false);
            class13_sub1_sub4_sub4.method406(382, 0, 902);
            aClass31_1249.method490(false);
            class13_sub1_sub4_sub4.method406(-255, 0, 902);
            aClass31_1245.method490(false);
            class13_sub1_sub4_sub4.method406(254, 0, 902);
            aClass31_1246.method490(false);
            class13_sub1_sub4_sub4.method406(180, -371, 902);
            aClass31_1247.method490(false);
            class13_sub1_sub4_sub4.method406(180, -171, 902);
            aClass31_1250.method490(false);
            class13_sub1_sub4_sub4.method406(382, -265, 902);
            aClass31_1251.method490(false);
            class13_sub1_sub4_sub4.method406(-180, -265, 902);
            aClass31_1252.method490(false);
            class13_sub1_sub4_sub4.method406(254, -171, 902);
            aClass31_1253.method490(false);
            class13_sub1_sub4_sub4.method406(-180, -171, 902);
            class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(aClass1_991, "logo", 0);
            aClass31_1245.method490(false);
            class13_sub1_sub4_sub4.method408(18, (byte) 83, 382 - class13_sub1_sub4_sub4.anInt1681 / 2 - 128);
            class13_sub1_sub4_sub4 = null;
            abyte0 = null;
            ai = null;
            System.gc();
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("34955, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method33(boolean flag) {
        try {
            aBoolean851 &= flag;
            if (anInt1220 == 0) {
                int i = super.anInt13 / 2 - 80;
                int l = super.anInt14 / 2 + 20;
                l += 20;
                if (super.anInt29 == 1 && super.anInt30 >= i - 75 && super.anInt30 <= i + 75 && super.anInt31 >= l - 20 && super.anInt31 <= l + 20) {
                    anInt1220 = 3;
                    anInt965 = 0;
                }
                i = super.anInt13 / 2 + 80;
                if (super.anInt29 == 1 && super.anInt30 >= i - 75 && super.anInt30 <= i + 75 && super.anInt31 >= l - 20 && super.anInt31 <= l + 20) {
                    aString1174 = "";
                    aString1175 = "Enter your username & password.";
                    anInt1220 = 2;
                    anInt965 = 0;
                    return;
                }
            } else {
                if (anInt1220 == 2) {
                    int j = super.anInt14 / 2 - 40;
                    j += 30;
                    j += 25;
                    if (super.anInt29 == 1 && super.anInt31 >= j - 15 && super.anInt31 < j) {
                        anInt965 = 0;
                    }
                    j += 15;
                    if (super.anInt29 == 1 && super.anInt31 >= j - 15 && super.anInt31 < j) {
                        anInt965 = 1;
                    }
                    j += 15;
                    int i1 = super.anInt13 / 2 - 80;
                    int k1 = super.anInt14 / 2 + 50;
                    k1 += 20;
                    if (super.anInt29 == 1 && super.anInt30 >= i1 - 75 && super.anInt30 <= i1 + 75 && super.anInt31 >= k1 - 20 && super.anInt31 <= k1 + 20) {
                        anInt995 = 0;
                        method56(username, password, false);
                        if (aBoolean851) {
                            return;
                        }
                    }
                    i1 = super.anInt13 / 2 + 80;
                    if (super.anInt29 == 1 && super.anInt30 >= i1 - 75 && super.anInt30 <= i1 + 75 && super.anInt31 >= k1 - 20 && super.anInt31 <= k1 + 20) {
                        anInt1220 = 0;
                        username = "";
                        password = "";
                    }
                    do {
                        int l1 = method5(true);
                        if (l1 == -1) {
                            break;
                        }
                        boolean flag1 = false;
                        for (int i2 = 0; i2 < aString966.length(); i2++) {
                            if (l1 != aString966.charAt(i2)) {
                                continue;
                            }
                            flag1 = true;
                            break;
                        }
                        if (anInt965 == 0) {
                            if (l1 == 8 && username.length() > 0) {
                                username = username.substring(0, username.length() - 1);
                            }
                            if (l1 == 9 || l1 == 10 || l1 == 13) {
                                anInt965 = 1;
                            }
                            if (flag1) {
                                username += (char) l1;
                            }
                            if (username.length() > 12) {
                                username = username.substring(0, 12);
                            }
                        } else if (anInt965 == 1) {
                            if (l1 == 8 && password.length() > 0) {
                                password = password.substring(0, password.length() - 1);
                            }
                            if (l1 == 9 || l1 == 10 || l1 == 13) {
                                anInt965 = 0;
                            }
                            if (flag1) {
                                password += (char) l1;
                            }
                            if (password.length() > 20) {
                                password = password.substring(0, 20);
                            }
                        }
                    } while (true);
                    return;
                }
                if (anInt1220 == 3) {
                    int k = super.anInt13 / 2;
                    int j1 = super.anInt14 / 2 + 50;
                    j1 += 20;
                    if (super.anInt29 == 1 && super.anInt30 >= k - 75 && super.anInt30 <= k + 75 && super.anInt31 >= j1 - 20 && super.anInt31 <= j1 + 20) {
                        anInt1220 = 0;
                    }
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("41339, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method34(int i, Buffer buffer, int j) {
        try {
            if (i < 6 || i > 6) {
                for (int k = 1; k > 0; k++) {
                }
            }
            if (j == 12) {
                int l = buffer.readUnsignedByteC(19179);
                int k3 = anInt1231 + (l >> 4 & 7);
                int j6 = anInt1232 + (l & 7);
                int i9 = buffer.method339(true);
                if (k3 >= 0 && j6 >= 0 && k3 < 104 && j6 < 104) {
                    Class12 class12 = aClass12ArrayArrayArray969[anInt1166][k3][j6];
                    if (class12 != null) {
                        for (Class13_Sub1_Sub1_Sub5 class13_sub1_sub1_sub5 = (Class13_Sub1_Sub1_Sub5) class12.method248(); class13_sub1_sub1_sub5 != null; class13_sub1_sub1_sub5 = (Class13_Sub1_Sub1_Sub5) class12.method250(-475)) {
                            if (class13_sub1_sub1_sub5.anInt1563 != (i9 & 0x7fff)) {
                                continue;
                            }
                            class13_sub1_sub1_sub5.method253();
                            break;
                        }
                        if (class12.method248() == null) {
                            aClass12ArrayArrayArray969[anInt1166][k3][j6] = null;
                        }
                        method52(k3, j6);
                    }
                }
                return;
            }
            if (j == 109) {
                int i1 = buffer.method332(aByte1172);
                int l3 = anInt1231 + (i1 >> 4 & 7);
                int k6 = anInt1232 + (i1 & 7);
                int j9 = buffer.readUnsignedLittleEndianShortA();
                int k11 = buffer.readUnsignedByteA(856);
                int i14 = k11 >> 2;
                int i16 = k11 & 3;
                int k17 = anIntArray1233[i14];
                if (l3 >= 0 && k6 >= 0 && l3 < 103 && k6 < 103) {
                    int j18 = anIntArrayArrayArray1267[anInt1166][l3][k6];
                    int i19 = anIntArrayArrayArray1267[anInt1166][l3 + 1][k6];
                    int l19 = anIntArrayArrayArray1267[anInt1166][l3 + 1][k6 + 1];
                    int k20 = anIntArrayArrayArray1267[anInt1166][l3][k6 + 1];
                    if (k17 == 0) {
                        Class15 class15 = aClass10_1198.method216(k6, l3, -203, anInt1166);
                        if (class15 != null) {
                            int l21 = class15.anInt297 >> 14 & 0x7fff;
                            if (i14 == 2) {
                                class15.aClass13_Sub1_Sub1_295 = new Class13_Sub1_Sub1_Sub2(k20, j18, l19, 4 + i16, j9, i19, false, 2, 29895, l21);
                                class15.aClass13_Sub1_Sub1_296 = new Class13_Sub1_Sub1_Sub2(k20, j18, l19, i16 + 1 & 3, j9, i19, false, 2, 29895, l21);
                            } else {
                                class15.aClass13_Sub1_Sub1_295 = new Class13_Sub1_Sub1_Sub2(k20, j18, l19, i16, j9, i19, false, i14, 29895, l21);
                            }
                        }
                    }
                    if (k17 == 1) {
                        Class18 class18 = aClass10_1198.method217(anInt1166, (byte) -27, l3, k6);
                        if (class18 != null) {
                            class18.aClass13_Sub1_Sub1_332 = new Class13_Sub1_Sub1_Sub2(k20, j18, l19, 0, j9, i19, false, 4, 29895, class18.anInt333 >> 14 & 0x7fff);
                        }
                    }
                    if (k17 == 2) {
                        Class20 class20 = aClass10_1198.method218(anInt1166, -47543, l3, k6);
                        if (i14 == 11) {
                            i14 = 10;
                        }
                        if (class20 != null) {
                            class20.aClass13_Sub1_Sub1_351 = new Class13_Sub1_Sub1_Sub2(k20, j18, l19, i16, j9, i19, false, i14, 29895, class20.anInt359 >> 14 & 0x7fff);
                        }
                    }
                    if (k17 == 3) {
                        Class11 class11 = aClass10_1198.method219(l3, k6, false, anInt1166);
                        if (class11 != null) {
                            class11.aClass13_Sub1_Sub1_228 = new Class13_Sub1_Sub1_Sub2(k20, j18, l19, i16, j9, i19, false, 22, 29895, class11.anInt229 >> 14 & 0x7fff);
                        }
                    }
                }
                return;
            }
            if (j == 248) {
                int j1 = buffer.method339(true);
                int i4 = buffer.readUnsignedLittleEndianShort();
                int l6 = buffer.readUnsignedByteA(856);
                int k9 = anInt1231 + (l6 >> 4 & 7);
                int l11 = anInt1232 + (l6 & 7);
                int j14 = buffer.readUnsignedShort();
                if (k9 >= 0 && l11 >= 0 && k9 < 104 && l11 < 104 && j14 != anInt950) {
                    Class13_Sub1_Sub1_Sub5 class13_sub1_sub1_sub5_2 = new Class13_Sub1_Sub1_Sub5();
                    class13_sub1_sub1_sub5_2.anInt1563 = j1;
                    class13_sub1_sub1_sub5_2.anInt1564 = i4;
                    if (aClass12ArrayArrayArray969[anInt1166][k9][l11] == null) {
                        aClass12ArrayArrayArray969[anInt1166][k9][l11] = new Class12(36944);
                    }
                    aClass12ArrayArrayArray969[anInt1166][k9][l11].method245(class13_sub1_sub1_sub5_2);
                    method52(k9, l11);
                }
                return;
            }
            if (j == 96) {
                int k1 = buffer.readUnsignedByteA(856);
                int j4 = anInt1231 + (k1 >> 4 & 7);
                int i7 = anInt1232 + (k1 & 7);
                int l9 = buffer.readUnsignedByteA(856);
                int i12 = l9 >> 2;
                int k14 = l9 & 3;
                int j16 = anIntArray1233[i12];
                if (j4 >= 0 && i7 >= 0 && j4 < 104 && i7 < 104) {
                    method84(k14, j4, -1, i7, -1, anInt1166, 0, j16, -146, i12);
                }
                return;
            }
            if (j == 218) {
                int l1 = buffer.readUnsignedByteC(19179);
                int k4 = anInt1231 + (l1 >> 4 & 7);
                int j7 = anInt1232 + (l1 & 7);
                byte byte0 = buffer.method333(7270);
                int j12 = buffer.readUnsignedLittleEndianShort();
                byte byte1 = buffer.readByte();
                int k16 = buffer.readUnsignedLittleEndianShort();
                byte byte2 = buffer.method333(7270);
                int k18 = buffer.method339(true);
                int j19 = buffer.readUnsignedLittleEndianShort();
                int i20 = buffer.method332(aByte1172);
                int l20 = i20 >> 2;
                int j21 = i20 & 3;
                int i22 = anIntArray1233[l20];
                byte byte3 = buffer.readByte();
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1;
                if (k18 == anInt950) {
                    class13_sub1_sub1_sub6_sub1 = aClass13_Sub1_Sub1_Sub6_Sub1_997;
                } else {
                    class13_sub1_sub1_sub6_sub1 = players[k18];
                }
                if (class13_sub1_sub1_sub6_sub1 != null) {
                    Class14 class14 = Class14.method418(j19);
                    int j22 = anIntArrayArrayArray1267[anInt1166][k4][j7];
                    int k22 = anIntArrayArrayArray1267[anInt1166][k4 + 1][j7];
                    int l22 = anIntArrayArrayArray1267[anInt1166][k4 + 1][j7 + 1];
                    int i23 = anIntArrayArrayArray1267[anInt1166][k4][j7 + 1];
                    Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = class14.method419(l20, j21, j22, k22, l22, i23, -1);
                    if (class13_sub1_sub1_sub4 != null) {
                        method84(0, k4, -1, j7, j12 + 1, anInt1166, k16 + 1, i22, -146, 0);
                        class13_sub1_sub1_sub6_sub1.anInt1706 = k16 + pulseCycle;
                        class13_sub1_sub1_sub6_sub1.anInt1707 = j12 + pulseCycle;
                        class13_sub1_sub1_sub6_sub1.aClass13_Sub1_Sub1_Sub4_1714 = class13_sub1_sub1_sub4;
                        int j23 = class14.anInt259;
                        int k23 = class14.anInt253;
                        if (j21 == 1 || j21 == 3) {
                            j23 = class14.anInt253;
                            k23 = class14.anInt259;
                        }
                        class13_sub1_sub1_sub6_sub1.anInt1711 = k4 * 128 + j23 * 64;
                        class13_sub1_sub1_sub6_sub1.anInt1713 = j7 * 128 + k23 * 64;
                        class13_sub1_sub1_sub6_sub1.anInt1712 = method80(anInt1166, 781, class13_sub1_sub1_sub6_sub1.anInt1713, class13_sub1_sub1_sub6_sub1.anInt1711);
                        if (byte2 > byte3) {
                            byte byte4 = byte2;
                            byte2 = byte3;
                            byte3 = byte4;
                        }
                        if (byte1 > byte0) {
                            byte byte5 = byte1;
                            byte1 = byte0;
                            byte0 = byte5;
                        }
                        class13_sub1_sub1_sub6_sub1.anInt1691 = k4 + byte2;
                        class13_sub1_sub1_sub6_sub1.anInt1693 = k4 + byte3;
                        class13_sub1_sub1_sub6_sub1.anInt1692 = j7 + byte1;
                        class13_sub1_sub1_sub6_sub1.anInt1694 = j7 + byte0;
                    }
                }
            }
            if (j == 36) {
                int i2 = buffer.readUnsignedByte();
                int l4 = anInt1231 + (i2 >> 4 & 7);
                int k7 = anInt1232 + (i2 & 7);
                int i10 = buffer.readUnsignedShort();
                int k12 = buffer.readUnsignedByte();
                int l14 = buffer.readUnsignedShort();
                if (l4 >= 0 && k7 >= 0 && l4 < 104 && k7 < 104) {
                    l4 = l4 * 128 + 64;
                    k7 = k7 * 128 + 64;
                    Class13_Sub1_Sub1_Sub3 class13_sub1_sub1_sub3 = new Class13_Sub1_Sub1_Sub3(pulseCycle, i10, l4, anInt1166, k7, (byte) 6, method80(anInt1166, 781, k7, l4) - k12, l14);
                    aClass12_982.method245(class13_sub1_sub1_sub3);
                }
                return;
            }
            if (j == 152) {
                int j2 = buffer.method332(aByte1172);
                int i5 = j2 >> 2;
                int l7 = j2 & 3;
                int j10 = anIntArray1233[i5];
                int l12 = buffer.readUnsignedByte();
                int i15 = anInt1231 + (l12 >> 4 & 7);
                int l16 = anInt1232 + (l12 & 7);
                int l17 = buffer.method339(true);
                if (i15 >= 0 && l16 >= 0 && i15 < 104 && l16 < 104) {
                    method84(l7, i15, l17, l16, -1, anInt1166, 0, j10, -146, i5);
                }
                return;
            }
            if (j == 209) {
                int k2 = buffer.readUnsignedByte();
                int j5 = anInt1231 + (k2 >> 4 & 7);
                int i8 = anInt1232 + (k2 & 7);
                int k10 = j5 + buffer.readByte();
                int i13 = i8 + buffer.readByte();
                int j15 = buffer.readShort();
                int i17 = buffer.readUnsignedShort();
                int i18 = buffer.readUnsignedByte() * 4;
                int l18 = buffer.readUnsignedByte() * 4;
                int k19 = buffer.readUnsignedShort();
                int j20 = buffer.readUnsignedShort();
                int i21 = buffer.readUnsignedByte();
                int k21 = buffer.readUnsignedByte();
                if (j5 >= 0 && i8 >= 0 && j5 < 104 && i8 < 104 && k10 >= 0 && i13 >= 0 && k10 < 104 && i13 < 104 && i17 != 65535) {
                    j5 = j5 * 128 + 64;
                    i8 = i8 * 128 + 64;
                    k10 = k10 * 128 + 64;
                    i13 = i13 * 128 + 64;
                    Class13_Sub1_Sub1_Sub1 class13_sub1_sub1_sub1 = new Class13_Sub1_Sub1_Sub1(k19 + pulseCycle, i17, method80(anInt1166, 781, i8, j5) - i18, j20 + pulseCycle, l18, j5, i8, anInt1166, (byte) 1, i21, j15, k21);
                    class13_sub1_sub1_sub1.method258(method80(anInt1166, 781, i13, k10) - l18, 0, i13, k19 + pulseCycle, k10);
                    aClass12_1199.method245(class13_sub1_sub1_sub1);
                }
                return;
            }
            if (j == 251) {
                int l2 = buffer.readUnsignedShort();
                int k5 = buffer.readUnsignedByteA(856);
                int j8 = anInt1231 + (k5 >> 4 & 7);
                int l10 = anInt1232 + (k5 & 7);
                int j13 = buffer.readUnsignedLittleEndianShortA();
                if (j8 >= 0 && l10 >= 0 && j8 < 104 && l10 < 104) {
                    Class13_Sub1_Sub1_Sub5 class13_sub1_sub1_sub5_1 = new Class13_Sub1_Sub1_Sub5();
                    class13_sub1_sub1_sub5_1.anInt1563 = l2;
                    class13_sub1_sub1_sub5_1.anInt1564 = j13;
                    if (aClass12ArrayArrayArray969[anInt1166][j8][l10] == null) {
                        aClass12ArrayArrayArray969[anInt1166][j8][l10] = new Class12(36944);
                    }
                    aClass12ArrayArrayArray969[anInt1166][j8][l10].method245(class13_sub1_sub1_sub5_1);
                    method52(j8, l10);
                }
                return;
            }
            if (j == 247) {
                int i3 = buffer.readUnsignedByte();
                int l5 = anInt1231 + (i3 >> 4 & 7);
                int k8 = anInt1232 + (i3 & 7);
                int i11 = buffer.readUnsignedShort();
                int k13 = buffer.readUnsignedByte();
                int k15 = k13 >> 4 & 0xf;
                int j17 = k13 & 7;
                if (aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0] >= l5 - k15 && aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0] <= l5 + k15 && aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0] >= k8 - k15 && aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0] <= k8 + k15 && aBoolean1010 && !aBoolean954 && anInt1057 < 50) {
                    anIntArray1278[anInt1057] = i11;
                    anIntArray1207[anInt1057] = j17;
                    anIntArray948[anInt1057] = Class27.anIntArray450[i11];
                    anInt1057++;
                }
            }
            if (j == 106) {
                int j3 = buffer.readUnsignedByte();
                int i6 = anInt1231 + (j3 >> 4 & 7);
                int l8 = anInt1232 + (j3 & 7);
                int j11 = buffer.readUnsignedShort();
                int l13 = buffer.readUnsignedShort();
                int l15 = buffer.readUnsignedShort();
                if (i6 >= 0 && l8 >= 0 && i6 < 104 && l8 < 104) {
                    Class12 class12_1 = aClass12ArrayArrayArray969[anInt1166][i6][l8];
                    if (class12_1 != null) {
                        for (Class13_Sub1_Sub1_Sub5 class13_sub1_sub1_sub5_3 = (Class13_Sub1_Sub1_Sub5) class12_1.method248(); class13_sub1_sub1_sub5_3 != null; class13_sub1_sub1_sub5_3 = (Class13_Sub1_Sub1_Sub5) class12_1.method250(-475)) {
                            if (class13_sub1_sub1_sub5_3.anInt1563 != (j11 & 0x7fff) || class13_sub1_sub1_sub5_3.anInt1564 != l13) {
                                continue;
                            }
                            class13_sub1_sub1_sub5_3.anInt1564 = l15;
                            break;
                        }
                        method52(i6, l8);
                    }
                }
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("98116, " + i + ", " + buffer + ", " + j + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method35(byte byte0, boolean flag) {
        try {
            if (aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 >> 7 == anInt1221 && aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 >> 7 == anInt1222) {
                anInt1221 = 0;
            }
            int i = anInt899;
            if (byte0 != 6) {
                anInt1074 = 22;
            }
            if (flag) {
                i = 1;
            }
            for (int j = 0; j < i; j++) {
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1;
                int k;
                if (flag) {
                    class13_sub1_sub1_sub6_sub1 = aClass13_Sub1_Sub1_Sub6_Sub1_997;
                    k = anInt897 << 14;
                } else {
                    class13_sub1_sub1_sub6_sub1 = players[playerList[j]];
                    k = playerList[j] << 14;
                }
                if (class13_sub1_sub1_sub6_sub1 == null || !class13_sub1_sub1_sub6_sub1.method291(true)) {
                    continue;
                }
                class13_sub1_sub1_sub6_sub1.aBoolean1688 = (aBoolean954 && anInt899 > 50 || anInt899 > 200) && !flag && class13_sub1_sub1_sub6_sub1.anInt1620 == class13_sub1_sub1_sub6_sub1.anInt1584;
                int l = class13_sub1_sub1_sub6_sub1.anInt1587 >> 7;
                int i1 = class13_sub1_sub1_sub6_sub1.anInt1588 >> 7;
                if (l < 0 || l >= 104 || i1 < 0 || i1 >= 104) {
                    continue;
                }
                if (class13_sub1_sub1_sub6_sub1.aClass13_Sub1_Sub1_Sub4_1714 != null && pulseCycle >= class13_sub1_sub1_sub6_sub1.anInt1706 && pulseCycle < class13_sub1_sub1_sub6_sub1.anInt1707) {
                    class13_sub1_sub1_sub6_sub1.aBoolean1688 = false;
                    class13_sub1_sub1_sub6_sub1.anInt1699 = method80(anInt1166, 781, class13_sub1_sub1_sub6_sub1.anInt1588, class13_sub1_sub1_sub6_sub1.anInt1587);
                    aClass10_1198.method206(anInt1265, anInt1166, class13_sub1_sub1_sub6_sub1, class13_sub1_sub1_sub6_sub1.anInt1692, class13_sub1_sub1_sub6_sub1.anInt1691, 60, class13_sub1_sub1_sub6_sub1.anInt1587, k, class13_sub1_sub1_sub6_sub1.anInt1588, class13_sub1_sub1_sub6_sub1.anInt1693, class13_sub1_sub1_sub6_sub1.anInt1694, class13_sub1_sub1_sub6_sub1.anInt1699, class13_sub1_sub1_sub6_sub1.anInt1589);
                    continue;
                }
                if ((class13_sub1_sub1_sub6_sub1.anInt1587 & 0x7f) == 64 && (class13_sub1_sub1_sub6_sub1.anInt1588 & 0x7f) == 64) {
                    if (anIntArrayArray1228[l][i1] == anInt979) {
                        continue;
                    }
                    anIntArrayArray1228[l][i1] = anInt979;
                }
                class13_sub1_sub1_sub6_sub1.anInt1699 = method80(anInt1166, 781, class13_sub1_sub1_sub6_sub1.anInt1588, class13_sub1_sub1_sub6_sub1.anInt1587);
                aClass10_1198.method205(class13_sub1_sub1_sub6_sub1.anInt1588, class13_sub1_sub1_sub6_sub1.anInt1587, anInt1166, k, class13_sub1_sub1_sub6_sub1, -554, class13_sub1_sub1_sub6_sub1.anInt1699, 60, class13_sub1_sub1_sub6_sub1.anInt1589, class13_sub1_sub1_sub6_sub1.aBoolean1569);
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("97460, " + byte0 + ", " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method36(byte byte0, int i, int j, int k, int l, int i1) {
        try {
            aClass13_Sub1_Sub4_Sub3_1255.method401(l, (byte) 83, i1);
            aClass13_Sub1_Sub4_Sub3_1256.method401((l + i) - 16, (byte) 83, i1);
            Class13_Sub1_Sub4.method356(false, i1, l + 16, anInt1182, 16, i - 32);
            int j1 = ((i - 32) * i) / j;
            if (j1 < 8) {
                j1 = 8;
            }
            int k1 = ((i - 32 - j1) * k) / (j - i);
            Class13_Sub1_Sub4.method356(false, i1, l + 16 + k1, anInt949, 16, j1);
            Class13_Sub1_Sub4.method361(i1, j1, anInt906, l + 16 + k1, -38103);
            if (byte0 == 2) {
                byte0 = 0;
            } else {
                anInt992 = isaacCipher.method190();
            }
            Class13_Sub1_Sub4.method361(i1 + 1, j1, anInt906, l + 16 + k1, -38103);
            Class13_Sub1_Sub4.method359((byte) -40, anInt906, i1, l + 16 + k1, 16);
            Class13_Sub1_Sub4.method359((byte) -40, anInt906, i1, l + 17 + k1, 16);
            Class13_Sub1_Sub4.method361(i1 + 15, j1, anInt1111, l + 16 + k1, -38103);
            Class13_Sub1_Sub4.method361(i1 + 14, j1 - 1, anInt1111, l + 17 + k1, -38103);
            Class13_Sub1_Sub4.method359((byte) -40, anInt1111, i1, l + 15 + k1 + j1, 16);
            Class13_Sub1_Sub4.method359((byte) -40, anInt1111, i1 + 1, l + 14 + k1 + j1, 15);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("99804, " + byte0 + ", " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method37(int i) {
        try {
            if (anInt1060 != 0) {
                return;
            }
            int j = super.anInt29;
            if (i >= 0) {
                opcode = buffer.readUnsignedByte();
            }
            if (anInt973 == 1 && super.anInt30 >= 516 && super.anInt31 >= 160 && super.anInt30 <= 765 && super.anInt31 <= 205) {
                j = 0;
            }
            if (aBoolean989) {
                if (j != 1) {
                    int k = super.anInt23;
                    int j1 = super.anInt24;
                    if (anInt820 == 0) {
                        k -= 4;
                        j1 -= 4;
                    }
                    if (anInt820 == 1) {
                        k -= 553;
                        j1 -= 205;
                    }
                    if (anInt820 == 2) {
                        k -= 17;
                        j1 -= 357;
                    }
                    if (k < anInt821 - 10 || k > anInt821 + anInt823 + 10 || j1 < anInt822 - 10 || j1 > anInt822 + anInt824 + 10) {
                        aBoolean989 = false;
                        if (anInt820 == 1) {
                            aBoolean1148 = true;
                        }
                        if (anInt820 == 2) {
                            aBoolean1169 = true;
                        }
                    }
                }
                if (j == 1) {
                    int l = anInt821;
                    int k1 = anInt822;
                    int i2 = anInt823;
                    int k2 = super.anInt30;
                    int l2 = super.anInt31;
                    if (anInt820 == 0) {
                        k2 -= 4;
                        l2 -= 4;
                    }
                    if (anInt820 == 1) {
                        k2 -= 553;
                        l2 -= 205;
                    }
                    if (anInt820 == 2) {
                        k2 -= 17;
                        l2 -= 357;
                    }
                    int i3 = -1;
                    for (int j3 = 0; j3 < anInt1167; j3++) {
                        int k3 = k1 + 31 + (anInt1167 - 1 - j3) * 15;
                        if (k2 > l && k2 < l + i2 && l2 > k3 - 13 && l2 < k3 + 3) {
                            i3 = j3;
                        }
                    }
                    if (i3 != -1) {
                        method27((byte) 66, i3);
                    }
                    aBoolean989 = false;
                    if (anInt820 == 1) {
                        aBoolean1148 = true;
                    }
                    if (anInt820 == 2) {
                        aBoolean1169 = true;
                        return;
                    }
                }
            } else {
                if (j == 1 && anInt1167 > 0) {
                    int i1 = anIntArray911[anInt1167 - 1];
                    if (i1 == 11 || i1 == 13 || i1 == 650 || i1 == 222 || i1 == 31 || i1 == 707 || i1 == 426 || i1 == 71 || i1 == 333 || i1 == 678 || i1 == 195 || i1 == 1870) {
                        int l1 = anIntArray909[anInt1167 - 1];
                        int j2 = anIntArray910[anInt1167 - 1];
                        Widget widget = Widget.aWidgetArray533[j2];
                        if (widget.aBoolean538 || widget.aBoolean578) {
                            aBoolean1070 = false;
                            anInt1183 = 0;
                            anInt1058 = j2;
                            anInt1059 = l1;
                            anInt1060 = 2;
                            anInt1061 = super.anInt30;
                            anInt1062 = super.anInt31;
                            if (Widget.aWidgetArray533[j2].anInt573 == anInt1217) {
                                anInt1060 = 1;
                            }
                            if (Widget.aWidgetArray533[j2].anInt573 == anInt1016) {
                                anInt1060 = 3;
                            }
                            return;
                        }
                    }
                }
                if (j == 1 && (anInt1275 == 1 || method17(anInt1167 - 1, 9)) && anInt1167 > 2) {
                    j = 2;
                }
                if (j == 1 && anInt1167 > 0) {
                    method27((byte) 66, anInt1167 - 1);
                }
                if (j == 2 && anInt1167 > 0) {
                    method109(true);
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("94863, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method38(int i) {
        try {
            int j = 5;
            anIntArray1277[8] = 0;
            if (i != anInt1238) {
                method6();
            }
            int k = 0;
            while (anIntArray1277[8] == 0) {
                String s = "Unknown problem";
                method13(false, "Connecting to web server", 20);
                try {
                    DataInputStream datainputstream = method141("crc" + (int) (Math.random() * 99999999D) + "-" + 319);
                    Buffer buffer = new Buffer(-351, new byte[40]);
                    datainputstream.readFully(buffer.payload, 0, 40);
                    datainputstream.close();
                    for (int i1 = 0; i1 < 9; i1++) {
                        anIntArray1277[i1] = buffer.readInt();
                    }
                    int j1 = buffer.readInt();
                    int k1 = 1234;
                    for (int l1 = 0; l1 < 9; l1++) {
                        k1 = (k1 << 1) + anIntArray1277[l1];
                    }
                    if (j1 != k1) {
                        s = "checksum problem";
                        anIntArray1277[8] = 0;
                    }
                } catch (EOFException _ex) {
                    s = "EOF problem";
                    anIntArray1277[8] = 0;
                } catch (IOException _ex) {
                    s = "connection problem";
                    anIntArray1277[8] = 0;
                } catch (Exception _ex) {
                    s = "logic problem";
                    anIntArray1277[8] = 0;
                    if (!Signlink.reporterror) {
                        return;
                    }
                }
                if (anIntArray1277[8] == 0) {
                    k++;
                    for (int l = j; l > 0; l--) {
                        if (k >= 10) {
                            method13(false, "Game updated - please reload page", 10);
                            l = 10;
                        } else {
                            method13(false, s + " - Will retry in " + l + " secs.", 10);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception _ex) {
                        }
                    }
                    j *= 2;
                    if (j > 60) {
                        j = 60;
                    }
                    aBoolean1069 = !aBoolean1069;
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("73766, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method39(int i) {
        try {
            Signlink.midifade = 0;
            Signlink.midi = "stop";
            if (i <= 0) {
                for (int j = 1; j > 0; j++) {
                }
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("21966, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method40(int i) {
        try {
            packetSize += i;
            for (Class13_Sub1_Sub1_Sub3 class13_sub1_sub1_sub3 = (Class13_Sub1_Sub1_Sub3) aClass12_982.method248(); class13_sub1_sub1_sub3 != null; class13_sub1_sub1_sub3 = (Class13_Sub1_Sub1_Sub3) aClass12_982.method250(-475)) {
                if (class13_sub1_sub1_sub3.anInt1480 != anInt1166 || class13_sub1_sub1_sub3.aBoolean1479) {
                    class13_sub1_sub1_sub3.method253();
                } else if (pulseCycle >= class13_sub1_sub1_sub3.anInt1484) {
                    class13_sub1_sub1_sub3.method260((byte) 4, anInt1241);
                    if (class13_sub1_sub1_sub3.aBoolean1479) {
                        class13_sub1_sub1_sub3.method253();
                    } else {
                        aClass10_1198.method205(class13_sub1_sub1_sub3.anInt1482, class13_sub1_sub1_sub3.anInt1481, class13_sub1_sub1_sub3.anInt1480, -1, class13_sub1_sub1_sub3, -554, class13_sub1_sub1_sub3.anInt1483, 60, 0, false);
                    }
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("7125, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method41(int i) {
        try {
            aBoolean1047 = false;
            while (aBoolean866) {
                aBoolean1047 = false;
                try {
                    Thread.sleep(50L);
                } catch (Exception _ex) {
                }
            }
            aClass13_Sub1_Sub4_Sub3_1120 = null;
            aClass13_Sub1_Sub4_Sub3_1121 = null;
            aClass13_Sub1_Sub4_Sub3Array1155 = null;
            anIntArray843 = null;
            anIntArray844 = null;
            anIntArray845 = null;
            anIntArray846 = null;
            anIntArray1043 = null;
            i = 46 / i;
            anIntArray1044 = null;
            anIntArray1130 = null;
            anIntArray1131 = null;
            aClass13_Sub1_Sub4_Sub4_925 = null;
            aClass13_Sub1_Sub4_Sub4_926 = null;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("6092, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method42(int i, int j, Buffer buffer) {
        try {
            if (j < 1 || j > 1) {
                anInt1093 = -213;
            }
            while (buffer.bitPosition + 21 < i * 8) {
                int k = buffer.readBits(14, 195);
                if (k == 16383) {
                    break;
                }
                if (aClass13_Sub1_Sub1_Sub6_Sub2Array1283[k] == null) {
                    aClass13_Sub1_Sub1_Sub6_Sub2Array1283[k] = new Class13_Sub1_Sub1_Sub6_Sub2();
                }
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[k];
                anIntArray1285[anInt1284++] = k;
                class13_sub1_sub1_sub6_sub2.pulseCycle = pulseCycle;
                int yPosition = buffer.readBits(5, 195);
                if (yPosition > 15) {
                    yPosition -= 32;
                }
                int i1 = buffer.readBits(1, 195);
                int xPosition = buffer.readBits(5, 195);
                if (xPosition > 15) {
                    xPosition -= 32;
                }
                class13_sub1_sub1_sub6_sub2.aClass47_1717 = Class47.getDefinition(buffer.readBits(12, 195));
                int k1 = buffer.readBits(1, 195);
                if (k1 == 1) {
                    anIntArray902[anInt901++] = k;
                }
                class13_sub1_sub1_sub6_sub2.anInt1611 = class13_sub1_sub1_sub6_sub2.aClass47_1717.aByte768;
                class13_sub1_sub1_sub6_sub2.anInt1618 = class13_sub1_sub1_sub6_sub2.aClass47_1717.anInt760;
                class13_sub1_sub1_sub6_sub2.anInt1570 = class13_sub1_sub1_sub6_sub2.aClass47_1717.anInt778;
                class13_sub1_sub1_sub6_sub2.anInt1571 = class13_sub1_sub1_sub6_sub2.aClass47_1717.anInt785;
                class13_sub1_sub1_sub6_sub2.anInt1572 = class13_sub1_sub1_sub6_sub2.aClass47_1717.anInt773;
                class13_sub1_sub1_sub6_sub2.anInt1573 = class13_sub1_sub1_sub6_sub2.aClass47_1717.anInt786;
                class13_sub1_sub1_sub6_sub2.anInt1584 = class13_sub1_sub1_sub6_sub2.aClass47_1717.anInt748;
                class13_sub1_sub1_sub6_sub2.method294(i1 == 1, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0] + xPosition, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0] + yPosition, (byte) 103);
            }
            buffer.finishBitAccess(3);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("78080, " + i + ", " + j + ", " + buffer + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method43(byte byte0, int i, byte[] abyte0) {
        try {
            if (byte0 != 35) {
                aBoolean994 = !aBoolean994;
            }
            if (abyte0 == null) {
                return true;
            } else {
                return Signlink.wavesave(abyte0, i);
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("72990, " + byte0 + ", " + i + ", " + abyte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method44(boolean flag) {
        try {
            aClass31_1212.method490(false);
            if (anInt1094 == 2) {
                byte[] abyte0 = aClass13_Sub1_Sub4_Sub3_1209.aByteArray1667;
                int[] ai = Class13_Sub1_Sub4.anIntArray1423;
                int k2 = abyte0.length;
                for (int i5 = 0; i5 < k2; i5++) {
                    if (abyte0[i5] == 0) {
                        ai[i5] = 0;
                    }
                }
                aClass13_Sub1_Sub4_Sub4_967.method412(anIntArray1171, anIntArray1200, 33, 256, 0, anInt922, 33, 25, 25, 0, anInt872);
                aClass31_1213.method490(false);
                return;
            }
            int i = anInt922 + anInt1205 & 0x7ff;
            if (!flag) {
                anInt1170 = 96;
            }
            int j = 48 + aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 / 32;
            int l2 = 464 - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 / 32;
            aClass13_Sub1_Sub4_Sub4_1223.method412(anIntArray1000, anIntArray847, 151, 256 + anInt1035, 25, i, 146, l2, j, 5, anInt872);
            aClass13_Sub1_Sub4_Sub4_967.method412(anIntArray1171, anIntArray1200, 33, 256, 0, anInt922, 33, 25, 25, 0, anInt872);
            for (int j5 = 0; j5 < anInt830; j5++) {
                int k = (anIntArray831[j5] * 4 + 2) - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 / 32;
                int i3 = (anIntArray832[j5] * 4 + 2) - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 / 32;
                method115(aClass13_Sub1_Sub4_Sub4Array1145[j5], k, i3, 543);
            }
            for (int k5 = 0; k5 < 104; k5++) {
                for (int l5 = 0; l5 < 104; l5++) {
                    Class12 class12 = aClass12ArrayArrayArray969[anInt1166][k5][l5];
                    if (class12 != null) {
                        int l = (k5 * 4 + 2) - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 / 32;
                        int j3 = (l5 * 4 + 2) - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 / 32;
                        method115(aClass13_Sub1_Sub4_Sub4_1124, l, j3, 543);
                    }
                }
            }
            for (int i6 = 0; i6 < anInt1284; i6++) {
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[anIntArray1285[i6]];
                if (class13_sub1_sub1_sub6_sub2 != null && class13_sub1_sub1_sub6_sub2.method291(true)) {
                    Class47 class47 = class13_sub1_sub1_sub6_sub2.aClass47_1717;
                    if (class47.anIntArray751 != null) {
                        class47 = class47.method584((byte) 0);
                    }
                    if (class47 != null && class47.aBoolean752 && class47.aBoolean784) {
                        int i1 = class13_sub1_sub1_sub6_sub2.anInt1587 / 32 - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 / 32;
                        int k3 = class13_sub1_sub1_sub6_sub2.anInt1588 / 32 - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 / 32;
                        method115(aClass13_Sub1_Sub4_Sub4_1125, i1, k3, 543);
                    }
                }
            }
            for (int j6 = 0; j6 < anInt899; j6++) {
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1 = players[playerList[j6]];
                if (class13_sub1_sub1_sub6_sub1 != null && class13_sub1_sub1_sub6_sub1.method291(true)) {
                    int j1 = class13_sub1_sub1_sub6_sub1.anInt1587 / 32 - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 / 32;
                    int l3 = class13_sub1_sub1_sub6_sub1.anInt1588 / 32 - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 / 32;
                    boolean flag1 = false;
                    long l6 = Class24.method446(class13_sub1_sub1_sub6_sub1.aString1689);
                    for (int k6 = 0; k6 < anInt1054; k6++) {
                        if (l6 != aLongArray993[k6] || anIntArray850[k6] == 0) {
                            continue;
                        }
                        flag1 = true;
                        break;
                    }
                    boolean flag2 = aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1702 != 0 && class13_sub1_sub1_sub6_sub1.anInt1702 != 0 && aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1702 == class13_sub1_sub1_sub6_sub1.anInt1702;
                    if (flag1) {
                        method115(aClass13_Sub1_Sub4_Sub4_1127, j1, l3, 543);
                    } else if (flag2) {
                        method115(aClass13_Sub1_Sub4_Sub4_1128, j1, l3, 543);
                    } else {
                        method115(aClass13_Sub1_Sub4_Sub4_1126, j1, l3, 543);
                    }
                }
            }
            if (anInt1227 != 0 && pulseCycle % 20 < 10) {
                if (anInt1227 == 1 && anInt1015 >= 0 && anInt1015 < aClass13_Sub1_Sub1_Sub6_Sub2Array1283.length) {
                    Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2_1 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[anInt1015];
                    if (class13_sub1_sub1_sub6_sub2_1 != null) {
                        int k1 = class13_sub1_sub1_sub6_sub2_1.anInt1587 / 32 - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 / 32;
                        int i4 = class13_sub1_sub1_sub6_sub2_1.anInt1588 / 32 - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 / 32;
                        method116(aClass13_Sub1_Sub4_Sub4_946, k1, 1, i4);
                    }
                }
                if (anInt1227 == 2) {
                    int l1 = ((anInt1132 - anInt1083) * 4 + 2) - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 / 32;
                    int j4 = ((anInt1133 - anInt1084) * 4 + 2) - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 / 32;
                    method116(aClass13_Sub1_Sub4_Sub4_946, l1, 1, j4);
                }
                if (anInt1227 == 10 && anInt999 >= 0 && anInt999 < players.length) {
                    Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1_1 = players[anInt999];
                    if (class13_sub1_sub1_sub6_sub1_1 != null) {
                        int i2 = class13_sub1_sub1_sub6_sub1_1.anInt1587 / 32 - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 / 32;
                        int k4 = class13_sub1_sub1_sub6_sub1_1.anInt1588 / 32 - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 / 32;
                        method116(aClass13_Sub1_Sub4_Sub4_946, i2, 1, k4);
                    }
                }
            }
            if (anInt1221 != 0) {
                int j2 = (anInt1221 * 4 + 2) - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 / 32;
                int l4 = (anInt1222 * 4 + 2) - aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 / 32;
                method115(aClass13_Sub1_Sub4_Sub4_945, j2, l4, 543);
            }
            Class13_Sub1_Sub4.method356(false, 97, 78, 0xffffff, 3, 3);
            aClass31_1213.method490(false);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("85574, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method45(int i, long l) {
        try {
            if (l == 0L) {
                return;
            }
            if (anInt1054 >= 100 && anInt988 != 1) {
                method70(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", (byte) 117);
                return;
            }
            if (anInt1054 >= 200) {
                method70(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", (byte) 117);
                return;
            }
            String s = Class24.method450(Class24.method447(l, 0), 0);
            i = 9 / i;
            for (int j = 0; j < anInt1054; j++) {
                if (aLongArray993[j] == l) {
                    method70(0, s + " is already on your friend list", "", (byte) 117);
                    return;
                }
            }
            for (int k = 0; k < anInt1098; k++) {
                if (aLongArray990[k] == l) {
                    method70(0, "Please remove " + s + " from your ignore list first", "", (byte) 117);
                    return;
                }
            }
            if (s.equals(aClass13_Sub1_Sub1_Sub6_Sub1_997.aString1689)) {
                return;
            } else {
                aStringArray1003[anInt1054] = s;
                aLongArray993[anInt1054] = l;
                anIntArray850[anInt1054] = 0;
                anInt1054++;
                aBoolean1148 = true;
                aBuffer_928.method300(112);
                aBuffer_928.writeLong(l);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("39619, " + i + ", " + l + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method8(int i) {
        try {
            Signlink.reporterror = false;
            try {
                if (gameConnection != null) {
                    gameConnection.close();
                }
            } catch (Exception _ex) {
            }
            gameConnection = null;
            method39(anInt1173);
            if (aClass48_865 != null) {
                aClass48_865.aBoolean792 = false;
            }
            aClass48_865 = null;
            aClass2_Sub1_873.method161();
            aClass2_Sub1_873 = null;
            aBuffer_1282 = null;
            aBuffer_928 = null;
            outBuffer = null;
            buffer = null;
            anIntArray937 = null;
            aByteArrayArray1146 = null;
            aByteArrayArray1179 = null;
            anIntArray938 = null;
            anIntArray939 = null;
            anIntArrayArrayArray1267 = null;
            aByteArrayArrayArray1164 = null;
            aClass10_1198 = null;
            aClass39Array947 = null;
            anIntArrayArray1097 = null;
            anIntArrayArray817 = null;
            anIntArray959 = null;
            anIntArray960 = null;
            aByteArray941 = null;
            aClass31_1211 = null;
            aClass31_1212 = null;
            aClass31_1213 = null;
            aClass31_1214 = null;
            aClass31_1186 = null;
            aClass31_1187 = null;
            aClass31_1188 = null;
            aClass31_875 = null;
            aClass31_876 = null;
            aClass31_877 = null;
            aClass31_878 = null;
            aClass31_879 = null;
            aClass31_880 = null;
            aClass31_881 = null;
            aClass31_882 = null;
            aClass31_883 = null;
            aClass13_Sub1_Sub4_Sub3_1208 = null;
            aClass13_Sub1_Sub4_Sub3_1209 = null;
            aClass13_Sub1_Sub4_Sub3_1210 = null;
            aClass13_Sub1_Sub4_Sub3_1112 = null;
            aClass13_Sub1_Sub4_Sub3_1113 = null;
            aClass13_Sub1_Sub4_Sub3_1114 = null;
            aClass13_Sub1_Sub4_Sub3Array1181 = null;
            aClass13_Sub1_Sub4_Sub3_867 = null;
            aClass13_Sub1_Sub4_Sub3_868 = null;
            aClass13_Sub1_Sub4_Sub3_869 = null;
            aClass13_Sub1_Sub4_Sub3_870 = null;
            aClass13_Sub1_Sub4_Sub3_871 = null;
            aClass13_Sub1_Sub4_Sub3_1088 = null;
            aClass13_Sub1_Sub4_Sub3_1089 = null;
            aClass13_Sub1_Sub4_Sub3_1090 = null;
            aClass13_Sub1_Sub4_Sub3_1091 = null;
            aClass13_Sub1_Sub4_Sub3_1092 = null;
            aClass13_Sub1_Sub4_Sub4_967 = null;
            aClass13_Sub1_Sub4_Sub4Array1266 = null;
            aClass13_Sub1_Sub4_Sub4Array1236 = null;
            aClass13_Sub1_Sub4_Sub4Array1201 = null;
            aClass13_Sub1_Sub4_Sub4_1124 = null;
            aClass13_Sub1_Sub4_Sub4_1125 = null;
            aClass13_Sub1_Sub4_Sub4_1126 = null;
            aClass13_Sub1_Sub4_Sub4_1127 = null;
            aClass13_Sub1_Sub4_Sub4_1128 = null;
            aClass13_Sub1_Sub4_Sub3Array1123 = null;
            aClass13_Sub1_Sub4_Sub4Array1189 = null;
            anIntArrayArray1228 = null;
            players = null;
            playerList = null;
            anIntArray902 = null;
            aBufferArray903 = null;
            anIntArray1072 = null;
            aClass13_Sub1_Sub1_Sub6_Sub2Array1283 = null;
            anIntArray1285 = null;
            aClass12ArrayArrayArray969 = null;
            aClass12_1152 = null;
            aClass12_1199 = null;
            aClass12_982 = null;
            anIntArray909 = null;
            anIntArray910 = null;
            anIntArray911 = null;
            anIntArray912 = null;
            aStringArray961 = null;
            anIntArray1149 = null;
            anIntArray831 = null;
            anIntArray832 = null;
            aClass13_Sub1_Sub4_Sub4Array1145 = null;
            aClass13_Sub1_Sub4_Sub4_1223 = null;
            aStringArray1003 = null;
            aLongArray993 = null;
            anIntArray850 = null;
            aClass31_1248 = null;
            aClass31_1249 = null;
            aClass31_1245 = null;
            aClass31_1246 = null;
            aClass31_1247 = null;
            if (i <= 0) {
                anInt1170 = -41;
            }
            aClass31_1250 = null;
            aClass31_1251 = null;
            aClass31_1252 = null;
            aClass31_1253 = null;
            method41(88);
            Class14.method416(47779);
            Class47.method588(47779);
            ItemDefinition.method511(47779);
            Class32.aClass32Array489 = null;
            Class4.aClass4Array65 = null;
            Widget.aWidgetArray533 = null;
            Class19.aClass19Array337 = null;
            Class50.aClass50Array800 = null;
            Class40.aClass40Array685 = null;
            Class40.aClass3_697 = null;
            Class22.aClass22Array365 = null;
            super.aClass31_16 = null;
            Class13_Sub1_Sub1_Sub6_Sub1.aClass3_1696 = null;
            Class13_Sub1_Sub4_Sub1.method363(47779);
            Class10.method193(47779);
            Class13_Sub1_Sub1_Sub4.method261(47779);
            Class8.method187(47779);
            System.gc();
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("90276, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method46(boolean flag, int i, int j, int k, int l, int i1, int j1,
                            int k1, int l1, int i2, int j2, int k2) {
        try {
            byte byte0 = 104;
            byte byte1 = 104;
            for (int l2 = 0; l2 < byte0; l2++) {
                for (int i3 = 0; i3 < byte1; i3++) {
                    anIntArrayArray1097[l2][i3] = 0;
                    anIntArrayArray817[l2][i3] = 0x5f5e0ff;
                }
            }
            int j3 = l;
            int k3 = k;
            anIntArrayArray1097[l][k] = 99;
            if (j >= 0) {
                aBuffer_928.writeByte(32);
            }
            anIntArrayArray817[l][k] = 0;
            int l3 = 0;
            int i4 = 0;
            anIntArray959[l3] = l;
            anIntArray960[l3++] = k;
            boolean flag1 = false;
            int j4 = anIntArray959.length;
            int[][] ai = aClass39Array947[anInt1166].anIntArrayArray682;
            while (i4 != l3) {
                j3 = anIntArray959[i4];
                k3 = anIntArray960[i4];
                i4 = (i4 + 1) % j4;
                if (j3 == j2 && k3 == i2) {
                    flag1 = true;
                    break;
                }
                if (k2 != 0) {
                    if ((k2 < 5 || k2 == 10) && aClass39Array947[anInt1166].method525(j2, k3, i2, j3, 322, k1, k2 - 1)) {
                        flag1 = true;
                        break;
                    }
                    if (k2 < 10 && aClass39Array947[anInt1166].method526(j2, j3, k1, k2 - 1, k3, i2, true)) {
                        flag1 = true;
                        break;
                    }
                }
                if (l1 != 0 && i != 0 && aClass39Array947[anInt1166].method527(i, i2, l1, j3, k3, -965, j2, i1)) {
                    flag1 = true;
                    break;
                }
                int l4 = anIntArrayArray817[j3][k3] + 1;
                if (j3 > 0 && anIntArrayArray1097[j3 - 1][k3] == 0 && (ai[j3 - 1][k3] & 0x1280108) == 0) {
                    anIntArray959[l3] = j3 - 1;
                    anIntArray960[l3] = k3;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1097[j3 - 1][k3] = 2;
                    anIntArrayArray817[j3 - 1][k3] = l4;
                }
                if (j3 < byte0 - 1 && anIntArrayArray1097[j3 + 1][k3] == 0 && (ai[j3 + 1][k3] & 0x1280180) == 0) {
                    anIntArray959[l3] = j3 + 1;
                    anIntArray960[l3] = k3;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1097[j3 + 1][k3] = 8;
                    anIntArrayArray817[j3 + 1][k3] = l4;
                }
                if (k3 > 0 && anIntArrayArray1097[j3][k3 - 1] == 0 && (ai[j3][k3 - 1] & 0x1280102) == 0) {
                    anIntArray959[l3] = j3;
                    anIntArray960[l3] = k3 - 1;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1097[j3][k3 - 1] = 1;
                    anIntArrayArray817[j3][k3 - 1] = l4;
                }
                if (k3 < byte1 - 1 && anIntArrayArray1097[j3][k3 + 1] == 0 && (ai[j3][k3 + 1] & 0x1280120) == 0) {
                    anIntArray959[l3] = j3;
                    anIntArray960[l3] = k3 + 1;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1097[j3][k3 + 1] = 4;
                    anIntArrayArray817[j3][k3 + 1] = l4;
                }
                if (j3 > 0 && k3 > 0 && anIntArrayArray1097[j3 - 1][k3 - 1] == 0 && (ai[j3 - 1][k3 - 1] & 0x128010e) == 0 && (ai[j3 - 1][k3] & 0x1280108) == 0 && (ai[j3][k3 - 1] & 0x1280102) == 0) {
                    anIntArray959[l3] = j3 - 1;
                    anIntArray960[l3] = k3 - 1;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1097[j3 - 1][k3 - 1] = 3;
                    anIntArrayArray817[j3 - 1][k3 - 1] = l4;
                }
                if (j3 < byte0 - 1 && k3 > 0 && anIntArrayArray1097[j3 + 1][k3 - 1] == 0 && (ai[j3 + 1][k3 - 1] & 0x1280183) == 0 && (ai[j3 + 1][k3] & 0x1280180) == 0 && (ai[j3][k3 - 1] & 0x1280102) == 0) {
                    anIntArray959[l3] = j3 + 1;
                    anIntArray960[l3] = k3 - 1;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1097[j3 + 1][k3 - 1] = 9;
                    anIntArrayArray817[j3 + 1][k3 - 1] = l4;
                }
                if (j3 > 0 && k3 < byte1 - 1 && anIntArrayArray1097[j3 - 1][k3 + 1] == 0 && (ai[j3 - 1][k3 + 1] & 0x1280138) == 0 && (ai[j3 - 1][k3] & 0x1280108) == 0 && (ai[j3][k3 + 1] & 0x1280120) == 0) {
                    anIntArray959[l3] = j3 - 1;
                    anIntArray960[l3] = k3 + 1;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1097[j3 - 1][k3 + 1] = 6;
                    anIntArrayArray817[j3 - 1][k3 + 1] = l4;
                }
                if (j3 < byte0 - 1 && k3 < byte1 - 1 && anIntArrayArray1097[j3 + 1][k3 + 1] == 0 && (ai[j3 + 1][k3 + 1] & 0x12801e0) == 0 && (ai[j3 + 1][k3] & 0x1280180) == 0 && (ai[j3][k3 + 1] & 0x1280120) == 0) {
                    anIntArray959[l3] = j3 + 1;
                    anIntArray960[l3] = k3 + 1;
                    l3 = (l3 + 1) % j4;
                    anIntArrayArray1097[j3 + 1][k3 + 1] = 12;
                    anIntArrayArray817[j3 + 1][k3 + 1] = l4;
                }
            }
            anInt1081 = 0;
            if (!flag1) {
                if (flag) {
                    int i5 = 100;
                    for (int k5 = 1; k5 < 2; k5++) {
                        for (int i6 = j2 - k5; i6 <= j2 + k5; i6++) {
                            for (int k6 = i2 - k5; k6 <= i2 + k5; k6++) {
                                if (i6 >= 0 && k6 >= 0 && i6 < 104 && k6 < 104 && anIntArrayArray817[i6][k6] < i5) {
                                    i5 = anIntArrayArray817[i6][k6];
                                    j3 = i6;
                                    k3 = k6;
                                    anInt1081 = 1;
                                    flag1 = true;
                                }
                            }
                        }
                        if (flag1) {
                            break;
                        }
                    }
                }
                if (!flag1) {
                    return false;
                }
            }
            i4 = 0;
            anIntArray959[i4] = j3;
            anIntArray960[i4++] = k3;
            int l5;
            for (int j5 = l5 = anIntArrayArray1097[j3][k3]; j3 != l || k3 != k; j5 = anIntArrayArray1097[j3][k3]) {
                if (j5 != l5) {
                    l5 = j5;
                    anIntArray959[i4] = j3;
                    anIntArray960[i4++] = k3;
                }
                if ((j5 & 2) != 0) {
                    j3++;
                } else if ((j5 & 8) != 0) {
                    j3--;
                }
                if ((j5 & 1) != 0) {
                    k3++;
                } else if ((j5 & 4) != 0) {
                    k3--;
                }
            }
            if (i4 > 0) {
                int k4 = i4;
                if (k4 > 25) {
                    k4 = 25;
                }
                i4--;
                int j6 = anIntArray959[i4];
                int l6 = anIntArray960[i4];
                if (j1 == 0) {
                    aBuffer_928.method300(155);
                    aBuffer_928.writeByte(k4 + k4 + 3);
                }
                if (j1 == 1) {
                    aBuffer_928.method300(178);
                    aBuffer_928.writeByte(k4 + k4 + 3 + 14);
                }
                if (j1 == 2) {
                    aBuffer_928.method300(191);
                    aBuffer_928.writeByte(k4 + k4 + 3);
                }
                aBuffer_928.method329(super.anIntArray33[5] != 1 ? 0 : 1, 0);
                aBuffer_928.method337(anInt1014, j6 + anInt1083);
                anInt1221 = anIntArray959[0];
                anInt1222 = anIntArray960[0];
                for (int i7 = 1; i7 < k4; i7++) {
                    i4--;
                    aBuffer_928.method328(anInt1203, anIntArray959[i4] - j6);
                    aBuffer_928.method327(493, anIntArray960[i4] - l6);
                }
                aBuffer_928.method336(false, l6 + anInt1084);
                return true;
            }
            return j1 != 1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("66113, " + flag + ", " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + i2 + ", " + j2 + ", " + k2 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method47(boolean flag) {
        try {
            if (anInt1269 > 1) {
                anInt1269--;
            }
            if (anInt856 > 0) {
                anInt856--;
            }
            for (int i = 0; i < 5; i++) {
                if (!parseIncomingPacket(985)) {
                    break;
                }
            }
            if (!aBoolean851) {
                return;
            }
            synchronized (aClass48_865.anObject787) {
                if (aBoolean860) {
                    if (super.anInt29 != 0 || aClass48_865.anInt791 >= 40) {
                        aBuffer_928.method300(250);
                        aBuffer_928.writeByte(0);
                        int k2 = aBuffer_928.position;
                        int k3 = 0;
                        for (int k4 = 0; k4 < aClass48_865.anInt791; k4++) {
                            if (k2 - aBuffer_928.position >= 240) {
                                break;
                            }
                            k3++;
                            int i5 = aClass48_865.anIntArray790[k4];
                            if (i5 < 0) {
                                i5 = 0;
                            } else if (i5 > 502) {
                                i5 = 502;
                            }
                            int l5 = aClass48_865.anIntArray788[k4];
                            if (l5 < 0) {
                                l5 = 0;
                            } else if (l5 > 764) {
                                l5 = 764;
                            }
                            int j6 = i5 * 765 + l5;
                            if (aClass48_865.anIntArray790[k4] == -1 && aClass48_865.anIntArray788[k4] == -1) {
                                l5 = -1;
                                i5 = -1;
                                j6 = 0x7ffff;
                            }
                            if (l5 == anInt884 && i5 == anInt885) {
                                if (anInt927 < 2047) {
                                    anInt927++;
                                }
                            } else {
                                int k6 = l5 - anInt884;
                                anInt884 = l5;
                                int l6 = i5 - anInt885;
                                anInt885 = i5;
                                if (anInt927 < 8 && k6 >= -32 && k6 <= 31 && l6 >= -32 && l6 <= 31) {
                                    k6 += 32;
                                    l6 += 32;
                                    aBuffer_928.writeShort((anInt927 << 12) + (k6 << 6) + l6);
                                    anInt927 = 0;
                                } else if (anInt927 < 8) {
                                    aBuffer_928.writeTriByte(0x800000 + (anInt927 << 19) + j6);
                                    anInt927 = 0;
                                } else {
                                    aBuffer_928.writeInt(0xc0000000 + (anInt927 << 19) + j6);
                                    anInt927 = 0;
                                }
                            }
                        }
                        aBuffer_928.method310(5469, aBuffer_928.position - k2);
                        if (k3 >= aClass48_865.anInt791) {
                            aClass48_865.anInt791 = 0;
                        } else {
                            aClass48_865.anInt791 -= k3;
                            for (int j5 = 0; j5 < aClass48_865.anInt791; j5++) {
                                aClass48_865.anIntArray788[j5] = aClass48_865.anIntArray788[j5 + k3];
                                aClass48_865.anIntArray790[j5] = aClass48_865.anIntArray790[j5 + k3];
                            }
                        }
                    }
                } else {
                    aClass48_865.anInt791 = 0;
                }
            }
            if (super.anInt29 != 0) {
                long l = (super.aLong32 - aLong1122) / 50L;
                if (l > 4095L) {
                    l = 4095L;
                }
                aLong1122 = super.aLong32;
                int l2 = super.anInt31;
                if (l2 < 0) {
                    l2 = 0;
                } else if (l2 > 502) {
                    l2 = 502;
                }
                int l3 = super.anInt30;
                if (l3 < 0) {
                    l3 = 0;
                } else if (l3 > 764) {
                    l3 = 764;
                }
                int l4 = l2 * 765 + l3;
                int k5 = 0;
                if (super.anInt29 == 2) {
                    k5 = 1;
                }
                int i6 = (int) l;
                aBuffer_928.method300(76);
                aBuffer_928.method345((i6 << 20) + (k5 << 19) + l4, 266);
            }
            if (anInt1022 > 0) {
                anInt1022--;
            }
            if (super.anIntArray33[1] == 1 || super.anIntArray33[2] == 1 || super.anIntArray33[3] == 1 || super.anIntArray33[4] == 1) {
                aBoolean1023 = true;
            }
            if (aBoolean1023 && anInt1022 <= 0) {
                anInt1022 = 20;
                aBoolean1023 = false;
                aBuffer_928.method300(79);
                aBuffer_928.method337(anInt1014, anInt921);
                aBuffer_928.writeShort(anInt922);
            }
            if (super.aBoolean20 && !aBoolean1080) {
                aBoolean1080 = true;
                aBuffer_928.method300(223);
                aBuffer_928.writeByte(1);
            }
            if (!super.aBoolean20 && aBoolean1080) {
                aBoolean1080 = false;
                aBuffer_928.method300(223);
                aBuffer_928.writeByte(0);
            }
            method22(925);
            method112((byte) 0);
            method108(0);
            anInt854++;
            if (anInt854 > 750) {
                method19(0);
            }
            method89(866);
            method125((byte) 9);
            method99(false);
            anInt1241++;
            if (anInt932 != 0) {
                anInt931 += 20;
                if (anInt931 >= 400) {
                    anInt932 = 0;
                }
            }
            if (anInt936 != 0) {
                anInt933++;
                if (anInt933 >= 15) {
                    if (anInt936 == 2) {
                        aBoolean1148 = true;
                    }
                    if (anInt936 == 3) {
                        aBoolean1169 = true;
                    }
                    anInt936 = 0;
                }
            }
            if (anInt1060 != 0) {
                anInt1183++;
                if (super.anInt23 > anInt1061 + 5 || super.anInt23 < anInt1061 - 5 || super.anInt24 > anInt1062 + 5 || super.anInt24 < anInt1062 - 5) {
                    aBoolean1070 = true;
                }
                if (super.anInt22 == 0) {
                    if (anInt1060 == 2) {
                        aBoolean1148 = true;
                    }
                    if (anInt1060 == 3) {
                        aBoolean1169 = true;
                    }
                    anInt1060 = 0;
                    if (aBoolean1070 && anInt1183 >= 5) {
                        anInt981 = -1;
                        method114(false);
                        if (anInt981 == anInt1058 && anInt980 != anInt1059) {
                            Widget widget = Widget.aWidgetArray533[anInt1058];
                            int j1 = 0;
                            if (anInt862 == 1 && widget.anInt577 == 206) {
                                j1 = 1;
                            }
                            if (widget.anIntArray576[anInt980] <= 0) {
                                j1 = 0;
                            }
                            if (widget.aBoolean578) {
                                int i3 = anInt1059;
                                int i4 = anInt980;
                                widget.anIntArray576[i4] = widget.anIntArray576[i3];
                                widget.anIntArray579[i4] = widget.anIntArray579[i3];
                                widget.anIntArray576[i3] = -1;
                                widget.anIntArray579[i3] = 0;
                            } else if (j1 == 1) {
                                int j3 = anInt1059;
                                for (int j4 = anInt980; j3 != j4; ) {
                                    if (j3 > j4) {
                                        widget.method502(j3, (byte) 0, j3 - 1);
                                        j3--;
                                    } else if (j3 < j4) {
                                        widget.method502(j3, (byte) 0, j3 + 1);
                                        j3++;
                                    }
                                }
                            } else {
                                widget.method502(anInt1059, (byte) 0, anInt980);
                            }
                            aBuffer_928.method300(13);
                            aBuffer_928.writeShort(anInt1059);
                            aBuffer_928.method336(false, anInt1058);
                            aBuffer_928.method328(anInt1203, j1);
                            aBuffer_928.method336(false, anInt980);
                        }
                    } else if ((anInt1275 == 1 || method17(anInt1167 - 1, 9)) && anInt1167 > 2) {
                        method109(true);
                    } else if (anInt1167 > 0) {
                        method27((byte) 66, anInt1167 - 1);
                    }
                    anInt933 = 10;
                    super.anInt29 = 0;
                }
            }
            anInt957++;
            if (anInt957 > 1806) {
                anInt957 = 0;
                aBuffer_928.method300(205);
                aBuffer_928.writeByte(0);
                int j = aBuffer_928.position;
                if ((int) (Math.random() * 2D) == 0) {
                    aBuffer_928.writeShort(53936);
                }
                if ((int) (Math.random() * 2D) == 0) {
                    aBuffer_928.writeByte(139);
                }
                aBuffer_928.writeShort(17372);
                aBuffer_928.writeByte((int) (Math.random() * 256D));
                aBuffer_928.writeShort((int) (Math.random() * 65536D));
                aBuffer_928.writeByte((int) (Math.random() * 256D));
                aBuffer_928.writeShort(48349);
                aBuffer_928.writeShort(1505);
                aBuffer_928.writeShort((int) (Math.random() * 65536D));
                aBuffer_928.writeShort((int) (Math.random() * 65536D));
                aBuffer_928.method310(5469, aBuffer_928.position - j);
            }
            if (Class10.anInt196 != -1) {
                int k = Class10.anInt196;
                int k1 = Class10.anInt197;
                boolean flag1 = method46(true, 0, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 0, 0, 0, k1, k, 0);
                Class10.anInt196 = -1;
                if (flag1) {
                    anInt929 = super.anInt30;
                    anInt930 = super.anInt31;
                    anInt932 = 1;
                    anInt931 = 0;
                }
            }
            if (super.anInt29 == 1 && aString1160 != null) {
                aString1160 = null;
                aBoolean1169 = true;
                super.anInt29 = 0;
            }
            method37(-633);
            method18(5);
            method57(5);
            method95(false);
            if (super.anInt22 == 1 || super.anInt29 == 1) {
                anInt1067++;
            }
            if (anInt1254 == 2) {
                method83(-506);
            }
            if (anInt1254 == 2 && aBoolean848) {
                method138((byte) 6);
            }
            for (int i1 = 0; i1 < 5; i1++) {
                anIntArray849[i1]++;
            }
            method110(false);
            anInt1144++;
            if (anInt1144 > 1077) {
                anInt1144 = 0;
                aBuffer_928.method300(177);
                aBuffer_928.writeByte(0);
                int l1 = aBuffer_928.position;
                aBuffer_928.writeShort(53207);
                aBuffer_928.writeShort(43454);
                if ((int) (Math.random() * 2D) == 0) {
                    aBuffer_928.writeByte(226);
                }
                aBuffer_928.writeShort((int) (Math.random() * 65536D));
                if ((int) (Math.random() * 2D) == 0) {
                    aBuffer_928.writeShort(39106);
                }
                aBuffer_928.writeByte((int) (Math.random() * 256D));
                aBuffer_928.writeByte(197);
                aBuffer_928.writeShort((int) (Math.random() * 65536D));
                aBuffer_928.writeByte((int) (Math.random() * 256D));
                aBuffer_928.writeByte(255);
                aBuffer_928.method310(5469, aBuffer_928.position - l1);
            }
            super.anInt21++;
            if (super.anInt21 > 4500) {
                anInt856 = 250;
                super.anInt21 -= 500;
                aBuffer_928.method300(121);
            }
            anInt1197++;
            if (anInt1197 > 500) {
                anInt1197 = 0;
                int i2 = (int) (Math.random() * 8D);
                if ((i2 & 1) == 1) {
                    anInt1075 += anInt1076;
                }
                if ((i2 & 2) == 2) {
                    anInt1257 += anInt1258;
                }
                if ((i2 & 4) == 4) {
                    anInt1161 += anInt1162;
                }
            }
            if (anInt1075 < -50) {
                anInt1076 = 2;
            }
            if (anInt1075 > 50) {
                anInt1076 = -2;
            }
            if (anInt1257 < -55) {
                anInt1258 = 2;
            }
            if (anInt1257 > 55) {
                anInt1258 = -2;
            }
            if (anInt1161 < -40) {
                anInt1162 = 1;
            }
            if (anInt1161 > 40) {
                anInt1162 = -1;
            }
            anInt1215++;
            if (!flag) {
                method6();
            }
            if (anInt1215 > 500) {
                anInt1215 = 0;
                int j2 = (int) (Math.random() * 8D);
                if ((j2 & 1) == 1) {
                    anInt1205 += anInt1206;
                }
                if ((j2 & 2) == 2) {
                    anInt1035 += anInt1036;
                }
            }
            if (anInt1205 < -60) {
                anInt1206 = 2;
            }
            if (anInt1205 > 60) {
                anInt1206 = -2;
            }
            if (anInt1035 < -20) {
                anInt1036 = 1;
            }
            if (anInt1035 > 10) {
                anInt1036 = -1;
            }
            anInt855++;
            if (anInt855 > 50) {
                aBuffer_928.method300(63);
            }
            try {
                if (gameConnection != null && aBuffer_928.position > 0) {
                    gameConnection.write(aBuffer_928.payload, 0, aBuffer_928.position);
                    aBuffer_928.position = 0;
                    anInt855 = 0;
                    return;
                }
            } catch (IOException _ex) {
                method19(0);
                return;
            } catch (Exception exception) {
                logout(anInt1268);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("16669, " + flag + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method48(int i) {
        try {
            if (i < 3 || i > 3) {
                anInt1268 = 24;
            }
            do {
                Class13_Sub1_Sub3 class13_sub1_sub3;
                do {
                    class13_sub1_sub3 = aClass2_Sub1_873.method171();
                    if (class13_sub1_sub3 == null) {
                        return;
                    }
                    if (class13_sub1_sub3.anInt1414 == 0) {
                        Class13_Sub1_Sub1_Sub4.method263(class13_sub1_sub3.aByteArray1412, true, class13_sub1_sub3.anInt1416);
                        if ((aClass2_Sub1_873.method154(true, class13_sub1_sub3.anInt1416) & 0x62) != 0) {
                            aBoolean1148 = true;
                            if (anInt1016 != -1) {
                                aBoolean1169 = true;
                            }
                        }
                    }
                    if (class13_sub1_sub3.anInt1414 == 1 && class13_sub1_sub3.aByteArray1412 != null) {
                        Class8.method186(-383, class13_sub1_sub3.aByteArray1412);
                    }
                    if (class13_sub1_sub3.anInt1414 == 2 && class13_sub1_sub3.anInt1416 == anInt1012 && class13_sub1_sub3.aByteArray1412 != null) {
                        method54(class13_sub1_sub3.aByteArray1412, aBoolean1013, 22075);
                    }
                    if (class13_sub1_sub3.anInt1414 == 3 && anInt1254 == 1) {
                        for (int j = 0; j < aByteArrayArray1146.length; j++) {
                            if (anIntArray938[j] == class13_sub1_sub3.anInt1416) {
                                aByteArrayArray1146[j] = class13_sub1_sub3.aByteArray1412;
                                if (class13_sub1_sub3.aByteArray1412 == null) {
                                    anIntArray938[j] = -1;
                                }
                                break;
                            }
                            if (anIntArray939[j] != class13_sub1_sub3.anInt1416) {
                                continue;
                            }
                            aByteArrayArray1179[j] = class13_sub1_sub3.aByteArray1412;
                            if (class13_sub1_sub3.aByteArray1412 == null) {
                                anIntArray939[j] = -1;
                            }
                            break;
                        }
                    }
                } while (class13_sub1_sub3.anInt1414 != 93 || !aClass2_Sub1_873.method155(5, class13_sub1_sub3.anInt1416));
                Class25.method468(aClass2_Sub1_873, 226, new Buffer(-351, class13_sub1_sub3.aByteArray1412));
            } while (true);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("84806, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method49(byte byte0, Widget widget) {
        try {
            if (byte0 != 1) {
                anInt919 = isaacCipher.method190();
            }
            int i = widget.anInt577;
            if (anInt1055 == 2) {
                if (i == 201) {
                    aBoolean1169 = true;
                    anInt1141 = 0;
                    aBoolean1017 = true;
                    aString1218 = "";
                    anInt943 = 1;
                    aString1196 = "Enter name of friend to add to list";
                }
                if (i == 202) {
                    aBoolean1169 = true;
                    anInt1141 = 0;
                    aBoolean1017 = true;
                    aString1218 = "";
                    anInt943 = 2;
                    aString1196 = "Enter name of friend to delete from list";
                }
            }
            if (i == 205) {
                anInt856 = 250;
                return true;
            }
            if (i == 501) {
                aBoolean1169 = true;
                anInt1141 = 0;
                aBoolean1017 = true;
                aString1218 = "";
                anInt943 = 4;
                aString1196 = "Enter name of player to add to list";
            }
            if (i == 502) {
                aBoolean1169 = true;
                anInt1141 = 0;
                aBoolean1017 = true;
                aString1218 = "";
                anInt943 = 5;
                aString1196 = "Enter name of player to delete from list";
            }
            if (i >= 300 && i <= 313) {
                int j = (i - 300) / 2;
                int i1 = i & 1;
                int l1 = anIntArray1011[j];
                if (l1 != -1) {
                    do {
                        if (i1 == 0 && --l1 < 0) {
                            l1 = Class4.anInt64 - 1;
                        }
                        if (i1 == 1 && ++l1 >= Class4.anInt64) {
                            l1 = 0;
                        }
                    } while (Class4.aClass4Array65[l1].aBoolean71 || Class4.aClass4Array65[l1].anInt66 != j + (aBoolean1068 ? 0 : 7));
                    anIntArray1011[j] = l1;
                    aBoolean1099 = true;
                }
            }
            if (i >= 314 && i <= 323) {
                int k = (i - 314) / 2;
                int j1 = i & 1;
                int i2 = anIntArray1190[k];
                if (j1 == 0 && --i2 < 0) {
                    i2 = anIntArrayArray829[k].length - 1;
                }
                if (j1 == 1 && ++i2 >= anIntArrayArray829[k].length) {
                    i2 = 0;
                }
                anIntArray1190[k] = i2;
                aBoolean1099 = true;
            }
            if (i == 324 && !aBoolean1068) {
                aBoolean1068 = true;
                method134(0);
            }
            if (i == 325 && aBoolean1068) {
                aBoolean1068 = false;
                method134(0);
            }
            if (i == 326) {
                aBuffer_928.method300(24);
                aBuffer_928.writeByte(aBoolean1068 ? 0 : 1);
                for (int l = 0; l < 7; l++) {
                    aBuffer_928.writeByte(anIntArray1011[l]);
                }
                for (int k1 = 0; k1 < 5; k1++) {
                    aBuffer_928.writeByte(anIntArray1190[k1]);
                }
                return true;
            }
            if (i == 613) {
                aBoolean1034 = !aBoolean1034;
            }
            if (i >= 601 && i <= 612) {
                method140(6);
                if (aString1230.length() > 0) {
                    aBuffer_928.method300(31);
                    aBuffer_928.writeLong(Class24.method446(aString1230));
                    aBuffer_928.writeByte(i - 601);
                    aBuffer_928.writeByte(aBoolean1034 ? 1 : 0);
                }
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("26595, " + byte0 + ", " + widget + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method50(int i) {
        try {
            anInt979++;
            method35((byte) 6, true);
            method73(anInt818, true);
            method35((byte) 6, false);
            method73(anInt818, false);
            method121(0);
            if (i < 9 || i > 9) {
                for (int j = 1; j > 0; j++) {
                }
            }
            method40(0);
            if (!aBoolean848) {
                int k = anInt921;
                if (anInt955 / 256 > k) {
                    k = anInt955 / 256;
                }
                if (aBooleanArray1117[4] && anIntArray1224[4] + 128 > k) {
                    k = anIntArray1224[4] + 128;
                }
                int i1 = anInt922 + anInt1161 & 0x7ff;
                method146(method80(anInt1166, 781, aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588, aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587) - 50, i1, anInt1020, anInt1021, 600 + k * 3, true, k);
            }
            int l;
            if (!aBoolean848) {
                l = method68(anInt996);
            } else {
                l = method69((byte) 1);
            }
            int j1 = anInt1004;
            int k1 = anInt1005;
            int l1 = anInt1006;
            int i2 = anInt1007;
            int j2 = anInt1008;
            for (int k2 = 0; k2 < 5; k2++) {
                if (aBooleanArray1117[k2]) {
                    int l2 = (int) ((Math.random() * (double) (anIntArray1195[k2] * 2 + 1) - (double) anIntArray1195[k2]) + Math.sin((double) anIntArray849[k2] * ((double) anIntArray1116[k2] / 100D)) * (double) anIntArray1224[k2]);
                    if (k2 == 0) {
                        anInt1004 += l2;
                    }
                    if (k2 == 1) {
                        anInt1005 += l2;
                    }
                    if (k2 == 2) {
                        anInt1006 += l2;
                    }
                    if (k2 == 3) {
                        anInt1008 = anInt1008 + l2 & 0x7ff;
                    }
                    if (k2 == 4) {
                        anInt1007 += l2;
                        if (anInt1007 < 128) {
                            anInt1007 = 128;
                        }
                        if (anInt1007 > 383) {
                            anInt1007 = 383;
                        }
                    }
                }
            }
            int i3 = Class13_Sub1_Sub4_Sub1.anInt1645;
            Class13_Sub1_Sub1_Sub4.aBoolean1554 = true;
            Class13_Sub1_Sub1_Sub4.anInt1557 = 0;
            Class13_Sub1_Sub1_Sub4.anInt1555 = super.anInt23 - 4;
            Class13_Sub1_Sub1_Sub4.anInt1556 = super.anInt24 - 4;
            Class13_Sub1_Sub4.method354(false);
            aClass10_1198.method233(l, anInt1006, anInt1008, -16656, anInt1007, anInt1004, anInt1005);
            aClass10_1198.method208(true);
            method94((byte) 6);
            method93(-894);
            method98(true, i3);
            method28(false);
            aClass31_1213.method491(super.aGraphics15, 4, false, 4);
            anInt1004 = j1;
            anInt1005 = k1;
            anInt1006 = l1;
            anInt1007 = i2;
            anInt1008 = j2;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("53438, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method51(byte byte0) {
        try {
            Graphics g = method11(736).getGraphics();
            if (byte0 == 2) {
                byte0 = 0;
            } else {
                aClass12ArrayArrayArray969 = null;
            }
            g.setColor(Color.black);
            g.fillRect(0, 0, 765, 503);
            method4(1, 9);
            if (aBoolean1234) {
                aBoolean1047 = false;
                g.setFont(new Font("Helvetica", 1, 16));
                g.setColor(Color.yellow);
                int i = 35;
                g.drawString("Sorry, an error has occured whilst loading RuneScape", 30, i);
                i += 50;
                g.setColor(Color.white);
                g.drawString("To fix this try the following (in order):", 30, i);
                i += 50;
                g.setColor(Color.white);
                g.setFont(new Font("Helvetica", 1, 12));
                g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, i);
                i += 30;
                g.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, i);
                i += 30;
                g.drawString("3: Try using a different game-world", 30, i);
                i += 30;
                g.drawString("4: Try rebooting your computer", 30, i);
                i += 30;
                g.drawString("5: Try selecting a different version of Java from the play-game menu", 30, i);
            }
            if (aBoolean842) {
                aBoolean1047 = false;
                g.setFont(new Font("Helvetica", 1, 20));
                g.setColor(Color.white);
                g.drawString("Error - unable to load game!", 50, 50);
                g.drawString("To play RuneScape make sure you play from", 50, 100);
                g.drawString("http://www.runescape.com", 50, 150);
            }
            if (aBoolean1239) {
                aBoolean1047 = false;
                g.setColor(Color.yellow);
                int j = 35;
                g.drawString("Error a copy of RuneScape already appears to be loaded", 30, j);
                j += 50;
                g.setColor(Color.white);
                g.drawString("To fix this try the following (in order):", 30, j);
                j += 50;
                g.setColor(Color.white);
                g.setFont(new Font("Helvetica", 1, 12));
                g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, j);
                j += 30;
                g.drawString("2: Try rebooting your computer, and reloading", 30, j);
                j += 30;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("21089, " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method52(int i, int j) {
        Class12 class12 = aClass12ArrayArrayArray969[anInt1166][i][j];
        if (class12 == null) {
            aClass10_1198.method215(anInt1166, i, j);
            return;
        }
        int k = 0xfa0a1f01;
        Object obj = null;
        for (Class13_Sub1_Sub1_Sub5 class13_sub1_sub1_sub5 = (Class13_Sub1_Sub1_Sub5) class12.method248(); class13_sub1_sub1_sub5 != null; class13_sub1_sub1_sub5 = (Class13_Sub1_Sub1_Sub5) class12.method250(-475)) {
            ItemDefinition itemDefinition = ItemDefinition.method505(class13_sub1_sub1_sub5.anInt1563);
            int l = itemDefinition.anInt637;
            if (itemDefinition.aBoolean662) {
                l *= class13_sub1_sub1_sub5.anInt1564 + 1;
            }
            if (l > k) {
                k = l;
                obj = class13_sub1_sub1_sub5;
            }
        }
        class12.method246(((Class13) (obj)), 5);
        Object obj1 = null;
        Object obj2 = null;
        for (Class13_Sub1_Sub1_Sub5 class13_sub1_sub1_sub5_1 = (Class13_Sub1_Sub1_Sub5) class12.method248(); class13_sub1_sub1_sub5_1 != null; class13_sub1_sub1_sub5_1 = (Class13_Sub1_Sub1_Sub5) class12.method250(-475)) {
            if (class13_sub1_sub1_sub5_1.anInt1563 != ((Class13_Sub1_Sub1_Sub5) (obj)).anInt1563 && obj1 == null) {
                obj1 = class13_sub1_sub1_sub5_1;
            }
            if (class13_sub1_sub1_sub5_1.anInt1563 != ((Class13_Sub1_Sub1_Sub5) (obj)).anInt1563 && class13_sub1_sub1_sub5_1.anInt1563 != ((Class13_Sub1_Sub1_Sub5) (obj1)).anInt1563 && obj2 == null) {
                obj2 = class13_sub1_sub1_sub5_1;
            }
        }
        int i1 = i + (j << 7) + 0x60000000;
        aClass10_1198.method201(((Class13_Sub1_Sub1) (obj2)), j, i, method80(anInt1166, 781, j * 128 + 64, i * 128 + 64), ((Class13_Sub1_Sub1) (obj1)), anInt1166, ((Class13_Sub1_Sub1) (obj)), i1, false);
    }

    public void method13(boolean flag, String s, int i) {
        try {
            anInt1053 = i;
            aString827 = s;
            method16(35437);
            if (aClass1_991 == null) {
                super.method13(false, s, i);
                return;
            }
            aClass31_1247.method490(false);
            if (flag) {
                return;
            }
            char c = '\u0168';
            char c1 = '\310';
            byte byte0 = 20;
            aClass13_Sub1_Sub4_Sub2_893.method381(c / 2, 0xffffff, 6, c1 / 2 - 26 - byte0, "RuneScape is loading - please wait...");
            int j = c1 / 2 - 18 - byte0;
            Class13_Sub1_Sub4.method357((byte) 4, j, c / 2 - 152, 34, 0x8c1111, 304);
            Class13_Sub1_Sub4.method357((byte) 4, j + 1, c / 2 - 151, 32, 0, 302);
            Class13_Sub1_Sub4.method356(false, c / 2 - 150, j + 2, 0x8c1111, i * 3, 30);
            Class13_Sub1_Sub4.method356(false, (c / 2 - 150) + i * 3, j + 2, 0, 300 - i * 3, 30);
            aClass13_Sub1_Sub4_Sub2_893.method381(c / 2, 0xffffff, 6, (c1 / 2 + 5) - byte0, s);
            aClass31_1247.method491(super.aGraphics15, 171, false, 202);
            if (aBoolean1216) {
                aBoolean1216 = false;
                if (!aBoolean1047) {
                    aClass31_1248.method491(super.aGraphics15, 0, false, 0);
                    aClass31_1249.method491(super.aGraphics15, 0, false, 637);
                }
                aClass31_1245.method491(super.aGraphics15, 0, false, 128);
                aClass31_1246.method491(super.aGraphics15, 371, false, 202);
                aClass31_1250.method491(super.aGraphics15, 265, false, 0);
                aClass31_1251.method491(super.aGraphics15, 265, false, 562);
                aClass31_1252.method491(super.aGraphics15, 171, false, 128);
                aClass31_1253.method491(super.aGraphics15, 171, false, 562);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("12819, " + flag + ", " + s + ", " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method53(int i) {
        try {
            System.out.println("============");
            System.out.println("flame-cycle:" + anInt940);
            if (aClass2_Sub1_873 != null) {
                System.out.println("Od-cycle:" + aClass2_Sub1_873.anInt1326);
            }
            System.out.println("loop-cycle:" + pulseCycle);
            while (i >= 0) {
                aClass12ArrayArrayArray969 = null;
            }
            System.out.println("draw-cycle:" + anInt1202);
            System.out.println("ptype:" + opcode);
            System.out.println("psize:" + packetSize);
            if (gameConnection != null) {
                gameConnection.printDebug();
            }
            super.aBoolean12 = true;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("68164, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Component method11(int i) {
        try {
            if (i <= 0) {
                anInt818 = isaacCipher.method190();
            }
            if (Signlink.mainapp != null) {
                return Signlink.mainapp;
            }
            if (super.aFrame_Sub1_18 != null) {
                return super.aFrame_Sub1_18;
            } else {
                return this;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("95210, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method54(byte[] abyte0, boolean flag, int i) {
        try {
            Signlink.midifade = flag ? 1 : 0;
            Signlink.midisave(abyte0, abyte0.length);
            if (i != 22075) {
                aClass12ArrayArrayArray969 = null;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("71230, " + abyte0 + ", " + flag + ", " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public URL getCodeBase() {
        if (Signlink.mainapp != null) {
            return Signlink.mainapp.getCodeBase();
        }
        try {
            if (super.aFrame_Sub1_18 != null) {
                return new URL("http://127.0.0.1:" + (80 + anInt952));
            }
        } catch (Exception _ex) {
        }
        return super.getCodeBase();
    }

    public void method55(int i) {
        try {
            aBoolean866 = true;
            if (i != 34249) {
                anInt1074 = 200;
            }
            try {
                long l = System.currentTimeMillis();
                int j = 0;
                int k = 20;
                while (aBoolean1047) {
                    anInt940++;
                    method25(false);
                    method25(false);
                    method97(-190);
                    if (++j > 10) {
                        long l1 = System.currentTimeMillis();
                        int i1 = (int) (l1 - l) / 10 - k;
                        k = 40 - i1;
                        if (k < 5) {
                            k = 5;
                        }
                        j = 0;
                        l = l1;
                    }
                    try {
                        Thread.sleep(k);
                    } catch (Exception _ex) {
                    }
                }
            } catch (Exception _ex) {
            }
            aBoolean866 = false;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("70914, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method56(String username, String password, boolean flag) {
        Signlink.errorname = username;
        try {
            if (!flag) {
                aString1174 = "";
                aString1175 = "Connecting to server...";
                method20(true, true);
            }
            gameConnection = new BufferedConnection(method135(43594 + anInt952), 681, this);
            long l = Class24.method446(username);
            int i = (int) (l >> 16 & 31L);
            aBuffer_928.position = 0;
            aBuffer_928.writeByte(14);
            aBuffer_928.writeByte(i);
            gameConnection.write(aBuffer_928.payload, 0, 2);
            for (int j = 0; j < 8; j++) {
                gameConnection.read();
            }
            int responseCode = gameConnection.read();
            int initialResponseCode = responseCode;
            if (responseCode == 0) {
                gameConnection.read(buffer.payload, 0, 8);

                buffer.position = 0;
                serverSeed = buffer.readLong(0);
                int[] seed = new int[4];

                seed[0] = (int) (Math.random() * 99999999D);
                seed[1] = (int) (Math.random() * 99999999D);
                seed[2] = (int) (serverSeed >> 32);
                seed[3] = (int) serverSeed;

                aBuffer_928.position = 0;

                aBuffer_928.writeByte(10);
                aBuffer_928.writeInt(seed[0]);
                aBuffer_928.writeInt(seed[1]);
                aBuffer_928.writeInt(seed[2]);
                aBuffer_928.writeInt(seed[3]);
                aBuffer_928.writeInt(Signlink.uid);
                aBuffer_928.writeString(username);
                aBuffer_928.writeString(password);
                aBuffer_928.encrypt(rsaKey, rsaModulus);
                outBuffer.position = 0;
                if (flag) {
                    outBuffer.writeByte(18);
                } else {
                    outBuffer.writeByte(16);
                }
                outBuffer.writeByte(aBuffer_928.position + 36 + 1 + 1 + 2);
                outBuffer.writeByte(255);
                outBuffer.writeShort(319);
                outBuffer.writeByte(aBoolean954 ? 1 : 0);
                for (int l1 = 0; l1 < 9; l1++) {
                    outBuffer.writeInt(anIntArray1277[l1]);
                }
                outBuffer.method309(aBuffer_928.position, 0, anInt1052, aBuffer_928.payload);
                aBuffer_928.isaacCipher = new ISAACCipher(0, seed);
                for (int j2 = 0; j2 < 4; j2++) {
                    seed[j2] += 50;
                }
                isaacCipher = new ISAACCipher(0, seed);
                gameConnection.write(outBuffer.payload, 0, outBuffer.position);
                responseCode = gameConnection.read();
            }
            if (responseCode == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception _ex) {
                }
                method56(username, password, flag);
                return;
            }
            if (responseCode == 2) {
                anInt1037 = gameConnection.read();
                aBoolean860 = gameConnection.read() == 1;
                aLong1122 = 0L;
                anInt927 = 0;
                aClass48_865.anInt791 = 0;
                super.aBoolean20 = true;
                aBoolean1080 = true;
                aBoolean851 = true;
                aBuffer_928.position = 0;
                buffer.position = 0;
                opcode = -1;
                anInt888 = -1;
                anInt889 = -1;
                anInt890 = -1;
                packetSize = 0;
                anInt854 = 0;
                anInt1269 = 0;
                anInt856 = 0;
                anInt1227 = 0;
                anInt1167 = 0;
                aBoolean989 = false;
                super.anInt21 = 0;
                for (int j1 = 0; j1 < 100; j1++) {
                    aStringArray841[j1] = null;
                }
                anInt1025 = 0;
                anInt973 = 0;
                anInt1254 = 0;
                anInt1057 = 0;
                anInt1075 = (int) (Math.random() * 100D) - 50;
                anInt1257 = (int) (Math.random() * 110D) - 55;
                anInt1161 = (int) (Math.random() * 80D) - 40;
                anInt1205 = (int) (Math.random() * 120D) - 60;
                anInt1035 = (int) (Math.random() * 30D) - 20;
                anInt922 = (int) (Math.random() * 20D) - 10 & 0x7ff;
                anInt1094 = 0;
                anInt1191 = -1;
                anInt1221 = 0;
                anInt1222 = 0;
                anInt899 = 0;
                anInt1284 = 0;
                for (int i2 = 0; i2 < anInt896; i2++) {
                    players[i2] = null;
                    aBufferArray903[i2] = null;
                }
                for (int k2 = 0; k2 < 16384; k2++) {
                    aClass13_Sub1_Sub1_Sub6_Sub2Array1283[k2] = null;
                }
                aClass13_Sub1_Sub1_Sub6_Sub1_997 = players[anInt897] = new Class13_Sub1_Sub1_Sub6_Sub1();
                aClass12_1199.method252();
                aClass12_982.method252();
                for (int l2 = 0; l2 < 4; l2++) {
                    for (int i3 = 0; i3 < 104; i3++) {
                        for (int k3 = 0; k3 < 104; k3++) {
                            aClass12ArrayArrayArray969[l2][i3][k3] = null;
                        }
                    }
                }
                aClass12_1152 = new Class12(36944);
                anInt1055 = 0;
                anInt1054 = 0;
                anInt1276 = -1;
                anInt1016 = -1;
                anInt1217 = -1;
                anInt874 = -1;
                anInt1143 = -1;
                aBoolean1048 = false;
                anInt864 = 3;
                anInt1141 = 0;
                aBoolean989 = false;
                aBoolean1017 = false;
                aString1160 = null;
                anInt887 = 0;
                anInt1087 = -1;
                aBoolean1068 = true;
                method134(0);
                for (int j3 = 0; j3 < 5; j3++) {
                    anIntArray1190[j3] = 0;
                }
                for (int l3 = 0; l3 < 5; l3++) {
                    aStringArray1031[l3] = null;
                    aBooleanArray1032[l3] = false;
                }
                anInt1156 = 0;
                anInt942 = 0;
                anInt1077 = 0;
                anInt1142 = 0;
                anInt998 = 0;
                anInt958 = 0;
                anInt1281 = 0;
                anInt963 = 0;
                anInt1158 = 0;
                anInt1272 = 0;
                method90(-251);
                return;
            }
            if (responseCode == 3) {
                aString1174 = "";
                aString1175 = "Invalid username or password.";
                return;
            }
            if (responseCode == 4) {
                aString1174 = "Your account has been disabled.";
                aString1175 = "Please check your message-centre for details.";
                return;
            }
            if (responseCode == 5) {
                aString1174 = "Your account is already logged in.";
                aString1175 = "Try again in 60 secs...";
                return;
            }
            if (responseCode == 6) {
                aString1174 = "RuneScape has been updated!";
                aString1175 = "Please reload this page.";
                return;
            }
            if (responseCode == 7) {
                aString1174 = "This world is full.";
                aString1175 = "Please use a different world.";
                return;
            }
            if (responseCode == 8) {
                aString1174 = "Unable to connect.";
                aString1175 = "Login server offline.";
                return;
            }
            if (responseCode == 9) {
                aString1174 = "Login limit exceeded.";
                aString1175 = "Too many connections from your address.";
                return;
            }
            if (responseCode == 10) {
                aString1174 = "Unable to connect.";
                aString1175 = "Bad session id.";
                return;
            }
            if (responseCode == 11) {
                aString1175 = "Login server rejected session.";
                aString1175 = "Please try again.";
                return;
            }
            if (responseCode == 12) {
                aString1174 = "You need a members account to login to this world.";
                aString1175 = "Please subscribe, or use a different world.";
                return;
            }
            if (responseCode == 13) {
                aString1174 = "Could not complete login.";
                aString1175 = "Please try using a different world.";
                return;
            }
            if (responseCode == 14) {
                aString1174 = "The server is being updated.";
                aString1175 = "Please wait 1 minute and try again.";
                return;
            }
            if (responseCode == 15) {
                aBoolean851 = true;
                aBuffer_928.position = 0;
                buffer.position = 0;
                opcode = -1;
                anInt888 = -1;
                anInt889 = -1;
                anInt890 = -1;
                packetSize = 0;
                anInt854 = 0;
                anInt1269 = 0;
                anInt1167 = 0;
                aBoolean989 = false;
                aLong1243 = System.currentTimeMillis();
                return;
            }
            if (responseCode == 16) {
                aString1174 = "Login attempts exceeded.";
                aString1175 = "Please wait 1 minute and try again.";
                return;
            }
            if (responseCode == 17) {
                aString1174 = "You are standing in a members-only area.";
                aString1175 = "To play on this world move to a free area first";
                return;
            }
            if (responseCode == 20) {
                aString1174 = "Invalid loginserver requested";
                aString1175 = "Please try using a different world.";
                return;
            }
            if (responseCode == 21) {
                int k1 = gameConnection.read();
                for (k1 += 3; k1 >= 0; k1--) {
                    aString1174 = "You have only just left another world";
                    aString1175 = "Your profile will be transferred in: " + k1;
                    method20(true, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception _ex) {
                    }
                }
                method56(username, password, flag);
                return;
            }
            if (responseCode == -1) {
                if (initialResponseCode == 0) {
                    if (anInt995 < 2) {
                        try {
                            Thread.sleep(2000L);
                        } catch (Exception _ex) {
                        }
                        anInt995++;
                        method56(username, password, flag);
                        return;
                    } else {
                        aString1174 = "No response from loginserver";
                        aString1175 = "Please wait 1 minute and try again.";
                        return;
                    }
                } else {
                    aString1174 = "No response from server";
                    aString1175 = "Please try using a different world.";
                    return;
                }
            } else {
                System.out.println("response:" + responseCode);
                aString1174 = "Unexpected server response";
                aString1175 = "Please try using a different world.";
                return;
            }
        } catch (IOException _ex) {
            aString1174 = "";
        }
        aString1175 = "Error connecting to server.";
    }

    public void method57(int i) {
        try {
            if (i < 5 || i > 5) {
                opcode = buffer.readUnsignedByte();
            }
            if (super.anInt29 == 1) {
                if (super.anInt30 >= 539 && super.anInt30 <= 573 && super.anInt31 >= 169 && super.anInt31 < 205 && anIntArray1018[0] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 0;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 569 && super.anInt30 <= 599 && super.anInt31 >= 168 && super.anInt31 < 205 && anIntArray1018[1] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 1;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 597 && super.anInt30 <= 627 && super.anInt31 >= 168 && super.anInt31 < 205 && anIntArray1018[2] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 2;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 625 && super.anInt30 <= 669 && super.anInt31 >= 168 && super.anInt31 < 203 && anIntArray1018[3] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 3;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 666 && super.anInt30 <= 696 && super.anInt31 >= 168 && super.anInt31 < 205 && anIntArray1018[4] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 4;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 694 && super.anInt30 <= 724 && super.anInt31 >= 168 && super.anInt31 < 205 && anIntArray1018[5] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 5;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 722 && super.anInt30 <= 756 && super.anInt31 >= 169 && super.anInt31 < 205 && anIntArray1018[6] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 6;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 540 && super.anInt30 <= 574 && super.anInt31 >= 466 && super.anInt31 < 502 && anIntArray1018[7] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 7;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 572 && super.anInt30 <= 602 && super.anInt31 >= 466 && super.anInt31 < 503 && anIntArray1018[8] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 8;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 599 && super.anInt30 <= 629 && super.anInt31 >= 466 && super.anInt31 < 503 && anIntArray1018[9] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 9;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 627 && super.anInt30 <= 671 && super.anInt31 >= 467 && super.anInt31 < 502 && anIntArray1018[10] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 10;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 669 && super.anInt30 <= 699 && super.anInt31 >= 466 && super.anInt31 < 503 && anIntArray1018[11] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 11;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 696 && super.anInt30 <= 726 && super.anInt31 >= 466 && super.anInt31 < 503 && anIntArray1018[12] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 12;
                    aBoolean1286 = true;
                }
                if (super.anInt30 >= 724 && super.anInt30 <= 758 && super.anInt31 >= 466 && super.anInt31 < 502 && anIntArray1018[13] != -1) {
                    aBoolean1148 = true;
                    anInt864 = 13;
                    aBoolean1286 = true;
                    return;
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("28800, " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method59(int i, int j, boolean flag) {
        try {
            Signlink.midivol = j;
            packetSize += i;
            if (flag) {
                Signlink.midi = "voladjust";
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("12395, " + i + ", " + j + ", " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method60(int i) {
        try {
            int j = anInt821;
            int k = anInt822;
            int l = anInt823;
            int i1 = anInt824;
            int j1 = 0x5d5447;
            if (i != 45234) {
                method6();
            }
            Class13_Sub1_Sub4.method356(false, j, k, j1, l, i1);
            Class13_Sub1_Sub4.method356(false, j + 1, k + 1, 0, l - 2, 16);
            Class13_Sub1_Sub4.method357((byte) 4, k + 18, j + 1, i1 - 19, 0, l - 2);
            aClass13_Sub1_Sub4_Sub2_893.method385((byte) -96, "Choose Option", j1, j + 3, k + 14);
            int k1 = super.anInt23;
            int l1 = super.anInt24;
            if (anInt820 == 0) {
                k1 -= 4;
                l1 -= 4;
            }
            if (anInt820 == 1) {
                k1 -= 553;
                l1 -= 205;
            }
            if (anInt820 == 2) {
                k1 -= 17;
                l1 -= 357;
            }
            for (int i2 = 0; i2 < anInt1167; i2++) {
                int j2 = k + 31 + (anInt1167 - 1 - i2) * 15;
                int k2 = 0xffffff;
                if (k1 > j && k1 < j + l && l1 > j2 - 13 && l1 < j2 + 3) {
                    k2 = 0xffff00;
                }
                aClass13_Sub1_Sub4_Sub2_893.method389(true, j + 3, (byte) 8, j2, k2, aStringArray961[i2]);
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("95982, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method61(boolean flag) {
        try {
            aClass31_1214.method490(false);
            Class13_Sub1_Sub4_Sub1.anIntArray1636 = anIntArray857;
            aClass13_Sub1_Sub4_Sub3_1210.method401(0, (byte) 83, 0);
            if (aBoolean1017) {
                aClass13_Sub1_Sub4_Sub2_893.method381(239, 0, 6, 40, aString1196);
                aClass13_Sub1_Sub4_Sub2_893.method381(239, 128, 6, 60, aString1218 + "*");
            } else if (anInt1141 == 1) {
                aClass13_Sub1_Sub4_Sub2_893.method381(239, 0, 6, 40, "Enter amount:");
                aClass13_Sub1_Sub4_Sub2_893.method381(239, 128, 6, 60, aString964 + "*");
            } else if (anInt1141 == 2) {
                aClass13_Sub1_Sub4_Sub2_893.method381(239, 0, 6, 40, "Enter name:");
                aClass13_Sub1_Sub4_Sub2_893.method381(239, 128, 6, 60, aString964 + "*");
            } else if (aString1160 != null) {
                aClass13_Sub1_Sub4_Sub2_893.method381(239, 0, 6, 40, aString1160);
                aClass13_Sub1_Sub4_Sub2_893.method381(239, 128, 6, 60, "Click to continue");
            } else if (anInt1016 != -1) {
                method67(Widget.aWidgetArray533[anInt1016], 0, 0, 0, 988);
            } else if (anInt1276 != -1) {
                method67(Widget.aWidgetArray533[anInt1276], 0, 0, 0, 988);
            } else {
                Class13_Sub1_Sub4_Sub2 class13_sub1_sub4_sub2 = aClass13_Sub1_Sub4_Sub2_892;
                int i = 0;
                Class13_Sub1_Sub4.method353(463, (byte) -12, 77, 0, 0);
                for (int j = 0; j < 100; j++) {
                    if (aStringArray841[j] != null) {
                        int k = anIntArray839[j];
                        int l = (70 - i * 14) + anInt1019;
                        String s1 = aStringArray840[j];
                        byte byte0 = 0;
                        if (s1 != null && s1.startsWith("@cr1@")) {
                            s1 = s1.substring(5);
                            byte0 = 1;
                        }
                        if (s1 != null && s1.startsWith("@cr2@")) {
                            s1 = s1.substring(5);
                            byte0 = 2;
                        }
                        if (k == 0) {
                            if (l > 0 && l < 110) {
                                class13_sub1_sub4_sub2.method385((byte) -96, aStringArray841[j], 0, 4, l);
                            }
                            i++;
                        }
                        if ((k == 1 || k == 2) && (k == 1 || anInt1159 == 0 || anInt1159 == 1 && method71(s1, 771))) {
                            if (l > 0 && l < 110) {
                                int i1 = 4;
                                if (byte0 == 1) {
                                    aClass13_Sub1_Sub4_Sub3Array838[0].method401(l - 12, (byte) 83, i1);
                                    i1 += 14;
                                }
                                if (byte0 == 2) {
                                    aClass13_Sub1_Sub4_Sub3Array838[1].method401(l - 12, (byte) 83, i1);
                                    i1 += 14;
                                }
                                class13_sub1_sub4_sub2.method385((byte) -96, s1 + ":", 0, i1, l);
                                i1 += class13_sub1_sub4_sub2.method383(3, s1) + 8;
                                class13_sub1_sub4_sub2.method385((byte) -96, aStringArray841[j], 255, i1, l);
                            }
                            i++;
                        }
                        if ((k == 3 || k == 7) && anInt920 == 0 && (k == 7 || anInt1129 == 0 || anInt1129 == 1 && method71(s1, 771))) {
                            if (l > 0 && l < 110) {
                                int j1 = 4;
                                class13_sub1_sub4_sub2.method385((byte) -96, "From", 0, j1, l);
                                j1 += class13_sub1_sub4_sub2.method383(3, "From ");
                                if (byte0 == 1) {
                                    aClass13_Sub1_Sub4_Sub3Array838[0].method401(l - 12, (byte) 83, j1);
                                    j1 += 14;
                                }
                                if (byte0 == 2) {
                                    aClass13_Sub1_Sub4_Sub3Array838[1].method401(l - 12, (byte) 83, j1);
                                    j1 += 14;
                                }
                                class13_sub1_sub4_sub2.method385((byte) -96, s1 + ":", 0, j1, l);
                                j1 += class13_sub1_sub4_sub2.method383(3, s1) + 8;
                                class13_sub1_sub4_sub2.method385((byte) -96, aStringArray841[j], 0x800000, j1, l);
                            }
                            i++;
                        }
                        if (k == 4 && (anInt1290 == 0 || anInt1290 == 1 && method71(s1, 771))) {
                            if (l > 0 && l < 110) {
                                class13_sub1_sub4_sub2.method385((byte) -96, s1 + " " + aStringArray841[j], 0x800080, 4, l);
                            }
                            i++;
                        }
                        if (k == 5 && anInt920 == 0 && anInt1129 < 2) {
                            if (l > 0 && l < 110) {
                                class13_sub1_sub4_sub2.method385((byte) -96, aStringArray841[j], 0x800000, 4, l);
                            }
                            i++;
                        }
                        if (k == 6 && anInt920 == 0 && anInt1129 < 2) {
                            if (l > 0 && l < 110) {
                                class13_sub1_sub4_sub2.method385((byte) -96, "To " + s1 + ":", 0, 4, l);
                                class13_sub1_sub4_sub2.method385((byte) -96, aStringArray841[j], 0x800000, 12 + class13_sub1_sub4_sub2.method383(3, "To " + s1), l);
                            }
                            i++;
                        }
                        if (k == 8 && (anInt1290 == 0 || anInt1290 == 1 && method71(s1, 771))) {
                            if (l > 0 && l < 110) {
                                class13_sub1_sub4_sub2.method385((byte) -96, s1 + " " + aStringArray841[j], 0x7e3200, 4, l);
                            }
                            i++;
                        }
                    }
                }
                Class13_Sub1_Sub4.method352(4);
                anInt886 = i * 14 + 7;
                if (anInt886 < 78) {
                    anInt886 = 78;
                }
                method36((byte) 2, 77, anInt886, anInt886 - anInt1019 - 77, 0, 463);
                String s;
                if (aClass13_Sub1_Sub1_Sub6_Sub1_997 != null && aClass13_Sub1_Sub1_Sub6_Sub1_997.aString1689 != null) {
                    s = aClass13_Sub1_Sub1_Sub6_Sub1_997.aString1689;
                } else {
                    s = Class24.method450(username, 0);
                }
                class13_sub1_sub4_sub2.method385((byte) -96, s + ":", 0, 4, 90);
                class13_sub1_sub4_sub2.method385((byte) -96, aString1280 + "*", 255, 6 + class13_sub1_sub4_sub2.method383(3, s + ": "), 90);
                Class13_Sub1_Sub4.method359((byte) -40, 0, 0, 77, 479);
            }
            if (aBoolean989 && anInt820 == 2) {
                method60(45234);
            }
            aClass31_1214.method491(super.aGraphics15, 357, false, 17);
            aClass31_1213.method490(false);
            if (flag) {
                opcode = buffer.readUnsignedByte();
            }
            Class13_Sub1_Sub4_Sub1.anIntArray1636 = anIntArray859;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("68585, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method62(byte byte0) {
        try {
            aClass31_1211.method490(false);
            Class13_Sub1_Sub4_Sub1.anIntArray1636 = anIntArray858;
            aClass13_Sub1_Sub4_Sub3_1208.method401(0, (byte) 83, 0);
            if (anInt874 != -1) {
                method67(Widget.aWidgetArray533[anInt874], 0, 0, 0, 988);
            } else if (anIntArray1018[anInt864] != -1) {
                method67(Widget.aWidgetArray533[anIntArray1018[anInt864]], 0, 0, 0, 988);
            }
            if (aBoolean989 && anInt820 == 1) {
                method60(45234);
            }
            aClass31_1211.method491(super.aGraphics15, 205, false, 553);
            aClass31_1213.method490(false);
            Class13_Sub1_Sub4_Sub1.anIntArray1636 = anIntArray859;
            if (byte0 == 6) {
                byte0 = 0;
                return;
            } else {
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("96378, " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method63(int i, int j) {
        try {
            int[] ai = aClass13_Sub1_Sub4_Sub4_1223.anIntArray1680;
            int k = ai.length;
            for (int l = 0; l < k; l++) {
                ai[l] = 0;
            }
            for (int i1 = 1; i1 < 103; i1++) {
                int j1 = 24628 + (103 - i1) * 512 * 4;
                for (int l1 = 1; l1 < 103; l1++) {
                    if ((aByteArrayArrayArray1164[j][l1][i1] & 0x18) == 0) {
                        aClass10_1198.method229(ai, j1, 512, j, l1, i1);
                    }
                    if (j < 3 && (aByteArrayArrayArray1164[j + 1][l1][i1] & 8) != 0) {
                        aClass10_1198.method229(ai, j1, 512, j + 1, l1, i1);
                    }
                    j1 += 4;
                }
            }
            int k1 = ((238 + (int) (Math.random() * 20D)) - 10 << 16) + ((238 + (int) (Math.random() * 20D)) - 10 << 8) + ((238 + (int) (Math.random() * 20D)) - 10);
            if (i != 8) {
                method6();
            }
            int i2 = (238 + (int) (Math.random() * 20D)) - 10 << 16;
            aClass13_Sub1_Sub4_Sub4_1223.method403(false);
            for (int j2 = 1; j2 < 103; j2++) {
                for (int k2 = 1; k2 < 103; k2++) {
                    if ((aByteArrayArrayArray1164[j][k2][j2] & 0x18) == 0) {
                        method14(k1, 3, j, k2, j2, i2);
                    }
                    if (j < 3 && (aByteArrayArrayArray1164[j + 1][k2][j2] & 8) != 0) {
                        method14(k1, 3, j + 1, k2, j2, i2);
                    }
                }
            }
            aClass31_1213.method490(false);
            anInt830 = 0;
            for (int l2 = 0; l2 < 104; l2++) {
                for (int i3 = 0; i3 < 104; i3++) {
                    int k3 = aClass10_1198.method223(anInt1166, l2, i3);
                    if (k3 != 0) {
                        k3 = k3 >> 14 & 0x7fff;
                        int l3 = Class14.method418(k3).anInt250;
                        if (l3 >= 0) {
                            int i4 = l2;
                            int j4 = i3;
                            if (l3 != 22 && l3 != 29 && l3 != 34 && l3 != 36 && l3 != 46 && l3 != 47 && l3 != 48) {
                                byte byte0 = 104;
                                byte byte1 = 104;
                                int[][] ai1 = aClass39Array947[anInt1166].anIntArrayArray682;
                                for (int k4 = 0; k4 < 10; k4++) {
                                    int l4 = (int) (Math.random() * 4D);
                                    if (l4 == 0 && i4 > 0 && i4 > l2 - 3 && (ai1[i4 - 1][j4] & 0x1280108) == 0) {
                                        i4--;
                                    }
                                    if (l4 == 1 && i4 < byte0 - 1 && i4 < l2 + 3 && (ai1[i4 + 1][j4] & 0x1280180) == 0) {
                                        i4++;
                                    }
                                    if (l4 == 2 && j4 > 0 && j4 > i3 - 3 && (ai1[i4][j4 - 1] & 0x1280102) == 0) {
                                        j4--;
                                    }
                                    if (l4 == 3 && j4 < byte1 - 1 && j4 < i3 + 3 && (ai1[i4][j4 + 1] & 0x1280120) == 0) {
                                        j4++;
                                    }
                                }
                            }
                            aClass13_Sub1_Sub4_Sub4Array1145[anInt830] = aClass13_Sub1_Sub4_Sub4Array1189[l3];
                            anIntArray831[anInt830] = i4;
                            anIntArray832[anInt830] = j4;
                            anInt830++;
                        }
                    }
                }
            }
            anInt916++;
            if (anInt916 > 1069) {
                anInt916 = 0;
                aBuffer_928.method300(108);
                aBuffer_928.writeByte(0);
                int j3 = aBuffer_928.position;
                if ((int) (Math.random() * 2D) == 0) {
                    aBuffer_928.writeByte(233);
                }
                if ((int) (Math.random() * 2D) == 0) {
                    aBuffer_928.writeShort(28677);
                }
                if ((int) (Math.random() * 2D) == 0) {
                    aBuffer_928.writeByte(170);
                }
                if ((int) (Math.random() * 2D) == 0) {
                    aBuffer_928.writeShort(4922);
                }
                aBuffer_928.writeByte((int) (Math.random() * 256D));
                if ((int) (Math.random() * 2D) == 0) {
                    aBuffer_928.writeByte(109);
                }
                aBuffer_928.writeShort(62857);
                aBuffer_928.writeByte((int) (Math.random() * 256D));
                aBuffer_928.writeByte(20);
                aBuffer_928.writeShort((int) (Math.random() * 65536D));
                aBuffer_928.method310(5469, aBuffer_928.position - j3);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("20726, " + i + ", " + j + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method12(Runnable runnable, int i) {
        if (i > 10) {
            i = 10;
        }
        if (Signlink.mainapp != null) {
            Signlink.startthread(runnable, i);
            return;
        } else {
            super.method12(runnable, i);
            return;
        }
    }

    public void method64(boolean flag, int i) {
        try {
            if (!flag) {
                aBuffer_928.writeByte(125);
            }
            int j = Class22.aClass22Array365[i].anInt373;
            if (j == 0) {
                return;
            }
            int k = anIntArray1149[i];
            if (j == 1) {
                if (k == 1) {
                    Class13_Sub1_Sub4_Sub1.method372(0.90000000000000002D, (byte) 7);
                }
                if (k == 2) {
                    Class13_Sub1_Sub4_Sub1.method372(0.80000000000000004D, (byte) 7);
                }
                if (k == 3) {
                    Class13_Sub1_Sub4_Sub1.method372(0.69999999999999996D, (byte) 7);
                }
                if (k == 4) {
                    Class13_Sub1_Sub4_Sub1.method372(0.59999999999999998D, (byte) 7);
                }
                ItemDefinition.aClass3_661.method174();
                aBoolean1216 = true;
            }
            if (j == 3) {
                boolean flag1 = aBoolean826;
                if (k == 0) {
                    method59(0, 0, aBoolean826);
                    aBoolean826 = true;
                }
                if (k == 1) {
                    method59(0, -400, aBoolean826);
                    aBoolean826 = true;
                }
                if (k == 2) {
                    method59(0, -800, aBoolean826);
                    aBoolean826 = true;
                }
                if (k == 3) {
                    method59(0, -1200, aBoolean826);
                    aBoolean826 = true;
                }
                if (k == 4) {
                    aBoolean826 = false;
                }
                if (aBoolean826 != flag1 && !aBoolean954) {
                    if (aBoolean826) {
                        anInt1012 = anInt1229;
                        aBoolean1013 = true;
                        aClass2_Sub1_873.method156(2, anInt1012);
                    } else {
                        method39(anInt1173);
                    }
                    anInt1157 = 0;
                }
            }
            if (j == 4) {
                if (k == 0) {
                    aBoolean1010 = true;
                    method113(0, 215);
                }
                if (k == 1) {
                    aBoolean1010 = true;
                    method113(-400, 215);
                }
                if (k == 2) {
                    aBoolean1010 = true;
                    method113(-800, 215);
                }
                if (k == 3) {
                    aBoolean1010 = true;
                    method113(-1200, 215);
                }
                if (k == 4) {
                    aBoolean1010 = false;
                }
            }
            if (j == 5) {
                anInt1275 = k;
            }
            if (j == 6) {
                anInt1289 = k;
            }
            if (j == 8) {
                anInt920 = k;
                aBoolean1169 = true;
            }
            if (j == 9) {
                anInt862 = k;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("71532, " + flag + ", " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method65(int i) {
        try {
            if (i <= 0) {
                aBuffer_928.writeByte(175);
            }
            Class14.aClass3_248.method174();
            Class14.aClass3_249.method174();
            Class47.aClass3_759.method174();
            ItemDefinition.aClass3_660.method174();
            ItemDefinition.aClass3_661.method174();
            Class13_Sub1_Sub1_Sub6_Sub1.aClass3_1696.method174();
            Class40.aClass3_697.method174();
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("19773, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void logout(int i) {
        try {
            try {
                if (gameConnection != null) {
                    gameConnection.close();
                }
            } catch (Exception _ex) {
            }
            gameConnection = null;
            aBoolean851 = false;
            anInt1220 = 0;
            username = "";
            password = "";
            if (i != anInt1287) {
                opcode = -1;
            }
            method65(509);
            aClass10_1198.method194(false);
            for (int j = 0; j < 4; j++) {
                aClass39Array947[j].method516();
            }
            System.gc();
            method39(anInt1173);
            anInt1229 = -1;
            anInt1012 = -1;
            anInt1157 = 0;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("43646, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method67(Widget widget, int i, int j, int k, int l) {
        try {
            if (widget.anInt570 != 0 || widget.anIntArray549 == null) {
                return;
            }
            if (widget.aBoolean561 && anInt861 != widget.anInt592 && anInt1118 != widget.anInt592 && anInt907 != widget.anInt592) {
                return;
            }
            int i1 = Class13_Sub1_Sub4.anInt1428;
            int j1 = Class13_Sub1_Sub4.anInt1426;
            int k1 = Class13_Sub1_Sub4.anInt1429;
            int l1 = Class13_Sub1_Sub4.anInt1427;
            Class13_Sub1_Sub4.method353(j + widget.anInt582, (byte) -12, i + widget.anInt586, i, j);
            int i2 = widget.anIntArray549.length;
            for (int j2 = 0; j2 < i2; j2++) {
                int k2 = widget.anIntArray591[j2] + j;
                int l2 = (widget.anIntArray557[j2] + i) - k;
                Widget widget_1 = Widget.aWidgetArray533[widget.anIntArray549[j2]];
                k2 += widget_1.anInt537;
                l2 += widget_1.anInt590;
                if (widget_1.anInt577 > 0) {
                    method105(0, widget_1);
                }
                if (widget_1.anInt570 == 0) {
                    if (widget_1.anInt595 > widget_1.anInt598 - widget_1.anInt586) {
                        widget_1.anInt595 = widget_1.anInt598 - widget_1.anInt586;
                    }
                    if (widget_1.anInt595 < 0) {
                        widget_1.anInt595 = 0;
                    }
                    method67(widget_1, l2, k2, widget_1.anInt595, 988);
                    if (widget_1.anInt598 > widget_1.anInt586) {
                        method36((byte) 2, widget_1.anInt586, widget_1.anInt598, widget_1.anInt595, l2, k2 + widget_1.anInt582);
                    }
                } else if (widget_1.anInt570 != 1) {
                    if (widget_1.anInt570 == 2) {
                        int i3 = 0;
                        for (int l3 = 0; l3 < widget_1.anInt586; l3++) {
                            for (int l4 = 0; l4 < widget_1.anInt582; l4++) {
                                int k5 = k2 + l4 * (32 + widget_1.anInt599);
                                int j6 = l2 + l3 * (32 + widget_1.anInt554);
                                if (i3 < 20) {
                                    k5 += widget_1.anIntArray580[i3];
                                    j6 += widget_1.anIntArray560[i3];
                                }
                                if (widget_1.anIntArray576[i3] > 0) {
                                    int k6 = 0;
                                    int j7 = 0;
                                    int j9 = widget_1.anIntArray576[i3] - 1;
                                    if (k5 > Class13_Sub1_Sub4.anInt1428 - 32 && k5 < Class13_Sub1_Sub4.anInt1429 && j6 > Class13_Sub1_Sub4.anInt1426 - 32 && j6 < Class13_Sub1_Sub4.anInt1427 || anInt1060 != 0 && anInt1059 == i3) {
                                        int l9 = 0;
                                        if (anInt1025 == 1 && anInt1026 == i3 && anInt1027 == widget_1.anInt592) {
                                            l9 = 0xffffff;
                                        }
                                        Class13_Sub1_Sub4_Sub4 class13_sub1_sub4_sub4_2 = ItemDefinition.method503(j9, widget_1.anIntArray579[i3], l9, aBoolean944);
                                        if (class13_sub1_sub4_sub4_2 != null) {
                                            if (anInt1060 != 0 && anInt1059 == i3 && anInt1058 == widget_1.anInt592) {
                                                k6 = super.anInt23 - anInt1061;
                                                j7 = super.anInt24 - anInt1062;
                                                if (k6 < 5 && k6 > -5) {
                                                    k6 = 0;
                                                }
                                                if (j7 < 5 && j7 > -5) {
                                                    j7 = 0;
                                                }
                                                if (anInt1183 < 5) {
                                                    k6 = 0;
                                                    j7 = 0;
                                                }
                                                class13_sub1_sub4_sub4_2.method410(k5 + k6, 8, 128, j6 + j7);
                                                if (j6 + j7 < Class13_Sub1_Sub4.anInt1426 && widget.anInt595 > 0) {
                                                    int i10 = (anInt1241 * (Class13_Sub1_Sub4.anInt1426 - j6 - j7)) / 3;
                                                    if (i10 > anInt1241 * 10) {
                                                        i10 = anInt1241 * 10;
                                                    }
                                                    if (i10 > widget.anInt595) {
                                                        i10 = widget.anInt595;
                                                    }
                                                    widget.anInt595 -= i10;
                                                    anInt1062 += i10;
                                                }
                                                if (j6 + j7 + 32 > Class13_Sub1_Sub4.anInt1427 && widget.anInt595 < widget.anInt598 - widget.anInt586) {
                                                    int j10 = (anInt1241 * ((j6 + j7 + 32) - Class13_Sub1_Sub4.anInt1427)) / 3;
                                                    if (j10 > anInt1241 * 10) {
                                                        j10 = anInt1241 * 10;
                                                    }
                                                    if (j10 > widget.anInt598 - widget.anInt586 - widget.anInt595) {
                                                        j10 = widget.anInt598 - widget.anInt586 - widget.anInt595;
                                                    }
                                                    widget.anInt595 += j10;
                                                    anInt1062 -= j10;
                                                }
                                            } else if (anInt936 != 0 && anInt935 == i3 && anInt934 == widget_1.anInt592) {
                                                class13_sub1_sub4_sub4_2.method410(k5, 8, 128, j6);
                                            } else {
                                                class13_sub1_sub4_sub4_2.method408(j6, (byte) 83, k5);
                                            }
                                            if (class13_sub1_sub4_sub4_2.anInt1685 == 33 || widget_1.anIntArray579[i3] != 1) {
                                                int k10 = widget_1.anIntArray579[i3];
                                                aClass13_Sub1_Sub4_Sub2_891.method385((byte) -96, method29(k10, anInt1204), 0, k5 + 1 + k6, j6 + 10 + j7);
                                                aClass13_Sub1_Sub4_Sub2_891.method385((byte) -96, method29(k10, anInt1204), 0xffff00, k5 + k6, j6 + 9 + j7);
                                            }
                                        }
                                    }
                                } else if (widget_1.aClass13_Sub1_Sub4_Sub4Array539 != null && i3 < 20) {
                                    Class13_Sub1_Sub4_Sub4 class13_sub1_sub4_sub4_1 = widget_1.aClass13_Sub1_Sub4_Sub4Array539[i3];
                                    if (class13_sub1_sub4_sub4_1 != null) {
                                        class13_sub1_sub4_sub4_1.method408(j6, (byte) 83, k5);
                                    }
                                }
                                i3++;
                            }
                        }
                    } else if (widget_1.anInt570 == 3) {
                        boolean flag = anInt907 == widget_1.anInt592 || anInt1118 == widget_1.anInt592 || anInt861 == widget_1.anInt592;
                        int j3;
                        if (method76(-33151, widget_1)) {
                            j3 = widget_1.anInt544;
                            if (flag && widget_1.anInt566 != 0) {
                                j3 = widget_1.anInt566;
                            }
                        } else {
                            j3 = widget_1.anInt550;
                            if (flag && widget_1.anInt596 != 0) {
                                j3 = widget_1.anInt596;
                            }
                        }
                        if (widget_1.aByte562 == 0) {
                            if (widget_1.aBoolean555) {
                                Class13_Sub1_Sub4.method356(false, k2, l2, j3, widget_1.anInt582, widget_1.anInt586);
                            } else {
                                Class13_Sub1_Sub4.method357((byte) 4, l2, k2, widget_1.anInt586, j3, widget_1.anInt582);
                            }
                        } else if (widget_1.aBoolean555) {
                            Class13_Sub1_Sub4.method355(widget_1.anInt582, 0, l2, widget_1.anInt586, j3, k2, 256 - (widget_1.aByte562 & 0xff));
                        } else {
                            Class13_Sub1_Sub4.method358(widget_1.anInt582, k2, false, 256 - (widget_1.aByte562 & 0xff), j3, l2, widget_1.anInt586);
                        }
                    } else if (widget_1.anInt570 == 4) {
                        Class13_Sub1_Sub4_Sub2 class13_sub1_sub4_sub2 = widget_1.aClass13_Sub1_Sub4_Sub2_583;
                        String s = widget_1.aString548;
                        boolean flag1 = anInt907 == widget_1.anInt592 || anInt1118 == widget_1.anInt592 || anInt861 == widget_1.anInt592;
                        int i4;
                        if (method76(-33151, widget_1)) {
                            i4 = widget_1.anInt544;
                            if (flag1 && widget_1.anInt566 != 0) {
                                i4 = widget_1.anInt566;
                            }
                            if (widget_1.aString589.length() > 0) {
                                s = widget_1.aString589;
                            }
                        } else {
                            i4 = widget_1.anInt550;
                            if (flag1 && widget_1.anInt596 != 0) {
                                i4 = widget_1.anInt596;
                            }
                        }
                        if (widget_1.anInt597 == 6 && aBoolean1048) {
                            s = "Please wait...";
                            i4 = widget_1.anInt550;
                        }
                        if (Class13_Sub1_Sub4.anInt1424 == 479) {
                            if (i4 == 0xffff00) {
                                i4 = 255;
                            }
                            if (i4 == 49152) {
                                i4 = 0xffffff;
                            }
                        }
                        for (int l6 = l2 + class13_sub1_sub4_sub2.anInt1659; s.length() > 0; l6 += class13_sub1_sub4_sub2.anInt1659) {
                            if (s.indexOf("%") != -1) {
                                do {
                                    int k7 = s.indexOf("%1");
                                    if (k7 == -1) {
                                        break;
                                    }
                                    s = s.substring(0, k7) + method107(method82(0, false, widget_1), 46358) + s.substring(k7 + 2);
                                } while (true);
                                do {
                                    int l7 = s.indexOf("%2");
                                    if (l7 == -1) {
                                        break;
                                    }
                                    s = s.substring(0, l7) + method107(method82(1, false, widget_1), 46358) + s.substring(l7 + 2);
                                } while (true);
                                do {
                                    int i8 = s.indexOf("%3");
                                    if (i8 == -1) {
                                        break;
                                    }
                                    s = s.substring(0, i8) + method107(method82(2, false, widget_1), 46358) + s.substring(i8 + 2);
                                } while (true);
                                do {
                                    int j8 = s.indexOf("%4");
                                    if (j8 == -1) {
                                        break;
                                    }
                                    s = s.substring(0, j8) + method107(method82(3, false, widget_1), 46358) + s.substring(j8 + 2);
                                } while (true);
                                do {
                                    int k8 = s.indexOf("%5");
                                    if (k8 == -1) {
                                        break;
                                    }
                                    s = s.substring(0, k8) + method107(method82(4, false, widget_1), 46358) + s.substring(k8 + 2);
                                } while (true);
                            }
                            int l8 = s.indexOf("\\n");
                            String s1;
                            if (l8 != -1) {
                                s1 = s.substring(0, l8);
                                s = s.substring(l8 + 2);
                            } else {
                                s1 = s;
                                s = "";
                            }
                            if (widget_1.aBoolean551) {
                                class13_sub1_sub4_sub2.method382(k2 + widget_1.anInt582 / 2, widget_1.aBoolean559, s1, l6, i4, false);
                            } else {
                                class13_sub1_sub4_sub2.method389(widget_1.aBoolean559, k2, (byte) 8, l6, i4, s1);
                            }
                        }

                    } else if (widget_1.anInt570 == 5) {
                        Class13_Sub1_Sub4_Sub4 class13_sub1_sub4_sub4;
                        if (method76(-33151, widget_1)) {
                            class13_sub1_sub4_sub4 = widget_1.aClass13_Sub1_Sub4_Sub4_565;
                        } else {
                            class13_sub1_sub4_sub4 = widget_1.aClass13_Sub1_Sub4_Sub4_569;
                        }
                        if (class13_sub1_sub4_sub4 != null) {
                            class13_sub1_sub4_sub4.method408(l2, (byte) 83, k2);
                        }
                    } else if (widget_1.anInt570 == 6) {
                        int k3 = Class13_Sub1_Sub4_Sub1.anInt1630;
                        int j4 = Class13_Sub1_Sub4_Sub1.anInt1631;
                        Class13_Sub1_Sub4_Sub1.anInt1630 = k2 + widget_1.anInt582 / 2;
                        Class13_Sub1_Sub4_Sub1.anInt1631 = l2 + widget_1.anInt586 / 2;
                        int i5 = Class13_Sub1_Sub4_Sub1.anIntArray1634[widget_1.anInt535] * widget_1.anInt534 >> 16;
                        int l5 = Class13_Sub1_Sub4_Sub1.anIntArray1635[widget_1.anInt535] * widget_1.anInt534 >> 16;
                        boolean flag2 = method76(-33151, widget_1);
                        int i7;
                        if (flag2) {
                            i7 = widget_1.anInt572;
                        } else {
                            i7 = widget_1.anInt571;
                        }
                        Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4;
                        if (i7 == -1) {
                            class13_sub1_sub1_sub4 = widget_1.method499(-1, -1, true, flag2);
                        } else {
                            Class50 class50 = Class50.aClass50Array800[i7];
                            class13_sub1_sub1_sub4 = widget_1.method499(class50.anIntArray803[widget_1.anInt568], class50.anIntArray802[widget_1.anInt568], true, flag2);
                        }
                        if (class13_sub1_sub1_sub4 != null) {
                            class13_sub1_sub1_sub4.method285(0, widget_1.anInt536, 0, widget_1.anInt535, 0, i5, l5);
                        }
                        Class13_Sub1_Sub4_Sub1.anInt1630 = k3;
                        Class13_Sub1_Sub4_Sub1.anInt1631 = j4;
                    } else if (widget_1.anInt570 == 7) {
                        Class13_Sub1_Sub4_Sub2 class13_sub1_sub4_sub2_1 = widget_1.aClass13_Sub1_Sub4_Sub2_583;
                        int k4 = 0;
                        for (int j5 = 0; j5 < widget_1.anInt586; j5++) {
                            for (int i6 = 0; i6 < widget_1.anInt582; i6++) {
                                if (widget_1.anIntArray576[k4] > 0) {
                                    ItemDefinition itemDefinition = ItemDefinition.method505(widget_1.anIntArray576[k4] - 1);
                                    String s2 = itemDefinition.aString649;
                                    if (itemDefinition.aBoolean662 || widget_1.anIntArray579[k4] != 1) {
                                        s2 = s2 + " x" + method58(-218, widget_1.anIntArray579[k4]);
                                    }
                                    int i9 = k2 + i6 * (115 + widget_1.anInt599);
                                    int k9 = l2 + j5 * (12 + widget_1.anInt554);
                                    if (widget_1.aBoolean551) {
                                        class13_sub1_sub4_sub2_1.method382(i9 + widget_1.anInt582 / 2, widget_1.aBoolean559, s2, k9, widget_1.anInt550, false);
                                    } else {
                                        class13_sub1_sub4_sub2_1.method389(widget_1.aBoolean559, i9, (byte) 8, k9, widget_1.anInt550, s2);
                                    }
                                }
                                k4++;
                            }
                        }
                    }
                }
            }

            if (l <= 0) {
                opcode = -1;
            }
            Class13_Sub1_Sub4.method353(k1, (byte) -12, l1, j1, i1);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("61542, " + widget + ", " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int method68(int i) {
        try {
            int j = 3;
            packetSize += i;
            if (anInt1007 < 310) {
                int k = anInt1004 >> 7;
                int l = anInt1006 >> 7;
                int i1 = aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 >> 7;
                int j1 = aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 >> 7;
                if ((aByteArrayArrayArray1164[anInt1166][k][l] & 4) != 0) {
                    j = anInt1166;
                }
                int k1;
                if (i1 > k) {
                    k1 = i1 - k;
                } else {
                    k1 = k - i1;
                }
                int l1;
                if (j1 > l) {
                    l1 = j1 - l;
                } else {
                    l1 = l - j1;
                }
                if (k1 > l1) {
                    int i2 = (l1 * 0x10000) / k1;
                    int k2 = 32768;
                    while (k != i1) {
                        if (k < i1) {
                            k++;
                        } else if (k > i1) {
                            k--;
                        }
                        if ((aByteArrayArrayArray1164[anInt1166][k][l] & 4) != 0) {
                            j = anInt1166;
                        }
                        k2 += i2;
                        if (k2 >= 0x10000) {
                            k2 -= 0x10000;
                            if (l < j1) {
                                l++;
                            } else if (l > j1) {
                                l--;
                            }
                            if ((aByteArrayArrayArray1164[anInt1166][k][l] & 4) != 0) {
                                j = anInt1166;
                            }
                        }
                    }
                } else {
                    int j2 = (k1 * 0x10000) / l1;
                    int l2 = 32768;
                    while (l != j1) {
                        if (l < j1) {
                            l++;
                        } else if (l > j1) {
                            l--;
                        }
                        if ((aByteArrayArrayArray1164[anInt1166][k][l] & 4) != 0) {
                            j = anInt1166;
                        }
                        l2 += j2;
                        if (l2 >= 0x10000) {
                            l2 -= 0x10000;
                            if (k < i1) {
                                k++;
                            } else if (k > i1) {
                                k--;
                            }
                            if ((aByteArrayArrayArray1164[anInt1166][k][l] & 4) != 0) {
                                j = anInt1166;
                            }
                        }
                    }
                }
            }
            if ((aByteArrayArrayArray1164[anInt1166][aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 >> 7][aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 >> 7] & 4) != 0) {
                j = anInt1166;
            }
            return j;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("15975, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int method69(byte byte0) {
        try {
            if (byte0 == 1) {
                byte0 = 0;
            } else {
                anInt1203 = isaacCipher.method190();
            }
            int i = method80(anInt1166, 781, anInt1006, anInt1004);
            if (i - anInt1005 < 800 && (aByteArrayArrayArray1164[anInt1166][anInt1004 >> 7][anInt1006 >> 7] & 4) != 0) {
                return anInt1166;
            } else {
                return 3;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("2857, " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method70(int i, String s, String s1, byte byte0) {
        try {
            if (byte0 != 117) {
                aBuffer_928.writeByte(126);
            }
            if (i == 0 && anInt1276 != -1) {
                aString1160 = s;
                super.anInt29 = 0;
            }
            if (anInt1016 == -1) {
                aBoolean1169 = true;
            }
            for (int j = 99; j > 0; j--) {
                anIntArray839[j] = anIntArray839[j - 1];
                aStringArray840[j] = aStringArray840[j - 1];
                aStringArray841[j] = aStringArray841[j - 1];
            }
            anIntArray839[0] = i;
            aStringArray840[0] = s1;
            aStringArray841[0] = s;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("31742, " + i + ", " + s + ", " + s1 + ", " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method71(String s, int i) {
        try {
            i = 77 / i;
            if (s == null) {
                return false;
            }
            for (int j = 0; j < anInt1054; j++) {
                if (s.equalsIgnoreCase(aStringArray1003[j])) {
                    return true;
                }
            }
            return s.equalsIgnoreCase(aClass13_Sub1_Sub1_Sub6_Sub1_997.aString1689);
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("46078, " + s + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method72(Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1, int i, int j, int k, boolean flag) {
        try {
            if (class13_sub1_sub1_sub6_sub1 == aClass13_Sub1_Sub1_Sub6_Sub1_997) {
                return;
            }
            if (anInt1167 >= 400) {
                return;
            }
            String s;
            if (class13_sub1_sub1_sub6_sub1.anInt1695 == 0) {
                s = class13_sub1_sub1_sub6_sub1.aString1689 + method137(class13_sub1_sub1_sub6_sub1.anInt1697, aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1697, 453) + " (level-" + class13_sub1_sub1_sub6_sub1.anInt1697 + ")";
            } else {
                s = class13_sub1_sub1_sub6_sub1.aString1689 + " (skill-" + class13_sub1_sub1_sub6_sub1.anInt1695 + ")";
            }
            if (anInt1025 == 1) {
                aStringArray961[anInt1167] = "Use " + aString1029 + " with @whi@" + s;
                anIntArray911[anInt1167] = 758;
                anIntArray912[anInt1167] = i;
                anIntArray909[anInt1167] = k;
                anIntArray910[anInt1167] = j;
                anInt1167++;
            } else if (anInt973 == 1) {
                if ((anInt975 & 8) == 8) {
                    aStringArray961[anInt1167] = aString976 + " @whi@" + s;
                    anIntArray911[anInt1167] = 183;
                    anIntArray912[anInt1167] = i;
                    anIntArray909[anInt1167] = k;
                    anIntArray910[anInt1167] = j;
                    anInt1167++;
                }
            } else {
                for (int l = 4; l >= 0; l--) {
                    if (aStringArray1031[l] != null) {
                        aStringArray961[anInt1167] = aStringArray1031[l] + " @whi@" + s;
                        char c = '\0';
                        if (aStringArray1031[l].equalsIgnoreCase("attack")) {
                            if (class13_sub1_sub1_sub6_sub1.anInt1697 > aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1697) {
                                c = '\u07D0';
                            }
                            if (aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1702 != 0 && class13_sub1_sub1_sub6_sub1.anInt1702 != 0) {
                                if (aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1702 == class13_sub1_sub1_sub6_sub1.anInt1702) {
                                    c = '\u07D0';
                                } else {
                                    c = '\0';
                                }
                            }
                        } else if (aBooleanArray1032[l]) {
                            c = '\u07D0';
                        }
                        if (l == 0) {
                            anIntArray911[anInt1167] = 352 + c;
                        }
                        if (l == 1) {
                            anIntArray911[anInt1167] = 219 + c;
                        }
                        if (l == 2) {
                            anIntArray911[anInt1167] = 345 + c;
                        }
                        if (l == 3) {
                            anIntArray911[anInt1167] = 812 + c;
                        }
                        if (l == 4) {
                            anIntArray911[anInt1167] = 514 + c;
                        }
                        anIntArray912[anInt1167] = i;
                        anIntArray909[anInt1167] = k;
                        anIntArray910[anInt1167] = j;
                        anInt1167++;
                    }
                }
            }
            for (int i1 = 0; i1 < anInt1167; i1++) {
                if (anIntArray911[i1] != 770) {
                    continue;
                }
                aStringArray961[i1] = "Walk here @whi@" + s;
                break;
            }
            if (flag) {
                opcode = buffer.readUnsignedByte();
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("41963, " + class13_sub1_sub1_sub6_sub1 + ", " + i + ", " + j + ", " + k + ", " + flag + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method73(int i, boolean flag) {
        try {
            for (int j = 0; j < anInt1284; j++) {
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[anIntArray1285[j]];
                int k = 0x20000000 + (anIntArray1285[j] << 14);
                if (class13_sub1_sub1_sub6_sub2 == null || !class13_sub1_sub1_sub6_sub2.method291(true) || class13_sub1_sub1_sub6_sub2.aClass47_1717.aBoolean782 != flag) {
                    continue;
                }
                int l = class13_sub1_sub1_sub6_sub2.anInt1587 >> 7;
                int i1 = class13_sub1_sub1_sub6_sub2.anInt1588 >> 7;
                if (l < 0 || l >= 104 || i1 < 0 || i1 >= 104) {
                    continue;
                }
                if (class13_sub1_sub1_sub6_sub2.anInt1611 == 1 && (class13_sub1_sub1_sub6_sub2.anInt1587 & 0x7f) == 64 && (class13_sub1_sub1_sub6_sub2.anInt1588 & 0x7f) == 64) {
                    if (anIntArrayArray1228[l][i1] == anInt979) {
                        continue;
                    }
                    anIntArrayArray1228[l][i1] = anInt979;
                }
                if (!class13_sub1_sub1_sub6_sub2.aClass47_1717.aBoolean784) {
                    k += 0x80000000;
                }
                aClass10_1198.method205(class13_sub1_sub1_sub6_sub2.anInt1588, class13_sub1_sub1_sub6_sub2.anInt1587, anInt1166, k, class13_sub1_sub1_sub6_sub2, -554, method80(anInt1166, 781, class13_sub1_sub1_sub6_sub2.anInt1588, class13_sub1_sub1_sub6_sub2.anInt1587), (class13_sub1_sub1_sub6_sub2.anInt1611 - 1) * 64 + 60, class13_sub1_sub1_sub6_sub2.anInt1589, class13_sub1_sub1_sub6_sub2.aBoolean1569);
            }
            if (i != 0) {
                method6();
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("53071, " + i + ", " + flag + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method7(byte byte0) {
        try {
            if (aBoolean1239 || aBoolean1234 || aBoolean842) {
                return;
            }
            pulseCycle++;
            if (!aBoolean851) {
                method33(true);
            } else {
                method47(true);
            }
            method48(3);
            if (byte0 != -19) {
                for (int i = 1; i > 0; i++) {
                }
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("90563, " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public boolean method74(int i, boolean flag, int j) {
        try {
            boolean flag1 = false;
            Widget widget = Widget.aWidgetArray533[j];
            for (int k = 0; k < widget.anIntArray549.length; k++) {
                if (widget.anIntArray549[k] == -1) {
                    break;
                }
                Widget widget_1 = Widget.aWidgetArray533[widget.anIntArray549[k]];
                if (widget_1.anInt570 == 1) {
                    flag1 |= method74(i, true, widget_1.anInt592);
                }
                if (widget_1.anInt570 == 6 && (widget_1.anInt571 != -1 || widget_1.anInt572 != -1)) {
                    boolean flag2 = method76(-33151, widget_1);
                    int l;
                    if (flag2) {
                        l = widget_1.anInt572;
                    } else {
                        l = widget_1.anInt571;
                    }
                    if (l != -1) {
                        Class50 class50 = Class50.aClass50Array800[l];
                        for (widget_1.anInt540 += i; widget_1.anInt540 > class50.method592(0, widget_1.anInt568); ) {
                            widget_1.anInt540 -= class50.method592(0, widget_1.anInt568) + 1;
                            widget_1.anInt568++;
                            if (widget_1.anInt568 >= class50.anInt801) {
                                widget_1.anInt568 -= class50.anInt805;
                                if (widget_1.anInt568 < 0 || widget_1.anInt568 >= class50.anInt801) {
                                    widget_1.anInt568 = 0;
                                }
                            }
                            flag1 = true;
                        }
                    }
                }
            }
            aBoolean851 &= flag;
            return flag1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("39064, " + i + ", " + flag + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void init() {
        anInt951 = Integer.parseInt(getParameter("nodeid"));
        anInt952 = Integer.parseInt(getParameter("portoff"));
        String s = getParameter("lowmem");
        if (s != null && s.equals("1")) {
            method106(8);
        } else {
            method85(true);
        }
        String s1 = getParameter("free");
        aBoolean953 = s1 == null || !s1.equals("1");
        method2(503, 765, anInt1074);
        loadRSAKeys();
    }

    public void method75(int i, Widget widget, int j, boolean flag, int k, int l, int i1) {
        try {
            if (widget.anInt570 != 0 || widget.anIntArray549 == null || widget.aBoolean561) {
                return;
            }
            if (i < k || j < i1 || i > k + widget.anInt582 || j > i1 + widget.anInt586) {
                return;
            }
            int j1 = widget.anIntArray549.length;
            if (flag) {
                for (int k1 = 1; k1 > 0; k1++) {
                }
            }
            for (int l1 = 0; l1 < j1; l1++) {
                int i2 = widget.anIntArray591[l1] + k;
                int j2 = (widget.anIntArray557[l1] + i1) - l;
                Widget widget_1 = Widget.aWidgetArray533[widget.anIntArray549[l1]];
                i2 += widget_1.anInt537;
                j2 += widget_1.anInt590;
                if ((widget_1.anInt543 >= 0 || widget_1.anInt596 != 0) && i >= i2 && j >= j2 && i < i2 + widget_1.anInt582 && j < j2 + widget_1.anInt586) {
                    if (widget_1.anInt543 >= 0) {
                        anInt1270 = widget_1.anInt543;
                    } else {
                        anInt1270 = widget_1.anInt592;
                    }
                }
                if (widget_1.anInt570 == 0) {
                    method75(i, widget_1, j, false, i2, widget_1.anInt595, j2);
                    if (widget_1.anInt598 > widget_1.anInt586) {
                        method111(i, i2 + widget_1.anInt582, widget_1.anInt598, j, widget_1.anInt586, (byte) 4, widget_1, true, j2);
                    }
                } else {
                    if (widget_1.anInt597 == 1 && i >= i2 && j >= j2 && i < i2 + widget_1.anInt582 && j < j2 + widget_1.anInt586) {
                        boolean flag1 = false;
                        if (widget_1.anInt577 != 0) {
                            flag1 = method119(widget_1, (byte) 0);
                        }
                        if (!flag1) {
                            aStringArray961[anInt1167] = widget_1.aString564;
                            anIntArray911[anInt1167] = 190;
                            anIntArray910[anInt1167] = widget_1.anInt592;
                            anInt1167++;
                        }
                    }
                    if (widget_1.anInt597 == 2 && anInt973 == 0 && i >= i2 && j >= j2 && i < i2 + widget_1.anInt582 && j < j2 + widget_1.anInt586) {
                        String s = widget_1.aString563;
                        if (s.indexOf(" ") != -1) {
                            s = s.substring(0, s.indexOf(" "));
                        }
                        aStringArray961[anInt1167] = s + " @gre@" + widget_1.aString553;
                        anIntArray911[anInt1167] = 813;
                        anIntArray910[anInt1167] = widget_1.anInt592;
                        anInt1167++;
                    }
                    if (widget_1.anInt597 == 3 && i >= i2 && j >= j2 && i < i2 + widget_1.anInt582 && j < j2 + widget_1.anInt586) {
                        aStringArray961[anInt1167] = "Close";
                        anIntArray911[anInt1167] = 324;
                        anIntArray910[anInt1167] = widget_1.anInt592;
                        anInt1167++;
                    }
                    if (widget_1.anInt597 == 4 && i >= i2 && j >= j2 && i < i2 + widget_1.anInt582 && j < j2 + widget_1.anInt586) {
                        aStringArray961[anInt1167] = widget_1.aString564;
                        anIntArray911[anInt1167] = 654;
                        anIntArray910[anInt1167] = widget_1.anInt592;
                        anInt1167++;
                    }
                    if (widget_1.anInt597 == 5 && i >= i2 && j >= j2 && i < i2 + widget_1.anInt582 && j < j2 + widget_1.anInt586) {
                        aStringArray961[anInt1167] = widget_1.aString564;
                        anIntArray911[anInt1167] = 682;
                        anIntArray910[anInt1167] = widget_1.anInt592;
                        anInt1167++;
                    }
                    if (widget_1.anInt597 == 6 && !aBoolean1048 && i >= i2 && j >= j2 && i < i2 + widget_1.anInt582 && j < j2 + widget_1.anInt586) {
                        aStringArray961[anInt1167] = widget_1.aString564;
                        anIntArray911[anInt1167] = 755;
                        anIntArray910[anInt1167] = widget_1.anInt592;
                        anInt1167++;
                    }
                    if (widget_1.anInt570 == 2) {
                        int k2 = 0;
                        for (int l2 = 0; l2 < widget_1.anInt586; l2++) {
                            for (int i3 = 0; i3 < widget_1.anInt582; i3++) {
                                int j3 = i2 + i3 * (32 + widget_1.anInt599);
                                int k3 = j2 + l2 * (32 + widget_1.anInt554);
                                if (k2 < 20) {
                                    j3 += widget_1.anIntArray580[k2];
                                    k3 += widget_1.anIntArray560[k2];
                                }
                                if (i >= j3 && j >= k3 && i < j3 + 32 && j < k3 + 32) {
                                    anInt980 = k2;
                                    anInt981 = widget_1.anInt592;
                                    if (widget_1.anIntArray576[k2] > 0) {
                                        ItemDefinition itemDefinition = ItemDefinition.method505(widget_1.anIntArray576[k2] - 1);
                                        if (anInt1025 == 1 && widget_1.aBoolean585) {
                                            if (widget_1.anInt592 != anInt1027 || k2 != anInt1026) {
                                                aStringArray961[anInt1167] = "Use " + aString1029 + " with @lre@" + itemDefinition.aString649;
                                                anIntArray911[anInt1167] = 894;
                                                anIntArray912[anInt1167] = itemDefinition.anInt633;
                                                anIntArray909[anInt1167] = k2;
                                                anIntArray910[anInt1167] = widget_1.anInt592;
                                                anInt1167++;
                                            }
                                        } else if (anInt973 == 1 && widget_1.aBoolean585) {
                                            if ((anInt975 & 0x10) == 16) {
                                                aStringArray961[anInt1167] = aString976 + " @lre@" + itemDefinition.aString649;
                                                anIntArray911[anInt1167] = 79;
                                                anIntArray912[anInt1167] = itemDefinition.anInt633;
                                                anIntArray909[anInt1167] = k2;
                                                anIntArray910[anInt1167] = widget_1.anInt592;
                                                anInt1167++;
                                            }
                                        } else {
                                            if (widget_1.aBoolean585) {
                                                for (int l3 = 4; l3 >= 3; l3--) {
                                                    if (itemDefinition.aStringArray639 != null && itemDefinition.aStringArray639[l3] != null) {
                                                        aStringArray961[anInt1167] = itemDefinition.aStringArray639[l3] + " @lre@" + itemDefinition.aString649;
                                                        if (l3 == 3) {
                                                            anIntArray911[anInt1167] = 333;
                                                        }
                                                        if (l3 == 4) {
                                                            anIntArray911[anInt1167] = 678;
                                                        }
                                                        anIntArray912[anInt1167] = itemDefinition.anInt633;
                                                        anIntArray909[anInt1167] = k2;
                                                        anIntArray910[anInt1167] = widget_1.anInt592;
                                                        anInt1167++;
                                                    } else if (l3 == 4) {
                                                        aStringArray961[anInt1167] = "Drop @lre@" + itemDefinition.aString649;
                                                        anIntArray911[anInt1167] = 678;
                                                        anIntArray912[anInt1167] = itemDefinition.anInt633;
                                                        anIntArray909[anInt1167] = k2;
                                                        anIntArray910[anInt1167] = widget_1.anInt592;
                                                        anInt1167++;
                                                    }
                                                }
                                            }
                                            if (widget_1.aBoolean552) {
                                                aStringArray961[anInt1167] = "Use @lre@" + itemDefinition.aString649;
                                                anIntArray911[anInt1167] = 195;
                                                anIntArray912[anInt1167] = itemDefinition.anInt633;
                                                anIntArray909[anInt1167] = k2;
                                                anIntArray910[anInt1167] = widget_1.anInt592;
                                                anInt1167++;
                                            }
                                            if (widget_1.aBoolean585 && itemDefinition.aStringArray639 != null) {
                                                for (int i4 = 2; i4 >= 0; i4--) {
                                                    if (itemDefinition.aStringArray639[i4] != null) {
                                                        aStringArray961[anInt1167] = itemDefinition.aStringArray639[i4] + " @lre@" + itemDefinition.aString649;
                                                        if (i4 == 0) {
                                                            anIntArray911[anInt1167] = 707;
                                                        }
                                                        if (i4 == 1) {
                                                            anIntArray911[anInt1167] = 426;
                                                        }
                                                        if (i4 == 2) {
                                                            anIntArray911[anInt1167] = 71;
                                                        }
                                                        anIntArray912[anInt1167] = itemDefinition.anInt633;
                                                        anIntArray909[anInt1167] = k2;
                                                        anIntArray910[anInt1167] = widget_1.anInt592;
                                                        anInt1167++;
                                                    }
                                                }
                                            }
                                            if (widget_1.aStringArray547 != null) {
                                                for (int j4 = 4; j4 >= 0; j4--) {
                                                    if (widget_1.aStringArray547[j4] != null) {
                                                        aStringArray961[anInt1167] = widget_1.aStringArray547[j4] + " @lre@" + itemDefinition.aString649;
                                                        if (j4 == 0) {
                                                            anIntArray911[anInt1167] = 11;
                                                        }
                                                        if (j4 == 1) {
                                                            anIntArray911[anInt1167] = 13;
                                                        }
                                                        if (j4 == 2) {
                                                            anIntArray911[anInt1167] = 650;
                                                        }
                                                        if (j4 == 3) {
                                                            anIntArray911[anInt1167] = 222;
                                                        }
                                                        if (j4 == 4) {
                                                            anIntArray911[anInt1167] = 31;
                                                        }
                                                        anIntArray912[anInt1167] = itemDefinition.anInt633;
                                                        anIntArray909[anInt1167] = k2;
                                                        anIntArray910[anInt1167] = widget_1.anInt592;
                                                        anInt1167++;
                                                    }
                                                }
                                            }
                                            aStringArray961[anInt1167] = "Examine @lre@" + itemDefinition.aString649;
                                            anIntArray911[anInt1167] = 1870;
                                            anIntArray912[anInt1167] = itemDefinition.anInt633;
                                            anIntArray909[anInt1167] = k2;
                                            anIntArray910[anInt1167] = widget_1.anInt592;
                                            anInt1167++;
                                        }
                                    }
                                }
                                k2++;
                            }
                        }
                    }
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("69094, " + i + ", " + widget + ", " + j + ", " + flag + ", " + k + ", " + l + ", " + i1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method76(int i, Widget widget) {
        try {
            if (i != -33151) {
                aClass12ArrayArrayArray969 = null;
            }
            if (widget.anIntArray545 == null) {
                return false;
            }
            for (int j = 0; j < widget.anIntArray545.length; j++) {
                int k = method82(j, false, widget);
                int l = widget.anIntArray556[j];
                if (widget.anIntArray545[j] == 2) {
                    if (k >= l) {
                        return false;
                    }
                } else if (widget.anIntArray545[j] == 3) {
                    if (k <= l) {
                        return false;
                    }
                } else if (widget.anIntArray545[j] == 4) {
                    if (k == l) {
                        return false;
                    }
                } else if (k != l) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("75970, " + i + ", " + widget + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method77(long l, int i) {
        try {
            if (l == 0L) {
                return;
            }
            if (anInt1098 >= 100) {
                method70(0, "Your ignore list is full. Max of 100 hit", "", (byte) 117);
                return;
            }
            String s = Class24.method450(Class24.method447(l, 0), 0);
            for (int j = 0; j < anInt1098; j++) {
                if (aLongArray990[j] == l) {
                    method70(0, s + " is already on your ignore list", "", (byte) 117);
                    return;
                }
            }
            if (i < anInt972 || i > anInt972) {
                return;
            }
            for (int k = 0; k < anInt1054; k++) {
                if (aLongArray993[k] == l) {
                    method70(0, "Please remove " + s + " from your friend list first", "", (byte) 117);
                    return;
                }
            }
            aLongArray990[anInt1098++] = l;
            aBoolean1148 = true;
            aBuffer_928.method300(232);
            aBuffer_928.writeLong(l);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("59449, " + l + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method78(Buffer buffer, int i, int j) {
        try {
            if (i != -8427) {
                aClass12ArrayArrayArray969 = null;
            }
            for (int k = 0; k < anInt901; k++) {
                int l = anIntArray902[k];
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[l];
                int i1 = buffer.readUnsignedByte();
                if ((i1 & 1) != 0) {
                    class13_sub1_sub1_sub6_sub2.aClass47_1717 = Class47.getDefinition(buffer.method339(true));
                    class13_sub1_sub1_sub6_sub2.anInt1611 = class13_sub1_sub1_sub6_sub2.aClass47_1717.aByte768;
                    class13_sub1_sub1_sub6_sub2.anInt1618 = class13_sub1_sub1_sub6_sub2.aClass47_1717.anInt760;
                    class13_sub1_sub1_sub6_sub2.anInt1570 = class13_sub1_sub1_sub6_sub2.aClass47_1717.anInt778;
                    class13_sub1_sub1_sub6_sub2.anInt1571 = class13_sub1_sub1_sub6_sub2.aClass47_1717.anInt785;
                    class13_sub1_sub1_sub6_sub2.anInt1572 = class13_sub1_sub1_sub6_sub2.aClass47_1717.anInt773;
                    class13_sub1_sub1_sub6_sub2.anInt1573 = class13_sub1_sub1_sub6_sub2.aClass47_1717.anInt786;
                    class13_sub1_sub1_sub6_sub2.anInt1584 = class13_sub1_sub1_sub6_sub2.aClass47_1717.anInt748;
                }
                if ((i1 & 0x40) != 0) {
                    int j1 = buffer.readUnsignedByte();
                    int j2 = buffer.readUnsignedByte();
                    class13_sub1_sub1_sub6_sub2.method293(j1, true, pulseCycle, j2);
                    class13_sub1_sub1_sub6_sub2.anInt1604 = pulseCycle + 300;
                    class13_sub1_sub1_sub6_sub2.anInt1605 = buffer.readUnsignedByteA(856);
                    class13_sub1_sub1_sub6_sub2.anInt1606 = buffer.readUnsignedByteA(856);
                }
                if ((i1 & 4) != 0) {
                    int k1 = buffer.readUnsignedShort();
                    if (k1 == 65535) {
                        k1 = -1;
                    }
                    int k2 = buffer.readUnsignedByteA(856);
                    if (k1 == class13_sub1_sub1_sub6_sub2.anInt1597 && k1 != -1) {
                        int i3 = Class50.aClass50Array800[k1].anInt814;
                        if (i3 == 1) {
                            class13_sub1_sub1_sub6_sub2.anInt1598 = 0;
                            class13_sub1_sub1_sub6_sub2.anInt1599 = 0;
                            class13_sub1_sub1_sub6_sub2.anInt1600 = k2;
                            class13_sub1_sub1_sub6_sub2.anInt1601 = 0;
                        }
                        if (i3 == 2) {
                            class13_sub1_sub1_sub6_sub2.anInt1601 = 0;
                        }
                    } else if (k1 == -1 || class13_sub1_sub1_sub6_sub2.anInt1597 == -1 || Class50.aClass50Array800[k1].anInt808 >= Class50.aClass50Array800[class13_sub1_sub1_sub6_sub2.anInt1597].anInt808) {
                        class13_sub1_sub1_sub6_sub2.anInt1597 = k1;
                        class13_sub1_sub1_sub6_sub2.anInt1598 = 0;
                        class13_sub1_sub1_sub6_sub2.anInt1599 = 0;
                        class13_sub1_sub1_sub6_sub2.anInt1600 = k2;
                        class13_sub1_sub1_sub6_sub2.anInt1601 = 0;
                        class13_sub1_sub1_sub6_sub2.anInt1619 = class13_sub1_sub1_sub6_sub2.anInt1591;
                    }
                }
                if ((i1 & 0x20) != 0) {
                    int l1 = buffer.readUnsignedByteC(19179);
                    int l2 = buffer.readUnsignedByte();
                    class13_sub1_sub1_sub6_sub2.method293(l1, true, pulseCycle, l2);
                    class13_sub1_sub1_sub6_sub2.anInt1604 = pulseCycle + 300;
                    class13_sub1_sub1_sub6_sub2.anInt1605 = buffer.method332(aByte1172);
                    class13_sub1_sub1_sub6_sub2.anInt1606 = buffer.method332(aByte1172);
                }
                if ((i1 & 2) != 0) {
                    class13_sub1_sub1_sub6_sub2.aString1586 = buffer.readString();
                    class13_sub1_sub1_sub6_sub2.anInt1603 = 100;
                }
                if ((i1 & 8) != 0) {
                    class13_sub1_sub1_sub6_sub2.anInt1592 = buffer.readUnsignedShort();
                    int i2 = buffer.method346((byte) 1);
                    class13_sub1_sub1_sub6_sub2.anInt1596 = i2 >> 16;
                    class13_sub1_sub1_sub6_sub2.anInt1595 = pulseCycle + (i2 & 0xffff);
                    class13_sub1_sub1_sub6_sub2.anInt1593 = 0;
                    class13_sub1_sub1_sub6_sub2.anInt1594 = 0;
                    if (class13_sub1_sub1_sub6_sub2.anInt1595 > pulseCycle) {
                        class13_sub1_sub1_sub6_sub2.anInt1593 = -1;
                    }
                    if (class13_sub1_sub1_sub6_sub2.anInt1592 == 65535) {
                        class13_sub1_sub1_sub6_sub2.anInt1592 = -1;
                    }
                }
                if ((i1 & 0x10) != 0) {
                    class13_sub1_sub1_sub6_sub2.anInt1602 = buffer.readUnsignedLittleEndianShortA();
                    if (class13_sub1_sub1_sub6_sub2.anInt1602 == 65535) {
                        class13_sub1_sub1_sub6_sub2.anInt1602 = -1;
                    }
                }
                if ((i1 & 0x80) != 0) {
                    class13_sub1_sub1_sub6_sub2.anInt1582 = buffer.readUnsignedLittleEndianShort();
                    class13_sub1_sub1_sub6_sub2.anInt1583 = buffer.method339(true);
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("77192, " + buffer + ", " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method79(int i, int j) {
        try {
            if (j != 0) {
                return;
            }
            Widget widget = Widget.aWidgetArray533[i];
            for (int k = 0; k < widget.anIntArray549.length; k++) {
                if (widget.anIntArray549[k] == -1) {
                    break;
                }
                Widget widget_1 = Widget.aWidgetArray533[widget.anIntArray549[k]];
                if (widget_1.anInt570 == 1) {
                    method79(widget_1.anInt592, anInt1119);
                }
                widget_1.anInt568 = 0;
                widget_1.anInt540 = 0;
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("47289, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int method80(int i, int j, int k, int l) {
        try {
            int i1 = l >> 7;
            int j1 = k >> 7;
            if (i1 < 0 || j1 < 0 || i1 > 103 || j1 > 103) {
                return 0;
            }
            int k1 = i;
            if (j <= 0) {
                return 1;
            }
            if (k1 < 3 && (aByteArrayArrayArray1164[1][i1][j1] & 2) == 2) {
                k1++;
            }
            int l1 = l & 0x7f;
            int i2 = k & 0x7f;
            int j2 = anIntArrayArrayArray1267[k1][i1][j1] * (128 - l1) + anIntArrayArrayArray1267[k1][i1 + 1][j1] * l1 >> 7;
            int k2 = anIntArrayArrayArray1267[k1][i1][j1 + 1] * (128 - l1) + anIntArrayArrayArray1267[k1][i1 + 1][j1 + 1] * l1 >> 7;
            return j2 * (128 - i2) + k2 * i2 >> 7;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("32751, " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method81(Buffer buffer, int i, boolean flag) {
        try {
            for (int j = 0; j < anInt901; j++) {
                int k = anIntArray902[j];
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1 = players[k];
                int l = buffer.readUnsignedByte();
                if ((l & 0x40) != 0) {
                    l += buffer.readUnsignedByte() << 8;
                }
                method147(class13_sub1_sub1_sub6_sub1, k, buffer, l, 0);
            }
            if (flag) {
                method6();
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("59849, " + buffer + ", " + i + ", " + flag + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public int method82(int i, boolean flag, Widget widget) {
        try {
            if (flag) {
                aClass12ArrayArrayArray969 = null;
            }
            if (widget.anIntArrayArray581 == null || i >= widget.anIntArrayArray581.length) {
                return -2;
            }
            try {
                int[] ai = widget.anIntArrayArray581[i];
                int j = 0;
                int k = 0;
                int l = 0;
                do {
                    int i1 = ai[k++];
                    int j1 = 0;
                    byte byte0 = 0;
                    if (i1 == 0) {
                        return j;
                    }
                    if (i1 == 1) {
                        j1 = anIntArray908[ai[k++]];
                    }
                    if (i1 == 2) {
                        j1 = anIntArray983[ai[k++]];
                    }
                    if (i1 == 3) {
                        j1 = anIntArray1045[ai[k++]];
                    }
                    if (i1 == 4) {
                        Widget widget_1 = Widget.aWidgetArray533[ai[k++]];
                        int j2 = ai[k++];
                        if (j2 >= 0 && j2 < ItemDefinition.anInt669 && (!ItemDefinition.method505(j2).aBoolean650 || aBoolean953)) {
                            for (int i3 = 0; i3 < widget_1.anIntArray576.length; i3++) {
                                if (widget_1.anIntArray576[i3] == j2 + 1) {
                                    j1 += widget_1.anIntArray579[i3];
                                }
                            }
                        }
                    }
                    if (i1 == 5) {
                        j1 = anIntArray1149[ai[k++]];
                    }
                    if (i1 == 6) {
                        j1 = anIntArray968[anIntArray983[ai[k++]] - 1];
                    }
                    if (i1 == 7) {
                        j1 = (anIntArray1149[ai[k++]] * 100) / 46875;
                    }
                    if (i1 == 8) {
                        j1 = aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1697;
                    }
                    if (i1 == 9) {
                        for (int k1 = 0; k1 < Class44.anInt725; k1++) {
                            if (Class44.aBooleanArray727[k1]) {
                                j1 += anIntArray983[k1];
                            }
                        }
                    }
                    if (i1 == 10) {
                        Widget widget_2 = Widget.aWidgetArray533[ai[k++]];
                        int k2 = ai[k++] + 1;
                        if (k2 >= 0 && k2 < ItemDefinition.anInt669 && (!ItemDefinition.method505(k2).aBoolean650 || aBoolean953)) {
                            for (int j3 = 0; j3 < widget_2.anIntArray576.length; j3++) {
                                if (widget_2.anIntArray576[j3] != k2) {
                                    continue;
                                }
                                j1 = 0x3b9ac9ff;
                                break;
                            }
                        }
                    }
                    if (i1 == 11) {
                        j1 = anInt1192;
                    }
                    if (i1 == 12) {
                        j1 = anInt1288;
                    }
                    if (i1 == 13) {
                        int l1 = anIntArray1149[ai[k++]];
                        int l2 = ai[k++];
                        j1 = (l1 & 1 << l2) == 0 ? 0 : 1;
                    }
                    if (i1 == 14) {
                        int i2 = ai[k++];
                        Class26 class26 = Class26.aClass26Array439[i2];
                        int k3 = class26.anInt441;
                        int l3 = class26.anInt442;
                        int i4 = class26.anInt443;
                        int j4 = anIntArray1271[i4 - l3];
                        j1 = anIntArray1149[k3] >> l3 & j4;
                    }
                    if (i1 == 15) {
                        byte0 = 1;
                    }
                    if (i1 == 16) {
                        byte0 = 2;
                    }
                    if (i1 == 17) {
                        byte0 = 3;
                    }
                    if (i1 == 18) {
                        j1 = (aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 >> 7) + anInt1083;
                    }
                    if (i1 == 19) {
                        j1 = (aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 >> 7) + anInt1084;
                    }
                    if (i1 == 20) {
                        j1 = ai[k++];
                    }
                    if (byte0 == 0) {
                        if (l == 0) {
                            j += j1;
                        }
                        if (l == 1) {
                            j -= j1;
                        }
                        if (l == 2 && j1 != 0) {
                            j /= j1;
                        }
                        if (l == 3) {
                            j *= j1;
                        }
                        l = 0;
                    } else {
                        l = byte0;
                    }
                } while (true);
            } catch (Exception _ex) {
                return -1;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("69252, " + i + ", " + flag + ", " + widget + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method83(int i) {
        try {
            if (i >= 0) {
                aBoolean1240 = !aBoolean1240;
            }
            try {
                int j = aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 + anInt1075;
                int k = aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 + anInt1257;
                if (anInt1020 - j < -500 || anInt1020 - j > 500 || anInt1021 - k < -500 || anInt1021 - k > 500) {
                    anInt1020 = j;
                    anInt1021 = k;
                }
                if (anInt1020 != j) {
                    anInt1020 += (j - anInt1020) / 16;
                }
                if (anInt1021 != k) {
                    anInt1021 += (k - anInt1021) / 16;
                }
                if (super.anIntArray33[1] == 1) {
                    anInt923 += (-24 - anInt923) / 2;
                } else if (super.anIntArray33[2] == 1) {
                    anInt923 += (24 - anInt923) / 2;
                } else {
                    anInt923 /= 2;
                }
                if (super.anIntArray33[3] == 1) {
                    anInt924 += (12 - anInt924) / 2;
                } else if (super.anIntArray33[4] == 1) {
                    anInt924 += (-12 - anInt924) / 2;
                } else {
                    anInt924 /= 2;
                }
                anInt922 = anInt922 + anInt923 / 2 & 0x7ff;
                anInt921 += anInt924 / 2;
                if (anInt921 < 128) {
                    anInt921 = 128;
                }
                if (anInt921 > 383) {
                    anInt921 = 383;
                }
                int l = anInt1020 >> 7;
                int i1 = anInt1021 >> 7;
                int j1 = method80(anInt1166, 781, anInt1021, anInt1020);
                int k1 = 0;
                if (l > 3 && i1 > 3 && l < 100 && i1 < 100) {
                    for (int l1 = l - 4; l1 <= l + 4; l1++) {
                        for (int j2 = i1 - 4; j2 <= i1 + 4; j2++) {
                            int k2 = anInt1166;
                            if (k2 < 3 && (aByteArrayArrayArray1164[1][l1][j2] & 2) == 2) {
                                k2++;
                            }
                            int l2 = j1 - anIntArrayArrayArray1267[k2][l1][j2];
                            if (l2 > k1) {
                                k1 = l2;
                            }
                        }
                    }
                }
                int i2 = k1 * 192;
                if (i2 > 0x17f00) {
                    i2 = 0x17f00;
                }
                if (i2 < 32768) {
                    i2 = 32768;
                }
                if (i2 > anInt955) {
                    anInt955 += (i2 - anInt955) / 24;
                    return;
                }
                if (i2 < anInt955) {
                    anInt955 += (i2 - anInt955) / 80;
                    return;
                }
            } catch (Exception _ex) {
                Signlink.reportError("glfc_ex " + aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 + "," + aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 + "," + anInt1020 + "," + anInt1021 + "," + anInt984 + "," + anInt985 + "," + anInt1083 + "," + anInt1084);
                throw new RuntimeException("eek");
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("1836, " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void run() {
        if (aBoolean1046) {
            method55(anInt1170);
            return;
        } else {
            super.run();
            return;
        }
    }

    public void method84(int i, int j, int k, int l, int i1, int j1, int k1,
                         int l1, int i2, int j2) {
        try {
            if (i2 >= 0) {
                method6();
            }
            Class13_Sub3 class13_sub3 = null;
            for (Class13_Sub3 class13_sub3_1 = (Class13_Sub3) aClass12_1152.method248(); class13_sub3_1 != null; class13_sub3_1 = (Class13_Sub3) aClass12_1152.method250(-475)) {
                if (class13_sub3_1.anInt1363 != j1 || class13_sub3_1.anInt1365 != j || class13_sub3_1.anInt1366 != l || class13_sub3_1.anInt1364 != l1) {
                    continue;
                }
                class13_sub3 = class13_sub3_1;
                break;
            }
            if (class13_sub3 == null) {
                class13_sub3 = new Class13_Sub3();
                class13_sub3.anInt1363 = j1;
                class13_sub3.anInt1364 = l1;
                class13_sub3.anInt1365 = j;
                class13_sub3.anInt1366 = l;
                method124(class13_sub3, (byte) -56);
                aClass12_1152.method245(class13_sub3);
            }
            class13_sub3.anInt1368 = k;
            class13_sub3.anInt1370 = j2;
            class13_sub3.anInt1369 = i;
            class13_sub3.anInt1367 = k1;
            class13_sub3.anInt1371 = i1;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("32846, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + i2 + ", " + j2 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method86(boolean flag) {
        try {
            if (anInt1167 < 2 && anInt1025 == 0 && anInt973 == 0) {
                return;
            }
            String s;
            if (anInt1025 == 1 && anInt1167 < 2) {
                s = "Use " + aString1029 + " with...";
            } else if (anInt973 == 1 && anInt1167 < 2) {
                s = aString976 + "...";
            } else {
                s = aStringArray961[anInt1167 - 1];
            }
            if (anInt1167 > 2) {
                s = s + "@whi@ / " + (anInt1167 - 2) + " more options";
            }
            aClass13_Sub1_Sub4_Sub2_893.method390(true, 0xffffff, 15, 999, 4, s, pulseCycle / 1000);
            if (flag) {
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("65826, " + flag + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method87(byte byte0) {
        try {
            anInt1180 = 0;
            if (byte0 != 9) {
                anInt895 = 364;
            }
            int i = (aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1587 >> 7) + anInt1083;
            int j = (aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1588 >> 7) + anInt1084;
            if (i >= 3053 && i <= 3156 && j >= 3056 && j <= 3136) {
                anInt1180 = 1;
            }
            if (i >= 3072 && i <= 3118 && j >= 9492 && j <= 9535) {
                anInt1180 = 1;
            }
            if (anInt1180 == 1 && i >= 3139 && i <= 3199 && j >= 3008 && j <= 3062) {
                anInt1180 = 0;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("56729, " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method88(String s) {
        System.out.println(s);
        try {
            getAppletContext().showDocument(new URL(getCodeBase(), "loaderror_" + s + ".html"));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        do {
            try {
                Thread.sleep(1000L);
            } catch (Exception _ex) {
            }
        } while (true);
    }

    public void method89(int i) {
        try {
            if (i <= 0) {
                return;
            }
            for (int j = -1; j < anInt899; j++) {
                int k;
                if (j == -1) {
                    k = anInt897;
                } else {
                    k = playerList[j];
                }
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1 = players[k];
                if (class13_sub1_sub1_sub6_sub1 != null) {
                    method126(class13_sub1_sub1_sub6_sub1, 0, 1);
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("22285, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method10(int i) {
        try {
            if (i >= 0) {
                anInt1170 = -32;
            }
            aBoolean1216 = true;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("22953, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method90(int i) {
        try {
            if (aClass31_1214 != null) {
                return;
            }
            method41(88);
            super.aClass31_16 = null;
            aClass31_1245 = null;
            aClass31_1246 = null;
            aClass31_1247 = null;
            aClass31_1248 = null;
            aClass31_1249 = null;
            aClass31_1250 = null;
            aClass31_1251 = null;
            aClass31_1252 = null;
            aClass31_1253 = null;
            aClass31_1214 = new Class31(true, 479, method11(736), 96);
            aClass31_1212 = new Class31(true, 172, method11(736), 156);
            Class13_Sub1_Sub4.method354(false);
            aClass13_Sub1_Sub4_Sub3_1209.method401(0, (byte) 83, 0);
            aClass31_1211 = new Class31(true, 190, method11(736), 261);
            aClass31_1213 = new Class31(true, 512, method11(736), 334);
            Class13_Sub1_Sub4.method354(false);
            for (aClass31_1186 = new Class31(true, 496, method11(736), 50); i >= 0; ) {
                return;
            }
            aClass31_1187 = new Class31(true, 269, method11(736), 37);
            aClass31_1188 = new Class31(true, 249, method11(736), 45);
            aBoolean1216 = true;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("68348, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method91(boolean flag) {
        try {
            try {
                anInt1191 = -1;
                aClass12_982.method252();
                aClass12_1199.method252();
                Class13_Sub1_Sub4_Sub1.method366(0);
                method65(509);
                aClass10_1198.method194(false);
                System.gc();
                for (int i = 0; i < 4; i++) {
                    aClass39Array947[i].method516();
                }
                for (int l = 0; l < 4; l++) {
                    for (int k1 = 0; k1 < 104; k1++) {
                        for (int j2 = 0; j2 < 104; j2++) {
                            aByteArrayArrayArray1164[l][k1][j2] = 0;
                        }
                    }
                }
                Class25 class25 = new Class25(anIntArrayArrayArray1267, 104, 104, -75, aByteArrayArrayArray1164);
                int k2 = aByteArrayArray1146.length;
                aBuffer_928.method300(63);
                if (!aBoolean971) {
                    for (int i3 = 0; i3 < k2; i3++) {
                        int i4 = (anIntArray937[i3] >> 8) * 64 - anInt1083;
                        int k5 = (anIntArray937[i3] & 0xff) * 64 - anInt1084;
                        byte[] abyte0 = aByteArrayArray1146[i3];
                        if (abyte0 != null) {
                            class25.method470(abyte0, aByte1066, (anInt985 - 6) * 8, (anInt984 - 6) * 8, i4, k5, aClass39Array947);
                        }
                    }
                    for (int j4 = 0; j4 < k2; j4++) {
                        int l5 = (anIntArray937[j4] >> 8) * 64 - anInt1083;
                        int k7 = (anIntArray937[j4] & 0xff) * 64 - anInt1084;
                        byte[] abyte2 = aByteArrayArray1146[j4];
                        if (abyte2 == null && anInt985 < 800) {
                            class25.method459(l5, (byte) 46, 64, 64, k7);
                        }
                    }
                    aBuffer_928.method300(63);
                    for (int i6 = 0; i6 < k2; i6++) {
                        byte[] abyte1 = aByteArrayArray1179[i6];
                        if (abyte1 != null) {
                            int l8 = (anIntArray937[i6] >> 8) * 64 - anInt1083;
                            int k9 = (anIntArray937[i6] & 0xff) * 64 - anInt1084;
                            class25.method457(true, abyte1, aClass39Array947, k9, aClass10_1198, l8);
                        }
                    }
                }
                if (aBoolean971) {
                    for (int j3 = 0; j3 < 4; j3++) {
                        for (int k4 = 0; k4 < 13; k4++) {
                            for (int j6 = 0; j6 < 13; j6++) {
                                int l7 = anIntArrayArrayArray1226[j3][k4][j6];
                                if (l7 != -1) {
                                    int i9 = l7 >> 24 & 3;
                                    int l9 = l7 >> 1 & 3;
                                    int j10 = l7 >> 14 & 0x3ff;
                                    int l10 = l7 >> 3 & 0x7ff;
                                    int j11 = (j10 / 8 << 8) + l10 / 8;
                                    for (int l11 = 0; l11 < anIntArray937.length; l11++) {
                                        if (anIntArray937[l11] != j11 || aByteArrayArray1146[l11] == null) {
                                            continue;
                                        }
                                        class25.method455(j3, j6 * 8, i9, (j10 & 7) * 8, aByteArrayArray1146[l11], aClass39Array947, (l10 & 7) * 8, anInt1073, l9, k4 * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    for (int l4 = 0; l4 < 13; l4++) {
                        for (int k6 = 0; k6 < 13; k6++) {
                            int i8 = anIntArrayArrayArray1226[0][l4][k6];
                            if (i8 == -1) {
                                class25.method459(l4 * 8, (byte) 46, 8, 8, k6 * 8);
                            }
                        }
                    }
                    aBuffer_928.method300(63);
                    for (int l6 = 0; l6 < 4; l6++) {
                        for (int j8 = 0; j8 < 13; j8++) {
                            for (int j9 = 0; j9 < 13; j9++) {
                                int i10 = anIntArrayArrayArray1226[l6][j8][j9];
                                if (i10 != -1) {
                                    int k10 = i10 >> 24 & 3;
                                    int i11 = i10 >> 1 & 3;
                                    int k11 = i10 >> 14 & 0x3ff;
                                    int i12 = i10 >> 3 & 0x7ff;
                                    int j12 = (k11 / 8 << 8) + i12 / 8;
                                    for (int k12 = 0; k12 < anIntArray937.length; k12++) {
                                        if (anIntArray937[k12] != j12 || aByteArrayArray1179[k12] == null) {
                                            continue;
                                        }
                                        class25.method453((k11 & 7) * 8, aClass39Array947, i11, j9 * 8, aClass10_1198, k10, true, (i12 & 7) * 8, l6, j8 * 8, aByteArrayArray1179[k12]);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                aBuffer_928.method300(63);
                class25.method458(aClass10_1198, (byte) 6, aClass39Array947);
                aClass31_1213.method490(false);
                aBuffer_928.method300(63);
                int k3 = Class25.anInt426;
                if (k3 > anInt1166) {
                    k3 = anInt1166;
                }
                if (k3 < anInt1166 - 1) {
                    k3 = anInt1166 - 1;
                }
                if (aBoolean954) {
                    aClass10_1198.method195(Class25.anInt426, true);
                } else {
                    aClass10_1198.method195(0, true);
                }
                for (int i5 = 0; i5 < 104; i5++) {
                    for (int i7 = 0; i7 < 104; i7++) {
                        method52(i5, i7);
                    }
                }
                method96(true);
            } catch (Exception exception) {
            }
            Class14.aClass3_248.method174();
            if (super.aFrame_Sub1_18 != null) {
                aBuffer_928.method300(226);
                aBuffer_928.writeInt(0x3f008edd);
            }
            if (aBoolean954 && Signlink.cache_dat != null) {
                int j = aClass2_Sub1_873.method163(-29, 0);
                for (int i1 = 0; i1 < j; i1++) {
                    int l1 = aClass2_Sub1_873.method154(true, i1);
                    if ((l1 & 0x79) == 0) {
                        Class13_Sub1_Sub1_Sub4.method264(i1, anInt1093);
                    }
                }
            }
            System.gc();
            if (flag) {
                anInt1173 = isaacCipher.method190();
            }
            Class13_Sub1_Sub4_Sub1.method367((byte) 71, 20);
            aClass2_Sub1_873.method166(anInt1150);
            int k = (anInt984 - 6) / 8 - 1;
            int j1 = (anInt984 + 6) / 8 + 1;
            int i2 = (anInt985 - 6) / 8 - 1;
            int l2 = (anInt985 + 6) / 8 + 1;
            if (aBoolean1051) {
                k = 49;
                j1 = 50;
                i2 = 49;
                l2 = 50;
            }
            for (int l3 = k; l3 <= j1; l3++) {
                for (int j5 = i2; j5 <= l2; j5++) {
                    if (l3 == k || l3 == j1 || j5 == i2 || j5 == l2) {
                        int j7 = aClass2_Sub1_873.method160(l3, j5, 0, 8347);
                        if (j7 != -1) {
                            aClass2_Sub1_873.method157(3, j7, 0);
                        }
                        int k8 = aClass2_Sub1_873.method160(l3, j5, 1, 8347);
                        if (k8 != -1) {
                            aClass2_Sub1_873.method157(3, k8, 0);
                        }
                    }
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("38100, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method92(int i, boolean flag, int j, int k) {
        try {
            int l = i >> 14 & 0x7fff;
            int i1 = aClass10_1198.method224(anInt1166, j, k, i);
            if (i1 == -1) {
                return false;
            }
            int j1 = i1 & 0x1f;
            int k1 = i1 >> 6 & 3;
            if (j1 == 10 || j1 == 11 || j1 == 22) {
                Class14 class14 = Class14.method418(l);
                int l1;
                int i2;
                if (k1 == 0 || k1 == 2) {
                    l1 = class14.anInt259;
                    i2 = class14.anInt253;
                } else {
                    l1 = class14.anInt253;
                    i2 = class14.anInt259;
                }
                int j2 = class14.anInt285;
                if (k1 != 0) {
                    j2 = (j2 << k1 & 0xf) + (j2 >> 4 - k1);
                }
                method46(false, i2, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], j2, 2, 0, l1, k, j, 0);
            } else {
                method46(false, 0, -220, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0], aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0], 0, 2, k1, 0, k, j, j1 + 1);
            }
            anInt929 = super.anInt30;
            anInt930 = super.anInt31;
            anInt932 = 2;
            anInt931 = 0;
            if (flag) {
                anInt1014 = isaacCipher.method190();
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("53221, " + i + ", " + flag + ", " + j + ", " + k + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method93(int i) {
        try {
            if (anInt1227 != 2) {
                return;
            }
            method144((anInt1133 - anInt1084 << 7) + anInt1136, anInt1134 * 2, (anInt1132 - anInt1083 << 7) + anInt1135, aByte1063);
            if (i >= 0) {
                anInt1265 = 132;
            }
            if (anInt1078 > -1 && pulseCycle % 20 < 10) {
                aClass13_Sub1_Sub4_Sub4Array1236[2].method408(anInt1079 - 28, (byte) 83, anInt1078 - 12);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("61613, " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method94(byte byte0) {
        try {
            anInt1101 = 0;
            for (int i = -1; i < anInt899 + anInt1284; i++) {
                Object obj;
                if (i == -1) {
                    obj = aClass13_Sub1_Sub1_Sub6_Sub1_997;
                } else if (i < anInt899) {
                    obj = players[playerList[i]];
                } else {
                    obj = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[anIntArray1285[i - anInt899]];
                }
                if (obj == null || !((Class13_Sub1_Sub1_Sub6) (obj)).method291(true)) {
                    continue;
                }
                if (obj instanceof Class13_Sub1_Sub1_Sub6_Sub2) {
                    Class47 class47 = ((Class13_Sub1_Sub1_Sub6_Sub2) obj).aClass47_1717;
                    if (class47.anIntArray751 != null) {
                        class47 = class47.method584((byte) 0);
                    }
                    if (class47 == null) {
                        continue;
                    }
                }
                if (i < anInt899) {
                    int k = 30;
                    Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1 = (Class13_Sub1_Sub1_Sub6_Sub1) obj;
                    if (class13_sub1_sub1_sub6_sub1.anInt1715 != 0) {
                        method143(((Class13_Sub1_Sub1_Sub6) (obj)), ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1590 + 15, (byte) 101);
                        if (anInt1078 > -1) {
                            for (int l1 = 0; l1 < 8; l1++) {
                                if ((class13_sub1_sub1_sub6_sub1.anInt1715 & 1 << l1) != 0) {
                                    aClass13_Sub1_Sub4_Sub4Array1236[l1].method408(anInt1079 - k, (byte) 83, anInt1078 - 12);
                                    k -= 25;
                                }
                            }
                        }
                    }
                    if (i >= 0 && anInt1227 == 10 && anInt999 == playerList[i]) {
                        method143(((Class13_Sub1_Sub1_Sub6) (obj)), ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1590 + 15, (byte) 101);
                        if (anInt1078 > -1) {
                            aClass13_Sub1_Sub4_Sub4Array1236[7].method408(anInt1079 - k, (byte) 83, anInt1078 - 12);
                        }
                    }
                } else {
                    Class47 class47_1 = ((Class13_Sub1_Sub1_Sub6_Sub2) obj).aClass47_1717;
                    if (class47_1.anInt749 >= 0 && class47_1.anInt749 < aClass13_Sub1_Sub4_Sub4Array1236.length) {
                        method143(((Class13_Sub1_Sub1_Sub6) (obj)), ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1590 + 15, (byte) 101);
                        if (anInt1078 > -1) {
                            aClass13_Sub1_Sub4_Sub4Array1236[class47_1.anInt749].method408(anInt1079 - 30, (byte) 83, anInt1078 - 12);
                        }
                    }
                    if (anInt1227 == 1 && anInt1015 == anIntArray1285[i - anInt899] && pulseCycle % 20 < 10) {
                        method143(((Class13_Sub1_Sub1_Sub6) (obj)), ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1590 + 15, (byte) 101);
                        if (anInt1078 > -1) {
                            aClass13_Sub1_Sub4_Sub4Array1236[2].method408(anInt1079 - 28, (byte) 83, anInt1078 - 12);
                        }
                    }
                }
                if (((Class13_Sub1_Sub1_Sub6) (obj)).aString1586 != null && (i >= anInt899 || anInt1159 == 0 || anInt1159 == 3 || anInt1159 == 1 && method71(((Class13_Sub1_Sub1_Sub6_Sub1) obj).aString1689, 771))) {
                    method143(((Class13_Sub1_Sub1_Sub6) (obj)), ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1590, (byte) 101);
                    if (anInt1078 > -1 && anInt1101 < anInt1102) {
                        anIntArray1106[anInt1101] = aClass13_Sub1_Sub4_Sub2_893.method384(((Class13_Sub1_Sub1_Sub6) (obj)).aString1586, 0) / 2;
                        anIntArray1105[anInt1101] = aClass13_Sub1_Sub4_Sub2_893.anInt1659;
                        anIntArray1103[anInt1101] = anInt1078;
                        anIntArray1104[anInt1101] = anInt1079;
                        anIntArray1107[anInt1101] = ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1566;
                        anIntArray1108[anInt1101] = ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1617;
                        anIntArray1109[anInt1101] = ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1603;
                        aStringArray1110[anInt1101++] = ((Class13_Sub1_Sub1_Sub6) (obj)).aString1586;
                        if (anInt1289 == 0 && ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1617 >= 1 && ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1617 <= 3) {
                            anIntArray1105[anInt1101] += 10;
                            anIntArray1104[anInt1101] += 5;
                        }
                        if (anInt1289 == 0 && ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1617 == 4) {
                            anIntArray1106[anInt1101] = 60;
                        }
                        if (anInt1289 == 0 && ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1617 == 5) {
                            anIntArray1105[anInt1101] += 5;
                        }
                    }
                }
                if (((Class13_Sub1_Sub1_Sub6) (obj)).anInt1604 > pulseCycle) {
                    method143(((Class13_Sub1_Sub1_Sub6) (obj)), ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1590 + 15, (byte) 101);
                    if (anInt1078 > -1) {
                        int l = (((Class13_Sub1_Sub1_Sub6) (obj)).anInt1605 * 30) / ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1606;
                        if (l > 30) {
                            l = 30;
                        }
                        Class13_Sub1_Sub4.method356(false, anInt1078 - 15, anInt1079 - 3, 65280, l, 5);
                        Class13_Sub1_Sub4.method356(false, (anInt1078 - 15) + l, anInt1079 - 3, 0xff0000, 30 - l, 5);
                    }
                }
                for (int i1 = 0; i1 < 4; i1++) {
                    if (((Class13_Sub1_Sub1_Sub6) (obj)).anIntArray1614[i1] > pulseCycle) {
                        method143(((Class13_Sub1_Sub1_Sub6) (obj)), ((Class13_Sub1_Sub1_Sub6) (obj)).anInt1590 / 2, (byte) 101);
                        if (anInt1078 > -1) {
                            if (i1 == 1) {
                                anInt1079 -= 20;
                            }
                            if (i1 == 2) {
                                anInt1078 -= 15;
                                anInt1079 -= 10;
                            }
                            if (i1 == 3) {
                                anInt1078 += 15;
                                anInt1079 -= 10;
                            }
                            aClass13_Sub1_Sub4_Sub4Array1266[((Class13_Sub1_Sub1_Sub6) (obj)).anIntArray1613[i1]].method408(anInt1079 - 12, (byte) 83, anInt1078 - 12);
                            aClass13_Sub1_Sub4_Sub2_891.method381(anInt1078, 0, 6, anInt1079 + 4, String.valueOf(((Class13_Sub1_Sub1_Sub6) (obj)).anIntArray1612[i1]));
                            aClass13_Sub1_Sub4_Sub2_891.method381(anInt1078 - 1, 0xffffff, 6, anInt1079 + 3, String.valueOf(((Class13_Sub1_Sub1_Sub6) (obj)).anIntArray1612[i1]));
                        }
                    }
                }
            }
            for (int j = 0; j < anInt1101; j++) {
                int j1 = anIntArray1103[j];
                int k1 = anIntArray1104[j];
                int i2 = anIntArray1106[j];
                int j2 = anIntArray1105[j];
                boolean flag = true;
                while (flag) {
                    flag = false;
                    for (int k2 = 0; k2 < j; k2++) {
                        if (k1 + 2 > anIntArray1104[k2] - anIntArray1105[k2] && k1 - j2 < anIntArray1104[k2] + 2 && j1 - i2 < anIntArray1103[k2] + anIntArray1106[k2] && j1 + i2 > anIntArray1103[k2] - anIntArray1106[k2] && anIntArray1104[k2] - anIntArray1105[k2] < k1) {
                            k1 = anIntArray1104[k2] - anIntArray1105[k2];
                            flag = true;
                        }
                    }
                }
                anInt1078 = anIntArray1103[j];
                anInt1079 = anIntArray1104[j] = k1;
                String s = aStringArray1110[j];
                if (anInt1289 == 0) {
                    int l2 = 0xffff00;
                    if (anIntArray1107[j] < 6) {
                        l2 = anIntArray1178[anIntArray1107[j]];
                    }
                    if (anIntArray1107[j] == 6) {
                        l2 = anInt979 % 20 >= 10 ? 0xffff00 : 0xff0000;
                    }
                    if (anIntArray1107[j] == 7) {
                        l2 = anInt979 % 20 >= 10 ? 65535 : 255;
                    }
                    if (anIntArray1107[j] == 8) {
                        l2 = anInt979 % 20 >= 10 ? 0x80ff80 : 45056;
                    }
                    if (anIntArray1107[j] == 9) {
                        int i3 = 150 - anIntArray1109[j];
                        if (i3 < 50) {
                            l2 = 0xff0000 + 1280 * i3;
                        } else if (i3 < 100) {
                            l2 = 0xffff00 - 0x50000 * (i3 - 50);
                        } else if (i3 < 150) {
                            l2 = 65280 + 5 * (i3 - 100);
                        }
                    }
                    if (anIntArray1107[j] == 10) {
                        int j3 = 150 - anIntArray1109[j];
                        if (j3 < 50) {
                            l2 = 0xff0000 + 5 * j3;
                        } else if (j3 < 100) {
                            l2 = 0xff00ff - 0x50000 * (j3 - 50);
                        } else if (j3 < 150) {
                            l2 = (255 + 0x50000 * (j3 - 100)) - 5 * (j3 - 100);
                        }
                    }
                    if (anIntArray1107[j] == 11) {
                        int k3 = 150 - anIntArray1109[j];
                        if (k3 < 50) {
                            l2 = 0xffffff - 0x50005 * k3;
                        } else if (k3 < 100) {
                            l2 = 65280 + 0x50005 * (k3 - 50);
                        } else if (k3 < 150) {
                            l2 = 0xffffff - 0x50000 * (k3 - 100);
                        }
                    }
                    if (anIntArray1108[j] == 0) {
                        aClass13_Sub1_Sub4_Sub2_893.method381(anInt1078, 0, 6, anInt1079 + 1, s);
                        aClass13_Sub1_Sub4_Sub2_893.method381(anInt1078, l2, 6, anInt1079, s);
                    }
                    if (anIntArray1108[j] == 1) {
                        aClass13_Sub1_Sub4_Sub2_893.method386(anInt1079 + 1, 0, -933, anInt979, anInt1078, s);
                        aClass13_Sub1_Sub4_Sub2_893.method386(anInt1079, l2, -933, anInt979, anInt1078, s);
                    }
                    if (anIntArray1108[j] == 2) {
                        aClass13_Sub1_Sub4_Sub2_893.method387(anInt1079 + 1, -11986, s, anInt979, 0, anInt1078);
                        aClass13_Sub1_Sub4_Sub2_893.method387(anInt1079, -11986, s, anInt979, l2, anInt1078);
                    }
                    if (anIntArray1108[j] == 3) {
                        aClass13_Sub1_Sub4_Sub2_893.method388(150 - anIntArray1109[j], s, 979, anInt1078, anInt1079 + 1, anInt979, 0);
                        aClass13_Sub1_Sub4_Sub2_893.method388(150 - anIntArray1109[j], s, 979, anInt1078, anInt1079, anInt979, l2);
                    }
                    if (anIntArray1108[j] == 4) {
                        int l3 = aClass13_Sub1_Sub4_Sub2_893.method384(s, 0);
                        int j4 = ((150 - anIntArray1109[j]) * (l3 + 100)) / 150;
                        Class13_Sub1_Sub4.method353(anInt1078 + 50, (byte) -12, 334, 0, anInt1078 - 50);
                        aClass13_Sub1_Sub4_Sub2_893.method385((byte) -96, s, 0, (anInt1078 + 50) - j4, anInt1079 + 1);
                        aClass13_Sub1_Sub4_Sub2_893.method385((byte) -96, s, l2, (anInt1078 + 50) - j4, anInt1079);
                        Class13_Sub1_Sub4.method352(4);
                    }
                    if (anIntArray1108[j] == 5) {
                        int i4 = 150 - anIntArray1109[j];
                        int k4 = 0;
                        if (i4 < 25) {
                            k4 = i4 - 25;
                        } else if (i4 > 125) {
                            k4 = i4 - 125;
                        }
                        Class13_Sub1_Sub4.method353(512, (byte) -12, anInt1079 + 5, anInt1079 - aClass13_Sub1_Sub4_Sub2_893.anInt1659 - 1, 0);
                        aClass13_Sub1_Sub4_Sub2_893.method381(anInt1078, 0, 6, anInt1079 + 1 + k4, s);
                        aClass13_Sub1_Sub4_Sub2_893.method381(anInt1078, l2, 6, anInt1079 + k4, s);
                        Class13_Sub1_Sub4.method352(4);
                    }
                } else {
                    aClass13_Sub1_Sub4_Sub2_893.method381(anInt1078, 0, 6, anInt1079 + 1, s);
                    aClass13_Sub1_Sub4_Sub2_893.method381(anInt1078, 0xffff00, 6, anInt1079, s);
                }
            }
            if (byte0 != 6) {
                aClass12ArrayArrayArray969 = null;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("76328, " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method95(boolean flag) {
        try {
            if (flag) {
                opcode = -1;
            }
            if (super.anInt29 == 1) {
                if (super.anInt30 >= 6 && super.anInt30 <= 106 && super.anInt31 >= 467 && super.anInt31 <= 499) {
                    anInt1159 = (anInt1159 + 1) % 4;
                    aBoolean1137 = true;
                    aBoolean1169 = true;
                    aBuffer_928.method300(104);
                    aBuffer_928.writeByte(anInt1159);
                    aBuffer_928.writeByte(anInt1129);
                    aBuffer_928.writeByte(anInt1290);
                }
                if (super.anInt30 >= 135 && super.anInt30 <= 235 && super.anInt31 >= 467 && super.anInt31 <= 499) {
                    anInt1129 = (anInt1129 + 1) % 3;
                    aBoolean1137 = true;
                    aBoolean1169 = true;
                    aBuffer_928.method300(104);
                    aBuffer_928.writeByte(anInt1159);
                    aBuffer_928.writeByte(anInt1129);
                    aBuffer_928.writeByte(anInt1290);
                }
                if (super.anInt30 >= 273 && super.anInt30 <= 373 && super.anInt31 >= 467 && super.anInt31 <= 499) {
                    anInt1290 = (anInt1290 + 1) % 3;
                    aBoolean1137 = true;
                    aBoolean1169 = true;
                    aBuffer_928.method300(104);
                    aBuffer_928.writeByte(anInt1159);
                    aBuffer_928.writeByte(anInt1129);
                    aBuffer_928.writeByte(anInt1290);
                }
                if (super.anInt30 >= 412 && super.anInt30 <= 512 && super.anInt31 >= 467 && super.anInt31 <= 499) {
                    if (anInt1217 == -1) {
                        method140(6);
                        aString1230 = "";
                        aBoolean1034 = false;
                        for (int i = 0; i < Widget.aWidgetArray533.length; i++) {
                            if (Widget.aWidgetArray533[i] != null && Widget.aWidgetArray533[i].anInt577 == 600) {
                                anInt1165 = anInt1217 = Widget.aWidgetArray533[i].anInt573;
                                return;
                            }
                        }
                        return;
                    } else {
                        method70(0, "Please close the interface you have open before using 'report abuse'", "", (byte) 117);
                        return;
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("35365, " + flag + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method96(boolean flag) {
        try {
            aBoolean851 &= flag;
            for (Class13_Sub3 class13_sub3 = (Class13_Sub3) aClass12_1152.method248(); class13_sub3 != null; class13_sub3 = (Class13_Sub3) aClass12_1152.method250(-475)) {
                if (class13_sub3.anInt1371 == -1) {
                    class13_sub3.anInt1367 = 0;
                    method124(class13_sub3, (byte) -56);
                } else {
                    class13_sub3.method253();
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("65449, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method97(int i) {
        try {
            while (i >= 0) {
                aBuffer_928.writeByte(238);
            }
            char c = '\u0100';
            if (anInt1176 > 0) {
                for (int j = 0; j < 256; j++) {
                    if (anInt1176 > 768) {
                        anIntArray843[j] = method15(anIntArray845[j], anIntArray844[j], 1024 - anInt1176, 7340);
                    } else if (anInt1176 > 256) {
                        anIntArray843[j] = anIntArray845[j];
                    } else {
                        anIntArray843[j] = method15(anIntArray844[j], anIntArray845[j], 256 - anInt1176, 7340);
                    }
                }
            } else if (anInt1177 > 0) {
                for (int k = 0; k < 256; k++) {
                    if (anInt1177 > 768) {
                        anIntArray843[k] = method15(anIntArray846[k], anIntArray844[k], 1024 - anInt1177, 7340);
                    } else if (anInt1177 > 256) {
                        anIntArray843[k] = anIntArray846[k];
                    } else {
                        anIntArray843[k] = method15(anIntArray844[k], anIntArray846[k], 256 - anInt1177, 7340);
                    }
                }
            } else {
                for (int l = 0; l < 256; l++) {
                    anIntArray843[l] = anIntArray844[l];
                }
            }
            for (int i1 = 0; i1 < 33920; i1++) {
                aClass31_1248.anIntArray482[i1] = aClass13_Sub1_Sub4_Sub4_925.anIntArray1680[i1];
            }
            int j1 = 0;
            int k1 = 1152;
            for (int l1 = 1; l1 < c - 1; l1++) {
                int i2 = (anIntArray915[l1] * (c - l1)) / c;
                int k2 = 22 + i2;
                if (k2 < 0) {
                    k2 = 0;
                }
                j1 += k2;
                for (int i3 = k2; i3 < 128; i3++) {
                    int k3 = anIntArray1130[j1++];
                    if (k3 != 0) {
                        int i4 = k3;
                        int k4 = 256 - k3;
                        k3 = anIntArray843[k3];
                        int i5 = aClass31_1248.anIntArray482[k1];
                        aClass31_1248.anIntArray482[k1++] = ((k3 & 0xff00ff) * i4 + (i5 & 0xff00ff) * k4 & 0xff00ff00) + ((k3 & 0xff00) * i4 + (i5 & 0xff00) * k4 & 0xff0000) >> 8;
                    } else {
                        k1++;
                    }
                }
                k1 += k2;
            }
            aClass31_1248.method491(super.aGraphics15, 0, false, 0);
            for (int j2 = 0; j2 < 33920; j2++) {
                aClass31_1249.anIntArray482[j2] = aClass13_Sub1_Sub4_Sub4_926.anIntArray1680[j2];
            }
            j1 = 0;
            k1 = 1176;
            for (int l2 = 1; l2 < c - 1; l2++) {
                int j3 = (anIntArray915[l2] * (c - l2)) / c;
                int l3 = 103 - j3;
                k1 += j3;
                for (int j4 = 0; j4 < l3; j4++) {
                    int l4 = anIntArray1130[j1++];
                    if (l4 != 0) {
                        int j5 = l4;
                        int k5 = 256 - l4;
                        l4 = anIntArray843[l4];
                        int l5 = aClass31_1249.anIntArray482[k1];
                        aClass31_1249.anIntArray482[k1++] = ((l4 & 0xff00ff) * j5 + (l5 & 0xff00ff) * k5 & 0xff00ff00) + ((l4 & 0xff00) * j5 + (l5 & 0xff00) * k5 & 0xff0000) >> 8;
                    } else {
                        k1++;
                    }
                }
                j1 += 128 - l3;
                k1 += 128 - l3 - j3;
            }
            aClass31_1249.method491(super.aGraphics15, 0, false, 637);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("15285, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method98(boolean flag, int i) {
        try {
            aBoolean851 &= flag;
            if (!aBoolean954) {
                if (Class13_Sub1_Sub4_Sub1.anIntArray1644[17] >= i) {
                    Class13_Sub1_Sub4_Sub3 class13_sub1_sub4_sub3 = Class13_Sub1_Sub4_Sub1.aClass13_Sub1_Sub4_Sub3Array1638[17];
                    int j = class13_sub1_sub4_sub3.anInt1669 * class13_sub1_sub4_sub3.anInt1670 - 1;
                    int i1 = class13_sub1_sub4_sub3.anInt1669 * anInt1241 * 2;
                    byte[] abyte0 = class13_sub1_sub4_sub3.aByteArray1667;
                    byte[] abyte3 = aByteArray941;
                    for (int l1 = 0; l1 <= j; l1++) {
                        abyte3[l1] = abyte0[l1 - i1 & j];
                    }
                    class13_sub1_sub4_sub3.aByteArray1667 = abyte3;
                    aByteArray941 = abyte0;
                    Class13_Sub1_Sub4_Sub1.method370(false, 17);
                }
                if (Class13_Sub1_Sub4_Sub1.anIntArray1644[24] >= i) {
                    Class13_Sub1_Sub4_Sub3 class13_sub1_sub4_sub3_1 = Class13_Sub1_Sub4_Sub1.aClass13_Sub1_Sub4_Sub3Array1638[24];
                    int k = class13_sub1_sub4_sub3_1.anInt1669 * class13_sub1_sub4_sub3_1.anInt1670 - 1;
                    int j1 = class13_sub1_sub4_sub3_1.anInt1669 * anInt1241 * 2;
                    byte[] abyte1 = class13_sub1_sub4_sub3_1.aByteArray1667;
                    byte[] abyte4 = aByteArray941;
                    for (int i2 = 0; i2 <= k; i2++) {
                        abyte4[i2] = abyte1[i2 - j1 & k];
                    }
                    class13_sub1_sub4_sub3_1.aByteArray1667 = abyte4;
                    aByteArray941 = abyte1;
                    Class13_Sub1_Sub4_Sub1.method370(false, 24);
                    anInt1153++;
                    if (anInt1153 > 88) {
                        anInt1153 = 0;
                        aBuffer_928.method300(57);
                    }
                }
                if (Class13_Sub1_Sub4_Sub1.anIntArray1644[34] >= i) {
                    Class13_Sub1_Sub4_Sub3 class13_sub1_sub4_sub3_2 = Class13_Sub1_Sub4_Sub1.aClass13_Sub1_Sub4_Sub3Array1638[34];
                    int l = class13_sub1_sub4_sub3_2.anInt1669 * class13_sub1_sub4_sub3_2.anInt1670 - 1;
                    int k1 = class13_sub1_sub4_sub3_2.anInt1669 * anInt1241 * 2;
                    byte[] abyte2 = class13_sub1_sub4_sub3_2.aByteArray1667;
                    byte[] abyte5 = aByteArray941;
                    for (int j2 = 0; j2 <= l; j2++) {
                        abyte5[j2] = abyte2[j2 - k1 & l];
                    }
                    class13_sub1_sub4_sub3_2.aByteArray1667 = abyte5;
                    aByteArray941 = abyte2;
                    Class13_Sub1_Sub4_Sub1.method370(false, 34);
                    return;
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("82383, " + flag + ", " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method99(boolean flag) {
        try {
            for (int i = -1; i < anInt899; i++) {
                int j;
                if (i == -1) {
                    j = anInt897;
                } else {
                    j = playerList[i];
                }
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1 = players[j];
                if (class13_sub1_sub1_sub6_sub1 != null && class13_sub1_sub1_sub6_sub1.anInt1603 > 0) {
                    class13_sub1_sub1_sub6_sub1.anInt1603--;
                    if (class13_sub1_sub1_sub6_sub1.anInt1603 == 0) {
                        class13_sub1_sub1_sub6_sub1.aString1586 = null;
                    }
                }
            }
            if (flag) {
                aBoolean1147 = !aBoolean1147;
            }
            for (int k = 0; k < anInt1284; k++) {
                int l = anIntArray1285[k];
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[l];
                if (class13_sub1_sub1_sub6_sub2 != null && class13_sub1_sub1_sub6_sub2.anInt1603 > 0) {
                    class13_sub1_sub1_sub6_sub2.anInt1603--;
                    if (class13_sub1_sub1_sub6_sub2.anInt1603 == 0) {
                        class13_sub1_sub1_sub6_sub2.aString1586 = null;
                    }
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("76080, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method100(int i) {
        try {
            if (anInt920 == 0) {
                return;
            }
            int j = 0;
            if (i != -16609) {
                aBoolean1240 = !aBoolean1240;
            }
            if (anInt1269 != 0) {
                j = 1;
            }
            for (int k = 0; k < 100; k++) {
                if (aStringArray841[k] != null) {
                    int l = anIntArray839[k];
                    String s = aStringArray840[k];
                    boolean flag = false;
                    if (s != null && s.startsWith("@cr1@")) {
                        s = s.substring(5);
                        boolean flag1 = true;
                    }
                    if (s != null && s.startsWith("@cr2@")) {
                        s = s.substring(5);
                        byte byte0 = 2;
                    }
                    if ((l == 3 || l == 7) && (l == 7 || anInt1129 == 0 || anInt1129 == 1 && method71(s, 771))) {
                        int i1 = 329 - j * 13;
                        if (super.anInt23 > 4 && super.anInt24 - 4 > i1 - 10 && super.anInt24 - 4 <= i1 + 3) {
                            int j1 = aClass13_Sub1_Sub4_Sub2_892.method383(3, "From:  " + s + aStringArray841[k]) + 25;
                            if (j1 > 450) {
                                j1 = 450;
                            }
                            if (super.anInt23 < 4 + j1) {
                                if (anInt1037 >= 1) {
                                    aStringArray961[anInt1167] = "Report abuse @whi@" + s;
                                    anIntArray911[anInt1167] = 2820;
                                    anInt1167++;
                                }
                                aStringArray961[anInt1167] = "Add ignore @whi@" + s;
                                anIntArray911[anInt1167] = 2775;
                                anInt1167++;
                                aStringArray961[anInt1167] = "Add friend @whi@" + s;
                                anIntArray911[anInt1167] = 2039;
                                anInt1167++;
                            }
                        }
                        if (++j >= 5) {
                            return;
                        }
                    }
                    if ((l == 5 || l == 6) && anInt1129 < 2 && ++j >= 5) {
                        return;
                    }
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("23360, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void updateNpcs(int i, Buffer buffer, byte byte0) {
        try {
            anInt1071 = 0;
            if (byte0 != -48) {
                aBoolean1235 = !aBoolean1235;
            }
            anInt901 = 0;
            method142((byte) 73, i, buffer);
            method42(i, 1, buffer);
            method78(buffer, -8427, i);
            for (int j = 0; j < anInt1071; j++) {
                int k = anIntArray1072[j];
                if (aClass13_Sub1_Sub1_Sub6_Sub2Array1283[k].pulseCycle != pulseCycle) {
                    aClass13_Sub1_Sub1_Sub6_Sub2Array1283[k].aClass47_1717 = null;
                    aClass13_Sub1_Sub1_Sub6_Sub2Array1283[k] = null;
                }
            }
            if (buffer.position != i) {
                Signlink.reportError(username + " size mismatch in getnpcpos - pos:" + buffer.position + " psize:" + i);
                throw new RuntimeException("eek");
            }
            for (int l = 0; l < anInt1284; l++) {
                if (aClass13_Sub1_Sub1_Sub6_Sub2Array1283[anIntArray1285[l]] == null) {
                    Signlink.reportError(username + " null entry in npc list - pos:" + l + " size:" + anInt1284);
                    throw new RuntimeException("eek");
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("38167, " + i + ", " + buffer + ", " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method102(int i, int j, int k, int l, int i1, int j1, int k1,
                          int l1) {
        try {
            if (i1 <= 0) {
                aClass12ArrayArrayArray969 = null;
            }
            if (k >= 1 && k1 >= 1 && k <= 102 && k1 <= 102) {
                if (aBoolean954 && i != anInt1166) {
                    return;
                }
                int i2 = 0;
                byte byte0 = -1;
                boolean flag = false;
                boolean flag1 = false;
                if (j1 == 0) {
                    i2 = aClass10_1198.method220(i, k, k1);
                }
                if (j1 == 1) {
                    i2 = aClass10_1198.method221(i, k, (byte) 122, k1);
                }
                if (j1 == 2) {
                    i2 = aClass10_1198.method222(i, k, k1);
                }
                if (j1 == 3) {
                    i2 = aClass10_1198.method223(i, k, k1);
                }
                if (i2 != 0) {
                    int i3 = aClass10_1198.method224(i, k, k1, i2);
                    int j2 = i2 >> 14 & 0x7fff;
                    int k2 = i3 & 0x1f;
                    int l2 = i3 >> 6;
                    if (j1 == 0) {
                        aClass10_1198.method211(k1, 464, k, i);
                        Class14 class14 = Class14.method418(j2);
                        if (class14.aBoolean258) {
                            aClass39Array947[i].method521(aBoolean1147, l2, k1, k2, k, class14.aBoolean270);
                        }
                    }
                    if (j1 == 1) {
                        aClass10_1198.method212(k, k1, 7, i);
                    }
                    if (j1 == 2) {
                        aClass10_1198.method213(k1, i, (byte) 8, k);
                        Class14 class14_1 = Class14.method418(j2);
                        if (k + class14_1.anInt259 > 103 || k1 + class14_1.anInt259 > 103 || k + class14_1.anInt253 > 103 || k1 + class14_1.anInt253 > 103) {
                            return;
                        }
                        if (class14_1.aBoolean258) {
                            aClass39Array947[i].method522(k, class14_1.anInt253, l2, class14_1.aBoolean270, class14_1.anInt259, 6, k1);
                        }
                    }
                    if (j1 == 3) {
                        aClass10_1198.method214(k1, i, k, 480);
                        Class14 class14_2 = Class14.method418(j2);
                        if (class14_2.aBoolean258 && class14_2.aBoolean260) {
                            aClass39Array947[i].method524(k, true, k1);
                        }
                    }
                }
                if (l >= 0) {
                    int j3 = i;
                    if (j3 < 3 && (aByteArrayArrayArray1164[1][k][k1] & 2) == 2) {
                        j3++;
                    }
                    Class25.method454(l, l1, aClass39Array947[i], k1, j3, j, k, (byte) 75, aClass10_1198, i, anIntArrayArrayArray1267);
                    return;
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("17134, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method103(Class13_Sub1_Sub4_Sub3 class13_sub1_sub4_sub3, byte byte0) {
        try {
            int i = 256;
            if (byte0 != 9) {
                return;
            }
            for (int j = 0; j < anIntArray1043.length; j++) {
                anIntArray1043[j] = 0;
            }
            for (int k = 0; k < 5000; k++) {
                int l = (int) (Math.random() * 128D * (double) i);
                anIntArray1043[l] = (int) (Math.random() * 256D);
            }
            for (int i1 = 0; i1 < 20; i1++) {
                for (int j1 = 1; j1 < i - 1; j1++) {
                    for (int l1 = 1; l1 < 127; l1++) {
                        int j2 = l1 + (j1 << 7);
                        anIntArray1044[j2] = (anIntArray1043[j2 - 1] + anIntArray1043[j2 + 1] + anIntArray1043[j2 - 128] + anIntArray1043[j2 + 128]) / 4;
                    }
                }
                int[] ai = anIntArray1043;
                anIntArray1043 = anIntArray1044;
                anIntArray1044 = ai;
            }
            if (class13_sub1_sub4_sub3 != null) {
                int k1 = 0;
                for (int i2 = 0; i2 < class13_sub1_sub4_sub3.anInt1670; i2++) {
                    for (int k2 = 0; k2 < class13_sub1_sub4_sub3.anInt1669; k2++) {
                        if (class13_sub1_sub4_sub3.aByteArray1667[k1++] != 0) {
                            int l2 = k2 + 16 + class13_sub1_sub4_sub3.anInt1671;
                            int i3 = i2 + 16 + class13_sub1_sub4_sub3.anInt1672;
                            int j3 = l2 + (i3 << 7);
                            anIntArray1043[j3] = 0;
                        }
                    }
                }
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("64903, " + class13_sub1_sub4_sub3 + ", " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public String method104(int i) {
        try {
            i = 73 / i;
            if (Signlink.mainapp != null) {
                return Signlink.mainapp.getDocumentBase().getHost().toLowerCase();
            }
            if (super.aFrame_Sub1_18 != null) {
                return "runescape.com";
            } else {
                return super.getDocumentBase().getHost().toLowerCase();
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("3292, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method105(int i, Widget widget) {
        try {
            int j = widget.anInt577;
            if (i != 0) {
                method6();
            }
            if (j >= 1 && j <= 100 || j >= 701 && j <= 800) {
                if (j == 1 && anInt1055 == 0) {
                    widget.aString548 = "Loading friend list";
                    widget.anInt597 = 0;
                    return;
                }
                if (j == 1 && anInt1055 == 1) {
                    widget.aString548 = "Connecting to friendserver";
                    widget.anInt597 = 0;
                    return;
                }
                if (j == 2 && anInt1055 != 2) {
                    widget.aString548 = "Please wait...";
                    widget.anInt597 = 0;
                    return;
                }
                int k = anInt1054;
                if (anInt1055 != 2) {
                    k = 0;
                }
                if (j > 700) {
                    j -= 601;
                } else {
                    j--;
                }
                if (j >= k) {
                    widget.aString548 = "";
                    widget.anInt597 = 0;
                    return;
                } else {
                    widget.aString548 = aStringArray1003[j];
                    widget.anInt597 = 1;
                    return;
                }
            }
            if (j >= 101 && j <= 200 || j >= 801 && j <= 900) {
                int l = anInt1054;
                if (anInt1055 != 2) {
                    l = 0;
                }
                if (j > 800) {
                    j -= 701;
                } else {
                    j -= 101;
                }
                if (j >= l) {
                    widget.aString548 = "";
                    widget.anInt597 = 0;
                    return;
                }
                if (anIntArray850[j] == 0) {
                    widget.aString548 = "@red@Offline";
                } else if (anIntArray850[j] == anInt951) {
                    widget.aString548 = "@gre@World-" + (anIntArray850[j] - 9);
                } else {
                    widget.aString548 = "@yel@World-" + (anIntArray850[j] - 9);
                }
                widget.anInt597 = 1;
                return;
            }
            if (j == 203) {
                int i1 = anInt1054;
                if (anInt1055 != 2) {
                    i1 = 0;
                }
                widget.anInt598 = i1 * 15 + 20;
                if (widget.anInt598 <= widget.anInt586) {
                    widget.anInt598 = widget.anInt586 + 1;
                }
                return;
            }
            if (j >= 401 && j <= 500) {
                if ((j -= 401) == 0 && anInt1055 == 0) {
                    widget.aString548 = "Loading ignore list";
                    widget.anInt597 = 0;
                    return;
                }
                if (j == 1 && anInt1055 == 0) {
                    widget.aString548 = "Please wait...";
                    widget.anInt597 = 0;
                    return;
                }
                int j1 = anInt1098;
                if (anInt1055 == 0) {
                    j1 = 0;
                }
                if (j >= j1) {
                    widget.aString548 = "";
                    widget.anInt597 = 0;
                    return;
                } else {
                    widget.aString548 = Class24.method450(Class24.method447(aLongArray990[j], 0), 0);
                    widget.anInt597 = 1;
                    return;
                }
            }
            if (j == 503) {
                widget.anInt598 = anInt1098 * 15 + 20;
                if (widget.anInt598 <= widget.anInt586) {
                    widget.anInt598 = widget.anInt586 + 1;
                }
                return;
            }
            if (j == 327) {
                widget.anInt535 = 150;
                widget.anInt536 = (int) (Math.sin((double) pulseCycle / 40D) * 256D) & 0x7ff;
                if (aBoolean1099) {
                    for (int k1 = 0; k1 < 7; k1++) {
                        int l1 = anIntArray1011[k1];
                        if (l1 >= 0 && !Class4.aClass4Array65[l1].method177(true)) {
                            return;
                        }
                    }
                    aBoolean1099 = false;
                    Class13_Sub1_Sub1_Sub4[] aclass13_sub1_sub1_sub4 = new Class13_Sub1_Sub1_Sub4[7];
                    int i2 = 0;
                    for (int j2 = 0; j2 < 7; j2++) {
                        int k2 = anIntArray1011[j2];
                        if (k2 >= 0) {
                            aclass13_sub1_sub1_sub4[i2++] = Class4.aClass4Array65[k2].method178(0);
                        }
                    }
                    Class13_Sub1_Sub1_Sub4 class13_sub1_sub1_sub4 = new Class13_Sub1_Sub1_Sub4(i2, (byte) 61, aclass13_sub1_sub1_sub4);
                    for (int l2 = 0; l2 < 5; l2++) {
                        if (anIntArray1190[l2] != 0) {
                            class13_sub1_sub1_sub4.method279(anIntArrayArray829[l2][0], anIntArrayArray829[l2][anIntArray1190[l2]]);
                            if (l2 == 1) {
                                class13_sub1_sub1_sub4.method279(anIntArray913[0], anIntArray913[anIntArray1190[l2]]);
                            }
                        }
                    }
                    class13_sub1_sub1_sub4.method272(true);
                    class13_sub1_sub1_sub4.method273(Class50.aClass50Array800[aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1584].anIntArray802[0], false);
                    class13_sub1_sub1_sub4.method282(64, 850, -30, -50, -30, true);
                    widget.modelType = 5;
                    widget.anInt542 = 0;
                    Widget.method498(5, class13_sub1_sub1_sub4, anInt1138, 0);
                }
                return;
            }
            if (j == 324) {
                if (aClass13_Sub1_Sub4_Sub4_1262 == null) {
                    aClass13_Sub1_Sub4_Sub4_1262 = widget.aClass13_Sub1_Sub4_Sub4_569;
                    aClass13_Sub1_Sub4_Sub4_1263 = widget.aClass13_Sub1_Sub4_Sub4_565;
                }
                if (aBoolean1068) {
                    widget.aClass13_Sub1_Sub4_Sub4_569 = aClass13_Sub1_Sub4_Sub4_1263;
                    return;
                } else {
                    widget.aClass13_Sub1_Sub4_Sub4_569 = aClass13_Sub1_Sub4_Sub4_1262;
                    return;
                }
            }
            if (j == 325) {
                if (aClass13_Sub1_Sub4_Sub4_1262 == null) {
                    aClass13_Sub1_Sub4_Sub4_1262 = widget.aClass13_Sub1_Sub4_Sub4_569;
                    aClass13_Sub1_Sub4_Sub4_1263 = widget.aClass13_Sub1_Sub4_Sub4_565;
                }
                if (aBoolean1068) {
                    widget.aClass13_Sub1_Sub4_Sub4_569 = aClass13_Sub1_Sub4_Sub4_1262;
                    return;
                } else {
                    widget.aClass13_Sub1_Sub4_Sub4_569 = aClass13_Sub1_Sub4_Sub4_1263;
                    return;
                }
            }
            if (j == 600) {
                widget.aString548 = aString1230;
                if (pulseCycle % 20 < 10) {
                    widget.aString548 += "|";
                    return;
                } else {
                    widget.aString548 += " ";
                    return;
                }
            }
            if (j == 613) {
                if (anInt1037 >= 1) {
                    if (aBoolean1034) {
                        widget.anInt550 = 0xff0000;
                        widget.aString548 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        widget.anInt550 = 0xffffff;
                        widget.aString548 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    widget.aString548 = "";
                }
            }
            if (j == 650 || j == 655) {
                if (lastLoginAddress != 0) {
                    String s;
                    if (daysSinceLastLogin == 0) {
                        s = "earlier today";
                    } else if (daysSinceLastLogin == 1) {
                        s = "yesterday";
                    } else {
                        s = daysSinceLastLogin + " days ago";
                    }
                    widget.aString548 = "You last logged in " + s + " from: " + Signlink.dns;
                } else {
                    widget.aString548 = "";
                }
            }
            if (j == 651) {
                if (unreadMessagesCount == 0) {
                    widget.aString548 = "0 unread messages";
                    widget.anInt550 = 0xffff00;
                }
                if (unreadMessagesCount == 1) {
                    widget.aString548 = "1 unread message";
                    widget.anInt550 = 65280;
                }
                if (unreadMessagesCount > 1) {
                    widget.aString548 = unreadMessagesCount + " unread messages";
                    widget.anInt550 = 65280;
                }
            }
            if (j == 652) {
                if (daysSinceRecoveryQuestionsUpdated == 201) {
                    if (hasMembershipAndIsOnFreeToPlayWorld == 1) {
                        widget.aString548 = "@yel@This is a non-members world: @whi@Since you are a member we";
                    } else {
                        widget.aString548 = "";
                    }
                } else if (daysSinceRecoveryQuestionsUpdated == 200) {
                    widget.aString548 = "You have not yet set any password recovery questions.";
                } else {
                    String s1;
                    if (daysSinceRecoveryQuestionsUpdated == 0) {
                        s1 = "Earlier today";
                    } else if (daysSinceRecoveryQuestionsUpdated == 1) {
                        s1 = "Yesterday";
                    } else {
                        s1 = daysSinceRecoveryQuestionsUpdated + " days ago";
                    }
                    widget.aString548 = s1 + " you changed your recovery questions";
                }
            }
            if (j == 653) {
                if (daysSinceRecoveryQuestionsUpdated == 201) {
                    if (hasMembershipAndIsOnFreeToPlayWorld == 1) {
                        widget.aString548 = "@whi@recommend you use a members world instead. You may use";
                    } else {
                        widget.aString548 = "";
                    }
                } else if (daysSinceRecoveryQuestionsUpdated == 200) {
                    widget.aString548 = "We strongly recommend you do so now to secure your account.";
                } else {
                    widget.aString548 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (j == 654) {
                if (daysSinceRecoveryQuestionsUpdated == 201) {
                    if (hasMembershipAndIsOnFreeToPlayWorld == 1) {
                        widget.aString548 = "@whi@this world but member benefits are unavailable whilst here.";
                        return;
                    } else {
                        widget.aString548 = "";
                        return;
                    }
                }
                if (daysSinceRecoveryQuestionsUpdated == 200) {
                    widget.aString548 = "Do this from the 'account management' area on our front webpage";
                    return;
                } else {
                    widget.aString548 = "Do this from the 'account management' area on our front webpage";
                    return;
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("3335, " + i + ", " + widget + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public String method107(int i, int j) {
        try {
            if (j != anInt905) {
                throw new NullPointerException();
            }
            if (i < 0x3b9ac9ff) {
                return String.valueOf(i);
            } else {
                return "*";
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("54428, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method108(int i) {
        try {
            if (i != 0) {
                for (int j = 1; j > 0; j++) {
                }
            }
            for (int k = 0; k < anInt1057; k++) {
                if (anIntArray948[k] <= 0) {
                    boolean flag = false;
                    try {
                        if (anIntArray1278[k] == anInt1261 && anIntArray1207[k] == anInt904) {
                            if (!method118(8178)) {
                                flag = true;
                            }
                        } else {
                            Buffer buffer = Class27.method476((byte) -97, anIntArray1278[k], anIntArray1207[k]);
                            if (System.currentTimeMillis() + (long) (buffer.position / 22) > aLong819 + (long) (anInt1115 / 22)) {
                                anInt1115 = buffer.position;
                                aLong819 = System.currentTimeMillis();
                                if (method43((byte) 35, buffer.position, buffer.payload)) {
                                    anInt1261 = anIntArray1278[k];
                                    anInt904 = anIntArray1207[k];
                                } else {
                                    flag = true;
                                }
                            }
                        }
                    } catch (Exception exception) {
                    }
                    if (!flag || anIntArray948[k] == -5) {
                        anInt1057--;
                        for (int l = k; l < anInt1057; l++) {
                            anIntArray1278[l] = anIntArray1278[l + 1];
                            anIntArray1207[l] = anIntArray1207[l + 1];
                            anIntArray948[l] = anIntArray948[l + 1];
                        }
                        k--;
                    } else {
                        anIntArray948[k] = -5;
                    }
                } else {
                    anIntArray948[k]--;
                }
            }
            if (anInt1157 > 0) {
                anInt1157 -= 20;
                if (anInt1157 < 0) {
                    anInt1157 = 0;
                }
                if (anInt1157 == 0 && aBoolean826 && !aBoolean954) {
                    anInt1012 = anInt1229;
                    aBoolean1013 = true;
                    aClass2_Sub1_873.method156(2, anInt1012);
                    return;
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("14656, " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method109(boolean flag) {
        try {
            int i = aClass13_Sub1_Sub4_Sub2_893.method383(3, "Choose Option");
            for (int j = 0; j < anInt1167; j++) {
                int k = aClass13_Sub1_Sub4_Sub2_893.method383(3, aStringArray961[j]);
                if (k > i) {
                    i = k;
                }
            }
            i += 8;
            if (!flag) {
                for (int l = 1; l > 0; l++) {
                }
            }
            int i1 = 15 * anInt1167 + 21;
            if (super.anInt30 > 4 && super.anInt31 > 4 && super.anInt30 < 516 && super.anInt31 < 338) {
                int j1 = super.anInt30 - 4 - i / 2;
                if (j1 + i > 512) {
                    j1 = 512 - i;
                }
                if (j1 < 0) {
                    j1 = 0;
                }
                int i2 = super.anInt31 - 4;
                if (i2 + i1 > 334) {
                    i2 = 334 - i1;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                aBoolean989 = true;
                anInt820 = 0;
                anInt821 = j1;
                anInt822 = i2;
                anInt823 = i;
                anInt824 = 15 * anInt1167 + 22;
            }
            if (super.anInt30 > 553 && super.anInt31 > 205 && super.anInt30 < 743 && super.anInt31 < 466) {
                int k1 = super.anInt30 - 553 - i / 2;
                if (k1 < 0) {
                    k1 = 0;
                } else if (k1 + i > 190) {
                    k1 = 190 - i;
                }
                int j2 = super.anInt31 - 205;
                if (j2 < 0) {
                    j2 = 0;
                } else if (j2 + i1 > 261) {
                    j2 = 261 - i1;
                }
                aBoolean989 = true;
                anInt820 = 1;
                anInt821 = k1;
                anInt822 = j2;
                anInt823 = i;
                anInt824 = 15 * anInt1167 + 22;
            }
            if (super.anInt30 > 17 && super.anInt31 > 357 && super.anInt30 < 496 && super.anInt31 < 453) {
                int l1 = super.anInt30 - 17 - i / 2;
                if (l1 < 0) {
                    l1 = 0;
                } else if (l1 + i > 479) {
                    l1 = 479 - i;
                }
                int k2 = super.anInt31 - 357;
                if (k2 < 0) {
                    k2 = 0;
                } else if (k2 + i1 > 96) {
                    k2 = 96 - i1;
                }
                aBoolean989 = true;
                anInt820 = 2;
                anInt821 = l1;
                anInt822 = k2;
                anInt823 = i;
                anInt824 = 15 * anInt1167 + 22;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("74466, " + flag + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method110(boolean flag) {
        try {
            anInt1260++;
            if (flag) {
                aBuffer_928.writeByte(16);
            }
            if (anInt1260 > 79) {
                anInt1260 = 0;
                aBuffer_928.method300(247);
            }
            do {
                int i = method5(true);
                if (i == -1) {
                    break;
                }
                if (anInt1217 != -1 && anInt1217 == anInt1165) {
                    if (i == 8 && aString1230.length() > 0) {
                        aString1230 = aString1230.substring(0, aString1230.length() - 1);
                    }
                    if ((i >= 97 && i <= 122 || i >= 65 && i <= 90 || i >= 48 && i <= 57 || i == 32) && aString1230.length() < 12) {
                        aString1230 += (char) i;
                    }
                } else if (aBoolean1017) {
                    if (i >= 32 && i <= 122 && aString1218.length() < 80) {
                        aString1218 += (char) i;
                        aBoolean1169 = true;
                    }
                    if (i == 8 && aString1218.length() > 0) {
                        aString1218 = aString1218.substring(0, aString1218.length() - 1);
                        aBoolean1169 = true;
                    }
                    if (i == 13 || i == 10) {
                        aBoolean1017 = false;
                        aBoolean1169 = true;
                        if (anInt943 == 1) {
                            long l = Class24.method446(aString1218);
                            method45(688, l);
                        }
                        if (anInt943 == 2 && anInt1054 > 0) {
                            long l1 = Class24.method446(aString1218);
                            method123(1, l1);
                        }
                        if (anInt943 == 3 && aString1218.length() > 0) {
                            aBuffer_928.method300(235);
                            aBuffer_928.writeByte(0);
                            int j = aBuffer_928.position;
                            aBuffer_928.writeLong(aLong1033);
                            Class45.method574(aBuffer_928, -45468, aString1218);
                            aBuffer_928.method310(5469, aBuffer_928.position - j);
                            aString1218 = Class45.method575(false, aString1218);
                            aString1218 = Class41.method541(false, aString1218);
                            method70(6, aString1218, Class24.method450(Class24.method447(aLong1033, 0), 0), (byte) 117);
                            if (anInt1129 == 2) {
                                anInt1129 = 1;
                                aBoolean1137 = true;
                                aBuffer_928.method300(104);
                                aBuffer_928.writeByte(anInt1159);
                                aBuffer_928.writeByte(anInt1129);
                                aBuffer_928.writeByte(anInt1290);
                            }
                        }
                        if (anInt943 == 4 && anInt1098 < 100) {
                            long l2 = Class24.method446(aString1218);
                            method77(l2, 1);
                        }
                        if (anInt943 == 5 && anInt1098 > 0) {
                            long l3 = Class24.method446(aString1218);
                            method21(l3, -224);
                        }
                    }
                } else if (anInt1141 == 1) {
                    if (i >= 48 && i <= 57 && aString964.length() < 10) {
                        aString964 += (char) i;
                        aBoolean1169 = true;
                    }
                    if (i == 8 && aString964.length() > 0) {
                        aString964 = aString964.substring(0, aString964.length() - 1);
                        aBoolean1169 = true;
                    }
                    if (i == 13 || i == 10) {
                        if (aString964.length() > 0) {
                            int k = 0;
                            try {
                                k = Integer.parseInt(aString964);
                            } catch (Exception _ex) {
                            }
                            aBuffer_928.method300(171);
                            aBuffer_928.writeInt(k);
                        }
                        anInt1141 = 0;
                        aBoolean1169 = true;
                    }
                } else if (anInt1141 == 2) {
                    if (i >= 32 && i <= 122 && aString964.length() < 12) {
                        aString964 += (char) i;
                        aBoolean1169 = true;
                    }
                    if (i == 8 && aString964.length() > 0) {
                        aString964 = aString964.substring(0, aString964.length() - 1);
                        aBoolean1169 = true;
                    }
                    if (i == 13 || i == 10) {
                        if (aString964.length() > 0) {
                            aBuffer_928.method300(105);
                            aBuffer_928.writeLong(Class24.method446(aString964));
                        }
                        anInt1141 = 0;
                        aBoolean1169 = true;
                    }
                } else if (anInt1016 == -1) {
                    if (i >= 32 && i <= 122 && aString1280.length() < 80) {
                        aString1280 += (char) i;
                        aBoolean1169 = true;
                    }
                    if (i == 8 && aString1280.length() > 0) {
                        aString1280 = aString1280.substring(0, aString1280.length() - 1);
                        aBoolean1169 = true;
                    }
                    if ((i == 13 || i == 10) && aString1280.length() > 0) {
                        if (anInt1037 == 2) {
                            if (aString1280.equals("::clientdrop")) {
                                method19(0);
                            }
                            if (aString1280.equals("::lag")) {
                                method53(-900);
                            }
                            if (aString1280.equals("::prefetchmusic")) {
                                for (int i1 = 0; i1 < aClass2_Sub1_873.method163(-29, 2); i1++) {
                                    aClass2_Sub1_873.method162(2, i1, (byte) 1, false);
                                }
                            }
                            if (aString1280.equals("::fpson")) {
                                aBoolean962 = true;
                            }
                            if (aString1280.equals("::fpsoff")) {
                                aBoolean962 = false;
                            }
                            if (aString1280.equals("::noclip")) {
                                for (int j1 = 0; j1 < 4; j1++) {
                                    for (int k1 = 1; k1 < 103; k1++) {
                                        for (int j2 = 1; j2 < 103; j2++) {
                                            aClass39Array947[j1].anIntArrayArray682[k1][j2] = 0;
                                        }
                                    }
                                }
                            }
                        }
                        if (aString1280.startsWith("::")) {
                            aBuffer_928.method300(192);
                            aBuffer_928.writeByte(aString1280.length() - 1);
                            aBuffer_928.writeString(aString1280.substring(2));
                        } else {
                            String s = aString1280.toLowerCase();
                            int i2 = 0;
                            if (s.startsWith("yellow:")) {
                                i2 = 0;
                                aString1280 = aString1280.substring(7);
                            } else if (s.startsWith("red:")) {
                                i2 = 1;
                                aString1280 = aString1280.substring(4);
                            } else if (s.startsWith("green:")) {
                                i2 = 2;
                                aString1280 = aString1280.substring(6);
                            } else if (s.startsWith("cyan:")) {
                                i2 = 3;
                                aString1280 = aString1280.substring(5);
                            } else if (s.startsWith("purple:")) {
                                i2 = 4;
                                aString1280 = aString1280.substring(7);
                            } else if (s.startsWith("white:")) {
                                i2 = 5;
                                aString1280 = aString1280.substring(6);
                            } else if (s.startsWith("flash1:")) {
                                i2 = 6;
                                aString1280 = aString1280.substring(7);
                            } else if (s.startsWith("flash2:")) {
                                i2 = 7;
                                aString1280 = aString1280.substring(7);
                            } else if (s.startsWith("flash3:")) {
                                i2 = 8;
                                aString1280 = aString1280.substring(7);
                            } else if (s.startsWith("glow1:")) {
                                i2 = 9;
                                aString1280 = aString1280.substring(6);
                            } else if (s.startsWith("glow2:")) {
                                i2 = 10;
                                aString1280 = aString1280.substring(6);
                            } else if (s.startsWith("glow3:")) {
                                i2 = 11;
                                aString1280 = aString1280.substring(6);
                            }
                            s = aString1280.toLowerCase();
                            int k2 = 0;
                            if (s.startsWith("wave:")) {
                                k2 = 1;
                                aString1280 = aString1280.substring(5);
                            } else if (s.startsWith("wave2:")) {
                                k2 = 2;
                                aString1280 = aString1280.substring(6);
                            } else if (s.startsWith("shake:")) {
                                k2 = 3;
                                aString1280 = aString1280.substring(6);
                            } else if (s.startsWith("scroll:")) {
                                k2 = 4;
                                aString1280 = aString1280.substring(7);
                            } else if (s.startsWith("slide:")) {
                                k2 = 5;
                                aString1280 = aString1280.substring(6);
                            }
                            aBuffer_928.method300(141);
                            aBuffer_928.writeByte(0);
                            int i3 = aBuffer_928.position;
                            aBuffer_1282.position = 0;
                            Class45.method574(aBuffer_1282, -45468, aString1280);
                            aBuffer_928.method349(aBuffer_1282.payload, 0, true, aBuffer_1282.position);
                            aBuffer_928.method328(anInt1203, k2);
                            aBuffer_928.writeByte(i2);
                            aBuffer_928.method310(5469, aBuffer_928.position - i3);
                            aString1280 = Class45.method575(false, aString1280);
                            aString1280 = Class41.method541(false, aString1280);
                            aClass13_Sub1_Sub1_Sub6_Sub1_997.aString1586 = aString1280;
                            aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1566 = i2;
                            aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1617 = k2;
                            aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1603 = 150;
                            if (anInt1037 == 2) {
                                method70(2, aClass13_Sub1_Sub1_Sub6_Sub1_997.aString1586, "@cr2@" + aClass13_Sub1_Sub1_Sub6_Sub1_997.aString1689, (byte) 117);
                            } else if (anInt1037 == 1) {
                                method70(2, aClass13_Sub1_Sub1_Sub6_Sub1_997.aString1586, "@cr1@" + aClass13_Sub1_Sub1_Sub6_Sub1_997.aString1689, (byte) 117);
                            } else {
                                method70(2, aClass13_Sub1_Sub1_Sub6_Sub1_997.aString1586, aClass13_Sub1_Sub1_Sub6_Sub1_997.aString1689, (byte) 117);
                            }
                            if (anInt1159 == 2) {
                                anInt1159 = 3;
                                aBoolean1137 = true;
                                aBuffer_928.method300(104);
                                aBuffer_928.writeByte(anInt1159);
                                aBuffer_928.writeByte(anInt1129);
                                aBuffer_928.writeByte(anInt1290);
                            }
                        }
                        aString1280 = "";
                        aBoolean1169 = true;
                    }
                }
            } while (true);
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("4969, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method111(int i, int j, int k, int l, int i1, byte byte0, Widget widget,
                          boolean flag, int j1) {
        try {
            if (aBoolean977) {
                anInt1168 = 32;
            } else {
                anInt1168 = 0;
            }
            aBoolean977 = false;
            if (byte0 != 4) {
                aClass12ArrayArrayArray969 = null;
            }
            if (i >= j && i < j + 16 && l >= j1 && l < j1 + 16) {
                widget.anInt595 -= anInt1067 * 4;
                if (flag) {
                    aBoolean1148 = true;
                    return;
                }
            } else if (i >= j && i < j + 16 && l >= (j1 + i1) - 16 && l < j1 + i1) {
                widget.anInt595 += anInt1067 * 4;
                if (flag) {
                    aBoolean1148 = true;
                    return;
                }
            } else if (i >= j - anInt1168 && i < j + 16 + anInt1168 && l >= j1 + 16 && l < (j1 + i1) - 16 && anInt1067 > 0) {
                int k1 = ((i1 - 32) * i1) / k;
                if (k1 < 8) {
                    k1 = 8;
                }
                int l1 = l - j1 - 16 - k1 / 2;
                int i2 = i1 - 32 - k1;
                widget.anInt595 = ((k - i1) * l1) / i2;
                if (flag) {
                    aBoolean1148 = true;
                }
                aBoolean977 = true;
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("51706, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + byte0 + ", " + widget + ", " + flag + ", " + j1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method112(byte byte0) {
        try {
            if (byte0 != 0) {
                aBoolean1240 = !aBoolean1240;
            }
            if (anInt1254 == 2) {
                for (Class13_Sub3 class13_sub3 = (Class13_Sub3) aClass12_1152.method248(); class13_sub3 != null; class13_sub3 = (Class13_Sub3) aClass12_1152.method250(-475)) {
                    if (class13_sub3.anInt1371 > 0) {
                        class13_sub3.anInt1371--;
                    }
                    if (class13_sub3.anInt1371 == 0) {
                        if (class13_sub3.anInt1372 < 0 || Class25.method467(class13_sub3.anInt1372, 0, class13_sub3.anInt1374)) {
                            method102(class13_sub3.anInt1363, class13_sub3.anInt1373, class13_sub3.anInt1365, class13_sub3.anInt1372, 523, class13_sub3.anInt1364, class13_sub3.anInt1366, class13_sub3.anInt1374);
                            class13_sub3.method253();
                        }
                    } else {
                        if (class13_sub3.anInt1367 > 0) {
                            class13_sub3.anInt1367--;
                        }
                        if (class13_sub3.anInt1367 == 0 && class13_sub3.anInt1365 >= 1 && class13_sub3.anInt1366 >= 1 && class13_sub3.anInt1365 <= 102 && class13_sub3.anInt1366 <= 102 && (class13_sub3.anInt1368 < 0 || Class25.method467(class13_sub3.anInt1368, 0, class13_sub3.anInt1370))) {
                            method102(class13_sub3.anInt1363, class13_sub3.anInt1369, class13_sub3.anInt1365, class13_sub3.anInt1368, 523, class13_sub3.anInt1364, class13_sub3.anInt1366, class13_sub3.anInt1370);
                            class13_sub3.anInt1367 = -1;
                            if (class13_sub3.anInt1368 == class13_sub3.anInt1372 && class13_sub3.anInt1372 == -1) {
                                class13_sub3.method253();
                            } else if (class13_sub3.anInt1368 == class13_sub3.anInt1372 && class13_sub3.anInt1369 == class13_sub3.anInt1373 && class13_sub3.anInt1370 == class13_sub3.anInt1374) {
                                class13_sub3.method253();
                            }
                        }
                    }
                }
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("76702, " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method113(int i, int j) {
        try {
            Signlink.wavevol = i;
            j = 31 / j;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("69963, " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method114(boolean flag) {
        try {
            if (flag) {
                anInt1014 = -366;
            }
            if (anInt1060 != 0) {
                return;
            }
            aStringArray961[0] = "Cancel";
            anIntArray911[0] = 1369;
            anInt1167 = 1;
            method100(-16609);
            anInt1270 = 0;
            if (super.anInt23 > 4 && super.anInt24 > 4 && super.anInt23 < 516 && super.anInt24 < 338) {
                if (anInt1217 != -1) {
                    method75(super.anInt23, Widget.aWidgetArray533[anInt1217], super.anInt24, false, 4, 0, 4);
                } else {
                    method31((byte) -83);
                }
            }
            if (anInt1270 != anInt861) {
                anInt861 = anInt1270;
            }
            anInt1270 = 0;
            if (super.anInt23 > 553 && super.anInt24 > 205 && super.anInt23 < 743 && super.anInt24 < 466) {
                if (anInt874 != -1) {
                    method75(super.anInt23, Widget.aWidgetArray533[anInt874], super.anInt24, false, 553, 0, 205);
                } else if (anIntArray1018[anInt864] != -1) {
                    method75(super.anInt23, Widget.aWidgetArray533[anIntArray1018[anInt864]], super.anInt24, false, 553, 0, 205);
                }
            }
            if (anInt1270 != anInt1118) {
                aBoolean1148 = true;
                anInt1118 = anInt1270;
            }
            anInt1270 = 0;
            if (super.anInt23 > 17 && super.anInt24 > 357 && super.anInt23 < 496 && super.anInt24 < 453) {
                if (anInt1016 != -1) {
                    method75(super.anInt23, Widget.aWidgetArray533[anInt1016], super.anInt24, false, 17, 0, 357);
                } else if (super.anInt24 < 434 && super.anInt23 < 426) {
                    method24(super.anInt23 - 17, anInt1225, super.anInt24 - 357);
                }
            }
            if (anInt1016 != -1 && anInt1270 != anInt907) {
                aBoolean1169 = true;
                anInt907 = anInt1270;
            }
            for (boolean flag1 = false; !flag1; ) {
                flag1 = true;
                for (int i = 0; i < anInt1167 - 1; i++) {
                    if (anIntArray911[i] < 1000 && anIntArray911[i + 1] > 1000) {
                        String s = aStringArray961[i];
                        aStringArray961[i] = aStringArray961[i + 1];
                        aStringArray961[i + 1] = s;
                        int j = anIntArray911[i];
                        anIntArray911[i] = anIntArray911[i + 1];
                        anIntArray911[i + 1] = j;
                        j = anIntArray909[i];
                        anIntArray909[i] = anIntArray909[i + 1];
                        anIntArray909[i + 1] = j;
                        j = anIntArray910[i];
                        anIntArray910[i] = anIntArray910[i + 1];
                        anIntArray910[i + 1] = j;
                        j = anIntArray912[i];
                        anIntArray912[i] = anIntArray912[i + 1];
                        anIntArray912[i + 1] = j;
                        flag1 = false;
                    }
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("34496, " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method115(Class13_Sub1_Sub4_Sub4 class13_sub1_sub4_sub4, int i, int j, int k) {
        try {
            int l = anInt922 + anInt1205 & 0x7ff;
            int i1 = i * i + j * j;
            if (i1 > 6400) {
                return;
            }
            int j1 = Class13_Sub1_Sub1_Sub4.anIntArray1559[l];
            int k1 = Class13_Sub1_Sub1_Sub4.anIntArray1560[l];
            if (k <= 0) {
                opcode = buffer.readUnsignedByte();
            }
            j1 = (j1 * 256) / (anInt1035 + 256);
            k1 = (k1 * 256) / (anInt1035 + 256);
            int l1 = j * j1 + i * k1 >> 16;
            int i2 = j * k1 - i * j1 >> 16;
            if (i1 > 2500) {
                class13_sub1_sub4_sub4.method414(83 - i2 - class13_sub1_sub4_sub4.anInt1686 / 2 - 4, ((94 + l1) - class13_sub1_sub4_sub4.anInt1685 / 2) + 4, aClass13_Sub1_Sub4_Sub3_1209, (byte) 6);
                return;
            } else {
                class13_sub1_sub4_sub4.method408(83 - i2 - class13_sub1_sub4_sub4.anInt1686 / 2 - 4, (byte) 83, ((94 + l1) - class13_sub1_sub4_sub4.anInt1685 / 2) + 4);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("48595, " + class13_sub1_sub4_sub4 + ", " + i + ", " + j + ", " + k + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method116(Class13_Sub1_Sub4_Sub4 class13_sub1_sub4_sub4, int i, int j, int k) {
        try {
            int l = i * i + k * k;
            if (j != 1) {
                aClass12ArrayArrayArray969 = null;
            }
            if (l > 4225 && l < 0x15f90) {
                int i1 = anInt922 + anInt1205 & 0x7ff;
                int j1 = Class13_Sub1_Sub1_Sub4.anIntArray1559[i1];
                int k1 = Class13_Sub1_Sub1_Sub4.anIntArray1560[i1];
                j1 = (j1 * 256) / (anInt1035 + 256);
                k1 = (k1 * 256) / (anInt1035 + 256);
                int l1 = k * j1 + i * k1 >> 16;
                int i2 = k * k1 - i * j1 >> 16;
                double d = Math.atan2(l1, i2);
                int j2 = (int) (Math.sin(d) * 63D);
                int k2 = (int) (Math.cos(d) * 57D);
                aClass13_Sub1_Sub4_Sub4_1049.method413(256, 20, 15, 15, 20, d, (byte) -98, 83 - k2 - 20, (94 + j2 + 4) - 10);
                return;
            } else {
                method115(class13_sub1_sub4_sub4, i, k, 543);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("66984, " + class13_sub1_sub4_sub4 + ", " + i + ", " + j + ", " + k + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method117(Buffer buffer, int i, int j) {
        try {
            while (buffer.bitPosition + 10 < i * 8) {
                int k = buffer.readBits(11, 195);
                if (k == 2047) {
                    break;
                }
                if (players[k] == null) {
                    players[k] = new Class13_Sub1_Sub1_Sub6_Sub1();
                    if (aBufferArray903[k] != null) {
                        players[k].method297(aBufferArray903[k], 0);
                    }
                }
                playerList[anInt899++] = k;
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1 = players[k];
                class13_sub1_sub1_sub6_sub1.pulseCycle = pulseCycle;
                int l = buffer.readBits(1, 195);
                if (l == 1) {
                    anIntArray902[anInt901++] = k;
                }
                int i1 = buffer.readBits(5, 195);
                if (i1 > 15) {
                    i1 -= 32;
                }
                int j1 = buffer.readBits(5, 195);
                if (j1 > 15) {
                    j1 -= 32;
                }
                int k1 = buffer.readBits(1, 195);
                class13_sub1_sub1_sub6_sub1.method294(k1 == 1, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1615[0] + j1, aClass13_Sub1_Sub1_Sub6_Sub1_997.anIntArray1616[0] + i1, (byte) 103);
            }
            buffer.finishBitAccess(3);
            if (j <= 0) {
                aBoolean1235 = !aBoolean1235;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("51952, " + buffer + ", " + i + ", " + j + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public boolean method118(int i) {
        try {
            if (i != 8178) {
                throw new NullPointerException();
            } else {
                return Signlink.wavereplay();
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("44526, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public boolean method119(Widget widget, byte byte0) {
        try {
            if (byte0 != 0) {
                for (int i = 1; i > 0; i++) {
                }
            }
            int j = widget.anInt577;
            if (j >= 1 && j <= 200 || j >= 701 && j <= 900) {
                if (j >= 801) {
                    j -= 701;
                } else if (j >= 701) {
                    j -= 601;
                } else if (j >= 101) {
                    j -= 101;
                } else {
                    j--;
                }
                aStringArray961[anInt1167] = "Remove @whi@" + aStringArray1003[j];
                anIntArray911[anInt1167] = 785;
                anInt1167++;
                aStringArray961[anInt1167] = "Message @whi@" + aStringArray1003[j];
                anIntArray911[anInt1167] = 7;
                anInt1167++;
                return true;
            }
            if (j >= 401 && j <= 500) {
                aStringArray961[anInt1167] = "Remove @whi@" + widget.aString548;
                anIntArray911[anInt1167] = 781;
                anInt1167++;
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("15785, " + widget + ", " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method120(int i, Buffer buffer, boolean flag) {
        try {
            buffer.initBitAccess();
            int j = buffer.readBits(1, 195);
            if (!flag) {
                anInt1056 = 408;
            }
            if (j == 0) {
                return;
            }
            int k = buffer.readBits(2, 195);
            if (k == 0) {
                anIntArray902[anInt901++] = anInt897;
                return;
            }
            if (k == 1) {
                int l = buffer.readBits(3, 195);
                aClass13_Sub1_Sub1_Sub6_Sub1_997.method292(l, 125, false);
                int k1 = buffer.readBits(1, 195);
                if (k1 == 1) {
                    anIntArray902[anInt901++] = anInt897;
                }
                return;
            }
            if (k == 2) {
                int i1 = buffer.readBits(3, 195);
                aClass13_Sub1_Sub1_Sub6_Sub1_997.method292(i1, 125, true);
                int l1 = buffer.readBits(3, 195);
                aClass13_Sub1_Sub1_Sub6_Sub1_997.method292(l1, 125, true);
                int j2 = buffer.readBits(1, 195);
                if (j2 == 1) {
                    anIntArray902[anInt901++] = anInt897;
                }
                return;
            }
            if (k == 3) {
                int j1 = buffer.readBits(7, 195);
                anInt1166 = buffer.readBits(2, 195);
                int i2 = buffer.readBits(7, 195);
                int k2 = buffer.readBits(1, 195);
                int l2 = buffer.readBits(1, 195);
                if (l2 == 1) {
                    anIntArray902[anInt901++] = anInt897;
                }
                aClass13_Sub1_Sub1_Sub6_Sub1_997.method294(k2 == 1, i2, j1, (byte) 103);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("31237, " + i + ", " + buffer + ", " + flag + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method121(int i) {
        try {
            Class13_Sub1_Sub1_Sub1 class13_sub1_sub1_sub1 = (Class13_Sub1_Sub1_Sub1) aClass12_1199.method248();
            packetSize += i;
            for (; class13_sub1_sub1_sub1 != null; class13_sub1_sub1_sub1 = (Class13_Sub1_Sub1_Sub1) aClass12_1199.method250(-475)) {
                if (class13_sub1_sub1_sub1.anInt1442 != anInt1166 || pulseCycle > class13_sub1_sub1_sub1.anInt1451) {
                    class13_sub1_sub1_sub1.method253();
                } else if (pulseCycle >= class13_sub1_sub1_sub1.anInt1450) {
                    if (class13_sub1_sub1_sub1.anInt1440 > 0) {
                        Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[class13_sub1_sub1_sub1.anInt1440 - 1];
                        if (class13_sub1_sub1_sub6_sub2 != null && class13_sub1_sub1_sub6_sub2.anInt1587 >= 0 && class13_sub1_sub1_sub6_sub2.anInt1587 < 13312 && class13_sub1_sub1_sub6_sub2.anInt1588 >= 0 && class13_sub1_sub1_sub6_sub2.anInt1588 < 13312) {
                            class13_sub1_sub1_sub1.method258(method80(class13_sub1_sub1_sub1.anInt1442, 781, class13_sub1_sub1_sub6_sub2.anInt1588, class13_sub1_sub1_sub6_sub2.anInt1587) - class13_sub1_sub1_sub1.anInt1458, 0, class13_sub1_sub1_sub6_sub2.anInt1588, pulseCycle, class13_sub1_sub1_sub6_sub2.anInt1587);
                        }
                    }
                    if (class13_sub1_sub1_sub1.anInt1440 < 0) {
                        int j = -class13_sub1_sub1_sub1.anInt1440 - 1;
                        Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1;
                        if (j == anInt950) {
                            class13_sub1_sub1_sub6_sub1 = aClass13_Sub1_Sub1_Sub6_Sub1_997;
                        } else {
                            class13_sub1_sub1_sub6_sub1 = players[j];
                        }
                        if (class13_sub1_sub1_sub6_sub1 != null && class13_sub1_sub1_sub6_sub1.anInt1587 >= 0 && class13_sub1_sub1_sub6_sub1.anInt1587 < 13312 && class13_sub1_sub1_sub6_sub1.anInt1588 >= 0 && class13_sub1_sub1_sub6_sub1.anInt1588 < 13312) {
                            class13_sub1_sub1_sub1.method258(method80(class13_sub1_sub1_sub1.anInt1442, 781, class13_sub1_sub1_sub6_sub1.anInt1588, class13_sub1_sub1_sub6_sub1.anInt1587) - class13_sub1_sub1_sub1.anInt1458, 0, class13_sub1_sub1_sub6_sub1.anInt1588, pulseCycle, class13_sub1_sub1_sub6_sub1.anInt1587);
                        }
                    }
                    class13_sub1_sub1_sub1.method257(anInt1241, 896);
                    aClass10_1198.method205((int) class13_sub1_sub1_sub1.aDouble1448, (int) class13_sub1_sub1_sub1.aDouble1447, anInt1166, -1, class13_sub1_sub1_sub1, -554, (int) class13_sub1_sub1_sub1.aDouble1449, 60, class13_sub1_sub1_sub1.anInt1443, false);
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("39823, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method122(int i) {
        try {
            aClass13_Sub1_Sub4_Sub3_1120 = new Class13_Sub1_Sub4_Sub3(aClass1_991, "titlebox", 0);
            aClass13_Sub1_Sub4_Sub3_1121 = new Class13_Sub1_Sub4_Sub3(aClass1_991, "titlebutton", 0);
            aClass13_Sub1_Sub4_Sub3Array1155 = new Class13_Sub1_Sub4_Sub3[12];
            int j = 0;
            if (i < 8 || i > 8) {
                opcode = buffer.readUnsignedByte();
            }
            try {
                j = Integer.parseInt(getParameter("fl_icon"));
            } catch (Exception _ex) {
            }
            if (j == 0) {
                for (int k = 0; k < 12; k++) {
                    aClass13_Sub1_Sub4_Sub3Array1155[k] = new Class13_Sub1_Sub4_Sub3(aClass1_991, "runes", k);
                }
            } else {
                for (int l = 0; l < 12; l++) {
                    aClass13_Sub1_Sub4_Sub3Array1155[l] = new Class13_Sub1_Sub4_Sub3(aClass1_991, "runes", 12 + (l & 3));
                }
            }
            aClass13_Sub1_Sub4_Sub4_925 = new Class13_Sub1_Sub4_Sub4(128, 265);
            aClass13_Sub1_Sub4_Sub4_926 = new Class13_Sub1_Sub4_Sub4(128, 265);
            for (int i1 = 0; i1 < 33920; i1++) {
                aClass13_Sub1_Sub4_Sub4_925.anIntArray1680[i1] = aClass31_1248.anIntArray482[i1];
            }
            for (int j1 = 0; j1 < 33920; j1++) {
                aClass13_Sub1_Sub4_Sub4_926.anIntArray1680[j1] = aClass31_1249.anIntArray482[j1];
            }
            anIntArray844 = new int[256];
            for (int k1 = 0; k1 < 64; k1++) {
                anIntArray844[k1] = k1 * 0x40000;
            }
            for (int l1 = 0; l1 < 64; l1++) {
                anIntArray844[l1 + 64] = 0xff0000 + 1024 * l1;
            }
            for (int i2 = 0; i2 < 64; i2++) {
                anIntArray844[i2 + 128] = 0xffff00 + 4 * i2;
            }
            for (int j2 = 0; j2 < 64; j2++) {
                anIntArray844[j2 + 192] = 0xffffff;
            }
            anIntArray845 = new int[256];
            for (int k2 = 0; k2 < 64; k2++) {
                anIntArray845[k2] = k2 * 1024;
            }
            for (int l2 = 0; l2 < 64; l2++) {
                anIntArray845[l2 + 64] = 65280 + 4 * l2;
            }
            for (int i3 = 0; i3 < 64; i3++) {
                anIntArray845[i3 + 128] = 65535 + 0x40000 * i3;
            }
            for (int j3 = 0; j3 < 64; j3++) {
                anIntArray845[j3 + 192] = 0xffffff;
            }
            anIntArray846 = new int[256];
            for (int k3 = 0; k3 < 64; k3++) {
                anIntArray846[k3] = k3 * 4;
            }
            for (int l3 = 0; l3 < 64; l3++) {
                anIntArray846[l3 + 64] = 255 + 0x40000 * l3;
            }
            for (int i4 = 0; i4 < 64; i4++) {
                anIntArray846[i4 + 128] = 0xff00ff + 1024 * i4;
            }
            for (int j4 = 0; j4 < 64; j4++) {
                anIntArray846[j4 + 192] = 0xffffff;
            }
            anIntArray843 = new int[256];
            anIntArray1043 = new int[32768];
            anIntArray1044 = new int[32768];
            method103(null, (byte) 9);
            anIntArray1130 = new int[32768];
            anIntArray1131 = new int[32768];
            method13(false, "Connecting to fileserver", 10);
            if (!aBoolean1047) {
                aBoolean1046 = true;
                aBoolean1047 = true;
                method12(this, 2);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("85671, " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method123(int i, long l) {
        try {
            if (i != 1) {
                opcode = buffer.readUnsignedByte();
            }
            if (l == 0L) {
                return;
            }
            for (int j = 0; j < anInt1054; j++) {
                if (aLongArray993[j] == l) {
                    anInt1054--;
                    aBoolean1148 = true;
                    for (int k = j; k < anInt1054; k++) {
                        aStringArray1003[k] = aStringArray1003[k + 1];
                        anIntArray850[k] = anIntArray850[k + 1];
                        aLongArray993[k] = aLongArray993[k + 1];
                    }
                    aBuffer_928.method300(77);
                    aBuffer_928.writeLong(l);
                    return;
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("57862, " + i + ", " + l + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method124(Class13_Sub3 class13_sub3, byte byte0) {
        try {
            if (byte0 != -56) {
                aBuffer_928.writeByte(253);
            }
            int i = 0;
            int j = -1;
            int k = 0;
            int l = 0;
            if (class13_sub3.anInt1364 == 0) {
                i = aClass10_1198.method220(class13_sub3.anInt1363, class13_sub3.anInt1365, class13_sub3.anInt1366);
            }
            if (class13_sub3.anInt1364 == 1) {
                i = aClass10_1198.method221(class13_sub3.anInt1363, class13_sub3.anInt1365, (byte) 122, class13_sub3.anInt1366);
            }
            if (class13_sub3.anInt1364 == 2) {
                i = aClass10_1198.method222(class13_sub3.anInt1363, class13_sub3.anInt1365, class13_sub3.anInt1366);
            }
            if (class13_sub3.anInt1364 == 3) {
                i = aClass10_1198.method223(class13_sub3.anInt1363, class13_sub3.anInt1365, class13_sub3.anInt1366);
            }
            if (i != 0) {
                int i1 = aClass10_1198.method224(class13_sub3.anInt1363, class13_sub3.anInt1365, class13_sub3.anInt1366, i);
                j = i >> 14 & 0x7fff;
                k = i1 & 0x1f;
                l = i1 >> 6;
            }
            class13_sub3.anInt1372 = j;
            class13_sub3.anInt1374 = k;
            class13_sub3.anInt1373 = l;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("50149, " + class13_sub3 + ", " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method125(byte byte0) {
        try {
            if (byte0 == 9) {
                byte0 = 0;
            } else {
                opcode = -1;
            }
            for (int i = 0; i < anInt1284; i++) {
                int j = anIntArray1285[i];
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[j];
                if (class13_sub1_sub1_sub6_sub2 != null) {
                    method126(class13_sub1_sub1_sub6_sub2, 0, class13_sub1_sub1_sub6_sub2.aClass47_1717.aByte768);
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("75537, " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method126(Class13_Sub1_Sub1_Sub6 class13_sub1_sub1_sub6, int i, int j) {
        try {
            if (class13_sub1_sub1_sub6.anInt1587 < 128 || class13_sub1_sub1_sub6.anInt1588 < 128 || class13_sub1_sub1_sub6.anInt1587 >= 13184 || class13_sub1_sub1_sub6.anInt1588 >= 13184) {
                class13_sub1_sub1_sub6.anInt1597 = -1;
                class13_sub1_sub1_sub6.anInt1592 = -1;
                class13_sub1_sub1_sub6.anInt1579 = 0;
                class13_sub1_sub1_sub6.anInt1580 = 0;
                class13_sub1_sub1_sub6.anInt1587 = class13_sub1_sub1_sub6.anIntArray1615[0] * 128 + class13_sub1_sub1_sub6.anInt1611 * 64;
                class13_sub1_sub1_sub6.anInt1588 = class13_sub1_sub1_sub6.anIntArray1616[0] * 128 + class13_sub1_sub1_sub6.anInt1611 * 64;
                class13_sub1_sub1_sub6.method290((byte) 5);
            }
            if (class13_sub1_sub1_sub6 == aClass13_Sub1_Sub1_Sub6_Sub1_997 && (class13_sub1_sub1_sub6.anInt1587 < 1536 || class13_sub1_sub1_sub6.anInt1588 < 1536 || class13_sub1_sub1_sub6.anInt1587 >= 11776 || class13_sub1_sub1_sub6.anInt1588 >= 11776)) {
                class13_sub1_sub1_sub6.anInt1597 = -1;
                class13_sub1_sub1_sub6.anInt1592 = -1;
                class13_sub1_sub1_sub6.anInt1579 = 0;
                class13_sub1_sub1_sub6.anInt1580 = 0;
                class13_sub1_sub1_sub6.anInt1587 = class13_sub1_sub1_sub6.anIntArray1615[0] * 128 + class13_sub1_sub1_sub6.anInt1611 * 64;
                class13_sub1_sub1_sub6.anInt1588 = class13_sub1_sub1_sub6.anIntArray1616[0] * 128 + class13_sub1_sub1_sub6.anInt1611 * 64;
                class13_sub1_sub1_sub6.method290((byte) 5);
            }
            if (class13_sub1_sub1_sub6.anInt1579 > pulseCycle) {
                method127(class13_sub1_sub1_sub6, anInt1279);
            } else if (class13_sub1_sub1_sub6.anInt1580 >= pulseCycle) {
                method128(class13_sub1_sub1_sub6, (byte) 24);
            } else {
                method129(class13_sub1_sub1_sub6, (byte) 8);
            }
            method130(6, class13_sub1_sub1_sub6);
            method131(class13_sub1_sub1_sub6, true);
            packetSize += i;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("30033, " + class13_sub1_sub1_sub6 + ", " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method127(Class13_Sub1_Sub1_Sub6 class13_sub1_sub1_sub6, int i) {
        try {
            int j = class13_sub1_sub1_sub6.anInt1579 - pulseCycle;
            int k = class13_sub1_sub1_sub6.anInt1575 * 128 + class13_sub1_sub1_sub6.anInt1611 * 64;
            int l = class13_sub1_sub1_sub6.anInt1577 * 128 + class13_sub1_sub1_sub6.anInt1611 * 64;
            class13_sub1_sub1_sub6.anInt1587 += (k - class13_sub1_sub1_sub6.anInt1587) / j;
            class13_sub1_sub1_sub6.anInt1588 += (l - class13_sub1_sub1_sub6.anInt1588) / j;
            if (i != anInt895) {
                for (int i1 = 1; i1 > 0; i1++) {
                }
            }
            class13_sub1_sub1_sub6.anInt1568 = 0;
            if (class13_sub1_sub1_sub6.anInt1581 == 0) {
                class13_sub1_sub1_sub6.anInt1609 = 1024;
            }
            if (class13_sub1_sub1_sub6.anInt1581 == 1) {
                class13_sub1_sub1_sub6.anInt1609 = 1536;
            }
            if (class13_sub1_sub1_sub6.anInt1581 == 2) {
                class13_sub1_sub1_sub6.anInt1609 = 0;
            }
            if (class13_sub1_sub1_sub6.anInt1581 == 3) {
                class13_sub1_sub1_sub6.anInt1609 = 512;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("27701, " + class13_sub1_sub1_sub6 + ", " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method128(Class13_Sub1_Sub1_Sub6 class13_sub1_sub1_sub6, byte byte0) {
        try {
            if (class13_sub1_sub1_sub6.anInt1580 == pulseCycle || class13_sub1_sub1_sub6.anInt1597 == -1 || class13_sub1_sub1_sub6.anInt1600 != 0 || class13_sub1_sub1_sub6.anInt1599 + 1 > Class50.aClass50Array800[class13_sub1_sub1_sub6.anInt1597].method592(0, class13_sub1_sub1_sub6.anInt1598)) {
                int i = class13_sub1_sub1_sub6.anInt1580 - class13_sub1_sub1_sub6.anInt1579;
                int j = pulseCycle - class13_sub1_sub1_sub6.anInt1579;
                int k = class13_sub1_sub1_sub6.anInt1575 * 128 + class13_sub1_sub1_sub6.anInt1611 * 64;
                int l = class13_sub1_sub1_sub6.anInt1577 * 128 + class13_sub1_sub1_sub6.anInt1611 * 64;
                int i1 = class13_sub1_sub1_sub6.anInt1576 * 128 + class13_sub1_sub1_sub6.anInt1611 * 64;
                int j1 = class13_sub1_sub1_sub6.anInt1578 * 128 + class13_sub1_sub1_sub6.anInt1611 * 64;
                class13_sub1_sub1_sub6.anInt1587 = (k * (i - j) + i1 * j) / i;
                class13_sub1_sub1_sub6.anInt1588 = (l * (i - j) + j1 * j) / i;
            }
            class13_sub1_sub1_sub6.anInt1568 = 0;
            if (class13_sub1_sub1_sub6.anInt1581 == 0) {
                class13_sub1_sub1_sub6.anInt1609 = 1024;
            }
            if (class13_sub1_sub1_sub6.anInt1581 == 1) {
                class13_sub1_sub1_sub6.anInt1609 = 1536;
            }
            if (class13_sub1_sub1_sub6.anInt1581 == 2) {
                class13_sub1_sub1_sub6.anInt1609 = 0;
            }
            if (class13_sub1_sub1_sub6.anInt1581 == 3) {
                class13_sub1_sub1_sub6.anInt1609 = 512;
            }
            class13_sub1_sub1_sub6.anInt1589 = class13_sub1_sub1_sub6.anInt1609;
            if (byte0 != 24) {
                method6();
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("46733, " + class13_sub1_sub1_sub6 + ", " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method129(Class13_Sub1_Sub1_Sub6 class13_sub1_sub1_sub6, byte byte0) {
        try {
            class13_sub1_sub1_sub6.anInt1620 = class13_sub1_sub1_sub6.anInt1584;
            if (byte0 != 8) {
                opcode = -1;
            }
            if (class13_sub1_sub1_sub6.anInt1591 == 0) {
                class13_sub1_sub1_sub6.anInt1568 = 0;
                return;
            }
            if (class13_sub1_sub1_sub6.anInt1597 != -1 && class13_sub1_sub1_sub6.anInt1600 == 0) {
                Class50 class50 = Class50.aClass50Array800[class13_sub1_sub1_sub6.anInt1597];
                if (class13_sub1_sub1_sub6.anInt1619 > 0 && class50.anInt812 == 0) {
                    class13_sub1_sub1_sub6.anInt1568++;
                    return;
                }
                if (class13_sub1_sub1_sub6.anInt1619 <= 0 && class50.anInt813 == 0) {
                    class13_sub1_sub1_sub6.anInt1568++;
                    return;
                }
            }
            int i = class13_sub1_sub1_sub6.anInt1587;
            int j = class13_sub1_sub1_sub6.anInt1588;
            int k = class13_sub1_sub1_sub6.anIntArray1615[class13_sub1_sub1_sub6.anInt1591 - 1] * 128 + class13_sub1_sub1_sub6.anInt1611 * 64;
            int l = class13_sub1_sub1_sub6.anIntArray1616[class13_sub1_sub1_sub6.anInt1591 - 1] * 128 + class13_sub1_sub1_sub6.anInt1611 * 64;
            if (k - i > 256 || k - i < -256 || l - j > 256 || l - j < -256) {
                class13_sub1_sub1_sub6.anInt1587 = k;
                class13_sub1_sub1_sub6.anInt1588 = l;
                return;
            }
            if (i < k) {
                if (j < l) {
                    class13_sub1_sub1_sub6.anInt1609 = 1280;
                } else if (j > l) {
                    class13_sub1_sub1_sub6.anInt1609 = 1792;
                } else {
                    class13_sub1_sub1_sub6.anInt1609 = 1536;
                }
            } else if (i > k) {
                if (j < l) {
                    class13_sub1_sub1_sub6.anInt1609 = 768;
                } else if (j > l) {
                    class13_sub1_sub1_sub6.anInt1609 = 256;
                } else {
                    class13_sub1_sub1_sub6.anInt1609 = 512;
                }
            } else if (j < l) {
                class13_sub1_sub1_sub6.anInt1609 = 1024;
            } else {
                class13_sub1_sub1_sub6.anInt1609 = 0;
            }
            int i1 = class13_sub1_sub1_sub6.anInt1609 - class13_sub1_sub1_sub6.anInt1589 & 0x7ff;
            if (i1 > 1024) {
                i1 -= 2048;
            }
            int j1 = class13_sub1_sub1_sub6.anInt1571;
            if (i1 >= -256 && i1 <= 256) {
                j1 = class13_sub1_sub1_sub6.anInt1570;
            } else if (i1 >= 256 && i1 < 768) {
                j1 = class13_sub1_sub1_sub6.anInt1573;
            } else if (i1 >= -768 && i1 <= -256) {
                j1 = class13_sub1_sub1_sub6.anInt1572;
            }
            if (j1 == -1) {
                j1 = class13_sub1_sub1_sub6.anInt1570;
            }
            class13_sub1_sub1_sub6.anInt1620 = j1;
            int k1 = 4;
            if (class13_sub1_sub1_sub6.anInt1589 != class13_sub1_sub1_sub6.anInt1609 && class13_sub1_sub1_sub6.anInt1602 == -1 && class13_sub1_sub1_sub6.anInt1618 != 0) {
                k1 = 2;
            }
            if (class13_sub1_sub1_sub6.anInt1591 > 2) {
                k1 = 6;
            }
            if (class13_sub1_sub1_sub6.anInt1591 > 3) {
                k1 = 8;
            }
            if (class13_sub1_sub1_sub6.anInt1568 > 0 && class13_sub1_sub1_sub6.anInt1591 > 1) {
                k1 = 8;
                class13_sub1_sub1_sub6.anInt1568--;
            }
            if (class13_sub1_sub1_sub6.aBooleanArray1567[class13_sub1_sub1_sub6.anInt1591 - 1]) {
                k1 <<= 1;
            }
            if (k1 >= 8 && class13_sub1_sub1_sub6.anInt1620 == class13_sub1_sub1_sub6.anInt1570 && class13_sub1_sub1_sub6.anInt1607 != -1) {
                class13_sub1_sub1_sub6.anInt1620 = class13_sub1_sub1_sub6.anInt1607;
            }
            if (i < k) {
                class13_sub1_sub1_sub6.anInt1587 += k1;
                if (class13_sub1_sub1_sub6.anInt1587 > k) {
                    class13_sub1_sub1_sub6.anInt1587 = k;
                }
            } else if (i > k) {
                class13_sub1_sub1_sub6.anInt1587 -= k1;
                if (class13_sub1_sub1_sub6.anInt1587 < k) {
                    class13_sub1_sub1_sub6.anInt1587 = k;
                }
            }
            if (j < l) {
                class13_sub1_sub1_sub6.anInt1588 += k1;
                if (class13_sub1_sub1_sub6.anInt1588 > l) {
                    class13_sub1_sub1_sub6.anInt1588 = l;
                }
            } else if (j > l) {
                class13_sub1_sub1_sub6.anInt1588 -= k1;
                if (class13_sub1_sub1_sub6.anInt1588 < l) {
                    class13_sub1_sub1_sub6.anInt1588 = l;
                }
            }
            if (class13_sub1_sub1_sub6.anInt1587 == k && class13_sub1_sub1_sub6.anInt1588 == l) {
                class13_sub1_sub1_sub6.anInt1591--;
                if (class13_sub1_sub1_sub6.anInt1619 > 0) {
                    class13_sub1_sub1_sub6.anInt1619--;
                    return;
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("54560, " + class13_sub1_sub1_sub6 + ", " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method130(int i, Class13_Sub1_Sub1_Sub6 class13_sub1_sub1_sub6) {
        try {
            if (i < 6 || i > 6) {
                opcode = -1;
            }
            if (class13_sub1_sub1_sub6.anInt1618 == 0) {
                return;
            }
            if (class13_sub1_sub1_sub6.anInt1602 != -1 && class13_sub1_sub1_sub6.anInt1602 < 32768) {
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[class13_sub1_sub1_sub6.anInt1602];
                if (class13_sub1_sub1_sub6_sub2 != null) {
                    int i1 = class13_sub1_sub1_sub6.anInt1587 - class13_sub1_sub1_sub6_sub2.anInt1587;
                    int k1 = class13_sub1_sub1_sub6.anInt1588 - class13_sub1_sub1_sub6_sub2.anInt1588;
                    if (i1 != 0 || k1 != 0) {
                        class13_sub1_sub1_sub6.anInt1609 = (int) (Math.atan2(i1, k1) * 325.94900000000001D) & 0x7ff;
                    }
                }
            }
            if (class13_sub1_sub1_sub6.anInt1602 >= 32768) {
                int j = class13_sub1_sub1_sub6.anInt1602 - 32768;
                if (j == anInt950) {
                    j = anInt897;
                }
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1 = players[j];
                if (class13_sub1_sub1_sub6_sub1 != null) {
                    int l1 = class13_sub1_sub1_sub6.anInt1587 - class13_sub1_sub1_sub6_sub1.anInt1587;
                    int i2 = class13_sub1_sub1_sub6.anInt1588 - class13_sub1_sub1_sub6_sub1.anInt1588;
                    if (l1 != 0 || i2 != 0) {
                        class13_sub1_sub1_sub6.anInt1609 = (int) (Math.atan2(l1, i2) * 325.94900000000001D) & 0x7ff;
                    }
                }
            }
            if ((class13_sub1_sub1_sub6.anInt1582 != 0 || class13_sub1_sub1_sub6.anInt1583 != 0) && (class13_sub1_sub1_sub6.anInt1591 == 0 || class13_sub1_sub1_sub6.anInt1568 > 0)) {
                int k = class13_sub1_sub1_sub6.anInt1587 - (class13_sub1_sub1_sub6.anInt1582 - anInt1083 - anInt1083) * 64;
                int j1 = class13_sub1_sub1_sub6.anInt1588 - (class13_sub1_sub1_sub6.anInt1583 - anInt1084 - anInt1084) * 64;
                if (k != 0 || j1 != 0) {
                    class13_sub1_sub1_sub6.anInt1609 = (int) (Math.atan2(k, j1) * 325.94900000000001D) & 0x7ff;
                }
                class13_sub1_sub1_sub6.anInt1582 = 0;
                class13_sub1_sub1_sub6.anInt1583 = 0;
            }
            int l = class13_sub1_sub1_sub6.anInt1609 - class13_sub1_sub1_sub6.anInt1589 & 0x7ff;
            if (l != 0) {
                if (l < class13_sub1_sub1_sub6.anInt1618 || l > 2048 - class13_sub1_sub1_sub6.anInt1618) {
                    class13_sub1_sub1_sub6.anInt1589 = class13_sub1_sub1_sub6.anInt1609;
                } else if (l > 1024) {
                    class13_sub1_sub1_sub6.anInt1589 -= class13_sub1_sub1_sub6.anInt1618;
                } else {
                    class13_sub1_sub1_sub6.anInt1589 += class13_sub1_sub1_sub6.anInt1618;
                }
                class13_sub1_sub1_sub6.anInt1589 &= 0x7ff;
                if (class13_sub1_sub1_sub6.anInt1620 == class13_sub1_sub1_sub6.anInt1584 && class13_sub1_sub1_sub6.anInt1589 != class13_sub1_sub1_sub6.anInt1609) {
                    if (class13_sub1_sub1_sub6.anInt1585 != -1) {
                        class13_sub1_sub1_sub6.anInt1620 = class13_sub1_sub1_sub6.anInt1585;
                        return;
                    } else {
                        class13_sub1_sub1_sub6.anInt1620 = class13_sub1_sub1_sub6.anInt1570;
                        return;
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("25438, " + i + ", " + class13_sub1_sub1_sub6 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method131(Class13_Sub1_Sub1_Sub6 class13_sub1_sub1_sub6, boolean flag) {
        try {
            aBoolean851 &= flag;
            class13_sub1_sub1_sub6.aBoolean1569 = false;
            if (class13_sub1_sub1_sub6.anInt1620 != -1) {
                Class50 class50 = Class50.aClass50Array800[class13_sub1_sub1_sub6.anInt1620];
                class13_sub1_sub1_sub6.anInt1622++;
                if (class13_sub1_sub1_sub6.anInt1621 < class50.anInt801 && class13_sub1_sub1_sub6.anInt1622 > class50.method592(0, class13_sub1_sub1_sub6.anInt1621)) {
                    class13_sub1_sub1_sub6.anInt1622 = 0;
                    class13_sub1_sub1_sub6.anInt1621++;
                }
                if (class13_sub1_sub1_sub6.anInt1621 >= class50.anInt801) {
                    class13_sub1_sub1_sub6.anInt1622 = 0;
                    class13_sub1_sub1_sub6.anInt1621 = 0;
                }
            }
            if (class13_sub1_sub1_sub6.anInt1592 != -1 && pulseCycle >= class13_sub1_sub1_sub6.anInt1595) {
                if (class13_sub1_sub1_sub6.anInt1593 < 0) {
                    class13_sub1_sub1_sub6.anInt1593 = 0;
                }
                Class50 class50_1 = Class40.aClass40Array685[class13_sub1_sub1_sub6.anInt1592].aClass50_689;
                for (class13_sub1_sub1_sub6.anInt1594++; class13_sub1_sub1_sub6.anInt1593 < class50_1.anInt801 && class13_sub1_sub1_sub6.anInt1594 > class50_1.method592(0, class13_sub1_sub1_sub6.anInt1593); class13_sub1_sub1_sub6.anInt1593++) {
                    class13_sub1_sub1_sub6.anInt1594 -= class50_1.method592(0, class13_sub1_sub1_sub6.anInt1593);
                }
                if (class13_sub1_sub1_sub6.anInt1593 >= class50_1.anInt801 && (class13_sub1_sub1_sub6.anInt1593 < 0 || class13_sub1_sub1_sub6.anInt1593 >= class50_1.anInt801)) {
                    class13_sub1_sub1_sub6.anInt1592 = -1;
                }
            }
            if (class13_sub1_sub1_sub6.anInt1597 != -1 && class13_sub1_sub1_sub6.anInt1600 <= 1) {
                Class50 class50_2 = Class50.aClass50Array800[class13_sub1_sub1_sub6.anInt1597];
                if (class50_2.anInt812 == 1 && class13_sub1_sub1_sub6.anInt1619 > 0 && class13_sub1_sub1_sub6.anInt1579 <= pulseCycle && class13_sub1_sub1_sub6.anInt1580 < pulseCycle) {
                    class13_sub1_sub1_sub6.anInt1600 = 1;
                    return;
                }
            }
            if (class13_sub1_sub1_sub6.anInt1597 != -1 && class13_sub1_sub1_sub6.anInt1600 == 0) {
                Class50 class50_3 = Class50.aClass50Array800[class13_sub1_sub1_sub6.anInt1597];
                for (class13_sub1_sub1_sub6.anInt1599++; class13_sub1_sub1_sub6.anInt1598 < class50_3.anInt801 && class13_sub1_sub1_sub6.anInt1599 > class50_3.method592(0, class13_sub1_sub1_sub6.anInt1598); class13_sub1_sub1_sub6.anInt1598++) {
                    class13_sub1_sub1_sub6.anInt1599 -= class50_3.method592(0, class13_sub1_sub1_sub6.anInt1598);
                }
                if (class13_sub1_sub1_sub6.anInt1598 >= class50_3.anInt801) {
                    class13_sub1_sub1_sub6.anInt1598 -= class50_3.anInt805;
                    class13_sub1_sub1_sub6.anInt1601++;
                    if (class13_sub1_sub1_sub6.anInt1601 >= class50_3.anInt811) {
                        class13_sub1_sub1_sub6.anInt1597 = -1;
                    }
                    if (class13_sub1_sub1_sub6.anInt1598 < 0 || class13_sub1_sub1_sub6.anInt1598 >= class50_3.anInt801) {
                        class13_sub1_sub1_sub6.anInt1597 = -1;
                    }
                }
                class13_sub1_sub1_sub6.aBoolean1569 = class50_3.aBoolean807;
            }
            if (class13_sub1_sub1_sub6.anInt1600 > 0) {
                class13_sub1_sub1_sub6.anInt1600--;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("83855, " + class13_sub1_sub1_sub6 + ", " + flag + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method132(int i) {
        try {
            if (aBoolean1216) {
                aBoolean1216 = false;
                aClass31_875.method491(super.aGraphics15, 4, false, 0);
                aClass31_876.method491(super.aGraphics15, 357, false, 0);
                aClass31_877.method491(super.aGraphics15, 4, false, 722);
                aClass31_878.method491(super.aGraphics15, 205, false, 743);
                aClass31_879.method491(super.aGraphics15, 0, false, 0);
                aClass31_880.method491(super.aGraphics15, 4, false, 516);
                aClass31_881.method491(super.aGraphics15, 205, false, 516);
                aClass31_882.method491(super.aGraphics15, 357, false, 496);
                aClass31_883.method491(super.aGraphics15, 338, false, 0);
                aBoolean1148 = true;
                aBoolean1169 = true;
                aBoolean1286 = true;
                aBoolean1137 = true;
                if (anInt1254 != 2) {
                    aClass31_1213.method491(super.aGraphics15, 4, false, 4);
                    aClass31_1212.method491(super.aGraphics15, 4, false, 550);
                }
            }
            if (anInt1254 == 2) {
                method50(anInt992);
            }
            if (aBoolean989 && anInt820 == 1) {
                aBoolean1148 = true;
            }
            if (anInt874 != -1) {
                boolean flag = method74(anInt1241, true, anInt874);
                if (flag) {
                    aBoolean1148 = true;
                }
            }
            if (anInt936 == 2) {
                aBoolean1148 = true;
            }
            if (anInt1060 == 2) {
                aBoolean1148 = true;
            }
            if (aBoolean1148) {
                method62((byte) 6);
                aBoolean1148 = false;
            }
            if (anInt1016 == -1) {
                aWidget_1050.anInt595 = anInt886 - anInt1019 - 77;
                if (super.anInt23 > 448 && super.anInt23 < 560 && super.anInt24 > 332) {
                    method111(super.anInt23 - 17, 463, anInt886, super.anInt24 - 357, 77, (byte) 4, aWidget_1050, false, 0);
                }
                int j = anInt886 - 77 - aWidget_1050.anInt595;
                if (j < 0) {
                    j = 0;
                }
                if (j > anInt886 - 77) {
                    j = anInt886 - 77;
                }
                if (anInt1019 != j) {
                    anInt1019 = j;
                    aBoolean1169 = true;
                }
            }
            if (anInt1016 != -1) {
                boolean flag1 = method74(anInt1241, true, anInt1016);
                if (flag1) {
                    aBoolean1169 = true;
                }
            }
            if (anInt936 == 3) {
                aBoolean1169 = true;
            }
            if (anInt1060 == 3) {
                aBoolean1169 = true;
            }
            if (aString1160 != null) {
                aBoolean1169 = true;
            }
            if (aBoolean989 && anInt820 == 2) {
                aBoolean1169 = true;
            }
            if (aBoolean1169) {
                method61(false);
                aBoolean1169 = false;
            }
            if (anInt1254 == 2) {
                method44(aBoolean1193);
                aClass31_1212.method491(super.aGraphics15, 4, false, 550);
            }
            if (anInt1087 != -1) {
                aBoolean1286 = true;
            }
            if (aBoolean1286) {
                if (anInt1087 != -1 && anInt1087 == anInt864) {
                    anInt1087 = -1;
                    aBuffer_928.method300(69);
                    aBuffer_928.writeByte(anInt864);
                }
                aBoolean1286 = false;
                aClass31_1188.method490(false);
                aClass13_Sub1_Sub4_Sub3_1114.method401(0, (byte) 83, 0);
                if (anInt874 == -1) {
                    if (anIntArray1018[anInt864] != -1) {
                        if (anInt864 == 0) {
                            aClass13_Sub1_Sub4_Sub3_867.method401(10, (byte) 83, 22);
                        }
                        if (anInt864 == 1) {
                            aClass13_Sub1_Sub4_Sub3_868.method401(8, (byte) 83, 54);
                        }
                        if (anInt864 == 2) {
                            aClass13_Sub1_Sub4_Sub3_868.method401(8, (byte) 83, 82);
                        }
                        if (anInt864 == 3) {
                            aClass13_Sub1_Sub4_Sub3_869.method401(8, (byte) 83, 110);
                        }
                        if (anInt864 == 4) {
                            aClass13_Sub1_Sub4_Sub3_871.method401(8, (byte) 83, 153);
                        }
                        if (anInt864 == 5) {
                            aClass13_Sub1_Sub4_Sub3_871.method401(8, (byte) 83, 181);
                        }
                        if (anInt864 == 6) {
                            aClass13_Sub1_Sub4_Sub3_870.method401(9, (byte) 83, 209);
                        }
                    }
                    if (anIntArray1018[0] != -1 && (anInt1087 != 0 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[0].method401(13, (byte) 83, 29);
                    }
                    if (anIntArray1018[1] != -1 && (anInt1087 != 1 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[1].method401(11, (byte) 83, 53);
                    }
                    if (anIntArray1018[2] != -1 && (anInt1087 != 2 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[2].method401(11, (byte) 83, 82);
                    }
                    if (anIntArray1018[3] != -1 && (anInt1087 != 3 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[3].method401(12, (byte) 83, 115);
                    }
                    if (anIntArray1018[4] != -1 && (anInt1087 != 4 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[4].method401(13, (byte) 83, 153);
                    }
                    if (anIntArray1018[5] != -1 && (anInt1087 != 5 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[5].method401(11, (byte) 83, 180);
                    }
                    if (anIntArray1018[6] != -1 && (anInt1087 != 6 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[6].method401(13, (byte) 83, 208);
                    }
                }
                aClass31_1188.method491(super.aGraphics15, 160, false, 516);
                aClass31_1187.method490(false);
                aClass13_Sub1_Sub4_Sub3_1113.method401(0, (byte) 83, 0);
                if (anInt874 == -1) {
                    if (anIntArray1018[anInt864] != -1) {
                        if (anInt864 == 7) {
                            aClass13_Sub1_Sub4_Sub3_1088.method401(0, (byte) 83, 42);
                        }
                        if (anInt864 == 8) {
                            aClass13_Sub1_Sub4_Sub3_1089.method401(0, (byte) 83, 74);
                        }
                        if (anInt864 == 9) {
                            aClass13_Sub1_Sub4_Sub3_1089.method401(0, (byte) 83, 102);
                        }
                        if (anInt864 == 10) {
                            aClass13_Sub1_Sub4_Sub3_1090.method401(1, (byte) 83, 130);
                        }
                        if (anInt864 == 11) {
                            aClass13_Sub1_Sub4_Sub3_1092.method401(0, (byte) 83, 173);
                        }
                        if (anInt864 == 12) {
                            aClass13_Sub1_Sub4_Sub3_1092.method401(0, (byte) 83, 201);
                        }
                        if (anInt864 == 13) {
                            aClass13_Sub1_Sub4_Sub3_1091.method401(0, (byte) 83, 229);
                        }
                    }
                    if (anIntArray1018[8] != -1 && (anInt1087 != 8 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[7].method401(2, (byte) 83, 74);
                    }
                    if (anIntArray1018[9] != -1 && (anInt1087 != 9 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[8].method401(3, (byte) 83, 102);
                    }
                    if (anIntArray1018[10] != -1 && (anInt1087 != 10 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[9].method401(4, (byte) 83, 137);
                    }
                    if (anIntArray1018[11] != -1 && (anInt1087 != 11 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[10].method401(2, (byte) 83, 174);
                    }
                    if (anIntArray1018[12] != -1 && (anInt1087 != 12 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[11].method401(2, (byte) 83, 201);
                    }
                    if (anIntArray1018[13] != -1 && (anInt1087 != 13 || pulseCycle % 20 < 10)) {
                        aClass13_Sub1_Sub4_Sub3Array1181[12].method401(2, (byte) 83, 226);
                    }
                }
                aClass31_1187.method491(super.aGraphics15, 466, false, 496);
                aClass31_1213.method490(false);
            }
            if (aBoolean1137) {
                aBoolean1137 = false;
                aClass31_1186.method490(false);
                aClass13_Sub1_Sub4_Sub3_1112.method401(0, (byte) 83, 0);
                aClass13_Sub1_Sub4_Sub2_892.method382(55, true, "Public chat", 28, 0xffffff, false);
                if (anInt1159 == 0) {
                    aClass13_Sub1_Sub4_Sub2_892.method382(55, true, "On", 41, 65280, false);
                }
                if (anInt1159 == 1) {
                    aClass13_Sub1_Sub4_Sub2_892.method382(55, true, "Friends", 41, 0xffff00, false);
                }
                if (anInt1159 == 2) {
                    aClass13_Sub1_Sub4_Sub2_892.method382(55, true, "Off", 41, 0xff0000, false);
                }
                if (anInt1159 == 3) {
                    aClass13_Sub1_Sub4_Sub2_892.method382(55, true, "Hide", 41, 65535, false);
                }
                aClass13_Sub1_Sub4_Sub2_892.method382(184, true, "Private chat", 28, 0xffffff, false);
                if (anInt1129 == 0) {
                    aClass13_Sub1_Sub4_Sub2_892.method382(184, true, "On", 41, 65280, false);
                }
                if (anInt1129 == 1) {
                    aClass13_Sub1_Sub4_Sub2_892.method382(184, true, "Friends", 41, 0xffff00, false);
                }
                if (anInt1129 == 2) {
                    aClass13_Sub1_Sub4_Sub2_892.method382(184, true, "Off", 41, 0xff0000, false);
                }
                aClass13_Sub1_Sub4_Sub2_892.method382(324, true, "Trade/compete", 28, 0xffffff, false);
                if (anInt1290 == 0) {
                    aClass13_Sub1_Sub4_Sub2_892.method382(324, true, "On", 41, 65280, false);
                }
                if (anInt1290 == 1) {
                    aClass13_Sub1_Sub4_Sub2_892.method382(324, true, "Friends", 41, 0xffff00, false);
                }
                if (anInt1290 == 2) {
                    aClass13_Sub1_Sub4_Sub2_892.method382(324, true, "Off", 41, 0xff0000, false);
                }
                aClass13_Sub1_Sub4_Sub2_892.method382(458, true, "Report abuse", 33, 0xffffff, false);
                aClass31_1186.method491(super.aGraphics15, 453, false, 0);
                aClass31_1213.method490(false);
            }
            anInt1241 = 0;
            if (i != -24986) {
                for (int k = 1; k > 0; k++) {
                }
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("24138, " + i + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method133(int i, int j, int k, int l, Class47 class47) {
        try {
            while (j >= 0) {
                aBoolean863 = !aBoolean863;
            }
            if (anInt1167 >= 400) {
                return;
            }
            if (class47.anIntArray751 != null) {
                class47 = class47.method584((byte) 0);
            }
            if (class47 == null) {
                return;
            }
            if (!class47.aBoolean784) {
                return;
            }
            String s = class47.aString765;
            if (class47.anInt756 != 0) {
                s = s + method137(class47.anInt756, aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1697, 453) + " (level-" + class47.anInt756 + ")";
            }
            if (anInt1025 == 1) {
                aStringArray961[anInt1167] = "Use " + aString1029 + " with @yel@" + s;
                anIntArray911[anInt1167] = 447;
                anIntArray912[anInt1167] = i;
                anIntArray909[anInt1167] = k;
                anIntArray910[anInt1167] = l;
                anInt1167++;
                return;
            }
            if (anInt973 == 1) {
                if ((anInt975 & 2) == 2) {
                    aStringArray961[anInt1167] = aString976 + " @yel@" + s;
                    anIntArray911[anInt1167] = 582;
                    anIntArray912[anInt1167] = i;
                    anIntArray909[anInt1167] = k;
                    anIntArray910[anInt1167] = l;
                    anInt1167++;
                    return;
                }
            } else {
                if (class47.aStringArray747 != null) {
                    for (int i1 = 4; i1 >= 0; i1--) {
                        if (class47.aStringArray747[i1] != null && !class47.aStringArray747[i1].equalsIgnoreCase("attack")) {
                            aStringArray961[anInt1167] = class47.aStringArray747[i1] + " @yel@" + s;
                            if (i1 == 0) {
                                anIntArray911[anInt1167] = 291;
                            }
                            if (i1 == 1) {
                                anIntArray911[anInt1167] = 69;
                            }
                            if (i1 == 2) {
                                anIntArray911[anInt1167] = 257;
                            }
                            if (i1 == 3) {
                                anIntArray911[anInt1167] = 616;
                            }
                            if (i1 == 4) {
                                anIntArray911[anInt1167] = 672;
                            }
                            anIntArray912[anInt1167] = i;
                            anIntArray909[anInt1167] = k;
                            anIntArray910[anInt1167] = l;
                            anInt1167++;
                        }
                    }
                }
                if (class47.aStringArray747 != null) {
                    for (int j1 = 4; j1 >= 0; j1--) {
                        if (class47.aStringArray747[j1] != null && class47.aStringArray747[j1].equalsIgnoreCase("attack")) {
                            char c = '\0';
                            if (class47.anInt756 > aClass13_Sub1_Sub1_Sub6_Sub1_997.anInt1697) {
                                c = '\u07D0';
                            }
                            aStringArray961[anInt1167] = class47.aStringArray747[j1] + " @yel@" + s;
                            if (j1 == 0) {
                                anIntArray911[anInt1167] = 291 + c;
                            }
                            if (j1 == 1) {
                                anIntArray911[anInt1167] = 69 + c;
                            }
                            if (j1 == 2) {
                                anIntArray911[anInt1167] = 257 + c;
                            }
                            if (j1 == 3) {
                                anIntArray911[anInt1167] = 616 + c;
                            }
                            if (j1 == 4) {
                                anIntArray911[anInt1167] = 672 + c;
                            }
                            anIntArray912[anInt1167] = i;
                            anIntArray909[anInt1167] = k;
                            anIntArray910[anInt1167] = l;
                            anInt1167++;
                        }
                    }
                }
                aStringArray961[anInt1167] = "Examine @yel@" + s;
                anIntArray911[anInt1167] = 1210;
                anIntArray912[anInt1167] = i;
                anIntArray909[anInt1167] = k;
                anIntArray910[anInt1167] = l;
                anInt1167++;
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("11684, " + i + ", " + j + ", " + k + ", " + l + ", " + class47 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method134(int i) {
        try {
            packetSize += i;
            aBoolean1099 = true;
            for (int j = 0; j < 7; j++) {
                anIntArray1011[j] = -1;
                for (int k = 0; k < Class4.anInt64; k++) {
                    if (Class4.aClass4Array65[k].aBoolean71 || Class4.aClass4Array65[k].anInt66 != j + (aBoolean1068 ? 0 : 7)) {
                        continue;
                    }
                    anIntArray1011[j] = k;
                    break;
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("5715, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public Socket method135(int i)
            throws IOException {
        if (Signlink.mainapp != null) {
            return Signlink.opensocket(i);
        } else {
            return new Socket(InetAddress.getByName(getCodeBase().getHost()), i);
        }
    }

    public void method136(Buffer buffer, int i, int j) {
        try {
            int k = buffer.readBits(8, 195);
            if (j < 1 || j > 1) {
                aBuffer_928.writeByte(229);
            }
            if (k < anInt899) {
                for (int l = k; l < anInt899; l++) {
                    anIntArray1072[anInt1071++] = playerList[l];
                }
            }
            if (k > anInt899) {
                Signlink.reportError(username + " Too many players");
                throw new RuntimeException("eek");
            }
            anInt899 = 0;
            for (int i1 = 0; i1 < k; i1++) {
                int j1 = playerList[i1];
                Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1 = players[j1];
                int k1 = buffer.readBits(1, 195);
                if (k1 == 0) {
                    playerList[anInt899++] = j1;
                    class13_sub1_sub1_sub6_sub1.pulseCycle = pulseCycle;
                } else {
                    int movementType = buffer.readBits(2, 195);
                    if (movementType == 0) {
                        playerList[anInt899++] = j1;
                        class13_sub1_sub1_sub6_sub1.pulseCycle = pulseCycle;
                        anIntArray902[anInt901++] = j1;
                    } else if (movementType == 1) {
                        playerList[anInt899++] = j1;
                        class13_sub1_sub1_sub6_sub1.pulseCycle = pulseCycle;
                        int i2 = buffer.readBits(3, 195);
                        class13_sub1_sub1_sub6_sub1.method292(i2, 125, false);
                        int k2 = buffer.readBits(1, 195);
                        if (k2 == 1) {
                            anIntArray902[anInt901++] = j1;
                        }
                    } else if (movementType == 2) {
                        playerList[anInt899++] = j1;
                        class13_sub1_sub1_sub6_sub1.pulseCycle = pulseCycle;
                        int j2 = buffer.readBits(3, 195);
                        class13_sub1_sub1_sub6_sub1.method292(j2, 125, true);
                        int l2 = buffer.readBits(3, 195);
                        class13_sub1_sub1_sub6_sub1.method292(l2, 125, true);
                        int i3 = buffer.readBits(1, 195);
                        if (i3 == 1) {
                            anIntArray902[anInt901++] = j1;
                        }
                    } else if (movementType == 3) {
                        anIntArray1072[anInt1071++] = j1;
                    }
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("94480, " + buffer + ", " + i + ", " + j + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method138(byte byte0) {
        try {
            int i = anInt833 * 128 + 64;
            int j = anInt834 * 128 + 64;
            int k = method80(anInt1166, 781, j, i) - anInt835;
            if (anInt1004 < i) {
                anInt1004 += anInt836 + ((i - anInt1004) * anInt837) / 1000;
                if (anInt1004 > i) {
                    anInt1004 = i;
                }
            }
            if (anInt1004 > i) {
                anInt1004 -= anInt836 + ((anInt1004 - i) * anInt837) / 1000;
                if (anInt1004 < i) {
                    anInt1004 = i;
                }
            }
            if (anInt1005 < k) {
                anInt1005 += anInt836 + ((k - anInt1005) * anInt837) / 1000;
                if (anInt1005 > k) {
                    anInt1005 = k;
                }
            }
            if (anInt1005 > k) {
                anInt1005 -= anInt836 + ((anInt1005 - k) * anInt837) / 1000;
                if (anInt1005 < k) {
                    anInt1005 = k;
                }
            }
            if (anInt1006 < j) {
                anInt1006 += anInt836 + ((j - anInt1006) * anInt837) / 1000;
                if (anInt1006 > j) {
                    anInt1006 = j;
                }
            }
            if (anInt1006 > j) {
                anInt1006 -= anInt836 + ((anInt1006 - j) * anInt837) / 1000;
                if (anInt1006 < j) {
                    anInt1006 = j;
                }
            }
            anInt1151++;
            if (anInt1151 > 84) {
                anInt1151 = 0;
                aBuffer_928.method300(173);
            }
            i = anInt1038 * 128 + 64;
            j = anInt1039 * 128 + 64;
            k = method80(anInt1166, 781, j, i) - anInt1040;
            if (byte0 != 6) {
                opcode = buffer.readUnsignedByte();
            }
            int l = i - anInt1004;
            int i1 = k - anInt1005;
            int j1 = j - anInt1006;
            int k1 = (int) Math.sqrt(l * l + j1 * j1);
            int l1 = (int) (Math.atan2(i1, k1) * 325.94900000000001D) & 0x7ff;
            int i2 = (int) (Math.atan2(l, j1) * -325.94900000000001D) & 0x7ff;
            if (l1 < 128) {
                l1 = 128;
            }
            if (l1 > 383) {
                l1 = 383;
            }
            if (anInt1007 < l1) {
                anInt1007 += anInt1041 + ((l1 - anInt1007) * anInt1042) / 1000;
                if (anInt1007 > l1) {
                    anInt1007 = l1;
                }
            }
            if (anInt1007 > l1) {
                anInt1007 -= anInt1041 + ((anInt1007 - l1) * anInt1042) / 1000;
                if (anInt1007 < l1) {
                    anInt1007 = l1;
                }
            }
            int j2 = i2 - anInt1008;
            if (j2 > 1024) {
                j2 -= 2048;
            }
            if (j2 < -1024) {
                j2 += 2048;
            }
            if (j2 > 0) {
                anInt1008 += anInt1041 + (j2 * anInt1042) / 1000;
                anInt1008 &= 0x7ff;
            }
            if (j2 < 0) {
                anInt1008 -= anInt1041 + (-j2 * anInt1042) / 1000;
                anInt1008 &= 0x7ff;
            }
            int k2 = i2 - anInt1008;
            if (k2 > 1024) {
                k2 -= 2048;
            }
            if (k2 < -1024) {
                k2 += 2048;
            }
            if (k2 < 0 && j2 > 0 || k2 > 0 && j2 < 0) {
                anInt1008 = i2;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("92049, " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public Class1 method139(int i, String s, int j, int k, int l, String s1) {
        try {
            byte[] abyte0 = null;
            if (i != 31060) {
                aBoolean1147 = !aBoolean1147;
            }
            int i1 = 5;
            try {
                if (aClass28Array1264[0] != null) {
                    abyte0 = aClass28Array1264[0].method481(l, 26421);
                }
            } catch (Exception _ex) {
            }
            if (abyte0 != null) {
                aCRC32_1065.reset();
                aCRC32_1065.update(abyte0);
                int j1 = (int) aCRC32_1065.getValue();
                if (j1 != k) {
                    abyte0 = null;
                }
            }
            if (abyte0 != null) {
                Class1 class1 = new Class1(abyte0, 782);
                return class1;
            }
            int k1 = 0;
            while (abyte0 == null) {
                String s2 = "Unknown error";
                method13(false, "Requesting " + s1, j);
                Object obj = null;
                try {
                    int l1 = 0;
                    DataInputStream datainputstream = method141(s + k);
                    byte[] abyte1 = new byte[6];
                    datainputstream.readFully(abyte1, 0, 6);
                    Buffer buffer = new Buffer(-351, abyte1);
                    buffer.position = 3;
                    int j2 = buffer.readTriByte() + 6;
                    int k2 = 6;
                    abyte0 = new byte[j2];
                    for (int l2 = 0; l2 < 6; l2++) {
                        abyte0[l2] = abyte1[l2];
                    }
                    while (k2 < j2) {
                        int i3 = j2 - k2;
                        if (i3 > 1000) {
                            i3 = 1000;
                        }
                        int k3 = datainputstream.read(abyte0, k2, i3);
                        if (k3 < 0) {
                            s2 = "Length error: " + k2 + "/" + j2;
                            throw new IOException("EOF");
                        }
                        k2 += k3;
                        int l3 = (k2 * 100) / j2;
                        if (l3 != l1) {
                            method13(false, "Loading " + s1 + " - " + l3 + "%", j);
                        }
                        l1 = l3;
                    }
                    datainputstream.close();
                    try {
                        if (aClass28Array1264[0] != null) {
                            aClass28Array1264[0].method482(abyte0, -739, l, abyte0.length);
                        }
                    } catch (Exception _ex) {
                        aClass28Array1264[0] = null;
                    }
                    if (abyte0 != null) {
                        aCRC32_1065.reset();
                        aCRC32_1065.update(abyte0);
                        int j3 = (int) aCRC32_1065.getValue();
                        if (j3 != k) {
                            abyte0 = null;
                            k1++;
                            s2 = "Checksum error: " + j3;
                        }
                    }
                } catch (IOException ioexception) {
                    if (s2.equals("Unknown error")) {
                        s2 = "Connection error";
                    }
                    abyte0 = null;
                } catch (NullPointerException _ex) {
                    s2 = "Null error";
                    abyte0 = null;
                    if (!Signlink.reporterror) {
                        return null;
                    }
                } catch (ArrayIndexOutOfBoundsException _ex) {
                    s2 = "Bounds error";
                    abyte0 = null;
                    if (!Signlink.reporterror) {
                        return null;
                    }
                } catch (Exception _ex) {
                    s2 = "Unexpected error";
                    abyte0 = null;
                    if (!Signlink.reporterror) {
                        return null;
                    }
                }
                if (abyte0 == null) {
                    for (int i2 = i1; i2 > 0; i2--) {
                        if (k1 >= 3) {
                            method13(false, "Game updated - please reload page", j);
                            i2 = 10;
                        } else {
                            method13(false, s2 + " - Retrying in " + i2, j);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception _ex) {
                        }
                    }
                    i1 *= 2;
                    if (i1 > 60) {
                        i1 = 60;
                    }
                    aBoolean1069 = !aBoolean1069;
                }
            }
            Class1 class1_1 = new Class1(abyte0, 782);
            return class1_1;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("88470, " + i + ", " + s + ", " + j + ", " + k + ", " + l + ", " + s1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method140(int i) {
        try {
            aBuffer_928.method300(199);
            if (anInt874 != -1) {
                anInt874 = -1;
                aBoolean1148 = true;
                aBoolean1048 = false;
                aBoolean1286 = true;
            }
            if (anInt1016 != -1) {
                anInt1016 = -1;
                aBoolean1169 = true;
                aBoolean1048 = false;
            }
            anInt1217 = -1;
            if (i < 6 || i > 6) {
                opcode = buffer.readUnsignedByte();
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("82683, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public DataInputStream method141(String s)
            throws IOException {
        if (!aBoolean1069) {
            if (Signlink.mainapp != null) {
                return Signlink.openurl(s);
            } else {
                return new DataInputStream((new URL(getCodeBase(), s)).openStream());
            }
        }
        if (aSocket1219 != null) {
            try {
                aSocket1219.close();
            } catch (Exception _ex) {
            }
            aSocket1219 = null;
        }
        aSocket1219 = method135(43595);
        aSocket1219.setSoTimeout(10000);
        java.io.InputStream inputstream = aSocket1219.getInputStream();
        OutputStream outputstream = aSocket1219.getOutputStream();
        outputstream.write(("JAGGRAB /" + s + "\n\n").getBytes());
        return new DataInputStream(inputstream);
    }

    public void method6() {
        method13(false, "Starting up", 20);
        if (Signlink.sunjava) {
            super.anInt9 = 5;
        }
        if (aBoolean914) {
            aBoolean1239 = true;
            return;
        }
        aBoolean914 = true;
        boolean flag = false;
        String s = method104(470);
        if (s.endsWith("jagex.com")) {
            flag = true;
        }
        if (s.endsWith("runescape.com")) {
            flag = true;
        }
        if (s.endsWith("192.168.1.2")) {
            flag = true;
        }
        if (s.endsWith("192.168.1.229")) {
            flag = true;
        }
        if (s.endsWith("192.168.1.228")) {
            flag = true;
        }
        if (s.endsWith("192.168.1.227")) {
            flag = true;
        }
        if (s.endsWith("192.168.1.226")) {
            flag = true;
        }
        if (s.endsWith("127.0.0.1")) {
            flag = true;
        }
        if (!flag) {
            aBoolean842 = true;
            return;
        }
        if (Signlink.cache_dat != null) {
            for (int i = 0; i < 5; i++) {
                aClass28Array1264[i] = new Class28(475, 0x7a120, i + 1, Signlink.cache_dat, Signlink.cache_idx[i]);
            }
        }
        try {
            method38(anInt1238);
            aClass1_991 = method139(31060, "title", 25, anIntArray1277[1], 1, "title screen");
            aClass13_Sub1_Sub4_Sub2_891 = new Class13_Sub1_Sub4_Sub2("p11_full", aClass1_991, false, 6);
            aClass13_Sub1_Sub4_Sub2_892 = new Class13_Sub1_Sub4_Sub2("p12_full", aClass1_991, false, 6);
            aClass13_Sub1_Sub4_Sub2_893 = new Class13_Sub1_Sub4_Sub2("b12_full", aClass1_991, false, 6);
            aClass13_Sub1_Sub4_Sub2_894 = new Class13_Sub1_Sub4_Sub2("q8_full", aClass1_991, true, 6);
            method32(736);
            method122(8);
            Class1 class1 = method139(31060, "config", 30, anIntArray1277[2], 2, "config");
            Class1 class1_1 = method139(31060, "interface", 35, anIntArray1277[3], 3, "interface");
            Class1 class1_2 = method139(31060, "media", 40, anIntArray1277[4], 4, "2d graphics");
            Class1 class1_3 = method139(31060, "textures", 45, anIntArray1277[6], 6, "textures");
            Class1 class1_4 = method139(31060, "wordenc", 50, anIntArray1277[7], 7, "chat system");
            Class1 class1_5 = method139(31060, "sounds", 55, anIntArray1277[8], 8, "sound effects");
            aByteArrayArrayArray1164 = new byte[4][104][104];
            anIntArrayArrayArray1267 = new int[4][105][105];
            aClass10_1198 = new Class10(104, 4, 104, anIntArrayArrayArray1267, 0);
            for (int j = 0; j < 4; j++) {
                aClass39Array947[j] = new Class39(604, 104, 104);
            }
            aClass13_Sub1_Sub4_Sub4_1223 = new Class13_Sub1_Sub4_Sub4(512, 512);
            Class1 class1_6 = method139(31060, "versionlist", 60, anIntArray1277[5], 5, "update list");
            method13(false, "Connecting to update server", 60);
            aClass2_Sub1_873 = new Class2_Sub1();
            aClass2_Sub1_873.method169(class1_6, this);
            Class8.method185(aClass2_Sub1_873.method158((byte) 50));
            Class13_Sub1_Sub1_Sub4.method262(aClass2_Sub1_873.method163(-29, 0), aClass2_Sub1_873);
            if (!aBoolean954) {
                anInt1012 = 0;
                try {
                    anInt1012 = Integer.parseInt(getParameter("music"));
                } catch (Exception _ex) {
                }
                aBoolean1013 = true;
                aClass2_Sub1_873.method156(2, anInt1012);
                while (aClass2_Sub1_873.method167() > 0) {
                    method48(3);
                    try {
                        Thread.sleep(100L);
                    } catch (Exception _ex) {
                    }
                    if (aClass2_Sub1_873.anInt1333 > 3) {
                        method88("ondemand");
                        return;
                    }
                }
            }
            method13(false, "Requesting animations", 65);
            int k = aClass2_Sub1_873.method163(-29, 1);
            for (int i1 = 0; i1 < k; i1++) {
                aClass2_Sub1_873.method156(1, i1);
            }
            while (aClass2_Sub1_873.method167() > 0) {
                int j1 = k - aClass2_Sub1_873.method167();
                if (j1 > 0) {
                    method13(false, "Loading animations - " + (j1 * 100) / k + "%", 65);
                }
                method48(3);
                try {
                    Thread.sleep(100L);
                } catch (Exception _ex) {
                }
                if (aClass2_Sub1_873.anInt1333 > 3) {
                    method88("ondemand");
                    return;
                }
            }
            method13(false, "Requesting models", 70);
            k = aClass2_Sub1_873.method163(-29, 0);
            for (int k1 = 0; k1 < k; k1++) {
                int l1 = aClass2_Sub1_873.method154(true, k1);
                if ((l1 & 1) != 0) {
                    aClass2_Sub1_873.method156(0, k1);
                }
            }
            k = aClass2_Sub1_873.method167();
            while (aClass2_Sub1_873.method167() > 0) {
                int i2 = k - aClass2_Sub1_873.method167();
                if (i2 > 0) {
                    method13(false, "Loading models - " + (i2 * 100) / k + "%", 70);
                }
                method48(3);
                try {
                    Thread.sleep(100L);
                } catch (Exception _ex) {
                }
            }
            if (aClass28Array1264[0] != null) {
                method13(false, "Requesting maps", 75);
                aClass2_Sub1_873.method156(3, aClass2_Sub1_873.method160(47, 48, 0, 8347));
                aClass2_Sub1_873.method156(3, aClass2_Sub1_873.method160(47, 48, 1, 8347));
                aClass2_Sub1_873.method156(3, aClass2_Sub1_873.method160(48, 48, 0, 8347));
                aClass2_Sub1_873.method156(3, aClass2_Sub1_873.method160(48, 48, 1, 8347));
                aClass2_Sub1_873.method156(3, aClass2_Sub1_873.method160(49, 48, 0, 8347));
                aClass2_Sub1_873.method156(3, aClass2_Sub1_873.method160(49, 48, 1, 8347));
                aClass2_Sub1_873.method156(3, aClass2_Sub1_873.method160(47, 47, 0, 8347));
                aClass2_Sub1_873.method156(3, aClass2_Sub1_873.method160(47, 47, 1, 8347));
                aClass2_Sub1_873.method156(3, aClass2_Sub1_873.method160(48, 47, 0, 8347));
                aClass2_Sub1_873.method156(3, aClass2_Sub1_873.method160(48, 47, 1, 8347));
                aClass2_Sub1_873.method156(3, aClass2_Sub1_873.method160(48, 148, 0, 8347));
                aClass2_Sub1_873.method156(3, aClass2_Sub1_873.method160(48, 148, 1, 8347));
                k = aClass2_Sub1_873.method167();
                while (aClass2_Sub1_873.method167() > 0) {
                    int j2 = k - aClass2_Sub1_873.method167();
                    if (j2 > 0) {
                        method13(false, "Loading maps - " + (j2 * 100) / k + "%", 75);
                    }
                    method48(3);
                    try {
                        Thread.sleep(100L);
                    } catch (Exception _ex) {
                    }
                }
            }
            k = aClass2_Sub1_873.method163(-29, 0);
            for (int k2 = 0; k2 < k; k2++) {
                int l2 = aClass2_Sub1_873.method154(true, k2);
                byte byte0 = 0;
                if ((l2 & 8) != 0) {
                    byte0 = 10;
                } else if ((l2 & 0x20) != 0) {
                    byte0 = 9;
                } else if ((l2 & 0x10) != 0) {
                    byte0 = 8;
                } else if ((l2 & 0x40) != 0) {
                    byte0 = 7;
                } else if ((l2 & 0x80) != 0) {
                    byte0 = 6;
                } else if ((l2 & 2) != 0) {
                    byte0 = 5;
                } else if ((l2 & 4) != 0) {
                    byte0 = 4;
                }
                if ((l2 & 1) != 0) {
                    byte0 = 3;
                }
                if (byte0 != 0) {
                    aClass2_Sub1_873.method162(0, k2, byte0, false);
                }
            }
            aClass2_Sub1_873.method170(-438, aBoolean953);
            if (!aBoolean954) {
                int l = aClass2_Sub1_873.method163(-29, 2);
                for (int i3 = 1; i3 < l; i3++) {
                    if (aClass2_Sub1_873.method153(7, i3)) {
                        aClass2_Sub1_873.method162(2, i3, (byte) 1, false);
                    }
                }
            }
            method13(false, "Unpacking media", 80);
            aClass13_Sub1_Sub4_Sub3_1208 = new Class13_Sub1_Sub4_Sub3(class1_2, "invback", 0);
            aClass13_Sub1_Sub4_Sub3_1210 = new Class13_Sub1_Sub4_Sub3(class1_2, "chatback", 0);
            aClass13_Sub1_Sub4_Sub3_1209 = new Class13_Sub1_Sub4_Sub3(class1_2, "mapback", 0);
            aClass13_Sub1_Sub4_Sub3_1112 = new Class13_Sub1_Sub4_Sub3(class1_2, "backbase1", 0);
            aClass13_Sub1_Sub4_Sub3_1113 = new Class13_Sub1_Sub4_Sub3(class1_2, "backbase2", 0);
            aClass13_Sub1_Sub4_Sub3_1114 = new Class13_Sub1_Sub4_Sub3(class1_2, "backhmid1", 0);
            for (int j3 = 0; j3 < 13; j3++) {
                aClass13_Sub1_Sub4_Sub3Array1181[j3] = new Class13_Sub1_Sub4_Sub3(class1_2, "sideicons", j3);
            }
            aClass13_Sub1_Sub4_Sub4_967 = new Class13_Sub1_Sub4_Sub4(class1_2, "compass", 0);
            aClass13_Sub1_Sub4_Sub4_1049 = new Class13_Sub1_Sub4_Sub4(class1_2, "mapedge", 0);
            aClass13_Sub1_Sub4_Sub4_1049.method405(834);
            try {
                for (int k3 = 0; k3 < 100; k3++) {
                    aClass13_Sub1_Sub4_Sub3Array1123[k3] = new Class13_Sub1_Sub4_Sub3(class1_2, "mapscene", k3);
                }
            } catch (Exception _ex) {
            }
            try {
                for (int l3 = 0; l3 < 100; l3++) {
                    aClass13_Sub1_Sub4_Sub4Array1189[l3] = new Class13_Sub1_Sub4_Sub4(class1_2, "mapfunction", l3);
                }
            } catch (Exception _ex) {
            }
            try {
                for (int i4 = 0; i4 < 20; i4++) {
                    aClass13_Sub1_Sub4_Sub4Array1266[i4] = new Class13_Sub1_Sub4_Sub4(class1_2, "hitmarks", i4);
                }
            } catch (Exception _ex) {
            }
            try {
                for (int j4 = 0; j4 < 20; j4++) {
                    aClass13_Sub1_Sub4_Sub4Array1236[j4] = new Class13_Sub1_Sub4_Sub4(class1_2, "headicons", j4);
                }
            } catch (Exception _ex) {
            }
            aClass13_Sub1_Sub4_Sub4_945 = new Class13_Sub1_Sub4_Sub4(class1_2, "mapmarker", 0);
            aClass13_Sub1_Sub4_Sub4_946 = new Class13_Sub1_Sub4_Sub4(class1_2, "mapmarker", 1);
            for (int k4 = 0; k4 < 8; k4++) {
                aClass13_Sub1_Sub4_Sub4Array1201[k4] = new Class13_Sub1_Sub4_Sub4(class1_2, "cross", k4);
            }
            aClass13_Sub1_Sub4_Sub4_1124 = new Class13_Sub1_Sub4_Sub4(class1_2, "mapdots", 0);
            aClass13_Sub1_Sub4_Sub4_1125 = new Class13_Sub1_Sub4_Sub4(class1_2, "mapdots", 1);
            aClass13_Sub1_Sub4_Sub4_1126 = new Class13_Sub1_Sub4_Sub4(class1_2, "mapdots", 2);
            aClass13_Sub1_Sub4_Sub4_1127 = new Class13_Sub1_Sub4_Sub4(class1_2, "mapdots", 3);
            aClass13_Sub1_Sub4_Sub4_1128 = new Class13_Sub1_Sub4_Sub4(class1_2, "mapdots", 4);
            aClass13_Sub1_Sub4_Sub3_1255 = new Class13_Sub1_Sub4_Sub3(class1_2, "scrollbar", 0);
            aClass13_Sub1_Sub4_Sub3_1256 = new Class13_Sub1_Sub4_Sub3(class1_2, "scrollbar", 1);
            aClass13_Sub1_Sub4_Sub3_867 = new Class13_Sub1_Sub4_Sub3(class1_2, "redstone1", 0);
            aClass13_Sub1_Sub4_Sub3_868 = new Class13_Sub1_Sub4_Sub3(class1_2, "redstone2", 0);
            aClass13_Sub1_Sub4_Sub3_869 = new Class13_Sub1_Sub4_Sub3(class1_2, "redstone3", 0);
            aClass13_Sub1_Sub4_Sub3_870 = new Class13_Sub1_Sub4_Sub3(class1_2, "redstone1", 0);
            aClass13_Sub1_Sub4_Sub3_870.method398(true);
            aClass13_Sub1_Sub4_Sub3_871 = new Class13_Sub1_Sub4_Sub3(class1_2, "redstone2", 0);
            aClass13_Sub1_Sub4_Sub3_871.method398(true);
            aClass13_Sub1_Sub4_Sub3_1088 = new Class13_Sub1_Sub4_Sub3(class1_2, "redstone1", 0);
            aClass13_Sub1_Sub4_Sub3_1088.method399(-275);
            aClass13_Sub1_Sub4_Sub3_1089 = new Class13_Sub1_Sub4_Sub3(class1_2, "redstone2", 0);
            aClass13_Sub1_Sub4_Sub3_1089.method399(-275);
            aClass13_Sub1_Sub4_Sub3_1090 = new Class13_Sub1_Sub4_Sub3(class1_2, "redstone3", 0);
            aClass13_Sub1_Sub4_Sub3_1090.method399(-275);
            aClass13_Sub1_Sub4_Sub3_1091 = new Class13_Sub1_Sub4_Sub3(class1_2, "redstone1", 0);
            aClass13_Sub1_Sub4_Sub3_1091.method398(true);
            aClass13_Sub1_Sub4_Sub3_1091.method399(-275);
            aClass13_Sub1_Sub4_Sub3_1092 = new Class13_Sub1_Sub4_Sub3(class1_2, "redstone2", 0);
            aClass13_Sub1_Sub4_Sub3_1092.method398(true);
            aClass13_Sub1_Sub4_Sub3_1092.method399(-275);
            for (int l4 = 0; l4 < 2; l4++) {
                aClass13_Sub1_Sub4_Sub3Array838[l4] = new Class13_Sub1_Sub4_Sub3(class1_2, "mod_icons", l4);
            }
            Class13_Sub1_Sub4_Sub4 class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(class1_2, "backleft1", 0);
            aClass31_875 = new Class31(true, class13_sub1_sub4_sub4.anInt1681, method11(736), class13_sub1_sub4_sub4.anInt1682);
            class13_sub1_sub4_sub4.method406(0, 0, 902);
            class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(class1_2, "backleft2", 0);
            aClass31_876 = new Class31(true, class13_sub1_sub4_sub4.anInt1681, method11(736), class13_sub1_sub4_sub4.anInt1682);
            class13_sub1_sub4_sub4.method406(0, 0, 902);
            class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(class1_2, "backright1", 0);
            aClass31_877 = new Class31(true, class13_sub1_sub4_sub4.anInt1681, method11(736), class13_sub1_sub4_sub4.anInt1682);
            class13_sub1_sub4_sub4.method406(0, 0, 902);
            class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(class1_2, "backright2", 0);
            aClass31_878 = new Class31(true, class13_sub1_sub4_sub4.anInt1681, method11(736), class13_sub1_sub4_sub4.anInt1682);
            class13_sub1_sub4_sub4.method406(0, 0, 902);
            class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(class1_2, "backtop1", 0);
            aClass31_879 = new Class31(true, class13_sub1_sub4_sub4.anInt1681, method11(736), class13_sub1_sub4_sub4.anInt1682);
            class13_sub1_sub4_sub4.method406(0, 0, 902);
            class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(class1_2, "backvmid1", 0);
            aClass31_880 = new Class31(true, class13_sub1_sub4_sub4.anInt1681, method11(736), class13_sub1_sub4_sub4.anInt1682);
            class13_sub1_sub4_sub4.method406(0, 0, 902);
            class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(class1_2, "backvmid2", 0);
            aClass31_881 = new Class31(true, class13_sub1_sub4_sub4.anInt1681, method11(736), class13_sub1_sub4_sub4.anInt1682);
            class13_sub1_sub4_sub4.method406(0, 0, 902);
            class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(class1_2, "backvmid3", 0);
            aClass31_882 = new Class31(true, class13_sub1_sub4_sub4.anInt1681, method11(736), class13_sub1_sub4_sub4.anInt1682);
            class13_sub1_sub4_sub4.method406(0, 0, 902);
            class13_sub1_sub4_sub4 = new Class13_Sub1_Sub4_Sub4(class1_2, "backhmid2", 0);
            aClass31_883 = new Class31(true, class13_sub1_sub4_sub4.anInt1681, method11(736), class13_sub1_sub4_sub4.anInt1682);
            class13_sub1_sub4_sub4.method406(0, 0, 902);
            int i5 = (int) (Math.random() * 21D) - 10;
            int j5 = (int) (Math.random() * 21D) - 10;
            int k5 = (int) (Math.random() * 21D) - 10;
            int l5 = (int) (Math.random() * 41D) - 20;
            for (int i6 = 0; i6 < 100; i6++) {
                if (aClass13_Sub1_Sub4_Sub4Array1189[i6] != null) {
                    aClass13_Sub1_Sub4_Sub4Array1189[i6].method404(j5 + l5, i5 + l5, (byte) 6, k5 + l5);
                }
                if (aClass13_Sub1_Sub4_Sub3Array1123[i6] != null) {
                    aClass13_Sub1_Sub4_Sub3Array1123[i6].method400(j5 + l5, i5 + l5, (byte) 6, k5 + l5);
                }
            }
            method13(false, "Unpacking textures", 83);
            Class13_Sub1_Sub4_Sub1.method368(aBoolean1240, class1_3);
            Class13_Sub1_Sub4_Sub1.method372(0.80000000000000004D, (byte) 7);
            Class13_Sub1_Sub4_Sub1.method367((byte) 71, 20);
            method13(false, "Unpacking config", 86);
            Class50.method591(class1, (byte) 72);
            Class14.method426(class1);
            Class32.method493(class1, (byte) 72);
            ItemDefinition.method515(class1);
            Class47.method587(class1);
            Class4.method175(class1, (byte) 72);
            Class40.method528(class1, (byte) 72);
            Class22.method444(class1, (byte) 72);
            Class26.method473(class1, (byte) 72);
            ItemDefinition.aBoolean667 = aBoolean953;
            if (!aBoolean954) {
                method13(false, "Unpacking sounds", 90);
                byte[] abyte0 = class1_5.method149("sounds.dat", null);
                Buffer buffer = new Buffer(-351, abyte0);
                Class27.method475(buffer, (byte) 72);
            }
            method13(false, "Unpacking interfaces", 95);
            Class13_Sub1_Sub4_Sub2[] aclass13_sub1_sub4_sub2 = {
                    aClass13_Sub1_Sub4_Sub2_891, aClass13_Sub1_Sub4_Sub2_892, aClass13_Sub1_Sub4_Sub2_893, aClass13_Sub1_Sub4_Sub2_894
            };
            Widget.method501(class1_1, true, class1_2, aclass13_sub1_sub4_sub2);
            method13(false, "Preparing game engine", 100);
            for (int j6 = 0; j6 < 33; j6++) {
                int k6 = 999;
                int i7 = 0;
                for (int k7 = 0; k7 < 34; k7++) {
                    if (aClass13_Sub1_Sub4_Sub3_1209.aByteArray1667[k7 + j6 * aClass13_Sub1_Sub4_Sub3_1209.anInt1669] == 0) {
                        if (k6 == 999) {
                            k6 = k7;
                        }
                        continue;
                    }
                    if (k6 == 999) {
                        continue;
                    }
                    i7 = k7;
                    break;
                }
                anIntArray1171[j6] = k6;
                anIntArray1200[j6] = i7 - k6;
            }
            for (int l6 = 5; l6 < 156; l6++) {
                int j7 = 999;
                int l7 = 0;
                for (int j8 = 25; j8 < 172; j8++) {
                    if (aClass13_Sub1_Sub4_Sub3_1209.aByteArray1667[j8 + l6 * aClass13_Sub1_Sub4_Sub3_1209.anInt1669] == 0 && (j8 > 34 || l6 > 34)) {
                        if (j7 == 999) {
                            j7 = j8;
                        }
                        continue;
                    }
                    if (j7 == 999) {
                        continue;
                    }
                    l7 = j8;
                    break;
                }
                anIntArray1000[l6 - 5] = j7 - 25;
                anIntArray847[l6 - 5] = l7 - j7;
            }
            Class13_Sub1_Sub4_Sub1.method365(96, 479, 8);
            anIntArray857 = Class13_Sub1_Sub4_Sub1.anIntArray1636;
            Class13_Sub1_Sub4_Sub1.method365(261, 190, 8);
            anIntArray858 = Class13_Sub1_Sub4_Sub1.anIntArray1636;
            Class13_Sub1_Sub4_Sub1.method365(334, 512, 8);
            anIntArray859 = Class13_Sub1_Sub4_Sub1.anIntArray1636;
            int[] ai = new int[9];
            for (int i8 = 0; i8 < 9; i8++) {
                int k8 = 128 + i8 * 32 + 15;
                int l8 = 600 + k8 * 3;
                int i9 = Class13_Sub1_Sub4_Sub1.anIntArray1634[k8];
                ai[i8] = l8 * i9 >> 16;
            }
            Class10.method230(800, (byte) 1, ai, 334, 512, 500);
            Class41.method531(class1_4);
            aClass48_865 = new Class48((byte) -123, this);
            method12(aClass48_865, 10);
            Class13_Sub1_Sub1_Sub2.aGame1469 = this;
            Class14.aGame254 = this;
            Class47.aGame777 = this;
            return;
        } catch (Exception exception) {
            Signlink.reportError("loaderror " + aString827 + " " + anInt1053);
        }
        aBoolean1234 = true;
    }

    public void method142(byte byte0, int i, Buffer buffer) {
        try {
            buffer.initBitAccess();
            if (byte0 != 73) {
                anInt1268 = 240;
            }
            int j = buffer.readBits(8, 195);
            if (j < anInt1284) {
                for (int k = j; k < anInt1284; k++) {
                    anIntArray1072[anInt1071++] = anIntArray1285[k];
                }
            }
            if (j > anInt1284) {
                Signlink.reportError(username + " Too many npcs");
                throw new RuntimeException("eek");
            }
            anInt1284 = 0;
            for (int l = 0; l < j; l++) {
                int i1 = anIntArray1285[l];
                Class13_Sub1_Sub1_Sub6_Sub2 class13_sub1_sub1_sub6_sub2 = aClass13_Sub1_Sub1_Sub6_Sub2Array1283[i1];
                int j1 = buffer.readBits(1, 195);
                if (j1 == 0) {
                    anIntArray1285[anInt1284++] = i1;
                    class13_sub1_sub1_sub6_sub2.pulseCycle = pulseCycle;
                } else {
                    int k1 = buffer.readBits(2, 195);
                    if (k1 == 0) {
                        anIntArray1285[anInt1284++] = i1;
                        class13_sub1_sub1_sub6_sub2.pulseCycle = pulseCycle;
                        anIntArray902[anInt901++] = i1;
                    } else if (k1 == 1) {
                        anIntArray1285[anInt1284++] = i1;
                        class13_sub1_sub1_sub6_sub2.pulseCycle = pulseCycle;
                        int l1 = buffer.readBits(3, 195);
                        class13_sub1_sub1_sub6_sub2.method292(l1, 125, false);
                        int j2 = buffer.readBits(1, 195);
                        if (j2 == 1) {
                            anIntArray902[anInt901++] = i1;
                        }
                    } else if (k1 == 2) {
                        anIntArray1285[anInt1284++] = i1;
                        class13_sub1_sub1_sub6_sub2.pulseCycle = pulseCycle;
                        int i2 = buffer.readBits(3, 195);
                        class13_sub1_sub1_sub6_sub2.method292(i2, 125, true);
                        int k2 = buffer.readBits(3, 195);
                        class13_sub1_sub1_sub6_sub2.method292(k2, 125, true);
                        int l2 = buffer.readBits(1, 195);
                        if (l2 == 1) {
                            anIntArray902[anInt901++] = i1;
                        }
                    } else if (k1 == 3) {
                        anIntArray1072[anInt1071++] = i1;
                    }
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("90340, " + byte0 + ", " + i + ", " + buffer + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method143(Class13_Sub1_Sub1_Sub6 class13_sub1_sub1_sub6, int i, byte byte0) {
        try {
            method144(class13_sub1_sub1_sub6.anInt1588, i, class13_sub1_sub1_sub6.anInt1587, aByte1063);
            if (byte0 != 101) {
                aBoolean1154 = !aBoolean1154;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("51398, " + class13_sub1_sub1_sub6 + ", " + i + ", " + byte0 + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }

    public void method144(int i, int j, int k, byte byte0) {
        try {
            if (k < 128 || i < 128 || k > 13056 || i > 13056) {
                anInt1078 = -1;
                anInt1079 = -1;
                return;
            }
            int l = method80(anInt1166, 781, i, k) - j;
            if (byte0 == 2) {
                byte0 = 0;
            } else {
                opcode = -1;
            }
            k -= anInt1004;
            l -= anInt1005;
            i -= anInt1006;
            int i1 = Class13_Sub1_Sub1_Sub4.anIntArray1559[anInt1007];
            int j1 = Class13_Sub1_Sub1_Sub4.anIntArray1560[anInt1007];
            int k1 = Class13_Sub1_Sub1_Sub4.anIntArray1559[anInt1008];
            int l1 = Class13_Sub1_Sub1_Sub4.anIntArray1560[anInt1008];
            int i2 = i * k1 + k * l1 >> 16;
            i = i * l1 - k * k1 >> 16;
            k = i2;
            i2 = l * j1 - i * i1 >> 16;
            i = l * i1 + i * j1 >> 16;
            l = i2;
            if (i >= 50) {
                anInt1078 = Class13_Sub1_Sub4_Sub1.anInt1630 + (k << 9) / i;
                anInt1079 = Class13_Sub1_Sub4_Sub1.anInt1631 + (l << 9) / i;
                return;
            } else {
                anInt1078 = -1;
                anInt1079 = -1;
                return;
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("96839, " + i + ", " + j + ", " + k + ", " + byte0 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method145(int i) {
        try {
            if (anInt920 == 0) {
                return;
            }
            Class13_Sub1_Sub4_Sub2 class13_sub1_sub4_sub2 = aClass13_Sub1_Sub4_Sub2_892;
            if (i != 0) {
                anInt1185 = 359;
            }
            int j = 0;
            if (anInt1269 != 0) {
                j = 1;
            }
            for (int k = 0; k < 100; k++) {
                if (aStringArray841[k] != null) {
                    int l = anIntArray839[k];
                    String s = aStringArray840[k];
                    byte byte0 = 0;
                    if (s != null && s.startsWith("@cr1@")) {
                        s = s.substring(5);
                        byte0 = 1;
                    }
                    if (s != null && s.startsWith("@cr2@")) {
                        s = s.substring(5);
                        byte0 = 2;
                    }
                    if ((l == 3 || l == 7) && (l == 7 || anInt1129 == 0 || anInt1129 == 1 && method71(s, 771))) {
                        int i1 = 329 - j * 13;
                        int l1 = 4;
                        class13_sub1_sub4_sub2.method385((byte) -96, "From", 0, l1, i1);
                        class13_sub1_sub4_sub2.method385((byte) -96, "From", 65535, l1, i1 - 1);
                        l1 += class13_sub1_sub4_sub2.method383(3, "From ");
                        if (byte0 == 1) {
                            aClass13_Sub1_Sub4_Sub3Array838[0].method401(i1 - 12, (byte) 83, l1);
                            l1 += 14;
                        }
                        if (byte0 == 2) {
                            aClass13_Sub1_Sub4_Sub3Array838[1].method401(i1 - 12, (byte) 83, l1);
                            l1 += 14;
                        }
                        class13_sub1_sub4_sub2.method385((byte) -96, s + ": " + aStringArray841[k], 0, l1, i1);
                        class13_sub1_sub4_sub2.method385((byte) -96, s + ": " + aStringArray841[k], 65535, l1, i1 - 1);
                        if (++j >= 5) {
                            return;
                        }
                    }
                    if (l == 5 && anInt1129 < 2) {
                        int j1 = 329 - j * 13;
                        class13_sub1_sub4_sub2.method385((byte) -96, aStringArray841[k], 0, 4, j1);
                        class13_sub1_sub4_sub2.method385((byte) -96, aStringArray841[k], 65535, 4, j1 - 1);
                        if (++j >= 5) {
                            return;
                        }
                    }
                    if (l == 6 && anInt1129 < 2) {
                        int k1 = 329 - j * 13;
                        class13_sub1_sub4_sub2.method385((byte) -96, "To " + s + ": " + aStringArray841[k], 0, 4, k1);
                        class13_sub1_sub4_sub2.method385((byte) -96, "To " + s + ": " + aStringArray841[k], 65535, 4, k1 - 1);
                        if (++j >= 5) {
                            return;
                        }
                    }
                }
            }
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("85551, " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method146(int i, int j, int k, int l, int i1, boolean flag, int j1) {
        try {
            int k1 = 2048 - j1 & 0x7ff;
            int l1 = 2048 - j & 0x7ff;
            int i2 = 0;
            int j2 = 0;
            int k2 = i1;
            if (k1 != 0) {
                int l2 = Class13_Sub1_Sub1_Sub4.anIntArray1559[k1];
                int j3 = Class13_Sub1_Sub1_Sub4.anIntArray1560[k1];
                int l3 = j2 * j3 - k2 * l2 >> 16;
                k2 = j2 * l2 + k2 * j3 >> 16;
                j2 = l3;
            }
            if (l1 != 0) {
                int i3 = Class13_Sub1_Sub1_Sub4.anIntArray1559[l1];
                int k3 = Class13_Sub1_Sub1_Sub4.anIntArray1560[l1];
                int i4 = k2 * i3 + i2 * k3 >> 16;
                k2 = k2 * k3 - i2 * i3 >> 16;
                i2 = i4;
            }
            anInt1004 = k - i2;
            anInt1005 = i - j2;
            aBoolean851 &= flag;
            anInt1006 = l - k2;
            anInt1007 = j1;
            anInt1008 = j;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("66452, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + flag + ", " + j1 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method147(Class13_Sub1_Sub1_Sub6_Sub1 class13_sub1_sub1_sub6_sub1, int i, Buffer buffer, int mask, int k) {
        try {
            packetSize += k;
            if ((mask & 0x200) != 0) {
                int l = buffer.readUnsignedByte();
                int j2 = buffer.readUnsignedByte();
                class13_sub1_sub1_sub6_sub1.method293(l, true, pulseCycle, j2);
                class13_sub1_sub1_sub6_sub1.anInt1604 = pulseCycle + 300;
                class13_sub1_sub1_sub6_sub1.anInt1605 = buffer.method332(aByte1172);
                class13_sub1_sub1_sub6_sub1.anInt1606 = buffer.readUnsignedByteA(856);
            }
            if ((mask & 0x100) != 0) {
                class13_sub1_sub1_sub6_sub1.anInt1575 = buffer.readUnsignedByte();
                class13_sub1_sub1_sub6_sub1.anInt1577 = buffer.method332(aByte1172);
                class13_sub1_sub1_sub6_sub1.anInt1576 = buffer.readUnsignedByte();
                class13_sub1_sub1_sub6_sub1.anInt1578 = buffer.readUnsignedByteA(856);
                class13_sub1_sub1_sub6_sub1.anInt1579 = buffer.readUnsignedShort() + pulseCycle;
                class13_sub1_sub1_sub6_sub1.anInt1580 = buffer.readUnsignedShort() + pulseCycle;
                class13_sub1_sub1_sub6_sub1.anInt1581 = buffer.readUnsignedByte();
                class13_sub1_sub1_sub6_sub1.method290((byte) 5);
            }
            if ((mask & 0x400) != 0) {
                class13_sub1_sub1_sub6_sub1.anInt1592 = buffer.readUnsignedLittleEndianShort();
                int i1 = buffer.method347(anInt917);
                class13_sub1_sub1_sub6_sub1.anInt1596 = i1 >> 16;
                class13_sub1_sub1_sub6_sub1.anInt1595 = pulseCycle + (i1 & 0xffff);
                class13_sub1_sub1_sub6_sub1.anInt1593 = 0;
                class13_sub1_sub1_sub6_sub1.anInt1594 = 0;
                if (class13_sub1_sub1_sub6_sub1.anInt1595 > pulseCycle) {
                    class13_sub1_sub1_sub6_sub1.anInt1593 = -1;
                }
                if (class13_sub1_sub1_sub6_sub1.anInt1592 == 65535) {
                    class13_sub1_sub1_sub6_sub1.anInt1592 = -1;
                }
            }
            if ((mask & 2) != 0) // appearance
            {
                int j1 = buffer.readUnsignedByteC(19179);
                byte[] abyte0 = new byte[j1];
                Buffer class13_sub1_sub2_1 = new Buffer(-351, abyte0);
                buffer.method350(false, j1, abyte0, 0);
                aBufferArray903[i] = class13_sub1_sub2_1;
                class13_sub1_sub1_sub6_sub1.method297(class13_sub1_sub2_1, 0);
            }
            if ((mask & 1) != 0) {
                class13_sub1_sub1_sub6_sub1.anInt1582 = buffer.method339(true);
                class13_sub1_sub1_sub6_sub1.anInt1583 = buffer.readUnsignedLittleEndianShortA();
            }
            if ((mask & 0x80) != 0) {
                int k1 = buffer.readUnsignedShort();
                int k2 = buffer.readUnsignedByte();
                int j3 = buffer.method332(aByte1172);
                int l3 = buffer.position;
                if (class13_sub1_sub1_sub6_sub1.aString1689 != null && class13_sub1_sub1_sub6_sub1.aBoolean1701) {
                    long l4 = Class24.method446(class13_sub1_sub1_sub6_sub1.aString1689);
                    boolean flag = false;
                    if (k2 <= 1) {
                        for (int i4 = 0; i4 < anInt1098; i4++) {
                            if (aLongArray990[i4] != l4) {
                                continue;
                            }
                            flag = true;
                            break;
                        }
                    }
                    if (!flag && anInt1180 == 0) {
                        try {
                            aBuffer_1282.position = 0;
                            buffer.method320(aBuffer_1282.payload, j3, 0, 0);
                            aBuffer_1282.position = 0;
                            String s = Class45.method573(aBuffer_1282, 0, j3);
                            s = Class41.method541(false, s);
                            class13_sub1_sub1_sub6_sub1.aString1586 = s;
                            class13_sub1_sub1_sub6_sub1.anInt1566 = k1 >> 8;
                            class13_sub1_sub1_sub6_sub1.anInt1617 = k1 & 0xff;
                            class13_sub1_sub1_sub6_sub1.anInt1603 = 150;
                            if (k2 == 2 || k2 == 3) {
                                method70(1, s, "@cr2@" + class13_sub1_sub1_sub6_sub1.aString1689, (byte) 117);
                            } else if (k2 == 1) {
                                method70(1, s, "@cr1@" + class13_sub1_sub1_sub6_sub1.aString1689, (byte) 117);
                            } else {
                                method70(2, s, class13_sub1_sub1_sub6_sub1.aString1689, (byte) 117);
                            }
                        } catch (Exception exception) {
                            Signlink.reportError("cde2");
                        }
                    }
                }
                buffer.position = l3 + j3;
            }
            if ((mask & 0x20) != 0) {
                int l1 = buffer.readUnsignedByteC(19179);
                int l2 = buffer.method332(aByte1172);
                class13_sub1_sub1_sub6_sub1.method293(l1, true, pulseCycle, l2);
                class13_sub1_sub1_sub6_sub1.anInt1604 = pulseCycle + 300;
                class13_sub1_sub1_sub6_sub1.anInt1605 = buffer.method332(aByte1172);
                class13_sub1_sub1_sub6_sub1.anInt1606 = buffer.readUnsignedByteC(19179);
            }
            if ((mask & 4) != 0) {
                int i2 = buffer.readUnsignedLittleEndianShort();
                if (i2 == 65535) {
                    i2 = -1;
                }
                int i3 = buffer.method332(aByte1172);
                if (i2 == class13_sub1_sub1_sub6_sub1.anInt1597 && i2 != -1) {
                    int k3 = Class50.aClass50Array800[i2].anInt814;
                    if (k3 == 1) {
                        class13_sub1_sub1_sub6_sub1.anInt1598 = 0;
                        class13_sub1_sub1_sub6_sub1.anInt1599 = 0;
                        class13_sub1_sub1_sub6_sub1.anInt1600 = i3;
                        class13_sub1_sub1_sub6_sub1.anInt1601 = 0;
                    }
                    if (k3 == 2) {
                        class13_sub1_sub1_sub6_sub1.anInt1601 = 0;
                    }
                } else if (i2 == -1 || class13_sub1_sub1_sub6_sub1.anInt1597 == -1 || Class50.aClass50Array800[i2].anInt808 >= Class50.aClass50Array800[class13_sub1_sub1_sub6_sub1.anInt1597].anInt808) {
                    class13_sub1_sub1_sub6_sub1.anInt1597 = i2;
                    class13_sub1_sub1_sub6_sub1.anInt1598 = 0;
                    class13_sub1_sub1_sub6_sub1.anInt1599 = 0;
                    class13_sub1_sub1_sub6_sub1.anInt1600 = i3;
                    class13_sub1_sub1_sub6_sub1.anInt1601 = 0;
                    class13_sub1_sub1_sub6_sub1.anInt1619 = class13_sub1_sub1_sub6_sub1.anInt1591;
                }
            }
            if ((mask & 0x10) != 0) {
                class13_sub1_sub1_sub6_sub1.aString1586 = buffer.readString();
                if (class13_sub1_sub1_sub6_sub1.aString1586.charAt(0) == '~') {
                    class13_sub1_sub1_sub6_sub1.aString1586 = class13_sub1_sub1_sub6_sub1.aString1586.substring(1);
                    method70(2, class13_sub1_sub1_sub6_sub1.aString1586, class13_sub1_sub1_sub6_sub1.aString1689, (byte) 117);
                } else if (class13_sub1_sub1_sub6_sub1 == aClass13_Sub1_Sub1_Sub6_Sub1_997) {
                    method70(2, class13_sub1_sub1_sub6_sub1.aString1586, class13_sub1_sub1_sub6_sub1.aString1689, (byte) 117);
                }
                class13_sub1_sub1_sub6_sub1.anInt1566 = 0;
                class13_sub1_sub1_sub6_sub1.anInt1617 = 0;
                class13_sub1_sub1_sub6_sub1.anInt1603 = 150;
            }
            if ((mask & 8) != 0) {
                class13_sub1_sub1_sub6_sub1.anInt1602 = buffer.readUnsignedLittleEndianShortA();
                if (class13_sub1_sub1_sub6_sub1.anInt1602 == 65535) {
                    class13_sub1_sub1_sub6_sub1.anInt1602 = -1;
                    return;
                }
            }
        } catch (RuntimeException runtimeexception) {
            Signlink.reportError("55924, " + class13_sub1_sub1_sub6_sub1 + ", " + i + ", " + buffer + ", " + mask + ", " + k + ", " + runtimeexception);
            throw new RuntimeException();
        }
    }
}
