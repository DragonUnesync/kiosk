package F;

import B.q0;
import a0.j;
import a0.m;
import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class d implements RunnableScheduledFuture {

    /* renamed from: U  reason: collision with root package name */
    public final AtomicReference f1395U = new AtomicReference((Object) null);

    /* renamed from: V  reason: collision with root package name */
    public final long f1396V;

    /* renamed from: W  reason: collision with root package name */
    public final Callable f1397W;

    /* renamed from: X  reason: collision with root package name */
    public final m f1398X;

    public d(Handler handler, long j7, Callable callable) {
        this.f1396V = j7;
        this.f1397W = callable;
        this.f1398X = com.bumptech.glide.d.i(new q0(this, handler, callable, 6, false));
    }

    public final boolean cancel(boolean z) {
        return this.f1398X.cancel(z);
    }

    public final int compareTo(Object obj) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), ((Delayed) obj).getDelay(timeUnit));
    }

    public final Object get() {
        return this.f1398X.f7017V.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1396V - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public final boolean isCancelled() {
        return this.f1398X.isCancelled();
    }

    public final boolean isDone() {
        return this.f1398X.f7017V.isDone();
    }

    public final boolean isPeriodic() {
        return false;
    }

    public final void run() {
        j jVar = (j) this.f1395U.getAndSet((Object) null);
        if (jVar != null) {
            try {
                jVar.a(this.f1397W.call());
            } catch (Exception e) {
                jVar.b(e);
            }
        }
    }

    public final Object get(long j7, TimeUnit timeUnit) {
        return this.f1398X.f7017V.get(j7, timeUnit);
    }
}
