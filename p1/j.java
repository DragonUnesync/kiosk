package p1;

import P0.z;
import java.util.Arrays;

public final class j implements z {

    /* renamed from: a  reason: collision with root package name */
    public final int f14394a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f14395b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f14396c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f14397d;
    public final long[] e;

    /* renamed from: f  reason: collision with root package name */
    public final long f14398f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f14395b = iArr;
        this.f14396c = jArr;
        this.f14397d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f14394a = length;
        if (length > 0) {
            this.f14398f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f14398f = 0;
        }
    }

    public final boolean g() {
        return true;
    }

    public final y i(long j7) {
        long[] jArr = this.e;
        int e8 = z.e(jArr, j7, true);
        long j8 = jArr[e8];
        long[] jArr2 = this.f14396c;
        C1330A a8 = new C1330A(j8, jArr2[e8]);
        if (j8 >= j7 || e8 == this.f14394a - 1) {
            return new y(a8, a8);
        }
        int i = e8 + 1;
        return new y(a8, new C1330A(jArr[i], jArr2[i]));
    }

    public final long k() {
        return this.f14398f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f14394a + ", sizes=" + Arrays.toString(this.f14395b) + ", offsets=" + Arrays.toString(this.f14396c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.f14397d) + ")";
    }
}
