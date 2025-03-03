package T7;

import Q0.d;
import R7.h;

/* 'enum' modifier removed */
/* renamed from: T7.t  reason: case insensitive filesystem */
public final class C0322t extends B {
    public C0322t() {
        super("BeforeHead", 2);
    }

    public final boolean d(d dVar, C0287b bVar) {
        if (B.a(dVar)) {
            bVar.C((I) dVar);
            return true;
        } else if (dVar.k()) {
            bVar.E((J) dVar);
            return true;
        } else if (dVar.l()) {
            bVar.s(this);
            return false;
        } else if (dVar.o() && ((N) dVar).f5105X.equals("html")) {
            return B.f5057a0.d(dVar, bVar);
        } else {
            if (dVar.o()) {
                N n4 = (N) dVar;
                if (n4.f5105X.equals("head")) {
                    bVar.f5164o = bVar.F(n4);
                    bVar.f5161l = B.f5054X;
                    return true;
                }
            }
            if (dVar.n() && h.d(((M) dVar).f5105X, A.e)) {
                bVar.j("head");
                return bVar.h(dVar);
            } else if (dVar.n()) {
                bVar.s(this);
                return false;
            } else {
                bVar.j("head");
                return bVar.h(dVar);
            }
        }
    }
}
