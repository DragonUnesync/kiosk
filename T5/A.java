package T5;

public final class A implements Runnable {
    final /* synthetic */ C this$0;

    public A(C c8) {
        this.this$0 = c8;
    }

    public void run() {
        this.this$0.next.invokeChannelWritabilityChanged();
    }
}
