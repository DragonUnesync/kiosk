package d6;

import f6.C0909B;
import f6.C0910C;
import f6.C0929t;

/* renamed from: d6.c  reason: case insensitive filesystem */
public final class C0647c implements C0910C {
    final /* synthetic */ C0648d this$0;
    final /* synthetic */ C0929t val$executor;
    final /* synthetic */ C0646b val$newResolver;

    public C0647c(C0648d dVar, C0929t tVar, C0646b bVar) {
        this.this$0 = dVar;
        this.val$executor = tVar;
        this.val$newResolver = bVar;
    }

    public void operationComplete(C0909B b8) {
        synchronized (this.this$0.resolvers) {
            this.this$0.resolvers.remove(this.val$executor);
            this.this$0.executorTerminationListeners.remove(this.val$executor);
        }
        ((C0653i) this.val$newResolver).close();
    }
}
