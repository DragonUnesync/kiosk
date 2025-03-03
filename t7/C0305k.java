package T7;

import Q0.d;
import R7.h;
import u.C1477r;

/* 'enum' modifier removed */
/* renamed from: T7.k  reason: case insensitive filesystem */
public final class C0305k extends B {
    public C0305k() {
        super("InTemplate", 17);
    }

    public final boolean d(d dVar, C0287b bVar) {
        int h5 = C1477r.h(dVar.f4018V);
        C0330x xVar = B.f5057a0;
        if (h5 != 0) {
            C0324u uVar = B.f5054X;
            if (h5 == 1) {
                String str = ((N) dVar).f5105X;
                if (h.d(str, A.f5025L)) {
                    bVar.getClass();
                    uVar.d(dVar, bVar);
                } else if (h.d(str, A.f5026M)) {
                    bVar.O();
                    C0334z zVar = B.f5059c0;
                    bVar.P(zVar);
                    bVar.f5161l = zVar;
                    return bVar.h(dVar);
                } else if (str.equals("col")) {
                    bVar.O();
                    C0293e eVar = B.f5062f0;
                    bVar.P(eVar);
                    bVar.f5161l = eVar;
                    return bVar.h(dVar);
                } else if (str.equals("tr")) {
                    bVar.O();
                    C0295f fVar = B.f5063g0;
                    bVar.P(fVar);
                    bVar.f5161l = fVar;
                    return bVar.h(dVar);
                } else if (str.equals("td") || str.equals("th")) {
                    bVar.O();
                    C0297g gVar = B.f5064h0;
                    bVar.P(gVar);
                    bVar.f5161l = gVar;
                    return bVar.h(dVar);
                } else {
                    bVar.O();
                    bVar.P(xVar);
                    bVar.f5161l = xVar;
                    return bVar.h(dVar);
                }
            } else if (h5 != 2) {
                if (!(h5 == 3 || h5 == 4)) {
                    if (h5 != 5 || !bVar.K("template")) {
                        return true;
                    }
                    bVar.s(this);
                    bVar.N("template");
                    bVar.m();
                    bVar.O();
                    bVar.T();
                    if (bVar.f5161l == B.f5068l0 || bVar.f5167r.size() >= 12) {
                        return true;
                    }
                    return bVar.h(dVar);
                }
            } else if (((M) dVar).f5105X.equals("template")) {
                bVar.getClass();
                uVar.d(dVar, bVar);
            } else {
                bVar.s(this);
                return false;
            }
            return true;
        }
        bVar.getClass();
        xVar.d(dVar, bVar);
        return true;
    }
}
