package D;

/* renamed from: D.d  reason: case insensitive filesystem */
public final class C0038d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f892a;

    public C0038d(Object obj) {
        this.f892a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0038d)) {
            return false;
        }
        return this.f892a.equals(((C0038d) obj).f892a);
    }

    public final int hashCode() {
        return this.f892a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f892a + "}";
    }
}
