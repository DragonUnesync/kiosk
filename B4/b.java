package b4;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f8669a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8670b;

    public b(int i, int i8) {
        this.f8669a = i;
        this.f8670b = i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (b4.b) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof b4.b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            b4.b r4 = (b4.b) r4
            int r0 = r4.f8669a
            int r2 = r3.f8669a
            if (r2 != r0) goto L_0x0016
            int r0 = r3.f8670b
            int r4 = r4.f8670b
            if (r0 != r4) goto L_0x0016
            r4 = 1
            return r4
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f8669a ^ this.f8670b;
    }

    public final String toString() {
        return this.f8669a + "(" + this.f8670b + ')';
    }
}
