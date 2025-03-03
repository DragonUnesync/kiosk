package T5;

import S5.C0185n;
import S5.C0189p;

public final class U0 implements f1 {
    private final int unknownSize;

    public int size(Object obj) {
        if (obj instanceof C0185n) {
            return ((C0185n) obj).readableBytes();
        }
        if (obj instanceof C0189p) {
            return ((C0189p) obj).content().readableBytes();
        }
        return this.unknownSize;
    }

    private U0(int i) {
        this.unknownSize = i;
    }
}
