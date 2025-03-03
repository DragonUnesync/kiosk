package p1;

import P0.z;

/* renamed from: p1.f  reason: case insensitive filesystem */
public final class C1336f {

    /* renamed from: a  reason: collision with root package name */
    public final long f14383a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14384b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14385c;

    /* renamed from: d  reason: collision with root package name */
    public long f14386d = 0;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f14387f;

    /* renamed from: g  reason: collision with root package name */
    public long f14388g;

    /* renamed from: h  reason: collision with root package name */
    public long f14389h;

    public C1336f(long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f14383a = j7;
        long j13 = j8;
        this.f14384b = j13;
        long j14 = j9;
        this.e = j14;
        long j15 = j10;
        this.f14387f = j15;
        long j16 = j11;
        this.f14388g = j16;
        long j17 = j12;
        this.f14385c = j17;
        this.f14389h = a(j13, 0, j14, j15, j16, j17);
    }

    public static long a(long j7, long j8, long j9, long j10, long j11, long j12) {
        if (j10 + 1 >= j11 || j8 + 1 >= j9) {
            return j10;
        }
        long j13 = (long) (((float) (j7 - j8)) * (((float) (j11 - j10)) / ((float) (j9 - j8))));
        return z.j(((j13 + j10) - j12) - (j13 / 20), j10, j11 - 1);
    }
}
