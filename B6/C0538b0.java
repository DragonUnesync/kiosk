package b6;

import g6.p0;
import io.netty.internal.tcnative.SSLSessionCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b6.b0  reason: case insensitive filesystem */
public class C0538b0 implements SSLSessionCache {
    private static final int DEFAULT_CACHE_SIZE;
    private static final Y[] EMPTY_SESSIONS = new Y[0];
    private final S engineMap;
    /* access modifiers changed from: private */
    public final AtomicInteger maximumCacheSize = new AtomicInteger(DEFAULT_CACHE_SIZE);
    private final AtomicInteger sessionTimeout = new AtomicInteger(300);
    private final Map<C0547e0, C0535a0> sessions = new Z(this);

    static {
        int i = p0.getInt("javax.net.ssl.sessionCacheSize", 20480);
        if (i >= 0) {
            DEFAULT_CACHE_SIZE = i;
        } else {
            DEFAULT_CACHE_SIZE = 20480;
        }
    }

    public C0538b0(S s8) {
        this.engineMap = s8;
    }

    private void notifyRemovalAndFree(C0535a0 a0Var) {
        sessionRemoved(a0Var);
        throw null;
    }

    public synchronized void clear() {
        try {
            Iterator<Map.Entry<C0547e0, C0535a0>> it = this.sessions.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                    notifyRemovalAndFree((C0535a0) null);
                } else {
                    throw new ClassCastException();
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized boolean containsSessionWithId(C0547e0 e0Var) {
        return this.sessions.containsKey(e0Var);
    }

    public final List<C0547e0> getIds() {
        Y[] yArr;
        synchronized (this) {
            yArr = (Y[]) this.sessions.values().toArray(EMPTY_SESSIONS);
        }
        ArrayList arrayList = new ArrayList(yArr.length);
        for (Y y8 : yArr) {
            if (y8.isValid()) {
                arrayList.add(y8.sessionId());
            }
        }
        return arrayList;
    }

    public final synchronized Y getSession(C0547e0 e0Var) {
        if (this.sessions.get(e0Var) != null) {
            throw new ClassCastException();
        }
        return null;
    }

    public final int getSessionCacheSize() {
        return this.maximumCacheSize.get();
    }

    public final int getSessionTimeout() {
        return this.sessionTimeout.get();
    }

    public final synchronized void removeSessionWithId(C0547e0 e0Var) {
        if (this.sessions.remove(e0Var) != null) {
            throw new ClassCastException();
        }
    }

    public void sessionRemoved(C0535a0 a0Var) {
    }

    public void setSession(long j7, String str, int i) {
    }

    public final void setSessionCacheSize(int i) {
        if (((long) this.maximumCacheSize.getAndSet(i)) > ((long) i) || i == 0) {
            clear();
        }
    }

    public final void setSessionTimeout(int i) {
        if (this.sessionTimeout.getAndSet(i) > i) {
            clear();
        }
    }
}
