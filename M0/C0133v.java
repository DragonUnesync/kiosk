package M0;

import P0.z;

/* renamed from: M0.v  reason: case insensitive filesystem */
public class C0133v {

    /* renamed from: a  reason: collision with root package name */
    public final long f3051a;

    static {
        new C0133v(new C0132u());
        z.J(0);
        z.J(1);
        z.J(2);
        z.J(3);
        z.J(4);
        z.J(5);
        z.J(6);
    }

    public C0133v(C0132u uVar) {
        uVar.getClass();
        int i = z.f3748a;
        this.f3051a = uVar.f3050a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0133v)) {
            return false;
        }
        C0133v vVar = (C0133v) obj;
        vVar.getClass();
        if (this.f3051a == vVar.f3051a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f3051a;
        return ((((int) 0) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 29791;
    }
}
