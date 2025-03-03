package M1;

import B.B;
import E.e;
import H3.M;
import H3.O;
import H3.i0;
import M0.C0129q;
import M0.C0132u;
import M0.I;
import M0.J;
import M0.r;
import P0.l;
import P0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p1.F;
import p1.G;
import p1.o;
import p1.p;
import p1.q;
import p1.x;

public final class h implements o {

    /* renamed from: a  reason: collision with root package name */
    public final l f3077a;

    /* renamed from: b  reason: collision with root package name */
    public final r f3078b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3079c;

    /* renamed from: d  reason: collision with root package name */
    public final P0.r f3080d = new P0.r();
    public byte[] e = z.f3752f;

    /* renamed from: f  reason: collision with root package name */
    public G f3081f;

    /* renamed from: g  reason: collision with root package name */
    public int f3082g;

    /* renamed from: h  reason: collision with root package name */
    public int f3083h;
    public long[] i;

    /* renamed from: j  reason: collision with root package name */
    public long f3084j;

    public h(l lVar, r rVar) {
        this.f3077a = lVar;
        C0129q a8 = rVar.a();
        a8.f2999m = I.o("application/x-media3-cues");
        a8.f2996j = rVar.f3036n;
        a8.f2985H = lVar.y();
        this.f3078b = new r(a8);
        this.f3079c = new ArrayList();
        this.f3083h = 0;
        this.i = z.f3753g;
        this.f3084j = -9223372036854775807L;
    }

    public final void a(long j7, long j8) {
        boolean z;
        int i8 = this.f3083h;
        if (i8 == 0 || i8 == 5) {
            z = false;
        } else {
            z = true;
        }
        l.j(z);
        this.f3084j = j8;
        if (this.f3083h == 2) {
            this.f3083h = 1;
        }
        if (this.f3083h == 4) {
            this.f3083h = 3;
        }
    }

    public final void b(g gVar) {
        l.k(this.f3081f);
        byte[] bArr = gVar.f3076V;
        int length = bArr.length;
        P0.r rVar = this.f3080d;
        rVar.getClass();
        rVar.F(bArr.length, bArr);
        this.f3081f.a(length, rVar);
        this.f3081f.e(gVar.f3075U, 1, length, 0, (F) null);
    }

    public final o c() {
        return this;
    }

    public final int e(p pVar, C0132u uVar) {
        boolean z;
        int i8;
        int i9;
        k kVar;
        int i10;
        int i11 = this.f3083h;
        if (i11 == 0 || i11 == 5) {
            z = false;
        } else {
            z = true;
        }
        l.j(z);
        if (this.f3083h == 1) {
            if (((p1.l) pVar).f14407W != -1) {
                i10 = e.c(((p1.l) pVar).f14407W);
            } else {
                i10 = 1024;
            }
            if (i10 > this.e.length) {
                this.e = new byte[i10];
            }
            this.f3082g = 0;
            this.f3083h = 2;
        }
        int i12 = this.f3083h;
        ArrayList arrayList = this.f3079c;
        if (i12 == 2) {
            byte[] bArr = this.e;
            if (bArr.length == this.f3082g) {
                this.e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.e;
            int i13 = this.f3082g;
            p1.l lVar = (p1.l) pVar;
            int x8 = lVar.x(bArr2, i13, bArr2.length - i13);
            if (x8 != -1) {
                this.f3082g += x8;
            }
            long j7 = lVar.f14407W;
            if ((j7 != -1 && ((long) this.f3082g) == j7) || x8 == -1) {
                try {
                    long j8 = this.f3084j;
                    if (j8 != -9223372036854775807L) {
                        kVar = new k(j8, true);
                    } else {
                        kVar = k.f3087c;
                    }
                    this.f3077a.D(this.e, 0, this.f3082g, kVar, new B(9, this));
                    Collections.sort(arrayList);
                    this.i = new long[arrayList.size()];
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        this.i[i14] = ((g) arrayList.get(i14)).f3075U;
                    }
                    this.e = z.f3752f;
                    this.f3083h = 4;
                } catch (RuntimeException e8) {
                    throw J.a(e8, "SubtitleParser failed.");
                }
            }
        }
        if (this.f3083h == 3) {
            if (((p1.l) pVar).f14407W != -1) {
                i8 = e.c(((p1.l) pVar).f14407W);
            } else {
                i8 = 1024;
            }
            if (((p1.l) pVar).l(i8) == -1) {
                long j9 = this.f3084j;
                if (j9 == -9223372036854775807L) {
                    i9 = 0;
                } else {
                    i9 = z.e(this.i, j9, true);
                }
                while (i9 < arrayList.size()) {
                    b((g) arrayList.get(i9));
                    i9++;
                }
                this.f3083h = 4;
            }
        }
        if (this.f3083h == 4) {
            return -1;
        }
        return 0;
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        return true;
    }

    public final void l(q qVar) {
        boolean z;
        if (this.f3083h == 0) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        G q7 = qVar.q(0, 3);
        this.f3081f = q7;
        q7.c(this.f3078b);
        qVar.g();
        qVar.l(new x(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f3083h = 1;
    }

    public final void release() {
        if (this.f3083h != 5) {
            this.f3077a.a();
            this.f3083h = 5;
        }
    }
}
