package u2;

public final class r extends C1490a {

    /* renamed from: U  reason: collision with root package name */
    public final t f15763U;

    /* renamed from: V  reason: collision with root package name */
    public final t f15764V;

    static {
        new r(new t("TYPE"), new t("Ljava/lang/Class;"));
    }

    public r(t tVar, t tVar2) {
        this.f15763U = tVar;
        this.f15764V = tVar2;
    }

    public final String a() {
        return this.f15763U.a() + ':' + this.f15764V.a();
    }

    public final int d(C1490a aVar) {
        r rVar = (r) aVar;
        int b8 = this.f15763U.compareTo(rVar.f15763U);
        if (b8 != 0) {
            return b8;
        }
        return this.f15764V.compareTo(rVar.f15764V);
    }

    public final String e() {
        return "nat";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f15763U.equals(rVar.f15763U) || !this.f15764V.equals(rVar.f15764V)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f15763U.f15766U.hashCode() * 31) ^ this.f15764V.f15766U.hashCode();
    }

    public final String toString() {
        return "nat{" + a() + '}';
    }
}
