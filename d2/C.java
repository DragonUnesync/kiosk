package D2;

import B.q0;
import X2.b;
import X2.c;
import X2.d;
import z3.e;

public final class C implements D, b {

    /* renamed from: Y  reason: collision with root package name */
    public static final q0 f1029Y = c.a(20, new e(19));

    /* renamed from: U  reason: collision with root package name */
    public final d f1030U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public D f1031V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f1032W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f1033X;

    public final synchronized void a() {
        this.f1030U.a();
        if (this.f1032W) {
            this.f1032W = false;
            if (this.f1033X) {
                e();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public final d b() {
        return this.f1030U;
    }

    public final int c() {
        return this.f1031V.c();
    }

    public final Class d() {
        return this.f1031V.d();
    }

    public final synchronized void e() {
        this.f1030U.a();
        this.f1033X = true;
        if (!this.f1032W) {
            this.f1031V.e();
            this.f1031V = null;
            f1029Y.A(this);
        }
    }

    public final Object get() {
        return this.f1031V.get();
    }
}
