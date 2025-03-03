package b6;

import S5.C0185n;
import T5.Y;

public final class m1 implements Runnable {
    final /* synthetic */ C1 this$0;
    final /* synthetic */ Y val$ctx;
    final /* synthetic */ C0185n val$decodedOut;

    public m1(C1 c12, Y y8, C0185n nVar) {
        this.this$0 = c12;
        this.val$ctx = y8;
        this.val$decodedOut = nVar;
    }

    public void run() {
        this.val$ctx.fireChannelRead(this.val$decodedOut);
    }
}
