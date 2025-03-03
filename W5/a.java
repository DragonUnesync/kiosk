package W5;

import T5.C0250i;
import T5.C0274u0;

public final class a implements Runnable {
    final /* synthetic */ e this$0;
    final /* synthetic */ C0274u0 val$promise;

    public a(e eVar, C0274u0 u0Var) {
        this.this$0 = eVar;
        this.val$promise = u0Var;
    }

    public void run() {
        ((C0250i) this.this$0.unsafe()).shutdownOutput(this.val$promise);
    }
}
