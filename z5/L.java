package Z5;

import X5.G;
import g6.B;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class L implements Iterable {
    @Deprecated
    public static final L EMPTY_HEADERS = C0403v.instance();

    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean containsCommaSeparatedTrimmed(java.lang.CharSequence r5, java.lang.CharSequence r6, boolean r7) {
        /*
            r0 = -1
            r1 = 44
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L_0x0049
            int r7 = e6.C0847f.indexOf(r5, r1, r3)
            if (r7 != r0) goto L_0x0018
            java.lang.CharSequence r5 = e6.C0847f.trim(r5)
            boolean r5 = e6.C0847f.contentEqualsIgnoreCase(r5, r6)
            if (r5 == 0) goto L_0x008b
            return r2
        L_0x0018:
            r4 = 0
        L_0x0019:
            java.lang.CharSequence r4 = r5.subSequence(r4, r7)
            java.lang.CharSequence r4 = e6.C0847f.trim(r4)
            boolean r4 = e6.C0847f.contentEqualsIgnoreCase(r4, r6)
            if (r4 == 0) goto L_0x0028
            return r2
        L_0x0028:
            int r4 = r7 + 1
            int r7 = e6.C0847f.indexOf(r5, r1, r4)
            if (r7 != r0) goto L_0x0019
            int r7 = r5.length()
            if (r4 >= r7) goto L_0x008b
            int r7 = r5.length()
            java.lang.CharSequence r5 = r5.subSequence(r4, r7)
            java.lang.CharSequence r5 = e6.C0847f.trim(r5)
            boolean r5 = e6.C0847f.contentEqualsIgnoreCase(r5, r6)
            if (r5 == 0) goto L_0x008b
            return r2
        L_0x0049:
            int r7 = e6.C0847f.indexOf(r5, r1, r3)
            if (r7 != r0) goto L_0x005a
            java.lang.CharSequence r5 = e6.C0847f.trim(r5)
            boolean r5 = e6.C0847f.contentEquals(r5, r6)
            if (r5 == 0) goto L_0x008b
            return r2
        L_0x005a:
            r4 = 0
        L_0x005b:
            java.lang.CharSequence r4 = r5.subSequence(r4, r7)
            java.lang.CharSequence r4 = e6.C0847f.trim(r4)
            boolean r4 = e6.C0847f.contentEquals(r4, r6)
            if (r4 == 0) goto L_0x006a
            return r2
        L_0x006a:
            int r4 = r7 + 1
            int r7 = e6.C0847f.indexOf(r5, r1, r4)
            if (r7 != r0) goto L_0x005b
            int r7 = r5.length()
            if (r4 >= r7) goto L_0x008b
            int r7 = r5.length()
            java.lang.CharSequence r5 = r5.subSequence(r4, r7)
            java.lang.CharSequence r5 = e6.C0847f.trim(r5)
            boolean r5 = e6.C0847f.contentEquals(r5, r6)
            if (r5 == 0) goto L_0x008b
            return r2
        L_0x008b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.L.containsCommaSeparatedTrimmed(java.lang.CharSequence, java.lang.CharSequence, boolean):boolean");
    }

    public L add(CharSequence charSequence, Object obj) {
        return add(charSequence.toString(), obj);
    }

    public abstract L add(String str, Object obj);

    public abstract L clear();

    public boolean contains(CharSequence charSequence) {
        return contains(charSequence.toString());
    }

    public abstract boolean contains(String str);

    public boolean containsValue(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        Iterator<? extends CharSequence> valueCharSequenceIterator = valueCharSequenceIterator(charSequence);
        while (valueCharSequenceIterator.hasNext()) {
            if (containsCommaSeparatedTrimmed((CharSequence) valueCharSequenceIterator.next(), charSequence2, z)) {
                return true;
            }
        }
        return false;
    }

    public L copy() {
        return new C0395m().set(this);
    }

    public String get(CharSequence charSequence) {
        return get(charSequence.toString());
    }

    public abstract String get(String str);

    public List<String> getAll(CharSequence charSequence) {
        return getAll(charSequence.toString());
    }

    public abstract List<String> getAll(String str);

    public abstract boolean isEmpty();

    @Deprecated
    public abstract Iterator<Map.Entry<String, String>> iterator();

    public abstract Iterator<Map.Entry<CharSequence, CharSequence>> iteratorCharSequence();

    public L remove(CharSequence charSequence) {
        return remove(charSequence.toString());
    }

    public abstract L remove(String str);

    public L set(CharSequence charSequence, Object obj) {
        return set(charSequence.toString(), obj);
    }

    public abstract L set(String str, Iterable<?> iterable);

    public abstract L set(String str, Object obj);

    public abstract int size();

    public String toString() {
        return G.toString(getClass(), iteratorCharSequence(), size());
    }

    public Iterator<? extends CharSequence> valueCharSequenceIterator(CharSequence charSequence) {
        return valueStringIterator(charSequence);
    }

    public Iterator<String> valueStringIterator(CharSequence charSequence) {
        return getAll(charSequence).iterator();
    }

    public L add(L l8) {
        B.checkNotNull(l8, "headers");
        Iterator<Map.Entry<String, String>> it = l8.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            add((String) next.getKey(), next.getValue());
        }
        return this;
    }

    public boolean contains(String str, String str2, boolean z) {
        Iterator<String> valueStringIterator = valueStringIterator(str);
        if (z) {
            while (valueStringIterator.hasNext()) {
                if (valueStringIterator.next().equalsIgnoreCase(str2)) {
                    return true;
                }
            }
            return false;
        }
        while (valueStringIterator.hasNext()) {
            if (valueStringIterator.next().equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public L set(CharSequence charSequence, Iterable<?> iterable) {
        return set(charSequence.toString(), iterable);
    }

    public L set(L l8) {
        B.checkNotNull(l8, "headers");
        clear();
        if (l8.isEmpty()) {
            return this;
        }
        Iterator<Map.Entry<String, String>> it = l8.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            add((String) next.getKey(), next.getValue());
        }
        return this;
    }

    public boolean contains(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return contains(charSequence.toString(), charSequence2.toString(), z);
    }
}
