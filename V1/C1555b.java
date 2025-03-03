package v1;

import E2.a;
import H3.M;
import H3.O;
import H3.i0;
import P0.r;
import java.util.List;
import p1.l;
import p1.n;
import p1.o;
import p1.p;
import p1.q;

/* renamed from: v1.b  reason: case insensitive filesystem */
public final class C1555b implements o {

    /* renamed from: a  reason: collision with root package name */
    public final r f15977a = new r(4);

    /* renamed from: b  reason: collision with root package name */
    public final r f15978b = new r(9);

    /* renamed from: c  reason: collision with root package name */
    public final r f15979c = new r(11);

    /* renamed from: d  reason: collision with root package name */
    public final r f15980d = new r();
    public final C1556c e;

    /* renamed from: f  reason: collision with root package name */
    public q f15981f;

    /* renamed from: g  reason: collision with root package name */
    public int f15982g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15983h;
    public long i;

    /* renamed from: j  reason: collision with root package name */
    public int f15984j;

    /* renamed from: k  reason: collision with root package name */
    public int f15985k;

    /* renamed from: l  reason: collision with root package name */
    public int f15986l;

    /* renamed from: m  reason: collision with root package name */
    public long f15987m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15988n;

    /* renamed from: o  reason: collision with root package name */
    public C1554a f15989o;

    /* renamed from: p  reason: collision with root package name */
    public C1557d f15990p;

    /* JADX WARNING: type inference failed for: r0v4, types: [E2.a, v1.c] */
    public C1555b() {
        ? aVar = new a(5, new n());
        aVar.f15991W = -9223372036854775807L;
        aVar.f15992X = new long[0];
        aVar.f15993Y = new long[0];
        this.e = aVar;
        this.f15982g = 1;
    }

    public final void a(long j7, long j8) {
        if (j7 == 0) {
            this.f15982g = 1;
            this.f15983h = false;
        } else {
            this.f15982g = 3;
        }
        this.f15984j = 0;
    }

    public final r b(l lVar) {
        int i8 = this.f15986l;
        r rVar = this.f15980d;
        byte[] bArr = rVar.f3732a;
        if (i8 > bArr.length) {
            rVar.F(0, new byte[Math.max(bArr.length * 2, i8)]);
        } else {
            rVar.H(0);
        }
        rVar.G(this.f15986l);
        lVar.c(rVar.f3732a, 0, this.f15986l, false);
        return rVar;
    }

    public final o c() {
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [E2.a, v1.a] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0392 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0007 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0273  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(p1.p r30, M0.C0132u r31) {
        /*
            r29 = this;
            r0 = r29
            p1.q r1 = r0.f15981f
            P0.l.k(r1)
        L_0x0007:
            int r1 = r0.f15982g
            r2 = 4
            r4 = 1
            r5 = -1
            r6 = 9
            r7 = 8
            r8 = 2
            if (r1 == r4) goto L_0x03ea
            r9 = 3
            if (r1 == r8) goto L_0x03da
            if (r1 == r9) goto L_0x039a
            if (r1 != r2) goto L_0x0394
            boolean r1 = r0.f15983h
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            v1.c r5 = r0.e
            if (r1 == 0) goto L_0x002d
            long r13 = r0.i
            long r11 = r0.f15987m
            long r13 = r13 + r11
        L_0x002a:
            r18 = r13
            goto L_0x0039
        L_0x002d:
            long r11 = r5.f15991W
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0036
            r18 = 0
            goto L_0x0039
        L_0x0036:
            long r13 = r0.f15987m
            goto L_0x002a
        L_0x0039:
            int r1 = r0.f15985k
            if (r1 != r7) goto L_0x015e
            v1.a r7 = r0.f15989o
            if (r7 == 0) goto L_0x015e
            boolean r1 = r0.f15988n
            if (r1 != 0) goto L_0x0051
            p1.q r1 = r0.f15981f
            p1.s r6 = new p1.s
            r6.<init>(r9)
            r1.l(r6)
            r0.f15988n = r4
        L_0x0051:
            v1.a r1 = r0.f15989o
            r6 = r30
            p1.l r6 = (p1.l) r6
            P0.r r6 = r0.b(r6)
            boolean r7 = r1.f15974W
            r11 = 1
            if (r7 != 0) goto L_0x00d2
            int r7 = r6.v()
            int r12 = r7 >> 4
            r12 = r12 & 15
            r1.f15976Y = r12
            java.lang.Object r13 = r1.f1328V
            p1.G r13 = (p1.G) r13
            r14 = 2
            if (r12 != r14) goto L_0x008f
            int r7 = r7 >> r14
            r7 = r7 & 3
            int[] r12 = v1.C1554a.f15973Z
            r7 = r12[r7]
            M0.q r12 = new M0.q
            r12.<init>()
            java.lang.String r14 = "audio/mpeg"
            java.lang.String r14 = M0.I.o(r14)
            r12.f2999m = r14
            r12.f2979B = r11
            r12.f2980C = r7
            Q0.g.v(r12, r13)
            r1.f15975X = r11
            goto L_0x00cf
        L_0x008f:
            r7 = 7
            if (r12 == r7) goto L_0x00b2
            r14 = 8
            if (r12 != r14) goto L_0x0097
            goto L_0x00b2
        L_0x0097:
            r7 = 10
            if (r12 != r7) goto L_0x009c
            goto L_0x00cf
        L_0x009c:
            h1.g0 r2 = new h1.g0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Audio format not supported: "
            r3.<init>(r4)
            int r1 = r1.f15976Y
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00b2:
            if (r12 != r7) goto L_0x00b7
            java.lang.String r7 = "audio/g711-alaw"
            goto L_0x00b9
        L_0x00b7:
            java.lang.String r7 = "audio/g711-mlaw"
        L_0x00b9:
            M0.q r12 = new M0.q
            r12.<init>()
            java.lang.String r7 = M0.I.o(r7)
            r12.f2999m = r7
            r12.f2979B = r11
            r7 = 8000(0x1f40, float:1.121E-41)
            r12.f2980C = r7
            Q0.g.v(r12, r13)
            r1.f15975X = r11
        L_0x00cf:
            r1.f15974W = r11
            goto L_0x00d5
        L_0x00d2:
            r6.I(r11)
        L_0x00d5:
            int r7 = r1.f15976Y
            r11 = 2
            java.lang.Object r12 = r1.f1328V
            p1.G r12 = (p1.G) r12
            r13 = 1
            if (r7 != r11) goto L_0x00f8
            int r7 = r6.a()
            r12.a(r7, r6)
            java.lang.Object r1 = r1.f1328V
            r17 = r1
            p1.G r17 = (p1.G) r17
            r20 = 1
            r22 = 0
            r23 = 0
            r21 = r7
            r17.e(r18, r20, r21, r22, r23)
            goto L_0x015b
        L_0x00f8:
            int r7 = r6.v()
            r11 = 0
            if (r7 != 0) goto L_0x013b
            boolean r14 = r1.f15975X
            if (r14 != 0) goto L_0x013b
            int r7 = r6.a()
            byte[] r14 = new byte[r7]
            r6.g(r14, r11, r7)
            N1.f r6 = new N1.f
            r6.<init>((int) r7, (byte[]) r14)
            p1.a r6 = p1.C1332b.p(r6, r11)
            M0.q r7 = new M0.q
            r7.<init>()
            java.lang.String r17 = "audio/mp4a-latm"
            java.lang.String r11 = M0.I.o(r17)
            r7.f2999m = r11
            java.lang.String r11 = r6.f14337a
            r7.f2996j = r11
            int r11 = r6.f14339c
            r7.f2979B = r11
            int r6 = r6.f14338b
            r7.f2980C = r6
            java.util.List r6 = java.util.Collections.singletonList(r14)
            r7.f3002p = r6
            Q0.g.v(r7, r12)
            r1.f15975X = r13
        L_0x0139:
            r13 = 0
            goto L_0x015b
        L_0x013b:
            int r11 = r1.f15976Y
            r14 = 10
            if (r11 != r14) goto L_0x0143
            if (r7 != r13) goto L_0x0139
        L_0x0143:
            int r7 = r6.a()
            r12.a(r7, r6)
            java.lang.Object r1 = r1.f1328V
            r17 = r1
            p1.G r17 = (p1.G) r17
            r20 = 1
            r22 = 0
            r23 = 0
            r21 = r7
            r17.e(r18, r20, r21, r22, r23)
        L_0x015b:
            r1 = 1
            goto L_0x0374
        L_0x015e:
            if (r1 != r6) goto L_0x0282
            v1.d r6 = r0.f15990p
            if (r6 == 0) goto L_0x0282
            boolean r1 = r0.f15988n
            if (r1 != 0) goto L_0x0174
            p1.q r1 = r0.f15981f
            p1.s r6 = new p1.s
            r6.<init>(r9)
            r1.l(r6)
            r0.f15988n = r4
        L_0x0174:
            v1.d r1 = r0.f15990p
            r6 = r30
            p1.l r6 = (p1.l) r6
            P0.r r6 = r0.b(r6)
            r1.getClass()
            int r7 = r6.v()
            int r11 = r7 >> 4
            r11 = r11 & 15
            r7 = r7 & 15
            r12 = 7
            if (r7 != r12) goto L_0x0276
            r1.f15999b0 = r11
            r7 = 5
            if (r11 == r7) goto L_0x0195
            r7 = 1
            goto L_0x0196
        L_0x0195:
            r7 = 0
        L_0x0196:
            if (r7 == 0) goto L_0x0139
            int r7 = r6.v()
            byte[] r11 = r6.f3732a
            int r12 = r6.f3733b
            int r13 = r12 + 1
            r6.f3733b = r13
            byte r14 = r11[r12]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 24
            int r14 = r14 >> 8
            int r15 = r12 + 2
            r6.f3733b = r15
            byte r13 = r11[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 8
            r13 = r13 | r14
            int r12 = r12 + 3
            r6.f3733b = r12
            byte r11 = r11[r15]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            long r11 = (long) r11
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r13
            long r23 = r11 + r18
            r11 = 1
            java.lang.Object r12 = r1.f1328V
            p1.G r12 = (p1.G) r12
            r13 = 0
            if (r7 != 0) goto L_0x0215
            boolean r14 = r1.f15997Z
            if (r14 != 0) goto L_0x0215
            P0.r r7 = new P0.r
            int r14 = r6.a()
            byte[] r14 = new byte[r14]
            r7.<init>((byte[]) r14)
            int r15 = r6.a()
            r6.g(r14, r13, r15)
            p1.d r6 = p1.C1334d.a(r7)
            int r7 = r6.f14369b
            r1.f15996Y = r7
            M0.q r7 = new M0.q
            r7.<init>()
            java.lang.String r14 = "video/avc"
            java.lang.String r14 = M0.I.o(r14)
            r7.f2999m = r14
            java.lang.String r14 = r6.f14377l
            r7.f2996j = r14
            int r14 = r6.f14370c
            r7.f3006t = r14
            int r14 = r6.f14371d
            r7.f3007u = r14
            float r14 = r6.f14376k
            r7.f3010x = r14
            java.util.ArrayList r6 = r6.f14368a
            r7.f3002p = r6
            Q0.g.v(r7, r12)
            r1.f15997Z = r11
        L_0x0213:
            r11 = 0
            goto L_0x0271
        L_0x0215:
            if (r7 != r11) goto L_0x0213
            boolean r7 = r1.f15997Z
            if (r7 == 0) goto L_0x0213
            int r7 = r1.f15999b0
            if (r7 != r11) goto L_0x0222
            r25 = 1
            goto L_0x0224
        L_0x0222:
            r25 = 0
        L_0x0224:
            boolean r7 = r1.f15998a0
            if (r7 != 0) goto L_0x022b
            if (r25 != 0) goto L_0x022b
            goto L_0x0213
        L_0x022b:
            P0.r r7 = r1.f15995X
            byte[] r14 = r7.f3732a
            r14[r13] = r13
            r14[r11] = r13
            r15 = 2
            r14[r15] = r13
            int r14 = r1.f15996Y
            r15 = 4
            int r14 = 4 - r14
            r26 = 0
        L_0x023d:
            int r16 = r6.a()
            if (r16 <= 0) goto L_0x0262
            byte[] r3 = r7.f3732a
            int r8 = r1.f15996Y
            r6.g(r3, r14, r8)
            r7.H(r13)
            int r3 = r7.z()
            P0.r r8 = r1.f15994W
            r8.H(r13)
            r12.a(r15, r8)
            int r26 = r26 + 4
            r12.a(r3, r6)
            int r26 = r26 + r3
            r8 = 2
            goto L_0x023d
        L_0x0262:
            r28 = 0
            java.lang.Object r3 = r1.f1328V
            r22 = r3
            p1.G r22 = (p1.G) r22
            r27 = 0
            r22.e(r23, r25, r26, r27, r28)
            r1.f15998a0 = r11
        L_0x0271:
            if (r11 == 0) goto L_0x0139
            r13 = 1
            goto L_0x015b
        L_0x0276:
            h1.g0 r1 = new h1.g0
            java.lang.String r2 = "Video format not supported: "
            java.lang.String r2 = Q0.g.m(r7, r2)
            r1.<init>(r2)
            throw r1
        L_0x0282:
            r3 = 18
            if (r1 != r3) goto L_0x0369
            boolean r1 = r0.f15988n
            if (r1 != 0) goto L_0x0369
            r1 = r30
            p1.l r1 = (p1.l) r1
            P0.r r1 = r0.b(r1)
            r5.getClass()
            r5.getClass()
            int r3 = r1.v()
            r6 = 2
            r7 = 0
            if (r3 == r6) goto L_0x02a2
            goto L_0x0350
        L_0x02a2:
            java.lang.String r3 = v1.C1556c.r(r1)
            java.lang.String r6 = "onMetaData"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x02b0
            goto L_0x0350
        L_0x02b0:
            int r3 = r1.a()
            if (r3 != 0) goto L_0x02b8
            goto L_0x0350
        L_0x02b8:
            int r3 = r1.v()
            r6 = 8
            if (r3 == r6) goto L_0x02c2
            goto L_0x0350
        L_0x02c2:
            java.util.HashMap r1 = v1.C1556c.q(r1)
            java.lang.String r3 = "duration"
            java.lang.Object r3 = r1.get(r3)
            boolean r6 = r3 instanceof java.lang.Double
            r11 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r6 == 0) goto L_0x02e6
            java.lang.Double r3 = (java.lang.Double) r3
            double r13 = r3.doubleValue()
            r17 = 0
            int r3 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r3 <= 0) goto L_0x02e6
            double r13 = r13 * r11
            long r13 = (long) r13
            r5.f15991W = r13
        L_0x02e6:
            java.lang.String r3 = "keyframes"
            java.lang.Object r1 = r1.get(r3)
            boolean r3 = r1 instanceof java.util.Map
            if (r3 == 0) goto L_0x0350
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r3 = "filepositions"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r6 = "times"
            java.lang.Object r1 = r1.get(r6)
            boolean r6 = r3 instanceof java.util.List
            if (r6 == 0) goto L_0x0350
            boolean r6 = r1 instanceof java.util.List
            if (r6 == 0) goto L_0x0350
            java.util.List r3 = (java.util.List) r3
            java.util.List r1 = (java.util.List) r1
            int r6 = r1.size()
            long[] r8 = new long[r6]
            r5.f15992X = r8
            long[] r8 = new long[r6]
            r5.f15993Y = r8
            r8 = 0
        L_0x0317:
            if (r8 >= r6) goto L_0x0350
            java.lang.Object r13 = r3.get(r8)
            java.lang.Object r14 = r1.get(r8)
            boolean r15 = r14 instanceof java.lang.Double
            if (r15 == 0) goto L_0x0348
            boolean r15 = r13 instanceof java.lang.Double
            if (r15 == 0) goto L_0x0348
            long[] r15 = r5.f15992X
            java.lang.Double r14 = (java.lang.Double) r14
            double r17 = r14.doubleValue()
            r19 = r3
            double r2 = r17 * r11
            long r2 = (long) r2
            r15[r8] = r2
            long[] r2 = r5.f15993Y
            java.lang.Double r13 = (java.lang.Double) r13
            long r17 = r13.longValue()
            r2[r8] = r17
            int r8 = r8 + 1
            r3 = r19
            r2 = 4
            goto L_0x0317
        L_0x0348:
            long[] r1 = new long[r7]
            r5.f15992X = r1
            long[] r1 = new long[r7]
            r5.f15993Y = r1
        L_0x0350:
            long r1 = r5.f15991W
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0366
            p1.q r3 = r0.f15981f
            p1.x r6 = new p1.x
            long[] r7 = r5.f15993Y
            long[] r8 = r5.f15992X
            r6.<init>(r1, r7, r8)
            r3.l(r6)
            r0.f15988n = r4
        L_0x0366:
            r1 = 1
        L_0x0367:
            r13 = 0
            goto L_0x0374
        L_0x0369:
            int r1 = r0.f15986l
            r2 = r30
            p1.l r2 = (p1.l) r2
            r2.m(r1)
            r1 = 0
            goto L_0x0367
        L_0x0374:
            boolean r2 = r0.f15983h
            if (r2 != 0) goto L_0x038a
            if (r13 == 0) goto L_0x038a
            r0.f15983h = r4
            long r2 = r5.f15991W
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0386
            long r2 = r0.f15987m
            long r11 = -r2
            goto L_0x0388
        L_0x0386:
            r11 = 0
        L_0x0388:
            r0.i = r11
        L_0x038a:
            r2 = 4
            r0.f15984j = r2
            r2 = 2
            r0.f15982g = r2
            if (r1 == 0) goto L_0x0007
            r1 = 0
            return r1
        L_0x0394:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x039a:
            r1 = 0
            P0.r r2 = r0.f15979c
            byte[] r3 = r2.f3732a
            r6 = 11
            r7 = r30
            p1.l r7 = (p1.l) r7
            boolean r3 = r7.c(r3, r1, r6, r4)
            if (r3 != 0) goto L_0x03ac
            return r5
        L_0x03ac:
            r2.H(r1)
            int r1 = r2.v()
            r0.f15985k = r1
            int r1 = r2.y()
            r0.f15986l = r1
            int r1 = r2.y()
            long r3 = (long) r1
            r0.f15987m = r3
            int r1 = r2.v()
            int r1 = r1 << 24
            long r3 = (long) r1
            long r5 = r0.f15987m
            long r3 = r3 | r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r0.f15987m = r3
            r2.I(r9)
            r1 = 4
            r0.f15982g = r1
            goto L_0x0007
        L_0x03da:
            int r1 = r0.f15984j
            r2 = r30
            p1.l r2 = (p1.l) r2
            r2.m(r1)
            r1 = 0
            r0.f15984j = r1
            r0.f15982g = r9
            goto L_0x0007
        L_0x03ea:
            r1 = 0
            P0.r r2 = r0.f15978b
            byte[] r3 = r2.f3732a
            r8 = r30
            p1.l r8 = (p1.l) r8
            boolean r3 = r8.c(r3, r1, r6, r4)
            if (r3 != 0) goto L_0x03fa
            return r5
        L_0x03fa:
            r2.H(r1)
            r3 = 4
            r2.I(r3)
            int r3 = r2.v()
            r5 = r3 & 4
            if (r5 == 0) goto L_0x040b
            r5 = 1
            goto L_0x040c
        L_0x040b:
            r5 = 0
        L_0x040c:
            r3 = r3 & 1
            if (r3 == 0) goto L_0x0412
            r3 = 1
            goto L_0x0413
        L_0x0412:
            r3 = 0
        L_0x0413:
            if (r5 == 0) goto L_0x0427
            v1.a r1 = r0.f15989o
            if (r1 != 0) goto L_0x0427
            v1.a r1 = new v1.a
            p1.q r5 = r0.f15981f
            p1.G r4 = r5.q(r7, r4)
            r5 = 5
            r1.<init>(r5, r4)
            r0.f15989o = r1
        L_0x0427:
            if (r3 == 0) goto L_0x043b
            v1.d r1 = r0.f15990p
            if (r1 != 0) goto L_0x043b
            v1.d r1 = new v1.d
            p1.q r3 = r0.f15981f
            r4 = 2
            p1.G r3 = r3.q(r6, r4)
            r1.<init>(r3)
            r0.f15990p = r1
        L_0x043b:
            p1.q r1 = r0.f15981f
            r1.g()
            int r1 = r2.i()
            int r1 = r1 + -5
            r0.f15984j = r1
            r1 = 2
            r0.f15982g = r1
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.C1555b.e(p1.p, M0.u):int");
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        r rVar = this.f15977a;
        l lVar = (l) pVar;
        lVar.r(rVar.f3732a, 0, 3, false);
        rVar.H(0);
        if (rVar.y() != 4607062) {
            return false;
        }
        lVar.r(rVar.f3732a, 0, 2, false);
        rVar.H(0);
        if ((rVar.B() & 250) != 0) {
            return false;
        }
        lVar.r(rVar.f3732a, 0, 4, false);
        rVar.H(0);
        int i8 = rVar.i();
        lVar.f14410Z = 0;
        lVar.b(i8, false);
        lVar.r(rVar.f3732a, 0, 4, false);
        rVar.H(0);
        if (rVar.i() == 0) {
            return true;
        }
        return false;
    }

    public final void l(q qVar) {
        this.f15981f = qVar;
    }

    public final void release() {
    }
}
