package i6;

import k6.c;

public abstract class d extends f {
    private static final long C_INDEX_OFFSET = c.fieldOffset(d.class, "consumerIndex");
    protected Object[] consumerBuffer;
    private volatile long consumerIndex;
    protected long consumerMask;

    public final long lpConsumerIndex() {
        return c.UNSAFE.getLong(this, C_INDEX_OFFSET);
    }

    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    public final void soConsumerIndex(long j7) {
        c.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j7);
    }
}
