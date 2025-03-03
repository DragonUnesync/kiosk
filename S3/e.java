package S3;

import M3.f;
import M3.h;

public final class e {
    public static final byte[] e = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final f f4520a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f4521b = e;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f4522c = new int[32];

    /* renamed from: d  reason: collision with root package name */
    public b f4523d;

    public e(f fVar) {
        this.f4520a = fVar;
    }

    public static int a(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (i11 > i) {
                i9 = i10;
                i = i11;
            }
            if (i11 > i8) {
                i8 = i11;
            }
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = i14 - i9;
            int i16 = iArr[i14] * i15 * i15;
            if (i16 > i13) {
                i12 = i14;
                i13 = i16;
            }
        }
        if (i9 <= i12) {
            int i17 = i9;
            i9 = i12;
            i12 = i17;
        }
        if (i9 - i12 > length / 16) {
            int i18 = i9 - 1;
            int i19 = i18;
            int i20 = -1;
            while (i18 > i12) {
                int i21 = i18 - i12;
                int i22 = (i8 - iArr[i18]) * (i9 - i18) * i21 * i21;
                if (i22 > i20) {
                    i19 = i18;
                    i20 = i22;
                }
                i18--;
            }
            return i19 << 3;
        }
        throw h.f3144W;
    }
}
