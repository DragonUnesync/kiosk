package T7;

import Q0.d;
import R7.h;
import S7.k;
import u.C1477r;

/* 'enum' modifier removed */
/* renamed from: T7.u  reason: case insensitive filesystem */
public final class C0324u extends B {
    public C0324u() {
        super("InHead", 3);
    }

    public final boolean d(d dVar, C0287b bVar) {
        if (B.a(dVar)) {
            bVar.C((I) dVar);
            return true;
        }
        int h5 = C1477r.h(dVar.f4018V);
        if (h5 != 0) {
            if (h5 == 1) {
                N n4 = (N) dVar;
                String str = n4.f5105X;
                if (str.equals("html")) {
                    return B.f5057a0.d(dVar, bVar);
                }
                if (h.d(str, A.f5028a)) {
                    k G8 = bVar.G(n4);
                    if (str.equals("base") && G8.l("href") && !bVar.f5163n) {
                        String a8 = G8.a("href");
                        if (a8.length() != 0) {
                            bVar.f5247f = a8;
                            bVar.f5163n = true;
                            S7.h hVar = bVar.f5246d;
                            hVar.getClass();
                            hVar.G(a8);
                        }
                    }
                } else if (str.equals("meta")) {
                    bVar.G(n4);
                } else {
                    boolean equals = str.equals("title");
                    C0332y yVar = B.f5058b0;
                    if (equals) {
                        bVar.f5245c.p(h1.f5197W);
                        bVar.f5162m = bVar.f5161l;
                        bVar.f5161l = yVar;
                        bVar.F(n4);
                    } else if (h.d(str, A.f5029b)) {
                        B.b(n4, bVar);
                    } else if (str.equals("noscript")) {
                        bVar.F(n4);
                        bVar.f5161l = B.f5055Y;
                    } else if (str.equals("script")) {
                        bVar.f5245c.p(h1.f5203Z);
                        bVar.f5162m = bVar.f5161l;
                        bVar.f5161l = yVar;
                        bVar.F(n4);
                    } else if (str.equals("head")) {
                        bVar.s(this);
                        return false;
                    } else if (str.equals("template")) {
                        bVar.F(n4);
                        bVar.f5166q.add((Object) null);
                        bVar.f5170u = false;
                        C0305k kVar = B.f5068l0;
                        bVar.f5161l = kVar;
                        bVar.P(kVar);
                    } else {
                        bVar.i("head");
                        return bVar.h(dVar);
                    }
                }
            } else if (h5 == 2) {
                String str2 = ((M) dVar).f5105X;
                if (str2.equals("head")) {
                    bVar.g();
                    bVar.f5161l = B.f5056Z;
                } else if (h.d(str2, A.f5030c)) {
                    bVar.i("head");
                    return bVar.h(dVar);
                } else if (!str2.equals("template")) {
                    bVar.s(this);
                    return false;
                } else if (!bVar.K(str2)) {
                    bVar.s(this);
                } else {
                    bVar.u(true);
                    if (!bVar.b(str2)) {
                        bVar.s(this);
                    }
                    bVar.N(str2);
                    bVar.m();
                    bVar.O();
                    bVar.T();
                }
            } else if (h5 != 3) {
                bVar.i("head");
                return bVar.h(dVar);
            } else {
                bVar.E((J) dVar);
            }
            return true;
        }
        bVar.s(this);
        return false;
    }
}
