package b6;

import f6.C0929t;
import f6.r;

public final class s1 extends r {
    final /* synthetic */ C1 this$0;

    private s1(C1 c12) {
        this.this$0 = c12;
    }

    public void checkDeadLock() {
        if (this.this$0.ctx != null) {
            super.checkDeadLock();
        }
    }

    public C0929t executor() {
        if (this.this$0.ctx != null) {
            return this.this$0.ctx.executor();
        }
        throw new IllegalStateException();
    }

    public /* synthetic */ s1(C1 c12, C0563j1 j1Var) {
        this(c12);
    }
}
