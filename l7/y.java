package l7;

import N.e;
import P6.f;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class y {

    /* renamed from: d  reason: collision with root package name */
    public static final x f13251d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f13252a;

    /* renamed from: b  reason: collision with root package name */
    public long f13253b;

    /* renamed from: c  reason: collision with root package name */
    public long f13254c;

    public y a() {
        this.f13252a = false;
        return this;
    }

    public y b() {
        this.f13254c = 0;
        return this;
    }

    public long c() {
        if (this.f13252a) {
            return this.f13253b;
        }
        throw new IllegalStateException("No deadline");
    }

    public y d(long j7) {
        this.f13252a = true;
        this.f13253b = j7;
        return this;
    }

    public boolean e() {
        return this.f13252a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f13252a && this.f13253b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j7, TimeUnit timeUnit) {
        f.e(timeUnit, "unit");
        if (j7 >= 0) {
            this.f13254c = timeUnit.toNanos(j7);
            return this;
        }
        throw new IllegalArgumentException(e.w("timeout < 0: ", j7).toString());
    }
}
