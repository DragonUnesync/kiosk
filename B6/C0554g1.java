package b6;

import T5.Y;
import f6.C0909B;
import f6.C0910C;

/* renamed from: b6.g1  reason: case insensitive filesystem */
public final class C0554g1 implements C0910C {
    final /* synthetic */ C0557h1 this$1;
    final /* synthetic */ C0909B val$closeNotifyReadTimeoutFuture;

    public C0554g1(C0557h1 h1Var, C0909B b8) {
        this.this$1 = h1Var;
        this.val$closeNotifyReadTimeoutFuture = b8;
    }

    public void operationComplete(C0909B b8) {
        C0909B b9 = this.val$closeNotifyReadTimeoutFuture;
        if (b9 != null) {
            b9.cancel(false);
        }
        Y y8 = this.this$1.val$ctx;
        C1.addCloseListener(y8.close(y8.newPromise()), this.this$1.val$promise);
    }
}
