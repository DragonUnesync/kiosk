package l7;

import P6.f;
import java.util.concurrent.TimeUnit;

public final class j extends y {
    public y e;

    public j(y yVar) {
        f.e(yVar, "delegate");
        this.e = yVar;
    }

    public final y a() {
        return this.e.a();
    }

    public final y b() {
        return this.e.b();
    }

    public final long c() {
        return this.e.c();
    }

    public final y d(long j7) {
        return this.e.d(j7);
    }

    public final boolean e() {
        return this.e.e();
    }

    public final void f() {
        this.e.f();
    }

    public final y g(long j7, TimeUnit timeUnit) {
        f.e(timeUnit, "unit");
        return this.e.g(j7, timeUnit);
    }
}
