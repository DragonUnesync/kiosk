package T0;

import B.B;
import B.C0002c;
import D2.G;
import E2.a;
import H3.O;
import H3.P;
import H3.i0;
import K.b;
import M0.C;
import M0.C0117e;
import M0.C0123k;
import M0.C0124l;
import M0.C0128p;
import M0.D;
import M0.E;
import M0.F;
import M0.M;
import M0.Q;
import M0.V;
import M0.W;
import M0.X;
import M0.c0;
import M0.e0;
import M0.h0;
import O0.c;
import P0.l;
import P0.s;
import P0.v;
import P0.z;
import U0.d;
import U0.j;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.bumptech.glide.manager.q;
import h1.C1030A;
import h1.C1031B;
import h1.b0;
import h1.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import k1.C1140i;
import k1.C1141j;
import k1.p;
import k1.r;
import k1.t;
import k1.u;
import k2.C1160q;
import l1.h;
import o1.k;

/* renamed from: T0.y  reason: case insensitive filesystem */
public final class C0232y extends a implements ExoPlayer {

    /* renamed from: A0  reason: collision with root package name */
    public int f4912A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f4913B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f4914C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f4915D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f4916E0;

    /* renamed from: F0  reason: collision with root package name */
    public final e0 f4917F0;

    /* renamed from: G0  reason: collision with root package name */
    public b0 f4918G0;

    /* renamed from: H0  reason: collision with root package name */
    public final C0222n f4919H0;

    /* renamed from: I0  reason: collision with root package name */
    public M f4920I0;

    /* renamed from: J0  reason: collision with root package name */
    public F f4921J0;

    /* renamed from: K0  reason: collision with root package name */
    public Object f4922K0;

    /* renamed from: L0  reason: collision with root package name */
    public Surface f4923L0;

    /* renamed from: M0  reason: collision with root package name */
    public SurfaceHolder f4924M0;

    /* renamed from: N0  reason: collision with root package name */
    public k f4925N0;

    /* renamed from: O0  reason: collision with root package name */
    public boolean f4926O0;

    /* renamed from: P0  reason: collision with root package name */
    public TextureView f4927P0;

    /* renamed from: Q0  reason: collision with root package name */
    public final int f4928Q0;

    /* renamed from: R0  reason: collision with root package name */
    public s f4929R0;

    /* renamed from: S0  reason: collision with root package name */
    public final C0117e f4930S0;

    /* renamed from: T0  reason: collision with root package name */
    public final float f4931T0;

    /* renamed from: U0  reason: collision with root package name */
    public boolean f4932U0;

    /* renamed from: V0  reason: collision with root package name */
    public c f4933V0;

    /* renamed from: W  reason: collision with root package name */
    public final u f4934W;

    /* renamed from: W0  reason: collision with root package name */
    public final boolean f4935W0;

    /* renamed from: X  reason: collision with root package name */
    public final M f4936X;

    /* renamed from: X0  reason: collision with root package name */
    public boolean f4937X0;

    /* renamed from: Y  reason: collision with root package name */
    public final b f4938Y = new Object();

    /* renamed from: Y0  reason: collision with root package name */
    public final int f4939Y0;

    /* renamed from: Z  reason: collision with root package name */
    public final Context f4940Z;

    /* renamed from: Z0  reason: collision with root package name */
    public h0 f4941Z0;

    /* renamed from: a0  reason: collision with root package name */
    public final Q f4942a0;

    /* renamed from: a1  reason: collision with root package name */
    public F f4943a1;

    /* renamed from: b0  reason: collision with root package name */
    public final C0213e[] f4944b0;

    /* renamed from: b1  reason: collision with root package name */
    public X f4945b1;

    /* renamed from: c0  reason: collision with root package name */
    public final t f4946c0;

    /* renamed from: c1  reason: collision with root package name */
    public int f4947c1;

    /* renamed from: d0  reason: collision with root package name */
    public final v f4948d0;

    /* renamed from: d1  reason: collision with root package name */
    public long f4949d1;

    /* renamed from: e0  reason: collision with root package name */
    public final C0226s f4950e0;

    /* renamed from: f0  reason: collision with root package name */
    public final F f4951f0;

    /* renamed from: g0  reason: collision with root package name */
    public final P0.k f4952g0;

    /* renamed from: h0  reason: collision with root package name */
    public final CopyOnWriteArraySet f4953h0;

    /* renamed from: i0  reason: collision with root package name */
    public final V f4954i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f4955j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f4956k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C1030A f4957l0;

    /* renamed from: m0  reason: collision with root package name */
    public final d f4958m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Looper f4959n0;

    /* renamed from: o0  reason: collision with root package name */
    public final l1.d f4960o0;
    public final long p0;

    /* renamed from: q0  reason: collision with root package name */
    public final long f4961q0;

    /* renamed from: r0  reason: collision with root package name */
    public final long f4962r0;

    /* renamed from: s0  reason: collision with root package name */
    public final P0.t f4963s0;

    /* renamed from: t0  reason: collision with root package name */
    public final C0229v f4964t0;

    /* renamed from: u0  reason: collision with root package name */
    public final C0230w f4965u0;

    /* renamed from: v0  reason: collision with root package name */
    public final q f4966v0;

    /* renamed from: w0  reason: collision with root package name */
    public final C0212d f4967w0;

    /* renamed from: x0  reason: collision with root package name */
    public final g0 f4968x0;

    /* renamed from: y0  reason: collision with root package name */
    public final g0 f4969y0;

    /* renamed from: z0  reason: collision with root package name */
    public final long f4970z0;

    static {
        D.a("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, K.b] */
    /* JADX WARNING: type inference failed for: r9v4, types: [T0.w, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0232y(C0221m mVar) {
        super(2);
        boolean z;
        j m8;
        int i;
        boolean equals;
        C0221m mVar2 = mVar;
        try {
            l.s("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0] [" + z.e + "]");
            this.f4940Z = mVar2.f4871a.getApplicationContext();
            this.f4958m0 = new d(mVar2.f4872b);
            this.f4939Y0 = mVar2.f4877h;
            this.f4930S0 = mVar2.i;
            this.f4928Q0 = mVar2.f4878j;
            this.f4932U0 = false;
            this.f4970z0 = mVar2.f4886r;
            C0229v vVar = new C0229v(this);
            this.f4964t0 = vVar;
            this.f4965u0 = new Object();
            Handler handler = new Handler(mVar2.f4876g);
            C0213e[] a8 = ((C0219k) mVar2.f4873c.get()).a(handler, vVar, vVar, vVar, vVar);
            this.f4944b0 = a8;
            if (a8.length > 0) {
                z = true;
            } else {
                z = false;
            }
            l.j(z);
            this.f4946c0 = (t) mVar2.e.get();
            this.f4957l0 = (C1030A) mVar2.f4874d.get();
            this.f4960o0 = (l1.d) mVar2.f4875f.get();
            this.f4956k0 = mVar2.f4879k;
            this.f4917F0 = mVar2.f4880l;
            this.p0 = mVar2.f4881m;
            this.f4961q0 = mVar2.f4882n;
            this.f4962r0 = mVar2.f4883o;
            Looper looper = mVar2.f4876g;
            this.f4959n0 = looper;
            P0.t tVar = mVar2.f4872b;
            this.f4963s0 = tVar;
            this.f4942a0 = this;
            this.f4952g0 = new P0.k(looper, tVar, new C0226s(this));
            this.f4953h0 = new CopyOnWriteArraySet();
            this.f4955j0 = new ArrayList();
            this.f4918G0 = new b0();
            this.f4919H0 = C0222n.f4890a;
            this.f4934W = new u(new d0[a8.length], new r[a8.length], e0.f2940b, (Q0.t) null);
            this.f4954i0 = new V();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i8 = 0; i8 < 20; i8++) {
                int i9 = iArr[i8];
                l.j(!false);
                sparseBooleanArray.append(i9, true);
            }
            this.f4946c0.getClass();
            l.j(!false);
            sparseBooleanArray.append(29, true);
            l.j(!false);
            C0128p pVar = new C0128p(sparseBooleanArray);
            this.f4936X = new M(pVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i10 = 0; i10 < pVar.f2977a.size(); i10++) {
                int a9 = pVar.a(i10);
                l.j(!false);
                sparseBooleanArray2.append(a9, true);
            }
            l.j(!false);
            sparseBooleanArray2.append(4, true);
            l.j(!false);
            sparseBooleanArray2.append(10, true);
            l.j(!false);
            this.f4920I0 = new M(new C0128p(sparseBooleanArray2));
            this.f4948d0 = this.f4963s0.a(this.f4959n0, (Handler.Callback) null);
            C0226s sVar = new C0226s(this);
            this.f4950e0 = sVar;
            this.f4945b1 = X.i(this.f4934W);
            this.f4958m0.M(this.f4942a0, this.f4959n0);
            if (z.f3748a < 31) {
                m8 = new j(mVar2.f4889u);
            } else {
                m8 = g7.l.m(this.f4940Z, this, mVar2.f4887s, mVar2.f4889u);
            }
            j jVar = m8;
            C0213e[] eVarArr = this.f4944b0;
            t tVar2 = this.f4946c0;
            u uVar = this.f4934W;
            C0218j jVar2 = new C0218j();
            l1.d dVar = this.f4960o0;
            int i11 = this.f4912A0;
            boolean z6 = this.f4913B0;
            d dVar2 = this.f4958m0;
            e0 e0Var = this.f4917F0;
            C0216h hVar = mVar2.f4884p;
            long j7 = mVar2.f4885q;
            Handler handler2 = handler;
            Looper looper2 = this.f4959n0;
            this.f4951f0 = new F(eVarArr, tVar2, uVar, jVar2, dVar, i11, z6, dVar2, e0Var, hVar, j7, looper2, this.f4963s0, sVar, jVar, this.f4919H0);
            this.f4931T0 = 1.0f;
            this.f4912A0 = 0;
            F f8 = F.z;
            this.f4921J0 = f8;
            this.f4943a1 = f8;
            this.f4947c1 = -1;
            AudioManager audioManager = (AudioManager) this.f4940Z.getSystemService("audio");
            if (audioManager == null) {
                i = -1;
            } else {
                i = audioManager.generateAudioSessionId();
            }
            this.f4933V0 = c.f3543b;
            this.f4935W0 = true;
            d dVar3 = this.f4958m0;
            dVar3.getClass();
            this.f4952g0.a(dVar3);
            l1.d dVar4 = this.f4960o0;
            Handler handler3 = new Handler(this.f4959n0);
            d dVar5 = this.f4958m0;
            h hVar2 = (h) dVar4;
            hVar2.getClass();
            dVar5.getClass();
            C1160q qVar = hVar2.f13122b;
            qVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) qVar.f13026V;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                l1.c cVar = (l1.c) it.next();
                if (cVar.f13102b == dVar5) {
                    cVar.f13103c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            ((CopyOnWriteArrayList) qVar.f13026V).add(new l1.c(handler3, dVar5));
            this.f4953h0.add(this.f4964t0);
            C0221m mVar3 = mVar;
            Handler handler4 = handler2;
            q qVar2 = new q(mVar3.f4871a, handler4, this.f4964t0);
            this.f4966v0 = qVar2;
            qVar2.l();
            this.f4967w0 = new C0212d(mVar3.f4871a, handler4, this.f4964t0);
            g0 g0Var = new g0(mVar3.f4871a, 0);
            this.f4968x0 = g0Var;
            g0Var.d(false);
            g0 g0Var2 = new g0(mVar3.f4871a, 1);
            this.f4969y0 = g0Var2;
            g0Var2.d(false);
            C0123k kVar = new C0123k(0);
            kVar.f2964b = 0;
            kVar.f2965c = 0;
            new C0124l(kVar);
            this.f4941Z0 = h0.f2952d;
            this.f4929R0 = s.f3735c;
            t tVar3 = this.f4946c0;
            C0117e eVar = this.f4930S0;
            p pVar2 = (p) tVar3;
            synchronized (pVar2.f13000c) {
                equals = pVar2.i.equals(eVar);
                pVar2.i = eVar;
            }
            if (!equals) {
                pVar2.f();
            }
            N(1, 10, Integer.valueOf(i));
            N(2, 10, Integer.valueOf(i));
            N(1, 3, this.f4930S0);
            N(2, 4, Integer.valueOf(this.f4928Q0));
            N(2, 5, 0);
            N(1, 9, Boolean.valueOf(this.f4932U0));
            N(2, 7, this.f4965u0);
            N(6, 8, this.f4965u0);
            N(-1, 16, Integer.valueOf(this.f4939Y0));
            this.f4938Y.e();
        } catch (Throwable th) {
            this.f4938Y.e();
            throw th;
        }
    }

    public static long E(X x8) {
        W w2 = new W();
        V v4 = new V();
        x8.f4749a.g(x8.f4750b.f12277a, v4);
        long j7 = x8.f4751c;
        if (j7 != -9223372036854775807L) {
            return v4.e + j7;
        }
        return x8.f4749a.m(v4.f2864c, w2, 0).f2879l;
    }

    public final e0 A() {
        Y();
        return this.f4945b1.i.f13012d;
    }

    public final int B(X x8) {
        if (x8.f4749a.p()) {
            return this.f4947c1;
        }
        return x8.f4749a.g(x8.f4750b.f12277a, this.f4954i0).f2864c;
    }

    public final boolean C() {
        Y();
        return this.f4945b1.f4758l;
    }

    public final int D() {
        Y();
        return this.f4945b1.e;
    }

    public final C1141j F() {
        Y();
        return ((p) this.f4946c0).e();
    }

    public final boolean G() {
        Y();
        return this.f4945b1.f4750b.b();
    }

    public final X H(X x8, X x9, Pair pair) {
        boolean z;
        C1031B b8;
        f0 f0Var;
        u uVar;
        List list;
        int i;
        long j7;
        X x10 = x9;
        Pair pair2 = pair;
        if (x9.p() || pair2 != null) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        X x11 = x8.f4749a;
        long s8 = s(x8);
        X h5 = x8.h(x9);
        if (x9.p()) {
            C1031B b9 = X.f4748u;
            long O8 = z.O(this.f4949d1);
            C1031B b10 = b9;
            long j8 = O8;
            long j9 = O8;
            X b11 = h5.c(b10, j8, j9, O8, 0, f0.f12468d, this.f4934W, i0.f2073Y).b(b9);
            b11.f4763q = b11.f4765s;
            return b11;
        }
        Object obj = h5.f4750b.f12277a;
        boolean equals = obj.equals(pair2.first);
        if (!equals) {
            b8 = new C1031B(pair2.first);
        } else {
            b8 = h5.f4750b;
        }
        C1031B b12 = b8;
        long longValue = ((Long) pair2.second).longValue();
        long O9 = z.O(s8);
        if (!x11.p()) {
            O9 -= x11.g(obj, this.f4954i0).e;
        }
        if (!equals || longValue < O9) {
            long j10 = longValue;
            C1031B b13 = b12;
            l.j(!b13.b());
            if (!equals) {
                f0Var = f0.f12468d;
            } else {
                f0Var = h5.f4755h;
            }
            f0 f0Var2 = f0Var;
            if (!equals) {
                uVar = this.f4934W;
            } else {
                uVar = h5.i;
            }
            u uVar2 = uVar;
            if (!equals) {
                H3.M m8 = O.f2026V;
                list = i0.f2073Y;
            } else {
                list = h5.f4756j;
            }
            X b14 = h5.c(b13, j10, j10, j10, 0, f0Var2, uVar2, list).b(b13);
            b14.f4763q = j10;
            return b14;
        } else if (i == 0) {
            int b15 = x10.b(h5.f4757k.f12277a);
            if (b15 != -1 && x10.f(b15, this.f4954i0, false).f2864c == x10.g(b12.f12277a, this.f4954i0).f2864c) {
                return h5;
            }
            x10.g(b12.f12277a, this.f4954i0);
            if (b12.b()) {
                j7 = this.f4954i0.a(b12.f12278b, b12.f12279c);
            } else {
                j7 = this.f4954i0.f2865d;
            }
            C1031B b16 = b12;
            X b17 = h5.c(b12, h5.f4765s, h5.f4765s, h5.f4752d, j7 - h5.f4765s, h5.f4755h, h5.i, h5.f4756j).b(b16);
            b17.f4763q = j7;
            return b17;
        } else {
            C1031B b18 = b12;
            l.j(!b18.b());
            long max = Math.max(0, h5.f4764r - (longValue - O9));
            long j11 = h5.f4763q;
            if (h5.f4757k.equals(h5.f4750b)) {
                j11 = longValue + max;
            }
            X c8 = h5.c(b18, longValue, longValue, longValue, max, h5.f4755h, h5.i, h5.f4756j);
            c8.f4763q = j11;
            return c8;
        }
    }

    public final Pair I(X x8, int i, long j7) {
        if (x8.p()) {
            this.f4947c1 = i;
            if (j7 == -9223372036854775807L) {
                j7 = 0;
            }
            this.f4949d1 = j7;
            return null;
        }
        if (i == -1 || i >= x8.o()) {
            i = x8.a(this.f4913B0);
            j7 = z.c0(x8.m(i, (W) this.f1328V, 0).f2879l);
        }
        return x8.i((W) this.f1328V, this.f4954i0, i, z.O(j7));
    }

    public final void J(int i, int i8) {
        s sVar = this.f4929R0;
        if (i != sVar.f3736a || i8 != sVar.f3737b) {
            this.f4929R0 = new s(i, i8);
            this.f4952g0.e(24, new C0224p(i, i8));
            N(2, 14, new s(i, i8));
        }
    }

    public final void K() {
        int i;
        Y();
        boolean C8 = C();
        int i8 = 2;
        int c8 = this.f4967w0.c(2, C8);
        if (c8 == -1) {
            i = 2;
        } else {
            i = 1;
        }
        V(c8, i, C8);
        X x8 = this.f4945b1;
        if (x8.e == 1) {
            X e = x8.e((C0220l) null);
            if (e.f4749a.p()) {
                i8 = 4;
            }
            X g8 = e.g(i8);
            this.f4914C0++;
            v vVar = this.f4951f0.f4646c0;
            vVar.getClass();
            P0.u b8 = v.b();
            b8.f3739a = vVar.f3741a.obtainMessage(29);
            b8.b();
            W(g8, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void L(M0.O o2) {
        Y();
        o2.getClass();
        P0.k kVar = this.f4952g0;
        kVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = kVar.f3714d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            P0.j jVar = (P0.j) it.next();
            if (jVar.f3707a.equals(o2)) {
                jVar.f3710d = true;
                if (jVar.f3709c) {
                    jVar.f3709c = false;
                    C0128p d8 = jVar.f3708b.d();
                    kVar.f3713c.b(jVar.f3707a, d8);
                }
                copyOnWriteArraySet.remove(jVar);
            }
        }
    }

    public final void M() {
        k kVar = this.f4925N0;
        C0229v vVar = this.f4964t0;
        if (kVar != null) {
            a0 r8 = r(this.f4965u0);
            l.j(!r8.f4775g);
            r8.f4773d = 10000;
            l.j(!r8.f4775g);
            r8.e = null;
            r8.c();
            this.f4925N0.f14188U.remove(vVar);
            this.f4925N0 = null;
        }
        TextureView textureView = this.f4927P0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != vVar) {
                l.B("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f4927P0.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f4927P0 = null;
        }
        SurfaceHolder surfaceHolder = this.f4924M0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(vVar);
            this.f4924M0 = null;
        }
    }

    public final void N(int i, int i8, Object obj) {
        for (C0213e eVar : this.f4944b0) {
            if (i == -1 || eVar.f4799V == i) {
                a0 r8 = r(eVar);
                l.j(!r8.f4775g);
                r8.f4773d = i8;
                l.j(!r8.f4775g);
                r8.e = obj;
                r8.c();
            }
        }
    }

    public final void O(SurfaceHolder surfaceHolder) {
        this.f4926O0 = false;
        this.f4924M0 = surfaceHolder;
        surfaceHolder.addCallback(this.f4964t0);
        Surface surface = this.f4924M0.getSurface();
        if (surface == null || !surface.isValid()) {
            J(0, 0);
            return;
        }
        Rect surfaceFrame = this.f4924M0.getSurfaceFrame();
        J(surfaceFrame.width(), surfaceFrame.height());
    }

    public final void P(boolean z) {
        int i;
        Y();
        int c8 = this.f4967w0.c(D(), z);
        if (c8 == -1) {
            i = 2;
        } else {
            i = 1;
        }
        V(c8, i, z);
    }

    public final void Q(int i) {
        Y();
        if (this.f4912A0 != i) {
            this.f4912A0 = i;
            v vVar = this.f4951f0.f4646c0;
            vVar.getClass();
            P0.u b8 = v.b();
            b8.f3739a = vVar.f3741a.obtainMessage(11, i, 0);
            b8.b();
            C0225q qVar = new C0225q(i);
            P0.k kVar = this.f4952g0;
            kVar.c(8, qVar);
            U();
            kVar.b();
        }
    }

    public final void R(c0 c0Var) {
        Y();
        t tVar = this.f4946c0;
        tVar.getClass();
        p pVar = (p) tVar;
        if (!c0Var.equals(pVar.e())) {
            if (c0Var instanceof C1141j) {
                pVar.j((C1141j) c0Var);
            }
            C1140i iVar = new C1140i(pVar.e());
            iVar.b(c0Var);
            pVar.j(new C1141j(iVar));
            this.f4952g0.e(19, new B(16, c0Var));
        }
    }

    public final void S(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (C0213e eVar : this.f4944b0) {
            if (eVar.f4799V == 2) {
                a0 r8 = r(eVar);
                l.j(!r8.f4775g);
                r8.f4773d = 1;
                l.j(true ^ r8.f4775g);
                r8.e = obj;
                r8.c();
                arrayList.add(r8);
            }
        }
        Object obj2 = this.f4922K0;
        if (!(obj2 == null || obj2 == obj)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((a0) it.next()).a(this.f4970z0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.f4922K0;
            Surface surface = this.f4923L0;
            if (obj3 == surface) {
                surface.release();
                this.f4923L0 = null;
            }
        }
        this.f4922K0 = obj;
        if (z) {
            T(new C0220l(2, new C6.b("Detaching surface timed out.", 4), 1003));
        }
    }

    public final void T(C0220l lVar) {
        X x8 = this.f4945b1;
        X b8 = x8.b(x8.f4750b);
        b8.f4763q = b8.f4765s;
        b8.f4764r = 0;
        X g8 = b8.g(1);
        if (lVar != null) {
            g8 = g8.e(lVar);
        }
        X x9 = g8;
        this.f4914C0++;
        v vVar = this.f4951f0.f4646c0;
        vVar.getClass();
        P0.u b9 = v.b();
        b9.f3739a = vVar.f3741a.obtainMessage(6);
        b9.b();
        W(x9, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void U() {
        int i;
        boolean z;
        int i8;
        boolean z6;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        M m8 = this.f4920I0;
        int i9 = z.f3748a;
        C0232y yVar = (C0232y) this.f4942a0;
        boolean G8 = yVar.G();
        boolean h5 = yVar.h();
        X z15 = yVar.z();
        if (z15.p()) {
            i = -1;
        } else {
            int v4 = yVar.v();
            yVar.Y();
            int i10 = yVar.f4912A0;
            if (i10 == 1) {
                i10 = 0;
            }
            yVar.Y();
            i = z15.k(v4, i10, yVar.f4913B0);
        }
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        X z16 = yVar.z();
        if (z16.p()) {
            i8 = -1;
        } else {
            int v8 = yVar.v();
            yVar.Y();
            int i11 = yVar.f4912A0;
            if (i11 == 1) {
                i11 = 0;
            }
            yVar.Y();
            i8 = z16.e(v8, i11, yVar.f4913B0);
        }
        if (i8 != -1) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean g8 = yVar.g();
        boolean f8 = yVar.f();
        boolean p3 = yVar.z().p();
        P p8 = new P(9);
        C0128p pVar = this.f4936X.f2849a;
        G g9 = (G) p8.f2027U;
        g9.getClass();
        for (int i12 = 0; i12 < pVar.f2977a.size(); i12++) {
            g9.c(pVar.a(i12));
        }
        boolean z17 = !G8;
        p8.u0(4, z17);
        if (!h5 || G8) {
            z8 = false;
        } else {
            z8 = true;
        }
        p8.u0(5, z8);
        if (!z || G8) {
            z9 = false;
        } else {
            z9 = true;
        }
        p8.u0(6, z9);
        if (p3 || ((!z && g8 && !h5) || G8)) {
            z10 = false;
        } else {
            z10 = true;
        }
        p8.u0(7, z10);
        if (!z6 || G8) {
            z11 = false;
        } else {
            z11 = true;
        }
        p8.u0(8, z11);
        if (p3 || ((!z6 && (!g8 || !f8)) || G8)) {
            z12 = false;
        } else {
            z12 = true;
        }
        p8.u0(9, z12);
        p8.u0(10, z17);
        if (!h5 || G8) {
            z13 = false;
        } else {
            z13 = true;
        }
        p8.u0(11, z13);
        if (!h5 || G8) {
            z14 = false;
        }
        p8.u0(12, z14);
        M m9 = new M(g9.d());
        this.f4920I0 = m9;
        if (!m9.equals(m8)) {
            this.f4952g0.c(13, new C0226s(this));
        }
    }

    public final void V(int i, int i8, boolean z) {
        boolean z6;
        int i9 = 0;
        if (!z || i == -1) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (i == 0) {
            i9 = 1;
        }
        X x8 = this.f4945b1;
        if (x8.f4758l != z6 || x8.f4760n != i9 || x8.f4759m != i8) {
            this.f4914C0++;
            X x9 = this.f4945b1;
            if (x9.f4762p) {
                x9 = x9.a();
            }
            X d8 = x9.d(i8, i9, z6);
            int i10 = (i9 << 4) | i8;
            v vVar = this.f4951f0.f4646c0;
            vVar.getClass();
            P0.u b8 = v.b();
            b8.f3739a = vVar.f3741a.obtainMessage(1, z6 ? 1 : 0, i10);
            b8.b();
            W(d8, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0298  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W(T0.X r42, int r43, boolean r44, int r45, long r46, int r48, boolean r49) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            r2 = r45
            T0.X r3 = r0.f4945b1
            r0.f4945b1 = r1
            M0.X r4 = r3.f4749a
            M0.X r5 = r1.f4749a
            boolean r4 = r4.equals(r5)
            M0.X r5 = r3.f4749a
            M0.X r6 = r1.f4749a
            boolean r7 = r6.p()
            r8 = -1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10 = 1
            r12 = 3
            r13 = 0
            if (r7 == 0) goto L_0x0034
            boolean r7 = r5.p()
            if (r7 == 0) goto L_0x0034
            android.util.Pair r5 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.<init>(r6, r9)
            goto L_0x00cc
        L_0x0034:
            boolean r7 = r6.p()
            boolean r8 = r5.p()
            if (r7 == r8) goto L_0x004b
            android.util.Pair r5 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r5.<init>(r6, r7)
            goto L_0x00cc
        L_0x004b:
            h1.B r7 = r3.f4750b
            java.lang.Object r8 = r7.f12277a
            M0.V r12 = r0.f4954i0
            M0.V r8 = r5.g(r8, r12)
            int r8 = r8.f2864c
            java.lang.Object r11 = r0.f1328V
            M0.W r11 = (M0.W) r11
            M0.W r5 = r5.m(r8, r11, r13)
            java.lang.Object r5 = r5.f2870a
            h1.B r8 = r1.f4750b
            java.lang.Object r15 = r8.f12277a
            M0.V r12 = r6.g(r15, r12)
            int r12 = r12.f2864c
            M0.W r6 = r6.m(r12, r11, r13)
            java.lang.Object r6 = r6.f2870a
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0099
            if (r44 == 0) goto L_0x007d
            if (r2 != 0) goto L_0x007d
            r5 = 1
            goto L_0x0086
        L_0x007d:
            if (r44 == 0) goto L_0x0083
            if (r2 != r10) goto L_0x0083
            r5 = 2
            goto L_0x0086
        L_0x0083:
            if (r4 != 0) goto L_0x0093
            r5 = 3
        L_0x0086:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.<init>(r7, r5)
            r5 = r6
            goto L_0x00cc
        L_0x0093:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0099:
            if (r44 == 0) goto L_0x00b2
            if (r2 != 0) goto L_0x00b2
            long r5 = r7.f12280d
            long r7 = r8.f12280d
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x00b2
            android.util.Pair r5 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r5.<init>(r6, r8)
            goto L_0x00cc
        L_0x00b2:
            if (r44 == 0) goto L_0x00c5
            if (r2 != r10) goto L_0x00c5
            if (r49 == 0) goto L_0x00c5
            android.util.Pair r5 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r5.<init>(r6, r8)
            goto L_0x00cc
        L_0x00c5:
            android.util.Pair r5 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.<init>(r6, r9)
        L_0x00cc:
            java.lang.Object r6 = r5.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r5 = r5.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r6 == 0) goto L_0x0107
            M0.X r8 = r1.f4749a
            boolean r8 = r8.p()
            if (r8 != 0) goto L_0x0101
            M0.X r8 = r1.f4749a
            h1.B r9 = r1.f4750b
            java.lang.Object r9 = r9.f12277a
            M0.V r11 = r0.f4954i0
            M0.V r8 = r8.g(r9, r11)
            int r8 = r8.f2864c
            M0.X r9 = r1.f4749a
            java.lang.Object r11 = r0.f1328V
            M0.W r11 = (M0.W) r11
            M0.W r8 = r9.m(r8, r11, r13)
            M0.C r8 = r8.f2872c
            goto L_0x0102
        L_0x0101:
            r8 = 0
        L_0x0102:
            M0.F r9 = M0.F.z
            r0.f4943a1 = r9
            goto L_0x0108
        L_0x0107:
            r8 = 0
        L_0x0108:
            if (r6 != 0) goto L_0x0114
            java.util.List r9 = r3.f4756j
            java.util.List r11 = r1.f4756j
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0146
        L_0x0114:
            M0.F r9 = r0.f4943a1
            M0.E r9 = r9.a()
            java.util.List r11 = r1.f4756j
            r12 = 0
        L_0x011d:
            int r15 = r11.size()
            if (r12 >= r15) goto L_0x013f
            java.lang.Object r15 = r11.get(r12)
            M0.H r15 = (M0.H) r15
            r7 = 0
        L_0x012a:
            M0.G[] r10 = r15.f2837U
            int r13 = r10.length
            if (r7 >= r13) goto L_0x0139
            r10 = r10[r7]
            r10.e(r9)
            int r7 = r7 + 1
            r13 = 0
            goto L_0x012a
        L_0x0139:
            int r12 = r12 + 1
            r10 = 1
            r13 = 0
            goto L_0x011d
        L_0x013f:
            M0.F r7 = new M0.F
            r7.<init>(r9)
            r0.f4943a1 = r7
        L_0x0146:
            M0.F r7 = r41.p()
            M0.F r9 = r0.f4921J0
            boolean r9 = r7.equals(r9)
            r0.f4921J0 = r7
            boolean r7 = r3.f4758l
            boolean r10 = r1.f4758l
            if (r7 == r10) goto L_0x015a
            r7 = 1
            goto L_0x015b
        L_0x015a:
            r7 = 0
        L_0x015b:
            int r10 = r3.e
            int r11 = r1.e
            if (r10 == r11) goto L_0x0163
            r10 = 1
            goto L_0x0164
        L_0x0163:
            r10 = 0
        L_0x0164:
            if (r10 != 0) goto L_0x0168
            if (r7 == 0) goto L_0x016b
        L_0x0168:
            r41.X()
        L_0x016b:
            boolean r11 = r3.f4754g
            boolean r12 = r1.f4754g
            if (r11 == r12) goto L_0x0173
            r11 = 1
            goto L_0x0174
        L_0x0173:
            r11 = 0
        L_0x0174:
            if (r4 != 0) goto L_0x0184
            P0.k r4 = r0.f4952g0
            A3.b r12 = new A3.b
            r13 = 1
            r14 = r43
            r12.<init>(r14, r13, r1)
            r13 = 0
            r4.c(r13, r12)
        L_0x0184:
            if (r44 == 0) goto L_0x02ba
            M0.V r4 = new M0.V
            r4.<init>()
            M0.X r12 = r3.f4749a
            boolean r12 = r12.p()
            if (r12 != 0) goto L_0x01c9
            h1.B r12 = r3.f4750b
            java.lang.Object r12 = r12.f12277a
            M0.X r13 = r3.f4749a
            r13.g(r12, r4)
            int r13 = r4.f2864c
            M0.X r14 = r3.f4749a
            int r14 = r14.b(r12)
            M0.X r15 = r3.f4749a
            r16 = r12
            java.lang.Object r12 = r0.f1328V
            M0.W r12 = (M0.W) r12
            r17 = r10
            r18 = r11
            r10 = 0
            M0.W r12 = r15.m(r13, r12, r10)
            java.lang.Object r10 = r12.f2870a
            java.lang.Object r11 = r0.f1328V
            M0.W r11 = (M0.W) r11
            M0.C r11 = r11.f2872c
            r20 = r10
            r22 = r11
            r21 = r13
            r24 = r14
            r23 = r16
            goto L_0x01d7
        L_0x01c9:
            r17 = r10
            r18 = r11
            r21 = r48
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = -1
        L_0x01d7:
            if (r2 != 0) goto L_0x0205
            h1.B r10 = r3.f4750b
            boolean r10 = r10.b()
            if (r10 == 0) goto L_0x01f0
            h1.B r10 = r3.f4750b
            int r11 = r10.f12278b
            int r10 = r10.f12279c
            long r10 = r4.a(r11, r10)
            long r12 = E(r3)
            goto L_0x0219
        L_0x01f0:
            h1.B r10 = r3.f4750b
            int r10 = r10.e
            r11 = -1
            if (r10 == r11) goto L_0x01ff
            T0.X r4 = r0.f4945b1
            long r10 = E(r4)
        L_0x01fd:
            r12 = r10
            goto L_0x0219
        L_0x01ff:
            long r10 = r4.e
            long r12 = r4.f2865d
        L_0x0203:
            long r10 = r10 + r12
            goto L_0x01fd
        L_0x0205:
            h1.B r10 = r3.f4750b
            boolean r10 = r10.b()
            if (r10 == 0) goto L_0x0214
            long r10 = r3.f4765s
            long r12 = E(r3)
            goto L_0x0219
        L_0x0214:
            long r10 = r4.e
            long r12 = r3.f4765s
            goto L_0x0203
        L_0x0219:
            M0.P r4 = new M0.P
            long r25 = P0.z.c0(r10)
            long r27 = P0.z.c0(r12)
            h1.B r10 = r3.f4750b
            int r11 = r10.f12278b
            int r10 = r10.f12279c
            r19 = r4
            r29 = r11
            r30 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r29, r30)
            int r10 = r41.v()
            T0.X r11 = r0.f4945b1
            M0.X r11 = r11.f4749a
            boolean r11 = r11.p()
            if (r11 != 0) goto L_0x0273
            T0.X r11 = r0.f4945b1
            h1.B r12 = r11.f4750b
            java.lang.Object r12 = r12.f12277a
            M0.X r11 = r11.f4749a
            M0.V r13 = r0.f4954i0
            r11.g(r12, r13)
            T0.X r11 = r0.f4945b1
            M0.X r11 = r11.f4749a
            int r11 = r11.b(r12)
            T0.X r13 = r0.f4945b1
            M0.X r13 = r13.f4749a
            java.lang.Object r14 = r0.f1328V
            M0.W r14 = (M0.W) r14
            r43 = r11
            r15 = r12
            r11 = 0
            M0.W r11 = r13.m(r10, r14, r11)
            java.lang.Object r11 = r11.f2870a
            M0.C r12 = r14.f2872c
            r34 = r43
            r30 = r11
            r32 = r12
            r33 = r15
            goto L_0x027b
        L_0x0273:
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = -1
        L_0x027b:
            long r35 = P0.z.c0(r46)
            M0.P r11 = new M0.P
            T0.X r12 = r0.f4945b1
            h1.B r12 = r12.f4750b
            boolean r12 = r12.b()
            if (r12 == 0) goto L_0x0298
            T0.X r12 = r0.f4945b1
            long r12 = E(r12)
            long r12 = P0.z.c0(r12)
            r37 = r12
            goto L_0x029a
        L_0x0298:
            r37 = r35
        L_0x029a:
            T0.X r12 = r0.f4945b1
            h1.B r12 = r12.f4750b
            int r13 = r12.f12278b
            int r12 = r12.f12279c
            r29 = r11
            r31 = r10
            r39 = r13
            r40 = r12
            r29.<init>(r30, r31, r32, r33, r34, r35, r37, r39, r40)
            P0.k r10 = r0.f4952g0
            T0.t r12 = new T0.t
            r12.<init>(r2, r4, r11)
            r2 = 11
            r10.c(r2, r12)
            goto L_0x02be
        L_0x02ba:
            r17 = r10
            r18 = r11
        L_0x02be:
            if (r6 == 0) goto L_0x02cc
            P0.k r2 = r0.f4952g0
            A3.b r4 = new A3.b
            r6 = 2
            r4.<init>(r5, r6, r8)
            r5 = 1
            r2.c(r5, r4)
        L_0x02cc:
            T0.l r2 = r3.f4753f
            T0.l r4 = r1.f4753f
            if (r2 == r4) goto L_0x02ef
            P0.k r2 = r0.f4952g0
            T0.o r4 = new T0.o
            r5 = 7
            r4.<init>(r1, r5)
            r5 = 10
            r2.c(r5, r4)
            T0.l r2 = r1.f4753f
            if (r2 == 0) goto L_0x02ef
            P0.k r2 = r0.f4952g0
            T0.o r4 = new T0.o
            r6 = 8
            r4.<init>(r1, r6)
            r2.c(r5, r4)
        L_0x02ef:
            k1.u r2 = r3.i
            k1.u r4 = r1.i
            if (r2 == r4) goto L_0x0309
            k1.t r2 = r0.f4946c0
            Q0.t r4 = r4.e
            r2.getClass()
            P0.k r2 = r0.f4952g0
            T0.o r4 = new T0.o
            r5 = 9
            r4.<init>(r1, r5)
            r5 = 2
            r2.c(r5, r4)
        L_0x0309:
            if (r9 != 0) goto L_0x031b
            M0.F r2 = r0.f4921J0
            P0.k r4 = r0.f4952g0
            B.B r5 = new B.B
            r6 = 15
            r5.<init>(r6, r2)
            r2 = 14
            r4.c(r2, r5)
        L_0x031b:
            if (r18 == 0) goto L_0x0329
            P0.k r2 = r0.f4952g0
            T0.o r4 = new T0.o
            r5 = 0
            r4.<init>(r1, r5)
            r5 = 3
            r2.c(r5, r4)
        L_0x0329:
            if (r17 != 0) goto L_0x032d
            if (r7 == 0) goto L_0x0339
        L_0x032d:
            P0.k r2 = r0.f4952g0
            T0.o r4 = new T0.o
            r5 = 1
            r4.<init>(r1, r5)
            r5 = -1
            r2.c(r5, r4)
        L_0x0339:
            if (r17 == 0) goto L_0x0347
            P0.k r2 = r0.f4952g0
            T0.o r4 = new T0.o
            r5 = 2
            r4.<init>(r1, r5)
            r5 = 4
            r2.c(r5, r4)
        L_0x0347:
            if (r7 != 0) goto L_0x034f
            int r2 = r3.f4759m
            int r4 = r1.f4759m
            if (r2 == r4) goto L_0x035b
        L_0x034f:
            P0.k r2 = r0.f4952g0
            T0.o r4 = new T0.o
            r5 = 3
            r4.<init>(r1, r5)
            r5 = 5
            r2.c(r5, r4)
        L_0x035b:
            int r2 = r3.f4760n
            int r4 = r1.f4760n
            if (r2 == r4) goto L_0x036d
            P0.k r2 = r0.f4952g0
            T0.o r4 = new T0.o
            r5 = 4
            r4.<init>(r1, r5)
            r5 = 6
            r2.c(r5, r4)
        L_0x036d:
            boolean r2 = r3.k()
            boolean r4 = r42.k()
            if (r2 == r4) goto L_0x0383
            P0.k r2 = r0.f4952g0
            T0.o r4 = new T0.o
            r5 = 5
            r4.<init>(r1, r5)
            r5 = 7
            r2.c(r5, r4)
        L_0x0383:
            M0.L r2 = r3.f4761o
            M0.L r4 = r1.f4761o
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x039a
            P0.k r2 = r0.f4952g0
            T0.o r4 = new T0.o
            r5 = 6
            r4.<init>(r1, r5)
            r5 = 12
            r2.c(r5, r4)
        L_0x039a:
            r41.U()
            P0.k r2 = r0.f4952g0
            r2.b()
            boolean r2 = r3.f4762p
            boolean r1 = r1.f4762p
            if (r2 == r1) goto L_0x03c0
            java.util.concurrent.CopyOnWriteArraySet r1 = r0.f4953h0
            java.util.Iterator r1 = r1.iterator()
        L_0x03ae:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03c0
            java.lang.Object r2 = r1.next()
            T0.v r2 = (T0.C0229v) r2
            T0.y r2 = r2.f4905U
            r2.X()
            goto L_0x03ae
        L_0x03c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.C0232y.W(T0.X, int, boolean, int, long, int, boolean):void");
    }

    public final void X() {
        int D8 = D();
        g0 g0Var = this.f4969y0;
        g0 g0Var2 = this.f4968x0;
        boolean z = true;
        if (D8 != 1) {
            if (D8 == 2 || D8 == 3) {
                Y();
                boolean z6 = this.f4945b1.f4762p;
                if (!C() || z6) {
                    z = false;
                }
                g0Var2.f4840d = z;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) g0Var2.e;
                if (wakeLock != null) {
                    if (!g0Var2.f4839c || !z) {
                        wakeLock.release();
                    } else {
                        wakeLock.acquire();
                    }
                }
                boolean C8 = C();
                g0Var.f4840d = C8;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) g0Var.e;
                if (wifiLock != null) {
                    if (!g0Var.f4839c || !C8) {
                        wifiLock.release();
                        return;
                    } else {
                        wifiLock.acquire();
                        return;
                    }
                } else {
                    return;
                }
            } else if (D8 != 4) {
                throw new IllegalStateException();
            }
        }
        g0Var2.f4840d = false;
        PowerManager.WakeLock wakeLock2 = (PowerManager.WakeLock) g0Var2.e;
        if (wakeLock2 != null) {
            wakeLock2.release();
        }
        g0Var.f4840d = false;
        WifiManager.WifiLock wifiLock2 = (WifiManager.WifiLock) g0Var.e;
        if (wifiLock2 != null) {
            wifiLock2.release();
        }
    }

    public final void Y() {
        IllegalStateException illegalStateException;
        b bVar = this.f4938Y;
        synchronized (bVar) {
            boolean z = false;
            while (!bVar.f2535a) {
                try {
                    bVar.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f4959n0.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f4959n0.getThread().getName();
            int i = z.f3748a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (!this.f4935W0) {
                if (this.f4937X0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                l.C("ExoPlayerImpl", str, illegalStateException);
                this.f4937X0 = true;
                return;
            }
            throw new IllegalStateException(str);
        }
    }

    public final void k(long j7, int i, boolean z) {
        boolean z6;
        Y();
        if (i != -1) {
            if (i >= 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            l.d(z6);
            X x8 = this.f4945b1.f4749a;
            if (x8.p() || i < x8.o()) {
                d dVar = this.f4958m0;
                if (!dVar.f5332c0) {
                    U0.a G8 = dVar.G();
                    dVar.f5332c0 = true;
                    dVar.L(G8, -1, new U0.b(13));
                }
                this.f4914C0++;
                if (G()) {
                    l.B("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    C c8 = new C(this.f4945b1);
                    c8.f(1);
                    C0232y yVar = this.f4950e0.f4899U;
                    yVar.f4948d0.c(new C0002c((Object) yVar, 21, (Object) c8));
                    return;
                }
                X x9 = this.f4945b1;
                int i8 = x9.e;
                if (i8 == 3 || (i8 == 4 && !x8.p())) {
                    x9 = this.f4945b1.g(2);
                }
                int v4 = v();
                X H8 = H(x9, x8, I(x8, i, j7));
                this.f4951f0.f4646c0.a(3, new E(x8, i, z.O(j7))).b();
                W(H8, 0, true, 1, y(H8), v4, z);
            }
        }
    }

    public final F p() {
        byte[] bArr;
        X z = z();
        if (z.p()) {
            return this.f4943a1;
        }
        C c8 = z.m(v(), (W) this.f1328V, 0).f2872c;
        E a8 = this.f4943a1.a();
        F f8 = c8.f2788d;
        if (f8 != null) {
            CharSequence charSequence = f8.f2814a;
            if (charSequence != null) {
                a8.f2792a = charSequence;
            }
            CharSequence charSequence2 = f8.f2815b;
            if (charSequence2 != null) {
                a8.f2793b = charSequence2;
            }
            CharSequence charSequence3 = f8.f2816c;
            if (charSequence3 != null) {
                a8.f2794c = charSequence3;
            }
            CharSequence charSequence4 = f8.f2817d;
            if (charSequence4 != null) {
                a8.f2795d = charSequence4;
            }
            CharSequence charSequence5 = f8.e;
            if (charSequence5 != null) {
                a8.e = charSequence5;
            }
            byte[] bArr2 = f8.f2818f;
            if (bArr2 != null) {
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) bArr2.clone();
                }
                a8.f2796f = bArr;
                a8.f2797g = f8.f2819g;
            }
            Integer num = f8.f2820h;
            if (num != null) {
                a8.f2798h = num;
            }
            Integer num2 = f8.i;
            if (num2 != null) {
                a8.i = num2;
            }
            Integer num3 = f8.f2821j;
            if (num3 != null) {
                a8.f2799j = num3;
            }
            Boolean bool = f8.f2822k;
            if (bool != null) {
                a8.f2800k = bool;
            }
            Integer num4 = f8.f2823l;
            if (num4 != null) {
                a8.f2801l = num4;
            }
            Integer num5 = f8.f2824m;
            if (num5 != null) {
                a8.f2801l = num5;
            }
            Integer num6 = f8.f2825n;
            if (num6 != null) {
                a8.f2802m = num6;
            }
            Integer num7 = f8.f2826o;
            if (num7 != null) {
                a8.f2803n = num7;
            }
            Integer num8 = f8.f2827p;
            if (num8 != null) {
                a8.f2804o = num8;
            }
            Integer num9 = f8.f2828q;
            if (num9 != null) {
                a8.f2805p = num9;
            }
            Integer num10 = f8.f2829r;
            if (num10 != null) {
                a8.f2806q = num10;
            }
            CharSequence charSequence6 = f8.f2830s;
            if (charSequence6 != null) {
                a8.f2807r = charSequence6;
            }
            CharSequence charSequence7 = f8.f2831t;
            if (charSequence7 != null) {
                a8.f2808s = charSequence7;
            }
            CharSequence charSequence8 = f8.f2832u;
            if (charSequence8 != null) {
                a8.f2809t = charSequence8;
            }
            CharSequence charSequence9 = f8.f2833v;
            if (charSequence9 != null) {
                a8.f2810u = charSequence9;
            }
            CharSequence charSequence10 = f8.f2834w;
            if (charSequence10 != null) {
                a8.f2811v = charSequence10;
            }
            Integer num11 = f8.f2835x;
            if (num11 != null) {
                a8.f2812w = num11;
            }
            O o2 = f8.f2836y;
            if (!o2.isEmpty()) {
                a8.f2813x = O.m(o2);
            }
        }
        return new F(a8);
    }

    public final void q() {
        Y();
        M();
        S((Object) null);
        J(0, 0);
    }

    public final a0 r(Z z) {
        int i;
        int B8 = B(this.f4945b1);
        X x8 = this.f4945b1.f4749a;
        if (B8 == -1) {
            i = 0;
        } else {
            i = B8;
        }
        F f8 = this.f4951f0;
        return new a0(f8, z, x8, i, this.f4963s0, f8.f4648e0);
    }

    public final long s(X x8) {
        if (!x8.f4750b.b()) {
            return z.c0(y(x8));
        }
        Object obj = x8.f4750b.f12277a;
        X x9 = x8.f4749a;
        V v4 = this.f4954i0;
        x9.g(obj, v4);
        long j7 = x8.f4751c;
        if (j7 == -9223372036854775807L) {
            return z.c0(x9.m(B(x8), (W) this.f1328V, 0).f2879l);
        }
        return z.c0(v4.e) + z.c0(j7);
    }

    public final void setImageOutput(ImageOutput imageOutput) {
        Y();
        N(4, 15, imageOutput);
    }

    public final int t() {
        Y();
        if (G()) {
            return this.f4945b1.f4750b.f12278b;
        }
        return -1;
    }

    public final int u() {
        Y();
        if (G()) {
            return this.f4945b1.f4750b.f12279c;
        }
        return -1;
    }

    public final int v() {
        Y();
        int B8 = B(this.f4945b1);
        if (B8 == -1) {
            return 0;
        }
        return B8;
    }

    public final int w() {
        Y();
        if (this.f4945b1.f4749a.p()) {
            return 0;
        }
        X x8 = this.f4945b1;
        return x8.f4749a.b(x8.f4750b.f12277a);
    }

    public final long x() {
        Y();
        return z.c0(y(this.f4945b1));
    }

    public final long y(X x8) {
        long j7;
        if (x8.f4749a.p()) {
            return z.O(this.f4949d1);
        }
        if (x8.f4762p) {
            j7 = x8.j();
        } else {
            j7 = x8.f4765s;
        }
        if (x8.f4750b.b()) {
            return j7;
        }
        X x9 = x8.f4749a;
        Object obj = x8.f4750b.f12277a;
        V v4 = this.f4954i0;
        x9.g(obj, v4);
        return j7 + v4.e;
    }

    public final X z() {
        Y();
        return this.f4945b1.f4749a;
    }
}
