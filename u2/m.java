package u2;

public abstract class m extends n {

    /* renamed from: U  reason: collision with root package name */
    public final long f15757U;

    public m(long j7) {
        this.f15757U = j7;
    }

    public final int d(C1490a aVar) {
        long j7 = ((m) aVar).f15757U;
        long j8 = this.f15757U;
        if (j8 < j7) {
            return -1;
        }
        if (j8 > j7) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            if (this.f15757U == ((m) obj).f15757U) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        long j7 = this.f15757U;
        if (((long) ((int) j7)) == j7) {
            return true;
        }
        return false;
    }

    public final int g() {
        return (int) this.f15757U;
    }

    public final long h() {
        return this.f15757U;
    }

    public final int hashCode() {
        long j7 = this.f15757U;
        return ((int) j7) ^ ((int) (j7 >> 32));
    }
}
