package g6;

import f6.C0929t;

public final class r0 implements Runnable {
    final /* synthetic */ Runnable val$command;
    final /* synthetic */ C0929t val$eventExecutor;

    public r0(C0929t tVar, Runnable runnable) {
        this.val$eventExecutor = tVar;
        this.val$command = runnable;
    }

    public void run() {
        t0.setCurrentEventExecutor(this.val$eventExecutor);
        try {
            this.val$command.run();
        } finally {
            t0.setCurrentEventExecutor((C0929t) null);
        }
    }
}
