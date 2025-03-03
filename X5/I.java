package X5;

import T5.P;
import T5.U;
import T5.Y;

public final class I implements U {
    final /* synthetic */ J this$0;
    final /* synthetic */ Y val$ctx;

    public I(J j7, Y y8) {
        this.this$0 = j7;
        this.val$ctx = y8;
    }

    public void operationComplete(P p3) {
        if (!p3.isSuccess()) {
            this.val$ctx.fireExceptionCaught(p3.cause());
        }
    }
}
