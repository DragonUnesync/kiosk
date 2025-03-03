package S5;

import g6.C0982o;
import g6.Y;
import g6.n0;

public final class K0 {
    final C0982o directCounter;
    final C0982o heapCounter;

    private K0() {
        this.directCounter = Y.newLongCounter();
        this.heapCounter = Y.newLongCounter();
    }

    public String toString() {
        return n0.simpleClassName((Object) this) + "(usedHeapMemory: " + usedHeapMemory() + "; usedDirectMemory: " + usedDirectMemory() + ')';
    }

    public long usedDirectMemory() {
        return this.directCounter.value();
    }

    public long usedHeapMemory() {
        return this.heapCounter.value();
    }
}
