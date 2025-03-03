package T5;

/* renamed from: T5.v  reason: case insensitive filesystem */
public final class C0275v implements Runnable {
    final /* synthetic */ Object val$event;
    final /* synthetic */ F val$next;

    public C0275v(F f8, Object obj) {
        this.val$next = f8;
        this.val$event = obj;
    }

    public void run() {
        this.val$next.invokeUserEventTriggered(this.val$event);
    }
}
