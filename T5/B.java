package T5;

public final class B implements Runnable {
    final /* synthetic */ C this$0;

    public B(C c8) {
        this.this$0 = c8;
    }

    public void run() {
        this.this$0.next.invokeFlush();
    }
}
