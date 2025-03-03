package S5;

/* renamed from: S5.f  reason: case insensitive filesystem */
public final class C0169f extends P0 {
    private final C0185n referenceCountDelegate;

    public C0169f(C0185n nVar, C0159a aVar, int i, int i8) {
        super(aVar, i, i8);
        this.referenceCountDelegate = nVar;
    }

    public C0185n duplicate() {
        ensureAccessible();
        return new C0167e(this.referenceCountDelegate, unwrap()).setIndex(idx(readerIndex()), idx(writerIndex()));
    }

    public boolean isAccessible0() {
        return this.referenceCountDelegate.isAccessible();
    }

    public int refCnt0() {
        return this.referenceCountDelegate.refCnt();
    }

    public boolean release0() {
        return this.referenceCountDelegate.release();
    }

    public C0185n retain0() {
        this.referenceCountDelegate.retain();
        return this;
    }

    public C0185n retainedDuplicate() {
        return C0186n0.newInstance(unwrap(), this, idx(readerIndex()), idx(writerIndex()));
    }

    public C0185n retainedSlice() {
        return retainedSlice(0, capacity());
    }

    public C0185n slice(int i, int i8) {
        checkIndex(i, i8);
        return new C0169f(this.referenceCountDelegate, unwrap(), idx(i), i8);
    }

    public C0185n touch0(Object obj) {
        this.referenceCountDelegate.touch(obj);
        return this;
    }

    public C0185n retainedSlice(int i, int i8) {
        return C0193r0.newInstance(unwrap(), this, idx(i), i8);
    }
}
