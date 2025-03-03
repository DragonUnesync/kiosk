package T5;

/* renamed from: T5.s  reason: case insensitive filesystem */
public final class C0269s implements Runnable {
    final /* synthetic */ F val$next;

    public C0269s(F f8) {
        this.val$next = f8;
    }

    public void run() {
        this.val$next.invokeChannelActive();
    }
}
