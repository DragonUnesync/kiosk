package f6;

public final class P implements C0910C {
    final /* synthetic */ C0909B val$future;

    public P(C0909B b8) {
        this.val$future = b8;
    }

    public void operationComplete(C0909B b8) {
        if (b8.isCancelled()) {
            this.val$future.cancel(false);
        }
    }
}
