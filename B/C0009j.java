package B;

import android.view.Surface;

/* renamed from: B.j  reason: case insensitive filesystem */
public final class C0009j {

    /* renamed from: a  reason: collision with root package name */
    public final int f262a;

    /* renamed from: b  reason: collision with root package name */
    public final Surface f263b;

    public C0009j(int i, Surface surface) {
        this.f262a = i;
        if (surface != null) {
            this.f263b = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r5 = (B.C0009j) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof B.C0009j
            r2 = 0
            if (r1 == 0) goto L_0x001e
            B.j r5 = (B.C0009j) r5
            int r1 = r5.f262a
            int r3 = r4.f262a
            if (r3 != r1) goto L_0x001c
            android.view.Surface r1 = r4.f263b
            android.view.Surface r5 = r5.f263b
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        L_0x001e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C0009j.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f263b.hashCode() ^ ((this.f262a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.f262a + ", surface=" + this.f263b + "}";
    }
}
