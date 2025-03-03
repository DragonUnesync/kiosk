package M0;

import P0.l;
import P0.z;

/* renamed from: M0.l  reason: case insensitive filesystem */
public final class C0124l {

    /* renamed from: a  reason: collision with root package name */
    public final int f2966a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2967b;

    static {
        boolean z;
        C0123k kVar = new C0123k(0);
        if (kVar.f2964b <= kVar.f2965c) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        new C0124l(kVar);
        z.J(0);
        z.J(1);
        z.J(2);
        z.J(3);
    }

    public C0124l(C0123k kVar) {
        kVar.getClass();
        this.f2966a = kVar.f2964b;
        this.f2967b = kVar.f2965c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0124l)) {
            return false;
        }
        C0124l lVar = (C0124l) obj;
        lVar.getClass();
        if (this.f2966a != lVar.f2966a || this.f2967b != lVar.f2967b) {
            return false;
        }
        int i = z.f3748a;
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f2966a) * 31) + this.f2967b) * 31;
    }
}
