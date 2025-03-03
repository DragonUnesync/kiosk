package H3;

import E.e;
import G3.d;
import G3.f;
import N7.a;
import O7.b;
import Q0.g;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import org.altbeacon.bluetooth.Pdu;

/* renamed from: H3.u  reason: case insensitive filesystem */
public abstract class C0103u {
    public static int b(int i) {
        if (i < 3) {
            e(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static void c(int i, Object[] objArr) {
        int i8 = 0;
        while (i8 < i) {
            if (objArr[i8] != null) {
                i8++;
            } else {
                throw new NullPointerException(g.m(i8, "at index "));
            }
        }
    }

    public static void d(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    public static void e(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
        }
    }

    public static Object g(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(g.m(i, "must be power of 2 between 2^1 and 2^30: "));
        } else if (i <= 256) {
            return new byte[i];
        } else {
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
    }

    public static boolean h(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean i(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static s0 j(Set set, f fVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof s0) {
                s0 s0Var = (s0) sortedSet;
                f fVar2 = s0Var.f2120V;
                fVar2.getClass();
                return new s0((SortedSet) s0Var.f2119U, new G3.g(Arrays.asList(new f[]{fVar2, fVar})));
            }
            sortedSet.getClass();
            return new s0(sortedSet, fVar);
        } else if (set instanceof s0) {
            s0 s0Var2 = (s0) set;
            f fVar3 = s0Var2.f2120V;
            fVar3.getClass();
            return new s0(s0Var2.f2119U, new G3.g(Arrays.asList(new f[]{fVar3, fVar})));
        } else {
            set.getClass();
            return new s0(set, fVar);
        }
    }

    public static Object k(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static Object l(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int m(Set set) {
        int i;
        int i8 = 0;
        for (Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i8 = ~(~(i8 + i));
        }
        return i8;
    }

    public static r0 n(U u3, U u8) {
        if (u3 == null) {
            throw new NullPointerException("set1");
        } else if (u8 != null) {
            return new r0(u3, u8);
        } else {
            throw new NullPointerException("set2");
        }
    }

    public static int o(int i, int i8, int i9) {
        return (i & (~i9)) | (i8 & i9);
    }

    public static ArrayList p(Object... objArr) {
        int length = objArr.length;
        e(length, "arraySize");
        ArrayList arrayList = new ArrayList(e.u(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int q(int i) {
        int i8;
        if (i < 32) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        return (i + 1) * i8;
    }

    public static int r(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i8;
        int i9;
        int v4 = v(obj);
        int i10 = v4 & i;
        int w2 = w(i10, obj3);
        if (w2 == 0) {
            return -1;
        }
        int i11 = ~i;
        int i12 = v4 & i11;
        int i13 = -1;
        while (true) {
            i8 = w2 - 1;
            i9 = iArr[i8];
            if ((i9 & i11) != i12 || !a.e(obj, objArr[i8]) || (objArr2 != null && !a.e(obj2, objArr2[i8]))) {
                int i14 = i9 & i;
                if (i14 == 0) {
                    return -1;
                }
                int i15 = i14;
                i13 = i8;
                w2 = i15;
            }
        }
        int i16 = i9 & i;
        if (i13 == -1) {
            x(i10, i16, obj3);
        } else {
            iArr[i13] = o(iArr[i13], i16, i);
        }
        return i8;
    }

    public static boolean s(Set set, Collection collection) {
        collection.getClass();
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            for (Object remove : collection) {
                z |= set.remove(remove);
            }
            return z;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static void t(List list, f fVar, int i, int i8) {
        for (int size = list.size() - 1; size > i8; size--) {
            if (fVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i9 = i8 - 1; i9 >= i; i9--) {
            list.remove(i9);
        }
    }

    public static int u(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    public static int v(Object obj) {
        int i;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return u(i);
    }

    public static int w(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    public static void x(int i, int i8, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i8;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i8;
        } else {
            ((int[]) obj)[i] = i8;
        }
    }

    public static int y(int i) {
        int max = Math.max(i + 1, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0d * ((double) highestOneBit)))) {
            int i8 = highestOneBit << 1;
            if (i8 > 0) {
                highestOneBit = i8;
            } else {
                highestOneBit = b.MAX_POW2;
            }
        }
        return Math.max(4, highestOneBit);
    }

    public static AbstractList z(List list, d dVar) {
        if (list instanceof RandomAccess) {
            return new Z(list, dVar);
        }
        return new a0(list, dVar);
    }

    public P a() {
        e(2, "expectedValuesPerKey");
        return new P((Object) this);
    }

    public abstract Map f();
}
