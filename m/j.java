package M;

import B.B;
import D.N;
import G.i;
import L3.b;
import N.e;
import a0.m;
import android.util.Size;
import com.bumptech.glide.d;
import g7.l;
import n2.a;

public final class j extends N {

    /* renamed from: o  reason: collision with root package name */
    public final m f2755o = d.i(new B(7, this));

    /* renamed from: p  reason: collision with root package name */
    public a0.j f2756p;

    /* renamed from: q  reason: collision with root package name */
    public N f2757q;

    /* renamed from: r  reason: collision with root package name */
    public l f2758r;

    public j(Size size, int i) {
        super(size, i);
    }

    public final void a() {
        super.a();
        l.n(new g(this, 2));
    }

    public final b f() {
        return this.f2755o;
    }

    public final boolean g(N n4, Runnable runnable) {
        boolean z;
        boolean z6;
        l.a();
        n4.getClass();
        N n5 = this.f2757q;
        boolean z8 = false;
        if (n5 == n4) {
            return false;
        }
        if (n5 == null) {
            z = true;
        } else {
            z = false;
        }
        a.m("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", z);
        Size size = this.f828h;
        Size size2 = n4.f828h;
        boolean equals = size.equals(size2);
        a.h("The provider's size(" + size + ") must match the parent(" + size2 + ")", equals);
        int i = n4.i;
        int i8 = this.i;
        if (i8 == i) {
            z8 = true;
        }
        a.h(e.v("The provider's format(", i8, ") must match the parent(", i, ")"), z8);
        synchronized (this.f822a) {
            z6 = this.f824c;
        }
        a.m("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z6);
        this.f2757q = n4;
        i.e(true, n4.c(), this.f2756p, D7.b.l());
        n4.d();
        i.d(this.e).d(new A.d(19, n4), D7.b.l());
        i.d(n4.f827g).d(runnable, D7.b.H());
        return true;
    }
}
