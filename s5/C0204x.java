package S5;

import e6.E;
import g6.C0965A;
import g6.C0989w;

/* renamed from: S5.x  reason: case insensitive filesystem */
public final class C0204x extends Q0 {
    private static final C0965A RECYCLER = C0965A.newPool(new C0202w());
    private final E handle;

    public /* synthetic */ C0204x(C0989w wVar, C0191q qVar) {
        this(wVar);
    }

    public static C0204x newInstance() {
        C0204x xVar = (C0204x) RECYCLER.get();
        xVar.resetRefCnt();
        return xVar;
    }

    public void deallocate() {
        if (capacity() > C0206y.THREAD_LOCAL_BUFFER_SIZE) {
            super.deallocate();
            return;
        }
        clear();
        this.handle.unguardedRecycle(this);
    }

    private C0204x(C0989w wVar) {
        super((C0187o) L0.DEFAULT, 256, Integer.MAX_VALUE);
        this.handle = (E) wVar;
    }
}
