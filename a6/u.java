package a6;

import T5.C0270s0;
import T5.O0;
import T5.W;
import Z5.C;

public final class u implements Runnable {
    final /* synthetic */ C0427A this$0;
    final /* synthetic */ C val$codec;
    final /* synthetic */ C0270s0 val$p;

    public u(C0427A a8, C0270s0 s0Var, C c8) {
        this.this$0 = a8;
        this.val$p = s0Var;
        this.val$codec = c8;
    }

    public void run() {
        ((O0) this.val$p).remove((W) this.val$codec);
    }
}
