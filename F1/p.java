package f1;

import D2.j;
import D2.o;
import H3.L;
import H3.O;
import H3.i0;
import H3.n0;
import M0.Y;
import M0.r;
import P0.l;
import P0.z;
import T0.I;
import T0.e0;
import Z1.c;
import a1.C0410a;
import android.net.Uri;
import android.os.Handler;
import de.ozerov.fully.K2;
import h1.C1058y;
import h1.C1059z;
import h1.X;
import h1.f0;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import l1.e;

public final class p implements C1059z {

    /* renamed from: U  reason: collision with root package name */
    public final e f11585U;

    /* renamed from: V  reason: collision with root package name */
    public final Handler f11586V = z.m((Handler.Callback) null);

    /* renamed from: W  reason: collision with root package name */
    public final c f11587W;

    /* renamed from: X  reason: collision with root package name */
    public final k f11588X;

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f11589Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f11590Z;

    /* renamed from: a0  reason: collision with root package name */
    public final c f11591a0;

    /* renamed from: b0  reason: collision with root package name */
    public final C0410a f11592b0;

    /* renamed from: c0  reason: collision with root package name */
    public C1058y f11593c0;

    /* renamed from: d0  reason: collision with root package name */
    public i0 f11594d0;

    /* renamed from: e0  reason: collision with root package name */
    public IOException f11595e0;

    /* renamed from: f0  reason: collision with root package name */
    public B2.c f11596f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f11597g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f11598h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f11599i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f11600j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f11601k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f11602l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f11603m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f11604n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f11605o0;
    public boolean p0;

    public p(e eVar, C0410a aVar, Uri uri, c cVar, String str, SocketFactory socketFactory) {
        this.f11585U = eVar;
        this.f11592b0 = aVar;
        this.f11591a0 = cVar;
        c cVar2 = new c(19, (Object) this);
        this.f11587W = cVar2;
        this.f11588X = new k(cVar2, cVar2, str, uri, socketFactory);
        this.f11589Y = new ArrayList();
        this.f11590Z = new ArrayList();
        this.f11598h0 = -9223372036854775807L;
        this.f11597g0 = -9223372036854775807L;
        this.f11599i0 = -9223372036854775807L;
    }

    public static boolean p(p pVar) {
        if (pVar.f11598h0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public static void w(p pVar) {
        pVar.f11600j0 = true;
        int i = 0;
        while (true) {
            ArrayList arrayList = pVar.f11589Y;
            if (i < arrayList.size()) {
                pVar.f11600j0 = ((o) arrayList.get(i)).f11583d & pVar.f11600j0;
                i++;
            } else {
                return;
            }
        }
    }

    public static void x(p pVar) {
        if (!pVar.f11602l0 && !pVar.f11603m0) {
            int i = 0;
            while (true) {
                ArrayList arrayList = pVar.f11589Y;
                if (i >= arrayList.size()) {
                    pVar.f11603m0 = true;
                    O m8 = O.m(arrayList);
                    L l8 = new L();
                    for (int i8 = 0; i8 < m8.size(); i8++) {
                        X x8 = ((o) m8.get(i8)).f11582c;
                        String num = Integer.toString(i8);
                        r u3 = x8.u();
                        l.h(u3);
                        l8.c(new Y(num, u3));
                    }
                    pVar.f11594d0 = l8.g();
                    C1058y yVar = pVar.f11593c0;
                    l.h(yVar);
                    yVar.o(pVar);
                    return;
                } else if (((o) arrayList.get(i)).f11582c.u() != null) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.IOException, B2.c] */
    public static void y(p pVar) {
        pVar.p0 = true;
        k kVar = pVar.f11588X;
        kVar.getClass();
        try {
            kVar.close();
            w wVar = new w(new K2(kVar));
            kVar.f11562c0 = wVar;
            wVar.k(kVar.p(kVar.f11561b0));
            kVar.f11564e0 = null;
            kVar.f11570k0 = false;
            kVar.f11567h0 = null;
        } catch (IOException e) {
            kVar.f11555V.t(new IOException(e));
        }
        pVar.f11592b0.getClass();
        C0410a aVar = new C0410a(25);
        ArrayList arrayList = pVar.f11589Y;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = pVar.f11590Z;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (int i = 0; i < arrayList.size(); i++) {
            o oVar = (o) arrayList.get(i);
            if (!oVar.f11583d) {
                n nVar = oVar.f11580a;
                o oVar2 = new o(pVar, nVar.f11576a, i, aVar);
                arrayList2.add(oVar2);
                oVar2.b();
                if (arrayList3.contains(nVar)) {
                    arrayList4.add(oVar2.f11580a);
                }
            } else {
                arrayList2.add(oVar);
            }
        }
        O m8 = O.m(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        for (int i8 = 0; i8 < m8.size(); i8++) {
            ((o) m8.get(i8)).a();
        }
    }

    public final boolean b() {
        int i;
        if (this.f11600j0 || ((i = this.f11588X.f11568i0) != 2 && i != 1)) {
            return false;
        }
        return true;
    }

    public final long d(k1.r[] rVarArr, boolean[] zArr, h1.Y[] yArr, boolean[] zArr2, long j7) {
        ArrayList arrayList;
        for (int i = 0; i < rVarArr.length; i++) {
            if (yArr[i] != null && (rVarArr[i] == null || !zArr[i])) {
                yArr[i] = null;
            }
        }
        ArrayList arrayList2 = this.f11590Z;
        arrayList2.clear();
        int i8 = 0;
        while (true) {
            int length = rVarArr.length;
            arrayList = this.f11589Y;
            if (i8 >= length) {
                break;
            }
            k1.r rVar = rVarArr[i8];
            if (rVar != null) {
                Y l8 = rVar.l();
                i0 i0Var = this.f11594d0;
                i0Var.getClass();
                int indexOf = i0Var.indexOf(l8);
                o oVar = (o) arrayList.get(indexOf);
                oVar.getClass();
                arrayList2.add(oVar.f11580a);
                if (this.f11594d0.contains(l8) && yArr[i8] == null) {
                    yArr[i8] = new j(indexOf, (Object) this);
                    zArr2[i8] = true;
                }
            }
            i8++;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            o oVar2 = (o) arrayList.get(i9);
            if (!arrayList2.contains(oVar2.f11580a)) {
                oVar2.a();
            }
        }
        this.f11604n0 = true;
        if (j7 != 0) {
            this.f11597g0 = j7;
            this.f11598h0 = j7;
            this.f11599i0 = j7;
        }
        z();
        return j7;
    }

    public final long e() {
        return n();
    }

    public final long f() {
        if (!this.f11601k0) {
            return -9223372036854775807L;
        }
        this.f11601k0 = false;
        return 0;
    }

    public final boolean h(I i) {
        return b();
    }

    public final void i(C1058y yVar, long j7) {
        k kVar = this.f11588X;
        this.f11593c0 = yVar;
        try {
            kVar.getClass();
            kVar.f11562c0.k(kVar.p(kVar.f11561b0));
            Uri uri = kVar.f11561b0;
            String str = kVar.f11564e0;
            o oVar = kVar.f11560a0;
            oVar.q(oVar.j(4, str, n0.f2094a0, uri));
        } catch (IOException e) {
            z.g(kVar.f11562c0);
            throw e;
        } catch (IOException e8) {
            this.f11595e0 = e8;
            z.g(kVar);
        }
    }

    public final f0 j() {
        l.j(this.f11603m0);
        i0 i0Var = this.f11594d0;
        i0Var.getClass();
        return new f0((Y[]) i0Var.toArray((Object[]) new Y[0]));
    }

    public final long m(long j7, e0 e0Var) {
        return j7;
    }

    public final long n() {
        if (!this.f11600j0) {
            ArrayList arrayList = this.f11589Y;
            if (!arrayList.isEmpty()) {
                long j7 = this.f11597g0;
                if (j7 != -9223372036854775807L) {
                    return j7;
                }
                boolean z = true;
                long j8 = Long.MAX_VALUE;
                for (int i = 0; i < arrayList.size(); i++) {
                    o oVar = (o) arrayList.get(i);
                    if (!oVar.f11583d) {
                        j8 = Math.min(j8, oVar.f11582c.o());
                        z = false;
                    }
                }
                if (z || j8 == Long.MIN_VALUE) {
                    return 0;
                }
                return j8;
            }
        }
        return Long.MIN_VALUE;
    }

    public final void r() {
        IOException iOException = this.f11595e0;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final long s(long j7) {
        boolean z;
        if (n() != 0 || this.p0) {
            t(j7);
            this.f11597g0 = j7;
            if (this.f11598h0 != -9223372036854775807L) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                k kVar = this.f11588X;
                int i = kVar.f11568i0;
                if (i == 1) {
                    return j7;
                }
                if (i == 2) {
                    this.f11598h0 = j7;
                    kVar.q(j7);
                    return j7;
                }
                throw new IllegalStateException();
            }
            int i8 = 0;
            while (true) {
                ArrayList arrayList = this.f11589Y;
                if (i8 >= arrayList.size()) {
                    return j7;
                }
                if (!((o) arrayList.get(i8)).f11582c.G(j7, false)) {
                    this.f11598h0 = j7;
                    if (this.f11600j0) {
                        for (int i9 = 0; i9 < this.f11589Y.size(); i9++) {
                            o oVar = (o) this.f11589Y.get(i9);
                            l.j(oVar.f11583d);
                            oVar.f11583d = false;
                            w(oVar.f11584f);
                            oVar.b();
                        }
                        if (this.p0) {
                            this.f11588X.r(z.c0(j7));
                        } else {
                            this.f11588X.q(j7);
                        }
                    } else {
                        this.f11588X.q(j7);
                    }
                    for (int i10 = 0; i10 < this.f11589Y.size(); i10++) {
                        o oVar2 = (o) this.f11589Y.get(i10);
                        if (!oVar2.f11583d) {
                            C0892e eVar = oVar2.f11580a.f11577b.f11517b0;
                            eVar.getClass();
                            synchronized (eVar.e) {
                                eVar.f11530k = true;
                            }
                            oVar2.f11582c.D(false);
                            oVar2.f11582c.f12424t = j7;
                        }
                    }
                    return j7;
                }
                i8++;
            }
        } else {
            this.f11599i0 = j7;
            return j7;
        }
    }

    public final void t(long j7) {
        if (this.f11598h0 == -9223372036854775807L) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f11589Y;
                if (i < arrayList.size()) {
                    o oVar = (o) arrayList.get(i);
                    if (!oVar.f11583d) {
                        oVar.f11582c.i(j7, true);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void u(long j7) {
    }

    public final void z() {
        ArrayList arrayList;
        boolean z;
        int i = 0;
        boolean z6 = true;
        while (true) {
            arrayList = this.f11590Z;
            if (i >= arrayList.size()) {
                break;
            }
            if (((n) arrayList.get(i)).f11578c != null) {
                z = true;
            } else {
                z = false;
            }
            z6 &= z;
            i++;
        }
        if (z6 && this.f11604n0) {
            k kVar = this.f11588X;
            kVar.f11558Y.addAll(arrayList);
            kVar.o();
        }
    }
}
