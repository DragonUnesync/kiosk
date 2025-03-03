package v6;

import G2.a;
import N.e;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class k extends AtomicLong implements ThreadFactory {

    /* renamed from: U  reason: collision with root package name */
    public final String f16121U;

    /* renamed from: V  reason: collision with root package name */
    public final int f16122V;

    /* renamed from: W  reason: collision with root package name */
    public final boolean f16123W;

    public k(String str) {
        this(5, str, false);
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread;
        String str = this.f16121U + '-' + incrementAndGet();
        if (this.f16123W) {
            thread = new a(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.f16122V);
        thread.setDaemon(true);
        return thread;
    }

    public final String toString() {
        return e.A(new StringBuilder("RxThreadFactory["), this.f16121U, "]");
    }

    public k(int i, String str, boolean z) {
        this.f16121U = str;
        this.f16122V = i;
        this.f16123W = z;
    }
}
