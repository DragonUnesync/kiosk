package T5;

import java.net.SocketAddress;

/* renamed from: T5.x  reason: case insensitive filesystem */
public final class C0279x implements Runnable {
    final /* synthetic */ F this$0;
    final /* synthetic */ SocketAddress val$localAddress;
    final /* synthetic */ F val$next;
    final /* synthetic */ C0274u0 val$promise;
    final /* synthetic */ SocketAddress val$remoteAddress;

    public C0279x(F f8, F f9, SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        this.this$0 = f8;
        this.val$next = f9;
        this.val$remoteAddress = socketAddress;
        this.val$localAddress = socketAddress2;
        this.val$promise = u0Var;
    }

    public void run() {
        this.val$next.invokeConnect(this.val$remoteAddress, this.val$localAddress, this.val$promise);
    }
}
