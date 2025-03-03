package y6;

/* renamed from: y6.c  reason: case insensitive filesystem */
public abstract class C1638c {

    /* renamed from: a  reason: collision with root package name */
    public static final C1637b f16399a = new Throwable("No further exceptions");

    public static RuntimeException a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }
}
