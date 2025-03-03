package p1;

import Q0.g;

/* renamed from: p1.A  reason: case insensitive filesystem */
public final class C1330A {

    /* renamed from: c  reason: collision with root package name */
    public static final C1330A f14318c = new C1330A(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f14319a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14320b;

    public C1330A(long j7, long j8) {
        this.f14319a = j7;
        this.f14320b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1330A.class != obj.getClass()) {
            return false;
        }
        C1330A a8 = (C1330A) obj;
        if (this.f14319a == a8.f14319a && this.f14320b == a8.f14320b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14319a) * 31) + ((int) this.f14320b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f14319a);
        sb.append(", position=");
        return g.o(sb, this.f14320b, "]");
    }
}
