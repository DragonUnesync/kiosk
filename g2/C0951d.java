package g2;

import R.e;
import android.view.ViewGroup;

/* renamed from: g2.d  reason: case insensitive filesystem */
public final class C0951d extends q {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11931a = false;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f11932b;

    public C0951d(ViewGroup viewGroup) {
        this.f11932b = viewGroup;
    }

    public final void b(p pVar) {
        if (!this.f11931a) {
            e.u(this.f11932b, false);
        }
        pVar.z(this);
    }

    public final void c() {
        e.u(this.f11932b, false);
    }

    public final void d() {
        e.u(this.f11932b, true);
    }

    public final void e(p pVar) {
        e.u(this.f11932b, false);
        this.f11931a = true;
    }
}
