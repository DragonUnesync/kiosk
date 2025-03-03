package g6;

import f6.C0929t;
import f6.C0934y;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

public abstract class t0 {
    private static final C0934y mappings = new C0934y();

    public static Executor apply(Executor executor, C0929t tVar) {
        B.checkNotNull(executor, "executor");
        B.checkNotNull(tVar, "eventExecutor");
        return new q0(executor, tVar);
    }

    public static C0929t currentExecutor() {
        return (C0929t) mappings.get();
    }

    /* access modifiers changed from: private */
    public static void setCurrentEventExecutor(C0929t tVar) {
        mappings.set(tVar);
    }

    public static Runnable apply(Runnable runnable, C0929t tVar) {
        B.checkNotNull(runnable, "command");
        B.checkNotNull(tVar, "eventExecutor");
        return new r0(tVar, runnable);
    }

    public static ThreadFactory apply(ThreadFactory threadFactory, C0929t tVar) {
        B.checkNotNull(threadFactory, "threadFactory");
        B.checkNotNull(tVar, "eventExecutor");
        return new s0(threadFactory, tVar);
    }
}
