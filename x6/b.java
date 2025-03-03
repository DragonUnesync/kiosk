package x6;

import java.util.concurrent.atomic.AtomicInteger;
import l6.c;

public final class b extends AtomicInteger implements q6.b {

    /* renamed from: U  reason: collision with root package name */
    public final Object f16321U;

    /* renamed from: V  reason: collision with root package name */
    public final c f16322V;

    public b(c cVar, Object obj) {
        this.f16322V = cVar;
        this.f16321U = obj;
    }

    public final int a() {
        return 1;
    }

    public final void c(long j7) {
        if (c.d(j7) && compareAndSet(0, 1)) {
            Object obj = this.f16321U;
            c cVar = this.f16322V;
            cVar.f(obj);
            if (get() != 2) {
                cVar.b();
            }
        }
    }

    public final void cancel() {
        lazySet(2);
    }

    public final void clear() {
        throw null;
    }

    public final boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f16321U;
    }
}
