package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class M {
    private final Map<String, Object> mBagOfTags = new HashMap();
    private volatile boolean mCleared = false;
    private final Set<Closeable> mCloseables = new LinkedHashSet();

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void addCloseable(Closeable closeable) {
        Set<Closeable> set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                this.mCloseables.add(closeable);
            }
        }
    }

    public final void clear() {
        this.mCleared = true;
        Map<String, Object> map = this.mBagOfTags;
        if (map != null) {
            synchronized (map) {
                try {
                    for (Object a8 : this.mBagOfTags.values()) {
                        a(a8);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Set<Closeable> set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                try {
                    for (Closeable a9 : this.mCloseables) {
                        a(a9);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        onCleared();
    }

    public <T> T getTag(String str) {
        T t8;
        Map<String, Object> map = this.mBagOfTags;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t8 = this.mBagOfTags.get(str);
        }
        return t8;
    }

    public void onCleared() {
    }

    public <T> T setTagIfAbsent(String str, T t8) {
        T t9;
        synchronized (this.mBagOfTags) {
            try {
                t9 = this.mBagOfTags.get(str);
                if (t9 == null) {
                    this.mBagOfTags.put(str, t8);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (t9 != null) {
            t8 = t9;
        }
        if (this.mCleared) {
            a(t8);
        }
        return t8;
    }
}
