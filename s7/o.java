package S7;

import Q7.g;
import java.util.List;

public abstract class o extends p {

    /* renamed from: X  reason: collision with root package name */
    public Object f4576X;

    public o(String str) {
        g.D(str);
        this.f4576X = str;
    }

    public final String C() {
        return c(q());
    }

    public final void D() {
        Object obj = this.f4576X;
        if (!(obj instanceof c)) {
            c cVar = new c();
            this.f4576X = cVar;
            cVar.n(q(), (String) obj);
        }
    }

    public final String a(String str) {
        D();
        return super.a(str);
    }

    public final String c(String str) {
        if (this.f4576X instanceof c) {
            return super.c(str);
        }
        if (q().equals(str)) {
            return (String) this.f4576X;
        }
        return "";
    }

    public final void d(String str, String str2) {
        if ((this.f4576X instanceof c) || !str.equals(q())) {
            D();
            super.d(str, str2);
            return;
        }
        this.f4576X = str2;
    }

    public final c e() {
        D();
        return (c) this.f4576X;
    }

    public final String f() {
        p pVar = this.f4578U;
        if (pVar != null) {
            return pVar.f();
        }
        return "";
    }

    public final int g() {
        return 0;
    }

    public final p i(p pVar) {
        o oVar = (o) super.i(pVar);
        Object obj = this.f4576X;
        if (obj instanceof c) {
            oVar.f4576X = ((c) obj).clone();
        }
        return oVar;
    }

    public final p j() {
        return this;
    }

    public final List k() {
        return p.f4577W;
    }

    public final boolean l(String str) {
        D();
        return super.l("version");
    }

    public final boolean m() {
        return this.f4576X instanceof c;
    }
}
