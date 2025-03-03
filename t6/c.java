package T6;

public final class c extends a {

    /* renamed from: X  reason: collision with root package name */
    public static final c f5013X = new a(1, 0, 1);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (T6.c) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof T6.c
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            T6.c r0 = (T6.c) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0021
        L_0x0013:
            T6.c r3 = (T6.c) r3
            int r0 = r3.f5006U
            int r1 = r2.f5006U
            if (r1 != r0) goto L_0x0023
            int r3 = r3.f5007V
            int r0 = r2.f5007V
            if (r0 != r3) goto L_0x0023
        L_0x0021:
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: T6.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f5006U * 31) + this.f5007V;
    }

    public final boolean isEmpty() {
        if (this.f5006U > this.f5007V) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f5006U + ".." + this.f5007V;
    }
}
