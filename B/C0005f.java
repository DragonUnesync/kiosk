package B;

/* renamed from: B.f  reason: case insensitive filesystem */
public final class C0005f {

    /* renamed from: a  reason: collision with root package name */
    public final int f235a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f236b;

    public C0005f(Throwable th, int i) {
        this.f235a = i;
        this.f236b = th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r5 = (B.C0005f) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof B.C0005f
            r2 = 0
            if (r1 == 0) goto L_0x0023
            B.f r5 = (B.C0005f) r5
            int r1 = r5.f235a
            int r3 = r4.f235a
            if (r3 != r1) goto L_0x0021
            java.lang.Throwable r5 = r5.f236b
            java.lang.Throwable r1 = r4.f236b
            if (r1 != 0) goto L_0x001a
            if (r5 != 0) goto L_0x0021
            goto L_0x0022
        L_0x001a:
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            return r0
        L_0x0023:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C0005f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i8 = (this.f235a ^ 1000003) * 1000003;
        Throwable th = this.f236b;
        if (th == null) {
            i = 0;
        } else {
            i = th.hashCode();
        }
        return i8 ^ i;
    }

    public final String toString() {
        return "StateError{code=" + this.f235a + ", cause=" + this.f236b + "}";
    }
}
