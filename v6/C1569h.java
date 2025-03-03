package v6;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l6.e;
import l6.f;

/* renamed from: v6.h  reason: case insensitive filesystem */
public final class C1569h extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final k f16110b;

    /* renamed from: c  reason: collision with root package name */
    public static final k f16111c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f16112d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    public static final TimeUnit e = TimeUnit.SECONDS;

    /* renamed from: f  reason: collision with root package name */
    public static final C1568g f16113f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f16114g = Boolean.getBoolean("rx2.io-scheduled-release");

    /* renamed from: h  reason: collision with root package name */
    public static final C1566e f16115h;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f16116a;

    static {
        C1568g gVar = new C1568g(new k("RxCachedThreadSchedulerShutdown"));
        f16113f = gVar;
        gVar.d();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        k kVar = new k(max, "RxCachedThreadScheduler", false);
        f16110b = kVar;
        f16111c = new k(max, "RxCachedWorkerPoolEvictor", false);
        C1566e eVar = new C1566e(0, (TimeUnit) null, kVar);
        f16115h = eVar;
        eVar.f16101W.d();
        ScheduledFuture scheduledFuture = eVar.f16103Y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = eVar.f16102X;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C1569h() {
        AtomicReference atomicReference;
        k kVar = f16110b;
        C1566e eVar = f16115h;
        this.f16116a = new AtomicReference(eVar);
        C1566e eVar2 = new C1566e(f16112d, e, kVar);
        do {
            atomicReference = this.f16116a;
            if (atomicReference.compareAndSet(eVar, eVar2)) {
                return;
            }
        } while (atomicReference.get() == eVar);
        eVar2.f16101W.d();
        ScheduledFuture scheduledFuture = eVar2.f16103Y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = eVar2.f16102X;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public final e a() {
        return new C1567f((C1566e) this.f16116a.get());
    }
}
