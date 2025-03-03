package r1;

import P0.l;
import P0.z;
import p1.C1330A;
import p1.G;
import p1.y;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final G f14835a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14836b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14837c;

    /* renamed from: d  reason: collision with root package name */
    public final long f14838d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public int f14839f;

    /* renamed from: g  reason: collision with root package name */
    public int f14840g;

    /* renamed from: h  reason: collision with root package name */
    public int f14841h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f14842j;

    /* renamed from: k  reason: collision with root package name */
    public long f14843k;

    /* renamed from: l  reason: collision with root package name */
    public long[] f14844l;

    /* renamed from: m  reason: collision with root package name */
    public int[] f14845m;

    public e(int i8, int i9, long j7, int i10, G g8) {
        int i11;
        int i12;
        boolean z = true;
        if (!(i9 == 1 || i9 == 2)) {
            z = false;
        }
        l.d(z);
        this.f14838d = j7;
        this.e = i10;
        this.f14835a = g8;
        if (i9 == 2) {
            i11 = 1667497984;
        } else {
            i11 = 1651965952;
        }
        int i13 = (((i8 % 10) + 48) << 8) | ((i8 / 10) + 48);
        this.f14836b = i11 | i13;
        if (i9 == 2) {
            i12 = i13 | 1650720768;
        } else {
            i12 = -1;
        }
        this.f14837c = i12;
        this.f14843k = -1;
        this.f14844l = new long[512];
        this.f14845m = new int[512];
    }

    public final C1330A a(int i8) {
        return new C1330A(((this.f14838d * ((long) 1)) / ((long) this.e)) * ((long) this.f14845m[i8]), this.f14844l[i8]);
    }

    public final y b(long j7) {
        if (this.f14842j == 0) {
            C1330A a8 = new C1330A(0, this.f14843k);
            return new y(a8, a8);
        }
        int i8 = (int) (j7 / ((this.f14838d * ((long) 1)) / ((long) this.e)));
        int d8 = z.d(this.f14845m, i8, true, true);
        if (this.f14845m[d8] == i8) {
            C1330A a9 = a(d8);
            return new y(a9, a9);
        }
        C1330A a10 = a(d8);
        int i9 = d8 + 1;
        if (i9 < this.f14844l.length) {
            return new y(a10, a(i9));
        }
        return new y(a10, a10);
    }
}
