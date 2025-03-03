package T7;

import Q0.d;

/* 'enum' modifier removed */
/* renamed from: T7.p  reason: case insensitive filesystem */
public final class C0315p extends B {
    public C0315p() {
        super("AfterAfterBody", 21);
    }

    public final boolean d(d dVar, C0287b bVar) {
        if (dVar.k()) {
            bVar.E((J) dVar);
            return true;
        }
        boolean l8 = dVar.l();
        C0330x xVar = B.f5057a0;
        if (l8 || (dVar.o() && ((N) dVar).f5105X.equals("html"))) {
            bVar.getClass();
            return xVar.d(dVar, bVar);
        } else if (B.a(dVar)) {
            bVar.D((I) dVar, bVar.f5246d);
            return true;
        } else if (dVar.m()) {
            return true;
        } else {
            bVar.s(this);
            if (!bVar.K("body")) {
                bVar.e.add(bVar.f5246d.P());
            }
            bVar.f5161l = xVar;
            return bVar.h(dVar);
        }
    }
}
