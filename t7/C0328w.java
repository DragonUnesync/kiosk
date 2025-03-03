package T7;

import Q0.d;
import R7.h;
import S7.k;

/* 'enum' modifier removed */
/* renamed from: T7.w  reason: case insensitive filesystem */
public final class C0328w extends B {
    public C0328w() {
        super("AfterHead", 5);
    }

    public final boolean d(d dVar, C0287b bVar) {
        if (B.a(dVar)) {
            bVar.C((I) dVar);
        } else if (dVar.k()) {
            bVar.E((J) dVar);
        } else if (dVar.l()) {
            bVar.s(this);
        } else {
            boolean o2 = dVar.o();
            C0324u uVar = B.f5054X;
            if (o2) {
                N n4 = (N) dVar;
                String str = n4.f5105X;
                boolean equals = str.equals("html");
                C0330x xVar = B.f5057a0;
                if (equals) {
                    bVar.getClass();
                    return xVar.d(dVar, bVar);
                } else if (str.equals("body")) {
                    bVar.F(n4);
                    bVar.f5170u = false;
                    bVar.f5161l = xVar;
                } else if (str.equals("frameset")) {
                    bVar.F(n4);
                    bVar.f5161l = B.f5070n0;
                } else if (h.d(str, A.f5033g)) {
                    bVar.s(this);
                    k kVar = bVar.f5164o;
                    bVar.e.add(kVar);
                    uVar.d(dVar, bVar);
                    bVar.S(kVar);
                } else if (str.equals("head")) {
                    bVar.s(this);
                    return false;
                } else {
                    bVar.j("body");
                    bVar.f5170u = true;
                    bVar.h(dVar);
                }
            } else if (dVar.n()) {
                String str2 = ((M) dVar).f5105X;
                if (h.d(str2, A.f5031d)) {
                    bVar.j("body");
                    bVar.f5170u = true;
                    bVar.h(dVar);
                } else if (str2.equals("template")) {
                    bVar.getClass();
                    uVar.d(dVar, bVar);
                } else {
                    bVar.s(this);
                    return false;
                }
            } else {
                bVar.j("body");
                bVar.f5170u = true;
                bVar.h(dVar);
            }
        }
        return true;
    }
}
