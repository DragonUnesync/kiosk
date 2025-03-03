package T7;

import Q0.d;

/* 'enum' modifier removed */
/* renamed from: T7.q  reason: case insensitive filesystem */
public final class C0317q extends B {
    public C0317q() {
        super("AfterAfterFrameset", 22);
    }

    public final boolean d(d dVar, C0287b bVar) {
        if (dVar.k()) {
            bVar.E((J) dVar);
            return true;
        } else if (dVar.l() || B.a(dVar) || (dVar.o() && ((N) dVar).f5105X.equals("html"))) {
            C0330x xVar = B.f5057a0;
            bVar.getClass();
            return xVar.d(dVar, bVar);
        } else if (dVar.m()) {
            return true;
        } else {
            if (!dVar.o() || !((N) dVar).f5105X.equals("noframes")) {
                bVar.s(this);
                return false;
            }
            C0324u uVar = B.f5054X;
            bVar.getClass();
            return uVar.d(dVar, bVar);
        }
    }
}
