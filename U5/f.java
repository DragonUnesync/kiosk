package U5;

import T5.C0274u0;
import T5.P;
import T5.U;

public final class f implements U {
    final /* synthetic */ g this$1;

    public f(g gVar) {
        this.this$1 = gVar;
    }

    public void operationComplete(P p3) {
        if (p3.isCancelled()) {
            if (this.this$1.this$0.connectTimeoutFuture != null) {
                this.this$1.this$0.connectTimeoutFuture.cancel(false);
            }
            C0274u0 unused = this.this$1.this$0.connectPromise = null;
            g gVar = this.this$1;
            gVar.close(gVar.voidPromise());
        }
    }
}
