package R5;

import T5.K;
import T5.P;
import T5.U;
import java.net.SocketAddress;

public final class d implements U {
    final /* synthetic */ h this$0;
    final /* synthetic */ K val$channel;
    final /* synthetic */ SocketAddress val$localAddress;
    final /* synthetic */ a val$promise;
    final /* synthetic */ SocketAddress val$remoteAddress;

    public d(h hVar, a aVar, K k8, SocketAddress socketAddress, SocketAddress socketAddress2) {
        this.this$0 = hVar;
        this.val$promise = aVar;
        this.val$channel = k8;
        this.val$remoteAddress = socketAddress;
        this.val$localAddress = socketAddress2;
    }

    public void operationComplete(P p3) {
        Throwable cause = p3.cause();
        if (cause != null) {
            this.val$promise.setFailure(cause);
            return;
        }
        this.val$promise.registered();
        P unused = this.this$0.doResolveAndConnect0(this.val$channel, this.val$remoteAddress, this.val$localAddress, this.val$promise);
    }
}
