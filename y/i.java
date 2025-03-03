package Y;

import D6.h;
import P6.f;
import Q0.g;
import Z.a;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class i {

    /* renamed from: U  reason: collision with root package name */
    public int[] f6306U = a.f6765a;

    /* renamed from: V  reason: collision with root package name */
    public Object[] f6307V = a.f6766b;

    /* renamed from: W  reason: collision with root package name */
    public int f6308W;

    public i(Object obj) {
    }

    public final int a(Object obj) {
        int i = this.f6308W * 2;
        Object[] objArr = this.f6307V;
        if (obj == null) {
            for (int i8 = 1; i8 < i; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i8 = this.f6308W;
        int[] iArr = this.f6306U;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            f.d(copyOf, "copyOf(this, newSize)");
            this.f6306U = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6307V, i * 2);
            f.d(copyOf2, "copyOf(this, newSize)");
            this.f6307V = copyOf2;
        }
        if (this.f6308W != i8) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i8 = this.f6308W;
        if (i8 == 0) {
            return -1;
        }
        int a8 = a.a(i8, i, this.f6306U);
        if (a8 < 0 || f.a(obj, this.f6307V[a8 << 1])) {
            return a8;
        }
        int i9 = a8 + 1;
        while (i9 < i8 && this.f6306U[i9] == i) {
            if (f.a(obj, this.f6307V[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        int i10 = a8 - 1;
        while (i10 >= 0 && this.f6306U[i10] == i) {
            if (f.a(obj, this.f6307V[i10 << 1])) {
                return i10;
            }
            i10--;
        }
        return ~i9;
    }

    public void clear() {
        if (this.f6308W > 0) {
            this.f6306U = a.f6765a;
            this.f6307V = a.f6766b;
            this.f6308W = 0;
        }
        if (this.f6308W > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.f6308W;
        if (i == 0) {
            return -1;
        }
        int a8 = a.a(i, 0, this.f6306U);
        if (a8 < 0 || this.f6307V[a8 << 1] == null) {
            return a8;
        }
        int i8 = a8 + 1;
        while (i8 < i && this.f6306U[i8] == 0) {
            if (this.f6307V[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        int i9 = a8 - 1;
        while (i9 >= 0 && this.f6306U[i9] == 0) {
            if (this.f6307V[i9 << 1] == null) {
                return i9;
            }
            i9--;
        }
        return ~i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof i) {
                int i = this.f6308W;
                if (i != ((i) obj).f6308W) {
                    return false;
                }
                i iVar = (i) obj;
                for (int i8 = 0; i8 < i; i8++) {
                    Object f8 = f(i8);
                    Object j7 = j(i8);
                    Object obj2 = iVar.get(f8);
                    if (j7 == null) {
                        if (obj2 != null || !iVar.containsKey(f8)) {
                            return false;
                        }
                    } else if (!j7.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f6308W != ((Map) obj).size()) {
                return false;
            } else {
                int i9 = this.f6308W;
                for (int i10 = 0; i10 < i9; i10++) {
                    Object f9 = f(i10);
                    Object j8 = j(i10);
                    Object obj3 = ((Map) obj).get(f9);
                    if (j8 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(f9)) {
                            return false;
                        }
                    } else if (!j8.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.f6308W) {
            return this.f6307V[i << 1];
        }
        throw new IllegalArgumentException(g.m(i, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public void g(e eVar) {
        int i = eVar.f6308W;
        b(this.f6308W + i);
        if (this.f6308W != 0) {
            for (int i8 = 0; i8 < i; i8++) {
                put(eVar.f(i8), eVar.j(i8));
            }
        } else if (i > 0) {
            h.C(0, 0, eVar.f6306U, this.f6306U, i);
            h.B(0, 0, i << 1, eVar.f6307V, this.f6307V);
            this.f6308W = i;
        }
    }

    public Object get(Object obj) {
        int d8 = d(obj);
        if (d8 >= 0) {
            return this.f6307V[(d8 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d8 = d(obj);
        if (d8 >= 0) {
            return this.f6307V[(d8 << 1) + 1];
        }
        return obj2;
    }

    public Object h(int i) {
        int i8;
        if (i < 0 || i >= (i8 = this.f6308W)) {
            throw new IllegalArgumentException(g.m(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f6307V;
        int i9 = i << 1;
        Object obj = objArr[i9 + 1];
        if (i8 <= 1) {
            clear();
        } else {
            int i10 = i8 - 1;
            int[] iArr = this.f6306U;
            int i11 = 8;
            if (iArr.length <= 8 || i8 >= iArr.length / 3) {
                if (i < i10) {
                    int i12 = i + 1;
                    h.C(i, i12, iArr, iArr, i8);
                    Object[] objArr2 = this.f6307V;
                    h.B(i9, i12 << 1, i8 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f6307V;
                int i13 = i10 << 1;
                objArr3[i13] = null;
                objArr3[i13 + 1] = null;
            } else {
                if (i8 > 8) {
                    i11 = i8 + (i8 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i11);
                f.d(copyOf, "copyOf(this, newSize)");
                this.f6306U = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f6307V, i11 << 1);
                f.d(copyOf2, "copyOf(this, newSize)");
                this.f6307V = copyOf2;
                if (i8 == this.f6308W) {
                    if (i > 0) {
                        h.C(0, 0, iArr, this.f6306U, i);
                        h.B(0, 0, i9, objArr, this.f6307V);
                    }
                    if (i < i10) {
                        int i14 = i + 1;
                        h.C(i, i14, iArr, this.f6306U, i8);
                        h.B(i9, i14 << 1, i8 << 1, objArr, this.f6307V);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i8 == this.f6308W) {
                this.f6308W = i10;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public int hashCode() {
        int i;
        int[] iArr = this.f6306U;
        Object[] objArr = this.f6307V;
        int i8 = this.f6308W;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            Object obj = objArr[i9];
            int i12 = iArr[i10];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i11 += i ^ i12;
            i10++;
            i9 += 2;
        }
        return i11;
    }

    public Object i(int i, Object obj) {
        if (i < 0 || i >= this.f6308W) {
            throw new IllegalArgumentException(g.m(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i8 = (i << 1) + 1;
        Object[] objArr = this.f6307V;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        if (this.f6308W <= 0) {
            return true;
        }
        return false;
    }

    public final Object j(int i) {
        if (i >= 0 && i < this.f6308W) {
            return this.f6307V[(i << 1) + 1];
        }
        throw new IllegalArgumentException(g.m(i, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int i8;
        int i9 = this.f6308W;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj != null) {
            i8 = c(i, obj);
        } else {
            i8 = e();
        }
        if (i8 >= 0) {
            int i10 = (i8 << 1) + 1;
            Object[] objArr = this.f6307V;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~i8;
        int[] iArr = this.f6306U;
        if (i9 >= iArr.length) {
            int i12 = 8;
            if (i9 >= 8) {
                i12 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i12 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i12);
            f.d(copyOf, "copyOf(this, newSize)");
            this.f6306U = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6307V, i12 << 1);
            f.d(copyOf2, "copyOf(this, newSize)");
            this.f6307V = copyOf2;
            if (i9 != this.f6308W) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i9) {
            int[] iArr2 = this.f6306U;
            int i13 = i11 + 1;
            h.C(i13, i11, iArr2, iArr2, i9);
            Object[] objArr2 = this.f6307V;
            h.B(i13 << 1, i11 << 1, this.f6308W << 1, objArr2, objArr2);
        }
        int i14 = this.f6308W;
        if (i9 == i14) {
            int[] iArr3 = this.f6306U;
            if (i11 < iArr3.length) {
                iArr3[i11] = i;
                Object[] objArr3 = this.f6307V;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f6308W = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int d8 = d(obj);
        if (d8 >= 0) {
            return h(d8);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d8 = d(obj);
        if (d8 >= 0) {
            return i(d8, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f6308W;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6308W * 28);
        sb.append('{');
        int i = this.f6308W;
        for (int i8 = 0; i8 < i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object f8 = f(i8);
            if (f8 != sb) {
                sb.append(f8);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j7 = j(i8);
            if (j7 != sb) {
                sb.append(j7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        f.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d8 = d(obj);
        if (d8 < 0 || !f.a(obj2, j(d8))) {
            return false;
        }
        h(d8);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d8 = d(obj);
        if (d8 < 0 || !f.a(obj2, j(d8))) {
            return false;
        }
        i(d8, obj3);
        return true;
    }
}
