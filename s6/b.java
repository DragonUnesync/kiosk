package s6;

import V7.a;
import g7.C0996d;
import java.util.concurrent.atomic.AtomicReference;
import l6.c;
import q6.e;
import u6.C1497a;

public final class b extends AtomicReference implements c, m6.b {

    /* renamed from: U  reason: collision with root package name */
    public final long f15121U;

    /* renamed from: V  reason: collision with root package name */
    public final c f15122V;

    /* renamed from: W  reason: collision with root package name */
    public final int f15123W;

    /* renamed from: X  reason: collision with root package name */
    public final int f15124X;

    /* renamed from: Y  reason: collision with root package name */
    public volatile boolean f15125Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile e f15126Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f15127a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f15128b0;

    public b(c cVar, long j7) {
        this.f15121U = j7;
        this.f15122V = cVar;
        int i = cVar.f15135Y;
        this.f15124X = i;
        this.f15123W = i >> 2;
    }

    public final void a(Throwable th) {
        lazySet(x6.c.f16323U);
        c cVar = this.f15122V;
        if (cVar.f15138b0.a(th)) {
            this.f15125Y = true;
            if (!cVar.f15133W) {
                cVar.f15142f0.cancel();
                for (b bVar : (b[]) cVar.f15140d0.getAndSet(c.f15130m0)) {
                    bVar.getClass();
                    x6.c.a(bVar);
                }
            }
            cVar.g();
            return;
        }
        C0996d.s(th);
    }

    public final void b() {
        this.f15125Y = true;
        this.f15122V.g();
    }

    public final void c(long j7) {
        if (this.f15128b0 != 1) {
            long j8 = this.f15127a0 + j7;
            if (j8 >= ((long) this.f15123W)) {
                this.f15127a0 = 0;
                ((a) get()).c(j8);
                return;
            }
            this.f15127a0 = j8;
        }
    }

    public final void d() {
        x6.c.a(this);
    }

    public final void e(a aVar) {
        if (x6.c.b(this, aVar)) {
            if (aVar instanceof q6.b) {
                q6.b bVar = (q6.b) aVar;
                int a8 = bVar.a();
                if (a8 == 1) {
                    this.f15128b0 = a8;
                    this.f15126Z = bVar;
                    this.f15125Y = true;
                    this.f15122V.g();
                    return;
                } else if (a8 == 2) {
                    this.f15128b0 = a8;
                    this.f15126Z = bVar;
                }
            }
            aVar.c((long) this.f15124X);
        }
    }

    public final void f(Object obj) {
        if (this.f15128b0 != 2) {
            c cVar = this.f15122V;
            if (cVar.get() != 0 || !cVar.compareAndSet(0, 1)) {
                e eVar = this.f15126Z;
                if (eVar == null) {
                    eVar = new C1497a(cVar.f15135Y);
                    this.f15126Z = eVar;
                }
                if (!eVar.offer(obj)) {
                    cVar.a(new RuntimeException("Inner queue full?!"));
                    return;
                } else if (cVar.getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j7 = cVar.f15141e0.get();
                e eVar2 = this.f15126Z;
                if (j7 == 0 || (eVar2 != null && !eVar2.isEmpty())) {
                    if (eVar2 == null && (eVar2 = this.f15126Z) == null) {
                        eVar2 = new C1497a(cVar.f15135Y);
                        this.f15126Z = eVar2;
                    }
                    if (!eVar2.offer(obj)) {
                        cVar.a(new RuntimeException("Inner queue full?!"));
                        return;
                    }
                } else {
                    cVar.f15131U.f(obj);
                    if (j7 != Long.MAX_VALUE) {
                        cVar.f15141e0.decrementAndGet();
                    }
                    c(1);
                }
                if (cVar.decrementAndGet() == 0) {
                    return;
                }
            }
            cVar.h();
            return;
        }
        this.f15122V.g();
    }
}
