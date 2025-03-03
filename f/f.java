package F;

import D2.C0073b;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public final class f implements Executor {

    /* renamed from: W  reason: collision with root package name */
    public static volatile f f1400W;

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1401U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f1402V;

    public f() {
        this.f1401U = 0;
        this.f1402V = Executors.newSingleThreadExecutor(new C0073b(1));
    }

    public final void execute(Runnable runnable) {
        switch (this.f1401U) {
            case 0:
                ((ExecutorService) this.f1402V).execute(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = (Handler) this.f1402V;
                if (!handler.post(runnable)) {
                    throw new RejectedExecutionException(handler + " is shutting down");
                }
                return;
        }
    }

    public f(Handler handler) {
        this.f1401U = 1;
        this.f1402V = handler;
    }
}
