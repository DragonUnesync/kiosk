package X0;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final long f6271a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6272b;

    public q(long j7, long j8) {
        this.f6271a = j7;
        this.f6272b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f6271a == qVar.f6271a && this.f6272b == qVar.f6272b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f6271a) * 31) + ((int) this.f6272b);
    }
}
