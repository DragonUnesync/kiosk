package g6;

public final class z0 extends A0 {
    private final Class<?> type;

    public z0(Class<?> cls) {
        this.type = cls;
    }

    public boolean match(Object obj) {
        return this.type.isInstance(obj);
    }
}
