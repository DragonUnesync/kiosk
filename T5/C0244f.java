package T5;

/* renamed from: T5.f  reason: case insensitive filesystem */
public final class C0244f implements Runnable {
    final /* synthetic */ C0250i this$1;
    final /* synthetic */ boolean val$wasActive;

    public C0244f(C0250i iVar, boolean z) {
        this.this$1 = iVar;
        this.val$wasActive = z;
    }

    public void run() {
        this.this$1.fireChannelInactiveAndDeregister(this.val$wasActive);
    }
}
