package u4;

public final class c implements Comparable {

    /* renamed from: U  reason: collision with root package name */
    public final d f15779U;

    /* renamed from: V  reason: collision with root package name */
    public final d f15780V;

    public c(d dVar, d dVar2) {
        this.f15779U = dVar;
        this.f15780V = dVar2;
    }

    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int compareTo = this.f15779U.toString().compareTo(cVar.f15779U.toString());
        if (compareTo != 0) {
            return compareTo;
        }
        return this.f15780V.toString().compareTo(cVar.f15780V.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f15779U.equals(cVar.f15779U) || !this.f15780V.equals(cVar.f15780V)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15780V.hashCode() + (this.f15779U.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f15779U + ", " + this.f15780V + ")";
    }
}
