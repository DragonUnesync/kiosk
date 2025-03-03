package b6;

import S5.C0185n;
import S5.C0187o;
import X5.C0352c;
import X5.C0353d;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;

public enum w1 {
    TCNATIVE(true, r1),
    CONSCRYPT(true, r1),
    JDK(false, C0353d.MERGE_CUMULATOR);
    
    final C0352c cumulator;
    final boolean wantsDirectBuffer;

    public static w1 forEngine(SSLEngine sSLEngine) {
        if (sSLEngine instanceof Q0) {
            return TCNATIVE;
        }
        if (sSLEngine instanceof C0564k) {
            return CONSCRYPT;
        }
        return JDK;
    }

    public abstract C0185n allocateWrapBuffer(C1 c12, C0187o oVar, int i, int i8);

    public abstract int calculatePendingData(C1 c12, int i);

    public abstract int calculateRequiredOutBufSpace(C1 c12, int i, int i8);

    public abstract boolean jdkCompatibilityMode(SSLEngine sSLEngine);

    public abstract SSLEngineResult unwrap(C1 c12, C0185n nVar, int i, C0185n nVar2);

    private w1(boolean z, C0352c cVar) {
        this.wantsDirectBuffer = z;
        this.cumulator = cVar;
    }
}
