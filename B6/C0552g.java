package b6;

/* renamed from: b6.g  reason: case insensitive filesystem */
public final class C0552g {
    private static final C0552g NULL = new C0552g((String) null);
    final String value;

    private C0552g(String str) {
        this.value = str;
    }

    public static C0552g of(String str) {
        if (str != null) {
            return new C0552g(str);
        }
        return NULL;
    }
}
