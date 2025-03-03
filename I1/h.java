package I1;

import P0.l;
import P0.z;
import p1.C1330A;
import p1.y;

public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long f2249a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2250b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2251c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2252d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2253f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f2254g;

    public h(long j7, int i, long j8, int i8, long j9, long[] jArr) {
        this.f2249a = j7;
        this.f2250b = i;
        this.f2251c = j8;
        this.f2252d = i8;
        this.e = j9;
        this.f2254g = jArr;
        this.f2253f = j9 != -1 ? j7 + j9 : -1;
    }

    public final long b(long j7) {
        long j8;
        double d8;
        long j9 = j7 - this.f2249a;
        if (!g() || j9 <= ((long) this.f2250b)) {
            return 0;
        }
        long[] jArr = this.f2254g;
        l.k(jArr);
        double d9 = (((double) j9) * 256.0d) / ((double) this.e);
        int e8 = z.e(jArr, (long) d9, true);
        long j10 = this.f2251c;
        long j11 = (((long) e8) * j10) / 100;
        long j12 = jArr[e8];
        int i = e8 + 1;
        long j13 = (j10 * ((long) i)) / 100;
        if (e8 == 99) {
            j8 = 256;
        } else {
            j8 = jArr[i];
        }
        if (j12 == j8) {
            d8 = 0.0d;
        } else {
            d8 = (d9 - ((double) j12)) / ((double) (j8 - j12));
        }
        return Math.round(d8 * ((double) (j13 - j11))) + j11;
    }

    public final long d() {
        return this.f2253f;
    }

    public final boolean g() {
        if (this.f2254g != null) {
            return true;
        }
        return false;
    }

    public final y i(long j7) {
        double d8;
        double d9;
        boolean g8 = g();
        int i = this.f2250b;
        long j8 = this.f2249a;
        if (!g8) {
            C1330A a8 = new C1330A(0, j8 + ((long) i));
            return new y(a8, a8);
        }
        long j9 = z.j(j7, 0, this.f2251c);
        double d10 = (((double) j9) * 100.0d) / ((double) this.f2251c);
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d8 = 256.0d;
                d11 = 256.0d;
                double d12 = d11 / d8;
                long j10 = this.e;
                C1330A a9 = new C1330A(j9, j8 + z.j(Math.round(d12 * ((double) j10)), (long) i, j10 - 1));
                return new y(a9, a9);
            }
            int i8 = (int) d10;
            long[] jArr = this.f2254g;
            l.k(jArr);
            double d13 = (double) jArr[i8];
            if (i8 == 99) {
                d9 = 256.0d;
            } else {
                d9 = (double) jArr[i8 + 1];
            }
            d11 = ((d9 - d13) * (d10 - ((double) i8))) + d13;
        }
        d8 = 256.0d;
        double d122 = d11 / d8;
        long j102 = this.e;
        C1330A a92 = new C1330A(j9, j8 + z.j(Math.round(d122 * ((double) j102)), (long) i, j102 - 1));
        return new y(a92, a92);
    }

    public final int j() {
        return this.f2252d;
    }

    public final long k() {
        return this.f2251c;
    }
}
