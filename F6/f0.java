package f6;

import g6.B;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

public final class f0 implements Executor {
    private final ThreadFactory threadFactory;

    public f0(ThreadFactory threadFactory2) {
        this.threadFactory = (ThreadFactory) B.checkNotNull(threadFactory2, "threadFactory");
    }

    public void execute(Runnable runnable) {
        this.threadFactory.newThread(runnable).start();
    }
}
