package k1;

/* renamed from: k1.a  reason: case insensitive filesystem */
public final class C1132a {

    /* renamed from: a  reason: collision with root package name */
    public final long f12904a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12905b;

    public C1132a(long j7, long j8) {
        this.f12904a = j7;
        this.f12905b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1132a)) {
            return false;
        }
        C1132a aVar = (C1132a) obj;
        if (this.f12904a == aVar.f12904a && this.f12905b == aVar.f12905b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f12904a) * 31) + ((int) this.f12905b);
    }
}
