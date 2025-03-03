package W5;

import T5.C0274u0;

public final class b implements Runnable {
    final /* synthetic */ e this$0;
    final /* synthetic */ C0274u0 val$promise;

    public b(e eVar, C0274u0 u0Var) {
        this.this$0 = eVar;
        this.val$promise = u0Var;
    }

    public void run() {
        this.this$0.shutdownInput0(this.val$promise);
    }
}
