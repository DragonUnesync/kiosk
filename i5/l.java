package i5;

import g7.C0996d;
import java.util.Arrays;

public final class l implements n {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f12750a;

    public l(int... iArr) {
        this.f12750a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        boolean z = obj instanceof l;
        int[] iArr = this.f12750a;
        if (z) {
            return Arrays.equals(iArr, ((l) obj).f12750a);
        }
        n nVar = (n) obj;
        if (iArr.length != nVar.size()) {
            return false;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != nVar.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int get(int i) {
        int[] iArr = this.f12750a;
        C0996d.j(i, iArr.length);
        return iArr[i];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12750a);
    }

    public final int size() {
        return this.f12750a.length;
    }

    public final String toString() {
        return Arrays.toString(this.f12750a);
    }
}
