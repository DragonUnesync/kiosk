package f6;

import T5.h1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: f6.b  reason: case insensitive filesystem */
public abstract class C0912b implements C0932w {
    public void execute(Runnable runnable) {
        ((h1) this).next().execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return ((h1) this).next().invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return ((h1) this).next().invokeAny(collection);
    }

    @Deprecated
    public abstract void shutdown();

    @Deprecated
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j7, TimeUnit timeUnit) {
        return ((h1) this).next().invokeAll(collection, j7, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j7, TimeUnit timeUnit) {
        return ((h1) this).next().invokeAny(collection, j7, timeUnit);
    }

    public Z scheduleAtFixedRate(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        return ((C0916f) ((h1) this).next()).scheduleAtFixedRate(runnable, j7, j8, timeUnit);
    }

    public Z scheduleWithFixedDelay(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        return ((C0916f) ((h1) this).next()).scheduleWithFixedDelay(runnable, j7, j8, timeUnit);
    }

    public Z schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
        return ((C0916f) ((h1) this).next()).schedule(runnable, j7, timeUnit);
    }

    public <V> Z schedule(Callable<V> callable, long j7, TimeUnit timeUnit) {
        return ((C0916f) ((h1) this).next()).schedule(callable, j7, timeUnit);
    }

    public C0909B submit(Runnable runnable) {
        return ((C0911a) ((h1) this).next()).submit(runnable);
    }

    public <T> C0909B submit(Runnable runnable, T t8) {
        return ((C0911a) ((h1) this).next()).submit(runnable, t8);
    }

    public <T> C0909B submit(Callable<T> callable) {
        return ((C0911a) ((h1) this).next()).submit(callable);
    }
}
