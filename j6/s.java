package j6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public abstract class s extends q {
    private static final AtomicLongFieldUpdater<s> P_LIMIT_UPDATER = AtomicLongFieldUpdater.newUpdater(s.class, "producerLimit");
    private volatile long producerLimit;

    public s(int i) {
        super(i);
        this.producerLimit = (long) i;
    }

    public final long lvProducerLimit() {
        return this.producerLimit;
    }

    public final void soProducerLimit(long j7) {
        P_LIMIT_UPDATER.lazySet(this, j7);
    }
}
