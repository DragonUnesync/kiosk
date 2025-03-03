package K7;

import java.io.Serializable;

public final class c implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final b f2668U = b.f2666U;

    /* renamed from: V  reason: collision with root package name */
    public transient int f2669V;

    /* renamed from: W  reason: collision with root package name */
    public final Integer f2670W;

    /* renamed from: X  reason: collision with root package name */
    public final Integer f2671X;

    /* renamed from: Y  reason: collision with root package name */
    public transient String f2672Y;

    public c(Integer num, Integer num2) {
        if (num.compareTo(num2) < 1) {
            this.f2671X = num;
            this.f2670W = num2;
            return;
        }
        this.f2671X = num2;
        this.f2670W = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != c.class) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f2671X.equals(cVar.f2671X) || !this.f2670W.equals(cVar.f2670W)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f2669V;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f2671X.hashCode();
        int hashCode2 = this.f2670W.hashCode() + ((hashCode + ((c.class.hashCode() + 629) * 37)) * 37);
        this.f2669V = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        if (this.f2672Y == null) {
            this.f2672Y = "[" + this.f2671X + ".." + this.f2670W + "]";
        }
        return this.f2672Y;
    }
}
