package u2;

public abstract class l extends n {

    /* renamed from: U  reason: collision with root package name */
    public final int f15756U;

    public l(int i) {
        this.f15756U = i;
    }

    public final int d(C1490a aVar) {
        int i = ((l) aVar).f15756U;
        int i8 = this.f15756U;
        if (i8 < i) {
            return -1;
        }
        if (i8 > i) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass() && this.f15756U == ((l) obj).f15756U) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return true;
    }

    public final int g() {
        return this.f15756U;
    }

    public final long h() {
        return (long) this.f15756U;
    }

    public final int hashCode() {
        return this.f15756U;
    }
}
