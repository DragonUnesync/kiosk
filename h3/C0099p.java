package H3;

import N7.a;
import java.util.Map;

/* renamed from: H3.p  reason: case insensitive filesystem */
public abstract class C0099p implements Map.Entry {
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!a.e(getKey(), entry.getKey()) || !a.e(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i8 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i8 = value.hashCode();
        }
        return i ^ i8;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
