package u2;

import android.support.v4.media.session.b;
import v2.c;

public final class j extends l {

    /* renamed from: V  reason: collision with root package name */
    public static final j[] f15753V = new j[511];

    /* renamed from: W  reason: collision with root package name */
    public static final j f15754W = i(0);

    static {
        i(-1);
        i(1);
        i(2);
        i(3);
        i(4);
        i(5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: u2.j[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: u2.j} */
    /* JADX WARNING: type inference failed for: r2v2, types: [u2.j, u2.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static u2.j i(int r4) {
        /*
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r4
            u2.j[] r1 = f15753V
            int r2 = r1.length
            int r0 = r0 % r2
            r2 = r1[r0]
            if (r2 == 0) goto L_0x0011
            int r3 = r2.f15756U
            if (r3 != r4) goto L_0x0011
            return r2
        L_0x0011:
            u2.j r2 = new u2.j
            r2.<init>(r4)
            r1[r0] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.j.i(int):u2.j");
    }

    public final String a() {
        return Integer.toString(this.f15756U);
    }

    public final String e() {
        return "int";
    }

    public final c getType() {
        return c.f16055f0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("int{0x");
        int i = this.f15756U;
        sb.append(b.Q(i));
        sb.append(" / ");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
