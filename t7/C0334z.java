package T7;

import Q0.d;
import R7.h;
import S7.c;

/* 'enum' modifier removed */
/* renamed from: T7.z  reason: case insensitive filesystem */
public final class C0334z extends B {
    public C0334z() {
        super("InTable", 8);
    }

    public final boolean d(d dVar, C0287b bVar) {
        if (dVar.j() && h.d(bVar.a().f4559X.f5086V, A.f5015B)) {
            bVar.f5168s.clear();
            bVar.f5162m = bVar.f5161l;
            bVar.f5161l = B.f5060d0;
            return bVar.h(dVar);
        } else if (dVar.k()) {
            bVar.E((J) dVar);
            return true;
        } else if (dVar.l()) {
            bVar.s(this);
            return false;
        } else {
            boolean o2 = dVar.o();
            C0324u uVar = B.f5054X;
            if (o2) {
                N n4 = (N) dVar;
                String str = n4.f5105X;
                if (str.equals("caption")) {
                    bVar.o();
                    bVar.f5166q.add((Object) null);
                    bVar.F(n4);
                    bVar.f5161l = B.f5061e0;
                } else if (str.equals("colgroup")) {
                    bVar.o();
                    bVar.F(n4);
                    bVar.f5161l = B.f5062f0;
                } else if (str.equals("col")) {
                    bVar.o();
                    bVar.j("colgroup");
                    return bVar.h(dVar);
                } else if (h.d(str, A.f5045t)) {
                    bVar.o();
                    bVar.F(n4);
                    bVar.f5161l = B.f5063g0;
                } else if (h.d(str, A.f5046u)) {
                    bVar.o();
                    bVar.j("tbody");
                    return bVar.h(dVar);
                } else if (str.equals("table")) {
                    bVar.s(this);
                    if (!bVar.B(str)) {
                        return false;
                    }
                    bVar.N(str);
                    if (bVar.T()) {
                        return bVar.h(dVar);
                    }
                    bVar.F(n4);
                    return true;
                } else if (h.d(str, A.f5047v)) {
                    bVar.getClass();
                    return uVar.d(dVar, bVar);
                } else if (str.equals("input")) {
                    c cVar = n4.f5107Z;
                    if (cVar == null || !cVar.g("type").equalsIgnoreCase("hidden")) {
                        e(dVar, bVar);
                        return true;
                    }
                    bVar.G(n4);
                } else if (str.equals("form")) {
                    bVar.s(this);
                    if (bVar.f5165p != null || bVar.K("template")) {
                        return false;
                    }
                    bVar.I(n4, false, false);
                } else {
                    e(dVar, bVar);
                    return true;
                }
                return true;
            } else if (dVar.n()) {
                String str2 = ((M) dVar).f5105X;
                if (str2.equals("table")) {
                    if (!bVar.B(str2)) {
                        bVar.s(this);
                        return false;
                    }
                    bVar.N("table");
                    bVar.T();
                } else if (h.d(str2, A.f5014A)) {
                    bVar.s(this);
                    return false;
                } else if (str2.equals("template")) {
                    bVar.getClass();
                    uVar.d(dVar, bVar);
                } else {
                    e(dVar, bVar);
                    return true;
                }
                return true;
            } else if (dVar.m()) {
                if (bVar.b("html")) {
                    bVar.s(this);
                }
                return true;
            } else {
                e(dVar, bVar);
                return true;
            }
        }
    }

    public final void e(d dVar, C0287b bVar) {
        bVar.s(this);
        bVar.f5171v = true;
        B.f5057a0.d(dVar, bVar);
        bVar.f5171v = false;
    }
}
