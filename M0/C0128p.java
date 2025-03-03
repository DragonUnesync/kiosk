package M0;

import P0.l;
import P0.z;
import android.util.SparseBooleanArray;

/* renamed from: M0.p  reason: case insensitive filesystem */
public final class C0128p {

    /* renamed from: a  reason: collision with root package name */
    public final SparseBooleanArray f2977a;

    public C0128p(SparseBooleanArray sparseBooleanArray) {
        this.f2977a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.f2977a;
        l.g(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0128p)) {
            return false;
        }
        C0128p pVar = (C0128p) obj;
        int i = z.f3748a;
        SparseBooleanArray sparseBooleanArray = this.f2977a;
        if (i >= 24) {
            return sparseBooleanArray.equals(pVar.f2977a);
        }
        if (sparseBooleanArray.size() != pVar.f2977a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
            if (a(i8) != pVar.a(i8)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = z.f3748a;
        SparseBooleanArray sparseBooleanArray = this.f2977a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
            size = (size * 31) + a(i8);
        }
        return size;
    }
}
