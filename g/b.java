package G;

import a0.j;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class b extends d implements Runnable {

    /* renamed from: W  reason: collision with root package name */
    public a f1594W;

    /* renamed from: X  reason: collision with root package name */
    public final LinkedBlockingQueue f1595X = new LinkedBlockingQueue(1);

    /* renamed from: Y  reason: collision with root package name */
    public final CountDownLatch f1596Y = new CountDownLatch(1);

    /* renamed from: Z  reason: collision with root package name */
    public L3.b f1597Z;

    /* renamed from: a0  reason: collision with root package name */
    public volatile L3.b f1598a0;

    public b(a aVar, L3.b bVar) {
        this.f1594W = aVar;
        bVar.getClass();
        this.f1597Z = bVar;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    public final boolean cancel(boolean z) {
        boolean z6 = false;
        if (!this.f1599U.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.f1595X.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        L3.b bVar = this.f1597Z;
        if (bVar != null) {
            bVar.cancel(z);
        }
        L3.b bVar2 = this.f1598a0;
        if (bVar2 != null) {
            bVar2.cancel(z);
        }
        return true;
    }

    public final Object get() {
        if (!this.f1599U.isDone()) {
            L3.b bVar = this.f1597Z;
            if (bVar != null) {
                bVar.get();
            }
            this.f1596Y.await();
            L3.b bVar2 = this.f1598a0;
            if (bVar2 != null) {
                bVar2.get();
            }
        }
        return this.f1599U.get();
    }

    public final void run() {
        try {
            try {
                L3.b apply = this.f1594W.apply(i.b(this.f1597Z));
                this.f1598a0 = apply;
                if (this.f1599U.isCancelled()) {
                    apply.cancel(((Boolean) b(this.f1595X)).booleanValue());
                    this.f1598a0 = null;
                    this.f1594W = null;
                    this.f1597Z = null;
                    this.f1596Y.countDown();
                    return;
                }
                apply.d(new h(1, this, apply, false), D7.b.l());
                this.f1594W = null;
                this.f1597Z = null;
                this.f1596Y.countDown();
            } catch (UndeclaredThrowableException e) {
                Throwable cause = e.getCause();
                j jVar = this.f1600V;
                if (jVar != null) {
                    jVar.b(cause);
                }
            } catch (Exception e8) {
                j jVar2 = this.f1600V;
                if (jVar2 != null) {
                    jVar2.b(e8);
                }
            } catch (Error e9) {
                j jVar3 = this.f1600V;
                if (jVar3 != null) {
                    jVar3.b(e9);
                }
            } catch (Throwable th) {
                this.f1594W = null;
                this.f1597Z = null;
                this.f1596Y.countDown();
                throw th;
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e10) {
            Throwable cause2 = e10.getCause();
            j jVar4 = this.f1600V;
            if (jVar4 != null) {
                jVar4.b(cause2);
            }
        }
    }

    public final Object get(long j7, TimeUnit timeUnit) {
        if (!this.f1599U.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j7 = timeUnit2.convert(j7, timeUnit);
                timeUnit = timeUnit2;
            }
            L3.b bVar = this.f1597Z;
            if (bVar != null) {
                long nanoTime = System.nanoTime();
                bVar.get(j7, timeUnit);
                j7 -= Math.max(0, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f1596Y.await(j7, timeUnit)) {
                j7 -= Math.max(0, System.nanoTime() - nanoTime2);
                L3.b bVar2 = this.f1598a0;
                if (bVar2 != null) {
                    bVar2.get(j7, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.f1599U.get(j7, timeUnit);
    }
}
