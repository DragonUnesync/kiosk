package T7;

import Q0.d;
import R7.h;

/* 'enum' modifier removed */
/* renamed from: T7.g  reason: case insensitive filesystem */
public final class C0297g extends B {
    public C0297g() {
        super("InRow", 13);
    }

    public final boolean d(d dVar, C0287b bVar) {
        boolean o2 = dVar.o();
        C0334z zVar = B.f5059c0;
        C0295f fVar = B.f5063g0;
        if (o2) {
            N n4 = (N) dVar;
            String str = n4.f5105X;
            if (h.d(str, A.f5048w)) {
                bVar.p();
                bVar.F(n4);
                bVar.f5161l = B.f5065i0;
                bVar.f5166q.add((Object) null);
                return true;
            } else if (!h.d(str, A.f5018E)) {
                bVar.getClass();
                return zVar.d(dVar, bVar);
            } else if (!bVar.B("tr")) {
                bVar.s(this);
                return false;
            } else {
                bVar.p();
                bVar.g();
                bVar.f5161l = fVar;
                return bVar.h(dVar);
            }
        } else if (dVar.n()) {
            String str2 = ((M) dVar).f5105X;
            if (str2.equals("tr")) {
                if (!bVar.B(str2)) {
                    bVar.s(this);
                    return false;
                }
                bVar.p();
                bVar.g();
                bVar.f5161l = fVar;
                return true;
            } else if (str2.equals("table")) {
                if (!bVar.B("tr")) {
                    bVar.s(this);
                    return false;
                }
                bVar.p();
                bVar.g();
                bVar.f5161l = fVar;
                return bVar.h(dVar);
            } else if (h.d(str2, A.f5045t)) {
                if (!bVar.B(str2)) {
                    bVar.s(this);
                    return false;
                } else if (!bVar.B("tr")) {
                    return false;
                } else {
                    bVar.p();
                    bVar.g();
                    bVar.f5161l = fVar;
                    return bVar.h(dVar);
                }
            } else if (h.d(str2, A.f5019F)) {
                bVar.s(this);
                return false;
            } else {
                bVar.getClass();
                return zVar.d(dVar, bVar);
            }
        } else {
            bVar.getClass();
            return zVar.d(dVar, bVar);
        }
    }
}
