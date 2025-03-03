package T7;

import Q0.d;
import R7.h;

/* 'enum' modifier removed */
/* renamed from: T7.d  reason: case insensitive filesystem */
public final class C0291d extends B {
    public C0291d() {
        super("InCaption", 10);
    }

    public final boolean d(d dVar, C0287b bVar) {
        boolean n4 = dVar.n();
        C0334z zVar = B.f5059c0;
        if (!n4 || !((M) dVar).f5105X.equals("caption")) {
            if ((!dVar.o() || !h.d(((N) dVar).f5105X, A.z)) && (!dVar.n() || !((M) dVar).f5105X.equals("table"))) {
                if (!dVar.n() || !h.d(((M) dVar).f5105X, A.f5024K)) {
                    C0330x xVar = B.f5057a0;
                    bVar.getClass();
                    return xVar.d(dVar, bVar);
                }
                bVar.s(this);
                return false;
            } else if (!bVar.B("caption")) {
                bVar.s(this);
                return false;
            } else {
                bVar.u(false);
                if (!bVar.b("caption")) {
                    bVar.s(this);
                }
                bVar.N("caption");
                bVar.m();
                bVar.f5161l = zVar;
                zVar.d(dVar, bVar);
                return true;
            }
        } else if (!bVar.B("caption")) {
            bVar.s(this);
            return false;
        } else {
            bVar.u(false);
            if (!bVar.b("caption")) {
                bVar.s(this);
            }
            bVar.N("caption");
            bVar.m();
            bVar.f5161l = zVar;
            return true;
        }
    }
}
