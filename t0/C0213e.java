package T0;

import M0.C0129q;
import M0.X;
import M0.r;
import P0.l;
import P0.t;
import R2.c;
import S0.f;
import U0.j;
import h1.C1031B;
import h1.Y;
import k1.p;

/* renamed from: T0.e  reason: case insensitive filesystem */
public abstract class C0213e implements Z {

    /* renamed from: U  reason: collision with root package name */
    public final Object f4798U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public final int f4799V;

    /* renamed from: W  reason: collision with root package name */
    public final c f4800W;

    /* renamed from: X  reason: collision with root package name */
    public d0 f4801X;

    /* renamed from: Y  reason: collision with root package name */
    public int f4802Y;

    /* renamed from: Z  reason: collision with root package name */
    public j f4803Z;

    /* renamed from: a0  reason: collision with root package name */
    public t f4804a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f4805b0;

    /* renamed from: c0  reason: collision with root package name */
    public Y f4806c0;

    /* renamed from: d0  reason: collision with root package name */
    public r[] f4807d0;

    /* renamed from: e0  reason: collision with root package name */
    public long f4808e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f4809f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f4810g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f4811h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f4812i0;

    /* renamed from: j0  reason: collision with root package name */
    public X f4813j0;

    /* renamed from: k0  reason: collision with root package name */
    public p f4814k0;

    public C0213e(int i) {
        this.f4799V = i;
        this.f4800W = new c(0, 5);
        this.f4810g0 = Long.MIN_VALUE;
        this.f4813j0 = X.f2884a;
    }

    public int A() {
        return 0;
    }

    public void b(int i, Object obj) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T0.C0220l f(java.lang.Exception r13, M0.r r14, boolean r15, int r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L_0x001d
            boolean r3 = r1.f4812i0
            if (r3 != 0) goto L_0x001d
            r3 = 1
            r1.f4812i0 = r3
            r3 = 0
            int r4 = r12.z(r14)     // Catch:{ l -> 0x001b, all -> 0x0016 }
            r4 = r4 & 7
            r1.f4812i0 = r3
            goto L_0x001e
        L_0x0016:
            r0 = move-exception
            r2 = r0
            r1.f4812i0 = r3
            throw r2
        L_0x001b:
            r1.f4812i0 = r3
        L_0x001d:
            r4 = 4
        L_0x001e:
            java.lang.String r6 = r12.i()
            int r7 = r1.f4802Y
            T0.l r11 = new T0.l
            if (r0 != 0) goto L_0x002a
            r9 = 4
            goto L_0x002b
        L_0x002a:
            r9 = r4
        L_0x002b:
            r3 = 1
            r2 = r11
            r4 = r13
            r5 = r16
            r8 = r14
            r10 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.C0213e.f(java.lang.Exception, M0.r, boolean, int):T0.l");
    }

    public void g() {
    }

    public J h() {
        return null;
    }

    public abstract String i();

    public final boolean j() {
        if (this.f4810g0 == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean k();

    public abstract boolean l();

    public abstract void m();

    public void n(boolean z, boolean z6) {
    }

    public abstract void o(long j7, boolean z);

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t(r[] rVarArr, long j7, long j8, C1031B b8) {
    }

    public final int u(c cVar, f fVar, int i) {
        Y y8 = this.f4806c0;
        y8.getClass();
        int l8 = y8.l(cVar, fVar, i);
        if (l8 == -4) {
            if (fVar.d(4)) {
                this.f4810g0 = Long.MIN_VALUE;
                if (this.f4811h0) {
                    return -4;
                }
                return -3;
            }
            long j7 = fVar.f4388a0 + this.f4808e0;
            fVar.f4388a0 = j7;
            this.f4810g0 = Math.max(this.f4810g0, j7);
        } else if (l8 == -5) {
            r rVar = (r) cVar.f4337W;
            rVar.getClass();
            long j8 = rVar.f3041s;
            if (j8 != Long.MAX_VALUE) {
                C0129q a8 = rVar.a();
                a8.f3004r = j8 + this.f4808e0;
                cVar.f4337W = new r(a8);
            }
        }
        return l8;
    }

    public abstract void v(long j7, long j8);

    public final void w(r[] rVarArr, Y y8, long j7, long j8, C1031B b8) {
        l.j(!this.f4811h0);
        this.f4806c0 = y8;
        if (this.f4810g0 == Long.MIN_VALUE) {
            this.f4810g0 = j7;
        }
        this.f4807d0 = rVarArr;
        this.f4808e0 = j8;
        t(rVarArr, j7, j8, b8);
    }

    public final void x() {
        boolean z;
        if (this.f4805b0 == 0) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        this.f4800W.I();
        q();
    }

    public void y(float f8, float f9) {
    }

    public abstract int z(r rVar);
}
