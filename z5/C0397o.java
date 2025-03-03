package Z5;

import X5.C0365p;
import g6.B;

/* renamed from: Z5.o  reason: case insensitive filesystem */
public abstract class C0397o implements U {
    private C0365p decoderResult = C0365p.SUCCESS;

    public C0365p decoderResult() {
        return this.decoderResult;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0397o)) {
            return false;
        }
        return decoderResult().equals(((C0397o) obj).decoderResult());
    }

    public int hashCode() {
        return this.decoderResult.hashCode() + 31;
    }

    public void setDecoderResult(C0365p pVar) {
        this.decoderResult = (C0365p) B.checkNotNull(pVar, "decoderResult");
    }
}
