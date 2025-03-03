package n1;

import D2.o;
import F2.h;
import H3.M;
import H3.O;
import H3.P;
import H3.i0;
import K.a;
import M0.C0121i;
import M0.C0129q;
import M0.I;
import M0.V;
import M0.X;
import M0.h0;
import M0.r;
import O7.b;
import P0.l;
import P0.s;
import P0.t;
import P0.z;
import Q0.g;
import S0.f;
import T0.A;
import T0.C0214f;
import T0.C0215g;
import T0.C0229v;
import T0.d0;
import V0.i;
import Y0.e;
import a1.C0412c;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.camera.lifecycle.c;
import c1.j;
import c1.k;
import c1.m;
import c1.n;
import c1.p;
import c1.q;
import c1.v;
import h1.C1031B;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k2.C1160q;
import u.C1455O;

/* renamed from: n1.e  reason: case insensitive filesystem */
public final class C1240e extends q {

    /* renamed from: g2  reason: collision with root package name */
    public static final int[] f13578g2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: h2  reason: collision with root package name */
    public static boolean f13579h2;

    /* renamed from: i2  reason: collision with root package name */
    public static boolean f13580i2;

    /* renamed from: A1  reason: collision with root package name */
    public final boolean f13581A1;

    /* renamed from: B1  reason: collision with root package name */
    public final r f13582B1;

    /* renamed from: C1  reason: collision with root package name */
    public final q f13583C1;

    /* renamed from: D1  reason: collision with root package name */
    public h f13584D1;

    /* renamed from: E1  reason: collision with root package name */
    public boolean f13585E1;

    /* renamed from: F1  reason: collision with root package name */
    public boolean f13586F1;

    /* renamed from: G1  reason: collision with root package name */
    public C1244i f13587G1 = null;

    /* renamed from: H1  reason: collision with root package name */
    public boolean f13588H1;

    /* renamed from: I1  reason: collision with root package name */
    public List f13589I1;

    /* renamed from: J1  reason: collision with root package name */
    public Surface f13590J1;

    /* renamed from: K1  reason: collision with root package name */
    public C1242g f13591K1;

    /* renamed from: L1  reason: collision with root package name */
    public s f13592L1;

    /* renamed from: M1  reason: collision with root package name */
    public boolean f13593M1;

    /* renamed from: N1  reason: collision with root package name */
    public int f13594N1;

    /* renamed from: O1  reason: collision with root package name */
    public int f13595O1;

    /* renamed from: P1  reason: collision with root package name */
    public long f13596P1;

    /* renamed from: Q1  reason: collision with root package name */
    public int f13597Q1;

    /* renamed from: R1  reason: collision with root package name */
    public int f13598R1;

    /* renamed from: S1  reason: collision with root package name */
    public int f13599S1;

    /* renamed from: T1  reason: collision with root package name */
    public long f13600T1;

    /* renamed from: U1  reason: collision with root package name */
    public int f13601U1;

    /* renamed from: V1  reason: collision with root package name */
    public long f13602V1;

    /* renamed from: W1  reason: collision with root package name */
    public h0 f13603W1;

    /* renamed from: X1  reason: collision with root package name */
    public h0 f13604X1;

    /* renamed from: Y1  reason: collision with root package name */
    public int f13605Y1;

    /* renamed from: Z1  reason: collision with root package name */
    public boolean f13606Z1;

    /* renamed from: a2  reason: collision with root package name */
    public int f13607a2;

    /* renamed from: b2  reason: collision with root package name */
    public C1239d f13608b2;

    /* renamed from: c2  reason: collision with root package name */
    public p f13609c2;

    /* renamed from: d2  reason: collision with root package name */
    public long f13610d2;

    /* renamed from: e2  reason: collision with root package name */
    public long f13611e2;

    /* renamed from: f2  reason: collision with root package name */
    public boolean f13612f2;
    public final Context w1;

    /* renamed from: x1  reason: collision with root package name */
    public final boolean f13613x1;

    /* renamed from: y1  reason: collision with root package name */
    public final i f13614y1;

    /* renamed from: z1  reason: collision with root package name */
    public final int f13615z1 = 50;

    public C1240e(Context context, j jVar, Handler handler, C0229v vVar) {
        super(2, jVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.w1 = applicationContext;
        this.f13614y1 = new i(handler, vVar, 1);
        this.f13613x1 = true;
        this.f13582B1 = new r(applicationContext, this);
        this.f13583C1 = new q();
        this.f13581A1 = "NVIDIA".equals(z.f3750c);
        this.f13592L1 = s.f3735c;
        this.f13594N1 = 1;
        this.f13595O1 = 0;
        this.f13603W1 = h0.f2952d;
        this.f13607a2 = 0;
        this.f13604X1 = null;
        this.f13605Y1 = -1000;
        this.f13610d2 = -9223372036854775807L;
        this.f13611e2 = -9223372036854775807L;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0751, code lost:
        if (r14.equals("A10-70L") == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x08b9, code lost:
        if (r1.equals("JSN-L21") == false) goto L_0x08bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean v0(java.lang.String r17) {
        /*
            r0 = 26
            r2 = 27
            r3 = 28
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = -1
            r11 = 1
            java.lang.String r12 = "OMX.google"
            r13 = r17
            boolean r12 = r13.startsWith(r12)
            r13 = 0
            if (r12 == 0) goto L_0x001a
            return r13
        L_0x001a:
            java.lang.Class<n1.e> r12 = n1.C1240e.class
            monitor-enter(r12)
            boolean r14 = f13579h2     // Catch:{ all -> 0x08c0 }
            if (r14 != 0) goto L_0x08c2
            int r14 = P0.z.f3748a     // Catch:{ all -> 0x08c0 }
            if (r14 > r3) goto L_0x0092
            java.lang.String r15 = P0.z.f3749b     // Catch:{ all -> 0x08c0 }
            r15.getClass()     // Catch:{ all -> 0x08c0 }
            int r16 = r15.hashCode()
            switch(r16) {
                case -1339091551: goto L_0x0081;
                case -1220081023: goto L_0x0076;
                case -1220066608: goto L_0x006b;
                case -1012436106: goto L_0x0060;
                case -760312546: goto L_0x0055;
                case -64886864: goto L_0x004a;
                case 3415681: goto L_0x003f;
                case 825323514: goto L_0x0034;
                default: goto L_0x0031;
            }
        L_0x0031:
            r1 = -1
            goto L_0x008b
        L_0x0034:
            java.lang.String r1 = "machuca"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x003d
            goto L_0x0031
        L_0x003d:
            r1 = 7
            goto L_0x008b
        L_0x003f:
            java.lang.String r1 = "once"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x0048
            goto L_0x0031
        L_0x0048:
            r1 = 6
            goto L_0x008b
        L_0x004a:
            java.lang.String r1 = "magnolia"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x0053
            goto L_0x0031
        L_0x0053:
            r1 = 5
            goto L_0x008b
        L_0x0055:
            java.lang.String r1 = "aquaman"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x005e
            goto L_0x0031
        L_0x005e:
            r1 = 4
            goto L_0x008b
        L_0x0060:
            java.lang.String r1 = "oneday"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x0069
            goto L_0x0031
        L_0x0069:
            r1 = 3
            goto L_0x008b
        L_0x006b:
            java.lang.String r1 = "dangalUHD"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x0074
            goto L_0x0031
        L_0x0074:
            r1 = 2
            goto L_0x008b
        L_0x0076:
            java.lang.String r1 = "dangalFHD"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x007f
            goto L_0x0031
        L_0x007f:
            r1 = 1
            goto L_0x008b
        L_0x0081:
            java.lang.String r1 = "dangal"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x008a
            goto L_0x0031
        L_0x008a:
            r1 = 0
        L_0x008b:
            switch(r1) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008f;
                case 2: goto L_0x008f;
                case 3: goto L_0x008f;
                case 4: goto L_0x008f;
                case 5: goto L_0x008f;
                case 6: goto L_0x008f;
                case 7: goto L_0x008f;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x0092
        L_0x008f:
            r13 = 1
            goto L_0x08bb
        L_0x0092:
            if (r14 > r2) goto L_0x009f
            java.lang.String r1 = "HWEML"
            java.lang.String r15 = P0.z.f3749b     // Catch:{ all -> 0x08c0 }
            boolean r1 = r1.equals(r15)     // Catch:{ all -> 0x08c0 }
            if (r1 == 0) goto L_0x009f
            goto L_0x008f
        L_0x009f:
            java.lang.String r1 = P0.z.f3751d     // Catch:{ all -> 0x08c0 }
            r1.getClass()     // Catch:{ all -> 0x08c0 }
            int r15 = r1.hashCode()
            switch(r15) {
                case -349662828: goto L_0x0108;
                case -321033677: goto L_0x00fd;
                case 2006354: goto L_0x00f2;
                case 2006367: goto L_0x00e7;
                case 2006371: goto L_0x00dc;
                case 1785421873: goto L_0x00d1;
                case 1785421876: goto L_0x00c6;
                case 1798172390: goto L_0x00bb;
                case 2119412532: goto L_0x00ae;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r15 = -1
            goto L_0x0112
        L_0x00ae:
            java.lang.String r15 = "AFTEUFF014"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00b7
            goto L_0x00ab
        L_0x00b7:
            r15 = 8
            goto L_0x0112
        L_0x00bb:
            java.lang.String r15 = "AFTSO001"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00c4
            goto L_0x00ab
        L_0x00c4:
            r15 = 7
            goto L_0x0112
        L_0x00c6:
            java.lang.String r15 = "AFTEU014"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00cf
            goto L_0x00ab
        L_0x00cf:
            r15 = 6
            goto L_0x0112
        L_0x00d1:
            java.lang.String r15 = "AFTEU011"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00da
            goto L_0x00ab
        L_0x00da:
            r15 = 5
            goto L_0x0112
        L_0x00dc:
            java.lang.String r15 = "AFTR"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00e5
            goto L_0x00ab
        L_0x00e5:
            r15 = 4
            goto L_0x0112
        L_0x00e7:
            java.lang.String r15 = "AFTN"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00f0
            goto L_0x00ab
        L_0x00f0:
            r15 = 3
            goto L_0x0112
        L_0x00f2:
            java.lang.String r15 = "AFTA"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00fb
            goto L_0x00ab
        L_0x00fb:
            r15 = 2
            goto L_0x0112
        L_0x00fd:
            java.lang.String r15 = "AFTKMST12"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x0106
            goto L_0x00ab
        L_0x0106:
            r15 = 1
            goto L_0x0112
        L_0x0108:
            java.lang.String r15 = "AFTJMST12"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x0111
            goto L_0x00ab
        L_0x0111:
            r15 = 0
        L_0x0112:
            switch(r15) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008f;
                case 2: goto L_0x008f;
                case 3: goto L_0x008f;
                case 4: goto L_0x008f;
                case 5: goto L_0x008f;
                case 6: goto L_0x008f;
                case 7: goto L_0x008f;
                case 8: goto L_0x008f;
                default: goto L_0x0115;
            }
        L_0x0115:
            if (r14 > r0) goto L_0x08bb
            java.lang.String r14 = P0.z.f3749b     // Catch:{ all -> 0x08c0 }
            r14.getClass()     // Catch:{ all -> 0x08c0 }
            int r15 = r14.hashCode()
            switch(r15) {
                case -2144781245: goto L_0x08a5;
                case -2144781185: goto L_0x0899;
                case -2144781160: goto L_0x088d;
                case -2097309513: goto L_0x0881;
                case -2022874474: goto L_0x0875;
                case -1978993182: goto L_0x0869;
                case -1978990237: goto L_0x085d;
                case -1936688988: goto L_0x0851;
                case -1936688066: goto L_0x0843;
                case -1936688065: goto L_0x0835;
                case -1931988508: goto L_0x0827;
                case -1885099851: goto L_0x0819;
                case -1696512866: goto L_0x080b;
                case -1680025915: goto L_0x07fd;
                case -1615810839: goto L_0x07ef;
                case -1600724499: goto L_0x07e1;
                case -1554255044: goto L_0x07d3;
                case -1481772737: goto L_0x07c5;
                case -1481772730: goto L_0x07b7;
                case -1481772729: goto L_0x07a9;
                case -1320080169: goto L_0x079b;
                case -1217592143: goto L_0x078d;
                case -1180384755: goto L_0x077f;
                case -1139198265: goto L_0x0771;
                case -1052835013: goto L_0x0763;
                case -993250464: goto L_0x0755;
                case -993250458: goto L_0x074b;
                case -965403638: goto L_0x073d;
                case -958336948: goto L_0x072f;
                case -879245230: goto L_0x0721;
                case -842500323: goto L_0x0713;
                case -821392978: goto L_0x0705;
                case -797483286: goto L_0x06f7;
                case -794946968: goto L_0x06e9;
                case -788334647: goto L_0x06db;
                case -782144577: goto L_0x06cd;
                case -575125681: goto L_0x06bf;
                case -521118391: goto L_0x06b1;
                case -430914369: goto L_0x06a3;
                case -290434366: goto L_0x0695;
                case -282781963: goto L_0x0687;
                case -277133239: goto L_0x0679;
                case -173639913: goto L_0x066b;
                case -56598463: goto L_0x065d;
                case 2126: goto L_0x064f;
                case 2564: goto L_0x0641;
                case 2715: goto L_0x0633;
                case 2719: goto L_0x0625;
                case 3091: goto L_0x0617;
                case 3483: goto L_0x0609;
                case 73405: goto L_0x05fb;
                case 75537: goto L_0x05ed;
                case 75739: goto L_0x05df;
                case 76779: goto L_0x05d1;
                case 78669: goto L_0x05c3;
                case 79305: goto L_0x05b5;
                case 80618: goto L_0x05a7;
                case 88274: goto L_0x0599;
                case 98846: goto L_0x058b;
                case 98848: goto L_0x057d;
                case 99329: goto L_0x056f;
                case 101481: goto L_0x0561;
                case 1513190: goto L_0x0553;
                case 1514184: goto L_0x0545;
                case 1514185: goto L_0x0537;
                case 2133089: goto L_0x0529;
                case 2133091: goto L_0x051b;
                case 2133120: goto L_0x050d;
                case 2133151: goto L_0x04ff;
                case 2133182: goto L_0x04f1;
                case 2133184: goto L_0x04e3;
                case 2436959: goto L_0x04d5;
                case 2463773: goto L_0x04c7;
                case 2464648: goto L_0x04b9;
                case 2689555: goto L_0x04ab;
                case 3154429: goto L_0x049d;
                case 3284551: goto L_0x048f;
                case 3351335: goto L_0x0481;
                case 3386211: goto L_0x0473;
                case 41325051: goto L_0x0465;
                case 51349633: goto L_0x0457;
                case 51350594: goto L_0x0449;
                case 55178625: goto L_0x043b;
                case 61542055: goto L_0x042d;
                case 65355429: goto L_0x041f;
                case 66214468: goto L_0x0411;
                case 66214470: goto L_0x0403;
                case 66214473: goto L_0x03f5;
                case 66215429: goto L_0x03e7;
                case 66215431: goto L_0x03d9;
                case 66215433: goto L_0x03cb;
                case 66216390: goto L_0x03bd;
                case 76402249: goto L_0x03af;
                case 76404105: goto L_0x03a1;
                case 76404911: goto L_0x0393;
                case 80963634: goto L_0x0385;
                case 82882791: goto L_0x0377;
                case 98715550: goto L_0x0369;
                case 101370885: goto L_0x035b;
                case 102844228: goto L_0x034d;
                case 165221241: goto L_0x033f;
                case 182191441: goto L_0x0331;
                case 245388979: goto L_0x0323;
                case 287431619: goto L_0x0315;
                case 307593612: goto L_0x0307;
                case 308517133: goto L_0x02f9;
                case 316215098: goto L_0x02eb;
                case 316215116: goto L_0x02dd;
                case 316246811: goto L_0x02cf;
                case 316246818: goto L_0x02c1;
                case 407160593: goto L_0x02b3;
                case 507412548: goto L_0x02a5;
                case 793982701: goto L_0x0297;
                case 794038622: goto L_0x0289;
                case 794040393: goto L_0x027b;
                case 835649806: goto L_0x026d;
                case 917340916: goto L_0x025f;
                case 958008161: goto L_0x0251;
                case 1060579533: goto L_0x0243;
                case 1150207623: goto L_0x0235;
                case 1176899427: goto L_0x0227;
                case 1280332038: goto L_0x0219;
                case 1306947716: goto L_0x020b;
                case 1349174697: goto L_0x01fd;
                case 1522194893: goto L_0x01ef;
                case 1691543273: goto L_0x01e1;
                case 1691544261: goto L_0x01d3;
                case 1709443163: goto L_0x01c5;
                case 1865889110: goto L_0x01b7;
                case 1906253259: goto L_0x01a9;
                case 1977196784: goto L_0x019b;
                case 2006372676: goto L_0x018e;
                case 2019281702: goto L_0x0181;
                case 2029784656: goto L_0x0174;
                case 2030379515: goto L_0x0167;
                case 2033393791: goto L_0x015a;
                case 2047190025: goto L_0x014d;
                case 2047252157: goto L_0x0140;
                case 2048319463: goto L_0x0133;
                case 2048855701: goto L_0x0126;
                default: goto L_0x0123;
            }
        L_0x0123:
            r0 = -1
            goto L_0x08b0
        L_0x0126:
            java.lang.String r0 = "HWWAS-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x012f
            goto L_0x0123
        L_0x012f:
            r0 = 139(0x8b, float:1.95E-43)
            goto L_0x08b0
        L_0x0133:
            java.lang.String r0 = "HWVNS-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x0123
        L_0x013c:
            r0 = 138(0x8a, float:1.93E-43)
            goto L_0x08b0
        L_0x0140:
            java.lang.String r0 = "ELUGA_Prim"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0149
            goto L_0x0123
        L_0x0149:
            r0 = 137(0x89, float:1.92E-43)
            goto L_0x08b0
        L_0x014d:
            java.lang.String r0 = "ELUGA_Note"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0156
            goto L_0x0123
        L_0x0156:
            r0 = 136(0x88, float:1.9E-43)
            goto L_0x08b0
        L_0x015a:
            java.lang.String r0 = "ASUS_X00AD_2"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0163
            goto L_0x0123
        L_0x0163:
            r0 = 135(0x87, float:1.89E-43)
            goto L_0x08b0
        L_0x0167:
            java.lang.String r0 = "HWCAM-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0170
            goto L_0x0123
        L_0x0170:
            r0 = 134(0x86, float:1.88E-43)
            goto L_0x08b0
        L_0x0174:
            java.lang.String r0 = "HWBLN-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x017d
            goto L_0x0123
        L_0x017d:
            r0 = 133(0x85, float:1.86E-43)
            goto L_0x08b0
        L_0x0181:
            java.lang.String r0 = "DM-01K"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x018a
            goto L_0x0123
        L_0x018a:
            r0 = 132(0x84, float:1.85E-43)
            goto L_0x08b0
        L_0x018e:
            java.lang.String r0 = "BRAVIA_ATV3_4K"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0197
            goto L_0x0123
        L_0x0197:
            r0 = 131(0x83, float:1.84E-43)
            goto L_0x08b0
        L_0x019b:
            java.lang.String r0 = "Infinix-X572"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01a5
            goto L_0x0123
        L_0x01a5:
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x08b0
        L_0x01a9:
            java.lang.String r0 = "PB2-670M"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01b3
            goto L_0x0123
        L_0x01b3:
            r0 = 129(0x81, float:1.81E-43)
            goto L_0x08b0
        L_0x01b7:
            java.lang.String r0 = "santoni"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01c1
            goto L_0x0123
        L_0x01c1:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x08b0
        L_0x01c5:
            java.lang.String r0 = "iball8735_9806"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01cf
            goto L_0x0123
        L_0x01cf:
            r0 = 127(0x7f, float:1.78E-43)
            goto L_0x08b0
        L_0x01d3:
            java.lang.String r0 = "CPH1715"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01dd
            goto L_0x0123
        L_0x01dd:
            r0 = 126(0x7e, float:1.77E-43)
            goto L_0x08b0
        L_0x01e1:
            java.lang.String r0 = "CPH1609"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01eb
            goto L_0x0123
        L_0x01eb:
            r0 = 125(0x7d, float:1.75E-43)
            goto L_0x08b0
        L_0x01ef:
            java.lang.String r0 = "woods_f"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01f9
            goto L_0x0123
        L_0x01f9:
            r0 = 124(0x7c, float:1.74E-43)
            goto L_0x08b0
        L_0x01fd:
            java.lang.String r0 = "htc_e56ml_dtul"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0207
            goto L_0x0123
        L_0x0207:
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x08b0
        L_0x020b:
            java.lang.String r0 = "EverStar_S"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0215
            goto L_0x0123
        L_0x0215:
            r0 = 122(0x7a, float:1.71E-43)
            goto L_0x08b0
        L_0x0219:
            java.lang.String r0 = "hwALE-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0223
            goto L_0x0123
        L_0x0223:
            r0 = 121(0x79, float:1.7E-43)
            goto L_0x08b0
        L_0x0227:
            java.lang.String r0 = "itel_S41"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0231
            goto L_0x0123
        L_0x0231:
            r0 = 120(0x78, float:1.68E-43)
            goto L_0x08b0
        L_0x0235:
            java.lang.String r0 = "LS-5017"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x023f
            goto L_0x0123
        L_0x023f:
            r0 = 119(0x77, float:1.67E-43)
            goto L_0x08b0
        L_0x0243:
            java.lang.String r0 = "panell_d"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x024d
            goto L_0x0123
        L_0x024d:
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x08b0
        L_0x0251:
            java.lang.String r0 = "j2xlteins"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x025b
            goto L_0x0123
        L_0x025b:
            r0 = 117(0x75, float:1.64E-43)
            goto L_0x08b0
        L_0x025f:
            java.lang.String r0 = "A7000plus"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0269
            goto L_0x0123
        L_0x0269:
            r0 = 116(0x74, float:1.63E-43)
            goto L_0x08b0
        L_0x026d:
            java.lang.String r0 = "manning"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0277
            goto L_0x0123
        L_0x0277:
            r0 = 115(0x73, float:1.61E-43)
            goto L_0x08b0
        L_0x027b:
            java.lang.String r0 = "GIONEE_WBL7519"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0285
            goto L_0x0123
        L_0x0285:
            r0 = 114(0x72, float:1.6E-43)
            goto L_0x08b0
        L_0x0289:
            java.lang.String r0 = "GIONEE_WBL7365"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0293
            goto L_0x0123
        L_0x0293:
            r0 = 113(0x71, float:1.58E-43)
            goto L_0x08b0
        L_0x0297:
            java.lang.String r0 = "GIONEE_WBL5708"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02a1
            goto L_0x0123
        L_0x02a1:
            r0 = 112(0x70, float:1.57E-43)
            goto L_0x08b0
        L_0x02a5:
            java.lang.String r0 = "QM16XE_U"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02af
            goto L_0x0123
        L_0x02af:
            r0 = 111(0x6f, float:1.56E-43)
            goto L_0x08b0
        L_0x02b3:
            java.lang.String r0 = "Pixi5-10_4G"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02bd
            goto L_0x0123
        L_0x02bd:
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x08b0
        L_0x02c1:
            java.lang.String r0 = "TB3-850M"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02cb
            goto L_0x0123
        L_0x02cb:
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x08b0
        L_0x02cf:
            java.lang.String r0 = "TB3-850F"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02d9
            goto L_0x0123
        L_0x02d9:
            r0 = 108(0x6c, float:1.51E-43)
            goto L_0x08b0
        L_0x02dd:
            java.lang.String r0 = "TB3-730X"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02e7
            goto L_0x0123
        L_0x02e7:
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x08b0
        L_0x02eb:
            java.lang.String r0 = "TB3-730F"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02f5
            goto L_0x0123
        L_0x02f5:
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x08b0
        L_0x02f9:
            java.lang.String r0 = "A7020a48"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0303
            goto L_0x0123
        L_0x0303:
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x08b0
        L_0x0307:
            java.lang.String r0 = "A7010a48"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0311
            goto L_0x0123
        L_0x0311:
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x08b0
        L_0x0315:
            java.lang.String r0 = "griffin"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x031f
            goto L_0x0123
        L_0x031f:
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x08b0
        L_0x0323:
            java.lang.String r0 = "marino_f"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x032d
            goto L_0x0123
        L_0x032d:
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x08b0
        L_0x0331:
            java.lang.String r0 = "CPY83_I00"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x033b
            goto L_0x0123
        L_0x033b:
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x08b0
        L_0x033f:
            java.lang.String r0 = "A2016a40"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0349
            goto L_0x0123
        L_0x0349:
            r0 = 100
            goto L_0x08b0
        L_0x034d:
            java.lang.String r0 = "le_x6"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0357
            goto L_0x0123
        L_0x0357:
            r0 = 99
            goto L_0x08b0
        L_0x035b:
            java.lang.String r0 = "l5460"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0365
            goto L_0x0123
        L_0x0365:
            r0 = 98
            goto L_0x08b0
        L_0x0369:
            java.lang.String r0 = "i9031"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0373
            goto L_0x0123
        L_0x0373:
            r0 = 97
            goto L_0x08b0
        L_0x0377:
            java.lang.String r0 = "X3_HK"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0381
            goto L_0x0123
        L_0x0381:
            r0 = 96
            goto L_0x08b0
        L_0x0385:
            java.lang.String r0 = "V23GB"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x038f
            goto L_0x0123
        L_0x038f:
            r0 = 95
            goto L_0x08b0
        L_0x0393:
            java.lang.String r0 = "Q4310"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x039d
            goto L_0x0123
        L_0x039d:
            r0 = 94
            goto L_0x08b0
        L_0x03a1:
            java.lang.String r0 = "Q4260"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03ab
            goto L_0x0123
        L_0x03ab:
            r0 = 93
            goto L_0x08b0
        L_0x03af:
            java.lang.String r0 = "PRO7S"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03b9
            goto L_0x0123
        L_0x03b9:
            r0 = 92
            goto L_0x08b0
        L_0x03bd:
            java.lang.String r0 = "F3311"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03c7
            goto L_0x0123
        L_0x03c7:
            r0 = 91
            goto L_0x08b0
        L_0x03cb:
            java.lang.String r0 = "F3215"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03d5
            goto L_0x0123
        L_0x03d5:
            r0 = 90
            goto L_0x08b0
        L_0x03d9:
            java.lang.String r0 = "F3213"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03e3
            goto L_0x0123
        L_0x03e3:
            r0 = 89
            goto L_0x08b0
        L_0x03e7:
            java.lang.String r0 = "F3211"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03f1
            goto L_0x0123
        L_0x03f1:
            r0 = 88
            goto L_0x08b0
        L_0x03f5:
            java.lang.String r0 = "F3116"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03ff
            goto L_0x0123
        L_0x03ff:
            r0 = 87
            goto L_0x08b0
        L_0x0403:
            java.lang.String r0 = "F3113"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x040d
            goto L_0x0123
        L_0x040d:
            r0 = 86
            goto L_0x08b0
        L_0x0411:
            java.lang.String r0 = "F3111"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x041b
            goto L_0x0123
        L_0x041b:
            r0 = 85
            goto L_0x08b0
        L_0x041f:
            java.lang.String r0 = "E5643"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0429
            goto L_0x0123
        L_0x0429:
            r0 = 84
            goto L_0x08b0
        L_0x042d:
            java.lang.String r0 = "A1601"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0437
            goto L_0x0123
        L_0x0437:
            r0 = 83
            goto L_0x08b0
        L_0x043b:
            java.lang.String r0 = "Aura_Note_2"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0445
            goto L_0x0123
        L_0x0445:
            r0 = 82
            goto L_0x08b0
        L_0x0449:
            java.lang.String r0 = "602LV"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0453
            goto L_0x0123
        L_0x0453:
            r0 = 81
            goto L_0x08b0
        L_0x0457:
            java.lang.String r0 = "601LV"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0461
            goto L_0x0123
        L_0x0461:
            r0 = 80
            goto L_0x08b0
        L_0x0465:
            java.lang.String r0 = "MEIZU_M5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x046f
            goto L_0x0123
        L_0x046f:
            r0 = 79
            goto L_0x08b0
        L_0x0473:
            java.lang.String r0 = "p212"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x047d
            goto L_0x0123
        L_0x047d:
            r0 = 78
            goto L_0x08b0
        L_0x0481:
            java.lang.String r0 = "mido"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x048b
            goto L_0x0123
        L_0x048b:
            r0 = 77
            goto L_0x08b0
        L_0x048f:
            java.lang.String r0 = "kate"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0499
            goto L_0x0123
        L_0x0499:
            r0 = 76
            goto L_0x08b0
        L_0x049d:
            java.lang.String r0 = "fugu"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04a7
            goto L_0x0123
        L_0x04a7:
            r0 = 75
            goto L_0x08b0
        L_0x04ab:
            java.lang.String r0 = "XE2X"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04b5
            goto L_0x0123
        L_0x04b5:
            r0 = 74
            goto L_0x08b0
        L_0x04b9:
            java.lang.String r0 = "Q427"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04c3
            goto L_0x0123
        L_0x04c3:
            r0 = 73
            goto L_0x08b0
        L_0x04c7:
            java.lang.String r0 = "Q350"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04d1
            goto L_0x0123
        L_0x04d1:
            r0 = 72
            goto L_0x08b0
        L_0x04d5:
            java.lang.String r0 = "P681"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04df
            goto L_0x0123
        L_0x04df:
            r0 = 71
            goto L_0x08b0
        L_0x04e3:
            java.lang.String r0 = "F04J"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04ed
            goto L_0x0123
        L_0x04ed:
            r0 = 70
            goto L_0x08b0
        L_0x04f1:
            java.lang.String r0 = "F04H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04fb
            goto L_0x0123
        L_0x04fb:
            r0 = 69
            goto L_0x08b0
        L_0x04ff:
            java.lang.String r0 = "F03H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0509
            goto L_0x0123
        L_0x0509:
            r0 = 68
            goto L_0x08b0
        L_0x050d:
            java.lang.String r0 = "F02H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0517
            goto L_0x0123
        L_0x0517:
            r0 = 67
            goto L_0x08b0
        L_0x051b:
            java.lang.String r0 = "F01J"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0525
            goto L_0x0123
        L_0x0525:
            r0 = 66
            goto L_0x08b0
        L_0x0529:
            java.lang.String r0 = "F01H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0533
            goto L_0x0123
        L_0x0533:
            r0 = 65
            goto L_0x08b0
        L_0x0537:
            java.lang.String r0 = "1714"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0541
            goto L_0x0123
        L_0x0541:
            r0 = 64
            goto L_0x08b0
        L_0x0545:
            java.lang.String r0 = "1713"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x054f
            goto L_0x0123
        L_0x054f:
            r0 = 63
            goto L_0x08b0
        L_0x0553:
            java.lang.String r0 = "1601"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x055d
            goto L_0x0123
        L_0x055d:
            r0 = 62
            goto L_0x08b0
        L_0x0561:
            java.lang.String r0 = "flo"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x056b
            goto L_0x0123
        L_0x056b:
            r0 = 61
            goto L_0x08b0
        L_0x056f:
            java.lang.String r0 = "deb"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0579
            goto L_0x0123
        L_0x0579:
            r0 = 60
            goto L_0x08b0
        L_0x057d:
            java.lang.String r0 = "cv3"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0587
            goto L_0x0123
        L_0x0587:
            r0 = 59
            goto L_0x08b0
        L_0x058b:
            java.lang.String r0 = "cv1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0595
            goto L_0x0123
        L_0x0595:
            r0 = 58
            goto L_0x08b0
        L_0x0599:
            java.lang.String r0 = "Z80"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05a3
            goto L_0x0123
        L_0x05a3:
            r0 = 57
            goto L_0x08b0
        L_0x05a7:
            java.lang.String r0 = "QX1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05b1
            goto L_0x0123
        L_0x05b1:
            r0 = 56
            goto L_0x08b0
        L_0x05b5:
            java.lang.String r0 = "PLE"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05bf
            goto L_0x0123
        L_0x05bf:
            r0 = 55
            goto L_0x08b0
        L_0x05c3:
            java.lang.String r0 = "P85"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05cd
            goto L_0x0123
        L_0x05cd:
            r0 = 54
            goto L_0x08b0
        L_0x05d1:
            java.lang.String r0 = "MX6"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05db
            goto L_0x0123
        L_0x05db:
            r0 = 53
            goto L_0x08b0
        L_0x05df:
            java.lang.String r0 = "M5c"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05e9
            goto L_0x0123
        L_0x05e9:
            r0 = 52
            goto L_0x08b0
        L_0x05ed:
            java.lang.String r0 = "M04"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05f7
            goto L_0x0123
        L_0x05f7:
            r0 = 51
            goto L_0x08b0
        L_0x05fb:
            java.lang.String r0 = "JGZ"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0605
            goto L_0x0123
        L_0x0605:
            r0 = 50
            goto L_0x08b0
        L_0x0609:
            java.lang.String r0 = "mh"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0613
            goto L_0x0123
        L_0x0613:
            r0 = 49
            goto L_0x08b0
        L_0x0617:
            java.lang.String r0 = "b5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0621
            goto L_0x0123
        L_0x0621:
            r0 = 48
            goto L_0x08b0
        L_0x0625:
            java.lang.String r0 = "V5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x062f
            goto L_0x0123
        L_0x062f:
            r0 = 47
            goto L_0x08b0
        L_0x0633:
            java.lang.String r0 = "V1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x063d
            goto L_0x0123
        L_0x063d:
            r0 = 46
            goto L_0x08b0
        L_0x0641:
            java.lang.String r0 = "Q5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x064b
            goto L_0x0123
        L_0x064b:
            r0 = 45
            goto L_0x08b0
        L_0x064f:
            java.lang.String r0 = "C1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0659
            goto L_0x0123
        L_0x0659:
            r0 = 44
            goto L_0x08b0
        L_0x065d:
            java.lang.String r0 = "woods_fn"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0667
            goto L_0x0123
        L_0x0667:
            r0 = 43
            goto L_0x08b0
        L_0x066b:
            java.lang.String r0 = "ELUGA_A3_Pro"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0675
            goto L_0x0123
        L_0x0675:
            r0 = 42
            goto L_0x08b0
        L_0x0679:
            java.lang.String r0 = "Z12_PRO"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0683
            goto L_0x0123
        L_0x0683:
            r0 = 41
            goto L_0x08b0
        L_0x0687:
            java.lang.String r0 = "BLACK-1X"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0691
            goto L_0x0123
        L_0x0691:
            r0 = 40
            goto L_0x08b0
        L_0x0695:
            java.lang.String r0 = "taido_row"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x069f
            goto L_0x0123
        L_0x069f:
            r0 = 39
            goto L_0x08b0
        L_0x06a3:
            java.lang.String r0 = "Pixi4-7_3G"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06ad
            goto L_0x0123
        L_0x06ad:
            r0 = 38
            goto L_0x08b0
        L_0x06b1:
            java.lang.String r0 = "GIONEE_GBL7360"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06bb
            goto L_0x0123
        L_0x06bb:
            r0 = 37
            goto L_0x08b0
        L_0x06bf:
            java.lang.String r0 = "GiONEE_CBL7513"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06c9
            goto L_0x0123
        L_0x06c9:
            r0 = 36
            goto L_0x08b0
        L_0x06cd:
            java.lang.String r0 = "OnePlus5T"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06d7
            goto L_0x0123
        L_0x06d7:
            r0 = 35
            goto L_0x08b0
        L_0x06db:
            java.lang.String r0 = "whyred"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06e5
            goto L_0x0123
        L_0x06e5:
            r0 = 34
            goto L_0x08b0
        L_0x06e9:
            java.lang.String r0 = "watson"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06f3
            goto L_0x0123
        L_0x06f3:
            r0 = 33
            goto L_0x08b0
        L_0x06f7:
            java.lang.String r0 = "SVP-DTV15"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0701
            goto L_0x0123
        L_0x0701:
            r0 = 32
            goto L_0x08b0
        L_0x0705:
            java.lang.String r0 = "A7000-a"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x070f
            goto L_0x0123
        L_0x070f:
            r0 = 31
            goto L_0x08b0
        L_0x0713:
            java.lang.String r0 = "nicklaus_f"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x071d
            goto L_0x0123
        L_0x071d:
            r0 = 30
            goto L_0x08b0
        L_0x0721:
            java.lang.String r0 = "tcl_eu"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x072b
            goto L_0x0123
        L_0x072b:
            r0 = 29
            goto L_0x08b0
        L_0x072f:
            java.lang.String r0 = "ELUGA_Ray_X"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0739
            goto L_0x0123
        L_0x0739:
            r0 = 28
            goto L_0x08b0
        L_0x073d:
            java.lang.String r0 = "s905x018"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0747
            goto L_0x0123
        L_0x0747:
            r0 = 27
            goto L_0x08b0
        L_0x074b:
            java.lang.String r2 = "A10-70L"
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L_0x08b0
            goto L_0x0123
        L_0x0755:
            java.lang.String r0 = "A10-70F"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x075f
            goto L_0x0123
        L_0x075f:
            r0 = 25
            goto L_0x08b0
        L_0x0763:
            java.lang.String r0 = "namath"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x076d
            goto L_0x0123
        L_0x076d:
            r0 = 24
            goto L_0x08b0
        L_0x0771:
            java.lang.String r0 = "Slate_Pro"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x077b
            goto L_0x0123
        L_0x077b:
            r0 = 23
            goto L_0x08b0
        L_0x077f:
            java.lang.String r0 = "iris60"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0789
            goto L_0x0123
        L_0x0789:
            r0 = 22
            goto L_0x08b0
        L_0x078d:
            java.lang.String r0 = "BRAVIA_ATV2"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0797
            goto L_0x0123
        L_0x0797:
            r0 = 21
            goto L_0x08b0
        L_0x079b:
            java.lang.String r0 = "GiONEE_GBL7319"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07a5
            goto L_0x0123
        L_0x07a5:
            r0 = 20
            goto L_0x08b0
        L_0x07a9:
            java.lang.String r0 = "panell_dt"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07b3
            goto L_0x0123
        L_0x07b3:
            r0 = 19
            goto L_0x08b0
        L_0x07b7:
            java.lang.String r0 = "panell_ds"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07c1
            goto L_0x0123
        L_0x07c1:
            r0 = 18
            goto L_0x08b0
        L_0x07c5:
            java.lang.String r0 = "panell_dl"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07cf
            goto L_0x0123
        L_0x07cf:
            r0 = 17
            goto L_0x08b0
        L_0x07d3:
            java.lang.String r0 = "vernee_M5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07dd
            goto L_0x0123
        L_0x07dd:
            r0 = 16
            goto L_0x08b0
        L_0x07e1:
            java.lang.String r0 = "pacificrim"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07eb
            goto L_0x0123
        L_0x07eb:
            r0 = 15
            goto L_0x08b0
        L_0x07ef:
            java.lang.String r0 = "Phantom6"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07f9
            goto L_0x0123
        L_0x07f9:
            r0 = 14
            goto L_0x08b0
        L_0x07fd:
            java.lang.String r0 = "ComioS1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0807
            goto L_0x0123
        L_0x0807:
            r0 = 13
            goto L_0x08b0
        L_0x080b:
            java.lang.String r0 = "XT1663"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0815
            goto L_0x0123
        L_0x0815:
            r0 = 12
            goto L_0x08b0
        L_0x0819:
            java.lang.String r0 = "RAIJIN"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0823
            goto L_0x0123
        L_0x0823:
            r0 = 11
            goto L_0x08b0
        L_0x0827:
            java.lang.String r0 = "AquaPowerM"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0831
            goto L_0x0123
        L_0x0831:
            r0 = 10
            goto L_0x08b0
        L_0x0835:
            java.lang.String r0 = "PGN611"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x083f
            goto L_0x0123
        L_0x083f:
            r0 = 9
            goto L_0x08b0
        L_0x0843:
            java.lang.String r0 = "PGN610"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x084d
            goto L_0x0123
        L_0x084d:
            r0 = 8
            goto L_0x08b0
        L_0x0851:
            java.lang.String r0 = "PGN528"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x085b
            goto L_0x0123
        L_0x085b:
            r0 = 7
            goto L_0x08b0
        L_0x085d:
            java.lang.String r0 = "NX573J"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0867
            goto L_0x0123
        L_0x0867:
            r0 = 6
            goto L_0x08b0
        L_0x0869:
            java.lang.String r0 = "NX541J"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0873
            goto L_0x0123
        L_0x0873:
            r0 = 5
            goto L_0x08b0
        L_0x0875:
            java.lang.String r0 = "CP8676_I02"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x087f
            goto L_0x0123
        L_0x087f:
            r0 = 4
            goto L_0x08b0
        L_0x0881:
            java.lang.String r0 = "K50a40"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x088b
            goto L_0x0123
        L_0x088b:
            r0 = 3
            goto L_0x08b0
        L_0x088d:
            java.lang.String r0 = "GIONEE_SWW1631"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0897
            goto L_0x0123
        L_0x0897:
            r0 = 2
            goto L_0x08b0
        L_0x0899:
            java.lang.String r0 = "GIONEE_SWW1627"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x08a3
            goto L_0x0123
        L_0x08a3:
            r0 = 1
            goto L_0x08b0
        L_0x08a5:
            java.lang.String r0 = "GIONEE_SWW1609"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x08af
            goto L_0x0123
        L_0x08af:
            r0 = 0
        L_0x08b0:
            switch(r0) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008f;
                case 2: goto L_0x008f;
                case 3: goto L_0x008f;
                case 4: goto L_0x008f;
                case 5: goto L_0x008f;
                case 6: goto L_0x008f;
                case 7: goto L_0x008f;
                case 8: goto L_0x008f;
                case 9: goto L_0x008f;
                case 10: goto L_0x008f;
                case 11: goto L_0x008f;
                case 12: goto L_0x008f;
                case 13: goto L_0x008f;
                case 14: goto L_0x008f;
                case 15: goto L_0x008f;
                case 16: goto L_0x008f;
                case 17: goto L_0x008f;
                case 18: goto L_0x008f;
                case 19: goto L_0x008f;
                case 20: goto L_0x008f;
                case 21: goto L_0x008f;
                case 22: goto L_0x008f;
                case 23: goto L_0x008f;
                case 24: goto L_0x008f;
                case 25: goto L_0x008f;
                case 26: goto L_0x008f;
                case 27: goto L_0x008f;
                case 28: goto L_0x008f;
                case 29: goto L_0x008f;
                case 30: goto L_0x008f;
                case 31: goto L_0x008f;
                case 32: goto L_0x008f;
                case 33: goto L_0x008f;
                case 34: goto L_0x008f;
                case 35: goto L_0x008f;
                case 36: goto L_0x008f;
                case 37: goto L_0x008f;
                case 38: goto L_0x008f;
                case 39: goto L_0x008f;
                case 40: goto L_0x008f;
                case 41: goto L_0x008f;
                case 42: goto L_0x008f;
                case 43: goto L_0x008f;
                case 44: goto L_0x008f;
                case 45: goto L_0x008f;
                case 46: goto L_0x008f;
                case 47: goto L_0x008f;
                case 48: goto L_0x008f;
                case 49: goto L_0x008f;
                case 50: goto L_0x008f;
                case 51: goto L_0x008f;
                case 52: goto L_0x008f;
                case 53: goto L_0x008f;
                case 54: goto L_0x008f;
                case 55: goto L_0x008f;
                case 56: goto L_0x008f;
                case 57: goto L_0x008f;
                case 58: goto L_0x008f;
                case 59: goto L_0x008f;
                case 60: goto L_0x008f;
                case 61: goto L_0x008f;
                case 62: goto L_0x008f;
                case 63: goto L_0x008f;
                case 64: goto L_0x008f;
                case 65: goto L_0x008f;
                case 66: goto L_0x008f;
                case 67: goto L_0x008f;
                case 68: goto L_0x008f;
                case 69: goto L_0x008f;
                case 70: goto L_0x008f;
                case 71: goto L_0x008f;
                case 72: goto L_0x008f;
                case 73: goto L_0x008f;
                case 74: goto L_0x008f;
                case 75: goto L_0x008f;
                case 76: goto L_0x008f;
                case 77: goto L_0x008f;
                case 78: goto L_0x008f;
                case 79: goto L_0x008f;
                case 80: goto L_0x008f;
                case 81: goto L_0x008f;
                case 82: goto L_0x008f;
                case 83: goto L_0x008f;
                case 84: goto L_0x008f;
                case 85: goto L_0x008f;
                case 86: goto L_0x008f;
                case 87: goto L_0x008f;
                case 88: goto L_0x008f;
                case 89: goto L_0x008f;
                case 90: goto L_0x008f;
                case 91: goto L_0x008f;
                case 92: goto L_0x008f;
                case 93: goto L_0x008f;
                case 94: goto L_0x008f;
                case 95: goto L_0x008f;
                case 96: goto L_0x008f;
                case 97: goto L_0x008f;
                case 98: goto L_0x008f;
                case 99: goto L_0x008f;
                case 100: goto L_0x008f;
                case 101: goto L_0x008f;
                case 102: goto L_0x008f;
                case 103: goto L_0x008f;
                case 104: goto L_0x008f;
                case 105: goto L_0x008f;
                case 106: goto L_0x008f;
                case 107: goto L_0x008f;
                case 108: goto L_0x008f;
                case 109: goto L_0x008f;
                case 110: goto L_0x008f;
                case 111: goto L_0x008f;
                case 112: goto L_0x008f;
                case 113: goto L_0x008f;
                case 114: goto L_0x008f;
                case 115: goto L_0x008f;
                case 116: goto L_0x008f;
                case 117: goto L_0x008f;
                case 118: goto L_0x008f;
                case 119: goto L_0x008f;
                case 120: goto L_0x008f;
                case 121: goto L_0x008f;
                case 122: goto L_0x008f;
                case 123: goto L_0x008f;
                case 124: goto L_0x008f;
                case 125: goto L_0x008f;
                case 126: goto L_0x008f;
                case 127: goto L_0x008f;
                case 128: goto L_0x008f;
                case 129: goto L_0x008f;
                case 130: goto L_0x008f;
                case 131: goto L_0x008f;
                case 132: goto L_0x008f;
                case 133: goto L_0x008f;
                case 134: goto L_0x008f;
                case 135: goto L_0x008f;
                case 136: goto L_0x008f;
                case 137: goto L_0x008f;
                case 138: goto L_0x008f;
                case 139: goto L_0x008f;
                default: goto L_0x08b3;
            }
        L_0x08b3:
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008f
        L_0x08bb:
            f13580i2 = r13     // Catch:{ all -> 0x08c0 }
            f13579h2 = r11     // Catch:{ all -> 0x08c0 }
            goto L_0x08c2
        L_0x08c0:
            r0 = move-exception
            goto L_0x08c6
        L_0x08c2:
            monitor-exit(r12)     // Catch:{ all -> 0x08c0 }
            boolean r0 = f13580i2
            return r0
        L_0x08c6:
            monitor-exit(r12)     // Catch:{ all -> 0x08c0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C1240e.v0(java.lang.String):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        if (r9.equals("video/hevc") == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int w0(c1.n r11, M0.r r12) {
        /*
            r0 = 3
            r1 = 4
            java.lang.String r2 = "video/hevc"
            java.lang.String r3 = "video/avc"
            r4 = 2
            r5 = 1
            int r6 = r12.f3043u
            r7 = -1
            if (r6 == r7) goto L_0x00df
            int r8 = r12.f3044v
            if (r8 != r7) goto L_0x0013
            goto L_0x00df
        L_0x0013:
            java.lang.String r9 = r12.f3036n
            r9.getClass()
            java.lang.String r10 = "video/dolby-vision"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L_0x0039
            android.util.Pair r12 = c1.v.d(r12)
            if (r12 == 0) goto L_0x0038
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r9 = 512(0x200, float:7.175E-43)
            if (r12 == r9) goto L_0x0036
            if (r12 == r5) goto L_0x0036
            if (r12 != r4) goto L_0x0038
        L_0x0036:
            r9 = r3
            goto L_0x0039
        L_0x0038:
            r9 = r2
        L_0x0039:
            int r12 = r9.hashCode()
            switch(r12) {
                case -1664118616: goto L_0x007e;
                case -1662735862: goto L_0x0073;
                case -1662541442: goto L_0x006c;
                case 1187890754: goto L_0x0061;
                case 1331836730: goto L_0x0058;
                case 1599127256: goto L_0x004d;
                case 1599127257: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r4 = -1
            goto L_0x0088
        L_0x0042:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x004b
            goto L_0x0040
        L_0x004b:
            r4 = 6
            goto L_0x0088
        L_0x004d:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x0056
            goto L_0x0040
        L_0x0056:
            r4 = 5
            goto L_0x0088
        L_0x0058:
            boolean r12 = r9.equals(r3)
            if (r12 != 0) goto L_0x005f
            goto L_0x0040
        L_0x005f:
            r4 = 4
            goto L_0x0088
        L_0x0061:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x006a
            goto L_0x0040
        L_0x006a:
            r4 = 3
            goto L_0x0088
        L_0x006c:
            boolean r12 = r9.equals(r2)
            if (r12 != 0) goto L_0x0088
            goto L_0x0040
        L_0x0073:
            java.lang.String r12 = "video/av01"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x007c
            goto L_0x0040
        L_0x007c:
            r4 = 1
            goto L_0x0088
        L_0x007e:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x0087
            goto L_0x0040
        L_0x0087:
            r4 = 0
        L_0x0088:
            switch(r4) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x00d9;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00d9;
                case 4: goto L_0x0093;
                case 5: goto L_0x00d9;
                case 6: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            return r7
        L_0x008c:
            int r6 = r6 * r8
            int r6 = r6 * 3
            int r6 = r6 / 8
            return r6
        L_0x0093:
            java.lang.String r12 = P0.z.f3751d
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "Amazon"
            java.lang.String r2 = P0.z.f3750c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "AFTS"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x00bc
            boolean r11 = r11.f8801f
            if (r11 == 0) goto L_0x00bc
            goto L_0x00cc
        L_0x00bc:
            r11 = 16
            int r12 = P0.z.f(r6, r11)
            int r11 = P0.z.f(r8, r11)
            int r11 = r11 * r12
            int r11 = r11 * 768
            int r11 = r11 / r1
            return r11
        L_0x00cc:
            return r7
        L_0x00cd:
            int r6 = r6 * r8
            int r6 = r6 * 3
            int r6 = r6 / r1
            r11 = 2097152(0x200000, float:2.938736E-39)
            int r11 = java.lang.Math.max(r11, r6)
            return r11
        L_0x00d9:
            int r6 = r6 * r8
            int r6 = r6 * 3
            int r6 = r6 / r1
            return r6
        L_0x00df:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C1240e.w0(c1.n, M0.r):int");
    }

    public static List x0(Context context, c1.i iVar, r rVar, boolean z, boolean z6) {
        List list;
        String str = rVar.f3036n;
        if (str == null) {
            return i0.f2073Y;
        }
        if (z.f3748a >= 26 && "video/dolby-vision".equals(str) && !F.h.k(context)) {
            String b8 = v.b(rVar);
            if (b8 == null) {
                list = i0.f2073Y;
            } else {
                iVar.getClass();
                list = v.e(b8, z, z6);
            }
            if (!list.isEmpty()) {
                return list;
            }
        }
        return v.g(iVar, rVar, z, z6);
    }

    public static int y0(n nVar, r rVar) {
        if (rVar.f3037o == -1) {
            return w0(nVar, rVar);
        }
        List list = rVar.f3039q;
        int size = list.size();
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i += ((byte[]) list.get(i8)).length;
        }
        return rVar.f3037o + i;
    }

    public final void A0() {
        if (this.f13597Q1 > 0) {
            this.f4804a0.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j7 = elapsedRealtime - this.f13596P1;
            int i = this.f13597Q1;
            i iVar = this.f13614y1;
            Handler handler = iVar.f5527b;
            if (handler != null) {
                handler.post(new w(iVar, i, j7));
            }
            this.f13597Q1 = 0;
            this.f13596P1 = elapsedRealtime;
        }
    }

    public final void B0() {
        int i;
        k kVar;
        if (this.f13606Z1 && (i = z.f3748a) >= 23 && (kVar = this.f8817E0) != null) {
            this.f13608b2 = new C1239d(this, kVar);
            if (i >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                kVar.g(bundle);
            }
        }
    }

    public final C0215g C(n nVar, r rVar, r rVar2) {
        int i;
        C0215g b8 = nVar.b(rVar, rVar2);
        h hVar = this.f13584D1;
        hVar.getClass();
        int i8 = rVar2.f3043u;
        int i9 = hVar.f1527a;
        int i10 = b8.e;
        if (i8 > i9 || rVar2.f3044v > hVar.f1528b) {
            i10 |= 256;
        }
        if (y0(nVar, rVar2) > hVar.f1529c) {
            i10 |= 64;
        }
        int i11 = i10;
        if (i11 != 0) {
            i = 0;
        } else {
            i = b8.f4836d;
        }
        return new C0215g(nVar.f8797a, rVar, rVar2, i, i11);
    }

    public final void C0(k kVar, int i, long j7) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        kVar.A(i, j7);
        Trace.endSection();
        this.f8862r1.e++;
        boolean z = false;
        this.f13598R1 = 0;
        if (this.f13587G1 == null) {
            h0 h0Var = this.f13603W1;
            boolean equals = h0Var.equals(h0.f2952d);
            i iVar = this.f13614y1;
            if (!equals && !h0Var.equals(this.f13604X1)) {
                this.f13604X1 = h0Var;
                iVar.c(h0Var);
            }
            r rVar = this.f13582B1;
            if (rVar.f13670d != 3) {
                z = true;
            }
            rVar.f13670d = 3;
            rVar.f13675k.getClass();
            rVar.f13671f = z.O(SystemClock.elapsedRealtime());
            if (z && (surface = this.f13590J1) != null) {
                Handler handler = iVar.f5527b;
                if (handler != null) {
                    handler.post(new x(iVar, surface, SystemClock.elapsedRealtime()));
                }
                this.f13593M1 = true;
            }
        }
    }

    public final m D(IllegalStateException illegalStateException, n nVar) {
        Surface surface = this.f13590J1;
        m mVar = new m(illegalStateException, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mVar;
    }

    public final boolean D0(n nVar) {
        if (z.f3748a < 23 || this.f13606Z1 || v0(nVar.f8797a) || (nVar.f8801f && !C1242g.k(this.w1))) {
            return false;
        }
        return true;
    }

    public final void E0(k kVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        kVar.k(i);
        Trace.endSection();
        this.f8862r1.f4822f++;
    }

    public final void F0(int i, int i8) {
        C0214f fVar = this.f8862r1;
        fVar.f4824h += i;
        int i9 = i + i8;
        fVar.f4823g += i9;
        this.f13597Q1 += i9;
        int i10 = this.f13598R1 + i9;
        this.f13598R1 = i10;
        fVar.i = Math.max(i10, fVar.i);
        int i11 = this.f13615z1;
        if (i11 > 0 && this.f13597Q1 >= i11) {
            A0();
        }
    }

    public final void G0(long j7) {
        C0214f fVar = this.f8862r1;
        fVar.f4826k += j7;
        fVar.f4827l++;
        this.f13600T1 += j7;
        this.f13601U1++;
    }

    public final int L(f fVar) {
        if (z.f3748a < 34 || !this.f13606Z1 || fVar.f4388a0 >= this.f4809f0) {
            return 0;
        }
        return 32;
    }

    public final boolean M() {
        if (!this.f13606Z1 || z.f3748a >= 23) {
            return false;
        }
        return true;
    }

    public final float N(float f8, r[] rVarArr) {
        float f9 = -1.0f;
        for (r rVar : rVarArr) {
            float f10 = rVar.f3045w;
            if (f10 != -1.0f) {
                f9 = Math.max(f9, f10);
            }
        }
        if (f9 == -1.0f) {
            return -1.0f;
        }
        return f9 * f8;
    }

    public final ArrayList O(c1.i iVar, r rVar, boolean z) {
        List x02 = x0(this.w1, iVar, rVar, z, this.f13606Z1);
        HashMap hashMap = v.f8875a;
        ArrayList arrayList = new ArrayList(x02);
        Collections.sort(arrayList, new a(1, new c(1, rVar)));
        return arrayList;
    }

    public final C1455O P(n nVar, r rVar, MediaCrypto mediaCrypto, float f8) {
        int i;
        int i8;
        C0121i iVar;
        h hVar;
        int i9;
        boolean z;
        Pair d8;
        boolean z6;
        int i10;
        int i11;
        Point point;
        float f9;
        int i12;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i13;
        boolean z8;
        int w02;
        n nVar2 = nVar;
        r rVar2 = rVar;
        float f10 = f8;
        String str = nVar2.f8799c;
        r[] rVarArr = this.f4807d0;
        rVarArr.getClass();
        int i14 = rVar2.f3043u;
        int y02 = y0(nVar, rVar);
        int length = rVarArr.length;
        float f11 = rVar2.f3045w;
        int i15 = rVar2.f3043u;
        C0121i iVar2 = rVar2.f3013B;
        int i16 = rVar2.f3044v;
        if (length == 1) {
            if (!(y02 == -1 || (w02 = w0(nVar, rVar)) == -1)) {
                y02 = Math.min((int) (((float) y02) * 1.5f), w02);
            }
            hVar = new h(i14, i16, y02);
            i = i15;
            iVar = iVar2;
            i8 = i16;
        } else {
            int length2 = rVarArr.length;
            int i17 = i16;
            int i18 = 0;
            boolean z9 = false;
            while (i18 < length2) {
                r rVar3 = rVarArr[i18];
                r[] rVarArr2 = rVarArr;
                if (iVar2 != null && rVar3.f3013B == null) {
                    C0129q a8 = rVar3.a();
                    a8.f2978A = iVar2;
                    rVar3 = new r(a8);
                }
                if (nVar2.b(rVar2, rVar3).f4836d != 0) {
                    int i19 = rVar3.f3044v;
                    i13 = length2;
                    int i20 = rVar3.f3043u;
                    if (i20 == -1 || i19 == -1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 |= z8;
                    i14 = Math.max(i14, i20);
                    i17 = Math.max(i17, i19);
                    y02 = Math.max(y02, y0(nVar2, rVar3));
                } else {
                    i13 = length2;
                }
                i18++;
                float f12 = f8;
                rVarArr = rVarArr2;
                length2 = i13;
            }
            if (z9) {
                l.B("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i14 + "x" + i17);
                if (i16 > i15) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    i10 = i16;
                } else {
                    i10 = i15;
                }
                if (z6) {
                    i11 = i15;
                    iVar = iVar2;
                } else {
                    iVar = iVar2;
                    i11 = i16;
                }
                float f13 = ((float) i11) / ((float) i10);
                int[] iArr = f13578g2;
                i = i15;
                i8 = i16;
                int i21 = 0;
                while (true) {
                    if (i21 >= 9) {
                        break;
                    }
                    int i22 = iArr[i21];
                    int[] iArr2 = iArr;
                    int i23 = (int) (((float) i22) * f13);
                    if (i22 <= i10 || i23 <= i11) {
                        break;
                    }
                    int i24 = i23;
                    if (!z6) {
                        i23 = i22;
                    }
                    if (!z6) {
                        i22 = i24;
                    }
                    boolean z10 = z6;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = nVar2.f8800d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i12 = i10;
                        f9 = f13;
                        point2 = null;
                    } else {
                        i12 = i10;
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        f9 = f13;
                        point2 = new Point(z.f(i23, widthAlignment) * widthAlignment, z.f(i22, heightAlignment) * heightAlignment);
                    }
                    if (point2 != null) {
                        point = point2;
                        if (nVar2.f(point2.x, point2.y, (double) f11)) {
                            break;
                        }
                    }
                    i21++;
                    iArr = iArr2;
                    z6 = z10;
                    i10 = i12;
                    f13 = f9;
                }
                point = null;
                if (point != null) {
                    i14 = Math.max(i14, point.x);
                    i17 = Math.max(i17, point.y);
                    C0129q a9 = rVar.a();
                    a9.f3006t = i14;
                    a9.f3007u = i17;
                    y02 = Math.max(y02, w0(nVar2, new r(a9)));
                    l.B("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i14 + "x" + i17);
                }
            } else {
                i = i15;
                iVar = iVar2;
                i8 = i16;
            }
            hVar = new h(i14, i17, y02);
        }
        this.f13584D1 = hVar;
        if (this.f13606Z1) {
            i9 = this.f13607a2;
        } else {
            i9 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i);
        mediaFormat.setInteger("height", i8);
        r rVar4 = rVar;
        l.A(mediaFormat, rVar4.f3039q);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        l.w(mediaFormat, "rotation-degrees", rVar4.f3046x);
        if (iVar != null) {
            C0121i iVar3 = iVar;
            l.w(mediaFormat, "color-transfer", iVar3.f2959c);
            l.w(mediaFormat, "color-standard", iVar3.f2957a);
            l.w(mediaFormat, "color-range", iVar3.f2958b);
            byte[] bArr = iVar3.f2960d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(rVar4.f3036n) && (d8 = v.d(rVar)) != null) {
            l.w(mediaFormat, "profile", ((Integer) d8.first).intValue());
        }
        mediaFormat.setInteger("max-width", hVar.f1527a);
        mediaFormat.setInteger("max-height", hVar.f1528b);
        l.w(mediaFormat, "max-input-size", hVar.f1529c);
        int i25 = z.f3748a;
        if (i25 >= 23) {
            mediaFormat.setInteger("priority", 0);
            float f14 = f8;
            if (f14 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f14);
            }
        }
        if (this.f13581A1) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i9 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i9);
        }
        if (i25 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f13605Y1));
        }
        Surface z02 = z0(nVar);
        if (this.f13587G1 != null && !z.L(this.w1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new C1455O(nVar, mediaFormat, rVar, z02, mediaCrypto, (Object) null);
    }

    public final void Q(f fVar) {
        if (this.f13586F1) {
            ByteBuffer byteBuffer = fVar.f4389b0;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b8 = byteBuffer.get();
                short s8 = byteBuffer.getShort();
                short s9 = byteBuffer.getShort();
                byte b9 = byteBuffer.get();
                byte b10 = byteBuffer.get();
                byteBuffer.position(0);
                if (b8 != -75 || s8 != 60 || s9 != 1 || b9 != 4) {
                    return;
                }
                if (b10 == 0 || b10 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    k kVar = this.f8817E0;
                    kVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    kVar.g(bundle);
                }
            }
        }
    }

    public final void V(Exception exc) {
        l.p("MediaCodecVideoRenderer", "Video codec error", exc);
        i iVar = this.f13614y1;
        Handler handler = iVar.f5527b;
        if (handler != null) {
            handler.post(new w(iVar, (Object) exc, 3));
        }
    }

    public final void W(long j7, long j8, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        i iVar = this.f13614y1;
        Handler handler = iVar.f5527b;
        if (handler != null) {
            handler.post(new w(iVar, str, j7, j8));
        }
        this.f13585E1 = v0(str);
        n nVar = this.f8824L0;
        nVar.getClass();
        boolean z = false;
        if (z.f3748a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.f8798b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f8800d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f13586F1 = z;
        B0();
    }

    public final void X(String str) {
        i iVar = this.f13614y1;
        Handler handler = iVar.f5527b;
        if (handler != null) {
            handler.post(new w(iVar, (Object) str, 6));
        }
    }

    public final C0215g Y(R2.c cVar) {
        C0215g Y7 = super.Y(cVar);
        r rVar = (r) cVar.f4337W;
        rVar.getClass();
        i iVar = this.f13614y1;
        Handler handler = iVar.f5527b;
        if (handler != null) {
            handler.post(new w(iVar, rVar, Y7));
        }
        return Y7;
    }

    public final void Z(r rVar, MediaFormat mediaFormat) {
        int i;
        int i8;
        boolean z;
        boolean z6;
        k kVar = this.f8817E0;
        if (kVar != null) {
            kVar.n(this.f13594N1);
        }
        if (this.f13606Z1) {
            i8 = rVar.f3043u;
            i = rVar.f3044v;
        } else {
            mediaFormat.getClass();
            if (!mediaFormat.containsKey("crop-right") || !mediaFormat.containsKey("crop-left") || !mediaFormat.containsKey("crop-bottom") || !mediaFormat.containsKey("crop-top")) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z6) {
                i8 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i8 = mediaFormat.getInteger("width");
            }
            if (z6) {
                i = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i = mediaFormat.getInteger("height");
            }
        }
        float f8 = rVar.f3047y;
        if (z.f3748a >= 30 && mediaFormat != null && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            f8 = ((float) mediaFormat.getInteger("sar-width")) / ((float) mediaFormat.getInteger("sar-height"));
        }
        int i9 = rVar.f3046x;
        if (i9 == 90 || i9 == 270) {
            f8 = 1.0f / f8;
            int i10 = i;
            i = i8;
            i8 = i10;
        }
        this.f13603W1 = new h0(f8, i8, i);
        C1244i iVar = this.f13587G1;
        if (iVar == null || !this.f13612f2) {
            this.f13582B1.g(rVar.f3045w);
        } else {
            C0129q a8 = rVar.a();
            a8.f3006t = i8;
            a8.f3007u = i;
            a8.f3010x = f8;
            r rVar2 = new r(a8);
            l.j(false);
            iVar.f13639n.f13643b.g(rVar2.f3045w);
            iVar.f13630c = rVar2;
            if (!iVar.i) {
                iVar.e();
                iVar.i = true;
                iVar.f13635j = false;
                iVar.f13636k = -9223372036854775807L;
            } else {
                if (iVar.f13634h != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                l.j(z);
                iVar.f13635j = true;
                iVar.f13636k = iVar.f13634h;
            }
        }
        this.f13612f2 = false;
    }

    public final void b(int i, Object obj) {
        Surface surface;
        Handler handler;
        boolean z = false;
        r rVar = this.f13582B1;
        if (i == 1) {
            if (obj instanceof Surface) {
                surface = (Surface) obj;
            } else {
                surface = null;
            }
            Surface surface2 = this.f13590J1;
            i iVar = this.f13614y1;
            if (surface2 != surface) {
                this.f13590J1 = surface;
                if (this.f13587G1 == null) {
                    u uVar = rVar.f13668b;
                    if (uVar.e != surface) {
                        uVar.b();
                        uVar.e = surface;
                        uVar.d(true);
                    }
                    rVar.d(1);
                }
                this.f13593M1 = false;
                int i8 = this.f4805b0;
                k kVar = this.f8817E0;
                if (kVar != null && this.f13587G1 == null) {
                    n nVar = this.f8824L0;
                    nVar.getClass();
                    Surface surface3 = this.f13590J1;
                    if ((surface3 != null && surface3.isValid()) || ((z.f3748a >= 35 && nVar.f8803h) || D0(nVar))) {
                        z = true;
                    }
                    int i9 = z.f3748a;
                    if (i9 < 23 || !z || this.f13585E1) {
                        i0();
                        T();
                    } else {
                        Surface z02 = z0(nVar);
                        if (i9 >= 23 && z02 != null) {
                            kVar.s(z02);
                        } else if (i9 >= 35) {
                            kVar.q();
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
                if (surface != null) {
                    h0 h0Var = this.f13604X1;
                    if (h0Var != null) {
                        iVar.c(h0Var);
                    }
                    if (i8 == 2) {
                        C1244i iVar2 = this.f13587G1;
                        if (iVar2 != null) {
                            iVar2.d(true);
                        } else {
                            rVar.c(true);
                        }
                    }
                } else {
                    this.f13604X1 = null;
                    C1244i iVar3 = this.f13587G1;
                    if (iVar3 != null) {
                        l lVar = iVar3.f13639n;
                        lVar.getClass();
                        int i10 = s.f3735c.f3736a;
                        lVar.f13651l = null;
                    }
                }
                B0();
            } else if (surface != null) {
                h0 h0Var2 = this.f13604X1;
                if (h0Var2 != null) {
                    iVar.c(h0Var2);
                }
                Surface surface4 = this.f13590J1;
                if (surface4 != null && this.f13593M1 && (handler = iVar.f5527b) != null) {
                    handler.post(new x(iVar, surface4, SystemClock.elapsedRealtime()));
                }
            }
        } else if (i == 7) {
            obj.getClass();
            p pVar = (p) obj;
            this.f13609c2 = pVar;
            C1244i iVar4 = this.f13587G1;
            if (iVar4 != null) {
                iVar4.f13639n.f13649j = pVar;
            }
        } else if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f13607a2 != intValue) {
                this.f13607a2 = intValue;
                if (this.f13606Z1) {
                    i0();
                }
            }
        } else if (i == 16) {
            obj.getClass();
            this.f13605Y1 = ((Integer) obj).intValue();
            k kVar2 = this.f8817E0;
            if (kVar2 != null && z.f3748a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f13605Y1));
                kVar2.g(bundle);
            }
        } else if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.f13594N1 = intValue2;
            k kVar3 = this.f8817E0;
            if (kVar3 != null) {
                kVar3.n(intValue2);
            }
        } else if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.f13595O1 = intValue3;
            C1244i iVar5 = this.f13587G1;
            if (iVar5 != null) {
                iVar5.g(intValue3);
                return;
            }
            u uVar2 = rVar.f13668b;
            if (uVar2.f13690j != intValue3) {
                uVar2.f13690j = intValue3;
                uVar2.d(true);
            }
        } else if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f13589I1 = list;
            C1244i iVar6 = this.f13587G1;
            if (iVar6 != null) {
                iVar6.k(list);
            }
        } else if (i == 14) {
            obj.getClass();
            s sVar = (s) obj;
            if (sVar.f3736a != 0 && sVar.f3737b != 0) {
                this.f13592L1 = sVar;
                C1244i iVar7 = this.f13587G1;
                if (iVar7 != null) {
                    Surface surface5 = this.f13590J1;
                    l.k(surface5);
                    iVar7.h(surface5, sVar);
                }
            }
        } else if (i == 11) {
            this.f8871z0 = (A) obj;
        }
    }

    public final void b0(long j7) {
        super.b0(j7);
        if (!this.f13606Z1) {
            this.f13599S1--;
        }
    }

    public final void c0() {
        C1244i iVar = this.f13587G1;
        if (iVar != null) {
            p pVar = this.s1;
            long j7 = pVar.f8809b;
            long j8 = this.f4809f0;
            long j9 = pVar.f8810c;
            iVar.j(j7, j9, -this.f13610d2, j8);
        } else {
            this.f13582B1.d(2);
        }
        this.f13612f2 = true;
        B0();
    }

    public final void d0(f fVar) {
        boolean z;
        Surface surface;
        boolean z6 = this.f13606Z1;
        if (!z6) {
            this.f13599S1++;
        }
        if (z.f3748a < 23 && z6) {
            long j7 = fVar.f4388a0;
            u0(j7);
            h0 h0Var = this.f13603W1;
            boolean equals = h0Var.equals(h0.f2952d);
            i iVar = this.f13614y1;
            if (!equals && !h0Var.equals(this.f13604X1)) {
                this.f13604X1 = h0Var;
                iVar.c(h0Var);
            }
            this.f8862r1.e++;
            r rVar = this.f13582B1;
            if (rVar.f13670d != 3) {
                z = true;
            } else {
                z = false;
            }
            rVar.f13670d = 3;
            rVar.f13675k.getClass();
            rVar.f13671f = z.O(SystemClock.elapsedRealtime());
            if (z && (surface = this.f13590J1) != null) {
                Handler handler = iVar.f5527b;
                if (handler != null) {
                    handler.post(new x(iVar, surface, SystemClock.elapsedRealtime()));
                }
                this.f13593M1 = true;
            }
            b0(j7);
        }
    }

    public final void e0(r rVar) {
        C1244i iVar = this.f13587G1;
        if (iVar != null) {
            try {
                iVar.c(rVar);
                throw null;
            } catch (z e) {
                throw f(e, rVar, false, 7000);
            }
        }
    }

    public final void g() {
        C1244i iVar = this.f13587G1;
        if (iVar != null) {
            r rVar = (r) iVar.f13639n.f13646f.f10050V;
            if (rVar.f13670d == 0) {
                rVar.f13670d = 1;
                return;
            }
            return;
        }
        r rVar2 = this.f13582B1;
        if (rVar2.f13670d == 0) {
            rVar2.f13670d = 1;
        }
    }

    public final boolean g0(long j7, long j8, k kVar, ByteBuffer byteBuffer, int i, int i8, int i9, long j9, boolean z, boolean z6, r rVar) {
        long j10;
        long j11;
        boolean z8;
        k kVar2 = kVar;
        int i10 = i;
        kVar.getClass();
        p pVar = this.s1;
        long j12 = j9 - pVar.f8810c;
        C1244i iVar = this.f13587G1;
        if (iVar != null) {
            try {
                z8 = false;
                try {
                    return iVar.b(j9 + (-this.f13610d2), z6, j7, j8, new o(this, kVar, i, j12));
                } catch (z e) {
                    e = e;
                    throw f(e, e.f13712U, z8, 7001);
                }
            } catch (z e8) {
                e = e8;
                z8 = false;
                throw f(e, e.f13712U, z8, 7001);
            }
        } else {
            q qVar = this.f13583C1;
            int a8 = this.f13582B1.a(j9, j7, j8, pVar.f8809b, z6, qVar);
            if (a8 == 4) {
                return false;
            }
            if (!z || z6) {
                Surface surface = this.f13590J1;
                q qVar2 = this.f13583C1;
                if (surface == null) {
                    if (qVar2.f13665a >= 30000) {
                        return false;
                    }
                    E0(kVar2, i10);
                    G0(qVar2.f13665a);
                    return true;
                } else if (a8 == 0) {
                    this.f4804a0.getClass();
                    long nanoTime = System.nanoTime();
                    p pVar2 = this.f13609c2;
                    if (pVar2 != null) {
                        pVar2.c(j12, nanoTime, rVar, this.f8819G0);
                    }
                    C0(kVar2, i10, nanoTime);
                    G0(qVar2.f13665a);
                    return true;
                } else if (a8 == 1) {
                    long j13 = qVar2.f13666b;
                    long j14 = qVar2.f13665a;
                    if (j13 == this.f13602V1) {
                        E0(kVar2, i10);
                        j10 = j14;
                    } else {
                        p pVar3 = this.f13609c2;
                        if (pVar3 != null) {
                            j11 = j14;
                            pVar3.c(j12, j13, rVar, this.f8819G0);
                        } else {
                            j11 = j14;
                        }
                        C0(kVar2, i10, j13);
                        j10 = j11;
                    }
                    G0(j10);
                    this.f13602V1 = j13;
                    return true;
                } else if (a8 == 2) {
                    Trace.beginSection("dropVideoBuffer");
                    kVar2.k(i10);
                    Trace.endSection();
                    F0(0, 1);
                    G0(qVar2.f13665a);
                    return true;
                } else if (a8 == 3) {
                    E0(kVar2, i10);
                    G0(qVar2.f13665a);
                    return true;
                } else if (a8 == 5) {
                    return false;
                } else {
                    throw new IllegalStateException(String.valueOf(a8));
                }
            } else {
                E0(kVar2, i10);
                return true;
            }
        }
    }

    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    public final boolean k() {
        if (!this.f8855n1 || this.f13587G1 != null) {
            return false;
        }
        return true;
    }

    public final void k0() {
        super.k0();
        this.f13599S1 = 0;
    }

    public final boolean l() {
        boolean l8 = super.l();
        C1244i iVar = this.f13587G1;
        if (iVar != null) {
            return ((r) iVar.f13639n.f13646f.f10050V).b(false);
        }
        if (!l8 || (this.f8817E0 != null && this.f13590J1 != null && !this.f13606Z1)) {
            return this.f13582B1.b(l8);
        }
        return true;
    }

    public final void m() {
        i iVar = this.f13614y1;
        this.f13604X1 = null;
        this.f13611e2 = -9223372036854775807L;
        C1244i iVar2 = this.f13587G1;
        if (iVar2 != null) {
            ((r) iVar2.f13639n.f13646f.f10050V).d(0);
        } else {
            this.f13582B1.d(0);
        }
        B0();
        this.f13593M1 = false;
        this.f13608b2 = null;
        try {
            super.m();
            C0214f fVar = this.f8862r1;
            iVar.getClass();
            synchronized (fVar) {
            }
            Handler handler = iVar.f5527b;
            if (handler != null) {
                handler.post(new C0412c((Object) iVar, 13, (Object) fVar));
            }
            iVar.c(h0.f2952d);
        } catch (Throwable th) {
            iVar.a(this.f8862r1);
            iVar.c(h0.f2952d);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [T0.f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v23, types: [V0.r, java.lang.Object] */
    public final void n(boolean z, boolean z6) {
        boolean z8;
        this.f8862r1 = new Object();
        d0 d0Var = this.f4801X;
        d0Var.getClass();
        boolean z9 = d0Var.f4797b;
        if (!z9 || this.f13607a2 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        l.j(z8);
        if (this.f13606Z1 != z9) {
            this.f13606Z1 = z9;
            i0();
        }
        C0214f fVar = this.f8862r1;
        i iVar = this.f13614y1;
        Handler handler = iVar.f5527b;
        if (handler != null) {
            handler.post(new w(iVar, (Object) fVar, 4));
        }
        boolean z10 = this.f13588H1;
        r rVar = this.f13582B1;
        if (!z10) {
            if (this.f13589I1 != null && this.f13587G1 == null) {
                Context context = this.w1;
                ? obj = new Object();
                obj.f5586b = context.getApplicationContext();
                obj.f5587c = rVar;
                M m8 = O.f2026V;
                obj.f5589f = i0.f2073Y;
                obj.f5590g = t.f3738a;
                t tVar = this.f4804a0;
                tVar.getClass();
                obj.f5590g = tVar;
                l.j(!obj.f5585a);
                if (((k) obj.e) == null) {
                    if (((j) obj.f5588d) == null) {
                        obj.f5588d = new Object();
                    }
                    obj.e = new k((j) obj.f5588d);
                }
                l lVar = new l(obj);
                obj.f5585a = true;
                this.f13587G1 = lVar.f13642a;
            }
            this.f13588H1 = true;
        }
        C1244i iVar2 = this.f13587G1;
        if (iVar2 != null) {
            C1160q qVar = new C1160q(8, (Object) this);
            L3.a aVar = L3.a.f2693U;
            iVar2.f13637l = qVar;
            iVar2.f13638m = aVar;
            p pVar = this.f13609c2;
            if (pVar != null) {
                iVar2.f13639n.f13649j = pVar;
            }
            if (this.f13590J1 != null && !this.f13592L1.equals(s.f3735c)) {
                this.f13587G1.h(this.f13590J1, this.f13592L1);
            }
            this.f13587G1.g(this.f13595O1);
            this.f13587G1.i(this.f8815C0);
            List list = this.f13589I1;
            if (list != null) {
                this.f13587G1.k(list);
            }
            ((r) this.f13587G1.f13639n.f13646f.f10050V).f13670d = z6;
            return;
        }
        t tVar2 = this.f4804a0;
        tVar2.getClass();
        rVar.f13675k = tVar2;
        rVar.f13670d = z6 ? 1 : 0;
    }

    public final void o(long j7, boolean z) {
        C1244i iVar = this.f13587G1;
        if (iVar != null) {
            iVar.a(true);
            C1244i iVar2 = this.f13587G1;
            p pVar = this.s1;
            iVar2.j(pVar.f8809b, pVar.f8810c, -this.f13610d2, this.f4809f0);
            this.f13612f2 = true;
        }
        super.o(j7, z);
        C1244i iVar3 = this.f13587G1;
        r rVar = this.f13582B1;
        if (iVar3 == null) {
            u uVar = rVar.f13668b;
            uVar.f13693m = 0;
            uVar.f13696p = -1;
            uVar.f13694n = -1;
            rVar.f13672g = -9223372036854775807L;
            rVar.e = -9223372036854775807L;
            rVar.d(1);
            rVar.f13673h = -9223372036854775807L;
        }
        if (z) {
            C1244i iVar4 = this.f13587G1;
            if (iVar4 != null) {
                iVar4.d(false);
            } else {
                rVar.c(false);
            }
        }
        B0();
        this.f13598R1 = 0;
    }

    public final boolean o0(n nVar) {
        Surface surface = this.f13590J1;
        if ((surface == null || !surface.isValid()) && ((z.f3748a < 35 || !nVar.f8803h) && !D0(nVar))) {
            return false;
        }
        return true;
    }

    public final void p() {
        C1244i iVar = this.f13587G1;
        if (iVar != null && this.f13613x1) {
            l lVar = iVar.f13639n;
            if (lVar.f13653n != 2) {
                P0.v vVar = lVar.f13650k;
                if (vVar != null) {
                    vVar.f3741a.removeCallbacksAndMessages((Object) null);
                }
                lVar.f13651l = null;
                lVar.f13653n = 2;
            }
        }
    }

    public final boolean p0(f fVar) {
        if (!fVar.d(67108864) || j() || fVar.d(536870912)) {
            return false;
        }
        long j7 = this.f13611e2;
        if (j7 != -9223372036854775807L && j7 - (fVar.f4388a0 - this.s1.f8810c) > 100000 && !fVar.d(b.MAX_POW2) && fVar.f4388a0 < this.f4809f0) {
            return true;
        }
        return false;
    }

    public final void q() {
        try {
            E();
            i0();
            P p3 = this.f8870y0;
            if (p3 != null) {
                p3.D0((e) null);
            }
            this.f8870y0 = null;
            this.f13588H1 = false;
            this.f13610d2 = -9223372036854775807L;
            C1242g gVar = this.f13591K1;
            if (gVar != null) {
                gVar.release();
                this.f13591K1 = null;
            }
        } catch (Throwable th) {
            this.f13588H1 = false;
            this.f13610d2 = -9223372036854775807L;
            C1242g gVar2 = this.f13591K1;
            if (gVar2 != null) {
                gVar2.release();
                this.f13591K1 = null;
            }
            throw th;
        }
    }

    public final void r() {
        this.f13597Q1 = 0;
        this.f4804a0.getClass();
        this.f13596P1 = SystemClock.elapsedRealtime();
        this.f13600T1 = 0;
        this.f13601U1 = 0;
        C1244i iVar = this.f13587G1;
        if (iVar != null) {
            ((r) iVar.f13639n.f13646f.f10050V).e();
        } else {
            this.f13582B1.e();
        }
    }

    public final int r0(c1.i iVar, r rVar) {
        boolean z;
        boolean z6;
        int i;
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        if (!I.n(rVar.f3036n)) {
            return g.e(0, 0, 0, 0);
        }
        if (rVar.f3040r != null) {
            z = true;
        } else {
            z = false;
        }
        Context context = this.w1;
        List x02 = x0(context, iVar, rVar, z, false);
        if (z && x02.isEmpty()) {
            x02 = x0(context, iVar, rVar, false, false);
        }
        if (x02.isEmpty()) {
            return g.e(1, 0, 0, 0);
        }
        int i12 = rVar.f3023L;
        if (i12 != 0 && i12 != 2) {
            return g.e(2, 0, 0, 0);
        }
        n nVar = (n) x02.get(0);
        boolean d8 = nVar.d(rVar);
        if (!d8) {
            int i13 = 1;
            while (true) {
                if (i13 >= x02.size()) {
                    break;
                }
                n nVar2 = (n) x02.get(i13);
                if (nVar2.d(rVar)) {
                    nVar = nVar2;
                    z6 = false;
                    d8 = true;
                    break;
                }
                i13++;
            }
        }
        z6 = true;
        if (d8) {
            i = 4;
        } else {
            i = 3;
        }
        if (nVar.e(rVar)) {
            i8 = 16;
        } else {
            i8 = 8;
        }
        if (nVar.f8802g) {
            i9 = 64;
        } else {
            i9 = 0;
        }
        if (z6) {
            i10 = 128;
        } else {
            i10 = 0;
        }
        if (z.f3748a >= 26 && "video/dolby-vision".equals(rVar.f3036n) && !F.h.k(context)) {
            i10 = 256;
        }
        if (d8) {
            List x03 = x0(context, iVar, rVar, z, true);
            if (!x03.isEmpty()) {
                HashMap hashMap = v.f8875a;
                ArrayList arrayList = new ArrayList(x03);
                Collections.sort(arrayList, new a(1, new c(1, rVar)));
                n nVar3 = (n) arrayList.get(0);
                if (nVar3.d(rVar) && nVar3.e(rVar)) {
                    i11 = 32;
                }
            }
        }
        return i | i8 | i11 | i9 | i10;
    }

    public final void s() {
        A0();
        int i = this.f13601U1;
        if (i != 0) {
            long j7 = this.f13600T1;
            i iVar = this.f13614y1;
            Handler handler = iVar.f5527b;
            if (handler != null) {
                handler.post(new w(iVar, j7, i));
            }
            this.f13600T1 = 0;
            this.f13601U1 = 0;
        }
        C1244i iVar2 = this.f13587G1;
        if (iVar2 != null) {
            ((r) iVar2.f13639n.f13646f.f10050V).f();
        } else {
            this.f13582B1.f();
        }
    }

    public final void t(r[] rVarArr, long j7, long j8, C1031B b8) {
        super.t(rVarArr, j7, j8, b8);
        if (this.f13610d2 == -9223372036854775807L) {
            this.f13610d2 = j7;
        }
        X x8 = this.f4813j0;
        if (x8.p()) {
            this.f13611e2 = -9223372036854775807L;
            return;
        }
        b8.getClass();
        this.f13611e2 = x8.g(b8.f12277a, new V()).f2865d;
    }

    public final void v(long j7, long j8) {
        super.v(j7, j8);
        C1244i iVar = this.f13587G1;
        if (iVar != null) {
            try {
                iVar.f(j7, j8);
            } catch (z e) {
                throw f(e, e.f13712U, false, 7001);
            }
        }
    }

    public final void y(float f8, float f9) {
        super.y(f8, f9);
        C1244i iVar = this.f13587G1;
        if (iVar != null) {
            iVar.i(f8);
        } else {
            this.f13582B1.h(f8);
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, n1.f, java.lang.Object] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054  */
    public final android.view.Surface z0(c1.n r6) {
        /*
            r5 = this;
            n1.i r0 = r5.f13587G1
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x00a9
            android.view.Surface r0 = r5.f13590J1
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            int r0 = P0.z.f3748a
            r3 = 35
            if (r0 < r3) goto L_0x0016
            boolean r0 = r6.f8803h
            if (r0 == 0) goto L_0x0016
            return r2
        L_0x0016:
            boolean r0 = r5.D0(r6)
            P0.l.j(r0)
            n1.g r0 = r5.f13591K1
            if (r0 == 0) goto L_0x002e
            boolean r3 = r0.f13623U
            boolean r4 = r6.f8801f
            if (r3 == r4) goto L_0x002e
            if (r0 == 0) goto L_0x002e
            r0.release()
            r5.f13591K1 = r2
        L_0x002e:
            n1.g r0 = r5.f13591K1
            if (r0 != 0) goto L_0x00a6
            android.content.Context r0 = r5.w1
            boolean r6 = r6.f8801f
            r2 = 1
            if (r6 == 0) goto L_0x0042
            boolean r0 = n1.C1242g.k(r0)
            if (r0 == 0) goto L_0x0040
            goto L_0x0044
        L_0x0040:
            r0 = 0
            goto L_0x0045
        L_0x0042:
            int r0 = n1.C1242g.f13621X
        L_0x0044:
            r0 = 1
        L_0x0045:
            P0.l.j(r0)
            n1.f r0 = new n1.f
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r3)
            if (r6 == 0) goto L_0x0054
            int r6 = n1.C1242g.f13621X
            goto L_0x0055
        L_0x0054:
            r6 = 0
        L_0x0055:
            r0.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r3.<init>(r4, r0)
            r0.f13617V = r3
            P0.d r4 = new P0.d
            r4.<init>(r3)
            r0.f13616U = r4
            monitor-enter(r0)
            android.os.Handler r3 = r0.f13617V     // Catch:{ all -> 0x0084 }
            android.os.Message r6 = r3.obtainMessage(r2, r6, r1)     // Catch:{ all -> 0x0084 }
            r6.sendToTarget()     // Catch:{ all -> 0x0084 }
        L_0x0074:
            n1.g r6 = r0.f13620Y     // Catch:{ all -> 0x0084 }
            if (r6 != 0) goto L_0x0088
            java.lang.RuntimeException r6 = r0.f13619X     // Catch:{ all -> 0x0084 }
            if (r6 != 0) goto L_0x0088
            java.lang.Error r6 = r0.f13618W     // Catch:{ all -> 0x0084 }
            if (r6 != 0) goto L_0x0088
            r0.wait()     // Catch:{ InterruptedException -> 0x0086 }
            goto L_0x0074
        L_0x0084:
            r6 = move-exception
            goto L_0x00a4
        L_0x0086:
            r1 = 1
            goto L_0x0074
        L_0x0088:
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x0092
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L_0x0092:
            java.lang.RuntimeException r6 = r0.f13619X
            if (r6 != 0) goto L_0x00a3
            java.lang.Error r6 = r0.f13618W
            if (r6 != 0) goto L_0x00a2
            n1.g r6 = r0.f13620Y
            r6.getClass()
            r5.f13591K1 = r6
            goto L_0x00a6
        L_0x00a2:
            throw r6
        L_0x00a3:
            throw r6
        L_0x00a4:
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            throw r6
        L_0x00a6:
            n1.g r6 = r5.f13591K1
            return r6
        L_0x00a9:
            P0.l.j(r1)
            P0.l.k(r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C1240e.z0(c1.n):android.view.Surface");
    }
}
