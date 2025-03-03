package G5;

public final class v implements Comparable {

    /* renamed from: U  reason: collision with root package name */
    public final int f1735U;

    /* renamed from: V  reason: collision with root package name */
    public final int f1736V;

    public v(int i, int i8) {
        this.f1735U = i;
        this.f1736V = i8;
    }

    public final v a(v vVar) {
        int i = vVar.f1736V;
        int i8 = this.f1735U;
        int i9 = i8 * i;
        int i10 = vVar.f1735U;
        int i11 = this.f1736V;
        if (i9 <= i10 * i11) {
            return new v(i10, (i11 * i10) / i8);
        }
        return new v((i8 * i) / i11, i);
    }

    public final v b(v vVar) {
        int i = vVar.f1736V;
        int i8 = this.f1735U;
        int i9 = i8 * i;
        int i10 = vVar.f1735U;
        int i11 = this.f1736V;
        if (i9 >= i10 * i11) {
            return new v(i10, (i11 * i10) / i8);
        }
        return new v((i8 * i) / i11, i);
    }

    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int i = this.f1736V * this.f1735U;
        int i8 = vVar.f1736V * vVar.f1735U;
        if (i8 < i) {
            return 1;
        }
        if (i8 > i) {
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f1735U == vVar.f1735U && this.f1736V == vVar.f1736V) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1735U * 31) + this.f1736V;
    }

    public final String toString() {
        return this.f1735U + "x" + this.f1736V;
    }
}
