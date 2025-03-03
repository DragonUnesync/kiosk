package w6;

import N.e;
import V7.a;
import g7.C0996d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l6.c;
import y6.C1636a;

/* renamed from: w6.a  reason: case insensitive filesystem */
public final class C1593a extends AtomicInteger implements c, a {

    /* renamed from: U  reason: collision with root package name */
    public final c f16223U;

    /* renamed from: V  reason: collision with root package name */
    public final C1636a f16224V = new AtomicReference();

    /* renamed from: W  reason: collision with root package name */
    public final AtomicLong f16225W = new AtomicLong();

    /* renamed from: X  reason: collision with root package name */
    public final AtomicReference f16226X = new AtomicReference();

    /* renamed from: Y  reason: collision with root package name */
    public final AtomicBoolean f16227Y = new AtomicBoolean();

    /* renamed from: Z  reason: collision with root package name */
    public volatile boolean f16228Z;

    /* JADX WARNING: type inference failed for: r1v1, types: [y6.a, java.util.concurrent.atomic.AtomicReference] */
    public C1593a(c cVar) {
        this.f16223U = cVar;
    }

    public final void a(Throwable th) {
        this.f16228Z = true;
        c cVar = this.f16223U;
        C1636a aVar = this.f16224V;
        if (!aVar.a(th)) {
            C0996d.s(th);
        } else if (getAndIncrement() == 0) {
            cVar.a(aVar.b());
        }
    }

    public final void b() {
        this.f16228Z = true;
        c cVar = this.f16223U;
        C1636a aVar = this.f16224V;
        if (getAndIncrement() == 0) {
            Throwable b8 = aVar.b();
            if (b8 != null) {
                cVar.a(b8);
            } else {
                cVar.b();
            }
        }
    }

    public final void c(long j7) {
        long j8;
        long j9;
        if (j7 <= 0) {
            cancel();
            a(new IllegalArgumentException(e.w("§3.9 violated: positive request amount required but it was ", j7)));
            return;
        }
        AtomicReference atomicReference = this.f16226X;
        AtomicLong atomicLong = this.f16225W;
        a aVar = (a) atomicReference.get();
        if (aVar != null) {
            aVar.c(j7);
        } else if (x6.c.d(j7)) {
            do {
                j8 = atomicLong.get();
                j9 = Long.MAX_VALUE;
                if (j8 == Long.MAX_VALUE) {
                    break;
                }
                long j10 = j8 + j7;
                if (j10 >= 0) {
                    j9 = j10;
                }
            } while (!atomicLong.compareAndSet(j8, j9));
            a aVar2 = (a) atomicReference.get();
            if (aVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    aVar2.c(andSet);
                }
            }
        }
    }

    public final void cancel() {
        if (!this.f16228Z) {
            x6.c.a(this.f16226X);
        }
    }

    public final void e(a aVar) {
        if (this.f16227Y.compareAndSet(false, true)) {
            this.f16223U.e(this);
            AtomicReference atomicReference = this.f16226X;
            AtomicLong atomicLong = this.f16225W;
            if (x6.c.b(atomicReference, aVar)) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    aVar.c(andSet);
                    return;
                }
                return;
            }
            return;
        }
        aVar.cancel();
        cancel();
        a(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public final void f(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            c cVar = this.f16223U;
            cVar.f(obj);
            if (decrementAndGet() != 0) {
                Throwable b8 = this.f16224V.b();
                if (b8 != null) {
                    cVar.a(b8);
                } else {
                    cVar.b();
                }
            }
        }
    }
}
