package L1;

import H3.M;
import H3.O;
import H3.i0;
import M0.C0132u;
import java.util.List;
import p1.B;
import p1.o;
import p1.p;
import p1.q;
import x1.C1601a;

public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2690a;

    /* renamed from: b  reason: collision with root package name */
    public final o f2691b;

    public a(int i, byte b8) {
        this.f2690a = i;
        switch (i) {
            case 1:
                this.f2691b = new B(16973, 2, "image/bmp");
                return;
            default:
                this.f2691b = new B(35152, 2, "image/png");
                return;
        }
    }

    private final void b() {
    }

    private final void d() {
    }

    public final void a(long j7, long j8) {
        switch (this.f2690a) {
            case 0:
                ((B) this.f2691b).a(j7, j8);
                return;
            case 1:
                ((B) this.f2691b).a(j7, j8);
                return;
            default:
                this.f2691b.a(j7, j8);
                return;
        }
    }

    public final o c() {
        int i = this.f2690a;
        return this;
    }

    public final int e(p pVar, C0132u uVar) {
        switch (this.f2690a) {
            case 0:
                return ((B) this.f2691b).e(pVar, uVar);
            case 1:
                return ((B) this.f2691b).e(pVar, uVar);
            default:
                return this.f2691b.e(pVar, uVar);
        }
    }

    public final List f() {
        switch (this.f2690a) {
            case 0:
                M m8 = O.f2026V;
                return i0.f2073Y;
            case 1:
                M m9 = O.f2026V;
                return i0.f2073Y;
            default:
                M m10 = O.f2026V;
                return i0.f2073Y;
        }
    }

    public final boolean h(p pVar) {
        switch (this.f2690a) {
            case 0:
                return ((B) this.f2691b).h(pVar);
            case 1:
                return ((B) this.f2691b).h(pVar);
            default:
                return this.f2691b.h(pVar);
        }
    }

    public final void l(q qVar) {
        switch (this.f2690a) {
            case 0:
                ((B) this.f2691b).l(qVar);
                return;
            case 1:
                ((B) this.f2691b).l(qVar);
                return;
            default:
                this.f2691b.l(qVar);
                return;
        }
    }

    public final void release() {
        switch (this.f2690a) {
            case 0:
            case 1:
                return;
            default:
                this.f2691b.release();
                return;
        }
    }

    public a(int i) {
        this.f2690a = 2;
        if ((i & 1) != 0) {
            this.f2691b = new B(65496, 2, "image/jpeg");
        } else {
            this.f2691b = new C1601a();
        }
    }
}
