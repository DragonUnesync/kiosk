package androidx.lifecycle;

import P6.f;

/* renamed from: androidx.lifecycle.j  reason: case insensitive filesystem */
public final class C0483j {
    public static C0485l a(C0486m mVar) {
        f.e(mVar, "state");
        int ordinal = mVar.ordinal();
        if (ordinal == 1) {
            return C0485l.ON_CREATE;
        }
        if (ordinal == 2) {
            return C0485l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return C0485l.ON_RESUME;
    }
}
