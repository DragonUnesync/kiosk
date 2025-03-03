package T5;

/* renamed from: T5.h  reason: case insensitive filesystem */
public final class C0248h implements Runnable {
    final /* synthetic */ C0250i this$1;
    final /* synthetic */ Exception val$e;

    public C0248h(C0250i iVar, Exception exc) {
        this.this$1 = iVar;
        this.val$e = exc;
    }

    public void run() {
        this.this$1.this$0.pipeline.fireExceptionCaught(this.val$e);
    }
}
