package h1;

import java.util.Arrays;
import java.util.Random;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final Random f12436a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f12437b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f12438c;

    public b0() {
        this(new Random());
    }

    public final b0 a(int i) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i8 = 0;
        while (true) {
            random = this.f12436a;
            iArr = this.f12437b;
            if (i8 >= i) {
                break;
            }
            iArr2[i8] = random.nextInt(iArr.length + 1);
            int i9 = i8 + 1;
            int nextInt = random.nextInt(i9);
            iArr3[i8] = iArr3[nextInt];
            iArr3[nextInt] = i8;
            i8 = i9;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[(iArr.length + i)];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length + i; i12++) {
            if (i10 >= i || i11 != iArr2[i10]) {
                int i13 = i11 + 1;
                int i14 = iArr[i11];
                iArr4[i12] = i14;
                if (i14 >= 0) {
                    iArr4[i12] = i14 + i;
                }
                i11 = i13;
            } else {
                iArr4[i12] = iArr3[i10];
                i10++;
            }
        }
        return new b0(iArr4, new Random(random.nextLong()));
    }

    public b0(int[] iArr, Random random) {
        this.f12437b = iArr;
        this.f12436a = random;
        this.f12438c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f12438c[iArr[i]] = i;
        }
    }

    public b0(Random random) {
        this(new int[0], random);
    }
}
