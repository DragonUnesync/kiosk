package T7;

import Q0.d;
import R7.h;

/* 'enum' modifier removed */
/* renamed from: T7.s  reason: case insensitive filesystem */
public final class C0320s extends B {
    public C0320s() {
        super("BeforeHtml", 1);
    }

    public final boolean d(d dVar, C0287b bVar) {
        if (dVar.l()) {
            bVar.s(this);
            return false;
        } else if (dVar.k()) {
            bVar.E((J) dVar);
            return true;
        } else if (B.a(dVar)) {
            bVar.C((I) dVar);
            return true;
        } else {
            boolean o2 = dVar.o();
            C0322t tVar = B.f5053W;
            if (o2) {
                N n4 = (N) dVar;
                if (n4.f5105X.equals("html")) {
                    bVar.F(n4);
                    bVar.f5161l = tVar;
                    return true;
                }
            }
            if (dVar.n() && h.d(((M) dVar).f5105X, A.e)) {
                bVar.j("html");
                bVar.f5161l = tVar;
                return bVar.h(dVar);
            } else if (dVar.n()) {
                bVar.s(this);
                return false;
            } else {
                bVar.j("html");
                bVar.f5161l = tVar;
                return bVar.h(dVar);
            }
        }
    }
}
