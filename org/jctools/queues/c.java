package org.jctools.queues;

public abstract class c extends b {
    private static final long C_INDEX_OFFSET = O7.c.fieldOffset(c.class, "consumerIndex");
    protected long consumerIndex;

    public final long lvConsumerIndex() {
        return O7.c.UNSAFE.getLongVolatile(this, C_INDEX_OFFSET);
    }

    public abstract /* synthetic */ long lvProducerIndex();

    public final void soConsumerIndex(long j7) {
        O7.c.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j7);
    }
}
