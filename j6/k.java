package j6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public abstract class k extends h {
    private static final AtomicLongFieldUpdater<k> P_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(k.class, "producerIndex");
    private volatile long producerIndex;

    public final boolean casProducerIndex(long j7, long j8) {
        return P_INDEX_UPDATER.compareAndSet(this, j7, j8);
    }

    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    public final void soProducerIndex(long j7) {
        P_INDEX_UPDATER.lazySet(this, j7);
    }
}
