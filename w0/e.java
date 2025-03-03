package W0;

import M0.C;
import M0.C0115c;
import M0.C0136y;
import M0.V;
import M0.X;
import P0.l;
import P0.z;
import X0.c;

public final class e extends X {

    /* renamed from: b  reason: collision with root package name */
    public final long f6039b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6040c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6041d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6042f;

    /* renamed from: g  reason: collision with root package name */
    public final long f6043g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6044h;
    public final c i;

    /* renamed from: j  reason: collision with root package name */
    public final C f6045j;

    /* renamed from: k  reason: collision with root package name */
    public final C0136y f6046k;

    public e(long j7, long j8, long j9, int i8, long j10, long j11, long j12, c cVar, C c8, C0136y yVar) {
        boolean z;
        c cVar2 = cVar;
        C0136y yVar2 = yVar;
        boolean z6 = cVar2.f6217d;
        boolean z8 = false;
        if (yVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        l.j(z6 == z ? true : z8);
        this.f6039b = j7;
        this.f6040c = j8;
        this.f6041d = j9;
        this.e = i8;
        this.f6042f = j10;
        this.f6043g = j11;
        this.f6044h = j12;
        this.i = cVar2;
        this.f6045j = c8;
        this.f6046k = yVar2;
    }

    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.e) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    public final V f(int i8, V v4, boolean z) {
        String str;
        int i9 = i8;
        l.g(i9, h());
        Integer num = null;
        c cVar = this.i;
        if (z) {
            str = cVar.b(i9).f6243a;
        } else {
            str = null;
        }
        if (z) {
            num = Integer.valueOf(this.e + i9);
        }
        v4.getClass();
        v4.h(str, num, 0, cVar.d(i9), z.O(cVar.b(i9).f6244b - cVar.b(0).f6244b) - this.f6042f, C0115c.f2914c, false);
        return v4;
    }

    public final int h() {
        return this.i.f6224m.size();
    }

    public final Object l(int i8) {
        l.g(i8, h());
        return Integer.valueOf(this.e + i8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r7 > r0.f6043g) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M0.W m(int r22, M0.W r23, long r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            r2 = r22
            P0.l.g(r2, r1)
            X0.c r4 = r0.i
            boolean r2 = r4.f6217d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            if (r2 == 0) goto L_0x0022
            long r7 = r4.e
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0022
            long r7 = r4.f6215b
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            long r7 = r0.f6044h
            if (r2 != 0) goto L_0x002a
        L_0x0027:
            r14 = r7
            goto L_0x00a7
        L_0x002a:
            r9 = 0
            int r2 = (r24 > r9 ? 1 : (r24 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x003b
            long r7 = r7 + r24
            long r11 = r0.f6043g
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x003b
        L_0x0038:
            r14 = r5
            goto L_0x00a7
        L_0x003b:
            long r11 = r0.f6042f
            long r11 = r11 + r7
            long r13 = r4.d(r3)
            r2 = 0
        L_0x0043:
            java.util.List r15 = r4.f6224m
            int r15 = r15.size()
            int r15 = r15 - r1
            if (r2 >= r15) goto L_0x0057
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x0057
            long r11 = r11 - r13
            int r2 = r2 + r1
            long r13 = r4.d(r2)
            goto L_0x0043
        L_0x0057:
            X0.h r2 = r4.b(r2)
            java.util.List r15 = r2.f6245c
            int r5 = r15.size()
            r6 = 0
        L_0x0062:
            r9 = -1
            if (r6 >= r5) goto L_0x0074
            java.lang.Object r10 = r15.get(r6)
            X0.a r10 = (X0.a) r10
            int r10 = r10.f6206b
            r3 = 2
            if (r10 != r3) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            int r6 = r6 + r1
            r3 = 0
            goto L_0x0062
        L_0x0074:
            r6 = -1
        L_0x0075:
            if (r6 != r9) goto L_0x007a
            r14 = r7
            r3 = 0
            goto L_0x00a7
        L_0x007a:
            java.util.List r2 = r2.f6245c
            java.lang.Object r2 = r2.get(r6)
            X0.a r2 = (X0.a) r2
            java.util.List r2 = r2.f6207c
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            X0.m r2 = (X0.m) r2
            W0.h r2 = r2.c()
            if (r2 == 0) goto L_0x0027
            long r5 = r2.i0(r13)
            r9 = 0
            int r15 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x009c
            goto L_0x0027
        L_0x009c:
            long r5 = r2.e(r11, r13)
            long r5 = r2.b(r5)
            long r5 = r5 + r7
            long r5 = r5 - r11
            goto L_0x0038
        L_0x00a7:
            java.lang.Object r2 = M0.W.f2868q
            boolean r2 = r4.f6217d
            if (r2 == 0) goto L_0x00c0
            long r5 = r4.e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00c0
            long r5 = r4.f6215b
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x00c0
            r12 = 1
            goto L_0x00c1
        L_0x00c0:
            r12 = 0
        L_0x00c1:
            int r2 = r21.h()
            int r18 = r2 + -1
            M0.y r13 = r0.f6046k
            long r1 = r0.f6043g
            r16 = r1
            M0.C r3 = r0.f6045j
            long r5 = r0.f6039b
            long r7 = r0.f6040c
            long r9 = r0.f6041d
            r11 = 1
            long r1 = r0.f6042f
            r19 = r1
            r2 = r23
            r2.b(r3, r4, r5, r7, r9, r11, r12, r13, r14, r16, r18, r19)
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.e.m(int, M0.W, long):M0.W");
    }

    public final int o() {
        return 1;
    }
}
