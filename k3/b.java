package K3;

import E.e;
import Q7.g;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class b extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final int[] f2660U;

    /* renamed from: V  reason: collision with root package name */
    public final int f2661V;

    /* renamed from: W  reason: collision with root package name */
    public final int f2662W;

    public b(int i, int i8, int[] iArr) {
        this.f2660U = iArr;
        this.f2661V = i;
        this.f2662W = i8;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (e.r(((Integer) obj).intValue(), this.f2661V, this.f2662W, this.f2660U) != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f2660U[this.f2661V + i] != bVar.f2660U[bVar.f2661V + i]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        g.f(i, size());
        return Integer.valueOf(this.f2660U[this.f2661V + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i8 = this.f2661V; i8 < this.f2662W; i8++) {
            i = (i * 31) + this.f2660U[i8];
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = ((java.lang.Integer) r4).intValue();
        r0 = r3.f2660U;
        r1 = r3.f2661V;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int indexOf(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0018
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int[] r0 = r3.f2660U
            int r1 = r3.f2661V
            int r2 = r3.f2662W
            int r4 = E.e.r(r4, r1, r2, r0)
            if (r4 < 0) goto L_0x0018
            int r4 = r4 - r1
            return r4
        L_0x0018:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.b.indexOf(java.lang.Object):int");
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i8 = this.f2662W;
            while (true) {
                i8--;
                i = this.f2661V;
                if (i8 < i) {
                    i8 = -1;
                    break;
                } else if (this.f2660U[i8] == intValue) {
                    break;
                }
            }
            if (i8 >= 0) {
                return i8 - i;
            }
        }
        return -1;
    }

    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        g.f(i, size());
        int i8 = this.f2661V + i;
        int[] iArr = this.f2660U;
        int i9 = iArr[i8];
        num.getClass();
        iArr[i8] = num.intValue();
        return Integer.valueOf(i9);
    }

    public final int size() {
        return this.f2662W - this.f2661V;
    }

    public final List subList(int i, int i8) {
        g.i(i, i8, size());
        if (i == i8) {
            return Collections.emptyList();
        }
        int i9 = this.f2661V;
        return new b(i + i9, i9 + i8, this.f2660U);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f2660U;
        int i = this.f2661V;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i < this.f2662W) {
                sb.append(", ");
                sb.append(iArr[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
