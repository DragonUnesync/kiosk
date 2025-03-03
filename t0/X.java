package T0;

import H3.i0;
import M0.L;
import M0.U;
import P0.z;
import android.os.SystemClock;
import h1.C1031B;
import h1.f0;
import java.util.List;
import k1.u;

public final class X {

    /* renamed from: u  reason: collision with root package name */
    public static final C1031B f4748u = new C1031B(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final M0.X f4749a;

    /* renamed from: b  reason: collision with root package name */
    public final C1031B f4750b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4751c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4752d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final C0220l f4753f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4754g;

    /* renamed from: h  reason: collision with root package name */
    public final f0 f4755h;
    public final u i;

    /* renamed from: j  reason: collision with root package name */
    public final List f4756j;

    /* renamed from: k  reason: collision with root package name */
    public final C1031B f4757k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f4758l;

    /* renamed from: m  reason: collision with root package name */
    public final int f4759m;

    /* renamed from: n  reason: collision with root package name */
    public final int f4760n;

    /* renamed from: o  reason: collision with root package name */
    public final L f4761o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f4762p;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f4763q;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f4764r;

    /* renamed from: s  reason: collision with root package name */
    public volatile long f4765s;

    /* renamed from: t  reason: collision with root package name */
    public volatile long f4766t;

    public X(M0.X x8, C1031B b8, long j7, long j8, int i8, C0220l lVar, boolean z, f0 f0Var, u uVar, List list, C1031B b9, boolean z6, int i9, int i10, L l8, long j9, long j10, long j11, long j12, boolean z8) {
        this.f4749a = x8;
        this.f4750b = b8;
        this.f4751c = j7;
        this.f4752d = j8;
        this.e = i8;
        this.f4753f = lVar;
        this.f4754g = z;
        this.f4755h = f0Var;
        this.i = uVar;
        this.f4756j = list;
        this.f4757k = b9;
        this.f4758l = z6;
        this.f4759m = i9;
        this.f4760n = i10;
        this.f4761o = l8;
        this.f4763q = j9;
        this.f4764r = j10;
        this.f4765s = j11;
        this.f4766t = j12;
        this.f4762p = z8;
    }

    public static X i(u uVar) {
        U u3 = M0.X.f2884a;
        C1031B b8 = f4748u;
        return new X(u3, b8, -9223372036854775807L, 0, 1, (C0220l) null, false, f0.f12468d, uVar, i0.f2073Y, b8, false, 1, 0, L.f2845d, 0, 0, 0, 0, false);
    }

    public final X a() {
        return new X(this.f4749a, this.f4750b, this.f4751c, this.f4752d, this.e, this.f4753f, this.f4754g, this.f4755h, this.i, this.f4756j, this.f4757k, this.f4758l, this.f4759m, this.f4760n, this.f4761o, this.f4763q, this.f4764r, j(), SystemClock.elapsedRealtime(), this.f4762p);
    }

    public final X b(C1031B b8) {
        M0.X x8 = this.f4749a;
        return new X(x8, this.f4750b, this.f4751c, this.f4752d, this.e, this.f4753f, this.f4754g, this.f4755h, this.i, this.f4756j, b8, this.f4758l, this.f4759m, this.f4760n, this.f4761o, this.f4763q, this.f4764r, this.f4765s, this.f4766t, this.f4762p);
    }

    public final X c(C1031B b8, long j7, long j8, long j9, long j10, f0 f0Var, u uVar, List list) {
        long j11 = j7;
        f0 f0Var2 = f0Var;
        u uVar2 = uVar;
        List list2 = list;
        M0.X x8 = this.f4749a;
        return new X(x8, b8, j8, j9, this.e, this.f4753f, this.f4754g, f0Var2, uVar2, list2, this.f4757k, this.f4758l, this.f4759m, this.f4760n, this.f4761o, this.f4763q, j10, j11, SystemClock.elapsedRealtime(), this.f4762p);
    }

    public final X d(int i8, int i9, boolean z) {
        boolean z6 = z;
        M0.X x8 = this.f4749a;
        return new X(x8, this.f4750b, this.f4751c, this.f4752d, this.e, this.f4753f, this.f4754g, this.f4755h, this.i, this.f4756j, this.f4757k, z6, i8, i9, this.f4761o, this.f4763q, this.f4764r, this.f4765s, this.f4766t, this.f4762p);
    }

    public final X e(C0220l lVar) {
        M0.X x8 = this.f4749a;
        return new X(x8, this.f4750b, this.f4751c, this.f4752d, this.e, lVar, this.f4754g, this.f4755h, this.i, this.f4756j, this.f4757k, this.f4758l, this.f4759m, this.f4760n, this.f4761o, this.f4763q, this.f4764r, this.f4765s, this.f4766t, this.f4762p);
    }

    public final X f(L l8) {
        M0.X x8 = this.f4749a;
        return new X(x8, this.f4750b, this.f4751c, this.f4752d, this.e, this.f4753f, this.f4754g, this.f4755h, this.i, this.f4756j, this.f4757k, this.f4758l, this.f4759m, this.f4760n, l8, this.f4763q, this.f4764r, this.f4765s, this.f4766t, this.f4762p);
    }

    public final X g(int i8) {
        M0.X x8 = this.f4749a;
        return new X(x8, this.f4750b, this.f4751c, this.f4752d, i8, this.f4753f, this.f4754g, this.f4755h, this.i, this.f4756j, this.f4757k, this.f4758l, this.f4759m, this.f4760n, this.f4761o, this.f4763q, this.f4764r, this.f4765s, this.f4766t, this.f4762p);
    }

    public final X h(M0.X x8) {
        return new X(x8, this.f4750b, this.f4751c, this.f4752d, this.e, this.f4753f, this.f4754g, this.f4755h, this.i, this.f4756j, this.f4757k, this.f4758l, this.f4759m, this.f4760n, this.f4761o, this.f4763q, this.f4764r, this.f4765s, this.f4766t, this.f4762p);
    }

    public final long j() {
        long j7;
        long j8;
        if (!k()) {
            return this.f4765s;
        }
        do {
            j7 = this.f4766t;
            j8 = this.f4765s;
        } while (j7 != this.f4766t);
        return z.O(z.c0(j8) + ((long) (((float) (SystemClock.elapsedRealtime() - j7)) * this.f4761o.f2846a)));
    }

    public final boolean k() {
        if (this.e == 3 && this.f4758l && this.f4760n == 0) {
            return true;
        }
        return false;
    }
}
