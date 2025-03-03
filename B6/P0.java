package b6;

public class P0 implements Runnable {
    protected final Runnable task;
    final /* synthetic */ Q0 this$0;

    public P0(Q0 q02, Runnable runnable) {
        this.this$0 = q02;
        this.task = runnable;
    }

    public void run() {
        this.this$0.runAndResetNeedTask(this.task);
    }
}
