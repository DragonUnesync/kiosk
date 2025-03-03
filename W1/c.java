package W1;

import J1.e;
import M0.C0129q;
import M0.I;
import M0.J;
import M0.r;
import P0.z;
import java.math.RoundingMode;
import p1.F;
import p1.G;
import p1.l;
import p1.q;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final q f6134a;

    /* renamed from: b  reason: collision with root package name */
    public final G f6135b;

    /* renamed from: c  reason: collision with root package name */
    public final e f6136c;

    /* renamed from: d  reason: collision with root package name */
    public final r f6137d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public long f6138f;

    /* renamed from: g  reason: collision with root package name */
    public int f6139g;

    /* renamed from: h  reason: collision with root package name */
    public long f6140h;

    public c(q qVar, G g8, e eVar, String str, int i) {
        this.f6134a = qVar;
        this.f6135b = g8;
        this.f6136c = eVar;
        int i8 = eVar.f2357X;
        int i9 = eVar.f2354U;
        int i10 = (i8 * i9) / 8;
        int i11 = eVar.f2356W;
        if (i11 == i10) {
            int i12 = eVar.f2355V;
            int i13 = i12 * i10;
            int i14 = i13 * 8;
            int max = Math.max(i10, i13 / 10);
            this.e = max;
            C0129q qVar2 = new C0129q();
            qVar2.f2999m = I.o(str);
            qVar2.f2995h = i14;
            qVar2.i = i14;
            qVar2.f3000n = max;
            qVar2.f2979B = i9;
            qVar2.f2980C = i12;
            qVar2.f2981D = i;
            this.f6137d = new r(qVar2);
            return;
        }
        throw J.a((RuntimeException) null, "Expected block size: " + i10 + "; got: " + i11);
    }

    public final boolean a(l lVar, long j7) {
        int i;
        int i8;
        int i9;
        long j8 = j7;
        while (true) {
            i = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
            if (i <= 0 || (i8 = this.f6139g) >= (i9 = this.e)) {
                e eVar = this.f6136c;
                int i10 = this.f6139g;
                int i11 = eVar.f2356W;
                int i12 = i10 / i11;
            } else {
                int b8 = this.f6135b.b(lVar, (int) Math.min((long) (i9 - i8), j8), true);
                if (b8 == -1) {
                    j8 = 0;
                } else {
                    this.f6139g += b8;
                    j8 -= (long) b8;
                }
            }
        }
        e eVar2 = this.f6136c;
        int i102 = this.f6139g;
        int i112 = eVar2.f2356W;
        int i122 = i102 / i112;
        if (i122 > 0) {
            long j9 = this.f6138f;
            long j10 = this.f6140h;
            long j11 = (long) eVar2.f2355V;
            int i13 = z.f3748a;
            int i14 = i122 * i112;
            int i15 = this.f6139g - i14;
            this.f6135b.e(j9 + z.W(j10, 1000000, j11, RoundingMode.DOWN), 1, i14, i15, (F) null);
            this.f6140h += (long) i122;
            this.f6139g = i15;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }

    public final void b(int i, long j7) {
        this.f6134a.l(new f(this.f6136c, 1, (long) i, j7));
        this.f6135b.c(this.f6137d);
    }

    public final void c(long j7) {
        this.f6138f = j7;
        this.f6139g = 0;
        this.f6140h = 0;
    }
}
