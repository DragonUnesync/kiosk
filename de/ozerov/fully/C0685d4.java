package de.ozerov.fully;

import a1.C0412c;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: de.ozerov.fully.d4  reason: case insensitive filesystem */
public final class C0685d4 extends ThreadPoolExecutor {

    /* renamed from: U  reason: collision with root package name */
    public final long f10602U;

    /* renamed from: V  reason: collision with root package name */
    public Thread f10603V;

    public C0685d4(TimeUnit timeUnit) {
        super(1, 1, 0, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(1));
        this.f10602U = timeUnit.toMillis(30);
    }

    public final void afterExecute(Runnable runnable, Throwable th) {
        Thread thread = this.f10603V;
        if (thread != null) {
            thread.interrupt();
            this.f10603V = null;
        }
    }

    public final void beforeExecute(Thread thread, Runnable runnable) {
        Thread thread2 = new Thread(new C0412c((Object) this, 3, (Object) thread));
        this.f10603V = thread2;
        thread2.start();
    }

    public final List shutdownNow() {
        Thread thread = this.f10603V;
        if (thread != null) {
            thread.interrupt();
            this.f10603V = null;
        }
        return super.shutdownNow();
    }
}
