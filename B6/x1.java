package b6;

import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import S5.E;
import T5.G;
import T5.K;
import g6.Y;

public final class x1 extends G {
    final /* synthetic */ C1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x1(C1 c12, K k8, int i) {
        super(k8, i);
        this.this$0 = c12;
    }

    public C0185n compose(C0187o oVar, C0185n nVar, C0185n nVar2) {
        int i = this.this$0.wrapDataSize;
        if (nVar instanceof E) {
            E e = (E) nVar;
            int numComponents = e.numComponents();
            if (numComponents == 0 || !C1.attemptCopyToCumulation(e.internalComponent(numComponents - 1), nVar2, i)) {
                e.addComponent(true, nVar2);
            }
            return e;
        } else if (C1.attemptCopyToCumulation(nVar, nVar2, i)) {
            return nVar;
        } else {
            return copyAndCompose(oVar, nVar, nVar2);
        }
    }

    public C0185n composeFirst(C0187o oVar, C0185n nVar) {
        C0185n nVar2;
        if (!(nVar instanceof E)) {
            return nVar;
        }
        E e = (E) nVar;
        if (this.this$0.engineType.wantsDirectBuffer) {
            nVar2 = ((C0163c) oVar).directBuffer(e.readableBytes());
        } else {
            nVar2 = ((C0163c) oVar).heapBuffer(e.readableBytes());
        }
        try {
            nVar2.writeBytes((C0185n) e);
        } catch (Throwable th) {
            nVar2.release();
            Y.throwException(th);
        }
        e.release();
        return nVar2;
    }

    public C0185n removeEmptyValue() {
        return null;
    }
}
