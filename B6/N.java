package b6;

import N.e;
import java.util.HashMap;
import java.util.Map;

public final class N extends C0538b0 {
    private final Map<M, C0535a0> sessions = new HashMap();

    static {
        Class<N> cls = N.class;
    }

    public N(S s8) {
        super(s8);
    }

    private static M keyFor(String str, int i) {
        if (str != null || i >= 1) {
            return new M(str, i);
        }
        return null;
    }

    public synchronized void clear() {
        super.clear();
        this.sessions.clear();
    }

    public void sessionRemoved(C0535a0 a0Var) {
        throw null;
    }

    public void setSession(long j7, String str, int i) {
        M keyFor = keyFor(str, i);
        if (keyFor != null) {
            synchronized (this) {
                e.G(this.sessions.get(keyFor));
            }
        }
    }
}
