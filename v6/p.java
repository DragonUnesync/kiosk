package v6;

import g7.C0996d;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l6.e;
import l6.f;
import m6.b;
import o6.C1326b;

public final class p extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final k f16140b = new k(Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), "RxSingleScheduler", true);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f16141a;

    static {
        Executors.newScheduledThreadPool(0).shutdown();
    }

    public p() {
        AtomicReference atomicReference = new AtomicReference();
        this.f16141a = atomicReference;
        boolean z = n.f16133a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, f16140b);
        if (n.f16133a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            n.f16136d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    public final e a() {
        return new o((ScheduledExecutorService) this.f16141a.get());
    }

    public final b c(Runnable runnable, TimeUnit timeUnit) {
        l lVar = new l(runnable);
        try {
            lVar.a(((ScheduledExecutorService) this.f16141a.get()).submit(lVar));
            return lVar;
        } catch (RejectedExecutionException e) {
            C0996d.s(e);
            return C1326b.f14277U;
        }
    }
}
