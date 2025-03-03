package T6;

import G5.s;
import java.util.Iterator;

public class a implements Iterable {

    /* renamed from: U  reason: collision with root package name */
    public final int f5006U;

    /* renamed from: V  reason: collision with root package name */
    public final int f5007V;

    /* renamed from: W  reason: collision with root package name */
    public final int f5008W;

    public a(int i, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i9 != Integer.MIN_VALUE) {
            this.f5006U = i;
            this.f5007V = s.r(i, i8, i9);
            this.f5008W = i9;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (T6.a) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof T6.a
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            T6.a r0 = (T6.a) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            T6.a r3 = (T6.a) r3
            int r0 = r3.f5006U
            int r1 = r2.f5006U
            if (r1 != r0) goto L_0x0029
            int r0 = r2.f5007V
            int r1 = r3.f5007V
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f5008W
            int r3 = r3.f5008W
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: T6.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f5006U * 31) + this.f5007V) * 31) + this.f5008W;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isEmpty() {
        /*
            r5 = this;
            int r0 = r5.f5008W
            r1 = 0
            r2 = 1
            int r3 = r5.f5007V
            int r4 = r5.f5006U
            if (r0 <= 0) goto L_0x000e
            if (r4 <= r3) goto L_0x0011
        L_0x000c:
            r1 = 1
            goto L_0x0011
        L_0x000e:
            if (r4 >= r3) goto L_0x0011
            goto L_0x000c
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T6.a.isEmpty():boolean");
    }

    public final Iterator iterator() {
        return new b(this.f5006U, this.f5007V, this.f5008W);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f5007V;
        int i8 = this.f5006U;
        int i9 = this.f5008W;
        if (i9 > 0) {
            sb.append(i8);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
