package j6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public abstract class r extends n {
    private static final AtomicLongFieldUpdater<r> P_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(r.class, "producerIndex");
    private volatile long producerIndex;

    public r(int i) {
        super(i);
    }

    public final boolean casProducerIndex(long j7, long j8) {
        return P_INDEX_UPDATER.compareAndSet(this, j7, j8);
    }

    public final long lvProducerIndex() {
        return this.producerIndex;
    }
}
