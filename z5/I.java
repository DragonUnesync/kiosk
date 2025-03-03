package Z5;

public final class I {
    private long high;
    private long low;

    private I() {
    }

    public static boolean contains(byte b8, long j7, long j8) {
        if (b8 < 0) {
            return false;
        }
        if (b8 < 64) {
            if (0 != ((1 << b8) & j8)) {
                return true;
            }
            return false;
        } else if (0 != (j7 & (1 << (b8 - 64)))) {
            return true;
        } else {
            return false;
        }
    }

    public I bits(char... cArr) {
        for (char c8 : cArr) {
            if (c8 < '@') {
                this.low = (1 << c8) | this.low;
            } else {
                this.high = (1 << (c8 - '@')) | this.high;
            }
        }
        return this;
    }

    public long high() {
        return this.high;
    }

    public long low() {
        return this.low;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Z5.I range(char r6, char r7) {
        /*
            r5 = this;
        L_0x0000:
            if (r6 > r7) goto L_0x001a
            r0 = 1
            r2 = 64
            if (r6 >= r2) goto L_0x000f
            long r2 = r5.low
            long r0 = r0 << r6
            long r0 = r0 | r2
            r5.low = r0
            goto L_0x0017
        L_0x000f:
            long r2 = r5.high
            int r4 = r6 + -64
            long r0 = r0 << r4
            long r0 = r0 | r2
            r5.high = r0
        L_0x0017:
            int r6 = r6 + 1
            goto L_0x0000
        L_0x001a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.I.range(char, char):Z5.I");
    }
}
