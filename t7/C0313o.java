package T7;

import Q0.d;

/* 'enum' modifier removed */
/* renamed from: T7.o  reason: case insensitive filesystem */
public final class C0313o extends B {
    public C0313o() {
        super("AfterFrameset", 20);
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
            C0330x xVar = B.f5057a0;
            bVar.getClass();
            return xVar.d(dVar, bVar);
        } else if (dVar.n() && ((M) dVar).f5105X.equals("html")) {
            bVar.f5161l = B.f5072q0;
            return true;
        } else if (dVar.o() && ((N) dVar).f5105X.equals("noframes")) {
            C0324u uVar = B.f5054X;
            bVar.getClass();
            return uVar.d(dVar, bVar);
        } else if (dVar.m()) {
            return true;
        } else {
            bVar.s(this);
            return false;
        }
    }
}
