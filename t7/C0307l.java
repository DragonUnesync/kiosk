package T7;

import Q0.d;
import S7.k;

/* 'enum' modifier removed */
/* renamed from: T7.l  reason: case insensitive filesystem */
public final class C0307l extends B {
    public C0307l() {
        super("AfterBody", 18);
    }

    public final boolean d(d dVar, C0287b bVar) {
        k w2 = bVar.w("html");
        boolean a8 = B.a(dVar);
        C0330x xVar = B.f5057a0;
        if (a8) {
            if (w2 != null) {
                bVar.D((I) dVar, w2);
                return true;
            }
            xVar.d(dVar, bVar);
            return true;
        } else if (dVar.k()) {
            bVar.E((J) dVar);
            return true;
        } else if (dVar.l()) {
            bVar.s(this);
            return false;
        } else if (dVar.o() && ((N) dVar).f5105X.equals("html")) {
            return xVar.d(dVar, bVar);
        } else {
            if (dVar.n() && ((M) dVar).f5105X.equals("html")) {
                bVar.f5161l = B.p0;
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
}
