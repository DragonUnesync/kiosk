package F;

import B.C0014o;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public final class g implements Executor {

    /* renamed from: W  reason: collision with root package name */
    public static volatile g f1403W;

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1404U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f1405V;

    public g() {
        this.f1404U = 0;
        this.f1405V = Executors.newFixedThreadPool(2, new C0014o(1));
    }

    public final void execute(Runnable runnable) {
        switch (this.f1404U) {
            case 0:
                ((ExecutorService) this.f1405V).execute(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = (Handler) this.f1405V;
                if (!handler.post(runnable)) {
                    throw new RejectedExecutionException(handler + " is shutting down");
                }
                return;
        }
    }

    public g(Handler handler) {
        this.f1404U = 1;
        this.f1405V = handler;
    }
}
