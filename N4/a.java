package N4;

import M4.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f3363a;

    public a(c cVar) {
        this.f3363a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f3363a.equals(((a) obj).f3363a);
    }

    public final int hashCode() {
        return this.f3363a.hashCode();
    }

    public final String toString() {
        return this.f3363a.toString();
    }
}
