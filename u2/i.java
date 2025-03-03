package u2;

import android.support.v4.media.session.b;
import v2.c;

public final class i extends l {

    /* renamed from: V  reason: collision with root package name */
    public static final i f15752V = new l(Float.floatToIntBits(0.0f));

    /* JADX WARNING: type inference failed for: r1v0, types: [u2.i, u2.l] */
    static {
        Float.floatToIntBits(1.0f);
        Float.floatToIntBits(2.0f);
    }

    public final String a() {
        return Float.toString(Float.intBitsToFloat(this.f15756U));
    }

    public final String e() {
        return "float";
    }

    public final c getType() {
        return c.f16054e0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("float{0x");
        int i = this.f15756U;
        sb.append(b.Q(i));
        sb.append(" / ");
        sb.append(Float.intBitsToFloat(i));
        sb.append('}');
        return sb.toString();
    }
}
