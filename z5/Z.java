package Z5;

import S5.C0185n;

public final class Z extends X implements C0406y {
    public Z(k0 k0Var, C0185n nVar, L l8) {
        super(k0Var, nVar, l8);
    }

    public m0 getStatus() {
        return ((k0) this.message).status();
    }

    public C0406y replace(C0185n nVar) {
        C0389g gVar = new C0389g(getProtocolVersion(), getStatus(), nVar, headers().copy(), trailingHeaders().copy());
        gVar.setDecoderResult(decoderResult());
        return gVar;
    }

    public C0406y retainedDuplicate() {
        return replace(content().retainedDuplicate());
    }

    public m0 status() {
        return getStatus();
    }

    public String toString() {
        return P.appendFullResponse(new StringBuilder(256), this).toString();
    }

    public C0406y touch(Object obj) {
        super.touch(obj);
        return this;
    }
}
