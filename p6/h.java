package P6;

import N.e;
import O6.l;
import U6.a;

public final class h extends b implements l, a {

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f3952a0 = false;

    public h(String str, Class cls, String str2) {
        super(a.f3942U, cls, str, str2, false);
    }

    public final Object a(Object obj) {
        e();
        throw null;
    }

    public final a b() {
        k.f3956a.getClass();
        return this;
    }

    public final a d() {
        if (!this.f3952a0) {
            a aVar = this.f3943U;
            if (aVar != null) {
                return aVar;
            }
            b();
            this.f3943U = this;
        }
        return this;
    }

    public final void e() {
        if (!this.f3952a0) {
            a d8 = d();
            if (d8 != this) {
                ((h) d8).e();
                return;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (!c().equals(hVar.c()) || !this.f3946X.equals(hVar.f3946X) || !this.f3947Y.equals(hVar.f3947Y) || !f.a(this.f3944V, hVar.f3944V)) {
                return false;
            }
            return true;
        } else if (obj instanceof h) {
            return obj.equals(d());
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return this.f3947Y.hashCode() + e.u(c().hashCode() * 31, 31, this.f3946X);
    }

    public final String toString() {
        a d8 = d();
        if (d8 != this) {
            return d8.toString();
        }
        return e.A(new StringBuilder("property "), this.f3946X, " (Kotlin reflection is not available)");
    }
}
