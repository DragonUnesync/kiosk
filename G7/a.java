package G7;

import j$.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f1743a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f1743a == ((a) obj).f1743a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.f1743a)});
    }

    public final String toString() {
        return Long.toString(this.f1743a);
    }
}
