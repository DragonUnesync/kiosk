package T0;

import M0.V;
import M0.W;
import M0.X;
import P0.z;
import android.util.Pair;
import h1.b0;
import java.util.HashMap;

public final class c0 extends X {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f4783k = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f4784b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f4785c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4786d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f4787f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f4788g;

    /* renamed from: h  reason: collision with root package name */
    public final X[] f4789h;
    public final Object[] i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f4790j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c0(java.util.List r7, h1.b0 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            M0.X[] r0 = new M0.X[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = 0
        L_0x000c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0022
            java.lang.Object r4 = r1.next()
            T0.N r4 = (T0.N) r4
            int r5 = r3 + 1
            M0.X r4 = r4.b()
            r0[r3] = r4
            r3 = r5
            goto L_0x000c
        L_0x0022:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L_0x002c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r7.next()
            T0.N r3 = (T0.N) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.a()
            r1[r2] = r3
            r2 = r4
            goto L_0x002c
        L_0x0042:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.c0.<init>(java.util.List, h1.b0):void");
    }

    public final int a(boolean z) {
        if (this.f4784b == 0) {
            return -1;
        }
        int i8 = 0;
        if (z) {
            int[] iArr = this.f4785c.f12437b;
            if (iArr.length > 0) {
                i8 = iArr[0];
            } else {
                i8 = -1;
            }
        }
        do {
            X[] xArr = this.f4789h;
            if (xArr[i8].p()) {
                i8 = q(i8, z);
            } else {
                return xArr[i8].a(z) + this.f4788g[i8];
            }
        } while (i8 != -1);
        return -1;
    }

    public final int b(Object obj) {
        int i8;
        int b8;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f4790j.get(obj2);
        if (num == null) {
            i8 = -1;
        } else {
            i8 = num.intValue();
        }
        if (i8 == -1 || (b8 = this.f4789h[i8].b(obj3)) == -1) {
            return -1;
        }
        return this.f4787f[i8] + b8;
    }

    public final int c(boolean z) {
        int i8;
        int i9 = this.f4784b;
        if (i9 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.f4785c.f12437b;
            if (iArr.length > 0) {
                i8 = iArr[iArr.length - 1];
            } else {
                i8 = -1;
            }
        } else {
            i8 = i9 - 1;
        }
        do {
            X[] xArr = this.f4789h;
            if (xArr[i8].p()) {
                i8 = r(i8, z);
            } else {
                return xArr[i8].c(z) + this.f4788g[i8];
            }
        } while (i8 != -1);
        return -1;
    }

    public final int e(int i8, int i9, boolean z) {
        int[] iArr = this.f4788g;
        int i10 = 0;
        int d8 = z.d(iArr, i8 + 1, false, false);
        int i11 = iArr[d8];
        X[] xArr = this.f4789h;
        X x8 = xArr[d8];
        int i12 = i8 - i11;
        if (i9 != 2) {
            i10 = i9;
        }
        int e8 = x8.e(i12, i10, z);
        if (e8 != -1) {
            return i11 + e8;
        }
        int q7 = q(d8, z);
        while (q7 != -1 && xArr[q7].p()) {
            q7 = q(q7, z);
        }
        if (q7 != -1) {
            return xArr[q7].a(z) + iArr[q7];
        } else if (i9 == 2) {
            return a(z);
        } else {
            return -1;
        }
    }

    public final V f(int i8, V v4, boolean z) {
        int[] iArr = this.f4787f;
        int d8 = z.d(iArr, i8 + 1, false, false);
        int i9 = this.f4788g[d8];
        this.f4789h[d8].f(i8 - iArr[d8], v4, z);
        v4.f2864c += i9;
        if (z) {
            Object obj = this.i[d8];
            Object obj2 = v4.f2863b;
            obj2.getClass();
            v4.f2863b = Pair.create(obj, obj2);
        }
        return v4;
    }

    public final V g(Object obj, V v4) {
        int i8;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f4790j.get(obj2);
        if (num == null) {
            i8 = -1;
        } else {
            i8 = num.intValue();
        }
        int i9 = this.f4788g[i8];
        this.f4789h[i8].g(obj3, v4);
        v4.f2864c += i9;
        v4.f2863b = obj;
        return v4;
    }

    public final int h() {
        return this.e;
    }

    public final int k(int i8, int i9, boolean z) {
        int[] iArr = this.f4788g;
        int i10 = 0;
        int d8 = z.d(iArr, i8 + 1, false, false);
        int i11 = iArr[d8];
        X[] xArr = this.f4789h;
        X x8 = xArr[d8];
        int i12 = i8 - i11;
        if (i9 != 2) {
            i10 = i9;
        }
        int k8 = x8.k(i12, i10, z);
        if (k8 != -1) {
            return i11 + k8;
        }
        int r8 = r(d8, z);
        while (r8 != -1 && xArr[r8].p()) {
            r8 = r(r8, z);
        }
        if (r8 != -1) {
            return xArr[r8].c(z) + iArr[r8];
        } else if (i9 == 2) {
            return c(z);
        } else {
            return -1;
        }
    }

    public final Object l(int i8) {
        int[] iArr = this.f4787f;
        int d8 = z.d(iArr, i8 + 1, false, false);
        return Pair.create(this.i[d8], this.f4789h[d8].l(i8 - iArr[d8]));
    }

    public final W m(int i8, W w2, long j7) {
        int[] iArr = this.f4788g;
        int d8 = z.d(iArr, i8 + 1, false, false);
        int i9 = iArr[d8];
        int i10 = this.f4787f[d8];
        this.f4789h[d8].m(i8 - i9, w2, j7);
        Object obj = this.i[d8];
        if (!W.f2868q.equals(w2.f2870a)) {
            obj = Pair.create(obj, w2.f2870a);
        }
        w2.f2870a = obj;
        w2.f2881n += i10;
        w2.f2882o += i10;
        return w2;
    }

    public final int o() {
        return this.f4786d;
    }

    public final int q(int i8, boolean z) {
        if (z) {
            b0 b0Var = this.f4785c;
            int i9 = b0Var.f12438c[i8] + 1;
            int[] iArr = b0Var.f12437b;
            if (i9 < iArr.length) {
                return iArr[i9];
            }
            return -1;
        } else if (i8 < this.f4784b - 1) {
            return i8 + 1;
        } else {
            return -1;
        }
    }

    public final int r(int i8, boolean z) {
        if (z) {
            b0 b0Var = this.f4785c;
            int i9 = b0Var.f12438c[i8] - 1;
            if (i9 >= 0) {
                return b0Var.f12437b[i9];
            }
            return -1;
        } else if (i8 > 0) {
            return i8 - 1;
        } else {
            return -1;
        }
    }

    public c0(X[] xArr, Object[] objArr, b0 b0Var) {
        this.f4785c = b0Var;
        this.f4784b = b0Var.f12437b.length;
        int length = xArr.length;
        this.f4789h = xArr;
        this.f4787f = new int[length];
        this.f4788g = new int[length];
        this.i = objArr;
        this.f4790j = new HashMap();
        int length2 = xArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < length2) {
            X x8 = xArr[i8];
            this.f4789h[i11] = x8;
            this.f4788g[i11] = i9;
            this.f4787f[i11] = i10;
            i9 += x8.o();
            i10 += this.f4789h[i11].h();
            this.f4790j.put(objArr[i11], Integer.valueOf(i11));
            i8++;
            i11++;
        }
        this.f4786d = i9;
        this.e = i10;
    }
}
