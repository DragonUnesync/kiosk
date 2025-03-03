package I1;

import p1.k;

public final class a extends k implements f {

    /* renamed from: h  reason: collision with root package name */
    public final long f2215h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2216j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2217k;

    /* renamed from: l  reason: collision with root package name */
    public final long f2218l;

    public a(long j7, long j8, int i8, int i9, boolean z) {
        super(j7, j8, i8, i9, z);
        this.f2215h = j8;
        this.i = i8;
        this.f2216j = i9;
        this.f2217k = z;
        this.f2218l = j7 == -1 ? -1 : j7;
    }

    public final long b(long j7) {
        return (Math.max(0, j7 - this.f14400b) * 8000000) / ((long) this.e);
    }

    public final long d() {
        return this.f2218l;
    }

    public final int j() {
        return this.i;
    }
}
