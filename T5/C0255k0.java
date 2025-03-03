package T5;

/* renamed from: T5.k0  reason: case insensitive filesystem */
public final class C0255k0 implements Runnable {
    final /* synthetic */ C0263o0 this$0;
    final /* synthetic */ C0270s0 val$pipeline;

    public C0255k0(C0263o0 o0Var, C0270s0 s0Var) {
        this.this$0 = o0Var;
        this.val$pipeline = s0Var;
    }

    public void run() {
        ((O0) this.val$pipeline).fireChannelWritabilityChanged();
    }
}
