package P5;

import D.s0;
import P0.z;
import P6.f;
import W0.h;
import W6.d;
import X0.j;
import Y6.m;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p1.G;
import p1.l;
import p1.p;
import p1.q;
import x1.c;

public final class E implements h, p, q {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3808U;

    /* renamed from: V  reason: collision with root package name */
    public long f3809V;

    /* renamed from: W  reason: collision with root package name */
    public Object f3810W;

    public /* synthetic */ E(long j7, Object obj, int i) {
        this.f3808U = i;
        this.f3809V = j7;
        this.f3810W = obj;
    }

    public int A(int i) {
        E e = (E) this.f3810W;
        if (e == null) {
            if (i >= 64) {
                return Long.bitCount(this.f3809V);
            }
            return Long.bitCount(this.f3809V & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.f3809V & ((1 << i) - 1));
        } else {
            return Long.bitCount(this.f3809V) + e.A(i - 64);
        }
    }

    public void B() {
        if (((E) this.f3810W) == null) {
            this.f3810W = new E(2);
        }
    }

    public void C(A a8) {
        this.f3809V++;
        Thread thread = new Thread(a8);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f3809V + ")");
        ((List) this.f3810W).add(a8);
        a8.f3796W = thread;
        thread.start();
    }

    public boolean D(int i) {
        if (i >= 64) {
            B();
            return ((E) this.f3810W).D(i - 64);
        } else if ((this.f3809V & (1 << i)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public long E(long j7, long j8) {
        return -9223372036854775807L;
    }

    public j F(long j7) {
        p1.j jVar = (p1.j) this.f3810W;
        int i = (int) j7;
        return new j(jVar.f14396c[i], (long) jVar.f14395b[i], (String) null);
    }

    public void G(int i, boolean z) {
        boolean z6;
        if (i >= 64) {
            B();
            ((E) this.f3810W).G(i - 64, z);
            return;
        }
        long j7 = this.f3809V;
        if ((Long.MIN_VALUE & j7) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        long j8 = (1 << i) - 1;
        this.f3809V = ((j7 & (~j8)) << 1) | (j7 & j8);
        if (z) {
            K(i);
        } else {
            z(i);
        }
        if (z6 || ((E) this.f3810W) != null) {
            B();
            ((E) this.f3810W).G(0, z6);
        }
    }

    public m H() {
        s0 s0Var = new s0(5);
        while (true) {
            String s8 = ((l7.q) this.f3810W).s(this.f3809V);
            this.f3809V -= (long) s8.length();
            if (s8.length() == 0) {
                return s0Var.g();
            }
            int f02 = d.f0(s8, ':', 1, false, 4);
            if (f02 != -1) {
                String substring = s8.substring(0, f02);
                f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = s8.substring(f02 + 1);
                f.d(substring2, "this as java.lang.String).substring(startIndex)");
                s0Var.f(substring, substring2);
            } else if (s8.charAt(0) == ':') {
                String substring3 = s8.substring(1);
                f.d(substring3, "this as java.lang.String).substring(startIndex)");
                s0Var.f("", substring3);
            } else {
                s0Var.f("", s8);
            }
        }
    }

    public boolean I(int i) {
        boolean z;
        if (i >= 64) {
            B();
            return ((E) this.f3810W).I(i - 64);
        }
        long j7 = 1 << i;
        long j8 = this.f3809V;
        if ((j8 & j7) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j9 = j8 & (~j7);
        this.f3809V = j9;
        long j10 = j7 - 1;
        this.f3809V = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
        E e = (E) this.f3810W;
        if (e != null) {
            if (e.D(0)) {
                K(63);
            }
            ((E) this.f3810W).I(0);
        }
        return z;
    }

    public void J() {
        this.f3809V = 0;
        E e = (E) this.f3810W;
        if (e != null) {
            e.J();
        }
    }

    public void K(int i) {
        if (i >= 64) {
            B();
            ((E) this.f3810W).K(i - 64);
            return;
        }
        this.f3809V |= 1 << i;
    }

    public boolean L() {
        return true;
    }

    public long Z() {
        return 0;
    }

    public long b(long j7) {
        return ((p1.j) this.f3810W).e[(int) j7] - this.f3809V;
    }

    public boolean c(byte[] bArr, int i, int i8, boolean z) {
        return ((l) this.f3810W).c(bArr, 0, i8, z);
    }

    public long e(long j7, long j8) {
        return (long) z.e(((p1.j) this.f3810W).e, j7 + this.f3809V, true);
    }

    public void g() {
        ((q) this.f3810W).g();
    }

    public long h(long j7, long j8) {
        return ((p1.j) this.f3810W).f14397d[(int) j7];
    }

    public long i() {
        return ((l) this.f3810W).f14407W - this.f3809V;
    }

    public long i0(long j7) {
        return (long) ((p1.j) this.f3810W).f14394a;
    }

    public long j0(long j7, long j8) {
        return (long) ((p1.j) this.f3810W).f14394a;
    }

    public void k() {
        ((l) this.f3810W).f14410Z = 0;
    }

    public void l(p1.z zVar) {
        ((q) this.f3810W).l(new c(this, zVar, zVar));
    }

    public void m(int i) {
        ((l) this.f3810W).m(i);
    }

    public G q(int i, int i8) {
        return ((q) this.f3810W).q(i, i8);
    }

    public boolean r(byte[] bArr, int i, int i8, boolean z) {
        return ((l) this.f3810W).r(bArr, i, i8, z);
    }

    public void readFully(byte[] bArr, int i, int i8) {
        ((l) this.f3810W).c(bArr, i, i8, false);
    }

    public long s() {
        return ((l) this.f3810W).s() - this.f3809V;
    }

    public long t(long j7, long j8) {
        return 0;
    }

    public String toString() {
        switch (this.f3808U) {
            case 2:
                if (((E) this.f3810W) == null) {
                    return Long.toBinaryString(this.f3809V);
                }
                return ((E) this.f3810W).toString() + "xx" + Long.toBinaryString(this.f3809V);
            default:
                return super.toString();
        }
    }

    public void v(byte[] bArr, int i, int i8) {
        ((l) this.f3810W).r(bArr, i, i8, false);
    }

    public void w(int i) {
        ((l) this.f3810W).b(i, false);
    }

    public int x(byte[] bArr, int i, int i8) {
        return ((l) this.f3810W).x(bArr, i, i8);
    }

    public long y() {
        return ((l) this.f3810W).f14408X - this.f3809V;
    }

    public void z(int i) {
        if (i >= 64) {
            E e = (E) this.f3810W;
            if (e != null) {
                e.z(i - 64);
                return;
            }
            return;
        }
        this.f3809V &= ~(1 << i);
    }

    public /* synthetic */ E(Object obj, long j7, int i) {
        this.f3808U = i;
        this.f3810W = obj;
        this.f3809V = j7;
    }

    public E(l7.q qVar) {
        this.f3808U = 4;
        f.e(qVar, "source");
        this.f3810W = qVar;
        this.f3809V = 262144;
    }

    public E(l lVar, long j7) {
        this.f3808U = 7;
        this.f3810W = lVar;
        P0.l.d(lVar.f14408X >= j7);
        this.f3809V = j7;
    }

    public E(int i) {
        this.f3808U = i;
        switch (i) {
            case 2:
                this.f3809V = 0;
                return;
            case 3:
                this.f3810W = new HashMap();
                this.f3809V = 1000;
                return;
            default:
                this.f3810W = DesugarCollections.synchronizedList(new ArrayList());
                return;
        }
    }
}
