package b6;

import T5.P;
import T5.U;
import T5.Y;

public final class k1 implements U {
    final /* synthetic */ C1 this$0;
    final /* synthetic */ Y val$ctx;

    public k1(C1 c12, Y y8) {
        this.this$0 = c12;
        this.val$ctx = y8;
    }

    public void operationComplete(P p3) {
        Throwable cause = p3.cause();
        if (cause != null) {
            this.this$0.setHandshakeFailureTransportFailure(this.val$ctx, cause);
        }
    }
}
