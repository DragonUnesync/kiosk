package M0;

import H3.M;
import H3.O;
import H3.i0;
import P0.z;

public final class e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final e0 f2940b = new e0(i0.f2073Y);

    /* renamed from: a  reason: collision with root package name */
    public final O f2941a;

    static {
        M m8 = O.f2026V;
        z.J(0);
    }

    public e0(O o2) {
        this.f2941a = O.m(o2);
    }

    public final boolean a(int i) {
        int i8 = 0;
        while (true) {
            O o2 = this.f2941a;
            if (i8 >= o2.size()) {
                return false;
            }
            d0 d0Var = (d0) o2.get(i8);
            boolean[] zArr = d0Var.e;
            int length = zArr.length;
            boolean z = false;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                } else if (zArr[i9]) {
                    z = true;
                    break;
                } else {
                    i9++;
                }
            }
            if (z && d0Var.a() == i) {
                return true;
            }
            i8++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        return this.f2941a.equals(((e0) obj).f2941a);
    }

    public final int hashCode() {
        return this.f2941a.hashCode();
    }
}
