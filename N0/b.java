package N0;

import P0.z;
import java.util.Arrays;

public final class b {
    public static final b e = new b(-1, -1, -1);

    /* renamed from: a  reason: collision with root package name */
    public final int f3233a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3234b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3235c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3236d;

    public b(int i, int i8, int i9) {
        int i10;
        this.f3233a = i;
        this.f3234b = i8;
        this.f3235c = i9;
        if (z.K(i9)) {
            i10 = z.A(i9, i8);
        } else {
            i10 = -1;
        }
        this.f3236d = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (N0.b) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof N0.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            N0.b r5 = (N0.b) r5
            int r1 = r5.f3233a
            int r3 = r4.f3233a
            if (r3 != r1) goto L_0x001f
            int r1 = r4.f3234b
            int r3 = r5.f3234b
            if (r1 != r3) goto L_0x001f
            int r1 = r4.f3235c
            int r5 = r5.f3235c
            if (r1 != r5) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3233a), Integer.valueOf(this.f3234b), Integer.valueOf(this.f3235c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f3233a + ", channelCount=" + this.f3234b + ", encoding=" + this.f3235c + ']';
    }
}
