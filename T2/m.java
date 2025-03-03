package t2;

import y2.C1631f;

public final class m extends C1631f {

    /* renamed from: V  reason: collision with root package name */
    public final k[] f15207V;

    /* renamed from: W  reason: collision with root package name */
    public int f15208W;

    static {
        new m(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(int r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0005
            r1 = 1
            goto L_0x0006
        L_0x0005:
            r1 = 0
        L_0x0006:
            r2.<init>(r1)
            t2.k[] r3 = new t2.k[r3]
            r2.f15207V = r3
            r2.f15208W = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.m.<init>(int):void");
    }

    public final k e(int i) {
        try {
            return this.f15207V[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        k[] kVarArr = mVar.f15207V;
        k[] kVarArr2 = this.f15207V;
        int length = kVarArr2.length;
        if (length != kVarArr.length || f() != mVar.f()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            k kVar = kVarArr2[i];
            k kVar2 = kVarArr[i];
            if (kVar != kVar2 && (kVar == null || !kVar.equals(kVar2))) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        int i = this.f15208W;
        if (i >= 0) {
            return i;
        }
        int i8 = 0;
        for (k kVar : this.f15207V) {
            if (kVar != null) {
                i8++;
            }
        }
        this.f15208W = i8;
        return i8;
    }

    public final int hashCode() {
        int i;
        int i8 = 0;
        for (k kVar : this.f15207V) {
            if (kVar == null) {
                i = 0;
            } else {
                i = kVar.hashCode();
            }
            i8 = (i8 * 31) + i;
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(r1 * 25);
        sb.append('{');
        boolean z = false;
        for (k kVar : this.f15207V) {
            if (kVar != null) {
                if (z) {
                    sb.append(", ");
                } else {
                    z = true;
                }
                sb.append(kVar);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
