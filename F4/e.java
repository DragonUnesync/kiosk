package f4;

import e4.C0839a;
import java.lang.reflect.Array;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f11684a;

    static {
        int i;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = 2787;
        f11684a = (float[][]) Array.newInstance(Float.TYPE, iArr);
        for (int i8 = 0; i8 < 2787; i8++) {
            int i9 = C0839a.f11258b[i8];
            int i10 = i9 & 1;
            int i11 = 0;
            while (i11 < 8) {
                float f8 = 0.0f;
                while (true) {
                    i = i9 & 1;
                    if (i != i10) {
                        break;
                    }
                    f8 += 1.0f;
                    i9 >>= 1;
                }
                f11684a[i8][7 - i11] = f8 / 17.0f;
                i11++;
                i10 = i;
            }
        }
    }
}
