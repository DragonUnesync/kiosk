package p1;

import H3.M;
import H3.O;
import H3.i0;
import M0.C0129q;
import M0.C0132u;
import M0.I;
import P0.l;
import P0.r;
import Q0.g;
import java.util.List;

public final class B implements o {

    /* renamed from: a  reason: collision with root package name */
    public final int f14321a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14322b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14323c;

    /* renamed from: d  reason: collision with root package name */
    public int f14324d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public q f14325f;

    /* renamed from: g  reason: collision with root package name */
    public G f14326g;

    public B(int i, int i8, String str) {
        this.f14321a = i;
        this.f14322b = i8;
        this.f14323c = str;
    }

    public final void a(long j7, long j8) {
        if (j7 == 0 || this.e == 1) {
            this.e = 1;
            this.f14324d = 0;
        }
    }

    public final o c() {
        return this;
    }

    public final int e(p pVar, C0132u uVar) {
        int i = this.e;
        if (i == 1) {
            G g8 = this.f14326g;
            g8.getClass();
            int b8 = g8.b(pVar, 1024, true);
            if (b8 == -1) {
                this.e = 2;
                this.f14326g.e(0, 1, this.f14324d, 0, (F) null);
                this.f14324d = 0;
            } else {
                this.f14324d += b8;
            }
            return 0;
        } else if (i == 2) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        boolean z;
        int i = this.f14322b;
        int i8 = this.f14321a;
        if (i8 == -1 || i == -1) {
            z = false;
        } else {
            z = true;
        }
        l.j(z);
        r rVar = new r(i);
        ((l) pVar).r(rVar.f3732a, 0, i, false);
        if (rVar.B() == i8) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, p1.z] */
    public final void l(q qVar) {
        this.f14325f = qVar;
        G q7 = qVar.q(1024, 4);
        this.f14326g = q7;
        C0129q qVar2 = new C0129q();
        qVar2.f2999m = I.o(this.f14323c);
        g.v(qVar2, q7);
        this.f14325f.g();
        this.f14325f.l(new Object());
        this.e = 1;
    }

    public final void release() {
    }
}
