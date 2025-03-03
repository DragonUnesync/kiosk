package Z5;

import S5.C0185n;
import X5.P;
import u.C1477r;

public final class e0 extends d0 {
    final /* synthetic */ g0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, C0185n nVar, int i) {
        super(nVar, i);
        this.this$0 = g0Var;
    }

    private boolean skipControlChars(C0185n nVar, int i, int i8) {
        int min = Math.min(this.maxLength, i);
        int forEachByte = nVar.forEachByte(i8, min, g0.SKIP_CONTROL_CHARS_BYTES);
        if (forEachByte == -1) {
            nVar.skipBytes(min);
            int i9 = this.maxLength;
            if (i <= i9) {
                return true;
            }
            throw newException(i9);
        }
        nVar.readerIndex(forEachByte);
        f0 unused = this.this$0.currentState = f0.READ_INITIAL;
        return false;
    }

    public P newException(int i) {
        return new w0(C1477r.c(i, "An HTTP line is larger than ", " bytes."));
    }

    public C0185n parse(C0185n nVar) {
        reset();
        int readableBytes = nVar.readableBytes();
        if (readableBytes == 0) {
            return null;
        }
        int readerIndex = nVar.readerIndex();
        if (this.this$0.currentState != f0.SKIP_CONTROL_CHARS || !skipControlChars(nVar, readableBytes, readerIndex)) {
            return super.parse(nVar);
        }
        return null;
    }
}
