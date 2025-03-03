package j6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

public abstract class g extends i {
    private static final AtomicLongFieldUpdater<g> C_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(g.class, "consumerIndex");
    protected AtomicReferenceArray<Object> consumerBuffer;
    private volatile long consumerIndex;
    protected long consumerMask;

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
