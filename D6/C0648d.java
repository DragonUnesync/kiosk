package d6;

import f6.C0910C;
import f6.C0929t;
import g6.B;
import h6.C1082c;
import h6.d;
import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: d6.d  reason: case insensitive filesystem */
public abstract class C0648d implements Closeable {
    private static final C1082c logger = d.getInstance((Class<?>) C0648d.class);
    /* access modifiers changed from: private */
    public final Map<C0929t, C0910C> executorTerminationListeners = new IdentityHashMap();
    /* access modifiers changed from: private */
    public final Map<C0929t, C0646b> resolvers = new IdentityHashMap();

    public void close() {
        int i;
        C0646b[] bVarArr;
        Map.Entry[] entryArr;
        synchronized (this.resolvers) {
            bVarArr = (C0646b[]) this.resolvers.values().toArray(new C0646b[0]);
            this.resolvers.clear();
            entryArr = (Map.Entry[]) this.executorTerminationListeners.entrySet().toArray(new Map.Entry[0]);
            this.executorTerminationListeners.clear();
        }
        for (Map.Entry entry : entryArr) {
            ((C0929t) entry.getKey()).terminationFuture().removeListener((C0910C) entry.getValue());
        }
        for (C0646b bVar : bVarArr) {
            try {
                ((C0653i) bVar).close();
            } catch (Throwable th) {
                logger.warn("Failed to close a resolver:", th);
            }
        }
    }

    public C0646b getResolver(C0929t tVar) {
        C0646b bVar;
        B.checkNotNull(tVar, "executor");
        if (!tVar.isShuttingDown()) {
            synchronized (this.resolvers) {
                try {
                    bVar = this.resolvers.get(tVar);
                    if (bVar == null) {
                        bVar = newResolver(tVar);
                        this.resolvers.put(tVar, bVar);
                        C0647c cVar = new C0647c(this, tVar, bVar);
                        this.executorTerminationListeners.put(tVar, cVar);
                        tVar.terminationFuture().addListener(cVar);
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("failed to create a new resolver", e);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bVar;
        }
        throw new IllegalStateException("executor not accepting a task");
    }

    public abstract C0646b newResolver(C0929t tVar);
}
