package V1;

import N1.f;
import P0.r;
import p1.G;
import p1.q;

/* renamed from: V1.b  reason: case insensitive filesystem */
public final class C0343b implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5721a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5722b;

    /* renamed from: c  reason: collision with root package name */
    public final r f5723c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5724d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public String f5725f;

    /* renamed from: g  reason: collision with root package name */
    public G f5726g;

    /* renamed from: h  reason: collision with root package name */
    public int f5727h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5728j;

    /* renamed from: k  reason: collision with root package name */
    public long f5729k;

    /* renamed from: l  reason: collision with root package name */
    public M0.r f5730l;

    /* renamed from: m  reason: collision with root package name */
    public int f5731m;

    /* renamed from: n  reason: collision with root package name */
    public long f5732n;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0343b() {
        this((String) null, 0, 0);
        this.f5721a = 0;
    }

    private final void b(boolean z) {
    }

    private final void c(boolean z) {
    }

    public final void a() {
        switch (this.f5721a) {
            case 0:
                this.f5727h = 0;
                this.i = 0;
                this.f5728j = false;
                this.f5732n = -9223372036854775807L;
                return;
            default:
                this.f5727h = 0;
                this.i = 0;
                this.f5728j = false;
                this.f5732n = -9223372036854775807L;
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(P0.r r13) {
        /*
            r12 = this;
            int r0 = r12.f5721a
            switch(r0) {
                case 0: goto L_0x0128;
                default: goto L_0x0005;
            }
        L_0x0005:
            p1.G r0 = r12.f5726g
            P0.l.k(r0)
        L_0x000a:
            int r0 = r13.a()
            if (r0 <= 0) goto L_0x0127
            int r0 = r12.f5727h
            P0.r r1 = r12.f5723c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x00e3
            if (r0 == r3) goto L_0x005f
            if (r0 == r2) goto L_0x001e
            goto L_0x000a
        L_0x001e:
            int r0 = r13.a()
            int r1 = r12.f5731m
            int r2 = r12.i
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            p1.G r1 = r12.f5726g
            r1.a(r0, r13)
            int r1 = r12.i
            int r1 = r1 + r0
            r12.i = r1
            int r0 = r12.f5731m
            if (r1 != r0) goto L_0x000a
            long r0 = r12.f5732n
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            P0.l.j(r3)
            p1.G r5 = r12.f5726g
            long r6 = r12.f5732n
            int r9 = r12.f5731m
            r11 = 0
            r8 = 1
            r10 = 0
            r5.e(r6, r8, r9, r10, r11)
            long r0 = r12.f5732n
            long r2 = r12.f5729k
            long r0 = r0 + r2
            r12.f5732n = r0
            r12.f5727h = r4
            goto L_0x000a
        L_0x005f:
            byte[] r0 = r1.f3732a
            int r3 = r13.a()
            int r5 = r12.i
            r6 = 16
            int r5 = 16 - r5
            int r3 = java.lang.Math.min(r3, r5)
            int r5 = r12.i
            r13.g(r0, r5, r3)
            int r0 = r12.i
            int r0 = r0 + r3
            r12.i = r0
            if (r0 != r6) goto L_0x000a
            N1.f r0 = r12.f5722b
            r0.r(r4)
            F2.h r0 = p1.C1332b.o(r0)
            M0.r r3 = r12.f5730l
            java.lang.String r5 = "audio/ac4"
            int r7 = r0.f1527a
            if (r3 == 0) goto L_0x009c
            int r8 = r3.f3014C
            if (r2 != r8) goto L_0x009c
            int r8 = r3.f3015D
            if (r7 != r8) goto L_0x009c
            java.lang.String r3 = r3.f3036n
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x00c3
        L_0x009c:
            M0.q r3 = new M0.q
            r3.<init>()
            java.lang.String r8 = r12.f5725f
            r3.f2989a = r8
            java.lang.String r5 = M0.I.o(r5)
            r3.f2999m = r5
            r3.f2979B = r2
            r3.f2980C = r7
            java.lang.String r5 = r12.f5724d
            r3.f2992d = r5
            int r5 = r12.e
            r3.f2993f = r5
            M0.r r5 = new M0.r
            r5.<init>(r3)
            r12.f5730l = r5
            p1.G r3 = r12.f5726g
            r3.c(r5)
        L_0x00c3:
            int r3 = r0.f1528b
            r12.f5731m = r3
            int r0 = r0.f1529c
            long r7 = (long) r0
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r9
            M0.r r0 = r12.f5730l
            int r0 = r0.f3015D
            long r9 = (long) r0
            long r7 = r7 / r9
            r12.f5729k = r7
            r1.H(r4)
            p1.G r0 = r12.f5726g
            r0.a(r6, r1)
            r12.f5727h = r2
            goto L_0x000a
        L_0x00e3:
            int r0 = r13.a()
            if (r0 <= 0) goto L_0x000a
            boolean r0 = r12.f5728j
            r5 = 172(0xac, float:2.41E-43)
            if (r0 != 0) goto L_0x00fb
            int r0 = r13.v()
            if (r0 != r5) goto L_0x00f7
            r0 = 1
            goto L_0x00f8
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            r12.f5728j = r0
            goto L_0x00e3
        L_0x00fb:
            int r0 = r13.v()
            if (r0 != r5) goto L_0x0103
            r5 = 1
            goto L_0x0104
        L_0x0103:
            r5 = 0
        L_0x0104:
            r12.f5728j = r5
            r5 = 65
            r6 = 64
            if (r0 == r6) goto L_0x010e
            if (r0 != r5) goto L_0x00e3
        L_0x010e:
            if (r0 != r5) goto L_0x0112
            r0 = 1
            goto L_0x0113
        L_0x0112:
            r0 = 0
        L_0x0113:
            r12.f5727h = r3
            byte[] r1 = r1.f3732a
            r7 = -84
            r1[r4] = r7
            if (r0 == 0) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            r5 = 64
        L_0x0120:
            byte r0 = (byte) r5
            r1[r3] = r0
            r12.i = r2
            goto L_0x000a
        L_0x0127:
            return
        L_0x0128:
            p1.G r0 = r12.f5726g
            P0.l.k(r0)
        L_0x012d:
            int r0 = r13.a()
            if (r0 <= 0) goto L_0x024c
            int r0 = r12.f5727h
            r1 = 2
            P0.r r2 = r12.f5723c
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0216
            if (r0 == r3) goto L_0x0182
            if (r0 == r1) goto L_0x0141
            goto L_0x012d
        L_0x0141:
            int r0 = r13.a()
            int r1 = r12.f5731m
            int r2 = r12.i
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            p1.G r1 = r12.f5726g
            r1.a(r0, r13)
            int r1 = r12.i
            int r1 = r1 + r0
            r12.i = r1
            int r0 = r12.f5731m
            if (r1 != r0) goto L_0x012d
            long r0 = r12.f5732n
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0168
            goto L_0x0169
        L_0x0168:
            r3 = 0
        L_0x0169:
            P0.l.j(r3)
            p1.G r5 = r12.f5726g
            long r6 = r12.f5732n
            int r9 = r12.f5731m
            r11 = 0
            r8 = 1
            r10 = 0
            r5.e(r6, r8, r9, r10, r11)
            long r0 = r12.f5732n
            long r2 = r12.f5729k
            long r0 = r0 + r2
            r12.f5732n = r0
            r12.f5727h = r4
            goto L_0x012d
        L_0x0182:
            byte[] r0 = r2.f3732a
            int r3 = r13.a()
            int r5 = r12.i
            r6 = 128(0x80, float:1.794E-43)
            int r5 = 128 - r5
            int r3 = java.lang.Math.min(r3, r5)
            int r5 = r12.i
            r13.g(r0, r5, r3)
            int r0 = r12.i
            int r0 = r0 + r3
            r12.i = r0
            if (r0 != r6) goto L_0x012d
            N1.f r0 = r12.f5722b
            r0.r(r4)
            p1.c r0 = p1.C1332b.n(r0)
            M0.r r3 = r12.f5730l
            int r5 = r0.f14364b
            int r7 = r0.f14365c
            java.lang.String r8 = r0.f14363a
            if (r3 == 0) goto L_0x01c1
            int r9 = r3.f3014C
            if (r7 != r9) goto L_0x01c1
            int r9 = r3.f3015D
            if (r5 != r9) goto L_0x01c1
            java.lang.String r3 = r3.f3036n
            boolean r3 = j$.util.Objects.equals(r8, r3)
            if (r3 != 0) goto L_0x01f6
        L_0x01c1:
            M0.q r3 = new M0.q
            r3.<init>()
            java.lang.String r9 = r12.f5725f
            r3.f2989a = r9
            java.lang.String r9 = M0.I.o(r8)
            r3.f2999m = r9
            r3.f2979B = r7
            r3.f2980C = r5
            java.lang.String r5 = r12.f5724d
            r3.f2992d = r5
            int r5 = r12.e
            r3.f2993f = r5
            int r5 = r0.f14367f
            r3.i = r5
            java.lang.String r7 = "audio/ac3"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x01ea
            r3.f2995h = r5
        L_0x01ea:
            M0.r r5 = new M0.r
            r5.<init>(r3)
            r12.f5730l = r5
            p1.G r3 = r12.f5726g
            r3.c(r5)
        L_0x01f6:
            int r3 = r0.f14366d
            r12.f5731m = r3
            int r0 = r0.e
            long r7 = (long) r0
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r9
            M0.r r0 = r12.f5730l
            int r0 = r0.f3015D
            long r9 = (long) r0
            long r7 = r7 / r9
            r12.f5729k = r7
            r2.H(r4)
            p1.G r0 = r12.f5726g
            r0.a(r6, r2)
            r12.f5727h = r1
            goto L_0x012d
        L_0x0216:
            int r0 = r13.a()
            if (r0 <= 0) goto L_0x012d
            boolean r0 = r12.f5728j
            r5 = 11
            if (r0 != 0) goto L_0x022e
            int r0 = r13.v()
            if (r0 != r5) goto L_0x022a
            r0 = 1
            goto L_0x022b
        L_0x022a:
            r0 = 0
        L_0x022b:
            r12.f5728j = r0
            goto L_0x0216
        L_0x022e:
            int r0 = r13.v()
            r6 = 119(0x77, float:1.67E-43)
            if (r0 != r6) goto L_0x0244
            r12.f5728j = r4
            r12.f5727h = r3
            byte[] r0 = r2.f3732a
            r0[r4] = r5
            r0[r3] = r6
            r12.i = r1
            goto L_0x012d
        L_0x0244:
            if (r0 != r5) goto L_0x0248
            r0 = 1
            goto L_0x0249
        L_0x0248:
            r0 = 0
        L_0x0249:
            r12.f5728j = r0
            goto L_0x0216
        L_0x024c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.C0343b.e(P0.r):void");
    }

    public final void f(boolean z) {
        int i8 = this.f5721a;
    }

    public final void g(int i8, long j7) {
        switch (this.f5721a) {
            case 0:
                this.f5732n = j7;
                return;
            default:
                this.f5732n = j7;
                return;
        }
    }

    public final void h(q qVar, G g8) {
        switch (this.f5721a) {
            case 0:
                g8.c();
                g8.d();
                this.f5725f = (String) g8.e;
                g8.d();
                this.f5726g = qVar.q(g8.f5716c, 1);
                return;
            default:
                g8.c();
                g8.d();
                this.f5725f = (String) g8.e;
                g8.d();
                this.f5726g = qVar.q(g8.f5716c, 1);
                return;
        }
    }

    public C0343b(String str, int i8, int i9) {
        this.f5721a = i9;
        switch (i9) {
            case 1:
                f fVar = new f(16, new byte[16]);
                this.f5722b = fVar;
                this.f5723c = new r(fVar.f3344b);
                this.f5727h = 0;
                this.i = 0;
                this.f5728j = false;
                this.f5732n = -9223372036854775807L;
                this.f5724d = str;
                this.e = i8;
                return;
            default:
                f fVar2 = new f(128, new byte[128]);
                this.f5722b = fVar2;
                this.f5723c = new r(fVar2.f3344b);
                this.f5727h = 0;
                this.f5732n = -9223372036854775807L;
                this.f5724d = str;
                this.e = i8;
                return;
        }
    }
}
