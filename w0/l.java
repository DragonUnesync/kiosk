package W0;

import A1.d;
import M0.r;
import P0.z;
import R2.c;
import S0.f;
import X0.g;
import h1.Y;

public final class l implements Y {

    /* renamed from: U  reason: collision with root package name */
    public final r f6099U;

    /* renamed from: V  reason: collision with root package name */
    public final d f6100V = new d(0);

    /* renamed from: W  reason: collision with root package name */
    public long[] f6101W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f6102X;

    /* renamed from: Y  reason: collision with root package name */
    public g f6103Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f6104Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f6105a0;

    /* renamed from: b0  reason: collision with root package name */
    public long f6106b0 = -9223372036854775807L;

    public l(g gVar, r rVar, boolean z) {
        this.f6099U = rVar;
        this.f6103Y = gVar;
        this.f6101W = gVar.f6240b;
        b(gVar, z);
    }

    public final void a() {
    }

    public final void b(g gVar, boolean z) {
        long j7;
        int i = this.f6105a0;
        long j8 = -9223372036854775807L;
        if (i == 0) {
            j7 = -9223372036854775807L;
        } else {
            j7 = this.f6101W[i - 1];
        }
        this.f6102X = z;
        this.f6103Y = gVar;
        long[] jArr = gVar.f6240b;
        this.f6101W = jArr;
        long j9 = this.f6106b0;
        if (j9 != -9223372036854775807L) {
            int a8 = z.a(jArr, j9, true);
            this.f6105a0 = a8;
            if (this.f6102X && a8 == this.f6101W.length) {
                j8 = j9;
            }
            this.f6106b0 = j8;
        } else if (j7 != -9223372036854775807L) {
            this.f6105a0 = z.a(jArr, j7, false);
        }
    }

    public final boolean g() {
        return true;
    }

    public final int l(c cVar, f fVar, int i) {
        boolean z;
        int i8 = this.f6105a0;
        if (i8 == this.f6101W.length) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.f6102X) {
            fVar.f4018V = 4;
            return -4;
        } else if ((i & 2) != 0 || !this.f6104Z) {
            cVar.f4337W = this.f6099U;
            this.f6104Z = true;
            return -5;
        } else if (z) {
            return -3;
        } else {
            if ((i & 1) == 0) {
                this.f6105a0 = i8 + 1;
            }
            if ((i & 4) == 0) {
                byte[] p3 = this.f6100V.p(this.f6103Y.f6239a[i8]);
                fVar.u(p3.length);
                fVar.f4386Y.put(p3);
            }
            fVar.f4388a0 = this.f6101W[i8];
            fVar.f4018V = 1;
            return -4;
        }
    }

    public final int o(long j7) {
        int max = Math.max(this.f6105a0, z.a(this.f6101W, j7, true));
        int i = max - this.f6105a0;
        this.f6105a0 = max;
        return i;
    }
}
