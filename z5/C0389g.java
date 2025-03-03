package Z5;

import S5.C0185n;
import S5.C0206y;
import S5.D0;
import e6.r;
import g6.B;

/* renamed from: Z5.g  reason: case insensitive filesystem */
public final class C0389g extends C0399q implements C0406y {
    private final C0185n content;
    private int hash;
    private final L trailingHeaders;

    public C0389g(r0 r0Var, m0 m0Var, C0185n nVar) {
        this(r0Var, m0Var, nVar, true);
    }

    public C0185n content() {
        return this.content;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0389g)) {
            return false;
        }
        C0389g gVar = (C0389g) obj;
        if (!super.equals(gVar) || !content().equals(gVar.content()) || !trailingHeaders().equals(gVar.trailingHeaders())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i8 = this.hash;
        if (i8 != 0) {
            return i8;
        }
        if (C0206y.isAccessible(content())) {
            try {
                i = content().hashCode() + 31;
            } catch (r unused) {
            }
            int hashCode = trailingHeaders().hashCode();
            int hashCode2 = super.hashCode() + ((hashCode + (i * 31)) * 31);
            this.hash = hashCode2;
            return hashCode2;
        }
        i = 31;
        int hashCode3 = trailingHeaders().hashCode();
        int hashCode22 = super.hashCode() + ((hashCode3 + (i * 31)) * 31);
        this.hash = hashCode22;
        return hashCode22;
    }

    public int refCnt() {
        return this.content.refCnt();
    }

    public boolean release() {
        return this.content.release();
    }

    public C0406y replace(C0185n nVar) {
        C0389g gVar = new C0389g(protocolVersion(), status(), nVar, headers().copy(), trailingHeaders().copy());
        gVar.setDecoderResult(decoderResult());
        return gVar;
    }

    public C0406y retainedDuplicate() {
        return replace(content().retainedDuplicate());
    }

    public String toString() {
        return P.appendFullResponse(new StringBuilder(256), this).toString();
    }

    public L trailingHeaders() {
        return this.trailingHeaders;
    }

    public C0389g(r0 r0Var, m0 m0Var, boolean z) {
        this(r0Var, m0Var, D0.buffer(0), z, false);
    }

    public C0406y touch(Object obj) {
        this.content.touch(obj);
        return this;
    }

    public C0389g(r0 r0Var, m0 m0Var, C0185n nVar, boolean z) {
        this(r0Var, m0Var, nVar, z, false);
    }

    public C0389g(r0 r0Var, m0 m0Var, C0185n nVar, boolean z, boolean z6) {
        super(r0Var, m0Var, z, z6);
        this.content = (C0185n) B.checkNotNull(nVar, "content");
        this.trailingHeaders = z6 ? new C0387e(z) : new C0395m(z);
    }

    public C0389g(r0 r0Var, m0 m0Var, C0185n nVar, L l8, L l9) {
        super(r0Var, m0Var, l8);
        this.content = (C0185n) B.checkNotNull(nVar, "content");
        this.trailingHeaders = (L) B.checkNotNull(l9, "trailingHeaders");
    }
}
