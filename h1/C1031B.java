package h1;

/* renamed from: h1.B  reason: case insensitive filesystem */
public final class C1031B {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12277a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12278b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12279c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12280d;
    public final int e;

    public C1031B(Object obj) {
        this(obj, -1);
    }

    public final C1031B a(Object obj) {
        if (this.f12277a.equals(obj)) {
            return this;
        }
        return new C1031B(obj, this.f12278b, this.f12279c, this.f12280d, this.e);
    }

    public final boolean b() {
        if (this.f12278b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1031B)) {
            return false;
        }
        C1031B b8 = (C1031B) obj;
        if (this.f12277a.equals(b8.f12277a) && this.f12278b == b8.f12278b && this.f12279c == b8.f12279c && this.f12280d == b8.f12280d && this.e == b8.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f12277a.hashCode() + 527) * 31) + this.f12278b) * 31) + this.f12279c) * 31) + ((int) this.f12280d)) * 31) + this.e;
    }

    public C1031B(Object obj, long j7) {
        this(obj, -1, -1, j7, -1);
    }

    public C1031B(Object obj, long j7, int i) {
        this(obj, -1, -1, j7, i);
    }

    public C1031B(Object obj, int i, int i8, long j7, int i9) {
        this.f12277a = obj;
        this.f12278b = i;
        this.f12279c = i8;
        this.f12280d = j7;
        this.e = i9;
    }
}
