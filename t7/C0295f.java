package T7;

import Q0.d;
import R7.h;
import u.C1477r;

/* 'enum' modifier removed */
/* renamed from: T7.f  reason: case insensitive filesystem */
public final class C0295f extends B {
    public C0295f() {
        super("InTableBody", 12);
    }

    public final boolean d(d dVar, C0287b bVar) {
        int h5 = C1477r.h(dVar.f4018V);
        C0334z zVar = B.f5059c0;
        if (h5 == 1) {
            N n4 = (N) dVar;
            String str = n4.f5105X;
            if (str.equals("tr")) {
                bVar.n("tbody", "tfoot", "thead", "template");
                bVar.F(n4);
                bVar.f5161l = B.f5064h0;
            } else if (h.d(str, A.f5048w)) {
                bVar.s(this);
                bVar.j("tr");
                return bVar.h(n4);
            } else if (h.d(str, A.f5016C)) {
                return e(dVar, bVar);
            } else {
                bVar.getClass();
                return zVar.d(dVar, bVar);
            }
        } else if (h5 != 2) {
            bVar.getClass();
            return zVar.d(dVar, bVar);
        } else {
            String str2 = ((M) dVar).f5105X;
            if (h.d(str2, A.f5022I)) {
                if (!bVar.B(str2)) {
                    bVar.s(this);
                    return false;
                }
                bVar.n("tbody", "tfoot", "thead", "template");
                bVar.g();
                bVar.f5161l = zVar;
            } else if (str2.equals("table")) {
                return e(dVar, bVar);
            } else {
                if (h.d(str2, A.f5017D)) {
                    bVar.s(this);
                    return false;
                }
                bVar.getClass();
                return zVar.d(dVar, bVar);
            }
        }
        return true;
    }

    public final boolean e(d dVar, C0287b bVar) {
        if (bVar.B("tbody") || bVar.B("thead") || bVar.y("tfoot")) {
            bVar.n("tbody", "tfoot", "thead", "template");
            bVar.i(bVar.a().f4559X.f5086V);
            return bVar.h(dVar);
        }
        bVar.s(this);
        return false;
    }
}
