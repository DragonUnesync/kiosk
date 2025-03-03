package p2;

import B.C0003d;
import D2.j;
import Q7.g;
import android.support.v4.media.session.b;
import s2.C1403a;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f14466a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14467b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14468c;

    /* renamed from: d  reason: collision with root package name */
    public final C0003d f14469d;
    public final boolean e;

    public i(int i, int i8, int i9, C0003d dVar, boolean z) {
        if (!g.w(i)) {
            throw new IllegalArgumentException("bogus opcode");
        } else if (!g.w(i8)) {
            throw new IllegalArgumentException("bogus family");
        } else if (!g.w(i9)) {
            throw new IllegalArgumentException("bogus nextOpcode");
        } else if (dVar != null) {
            this.f14466a = i;
            this.f14467b = i8;
            this.f14468c = i9;
            this.f14469d = dVar;
            this.e = z;
        } else {
            throw new NullPointerException("format == null");
        }
    }

    public final String a() {
        String str;
        int i = this.f14466a;
        try {
            j jVar = C1403a.f15081a[i + 1];
            if (jVar != null) {
                return (String) jVar.f1094V;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (i == ((char) i)) {
            str = b.P(i);
        } else {
            str = b.Q(i);
        }
        throw new IllegalArgumentException("bogus opcode: ".concat(str));
    }

    public final String toString() {
        return a();
    }
}
