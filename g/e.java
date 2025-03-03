package G;

import L3.b;
import a0.j;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

public final /* synthetic */ class e implements Callable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ j f1601U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ b f1602V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ long f1603W;

    public /* synthetic */ e(j jVar, b bVar, long j7) {
        this.f1601U = jVar;
        this.f1602V = bVar;
        this.f1603W = j7;
    }

    public final Object call() {
        return Boolean.valueOf(this.f1601U.b(new TimeoutException("Future[" + this.f1602V + "] is not done within " + this.f1603W + " ms.")));
    }
}
