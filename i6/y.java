package i6;

import k6.c;

public abstract class y extends u {
    private static final long P_INDEX_OFFSET = c.fieldOffset(y.class, "producerIndex");
    private volatile long producerIndex;

    public y(int i) {
        super(i);
    }

    public final boolean casProducerIndex(long j7, long j8) {
        return c.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, j7, j8);
    }

    public final long lvProducerIndex() {
        return this.producerIndex;
    }
}
