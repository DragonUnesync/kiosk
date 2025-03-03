package I1;

import P0.z;
import p1.C1330A;
import p1.y;

public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f2245a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f2246b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2247c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2248d;
    public final int e;

    public g(long[] jArr, long[] jArr2, long j7, long j8, int i) {
        this.f2245a = jArr;
        this.f2246b = jArr2;
        this.f2247c = j7;
        this.f2248d = j8;
        this.e = i;
    }

    public final long b(long j7) {
        return this.f2245a[z.e(this.f2246b, j7, true)];
    }

    public final long d() {
        return this.f2248d;
    }

    public final boolean g() {
        return true;
    }

    public final y i(long j7) {
        long[] jArr = this.f2245a;
        int e8 = z.e(jArr, j7, true);
        long j8 = jArr[e8];
        long[] jArr2 = this.f2246b;
        C1330A a8 = new C1330A(j8, jArr2[e8]);
        if (j8 >= j7 || e8 == jArr.length - 1) {
            return new y(a8, a8);
        }
        int i = e8 + 1;
        return new y(a8, new C1330A(jArr[i], jArr2[i]));
    }

    public final int j() {
        return this.e;
    }

    public final long k() {
        return this.f2247c;
    }
}
