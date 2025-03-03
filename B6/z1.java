package b6;

public final class z1 implements Runnable {
    final /* synthetic */ B1 this$1;

    public z1(B1 b12) {
        this.this$1 = b12;
    }

    public void run() {
        this.this$1.resumeOnEventExecutor();
    }
}
