package a6;

import T5.C0270s0;
import T5.O0;
import T5.Y;

public final class v implements Runnable {
    final /* synthetic */ C0427A this$0;
    final /* synthetic */ Y val$context;
    final /* synthetic */ C0270s0 val$p;

    public v(C0427A a8, C0270s0 s0Var, Y y8) {
        this.this$0 = a8;
        this.val$p = s0Var;
        this.val$context = y8;
    }

    public void run() {
        ((O0) this.val$p).remove(this.val$context.handler());
    }
}
