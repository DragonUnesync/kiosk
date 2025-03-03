package e6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class D extends E {
    private static final AtomicIntegerFieldUpdater<D> STATE_UPDATER = AtomicIntegerFieldUpdater.newUpdater(D.class, "state");
    private final G localPool;
    private volatile int state;
    private Object value;

    public D(G g8) {
        super((C0841A) null);
        this.localPool = g8;
    }

    public Object get() {
        return this.value;
    }

    public void recycle(Object obj) {
        if (obj == this.value) {
            this.localPool.release(this, true);
            return;
        }
        throw new IllegalArgumentException("object does not belong to handle");
    }

    public void set(Object obj) {
        this.value = obj;
    }

    public void toAvailable() {
        if (STATE_UPDATER.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("Object has been recycled already.");
        }
    }

    public void toClaimed() {
        STATE_UPDATER.lazySet(this, 0);
    }

    public void unguardedRecycle(Object obj) {
        if (obj == this.value) {
            this.localPool.release(this, false);
            return;
        }
        throw new IllegalArgumentException("object does not belong to handle");
    }

    public void unguardedToAvailable() {
        if (this.state != 1) {
            STATE_UPDATER.lazySet(this, 1);
            return;
        }
        throw new IllegalStateException("Object has been recycled already.");
    }
}
