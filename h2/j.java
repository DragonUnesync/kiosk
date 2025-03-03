package H2;

import N.e;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f1963a;

    public j(String str) {
        this.f1963a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f1963a.equals(((j) obj).f1963a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1963a.hashCode();
    }

    public final String toString() {
        return e.A(new StringBuilder("StringHeaderFactory{value='"), this.f1963a, "'}");
    }
}
