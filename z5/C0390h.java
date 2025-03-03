package Z5;

import S5.C0185n;
import g6.B;
import g6.n0;

/* renamed from: Z5.h  reason: case insensitive filesystem */
public class C0390h extends C0397o implements D {
    private final C0185n content;

    public C0390h(C0185n nVar) {
        this.content = (C0185n) B.checkNotNull(nVar, "content");
    }

    public C0185n content() {
        return this.content;
    }

    public int refCnt() {
        return this.content.refCnt();
    }

    public boolean release() {
        return this.content.release();
    }

    public String toString() {
        return n0.simpleClassName((Object) this) + "(data: " + content() + ", decoderResult: " + decoderResult() + ')';
    }

    public D touch(Object obj) {
        this.content.touch(obj);
        return this;
    }
}
