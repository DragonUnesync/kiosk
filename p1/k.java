package p1;

public class k implements z {

    /* renamed from: a  reason: collision with root package name */
    public final long f14399a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14400b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14401c;

    /* renamed from: d  reason: collision with root package name */
    public final long f14402d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final long f14403f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14404g;

    public k(long j7, long j8, int i, int i8, boolean z) {
        this.f14399a = j7;
        this.f14400b = j8;
        this.f14401c = i8 == -1 ? 1 : i8;
        this.e = i;
        this.f14404g = z;
        if (j7 == -1) {
            this.f14402d = -1;
            this.f14403f = -9223372036854775807L;
            return;
        }
        long j9 = j7 - j8;
        this.f14402d = j9;
        this.f14403f = (Math.max(0, j9) * 8000000) / ((long) i);
    }

    public final boolean g() {
        if (this.f14402d != -1 || this.f14404g) {
            return true;
        }
        return false;
    }

    public final y i(long j7) {
        long j8 = this.f14400b;
        long j9 = this.f14402d;
        int i = (j9 > -1 ? 1 : (j9 == -1 ? 0 : -1));
        if (i != 0 || this.f14404g) {
            int i8 = this.e;
            long j10 = (long) this.f14401c;
            long j11 = (((((long) i8) * j7) / 8000000) / j10) * j10;
            if (i != 0) {
                j11 = Math.min(j11, j9 - j10);
            }
            long max = Math.max(j11, 0) + j8;
            long max2 = (Math.max(0, max - j8) * 8000000) / ((long) i8);
            C1330A a8 = new C1330A(max2, max);
            if (i != 0 && max2 < j7) {
                long j12 = max + j10;
                if (j12 < this.f14399a) {
                    return new y(a8, new C1330A((Math.max(0, j12 - j8) * 8000000) / ((long) i8), j12));
                }
            }
            return new y(a8, a8);
        }
        C1330A a9 = new C1330A(0, j8);
        return new y(a9, a9);
    }

    public final long k() {
        return this.f14403f;
    }
}
