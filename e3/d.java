package e3;

public final class d implements Comparable {

    /* renamed from: U  reason: collision with root package name */
    public int f11218U;

    /* renamed from: V  reason: collision with root package name */
    public int f11219V;

    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int i = this.f11219V;
        int i8 = dVar.f11219V;
        if (i != i8) {
            return i - i8;
        }
        return this.f11218U - dVar.f11218U;
    }

    public final String toString() {
        return "Order{order=" + this.f11219V + ", index=" + this.f11218U + '}';
    }
}
