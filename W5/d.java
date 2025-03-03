package W5;

import U5.b;
import V5.e;
import f6.G;
import java.util.concurrent.Executor;

public final class d extends b {
    final /* synthetic */ e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(e eVar) {
        super(eVar);
        this.this$0 = eVar;
    }

    public Executor prepareToClose() {
        try {
            if (!this.this$0.javaChannel().isOpen() || ((e) this.this$0.config()).getSoLinger() <= 0) {
                return null;
            }
            this.this$0.doDeregister();
            return G.INSTANCE;
        } catch (Throwable unused) {
            return null;
        }
    }

    public /* synthetic */ d(e eVar, a aVar) {
        this(eVar);
    }
}
