package T7;

import Q0.d;
import R7.h;
import java.util.Iterator;

/* 'enum' modifier removed */
/* renamed from: T7.c  reason: case insensitive filesystem */
public final class C0289c extends B {
    public C0289c() {
        super("InTableText", 9);
    }

    public final boolean d(d dVar, C0287b bVar) {
        if (dVar.f4018V == 5) {
            I i = (I) dVar;
            if (i.f5095W.equals(B.f5074s0)) {
                bVar.s(this);
                return false;
            }
            bVar.getClass();
            bVar.f5168s.add(i.clone());
            return true;
        }
        if (bVar.f5168s.size() > 0) {
            d dVar2 = bVar.f5248g;
            Iterator it = bVar.f5168s.iterator();
            while (it.hasNext()) {
                I i8 = (I) it.next();
                bVar.f5248g = i8;
                if (!B.a(i8)) {
                    bVar.s(this);
                    boolean d8 = h.d(bVar.a().f4559X.f5086V, A.f5015B);
                    C0330x xVar = B.f5057a0;
                    if (d8) {
                        bVar.f5171v = true;
                        xVar.d(i8, bVar);
                        bVar.f5171v = false;
                    } else {
                        xVar.d(i8, bVar);
                    }
                } else {
                    bVar.C(i8);
                }
            }
            bVar.f5248g = dVar2;
            bVar.f5168s.clear();
        }
        bVar.f5161l = bVar.f5162m;
        return bVar.h(dVar);
    }
}
