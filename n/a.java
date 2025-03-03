package N;

import O.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f3200a;

    /* renamed from: b  reason: collision with root package name */
    public final b f3201b;

    public a(b bVar, b bVar2) {
        this.f3200a = bVar;
        this.f3201b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f3200a.equals(aVar.f3200a) || !this.f3201b.equals(aVar.f3201b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f3200a.hashCode() ^ 1000003) * 1000003) ^ this.f3201b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f3200a + ", secondaryOutConfig=" + this.f3201b + "}";
    }
}
