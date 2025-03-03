package f6;

public final class N implements C0910C {
    final /* synthetic */ O this$0;

    public N(O o2) {
        this.this$0 = o2;
    }

    /* access modifiers changed from: private */
    public void operationComplete0(C0909B b8) {
        O.access$204(this.this$0);
        if (!b8.isSuccess() && this.this$0.cause == null) {
            Throwable unused = this.this$0.cause = b8.cause();
        }
        if (this.this$0.doneCount == this.this$0.expectedCount && this.this$0.aggregatePromise != null) {
            boolean unused2 = this.this$0.tryPromise();
        }
    }

    public void operationComplete(C0909B b8) {
        if (((C0911a) this.this$0.executor).inEventLoop()) {
            operationComplete0(b8);
        } else {
            this.this$0.executor.execute(new M(this, b8));
        }
    }
}
