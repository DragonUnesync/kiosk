package X5;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class G {
    public static <K, V> List<String> getAllAsString(C c8, K k8) {
        return new D(c8.getAll(k8));
    }

    public static <K, V> String getAsString(C c8, K k8) {
        Object obj = ((z) c8).get(k8);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static Iterator<Map.Entry<String, String>> iteratorAsString(Iterable<Map.Entry<CharSequence, CharSequence>> iterable) {
        return new F(iterable.iterator());
    }

    public static <K, V> String toString(Class<?> cls, Iterator<Map.Entry<K, V>> it, int i) {
        String simpleName = cls.getSimpleName();
        if (i == 0) {
            return simpleName.concat("[]");
        }
        StringBuilder sb = new StringBuilder((i * 20) + simpleName.length() + 2);
        sb.append(simpleName);
        sb.append('[');
        while (it.hasNext()) {
            Map.Entry next = it.next();
            sb.append(next.getKey());
            sb.append(": ");
            sb.append(next.getValue());
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(']');
        return sb.toString();
    }
}
