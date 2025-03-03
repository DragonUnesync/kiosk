package f6;

public final class Q extends S {
    final /* synthetic */ C0909B val$future;
    final /* synthetic */ L val$promise;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q(boolean z, L[] lArr, L l8, C0909B b8) {
        super(z, lArr);
        this.val$promise = l8;
        this.val$future = b8;
    }

    public void operationComplete(C0909B b8) {
        if (!this.val$promise.isCancelled() || !b8.isCancelled()) {
            super.operationComplete(this.val$future);
        }
    }
}
