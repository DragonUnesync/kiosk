package D;

import java.util.concurrent.atomic.AtomicBoolean;

public final class z0 implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f975a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final A0 f976b;

    public z0(A0 a02) {
        this.f976b = a02;
    }

    public final void a(C0 c02) {
        if (!this.f975a.get()) {
            this.f976b.a(c02);
        }
    }

    public final void b() {
        this.f975a.set(true);
    }
}
