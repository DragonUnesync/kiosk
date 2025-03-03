package v6;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import m6.b;
import p6.C1345a;

public final class l extends AtomicReference implements Callable, b {

    /* renamed from: W  reason: collision with root package name */
    public static final FutureTask f16124W;

    /* renamed from: X  reason: collision with root package name */
    public static final FutureTask f16125X;

    /* renamed from: U  reason: collision with root package name */
    public final AtomicReference f16126U;

    /* renamed from: V  reason: collision with root package name */
    public Thread f16127V;

    static {
        androidx.emoji2.text.l lVar = C1345a.f14671a;
        f16124W = new FutureTask(lVar, (Object) null);
        f16125X = new FutureTask(lVar, (Object) null);
    }

    public l(Runnable runnable) {
        this.f16126U = (AtomicReference) runnable;
    }

    public final void a(Future future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) get();
            if (future2 != f16124W) {
                if (future2 == f16125X) {
                    if (this.f16127V != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    future.cancel(z);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.concurrent.atomic.AtomicReference, java.lang.Runnable] */
    public final Object call() {
        FutureTask futureTask = f16124W;
        this.f16127V = Thread.currentThread();
        try {
            this.f16126U.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f16127V = null;
        }
    }

    public final void d() {
        FutureTask futureTask;
        boolean z;
        Future future = (Future) get();
        if (future != f16124W && future != (futureTask = f16125X) && compareAndSet(future, futureTask) && future != null) {
            if (this.f16127V != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }
}
