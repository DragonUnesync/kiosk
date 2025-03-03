package b6;

import T5.C0274u0;
import f6.C0909B;
import f6.C0910C;

public final class n1 implements C0910C {
    final /* synthetic */ C1 this$0;
    final /* synthetic */ C0274u0 val$promise;

    public n1(C1 c12, C0274u0 u0Var) {
        this.this$0 = c12;
        this.val$promise = u0Var;
    }

    public void operationComplete(C0909B b8) {
        this.val$promise.setSuccess();
    }
}
