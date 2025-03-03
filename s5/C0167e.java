package S5;

/* renamed from: S5.e  reason: case insensitive filesystem */
public final class C0167e extends N0 {
    private final C0185n referenceCountDelegate;

    public C0167e(C0185n nVar, C0159a aVar) {
        super(aVar);
        this.referenceCountDelegate = nVar;
    }

    public C0185n duplicate() {
        ensureAccessible();
        return new C0167e(this.referenceCountDelegate, this);
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
        return C0186n0.newInstance(unwrap(), this, readerIndex(), writerIndex());
    }

    public C0185n retainedSlice() {
        return retainedSlice(readerIndex(), capacity());
    }

    public C0185n slice(int i, int i8) {
        checkIndex(i, i8);
        return new C0169f(this.referenceCountDelegate, unwrap(), i, i8);
    }

    public C0185n touch0(Object obj) {
        this.referenceCountDelegate.touch(obj);
        return this;
    }

    public C0185n retainedSlice(int i, int i8) {
        return C0193r0.newInstance(unwrap(), this, i, i8);
    }
}
