package l6;

import java.util.concurrent.atomic.AtomicReference;
import m6.b;
import v6.j;

public final class d implements b, Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final AtomicReference f13198U;

    /* renamed from: V  reason: collision with root package name */
    public final e f13199V;

    /* renamed from: W  reason: collision with root package name */
    public Thread f13200W;

    public d(Runnable runnable, e eVar) {
        this.f13198U = (AtomicReference) runnable;
        this.f13199V = eVar;
    }

    public final void d() {
        if (this.f13200W == Thread.currentThread()) {
            e eVar = this.f13199V;
            if (eVar instanceof j) {
                j jVar = (j) eVar;
                if (!jVar.f16120V) {
                    jVar.f16120V = true;
                    jVar.f16119U.shutdown();
                    return;
                }
                return;
            }
        }
        this.f13199V.d();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.concurrent.atomic.AtomicReference, java.lang.Runnable] */
    public final void run() {
        this.f13200W = Thread.currentThread();
        try {
            this.f13198U.run();
        } finally {
            d();
            this.f13200W = null;
        }
    }
}
