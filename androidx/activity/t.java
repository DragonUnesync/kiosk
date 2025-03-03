package androidx.activity;

import C6.g;
import N.e;
import O6.a;
import P6.b;
import P6.f;
import P6.k;

public final /* synthetic */ class t extends b implements a, U6.a {

    /* renamed from: a0  reason: collision with root package name */
    public final int f7347a0 = 0;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f7348b0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(int i, Object obj) {
        super(obj, u.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", false);
        this.f7348b0 = i;
    }

    public final U6.a b() {
        k.f3956a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (!this.f3946X.equals(tVar.f3946X) || !this.f3947Y.equals(tVar.f3947Y) || this.f7347a0 != tVar.f7347a0 || !f.a(this.f3944V, tVar.f3944V) || !c().equals(tVar.c())) {
                return false;
            }
            return true;
        } else if (!(obj instanceof t)) {
            return false;
        } else {
            U6.a aVar = this.f3943U;
            if (aVar == null) {
                b();
                this.f3943U = this;
                aVar = this;
            }
            return obj.equals(aVar);
        }
    }

    public final int hashCode() {
        c();
        return this.f3947Y.hashCode() + e.u(c().hashCode() * 31, 31, this.f3946X);
    }

    public final Object invoke() {
        switch (this.f7348b0) {
            case 0:
                ((u) this.f3944V).d();
                return g.f721c;
            default:
                ((u) this.f3944V).d();
                return g.f721c;
        }
    }

    public final String toString() {
        U6.a aVar = this.f3943U;
        if (aVar == null) {
            b();
            this.f3943U = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f3946X;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return e.y("function ", str, " (Kotlin reflection is not available)");
    }
}
