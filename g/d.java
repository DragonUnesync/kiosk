package G;

import A.f;
import L3.b;
import a0.j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class d implements b {

    /* renamed from: U  reason: collision with root package name */
    public final b f1599U;

    /* renamed from: V  reason: collision with root package name */
    public j f1600V;

    public d(b bVar) {
        bVar.getClass();
        this.f1599U = bVar;
    }

    public static d a(b bVar) {
        if (bVar instanceof d) {
            return (d) bVar;
        }
        return new d(bVar);
    }

    public boolean cancel(boolean z) {
        return this.f1599U.cancel(z);
    }

    public final void d(Runnable runnable, Executor executor) {
        this.f1599U.d(runnable, executor);
    }

    public Object get() {
        return this.f1599U.get();
    }

    public final boolean isCancelled() {
        return this.f1599U.isCancelled();
    }

    public final boolean isDone() {
        return this.f1599U.isDone();
    }

    public Object get(long j7, TimeUnit timeUnit) {
        return this.f1599U.get(j7, timeUnit);
    }

    public d() {
        this.f1599U = com.bumptech.glide.d.i(new f(19, (Object) this));
    }
}
