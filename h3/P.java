package H3;

import A.g;
import B.C0002c;
import B.Q;
import B.e0;
import D.C0036c;
import D.C0053k0;
import D.C0068w;
import D.C0069x;
import D.C0071z;
import D.J;
import D.K;
import D.O;
import D.t0;
import D.y0;
import D2.G;
import H2.r;
import H2.w;
import I2.a;
import J4.c;
import K2.l;
import M0.C0119g;
import M0.Y;
import M1.d;
import P5.N;
import S7.p;
import S7.v;
import U.k;
import U.s;
import U7.q;
import V0.B;
import V0.i;
import W0.h;
import Y0.e;
import Y6.j;
import Y6.n;
import Y6.o;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Rational;
import android.util.SparseArray;
import androidx.camera.view.PreviewView;
import b7.C0598d;
import de.ozerov.fully.j5;
import g7.C0996d;
import h1.Z;
import h1.a0;
import h1.f0;
import j0.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import m5.C1217b;

public final class P implements r, l, C1217b, d, N, C0068w, t0, q, e0, h, j, Z {

    /* renamed from: U  reason: collision with root package name */
    public Object f2027U;

    public /* synthetic */ P(Object obj) {
        this.f2027U = obj;
    }

    public int A0() {
        return 1;
    }

    public void B0(Exception exc) {
        P0.l.p("MediaCodecAudioRenderer", "Audio sink error", exc);
        i iVar = ((B) this.f2027U).f5482x1;
        Handler handler = iVar.f5527b;
        if (handler != null) {
            handler.post(new V0.h(iVar, (Object) exc, 4));
        }
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [U.k, U.t] */
    public void C(B.t0 t0Var) {
        s sVar;
        if (!g7.l.h()) {
            f.d(((PreviewView) this.f2027U).getContext()).execute(new C0002c((Object) this, 23, (Object) t0Var));
            return;
        }
        F.h.j("PreviewView", "Surface requested by Preview.");
        C0071z zVar = t0Var.f309d;
        ((PreviewView) this.f2027U).f7685f0 = zVar.l();
        U.l lVar = ((PreviewView) this.f2027U).f7684e0;
        Rect O8 = zVar.m().O();
        lVar.getClass();
        new Rational(O8.width(), O8.height());
        synchronized (lVar) {
            lVar.f5290b = O8;
        }
        t0Var.b(f.d(((PreviewView) this.f2027U).getContext()), new O(this, zVar, t0Var, 4));
        PreviewView previewView = (PreviewView) this.f2027U;
        k kVar = previewView.f7678V;
        U.h hVar = previewView.f7677U;
        if (!(kVar instanceof s) || PreviewView.b(t0Var, hVar)) {
            PreviewView previewView2 = (PreviewView) this.f2027U;
            if (PreviewView.b(t0Var, previewView2.f7677U)) {
                PreviewView previewView3 = (PreviewView) this.f2027U;
                ? kVar2 = new k(previewView3, previewView3.f7680a0);
                kVar2.i = false;
                kVar2.f5312k = new AtomicReference();
                sVar = kVar2;
            } else {
                PreviewView previewView4 = (PreviewView) this.f2027U;
                sVar = new s(previewView4, previewView4.f7680a0);
            }
            previewView2.f7678V = sVar;
        }
        C0069x l8 = zVar.l();
        PreviewView previewView5 = (PreviewView) this.f2027U;
        U.d dVar = new U.d(l8, previewView5.f7682c0, previewView5.f7678V);
        ((PreviewView) this.f2027U).f7683d0.set(dVar);
        zVar.b().a(f.d(((PreviewView) this.f2027U).getContext()), dVar);
        ((PreviewView) this.f2027U).f7678V.e(t0Var, new O(this, dVar, zVar, 5));
        PreviewView previewView6 = (PreviewView) this.f2027U;
        if (previewView6.indexOfChild(previewView6.f7679W) == -1) {
            PreviewView previewView7 = (PreviewView) this.f2027U;
            previewView7.addView(previewView7.f7679W);
        }
        ((PreviewView) this.f2027U).getClass();
    }

    public void C0() {
        Z0.k kVar = (Z0.k) this.f2027U;
        int i = kVar.f6850l0 - 1;
        kVar.f6850l0 = i;
        if (i <= 0) {
            int i8 = 0;
            for (Z0.q qVar : kVar.f6852n0) {
                qVar.a();
                i8 += qVar.f6882C0.f12469a;
            }
            Y[] yArr = new Y[i8];
            int i9 = 0;
            for (Z0.q qVar2 : kVar.f6852n0) {
                qVar2.a();
                int i10 = qVar2.f6882C0.f12469a;
                int i11 = 0;
                while (i11 < i10) {
                    qVar2.a();
                    yArr[i9] = qVar2.f6882C0.a(i11);
                    i11++;
                    i9++;
                }
            }
            kVar.f6851m0 = new f0(yArr);
            kVar.f6849k0.o(kVar);
        }
    }

    public void D() {
        ((C0068w) this.f2027U).D();
    }

    public void D0(e eVar) {
    }

    public long E(long j7, long j8) {
        return -9223372036854775807L;
    }

    public boolean E0(String str) {
        return false;
    }

    public X0.j F(long j7) {
        return (X0.j) this.f2027U;
    }

    public int H() {
        c cVar = (c) this.f2027U;
        cVar.a();
        return cVar.f2509V;
    }

    public int I() {
        return (q() << 8) | q();
    }

    public /* synthetic */ Set J() {
        return N.e.n(this);
    }

    public void K(Q q7) {
        ((C0068w) this.f2027U).K(q7);
    }

    public boolean L() {
        return true;
    }

    public Rect O() {
        return ((C0068w) this.f2027U).O();
    }

    public /* synthetic */ void Q(g gVar) {
        N.e.b(this, gVar);
    }

    public int U(int i, byte[] bArr) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < i && (i9 = ((InputStream) this.f2027U).read(bArr, i8, i - i8)) != -1) {
            i8 += i9;
        }
        if (i8 != 0 || i9 != -1) {
            return i8;
        }
        throw new K2.k();
    }

    public void V(int i) {
        ((C0068w) this.f2027U).V(i);
    }

    public void W(o oVar, List list) {
        n nVar;
        P6.f.e(oVar, "url");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Y6.i iVar = (Y6.i) it.next();
            P6.f.e(iVar, "cookie");
            arrayList.add(iVar.a(true));
        }
        Map singletonMap = Collections.singletonMap("Set-Cookie", arrayList);
        P6.f.d(singletonMap, "singletonMap(...)");
        try {
            ((j5) this.f2027U).put(oVar.f(), singletonMap);
        } catch (IOException e) {
            g7.n nVar2 = g7.n.f12045a;
            g7.n nVar3 = g7.n.f12045a;
            StringBuilder sb = new StringBuilder("Saving cookies failed for ");
            o oVar2 = null;
            try {
                nVar = new n();
                nVar.c(oVar, "/...");
            } catch (IllegalArgumentException unused) {
                nVar = null;
            }
            if (nVar != null) {
                oVar2 = nVar.a();
            }
            P6.f.b(oVar2);
            sb.append(oVar2);
            String sb2 = sb.toString();
            nVar3.getClass();
            g7.n.i(5, sb2, e);
        }
    }

    public List X(long j7) {
        if (j7 >= 0) {
            return (List) this.f2027U;
        }
        return Collections.emptyList();
    }

    public /* synthetic */ Object Y(C0036c cVar, J j7) {
        return N.e.r(this, cVar, j7);
    }

    public long Z() {
        return 0;
    }

    public void a(y0 y0Var) {
        ((C0068w) this.f2027U).a(y0Var);
    }

    public long b(long j7) {
        return 0;
    }

    public /* synthetic */ Object b0(C0036c cVar) {
        return N.e.p(this, cVar);
    }

    public int c(long j7) {
        if (j7 < 0) {
            return 0;
        }
        return -1;
    }

    public ServerSocket d() {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) ((SSLServerSocketFactory) this.f2027U).createServerSocket();
        sSLServerSocket.setEnabledProtocols(sSLServerSocket.getSupportedProtocols());
        sSLServerSocket.setUseClientMode(false);
        sSLServerSocket.setWantClientAuth(false);
        sSLServerSocket.setNeedClientAuth(false);
        return sSLServerSocket;
    }

    public long e(long j7, long j8) {
        return 0;
    }

    public K f() {
        return ((C0068w) this.f2027U).f();
    }

    public void f0(a0 a0Var) {
        Z0.q qVar = (Z0.q) a0Var;
        Z0.k kVar = (Z0.k) this.f2027U;
        kVar.f6849k0.f0(kVar);
    }

    public /* synthetic */ Set g(C0036c cVar) {
        return N.e.g(this, cVar);
    }

    public long h(long j7, long j8) {
        return j8;
    }

    public long i0(long j7) {
        return 1;
    }

    public void j(K k8) {
        ((C0068w) this.f2027U).j(k8);
    }

    public long j0(long j7, long j8) {
        return 1;
    }

    public C1217b k0(long j7, TimeUnit timeUnit) {
        c cVar = (c) this.f2027U;
        cVar.a();
        if (!cVar.f2514a0) {
            C0996d.r(timeUnit, "Time unit");
            cVar.f2511X = timeUnit.toNanos(j7);
            return this;
        }
        throw new UnsupportedOperationException("delay must only be called in onDisconnected.");
    }

    public C1217b l0(boolean z) {
        c cVar = (c) this.f2027U;
        cVar.a();
        cVar.f2510W = z;
        return this;
    }

    public /* synthetic */ J m(C0036c cVar) {
        return N.e.e(this, cVar);
    }

    public H2.q m0(w wVar) {
        return new a((A.f) this.f2027U);
    }

    public void n0(p pVar, int i) {
        if (pVar instanceof S7.k) {
            p p3 = pVar.p();
            if (!((S7.k) pVar).f4559X.f5088X) {
                return;
            }
            if ((p3 instanceof v) || ((p3 instanceof S7.k) && !((S7.k) p3).f4559X.f5089Y)) {
                StringBuilder sb = (StringBuilder) this.f2027U;
                if (!v.F(sb)) {
                    sb.append(' ');
                }
            }
        }
    }

    public /* synthetic */ Object o0(C0036c cVar, Object obj) {
        return N.e.q(this, cVar, obj);
    }

    public short q() {
        int read = ((InputStream) this.f2027U).read();
        if (read != -1) {
            return (short) read;
        }
        throw new K2.k();
    }

    public /* synthetic */ boolean q0(C0036c cVar) {
        return N.e.a(this, cVar);
    }

    public void r0(p pVar, int i) {
        boolean z = pVar instanceof v;
        StringBuilder sb = (StringBuilder) this.f2027U;
        if (z) {
            v vVar = (v) pVar;
            String C8 = vVar.C();
            if (S7.k.L(vVar.f4578U) || (vVar instanceof S7.d)) {
                sb.append(C8);
            } else {
                R7.h.a(C8, sb, v.F(sb));
            }
        } else if (pVar instanceof S7.k) {
            S7.k kVar = (S7.k) pVar;
            if (sb.length() <= 0) {
                return;
            }
            if ((kVar.f4559X.f5088X || kVar.o("br")) && !v.F(sb)) {
                sb.append(' ');
            }
        }
    }

    public long s(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        P0.l.d(z);
        return 0;
    }

    public int s0() {
        return 1;
    }

    public long skip(long j7) {
        if (j7 < 0) {
            return 0;
        }
        long j8 = j7;
        while (j8 > 0) {
            InputStream inputStream = (InputStream) this.f2027U;
            long skip = inputStream.skip(j8);
            if (skip > 0) {
                j8 -= skip;
            } else if (inputStream.read() == -1) {
                break;
            } else {
                j8--;
            }
        }
        return j7 - j8;
    }

    public long t(long j7, long j8) {
        return 0;
    }

    public void t0(e eVar) {
    }

    public void u0(int i, boolean z) {
        G g8 = (G) this.f2027U;
        if (z) {
            g8.c(i);
        } else {
            g8.getClass();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [H3.f0, H3.o] */
    public f0 v0() {
        Map f8 = ((C0103u) this.f2027U).f();
        e0 e0Var = new e0();
        ? oVar = new C0098o(f8);
        oVar.f2068Z = e0Var;
        return oVar;
    }

    public void w0(int[] iArr, int i) {
        int[] iArr2;
        U3.a aVar;
        int[] iArr3;
        int i8;
        int i9;
        int i10;
        R2.c cVar;
        R2.c cVar2;
        R2.c cVar3;
        int i11;
        int[] iArr4 = iArr;
        int i12 = i;
        char c8 = 0;
        if (iArr4.length != 0) {
            int length = iArr4.length;
            if (length <= 1 || iArr4[0] != 0) {
                iArr2 = iArr4;
            } else {
                int i13 = 1;
                while (i13 < length && iArr4[i13] == 0) {
                    i13++;
                }
                if (i13 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i14 = length - i13;
                    int[] iArr5 = new int[i14];
                    System.arraycopy(iArr4, i13, iArr5, 0, i14);
                    iArr2 = iArr5;
                }
            }
            int[] iArr6 = new int[i12];
            int i15 = 0;
            boolean z = true;
            while (true) {
                aVar = (U3.a) this.f2027U;
                if (i15 >= i12) {
                    break;
                }
                int i16 = aVar.f5428a[aVar.f5433g + i15];
                if (i16 == 0) {
                    i11 = iArr2[iArr2.length - 1];
                } else if (i16 == 1) {
                    int i17 = 0;
                    for (int i18 : iArr2) {
                        U3.a aVar2 = U3.a.f5421h;
                        i17 ^= i18;
                    }
                    i11 = i17;
                } else {
                    int i19 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i20 = 1; i20 < length2; i20++) {
                        i19 = aVar.b(i16, i19) ^ iArr2[i20];
                    }
                    i11 = i19;
                }
                iArr6[(i12 - 1) - i15] = i11;
                if (i11 != 0) {
                    z = false;
                }
                i15++;
            }
            if (!z) {
                R2.c cVar4 = new R2.c(aVar, iArr6);
                aVar.getClass();
                if (i12 >= 0) {
                    int[] iArr7 = new int[(i12 + 1)];
                    iArr7[0] = 1;
                    R2.c cVar5 = new R2.c(aVar, iArr7);
                    if (cVar5.d0() >= cVar4.d0()) {
                        R2.c cVar6 = cVar5;
                        cVar5 = cVar4;
                        cVar4 = cVar6;
                    }
                    R2.c cVar7 = aVar.f5430c;
                    R2.c cVar8 = aVar.f5431d;
                    R2.c cVar9 = cVar7;
                    while (true) {
                        R2.c cVar10 = r8;
                        R2.c cVar11 = cVar4;
                        cVar4 = cVar10;
                        if (cVar4.d0() < i12 / 2) {
                            int c02 = cVar8.c0(0);
                            if (c02 != 0) {
                                int a8 = aVar.a(c02);
                                R2.c[] cVarArr = {cVar8.s0(a8), cVar4.s0(a8)};
                                R2.c cVar12 = cVarArr[0];
                                R2.c cVar13 = cVarArr[1];
                                int d02 = cVar12.d0();
                                if (d02 == 1) {
                                    iArr3 = new int[]{cVar12.c0(1)};
                                } else {
                                    int[] iArr8 = new int[d02];
                                    int i21 = 1;
                                    int i22 = 0;
                                    while (i21 < aVar.e && i22 < d02) {
                                        if (cVar12.a0(i21) == 0) {
                                            iArr8[i22] = aVar.a(i21);
                                            i10 = 1;
                                            i22++;
                                        } else {
                                            i10 = 1;
                                        }
                                        i21 += i10;
                                    }
                                    if (i22 == d02) {
                                        iArr3 = iArr8;
                                    } else {
                                        throw new Exception("Error locator degree does not match number of roots");
                                    }
                                }
                                int length3 = iArr3.length;
                                int[] iArr9 = new int[length3];
                                for (int i23 = 0; i23 < length3; i23++) {
                                    int a9 = aVar.a(iArr3[i23]);
                                    int i24 = 1;
                                    int i25 = 0;
                                    while (i25 < length3) {
                                        if (i23 != i25) {
                                            int b8 = aVar.b(iArr3[i25], a9);
                                            i8 = 1;
                                            if ((b8 & 1) == 0) {
                                                i9 = b8 | 1;
                                            } else {
                                                i9 = b8 & -2;
                                            }
                                            i24 = aVar.b(i24, i9);
                                        } else {
                                            i8 = 1;
                                        }
                                        i25 += i8;
                                    }
                                    int b9 = aVar.b(cVar13.a0(a9), aVar.a(i24));
                                    iArr9[i23] = b9;
                                    if (aVar.f5433g != 0) {
                                        iArr9[i23] = aVar.b(b9, a9);
                                    }
                                }
                                int i26 = 1;
                                int i27 = 0;
                                while (i27 < iArr3.length) {
                                    int length4 = iArr4.length - i26;
                                    int i28 = iArr3[i27];
                                    if (i28 != 0) {
                                        int i29 = length4 - aVar.f5429b[i28];
                                        if (i29 >= 0) {
                                            iArr4[i29] = iArr4[i29] ^ iArr9[i27];
                                            i27++;
                                            i26 = 1;
                                        } else {
                                            throw new Exception("Bad error location");
                                        }
                                    } else {
                                        throw new IllegalArgumentException();
                                    }
                                }
                                return;
                            }
                            throw new Exception("sigmaTilde(0) was zero");
                        } else if (!cVar4.p0()) {
                            int a10 = aVar.a(cVar4.c0(cVar4.d0()));
                            R2.c cVar14 = cVar7;
                            while (cVar11.d0() >= cVar4.d0() && !cVar11.p0()) {
                                int d03 = cVar11.d0() - cVar4.d0();
                                int b10 = aVar.b(cVar11.c0(cVar11.d0()), a10);
                                if (d03 >= 0) {
                                    if (b10 == 0) {
                                        cVar2 = cVar7;
                                    } else {
                                        int[] iArr10 = new int[(d03 + 1)];
                                        iArr10[c8] = b10;
                                        cVar2 = new R2.c(aVar, iArr10);
                                    }
                                    cVar14 = cVar14.E(cVar2);
                                    if (d03 >= 0) {
                                        U3.a aVar3 = (U3.a) cVar4.f4336V;
                                        if (b10 == 0) {
                                            cVar3 = aVar3.f5430c;
                                        } else {
                                            int[] iArr11 = (int[]) cVar4.f4337W;
                                            int length5 = iArr11.length;
                                            int[] iArr12 = new int[(d03 + length5)];
                                            int i30 = 0;
                                            while (i30 < length5) {
                                                iArr12[i30] = aVar3.b(iArr11[i30], b10);
                                                i30++;
                                                length5 = length5;
                                            }
                                            cVar3 = new R2.c(aVar3, iArr12);
                                        }
                                        cVar11 = cVar11.E(cVar3);
                                        int i31 = i;
                                        c8 = 0;
                                    } else {
                                        throw new IllegalArgumentException();
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                            cVar14.getClass();
                            U3.a aVar4 = (U3.a) cVar14.f4336V;
                            if (aVar4.equals((U3.a) cVar8.f4336V)) {
                                if (cVar14.p0() || cVar8.p0()) {
                                    cVar = aVar4.f5430c;
                                } else {
                                    int[] iArr13 = (int[]) cVar14.f4337W;
                                    int length6 = iArr13.length;
                                    int[] iArr14 = (int[]) cVar8.f4337W;
                                    int length7 = iArr14.length;
                                    int[] iArr15 = new int[((length6 + length7) - 1)];
                                    int i32 = 0;
                                    while (i32 < length6) {
                                        int i33 = iArr13[i32];
                                        int[] iArr16 = iArr13;
                                        int i34 = 0;
                                        while (i34 < length7) {
                                            int i35 = i32 + i34;
                                            iArr15[i35] = iArr15[i35] ^ aVar4.b(i33, iArr14[i34]);
                                            i34++;
                                            length6 = length6;
                                        }
                                        i32++;
                                        iArr13 = iArr16;
                                        length6 = length6;
                                    }
                                    cVar = new R2.c(aVar4, iArr15);
                                }
                                R2.c E8 = cVar.E(cVar9);
                                if (cVar11.d0() < cVar4.d0()) {
                                    cVar9 = cVar8;
                                    c8 = 0;
                                    cVar8 = E8;
                                    i12 = i;
                                } else {
                                    throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
                                }
                            } else {
                                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                            }
                        } else {
                            throw new Exception("r_{i-1} was zero");
                        }
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public K x() {
        return (C0053k0) this.f2027U;
    }

    public S0.a x0() {
        return null;
    }

    public Y0.c y0() {
        return (Y0.c) this.f2027U;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [Y6.o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List z(Y6.o r26) {
        /*
            r25 = this;
            r1 = r26
            r0 = 1
            D6.r r2 = D6.r.f1269U
            java.lang.String r3 = "url"
            P6.f.e(r1, r3)
            r3 = 0
            r4 = r25
            java.lang.Object r5 = r4.f2027U     // Catch:{ IOException -> 0x0133 }
            de.ozerov.fully.j5 r5 = (de.ozerov.fully.j5) r5     // Catch:{ IOException -> 0x0133 }
            java.net.URI r6 = r26.f()     // Catch:{ IOException -> 0x0133 }
            D6.s r7 = D6.s.f1270U     // Catch:{ IOException -> 0x0133 }
            java.util.Map r5 = r5.get(r6, r7)     // Catch:{ IOException -> 0x0133 }
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0025:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0127
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            java.lang.String r8 = "Cookie"
            boolean r8 = r8.equalsIgnoreCase(r7)
            if (r8 != 0) goto L_0x004d
            java.lang.String r8 = "Cookie2"
            boolean r7 = r8.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x0025
        L_0x004d:
            java.lang.String r7 = "value"
            P6.f.d(r6, r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0025
            java.util.Iterator r6 = r6.iterator()
        L_0x005c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0025
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r3 != 0) goto L_0x006f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x006f:
            java.lang.String r8 = "header"
            P6.f.d(r7, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r7.length()
            r10 = 0
            r11 = 0
        L_0x007f:
            if (r11 >= r9) goto L_0x0122
            java.lang.String r12 = ";,"
            int r12 = Z6.b.f(r7, r11, r12, r9)
            r13 = 61
            int r13 = Z6.b.e(r7, r13, r11, r12)
            java.lang.String r15 = Z6.b.x(r11, r13, r7)
            java.lang.String r11 = "$"
            boolean r11 = W6.l.a0(r15, r11, r10)
            if (r11 == 0) goto L_0x009c
        L_0x0099:
            int r11 = r12 + 1
            goto L_0x007f
        L_0x009c:
            if (r13 >= r12) goto L_0x00a4
            int r13 = r13 + r0
            java.lang.String r11 = Z6.b.x(r13, r12, r7)
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r11 = ""
        L_0x00a6:
            java.lang.String r13 = "\""
            boolean r14 = W6.l.a0(r11, r13, r10)
            if (r14 == 0) goto L_0x00c2
            boolean r13 = r11.endsWith(r13)
            if (r13 == 0) goto L_0x00c2
            int r13 = r11.length()
            int r13 = r13 - r0
            java.lang.String r11 = r11.substring(r0, r13)
            java.lang.String r13 = "this as java.lang.String…ing(startIndex, endIndex)"
            P6.f.d(r11, r13)
        L_0x00c2:
            java.lang.CharSequence r13 = W6.d.s0(r15)
            java.lang.String r13 = r13.toString()
            boolean r13 = P6.f.a(r13, r15)
            if (r13 == 0) goto L_0x011a
            java.lang.CharSequence r13 = W6.d.s0(r11)
            java.lang.String r13 = r13.toString()
            boolean r13 = P6.f.a(r13, r11)
            if (r13 == 0) goto L_0x0112
            java.lang.String r13 = r1.f6672d
            java.lang.String r14 = "domain"
            P6.f.e(r13, r14)
            java.lang.String r19 = android.support.v4.media.session.b.N(r13)
            if (r19 == 0) goto L_0x0106
            Y6.i r13 = new Y6.i
            r22 = 0
            r23 = 0
            r17 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            java.lang.String r20 = "/"
            r21 = 0
            r24 = 0
            r14 = r13
            r16 = r11
            r14.<init>(r15, r16, r17, r19, r20, r21, r22, r23, r24)
            r8.add(r13)
            goto L_0x0099
        L_0x0106:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unexpected domain: "
            java.lang.String r1 = r1.concat(r13)
            r0.<init>(r1)
            throw r0
        L_0x0112:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "value is not trimmed"
            r0.<init>(r1)
            throw r0
        L_0x011a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "name is not trimmed"
            r0.<init>(r1)
            throw r0
        L_0x0122:
            r3.addAll(r8)
            goto L_0x005c
        L_0x0127:
            if (r3 == 0) goto L_0x0132
            java.util.List r2 = j$.util.DesugarCollections.unmodifiableList(r3)
            java.lang.String r0 = "{\n      Collections.unmo…fiableList(cookies)\n    }"
            P6.f.d(r2, r0)
        L_0x0132:
            return r2
        L_0x0133:
            r0 = move-exception
            g7.n r5 = g7.n.f12045a
            g7.n r5 = g7.n.f12045a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Loading cookies failed for "
            r6.<init>(r7)
            java.lang.String r7 = "/..."
            Y6.n r8 = new Y6.n     // Catch:{ IllegalArgumentException -> 0x014a }
            r8.<init>()     // Catch:{ IllegalArgumentException -> 0x014a }
            r8.c(r1, r7)     // Catch:{ IllegalArgumentException -> 0x014a }
            goto L_0x014c
        L_0x014a:
            r8 = r3
        L_0x014c:
            if (r8 == 0) goto L_0x0152
            Y6.o r3 = r8.a()
        L_0x0152:
            P6.f.b(r3)
            r6.append(r3)
            java.lang.String r1 = r6.toString()
            r5.getClass()
            r3 = 5
            g7.n.i(r3, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.P.z(Y6.o):java.util.List");
    }

    public UUID z0() {
        return C0119g.f2943a;
    }

    public P(int i) {
        switch (i) {
            case 9:
                this.f2027U = new G(1);
                return;
            case 23:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                P6.f.e(timeUnit, "timeUnit");
                this.f2027U = new c7.k(C0598d.f8695h, timeUnit);
                return;
            case 25:
                this.f2027U = new LinkedHashMap(0, 0.75f, true);
                return;
            case 27:
                this.f2027U = new LinkedHashMap(5, 1.0f, false);
                return;
            case 29:
                this.f2027U = new SparseArray();
                return;
            default:
                this.f2027U = new A.f(28);
                return;
        }
    }
}
