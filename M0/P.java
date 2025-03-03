package M0;

import N.e;
import P0.z;
import java.util.Arrays;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2851a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2852b;

    /* renamed from: c  reason: collision with root package name */
    public final C f2853c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2854d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2855f;

    /* renamed from: g  reason: collision with root package name */
    public final long f2856g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2857h;
    public final int i;

    static {
        e.D(0, 1, 2, 3, 4);
        z.J(5);
        z.J(6);
    }

    public P(Object obj, int i8, C c8, Object obj2, int i9, long j7, long j8, int i10, int i11) {
        this.f2851a = obj;
        this.f2852b = i8;
        this.f2853c = c8;
        this.f2854d = obj2;
        this.e = i9;
        this.f2855f = j7;
        this.f2856g = j8;
        this.f2857h = i10;
        this.i = i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r8 = (M0.P) r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r8 == 0) goto L_0x005b
            java.lang.Class r2 = r8.getClass()
            java.lang.Class<M0.P> r3 = M0.P.class
            if (r3 == r2) goto L_0x0010
            goto L_0x005b
        L_0x0010:
            M0.P r8 = (M0.P) r8
            int r2 = r8.f2852b
            int r3 = r7.f2852b
            if (r3 != r2) goto L_0x0059
            int r2 = r7.e
            int r3 = r8.e
            if (r2 != r3) goto L_0x0059
            long r2 = r7.f2855f
            long r4 = r8.f2855f
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0059
            long r2 = r7.f2856g
            long r4 = r8.f2856g
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0059
            int r2 = r7.f2857h
            int r3 = r8.f2857h
            if (r2 != r3) goto L_0x0059
            int r2 = r7.i
            int r3 = r8.i
            if (r2 != r3) goto L_0x0059
            M0.C r2 = r7.f2853c
            M0.C r3 = r8.f2853c
            boolean r2 = N7.a.e(r2, r3)
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r7.f2851a
            java.lang.Object r3 = r8.f2851a
            boolean r2 = N7.a.e(r2, r3)
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r7.f2854d
            java.lang.Object r8 = r8.f2854d
            boolean r8 = N7.a.e(r2, r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            return r0
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.P.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f2852b);
        Integer valueOf2 = Integer.valueOf(this.e);
        Long valueOf3 = Long.valueOf(this.f2855f);
        Long valueOf4 = Long.valueOf(this.f2856g);
        Integer valueOf5 = Integer.valueOf(this.f2857h);
        Integer valueOf6 = Integer.valueOf(this.i);
        return Arrays.hashCode(new Object[]{this.f2851a, valueOf, this.f2853c, this.f2854d, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6});
    }
}
