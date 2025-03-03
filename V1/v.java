package V1;

import N1.f;
import P0.r;
import p1.G;
import p1.q;

public final class v implements i {

    /* renamed from: a  reason: collision with root package name */
    public final r f5928a = new r(2, new byte[15]);

    /* renamed from: b  reason: collision with root package name */
    public final f f5929b = new f();

    /* renamed from: c  reason: collision with root package name */
    public final r f5930c = new r();

    /* renamed from: d  reason: collision with root package name */
    public int f5931d = 0;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public G f5932f;

    /* renamed from: g  reason: collision with root package name */
    public double f5933g = -9.223372036854776E18d;

    /* renamed from: h  reason: collision with root package name */
    public double f5934h = -9.223372036854776E18d;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5935j = true;

    /* renamed from: k  reason: collision with root package name */
    public int f5936k;

    /* renamed from: l  reason: collision with root package name */
    public int f5937l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5938m = true;

    /* renamed from: n  reason: collision with root package name */
    public int f5939n;

    /* renamed from: o  reason: collision with root package name */
    public int f5940o;

    /* renamed from: p  reason: collision with root package name */
    public final w f5941p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public int f5942q = -2147483647;

    /* renamed from: r  reason: collision with root package name */
    public int f5943r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f5944s;

    /* renamed from: t  reason: collision with root package name */
    public long f5945t = -1;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5946u;

    public final void a() {
        this.f5931d = 0;
        this.f5937l = 0;
        this.f5928a.E(2);
        this.f5939n = 0;
        this.f5940o = 0;
        this.f5942q = -2147483647;
        this.f5943r = -1;
        this.f5944s = 0;
        this.f5945t = -1;
        this.f5946u = false;
        this.i = false;
        this.f5938m = true;
        this.f5935j = true;
        this.f5933g = -9.223372036854776E18d;
        this.f5934h = -9.223372036854776E18d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:207:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x047c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(P0.r r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = 4
            r3 = 2
            r5 = 8
            r6 = 1
            p1.G r7 = r0.f5932f
            P0.l.k(r7)
        L_0x000e:
            int r7 = r24.a()
            if (r7 <= 0) goto L_0x04f0
            int r7 = r0.f5931d
            r8 = 3
            if (r7 == 0) goto L_0x04a6
            V1.w r9 = r0.f5941p
            r12 = 24
            r13 = 17
            P0.r r14 = r0.f5930c
            if (r7 == r6) goto L_0x037d
            if (r7 != r3) goto L_0x0377
            int r7 = r9.f5947a
            if (r7 == r6) goto L_0x002b
            if (r7 != r13) goto L_0x0046
        L_0x002b:
            int r7 = r1.f3733b
            int r15 = r24.a()
            int r11 = r14.a()
            int r11 = java.lang.Math.min(r15, r11)
            byte[] r15 = r14.f3732a
            int r13 = r14.f3733b
            r1.g(r15, r13, r11)
            r14.I(r11)
            r1.H(r7)
        L_0x0046:
            int r7 = r24.a()
            int r11 = r9.f5949c
            int r13 = r0.f5939n
            int r11 = r11 - r13
            int r7 = java.lang.Math.min(r7, r11)
            p1.G r11 = r0.f5932f
            r11.a(r7, r1)
            int r11 = r0.f5939n
            int r11 = r11 + r7
            r0.f5939n = r11
            int r7 = r9.f5949c
            if (r11 != r7) goto L_0x000e
            int r7 = r9.f5947a
            if (r7 != r6) goto L_0x0306
            N1.f r7 = new N1.f
            byte[] r13 = r14.f3732a
            int r14 = r13.length
            r7.<init>((int) r14, (byte[]) r13)
            int r13 = r7.i(r5)
            r14 = 5
            int r15 = r7.i(r14)
            r10 = 31
            if (r15 != r10) goto L_0x0080
            int r10 = r7.i(r12)
            goto L_0x00ef
        L_0x0080:
            switch(r15) {
                case 0: goto L_0x00ec;
                case 1: goto L_0x00e8;
                case 2: goto L_0x00e4;
                case 3: goto L_0x00e0;
                case 4: goto L_0x00dc;
                case 5: goto L_0x00d9;
                case 6: goto L_0x00d6;
                case 7: goto L_0x00d3;
                case 8: goto L_0x00d0;
                case 9: goto L_0x00cd;
                case 10: goto L_0x00ca;
                case 11: goto L_0x00c7;
                case 12: goto L_0x00c4;
                case 13: goto L_0x0083;
                case 14: goto L_0x0083;
                case 15: goto L_0x00c0;
                case 16: goto L_0x00bc;
                case 17: goto L_0x00b8;
                case 18: goto L_0x00b4;
                case 19: goto L_0x00b0;
                case 20: goto L_0x00ad;
                case 21: goto L_0x00aa;
                case 22: goto L_0x00a7;
                case 23: goto L_0x00a4;
                case 24: goto L_0x00a1;
                case 25: goto L_0x009e;
                case 26: goto L_0x009a;
                case 27: goto L_0x0096;
                default: goto L_0x0083;
            }
        L_0x0083:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported sampling rate index "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            M0.J r1 = M0.J.c(r1)
            throw r1
        L_0x0096:
            r10 = 9600(0x2580, float:1.3452E-41)
            goto L_0x00ef
        L_0x009a:
            r10 = 12800(0x3200, float:1.7937E-41)
            goto L_0x00ef
        L_0x009e:
            r10 = 14400(0x3840, float:2.0179E-41)
            goto L_0x00ef
        L_0x00a1:
            r10 = 17075(0x42b3, float:2.3927E-41)
            goto L_0x00ef
        L_0x00a4:
            r10 = 19200(0x4b00, float:2.6905E-41)
            goto L_0x00ef
        L_0x00a7:
            r10 = 20000(0x4e20, float:2.8026E-41)
            goto L_0x00ef
        L_0x00aa:
            r10 = 25600(0x6400, float:3.5873E-41)
            goto L_0x00ef
        L_0x00ad:
            r10 = 28800(0x7080, float:4.0357E-41)
            goto L_0x00ef
        L_0x00b0:
            r10 = 34150(0x8566, float:4.7854E-41)
            goto L_0x00ef
        L_0x00b4:
            r10 = 38400(0x9600, float:5.381E-41)
            goto L_0x00ef
        L_0x00b8:
            r10 = 40000(0x9c40, float:5.6052E-41)
            goto L_0x00ef
        L_0x00bc:
            r10 = 51200(0xc800, float:7.1746E-41)
            goto L_0x00ef
        L_0x00c0:
            r10 = 57600(0xe100, float:8.0715E-41)
            goto L_0x00ef
        L_0x00c4:
            r10 = 7350(0x1cb6, float:1.03E-41)
            goto L_0x00ef
        L_0x00c7:
            r10 = 8000(0x1f40, float:1.121E-41)
            goto L_0x00ef
        L_0x00ca:
            r10 = 11025(0x2b11, float:1.545E-41)
            goto L_0x00ef
        L_0x00cd:
            r10 = 12000(0x2ee0, float:1.6816E-41)
            goto L_0x00ef
        L_0x00d0:
            r10 = 16000(0x3e80, float:2.2421E-41)
            goto L_0x00ef
        L_0x00d3:
            r10 = 22050(0x5622, float:3.0899E-41)
            goto L_0x00ef
        L_0x00d6:
            r10 = 24000(0x5dc0, float:3.3631E-41)
            goto L_0x00ef
        L_0x00d9:
            r10 = 32000(0x7d00, float:4.4842E-41)
            goto L_0x00ef
        L_0x00dc:
            r10 = 44100(0xac44, float:6.1797E-41)
            goto L_0x00ef
        L_0x00e0:
            r10 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x00ef
        L_0x00e4:
            r10 = 64000(0xfa00, float:8.9683E-41)
            goto L_0x00ef
        L_0x00e8:
            r10 = 88200(0x15888, float:1.23595E-40)
            goto L_0x00ef
        L_0x00ec:
            r10 = 96000(0x17700, float:1.34525E-40)
        L_0x00ef:
            int r12 = r7.i(r8)
            java.lang.String r15 = "Unsupported coreSbrFrameLengthIndex "
            if (r12 == 0) goto L_0x011f
            if (r12 == r6) goto L_0x011a
            if (r12 == r3) goto L_0x0115
            if (r12 == r8) goto L_0x0115
            if (r12 != r2) goto L_0x0104
            r16 = 4096(0x1000, float:5.74E-42)
            r17 = 4096(0x1000, float:5.74E-42)
            goto L_0x0123
        L_0x0104:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r15)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            M0.J r1 = M0.J.c(r1)
            throw r1
        L_0x0115:
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0123
        L_0x011a:
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 1024(0x400, float:1.435E-42)
            goto L_0x0123
        L_0x011f:
            r16 = 768(0x300, float:1.076E-42)
            r17 = 768(0x300, float:1.076E-42)
        L_0x0123:
            if (r12 == 0) goto L_0x0144
            if (r12 == r6) goto L_0x0144
            if (r12 == r3) goto L_0x0142
            if (r12 == r8) goto L_0x0140
            if (r12 != r2) goto L_0x012f
            r12 = 1
            goto L_0x0145
        L_0x012f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r15)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            M0.J r1 = M0.J.c(r1)
            throw r1
        L_0x0140:
            r12 = 3
            goto L_0x0145
        L_0x0142:
            r12 = 2
            goto L_0x0145
        L_0x0144:
            r12 = 0
        L_0x0145:
            r7.u(r3)
            G5.s.A(r7)
            int r15 = r7.i(r14)
            r11 = 0
            r18 = 0
        L_0x0152:
            int r4 = r15 + 1
            r2 = 16
            if (r11 >= r4) goto L_0x0173
            int r4 = r7.i(r8)
            int r2 = G5.s.y(r7, r14, r5, r2)
            int r2 = r2 + r6
            int r18 = r2 + r18
            if (r4 == 0) goto L_0x0167
            if (r4 != r3) goto L_0x0170
        L_0x0167:
            boolean r2 = r7.h()
            if (r2 == 0) goto L_0x0170
            G5.s.A(r7)
        L_0x0170:
            int r11 = r11 + r6
            r2 = 4
            goto L_0x0152
        L_0x0173:
            r4 = 4
            int r11 = G5.s.y(r7, r4, r5, r2)
            int r11 = r11 + r6
            r7.t()
            r4 = 0
        L_0x017d:
            r19 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r4 >= r11) goto L_0x023e
            int r15 = r7.i(r3)
            if (r15 == 0) goto L_0x0221
            if (r15 == r6) goto L_0x01ab
            if (r15 == r8) goto L_0x018e
        L_0x018b:
            r2 = 1
            goto L_0x0236
        L_0x018e:
            r15 = 4
            G5.s.y(r7, r15, r5, r2)
            int r19 = G5.s.y(r7, r15, r5, r2)
            boolean r15 = r7.h()
            if (r15 == 0) goto L_0x01a0
            r15 = 0
            G5.s.y(r7, r5, r2, r15)
        L_0x01a0:
            r7.t()
            if (r19 <= 0) goto L_0x018b
            int r15 = r19 * 8
            r7.u(r15)
            goto L_0x018b
        L_0x01ab:
            r7.u(r8)
            boolean r15 = r7.h()
            if (r15 == 0) goto L_0x01b9
            r2 = 13
            r7.u(r2)
        L_0x01b9:
            if (r15 == 0) goto L_0x01be
            r7.t()
        L_0x01be:
            if (r12 <= 0) goto L_0x01c8
            G5.s.z(r7)
            int r2 = r7.i(r3)
            goto L_0x01c9
        L_0x01c8:
            r2 = 0
        L_0x01c9:
            if (r2 <= 0) goto L_0x01ec
            r15 = 6
            r7.u(r15)
            int r5 = r7.i(r3)
            r6 = 4
            r7.u(r6)
            boolean r6 = r7.h()
            if (r6 == 0) goto L_0x01e0
            r7.u(r14)
        L_0x01e0:
            if (r2 == r3) goto L_0x01e4
            if (r2 != r8) goto L_0x01e7
        L_0x01e4:
            r7.u(r15)
        L_0x01e7:
            if (r5 != r3) goto L_0x01ec
            r7.t()
        L_0x01ec:
            r2 = 1
            int r5 = r18 + -1
            double r5 = (double) r5
            double r5 = java.lang.Math.log(r5)
            double r19 = java.lang.Math.log(r19)
            double r5 = r5 / r19
            double r5 = java.lang.Math.floor(r5)
            int r5 = (int) r5
            int r5 = r5 + r2
            int r2 = r7.i(r3)
            if (r2 <= 0) goto L_0x020f
            boolean r6 = r7.h()
            if (r6 == 0) goto L_0x020f
            r7.u(r5)
        L_0x020f:
            boolean r6 = r7.h()
            if (r6 == 0) goto L_0x0218
            r7.u(r5)
        L_0x0218:
            if (r12 != 0) goto L_0x018b
            if (r2 != 0) goto L_0x018b
            r7.t()
            goto L_0x018b
        L_0x0221:
            r7.u(r8)
            boolean r2 = r7.h()
            if (r2 == 0) goto L_0x022f
            r2 = 13
            r7.u(r2)
        L_0x022f:
            if (r12 <= 0) goto L_0x018b
            G5.s.z(r7)
            goto L_0x018b
        L_0x0236:
            int r4 = r4 + r2
            r2 = 16
            r5 = 8
            r6 = 1
            goto L_0x017d
        L_0x023e:
            r2 = 1
            boolean r4 = r7.h()
            if (r4 == 0) goto L_0x0280
            r4 = 8
            r5 = 4
            int r6 = G5.s.y(r7, r3, r5, r4)
            int r6 = r6 + r2
            r8 = 0
            r11 = 0
        L_0x024f:
            if (r8 >= r6) goto L_0x0281
            r12 = 16
            int r14 = G5.s.y(r7, r5, r4, r12)
            int r15 = G5.s.y(r7, r5, r4, r12)
            r12 = 7
            if (r14 != r12) goto L_0x0276
            int r11 = r7.i(r5)
            int r11 = r11 + r2
            r7.u(r5)
            byte[] r5 = new byte[r11]
            r12 = 0
        L_0x0269:
            if (r12 >= r11) goto L_0x0274
            int r14 = r7.i(r4)
            byte r14 = (byte) r14
            r5[r12] = r14
            int r12 = r12 + r2
            goto L_0x0269
        L_0x0274:
            r11 = r5
            goto L_0x027b
        L_0x0276:
            int r15 = r15 * 8
            r7.u(r15)
        L_0x027b:
            int r8 = r8 + r2
            r4 = 8
            r5 = 4
            goto L_0x024f
        L_0x0280:
            r11 = 0
        L_0x0281:
            switch(r10) {
                case 14700: goto L_0x029d;
                case 16000: goto L_0x029d;
                case 22050: goto L_0x029f;
                case 24000: goto L_0x029f;
                case 29400: goto L_0x029a;
                case 32000: goto L_0x029a;
                case 44100: goto L_0x0297;
                case 48000: goto L_0x0297;
                case 58800: goto L_0x029a;
                case 64000: goto L_0x029a;
                case 88200: goto L_0x0297;
                case 96000: goto L_0x0297;
                default: goto L_0x0284;
            }
        L_0x0284:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported sampling rate "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            M0.J r1 = M0.J.c(r1)
            throw r1
        L_0x0297:
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x029f
        L_0x029a:
            r19 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            goto L_0x029f
        L_0x029d:
            r19 = 4613937818241073152(0x4008000000000000, double:3.0)
        L_0x029f:
            double r4 = (double) r10
            double r4 = r4 * r19
            int r2 = (int) r4
            r4 = r17
            double r4 = (double) r4
            double r4 = r4 * r19
            int r4 = (int) r4
            r0.f5942q = r2
            r0.f5943r = r4
            long r4 = r0.f5945t
            long r6 = r9.f5948b
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0300
            r0.f5945t = r6
            java.lang.String r2 = "mhm1"
            r4 = -1
            if (r13 == r4) goto L_0x02d0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r4
            java.lang.String r4 = ".%02X"
            java.lang.String r4 = java.lang.String.format(r4, r6)
            java.lang.String r2 = r2.concat(r4)
        L_0x02d0:
            if (r11 == 0) goto L_0x02dc
            int r4 = r11.length
            if (r4 <= 0) goto L_0x02dc
            byte[] r4 = P0.z.f3752f
            H3.i0 r11 = H3.O.s(r4, r11)
            goto L_0x02dd
        L_0x02dc:
            r11 = 0
        L_0x02dd:
            M0.q r4 = new M0.q
            r4.<init>()
            java.lang.String r5 = r0.e
            r4.f2989a = r5
            java.lang.String r5 = "audio/mhm1"
            java.lang.String r5 = M0.I.o(r5)
            r4.f2999m = r5
            int r5 = r0.f5942q
            r4.f2980C = r5
            r4.f2996j = r2
            r4.f3002p = r11
            M0.r r2 = new M0.r
            r2.<init>(r4)
            p1.G r4 = r0.f5932f
            r4.c(r2)
        L_0x0300:
            r2 = 1
            r0.f5946u = r2
        L_0x0303:
            r2 = 1
            goto L_0x036f
        L_0x0306:
            r2 = 17
            if (r7 != r2) goto L_0x0326
            N1.f r2 = new N1.f
            byte[] r4 = r14.f3732a
            int r5 = r4.length
            r2.<init>((int) r5, (byte[]) r4)
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x0322
            r2.u(r3)
            r4 = 13
            int r2 = r2.i(r4)
            goto L_0x0323
        L_0x0322:
            r2 = 0
        L_0x0323:
            r0.f5944s = r2
            goto L_0x0303
        L_0x0326:
            if (r7 != r3) goto L_0x0303
            boolean r2 = r0.f5946u
            if (r2 == 0) goto L_0x0331
            r2 = 0
            r0.f5935j = r2
            r7 = 1
            goto L_0x0332
        L_0x0331:
            r7 = 0
        L_0x0332:
            int r2 = r0.f5943r
            int r4 = r0.f5944s
            int r2 = r2 - r4
            double r4 = (double) r2
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 * r8
            int r2 = r0.f5942q
            double r8 = (double) r2
            double r4 = r4 / r8
            double r8 = r0.f5933g
            long r8 = java.lang.Math.round(r8)
            boolean r2 = r0.i
            if (r2 == 0) goto L_0x0355
            r2 = 0
            r0.i = r2
            double r4 = r0.f5934h
            r0.f5933g = r4
            goto L_0x035a
        L_0x0355:
            double r10 = r0.f5933g
            double r10 = r10 + r4
            r0.f5933g = r10
        L_0x035a:
            p1.G r4 = r0.f5932f
            int r2 = r0.f5940o
            r10 = 0
            r11 = 0
            r5 = r8
            r8 = r2
            r9 = r10
            r10 = r11
            r4.e(r5, r7, r8, r9, r10)
            r2 = 0
            r0.f5946u = r2
            r0.f5944s = r2
            r0.f5940o = r2
            goto L_0x0303
        L_0x036f:
            r0.f5931d = r2
        L_0x0371:
            r2 = 4
            r5 = 8
        L_0x0374:
            r6 = 1
            goto L_0x000e
        L_0x0377:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x037d:
            int r2 = r24.a()
            P0.r r4 = r0.f5928a
            int r5 = r4.a()
            int r2 = java.lang.Math.min(r2, r5)
            byte[] r5 = r4.f3732a
            int r6 = r4.f3733b
            r1.g(r5, r6, r2)
            r4.I(r2)
            int r2 = r4.a()
            if (r2 != 0) goto L_0x04a1
            int r2 = r4.f3734c
            byte[] r5 = r4.f3732a
            N1.f r6 = r0.f5929b
            r6.p(r2, r5)
            r6.f()
            r5 = 8
            int r7 = G5.s.y(r6, r8, r5, r5)
            r9.f5947a = r7
            r8 = -1
            if (r7 != r8) goto L_0x03b5
        L_0x03b2:
            r5 = 0
            goto L_0x0454
        L_0x03b5:
            int r7 = java.lang.Math.max(r3, r5)
            r5 = 32
            int r7 = java.lang.Math.max(r7, r5)
            r8 = 63
            if (r7 > r8) goto L_0x03c5
            r7 = 1
            goto L_0x03c6
        L_0x03c5:
            r7 = 0
        L_0x03c6:
            P0.l.d(r7)
            r7 = 3
            r10 = 255(0xff, double:1.26E-321)
            long r12 = B.C0003d.f(r7, r10)
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            B.C0003d.f(r12, r10)
            int r10 = r6.b()
            r11 = -1
            if (r10 >= r3) goto L_0x03e3
        L_0x03e1:
            r7 = r11
            goto L_0x040f
        L_0x03e3:
            long r19 = r6.k(r3)
            int r10 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x040d
            int r7 = r6.b()
            r8 = 8
            if (r7 >= r8) goto L_0x03f4
            goto L_0x03e1
        L_0x03f4:
            long r21 = r6.k(r8)
            long r19 = r19 + r21
            r7 = 255(0xff, double:1.26E-321)
            int r10 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x040d
            int r7 = r6.b()
            if (r7 >= r5) goto L_0x0407
            goto L_0x03e1
        L_0x0407:
            long r7 = r6.k(r5)
            long r19 = r7 + r19
        L_0x040d:
            r7 = r19
        L_0x040f:
            r9.f5948b = r7
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0416
            goto L_0x03b2
        L_0x0416:
            r10 = 16
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x048c
            r10 = 0
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0446
            int r5 = r9.f5947a
            r7 = 1
            if (r5 == r7) goto L_0x043e
            if (r5 == r3) goto L_0x0436
            r7 = 17
            if (r5 == r7) goto L_0x042e
            goto L_0x0446
        L_0x042e:
            java.lang.String r1 = "AudioTruncation packet with invalid packet label 0"
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x0436:
            r2 = 0
            java.lang.String r1 = "Mpegh3daFrame packet with invalid packet label 0"
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x043e:
            r2 = 0
            java.lang.String r1 = "Mpegh3daConfig packet with invalid packet label 0"
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x0446:
            r5 = 11
            r7 = 24
            int r5 = G5.s.y(r6, r5, r7, r7)
            r9.f5949c = r5
            r6 = -1
            if (r5 == r6) goto L_0x03b2
            r5 = 1
        L_0x0454:
            r6 = 0
            if (r5 == 0) goto L_0x0461
            r0.f5939n = r6
            int r7 = r0.f5940o
            int r8 = r9.f5949c
            int r8 = r8 + r2
            int r8 = r8 + r7
            r0.f5940o = r8
        L_0x0461:
            if (r5 == 0) goto L_0x047c
            r4.H(r6)
            p1.G r2 = r0.f5932f
            int r5 = r4.f3734c
            r2.a(r5, r4)
            r4.E(r3)
            int r2 = r9.f5949c
            r14.E(r2)
            r2 = 1
            r0.f5938m = r2
            r0.f5931d = r3
            goto L_0x0371
        L_0x047c:
            r2 = 1
            int r5 = r4.f3734c
            r6 = 15
            if (r5 >= r6) goto L_0x0371
            int r5 = r5 + r2
            r4.G(r5)
            r2 = 0
            r0.f5938m = r2
            goto L_0x0371
        L_0x048c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Contains sub-stream with an invalid packet label "
            r1.<init>(r2)
            long r2 = r9.f5948b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            M0.J r1 = M0.J.c(r1)
            throw r1
        L_0x04a1:
            r2 = 0
            r0.f5938m = r2
            goto L_0x0371
        L_0x04a6:
            int r2 = r0.f5936k
            r4 = r2 & 2
            if (r4 != 0) goto L_0x04b6
            int r2 = r1.f3734c
            r1.H(r2)
            r2 = 0
            r4 = 4
        L_0x04b3:
            r5 = 8
            goto L_0x04e4
        L_0x04b6:
            r4 = 4
            r2 = r2 & r4
            if (r2 != 0) goto L_0x04e7
        L_0x04ba:
            int r2 = r24.a()
            if (r2 <= 0) goto L_0x04e2
            int r2 = r0.f5937l
            r5 = 8
            int r2 = r2 << r5
            r0.f5937l = r2
            int r6 = r24.v()
            r2 = r2 | r6
            r0.f5937l = r2
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r6
            r6 = 12583333(0xc001a5, float:1.7633005E-38)
            if (r2 != r6) goto L_0x04ba
            int r2 = r1.f3733b
            int r2 = r2 - r8
            r1.H(r2)
            r2 = 0
            r0.f5937l = r2
        L_0x04e0:
            r6 = 1
            goto L_0x04eb
        L_0x04e2:
            r2 = 0
            goto L_0x04b3
        L_0x04e4:
            r2 = 4
            goto L_0x0374
        L_0x04e7:
            r2 = 0
            r5 = 8
            goto L_0x04e0
        L_0x04eb:
            r0.f5931d = r6
            r2 = 4
            goto L_0x000e
        L_0x04f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.v.e(P0.r):void");
    }

    public final void f(boolean z) {
    }

    public final void g(int i8, long j7) {
        this.f5936k = i8;
        if (!this.f5935j && (this.f5940o != 0 || !this.f5938m)) {
            this.i = true;
        }
        if (j7 == -9223372036854775807L) {
            return;
        }
        if (this.i) {
            this.f5934h = (double) j7;
        } else {
            this.f5933g = (double) j7;
        }
    }

    public final void h(q qVar, G g8) {
        g8.c();
        g8.d();
        this.e = (String) g8.e;
        g8.d();
        this.f5932f = qVar.q(g8.f5716c, 1);
    }
}
