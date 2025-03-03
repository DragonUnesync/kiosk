package V0;

import B.B;
import B.q0;
import G5.m;
import H3.M;
import H3.O;
import H3.P;
import H3.i0;
import M0.C0117e;
import M0.C0118f;
import M0.I;
import M0.L;
import M0.r;
import N0.a;
import N0.b;
import N0.d;
import N0.e;
import N5.f;
import P0.l;
import P0.z;
import Q0.g;
import R2.c;
import T0.A;
import U0.j;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class y {

    /* renamed from: j0  reason: collision with root package name */
    public static final Object f5611j0 = new Object();

    /* renamed from: k0  reason: collision with root package name */
    public static ScheduledExecutorService f5612k0;

    /* renamed from: l0  reason: collision with root package name */
    public static int f5613l0;

    /* renamed from: A  reason: collision with root package name */
    public t f5614A;

    /* renamed from: B  reason: collision with root package name */
    public t f5615B;

    /* renamed from: C  reason: collision with root package name */
    public L f5616C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f5617D;

    /* renamed from: E  reason: collision with root package name */
    public ByteBuffer f5618E;

    /* renamed from: F  reason: collision with root package name */
    public int f5619F;

    /* renamed from: G  reason: collision with root package name */
    public long f5620G;

    /* renamed from: H  reason: collision with root package name */
    public long f5621H;

    /* renamed from: I  reason: collision with root package name */
    public long f5622I;

    /* renamed from: J  reason: collision with root package name */
    public long f5623J;

    /* renamed from: K  reason: collision with root package name */
    public int f5624K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f5625L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f5626M;

    /* renamed from: N  reason: collision with root package name */
    public long f5627N;

    /* renamed from: O  reason: collision with root package name */
    public float f5628O;

    /* renamed from: P  reason: collision with root package name */
    public ByteBuffer f5629P;

    /* renamed from: Q  reason: collision with root package name */
    public int f5630Q;

    /* renamed from: R  reason: collision with root package name */
    public ByteBuffer f5631R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f5632S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f5633T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f5634U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f5635V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f5636W;

    /* renamed from: X  reason: collision with root package name */
    public int f5637X;

    /* renamed from: Y  reason: collision with root package name */
    public C0118f f5638Y;

    /* renamed from: Z  reason: collision with root package name */
    public P f5639Z;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5640a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f5641a0;

    /* renamed from: b  reason: collision with root package name */
    public final q0 f5642b;

    /* renamed from: b0  reason: collision with root package name */
    public long f5643b0;

    /* renamed from: c  reason: collision with root package name */
    public final q f5644c;

    /* renamed from: c0  reason: collision with root package name */
    public long f5645c0;

    /* renamed from: d  reason: collision with root package name */
    public final F f5646d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f5647d0;
    public final i0 e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f5648e0;

    /* renamed from: f  reason: collision with root package name */
    public final i0 f5649f;

    /* renamed from: f0  reason: collision with root package name */
    public Looper f5650f0;

    /* renamed from: g  reason: collision with root package name */
    public final p f5651g;

    /* renamed from: g0  reason: collision with root package name */
    public long f5652g0;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayDeque f5653h;

    /* renamed from: h0  reason: collision with root package name */
    public long f5654h0;
    public final boolean i;

    /* renamed from: i0  reason: collision with root package name */
    public Handler f5655i0;

    /* renamed from: j  reason: collision with root package name */
    public int f5656j;

    /* renamed from: k  reason: collision with root package name */
    public q0 f5657k;

    /* renamed from: l  reason: collision with root package name */
    public final v f5658l;

    /* renamed from: m  reason: collision with root package name */
    public final v f5659m;

    /* renamed from: n  reason: collision with root package name */
    public final z f5660n;

    /* renamed from: o  reason: collision with root package name */
    public final c f5661o;

    /* renamed from: p  reason: collision with root package name */
    public final z f5662p;

    /* renamed from: q  reason: collision with root package name */
    public j f5663q;

    /* renamed from: r  reason: collision with root package name */
    public P f5664r;

    /* renamed from: s  reason: collision with root package name */
    public s f5665s;

    /* renamed from: t  reason: collision with root package name */
    public s f5666t;

    /* renamed from: u  reason: collision with root package name */
    public a f5667u;

    /* renamed from: v  reason: collision with root package name */
    public AudioTrack f5668v;

    /* renamed from: w  reason: collision with root package name */
    public C0339d f5669w;

    /* renamed from: x  reason: collision with root package name */
    public m f5670x;

    /* renamed from: y  reason: collision with root package name */
    public q0 f5671y;
    public C0117e z;

    /* JADX WARNING: type inference failed for: r1v6, types: [V0.q, java.lang.Object, N0.e] */
    /* JADX WARNING: type inference failed for: r2v1, types: [V0.F, java.lang.Object, N0.e] */
    /* JADX WARNING: type inference failed for: r1v11, types: [M0.f, java.lang.Object] */
    public y(r rVar) {
        C0339d dVar;
        Context context = (Context) rVar.f5586b;
        this.f5640a = context;
        C0117e eVar = C0117e.f2938b;
        this.z = eVar;
        if (context != null) {
            C0339d dVar2 = C0339d.f5512c;
            int i8 = z.f3748a;
            dVar = C0339d.b(context, eVar, (P) null);
        } else {
            dVar = (C0339d) rVar.f5587c;
        }
        this.f5669w = dVar;
        this.f5642b = (q0) rVar.f5588d;
        int i9 = z.f3748a;
        this.i = false;
        this.f5656j = 0;
        this.f5660n = (z) rVar.e;
        c cVar = (c) rVar.f5590g;
        cVar.getClass();
        this.f5661o = cVar;
        this.f5651g = new p(new P((Object) this));
        ? eVar2 = new e();
        this.f5644c = eVar2;
        ? eVar3 = new e();
        eVar3.f5505m = z.f3752f;
        this.f5646d = eVar3;
        this.e = O.t(new e(), eVar2, eVar3);
        this.f5649f = O.r(new e());
        this.f5628O = 1.0f;
        this.f5637X = 0;
        this.f5638Y = new Object();
        L l8 = L.f2845d;
        this.f5615B = new t(l8, 0, 0);
        this.f5616C = l8;
        this.f5617D = false;
        this.f5653h = new ArrayDeque();
        this.f5658l = new v();
        this.f5659m = new v();
        this.f5662p = (z) rVar.f5589f;
    }

    public static boolean p(AudioTrack audioTrack) {
        if (z.f3748a < 29 || !audioTrack.isOffloadedPlayback()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.x()
            B.q0 r1 = r8.f5642b
            if (r0 != 0) goto L_0x003f
            boolean r0 = r8.f5641a0
            if (r0 != 0) goto L_0x0039
            V0.s r0 = r8.f5666t
            int r2 = r0.f5593c
            if (r2 != 0) goto L_0x0039
            M0.r r0 = r0.f5591a
            int r0 = r0.f3016E
            M0.L r0 = r8.f5616C
            r1.getClass()
            float r2 = r0.f2846a
            java.lang.Object r3 = r1.f302X
            N0.g r3 = (N0.g) r3
            float r4 = r3.f3266c
            r5 = 1
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x002c
            r3.f3266c = r2
            r3.i = r5
        L_0x002c:
            float r2 = r3.f3267d
            float r4 = r0.f2847b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x003b
            r3.f3267d = r4
            r3.i = r5
            goto L_0x003b
        L_0x0039:
            M0.L r0 = M0.L.f2845d
        L_0x003b:
            r8.f5616C = r0
        L_0x003d:
            r3 = r0
            goto L_0x0042
        L_0x003f:
            M0.L r0 = M0.L.f2845d
            goto L_0x003d
        L_0x0042:
            boolean r0 = r8.f5641a0
            if (r0 != 0) goto L_0x0059
            V0.s r0 = r8.f5666t
            int r2 = r0.f5593c
            if (r2 != 0) goto L_0x0059
            M0.r r0 = r0.f5591a
            int r0 = r0.f3016E
            boolean r0 = r8.f5617D
            java.lang.Object r1 = r1.f301W
            V0.D r1 = (V0.D) r1
            r1.f5494o = r0
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            r8.f5617D = r0
            java.util.ArrayDeque r0 = r8.f5653h
            V0.t r1 = new V0.t
            r4 = 0
            long r4 = java.lang.Math.max(r4, r9)
            V0.s r9 = r8.f5666t
            long r6 = r8.k()
            int r9 = r9.e
            long r6 = P0.z.U(r9, r6)
            r2 = r1
            r2.<init>(r3, r4, r6)
            r0.add(r1)
            V0.s r9 = r8.f5666t
            N0.a r9 = r9.i
            r8.f5667u = r9
            r9.b()
            H3.P r9 = r8.f5664r
            if (r9 == 0) goto L_0x009b
            boolean r10 = r8.f5617D
            java.lang.Object r9 = r9.f2027U
            V0.B r9 = (V0.B) r9
            V0.i r9 = r9.f5482x1
            android.os.Handler r0 = r9.f5527b
            if (r0 == 0) goto L_0x009b
            A.b r1 = new A.b
            r2 = 5
            r1.<init>(r9, r10, r2)
            r0.post(r1)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.y.a(long):void");
    }

    public final AudioTrack b(j jVar, C0117e eVar, int i8, r rVar) {
        try {
            AudioTrack a8 = this.f5662p.a(jVar, eVar, i8);
            int state = a8.getState();
            if (state == 1) {
                return a8;
            }
            try {
                a8.release();
            } catch (Exception unused) {
            }
            throw new l(state, jVar.f5531c, jVar.e, jVar.f5530b, rVar, jVar.f5532d, (RuntimeException) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e8) {
            RuntimeException runtimeException = e8;
            throw new l(0, jVar.f5531c, jVar.e, jVar.f5530b, rVar, jVar.f5532d, runtimeException);
        }
    }

    public final AudioTrack c(s sVar) {
        try {
            return b(sVar.a(), this.z, this.f5637X, sVar.f5591a);
        } catch (l e8) {
            P p3 = this.f5664r;
            if (p3 != null) {
                p3.B0(e8);
            }
            throw e8;
        }
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [H3.I, H3.L] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018b, code lost:
        if ((r3 & r6) != false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018e, code lost:
        if (r23 > 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0191, code lost:
        if (r8 > 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0194, code lost:
        if (r8 < 0) goto L_0x0196;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(M0.r r27, int[] r28) {
        /*
            r26 = this;
            r1 = r26
            r3 = r27
            r26.q()
            java.lang.String r0 = r3.f3036n
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r0)
            boolean r4 = r1.i
            r5 = -1
            r6 = 1
            r7 = 0
            java.lang.String r8 = r3.f3036n
            int r9 = r3.f3015D
            int r10 = r3.f3014C
            if (r0 == 0) goto L_0x0097
            int r0 = r3.f3016E
            boolean r11 = P0.z.K(r0)
            P0.l.d(r11)
            int r11 = P0.z.A(r0, r10)
            H3.L r12 = new H3.L
            r13 = 4
            r12.<init>(r13)
            H3.i0 r13 = r1.e
            r12.d(r13)
            B.q0 r13 = r1.f5642b
            java.lang.Object r13 = r13.f300V
            N0.d[] r13 = (N0.d[]) r13
            int r14 = r13.length
            H3.C0103u.c(r14, r13)
            r12.e(r14)
            java.lang.Object[] r15 = r12.f2014a
            int r2 = r12.f2015b
            java.lang.System.arraycopy(r13, r7, r15, r2, r14)
            int r2 = r12.f2015b
            int r2 = r2 + r14
            r12.f2015b = r2
            N0.a r2 = new N0.a
            H3.i0 r12 = r12.g()
            r2.<init>(r12)
            N0.a r12 = r1.f5667u
            boolean r12 = r2.equals(r12)
            if (r12 == 0) goto L_0x0060
            N0.a r2 = r1.f5667u
        L_0x0060:
            int r12 = r3.f3017F
            V0.F r13 = r1.f5646d
            r13.i = r12
            int r12 = r3.f3018G
            r13.f5502j = r12
            V0.q r12 = r1.f5644c
            r13 = r28
            r12.i = r13
            N0.b r12 = new N0.b
            r12.<init>(r9, r10, r0)
            N0.b r0 = r2.a(r12)     // Catch:{ c -> 0x008f }
            int r9 = r0.f3234b
            int r10 = P0.z.r(r9)
            int r12 = r0.f3235c
            int r9 = P0.z.A(r12, r9)
            int r0 = r0.f3233a
            r13 = r2
            r14 = r4
            r4 = r11
            r15 = 0
            r11 = r10
            r10 = r0
            r0 = 0
            goto L_0x00ec
        L_0x008f:
            r0 = move-exception
            r2 = r0
            V0.k r0 = new V0.k
            r0.<init>((N0.c) r2, (M0.r) r3)
            throw r0
        L_0x0097:
            N0.a r0 = new N0.a
            H3.i0 r2 = H3.i0.f2073Y
            r0.<init>(r2)
            int r2 = r1.f5656j
            if (r2 == 0) goto L_0x00a7
            V0.g r2 = r26.h(r27)
            goto L_0x00a9
        L_0x00a7:
            V0.g r2 = V0.g.f5520d
        L_0x00a9:
            int r11 = r1.f5656j
            if (r11 == 0) goto L_0x00ca
            boolean r11 = r2.f5521a
            if (r11 == 0) goto L_0x00ca
            r8.getClass()
            java.lang.String r4 = r3.f3033k
            int r4 = M0.I.d(r8, r4)
            int r10 = P0.z.r(r10)
            boolean r2 = r2.f5522b
            r13 = r0
            r15 = r2
            r12 = r4
            r11 = r10
            r0 = 1
            r4 = -1
            r14 = 1
        L_0x00c7:
            r10 = r9
            r9 = -1
            goto L_0x00ec
        L_0x00ca:
            V0.d r2 = r1.f5669w
            M0.e r10 = r1.z
            android.util.Pair r2 = r2.d(r10, r3)
            if (r2 == 0) goto L_0x0277
            java.lang.Object r10 = r2.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r13 = r0
            r11 = r2
            r14 = r4
            r12 = r10
            r0 = 2
            r4 = -1
            r15 = 0
            goto L_0x00c7
        L_0x00ec:
            java.lang.String r2 = ") for: "
            if (r12 == 0) goto L_0x025c
            if (r11 == 0) goto L_0x0240
            java.lang.String r2 = "audio/vnd.dts.hd;profile=lbr"
            boolean r2 = r2.equals(r8)
            int r8 = r3.f3032j
            if (r2 == 0) goto L_0x0101
            if (r8 != r5) goto L_0x0101
            r8 = 768000(0xbb800, float:1.076197E-39)
        L_0x0101:
            int r2 = android.media.AudioTrack.getMinBufferSize(r10, r11, r12)
            r7 = -2
            if (r2 == r7) goto L_0x010a
            r7 = 1
            goto L_0x010b
        L_0x010a:
            r7 = 0
        L_0x010b:
            P0.l.j(r7)
            if (r9 == r5) goto L_0x0112
            r7 = r9
            goto L_0x0113
        L_0x0112:
            r7 = 1
        L_0x0113:
            if (r14 == 0) goto L_0x0118
            r17 = 4620693217682128896(0x4020000000000000, double:8.0)
            goto L_0x011a
        L_0x0118:
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x011a:
            V0.z r5 = r1.f5660n
            r5.getClass()
            r20 = 1000000(0xf4240, double:4.940656E-318)
            if (r0 == 0) goto L_0x01dd
            if (r0 == r6) goto L_0x01c7
            r5 = 2
            if (r0 != r5) goto L_0x01c1
            r5 = 5
            r6 = 8
            if (r12 != r5) goto L_0x0133
            r5 = 500000(0x7a120, float:7.00649E-40)
        L_0x0131:
            r6 = -1
            goto L_0x013d
        L_0x0133:
            if (r12 != r6) goto L_0x0139
            r5 = 1000000(0xf4240, float:1.401298E-39)
            goto L_0x0131
        L_0x0139:
            r5 = 250000(0x3d090, float:3.50325E-40)
            goto L_0x0131
        L_0x013d:
            if (r8 == r6) goto L_0x01a6
            java.math.RoundingMode r6 = java.math.RoundingMode.CEILING
            r6.getClass()
            int r22 = r8 / 8
            r19 = 8
            int r23 = r19 * r22
            int r23 = r8 - r23
            if (r23 != 0) goto L_0x014f
            goto L_0x019b
        L_0x014f:
            r8 = r8 ^ 8
            int r8 = r8 >> 31
            r16 = 1
            r8 = r8 | 1
            int[] r24 = J3.d.f2503a
            int r25 = r6.ordinal()
            r24 = r24[r25]
            switch(r24) {
                case 1: goto L_0x0199;
                case 2: goto L_0x019b;
                case 3: goto L_0x0194;
                case 4: goto L_0x0196;
                case 5: goto L_0x0191;
                case 6: goto L_0x0168;
                case 7: goto L_0x0168;
                case 8: goto L_0x0168;
                default: goto L_0x0162;
            }
        L_0x0162:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0168:
            int r23 = java.lang.Math.abs(r23)
            r19 = 8
            int r19 = java.lang.Math.abs(r19)
            int r19 = r19 - r23
            int r23 = r23 - r19
            if (r23 != 0) goto L_0x018e
            java.math.RoundingMode r3 = java.math.RoundingMode.HALF_UP
            if (r6 == r3) goto L_0x0196
            java.math.RoundingMode r3 = java.math.RoundingMode.HALF_EVEN
            if (r6 != r3) goto L_0x0182
            r3 = 1
            goto L_0x0183
        L_0x0182:
            r3 = 0
        L_0x0183:
            r6 = r22 & 1
            if (r6 == 0) goto L_0x0189
            r6 = 1
            goto L_0x018a
        L_0x0189:
            r6 = 0
        L_0x018a:
            r3 = r3 & r6
            if (r3 == 0) goto L_0x019b
            goto L_0x0196
        L_0x018e:
            if (r23 <= 0) goto L_0x019b
            goto L_0x0196
        L_0x0191:
            if (r8 <= 0) goto L_0x019b
            goto L_0x0196
        L_0x0194:
            if (r8 >= 0) goto L_0x019b
        L_0x0196:
            int r22 = r22 + r8
            goto L_0x019b
        L_0x0199:
            if (r23 != 0) goto L_0x019e
        L_0x019b:
            r3 = r22
            goto L_0x01ab
        L_0x019e:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r2 = "mode was UNNECESSARY, but rounding was necessary"
            r0.<init>(r2)
            throw r0
        L_0x01a6:
            int r22 = V0.z.c(r12)
            goto L_0x019b
        L_0x01ab:
            long r5 = (long) r5
            r19 = r14
            r22 = r15
            long r14 = (long) r3
            long r5 = r5 * r14
            long r5 = r5 / r20
            int r3 = E.e.c(r5)
        L_0x01b9:
            r8 = r10
            r24 = r11
            r28 = r12
            r23 = r13
            goto L_0x020c
        L_0x01c1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x01c7:
            r19 = r14
            r22 = r15
            int r3 = V0.z.c(r12)
            r5 = 50000000(0x2faf080, float:3.6872239E-37)
            long r5 = (long) r5
            long r14 = (long) r3
            long r5 = r5 * r14
            long r5 = r5 / r20
            int r3 = E.e.c(r5)
            goto L_0x01b9
        L_0x01dd:
            r19 = r14
            r22 = r15
            int r3 = r2 * 4
            r5 = 250000(0x3d090, float:3.50325E-40)
            long r5 = (long) r5
            long r14 = (long) r10
            long r5 = r5 * r14
            r28 = r12
            r23 = r13
            long r12 = (long) r7
            long r5 = r5 * r12
            long r5 = r5 / r20
            int r5 = E.e.c(r5)
            r6 = 750000(0xb71b0, float:1.050974E-39)
            r8 = r10
            r24 = r11
            long r10 = (long) r6
            long r10 = r10 * r14
            long r10 = r10 * r12
            long r10 = r10 / r20
            int r6 = E.e.c(r10)
            int r3 = P0.z.i(r3, r5, r6)
        L_0x020c:
            double r5 = (double) r3
            double r5 = r5 * r17
            int r3 = (int) r5
            int r2 = java.lang.Math.max(r2, r3)
            int r2 = r2 + r7
            r3 = 1
            int r2 = r2 - r3
            int r2 = r2 / r7
            int r10 = r2 * r7
            r2 = 0
            r1.f5647d0 = r2
            V0.s r15 = new V0.s
            boolean r14 = r1.f5641a0
            r2 = r15
            r3 = r27
            r5 = r0
            r6 = r9
            r7 = r8
            r8 = r24
            r9 = r28
            r11 = r23
            r12 = r19
            r13 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r26.o()
            if (r0 == 0) goto L_0x023d
            r1.f5665s = r15
            goto L_0x023f
        L_0x023d:
            r1.f5666t = r15
        L_0x023f:
            return
        L_0x0240:
            V0.k r3 = new V0.k
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid output channel config (mode="
            r4.<init>(r5)
            r4.append(r0)
            r4.append(r2)
            r5 = r27
            r4.append(r5)
            java.lang.String r0 = r4.toString()
            r3.<init>((java.lang.String) r0, (M0.r) r5)
            throw r3
        L_0x025c:
            r5 = r3
            V0.k r3 = new V0.k
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid output encoding (mode="
            r4.<init>(r6)
            r4.append(r0)
            r4.append(r2)
            r4.append(r5)
            java.lang.String r0 = r4.toString()
            r3.<init>((java.lang.String) r0, (M0.r) r5)
            throw r3
        L_0x0277:
            r5 = r3
            V0.k r0 = new V0.k
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to configure passthrough for: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.<init>((java.lang.String) r2, (M0.r) r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.y.d(M0.r, int[]):void");
    }

    public final void e(long j7) {
        int i8;
        P p3;
        A a8;
        boolean z6;
        boolean z8;
        if (this.f5631R != null) {
            v vVar = this.f5659m;
            boolean z9 = false;
            if (((Exception) vVar.f5608c) != null) {
                synchronized (f5611j0) {
                    if (f5613l0 > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
                if (z8 || SystemClock.elapsedRealtime() < vVar.f5607b) {
                    return;
                }
            }
            int remaining = this.f5631R.remaining();
            if (this.f5641a0) {
                if (j7 != -9223372036854775807L) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                l.j(z6);
                if (j7 == Long.MIN_VALUE) {
                    j7 = this.f5643b0;
                } else {
                    this.f5643b0 = j7;
                }
                AudioTrack audioTrack = this.f5668v;
                ByteBuffer byteBuffer = this.f5631R;
                if (z.f3748a >= 26) {
                    i8 = audioTrack.write(byteBuffer, remaining, 1, j7 * 1000);
                } else {
                    if (this.f5618E == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.f5618E = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.f5618E.putInt(1431633921);
                    }
                    if (this.f5619F == 0) {
                        this.f5618E.putInt(4, remaining);
                        this.f5618E.putLong(8, j7 * 1000);
                        this.f5618E.position(0);
                        this.f5619F = remaining;
                    }
                    int remaining2 = this.f5618E.remaining();
                    if (remaining2 > 0) {
                        int write = audioTrack.write(this.f5618E, remaining2, 1);
                        if (write < 0) {
                            this.f5619F = 0;
                            i8 = write;
                        } else if (write < remaining2) {
                            i8 = 0;
                        }
                    }
                    i8 = audioTrack.write(byteBuffer, remaining, 1);
                    if (i8 < 0) {
                        this.f5619F = 0;
                    } else {
                        this.f5619F -= i8;
                    }
                }
            } else {
                i8 = this.f5668v.write(this.f5631R, remaining, 1);
            }
            this.f5645c0 = SystemClock.elapsedRealtime();
            if (i8 < 0) {
                if ((z.f3748a >= 24 && i8 == -6) || i8 == -32) {
                    if (k() <= 0) {
                        if (p(this.f5668v)) {
                            if (this.f5666t.f5593c == 1) {
                                this.f5647d0 = true;
                            }
                        }
                    }
                    z9 = true;
                }
                m mVar = new m(i8, this.f5666t.f5591a, z9);
                P p8 = this.f5664r;
                if (p8 != null) {
                    p8.B0(mVar);
                }
                if (!mVar.f5538V) {
                    vVar.g(mVar);
                } else {
                    this.f5669w = C0339d.f5512c;
                    throw mVar;
                }
            } else {
                vVar.f5608c = null;
                vVar.f5606a = -9223372036854775807L;
                vVar.f5607b = -9223372036854775807L;
                if (p(this.f5668v)) {
                    if (this.f5623J > 0) {
                        this.f5648e0 = false;
                    }
                    if (this.f5635V && (p3 = this.f5664r) != null && i8 < remaining && !this.f5648e0 && (a8 = ((B) p3.f2027U).f8871z0) != null) {
                        a8.f4603a.f4627F0 = true;
                    }
                }
                int i9 = this.f5666t.f5593c;
                if (i9 == 0) {
                    this.f5622I += (long) i8;
                }
                if (i8 == remaining) {
                    if (i9 != 0) {
                        if (this.f5631R == this.f5629P) {
                            z9 = true;
                        }
                        l.j(z9);
                        this.f5623J = (((long) this.f5624K) * ((long) this.f5630Q)) + this.f5623J;
                    }
                    this.f5631R = null;
                }
            }
        }
    }

    public final boolean f() {
        if (!this.f5667u.e()) {
            e(Long.MIN_VALUE);
            if (this.f5631R == null) {
                return true;
            }
            return false;
        }
        a aVar = this.f5667u;
        if (aVar.e() && !aVar.f3232d) {
            aVar.f3232d = true;
            ((d) aVar.f3230b.get(0)).c();
        }
        t(Long.MIN_VALUE);
        if (!this.f5667u.d()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f5631R;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public final void g() {
        q0 q0Var;
        if (o()) {
            this.f5620G = 0;
            this.f5621H = 0;
            this.f5622I = 0;
            this.f5623J = 0;
            this.f5648e0 = false;
            this.f5624K = 0;
            this.f5615B = new t(this.f5616C, 0, 0);
            this.f5627N = 0;
            this.f5614A = null;
            this.f5653h.clear();
            this.f5629P = null;
            this.f5630Q = 0;
            this.f5631R = null;
            this.f5633T = false;
            this.f5632S = false;
            this.f5634U = false;
            this.f5618E = null;
            this.f5619F = 0;
            this.f5646d.f5507o = 0;
            a aVar = this.f5666t.i;
            this.f5667u = aVar;
            aVar.b();
            AudioTrack audioTrack = this.f5651g.f5562c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f5668v.pause();
            }
            if (p(this.f5668v)) {
                q0 q0Var2 = this.f5657k;
                q0Var2.getClass();
                this.f5668v.unregisterStreamEventCallback((x) q0Var2.f301W);
                ((Handler) q0Var2.f300V).removeCallbacksAndMessages((Object) null);
            }
            j a8 = this.f5666t.a();
            s sVar = this.f5665s;
            if (sVar != null) {
                this.f5666t = sVar;
                this.f5665s = null;
            }
            p pVar = this.f5651g;
            pVar.d();
            pVar.f5562c = null;
            pVar.e = null;
            if (z.f3748a >= 24 && (q0Var = this.f5671y) != null) {
                u uVar = (u) q0Var.f302X;
                uVar.getClass();
                ((AudioTrack) q0Var.f300V).removeOnRoutingChangedListener(uVar);
                q0Var.f302X = null;
                this.f5671y = null;
            }
            AudioTrack audioTrack2 = this.f5668v;
            P p3 = this.f5664r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f5611j0) {
                try {
                    if (f5612k0 == null) {
                        f5612k0 = Executors.newSingleThreadScheduledExecutor(new Object());
                    }
                    f5613l0++;
                    f5612k0.schedule(new B7.e(audioTrack2, p3, handler, a8, 4), 20, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            this.f5668v = null;
        }
        v vVar = this.f5659m;
        vVar.f5608c = null;
        vVar.f5606a = -9223372036854775807L;
        vVar.f5607b = -9223372036854775807L;
        v vVar2 = this.f5658l;
        vVar2.f5608c = null;
        vVar2.f5606a = -9223372036854775807L;
        vVar2.f5607b = -9223372036854775807L;
        this.f5652g0 = 0;
        this.f5654h0 = 0;
        Handler handler2 = this.f5655i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
        }
    }

    /* JADX WARNING: type inference failed for: r9v8, types: [D2.k, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [D2.k, java.lang.Object] */
    public final g h(r rVar) {
        int i8;
        boolean z6;
        boolean z8;
        if (this.f5647d0) {
            return g.f5520d;
        }
        C0117e eVar = this.z;
        c cVar = this.f5661o;
        cVar.getClass();
        rVar.getClass();
        eVar.getClass();
        int i9 = z.f3748a;
        if (i9 < 29 || (i8 = rVar.f3015D) == -1) {
            return g.f5520d;
        }
        Boolean bool = (Boolean) cVar.f4337W;
        boolean z9 = false;
        if (bool != null) {
            z6 = bool.booleanValue();
        } else {
            Context context = (Context) cVar.f4336V;
            if (context != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    String parameters = audioManager.getParameters("offloadVariableRateSupported");
                    if (parameters == null || !parameters.equals("offloadVariableRateSupported=1")) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    cVar.f4337W = Boolean.valueOf(z8);
                } else {
                    cVar.f4337W = Boolean.FALSE;
                }
            } else {
                cVar.f4337W = Boolean.FALSE;
            }
            z6 = ((Boolean) cVar.f4337W).booleanValue();
        }
        String str = rVar.f3036n;
        str.getClass();
        int d8 = I.d(str, rVar.f3033k);
        if (d8 == 0 || i9 < z.p(d8)) {
            return g.f5520d;
        }
        int r8 = z.r(rVar.f3014C);
        if (r8 == 0) {
            return g.f5520d;
        }
        try {
            AudioFormat q7 = z.q(i8, r8, d8);
            if (i9 >= 31) {
                int c8 = AudioManager.getPlaybackOffloadSupport(q7, (AudioAttributes) eVar.a().f2027U);
                if (c8 == 0) {
                    return g.f5520d;
                }
                ? obj = new Object();
                if (i9 > 32 && c8 == 2) {
                    z9 = true;
                }
                obj.f1095a = true;
                obj.f1096b = z9;
                obj.f1097c = z6;
                return obj.a();
            } else if (!AudioManager.isOffloadedPlaybackSupported(q7, (AudioAttributes) eVar.a().f2027U)) {
                return g.f5520d;
            } else {
                ? obj2 = new Object();
                obj2.f1095a = true;
                obj2.f1097c = z6;
                return obj2.a();
            }
        } catch (IllegalArgumentException unused) {
            return g.f5520d;
        }
    }

    public final int i(r rVar) {
        q();
        if ("audio/raw".equals(rVar.f3036n)) {
            int i8 = rVar.f3016E;
            if (!z.K(i8)) {
                g.u(i8, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            } else if (i8 != 2) {
                return 1;
            } else {
                return 2;
            }
        } else if (this.f5669w.d(this.z, rVar) != null) {
            return 2;
        } else {
            return 0;
        }
    }

    public final long j() {
        s sVar = this.f5666t;
        if (sVar.f5593c == 0) {
            return this.f5620G / ((long) sVar.f5592b);
        }
        return this.f5621H;
    }

    public final long k() {
        s sVar = this.f5666t;
        if (sVar.f5593c != 0) {
            return this.f5623J;
        }
        long j7 = this.f5622I;
        long j8 = (long) sVar.f5594d;
        int i8 = z.f3748a;
        return ((j7 + j8) - 1) / j8;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0218, code lost:
        r14 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0284, code lost:
        if (((r4.get(r27.position() + 5) & 248) >> 3) <= 10) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0294, code lost:
        if (((r4.get(r27.position() + 4) & 192) >> 6) != 3) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0297, code lost:
        r9 = (r4.get(r27.position() + 4) & 48) >> 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02a5, code lost:
        r5 = p1.C1332b.f14342c[r9] * 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02ad, code lost:
        r14 = 1536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010d, code lost:
        if (r10.b() == 0) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0270  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(long r24, int r26, java.nio.ByteBuffer r27) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r0 = r26
            r4 = r27
            java.nio.ByteBuffer r5 = r1.f5629P
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0013
            if (r4 != r5) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = 0
            goto L_0x0014
        L_0x0013:
            r5 = 1
        L_0x0014:
            P0.l.d(r5)
            V0.s r5 = r1.f5665s
            r8 = 0
            r9 = 3
            V0.p r10 = r1.f5651g
            if (r5 == 0) goto L_0x00a6
            boolean r5 = r23.f()
            if (r5 != 0) goto L_0x0026
            return r7
        L_0x0026:
            V0.s r5 = r1.f5665s
            V0.s r11 = r1.f5666t
            r5.getClass()
            int r12 = r11.f5593c
            int r13 = r5.f5593c
            if (r12 != r13) goto L_0x0096
            int r12 = r11.f5596g
            int r13 = r5.f5596g
            if (r12 != r13) goto L_0x0096
            int r12 = r11.e
            int r13 = r5.e
            if (r12 != r13) goto L_0x0096
            int r12 = r11.f5595f
            int r13 = r5.f5595f
            if (r12 != r13) goto L_0x0096
            int r12 = r11.f5594d
            int r13 = r5.f5594d
            if (r12 != r13) goto L_0x0096
            boolean r12 = r11.f5598j
            boolean r13 = r5.f5598j
            if (r12 != r13) goto L_0x0096
            boolean r11 = r11.f5599k
            boolean r5 = r5.f5599k
            if (r11 != r5) goto L_0x0096
            V0.s r5 = r1.f5665s
            r1.f5666t = r5
            r1.f5665s = r8
            android.media.AudioTrack r5 = r1.f5668v
            if (r5 == 0) goto L_0x00a3
            boolean r5 = p(r5)
            if (r5 == 0) goto L_0x00a3
            V0.s r5 = r1.f5666t
            boolean r5 = r5.f5599k
            if (r5 == 0) goto L_0x00a3
            android.media.AudioTrack r5 = r1.f5668v
            int r5 = r5.getPlayState()
            if (r5 != r9) goto L_0x0086
            android.media.AudioTrack r5 = r1.f5668v
            r5.setOffloadEndOfStream()
            r10.f5557G = r6
            V0.o r5 = r10.e
            if (r5 == 0) goto L_0x0086
            V0.n r5 = r5.f5546a
            if (r5 == 0) goto L_0x0086
            r5.f5544f = r6
        L_0x0086:
            android.media.AudioTrack r5 = r1.f5668v
            V0.s r11 = r1.f5666t
            M0.r r11 = r11.f5591a
            int r12 = r11.f3017F
            int r11 = r11.f3018G
            r5.setOffloadDelayPadding(r12, r11)
            r1.f5648e0 = r6
            goto L_0x00a3
        L_0x0096:
            r23.s()
            boolean r5 = r23.m()
            if (r5 == 0) goto L_0x00a0
            return r7
        L_0x00a0:
            r23.g()
        L_0x00a3:
            r23.a(r24)
        L_0x00a6:
            boolean r5 = r23.o()
            V0.v r11 = r1.f5658l
            if (r5 != 0) goto L_0x00c0
            boolean r5 = r23.n()     // Catch:{ l -> 0x00b5 }
            if (r5 != 0) goto L_0x00c0
            return r7
        L_0x00b5:
            r0 = move-exception
            r2 = r0
            boolean r0 = r2.f5536V
            if (r0 != 0) goto L_0x00bf
            r11.g(r2)
            return r7
        L_0x00bf:
            throw r2
        L_0x00c0:
            r11.f5608c = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.f5606a = r12
            r11.f5607b = r12
            boolean r5 = r1.f5626M
            r14 = 0
            if (r5 == 0) goto L_0x00ee
            long r12 = java.lang.Math.max(r14, r2)
            r1.f5627N = r12
            r1.f5625L = r7
            r1.f5626M = r7
            boolean r5 = r23.x()
            if (r5 == 0) goto L_0x00e4
            r23.v()
        L_0x00e4:
            r23.a(r24)
            boolean r5 = r1.f5635V
            if (r5 == 0) goto L_0x00ee
            r23.r()
        L_0x00ee:
            long r11 = r23.k()
            android.media.AudioTrack r5 = r10.f5562c
            r5.getClass()
            int r5 = r5.getPlayState()
            boolean r13 = r10.f5565g
            r8 = 2
            if (r13 == 0) goto L_0x0110
            if (r5 != r8) goto L_0x0105
            r10.f5572o = r7
            goto L_0x010f
        L_0x0105:
            if (r5 != r6) goto L_0x0110
            long r16 = r10.b()
            int r13 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x0110
        L_0x010f:
            return r7
        L_0x0110:
            boolean r13 = r10.f5572o
            boolean r11 = r10.c(r11)
            r10.f5572o = r11
            if (r13 == 0) goto L_0x0152
            if (r11 != 0) goto L_0x0152
            if (r5 == r6) goto L_0x0152
            int r5 = r10.f5563d
            long r11 = r10.f5566h
            long r19 = P0.z.c0(r11)
            H3.P r11 = r10.f5560a
            java.lang.Object r11 = r11.f2027U
            V0.y r11 = (V0.y) r11
            H3.P r12 = r11.f5664r
            if (r12 == 0) goto L_0x0152
            long r12 = android.os.SystemClock.elapsedRealtime()
            long r14 = r11.f5645c0
            long r21 = r12 - r14
            H3.P r11 = r11.f5664r
            java.lang.Object r11 = r11.f2027U
            V0.B r11 = (V0.B) r11
            V0.i r11 = r11.f5482x1
            android.os.Handler r12 = r11.f5527b
            if (r12 == 0) goto L_0x0152
            V0.h r13 = new V0.h
            r16 = r13
            r17 = r11
            r18 = r5
            r16.<init>((V0.i) r17, (int) r18, (long) r19, (long) r21)
            r12.post(r13)
        L_0x0152:
            java.nio.ByteBuffer r5 = r1.f5629P
            if (r5 != 0) goto L_0x0439
            java.nio.ByteOrder r5 = r27.order()
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r5 != r11) goto L_0x0160
            r5 = 1
            goto L_0x0161
        L_0x0160:
            r5 = 0
        L_0x0161:
            P0.l.d(r5)
            boolean r5 = r27.hasRemaining()
            if (r5 != 0) goto L_0x016b
            return r6
        L_0x016b:
            V0.s r5 = r1.f5666t
            int r11 = r5.f5593c
            if (r11 == 0) goto L_0x0393
            int r11 = r1.f5624K
            if (r11 != 0) goto L_0x0393
            r11 = 20
            r12 = 5
            int r5 = r5.f5596g
            if (r5 == r11) goto L_0x032f
            r11 = 30
            r13 = -2
            r14 = 1024(0x400, float:1.435E-42)
            r15 = -1
            if (r5 == r11) goto L_0x0276
            r11 = 10
            switch(r5) {
                case 5: goto L_0x0278;
                case 6: goto L_0x0278;
                case 7: goto L_0x0276;
                case 8: goto L_0x0276;
                case 9: goto L_0x021f;
                case 10: goto L_0x038e;
                case 11: goto L_0x021b;
                case 12: goto L_0x021b;
                default: goto L_0x0189;
            }
        L_0x0189:
            r8 = 16
            switch(r5) {
                case 14: goto L_0x01b7;
                case 15: goto L_0x01b3;
                case 16: goto L_0x038e;
                case 17: goto L_0x019a;
                case 18: goto L_0x0278;
                default: goto L_0x018e;
            }
        L_0x018e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected audio encoding: "
            java.lang.String r2 = Q0.g.m(r5, r2)
            r0.<init>(r2)
            throw r0
        L_0x019a:
            byte[] r5 = new byte[r8]
            int r9 = r27.position()
            r4.get(r5)
            r4.position(r9)
            N1.f r9 = new N1.f
            r9.<init>((int) r8, (byte[]) r5)
            F2.h r5 = p1.C1332b.o(r9)
            int r14 = r5.f1529c
            goto L_0x038e
        L_0x01b3:
            r14 = 512(0x200, float:7.175E-43)
            goto L_0x038e
        L_0x01b7:
            int r5 = r27.position()
            int r9 = r27.limit()
            int r9 = r9 - r11
            r11 = r5
        L_0x01c1:
            if (r11 > r9) goto L_0x01e3
            int r12 = r11 + 4
            int r12 = r4.getInt(r12)
            java.nio.ByteOrder r14 = r27.order()
            java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN
            if (r14 != r7) goto L_0x01d2
            goto L_0x01d6
        L_0x01d2:
            int r12 = java.lang.Integer.reverseBytes(r12)
        L_0x01d6:
            r7 = r12 & -2
            r12 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r7 != r12) goto L_0x01df
            int r11 = r11 - r5
            goto L_0x01e4
        L_0x01df:
            int r11 = r11 + 1
            r7 = 0
            goto L_0x01c1
        L_0x01e3:
            r11 = -1
        L_0x01e4:
            if (r11 != r15) goto L_0x01e9
            r14 = 0
            goto L_0x038e
        L_0x01e9:
            int r5 = r27.position()
            int r5 = r5 + r11
            int r5 = r5 + 7
            byte r5 = r4.get(r5)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r7 = 187(0xbb, float:2.62E-43)
            if (r5 != r7) goto L_0x01fc
            r5 = 1
            goto L_0x01fd
        L_0x01fc:
            r5 = 0
        L_0x01fd:
            int r7 = r27.position()
            int r7 = r7 + r11
            if (r5 == 0) goto L_0x0207
            r5 = 9
            goto L_0x0209
        L_0x0207:
            r5 = 8
        L_0x0209:
            int r7 = r7 + r5
            byte r5 = r4.get(r7)
            int r5 = r5 >> 4
            r5 = r5 & 7
            r7 = 40
            int r5 = r7 << r5
            int r5 = r5 * 16
        L_0x0218:
            r14 = r5
            goto L_0x038e
        L_0x021b:
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x038e
        L_0x021f:
            int r5 = r27.position()
            int r5 = r4.getInt(r5)
            java.nio.ByteOrder r7 = r27.order()
            java.nio.ByteOrder r12 = java.nio.ByteOrder.BIG_ENDIAN
            if (r7 != r12) goto L_0x0230
            goto L_0x0234
        L_0x0230:
            int r5 = java.lang.Integer.reverseBytes(r5)
        L_0x0234:
            r7 = -2097152(0xffffffffffe00000, float:NaN)
            r12 = r5 & r7
            if (r12 != r7) goto L_0x023f
            int r7 = r5 >>> 19
            r7 = r7 & r9
            if (r7 != r6) goto L_0x0241
        L_0x023f:
            r14 = -1
            goto L_0x026c
        L_0x0241:
            int r12 = r5 >>> 17
            r12 = r12 & r9
            if (r12 != 0) goto L_0x0247
            goto L_0x023f
        L_0x0247:
            int r13 = r5 >>> 12
            r14 = 15
            r13 = r13 & r14
            int r5 = r5 >>> r11
            r5 = r5 & r9
            if (r13 == 0) goto L_0x023f
            if (r13 == r14) goto L_0x023f
            if (r5 != r9) goto L_0x0255
            goto L_0x023f
        L_0x0255:
            r5 = 1152(0x480, float:1.614E-42)
            if (r12 == r6) goto L_0x0266
            if (r12 == r8) goto L_0x026b
            if (r12 != r9) goto L_0x0260
            r5 = 384(0x180, float:5.38E-43)
            goto L_0x026b
        L_0x0260:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0266:
            if (r7 != r9) goto L_0x0269
            goto L_0x026b
        L_0x0269:
            r5 = 576(0x240, float:8.07E-43)
        L_0x026b:
            r14 = r5
        L_0x026c:
            if (r14 == r15) goto L_0x0270
            goto L_0x038e
        L_0x0270:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0276:
            r5 = 0
            goto L_0x02b3
        L_0x0278:
            int r5 = r27.position()
            int r5 = r5 + r12
            byte r5 = r4.get(r5)
            r5 = r5 & 248(0xf8, float:3.48E-43)
            int r5 = r5 >> r9
            if (r5 <= r11) goto L_0x02ad
            int r5 = r27.position()
            int r5 = r5 + 4
            byte r5 = r4.get(r5)
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r5 = r5 >> 6
            if (r5 != r9) goto L_0x0297
            goto L_0x02a5
        L_0x0297:
            int r5 = r27.position()
            int r5 = r5 + 4
            byte r5 = r4.get(r5)
            r5 = r5 & 48
            int r9 = r5 >> 4
        L_0x02a5:
            int[] r5 = p1.C1332b.f14342c
            r5 = r5[r9]
            int r5 = r5 * 256
            goto L_0x0218
        L_0x02ad:
            r5 = 1536(0x600, float:2.152E-42)
            r14 = 1536(0x600, float:2.152E-42)
            goto L_0x038e
        L_0x02b3:
            int r7 = r4.getInt(r5)
            r9 = -233094848(0xfffffffff21b4140, float:-3.0751398E30)
            if (r7 == r9) goto L_0x038e
            int r7 = r4.getInt(r5)
            r9 = -398277519(0xffffffffe842c471, float:-3.6790512E24)
            if (r7 != r9) goto L_0x02c7
            goto L_0x038e
        L_0x02c7:
            int r7 = r4.getInt(r5)
            r5 = 622876772(0x25205864, float:1.3907736E-16)
            if (r7 != r5) goto L_0x02d4
            r14 = 4096(0x1000, float:5.74E-42)
            goto L_0x038e
        L_0x02d4:
            int r5 = r27.position()
            byte r7 = r4.get(r5)
            if (r7 == r13) goto L_0x031b
            if (r7 == r15) goto L_0x030a
            r9 = 31
            if (r7 == r9) goto L_0x02f7
            int r7 = r5 + 4
            byte r7 = r4.get(r7)
            r7 = r7 & r6
            int r7 = r7 << 6
            int r5 = r5 + r12
            byte r5 = r4.get(r5)
        L_0x02f2:
            r5 = r5 & 252(0xfc, float:3.53E-43)
        L_0x02f4:
            int r5 = r5 >> r8
            r5 = r5 | r7
            goto L_0x032b
        L_0x02f7:
            int r7 = r5 + 5
            byte r7 = r4.get(r7)
            r7 = r7 & 7
            int r7 = r7 << 4
            int r5 = r5 + 6
            byte r5 = r4.get(r5)
        L_0x0307:
            r5 = r5 & 60
            goto L_0x02f4
        L_0x030a:
            int r7 = r5 + 4
            byte r7 = r4.get(r7)
            r7 = r7 & 7
            int r7 = r7 << 4
            int r5 = r5 + 7
            byte r5 = r4.get(r5)
            goto L_0x0307
        L_0x031b:
            int r7 = r5 + 5
            byte r7 = r4.get(r7)
            r7 = r7 & r6
            int r7 = r7 << 6
            int r5 = r5 + 4
            byte r5 = r4.get(r5)
            goto L_0x02f2
        L_0x032b:
            int r5 = r5 + r6
            int r14 = r5 * 32
            goto L_0x038e
        L_0x032f:
            byte r5 = r4.get(r12)
            r5 = r5 & r8
            if (r5 != 0) goto L_0x0338
            r5 = 0
            goto L_0x0365
        L_0x0338:
            r5 = 26
            byte r5 = r4.get(r5)
            r7 = 28
            r8 = 0
            r9 = 28
        L_0x0343:
            if (r8 >= r5) goto L_0x034f
            int r11 = r8 + 27
            byte r11 = r4.get(r11)
            int r9 = r9 + r11
            int r8 = r8 + 1
            goto L_0x0343
        L_0x034f:
            int r5 = r9 + 26
            byte r5 = r4.get(r5)
            r8 = 0
        L_0x0356:
            if (r8 >= r5) goto L_0x0363
            int r11 = r9 + 27
            int r11 = r11 + r8
            byte r11 = r4.get(r11)
            int r7 = r7 + r11
            int r8 = r8 + 1
            goto L_0x0356
        L_0x0363:
            int r5 = r9 + r7
        L_0x0365:
            int r7 = r5 + 26
            byte r7 = r4.get(r7)
            int r7 = r7 + 27
            int r7 = r7 + r5
            byte r5 = r4.get(r7)
            int r8 = r27.limit()
            int r8 = r8 - r7
            if (r8 <= r6) goto L_0x037f
            int r7 = r7 + r6
            byte r7 = r4.get(r7)
            goto L_0x0380
        L_0x037f:
            r7 = 0
        L_0x0380:
            long r7 = p1.C1332b.k(r5, r7)
            r11 = 48000(0xbb80, double:2.3715E-319)
            long r7 = r7 * r11
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r11
            int r14 = (int) r7
        L_0x038e:
            r1.f5624K = r14
            if (r14 != 0) goto L_0x0393
            return r6
        L_0x0393:
            V0.t r5 = r1.f5614A
            if (r5 == 0) goto L_0x03a5
            boolean r5 = r23.f()
            if (r5 != 0) goto L_0x039f
            r5 = 0
            return r5
        L_0x039f:
            r23.a(r24)
            r5 = 0
            r1.f5614A = r5
        L_0x03a5:
            long r7 = r1.f5627N
            V0.s r5 = r1.f5666t
            long r11 = r23.j()
            V0.F r9 = r1.f5646d
            long r13 = r9.f5507o
            long r11 = r11 - r13
            M0.r r5 = r5.f5591a
            int r5 = r5.f3015D
            long r11 = P0.z.U(r5, r11)
            long r11 = r11 + r7
            boolean r5 = r1.f5625L
            if (r5 != 0) goto L_0x03f0
            long r7 = r11 - r2
            long r7 = java.lang.Math.abs(r7)
            r13 = 200000(0x30d40, double:9.8813E-319)
            int r5 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x03f0
            H3.P r5 = r1.f5664r
            if (r5 == 0) goto L_0x03ee
            B.m r7 = new B.m
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Unexpected audio track timestamp discontinuity: expected "
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r9 = ", got "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            r5.B0(r7)
        L_0x03ee:
            r1.f5625L = r6
        L_0x03f0:
            boolean r5 = r1.f5625L
            if (r5 == 0) goto L_0x0419
            boolean r5 = r23.f()
            if (r5 != 0) goto L_0x03fc
            r5 = 0
            return r5
        L_0x03fc:
            r5 = 0
            long r7 = r2 - r11
            long r11 = r1.f5627N
            long r11 = r11 + r7
            r1.f5627N = r11
            r1.f5625L = r5
            r23.a(r24)
            H3.P r5 = r1.f5664r
            if (r5 == 0) goto L_0x0419
            r11 = 0
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0419
            java.lang.Object r5 = r5.f2027U
            V0.B r5 = (V0.B) r5
            r5.f5478G1 = r6
        L_0x0419:
            V0.s r5 = r1.f5666t
            int r5 = r5.f5593c
            if (r5 != 0) goto L_0x042a
            long r7 = r1.f5620G
            int r5 = r27.remaining()
            long r11 = (long) r5
            long r7 = r7 + r11
            r1.f5620G = r7
            goto L_0x0435
        L_0x042a:
            long r7 = r1.f5621H
            int r5 = r1.f5624K
            long r11 = (long) r5
            long r13 = (long) r0
            long r11 = r11 * r13
            long r11 = r11 + r7
            r1.f5621H = r11
        L_0x0435:
            r1.f5629P = r4
            r1.f5630Q = r0
        L_0x0439:
            r23.t(r24)
            java.nio.ByteBuffer r0 = r1.f5629P
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x044b
            r0 = 0
            r1.f5629P = r0
            r2 = 0
            r1.f5630Q = r2
            return r6
        L_0x044b:
            long r2 = r23.k()
            long r4 = r10.f5582y
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x047d
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x047d
            P0.t r0 = r10.f5559I
            r0.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.f5582y
            long r2 = r2 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x047d
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            P0.l.B(r0, r2)
            r23.g()
            return r6
        L_0x047d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.y.l(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean m() {
        if (!o() || ((z.f3748a >= 29 && this.f5668v.isOffloadedPlayback() && this.f5634U) || !this.f5651g.c(k()))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A[SYNTHETIC, Splitter:B:17:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n() {
        /*
            r20 = this;
            r1 = r20
            V0.v r0 = r1.f5658l
            java.lang.Object r2 = r0.f5608c
            java.lang.Exception r2 = (java.lang.Exception) r2
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x0028
        L_0x000e:
            java.lang.Object r2 = f5611j0
            monitor-enter(r2)
            int r5 = f5613l0     // Catch:{ all -> 0x01a9 }
            if (r5 <= 0) goto L_0x0017
            r5 = 1
            goto L_0x0018
        L_0x0017:
            r5 = 0
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x01a9 }
            if (r5 == 0) goto L_0x001d
        L_0x001b:
            r0 = 1
            goto L_0x0028
        L_0x001d:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r7 = r0.f5607b
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x000c
            goto L_0x001b
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            return r3
        L_0x002b:
            V0.s r0 = r1.f5666t     // Catch:{ l -> 0x0035 }
            r0.getClass()     // Catch:{ l -> 0x0035 }
            android.media.AudioTrack r0 = r1.c(r0)     // Catch:{ l -> 0x0035 }
            goto L_0x0071
        L_0x0035:
            r0 = move-exception
            r2 = r0
            V0.s r0 = r1.f5666t
            int r5 = r0.f5597h
            r6 = 1000000(0xf4240, float:1.401298E-39)
            if (r5 <= r6) goto L_0x01a0
            V0.s r5 = new V0.s
            boolean r6 = r0.f5600l
            M0.r r8 = r0.f5591a
            int r9 = r0.f5592b
            int r10 = r0.f5593c
            int r11 = r0.f5594d
            int r12 = r0.e
            int r13 = r0.f5595f
            int r14 = r0.f5596g
            N0.a r15 = r0.i
            boolean r7 = r0.f5598j
            boolean r0 = r0.f5599k
            r16 = 1000000(0xf4240, float:1.401298E-39)
            r17 = r7
            r7 = r5
            r18 = r15
            r15 = r16
            r16 = r18
            r18 = r0
            r19 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            android.media.AudioTrack r0 = r1.c(r5)     // Catch:{ l -> 0x019c }
            r1.f5666t = r5     // Catch:{ l -> 0x019c }
        L_0x0071:
            r1.f5668v = r0
            boolean r0 = p(r0)
            if (r0 == 0) goto L_0x00ac
            android.media.AudioTrack r0 = r1.f5668v
            B.q0 r2 = r1.f5657k
            if (r2 != 0) goto L_0x0086
            B.q0 r2 = new B.q0
            r2.<init>((V0.y) r1)
            r1.f5657k = r2
        L_0x0086:
            B.q0 r2 = r1.f5657k
            java.lang.Object r5 = r2.f300V
            android.os.Handler r5 = (android.os.Handler) r5
            j$.util.Objects.requireNonNull(r5)
            V0.w r6 = new V0.w
            r6.<init>(r5)
            java.lang.Object r2 = r2.f301W
            V0.x r2 = (V0.x) r2
            r0.registerStreamEventCallback(r6, r2)
            V0.s r0 = r1.f5666t
            boolean r2 = r0.f5599k
            if (r2 == 0) goto L_0x00ac
            android.media.AudioTrack r2 = r1.f5668v
            M0.r r0 = r0.f5591a
            int r5 = r0.f3017F
            int r0 = r0.f3018G
            r2.setOffloadDelayPadding(r5, r0)
        L_0x00ac:
            int r0 = P0.z.f3748a
            r2 = 31
            if (r0 < r2) goto L_0x00cc
            U0.j r2 = r1.f5663q
            if (r2 == 0) goto L_0x00cc
            android.media.AudioTrack r5 = r1.f5668v
            U0.i r2 = r2.f5373b
            r2.getClass()
            android.media.metrics.LogSessionId r2 = r2.f5371a
            android.media.metrics.LogSessionId r6 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x00cc
            r5.setLogSessionId(r2)
        L_0x00cc:
            android.media.AudioTrack r2 = r1.f5668v
            int r2 = r2.getAudioSessionId()
            r1.f5637X = r2
            android.media.AudioTrack r2 = r1.f5668v
            V0.s r5 = r1.f5666t
            int r6 = r5.f5593c
            r7 = 2
            if (r6 != r7) goto L_0x00df
            r6 = 1
            goto L_0x00e0
        L_0x00df:
            r6 = 0
        L_0x00e0:
            int r7 = r5.f5596g
            int r8 = r5.f5594d
            int r5 = r5.f5597h
            V0.p r9 = r1.f5651g
            r9.f5562c = r2
            r9.f5563d = r5
            V0.o r10 = new V0.o
            r10.<init>(r2)
            r9.e = r10
            int r2 = r2.getSampleRate()
            r9.f5564f = r2
            r2 = 23
            if (r6 == 0) goto L_0x0107
            if (r0 >= r2) goto L_0x0107
            r6 = 5
            if (r7 == r6) goto L_0x0105
            r6 = 6
            if (r7 != r6) goto L_0x0107
        L_0x0105:
            r6 = 1
            goto L_0x0108
        L_0x0107:
            r6 = 0
        L_0x0108:
            r9.f5565g = r6
            boolean r6 = P0.z.K(r7)
            r9.f5573p = r6
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L_0x0120
            int r5 = r5 / r8
            long r5 = (long) r5
            int r7 = r9.f5564f
            long r5 = P0.z.U(r7, r5)
            goto L_0x0121
        L_0x0120:
            r5 = r10
        L_0x0121:
            r9.f5566h = r5
            r5 = 0
            r9.f5576s = r5
            r9.f5577t = r5
            r9.f5557G = r3
            r9.f5558H = r5
            r9.f5578u = r5
            r9.f5572o = r3
            r9.f5581x = r10
            r9.f5582y = r10
            r9.f5574q = r5
            r9.f5571n = r5
            r3 = 1065353216(0x3f800000, float:1.0)
            r9.i = r3
            boolean r3 = r20.o()
            if (r3 == 0) goto L_0x014a
            android.media.AudioTrack r3 = r1.f5668v
            float r5 = r1.f5628O
            r3.setVolume(r5)
        L_0x014a:
            M0.f r3 = r1.f5638Y
            r3.getClass()
            H3.P r3 = r1.f5639Z
            if (r3 == 0) goto L_0x016b
            if (r0 < r2) goto L_0x016b
            android.media.AudioTrack r2 = r1.f5668v
            java.lang.Object r3 = r3.f2027U
            android.media.AudioDeviceInfo r3 = (android.media.AudioDeviceInfo) r3
            r2.setPreferredDevice(r3)
            G5.m r2 = r1.f5670x
            if (r2 == 0) goto L_0x016b
            H3.P r3 = r1.f5639Z
            java.lang.Object r3 = r3.f2027U
            android.media.AudioDeviceInfo r3 = (android.media.AudioDeviceInfo) r3
            r2.o(r3)
        L_0x016b:
            r2 = 24
            if (r0 < r2) goto L_0x017c
            G5.m r0 = r1.f5670x
            if (r0 == 0) goto L_0x017c
            B.q0 r2 = new B.q0
            android.media.AudioTrack r3 = r1.f5668v
            r2.<init>((android.media.AudioTrack) r3, (G5.m) r0)
            r1.f5671y = r2
        L_0x017c:
            r1.f5626M = r4
            H3.P r0 = r1.f5664r
            if (r0 == 0) goto L_0x019b
            V0.s r2 = r1.f5666t
            V0.j r2 = r2.a()
            java.lang.Object r0 = r0.f2027U
            V0.B r0 = (V0.B) r0
            V0.i r0 = r0.f5482x1
            android.os.Handler r3 = r0.f5527b
            if (r3 == 0) goto L_0x019b
            V0.h r5 = new V0.h
            r6 = 1
            r5.<init>((V0.i) r0, (java.lang.Object) r2, (int) r6)
            r3.post(r5)
        L_0x019b:
            return r4
        L_0x019c:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x01a0:
            V0.s r0 = r1.f5666t
            int r0 = r0.f5593c
            if (r0 != r4) goto L_0x01a8
            r1.f5647d0 = r4
        L_0x01a8:
            throw r2
        L_0x01a9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01a9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.y.n():boolean");
    }

    public final boolean o() {
        if (this.f5668v != null) {
            return true;
        }
        return false;
    }

    public final void q() {
        Context context;
        C0339d dVar;
        C0340e eVar;
        if (this.f5670x == null && (context = this.f5640a) != null) {
            this.f5650f0 = Looper.myLooper();
            m mVar = new m(context, new B(27, this), this.z, this.f5639Z);
            this.f5670x = mVar;
            if (mVar.f1712b) {
                dVar = (C0339d) mVar.f1717h;
                dVar.getClass();
            } else {
                mVar.f1712b = true;
                C0341f fVar = (C0341f) mVar.f1716g;
                if (fVar != null) {
                    fVar.f5517a.registerContentObserver(fVar.f5518b, false, fVar);
                }
                int i8 = z.f3748a;
                Handler handler = (Handler) mVar.f1711a;
                Context context2 = (Context) mVar.f1713c;
                if (i8 >= 23 && (eVar = (C0340e) mVar.e) != null) {
                    AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
                    audioManager.getClass();
                    audioManager.registerAudioDeviceCallback(eVar, handler);
                }
                dVar = C0339d.c(context2, context2.registerReceiver((f) mVar.f1715f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), (String) null, handler), (C0117e) mVar.f1718j, (P) mVar.i);
                mVar.f1717h = dVar;
            }
            this.f5669w = dVar;
        }
    }

    public final void r() {
        this.f5635V = true;
        if (o()) {
            p pVar = this.f5651g;
            if (pVar.f5581x != -9223372036854775807L) {
                pVar.f5559I.getClass();
                pVar.f5581x = z.O(SystemClock.elapsedRealtime());
            }
            o oVar = pVar.e;
            oVar.getClass();
            oVar.a();
            this.f5668v.play();
        }
    }

    public final void s() {
        if (!this.f5633T) {
            this.f5633T = true;
            long k8 = k();
            p pVar = this.f5651g;
            pVar.z = pVar.b();
            pVar.f5559I.getClass();
            pVar.f5581x = z.O(SystemClock.elapsedRealtime());
            pVar.f5551A = k8;
            if (p(this.f5668v)) {
                this.f5634U = false;
            }
            this.f5668v.stop();
            this.f5619F = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r0 = r3.f5629P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r0 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r0.hasRemaining() != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        r0 = r3.f5667u;
        r1 = r3.f5629P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        if (r0.e() == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r0.f3232d == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        r0.f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(long r4) {
        /*
            r3 = this;
            r3.e(r4)
            java.nio.ByteBuffer r0 = r3.f5631R
            if (r0 == 0) goto L_0x0008
            return
        L_0x0008:
            N0.a r0 = r3.f5667u
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x001b
            java.nio.ByteBuffer r0 = r3.f5629P
            if (r0 == 0) goto L_0x001a
            r3.w(r0)
            r3.e(r4)
        L_0x001a:
            return
        L_0x001b:
            N0.a r0 = r3.f5667u
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x007a
        L_0x0023:
            N0.a r0 = r3.f5667u
            boolean r1 = r0.e()
            if (r1 != 0) goto L_0x002e
            java.nio.ByteBuffer r0 = N0.d.f3237a
            goto L_0x004b
        L_0x002e:
            java.nio.ByteBuffer[] r1 = r0.f3231c
            int r2 = r0.c()
            r1 = r1[r2]
            boolean r2 = r1.hasRemaining()
            if (r2 == 0) goto L_0x003e
            r0 = r1
            goto L_0x004b
        L_0x003e:
            java.nio.ByteBuffer r1 = N0.d.f3237a
            r0.f(r1)
            java.nio.ByteBuffer[] r1 = r0.f3231c
            int r0 = r0.c()
            r0 = r1[r0]
        L_0x004b:
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L_0x005c
            r3.w(r0)
            r3.e(r4)
            java.nio.ByteBuffer r0 = r3.f5631R
            if (r0 == 0) goto L_0x0023
            return
        L_0x005c:
            java.nio.ByteBuffer r0 = r3.f5629P
            if (r0 == 0) goto L_0x007a
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x0067
            goto L_0x007a
        L_0x0067:
            N0.a r0 = r3.f5667u
            java.nio.ByteBuffer r1 = r3.f5629P
            boolean r2 = r0.e()
            if (r2 == 0) goto L_0x001b
            boolean r2 = r0.f3232d
            if (r2 == 0) goto L_0x0076
            goto L_0x001b
        L_0x0076:
            r0.f(r1)
            goto L_0x001b
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.y.t(long):void");
    }

    public final void u() {
        g();
        M o2 = this.e.listIterator(0);
        while (o2.hasNext()) {
            ((d) o2.next()).a();
        }
        M o8 = this.f5649f.listIterator(0);
        while (o8.hasNext()) {
            ((d) o8.next()).a();
        }
        a aVar = this.f5667u;
        if (aVar != null) {
            int i8 = 0;
            while (true) {
                i0 i0Var = aVar.f3229a;
                if (i8 >= i0Var.size()) {
                    break;
                }
                d dVar = (d) i0Var.get(i8);
                dVar.flush();
                dVar.a();
                i8++;
            }
            aVar.f3231c = new ByteBuffer[0];
            b bVar = b.e;
            aVar.f3232d = false;
        }
        this.f5635V = false;
        this.f5647d0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.f5668v.setPlaybackParams(B3.a.i().allowDefaults().setSpeed(this.f5616C.f2846a).setPitch(this.f5616C.f2847b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e8) {
                l.C("DefaultAudioSink", "Failed to set playback params", e8);
            }
            L l8 = new L(this.f5668v.getPlaybackParams().getSpeed(), this.f5668v.getPlaybackParams().getPitch());
            this.f5616C = l8;
            float f8 = l8.f2846a;
            p pVar = this.f5651g;
            pVar.i = f8;
            o oVar = pVar.e;
            if (oVar != null) {
                oVar.a();
            }
            pVar.d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0055 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(java.nio.ByteBuffer r17) {
        /*
            r16 = this;
            r0 = r16
            java.nio.ByteBuffer r1 = r0.f5631R
            if (r1 != 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            P0.l.j(r1)
            boolean r1 = r17.hasRemaining()
            if (r1 != 0) goto L_0x0013
            return
        L_0x0013:
            V0.s r1 = r0.f5666t
            int r1 = r1.f5593c
            if (r1 == 0) goto L_0x001d
        L_0x0019:
            r3 = r17
            goto L_0x01fd
        L_0x001d:
            r1 = 20
            long r3 = P0.z.O(r1)
            V0.s r1 = r0.f5666t
            int r1 = r1.e
            long r5 = (long) r1
            r7 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r9 = java.math.RoundingMode.UP
            long r1 = P0.z.W(r3, r5, r7, r9)
            int r2 = (int) r1
            long r3 = r16.k()
            long r5 = (long) r2
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x003c
            goto L_0x0019
        L_0x003c:
            V0.s r1 = r0.f5666t
            int r7 = r1.f5596g
            int r4 = (int) r3
            int r3 = r17.remaining()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)
            java.nio.ByteOrder r8 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r3 = r3.order(r8)
            int r8 = r17.position()
        L_0x0055:
            boolean r9 = r17.hasRemaining()
            if (r9 == 0) goto L_0x01f5
            if (r4 >= r2) goto L_0x01f5
            r12 = 1342177280(0x50000000, float:8.5899346E9)
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            r14 = 22
            r15 = 21
            r9 = 4
            r10 = 3
            r11 = 2
            if (r7 == r11) goto L_0x0129
            if (r7 == r10) goto L_0x0120
            if (r7 == r9) goto L_0x0105
            if (r7 == r15) goto L_0x00ef
            if (r7 == r14) goto L_0x00ce
            if (r7 == r13) goto L_0x00bd
            if (r7 == r12) goto L_0x00a3
            r12 = 1610612736(0x60000000, float:3.6893488E19)
            if (r7 != r12) goto L_0x009d
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            r12 = r12 | r13
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 8
            r12 = r12 | r13
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
        L_0x009a:
            r12 = r12 | r13
            goto L_0x0136
        L_0x009d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00a3:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            r12 = r12 | r13
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 8
            goto L_0x009a
        L_0x00bd:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            goto L_0x009a
        L_0x00ce:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 8
            r12 = r12 | r13
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            r12 = r12 | r13
            byte r13 = r17.get()
        L_0x00ea:
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 24
            goto L_0x009a
        L_0x00ef:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            r12 = r12 | r13
            byte r13 = r17.get()
            goto L_0x00ea
        L_0x0105:
            float r12 = r17.getFloat()
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            r14 = 1065353216(0x3f800000, float:1.0)
            float r12 = P0.z.h(r12, r13, r14)
            r13 = 0
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x011d
            float r12 = -r12
            r13 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
        L_0x0119:
            float r12 = r12 * r13
            int r12 = (int) r12
            goto L_0x0136
        L_0x011d:
            r13 = 1325400064(0x4f000000, float:2.14748365E9)
            goto L_0x0119
        L_0x0120:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            goto L_0x0136
        L_0x0129:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 16
            byte r13 = r17.get()
            goto L_0x00ea
        L_0x0136:
            long r12 = (long) r12
            long r9 = (long) r4
            long r12 = r12 * r9
            long r12 = r12 / r5
            int r9 = (int) r12
            if (r7 == r11) goto L_0x01d8
            r10 = 3
            if (r7 == r10) goto L_0x01d1
            r10 = 4
            if (r7 == r10) goto L_0x01be
            if (r7 == r15) goto L_0x01ab
            r10 = 22
            if (r7 == r10) goto L_0x0194
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            if (r7 == r10) goto L_0x0187
            r10 = 1342177280(0x50000000, float:8.5899346E9)
            if (r7 == r10) goto L_0x0174
            r10 = 1610612736(0x60000000, float:3.6893488E19)
            if (r7 != r10) goto L_0x016e
            int r10 = r9 >> 24
            byte r10 = (byte) r10
            r3.put(r10)
            int r10 = r9 >> 16
            byte r10 = (byte) r10
            r3.put(r10)
            int r10 = r9 >> 8
            byte r10 = (byte) r10
            r3.put(r10)
            byte r9 = (byte) r9
            r3.put(r9)
            goto L_0x01e4
        L_0x016e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0174:
            int r10 = r9 >> 24
            byte r10 = (byte) r10
            r3.put(r10)
            int r10 = r9 >> 16
            byte r10 = (byte) r10
            r3.put(r10)
            int r9 = r9 >> 8
            byte r9 = (byte) r9
            r3.put(r9)
            goto L_0x01e4
        L_0x0187:
            int r10 = r9 >> 24
            byte r10 = (byte) r10
            r3.put(r10)
            int r9 = r9 >> 16
            byte r9 = (byte) r9
            r3.put(r9)
            goto L_0x01e4
        L_0x0194:
            byte r10 = (byte) r9
            r3.put(r10)
            int r10 = r9 >> 8
            byte r10 = (byte) r10
            r3.put(r10)
            int r10 = r9 >> 16
            byte r10 = (byte) r10
            r3.put(r10)
            int r9 = r9 >> 24
            byte r9 = (byte) r9
            r3.put(r9)
            goto L_0x01e4
        L_0x01ab:
            int r10 = r9 >> 8
            byte r10 = (byte) r10
            r3.put(r10)
            int r10 = r9 >> 16
            byte r10 = (byte) r10
            r3.put(r10)
            int r9 = r9 >> 24
            byte r9 = (byte) r9
            r3.put(r9)
            goto L_0x01e4
        L_0x01be:
            if (r9 >= 0) goto L_0x01c9
            float r9 = (float) r9
            float r9 = -r9
            r10 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            float r9 = r9 / r10
            r3.putFloat(r9)
            goto L_0x01e4
        L_0x01c9:
            float r9 = (float) r9
            r10 = 1325400064(0x4f000000, float:2.14748365E9)
            float r9 = r9 / r10
            r3.putFloat(r9)
            goto L_0x01e4
        L_0x01d1:
            int r9 = r9 >> 24
            byte r9 = (byte) r9
            r3.put(r9)
            goto L_0x01e4
        L_0x01d8:
            int r10 = r9 >> 16
            byte r10 = (byte) r10
            r3.put(r10)
            int r9 = r9 >> 24
            byte r9 = (byte) r9
            r3.put(r9)
        L_0x01e4:
            int r9 = r17.position()
            int r10 = r1.f5594d
            int r10 = r10 + r8
            if (r9 != r10) goto L_0x0055
            int r4 = r4 + 1
            int r8 = r17.position()
            goto L_0x0055
        L_0x01f5:
            r1 = r17
            r3.put(r1)
            r3.flip()
        L_0x01fd:
            r0.f5631R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.y.w(java.nio.ByteBuffer):void");
    }

    public final boolean x() {
        s sVar = this.f5666t;
        if (sVar == null || !sVar.f5598j || z.f3748a < 23) {
            return false;
        }
        return true;
    }
}
