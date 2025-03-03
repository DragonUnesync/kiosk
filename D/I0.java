package D;

import B.h0;
import B.i0;
import n2.a;

public final class I0 implements i0 {

    /* renamed from: b  reason: collision with root package name */
    public final long f794b;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f795c;

    public I0(long j7, i0 i0Var) {
        boolean z;
        if (j7 >= 0) {
            z = true;
        } else {
            z = false;
        }
        a.h("Timeout must be non-negative.", z);
        this.f794b = j7;
        this.f795c = i0Var;
    }

    public final h0 a(A a8) {
        h0 a9 = this.f795c.a(a8);
        long j7 = this.f794b;
        if (j7 <= 0) {
            return a9;
        }
        if (a8.f739b >= j7 - a9.f257a) {
            return h0.f255d;
        }
        return a9;
    }

    public final long b() {
        return this.f794b;
    }
}
