package T5;

public class N extends RuntimeException {
    public N(String str, Throwable th) {
        super(str, th);
    }

    public N(String str) {
        super(str);
    }

    public N(Throwable th) {
        super(th);
    }
}
