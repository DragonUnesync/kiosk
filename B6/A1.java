package b6;

public final class A1 implements Runnable {
    final /* synthetic */ B1 this$1;
    final /* synthetic */ Throwable val$cause;

    public A1(B1 b12, Throwable th) {
        this.this$1 = b12;
        this.val$cause = th;
    }

    public void run() {
        this.this$1.this$0.clearState(128);
        this.this$1.safeExceptionCaught(this.val$cause);
    }
}
