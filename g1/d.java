package g1;

import M0.C0129q;
import N.e;
import N7.a;
import P0.l;
import P0.r;
import P0.z;
import Q0.g;
import f1.C0894g;
import f1.C0896i;
import java.util.Locale;
import p1.F;
import p1.G;
import p1.q;

public final class d implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11859a;

    /* renamed from: b  reason: collision with root package name */
    public final C0896i f11860b;

    /* renamed from: c  reason: collision with root package name */
    public G f11861c;

    /* renamed from: d  reason: collision with root package name */
    public long f11862d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public int f11863f;

    /* renamed from: g  reason: collision with root package name */
    public int f11864g;

    /* renamed from: h  reason: collision with root package name */
    public long f11865h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f11866j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11867k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11868l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11869m;

    public d(C0896i iVar, int i8) {
        this.f11859a = i8;
        switch (i8) {
            case 1:
                this.f11860b = iVar;
                this.f11862d = -9223372036854775807L;
                this.f11864g = -1;
                this.f11865h = -9223372036854775807L;
                this.e = 0;
                this.f11863f = -1;
                this.i = -1;
                this.f11866j = -1;
                return;
            default:
                this.f11860b = iVar;
                this.f11862d = -9223372036854775807L;
                this.f11864g = -1;
                return;
        }
    }

    public final void a(long j7, long j8) {
        switch (this.f11859a) {
            case 0:
                this.f11862d = j7;
                this.f11863f = 0;
                this.e = j8;
                return;
            default:
                this.f11862d = j7;
                this.f11864g = -1;
                this.e = j8;
                return;
        }
    }

    public final void b(r rVar, long j7, int i8, boolean z) {
        boolean z6;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        boolean z10;
        r rVar2 = rVar;
        int i11 = i8;
        C0896i iVar = this.f11860b;
        switch (this.f11859a) {
            case 0:
                l.k(this.f11861c);
                int i12 = rVar2.f3733b;
                int B8 = rVar.B();
                if ((B8 & 1024) > 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((B8 & 512) == 0 && (B8 & 504) == 0 && (B8 & 7) == 0) {
                    if (z6) {
                        if (this.f11869m && this.f11863f > 0) {
                            G g8 = this.f11861c;
                            g8.getClass();
                            g8.e(this.f11865h, this.f11867k ? 1 : 0, this.f11863f, 0, (F) null);
                            this.f11863f = 0;
                            this.f11865h = -9223372036854775807L;
                            this.f11867k = false;
                            this.f11869m = false;
                        }
                        this.f11869m = true;
                        if ((rVar.f() & 252) < 128) {
                            l.B("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                            return;
                        }
                        byte[] bArr = rVar2.f3732a;
                        bArr[i12] = 0;
                        bArr[i12 + 1] = 0;
                        rVar2.H(i12);
                    } else if (this.f11869m) {
                        int a8 = C0894g.a(this.f11864g);
                        if (i11 < a8) {
                            int i13 = z.f3748a;
                            Locale locale = Locale.US;
                            l.B("RtpH263Reader", e.v("Received RTP packet with unexpected sequence number. Expected: ", a8, "; received: ", i11, ". Dropping packet."));
                            return;
                        }
                    } else {
                        l.B("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        return;
                    }
                    if (this.f11863f == 0) {
                        boolean z11 = this.f11868l;
                        int i14 = rVar2.f3733b;
                        if (((rVar.x() >> 10) & 63) == 32) {
                            int f8 = rVar.f();
                            int i15 = (f8 >> 1) & 1;
                            if (!z11 && i15 == 0) {
                                int i16 = (f8 >> 2) & 7;
                                if (i16 == 1) {
                                    this.i = 128;
                                    this.f11866j = 96;
                                } else {
                                    int i17 = i16 - 2;
                                    this.i = 176 << i17;
                                    this.f11866j = 144 << i17;
                                }
                            }
                            rVar2.H(i14);
                            if (i15 == 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            this.f11867k = z8;
                        } else {
                            rVar2.H(i14);
                            this.f11867k = false;
                        }
                        if (!this.f11868l && this.f11867k) {
                            int i18 = this.i;
                            M0.r rVar3 = iVar.f11548c;
                            if (!(i18 == rVar3.f3043u && this.f11866j == rVar3.f3044v)) {
                                G g9 = this.f11861c;
                                C0129q a9 = rVar3.a();
                                a9.f3006t = this.i;
                                a9.f3007u = this.f11866j;
                                g.v(a9, g9);
                            }
                            this.f11868l = true;
                        }
                    }
                    int a10 = rVar.a();
                    this.f11861c.a(a10, rVar2);
                    this.f11863f += a10;
                    this.f11865h = a.x(this.e, j7, this.f11862d, 90000);
                    if (z) {
                        G g10 = this.f11861c;
                        g10.getClass();
                        g10.e(this.f11865h, this.f11867k ? 1 : 0, this.f11863f, 0, (F) null);
                        this.f11863f = 0;
                        this.f11865h = -9223372036854775807L;
                        this.f11867k = false;
                        this.f11869m = false;
                    }
                    this.f11864g = i11;
                    return;
                }
                l.B("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                return;
            default:
                l.k(this.f11861c);
                int v4 = rVar.v();
                if ((v4 & 8) == 8) {
                    if (this.f11867k && this.f11864g > 0) {
                        G g11 = this.f11861c;
                        g11.getClass();
                        g11.e(this.f11865h, this.f11869m ? 1 : 0, this.f11864g, 0, (F) null);
                        this.f11864g = -1;
                        this.f11865h = -9223372036854775807L;
                        this.f11867k = false;
                    }
                    this.f11867k = true;
                } else if (this.f11867k) {
                    int a11 = C0894g.a(this.f11863f);
                    if (i11 < a11) {
                        int i19 = z.f3748a;
                        Locale locale2 = Locale.US;
                        l.B("RtpVp9Reader", e.v("Received RTP packet with unexpected sequence number. Expected: ", a11, "; received: ", i11, ". Dropping packet."));
                        return;
                    }
                } else {
                    l.B("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                    return;
                }
                if ((v4 & 128) == 0 || (rVar.v() & 128) == 0 || rVar.a() >= 1) {
                    int i20 = v4 & 16;
                    if (i20 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    l.c("VP9 flexible mode is not supported.", z9);
                    if ((v4 & 32) != 0) {
                        rVar2.I(1);
                        if (rVar.a() >= 1) {
                            if (i20 == 0) {
                                rVar2.I(1);
                            }
                        } else {
                            return;
                        }
                    }
                    if ((v4 & 2) != 0) {
                        int v8 = rVar.v();
                        int i21 = (v8 >> 5) & 7;
                        if ((v8 & 16) != 0) {
                            int i22 = i21 + 1;
                            if (rVar.a() >= i22 * 4) {
                                for (int i23 = 0; i23 < i22; i23++) {
                                    this.i = rVar.B();
                                    this.f11866j = rVar.B();
                                }
                            } else {
                                return;
                            }
                        }
                        if ((v8 & 8) != 0) {
                            int v9 = rVar.v();
                            if (rVar.a() >= v9) {
                                int i24 = 0;
                                while (i24 < v9) {
                                    int B9 = (rVar.B() & 12) >> 2;
                                    if (rVar.a() >= B9) {
                                        rVar2.I(B9);
                                        i24++;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    if (this.f11864g == -1 && this.f11867k) {
                        if ((rVar.f() & 4) == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f11869m = z10;
                    }
                    if (!(this.f11868l || (i9 = this.i) == -1 || (i10 = this.f11866j) == -1)) {
                        M0.r rVar4 = iVar.f11548c;
                        if (!(i9 == rVar4.f3043u && i10 == rVar4.f3044v)) {
                            G g12 = this.f11861c;
                            C0129q a12 = rVar4.a();
                            a12.f3006t = this.i;
                            a12.f3007u = this.f11866j;
                            g.v(a12, g12);
                        }
                        this.f11868l = true;
                    }
                    int a13 = rVar.a();
                    this.f11861c.a(a13, rVar2);
                    int i25 = this.f11864g;
                    if (i25 == -1) {
                        this.f11864g = a13;
                    } else {
                        this.f11864g = i25 + a13;
                    }
                    this.f11865h = a.x(this.e, j7, this.f11862d, 90000);
                    if (z) {
                        G g13 = this.f11861c;
                        g13.getClass();
                        g13.e(this.f11865h, this.f11869m ? 1 : 0, this.f11864g, 0, (F) null);
                        this.f11864g = -1;
                        this.f11865h = -9223372036854775807L;
                        this.f11867k = false;
                    }
                    this.f11863f = i11;
                    return;
                }
                return;
        }
    }

    public final void c(long j7) {
        boolean z;
        boolean z6;
        switch (this.f11859a) {
            case 0:
                if (this.f11862d == -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                l.j(z);
                this.f11862d = j7;
                return;
            default:
                if (this.f11862d == -9223372036854775807L) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                l.j(z6);
                this.f11862d = j7;
                return;
        }
    }

    public final void d(q qVar, int i8) {
        switch (this.f11859a) {
            case 0:
                G q7 = qVar.q(i8, 2);
                this.f11861c = q7;
                q7.c(this.f11860b.f11548c);
                return;
            default:
                G q8 = qVar.q(i8, 2);
                this.f11861c = q8;
                q8.c(this.f11860b.f11548c);
                return;
        }
    }
}
