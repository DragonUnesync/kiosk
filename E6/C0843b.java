package e6;

import g6.e0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: e6.b  reason: case insensitive filesystem */
public final class C0843b extends e0 {
    public long unsafeOffset() {
        return C0844c.REFCNT_FIELD_OFFSET;
    }

    public AtomicIntegerFieldUpdater<C0844c> updater() {
        return C0844c.AIF_UPDATER;
    }
}
