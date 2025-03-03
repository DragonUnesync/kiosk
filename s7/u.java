package S7;

import j$.util.Objects;

public final class u {

    /* renamed from: c  reason: collision with root package name */
    public static final u f4592c;

    /* renamed from: a  reason: collision with root package name */
    public final t f4593a;

    /* renamed from: b  reason: collision with root package name */
    public final t f4594b;

    static {
        t tVar = new t(-1, -1, -1);
        f4592c = new u(tVar, tVar);
    }

    public u(t tVar, t tVar2) {
        this.f4593a = tVar;
        this.f4594b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.f4593a.equals(uVar.f4593a)) {
            return false;
        }
        return this.f4594b.equals(uVar.f4594b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f4593a, this.f4594b});
    }

    public final String toString() {
        return this.f4593a + "-" + this.f4594b;
    }
}
