package F;

import G.k;
import android.os.Handler;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class e extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: U  reason: collision with root package name */
    public final Handler f1399U;

    static {
        new b(0);
    }

    public e(Handler handler) {
        this.f1399U = handler;
    }

    public final boolean awaitTermination(long j7, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    public final void execute(Runnable runnable) {
        Handler handler = this.f1399U;
        if (!handler.post(runnable)) {
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final ScheduledFuture schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
        return schedule((Callable) new c(0, runnable), j7, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    public final void shutdown() {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.concurrent.ScheduledFuture, G.k] */
    public final ScheduledFuture schedule(Callable callable, long j7, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j7, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.f1399U;
        d dVar = new d(handler, convert, callable);
        if (handler.postAtTime(dVar, convert)) {
            return dVar;
        }
        return new k(1, new RejectedExecutionException(handler + " is shutting down"));
    }
}
