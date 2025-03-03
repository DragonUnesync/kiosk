package T5;

/* renamed from: T5.y  reason: case insensitive filesystem */
public final class C0281y implements Runnable {
    final /* synthetic */ C this$0;

    public C0281y(C c8) {
        this.this$0 = c8;
    }

    public void run() {
        this.this$0.next.invokeChannelReadComplete();
    }
}
