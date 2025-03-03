package H3;

public final class v0 extends U {

    /* renamed from: X  reason: collision with root package name */
    public final transient Object f2129X;

    public v0(Object obj) {
        obj.getClass();
        this.f2129X = obj;
    }

    public final O b() {
        return O.r(this.f2129X);
    }

    public final int c(int i, Object[] objArr) {
        objArr[i] = this.f2129X;
        return i + 1;
    }

    public final boolean contains(Object obj) {
        return this.f2129X.equals(obj);
    }

    public final boolean g() {
        return false;
    }

    public final x0 h() {
        return new X(this.f2129X);
    }

    public final int hashCode() {
        return this.f2129X.hashCode();
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return "[" + this.f2129X.toString() + ']';
    }
}
