package D6;

import F.h;
import O6.l;
import P6.f;
import android.support.v4.media.session.b;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import u.C1477r;

public abstract class i extends o {
    public static final void O(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, l lVar) {
        f.e(charSequence, "separator");
        f.e(charSequence2, "prefix");
        f.e(charSequence3, "postfix");
        f.e(charSequence4, "truncated");
        sb.append(charSequence2);
        int i8 = 0;
        for (Object next : collection) {
            i8++;
            if (i8 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i8 > i) {
                break;
            }
            b.a(sb, next, lVar);
        }
        if (i >= 0 && i8 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String P(Collection collection, String str, String str2, String str3, l lVar, int i) {
        String str4;
        String str5;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 32) != 0) {
            lVar = null;
        }
        f.e(str6, "separator");
        f.e(str4, "prefix");
        f.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        O(collection, sb, str6, str4, str5, -1, "...", lVar);
        String sb2 = sb.toString();
        f.d(sb2, "toString(...)");
        return sb2;
    }

    public static Object Q(List list) {
        f.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(j.K(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static ArrayList R(Collection collection, Iterable iterable) {
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(collection2);
        return arrayList;
    }

    public static List S(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(C1477r.c(i, "Requested element count ", " is less than zero.").toString());
        } else if (i == 0) {
            return r.f1269U;
        } else {
            int size = list.size();
            if (i >= size) {
                return U(list);
            }
            if (i == 1) {
                return h.w(Q(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i8 = size - i; i8 < size; i8++) {
                    arrayList.add(list.get(i8));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    public static final void T(Iterable iterable, AbstractCollection abstractCollection) {
        f.e(iterable, "<this>");
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static List U(Iterable iterable) {
        ArrayList arrayList;
        Object obj;
        f.e(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        r rVar = r.f1269U;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return rVar;
            }
            if (size != 1) {
                return V(collection);
            }
            if (iterable instanceof List) {
                obj = ((List) iterable).get(0);
            } else {
                obj = iterable.iterator().next();
            }
            return h.w(obj);
        }
        if (z) {
            arrayList = V((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            T(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        if (size2 == 0) {
            return rVar;
        }
        if (size2 != 1) {
            return arrayList;
        }
        return h.w(arrayList.get(0));
    }

    public static ArrayList V(Collection collection) {
        f.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set W(ArrayList arrayList) {
        t tVar = t.f1271U;
        int size = arrayList.size();
        if (size == 0) {
            return tVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(u.D(arrayList.size()));
            T(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(arrayList.get(0));
        f.d(singleton, "singleton(...)");
        return singleton;
    }
}
