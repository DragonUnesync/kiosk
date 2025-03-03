package S5;

import g6.e0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: S5.h  reason: case insensitive filesystem */
public final class C0173h extends e0 {
    public long unsafeOffset() {
        return C0175i.REFCNT_FIELD_OFFSET;
    }

    public AtomicIntegerFieldUpdater<C0175i> updater() {
        return C0175i.AIF_UPDATER;
    }
}
