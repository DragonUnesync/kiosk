package Z5;

import S5.C0185n;
import X5.C0365p;

public abstract class X implements C0404w {
    private final C0185n content;
    protected final N message;
    private L trailingHeaders;

    public X(N n4, C0185n nVar, L l8) {
        this.message = n4;
        this.content = nVar;
        this.trailingHeaders = l8;
    }

    public C0185n content() {
        return this.content;
    }

    public C0365p decoderResult() {
        return this.message.decoderResult();
    }

    public r0 getProtocolVersion() {
        return this.message.protocolVersion();
    }

    public L headers() {
        return this.message.headers();
    }

    public r0 protocolVersion() {
        return this.message.protocolVersion();
    }

    public int refCnt() {
        return this.content.refCnt();
    }

    public boolean release() {
        return this.content.release();
    }

    public void setDecoderResult(C0365p pVar) {
        this.message.setDecoderResult(pVar);
    }

    public void setTrailingHeaders(L l8) {
        this.trailingHeaders = l8;
    }

    public C0404w touch(Object obj) {
        this.content.touch(obj);
        return this;
    }

    public L trailingHeaders() {
        L l8 = this.trailingHeaders;
        if (l8 == null) {
            return C0403v.INSTANCE;
        }
        return l8;
    }
}
