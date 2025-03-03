package c4;

import java.util.ArrayList;

/* renamed from: c4.b  reason: case insensitive filesystem */
public final class C0616b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8885a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8886b;

    public C0616b(int i, ArrayList arrayList) {
        this.f8885a = new ArrayList(arrayList);
        this.f8886b = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0616b) && this.f8885a.equals(((C0616b) obj).f8885a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8885a.hashCode() ^ Boolean.FALSE.hashCode();
    }

    public final String toString() {
        return "{ " + this.f8885a + " }";
    }
}
