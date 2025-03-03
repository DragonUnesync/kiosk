package v6;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m6.a;

/* renamed from: v6.e  reason: case insensitive filesystem */
public final class C1566e implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final long f16099U;

    /* renamed from: V  reason: collision with root package name */
    public final ConcurrentLinkedQueue f16100V;

    /* renamed from: W  reason: collision with root package name */
    public final a f16101W;

    /* renamed from: X  reason: collision with root package name */
    public final ScheduledExecutorService f16102X;

    /* renamed from: Y  reason: collision with root package name */
    public final ScheduledFuture f16103Y;

    /* renamed from: Z  reason: collision with root package name */
    public final k f16104Z;

    public C1566e(long j7, TimeUnit timeUnit, k kVar) {
        long j8;
        ScheduledFuture<?> scheduledFuture;
        ScheduledExecutorService scheduledExecutorService;
        if (timeUnit != null) {
            j8 = timeUnit.toNanos(j7);
        } else {
            j8 = 0;
        }
        long j9 = j8;
        this.f16099U = j9;
        this.f16100V = new ConcurrentLinkedQueue();
        this.f16101W = new a(0);
        this.f16104Z = kVar;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, C1569h.f16111c);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j9, j9, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        this.f16102X = scheduledExecutorService;
        this.f16103Y = scheduledFuture;
    }

    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f16100V;
        if (!concurrentLinkedQueue.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                C1568g gVar = (C1568g) it.next();
                if (gVar.f16109W > nanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(gVar)) {
                    this.f16101W.g(gVar);
                }
            }
        }
    }
}
