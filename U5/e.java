package U5;

import T5.A0;
import T5.C0274u0;
import java.net.SocketAddress;

public final class e implements Runnable {
    final /* synthetic */ g this$1;
    final /* synthetic */ SocketAddress val$remoteAddress;

    public e(g gVar, SocketAddress socketAddress) {
        this.this$1 = gVar;
        this.val$remoteAddress = socketAddress;
    }

    public void run() {
        C0274u0 access$200 = this.this$1.this$0.connectPromise;
        if (access$200 != null && !access$200.isDone()) {
            if (access$200.tryFailure(new A0("connection timed out: " + this.val$remoteAddress))) {
                g gVar = this.this$1;
                gVar.close(gVar.voidPromise());
            }
        }
    }
}
