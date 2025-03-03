package T5;

public final class H0 implements Runnable {
    final /* synthetic */ O0 this$0;
    final /* synthetic */ F val$finalCtx;

    public H0(O0 o02, F f8) {
        this.this$0 = o02;
        this.val$finalCtx = f8;
    }

    public void run() {
        this.this$0.destroyDown(Thread.currentThread(), this.val$finalCtx, true);
    }
}
