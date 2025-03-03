package b6;

import f6.C0909B;
import f6.C0910C;

public final class p1 implements C0910C {
    final /* synthetic */ C1 this$0;
    final /* synthetic */ C0909B val$timeoutFuture;

    public p1(C1 c12, C0909B b8) {
        this.this$0 = c12;
        this.val$timeoutFuture = b8;
    }

    public void operationComplete(C0909B b8) {
        this.val$timeoutFuture.cancel(false);
    }
}
