package f7;

import D6.h;
import N.e;
import Q0.g;
import Z6.b;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import l7.f;
import l7.o;
import l7.r;
import u.C1477r;

public final class x implements Closeable {

    /* renamed from: Z  reason: collision with root package name */
    public static final Logger f11802Z = Logger.getLogger(f.class.getName());

    /* renamed from: U  reason: collision with root package name */
    public final o f11803U;

    /* renamed from: V  reason: collision with root package name */
    public final f f11804V;

    /* renamed from: W  reason: collision with root package name */
    public int f11805W = 16384;

    /* renamed from: X  reason: collision with root package name */
    public boolean f11806X;

    /* renamed from: Y  reason: collision with root package name */
    public final d f11807Y;

    /* JADX WARNING: type inference failed for: r2v1, types: [l7.f, java.lang.Object] */
    public x(o oVar) {
        P6.f.e(oVar, "sink");
        this.f11803U = oVar;
        ? obj = new Object();
        this.f11804V = obj;
        this.f11807Y = new d(obj);
    }

    public final synchronized void close() {
        this.f11806X = true;
        this.f11803U.close();
    }

    public final synchronized void flush() {
        if (!this.f11806X) {
            this.f11803U.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void k(C0936A a8) {
        int i;
        try {
            P6.f.e(a8, "peerSettings");
            if (!this.f11806X) {
                int i8 = this.f11805W;
                int i9 = a8.f11693a;
                if ((i9 & 32) != 0) {
                    i8 = a8.f11694b[5];
                }
                this.f11805W = i8;
                int i10 = -1;
                if ((i9 & 2) != 0) {
                    i = a8.f11694b[1];
                } else {
                    i = -1;
                }
                if (i != -1) {
                    d dVar = this.f11807Y;
                    if ((i9 & 2) != 0) {
                        i10 = a8.f11694b[1];
                    }
                    dVar.getClass();
                    int min = Math.min(i10, 16384);
                    int i11 = dVar.e;
                    if (i11 != min) {
                        if (min < i11) {
                            dVar.f11711c = Math.min(dVar.f11711c, min);
                        }
                        dVar.f11712d = true;
                        dVar.e = min;
                        int i12 = dVar.i;
                        if (min < i12) {
                            if (min == 0) {
                                C0939b[] bVarArr = dVar.f11713f;
                                h.F(0, bVarArr.length, bVarArr);
                                dVar.f11714g = dVar.f11713f.length - 1;
                                dVar.f11715h = 0;
                                dVar.i = 0;
                            } else {
                                dVar.a(i12 - min);
                            }
                        }
                    }
                }
                m(0, 0, 4, 1);
                this.f11803U.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void l(boolean z, int i, f fVar, int i8) {
        if (!this.f11806X) {
            m(i, i8, 0, z ? 1 : 0);
            if (i8 > 0) {
                P6.f.b(fVar);
                this.f11803U.h(fVar, (long) i8);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void m(int i, int i8, int i9, int i10) {
        Level level = Level.FINE;
        Logger logger = f11802Z;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(i, i8, i9, i10, false));
        }
        if (i8 > this.f11805W) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f11805W + ": " + i8).toString());
        } else if ((Integer.MIN_VALUE & i) == 0) {
            byte[] bArr = b.f6982a;
            o oVar = this.f11803U;
            P6.f.e(oVar, "<this>");
            oVar.l((i8 >>> 16) & 255);
            oVar.l((i8 >>> 8) & 255);
            oVar.l(i8 & 255);
            oVar.l(i9 & 255);
            oVar.l(i10 & 255);
            oVar.m(i & Integer.MAX_VALUE);
        } else {
            throw new IllegalArgumentException(g.m(i, "reserved bit set: ").toString());
        }
    }

    public final synchronized void n(byte[] bArr, int i, int i8) {
        e.E(i8, "errorCode");
        if (this.f11806X) {
            throw new IOException("closed");
        } else if (C1477r.h(i8) != -1) {
            m(0, bArr.length + 8, 7, 0);
            this.f11803U.m(i);
            this.f11803U.m(C1477r.h(i8));
            if (bArr.length != 0) {
                o oVar = this.f11803U;
                if (!oVar.f13234W) {
                    oVar.f13233V.x(bArr, 0, bArr.length);
                    oVar.k();
                } else {
                    throw new IllegalStateException("closed");
                }
            }
            this.f11803U.flush();
        } else {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
    }

    public final synchronized void o(boolean z, int i, ArrayList arrayList) {
        int i8;
        int i9;
        if (!this.f11806X) {
            this.f11807Y.d(arrayList);
            long j7 = this.f11804V.f13216V;
            long min = Math.min((long) this.f11805W, j7);
            int i10 = (j7 > min ? 1 : (j7 == min ? 0 : -1));
            if (i10 == 0) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            if (z) {
                i8 |= 1;
            }
            m(i, (int) min, 1, i8);
            this.f11803U.h(this.f11804V, min);
            if (i10 > 0) {
                long j8 = j7 - min;
                while (j8 > 0) {
                    long min2 = Math.min((long) this.f11805W, j8);
                    j8 -= min2;
                    int i11 = (int) min2;
                    if (j8 == 0) {
                        i9 = 4;
                    } else {
                        i9 = 0;
                    }
                    m(i, i11, 9, i9);
                    this.f11803U.h(this.f11804V, min2);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void p(int i, int i8, boolean z) {
        if (!this.f11806X) {
            m(0, 8, 6, z ? 1 : 0);
            this.f11803U.m(i);
            this.f11803U.m(i8);
            this.f11803U.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void q(int i, int i8) {
        e.E(i8, "errorCode");
        if (this.f11806X) {
            throw new IOException("closed");
        } else if (C1477r.h(i8) != -1) {
            m(i, 4, 3, 0);
            this.f11803U.m(C1477r.h(i8));
            this.f11803U.flush();
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final synchronized void r(C0936A a8) {
        int i;
        try {
            P6.f.e(a8, "settings");
            if (!this.f11806X) {
                m(0, Integer.bitCount(a8.f11693a) * 6, 4, 0);
                for (int i8 = 0; i8 < 10; i8++) {
                    boolean z = true;
                    if (((1 << i8) & a8.f11693a) == 0) {
                        z = false;
                    }
                    if (z) {
                        if (i8 == 4) {
                            i = 3;
                        } else if (i8 != 7) {
                            i = i8;
                        } else {
                            i = 4;
                        }
                        o oVar = this.f11803U;
                        if (!oVar.f13234W) {
                            f fVar = oVar.f13233V;
                            r v4 = fVar.v(2);
                            int i9 = v4.f13241c;
                            byte[] bArr = v4.f13239a;
                            bArr[i9] = (byte) ((i >>> 8) & 255);
                            bArr[i9 + 1] = (byte) (i & 255);
                            v4.f13241c = i9 + 2;
                            fVar.f13216V += 2;
                            oVar.k();
                            this.f11803U.m(a8.f11694b[i8]);
                        } else {
                            throw new IllegalStateException("closed");
                        }
                    }
                }
                this.f11803U.flush();
            } else {
                throw new IOException("closed");
            }
        } finally {
        }
    }

    public final synchronized void s(int i, long j7) {
        if (this.f11806X) {
            throw new IOException("closed");
        } else if (j7 == 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j7).toString());
        } else {
            m(i, 4, 8, 0);
            this.f11803U.m((int) j7);
            this.f11803U.flush();
        }
    }
}
