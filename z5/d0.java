package Z5;

import S5.C0185n;
import X5.P;
import u.C1477r;

public class d0 {
    protected final int maxLength;
    protected final C0185n seq;
    int size;

    public d0(C0185n nVar, int i) {
        this.seq = nVar;
        this.maxLength = i;
    }

    public P newException(int i) {
        return new v0(C1477r.c(i, "HTTP header is larger than ", " bytes."));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r8.getByte(r0) == 13) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S5.C0185n parse(S5.C0185n r8) {
        /*
            r7 = this;
            int r0 = r8.readableBytes()
            int r1 = r8.readerIndex()
            int r2 = r7.maxLength
            int r3 = r7.size
            int r2 = r2 - r3
            long r3 = (long) r2
            r5 = 2
            long r3 = r3 + r5
            long r5 = (long) r0
            long r3 = java.lang.Math.min(r3, r5)
            int r4 = (int) r3
            int r4 = r4 + r1
            r3 = 10
            int r3 = r8.indexOf(r1, r4, r3)
            r4 = -1
            if (r3 != r4) goto L_0x002c
            if (r0 > r2) goto L_0x0025
            r8 = 0
            return r8
        L_0x0025:
            int r8 = r7.maxLength
            X5.P r8 = r7.newException(r8)
            throw r8
        L_0x002c:
            if (r3 <= r1) goto L_0x0039
            int r0 = r3 + -1
            byte r2 = r8.getByte(r0)
            r4 = 13
            if (r2 != r4) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r0 = r3
        L_0x003a:
            int r0 = r0 - r1
            if (r0 != 0) goto L_0x004a
            S5.n r0 = r7.seq
            r0.clear()
            int r3 = r3 + 1
            r8.readerIndex(r3)
            S5.n r8 = r7.seq
            return r8
        L_0x004a:
            int r2 = r7.size
            int r2 = r2 + r0
            int r4 = r7.maxLength
            if (r2 > r4) goto L_0x0065
            r7.size = r2
            S5.n r2 = r7.seq
            r2.clear()
            S5.n r2 = r7.seq
            r2.writeBytes((S5.C0185n) r8, (int) r1, (int) r0)
            int r3 = r3 + 1
            r8.readerIndex(r3)
            S5.n r8 = r7.seq
            return r8
        L_0x0065:
            X5.P r8 = r7.newException(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.d0.parse(S5.n):S5.n");
    }

    public void reset() {
        this.size = 0;
    }
}
