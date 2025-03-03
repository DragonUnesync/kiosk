package H3;

public final class l0 extends U {

    /* renamed from: X  reason: collision with root package name */
    public final transient n0 f2087X;

    /* renamed from: Y  reason: collision with root package name */
    public final transient m0 f2088Y;

    public l0(n0 n0Var, m0 m0Var) {
        this.f2087X = n0Var;
        this.f2088Y = m0Var;
    }

    public final O b() {
        return this.f2088Y;
    }

    public final int c(int i, Object[] objArr) {
        return this.f2088Y.c(i, objArr);
    }

    public final boolean contains(Object obj) {
        if (this.f2087X.get(obj) != null) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        return true;
    }

    public final x0 h() {
        return this.f2088Y.listIterator(0);
    }

    public final int size() {
        return this.f2087X.f2100Z;
    }
}
