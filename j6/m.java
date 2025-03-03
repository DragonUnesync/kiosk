package j6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public abstract class m extends o {
    private static final AtomicLongFieldUpdater<m> C_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(m.class, "consumerIndex");
    private volatile long consumerIndex;

    public m(int i) {
        super(i);
    }

    public final long lpConsumerIndex() {
        return this.consumerIndex;
    }

    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    public final void soConsumerIndex(long j7) {
        C_INDEX_UPDATER.lazySet(this, j7);
    }
}
