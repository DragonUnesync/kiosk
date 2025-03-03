package T5;

public final class u1 implements U {
    final /* synthetic */ v1 this$0;

    public u1(v1 v1Var) {
        this.this$0 = v1Var;
    }

    public void operationComplete(P p3) {
        Throwable cause = p3.cause();
        if (cause != null) {
            this.this$0.fireException0(cause);
        }
    }
}
