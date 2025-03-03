package Z5;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Z5.v  reason: case insensitive filesystem */
public final class C0403v extends L {
    static final Iterator<Map.Entry<CharSequence, CharSequence>> EMPTY_CHARS_ITERATOR = Collections.emptyList().iterator();
    public static final C0403v INSTANCE = instance();

    @Deprecated
    public static C0403v instance() {
        return C0402u.EMPTY_HEADERS;
    }

    public L add(String str, Object obj) {
        throw new UnsupportedOperationException("read only");
    }

    public L clear() {
        throw new UnsupportedOperationException("read only");
    }

    public boolean contains(String str) {
        return false;
    }

    public List<Map.Entry<String, String>> entries() {
        return Collections.emptyList();
    }

    public String get(String str) {
        return null;
    }

    public List<String> getAll(String str) {
        return Collections.emptyList();
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator<Map.Entry<String, String>> iterator() {
        return entries().iterator();
    }

    public Iterator<Map.Entry<CharSequence, CharSequence>> iteratorCharSequence() {
        return EMPTY_CHARS_ITERATOR;
    }

    public L remove(String str) {
        throw new UnsupportedOperationException("read only");
    }

    public L set(String str, Object obj) {
        throw new UnsupportedOperationException("read only");
    }

    public int size() {
        return 0;
    }

    public L set(String str, Iterable<?> iterable) {
        throw new UnsupportedOperationException("read only");
    }
}
