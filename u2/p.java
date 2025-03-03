package u2;

public abstract class p extends v {

    /* renamed from: U  reason: collision with root package name */
    public final u f15759U;

    /* renamed from: V  reason: collision with root package name */
    public final r f15760V;

    public p(u uVar, r rVar) {
        if (uVar != null) {
            this.f15759U = uVar;
            this.f15760V = rVar;
            return;
        }
        throw new NullPointerException("definingClass == null");
    }

    public final String a() {
        return this.f15759U.f15772U.a() + '.' + this.f15760V.a();
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f15759U.equals(pVar.f15759U) || !this.f15760V.equals(pVar.f15760V)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f15759U.hashCode() * 31) ^ this.f15760V.hashCode();
    }

    public final String toString() {
        return e() + '{' + a() + '}';
    }
}
