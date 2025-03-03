package T0;

public final class d0 {

    /* renamed from: c  reason: collision with root package name */
    public static final d0 f4795c = new d0(0, false);

    /* renamed from: a  reason: collision with root package name */
    public final int f4796a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4797b;

    public d0(int i, boolean z) {
        this.f4796a = i;
        this.f4797b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f4796a == d0Var.f4796a && this.f4797b == d0Var.f4797b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4796a << 1) + (this.f4797b ? 1 : 0);
    }
}
