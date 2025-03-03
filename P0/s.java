package P0;

public final class s {

    /* renamed from: c  reason: collision with root package name */
    public static final s f3735c = new s(-1, -1);

    /* renamed from: a  reason: collision with root package name */
    public final int f3736a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3737b;

    static {
        new s(0, 0);
    }

    public s(int i, int i8) {
        boolean z;
        if ((i == -1 || i >= 0) && (i8 == -1 || i8 >= 0)) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        this.f3736a = i;
        this.f3737b = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f3736a == sVar.f3736a && this.f3737b == sVar.f3737b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f3736a;
        return ((i >>> 16) | (i << 16)) ^ this.f3737b;
    }

    public final String toString() {
        return this.f3736a + "x" + this.f3737b;
    }
}
