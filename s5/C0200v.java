package S5;

import e6.E;
import g6.C0965A;
import g6.C0989w;

/* renamed from: S5.v  reason: case insensitive filesystem */
public final class C0200v extends M0 {
    private static final C0965A RECYCLER = C0965A.newPool(new C0198u());
    private final E handle;

    public /* synthetic */ C0200v(C0989w wVar, C0191q qVar) {
        this(wVar);
    }

    public static C0200v newInstance() {
        C0200v vVar = (C0200v) RECYCLER.get();
        vVar.resetRefCnt();
        return vVar;
    }

    public void deallocate() {
        if (capacity() > C0206y.THREAD_LOCAL_BUFFER_SIZE) {
            super.deallocate();
            return;
        }
        clear();
        this.handle.unguardedRecycle(this);
    }

    private C0200v(C0989w wVar) {
        super((C0187o) L0.DEFAULT, 256, Integer.MAX_VALUE);
        this.handle = (E) wVar;
    }
}
