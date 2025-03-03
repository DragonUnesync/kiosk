package R5;

import T5.C0260n;
import T5.C0274u0;
import T5.K;
import f6.C0909B;
import f6.C0910C;
import java.net.SocketAddress;

public final class e implements C0910C {
    final /* synthetic */ h this$0;
    final /* synthetic */ K val$channel;
    final /* synthetic */ SocketAddress val$localAddress;
    final /* synthetic */ C0274u0 val$promise;

    public e(h hVar, K k8, C0274u0 u0Var, SocketAddress socketAddress) {
        this.this$0 = hVar;
        this.val$channel = k8;
        this.val$promise = u0Var;
        this.val$localAddress = socketAddress;
    }

    public void operationComplete(C0909B b8) {
        if (b8.cause() != null) {
            ((C0260n) this.val$channel).close();
            this.val$promise.setFailure(b8.cause());
            return;
        }
        h.doConnect((SocketAddress) b8.getNow(), this.val$localAddress, this.val$promise);
    }
}
