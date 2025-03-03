package f6;

public final class I implements C0910C {
    final /* synthetic */ J this$0;

    public I(J j7) {
        this.this$0 = j7;
    }

    public void operationComplete(C0909B b8) {
        if (this.this$0.terminatedChildren.incrementAndGet() == this.this$0.children.length) {
            this.this$0.terminationFuture.setSuccess((Object) null);
        }
    }
}
