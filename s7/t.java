package S7;

import j$.util.Objects;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final int f4589a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4590b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4591c;

    public t(int i, int i8, int i9) {
        this.f4589a = i;
        this.f4590b = i8;
        this.f4591c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f4589a == tVar.f4589a && this.f4590b == tVar.f4590b && this.f4591c == tVar.f4591c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f4589a), Integer.valueOf(this.f4590b), Integer.valueOf(this.f4591c)});
    }

    public final String toString() {
        return this.f4590b + "," + this.f4591c + ":" + this.f4589a;
    }
}
