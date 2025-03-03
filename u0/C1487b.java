package u0;

import j$.util.Objects;

/* renamed from: u0.b  reason: case insensitive filesystem */
public final class C1487b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15731a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15732b;

    public C1487b(Object obj, Object obj2) {
        this.f15731a = obj;
        this.f15732b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1487b)) {
            return false;
        }
        C1487b bVar = (C1487b) obj;
        if (!Objects.equals(bVar.f15731a, this.f15731a) || !Objects.equals(bVar.f15732b, this.f15732b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i8 = 0;
        Object obj = this.f15731a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        Object obj2 = this.f15732b;
        if (obj2 != null) {
            i8 = obj2.hashCode();
        }
        return i8 ^ i;
    }

    public final String toString() {
        return "Pair{" + this.f15731a + " " + this.f15732b + "}";
    }
}
