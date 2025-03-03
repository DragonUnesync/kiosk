package e6;

public final class X extends Error implements C0853l {
    private static final C0854m pool = new V();
    private final W constant;

    public /* synthetic */ X(int i, String str, V v4) {
        this(i, str);
    }

    public static X valueOf(Class<?> cls, String str) {
        return (X) pool.valueOf(cls, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public void expect(X x8) {
        if (this != x8) {
            throw new IllegalStateException("unexpected signal: " + x8);
        }
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public Throwable initCause(Throwable th) {
        return this;
    }

    public String name() {
        return this.constant.name();
    }

    public String toString() {
        return name();
    }

    private X(int i, String str) {
        this.constant = new W(i, str);
    }

    public int compareTo(X x8) {
        if (this == x8) {
            return 0;
        }
        return this.constant.compareTo((C0842a) x8.constant);
    }
}
