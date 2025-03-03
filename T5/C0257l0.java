package T5;

/* renamed from: T5.l0  reason: case insensitive filesystem */
public final class C0257l0 implements Runnable {
    final /* synthetic */ C0263o0 this$0;
    final /* synthetic */ boolean val$allowChannelOpen;
    final /* synthetic */ Throwable val$cause;

    public C0257l0(C0263o0 o0Var, Throwable th, boolean z) {
        this.this$0 = o0Var;
        this.val$cause = th;
        this.val$allowChannelOpen = z;
    }

    public void run() {
        this.this$0.close(this.val$cause, this.val$allowChannelOpen);
    }
}
