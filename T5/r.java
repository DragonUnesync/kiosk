package T5;

public final class r implements Runnable {
    final /* synthetic */ F val$next;

    public r(F f8) {
        this.val$next = f8;
    }

    public void run() {
        this.val$next.invokeChannelUnregistered();
    }
}
