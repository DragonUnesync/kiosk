package Z5;

import g6.B;

/* renamed from: Z5.n  reason: case insensitive filesystem */
public abstract class C0396n extends C0397o implements N {
    private final L headers;
    private r0 version;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0396n(r0 r0Var, boolean z, boolean z6) {
        this(r0Var, z6 ? new C0387e(z) : new C0395m(z));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0396n)) {
            return false;
        }
        C0396n nVar = (C0396n) obj;
        if (!headers().equals(nVar.headers()) || !protocolVersion().equals(nVar.protocolVersion()) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.version.hashCode() + ((this.headers.hashCode() + 31) * 31)) * 31) + super.hashCode();
    }

    public L headers() {
        return this.headers;
    }

    public r0 protocolVersion() {
        return this.version;
    }

    public C0396n(r0 r0Var, L l8) {
        this.version = (r0) B.checkNotNull(r0Var, "version");
        this.headers = (L) B.checkNotNull(l8, "headers");
    }
}
