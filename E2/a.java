package E2;

import H2.C0082c;
import H2.q;
import H2.r;
import H2.w;
import M0.Q;
import M0.V;
import M0.W;
import M0.X;
import P0.z;
import P6.f;
import P6.h;
import T0.C0232y;
import W2.m;
import android.view.View;
import h1.C1031B;
import java.util.ArrayDeque;

public abstract class a implements r, Q {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1327U;

    /* renamed from: V  reason: collision with root package name */
    public Object f1328V;

    public /* synthetic */ a(int i, Object obj) {
        this.f1327U = i;
        this.f1328V = obj;
    }

    public abstract void a(h hVar, Object obj, Object obj2);

    public long b() {
        C0232y yVar = (C0232y) this;
        X z = yVar.z();
        if (z.p()) {
            return -9223372036854775807L;
        }
        return z.c0(z.m(yVar.v(), (W) this.f1328V, 0).f2880m);
    }

    public Object c(h hVar) {
        f.e(hVar, "property");
        return this.f1328V;
    }

    public void d() {
        ((C0232y) this).Y();
    }

    public boolean e(int i) {
        C0232y yVar = (C0232y) this;
        yVar.Y();
        return yVar.f4920I0.f2849a.f2977a.get(i);
    }

    public boolean f() {
        C0232y yVar = (C0232y) this;
        X z = yVar.z();
        if (z.p() || !z.m(yVar.v(), (W) this.f1328V, 0).i) {
            return false;
        }
        return true;
    }

    public boolean g() {
        C0232y yVar = (C0232y) this;
        X z = yVar.z();
        if (z.p() || !z.m(yVar.v(), (W) this.f1328V, 0).a()) {
            return false;
        }
        return true;
    }

    public boolean h() {
        C0232y yVar = (C0232y) this;
        X z = yVar.z();
        if (z.p() || !z.m(yVar.v(), (W) this.f1328V, 0).f2876h) {
            return false;
        }
        return true;
    }

    public boolean i() {
        int i;
        androidx.fragment.app.W w2 = (androidx.fragment.app.W) this.f1328V;
        View view = w2.f7946c.f8045A0;
        if (view != null) {
            i = N7.a.a(view);
        } else {
            i = 0;
        }
        int i8 = w2.f7944a;
        if (i == i8 || (i != 2 && i8 != 2)) {
            return true;
        }
        return false;
    }

    public void j(i iVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f1328V;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(iVar);
        }
    }

    public abstract void k(long j7, int i, boolean z);

    public void l() {
        int i;
        boolean z;
        int i8;
        C0232y yVar = (C0232y) this;
        if (yVar.z().p() || yVar.G()) {
            d();
            return;
        }
        X z6 = yVar.z();
        if (z6.p()) {
            i = -1;
        } else {
            int v4 = yVar.v();
            yVar.Y();
            int i9 = yVar.f4912A0;
            if (i9 == 1) {
                i9 = 0;
            }
            yVar.Y();
            i = z6.e(v4, i9, yVar.f4913B0);
        }
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            X z8 = yVar.z();
            if (z8.p()) {
                i8 = -1;
            } else {
                int v8 = yVar.v();
                yVar.Y();
                int i10 = yVar.f4912A0;
                if (i10 == 1) {
                    i10 = 0;
                }
                yVar.Y();
                i8 = z8.e(v8, i10, yVar.f4913B0);
            }
            if (i8 == -1) {
                d();
            } else if (i8 == yVar.v()) {
                k(-9223372036854775807L, yVar.v(), true);
            } else {
                k(-9223372036854775807L, i8, false);
            }
        } else if (!g() || !f()) {
            d();
        } else {
            k(-9223372036854775807L, yVar.v(), false);
        }
    }

    public void m(int i, long j7) {
        long j8;
        C0232y yVar = (C0232y) this;
        long x8 = yVar.x() + j7;
        yVar.Y();
        if (yVar.G()) {
            T0.X x9 = yVar.f4945b1;
            C1031B b8 = x9.f4750b;
            Object obj = b8.f12277a;
            X x10 = x9.f4749a;
            V v4 = yVar.f4954i0;
            x10.g(obj, v4);
            j8 = z.c0(v4.a(b8.f12278b, b8.f12279c));
        } else {
            j8 = yVar.b();
        }
        if (j8 != -9223372036854775807L) {
            x8 = Math.min(x8, j8);
        }
        k(Math.max(x8, 0), yVar.v(), false);
    }

    public q m0(w wVar) {
        return new C0082c(2, (H2.z) this.f1328V);
    }

    public void n() {
        int i;
        boolean z;
        int i8;
        int i9;
        C0232y yVar = (C0232y) this;
        if (yVar.z().p() || yVar.G()) {
            d();
            return;
        }
        X z6 = yVar.z();
        if (z6.p()) {
            i = -1;
        } else {
            int v4 = yVar.v();
            yVar.Y();
            int i10 = yVar.f4912A0;
            if (i10 == 1) {
                i10 = 0;
            }
            yVar.Y();
            i = z6.k(v4, i10, yVar.f4913B0);
        }
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!g() || h()) {
            if (z) {
                long x8 = yVar.x();
                yVar.Y();
                if (x8 <= yVar.f4962r0) {
                    X z8 = yVar.z();
                    if (z8.p()) {
                        i8 = -1;
                    } else {
                        int v8 = yVar.v();
                        yVar.Y();
                        int i11 = yVar.f4912A0;
                        if (i11 == 1) {
                            i11 = 0;
                        }
                        yVar.Y();
                        i8 = z8.k(v8, i11, yVar.f4913B0);
                    }
                    if (i8 == -1) {
                        d();
                        return;
                    } else if (i8 == yVar.v()) {
                        k(-9223372036854775807L, yVar.v(), true);
                        return;
                    } else {
                        k(-9223372036854775807L, i8, false);
                        return;
                    }
                }
            }
            k(0, yVar.v(), false);
        } else if (z) {
            X z9 = yVar.z();
            if (z9.p()) {
                i9 = -1;
            } else {
                int v9 = yVar.v();
                yVar.Y();
                int i12 = yVar.f4912A0;
                if (i12 == 1) {
                    i12 = 0;
                }
                yVar.Y();
                i9 = z9.k(v9, i12, yVar.f4913B0);
            }
            if (i9 == -1) {
                d();
            } else if (i9 == yVar.v()) {
                k(-9223372036854775807L, yVar.v(), true);
            } else {
                k(-9223372036854775807L, i9, false);
            }
        } else {
            d();
        }
    }

    public void o(h hVar, Object obj) {
        f.e(hVar, "property");
        Object obj2 = this.f1328V;
        this.f1328V = obj;
        a(hVar, obj2, obj);
    }

    public String toString() {
        switch (this.f1327U) {
            case 3:
                return "ObservableProperty(value=" + this.f1328V + ')';
            default:
                return super.toString();
        }
    }

    public a(int i) {
        this.f1327U = i;
        switch (i) {
            case 2:
                this.f1328V = new W();
                return;
            default:
                char[] cArr = m.f6173a;
                this.f1328V = new ArrayDeque(20);
                return;
        }
    }

    public a(androidx.fragment.app.W w2) {
        this.f1327U = 4;
        f.e(w2, "operation");
        this.f1328V = w2;
    }
}
