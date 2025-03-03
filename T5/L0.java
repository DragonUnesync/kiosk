package T5;

public abstract class L0 implements Runnable {
    final F ctx;
    L0 next;

    public L0(F f8) {
        this.ctx = f8;
    }

    public abstract void execute();
}
