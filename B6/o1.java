package b6;

import Q0.g;
import f6.L;

public final class o1 implements Runnable {
    final /* synthetic */ C1 this$0;
    final /* synthetic */ long val$handshakeTimeoutMillis;
    final /* synthetic */ L val$localHandshakePromise;

    public o1(C1 c12, L l8, long j7) {
        this.this$0 = c12;
        this.val$localHandshakePromise = l8;
        this.val$handshakeTimeoutMillis = j7;
    }

    public void run() {
        if (!this.val$localHandshakePromise.isDone()) {
            E1 e12 = new E1(g.o(new StringBuilder("handshake timed out after "), this.val$handshakeTimeoutMillis, "ms"));
            try {
                if (this.val$localHandshakePromise.tryFailure(e12)) {
                    H1.handleHandshakeFailure(this.this$0.ctx, e12, true);
                }
            } finally {
                C1 c12 = this.this$0;
                c12.releaseAndFailAll(c12.ctx, e12);
            }
        }
    }
}
