package P6;

public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Class f3953a;

    public i(Class cls) {
        this.f3953a = cls;
    }

    public final Class a() {
        return this.f3953a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (f.a(this.f3953a, ((i) obj).f3953a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3953a.hashCode();
    }

    public final String toString() {
        return this.f3953a.toString() + " (Kotlin reflection is not available)";
    }
}
