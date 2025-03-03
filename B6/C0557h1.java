package b6;

import T5.C0274u0;
import T5.P;
import T5.U;
import T5.Y;
import f6.C0909B;
import f6.C0910C;
import f6.C0916f;
import f6.Z;
import java.util.concurrent.TimeUnit;

/* renamed from: b6.h1  reason: case insensitive filesystem */
public final class C0557h1 implements U {
    final /* synthetic */ C1 this$0;
    final /* synthetic */ Y val$ctx;
    final /* synthetic */ C0274u0 val$promise;
    final /* synthetic */ C0909B val$timeoutFuture;

    public C0557h1(C1 c12, C0909B b8, Y y8, C0274u0 u0Var) {
        this.this$0 = c12;
        this.val$timeoutFuture = b8;
        this.val$ctx = y8;
        this.val$promise = u0Var;
    }

    public void operationComplete(P p3) {
        Z z;
        C0909B b8 = this.val$timeoutFuture;
        if (b8 != null) {
            b8.cancel(false);
        }
        long access$2600 = this.this$0.closeNotifyReadTimeoutMillis;
        if (access$2600 <= 0) {
            Y y8 = this.val$ctx;
            C1.addCloseListener(y8.close(y8.newPromise()), this.val$promise);
            return;
        }
        if (!this.this$0.sslClosePromise.isDone()) {
            z = ((C0916f) this.val$ctx.executor()).schedule((Runnable) new C0551f1(this, access$2600), access$2600, TimeUnit.MILLISECONDS);
        } else {
            z = null;
        }
        this.this$0.sslClosePromise.addListener((C0910C) new C0554g1(this, z));
    }
}
