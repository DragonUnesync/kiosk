package I1;

import D2.j;
import P0.z;
import java.math.RoundingMode;
import p1.x;
import p1.y;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long f2219a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2220b;

    /* renamed from: c  reason: collision with root package name */
    public final x f2221c;

    public b(long j7, long j8, long j9) {
        long j10 = j9;
        this.f2221c = new x(j7, new long[]{j8}, new long[]{0});
        this.f2219a = j10;
        int i = -2147483647;
        if (j7 != -9223372036854775807L) {
            long W7 = z.W(j8 - j10, 8, j7, RoundingMode.HALF_UP);
            if (W7 > 0 && W7 <= 2147483647L) {
                i = (int) W7;
            }
            this.f2220b = i;
            return;
        }
        this.f2220b = -2147483647;
    }

    public final long b(long j7) {
        x xVar = this.f2221c;
        j jVar = xVar.f14448b;
        if (jVar.f1093U == 0) {
            return -9223372036854775807L;
        }
        return jVar.n(z.b(xVar.f14447a, j7));
    }

    public final long d() {
        return this.f2219a;
    }

    public final boolean g() {
        return this.f2221c.g();
    }

    public final y i(long j7) {
        return this.f2221c.i(j7);
    }

    public final int j() {
        return this.f2220b;
    }

    public final long k() {
        return this.f2221c.f14449c;
    }
}
