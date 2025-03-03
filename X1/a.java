package X1;

import H3.M;
import H3.O;
import H3.i0;
import M0.C0132u;
import P0.r;
import java.util.List;
import p1.B;
import p1.l;
import p1.o;
import p1.p;
import p1.q;

public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6277a;

    /* renamed from: b  reason: collision with root package name */
    public final r f6278b;

    /* renamed from: c  reason: collision with root package name */
    public final B f6279c;

    public a(int i) {
        this.f6277a = i;
        switch (i) {
            case 1:
                this.f6278b = new r(4);
                this.f6279c = new B(-1, -1, "image/avif");
                return;
            case 2:
                this.f6278b = new r(4);
                this.f6279c = new B(-1, -1, "image/heif");
                return;
            default:
                this.f6278b = new r(4);
                this.f6279c = new B(-1, -1, "image/webp");
                return;
        }
    }

    private final void b() {
    }

    private final void d() {
    }

    private final void g() {
    }

    public final void a(long j7, long j8) {
        switch (this.f6277a) {
            case 0:
                this.f6279c.a(j7, j8);
                return;
            case 1:
                this.f6279c.a(j7, j8);
                return;
            default:
                this.f6279c.a(j7, j8);
                return;
        }
    }

    public final o c() {
        int i = this.f6277a;
        return this;
    }

    public final int e(p pVar, C0132u uVar) {
        switch (this.f6277a) {
            case 0:
                return this.f6279c.e(pVar, uVar);
            case 1:
                return this.f6279c.e(pVar, uVar);
            default:
                return this.f6279c.e(pVar, uVar);
        }
    }

    public final List f() {
        switch (this.f6277a) {
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
        switch (this.f6277a) {
            case 0:
                r rVar = this.f6278b;
                rVar.E(4);
                l lVar = (l) pVar;
                lVar.r(rVar.f3732a, 0, 4, false);
                if (rVar.x() != 1380533830) {
                    return false;
                }
                lVar.b(4, false);
                rVar.E(4);
                lVar.r(rVar.f3732a, 0, 4, false);
                if (rVar.x() == 1464156752) {
                    return true;
                }
                return false;
            case 1:
                l lVar2 = (l) pVar;
                lVar2.b(4, false);
                r rVar2 = this.f6278b;
                rVar2.E(4);
                lVar2.r(rVar2.f3732a, 0, 4, false);
                if (rVar2.x() != ((long) 1718909296)) {
                    return false;
                }
                rVar2.E(4);
                lVar2.r(rVar2.f3732a, 0, 4, false);
                if (rVar2.x() == ((long) 1635150182)) {
                    return true;
                }
                return false;
            default:
                l lVar3 = (l) pVar;
                lVar3.b(4, false);
                r rVar3 = this.f6278b;
                rVar3.E(4);
                lVar3.r(rVar3.f3732a, 0, 4, false);
                if (rVar3.x() != ((long) 1718909296)) {
                    return false;
                }
                rVar3.E(4);
                lVar3.r(rVar3.f3732a, 0, 4, false);
                if (rVar3.x() == ((long) 1751476579)) {
                    return true;
                }
                return false;
        }
    }

    public final void l(q qVar) {
        switch (this.f6277a) {
            case 0:
                this.f6279c.l(qVar);
                return;
            case 1:
                this.f6279c.l(qVar);
                return;
            default:
                this.f6279c.l(qVar);
                return;
        }
    }

    public final void release() {
        int i = this.f6277a;
    }
}
