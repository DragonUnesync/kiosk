package K3;

import java.io.Serializable;

public final class a implements Serializable {

    /* renamed from: W  reason: collision with root package name */
    public static final /* synthetic */ int f2657W = 0;

    /* renamed from: U  reason: collision with root package name */
    public final int[] f2658U;

    /* renamed from: V  reason: collision with root package name */
    public final int f2659V;

    static {
        new a(new int[0]);
    }

    public a(int[] iArr) {
        int length = iArr.length;
        this.f2658U = iArr;
        this.f2659V = length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r7 = (K3.a) r7;
        r1 = r7.f2659V;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof K3.a
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            K3.a r7 = (K3.a) r7
            int r1 = r7.f2659V
            int r3 = r6.f2659V
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            r1 = 0
        L_0x0014:
            if (r1 >= r3) goto L_0x002c
            Q7.g.f(r1, r3)
            int[] r4 = r6.f2658U
            r4 = r4[r1]
            int r5 = r7.f2659V
            Q7.g.f(r1, r5)
            int[] r5 = r7.f2658U
            r5 = r5[r1]
            if (r4 == r5) goto L_0x0029
            return r2
        L_0x0029:
            int r1 = r1 + 1
            goto L_0x0014
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i8 = 0; i8 < this.f2659V; i8++) {
            i = (i * 31) + this.f2658U[i8];
        }
        return i;
    }

    public final String toString() {
        int i = this.f2659V;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f2658U;
        sb.append(iArr[0]);
        for (int i8 = 1; i8 < i; i8++) {
            sb.append(", ");
            sb.append(iArr[i8]);
        }
        sb.append(']');
        return sb.toString();
    }
}
