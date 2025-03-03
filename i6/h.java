package i6;

import k6.c;

public abstract class h extends e {
    private static final long P_INDEX_OFFSET = c.fieldOffset(h.class, "producerIndex");
    private volatile long producerIndex;

    public final boolean casProducerIndex(long j7, long j8) {
        return c.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, j7, j8);
    }

    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    public final void soProducerIndex(long j7) {
        c.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j7);
    }
}
