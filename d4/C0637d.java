package d4;

import I2.b;
import S3.a;

/* renamed from: d4.d  reason: case insensitive filesystem */
public abstract class C0637d extends b {
    public final void j(int i, StringBuilder sb) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        k(sb, i, length);
    }

    public final void k(StringBuilder sb, int i, int i8) {
        int i9 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            int h5 = k.h((i10 * 10) + i, 10, (a) ((k) this.f2258V).f9766V);
            if (h5 / 100 == 0) {
                sb.append('0');
            }
            if (h5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(h5);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 13; i12++) {
            int charAt = sb.charAt(i12 + i8) - '0';
            if ((i12 & 1) == 0) {
                charAt *= 3;
            }
            i11 += charAt;
        }
        int i13 = 10 - (i11 % 10);
        if (i13 != 10) {
            i9 = i13;
        }
        sb.append(i9);
    }
}
