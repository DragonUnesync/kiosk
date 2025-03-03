package b6;

import T5.Y;

/* renamed from: b6.f1  reason: case insensitive filesystem */
public final class C0551f1 implements Runnable {
    final /* synthetic */ C0557h1 this$1;
    final /* synthetic */ long val$closeNotifyReadTimeout;

    public C0551f1(C0557h1 h1Var, long j7) {
        this.this$1 = h1Var;
        this.val$closeNotifyReadTimeout = j7;
    }

    public void run() {
        if (!this.this$1.this$0.sslClosePromise.isDone()) {
            C1.logger.debug("{} did not receive close_notify in {}ms; force-closing the connection.", this.this$1.val$ctx.channel(), Long.valueOf(this.val$closeNotifyReadTimeout));
            Y y8 = this.this$1.val$ctx;
            C1.addCloseListener(y8.close(y8.newPromise()), this.this$1.val$promise);
        }
    }
}
