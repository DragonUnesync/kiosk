package H4;

import B6.a;
import r4.C1389a;
import s4.C1405a;
import t4.l;

public final class e implements a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2153U;

    /* renamed from: V  reason: collision with root package name */
    public final a f2154V;

    public /* synthetic */ e(a aVar, int i) {
        this.f2153U = i;
        this.f2154V = aVar;
    }

    public final Object get() {
        switch (this.f2153U) {
            case 0:
                return new d((a) this.f2154V.get());
            case 1:
                return new C1389a((C1405a) this.f2154V.get());
            default:
                l lVar = (l) this.f2154V.get();
                return new Object();
        }
    }
}
