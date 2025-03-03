package T0;

import P0.v;
import Y0.f;
import android.util.Pair;
import g1.g;
import h1.C1031B;
import h1.C1053t;
import h1.G;
import java.io.IOException;

public final class T implements G, f {

    /* renamed from: U  reason: collision with root package name */
    public final V f4729U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ W f4730V;

    public T(W w2, V v4) {
        this.f4730V = w2;
        this.f4729U = v4;
    }

    public final Pair a(int i, C1031B b8) {
        C1031B b9;
        V v4 = this.f4729U;
        C1031B b10 = null;
        if (b8 != null) {
            int i8 = 0;
            while (true) {
                if (i8 >= v4.f4736c.size()) {
                    b9 = null;
                    break;
                } else if (((C1031B) v4.f4736c.get(i8)).f12280d == b8.f12280d) {
                    Object obj = v4.f4735b;
                    int i9 = c0.f4783k;
                    b9 = b8.a(Pair.create(obj, b8.f12277a));
                    break;
                } else {
                    i8++;
                }
            }
            if (b9 == null) {
                return null;
            }
            b10 = b9;
        }
        return Pair.create(Integer.valueOf(i + v4.f4737d), b10);
    }

    public final void g(int i, C1031B b8, C1053t tVar, g gVar) {
        Pair a8 = a(i, b8);
        if (a8 != null) {
            ((v) this.f4730V.f4745j).c(new Q(this, a8, tVar, gVar, 0));
        }
    }

    public final void k(int i, C1031B b8, C1053t tVar, g gVar, IOException iOException, boolean z) {
        Pair a8 = a(i, b8);
        if (a8 != null) {
            ((v) this.f4730V.f4745j).c(new S(this, a8, tVar, gVar, iOException, z));
        }
    }

    public final void r(int i, C1031B b8, C1053t tVar, g gVar) {
        Pair a8 = a(i, b8);
        if (a8 != null) {
            ((v) this.f4730V.f4745j).c(new Q(this, a8, tVar, gVar, 2));
        }
    }

    public final void s(int i, C1031B b8, g gVar) {
        Pair a8 = a(i, b8);
        if (a8 != null) {
            ((v) this.f4730V.f4745j).c(new P(this, a8, gVar, 1));
        }
    }

    public final void u(int i, C1031B b8, g gVar) {
        Pair a8 = a(i, b8);
        if (a8 != null) {
            ((v) this.f4730V.f4745j).c(new P(this, a8, gVar, 0));
        }
    }

    public final void x(int i, C1031B b8, C1053t tVar, g gVar) {
        Pair a8 = a(i, b8);
        if (a8 != null) {
            ((v) this.f4730V.f4745j).c(new Q(this, a8, tVar, gVar, 1));
        }
    }
}
