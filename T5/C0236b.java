package T5;

/* renamed from: T5.b  reason: case insensitive filesystem */
public final class C0236b implements Runnable {
    final /* synthetic */ C0250i this$1;

    public C0236b(C0250i iVar) {
        this.this$1 = iVar;
    }

    public void run() {
        this.this$1.this$0.pipeline.fireChannelInactive();
    }
}
