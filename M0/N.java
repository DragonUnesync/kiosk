package M0;

public final class N {

    /* renamed from: a  reason: collision with root package name */
    public final C0128p f2850a;

    public N(C0128p pVar) {
        this.f2850a = pVar;
    }

    public final boolean a(int... iArr) {
        C0128p pVar = this.f2850a;
        for (int i : iArr) {
            if (pVar.f2977a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        return this.f2850a.equals(((N) obj).f2850a);
    }

    public final int hashCode() {
        return this.f2850a.hashCode();
    }
}
