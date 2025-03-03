package Y;

import D6.h;
import E.e;
import Z.a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class f implements Collection, Set {

    /* renamed from: U  reason: collision with root package name */
    public int[] f6297U = a.f6765a;

    /* renamed from: V  reason: collision with root package name */
    public Object[] f6298V = a.f6766b;

    /* renamed from: W  reason: collision with root package name */
    public int f6299W;

    public f(int i) {
        if (i > 0) {
            h.a(this, i);
        }
    }

    public final boolean add(Object obj) {
        int i;
        int i8;
        int i9 = this.f6299W;
        if (obj == null) {
            i8 = h.b(this, (Object) null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            i8 = h.b(this, obj, hashCode);
        }
        if (i8 >= 0) {
            return false;
        }
        int i10 = ~i8;
        int[] iArr = this.f6297U;
        if (i9 >= iArr.length) {
            int i11 = 8;
            if (i9 >= 8) {
                i11 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i11 = 4;
            }
            Object[] objArr = this.f6298V;
            h.a(this, i11);
            if (i9 == this.f6299W) {
                int[] iArr2 = this.f6297U;
                if (iArr2.length != 0) {
                    h.C(0, 0, iArr, iArr2, iArr.length);
                    h.E(0, objArr.length, 6, objArr, this.f6298V);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i9) {
            int[] iArr3 = this.f6297U;
            int i12 = i10 + 1;
            h.C(i12, i10, iArr3, iArr3, i9);
            Object[] objArr2 = this.f6298V;
            h.B(i12, i10, i9, objArr2, objArr2);
        }
        int i13 = this.f6299W;
        if (i9 == i13) {
            int[] iArr4 = this.f6297U;
            if (i10 < iArr4.length) {
                iArr4[i10] = i;
                this.f6298V[i10] = obj;
                this.f6299W = i13 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean addAll(Collection collection) {
        P6.f.e(collection, "elements");
        int size = collection.size() + this.f6299W;
        int i = this.f6299W;
        int[] iArr = this.f6297U;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f6298V;
            h.a(this, size);
            int i8 = this.f6299W;
            if (i8 > 0) {
                h.C(0, 0, iArr, this.f6297U, i8);
                h.E(0, this.f6299W, 6, objArr, this.f6298V);
            }
        }
        if (this.f6299W == i) {
            for (Object add : collection) {
                z |= add(add);
            }
            return z;
        }
        throw new ConcurrentModificationException();
    }

    public final Object b(int i) {
        int i8 = this.f6299W;
        Object[] objArr = this.f6298V;
        Object obj = objArr[i];
        if (i8 <= 1) {
            clear();
        } else {
            int i9 = i8 - 1;
            int[] iArr = this.f6297U;
            int i10 = 8;
            if (iArr.length <= 8 || i8 >= iArr.length / 3) {
                if (i < i9) {
                    int i11 = i + 1;
                    h.C(i, i11, iArr, iArr, i8);
                    Object[] objArr2 = this.f6298V;
                    h.B(i, i11, i8, objArr2, objArr2);
                }
                this.f6298V[i9] = null;
            } else {
                if (i8 > 8) {
                    i10 = i8 + (i8 >> 1);
                }
                h.a(this, i10);
                if (i > 0) {
                    h.C(0, 0, iArr, this.f6297U, i);
                    h.E(0, i, 6, objArr, this.f6298V);
                }
                if (i < i9) {
                    int i12 = i + 1;
                    h.C(i, i12, iArr, this.f6297U, i8);
                    h.B(i, i12, i8, objArr, this.f6298V);
                }
            }
            if (i8 == this.f6299W) {
                this.f6299W = i9;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public final void clear() {
        if (this.f6299W != 0) {
            this.f6297U = a.f6765a;
            this.f6298V = a.f6766b;
            this.f6299W = 0;
        }
        if (this.f6299W != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean contains(Object obj) {
        int i;
        if (obj == null) {
            i = h.b(this, (Object) null, 0);
        } else {
            i = h.b(this, obj, obj.hashCode());
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        P6.f.e(collection, "elements");
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f6299W == ((Set) obj).size()) {
            try {
                int i = this.f6299W;
                int i8 = 0;
                while (i8 < i) {
                    if (((Set) obj).contains(this.f6298V[i8])) {
                        i8++;
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f6297U;
        int i = this.f6299W;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    public final boolean isEmpty() {
        if (this.f6299W <= 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new a(this);
    }

    public final boolean remove(Object obj) {
        int i;
        if (obj == null) {
            i = h.b(this, (Object) null, 0);
        } else {
            i = h.b(this, obj, obj.hashCode());
        }
        if (i < 0) {
            return false;
        }
        b(i);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        P6.f.e(collection, "elements");
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        P6.f.e(collection, "elements");
        boolean z = false;
        for (int i = this.f6299W - 1; -1 < i; i--) {
            if (!collection.contains(this.f6298V[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f6299W;
    }

    public final Object[] toArray() {
        Object[] objArr = this.f6298V;
        int i = this.f6299W;
        P6.f.e(objArr, "<this>");
        e.g(i, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i);
        P6.f.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6299W * 14);
        sb.append('{');
        int i = this.f6299W;
        for (int i8 = 0; i8 < i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = this.f6298V[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        P6.f.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final Object[] toArray(Object[] objArr) {
        P6.f.e(objArr, "array");
        int i = this.f6299W;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        h.B(0, 0, this.f6299W, this.f6298V, objArr);
        return objArr;
    }
}
