package W2;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public Class f6169a;

    /* renamed from: b  reason: collision with root package name */
    public Class f6170b;

    /* renamed from: c  reason: collision with root package name */
    public Class f6171c;

    public k(Class cls, Class cls2, Class cls3) {
        this.f6169a = cls;
        this.f6170b = cls2;
        this.f6171c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f6169a.equals(kVar.f6169a) && this.f6170b.equals(kVar.f6170b) && m.b(this.f6171c, kVar.f6171c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f6170b.hashCode() + (this.f6169a.hashCode() * 31)) * 31;
        Class cls = this.f6171c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f6169a + ", second=" + this.f6170b + '}';
    }
}
