package W1;

import J1.e;
import java.math.RoundingMode;
import p1.C1330A;
import p1.y;
import p1.z;

public final class f implements z {

    /* renamed from: a  reason: collision with root package name */
    public final e f6149a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6150b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6151c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6152d;
    public final long e;

    public f(e eVar, int i, long j7, long j8) {
        this.f6149a = eVar;
        this.f6150b = i;
        this.f6151c = j7;
        long j9 = (j8 - j7) / ((long) eVar.f2356W);
        this.f6152d = j9;
        this.e = a(j9);
    }

    public final long a(long j7) {
        long j8 = j7 * ((long) this.f6150b);
        long j9 = (long) this.f6149a.f2355V;
        int i = P0.z.f3748a;
        return P0.z.W(j8, 1000000, j9, RoundingMode.DOWN);
    }

    public final boolean g() {
        return true;
    }

    public final y i(long j7) {
        e eVar = this.f6149a;
        long j8 = (((long) eVar.f2355V) * j7) / (((long) this.f6150b) * 1000000);
        long j9 = this.f6152d;
        long j10 = P0.z.j(j8, 0, j9 - 1);
        long j11 = this.f6151c;
        long a8 = a(j10);
        C1330A a9 = new C1330A(a8, (((long) eVar.f2356W) * j10) + j11);
        if (a8 >= j7 || j10 == j9 - 1) {
            return new y(a9, a9);
        }
        long j12 = j10 + 1;
        return new y(a9, new C1330A(a(j12), (((long) eVar.f2356W) * j12) + j11));
    }

    public final long k() {
        return this.e;
    }
}
