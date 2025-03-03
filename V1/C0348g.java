package V1;

import M0.C0129q;
import M0.I;
import P0.r;
import java.util.concurrent.atomic.AtomicInteger;
import p1.C1331a;
import p1.G;
import p1.q;

/* renamed from: V1.g  reason: case insensitive filesystem */
public final class C0348g implements i {

    /* renamed from: a  reason: collision with root package name */
    public final r f5769a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f5770b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    public final String f5771c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5772d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public G f5773f;

    /* renamed from: g  reason: collision with root package name */
    public int f5774g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f5775h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public long f5776j;

    /* renamed from: k  reason: collision with root package name */
    public M0.r f5777k;

    /* renamed from: l  reason: collision with root package name */
    public int f5778l;

    /* renamed from: m  reason: collision with root package name */
    public int f5779m;

    /* renamed from: n  reason: collision with root package name */
    public int f5780n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f5781o = -1;

    /* renamed from: p  reason: collision with root package name */
    public long f5782p = -9223372036854775807L;

    public C0348g(String str, int i8, int i9) {
        this.f5769a = new r(new byte[i9]);
        this.f5771c = str;
        this.f5772d = i8;
    }

    public final void a() {
        this.f5774g = 0;
        this.f5775h = 0;
        this.i = 0;
        this.f5782p = -9223372036854775807L;
        this.f5770b.set(0);
    }

    public final boolean b(r rVar, byte[] bArr, int i8) {
        int min = Math.min(rVar.a(), i8 - this.f5775h);
        rVar.g(bArr, this.f5775h, min);
        int i9 = this.f5775h + min;
        this.f5775h = i9;
        if (i9 == i8) {
            return true;
        }
        return false;
    }

    public final void c(C1331a aVar) {
        int i8;
        C0129q qVar;
        int i9 = aVar.f14338b;
        if (i9 != -2147483647 && (i8 = aVar.f14339c) != -1) {
            M0.r rVar = this.f5777k;
            String str = aVar.f14337a;
            if (rVar == null || i8 != rVar.f3014C || i9 != rVar.f3015D || !str.equals(rVar.f3036n)) {
                M0.r rVar2 = this.f5777k;
                if (rVar2 == null) {
                    qVar = new C0129q();
                } else {
                    qVar = rVar2.a();
                }
                qVar.f2989a = this.e;
                qVar.f2999m = I.o(str);
                qVar.f2979B = i8;
                qVar.f2980C = i9;
                qVar.f2992d = this.f5771c;
                qVar.f2993f = this.f5772d;
                M0.r rVar3 = new M0.r(qVar);
                this.f5777k = rVar3;
                this.f5773f.c(rVar3);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(P0.r r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r3 = 4
            r4 = -1
            r5 = 8
            r7 = 12
            r8 = 1
            p1.G r9 = r0.f5773f
            P0.l.k(r9)
        L_0x0010:
            int r9 = r38.a()
            if (r9 <= 0) goto L_0x0571
            int r9 = r0.f5774g
            r16 = 32000(0x7d00, float:4.4842E-41)
            r17 = 44100(0xac44, float:6.1797E-41)
            r18 = 48000(0xbb80, float:6.7262E-41)
            r13 = 1078008818(0x40411bf2, float:3.0173306)
            r10 = 32
            r23 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            P0.r r11 = r0.f5769a
            switch(r9) {
                case 0: goto L_0x04db;
                case 1: goto L_0x038f;
                case 2: goto L_0x0363;
                case 3: goto L_0x0215;
                case 4: goto L_0x01e6;
                case 5: goto L_0x0081;
                case 6: goto L_0x0036;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0036:
            int r2 = r38.a()
            int r6 = r0.f5778l
            int r9 = r0.f5775h
            int r6 = r6 - r9
            int r2 = java.lang.Math.min(r2, r6)
            p1.G r6 = r0.f5773f
            r6.a(r2, r1)
            int r6 = r0.f5775h
            int r6 = r6 + r2
            r0.f5775h = r6
            int r2 = r0.f5778l
            if (r6 != r2) goto L_0x0010
            long r9 = r0.f5782p
            int r2 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r2 == 0) goto L_0x0059
            r2 = 1
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            P0.l.j(r2)
            p1.G r15 = r0.f5773f
            long r9 = r0.f5782p
            int r2 = r0.f5779m
            if (r2 != r3) goto L_0x0068
            r18 = 0
            goto L_0x006a
        L_0x0068:
            r18 = 1
        L_0x006a:
            int r2 = r0.f5778l
            r20 = 0
            r21 = 0
            r16 = r9
            r19 = r2
            r15.e(r16, r18, r19, r20, r21)
            long r9 = r0.f5782p
            long r11 = r0.f5776j
            long r9 = r9 + r11
            r0.f5782p = r9
            r0.f5774g = r14
            goto L_0x0010
        L_0x0081:
            byte[] r9 = r11.f3732a
            int r14 = r0.f5781o
            boolean r9 = r0.b(r1, r9, r14)
            if (r9 == 0) goto L_0x0010
            byte[] r9 = r11.f3732a
            java.util.concurrent.atomic.AtomicInteger r14 = r0.f5770b
            N1.f r15 = p1.C1332b.j(r9)
            int r10 = r15.i(r10)
            if (r10 != r13) goto L_0x009b
            r10 = 1
            goto L_0x009c
        L_0x009b:
            r10 = 0
        L_0x009c:
            int[] r13 = p1.C1332b.f14351n
            int r13 = p1.C1332b.s(r15, r13)
            int r22 = r13 + 1
            if (r10 == 0) goto L_0x0181
            boolean r21 = r15.h()
            if (r21 == 0) goto L_0x017a
            int r12 = r13 + -1
            byte r21 = r9[r12]
            int r21 = r21 << 8
            r25 = 65535(0xffff, float:9.1834E-41)
            r21 = r21 & r25
            byte r13 = r9[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r13 = r21 | r13
            int r21 = P0.z.f3748a
            r4 = 0
            r5 = 65535(0xffff, float:9.1834E-41)
        L_0x00c3:
            if (r4 >= r12) goto L_0x00f0
            byte r6 = r9[r4]
            r2 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 >> r3
            int r8 = r5 >> 12
            r8 = r8 & 255(0xff, float:3.57E-43)
            r2 = r2 ^ r8
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r3
            r5 = r5 & r25
            int[] r8 = P0.z.f3760o
            r2 = r8[r2]
            r2 = r2 ^ r5
            r2 = r2 & r25
            r5 = r6 & 15
            int r6 = r2 >> 12
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r3
            r2 = r2 & r25
            r5 = r8[r5]
            r2 = r2 ^ r5
            r5 = r2 & r25
            r2 = 1
            int r4 = r4 + r2
            r8 = 1
            goto L_0x00c3
        L_0x00f0:
            r2 = 1
            if (r13 != r5) goto L_0x0172
            r4 = 2
            int r5 = r15.i(r4)
            if (r5 == 0) goto L_0x0119
            if (r5 == r2) goto L_0x0116
            if (r5 != r4) goto L_0x0102
            r12 = 384(0x180, float:5.38E-43)
        L_0x0100:
            r2 = 3
            goto L_0x011c
        L_0x0102:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported base duration index in DTS UHD header: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x0116:
            r12 = 480(0x1e0, float:6.73E-43)
            goto L_0x0100
        L_0x0119:
            r2 = 3
            r12 = 512(0x200, float:7.175E-43)
        L_0x011c:
            int r4 = r15.i(r2)
            r2 = 1
            int r4 = r4 + r2
            int r4 = r4 * r12
            r5 = 2
            int r6 = r15.i(r5)
            if (r6 == 0) goto L_0x014b
            if (r6 == r2) goto L_0x0147
            if (r6 != r5) goto L_0x0133
            r2 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x014d
        L_0x0133:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported clock rate index in DTS UHD header: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x0147:
            r2 = 44100(0xac44, float:6.1797E-41)
            goto L_0x014d
        L_0x014b:
            r2 = 32000(0x7d00, float:4.4842E-41)
        L_0x014d:
            boolean r5 = r15.h()
            if (r5 == 0) goto L_0x0158
            r5 = 36
            r15.u(r5)
        L_0x0158:
            r5 = 2
            int r5 = r15.i(r5)
            r6 = 1
            int r5 = r6 << r5
            int r5 = r5 * r2
            long r8 = (long) r4
            long r12 = (long) r2
            java.math.RoundingMode r32 = java.math.RoundingMode.DOWN
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r26 = r8
            r30 = r12
            long r8 = P0.z.W(r26, r28, r30, r32)
            goto L_0x0186
        L_0x0172:
            java.lang.String r1 = "CRC check failed"
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x017a:
            java.lang.String r1 = "Only supports full channel mask-based audio presentation"
            M0.J r1 = M0.J.c(r1)
            throw r1
        L_0x0181:
            r8 = r23
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        L_0x0186:
            r2 = 0
            r4 = 0
        L_0x0188:
            if (r2 >= r10) goto L_0x0194
            int[] r6 = p1.C1332b.f14352o
            int r6 = p1.C1332b.s(r15, r6)
            int r4 = r4 + r6
            r6 = 1
            int r2 = r2 + r6
            goto L_0x0188
        L_0x0194:
            if (r10 == 0) goto L_0x019f
            int[] r2 = p1.C1332b.f14353p
            int r2 = p1.C1332b.s(r15, r2)
            r14.set(r2)
        L_0x019f:
            int r2 = r14.get()
            if (r2 == 0) goto L_0x01ac
            int[] r2 = p1.C1332b.f14354q
            int r2 = p1.C1332b.s(r15, r2)
            goto L_0x01ad
        L_0x01ac:
            r2 = 0
        L_0x01ad:
            int r4 = r4 + r2
            int r4 = r4 + r22
            p1.a r2 = new p1.a
            java.lang.String r13 = "audio/vnd.dts.uhd;profile=p2"
            r14 = 2
            r12 = r2
            r15 = r5
            r16 = r4
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17)
            int r5 = r0.f5779m
            r6 = 3
            if (r5 != r6) goto L_0x01c6
            r0.c(r2)
        L_0x01c6:
            r0.f5778l = r4
            int r2 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x01cf
            r12 = 0
            goto L_0x01d0
        L_0x01cf:
            r12 = r8
        L_0x01d0:
            r0.f5776j = r12
            r2 = 0
            r11.H(r2)
            p1.G r2 = r0.f5773f
            int r4 = r0.f5781o
            r2.a(r4, r11)
            r2 = 6
            r0.f5774g = r2
        L_0x01e0:
            r4 = -1
            r5 = 8
            r8 = 1
            goto L_0x0010
        L_0x01e6:
            r2 = 6
            byte[] r4 = r11.f3732a
            boolean r2 = r0.b(r1, r4, r2)
            if (r2 == 0) goto L_0x01e0
            byte[] r2 = r11.f3732a
            N1.f r2 = p1.C1332b.j(r2)
            r2.u(r10)
            int[] r4 = p1.C1332b.f14355r
            int r2 = p1.C1332b.s(r2, r4)
            r4 = 1
            int r2 = r2 + r4
            r0.f5781o = r2
            int r4 = r0.f5775h
            if (r4 <= r2) goto L_0x0211
            int r2 = r4 - r2
            int r4 = r4 - r2
            r0.f5775h = r4
            int r4 = r1.f3733b
            int r4 = r4 - r2
            r1.H(r4)
        L_0x0211:
            r2 = 5
            r0.f5774g = r2
            goto L_0x01e0
        L_0x0215:
            byte[] r2 = r11.f3732a
            int r4 = r0.f5780n
            boolean r2 = r0.b(r1, r2, r4)
            if (r2 == 0) goto L_0x01e0
            byte[] r2 = r11.f3732a
            N1.f r2 = p1.C1332b.j(r2)
            r4 = 40
            r2.u(r4)
            r4 = 2
            int r5 = r2.i(r4)
            boolean r6 = r2.h()
            if (r6 != 0) goto L_0x023a
            r6 = 16
            r8 = 8
            goto L_0x023e
        L_0x023a:
            r6 = 20
            r8 = 12
        L_0x023e:
            r2.u(r8)
            int r8 = r2.i(r6)
            r9 = 1
            int r8 = r8 + r9
            boolean r10 = r2.h()
            if (r10 == 0) goto L_0x02ac
            int r12 = r2.i(r4)
            r4 = 3
            int r13 = r2.i(r4)
            int r13 = r13 + r9
            r14 = 512(0x200, float:7.175E-43)
            int r13 = r13 * 512
            boolean r14 = r2.h()
            if (r14 == 0) goto L_0x0266
            r14 = 36
            r2.u(r14)
        L_0x0266:
            int r14 = r2.i(r4)
            int r14 = r14 + r9
            int r4 = r2.i(r4)
            int r4 = r4 + r9
            if (r14 != r9) goto L_0x02a5
            if (r4 != r9) goto L_0x02a5
            int r5 = r5 + r9
            int r4 = r2.i(r5)
            r14 = 0
        L_0x027a:
            if (r14 >= r5) goto L_0x0288
            int r15 = r4 >> r14
            r15 = r15 & r9
            if (r15 != r9) goto L_0x0286
            r15 = 8
            r2.u(r15)
        L_0x0286:
            int r14 = r14 + r9
            goto L_0x027a
        L_0x0288:
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x02ae
            r4 = 2
            r2.u(r4)
            int r5 = r2.i(r4)
            int r5 = r5 + r9
            int r5 = r5 << r4
            int r14 = r2.i(r4)
            int r14 = r14 + r9
            r4 = 0
        L_0x029e:
            if (r4 >= r14) goto L_0x02ae
            r2.u(r5)
            int r4 = r4 + r9
            goto L_0x029e
        L_0x02a5:
            java.lang.String r1 = "Multiple audio presentations or assets not supported"
            M0.J r1 = M0.J.c(r1)
            throw r1
        L_0x02ac:
            r12 = -1
            r13 = 0
        L_0x02ae:
            r2.u(r6)
            r2.u(r7)
            if (r10 == 0) goto L_0x02f6
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x02bf
            r2.u(r3)
        L_0x02bf:
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x02ca
            r4 = 24
            r2.u(r4)
        L_0x02ca:
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x02dd
            r4 = 10
            int r4 = r2.i(r4)
            r5 = 1
            int r4 = r4 + r5
            r2.v(r4)
        L_0x02db:
            r4 = 5
            goto L_0x02df
        L_0x02dd:
            r5 = 1
            goto L_0x02db
        L_0x02df:
            r2.u(r4)
            int[] r4 = p1.C1332b.f14350m
            int r6 = r2.i(r3)
            r14 = r4[r6]
            r4 = 8
            int r2 = r2.i(r4)
            int r2 = r2 + r5
            r28 = r2
            r29 = r14
            goto L_0x02fc
        L_0x02f6:
            r5 = 1
            r28 = -1
            r29 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        L_0x02fc:
            if (r10 == 0) goto L_0x0335
            if (r12 == 0) goto L_0x0321
            if (r12 == r5) goto L_0x031d
            r2 = 2
            if (r12 != r2) goto L_0x0309
            r2 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0323
        L_0x0309:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported reference clock code in DTS HD header: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x031d:
            r2 = 44100(0xac44, float:6.1797E-41)
            goto L_0x0323
        L_0x0321:
            r2 = 32000(0x7d00, float:4.4842E-41)
        L_0x0323:
            long r4 = (long) r13
            long r9 = (long) r2
            int r2 = P0.z.f3748a
            java.math.RoundingMode r36 = java.math.RoundingMode.DOWN
            r32 = 1000000(0xf4240, double:4.940656E-318)
            r30 = r4
            r34 = r9
            long r4 = P0.z.W(r30, r32, r34, r36)
            goto L_0x0337
        L_0x0335:
            r4 = r23
        L_0x0337:
            p1.a r2 = new p1.a
            java.lang.String r27 = "audio/vnd.dts.hd;profile=lbr"
            r26 = r2
            r30 = r8
            r31 = r4
            r26.<init>(r27, r28, r29, r30, r31)
            r0.c(r2)
            r0.f5778l = r8
            int r2 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x0350
            r12 = 0
            goto L_0x0351
        L_0x0350:
            r12 = r4
        L_0x0351:
            r0.f5776j = r12
            r2 = 0
            r11.H(r2)
            p1.G r2 = r0.f5773f
            int r4 = r0.f5780n
            r2.a(r4, r11)
            r2 = 6
            r0.f5774g = r2
            goto L_0x01e0
        L_0x0363:
            byte[] r2 = r11.f3732a
            r4 = 7
            boolean r2 = r0.b(r1, r2, r4)
            if (r2 == 0) goto L_0x01e0
            byte[] r2 = r11.f3732a
            N1.f r2 = p1.C1332b.j(r2)
            r4 = 42
            r2.u(r4)
            boolean r4 = r2.h()
            if (r4 == 0) goto L_0x0380
            r4 = 12
            goto L_0x0382
        L_0x0380:
            r4 = 8
        L_0x0382:
            int r2 = r2.i(r4)
            r4 = 1
            int r2 = r2 + r4
            r0.f5780n = r2
            r2 = 3
            r0.f5774g = r2
            goto L_0x01e0
        L_0x038f:
            byte[] r2 = r11.f3732a
            r4 = 18
            boolean r2 = r0.b(r1, r2, r4)
            if (r2 == 0) goto L_0x01e0
            byte[] r2 = r11.f3732a
            M0.r r5 = r0.f5777k
            r6 = 60
            if (r5 != 0) goto L_0x040b
            java.lang.String r5 = r0.e
            N1.f r8 = p1.C1332b.j(r2)
            r8.u(r6)
            r9 = 6
            int r12 = r8.i(r9)
            int[] r9 = p1.C1332b.f14347j
            r9 = r9[r12]
            int r12 = r8.i(r3)
            int[] r13 = p1.C1332b.f14348k
            r12 = r13[r12]
            r13 = 5
            int r14 = r8.i(r13)
            r13 = 29
            if (r14 < r13) goto L_0x03c9
            r13 = -1
            r14 = 2
        L_0x03c6:
            r15 = 10
            goto L_0x03d2
        L_0x03c9:
            int[] r13 = p1.C1332b.f14349l
            r13 = r13[r14]
            int r13 = r13 * 1000
            r14 = 2
            int r13 = r13 / r14
            goto L_0x03c6
        L_0x03d2:
            r8.u(r15)
            int r8 = r8.i(r14)
            if (r8 <= 0) goto L_0x03dd
            r8 = 1
            goto L_0x03de
        L_0x03dd:
            r8 = 0
        L_0x03de:
            int r9 = r9 + r8
            M0.q r8 = new M0.q
            r8.<init>()
            r8.f2989a = r5
            java.lang.String r5 = "audio/vnd.dts"
            java.lang.String r5 = M0.I.o(r5)
            r8.f2999m = r5
            r8.f2995h = r13
            r8.f2979B = r9
            r8.f2980C = r12
            r5 = 0
            r8.f3003q = r5
            java.lang.String r5 = r0.f5771c
            r8.f2992d = r5
            int r5 = r0.f5772d
            r8.f2993f = r5
            M0.r r5 = new M0.r
            r5.<init>(r8)
            r0.f5777k = r5
            p1.G r8 = r0.f5773f
            r8.c(r5)
        L_0x040b:
            r5 = 0
            byte r8 = r2[r5]
            r5 = 31
            r9 = -2
            if (r8 == r9) goto L_0x045f
            r12 = -1
            if (r8 == r12) goto L_0x044a
            if (r8 == r5) goto L_0x0430
            r12 = 5
            byte r13 = r2[r12]
            r12 = 3
            r12 = r12 & r13
            int r12 = r12 << r7
            r13 = 6
            byte r14 = r2[r13]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << r3
            r12 = r12 | r14
            r14 = 7
            byte r15 = r2[r14]
            r15 = r15 & 240(0xf0, float:3.36E-43)
            int r15 = r15 >> r3
            r12 = r12 | r15
            r15 = 1
            int r12 = r12 + r15
        L_0x042e:
            r13 = 0
            goto L_0x0475
        L_0x0430:
            r13 = 6
            r14 = 7
            byte r12 = r2[r13]
            r13 = 3
            r12 = r12 & r13
            int r12 = r12 << r7
            byte r13 = r2[r14]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r3
            r12 = r12 | r13
            r13 = 8
            byte r15 = r2[r13]
            r13 = r15 & 60
            r15 = 2
            int r13 = r13 >> r15
        L_0x0445:
            r12 = r12 | r13
            r13 = 1
            int r12 = r12 + r13
            r13 = 1
            goto L_0x0475
        L_0x044a:
            r14 = 7
            byte r12 = r2[r14]
            r13 = 3
            r12 = r12 & r13
            int r12 = r12 << r7
            r13 = 6
            byte r14 = r2[r13]
            r13 = r14 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r3
            r12 = r12 | r13
            r13 = 9
            byte r13 = r2[r13]
            r13 = r13 & r6
            r14 = 2
            int r13 = r13 >> r14
            goto L_0x0445
        L_0x045f:
            byte r12 = r2[r3]
            r13 = 3
            r12 = r12 & r13
            int r12 = r12 << r7
            r13 = 7
            byte r14 = r2[r13]
            r13 = r14 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r3
            r12 = r12 | r13
            r13 = 6
            byte r14 = r2[r13]
            r13 = r14 & 240(0xf0, float:3.36E-43)
            int r13 = r13 >> r3
            r12 = r12 | r13
            r13 = 1
            int r12 = r12 + r13
            goto L_0x042e
        L_0x0475:
            if (r13 == 0) goto L_0x047d
            r13 = 16
            int r12 = r12 * 16
            int r12 = r12 / 14
        L_0x047d:
            r0.f5778l = r12
            if (r8 == r9) goto L_0x04ab
            r9 = -1
            if (r8 == r9) goto L_0x04a2
            if (r8 == r5) goto L_0x0496
            byte r5 = r2[r3]
            r6 = 1
            r5 = r5 & r6
            r8 = 6
            int r5 = r5 << r8
            r12 = 5
            byte r2 = r2[r12]
            r2 = r2 & 252(0xfc, float:3.53E-43)
            r13 = 2
        L_0x0492:
            int r2 = r2 >> r13
            r2 = r2 | r5
            r6 = 1
            goto L_0x04ba
        L_0x0496:
            r8 = 6
            r12 = 5
            r13 = 2
            byte r5 = r2[r12]
            r12 = 7
            r5 = r5 & r12
            int r5 = r5 << r3
            byte r2 = r2[r8]
        L_0x04a0:
            r2 = r2 & r6
            goto L_0x0492
        L_0x04a2:
            r12 = 7
            r13 = 2
            byte r5 = r2[r3]
            r5 = r5 & r12
            int r5 = r5 << r3
            byte r2 = r2[r12]
            goto L_0x04a0
        L_0x04ab:
            r5 = 5
            r9 = -1
            r13 = 2
            byte r5 = r2[r5]
            r6 = 1
            r5 = r5 & r6
            r8 = 6
            int r5 = r5 << r8
            byte r2 = r2[r3]
            r2 = r2 & 252(0xfc, float:3.53E-43)
            int r2 = r2 >> r13
            r2 = r2 | r5
        L_0x04ba:
            int r2 = r2 + r6
            int r2 = r2 * 32
            long r5 = (long) r2
            M0.r r2 = r0.f5777k
            int r2 = r2.f3015D
            long r5 = P0.z.U(r2, r5)
            int r2 = E.e.c(r5)
            long r5 = (long) r2
            r0.f5776j = r5
            r2 = 0
            r11.H(r2)
            p1.G r2 = r0.f5773f
            r2.a(r4, r11)
            r2 = 6
            r0.f5774g = r2
            goto L_0x01e0
        L_0x04db:
            r9 = -1
        L_0x04dc:
            int r2 = r38.a()
            if (r2 <= 0) goto L_0x01e0
            int r2 = r0.i
            r4 = 8
            int r2 = r2 << r4
            r0.i = r2
            int r4 = r38.v()
            r2 = r2 | r4
            r0.i = r2
            r4 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r4) goto L_0x052b
            r4 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r4) goto L_0x052b
            r4 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r4) goto L_0x052b
            r4 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r4) goto L_0x0505
            goto L_0x052b
        L_0x0505:
            r4 = 1683496997(0x64582025, float:1.5947252E22)
            if (r2 == r4) goto L_0x0529
            r4 = 622876772(0x25205864, float:1.3907736E-16)
            if (r2 != r4) goto L_0x0510
            goto L_0x0529
        L_0x0510:
            if (r2 == r13) goto L_0x0527
            r4 = -233094848(0xfffffffff21b4140, float:-3.0751398E30)
            if (r2 != r4) goto L_0x0518
            goto L_0x0527
        L_0x0518:
            r4 = 1908687592(0x71c442e8, float:1.9436783E30)
            if (r2 == r4) goto L_0x0525
            r4 = -398277519(0xffffffffe842c471, float:-3.6790512E24)
            if (r2 != r4) goto L_0x0523
            goto L_0x0525
        L_0x0523:
            r4 = 0
            goto L_0x052c
        L_0x0525:
            r4 = 4
            goto L_0x052c
        L_0x0527:
            r4 = 3
            goto L_0x052c
        L_0x0529:
            r4 = 2
            goto L_0x052c
        L_0x052b:
            r4 = 1
        L_0x052c:
            r0.f5779m = r4
            if (r4 == 0) goto L_0x04dc
            byte[] r5 = r11.f3732a
            r6 = 24
            int r8 = r2 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r10 = 0
            r5[r10] = r8
            r8 = 16
            int r10 = r2 >> 16
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r11 = 1
            r5[r11] = r10
            r10 = 8
            int r11 = r2 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r12 = 2
            r5[r12] = r11
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r12 = 3
            r5[r12] = r2
            r0.f5775h = r3
            r2 = 0
            r0.i = r2
            if (r4 == r12) goto L_0x055f
            if (r4 != r3) goto L_0x0561
        L_0x055f:
            r5 = 1
            goto L_0x056d
        L_0x0561:
            r5 = 1
            if (r4 != r5) goto L_0x0568
            r0.f5774g = r5
            goto L_0x01e0
        L_0x0568:
            r4 = 2
            r0.f5774g = r4
            goto L_0x01e0
        L_0x056d:
            r0.f5774g = r3
            goto L_0x01e0
        L_0x0571:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.C0348g.e(P0.r):void");
    }

    public final void f(boolean z) {
    }

    public final void g(int i8, long j7) {
        this.f5782p = j7;
    }

    public final void h(q qVar, G g8) {
        g8.c();
        g8.d();
        this.e = (String) g8.e;
        g8.d();
        this.f5773f = qVar.q(g8.f5716c, 1);
    }
}
