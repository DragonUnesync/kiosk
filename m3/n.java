package M3;

import n2.a;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public final float f3164a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3165b;

    public n(float f8, float f9) {
        this.f3164a = f8;
        this.f3165b = f9;
    }

    public static float a(n nVar, n nVar2) {
        return a.y(nVar.f3164a, nVar.f3165b, nVar2.f3164a, nVar2.f3165b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f3164a == nVar.f3164a && this.f3165b == nVar.f3165b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3165b) + (Float.floatToIntBits(this.f3164a) * 31);
    }

    public final String toString() {
        return "(" + this.f3164a + ',' + this.f3165b + ')';
    }
}
