package T7;

import Q0.d;
import R7.h;
import S7.c;
import S7.k;
import java.util.ArrayList;
import u.C1477r;

/* 'enum' modifier removed */
public final class r extends B {
    public r() {
        super("ForeignContent", 23);
    }

    public final boolean d(d dVar, C0287b bVar) {
        c cVar;
        c cVar2;
        c cVar3;
        k a8;
        int h5 = C1477r.h(dVar.f4018V);
        if (h5 == 0) {
            bVar.s(this);
        } else if (h5 == 1) {
            N n4 = (N) dVar;
            if (h.c(n4.f5105X, A.f5027N)) {
                return bVar.f5161l.d(dVar, bVar);
            }
            if (n4.f5105X.equals("font") && (((cVar = n4.f5107Z) != null && cVar.l("color") != -1) || (((cVar2 = n4.f5107Z) != null && cVar2.l("face") != -1) || ((cVar3 = n4.f5107Z) != null && cVar3.l("size") != -1)))) {
                return bVar.f5161l.d(dVar, bVar);
            }
            bVar.H(n4, bVar.a().f4559X.f5087W);
        } else if (h5 == 2) {
            M m8 = (M) dVar;
            if (m8.f5105X.equals("br") || m8.f5105X.equals("p")) {
                return bVar.f5161l.d(dVar, bVar);
            }
            if (!(!m8.f5105X.equals("script") || bVar.e.size() == 0 || (a8 = bVar.a()) == null)) {
                G g8 = a8.f4559X;
                if (g8.f5086V.equals("script") && g8.f5087W.equals("http://www.w3.org/2000/svg")) {
                    bVar.g();
                    return true;
                }
            }
            ArrayList arrayList = bVar.e;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size() - 1;
                k kVar = (k) arrayList.get(size);
                if (!kVar.o(m8.f5105X)) {
                    bVar.s(this);
                }
                while (size != 0) {
                    if (kVar.o(m8.f5105X)) {
                        String str = kVar.f4559X.f5086V;
                        for (int size2 = bVar.e.size() - 1; size2 >= 0 && !bVar.g().o(str); size2--) {
                        }
                        return true;
                    }
                    size--;
                    kVar = (k) arrayList.get(size);
                    if (kVar.f4559X.f5087W.equals("http://www.w3.org/1999/xhtml")) {
                        return bVar.f5161l.d(dVar, bVar);
                    }
                }
            } else {
                throw new IllegalStateException("Stack unexpectedly empty");
            }
        } else if (h5 == 3) {
            bVar.E((J) dVar);
        } else if (h5 == 4) {
            I i = (I) dVar;
            if (i.f5095W.equals(B.f5074s0)) {
                bVar.s(this);
            } else if (B.a(i)) {
                bVar.C(i);
            } else {
                bVar.C(i);
                bVar.f5170u = false;
            }
        }
        return true;
    }
}
