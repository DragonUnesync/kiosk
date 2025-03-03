package T5;

/* renamed from: T5.w  reason: case insensitive filesystem */
public final class C0277w implements Runnable {
    final /* synthetic */ Object val$m;
    final /* synthetic */ F val$next;

    public C0277w(F f8, Object obj) {
        this.val$next = f8;
        this.val$m = obj;
    }

    public void run() {
        this.val$next.invokeChannelRead(this.val$m);
    }
}
