package b6;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import javax.net.ssl.X509KeyManager;

public final class H extends V {
    private final ConcurrentMap<String, T> cache = new ConcurrentHashMap();
    private final int maxCachedEntries;

    public H(X509KeyManager x509KeyManager, String str, int i) {
        super(x509KeyManager, str);
        this.maxCachedEntries = i;
    }

    public void destroy() {
        do {
            Iterator<T> it = this.cache.values().iterator();
            while (it.hasNext()) {
                ((C0566l) it.next()).release();
                it.remove();
            }
        } while (!this.cache.isEmpty());
    }
}
