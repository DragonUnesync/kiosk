package u2;

import android.support.v4.media.session.b;
import v2.c;

public final class e extends l {

    /* renamed from: V  reason: collision with root package name */
    public static final e f15749V = new l(0);

    public final String a() {
        return Integer.toString(this.f15756U);
    }

    public final String e() {
        return "byte";
    }

    public final c getType() {
        return c.f16051b0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("byte{0x");
        int i = this.f15756U;
        sb.append(b.O(i));
        sb.append(" / ");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
