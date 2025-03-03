package i6;

import k6.c;

public abstract class z extends x {
    private static final long P_LIMIT_OFFSET = c.fieldOffset(z.class, "producerLimit");
    private volatile long producerLimit;

    public z(int i) {
        super(i);
        this.producerLimit = (long) i;
    }

    public final long lvProducerLimit() {
        return this.producerLimit;
    }

    public final void soProducerLimit(long j7) {
        c.UNSAFE.putOrderedLong(this, P_LIMIT_OFFSET, j7);
    }
}
