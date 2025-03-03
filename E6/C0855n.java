package e6;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: e6.n  reason: case insensitive filesystem */
public final class C0855n extends AtomicReference implements C0848g {
    private static final AtomicReferenceFieldUpdater<C0855n, C0856o> MAP_UPDATER = AtomicReferenceFieldUpdater.newUpdater(C0855n.class, C0856o.class, "attributeMap");
    private volatile C0856o attributeMap;

    public C0855n(C0856o oVar, C0849h hVar) {
        this.attributeMap = oVar;
    }

    /* access modifiers changed from: private */
    public boolean isRemoved() {
        if (this.attributeMap == null) {
            return true;
        }
        return false;
    }
}
