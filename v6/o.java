package v6;

import g7.C0996d;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l6.d;
import l6.e;
import m6.a;
import m6.b;
import o6.C1326b;

public final class o extends e {

    /* renamed from: U  reason: collision with root package name */
    public final ScheduledExecutorService f16137U;

    /* renamed from: V  reason: collision with root package name */
    public final a f16138V = new a(0);

    /* renamed from: W  reason: collision with root package name */
    public volatile boolean f16139W;

    public o(ScheduledExecutorService scheduledExecutorService) {
        this.f16137U = scheduledExecutorService;
    }

    public final b a(d dVar, TimeUnit timeUnit) {
        boolean z = this.f16139W;
        C1326b bVar = C1326b.f14277U;
        if (z) {
            return bVar;
        }
        m mVar = new m(dVar, this.f16138V);
        this.f16138V.a(mVar);
        try {
            mVar.a(this.f16137U.submit(mVar));
            return mVar;
        } catch (RejectedExecutionException e) {
            d();
            C0996d.s(e);
            return bVar;
        }
    }

    public final void d() {
        if (!this.f16139W) {
            this.f16139W = true;
            this.f16138V.d();
        }
    }
}
