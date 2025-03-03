package T5;

/* renamed from: T5.q  reason: case insensitive filesystem */
public final class C0266q implements Runnable {
    final /* synthetic */ F val$next;

    public C0266q(F f8) {
        this.val$next = f8;
    }

    public void run() {
        this.val$next.invokeChannelRegistered();
    }
}
