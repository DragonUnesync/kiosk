package j6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

public abstract class f extends j {
    private static final AtomicLongFieldUpdater<f> P_LIMIT_UPDATER = AtomicLongFieldUpdater.newUpdater(f.class, "producerLimit");
    protected AtomicReferenceArray<Object> producerBuffer;
    private volatile long producerLimit;
    protected long producerMask;

    public final boolean casProducerLimit(long j7, long j8) {
        return P_LIMIT_UPDATER.compareAndSet(this, j7, j8);
    }

    public final long lvProducerLimit() {
        return this.producerLimit;
    }

    public final void soProducerLimit(long j7) {
        P_LIMIT_UPDATER.lazySet(this, j7);
    }
}
