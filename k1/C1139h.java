package k1;

import H3.E;
import M0.r;
import Q0.g;

/* renamed from: k1.h  reason: case insensitive filesystem */
public final class C1139h implements Comparable {

    /* renamed from: U  reason: collision with root package name */
    public final boolean f12951U;

    /* renamed from: V  reason: collision with root package name */
    public final boolean f12952V;

    public C1139h(r rVar, int i) {
        this.f12951U = (rVar.e & 1) == 0 ? false : true;
        this.f12952V = g.i(i, false);
    }

    public final int compareTo(Object obj) {
        C1139h hVar = (C1139h) obj;
        return E.f2008a.c(this.f12952V, hVar.f12952V).c(this.f12951U, hVar.f12951U).e();
    }
}
