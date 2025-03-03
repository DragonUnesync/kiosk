package p1;

import N.e;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final C1330A f14450a;

    /* renamed from: b  reason: collision with root package name */
    public final C1330A f14451b;

    public y(C1330A a8, C1330A a9) {
        this.f14450a = a8;
        this.f14451b = a9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        if (!this.f14450a.equals(yVar.f14450a) || !this.f14451b.equals(yVar.f14451b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14451b.hashCode() + (this.f14450a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C1330A a8 = this.f14450a;
        sb.append(a8);
        C1330A a9 = this.f14451b;
        if (a8.equals(a9)) {
            str = "";
        } else {
            str = ", " + a9;
        }
        return e.A(sb, str, "]");
    }
}
