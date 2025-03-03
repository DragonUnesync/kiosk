package r2;

public abstract class o extends p {

    /* renamed from: U  reason: collision with root package name */
    public int f14904U = -1;

    public final int e() {
        int i = this.f14904U;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("index not yet set");
    }

    public final String f() {
        return "[" + Integer.toHexString(this.f14904U) + ']';
    }

    public final void g(int i) {
        if (this.f14904U == -1) {
            this.f14904U = i;
            return;
        }
        throw new RuntimeException("index already set");
    }
}
