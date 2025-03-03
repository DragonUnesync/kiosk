package v6;

import g7.C0996d;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l6.e;
import l6.f;
import m6.b;
import o6.C1326b;

/* renamed from: v6.d  reason: case insensitive filesystem */
public final class C1565d extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final C1563b f16095b;

    /* renamed from: c  reason: collision with root package name */
    public static final k f16096c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f16097d;
    public static final C1564c e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f16098a;

    /* JADX WARNING: type inference failed for: r0v3, types: [v6.c, v6.j] */
    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f16097d = availableProcessors;
        ? jVar = new j(new k("RxComputationShutdown"));
        e = jVar;
        jVar.d();
        k kVar = new k(Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), "RxComputationThreadPool", true);
        f16096c = kVar;
        C1563b bVar = new C1563b(0, kVar);
        f16095b = bVar;
        for (C1564c d8 : bVar.f16093b) {
            d8.d();
        }
    }

    public C1565d() {
        AtomicReference atomicReference;
        k kVar = f16096c;
        C1563b bVar = f16095b;
        this.f16098a = new AtomicReference(bVar);
        C1563b bVar2 = new C1563b(f16097d, kVar);
        do {
            atomicReference = this.f16098a;
            if (atomicReference.compareAndSet(bVar, bVar2)) {
                return;
            }
        } while (atomicReference.get() == bVar);
        for (C1564c d8 : bVar2.f16093b) {
            d8.d();
        }
    }

    public final e a() {
        C1564c cVar;
        C1563b bVar = (C1563b) this.f16098a.get();
        int i = bVar.f16092a;
        if (i == 0) {
            cVar = e;
        } else {
            long j7 = bVar.f16094c;
            bVar.f16094c = 1 + j7;
            cVar = bVar.f16093b[(int) (j7 % ((long) i))];
        }
        return new C1562a(cVar);
    }

    public final b c(Runnable runnable, TimeUnit timeUnit) {
        C1564c cVar;
        C1563b bVar = (C1563b) this.f16098a.get();
        int i = bVar.f16092a;
        if (i == 0) {
            cVar = e;
        } else {
            long j7 = bVar.f16094c;
            bVar.f16094c = 1 + j7;
            cVar = bVar.f16093b[(int) (j7 % ((long) i))];
        }
        cVar.getClass();
        l lVar = new l(runnable);
        try {
            lVar.a(cVar.f16119U.submit(lVar));
            return lVar;
        } catch (RejectedExecutionException e8) {
            C0996d.s(e8);
            return C1326b.f14277U;
        }
    }
}
