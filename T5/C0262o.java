package T5;

/* renamed from: T5.o  reason: case insensitive filesystem */
public final class C0262o implements Runnable {
    final /* synthetic */ F this$0;
    final /* synthetic */ F val$next;
    final /* synthetic */ C0274u0 val$promise;

    public C0262o(F f8, F f9, C0274u0 u0Var) {
        this.this$0 = f8;
        this.val$next = f9;
        this.val$promise = u0Var;
    }

    public void run() {
        this.val$next.invokeDisconnect(this.val$promise);
    }
}
