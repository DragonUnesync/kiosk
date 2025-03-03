package S5;

import g6.B;
import h6.C1082c;
import h6.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import u.C1477r;

/* renamed from: S5.e0  reason: case insensitive filesystem */
public final class C0168e0 {
    private static final C1082c logger = d.getInstance((Class<?>) C0168e0.class);
    private int allocations;
    final S directArena;
    private final Y freeOnFinalize;
    private final int freeSweepAllocationThreshold;
    private final AtomicBoolean freed = new AtomicBoolean();
    final S heapArena;
    private final C0162b0[] normalDirectCaches;
    private final C0162b0[] normalHeapCaches;
    private final C0162b0[] smallSubPageDirectCaches;
    private final C0162b0[] smallSubPageHeapCaches;

    public C0168e0(S s8, S s9, int i, int i8, int i9, int i10, boolean z) {
        B.checkPositiveOrZero(i9, "maxCachedBufferCapacity");
        this.freeSweepAllocationThreshold = i10;
        this.heapArena = s8;
        this.directArena = s9;
        Y y8 = null;
        if (s9 != null) {
            this.smallSubPageDirectCaches = createSubPageCaches(i, s9.numSmallSubpagePools);
            this.normalDirectCaches = createNormalCaches(i8, i9, s9);
            s9.numThreadCaches.getAndIncrement();
        } else {
            this.smallSubPageDirectCaches = null;
            this.normalDirectCaches = null;
        }
        if (s8 != null) {
            this.smallSubPageHeapCaches = createSubPageCaches(i, s8.numSmallSubpagePools);
            this.normalHeapCaches = createNormalCaches(i8, i9, s8);
            s8.numThreadCaches.getAndIncrement();
        } else {
            this.smallSubPageHeapCaches = null;
            this.normalHeapCaches = null;
        }
        if (!(this.smallSubPageDirectCaches == null && this.normalDirectCaches == null && this.smallSubPageHeapCaches == null && this.normalHeapCaches == null) && i10 < 1) {
            throw new IllegalArgumentException(C1477r.c(i10, "freeSweepAllocationThreshold: ", " (expected: > 0)"));
        }
        this.freeOnFinalize = z ? new Y(this, (X) null) : y8;
    }

    private boolean allocate(C0162b0 b0Var, C0170f0 f0Var, int i) {
        if (b0Var == null) {
            return false;
        }
        boolean allocate = b0Var.allocate(f0Var, i, this);
        int i8 = this.allocations + 1;
        this.allocations = i8;
        if (i8 >= this.freeSweepAllocationThreshold) {
            this.allocations = 0;
            trim();
        }
        return allocate;
    }

    private C0162b0 cache(S s8, int i, Q q7) {
        int i8 = X.$SwitchMap$io$netty$buffer$PoolArena$SizeClass[q7.ordinal()];
        if (i8 == 1) {
            return cacheForNormal(s8, i);
        }
        if (i8 == 2) {
            return cacheForSmall(s8, i);
        }
        throw new Error();
    }

    private C0162b0 cacheForNormal(S s8, int i) {
        int i8 = i - s8.numSmallSubpagePools;
        if (s8.isDirect()) {
            return cache(this.normalDirectCaches, i8);
        }
        return cache(this.normalHeapCaches, i8);
    }

    private C0162b0 cacheForSmall(S s8, int i) {
        if (s8.isDirect()) {
            return cache(this.smallSubPageDirectCaches, i);
        }
        return cache(this.smallSubPageHeapCaches, i);
    }

    private static void checkCacheMayLeak(C0162b0[] b0VarArr, String str) {
        for (C0162b0 access$100 : b0VarArr) {
            if (!access$100.queue.isEmpty()) {
                logger.debug("{} memory may leak.", (Object) str);
                return;
            }
        }
    }

    private static <T> C0162b0[] createNormalCaches(int i, int i8, S s8) {
        if (i <= 0 || i8 <= 0) {
            return null;
        }
        int min = Math.min(s8.chunkSize, i8);
        ArrayList arrayList = new ArrayList();
        int i9 = s8.numSmallSubpagePools;
        while (i9 < s8.nSizes && s8.sizeIdx2size(i9) <= min) {
            arrayList.add(new C0164c0(i));
            i9++;
        }
        return (C0162b0[]) arrayList.toArray(new C0162b0[0]);
    }

    private static <T> C0162b0[] createSubPageCaches(int i, int i8) {
        if (i <= 0 || i8 <= 0) {
            return null;
        }
        C0162b0[] b0VarArr = new C0162b0[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            b0VarArr[i9] = new C0166d0(i);
        }
        return b0VarArr;
    }

    public static int log2(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public boolean add(S s8, T t8, ByteBuffer byteBuffer, long j7, int i, Q q7) {
        C0162b0 cache = cache(s8, s8.size2SizeIdx(i), q7);
        if (cache != null && !this.freed.get()) {
            return cache.add(t8, byteBuffer, j7, i);
        }
        return false;
    }

    public boolean allocateNormal(S s8, C0170f0 f0Var, int i, int i8) {
        return allocate(cacheForNormal(s8, i8), f0Var, i);
    }

    public boolean allocateSmall(S s8, C0170f0 f0Var, int i, int i8) {
        return allocate(cacheForSmall(s8, i8), f0Var, i);
    }

    public void free(boolean z) {
        if (this.freed.compareAndSet(false, true)) {
            int free = free(this.smallSubPageDirectCaches, z) + free(this.normalDirectCaches, z) + free(this.smallSubPageHeapCaches, z) + free(this.normalHeapCaches, z);
            if (free > 0) {
                C1082c cVar = logger;
                if (cVar.isDebugEnabled()) {
                    cVar.debug("Freed {} thread-local buffer(s) from thread: {}", Integer.valueOf(free), Thread.currentThread().getName());
                }
            }
            S s8 = this.directArena;
            if (s8 != null) {
                s8.numThreadCaches.getAndDecrement();
            }
            S s9 = this.heapArena;
            if (s9 != null) {
                s9.numThreadCaches.getAndDecrement();
                return;
            }
            return;
        }
        checkCacheMayLeak(this.smallSubPageDirectCaches, "SmallSubPageDirectCaches");
        checkCacheMayLeak(this.normalDirectCaches, "NormalDirectCaches");
        checkCacheMayLeak(this.smallSubPageHeapCaches, "SmallSubPageHeapCaches");
        checkCacheMayLeak(this.normalHeapCaches, "NormalHeapCaches");
    }

    public void trim() {
        trim(this.smallSubPageDirectCaches);
        trim(this.normalDirectCaches);
        trim(this.smallSubPageHeapCaches);
        trim(this.normalHeapCaches);
    }

    private static <T> C0162b0 cache(C0162b0[] b0VarArr, int i) {
        if (b0VarArr == null || i > b0VarArr.length - 1) {
            return null;
        }
        return b0VarArr[i];
    }

    private static void trim(C0162b0[] b0VarArr) {
        if (b0VarArr != null) {
            for (C0162b0 trim : b0VarArr) {
                trim(trim);
            }
        }
    }

    private static void trim(C0162b0 b0Var) {
        if (b0Var != null) {
            b0Var.trim();
        }
    }

    private static int free(C0162b0[] b0VarArr, boolean z) {
        if (b0VarArr == null) {
            return 0;
        }
        int i = 0;
        for (C0162b0 free : b0VarArr) {
            i += free(free, z);
        }
        return i;
    }

    private static int free(C0162b0 b0Var, boolean z) {
        if (b0Var == null) {
            return 0;
        }
        return b0Var.free(z);
    }
}
