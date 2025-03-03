package j4;

import u.C1477r;

/* renamed from: j4.c  reason: case insensitive filesystem */
public final class C1126c {

    /* renamed from: c  reason: collision with root package name */
    public static final int[][] f12869c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a  reason: collision with root package name */
    public final int f12870a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f12871b;

    public C1126c(int i) {
        int i8 = (i >> 3) & 3;
        if (i8 < 0 || i8 >= 4) {
            throw new IllegalArgumentException();
        }
        this.f12870a = C1125b.f12868a[i8];
        this.f12871b = (byte) (i & 7);
    }

    public static C1126c a(int i, int i8) {
        int bitCount;
        int[][] iArr = f12869c;
        int i9 = Integer.MAX_VALUE;
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            int[] iArr2 = iArr[i11];
            int i12 = iArr2[0];
            if (i12 == i || i12 == i8) {
                return new C1126c(iArr2[1]);
            }
            int bitCount2 = Integer.bitCount(i ^ i12);
            if (bitCount2 < i9) {
                i10 = iArr2[1];
                i9 = bitCount2;
            }
            if (i != i8 && (bitCount = Integer.bitCount(i12 ^ i8)) < i9) {
                i10 = iArr2[1];
                i9 = bitCount;
            }
        }
        if (i9 <= 3) {
            return new C1126c(i10);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (j4.C1126c) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof j4.C1126c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            j4.c r4 = (j4.C1126c) r4
            int r0 = r4.f12870a
            int r2 = r3.f12870a
            if (r2 != r0) goto L_0x0016
            byte r0 = r3.f12871b
            byte r4 = r4.f12871b
            if (r0 != r4) goto L_0x0016
            r4 = 1
            return r4
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C1126c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (C1477r.h(this.f12870a) << 3) | this.f12871b;
    }
}
