package Z5;

import g6.B;

/* renamed from: Z5.q  reason: case insensitive filesystem */
public class C0399q extends C0396n implements k0 {
    private m0 status;

    public C0399q(r0 r0Var, m0 m0Var, boolean z) {
        this(r0Var, m0Var, z, false);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C0399q) && this.status.equals(((C0399q) obj).status()) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.status.hashCode() + 31) * 31) + super.hashCode();
    }

    public m0 status() {
        return this.status;
    }

    public String toString() {
        return P.appendResponse(new StringBuilder(256), this).toString();
    }

    public C0399q(r0 r0Var, m0 m0Var, boolean z, boolean z6) {
        super(r0Var, z, z6);
        this.status = (m0) B.checkNotNull(m0Var, "status");
    }

    public C0399q(r0 r0Var, m0 m0Var, L l8) {
        super(r0Var, l8);
        this.status = (m0) B.checkNotNull(m0Var, "status");
    }
}
