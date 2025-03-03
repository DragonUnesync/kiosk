package T7;

import Q0.d;
import R7.h;

/* 'enum' modifier removed */
/* renamed from: T7.h  reason: case insensitive filesystem */
public final class C0299h extends B {
    public C0299h() {
        super("InCell", 14);
    }

    public final boolean d(d dVar, C0287b bVar) {
        boolean n4 = dVar.n();
        C0330x xVar = B.f5057a0;
        if (n4) {
            String str = ((M) dVar).f5105X;
            if (h.d(str, A.f5048w)) {
                boolean B8 = bVar.B(str);
                C0297g gVar = B.f5064h0;
                if (!B8) {
                    bVar.s(this);
                    bVar.f5161l = gVar;
                    return false;
                }
                bVar.u(false);
                if (!bVar.b(str)) {
                    bVar.s(this);
                }
                bVar.N(str);
                bVar.m();
                bVar.f5161l = gVar;
                return true;
            } else if (h.d(str, A.f5049x)) {
                bVar.s(this);
                return false;
            } else if (!h.d(str, A.f5050y)) {
                bVar.getClass();
                return xVar.d(dVar, bVar);
            } else if (!bVar.B(str)) {
                bVar.s(this);
                return false;
            } else {
                if (bVar.B("td")) {
                    bVar.i("td");
                } else {
                    bVar.i("th");
                }
                return bVar.h(dVar);
            }
        } else if (!dVar.o() || !h.d(((N) dVar).f5105X, A.z)) {
            bVar.getClass();
            return xVar.d(dVar, bVar);
        } else if (bVar.B("td") || bVar.B("th")) {
            if (bVar.B("td")) {
                bVar.i("td");
            } else {
                bVar.i("th");
            }
            return bVar.h(dVar);
        } else {
            bVar.s(this);
            return false;
        }
    }
}
