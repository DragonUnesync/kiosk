package u2;

import android.support.v4.media.session.b;
import v2.c;

public final class s extends l {

    /* renamed from: V  reason: collision with root package name */
    public static final s f15765V = new l(0);

    public final String a() {
        return Integer.toString(this.f15756U);
    }

    public final String e() {
        return "short";
    }

    public final c getType() {
        return c.f16057h0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("short{0x");
        int i = this.f15756U;
        sb.append(b.P(i));
        sb.append(" / ");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
