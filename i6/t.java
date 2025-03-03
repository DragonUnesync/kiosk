package i6;

import k6.c;

public abstract class t extends v {
    private static final long C_INDEX_OFFSET = c.fieldOffset(t.class, "consumerIndex");
    private volatile long consumerIndex;

    public t(int i) {
        super(i);
    }

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
