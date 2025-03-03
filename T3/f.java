package t3;

public final class f extends Exception {
    public f(Exception exc) {
        super("Error thrown initializing StaticLayout " + exc.getMessage(), exc);
    }
}
