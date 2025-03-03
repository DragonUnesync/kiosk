package T5;

import g6.B;

public final class V0 implements g1 {
    public static final g1 DEFAULT = new V0(8);
    private final f1 handle;

    public V0(int i) {
        B.checkPositiveOrZero(i, "unknownSize");
        this.handle = new U0(i);
    }

    public f1 newHandle() {
        return this.handle;
    }
}
