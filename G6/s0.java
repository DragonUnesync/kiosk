package g6;

import f6.C0929t;
import java.util.concurrent.ThreadFactory;

public final class s0 implements ThreadFactory {
    final /* synthetic */ C0929t val$eventExecutor;
    final /* synthetic */ ThreadFactory val$threadFactory;

    public s0(ThreadFactory threadFactory, C0929t tVar) {
        this.val$threadFactory = threadFactory;
        this.val$eventExecutor = tVar;
    }

    public Thread newThread(Runnable runnable) {
        return this.val$threadFactory.newThread(t0.apply(runnable, this.val$eventExecutor));
    }
}
