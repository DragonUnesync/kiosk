package h1;

import M0.C;
import M0.V;
import M0.W;
import M0.X;
import P0.l;
import T0.b0;
import l1.e;

/* renamed from: h1.x  reason: case insensitive filesystem */
public final class C1057x extends h0 {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f12525l;

    /* renamed from: m  reason: collision with root package name */
    public final W f12526m;

    /* renamed from: n  reason: collision with root package name */
    public final V f12527n;

    /* renamed from: o  reason: collision with root package name */
    public C1055v f12528o;

    /* renamed from: p  reason: collision with root package name */
    public C1054u f12529p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12530q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12531r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12532s;

    public C1057x(C1035a aVar, boolean z) {
        super(aVar);
        boolean z6;
        if (!z || !aVar.i()) {
            z6 = false;
        } else {
            z6 = true;
        }
        this.f12525l = z6;
        this.f12526m = new W();
        this.f12527n = new V();
        X g8 = aVar.g();
        if (g8 != null) {
            this.f12528o = new C1055v(g8, (Object) null, (Object) null);
            this.f12532s = true;
            return;
        }
        this.f12528o = new C1055v(new C1056w(aVar.h()), W.f2868q, C1055v.e);
    }

    public final void B() {
        if (!this.f12525l) {
            this.f12530q = true;
            A();
        }
    }

    /* renamed from: C */
    public final C1054u b(C1031B b8, e eVar, long j7) {
        boolean z;
        C1054u uVar = new C1054u(b8, eVar, j7);
        if (uVar.f12518X == null) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        uVar.f12518X = this.f12482k;
        if (this.f12531r) {
            Object obj = this.f12528o.f12523d;
            Object obj2 = b8.f12277a;
            if (obj != null && obj2.equals(C1055v.e)) {
                obj2 = this.f12528o.f12523d;
            }
            uVar.a(b8.a(obj2));
        } else {
            this.f12529p = uVar;
            if (!this.f12530q) {
                this.f12530q = true;
                A();
            }
        }
        return uVar;
    }

    public final boolean D(long j7) {
        C1054u uVar = this.f12529p;
        int b8 = this.f12528o.b(uVar.f12515U.f12277a);
        if (b8 == -1) {
            return false;
        }
        C1055v vVar = this.f12528o;
        V v4 = this.f12527n;
        vVar.f(b8, v4, false);
        long j8 = v4.f2865d;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0, j8 - 1);
        }
        uVar.f12521a0 = j7;
        return true;
    }

    public final void j() {
    }

    public final void n(C1059z zVar) {
        C1054u uVar = (C1054u) zVar;
        if (uVar.f12519Y != null) {
            C1035a aVar = uVar.f12518X;
            aVar.getClass();
            aVar.n(uVar.f12519Y);
        }
        if (zVar == this.f12529p) {
            this.f12529p = null;
        }
    }

    public final void p() {
        this.f12531r = false;
        this.f12530q = false;
        super.p();
    }

    public final void s(C c8) {
        if (this.f12532s) {
            C1055v vVar = this.f12528o;
            this.f12528o = new C1055v(new b0(this.f12528o.f12507b, c8), vVar.f12522c, vVar.f12523d);
        } else {
            this.f12528o = new C1055v(new C1056w(c8), W.f2868q, C1055v.e);
        }
        this.f12482k.s(c8);
    }

    public final C1031B y(C1031B b8) {
        Object obj = b8.f12277a;
        Object obj2 = this.f12528o.f12523d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C1055v.e;
        }
        return b8.a(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(M0.X r15) {
        /*
            r14 = this;
            boolean r0 = r14.f12531r
            if (r0 == 0) goto L_0x001c
            h1.v r0 = r14.f12528o
            h1.v r1 = new h1.v
            java.lang.Object r2 = r0.f12522c
            java.lang.Object r0 = r0.f12523d
            r1.<init>(r15, r2, r0)
            r14.f12528o = r1
            h1.u r15 = r14.f12529p
            if (r15 == 0) goto L_0x00bf
            long r0 = r15.f12521a0
            r14.D(r0)
            goto L_0x00bf
        L_0x001c:
            boolean r0 = r15.p()
            if (r0 == 0) goto L_0x0040
            boolean r0 = r14.f12532s
            if (r0 == 0) goto L_0x0032
            h1.v r0 = r14.f12528o
            h1.v r1 = new h1.v
            java.lang.Object r2 = r0.f12522c
            java.lang.Object r0 = r0.f12523d
            r1.<init>(r15, r2, r0)
            goto L_0x003c
        L_0x0032:
            java.lang.Object r0 = M0.W.f2868q
            java.lang.Object r1 = h1.C1055v.e
            h1.v r2 = new h1.v
            r2.<init>(r15, r0, r1)
            r1 = r2
        L_0x003c:
            r14.f12528o = r1
            goto L_0x00bf
        L_0x0040:
            r0 = 0
            M0.W r1 = r14.f12526m
            r15.n(r0, r1)
            long r2 = r1.f2879l
            java.lang.Object r4 = r1.f2870a
            h1.u r5 = r14.f12529p
            if (r5 == 0) goto L_0x006d
            h1.v r6 = r14.f12528o
            h1.B r7 = r5.f12515U
            java.lang.Object r7 = r7.f12277a
            M0.V r8 = r14.f12527n
            r6.g(r7, r8)
            long r6 = r8.e
            long r8 = r5.f12516V
            long r6 = r6 + r8
            h1.v r5 = r14.f12528o
            r8 = 0
            r5.m(r0, r1, r8)
            long r0 = r1.f2879l
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x006d
            r12 = r6
            goto L_0x006e
        L_0x006d:
            r12 = r2
        L_0x006e:
            r11 = 0
            M0.W r9 = r14.f12526m
            M0.V r10 = r14.f12527n
            r8 = r15
            android.util.Pair r0 = r8.i(r9, r10, r11, r12)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r14.f12532s
            if (r0 == 0) goto L_0x0092
            h1.v r0 = r14.f12528o
            h1.v r1 = new h1.v
            java.lang.Object r4 = r0.f12522c
            java.lang.Object r0 = r0.f12523d
            r1.<init>(r15, r4, r0)
            goto L_0x0098
        L_0x0092:
            h1.v r0 = new h1.v
            r0.<init>(r15, r4, r1)
            r1 = r0
        L_0x0098:
            r14.f12528o = r1
            h1.u r15 = r14.f12529p
            if (r15 == 0) goto L_0x00bf
            boolean r0 = r14.D(r2)
            if (r0 == 0) goto L_0x00bf
            h1.B r15 = r15.f12515U
            h1.v r0 = r14.f12528o
            java.lang.Object r0 = r0.f12523d
            java.lang.Object r1 = r15.f12277a
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = h1.C1055v.e
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ba
            h1.v r0 = r14.f12528o
            java.lang.Object r1 = r0.f12523d
        L_0x00ba:
            h1.B r15 = r15.a(r1)
            goto L_0x00c0
        L_0x00bf:
            r15 = 0
        L_0x00c0:
            r0 = 1
            r14.f12532s = r0
            r14.f12531r = r0
            h1.v r0 = r14.f12528o
            r14.m(r0)
            if (r15 == 0) goto L_0x00d4
            h1.u r0 = r14.f12529p
            r0.getClass()
            r0.a(r15)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C1057x.z(M0.X):void");
    }
}
