package d1;

import B.B;
import M0.E;
import M0.F;
import M0.G;
import M0.H;
import M0.r;
import P0.k;
import P0.l;
import P0.z;
import Q7.g;
import R2.c;
import S0.f;
import T0.C0213e;
import T0.C0229v;
import T0.C0232y;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h1.C1031B;
import java.util.ArrayList;
import y1.C1625a;

/* renamed from: d1.b  reason: case insensitive filesystem */
public final class C0631b extends C0213e implements Handler.Callback {

    /* renamed from: l0  reason: collision with root package name */
    public final C0630a f9708l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C0229v f9709m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Handler f9710n0;

    /* renamed from: o0  reason: collision with root package name */
    public final C1625a f9711o0;
    public g p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f9712q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f9713r0;

    /* renamed from: s0  reason: collision with root package name */
    public long f9714s0;

    /* renamed from: t0  reason: collision with root package name */
    public H f9715t0;

    /* renamed from: u0  reason: collision with root package name */
    public long f9716u0;

    /* JADX WARNING: type inference failed for: r3v2, types: [S0.f, y1.a] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0631b(C0229v vVar, Looper looper) {
        super(5);
        Handler handler;
        C0630a aVar = C0630a.f9707a;
        this.f9709m0 = vVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.f9710n0 = handler;
        this.f9708l0 = aVar;
        this.f9711o0 = new f(1);
        this.f9716u0 = -9223372036854775807L;
    }

    public final void B(H h5, ArrayList arrayList) {
        int i = 0;
        while (true) {
            G[] gArr = h5.f2837U;
            if (i < gArr.length) {
                r i8 = gArr[i].i();
                if (i8 != null) {
                    C0630a aVar = this.f9708l0;
                    if (aVar.b(i8)) {
                        g a8 = aVar.a(i8);
                        byte[] s8 = gArr[i].s();
                        s8.getClass();
                        C1625a aVar2 = this.f9711o0;
                        aVar2.r();
                        aVar2.u(s8.length);
                        aVar2.f4386Y.put(s8);
                        aVar2.v();
                        H p3 = a8.p(aVar2);
                        if (p3 != null) {
                            B(p3, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(gArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final long C(long j7) {
        boolean z;
        boolean z6 = false;
        if (j7 != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        if (this.f9716u0 != -9223372036854775807L) {
            z6 = true;
        }
        l.j(z6);
        return j7 - this.f9716u0;
    }

    public final void D(H h5) {
        C0229v vVar = this.f9709m0;
        C0232y yVar = vVar.f4905U;
        E a8 = yVar.f4943a1.a();
        int i = 0;
        while (true) {
            G[] gArr = h5.f2837U;
            if (i >= gArr.length) {
                break;
            }
            gArr[i].e(a8);
            i++;
        }
        yVar.f4943a1 = new F(a8);
        F p3 = yVar.p();
        boolean equals = p3.equals(yVar.f4921J0);
        k kVar = yVar.f4952g0;
        if (!equals) {
            yVar.f4921J0 = p3;
            kVar.c(14, new B(18, vVar));
        }
        kVar.c(28, new B(19, h5));
        kVar.b();
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            D((H) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final String i() {
        return "MetadataRenderer";
    }

    public final boolean k() {
        return this.f9713r0;
    }

    public final boolean l() {
        return true;
    }

    public final void m() {
        this.f9715t0 = null;
        this.p0 = null;
        this.f9716u0 = -9223372036854775807L;
    }

    public final void o(long j7, boolean z) {
        this.f9715t0 = null;
        this.f9712q0 = false;
        this.f9713r0 = false;
    }

    public final void t(r[] rVarArr, long j7, long j8, C1031B b8) {
        this.p0 = this.f9708l0.a(rVarArr[0]);
        H h5 = this.f9715t0;
        if (h5 != null) {
            long j9 = this.f9716u0;
            long j10 = h5.f2838V;
            long j11 = (j9 + j10) - j8;
            if (j10 != j11) {
                h5 = new H(j11, h5.f2837U);
            }
            this.f9715t0 = h5;
        }
        this.f9716u0 = j8;
    }

    public final void v(long j7, long j8) {
        boolean z = true;
        while (z) {
            if (!this.f9712q0 && this.f9715t0 == null) {
                C1625a aVar = this.f9711o0;
                aVar.r();
                c cVar = this.f4800W;
                cVar.I();
                int u3 = u(cVar, aVar, 0);
                if (u3 == -4) {
                    if (aVar.d(4)) {
                        this.f9712q0 = true;
                    } else if (aVar.f4388a0 >= this.f4809f0) {
                        aVar.f16364d0 = this.f9714s0;
                        aVar.v();
                        g gVar = this.p0;
                        int i = z.f3748a;
                        H p3 = gVar.p(aVar);
                        if (p3 != null) {
                            ArrayList arrayList = new ArrayList(p3.f2837U.length);
                            B(p3, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f9715t0 = new H(C(aVar.f4388a0), (G[]) arrayList.toArray(new G[0]));
                            }
                        }
                    }
                } else if (u3 == -5) {
                    r rVar = (r) cVar.f4337W;
                    rVar.getClass();
                    this.f9714s0 = rVar.f3041s;
                }
            }
            H h5 = this.f9715t0;
            if (h5 == null || h5.f2838V > C(j7)) {
                z = false;
            } else {
                H h8 = this.f9715t0;
                Handler handler = this.f9710n0;
                if (handler != null) {
                    handler.obtainMessage(1, h8).sendToTarget();
                } else {
                    D(h8);
                }
                this.f9715t0 = null;
                z = true;
            }
            if (this.f9712q0 && this.f9715t0 == null) {
                this.f9713r0 = true;
            }
        }
    }

    public final int z(r rVar) {
        int i;
        if (!this.f9708l0.b(rVar)) {
            return Q0.g.e(0, 0, 0, 0);
        }
        if (rVar.f3023L == 0) {
            i = 4;
        } else {
            i = 2;
        }
        return Q0.g.e(i, 0, 0, 0);
    }
}
