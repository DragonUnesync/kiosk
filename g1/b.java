package g1;

import N1.f;
import N7.a;
import P0.l;
import P0.r;
import P0.z;
import f1.C0896i;
import p1.C1332b;
import p1.C1333c;
import p1.F;
import p1.G;
import p1.q;

public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0896i f11846a;

    /* renamed from: b  reason: collision with root package name */
    public final f f11847b = new f();

    /* renamed from: c  reason: collision with root package name */
    public G f11848c;

    /* renamed from: d  reason: collision with root package name */
    public int f11849d;
    public long e = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    public long f11850f;

    /* renamed from: g  reason: collision with root package name */
    public long f11851g;

    public b(C0896i iVar) {
        this.f11846a = iVar;
    }

    public final void a(long j7, long j8) {
        this.e = j7;
        this.f11851g = j8;
    }

    public final void b(r rVar, long j7, int i, boolean z) {
        r rVar2 = rVar;
        int v4 = rVar.v() & 3;
        int v8 = rVar.v() & 255;
        long x8 = a.x(this.f11851g, j7, this.e, this.f11846a.f11547b);
        if (v4 != 0) {
            if (v4 == 1 || v4 == 2) {
                int i8 = this.f11849d;
                if (i8 > 0) {
                    G g8 = this.f11848c;
                    int i9 = z.f3748a;
                    g8.e(this.f11850f, 1, i8, 0, (F) null);
                    this.f11849d = 0;
                }
            } else if (v4 != 3) {
                throw new IllegalArgumentException(String.valueOf(v4));
            }
            int a8 = rVar.a();
            G g9 = this.f11848c;
            g9.getClass();
            g9.a(a8, rVar2);
            int i10 = this.f11849d + a8;
            this.f11849d = i10;
            this.f11850f = x8;
            if (z && v4 == 3) {
                G g10 = this.f11848c;
                int i11 = z.f3748a;
                g10.e(x8, 1, i10, 0, (F) null);
                this.f11849d = 0;
                return;
            }
            return;
        }
        int i12 = this.f11849d;
        if (i12 > 0) {
            G g11 = this.f11848c;
            int i13 = z.f3748a;
            g11.e(this.f11850f, 1, i12, 0, (F) null);
            this.f11849d = 0;
        }
        if (v8 == 1) {
            int a9 = rVar.a();
            G g12 = this.f11848c;
            g12.getClass();
            g12.a(a9, rVar2);
            G g13 = this.f11848c;
            int i14 = z.f3748a;
            g13.e(x8, 1, a9, 0, (F) null);
            return;
        }
        byte[] bArr = rVar2.f3732a;
        f fVar = this.f11847b;
        fVar.getClass();
        fVar.p(bArr.length, bArr);
        fVar.v(2);
        for (int i15 = 0; i15 < v8; i15++) {
            C1333c n4 = C1332b.n(fVar);
            G g14 = this.f11848c;
            g14.getClass();
            int i16 = n4.f14366d;
            g14.a(i16, rVar2);
            G g15 = this.f11848c;
            int i17 = z.f3748a;
            g15.e(x8, 1, n4.f14366d, 0, (F) null);
            x8 += ((long) (n4.e / n4.f14364b)) * 1000000;
            fVar.v(i16);
        }
    }

    public final void c(long j7) {
        boolean z;
        if (this.e == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        this.e = j7;
    }

    public final void d(q qVar, int i) {
        G q7 = qVar.q(i, 1);
        this.f11848c = q7;
        q7.c(this.f11846a.f11548c);
    }
}
