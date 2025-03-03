package V1;

import N1.f;
import P0.l;
import P0.r;
import P0.w;
import Q0.g;
import p1.q;

public final class x implements H {

    /* renamed from: a  reason: collision with root package name */
    public final i f5950a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5951b = new f(10, new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    public int f5952c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f5953d;
    public w e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5954f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5955g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5956h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f5957j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5958k;

    /* renamed from: l  reason: collision with root package name */
    public long f5959l;

    public x(i iVar) {
        this.f5950a = iVar;
    }

    public final void a() {
        this.f5952c = 0;
        this.f5953d = 0;
        this.f5956h = false;
        this.f5950a.a();
    }

    public final void b(w wVar, q qVar, G g8) {
        this.e = wVar;
        this.f5950a.h(qVar, g8);
    }

    public final void c(int i8, r rVar) {
        int i9;
        int i10;
        boolean z;
        r rVar2 = rVar;
        l.k(this.e);
        int i11 = i8 & 1;
        i iVar = this.f5950a;
        int i12 = -1;
        int i13 = 3;
        int i14 = 2;
        boolean z6 = false;
        if (i11 != 0) {
            int i15 = this.f5952c;
            if (!(i15 == 0 || i15 == 1)) {
                if (i15 == 2) {
                    l.B("PesReader", "Unexpected start indicator reading extended header");
                } else if (i15 == 3) {
                    if (this.f5957j != -1) {
                        l.B("PesReader", "Unexpected start indicator: expected " + this.f5957j + " more bytes");
                    }
                    if (rVar2.f3734c == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iVar.f(z);
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f5952c = 1;
            this.f5953d = 0;
        }
        int i16 = i8;
        while (rVar.a() > 0) {
            int i17 = this.f5952c;
            if (i17 != 0) {
                f fVar = this.f5951b;
                if (i17 != 1) {
                    if (i17 == i14) {
                        if (d(rVar2, fVar.f3344b, Math.min(10, this.i)) && d(rVar2, (byte[]) null, this.i)) {
                            fVar.r(z6 ? 1 : 0);
                            this.f5959l = -9223372036854775807L;
                            int i18 = 4;
                            if (this.f5954f) {
                                fVar.u(4);
                                fVar.u(1);
                                fVar.u(1);
                                long i19 = (((long) fVar.i(i13)) << 30) | ((long) (fVar.i(15) << 15)) | ((long) fVar.i(15));
                                fVar.u(1);
                                if (!this.f5956h && this.f5955g) {
                                    fVar.u(4);
                                    fVar.u(1);
                                    long i20 = (long) (fVar.i(15) << 15);
                                    fVar.u(1);
                                    fVar.u(1);
                                    this.e.b(i20 | (((long) fVar.i(i13)) << 30) | ((long) fVar.i(15)));
                                    this.f5956h = true;
                                }
                                this.f5959l = this.e.b(i19);
                            }
                            if (!this.f5958k) {
                                i18 = 0;
                            }
                            i16 |= i18;
                            iVar.g(i16, this.f5959l);
                            this.f5952c = 3;
                            this.f5953d = 0;
                        }
                    } else if (i17 == i13) {
                        int a8 = rVar.a();
                        int i21 = this.f5957j;
                        if (i21 == i12) {
                            i10 = 0;
                        } else {
                            i10 = a8 - i21;
                        }
                        if (i10 > 0) {
                            a8 -= i10;
                            rVar2.G(rVar2.f3733b + a8);
                        }
                        iVar.e(rVar2);
                        int i22 = this.f5957j;
                        if (i22 != i12) {
                            int i23 = i22 - a8;
                            this.f5957j = i23;
                            if (i23 == 0) {
                                iVar.f(z6);
                                this.f5952c = 1;
                                this.f5953d = z6;
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (d(rVar2, fVar.f3344b, 9)) {
                    fVar.r(0);
                    int i24 = fVar.i(24);
                    if (i24 != 1) {
                        g.u(i24, "Unexpected start code prefix: ", "PesReader");
                        this.f5957j = -1;
                        i9 = 0;
                    } else {
                        fVar.u(8);
                        int i25 = fVar.i(16);
                        fVar.u(5);
                        this.f5958k = fVar.h();
                        fVar.u(2);
                        this.f5954f = fVar.h();
                        this.f5955g = fVar.h();
                        fVar.u(6);
                        int i26 = fVar.i(8);
                        this.i = i26;
                        if (i25 == 0) {
                            this.f5957j = -1;
                        } else {
                            int i27 = (i25 - 3) - i26;
                            this.f5957j = i27;
                            if (i27 < 0) {
                                l.B("PesReader", "Found negative packet payload size: " + this.f5957j);
                                this.f5957j = -1;
                                i9 = 2;
                            }
                        }
                        i9 = 2;
                    }
                    this.f5952c = i9;
                    this.f5953d = 0;
                }
            } else {
                rVar2.I(rVar.a());
            }
            i12 = -1;
            i13 = 3;
            i14 = 2;
            z6 = false;
        }
    }

    public final boolean d(r rVar, byte[] bArr, int i8) {
        int min = Math.min(rVar.a(), i8 - this.f5953d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            rVar.I(min);
        } else {
            rVar.g(bArr, this.f5953d, min);
        }
        int i9 = this.f5953d + min;
        this.f5953d = i9;
        if (i9 == i8) {
            return true;
        }
        return false;
    }
}
