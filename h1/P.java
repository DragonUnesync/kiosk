package h1;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final int f12333a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12334b;

    public P(int i, boolean z) {
        this.f12333a = i;
        this.f12334b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P.class != obj.getClass()) {
            return false;
        }
        P p3 = (P) obj;
        if (this.f12333a == p3.f12333a && this.f12334b == p3.f12334b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12333a * 31) + (this.f12334b ? 1 : 0);
    }
}
