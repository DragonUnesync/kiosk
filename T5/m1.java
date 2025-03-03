package T5;

import g6.B;

public abstract class m1 implements f1 {
    private final f1 estimatorHandle;

    public static m1 newTracker(K k8) {
        C0260n nVar = (C0260n) k8;
        if (nVar.pipeline() instanceof O0) {
            return new k1((O0) nVar.pipeline());
        }
        C0263o0 outboundBuffer = ((C0250i) nVar.unsafe()).outboundBuffer();
        f1 newHandle = ((V0) ((B0) nVar.config()).getMessageSizeEstimator()).newHandle();
        if (outboundBuffer == null) {
            return new l1(newHandle);
        }
        return new j1(outboundBuffer, newHandle);
    }

    public abstract void decrementPendingOutboundBytes(long j7);

    public abstract void incrementPendingOutboundBytes(long j7);

    public final int size(Object obj) {
        return this.estimatorHandle.size(obj);
    }

    private m1(f1 f1Var) {
        this.estimatorHandle = (f1) B.checkNotNull(f1Var, "estimatorHandle");
    }
}
