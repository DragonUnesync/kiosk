package d4;

import S3.a;

/* renamed from: d4.e  reason: case insensitive filesystem */
public abstract class C0638e extends C0637d {
    public abstract void l(int i, StringBuilder sb);

    public abstract int m(int i);

    public final void n(StringBuilder sb, int i, int i8) {
        int h5 = k.h(i, i8, (a) ((k) this.f2258V).f9766V);
        l(h5, sb);
        int m8 = m(h5);
        int i9 = 100000;
        for (int i10 = 0; i10 < 5; i10++) {
            if (m8 / i9 == 0) {
                sb.append('0');
            }
            i9 /= 10;
        }
        sb.append(m8);
    }
}
