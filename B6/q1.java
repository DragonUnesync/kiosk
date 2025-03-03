package b6;

import T5.C0274u0;
import T5.P;
import T5.Y;

public final class q1 implements Runnable {
    final /* synthetic */ C1 this$0;
    final /* synthetic */ Y val$ctx;
    final /* synthetic */ P val$flushFuture;
    final /* synthetic */ C0274u0 val$promise;

    public q1(C1 c12, P p3, Y y8, C0274u0 u0Var) {
        this.this$0 = c12;
        this.val$flushFuture = p3;
        this.val$ctx = y8;
        this.val$promise = u0Var;
    }

    public void run() {
        if (!this.val$flushFuture.isDone()) {
            C1.logger.warn("{} Last write attempt timed out; force-closing the connection.", (Object) this.val$ctx.channel());
            Y y8 = this.val$ctx;
            C1.addCloseListener(y8.close(y8.newPromise()), this.val$promise);
        }
    }
}
