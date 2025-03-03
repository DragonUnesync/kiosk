package q2;

import B.C0003d;
import p2.g;
import p2.k;
import p2.u;
import y2.C1627b;

public final class b extends C0003d {

    /* renamed from: a  reason: collision with root package name */
    public static final b f14753a = new Object();

    public final void R(C1627b bVar, k kVar) {
        int m8 = ((u) kVar).m();
        bVar.k(C0003d.D(kVar, 0));
        bVar.k((short) m8);
        bVar.k((short) (m8 >> 16));
    }

    public final int g() {
        return 3;
    }

    public final String t(k kVar) {
        return C0003d.c(kVar);
    }

    public final String u(k kVar) {
        return C0003d.a(kVar);
    }

    public final boolean v(g gVar) {
        if (!(gVar instanceof u) || gVar.f14464d.f16371V.length != 0) {
            return false;
        }
        return true;
    }
}
