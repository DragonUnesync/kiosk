package S5;

import g6.Y;

public final class L0 extends C0163c {
    public static final L0 DEFAULT = new L0(Y.directBufferPreferred());
    private final boolean disableLeakDetector;
    private final K0 metric;
    private final boolean noCleaner;

    public L0(boolean z) {
        this(z, false);
    }

    public E compositeDirectBuffer(int i) {
        E e = new E(this, true, i);
        if (this.disableLeakDetector) {
            return e;
        }
        return C0163c.toLeakAwareBuffer(e);
    }

    public E compositeHeapBuffer(int i) {
        E e = new E(this, false, i);
        if (this.disableLeakDetector) {
            return e;
        }
        return C0163c.toLeakAwareBuffer(e);
    }

    public void decrementDirect(int i) {
        this.metric.directCounter.add((long) (-i));
    }

    public void decrementHeap(int i) {
        this.metric.heapCounter.add((long) (-i));
    }

    public void incrementDirect(int i) {
        this.metric.directCounter.add((long) i);
    }

    public void incrementHeap(int i) {
        this.metric.heapCounter.add((long) i);
    }

    public boolean isDirectBufferPooled() {
        return false;
    }

    public C0185n newDirectBuffer(int i, int i8) {
        C0185n nVar;
        if (!Y.hasUnsafe()) {
            nVar = new F0(this, i, i8);
        } else if (this.noCleaner) {
            nVar = new J0(this, i, i8);
        } else {
            nVar = new H0(this, i, i8);
        }
        if (this.disableLeakDetector) {
            return nVar;
        }
        return C0163c.toLeakAwareBuffer(nVar);
    }

    public C0185n newHeapBuffer(int i, int i8) {
        if (Y.hasUnsafe()) {
            return new I0(this, i, i8);
        }
        return new G0(this, i, i8);
    }

    public L0(boolean z, boolean z6) {
        this(z, z6, Y.useDirectBufferNoCleaner());
    }

    public L0(boolean z, boolean z6, boolean z8) {
        super(z);
        this.metric = new K0();
        this.disableLeakDetector = z6;
        this.noCleaner = z8 && Y.hasUnsafe() && Y.hasDirectBufferNoCleanerConstructor();
    }
}
