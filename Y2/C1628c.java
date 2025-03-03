package y2;

import java.util.Arrays;
import v2.c;

/* renamed from: y2.c  reason: case insensitive filesystem */
public abstract class C1628c extends C1631f implements C1632g {

    /* renamed from: V  reason: collision with root package name */
    public final Object[] f16371V;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1628c(int r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0004
            r0 = 1
            goto L_0x0005
        L_0x0004:
            r0 = 0
        L_0x0005:
            r1.<init>(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NegativeArraySizeException -> 0x000d }
            r1.f16371V = r2     // Catch:{ NegativeArraySizeException -> 0x000d }
            return
        L_0x000d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size < 0"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C1628c.<init>(int):void");
    }

    public String a() {
        String name = getClass().getName();
        return g(name.substring(name.lastIndexOf(46) + 1) + '{', "}", true);
    }

    public c b(int i) {
        return (c) e(i);
    }

    public final Object e(int i) {
        try {
            Object obj = this.f16371V[i];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("n < 0");
            }
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f16371V, ((C1628c) obj).f16371V);
    }

    public final void f(int i, Object obj) {
        d();
        try {
            this.f16371V[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("n < 0");
            }
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    public final String g(String str, String str2, boolean z) {
        Object[] objArr = this.f16371V;
        int length = objArr.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            if (z) {
                sb.append(((C1632g) objArr[i]).a());
            } else {
                sb.append(objArr[i]);
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16371V);
    }

    public final String toString() {
        String name = getClass().getName();
        return g(name.substring(name.lastIndexOf(46) + 1) + '{', "}", false);
    }
}
