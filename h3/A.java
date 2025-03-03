package H3;

import E.e;
import N7.a;
import Q7.g;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public final class A extends AbstractSet implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public transient Object f2001U;

    /* renamed from: V  reason: collision with root package name */
    public transient int[] f2002V;

    /* renamed from: W  reason: collision with root package name */
    public transient Object[] f2003W;

    /* renamed from: X  reason: collision with root package name */
    public transient int f2004X;

    /* renamed from: Y  reason: collision with root package name */
    public transient int f2005Y;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractSet, H3.A] */
    public static A b(int i) {
        boolean z;
        ? abstractSet = new AbstractSet();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        g.d("Expected size must be >= 0", z);
        abstractSet.f2004X = e.f(i, 1);
        return abstractSet;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c2 A[SYNTHETIC] */
    public final boolean add(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r16.d()
            r3 = 31
            r4 = 1
            if (r2 == 0) goto L_0x0039
            boolean r2 = r16.d()
            java.lang.String r5 = "Arrays already allocated"
            Q7.g.j(r5, r2)
            int r2 = r0.f2004X
            int r5 = H3.C0103u.y(r2)
            java.lang.Object r6 = H3.C0103u.g(r5)
            r0.f2001U = r6
            int r5 = r5 - r4
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)
            int r5 = 32 - r5
            int r6 = r0.f2004X
            int r5 = H3.C0103u.o(r6, r5, r3)
            r0.f2004X = r5
            int[] r5 = new int[r2]
            r0.f2002V = r5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.f2003W = r2
        L_0x0039:
            java.util.Set r2 = r16.c()
            if (r2 == 0) goto L_0x0044
            boolean r1 = r2.add(r1)
            return r1
        L_0x0044:
            int[] r2 = r16.f()
            java.lang.Object[] r5 = r16.e()
            int r6 = r0.f2005Y
            int r7 = r6 + 1
            int r8 = H3.C0103u.v(r17)
            int r9 = r0.f2004X
            r9 = r9 & r3
            int r9 = r4 << r9
            int r9 = r9 - r4
            r10 = r8 & r9
            java.lang.Object r11 = r0.f2001U
            j$.util.Objects.requireNonNull(r11)
            int r11 = H3.C0103u.w(r10, r11)
            r12 = 0
            if (r11 != 0) goto L_0x007d
            if (r7 <= r9) goto L_0x0074
            int r2 = H3.C0103u.q(r9)
            int r9 = r0.g(r9, r2, r8, r6)
            goto L_0x00e5
        L_0x0074:
            java.lang.Object r2 = r0.f2001U
            j$.util.Objects.requireNonNull(r2)
            H3.C0103u.x(r10, r7, r2)
            goto L_0x00e5
        L_0x007d:
            int r10 = ~r9
            r13 = r8 & r10
            r14 = 0
        L_0x0081:
            int r11 = r11 - r4
            r15 = r2[r11]
            r3 = r15 & r10
            if (r3 != r13) goto L_0x0091
            r3 = r5[r11]
            boolean r3 = N7.a.e(r1, r3)
            if (r3 == 0) goto L_0x0091
            return r12
        L_0x0091:
            r3 = r15 & r9
            int r14 = r14 + r4
            if (r3 != 0) goto L_0x012a
            r3 = 9
            if (r14 < r3) goto L_0x00d4
            int r2 = r0.f2004X
            r11 = 31
            r2 = r2 & r11
            int r2 = r4 << r2
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r2, r4)
            boolean r2 = r16.isEmpty()
            r4 = -1
            if (r2 == 0) goto L_0x00b0
        L_0x00af:
            r12 = -1
        L_0x00b0:
            if (r12 < 0) goto L_0x00c2
            java.lang.Object[] r2 = r16.e()
            r2 = r2[r12]
            r3.add(r2)
            int r12 = r12 + 1
            int r2 = r0.f2005Y
            if (r12 >= r2) goto L_0x00af
            goto L_0x00b0
        L_0x00c2:
            r0.f2001U = r3
            r2 = 0
            r0.f2002V = r2
            r0.f2003W = r2
            int r2 = r0.f2004X
            int r2 = r2 + 32
            r0.f2004X = r2
            boolean r1 = r3.add(r1)
            return r1
        L_0x00d4:
            if (r7 <= r9) goto L_0x00df
            int r2 = H3.C0103u.q(r9)
            int r9 = r0.g(r9, r2, r8, r6)
            goto L_0x00e5
        L_0x00df:
            int r3 = H3.C0103u.o(r15, r7, r9)
            r2[r11] = r3
        L_0x00e5:
            int[] r2 = r16.f()
            int r2 = r2.length
            if (r7 <= r2) goto L_0x0111
            int r3 = r2 >>> 1
            int r3 = java.lang.Math.max(r4, r3)
            int r3 = r3 + r2
            r3 = r3 | r4
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            int r3 = java.lang.Math.min(r5, r3)
            if (r3 == r2) goto L_0x0111
            int[] r2 = r16.f()
            int[] r2 = java.util.Arrays.copyOf(r2, r3)
            r0.f2002V = r2
            java.lang.Object[] r2 = r16.e()
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            r0.f2003W = r2
        L_0x0111:
            int r2 = H3.C0103u.o(r8, r12, r9)
            int[] r3 = r16.f()
            r3[r6] = r2
            java.lang.Object[] r2 = r16.e()
            r2[r6] = r1
            r0.f2005Y = r7
            int r1 = r0.f2004X
            int r1 = r1 + 32
            r0.f2004X = r1
            return r4
        L_0x012a:
            r11 = r3
            r3 = 31
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.A.add(java.lang.Object):boolean");
    }

    public final Set c() {
        Object obj = this.f2001U;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final void clear() {
        if (!d()) {
            this.f2004X += 32;
            Set c8 = c();
            if (c8 != null) {
                this.f2004X = e.f(size(), 3);
                c8.clear();
                this.f2001U = null;
                this.f2005Y = 0;
                return;
            }
            Arrays.fill(e(), 0, this.f2005Y, (Object) null);
            Object obj = this.f2001U;
            Objects.requireNonNull(obj);
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(f(), 0, this.f2005Y, 0);
            this.f2005Y = 0;
        }
    }

    public final boolean contains(Object obj) {
        if (d()) {
            return false;
        }
        Set c8 = c();
        if (c8 != null) {
            return c8.contains(obj);
        }
        int v4 = C0103u.v(obj);
        int i = (1 << (this.f2004X & 31)) - 1;
        Object obj2 = this.f2001U;
        Objects.requireNonNull(obj2);
        int w2 = C0103u.w(v4 & i, obj2);
        if (w2 == 0) {
            return false;
        }
        int i8 = ~i;
        int i9 = v4 & i8;
        do {
            int i10 = w2 - 1;
            int i11 = f()[i10];
            if ((i11 & i8) == i9 && a.e(obj, e()[i10])) {
                return true;
            }
            w2 = i11 & i;
        } while (w2 != 0);
        return false;
    }

    public final boolean d() {
        if (this.f2001U == null) {
            return true;
        }
        return false;
    }

    public final Object[] e() {
        Object[] objArr = this.f2003W;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] f() {
        int[] iArr = this.f2002V;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int g(int i, int i8, int i9, int i10) {
        Object g8 = C0103u.g(i8);
        int i11 = i8 - 1;
        if (i10 != 0) {
            C0103u.x(i9 & i11, i10 + 1, g8);
        }
        Object obj = this.f2001U;
        Objects.requireNonNull(obj);
        int[] f8 = f();
        for (int i12 = 0; i12 <= i; i12++) {
            int w2 = C0103u.w(i12, obj);
            while (w2 != 0) {
                int i13 = w2 - 1;
                int i14 = f8[i13];
                int i15 = ((~i) & i14) | i12;
                int i16 = i15 & i11;
                int w4 = C0103u.w(i16, g8);
                C0103u.x(i16, w2, g8);
                f8[i13] = C0103u.o(i15, w4, i11);
                w2 = i14 & i;
            }
        }
        this.f2001U = g8;
        this.f2004X = C0103u.o(this.f2004X, 32 - Integer.numberOfLeadingZeros(i11), 31);
        return i11;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        Set c8 = c();
        if (c8 != null) {
            return c8.iterator();
        }
        return new C0108z(this);
    }

    public final boolean remove(Object obj) {
        int i;
        int i8;
        if (d()) {
            return false;
        }
        Set c8 = c();
        if (c8 != null) {
            return c8.remove(obj);
        }
        int i9 = (1 << (this.f2004X & 31)) - 1;
        Object obj2 = this.f2001U;
        Objects.requireNonNull(obj2);
        int r8 = C0103u.r(obj, (Object) null, i9, obj2, f(), e(), (Object[]) null);
        if (r8 == -1) {
            return false;
        }
        Object obj3 = this.f2001U;
        Objects.requireNonNull(obj3);
        int[] f8 = f();
        Object[] e = e();
        int size = size();
        int i10 = size - 1;
        if (r8 < i10) {
            Object obj4 = e[i10];
            e[r8] = obj4;
            e[i10] = null;
            f8[r8] = f8[i10];
            f8[i10] = 0;
            int v4 = C0103u.v(obj4) & i9;
            int w2 = C0103u.w(v4, obj3);
            if (w2 == size) {
                C0103u.x(v4, r8 + 1, obj3);
            } else {
                while (true) {
                    i = w2 - 1;
                    i8 = f8[i];
                    int i11 = i8 & i9;
                    if (i11 == size) {
                        break;
                    }
                    w2 = i11;
                }
                f8[i] = C0103u.o(i8, r8 + 1, i9);
            }
        } else {
            e[r8] = null;
            f8[r8] = 0;
        }
        this.f2005Y--;
        this.f2004X += 32;
        return true;
    }

    public final int size() {
        Set c8 = c();
        if (c8 != null) {
            return c8.size();
        }
        return this.f2005Y;
    }

    public final Object[] toArray() {
        if (d()) {
            return new Object[0];
        }
        Set c8 = c();
        return c8 != null ? c8.toArray() : Arrays.copyOf(e(), this.f2005Y);
    }

    public final Object[] toArray(Object[] objArr) {
        if (d()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set c8 = c();
        if (c8 != null) {
            return c8.toArray(objArr);
        }
        Object[] e = e();
        int i = this.f2005Y;
        g.i(0, i, e.length);
        if (objArr.length < i) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        System.arraycopy(e, 0, objArr, 0, i);
        return objArr;
    }
}
