package i6;

import k6.c;

/* renamed from: i6.c  reason: case insensitive filesystem */
public abstract class C1109c extends g {
    private static final long P_LIMIT_OFFSET = c.fieldOffset(C1109c.class, "producerLimit");
    protected Object[] producerBuffer;
    private volatile long producerLimit;
    protected long producerMask;

    public final boolean casProducerLimit(long j7, long j8) {
        return c.UNSAFE.compareAndSwapLong(this, P_LIMIT_OFFSET, j7, j8);
    }

    public final long lvProducerLimit() {
        return this.producerLimit;
    }

    public final void soProducerLimit(long j7) {
        c.UNSAFE.putOrderedLong(this, P_LIMIT_OFFSET, j7);
    }
}
