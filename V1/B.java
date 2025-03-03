package V1;

import H3.M;
import H3.O;
import H3.i0;
import M0.C0132u;
import N1.f;
import P0.l;
import P0.r;
import P0.w;
import R2.c;
import android.util.SparseArray;
import h1.C1048n;
import java.util.List;
import org.altbeacon.bluetooth.Pdu;
import p1.o;
import p1.p;
import p1.q;
import p1.s;

public final class B implements o {

    /* renamed from: a  reason: collision with root package name */
    public final w f5680a = new w(0);

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray f5681b = new SparseArray();

    /* renamed from: c  reason: collision with root package name */
    public final r f5682c = new r(4096);

    /* renamed from: d  reason: collision with root package name */
    public final z f5683d = new z(0);
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5684f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5685g;

    /* renamed from: h  reason: collision with root package name */
    public long f5686h;
    public y i;

    /* renamed from: j  reason: collision with root package name */
    public q f5687j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5688k;

    public final void a(long j7, long j8) {
        boolean z;
        w wVar = this.f5680a;
        boolean z6 = true;
        if (wVar.e() == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long d8 = wVar.d();
            if (d8 == -9223372036854775807L || d8 == 0 || d8 == j8) {
                z6 = false;
            }
            z = z6;
        }
        if (z) {
            wVar.g(j8);
        }
        y yVar = this.i;
        if (yVar != null) {
            yVar.d(j8);
        }
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.f5681b;
            if (i8 < sparseArray.size()) {
                A a8 = (A) sparseArray.valueAt(i8);
                a8.f5678f = false;
                a8.f5674a.a();
                i8++;
            } else {
                return;
            }
        }
    }

    public final o c() {
        return this;
    }

    public final int e(p pVar, C0132u uVar) {
        long j7;
        long j8;
        long j9;
        i iVar;
        long j10;
        int i8;
        long j11;
        C0132u uVar2 = uVar;
        l.k(this.f5687j);
        long j12 = ((p1.l) pVar).f14407W;
        z zVar = this.f5683d;
        int i9 = (j12 > -1 ? 1 : (j12 == -1 ? 0 : -1));
        if (i9 == 0 || zVar.f5967d) {
            if (!this.f5688k) {
                this.f5688k = true;
                long j13 = zVar.i;
                if (j13 != -9223372036854775807L) {
                    j7 = j12;
                    y yVar = new y(new C1048n(12), new c(zVar.f5965b), j13, j13 + 1, 0, j12, 188, 1000);
                    this.i = yVar;
                    this.f5687j.l(yVar.f5960a);
                } else {
                    j7 = j12;
                    this.f5687j.l(new s(j13));
                }
            } else {
                j7 = j12;
            }
            y yVar2 = this.i;
            if (yVar2 != null && yVar2.f5962c != null) {
                return yVar2.b((p1.l) pVar, uVar2);
            }
            p1.l lVar = (p1.l) pVar;
            lVar.f14410Z = 0;
            if (i9 != 0) {
                j8 = j7 - lVar.s();
            } else {
                j8 = -1;
            }
            if (j8 != -1 && j8 < 4) {
                return -1;
            }
            r rVar = this.f5682c;
            if (!lVar.r(rVar.f3732a, 0, 4, true)) {
                return -1;
            }
            rVar.H(0);
            int i10 = rVar.i();
            if (i10 == 441) {
                return -1;
            }
            if (i10 == 442) {
                lVar.r(rVar.f3732a, 0, 10, false);
                rVar.H(9);
                lVar.m((rVar.v() & 7) + 14);
                return 0;
            } else if (i10 == 443) {
                lVar.r(rVar.f3732a, 0, 2, false);
                rVar.H(0);
                lVar.m(rVar.B() + 6);
                return 0;
            } else if (((i10 & -256) >> 8) != 1) {
                lVar.m(1);
                return 0;
            } else {
                int i11 = i10 & 255;
                SparseArray sparseArray = this.f5681b;
                A a8 = (A) sparseArray.get(i11);
                if (!this.e) {
                    if (a8 == null) {
                        if (i11 == 189) {
                            iVar = new C0343b();
                            this.f5684f = true;
                            this.f5686h = lVar.f14408X;
                        } else if ((i10 & 224) == 192) {
                            iVar = new u((String) null, 0);
                            this.f5684f = true;
                            this.f5686h = lVar.f14408X;
                        } else if ((i10 & 240) == 224) {
                            iVar = new k((c) null);
                            this.f5685g = true;
                            this.f5686h = lVar.f14408X;
                        } else {
                            iVar = null;
                        }
                        if (iVar != null) {
                            iVar.h(this.f5687j, new G(i11, 256));
                            a8 = new A(iVar, this.f5680a);
                            sparseArray.put(i11, a8);
                        }
                    }
                    if (!this.f5684f || !this.f5685g) {
                        j9 = 1048576;
                    } else {
                        j9 = this.f5686h + 8192;
                    }
                    if (lVar.f14408X > j9) {
                        this.e = true;
                        this.f5687j.g();
                    }
                }
                lVar.r(rVar.f3732a, 0, 2, false);
                rVar.H(0);
                int B8 = rVar.B() + 6;
                if (a8 == null) {
                    lVar.m(B8);
                    return 0;
                }
                rVar.E(B8);
                lVar.c(rVar.f3732a, 0, B8, false);
                rVar.H(6);
                f fVar = a8.f5676c;
                rVar.g(fVar.f3344b, 0, 3);
                fVar.r(0);
                fVar.u(8);
                a8.f5677d = fVar.h();
                a8.e = fVar.h();
                fVar.u(6);
                rVar.g(fVar.f3344b, 0, fVar.i(8));
                fVar.r(0);
                a8.f5679g = 0;
                if (a8.f5677d) {
                    fVar.u(4);
                    fVar.u(1);
                    fVar.u(1);
                    long i12 = (((long) fVar.i(3)) << 30) | ((long) (fVar.i(15) << 15)) | ((long) fVar.i(15));
                    fVar.u(1);
                    boolean z = a8.f5678f;
                    w wVar = a8.f5675b;
                    if (!z && a8.e) {
                        fVar.u(4);
                        fVar.u(1);
                        long i13 = (long) (fVar.i(15) << 15);
                        fVar.u(1);
                        fVar.u(1);
                        wVar.b(i13 | (((long) fVar.i(3)) << 30) | ((long) fVar.i(15)));
                        a8.f5678f = true;
                    }
                    a8.f5679g = wVar.b(i12);
                }
                long j14 = a8.f5679g;
                i iVar2 = a8.f5674a;
                iVar2.g(4, j14);
                iVar2.e(rVar);
                iVar2.f(false);
                rVar.G(rVar.f3732a.length);
                return 0;
            }
        } else {
            boolean z6 = zVar.f5968f;
            r rVar2 = zVar.f5966c;
            if (!z6) {
                p1.l lVar2 = (p1.l) pVar;
                long j15 = lVar2.f14407W;
                int min = (int) Math.min(20000, j15);
                long j16 = j15 - ((long) min);
                if (lVar2.f14408X != j16) {
                    uVar2.f3050a = j16;
                } else {
                    rVar2.E(min);
                    lVar2.f14410Z = 0;
                    lVar2.r(rVar2.f3732a, 0, min, false);
                    int i14 = rVar2.f3733b;
                    int i15 = rVar2.f3734c - 4;
                    while (true) {
                        if (i15 < i14) {
                            j11 = -9223372036854775807L;
                            break;
                        }
                        if (z.b(i15, rVar2.f3732a) == 442) {
                            rVar2.H(i15 + 4);
                            j11 = z.c(rVar2);
                            if (j11 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i15--;
                    }
                    zVar.f5970h = j11;
                    zVar.f5968f = true;
                    i8 = 0;
                    return i8;
                }
            } else if (zVar.f5970h == -9223372036854775807L) {
                zVar.a((p1.l) pVar);
                return 0;
            } else if (!zVar.e) {
                p1.l lVar3 = (p1.l) pVar;
                int min2 = (int) Math.min(20000, lVar3.f14407W);
                long j17 = (long) 0;
                if (lVar3.f14408X != j17) {
                    uVar2.f3050a = j17;
                } else {
                    rVar2.E(min2);
                    lVar3.f14410Z = 0;
                    lVar3.r(rVar2.f3732a, 0, min2, false);
                    int i16 = rVar2.f3733b;
                    int i17 = rVar2.f3734c;
                    while (true) {
                        if (i16 >= i17 - 3) {
                            j10 = -9223372036854775807L;
                            break;
                        }
                        if (z.b(i16, rVar2.f3732a) == 442) {
                            rVar2.H(i16 + 4);
                            j10 = z.c(rVar2);
                            if (j10 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i16++;
                    }
                    zVar.f5969g = j10;
                    zVar.e = true;
                    i8 = 0;
                    return i8;
                }
            } else {
                long j18 = zVar.f5969g;
                if (j18 == -9223372036854775807L) {
                    zVar.a((p1.l) pVar);
                    return 0;
                }
                w wVar2 = zVar.f5965b;
                zVar.i = wVar2.c(zVar.f5970h) - wVar2.b(j18);
                zVar.a((p1.l) pVar);
                return 0;
            }
            i8 = 1;
            return i8;
        }
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        byte[] bArr = new byte[14];
        p1.l lVar = (p1.l) pVar;
        lVar.r(bArr, 0, 14, false);
        if (442 != (((bArr[0] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24) | ((bArr[1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((bArr[2] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (bArr[3] & Pdu.MANUFACTURER_DATA_PDU_TYPE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        lVar.b(bArr[13] & 7, false);
        lVar.r(bArr, 0, 3, false);
        if (1 == (((bArr[0] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((bArr[1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (bArr[2] & Pdu.MANUFACTURER_DATA_PDU_TYPE))) {
            return true;
        }
        return false;
    }

    public final void l(q qVar) {
        this.f5687j = qVar;
    }

    public final void release() {
    }
}
