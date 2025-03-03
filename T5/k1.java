package T5;

public final class k1 extends m1 {
    private final O0 pipeline;

    public k1(O0 o02) {
        super(o02.estimatorHandle());
        this.pipeline = o02;
    }

    public void decrementPendingOutboundBytes(long j7) {
        this.pipeline.decrementPendingOutboundBytes(j7);
    }

    public void incrementPendingOutboundBytes(long j7) {
        this.pipeline.incrementPendingOutboundBytes(j7);
    }
}
