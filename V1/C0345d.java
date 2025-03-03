package V1;

import H3.M;
import H3.O;
import H3.i0;
import N1.f;
import P0.r;
import java.util.List;
import p1.l;
import p1.o;
import p1.p;
import p1.q;

/* renamed from: V1.d  reason: case insensitive filesystem */
public final class C0345d implements o {

    /* renamed from: a  reason: collision with root package name */
    public final int f5736a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final C0346e f5737b = new C0346e(true, (String) null, 0);

    /* renamed from: c  reason: collision with root package name */
    public final r f5738c = new r(2048);

    /* renamed from: d  reason: collision with root package name */
    public final r f5739d;
    public final f e;

    /* renamed from: f  reason: collision with root package name */
    public q f5740f;

    /* renamed from: g  reason: collision with root package name */
    public long f5741g;

    /* renamed from: h  reason: collision with root package name */
    public long f5742h = -1;
    public int i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5743j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5744k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5745l;

    public C0345d() {
        r rVar = new r(10);
        this.f5739d = rVar;
        byte[] bArr = rVar.f3732a;
        this.e = new f(bArr.length, bArr);
    }

    public final void a(long j7, long j8) {
        this.f5744k = false;
        this.f5737b.a();
        this.f5741g = j8;
    }

    public final int b(l lVar) {
        int i8 = 0;
        while (true) {
            r rVar = this.f5739d;
            lVar.r(rVar.f3732a, 0, 10, false);
            rVar.H(0);
            if (rVar.y() != 4801587) {
                break;
            }
            rVar.I(3);
            int u3 = rVar.u();
            i8 += u3 + 10;
            lVar.b(u3, false);
        }
        lVar.f14410Z = 0;
        lVar.b(i8, false);
        if (this.f5742h == -1) {
            this.f5742h = (long) i8;
        }
        return i8;
    }

    public final o c() {
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0120 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(p1.p r19, M0.C0132u r20) {
        /*
            r18 = this;
            r0 = r18
            p1.q r1 = r0.f5740f
            P0.l.k(r1)
            r1 = r19
            p1.l r1 = (p1.l) r1
            long r3 = r1.f14407W
            int r1 = r0.f5736a
            r2 = r1 & 2
            r10 = 0
            r11 = 1
            r12 = -1
            if (r2 != 0) goto L_0x0024
            r5 = r1 & 1
            if (r5 == 0) goto L_0x0021
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r5 = -1
            goto L_0x00b3
        L_0x0024:
            N1.f r5 = r0.e
            P0.r r6 = r0.f5739d
            boolean r7 = r0.f5743j
            if (r7 == 0) goto L_0x002d
            goto L_0x0021
        L_0x002d:
            r0.i = r12
            r7 = r19
            p1.l r7 = (p1.l) r7
            r7.f14410Z = r10
            long r8 = r7.f14408X
            r13 = 0
            int r15 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0040
            r0.b(r7)
        L_0x0040:
            r8 = 0
        L_0x0041:
            byte[] r9 = r6.f3732a     // Catch:{ EOFException -> 0x00a0 }
            r15 = r19
            p1.l r15 = (p1.l) r15     // Catch:{ EOFException -> 0x00a0 }
            r12 = 2
            boolean r9 = r15.r(r9, r10, r12, r11)     // Catch:{ EOFException -> 0x00a0 }
            if (r9 == 0) goto L_0x00a0
            r6.H(r10)     // Catch:{ EOFException -> 0x00a0 }
            int r9 = r6.B()     // Catch:{ EOFException -> 0x00a0 }
            r12 = 65526(0xfff6, float:9.1821E-41)
            r9 = r9 & r12
            r12 = 65520(0xfff0, float:9.1813E-41)
            if (r9 != r12) goto L_0x0060
            r9 = 1
            goto L_0x0061
        L_0x0060:
            r9 = 0
        L_0x0061:
            if (r9 != 0) goto L_0x0065
            r8 = 0
            goto L_0x00a0
        L_0x0065:
            byte[] r9 = r6.f3732a     // Catch:{ EOFException -> 0x00a0 }
            r12 = 4
            boolean r9 = r15.r(r9, r10, r12, r11)     // Catch:{ EOFException -> 0x00a0 }
            if (r9 != 0) goto L_0x006f
            goto L_0x00a0
        L_0x006f:
            r9 = 14
            r5.r(r9)     // Catch:{ EOFException -> 0x00a0 }
            r9 = 13
            int r9 = r5.i(r9)     // Catch:{ EOFException -> 0x00a0 }
            r12 = 6
            if (r9 <= r12) goto L_0x0095
            long r10 = (long) r9     // Catch:{ EOFException -> 0x00a0 }
            long r13 = r13 + r10
            int r8 = r8 + 1
            r10 = 1000(0x3e8, float:1.401E-42)
            if (r8 != r10) goto L_0x0087
            r10 = 1
            goto L_0x00a0
        L_0x0087:
            int r9 = r9 + -6
            r10 = 1
            boolean r9 = r15.b(r9, r10)     // Catch:{ EOFException -> 0x00a0 }
            if (r9 != 0) goto L_0x0091
            goto L_0x00a0
        L_0x0091:
            r10 = 0
            r11 = 1
            r12 = -1
            goto L_0x0041
        L_0x0095:
            r10 = 1
            r0.f5743j = r10     // Catch:{ EOFException -> 0x00a0 }
            java.lang.String r5 = "Malformed ADTS stream"
            r6 = 0
            M0.J r5 = M0.J.a(r6, r5)     // Catch:{ EOFException -> 0x00a0 }
            throw r5     // Catch:{ EOFException -> 0x00a0 }
        L_0x00a0:
            r5 = 0
            r7.f14410Z = r5
            if (r8 <= 0) goto L_0x00ad
            long r5 = (long) r8
            long r13 = r13 / r5
            int r5 = (int) r13
            r0.i = r5
            r5 = -1
        L_0x00ab:
            r6 = 1
            goto L_0x00b1
        L_0x00ad:
            r5 = -1
            r0.i = r5
            goto L_0x00ab
        L_0x00b1:
            r0.f5743j = r6
        L_0x00b3:
            P0.r r10 = r0.f5738c
            byte[] r6 = r10.f3732a
            r7 = 2048(0x800, float:2.87E-42)
            r8 = r19
            p1.l r8 = (p1.l) r8
            r9 = 0
            int r11 = r8.x(r6, r9, r7)
            if (r11 != r5) goto L_0x00c6
            r13 = 1
            goto L_0x00c7
        L_0x00c6:
            r13 = 0
        L_0x00c7:
            boolean r5 = r0.f5745l
            V1.e r14 = r0.f5737b
            if (r5 == 0) goto L_0x00ce
            goto L_0x011e
        L_0x00ce:
            r5 = 1
            r1 = r1 & r5
            if (r1 == 0) goto L_0x00d8
            int r1 = r0.i
            if (r1 <= 0) goto L_0x00d8
            r1 = 1
            goto L_0x00d9
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x00e9
            long r7 = r14.f5762r
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x00e9
            if (r13 != 0) goto L_0x00e9
            goto L_0x011e
        L_0x00e9:
            if (r1 == 0) goto L_0x0111
            long r7 = r14.f5762r
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0111
            p1.q r1 = r0.f5740f
            if (r2 == 0) goto L_0x00f7
            r9 = 1
            goto L_0x00f8
        L_0x00f7:
            r9 = 0
        L_0x00f8:
            int r15 = r0.i
            long r5 = (long) r15
            r16 = 8000000(0x7a1200, double:3.952525E-317)
            long r5 = r5 * r16
            long r5 = r5 / r7
            int r7 = (int) r5
            p1.k r8 = new p1.k
            long r5 = r0.f5742h
            r2 = r8
            r12 = r8
            r8 = r15
            r2.<init>(r3, r5, r7, r8, r9)
            r1.l(r12)
        L_0x010f:
            r1 = 1
            goto L_0x011c
        L_0x0111:
            p1.q r1 = r0.f5740f
            p1.s r2 = new p1.s
            r2.<init>(r5)
            r1.l(r2)
            goto L_0x010f
        L_0x011c:
            r0.f5745l = r1
        L_0x011e:
            if (r13 == 0) goto L_0x0122
            r1 = -1
            return r1
        L_0x0122:
            r1 = 0
            r10.H(r1)
            r10.G(r11)
            boolean r1 = r0.f5744k
            if (r1 != 0) goto L_0x0134
            long r1 = r0.f5741g
            r14.f5764t = r1
            r1 = 1
            r0.f5744k = r1
        L_0x0134:
            r14.e(r10)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.C0345d.e(p1.p, M0.u):int");
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        l lVar = (l) pVar;
        int b8 = b(lVar);
        int i8 = b8;
        int i9 = 0;
        int i10 = 0;
        do {
            r rVar = this.f5739d;
            lVar.r(rVar.f3732a, 0, 2, false);
            rVar.H(0);
            if ((rVar.B() & 65526) == 65520) {
                i9++;
                if (i9 >= 4 && i10 > 188) {
                    return true;
                }
                lVar.r(rVar.f3732a, 0, 4, false);
                f fVar = this.e;
                fVar.r(14);
                int i11 = fVar.i(13);
                if (i11 <= 6) {
                    i8++;
                    lVar.f14410Z = 0;
                    lVar.b(i8, false);
                } else {
                    lVar.b(i11 - 6, false);
                    i10 += i11;
                }
            } else {
                i8++;
                lVar.f14410Z = 0;
                lVar.b(i8, false);
            }
            i9 = 0;
            i10 = 0;
        } while (i8 - b8 < 8192);
        return false;
    }

    public final void l(q qVar) {
        this.f5740f = qVar;
        this.f5737b.h(qVar, new G(0, 1));
        qVar.g();
    }

    public final void release() {
    }
}
