package e6;

import f6.C0934y;
import g6.p0;
import h6.C1082c;
import h6.d;

public abstract class H {
    /* access modifiers changed from: private */
    public static final boolean BATCH_FAST_TL_ONLY;
    /* access modifiers changed from: private */
    public static final boolean BLOCKING_POOL;
    private static final int DEFAULT_MAX_CAPACITY_PER_THREAD;
    private static final int DEFAULT_QUEUE_CHUNK_SIZE_PER_THREAD;
    private static final E NOOP_HANDLE = new C0841A();
    private static final int RATIO;
    private static final C1082c logger;
    /* access modifiers changed from: private */
    public final int chunkSize;
    /* access modifiers changed from: private */
    public final int interval;
    /* access modifiers changed from: private */
    public final int maxCapacityPerThread;
    private final C0934y threadLocal;

    static {
        C1082c instance = d.getInstance((Class<?>) H.class);
        logger = instance;
        int i = 4096;
        int i8 = p0.getInt("io.netty.recycler.maxCapacityPerThread", p0.getInt("io.netty.recycler.maxCapacity", 4096));
        if (i8 >= 0) {
            i = i8;
        }
        DEFAULT_MAX_CAPACITY_PER_THREAD = i;
        int i9 = p0.getInt("io.netty.recycler.chunkSize", 32);
        DEFAULT_QUEUE_CHUNK_SIZE_PER_THREAD = i9;
        int max = Math.max(0, p0.getInt("io.netty.recycler.ratio", 8));
        RATIO = max;
        boolean z = p0.getBoolean("io.netty.recycler.blocking", false);
        BLOCKING_POOL = z;
        boolean z6 = p0.getBoolean("io.netty.recycler.batchFastThreadLocalOnly", true);
        BATCH_FAST_TL_ONLY = z6;
        if (!instance.isDebugEnabled()) {
            return;
        }
        if (i == 0) {
            instance.debug("-Dio.netty.recycler.maxCapacityPerThread: disabled");
            instance.debug("-Dio.netty.recycler.ratio: disabled");
            instance.debug("-Dio.netty.recycler.chunkSize: disabled");
            instance.debug("-Dio.netty.recycler.blocking: disabled");
            instance.debug("-Dio.netty.recycler.batchFastThreadLocalOnly: disabled");
            return;
        }
        instance.debug("-Dio.netty.recycler.maxCapacityPerThread: {}", (Object) Integer.valueOf(i));
        instance.debug("-Dio.netty.recycler.ratio: {}", (Object) Integer.valueOf(max));
        instance.debug("-Dio.netty.recycler.chunkSize: {}", (Object) Integer.valueOf(i9));
        instance.debug("-Dio.netty.recycler.blocking: {}", (Object) Boolean.valueOf(z));
        instance.debug("-Dio.netty.recycler.batchFastThreadLocalOnly: {}", (Object) Boolean.valueOf(z6));
    }

    public H() {
        this(DEFAULT_MAX_CAPACITY_PER_THREAD);
    }

    public final Object get() {
        if (this.maxCapacityPerThread == 0) {
            return newObject(NOOP_HANDLE);
        }
        G g8 = (G) this.threadLocal.get();
        D claim = g8.claim();
        if (claim != null) {
            return claim.get();
        }
        D newHandle = g8.newHandle();
        if (newHandle == null) {
            return newObject(NOOP_HANDLE);
        }
        Object newObject = newObject(newHandle);
        newHandle.set(newObject);
        return newObject;
    }

    public abstract Object newObject(F f8);

    public H(int i) {
        this(i, RATIO, DEFAULT_QUEUE_CHUNK_SIZE_PER_THREAD);
    }

    public H(int i, int i8, int i9) {
        this.threadLocal = new B(this);
        this.interval = Math.max(0, i8);
        if (i <= 0) {
            this.maxCapacityPerThread = 0;
            this.chunkSize = 0;
            return;
        }
        int max = Math.max(4, i);
        this.maxCapacityPerThread = max;
        this.chunkSize = Math.max(2, Math.min(i9, max >> 1));
    }
}
