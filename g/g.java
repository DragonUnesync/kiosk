package G;

import A.d;
import F.a;
import F.e;
import L3.b;
import a0.j;
import a0.k;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class g implements k {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ b f1606U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ e f1607V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ long f1608W;

    public /* synthetic */ g(b bVar, e eVar, long j7) {
        this.f1606U = bVar;
        this.f1607V = eVar;
        this.f1608W = j7;
    }

    public final Object h(j jVar) {
        a l8 = D7.b.l();
        b bVar = this.f1606U;
        i.e(true, bVar, jVar, l8);
        if (!bVar.isDone()) {
            long j7 = this.f1608W;
            bVar.d(new d(12, this.f1607V.schedule((Callable) new e(jVar, bVar, j7), j7, TimeUnit.MILLISECONDS)), D7.b.l());
        }
        return "TimeoutFuture[" + bVar + "]";
    }
}
