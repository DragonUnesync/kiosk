package g1;

import M0.J;
import N7.a;
import P0.l;
import P0.r;
import P0.z;
import f1.C0894g;
import f1.C0896i;
import java.util.Locale;
import java.util.TreeMap;
import p1.F;
import p1.G;
import p1.q;

public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11870a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11871b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f11872c;

    /* renamed from: d  reason: collision with root package name */
    public Object f11873d;
    public Object e;

    /* renamed from: f  reason: collision with root package name */
    public int f11874f;

    /* renamed from: g  reason: collision with root package name */
    public long f11875g;

    /* renamed from: h  reason: collision with root package name */
    public int f11876h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public long f11877j;

    public e(String str, String str2, long j7, int i8, int i9, int i10, int[] iArr, TreeMap treeMap) {
        this.f11870a = 2;
        this.f11871b = str;
        this.f11872c = str2;
        this.f11875g = j7;
        this.f11877j = 0;
        this.f11874f = i8;
        this.f11876h = i9;
        this.i = i10;
        this.f11873d = iArr;
        this.e = treeMap;
    }

    private final void e(long j7) {
    }

    private final void f(long j7) {
    }

    public void a(long j7, long j8) {
        switch (this.f11870a) {
            case 0:
                this.f11875g = j7;
                this.i = 0;
                this.f11877j = j8;
                return;
            default:
                this.f11875g = j7;
                this.i = 0;
                this.f11877j = j8;
                return;
        }
    }

    public void b(r rVar, long j7, int i8, boolean z) {
        boolean z6;
        boolean z8;
        int i9;
        int i10;
        boolean z9;
        boolean z10;
        int i11;
        r rVar2 = rVar;
        long j8 = j7;
        int i12 = i8;
        Object obj = this.f11871b;
        int i13 = 1;
        switch (this.f11870a) {
            case 0:
                try {
                    byte b8 = rVar2.f3732a[0] & 31;
                    l.k((G) this.e);
                    if (b8 > 0 && b8 < 24) {
                        int a8 = rVar.a();
                        this.i = g() + this.i;
                        ((G) this.e).a(a8, rVar2);
                        this.i += a8;
                        if ((rVar2.f3732a[0] & 31) == 5) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        this.f11874f = i10;
                    } else if (b8 == 24) {
                        rVar.v();
                        while (rVar.a() > 4) {
                            int B8 = rVar.B();
                            this.i = g() + this.i;
                            ((G) this.e).a(B8, rVar2);
                            this.i += B8;
                        }
                        this.f11874f = 0;
                    } else if (b8 == 28) {
                        byte[] bArr = rVar2.f3732a;
                        byte b9 = bArr[0];
                        byte b10 = bArr[1];
                        byte b11 = (b9 & 224) | (b10 & 31);
                        if ((b10 & 128) > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if ((b10 & 64) > 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        r rVar3 = (r) obj;
                        if (z6) {
                            this.i = g() + this.i;
                            byte[] bArr2 = rVar2.f3732a;
                            bArr2[1] = (byte) b11;
                            rVar3.getClass();
                            rVar3.F(bArr2.length, bArr2);
                            rVar3.H(1);
                        } else {
                            int a9 = C0894g.a(this.f11876h);
                            if (i12 != a9) {
                                int i14 = z.f3748a;
                                Locale locale = Locale.US;
                                l.B("RtpH264Reader", N.e.v("Received RTP packet with unexpected sequence number. Expected: ", a9, "; received: ", i12, ". Dropping packet."));
                            } else {
                                byte[] bArr3 = rVar2.f3732a;
                                rVar3.getClass();
                                rVar3.F(bArr3.length, bArr3);
                                rVar3.H(2);
                            }
                        }
                        int a10 = rVar3.a();
                        ((G) this.e).a(a10, rVar3);
                        this.i += a10;
                        if (z8) {
                            if ((b11 & 31) == 5) {
                                i9 = 1;
                            } else {
                                i9 = 0;
                            }
                            this.f11874f = i9;
                        }
                    } else {
                        throw J.b((Exception) null, String.format("RTP H264 packetization mode [%d] not supported.", new Object[]{Integer.valueOf(b8)}));
                    }
                    if (z) {
                        if (this.f11875g == -9223372036854775807L) {
                            this.f11875g = j8;
                        }
                        ((G) this.e).e(a.x(this.f11877j, j7, this.f11875g, 90000), this.f11874f, this.i, 0, (F) null);
                        this.i = 0;
                    }
                    this.f11876h = i12;
                    return;
                } catch (IndexOutOfBoundsException e8) {
                    throw J.b(e8, (String) null);
                }
            default:
                byte[] bArr4 = rVar2.f3732a;
                if (bArr4.length != 0) {
                    int i15 = (bArr4[0] >> 1) & 63;
                    l.k((G) this.e);
                    r rVar4 = (r) this.f11872c;
                    if (i15 >= 0 && i15 < 48) {
                        int a11 = rVar.a();
                        int i16 = this.i;
                        rVar4.H(0);
                        int a12 = rVar4.a();
                        G g8 = (G) this.e;
                        g8.getClass();
                        g8.a(a12, rVar4);
                        this.i = a12 + i16;
                        ((G) this.e).a(a11, rVar2);
                        this.i += a11;
                        int i17 = (rVar2.f3732a[0] >> 1) & 63;
                        if (!(i17 == 19 || i17 == 20)) {
                            i13 = 0;
                        }
                        this.f11874f = i13;
                    } else if (i15 == 48) {
                        throw new UnsupportedOperationException("need to implement processAggregationPacket");
                    } else if (i15 == 49) {
                        byte[] bArr5 = rVar2.f3732a;
                        if (bArr5.length >= 3) {
                            byte b12 = bArr5[1] & 7;
                            byte b13 = bArr5[2];
                            byte b14 = b13 & 63;
                            if ((b13 & 128) > 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if ((b13 & 64) > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            r rVar5 = (r) obj;
                            if (z9) {
                                int i18 = this.i;
                                rVar4.H(0);
                                int a13 = rVar4.a();
                                G g9 = (G) this.e;
                                g9.getClass();
                                g9.a(a13, rVar4);
                                this.i = a13 + i18;
                                byte[] bArr6 = rVar2.f3732a;
                                bArr6[1] = (byte) ((b14 << 1) & 127);
                                bArr6[2] = (byte) b12;
                                rVar5.getClass();
                                rVar5.F(bArr6.length, bArr6);
                                rVar5.H(1);
                            } else {
                                int i19 = (this.f11876h + 1) % 65535;
                                if (i12 != i19) {
                                    int i20 = z.f3748a;
                                    Locale locale2 = Locale.US;
                                    l.B("RtpH265Reader", N.e.v("Received RTP packet with unexpected sequence number. Expected: ", i19, "; received: ", i12, ". Dropping packet."));
                                } else {
                                    rVar5.getClass();
                                    rVar5.F(bArr5.length, bArr5);
                                    rVar5.H(3);
                                }
                            }
                            int a14 = rVar5.a();
                            ((G) this.e).a(a14, rVar5);
                            this.i += a14;
                            if (z10) {
                                if (b14 == 19 || b14 == 20) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                this.f11874f = i11;
                            }
                        } else {
                            throw J.b((Exception) null, "Malformed FU header.");
                        }
                    } else {
                        throw J.b((Exception) null, String.format("RTP H265 payload type [%d] not supported.", new Object[]{Integer.valueOf(i15)}));
                    }
                    if (z) {
                        if (this.f11875g == -9223372036854775807L) {
                            this.f11875g = j8;
                        }
                        ((G) this.e).e(a.x(this.f11877j, j7, this.f11875g, 90000), this.f11874f, this.i, 0, (F) null);
                        this.i = 0;
                    }
                    this.f11876h = i12;
                    return;
                }
                throw J.b((Exception) null, "Empty RTP data packet.");
        }
    }

    public void c(long j7) {
        int i8 = this.f11870a;
    }

    public void d(q qVar, int i8) {
        switch (this.f11870a) {
            case 0:
                G q7 = qVar.q(i8, 2);
                this.e = q7;
                int i9 = z.f3748a;
                q7.c(((C0896i) this.f11873d).f11548c);
                return;
            default:
                G q8 = qVar.q(i8, 2);
                this.e = q8;
                q8.c(((C0896i) this.f11873d).f11548c);
                return;
        }
    }

    public int g() {
        r rVar = (r) this.f11872c;
        rVar.H(0);
        int a8 = rVar.a();
        G g8 = (G) this.e;
        g8.getClass();
        g8.a(a8, rVar);
        return a8;
    }

    public e(C0896i iVar, int i8) {
        this.f11870a = i8;
        switch (i8) {
            case 1:
                this.f11871b = new r();
                this.f11872c = new r(Q0.q.f4068a);
                this.f11873d = iVar;
                this.f11875g = -9223372036854775807L;
                this.f11876h = -1;
                return;
            default:
                this.f11872c = new r(Q0.q.f4068a);
                this.f11873d = iVar;
                this.f11871b = new r();
                this.f11875g = -9223372036854775807L;
                this.f11876h = -1;
                return;
        }
    }
}
