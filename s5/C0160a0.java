package S5;

import e6.E;
import g6.C0989w;
import java.nio.ByteBuffer;

/* renamed from: S5.a0  reason: case insensitive filesystem */
public final class C0160a0 {
    T chunk;
    long handle = -1;
    ByteBuffer nioBuffer;
    int normCapacity;
    final E recyclerHandle;

    public C0160a0(C0989w wVar) {
        this.recyclerHandle = (E) wVar;
    }

    public void recycle() {
        this.chunk = null;
        this.nioBuffer = null;
        this.handle = -1;
        this.recyclerHandle.recycle(this);
    }

    public void unguardedRecycle() {
        this.chunk = null;
        this.nioBuffer = null;
        this.handle = -1;
        this.recyclerHandle.unguardedRecycle(this);
    }
}
