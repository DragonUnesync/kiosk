package a6;

import S5.C0185n;
import S5.F;
import g6.n0;

public abstract class G extends F {
    private final boolean finalFragment;
    private final int rsv;

    public G(C0185n nVar) {
        this(true, 0, nVar);
    }

    public boolean isFinalFragment() {
        return this.finalFragment;
    }

    public int rsv() {
        return this.rsv;
    }

    public String toString() {
        return n0.simpleClassName((Object) this) + "(data: " + contentToString() + ')';
    }

    public G touch(Object obj) {
        touch(obj);
        return this;
    }

    public G(boolean z, int i, C0185n nVar) {
        super(nVar);
        this.finalFragment = z;
        this.rsv = i;
    }
}
