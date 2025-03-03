package G;

import F.h;
import L3.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class k implements b {

    /* renamed from: W  reason: collision with root package name */
    public static final k f1612W = new k(0, (Object) null);

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1613U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f1614V;

    public /* synthetic */ k(int i, Object obj) {
        this.f1613U = i;
        this.f1614V = obj;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            h.m("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    public final Object get() {
        switch (this.f1613U) {
            case 0:
                return this.f1614V;
            default:
                throw new ExecutionException((Throwable) this.f1614V);
        }
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        switch (this.f1613U) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.f1614V + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.f1614V) + "]]";
        }
    }

    public final Object get(long j7, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
