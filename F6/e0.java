package f6;

public final class e0 extends C0918h {
    private final Object result;

    public e0(C0929t tVar, Object obj) {
        super(tVar);
        this.result = obj;
    }

    public Throwable cause() {
        return null;
    }

    public Object getNow() {
        return this.result;
    }

    public boolean isSuccess() {
        return true;
    }
}
