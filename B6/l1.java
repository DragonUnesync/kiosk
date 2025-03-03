package b6;

public final class l1 implements Runnable {
    final /* synthetic */ C1 this$0;

    public l1(C1 c12) {
        this.this$0 = c12;
    }

    public void run() {
        this.this$0.notifyClosePromise((Throwable) null);
    }
}
