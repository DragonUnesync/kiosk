package H2;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class k implements h {

    /* renamed from: b  reason: collision with root package name */
    public final Map f1964b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map f1965c;

    public k(Map map) {
        this.f1964b = DesugarCollections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f1964b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((j) list.get(i)).f1963a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final Map b() {
        if (this.f1965c == null) {
            synchronized (this) {
                try {
                    if (this.f1965c == null) {
                        this.f1965c = DesugarCollections.unmodifiableMap(a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f1965c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f1964b.equals(((k) obj).f1964b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1964b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f1964b + '}';
    }
}
