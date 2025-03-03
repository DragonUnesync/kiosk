package b6;

import io.netty.internal.tcnative.AsyncTask;

public final class J0 extends P0 implements C0549f {
    final /* synthetic */ Q0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J0(Q0 q02, AsyncTask asyncTask) {
        super(q02, asyncTask);
        this.this$0 = q02;
    }

    public void run(Runnable runnable) {
        if (!this.this$0.isDestroyed()) {
            this.task.runAsync(new P0(this.this$0, runnable));
        }
    }
}
