package S5;

import g6.e0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: S5.i  reason: case insensitive filesystem */
public abstract class C0175i extends C0159a {
    /* access modifiers changed from: private */
    public static final AtomicIntegerFieldUpdater<C0175i> AIF_UPDATER;
    /* access modifiers changed from: private */
    public static final long REFCNT_FIELD_OFFSET;
    private static final e0 updater = new C0173h();
    private volatile int refCnt;

    static {
        Class<C0175i> cls = C0175i.class;
        REFCNT_FIELD_OFFSET = e0.getUnsafeOffset(cls, "refCnt");
        AIF_UPDATER = AtomicIntegerFieldUpdater.newUpdater(cls, "refCnt");
    }

    public C0175i(int i) {
        super(i);
        updater.setInitialValue(this);
    }

    private boolean handleRelease(boolean z) {
        if (z) {
            deallocate();
        }
        return z;
    }

    public abstract void deallocate();

    public boolean isAccessible() {
        return updater.isLiveNonVolatile(this);
    }

    public int refCnt() {
        return updater.refCnt(this);
    }

    public boolean release() {
        return handleRelease(updater.release(this));
    }

    public final void resetRefCnt() {
        updater.resetRefCnt(this);
    }

    public C0185n retain() {
        return (C0185n) updater.retain(this);
    }

    public C0185n touch(Object obj) {
        return this;
    }
}
