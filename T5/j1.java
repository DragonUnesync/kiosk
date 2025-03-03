package T5;

public final class j1 extends m1 {
    private final C0263o0 buffer;

    public j1(C0263o0 o0Var, f1 f1Var) {
        super(f1Var);
        this.buffer = o0Var;
    }

    public void decrementPendingOutboundBytes(long j7) {
        this.buffer.decrementPendingOutboundBytes(j7);
    }

    public void incrementPendingOutboundBytes(long j7) {
        this.buffer.incrementPendingOutboundBytes(j7);
    }
}
