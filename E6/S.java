package e6;

import h6.C1082c;
import h6.d;

public abstract class S {
    private static volatile S factoryInstance = new Q();
    /* access modifiers changed from: private */
    public static final C1082c logger = d.getInstance((Class<?>) S.class);

    public static S instance() {
        return factoryInstance;
    }

    public final <T> P newResourceLeakDetector(Class<T> cls) {
        return newResourceLeakDetector(cls, P.SAMPLING_INTERVAL);
    }

    public abstract <T> P newResourceLeakDetector(Class<T> cls, int i);
}
