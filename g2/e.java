package G2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class e implements ExecutorService {

    /* renamed from: V  reason: collision with root package name */
    public static final long f1634V = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: W  reason: collision with root package name */
    public static volatile int f1635W;

    /* renamed from: U  reason: collision with root package name */
    public final ThreadPoolExecutor f1636U;

    public e(ThreadPoolExecutor threadPoolExecutor) {
        this.f1636U = threadPoolExecutor;
    }

    public final boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return this.f1636U.awaitTermination(j7, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f1636U.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.f1636U.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.f1636U.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f1636U.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f1636U.isTerminated();
    }

    public final void shutdown() {
        this.f1636U.shutdown();
    }

    public final List shutdownNow() {
        return this.f1636U.shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return this.f1636U.submit(runnable);
    }

    public final String toString() {
        return this.f1636U.toString();
    }

    public final List invokeAll(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f1636U.invokeAll(collection, j7, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f1636U.invokeAny(collection, j7, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f1636U.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.f1636U.submit(callable);
    }
}
