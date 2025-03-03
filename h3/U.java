package H3;

import O7.b;
import Q7.g;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

public abstract class U extends J implements Set, j$.util.Set {

    /* renamed from: W  reason: collision with root package name */
    public static final /* synthetic */ int f2032W = 0;

    /* renamed from: V  reason: collision with root package name */
    public transient O f2033V;

    public static int i(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        g.d("collection too large", z);
        return b.MAX_POW2;
    }

    public static U j(int i, Object... objArr) {
        if (i == 0) {
            return o0.f2104d0;
        }
        if (i != 1) {
            int i8 = i(i);
            Object[] objArr2 = new Object[i8];
            int i9 = i8 - 1;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < i) {
                Object obj = objArr[i10];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int u3 = C0103u.u(hashCode);
                    while (true) {
                        int i13 = u3 & i9;
                        Object obj2 = objArr2[i13];
                        if (obj2 == null) {
                            objArr[i12] = obj;
                            objArr2[i13] = obj;
                            i11 += hashCode;
                            i12++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            u3++;
                        }
                    }
                    i10++;
                } else {
                    throw new NullPointerException(Q0.g.m(i10, "at index "));
                }
            }
            Arrays.fill(objArr, i12, i, (Object) null);
            if (i12 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new v0(obj3);
            } else if (i(i12) < i8 / 2) {
                return j(i12, objArr);
            } else {
                int length = objArr.length;
                if (i12 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i12);
                }
                return new o0(i11, i9, i12, objArr, objArr2);
            }
        } else {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new v0(obj4);
        }
    }

    public static U l(Collection collection) {
        if ((collection instanceof U) && !(collection instanceof SortedSet)) {
            U u3 = (U) collection;
            if (!u3.g()) {
                return u3;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    public O b() {
        O o2 = this.f2033V;
        if (o2 != null) {
            return o2;
        }
        O m8 = m();
        this.f2033V = m8;
        return m8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof U) && (this instanceof o0)) {
            U u3 = (U) obj;
            u3.getClass();
            if ((u3 instanceof o0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return C0103u.i(this, obj);
    }

    public int hashCode() {
        return C0103u.m(this);
    }

    public O m() {
        Object[] array = toArray(J.f2017U);
        M m8 = O.f2026V;
        return O.i(array.length, array);
    }
}
