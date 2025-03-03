package H3;

import N.e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public final class F extends h0 implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final Comparator[] f2011U;

    public F(C0102t tVar, C0102t tVar2) {
        this.f2011U = new Comparator[]{tVar, tVar2};
    }

    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f2011U;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F) {
            return Arrays.equals(this.f2011U, ((F) obj).f2011U);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2011U);
    }

    public final String toString() {
        return e.A(new StringBuilder("Ordering.compound("), Arrays.toString(this.f2011U), ")");
    }
}
