package J1;

import P0.l;
import P0.z;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final r f2486a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2487b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f2488c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f2489d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f2490f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f2491g;

    /* renamed from: h  reason: collision with root package name */
    public final long f2492h;

    public u(r rVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j7) {
        boolean z;
        boolean z6;
        boolean z8 = false;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        if (jArr.length == jArr2.length) {
            z6 = true;
        } else {
            z6 = false;
        }
        l.d(z6);
        l.d(iArr2.length == jArr2.length ? true : z8);
        this.f2486a = rVar;
        this.f2488c = jArr;
        this.f2489d = iArr;
        this.e = i;
        this.f2490f = jArr2;
        this.f2491g = iArr2;
        this.f2492h = j7;
        this.f2487b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j7) {
        long[] jArr = this.f2490f;
        for (int a8 = z.a(jArr, j7, true); a8 < jArr.length; a8++) {
            if ((this.f2491g[a8] & 1) != 0) {
                return a8;
            }
        }
        return -1;
    }
}
