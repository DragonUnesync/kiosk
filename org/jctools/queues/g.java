package org.jctools.queues;

import O7.c;

public abstract class g extends d {
    private static final long P_INDEX_OFFSET = c.fieldOffset(g.class, "producerIndex");
    protected long producerIndex;

    public final long lvProducerIndex() {
        return c.UNSAFE.getLongVolatile(this, P_INDEX_OFFSET);
    }

    public final void soProducerIndex(long j7) {
        c.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j7);
    }
}
