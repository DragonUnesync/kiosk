package a6;

import Z5.C0399q;
import Z5.k0;

public final class s extends J {
    private final k0 response;

    public s(String str) {
        this(str, (k0) null);
    }

    public s(String str, k0 k0Var) {
        super(str);
        if (k0Var != null) {
            this.response = new C0399q(k0Var.protocolVersion(), k0Var.status(), k0Var.headers());
        } else {
            this.response = null;
        }
    }
}
