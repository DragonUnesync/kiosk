package V1;

import P0.l;
import P0.r;
import Q0.q;
import R2.c;
import T0.C;
import p1.G;

public final class n implements i {

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f5820l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final c f5821a;

    /* renamed from: b  reason: collision with root package name */
    public final r f5822b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean[] f5823c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    public final l f5824d;
    public final C e;

    /* renamed from: f  reason: collision with root package name */
    public m f5825f;

    /* renamed from: g  reason: collision with root package name */
    public long f5826g;

    /* renamed from: h  reason: collision with root package name */
    public String f5827h;
    public G i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5828j;

    /* renamed from: k  reason: collision with root package name */
    public long f5829k;

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, V1.l] */
    public n(c cVar) {
        this.f5821a = cVar;
        ? obj = new Object();
        obj.e = new byte[128];
        this.f5824d = obj;
        this.f5829k = -9223372036854775807L;
        this.e = new C(178);
        this.f5822b = new r();
    }

    public final void a() {
        q.a(this.f5823c);
        l lVar = this.f5824d;
        lVar.f5809a = false;
        lVar.f5811c = 0;
        lVar.f5810b = 0;
        m mVar = this.f5825f;
        if (mVar != null) {
            mVar.f5814b = false;
            mVar.f5815c = false;
            mVar.f5816d = false;
            mVar.e = -1;
        }
        C c8 = this.e;
        if (c8 != null) {
            c8.g();
        }
        this.f5826g = 0;
        this.f5829k = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0253  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(P0.r r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = 3
            r4 = 1
            V1.m r5 = r0.f5825f
            P0.l.k(r5)
            p1.G r5 = r0.i
            P0.l.k(r5)
            int r5 = r1.f3733b
            int r6 = r1.f3734c
            byte[] r7 = r1.f3732a
            long r8 = r0.f5826g
            int r10 = r19.a()
            long r10 = (long) r10
            long r8 = r8 + r10
            r0.f5826g = r8
            p1.G r8 = r0.i
            int r9 = r19.a()
            r8.a(r9, r1)
        L_0x0029:
            boolean[] r8 = r0.f5823c
            int r8 = Q0.q.b(r7, r5, r6, r8)
            V1.l r9 = r0.f5824d
            T0.C r10 = r0.e
            if (r8 != r6) goto L_0x0047
            boolean r1 = r0.f5828j
            if (r1 != 0) goto L_0x003c
            r9.a(r7, r5, r6)
        L_0x003c:
            V1.m r1 = r0.f5825f
            r1.a(r7, r5, r6)
            if (r10 == 0) goto L_0x0046
            r10.a(r7, r5, r6)
        L_0x0046:
            return
        L_0x0047:
            byte[] r11 = r1.f3732a
            int r12 = r8 + 3
            byte r11 = r11[r12]
            r13 = r11 & 255(0xff, float:3.57E-43)
            int r14 = r8 - r5
            boolean r15 = r0.f5828j
            if (r15 != 0) goto L_0x01e4
            if (r14 <= 0) goto L_0x005a
            r9.a(r7, r5, r8)
        L_0x005a:
            if (r14 >= 0) goto L_0x005e
            int r15 = -r14
            goto L_0x005f
        L_0x005e:
            r15 = 0
        L_0x005f:
            int r3 = r9.f5810b
            if (r3 == 0) goto L_0x01cf
            java.lang.String r2 = "H263Reader"
            r16 = r12
            java.lang.String r12 = "Unexpected start code value"
            if (r3 == r4) goto L_0x01ba
            r4 = 2
            if (r3 == r4) goto L_0x01a5
            r4 = 4
            r17 = r6
            r6 = 3
            if (r3 == r6) goto L_0x018c
            if (r3 != r4) goto L_0x0186
            r3 = 179(0xb3, float:2.51E-43)
            if (r13 == r3) goto L_0x007e
            r3 = 181(0xb5, float:2.54E-43)
            if (r13 != r3) goto L_0x01dc
        L_0x007e:
            int r3 = r9.f5811c
            int r3 = r3 - r15
            r9.f5811c = r3
            r3 = 0
            r9.f5809a = r3
            p1.G r3 = r0.i
            int r6 = r9.f5812d
            java.lang.String r11 = r0.f5827h
            r11.getClass()
            byte[] r12 = r9.e
            int r9 = r9.f5811c
            byte[] r9 = java.util.Arrays.copyOf(r12, r9)
            N1.f r12 = new N1.f
            int r15 = r9.length
            r12.<init>((int) r15, (byte[]) r9)
            r12.v(r6)
            r12.v(r4)
            r12.t()
            r6 = 8
            r12.u(r6)
            boolean r15 = r12.h()
            if (r15 == 0) goto L_0x00b8
            r12.u(r4)
            r15 = 3
            r12.u(r15)
        L_0x00b8:
            int r4 = r12.i(r4)
            java.lang.String r15 = "Invalid aspect ratio"
            r1 = 15
            if (r4 != r1) goto L_0x00d5
            int r4 = r12.i(r6)
            int r6 = r12.i(r6)
            if (r6 != 0) goto L_0x00d0
            P0.l.B(r2, r15)
            goto L_0x00e0
        L_0x00d0:
            float r4 = (float) r4
            float r6 = (float) r6
            float r15 = r4 / r6
            goto L_0x00e2
        L_0x00d5:
            r6 = 7
            if (r4 >= r6) goto L_0x00dd
            float[] r6 = f5820l
            r15 = r6[r4]
            goto L_0x00e2
        L_0x00dd:
            P0.l.B(r2, r15)
        L_0x00e0:
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x00e2:
            boolean r4 = r12.h()
            if (r4 == 0) goto L_0x011a
            r4 = 2
            r12.u(r4)
            r4 = 1
            r12.u(r4)
            boolean r4 = r12.h()
            if (r4 == 0) goto L_0x011a
            r12.u(r1)
            r12.t()
            r12.u(r1)
            r12.t()
            r12.u(r1)
            r12.t()
            r4 = 3
            r12.u(r4)
            r4 = 11
            r12.u(r4)
            r12.t()
            r12.u(r1)
            r12.t()
        L_0x011a:
            r1 = 2
            int r4 = r12.i(r1)
            if (r4 == 0) goto L_0x0126
            java.lang.String r1 = "Unhandled video object layer shape"
            P0.l.B(r2, r1)
        L_0x0126:
            r12.t()
            r1 = 16
            int r1 = r12.i(r1)
            r12.t()
            boolean r4 = r12.h()
            if (r4 == 0) goto L_0x014c
            if (r1 != 0) goto L_0x0140
            java.lang.String r1 = "Invalid vop_increment_time_resolution"
            P0.l.B(r2, r1)
            goto L_0x014c
        L_0x0140:
            int r1 = r1 + -1
            r2 = 0
        L_0x0143:
            if (r1 <= 0) goto L_0x0149
            r4 = 1
            int r2 = r2 + r4
            int r1 = r1 >> r4
            goto L_0x0143
        L_0x0149:
            r12.u(r2)
        L_0x014c:
            r12.t()
            r1 = 13
            int r2 = r12.i(r1)
            r12.t()
            int r1 = r12.i(r1)
            r12.t()
            r12.t()
            M0.q r4 = new M0.q
            r4.<init>()
            r4.f2989a = r11
            java.lang.String r6 = "video/mp4v-es"
            java.lang.String r6 = M0.I.o(r6)
            r4.f2999m = r6
            r4.f3006t = r2
            r4.f3007u = r1
            r4.f3010x = r15
            java.util.List r1 = java.util.Collections.singletonList(r9)
            r4.f3002p = r1
            Q0.g.v(r4, r3)
            r1 = 1
            r0.f5828j = r1
        L_0x0183:
            r3 = 3
            goto L_0x01e9
        L_0x0186:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x018c:
            r1 = r11 & 240(0xf0, float:3.36E-43)
            r3 = 32
            if (r1 == r3) goto L_0x019d
            P0.l.B(r2, r12)
            r1 = 0
            r9.f5809a = r1
            r9.f5811c = r1
            r9.f5810b = r1
            goto L_0x01dc
        L_0x019d:
            r1 = 0
            int r2 = r9.f5811c
            r9.f5812d = r2
            r9.f5810b = r4
            goto L_0x01dc
        L_0x01a5:
            r17 = r6
            r1 = 0
            r3 = 31
            if (r13 <= r3) goto L_0x01b6
            P0.l.B(r2, r12)
            r9.f5809a = r1
            r9.f5811c = r1
            r9.f5810b = r1
            goto L_0x01dc
        L_0x01b6:
            r2 = 3
            r9.f5810b = r2
            goto L_0x01dc
        L_0x01ba:
            r17 = r6
            r1 = 0
            r3 = 181(0xb5, float:2.54E-43)
            if (r13 == r3) goto L_0x01cb
            P0.l.B(r2, r12)
            r9.f5809a = r1
            r9.f5811c = r1
            r9.f5810b = r1
            goto L_0x01dc
        L_0x01cb:
            r1 = 2
            r9.f5810b = r1
            goto L_0x01dc
        L_0x01cf:
            r17 = r6
            r16 = r12
            r1 = 176(0xb0, float:2.47E-43)
            if (r13 != r1) goto L_0x01dc
            r1 = 1
            r9.f5810b = r1
            r9.f5809a = r1
        L_0x01dc:
            byte[] r1 = V1.l.f5808f
            r2 = 0
            r3 = 3
            r9.a(r1, r2, r3)
            goto L_0x01e9
        L_0x01e4:
            r17 = r6
            r16 = r12
            goto L_0x0183
        L_0x01e9:
            V1.m r1 = r0.f5825f
            r1.a(r7, r5, r8)
            if (r10 == 0) goto L_0x022e
            if (r14 <= 0) goto L_0x01f7
            r10.a(r7, r5, r8)
            r1 = 0
            goto L_0x01f8
        L_0x01f7:
            int r1 = -r14
        L_0x01f8:
            boolean r1 = r10.e(r1)
            if (r1 == 0) goto L_0x021a
            java.lang.Object r1 = r10.f4612f
            byte[] r1 = (byte[]) r1
            int r2 = r10.e
            int r1 = Q0.q.k(r2, r1)
            int r2 = P0.z.f3748a
            java.lang.Object r2 = r10.f4612f
            byte[] r2 = (byte[]) r2
            P0.r r4 = r0.f5822b
            r4.F(r1, r2)
            long r1 = r0.f5829k
            R2.c r5 = r0.f5821a
            r5.J(r1, r4)
        L_0x021a:
            r1 = 178(0xb2, float:2.5E-43)
            if (r13 != r1) goto L_0x022e
            r1 = r19
            byte[] r2 = r1.f3732a
            r4 = 2
            int r5 = r8 + 2
            byte r2 = r2[r5]
            r5 = 1
            if (r2 != r5) goto L_0x0232
            r10.h(r13)
            goto L_0x0232
        L_0x022e:
            r1 = r19
            r4 = 2
            r5 = 1
        L_0x0232:
            int r6 = r17 - r8
            long r8 = r0.f5826g
            long r10 = (long) r6
            long r8 = r8 - r10
            V1.m r2 = r0.f5825f
            boolean r10 = r0.f5828j
            r2.b(r8, r6, r10)
            V1.m r2 = r0.f5825f
            long r8 = r0.f5829k
            r2.e = r13
            r6 = 0
            r2.f5816d = r6
            r6 = 182(0xb6, float:2.55E-43)
            if (r13 == r6) goto L_0x0253
            r10 = 179(0xb3, float:2.51E-43)
            if (r13 != r10) goto L_0x0251
            goto L_0x0253
        L_0x0251:
            r10 = 0
            goto L_0x0254
        L_0x0253:
            r10 = 1
        L_0x0254:
            r2.f5814b = r10
            if (r13 != r6) goto L_0x025a
            r6 = 1
            goto L_0x025b
        L_0x025a:
            r6 = 0
        L_0x025b:
            r2.f5815c = r6
            r6 = 0
            r2.f5817f = r6
            r2.f5819h = r8
            r5 = r16
            r6 = r17
            r4 = 1
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.n.e(P0.r):void");
    }

    public final void f(boolean z) {
        l.k(this.f5825f);
        if (z) {
            this.f5825f.b(this.f5826g, 0, this.f5828j);
            m mVar = this.f5825f;
            mVar.f5814b = false;
            mVar.f5815c = false;
            mVar.f5816d = false;
            mVar.e = -1;
        }
    }

    public final void g(int i8, long j7) {
        this.f5829k = j7;
    }

    public final void h(p1.q qVar, G g8) {
        g8.c();
        g8.d();
        this.f5827h = (String) g8.e;
        g8.d();
        G q7 = qVar.q(g8.f5716c, 2);
        this.i = q7;
        this.f5825f = new m(q7);
        this.f5821a.L(qVar, g8);
    }
}
