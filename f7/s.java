package f7;

import B.C0003d;
import N.e;
import P6.f;
import Q0.g;
import T6.a;
import Z6.b;
import b7.C0597c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import l7.i;
import l7.q;
import org.altbeacon.bluetooth.Pdu;
import u.C1477r;

public final class s implements Closeable {

    /* renamed from: X  reason: collision with root package name */
    public static final Logger f11775X;

    /* renamed from: U  reason: collision with root package name */
    public final q f11776U;

    /* renamed from: V  reason: collision with root package name */
    public final r f11777V;

    /* renamed from: W  reason: collision with root package name */
    public final c f11778W;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        f.d(logger, "getLogger(Http2::class.java.name)");
        f11775X = logger;
    }

    public s(q qVar) {
        f.e(qVar, "source");
        this.f11776U = qVar;
        r rVar = new r(qVar);
        this.f11777V = rVar;
        this.f11778W = new c(rVar);
    }

    public final void close() {
        this.f11776U.close();
    }

    public final boolean k(boolean z, k kVar) {
        int p3;
        String str;
        k kVar2 = kVar;
        int i = 0;
        f.e(kVar2, "handler");
        try {
            this.f11776U.u(9);
            int r8 = b.r(this.f11776U);
            if (r8 <= 16384) {
                byte m8 = this.f11776U.m() & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                byte m9 = this.f11776U.m();
                byte b8 = m9 & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                int p8 = this.f11776U.p();
                int i8 = Integer.MAX_VALUE & p8;
                Logger logger = f11775X;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(f.a(i8, r8, m8, b8, true));
                }
                if (!z || m8 == 4) {
                    switch (m8) {
                        case 0:
                            l(kVar2, r8, b8, i8);
                            break;
                        case 1:
                            o(kVar2, r8, b8, i8);
                            break;
                        case 2:
                            if (r8 != 5) {
                                throw new IOException(C1477r.c(r8, "TYPE_PRIORITY length: ", " != 5"));
                            } else if (i8 != 0) {
                                q qVar = this.f11776U;
                                qVar.p();
                                qVar.m();
                                break;
                            } else {
                                throw new IOException("TYPE_PRIORITY streamId == 0");
                            }
                        case 3:
                            if (r8 != 4) {
                                throw new IOException(C1477r.c(r8, "TYPE_RST_STREAM length: ", " != 4"));
                            } else if (i8 != 0) {
                                int p9 = this.f11776U.p();
                                int[] k8 = C1477r.k(14);
                                int length = k8.length;
                                int i9 = 0;
                                while (true) {
                                    if (i9 < length) {
                                        int i10 = k8[i9];
                                        if (C1477r.h(i10) == p9) {
                                            i = i10;
                                        } else {
                                            i9++;
                                        }
                                    }
                                }
                                if (i != 0) {
                                    o oVar = kVar2.f11729V;
                                    oVar.getClass();
                                    if (i8 != 0 && (p8 & 1) == 0) {
                                        oVar.f11746c0.c(new j(oVar.f11740W + '[' + i8 + "] onReset", oVar, i8, i, 1), 0);
                                        break;
                                    } else {
                                        w n4 = oVar.n(i8);
                                        if (n4 != null) {
                                            n4.k(i);
                                            break;
                                        }
                                    }
                                } else {
                                    throw new IOException(g.m(p9, "TYPE_RST_STREAM unexpected error code: "));
                                }
                            } else {
                                throw new IOException("TYPE_RST_STREAM streamId == 0");
                            }
                            break;
                        case 4:
                            if (i8 != 0) {
                                throw new IOException("TYPE_SETTINGS streamId != 0");
                            } else if ((m9 & 1) != 0) {
                                if (r8 != 0) {
                                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                }
                            } else if (r8 % 6 == 0) {
                                C0936A a8 = new C0936A();
                                a L8 = C0003d.L(C0003d.Q(0, r8), 6);
                                int i11 = L8.f5006U;
                                int i12 = L8.f5007V;
                                int i13 = L8.f5008W;
                                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                                    while (true) {
                                        q qVar2 = this.f11776U;
                                        short r9 = qVar2.r();
                                        byte[] bArr = b.f6982a;
                                        short s8 = r9 & 65535;
                                        p3 = qVar2.p();
                                        if (s8 != 2) {
                                            if (s8 == 3) {
                                                s8 = 4;
                                            } else if (s8 != 4) {
                                                if (s8 == 5 && (p3 < 16384 || p3 > 16777215)) {
                                                }
                                            } else if (p3 >= 0) {
                                                s8 = 7;
                                            } else {
                                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                            }
                                        } else if (!(p3 == 0 || p3 == 1)) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        a8.c(s8, p3);
                                        if (i11 != i12) {
                                            i11 += i13;
                                        }
                                    }
                                    throw new IOException(g.m(p3, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                }
                                o oVar2 = kVar2.f11729V;
                                oVar2.f11745b0.c(new i(e.A(new StringBuilder(), oVar2.f11740W, " applyAndAckSettings"), kVar2, a8, 2), 0);
                                break;
                            } else {
                                throw new IOException(g.m(r8, "TYPE_SETTINGS length % 6 != 0: "));
                            }
                            break;
                        case 5:
                            q(kVar2, r8, b8, i8);
                            break;
                        case 6:
                            p(kVar2, r8, b8, i8);
                            break;
                        case 7:
                            m(kVar2, r8, i8);
                            break;
                        case 8:
                            if (r8 == 4) {
                                long p10 = ((long) this.f11776U.p()) & 2147483647L;
                                int i14 = (p10 > 0 ? 1 : (p10 == 0 ? 0 : -1));
                                if (i14 != 0) {
                                    if (i8 != 0) {
                                        w l8 = kVar2.f11729V.l(i8);
                                        if (l8 != null) {
                                            synchronized (l8) {
                                                l8.f11794f += p10;
                                                if (i14 > 0) {
                                                    l8.notifyAll();
                                                }
                                                break;
                                            }
                                        }
                                    } else {
                                        o oVar3 = kVar2.f11729V;
                                        synchronized (oVar3) {
                                            oVar3.f11758o0 += p10;
                                            oVar3.notifyAll();
                                            break;
                                        }
                                    }
                                } else {
                                    throw new IOException("windowSizeIncrement was 0");
                                }
                            } else {
                                throw new IOException(g.m(r8, "TYPE_WINDOW_UPDATE length !=4: "));
                            }
                            break;
                        default:
                            this.f11776U.v((long) r8);
                            break;
                    }
                    return true;
                }
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = f.f11719b;
                if (m8 < strArr.length) {
                    str = strArr[m8];
                } else {
                    str = b.h("0x%02x", Integer.valueOf(m8));
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            throw new IOException(g.m(r8, "FRAME_SIZE_ERROR: "));
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [l7.f, java.lang.Object] */
    public final void l(k kVar, int i, int i8, int i9) {
        boolean z;
        byte b8;
        int i10;
        boolean z6;
        w wVar;
        boolean z8;
        boolean z9;
        boolean z10;
        k kVar2 = kVar;
        int i11 = i8;
        int i12 = i9;
        if (i12 != 0) {
            if ((i11 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i11 & 32) == 0) {
                if ((i11 & 8) != 0) {
                    byte m8 = this.f11776U.m();
                    byte[] bArr = b.f6982a;
                    b8 = m8 & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                    i10 = i;
                } else {
                    i10 = i;
                    b8 = 0;
                }
                int a8 = q.a(i10, i11, b8);
                q qVar = this.f11776U;
                kVar.getClass();
                f.e(qVar, "source");
                kVar2.f11729V.getClass();
                if (i12 == 0 || (i12 & 1) != 0) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                long j7 = 0;
                if (z6) {
                    o oVar = kVar2.f11729V;
                    oVar.getClass();
                    ? obj = new Object();
                    long j8 = (long) a8;
                    qVar.u(j8);
                    qVar.f(obj, j8);
                    oVar.f11746c0.c(new l(oVar.f11740W + '[' + i12 + "] onData", oVar, i9, obj, a8, z), 0);
                } else {
                    w l8 = kVar2.f11729V.l(i12);
                    if (l8 == null) {
                        kVar2.f11729V.r(i12, 2);
                        long j9 = (long) a8;
                        kVar2.f11729V.p(j9);
                        qVar.v(j9);
                    } else {
                        byte[] bArr2 = b.f6982a;
                        u uVar = l8.i;
                        long j10 = (long) a8;
                        uVar.getClass();
                        long j11 = j10;
                        while (true) {
                            if (j11 <= j7) {
                                wVar = l8;
                                uVar.k(j10);
                                break;
                            }
                            synchronized (uVar.f11788Z) {
                                z8 = uVar.f11784V;
                                wVar = l8;
                                if (uVar.f11786X.f13216V + j11 > uVar.f11783U) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                            }
                            if (z9) {
                                qVar.v(j11);
                                uVar.f11788Z.e(4);
                                break;
                            } else if (z8) {
                                qVar.v(j11);
                                break;
                            } else {
                                long f8 = qVar.f(uVar.f11785W, j11);
                                if (f8 != -1) {
                                    j11 -= f8;
                                    w wVar2 = uVar.f11788Z;
                                    synchronized (wVar2) {
                                        try {
                                            if (uVar.f11787Y) {
                                                l7.f fVar = uVar.f11785W;
                                                fVar.t(fVar.f13216V);
                                                j7 = 0;
                                            } else {
                                                l7.f fVar2 = uVar.f11786X;
                                                j7 = 0;
                                                if (fVar2.f13216V == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                fVar2.y(uVar.f11785W);
                                                if (z10) {
                                                    wVar2.notifyAll();
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    l8 = wVar;
                                } else {
                                    throw new EOFException();
                                }
                            }
                        }
                        if (z) {
                            wVar.j(b.f6983b, true);
                        }
                    }
                }
                this.f11776U.v((long) b8);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    public final void m(k kVar, int i, int i8) {
        int i9;
        Object[] array;
        if (i < 8) {
            throw new IOException(g.m(i, "TYPE_GOAWAY length < 8: "));
        } else if (i8 == 0) {
            int p3 = this.f11776U.p();
            int p8 = this.f11776U.p();
            int i10 = i - 8;
            int[] k8 = C1477r.k(14);
            int length = k8.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i9 = 0;
                    break;
                }
                i9 = k8[i11];
                if (C1477r.h(i9) == p8) {
                    break;
                }
                i11++;
            }
            if (i9 != 0) {
                i iVar = i.f13217X;
                if (i10 > 0) {
                    iVar = this.f11776U.n((long) i10);
                }
                kVar.getClass();
                f.e(iVar, "debugData");
                iVar.a();
                o oVar = kVar.f11729V;
                synchronized (oVar) {
                    array = oVar.f11739V.values().toArray(new w[0]);
                    oVar.f11743Z = true;
                }
                for (w wVar : (w[]) array) {
                    if (wVar.f11790a > p3 && wVar.h()) {
                        wVar.k(8);
                        kVar.f11729V.n(wVar.f11790a);
                    }
                }
                return;
            }
            throw new IOException(g.m(p8, "TYPE_GOAWAY unexpected error code: "));
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        throw new java.io.IOException(Q0.g.m(r7, "Header index too large "));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List n(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 32
            r1 = 64
            r2 = 128(0x80, float:1.794E-43)
            f7.r r3 = r5.f11777V
            r3.f11773Y = r6
            r3.f11770V = r6
            r3.f11774Z = r7
            r3.f11771W = r8
            r3.f11772X = r9
        L_0x0012:
            f7.c r6 = r5.f11778W
            l7.q r7 = r6.f11705c
            boolean r8 = r7.k()
            java.util.ArrayList r9 = r6.f11704b
            if (r8 != 0) goto L_0x0125
            byte r7 = r7.m()
            byte[] r8 = Z6.b.f6982a
            r8 = r7 & 255(0xff, float:3.57E-43)
            if (r8 == r2) goto L_0x011d
            r3 = r7 & 128(0x80, float:1.794E-43)
            if (r3 != r2) goto L_0x0068
            r7 = 127(0x7f, float:1.78E-43)
            int r7 = r6.e(r8, r7)
            int r8 = r7 + -1
            if (r8 < 0) goto L_0x0043
            f7.b[] r3 = f7.e.f11716a
            int r4 = r3.length
            int r4 = r4 + -1
            if (r8 > r4) goto L_0x0043
            r6 = r3[r8]
            r9.add(r6)
            goto L_0x0012
        L_0x0043:
            f7.b[] r3 = f7.e.f11716a
            int r3 = r3.length
            int r8 = r8 - r3
            int r3 = r6.e
            int r3 = r3 + 1
            int r3 = r3 + r8
            if (r3 < 0) goto L_0x005c
            f7.b[] r6 = r6.f11706d
            int r8 = r6.length
            if (r3 >= r8) goto L_0x005c
            r6 = r6[r3]
            P6.f.b(r6)
            r9.add(r6)
            goto L_0x0012
        L_0x005c:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r8 = "Header index too large "
            java.lang.String r7 = Q0.g.m(r7, r8)
            r6.<init>(r7)
            throw r6
        L_0x0068:
            if (r8 != r1) goto L_0x0080
            f7.b[] r7 = f7.e.f11716a
            l7.i r7 = r6.d()
            f7.e.a(r7)
            l7.i r8 = r6.d()
            f7.b r9 = new f7.b
            r9.<init>((l7.i) r7, (l7.i) r8)
            r6.c(r9)
            goto L_0x0012
        L_0x0080:
            r3 = r7 & 64
            if (r3 != r1) goto L_0x009e
            r7 = 63
            int r7 = r6.e(r8, r7)
            int r7 = r7 + -1
            l7.i r7 = r6.b(r7)
            l7.i r8 = r6.d()
            f7.b r9 = new f7.b
            r9.<init>((l7.i) r7, (l7.i) r8)
            r6.c(r9)
            goto L_0x0012
        L_0x009e:
            r7 = r7 & r0
            if (r7 != r0) goto L_0x00e5
            r7 = 31
            int r7 = r6.e(r8, r7)
            r6.f11703a = r7
            if (r7 < 0) goto L_0x00cf
            r8 = 4096(0x1000, float:5.74E-42)
            if (r7 > r8) goto L_0x00cf
            int r8 = r6.f11708g
            if (r7 >= r8) goto L_0x0012
            if (r7 != 0) goto L_0x00c9
            f7.b[] r7 = r6.f11706d
            int r8 = r7.length
            r9 = 0
            D6.h.F(r9, r8, r7)
            f7.b[] r7 = r6.f11706d
            int r7 = r7.length
            int r7 = r7 + -1
            r6.e = r7
            r6.f11707f = r9
            r6.f11708g = r9
            goto L_0x0012
        L_0x00c9:
            int r8 = r8 - r7
            r6.a(r8)
            goto L_0x0012
        L_0x00cf:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Invalid dynamic table size update "
            r8.<init>(r9)
            int r6 = r6.f11703a
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L_0x00e5:
            r7 = 16
            if (r8 == r7) goto L_0x0106
            if (r8 != 0) goto L_0x00ec
            goto L_0x0106
        L_0x00ec:
            r7 = 15
            int r7 = r6.e(r8, r7)
            int r7 = r7 + -1
            l7.i r7 = r6.b(r7)
            l7.i r6 = r6.d()
            f7.b r8 = new f7.b
            r8.<init>((l7.i) r7, (l7.i) r6)
            r9.add(r8)
            goto L_0x0012
        L_0x0106:
            f7.b[] r7 = f7.e.f11716a
            l7.i r7 = r6.d()
            f7.e.a(r7)
            l7.i r6 = r6.d()
            f7.b r8 = new f7.b
            r8.<init>((l7.i) r7, (l7.i) r6)
            r9.add(r8)
            goto L_0x0012
        L_0x011d:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "index == 0"
            r6.<init>(r7)
            throw r6
        L_0x0125:
            java.util.List r6 = D6.i.U(r9)
            r9.clear()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.s.n(int, int, int, int):java.util.List");
    }

    public final void o(k kVar, int i, int i8, int i9) {
        boolean z;
        byte b8;
        if (i9 != 0) {
            boolean z6 = false;
            if ((i8 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i8 & 8) != 0) {
                byte m8 = this.f11776U.m();
                byte[] bArr = b.f6982a;
                b8 = m8 & Pdu.MANUFACTURER_DATA_PDU_TYPE;
            } else {
                b8 = 0;
            }
            if ((i8 & 32) != 0) {
                q qVar = this.f11776U;
                qVar.p();
                qVar.m();
                byte[] bArr2 = b.f6982a;
                kVar.getClass();
                i -= 5;
            }
            List n4 = n(q.a(i, i8, b8), b8, i8, i9);
            kVar.getClass();
            kVar.f11729V.getClass();
            if (i9 != 0 && (i9 & 1) == 0) {
                z6 = true;
            }
            if (z6) {
                o oVar = kVar.f11729V;
                oVar.getClass();
                oVar.f11746c0.c(new m(oVar.f11740W + '[' + i9 + "] onHeaders", oVar, i9, n4, z), 0);
                return;
            }
            o oVar2 = kVar.f11729V;
            synchronized (oVar2) {
                w l8 = oVar2.l(i9);
                if (l8 != null) {
                    l8.j(b.t(n4), z);
                } else if (!oVar2.f11743Z) {
                    if (i9 > oVar2.f11741X) {
                        if (i9 % 2 != oVar2.f11742Y % 2) {
                            w wVar = new w(i9, oVar2, false, z, b.t(n4));
                            oVar2.f11741X = i9;
                            oVar2.f11739V.put(Integer.valueOf(i9), wVar);
                            oVar2.f11744a0.e().c(new i(oVar2.f11740W + '[' + i9 + "] onStream", oVar2, wVar, 1), 0);
                        }
                    }
                }
            }
        } else {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
    }

    public final void p(k kVar, int i, int i8, int i9) {
        if (i != 8) {
            throw new IOException(g.m(i, "TYPE_PING length != 8: "));
        } else if (i9 == 0) {
            int p3 = this.f11776U.p();
            int p8 = this.f11776U.p();
            if ((i8 & 1) != 0) {
                o oVar = kVar.f11729V;
                synchronized (oVar) {
                    if (p3 == 1) {
                        oVar.f11749f0++;
                    } else if (p3 == 2) {
                        oVar.f11751h0++;
                    } else if (p3 == 3) {
                        try {
                            oVar.notifyAll();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return;
            }
            kVar.f11729V.f11745b0.c(new j(e.A(new StringBuilder(), kVar.f11729V.f11740W, " ping"), kVar.f11729V, p3, p8, 0), 0);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    public final void q(k kVar, int i, int i8, int i9) {
        byte b8;
        if (i9 != 0) {
            if ((i8 & 8) != 0) {
                byte m8 = this.f11776U.m();
                byte[] bArr = b.f6982a;
                b8 = m8 & Pdu.MANUFACTURER_DATA_PDU_TYPE;
            } else {
                b8 = 0;
            }
            int p3 = this.f11776U.p() & Integer.MAX_VALUE;
            List n4 = n(q.a(i - 4, i8, b8), b8, i8, i9);
            kVar.getClass();
            o oVar = kVar.f11729V;
            oVar.getClass();
            synchronized (oVar) {
                if (oVar.f11761s0.contains(Integer.valueOf(p3))) {
                    oVar.r(p3, 2);
                    return;
                }
                oVar.f11761s0.add(Integer.valueOf(p3));
                C0597c cVar = oVar.f11746c0;
                cVar.c(new m(oVar.f11740W + '[' + p3 + "] onRequest", oVar, p3, n4), 0);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
