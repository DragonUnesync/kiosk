package Z5;

import T5.P;
import T5.U;
import T5.Y;

public final class W implements U {
    final /* synthetic */ a0 this$0;
    final /* synthetic */ Y val$ctx;

    public W(a0 a0Var, Y y8) {
        this.this$0 = a0Var;
        this.val$ctx = y8;
    }

    public void operationComplete(P p3) {
        if (!p3.isSuccess()) {
            a0.logger.debug("Failed to send a 413 Request Entity Too Large.", p3.cause());
            this.val$ctx.close();
        }
    }
}
