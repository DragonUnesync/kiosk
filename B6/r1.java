package b6;

public final class r1 implements Runnable {
    boolean didRun;
    private final boolean inUnwrap;
    boolean resumeLater;
    final /* synthetic */ C1 this$0;

    public r1(C1 c12, boolean z) {
        this.this$0 = c12;
        this.inUnwrap = z;
    }

    public boolean resumeLater() {
        if (this.didRun) {
            return false;
        }
        this.resumeLater = true;
        return true;
    }

    public void run() {
        this.didRun = true;
        if (this.resumeLater) {
            this.this$0.getTaskRunner(this.inUnwrap).runComplete();
        }
    }
}
