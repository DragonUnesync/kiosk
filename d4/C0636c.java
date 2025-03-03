package d4;

import M3.h;
import S3.a;

/* renamed from: d4.c  reason: case insensitive filesystem */
public final class C0636c extends C0638e {

    /* renamed from: W  reason: collision with root package name */
    public final String f9752W;

    /* renamed from: X  reason: collision with root package name */
    public final String f9753X;

    public C0636c(a aVar, String str, String str2) {
        super(aVar);
        this.f9752W = str2;
        this.f9753X = str;
    }

    public final String h() {
        if (((a) this.f2257U).f4504V == 84) {
            StringBuilder sb = new StringBuilder();
            j(8, sb);
            n(sb, 48, 20);
            int h5 = k.h(68, 16, (a) ((k) this.f2258V).f9766V);
            if (h5 != 38400) {
                sb.append('(');
                sb.append(this.f9752W);
                sb.append(')');
                int i = h5 % 32;
                int i8 = h5 / 32;
                int i9 = (i8 % 12) + 1;
                int i10 = i8 / 12;
                if (i10 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i10);
                if (i9 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i9);
                if (i / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i);
            }
            return sb.toString();
        }
        throw h.f3144W;
    }

    public final void l(int i, StringBuilder sb) {
        sb.append('(');
        sb.append(this.f9753X);
        sb.append(i / 100000);
        sb.append(')');
    }

    public final int m(int i) {
        return i % 100000;
    }
}
