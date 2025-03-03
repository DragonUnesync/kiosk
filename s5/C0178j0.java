package S5;

import g6.n0;

/* renamed from: S5.j0  reason: case insensitive filesystem */
public final class C0178j0 {
    private final C0176i0 allocator;

    public C0178j0(C0176i0 i0Var) {
        this.allocator = i0Var;
    }

    public int chunkSize() {
        return this.allocator.chunkSize();
    }

    public int normalCacheSize() {
        return this.allocator.normalCacheSize();
    }

    public int numDirectArenas() {
        return this.allocator.numDirectArenas();
    }

    public int numHeapArenas() {
        return this.allocator.numHeapArenas();
    }

    public int numThreadLocalCaches() {
        return this.allocator.numThreadLocalCaches();
    }

    public int smallCacheSize() {
        return this.allocator.smallCacheSize();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(n0.simpleClassName((Object) this));
        sb.append("(usedHeapMemory: ");
        sb.append(usedHeapMemory());
        sb.append("; usedDirectMemory: ");
        sb.append(usedDirectMemory());
        sb.append("; numHeapArenas: ");
        sb.append(numHeapArenas());
        sb.append("; numDirectArenas: ");
        sb.append(numDirectArenas());
        sb.append("; smallCacheSize: ");
        sb.append(smallCacheSize());
        sb.append("; normalCacheSize: ");
        sb.append(normalCacheSize());
        sb.append("; numThreadLocalCaches: ");
        sb.append(numThreadLocalCaches());
        sb.append("; chunkSize: ");
        sb.append(chunkSize());
        sb.append(')');
        return sb.toString();
    }

    public long usedDirectMemory() {
        return this.allocator.usedDirectMemory();
    }

    public long usedHeapMemory() {
        return this.allocator.usedHeapMemory();
    }
}
