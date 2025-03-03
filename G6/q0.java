package g6;

import f6.C0929t;
import java.util.concurrent.Executor;

public final class q0 implements Executor {
    final /* synthetic */ C0929t val$eventExecutor;
    final /* synthetic */ Executor val$executor;

    public q0(Executor executor, C0929t tVar) {
        this.val$executor = executor;
        this.val$eventExecutor = tVar;
    }

    public void execute(Runnable runnable) {
        this.val$executor.execute(t0.apply(runnable, this.val$eventExecutor));
    }
}
