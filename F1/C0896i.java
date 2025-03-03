package f1;

import H3.C0103u;
import H3.n0;
import M0.r;

/* renamed from: f1.i  reason: case insensitive filesystem */
public final class C0896i {

    /* renamed from: a  reason: collision with root package name */
    public final int f11546a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11547b;

    /* renamed from: c  reason: collision with root package name */
    public final r f11548c;

    /* renamed from: d  reason: collision with root package name */
    public final n0 f11549d;
    public final String e;

    public C0896i(r rVar, int i, int i8, n0 n0Var, String str) {
        this.f11546a = i;
        this.f11547b = i8;
        this.f11548c = rVar;
        this.f11549d = n0.a(n0Var);
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0896i.class != obj.getClass()) {
            return false;
        }
        C0896i iVar = (C0896i) obj;
        if (this.f11546a == iVar.f11546a && this.f11547b == iVar.f11547b && this.f11548c.equals(iVar.f11548c)) {
            n0 n0Var = this.f11549d;
            n0Var.getClass();
            if (!C0103u.h(n0Var, iVar.f11549d) || !this.e.equals(iVar.e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11548c.hashCode();
        int hashCode2 = this.f11549d.hashCode();
        return this.e.hashCode() + ((hashCode2 + ((hashCode + ((((217 + this.f11546a) * 31) + this.f11547b) * 31)) * 31)) * 31);
    }
}
