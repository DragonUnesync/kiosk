package y2;

import m2.C1208a;

/* renamed from: y2.f  reason: case insensitive filesystem */
public abstract class C1631f {

    /* renamed from: U  reason: collision with root package name */
    public boolean f16382U;

    public C1631f(boolean z) {
        this.f16382U = z;
    }

    public final void d() {
        if (!this.f16382U) {
            throw new C1208a((Exception) null, "immutable instance");
        }
    }
}
