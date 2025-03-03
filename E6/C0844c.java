package e6;

import g6.e0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: e6.c  reason: case insensitive filesystem */
public abstract class C0844c implements J {
    /* access modifiers changed from: private */
    public static final AtomicIntegerFieldUpdater<C0844c> AIF_UPDATER;
    /* access modifiers changed from: private */
    public static final long REFCNT_FIELD_OFFSET;
    private static final e0 updater = new C0843b();
    private volatile int refCnt = updater.initialValue();

    static {
        Class<C0844c> cls = C0844c.class;
        REFCNT_FIELD_OFFSET = e0.getUnsafeOffset(cls, "refCnt");
        AIF_UPDATER = AtomicIntegerFieldUpdater.newUpdater(cls, "refCnt");
    }

    private boolean handleRelease(boolean z) {
        if (z) {
            deallocate();
        }
        return z;
    }

    public abstract void deallocate();

    public int refCnt() {
        return updater.refCnt(this);
    }

    public boolean release() {
        return handleRelease(updater.release(this));
    }

    public J retain() {
        return updater.retain(this);
    }

    public boolean release(int i) {
        return handleRelease(updater.release(this, i));
    }
}
