package d6;

import f6.C0909B;
import f6.C0910C;
import f6.L;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* renamed from: d6.h  reason: case insensitive filesystem */
public final class C0652h implements C0910C {
    final /* synthetic */ C0653i this$0;
    final /* synthetic */ L val$promise;
    final /* synthetic */ InetSocketAddress val$unresolvedAddress;

    public C0652h(C0653i iVar, L l8, InetSocketAddress inetSocketAddress) {
        this.this$0 = iVar;
        this.val$promise = l8;
        this.val$unresolvedAddress = inetSocketAddress;
    }

    public void operationComplete(C0909B b8) {
        if (b8.isSuccess()) {
            this.val$promise.setSuccess(new InetSocketAddress((InetAddress) b8.getNow(), this.val$unresolvedAddress.getPort()));
        } else {
            this.val$promise.setFailure(b8.cause());
        }
    }
}
