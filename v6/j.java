package v6;

import g7.C0996d;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l6.d;
import l6.e;
import m6.a;
import m6.b;
import o6.C1326b;

public class j extends e {

    /* renamed from: U  reason: collision with root package name */
    public final ScheduledExecutorService f16119U;

    /* renamed from: V  reason: collision with root package name */
    public volatile boolean f16120V;

    public j(k kVar) {
        boolean z = n.f16133a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, kVar);
        if (n.f16133a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            n.f16136d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.f16119U = newScheduledThreadPool;
    }

    public final b a(d dVar, TimeUnit timeUnit) {
        if (this.f16120V) {
            return C1326b.f14277U;
        }
        return b(dVar, timeUnit, (a) null);
    }

    public final m b(Runnable runnable, TimeUnit timeUnit, a aVar) {
        m mVar = new m(runnable, aVar);
        if (aVar != null && !aVar.a(mVar)) {
            return mVar;
        }
        try {
            mVar.a(this.f16119U.submit(mVar));
        } catch (RejectedExecutionException e) {
            if (aVar != null) {
                aVar.g(mVar);
            }
            C0996d.s(e);
        }
        return mVar;
    }

    public final void d() {
        if (!this.f16120V) {
            this.f16120V = true;
            this.f16119U.shutdownNow();
        }
    }
}
