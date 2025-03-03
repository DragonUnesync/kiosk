package u2;

import android.support.v4.media.session.b;
import v2.c;

public final class g extends m {

    /* renamed from: V  reason: collision with root package name */
    public static final g f15751V = new m(Double.doubleToLongBits(0.0d));

    /* JADX WARNING: type inference failed for: r0v0, types: [u2.g, u2.m] */
    static {
        Double.doubleToLongBits(1.0d);
    }

    public final String a() {
        return Double.toString(Double.longBitsToDouble(this.f15757U));
    }

    public final String e() {
        return "double";
    }

    public final c getType() {
        return c.f16053d0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("double{0x");
        long j7 = this.f15757U;
        sb.append(b.R(j7));
        sb.append(" / ");
        sb.append(Double.longBitsToDouble(j7));
        sb.append('}');
        return sb.toString();
    }
}
