package a0;

import L3.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class m implements b {

    /* renamed from: U  reason: collision with root package name */
    public final WeakReference f7016U;

    /* renamed from: V  reason: collision with root package name */
    public final l f7017V = new l(this);

    public m(j jVar) {
        this.f7016U = new WeakReference(jVar);
    }

    public final boolean cancel(boolean z) {
        j jVar = (j) this.f7016U.get();
        boolean cancel = this.f7017V.cancel(z);
        if (cancel && jVar != null) {
            jVar.f7011a = null;
            jVar.f7012b = null;
            jVar.f7013c.j((Object) null);
        }
        return cancel;
    }

    public final void d(Runnable runnable, Executor executor) {
        this.f7017V.d(runnable, executor);
    }

    public final Object get() {
        return this.f7017V.get();
    }

    public final boolean isCancelled() {
        return this.f7017V.f7008U instanceof C0409a;
    }

    public final boolean isDone() {
        return this.f7017V.isDone();
    }

    public final String toString() {
        return this.f7017V.toString();
    }

    public final Object get(long j7, TimeUnit timeUnit) {
        return this.f7017V.get(j7, timeUnit);
    }
}
