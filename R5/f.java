package R5;

import T5.C0260n;
import T5.C0274u0;
import T5.K;
import T5.U;
import java.net.SocketAddress;

public final class f implements Runnable {
    final /* synthetic */ K val$channel;
    final /* synthetic */ C0274u0 val$connectPromise;
    final /* synthetic */ SocketAddress val$localAddress;
    final /* synthetic */ SocketAddress val$remoteAddress;

    public f(SocketAddress socketAddress, K k8, SocketAddress socketAddress2, C0274u0 u0Var) {
        this.val$localAddress = socketAddress;
        this.val$channel = k8;
        this.val$remoteAddress = socketAddress2;
        this.val$connectPromise = u0Var;
    }

    public void run() {
        SocketAddress socketAddress = this.val$localAddress;
        if (socketAddress == null) {
            ((C0260n) this.val$channel).connect(this.val$remoteAddress, this.val$connectPromise);
        } else {
            ((C0260n) this.val$channel).connect(this.val$remoteAddress, socketAddress, this.val$connectPromise);
        }
        this.val$connectPromise.addListener(U.CLOSE_ON_FAILURE);
    }
}
