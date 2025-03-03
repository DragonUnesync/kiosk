package V1;

import P0.l;
import P0.r;
import Q0.q;
import R2.c;
import T0.C;
import p1.F;
import p1.G;

public final class k implements i {

    /* renamed from: q  reason: collision with root package name */
    public static final double[] f5793q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    public String f5794a;

    /* renamed from: b  reason: collision with root package name */
    public G f5795b;

    /* renamed from: c  reason: collision with root package name */
    public final c f5796c;

    /* renamed from: d  reason: collision with root package name */
    public final r f5797d;
    public final C e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f5798f = new boolean[4];

    /* renamed from: g  reason: collision with root package name */
    public final j f5799g;

    /* renamed from: h  reason: collision with root package name */
    public long f5800h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5801j;

    /* renamed from: k  reason: collision with root package name */
    public long f5802k;

    /* renamed from: l  reason: collision with root package name */
    public long f5803l;

    /* renamed from: m  reason: collision with root package name */
    public long f5804m;

    /* renamed from: n  reason: collision with root package name */
    public long f5805n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5806o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5807p;

    /* JADX WARNING: type inference failed for: r0v2, types: [V1.j, java.lang.Object] */
    public k(c cVar) {
        this.f5796c = cVar;
        ? obj = new Object();
        obj.f5792d = new byte[128];
        this.f5799g = obj;
        if (cVar != null) {
            this.e = new C(178);
            this.f5797d = new r();
        } else {
            this.e = null;
            this.f5797d = null;
        }
        this.f5803l = -9223372036854775807L;
        this.f5805n = -9223372036854775807L;
    }

    public final void a() {
        q.a(this.f5798f);
        j jVar = this.f5799g;
        jVar.f5789a = false;
        jVar.f5790b = 0;
        jVar.f5791c = 0;
        C c8 = this.e;
        if (c8 != null) {
            c8.g();
        }
        this.f5800h = 0;
        this.i = false;
        this.f5803l = -9223372036854775807L;
        this.f5805n = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(P0.r r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r3 = 4
            r5 = 3
            p1.G r6 = r0.f5795b
            P0.l.k(r6)
            int r6 = r1.f3733b
            int r7 = r1.f3734c
            byte[] r8 = r1.f3732a
            long r9 = r0.f5800h
            int r11 = r27.a()
            long r11 = (long) r11
            long r9 = r9 + r11
            r0.f5800h = r9
            p1.G r9 = r0.f5795b
            int r10 = r27.a()
            r9.a(r10, r1)
        L_0x0024:
            boolean[] r9 = r0.f5798f
            int r9 = Q0.q.b(r8, r6, r7, r9)
            V1.j r10 = r0.f5799g
            T0.C r11 = r0.e
            if (r9 != r7) goto L_0x003d
            boolean r1 = r0.f5801j
            if (r1 != 0) goto L_0x0037
            r10.a(r8, r6, r7)
        L_0x0037:
            if (r11 == 0) goto L_0x003c
            r11.a(r8, r6, r7)
        L_0x003c:
            return
        L_0x003d:
            byte[] r12 = r1.f3732a
            int r13 = r9 + 3
            byte r12 = r12[r13]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r14 = r9 - r6
            boolean r15 = r0.f5801j
            r4 = 0
            if (r15 != 0) goto L_0x0152
            if (r14 <= 0) goto L_0x0051
            r10.a(r8, r6, r9)
        L_0x0051:
            if (r14 >= 0) goto L_0x0055
            int r15 = -r14
            goto L_0x0056
        L_0x0055:
            r15 = 0
        L_0x0056:
            boolean r5 = r10.f5789a
            if (r5 == 0) goto L_0x013e
            int r5 = r10.f5790b
            int r5 = r5 - r15
            r10.f5790b = r5
            int r15 = r10.f5791c
            if (r15 != 0) goto L_0x0070
            r15 = 181(0xb5, float:2.54E-43)
            if (r12 != r15) goto L_0x0070
            r10.f5791c = r5
            r17 = r7
            r18 = r13
            r13 = r6
            goto L_0x014a
        L_0x0070:
            r10.f5789a = r4
            java.lang.String r5 = r0.f5794a
            r5.getClass()
            byte[] r15 = r10.f5792d
            int r4 = r10.f5790b
            byte[] r4 = java.util.Arrays.copyOf(r15, r4)
            byte r15 = r4[r3]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r16 = 5
            byte r2 = r4[r16]
            r3 = r2 & 255(0xff, float:3.57E-43)
            r17 = 6
            r18 = r13
            byte r13 = r4[r17]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r17 = r7
            r7 = 4
            int r15 = r15 << r7
            int r3 = r3 >> r7
            r3 = r3 | r15
            r2 = r2 & 15
            r15 = 8
            int r2 = r2 << r15
            r2 = r2 | r13
            r13 = 7
            byte r15 = r4[r13]
            r15 = r15 & 240(0xf0, float:3.36E-43)
            int r15 = r15 >> r7
            r13 = 2
            if (r15 == r13) goto L_0x00bc
            r13 = 3
            if (r15 == r13) goto L_0x00b6
            if (r15 == r7) goto L_0x00ae
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c5
        L_0x00ae:
            int r7 = r2 * 121
            float r7 = (float) r7
            int r13 = r3 * 100
        L_0x00b3:
            float r13 = (float) r13
            float r7 = r7 / r13
            goto L_0x00c5
        L_0x00b6:
            int r7 = r2 * 16
            float r7 = (float) r7
            int r13 = r3 * 9
            goto L_0x00b3
        L_0x00bc:
            int r13 = r2 * 4
            float r13 = (float) r13
            r15 = 3
            int r7 = r3 * 3
            float r7 = (float) r7
            float r7 = r13 / r7
        L_0x00c5:
            M0.q r13 = new M0.q
            r13.<init>()
            r13.f2989a = r5
            java.lang.String r5 = "video/mpeg2"
            java.lang.String r5 = M0.I.o(r5)
            r13.f2999m = r5
            r13.f3006t = r3
            r13.f3007u = r2
            r13.f3010x = r7
            java.util.List r2 = java.util.Collections.singletonList(r4)
            r13.f3002p = r2
            M0.r r2 = new M0.r
            r2.<init>(r13)
            r3 = 7
            byte r3 = r4[r3]
            r3 = r3 & 15
            r5 = 1
            int r3 = r3 - r5
            if (r3 < 0) goto L_0x011b
            r5 = 8
            if (r3 >= r5) goto L_0x011b
            double[] r5 = f5793q
            r19 = r5[r3]
            int r3 = r10.f5791c
            int r3 = r3 + 9
            byte r3 = r4[r3]
            r4 = r3 & 96
            int r4 = r4 >> 5
            r3 = r3 & 31
            if (r4 == r3) goto L_0x0111
            double r4 = (double) r4
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 + r21
            r7 = 1
            int r3 = r3 + r7
            r13 = r6
            double r6 = (double) r3
            double r4 = r4 / r6
            double r19 = r19 * r4
            goto L_0x0112
        L_0x0111:
            r13 = r6
        L_0x0112:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r19
            long r3 = (long) r3
            goto L_0x011e
        L_0x011b:
            r13 = r6
            r3 = 0
        L_0x011e:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            p1.G r3 = r0.f5795b
            java.lang.Object r4 = r2.first
            M0.r r4 = (M0.r) r4
            r3.c(r4)
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.f5802k = r2
            r2 = 1
            r0.f5801j = r2
            r4 = 3
            goto L_0x0158
        L_0x013e:
            r17 = r7
            r18 = r13
            r2 = 1
            r3 = 179(0xb3, float:2.51E-43)
            r13 = r6
            if (r12 != r3) goto L_0x014a
            r10.f5789a = r2
        L_0x014a:
            byte[] r2 = V1.j.e
            r3 = 0
            r4 = 3
            r10.a(r2, r3, r4)
            goto L_0x0158
        L_0x0152:
            r17 = r7
            r18 = r13
            r4 = 3
            r13 = r6
        L_0x0158:
            if (r11 == 0) goto L_0x0196
            if (r14 <= 0) goto L_0x0161
            r11.a(r8, r13, r9)
            r3 = 0
            goto L_0x0162
        L_0x0161:
            int r3 = -r14
        L_0x0162:
            boolean r2 = r11.e(r3)
            if (r2 == 0) goto L_0x0184
            java.lang.Object r2 = r11.f4612f
            byte[] r2 = (byte[]) r2
            int r3 = r11.e
            int r2 = Q0.q.k(r3, r2)
            int r3 = P0.z.f3748a
            java.lang.Object r3 = r11.f4612f
            byte[] r3 = (byte[]) r3
            P0.r r5 = r0.f5797d
            r5.F(r2, r3)
            long r2 = r0.f5805n
            R2.c r6 = r0.f5796c
            r6.J(r2, r5)
        L_0x0184:
            r2 = 178(0xb2, float:2.5E-43)
            if (r12 != r2) goto L_0x0196
            byte[] r2 = r1.f3732a
            r3 = 2
            int r5 = r9 + 2
            byte r2 = r2[r5]
            r5 = 1
            if (r2 != r5) goto L_0x0198
            r11.h(r12)
            goto L_0x0198
        L_0x0196:
            r3 = 2
            r5 = 1
        L_0x0198:
            if (r12 == 0) goto L_0x01a7
            r2 = 179(0xb3, float:2.51E-43)
            if (r12 != r2) goto L_0x019f
            goto L_0x01a7
        L_0x019f:
            r2 = 184(0xb8, float:2.58E-43)
            if (r12 != r2) goto L_0x01a5
            r0.f5806o = r5
        L_0x01a5:
            r3 = 1
            goto L_0x020a
        L_0x01a7:
            int r7 = r17 - r9
            boolean r2 = r0.f5807p
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x01d5
            boolean r2 = r0.f5801j
            if (r2 == 0) goto L_0x01d5
            long r9 = r0.f5805n
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x01d5
            boolean r2 = r0.f5806o
            long r13 = r0.f5800h
            long r3 = r0.f5804m
            long r13 = r13 - r3
            int r3 = (int) r13
            int r23 = r3 - r7
            p1.G r3 = r0.f5795b
            r25 = 0
            r19 = r3
            r20 = r9
            r22 = r2
            r24 = r7
            r19.e(r20, r22, r23, r24, r25)
        L_0x01d5:
            boolean r2 = r0.i
            if (r2 == 0) goto L_0x01e1
            boolean r2 = r0.f5807p
            if (r2 == 0) goto L_0x01de
            goto L_0x01e1
        L_0x01de:
            r2 = 0
            r3 = 1
            goto L_0x0203
        L_0x01e1:
            long r2 = r0.f5800h
            long r9 = (long) r7
            long r2 = r2 - r9
            r0.f5804m = r2
            long r2 = r0.f5803l
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x01ee
            goto L_0x01f9
        L_0x01ee:
            long r2 = r0.f5805n
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x01f8
            long r9 = r0.f5802k
            long r2 = r2 + r9
            goto L_0x01f9
        L_0x01f8:
            r2 = r5
        L_0x01f9:
            r0.f5805n = r2
            r2 = 0
            r0.f5806o = r2
            r0.f5803l = r5
            r3 = 1
            r0.i = r3
        L_0x0203:
            if (r12 != 0) goto L_0x0207
            r4 = 1
            goto L_0x0208
        L_0x0207:
            r4 = 0
        L_0x0208:
            r0.f5807p = r4
        L_0x020a:
            r7 = r17
            r6 = r18
            r3 = 4
            r5 = 3
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.k.e(P0.r):void");
    }

    public final void f(boolean z) {
        l.k(this.f5795b);
        if (z) {
            boolean z6 = this.f5806o;
            this.f5795b.e(this.f5805n, z6 ? 1 : 0, (int) (this.f5800h - this.f5804m), 0, (F) null);
        }
    }

    public final void g(int i8, long j7) {
        this.f5803l = j7;
    }

    public final void h(p1.q qVar, G g8) {
        g8.c();
        g8.d();
        this.f5794a = (String) g8.e;
        g8.d();
        this.f5795b = qVar.q(g8.f5716c, 2);
        c cVar = this.f5796c;
        if (cVar != null) {
            cVar.L(qVar, g8);
        }
    }
}
