package f6;

import g6.B;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class J extends C0912b {
    /* access modifiers changed from: private */
    public final C0929t[] children;
    private final C0930u chooser;
    private final Set<C0929t> readonlyChildren;
    /* access modifiers changed from: private */
    public final AtomicInteger terminatedChildren;
    /* access modifiers changed from: private */
    public final L terminationFuture;

    public J(int i, Executor executor, Object... objArr) {
        this(i, executor, C0921k.INSTANCE, objArr);
    }

    public boolean awaitTermination(long j7, TimeUnit timeUnit) {
        long nanoTime;
        long nanos = timeUnit.toNanos(j7) + System.nanoTime();
        loop0:
        for (C0929t tVar : this.children) {
            do {
                nanoTime = nanos - System.nanoTime();
                if (nanoTime <= 0) {
                    break loop0;
                }
            } while (!tVar.awaitTermination(nanoTime, TimeUnit.NANOSECONDS));
        }
        return isTerminated();
    }

    public boolean isShutdown() {
        for (C0929t isShutdown : this.children) {
            if (!isShutdown.isShutdown()) {
                return false;
            }
        }
        return true;
    }

    public boolean isTerminated() {
        for (C0929t isTerminated : this.children) {
            if (!isTerminated.isTerminated()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<C0929t> iterator() {
        return this.readonlyChildren.iterator();
    }

    public abstract C0929t newChild(Executor executor, Object... objArr);

    public abstract ThreadFactory newDefaultThreadFactory();

    public C0929t next() {
        return this.chooser.next();
    }

    @Deprecated
    public void shutdown() {
        for (C0929t shutdown : this.children) {
            shutdown.shutdown();
        }
    }

    public C0909B shutdownGracefully(long j7, long j8, TimeUnit timeUnit) {
        for (C0929t shutdownGracefully : this.children) {
            shutdownGracefully.shutdownGracefully(j7, j8, timeUnit);
        }
        return terminationFuture();
    }

    public C0909B terminationFuture() {
        return this.terminationFuture;
    }

    public J(int i, Executor executor, C0931v vVar, Object... objArr) {
        this.terminatedChildren = new AtomicInteger();
        this.terminationFuture = new r(G.INSTANCE);
        B.checkPositive(i, "nThreads");
        executor = executor == null ? new f0(newDefaultThreadFactory()) : executor;
        this.children = new C0929t[i];
        int i8 = 0;
        int i9 = 0;
        while (i9 < i) {
            try {
                this.children[i9] = newChild(executor, objArr);
                i9++;
            } catch (Exception e) {
                throw new IllegalStateException("failed to create a child event loop", e);
            } catch (Throwable th) {
                for (int i10 = 0; i10 < i9; i10++) {
                    ((C0911a) this.children[i10]).shutdownGracefully();
                }
                while (i8 < i9) {
                    C0929t tVar = this.children[i8];
                    while (!tVar.isTerminated()) {
                        try {
                            tVar.awaitTermination(2147483647L, TimeUnit.SECONDS);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw th;
                        }
                    }
                    i8++;
                }
                throw th;
            }
        }
        this.chooser = ((C0921k) vVar).newChooser(this.children);
        I i11 = new I(this);
        C0929t[] tVarArr = this.children;
        int length = tVarArr.length;
        while (i8 < length) {
            tVarArr[i8].terminationFuture().addListener(i11);
            i8++;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.children.length);
        Collections.addAll(linkedHashSet, this.children);
        this.readonlyChildren = DesugarCollections.unmodifiableSet(linkedHashSet);
    }
}
