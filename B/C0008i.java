package B;

import M.l;

/* renamed from: B.i  reason: case insensitive filesystem */
public final class C0008i {

    /* renamed from: a  reason: collision with root package name */
    public final l f260a;

    public C0008i(l lVar) {
        if (lVar != null) {
            this.f260a = lVar;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0008i)) {
            return false;
        }
        C0008i iVar = (C0008i) obj;
        iVar.getClass();
        return this.f260a.equals(iVar.f260a);
    }

    public final int hashCode() {
        return this.f260a.hashCode() ^ -721379959;
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f260a + "}";
    }
}
