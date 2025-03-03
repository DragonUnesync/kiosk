package T5;

/* renamed from: T5.t  reason: case insensitive filesystem */
public final class C0271t implements Runnable {
    final /* synthetic */ F val$next;

    public C0271t(F f8) {
        this.val$next = f8;
    }

    public void run() {
        this.val$next.invokeChannelInactive();
    }
}
