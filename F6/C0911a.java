package f6;

import h6.C1082c;
import h6.d;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: f6.a  reason: case insensitive filesystem */
public abstract class C0911a extends AbstractExecutorService implements C0929t {
    private static final C1082c logger = d.getInstance((Class<?>) C0911a.class);
    private final C0932w parent;
    private final Collection<C0929t> selfCollection;

    public C0911a() {
        this((C0932w) null);
    }

    public static void runTask(Runnable runnable) {
        runnable.run();
    }

    public static void safeExecute(Runnable runnable) {
        try {
            runTask(runnable);
        } catch (Throwable th) {
            logger.warn("A task raised an exception. Task: {}", runnable, th);
        }
    }

    public boolean inEventLoop() {
        return inEventLoop(Thread.currentThread());
    }

    public Iterator<C0929t> iterator() {
        return this.selfCollection.iterator();
    }

    public void lazyExecute(Runnable runnable) {
        execute(runnable);
    }

    public <V> C0909B newFailedFuture(Throwable th) {
        return new C0933x(this, th);
    }

    public <V> L newPromise() {
        return new r(this);
    }

    public <V> C0909B newSucceededFuture(V v4) {
        return new e0(this, v4);
    }

    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t8) {
        return new V(this, runnable, t8);
    }

    public C0929t next() {
        return this;
    }

    @Deprecated
    public abstract void shutdown();

    public C0909B shutdownGracefully() {
        return shutdownGracefully(2, 15, TimeUnit.SECONDS);
    }

    @Deprecated
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    public C0911a(C0932w wVar) {
        this.selfCollection = Collections.singleton(this);
        this.parent = wVar;
    }

    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new V((C0929t) this, (Callable<Object>) callable);
    }

    public C0909B submit(Runnable runnable) {
        return (C0909B) super.submit(runnable);
    }

    public <T> C0909B submit(Runnable runnable, T t8) {
        return (C0909B) super.submit(runnable, t8);
    }

    public <T> C0909B submit(Callable<T> callable) {
        return (C0909B) super.submit(callable);
    }
}
