package H3;

import E.e;
import N7.a;
import Q7.g;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: H3.y  reason: case insensitive filesystem */
public final class C0107y extends AbstractMap implements Serializable {

    /* renamed from: d0  reason: collision with root package name */
    public static final Object f2136d0 = new Object();

    /* renamed from: U  reason: collision with root package name */
    public transient Object f2137U;

    /* renamed from: V  reason: collision with root package name */
    public transient int[] f2138V;

    /* renamed from: W  reason: collision with root package name */
    public transient Object[] f2139W;

    /* renamed from: X  reason: collision with root package name */
    public transient Object[] f2140X;

    /* renamed from: Y  reason: collision with root package name */
    public transient int f2141Y;

    /* renamed from: Z  reason: collision with root package name */
    public transient int f2142Z;

    /* renamed from: a0  reason: collision with root package name */
    public transient C0105w f2143a0;

    /* renamed from: b0  reason: collision with root package name */
    public transient C0105w f2144b0;

    /* renamed from: c0  reason: collision with root package name */
    public transient C0100q f2145c0;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, H3.y] */
    public static C0107y a() {
        ? abstractMap = new AbstractMap();
        abstractMap.f2141Y = e.f(3, 1);
        return abstractMap;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, H3.y] */
    public static C0107y b(int i) {
        boolean z;
        ? abstractMap = new AbstractMap();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        g.d("Expected size must be >= 0", z);
        abstractMap.f2141Y = e.f(i, 1);
        return abstractMap;
    }

    public final Map c() {
        Object obj = this.f2137U;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void clear() {
        if (!g()) {
            this.f2141Y += 32;
            Map c8 = c();
            if (c8 != null) {
                this.f2141Y = e.f(size(), 3);
                c8.clear();
                this.f2137U = null;
                this.f2142Z = 0;
                return;
            }
            Arrays.fill(j(), 0, this.f2142Z, (Object) null);
            Arrays.fill(l(), 0, this.f2142Z, (Object) null);
            Object obj = this.f2137U;
            Objects.requireNonNull(obj);
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(i(), 0, this.f2142Z, 0);
            this.f2142Z = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map c8 = c();
        if (c8 != null) {
            return c8.containsKey(obj);
        }
        if (e(obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        Map c8 = c();
        if (c8 != null) {
            return c8.containsValue(obj);
        }
        for (int i = 0; i < this.f2142Z; i++) {
            if (a.e(obj, l()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f2141Y & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int v4 = C0103u.v(obj);
        int d8 = d();
        Object obj2 = this.f2137U;
        Objects.requireNonNull(obj2);
        int w2 = C0103u.w(v4 & d8, obj2);
        if (w2 == 0) {
            return -1;
        }
        int i = ~d8;
        int i8 = v4 & i;
        do {
            int i9 = w2 - 1;
            int i10 = i()[i9];
            if ((i10 & i) == i8 && a.e(obj, j()[i9])) {
                return i9;
            }
            w2 = i10 & d8;
        } while (w2 != 0);
        return -1;
    }

    public final Set entrySet() {
        C0105w wVar = this.f2144b0;
        if (wVar != null) {
            return wVar;
        }
        C0105w wVar2 = new C0105w(this, 0);
        this.f2144b0 = wVar2;
        return wVar2;
    }

    public final void f(int i, int i8) {
        Object obj = this.f2137U;
        Objects.requireNonNull(obj);
        int[] i9 = i();
        Object[] j7 = j();
        Object[] l8 = l();
        int size = size();
        int i10 = size - 1;
        if (i < i10) {
            Object obj2 = j7[i10];
            j7[i] = obj2;
            l8[i] = l8[i10];
            j7[i10] = null;
            l8[i10] = null;
            i9[i] = i9[i10];
            i9[i10] = 0;
            int v4 = C0103u.v(obj2) & i8;
            int w2 = C0103u.w(v4, obj);
            if (w2 == size) {
                C0103u.x(v4, i + 1, obj);
                return;
            }
            while (true) {
                int i11 = w2 - 1;
                int i12 = i9[i11];
                int i13 = i12 & i8;
                if (i13 == size) {
                    i9[i11] = C0103u.o(i12, i + 1, i8);
                    return;
                }
                w2 = i13;
            }
        } else {
            j7[i] = null;
            l8[i] = null;
            i9[i] = 0;
        }
    }

    public final boolean g() {
        if (this.f2137U == null) {
            return true;
        }
        return false;
    }

    public final Object get(Object obj) {
        Map c8 = c();
        if (c8 != null) {
            return c8.get(obj);
        }
        int e = e(obj);
        if (e == -1) {
            return null;
        }
        return l()[e];
    }

    public final Object h(Object obj) {
        boolean g8 = g();
        Object obj2 = f2136d0;
        if (g8) {
            return obj2;
        }
        int d8 = d();
        Object obj3 = this.f2137U;
        Objects.requireNonNull(obj3);
        int r8 = C0103u.r(obj, (Object) null, d8, obj3, i(), j(), (Object[]) null);
        if (r8 == -1) {
            return obj2;
        }
        Object obj4 = l()[r8];
        f(r8, d8);
        this.f2142Z--;
        this.f2141Y += 32;
        return obj4;
    }

    public final int[] i() {
        int[] iArr = this.f2138V;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.f2139W;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Set keySet() {
        C0105w wVar = this.f2143a0;
        if (wVar != null) {
            return wVar;
        }
        C0105w wVar2 = new C0105w(this, 1);
        this.f2143a0 = wVar2;
        return wVar2;
    }

    public final Object[] l() {
        Object[] objArr = this.f2140X;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i, int i8, int i9, int i10) {
        Object g8 = C0103u.g(i8);
        int i11 = i8 - 1;
        if (i10 != 0) {
            C0103u.x(i9 & i11, i10 + 1, g8);
        }
        Object obj = this.f2137U;
        Objects.requireNonNull(obj);
        int[] i12 = i();
        for (int i13 = 0; i13 <= i; i13++) {
            int w2 = C0103u.w(i13, obj);
            while (w2 != 0) {
                int i14 = w2 - 1;
                int i15 = i12[i14];
                int i16 = ((~i) & i15) | i13;
                int i17 = i16 & i11;
                int w4 = C0103u.w(i17, g8);
                C0103u.x(i17, w2, g8);
                i12[i14] = C0103u.o(i16, w4, i11);
                w2 = i15 & i;
            }
        }
        this.f2137U = g8;
        this.f2141Y = C0103u.o(this.f2141Y, 32 - Integer.numberOfLeadingZeros(i11), 31);
        return i11;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8 A[SYNTHETIC] */
    public final java.lang.Object put(java.lang.Object r19, java.lang.Object r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r18.g()
            r4 = 1
            if (r3 == 0) goto L_0x003f
            boolean r3 = r18.g()
            java.lang.String r5 = "Arrays already allocated"
            Q7.g.j(r5, r3)
            int r3 = r0.f2141Y
            int r5 = H3.C0103u.y(r3)
            java.lang.Object r6 = H3.C0103u.g(r5)
            r0.f2137U = r6
            int r5 = r5 - r4
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)
            int r5 = 32 - r5
            int r6 = r0.f2141Y
            r7 = 31
            int r5 = H3.C0103u.o(r6, r5, r7)
            r0.f2141Y = r5
            int[] r5 = new int[r3]
            r0.f2138V = r5
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r0.f2139W = r5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.f2140X = r3
        L_0x003f:
            java.util.Map r3 = r18.c()
            if (r3 == 0) goto L_0x004a
            java.lang.Object r1 = r3.put(r1, r2)
            return r1
        L_0x004a:
            int[] r3 = r18.i()
            java.lang.Object[] r5 = r18.j()
            java.lang.Object[] r6 = r18.l()
            int r7 = r0.f2142Z
            int r8 = r7 + 1
            int r9 = H3.C0103u.v(r19)
            int r10 = r18.d()
            r11 = r9 & r10
            java.lang.Object r12 = r0.f2137U
            j$.util.Objects.requireNonNull(r12)
            int r12 = H3.C0103u.w(r11, r12)
            if (r12 != 0) goto L_0x0085
            if (r8 <= r10) goto L_0x007b
            int r3 = H3.C0103u.q(r10)
            int r10 = r0.m(r10, r3, r9, r7)
            goto L_0x00fd
        L_0x007b:
            java.lang.Object r3 = r0.f2137U
            j$.util.Objects.requireNonNull(r3)
            H3.C0103u.x(r11, r8, r3)
            goto L_0x00fd
        L_0x0085:
            int r11 = ~r10
            r15 = r9 & r11
            r16 = 0
        L_0x008a:
            int r12 = r12 - r4
            r13 = r3[r12]
            r14 = r13 & r11
            if (r14 != r15) goto L_0x009e
            r14 = r5[r12]
            boolean r14 = N7.a.e(r1, r14)
            if (r14 == 0) goto L_0x009e
            r1 = r6[r12]
            r6[r12] = r2
            return r1
        L_0x009e:
            r14 = r13 & r10
            r17 = r5
            int r5 = r16 + 1
            if (r14 != 0) goto L_0x0154
            r6 = 9
            if (r5 < r6) goto L_0x00ec
            int r3 = r18.d()
            int r3 = r3 + r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r3, r5)
            boolean r3 = r18.isEmpty()
            r5 = -1
            if (r3 == 0) goto L_0x00bf
        L_0x00bd:
            r13 = -1
            goto L_0x00c0
        L_0x00bf:
            r13 = 0
        L_0x00c0:
            if (r13 < 0) goto L_0x00d8
            java.lang.Object[] r3 = r18.j()
            r3 = r3[r13]
            java.lang.Object[] r6 = r18.l()
            r6 = r6[r13]
            r4.put(r3, r6)
            int r13 = r13 + 1
            int r3 = r0.f2142Z
            if (r13 >= r3) goto L_0x00bd
            goto L_0x00c0
        L_0x00d8:
            r0.f2137U = r4
            r3 = 0
            r0.f2138V = r3
            r0.f2139W = r3
            r0.f2140X = r3
            int r3 = r0.f2141Y
            int r3 = r3 + 32
            r0.f2141Y = r3
            java.lang.Object r1 = r4.put(r1, r2)
            return r1
        L_0x00ec:
            if (r8 <= r10) goto L_0x00f7
            int r3 = H3.C0103u.q(r10)
            int r10 = r0.m(r10, r3, r9, r7)
            goto L_0x00fd
        L_0x00f7:
            int r5 = H3.C0103u.o(r13, r8, r10)
            r3[r12] = r5
        L_0x00fd:
            int[] r3 = r18.i()
            int r3 = r3.length
            if (r8 <= r3) goto L_0x0133
            int r5 = r3 >>> 1
            int r5 = java.lang.Math.max(r4, r5)
            int r5 = r5 + r3
            r4 = r4 | r5
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            int r4 = java.lang.Math.min(r5, r4)
            if (r4 == r3) goto L_0x0133
            int[] r3 = r18.i()
            int[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f2138V = r3
            java.lang.Object[] r3 = r18.j()
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f2139W = r3
            java.lang.Object[] r3 = r18.l()
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f2140X = r3
        L_0x0133:
            r12 = 0
            int r3 = H3.C0103u.o(r9, r12, r10)
            int[] r4 = r18.i()
            r4[r7] = r3
            java.lang.Object[] r3 = r18.j()
            r3[r7] = r1
            java.lang.Object[] r1 = r18.l()
            r1[r7] = r2
            r0.f2142Z = r8
            int r1 = r0.f2141Y
            int r1 = r1 + 32
            r0.f2141Y = r1
            r13 = 0
            return r13
        L_0x0154:
            r16 = r5
            r12 = r14
            r5 = r17
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.C0107y.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Object remove(Object obj) {
        Map c8 = c();
        if (c8 != null) {
            return c8.remove(obj);
        }
        Object h5 = h(obj);
        if (h5 == f2136d0) {
            return null;
        }
        return h5;
    }

    public final int size() {
        Map c8 = c();
        if (c8 != null) {
            return c8.size();
        }
        return this.f2142Z;
    }

    public final Collection values() {
        C0100q qVar = this.f2145c0;
        if (qVar != null) {
            return qVar;
        }
        C0100q qVar2 = new C0100q(1, this);
        this.f2145c0 = qVar2;
        return qVar2;
    }
}
