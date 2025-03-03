package Z5;

import S5.C0185n;
import S5.D0;
import X5.C0365p;

public final class s0 implements t0 {
    public C0185n content() {
        return D0.EMPTY_BUFFER;
    }

    public C0365p decoderResult() {
        return C0365p.SUCCESS;
    }

    public int refCnt() {
        return 1;
    }

    public boolean release() {
        return false;
    }

    public void setDecoderResult(C0365p pVar) {
        throw new UnsupportedOperationException("read only");
    }

    public String toString() {
        return "EmptyLastHttpContent";
    }

    public L trailingHeaders() {
        return C0403v.INSTANCE;
    }

    public t0 touch(Object obj) {
        return this;
    }
}
