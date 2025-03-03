package X0;

import java.util.Arrays;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f6210a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6211b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6212c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6213d;

    public b(String str, int i, String str2, int i8) {
        this.f6210a = str;
        this.f6211b = str2;
        this.f6212c = i;
        this.f6213d = i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (X0.b) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof X0.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            X0.b r5 = (X0.b) r5
            int r1 = r5.f6212c
            int r3 = r4.f6212c
            if (r3 != r1) goto L_0x002d
            int r1 = r4.f6213d
            int r3 = r5.f6213d
            if (r1 != r3) goto L_0x002d
            java.lang.String r1 = r4.f6210a
            java.lang.String r3 = r5.f6210a
            boolean r1 = N7.a.e(r1, r3)
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = r4.f6211b
            java.lang.String r5 = r5.f6211b
            boolean r5 = N7.a.e(r1, r5)
            if (r5 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f6212c);
        Integer valueOf2 = Integer.valueOf(this.f6213d);
        return Arrays.hashCode(new Object[]{this.f6210a, this.f6211b, valueOf, valueOf2});
    }
}
