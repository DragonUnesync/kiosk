package I1;

import P0.z;
import android.util.Pair;
import p1.C1330A;
import p1.y;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f2222a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f2223b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2224c;

    public c(long j7, long[] jArr, long[] jArr2) {
        this.f2222a = jArr;
        this.f2223b = jArr2;
        this.f2224c = j7 == -9223372036854775807L ? z.O(jArr2[jArr2.length - 1]) : j7;
    }

    public static Pair a(long j7, long[] jArr, long[] jArr2) {
        double d8;
        int e = z.e(jArr, j7, true);
        long j8 = jArr[e];
        long j9 = jArr2[e];
        int i = e + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j8), Long.valueOf(j9));
        }
        long j10 = jArr[i];
        long j11 = jArr2[i];
        if (j10 == j8) {
            d8 = 0.0d;
        } else {
            d8 = (((double) j7) - ((double) j8)) / ((double) (j10 - j8));
        }
        return Pair.create(Long.valueOf(j7), Long.valueOf(((long) (d8 * ((double) (j11 - j9)))) + j9));
    }

    public final long b(long j7) {
        return z.O(((Long) a(j7, this.f2222a, this.f2223b).second).longValue());
    }

    public final long d() {
        return -1;
    }

    public final boolean g() {
        return true;
    }

    public final y i(long j7) {
        Pair a8 = a(z.c0(z.j(j7, 0, this.f2224c)), this.f2223b, this.f2222a);
        C1330A a9 = new C1330A(z.O(((Long) a8.first).longValue()), ((Long) a8.second).longValue());
        return new y(a9, a9);
    }

    public final int j() {
        return -2147483647;
    }

    public final long k() {
        return this.f2224c;
    }
}
