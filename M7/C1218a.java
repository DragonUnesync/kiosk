package m7;

import P6.f;
import W6.a;

/* renamed from: m7.a  reason: case insensitive filesystem */
public abstract class C1218a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f13388a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(a.f6191a);
        f.d(bytes, "this as java.lang.String).getBytes(charset)");
        f13388a = bytes;
    }

    public static final String a(l7.f fVar, long j7) {
        f.e(fVar, "<this>");
        if (j7 > 0) {
            long j8 = j7 - 1;
            if (fVar.l(j8) == 13) {
                String s8 = fVar.s(j8, a.f6191a);
                fVar.t(2);
                return s8;
            }
        }
        String s9 = fVar.s(j7, a.f6191a);
        fVar.t(1);
        return s9;
    }
}
