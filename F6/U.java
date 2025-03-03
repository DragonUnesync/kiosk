package f6;

public final class U implements Runnable {
    private final String name;

    public U(String str) {
        this.name = str;
    }

    public void run() {
    }

    public String toString() {
        return this.name;
    }
}
