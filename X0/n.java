package X0;

import P0.z;
import java.math.RoundingMode;
import java.util.List;

public abstract class n extends s {

    /* renamed from: d  reason: collision with root package name */
    public final long f6263d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final List f6264f;

    /* renamed from: g  reason: collision with root package name */
    public final long f6265g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6266h;
    public final long i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(j jVar, long j7, long j8, long j9, long j10, List list, long j11, long j12, long j13) {
        super(jVar, j7, j8);
        this.f6263d = j9;
        this.e = j10;
        this.f6264f = list;
        this.i = j11;
        this.f6265g = j12;
        this.f6266h = j13;
    }

    public final long b(long j7, long j8) {
        long d8 = d(j7);
        if (d8 != -1) {
            return d8;
        }
        return (long) ((int) (f((j8 - this.f6266h) + this.i, j7) - c(j7, j8)));
    }

    public final long c(long j7, long j8) {
        long d8 = d(j7);
        long j9 = this.f6263d;
        if (d8 == -1) {
            long j10 = this.f6265g;
            if (j10 != -9223372036854775807L) {
                return Math.max(j9, f((j8 - this.f6266h) - j10, j7));
            }
        }
        return j9;
    }

    public abstract long d(long j7);

    public final long e(long j7, long j8) {
        long j9 = this.f6275b;
        long j10 = this.f6263d;
        List list = this.f6264f;
        if (list != null) {
            return (((q) list.get((int) (j7 - j10))).f6272b * 1000000) / j9;
        }
        long d8 = d(j8);
        if (d8 == -1 || j7 != (j10 + d8) - 1) {
            return (this.e * 1000000) / j9;
        }
        return j8 - g(j7);
    }

    public final long f(long j7, long j8) {
        long d8 = d(j8);
        long j9 = this.f6263d;
        if (d8 == 0) {
            return j9;
        }
        if (this.f6264f == null) {
            long j10 = (j7 / ((this.e * 1000000) / this.f6275b)) + j9;
            if (j10 < j9) {
                return j9;
            }
            if (d8 == -1) {
                return j10;
            }
            return Math.min(j10, (j9 + d8) - 1);
        }
        long j11 = (d8 + j9) - 1;
        long j12 = j9;
        while (j12 <= j11) {
            long j13 = ((j11 - j12) / 2) + j12;
            int i8 = (g(j13) > j7 ? 1 : (g(j13) == j7 ? 0 : -1));
            if (i8 < 0) {
                j12 = j13 + 1;
            } else if (i8 <= 0) {
                return j13;
            } else {
                j11 = j13 - 1;
            }
        }
        if (j12 == j9) {
            return j12;
        }
        return j11;
    }

    public final long g(long j7) {
        long j8;
        long j9 = this.f6263d;
        List list = this.f6264f;
        if (list != null) {
            j8 = ((q) list.get((int) (j7 - j9))).f6271a - this.f6276c;
        } else {
            j8 = (j7 - j9) * this.e;
        }
        long j10 = j8;
        int i8 = z.f3748a;
        return z.W(j10, 1000000, this.f6275b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j7);

    public boolean i() {
        if (this.f6264f != null) {
            return true;
        }
        return false;
    }
}
