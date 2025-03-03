package M0;

import H3.O;
import P0.z;
import java.util.Collections;
import java.util.List;

public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public final Y f2889a;

    /* renamed from: b  reason: collision with root package name */
    public final O f2890b;

    static {
        z.J(0);
        z.J(1);
    }

    public Z(Y y8, List list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < y8.f2885a)) {
            this.f2889a = y8;
            this.f2890b = O.m(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z.class != obj.getClass()) {
            return false;
        }
        Z z = (Z) obj;
        if (!this.f2889a.equals(z.f2889a) || !this.f2890b.equals(z.f2890b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f2890b.hashCode() * 31) + this.f2889a.hashCode();
    }
}
