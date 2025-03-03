package G;

import A.d;
import F.a;
import L3.b;
import a0.j;
import a0.k;

public final /* synthetic */ class f implements k {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1604U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ b f1605V;

    public /* synthetic */ f(b bVar, int i) {
        this.f1604U = i;
        this.f1605V = bVar;
    }

    public final Object h(j jVar) {
        switch (this.f1604U) {
            case 0:
                d dVar = new d(13, jVar);
                a l8 = D7.b.l();
                b bVar = this.f1605V;
                bVar.d(dVar, l8);
                return "transformVoidFuture [" + bVar + "]";
            default:
                a l9 = D7.b.l();
                b bVar2 = this.f1605V;
                i.e(false, bVar2, jVar, l9);
                return "nonCancellationPropagating[" + bVar2 + "]";
        }
    }
}
