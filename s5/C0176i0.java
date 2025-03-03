package S5;

import O7.b;
import e6.z;
import g6.B;
import g6.Y;
import g6.p0;
import h6.C1082c;
import h6.d;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u.C1477r;

/* renamed from: S5.i0  reason: case insensitive filesystem */
public final class C0176i0 extends C0163c {
    public static final C0176i0 DEFAULT = new C0176i0(Y.directBufferPreferred());
    /* access modifiers changed from: private */
    public static final int DEFAULT_CACHE_TRIM_INTERVAL;
    /* access modifiers changed from: private */
    public static final long DEFAULT_CACHE_TRIM_INTERVAL_MILLIS;
    private static final int DEFAULT_DIRECT_MEMORY_CACHE_ALIGNMENT;
    static final int DEFAULT_MAX_CACHED_BUFFER_CAPACITY;
    static final int DEFAULT_MAX_CACHED_BYTEBUFFERS_PER_CHUNK;
    private static final int DEFAULT_MAX_ORDER;
    private static final int DEFAULT_NORMAL_CACHE_SIZE;
    private static final int DEFAULT_NUM_DIRECT_ARENA;
    private static final int DEFAULT_NUM_HEAP_ARENA;
    private static final int DEFAULT_PAGE_SIZE;
    private static final int DEFAULT_SMALL_CACHE_SIZE;
    private static final boolean DEFAULT_USE_CACHE_FOR_ALL_THREADS;
    private static final C1082c logger = d.getInstance((Class<?>) C0176i0.class);
    private final int chunkSize;
    private final List<Object> directArenaMetrics;
    /* access modifiers changed from: private */
    public final S[] directArenas;
    private final List<Object> heapArenaMetrics;
    /* access modifiers changed from: private */
    public final S[] heapArenas;
    private final C0178j0 metric;
    /* access modifiers changed from: private */
    public final int normalCacheSize;
    /* access modifiers changed from: private */
    public final int smallCacheSize;
    private final C0174h0 threadCache;
    /* access modifiers changed from: private */
    public final Runnable trimTask;

    static {
        Object obj;
        int i = p0.getInt("io.netty.allocator.directMemoryCacheAlignment", 0);
        int i8 = p0.getInt("io.netty.allocator.pageSize", 8192);
        Object obj2 = null;
        try {
            validateAndCalculatePageShifts(i8, i);
            obj = null;
        } catch (Throwable th) {
            obj = th;
            i = 0;
            i8 = 8192;
        }
        DEFAULT_PAGE_SIZE = i8;
        DEFAULT_DIRECT_MEMORY_CACHE_ALIGNMENT = i;
        int i9 = 9;
        int i10 = p0.getInt("io.netty.allocator.maxOrder", 9);
        try {
            validateAndCalculateChunkSize(i8, i10);
            i9 = i10;
        } catch (Throwable th2) {
            obj2 = th2;
        }
        DEFAULT_MAX_ORDER = i9;
        Runtime runtime = Runtime.getRuntime();
        int i11 = DEFAULT_PAGE_SIZE;
        long availableProcessors = (long) (z.availableProcessors() * 2);
        long j7 = (long) (i11 << i9);
        int max = Math.max(0, p0.getInt("io.netty.allocator.numHeapArenas", (int) Math.min(availableProcessors, ((runtime.maxMemory() / j7) / 2) / 3)));
        DEFAULT_NUM_HEAP_ARENA = max;
        int max2 = Math.max(0, p0.getInt("io.netty.allocator.numDirectArenas", (int) Math.min(availableProcessors, ((Y.maxDirectMemory() / j7) / 2) / 3)));
        DEFAULT_NUM_DIRECT_ARENA = max2;
        int i12 = p0.getInt("io.netty.allocator.smallCacheSize", 256);
        DEFAULT_SMALL_CACHE_SIZE = i12;
        int i13 = p0.getInt("io.netty.allocator.normalCacheSize", 64);
        DEFAULT_NORMAL_CACHE_SIZE = i13;
        int i14 = p0.getInt("io.netty.allocator.maxCachedBufferCapacity", 32768);
        DEFAULT_MAX_CACHED_BUFFER_CAPACITY = i14;
        int i15 = p0.getInt("io.netty.allocator.cacheTrimInterval", 8192);
        DEFAULT_CACHE_TRIM_INTERVAL = i15;
        if (p0.contains("io.netty.allocation.cacheTrimIntervalMillis")) {
            logger.warn("-Dio.netty.allocation.cacheTrimIntervalMillis is deprecated, use -Dio.netty.allocator.cacheTrimIntervalMillis");
            if (p0.contains("io.netty.allocator.cacheTrimIntervalMillis")) {
                DEFAULT_CACHE_TRIM_INTERVAL_MILLIS = p0.getLong("io.netty.allocator.cacheTrimIntervalMillis", 0);
            } else {
                DEFAULT_CACHE_TRIM_INTERVAL_MILLIS = p0.getLong("io.netty.allocation.cacheTrimIntervalMillis", 0);
            }
        } else {
            DEFAULT_CACHE_TRIM_INTERVAL_MILLIS = p0.getLong("io.netty.allocator.cacheTrimIntervalMillis", 0);
        }
        boolean z = p0.getBoolean("io.netty.allocator.useCacheForAllThreads", false);
        DEFAULT_USE_CACHE_FOR_ALL_THREADS = z;
        int i16 = p0.getInt("io.netty.allocator.maxCachedByteBuffersPerChunk", 1023);
        DEFAULT_MAX_CACHED_BYTEBUFFERS_PER_CHUNK = i16;
        C1082c cVar = logger;
        if (cVar.isDebugEnabled()) {
            cVar.debug("-Dio.netty.allocator.numHeapArenas: {}", (Object) Integer.valueOf(max));
            cVar.debug("-Dio.netty.allocator.numDirectArenas: {}", (Object) Integer.valueOf(max2));
            if (obj == null) {
                cVar.debug("-Dio.netty.allocator.pageSize: {}", (Object) Integer.valueOf(i11));
            } else {
                cVar.debug("-Dio.netty.allocator.pageSize: {}", Integer.valueOf(i11), obj);
            }
            if (obj2 == null) {
                cVar.debug("-Dio.netty.allocator.maxOrder: {}", (Object) Integer.valueOf(i9));
            } else {
                cVar.debug("-Dio.netty.allocator.maxOrder: {}", Integer.valueOf(i9), obj2);
            }
            cVar.debug("-Dio.netty.allocator.chunkSize: {}", (Object) Integer.valueOf(i11 << i9));
            cVar.debug("-Dio.netty.allocator.smallCacheSize: {}", (Object) Integer.valueOf(i12));
            cVar.debug("-Dio.netty.allocator.normalCacheSize: {}", (Object) Integer.valueOf(i13));
            cVar.debug("-Dio.netty.allocator.maxCachedBufferCapacity: {}", (Object) Integer.valueOf(i14));
            cVar.debug("-Dio.netty.allocator.cacheTrimInterval: {}", (Object) Integer.valueOf(i15));
            cVar.debug("-Dio.netty.allocator.cacheTrimIntervalMillis: {}", (Object) Long.valueOf(DEFAULT_CACHE_TRIM_INTERVAL_MILLIS));
            cVar.debug("-Dio.netty.allocator.useCacheForAllThreads: {}", (Object) Boolean.valueOf(z));
            cVar.debug("-Dio.netty.allocator.maxCachedByteBuffersPerChunk: {}", (Object) Integer.valueOf(i16));
        }
    }

    public C0176i0(boolean z) {
        this(z, DEFAULT_NUM_HEAP_ARENA, DEFAULT_NUM_DIRECT_ARENA, DEFAULT_PAGE_SIZE, DEFAULT_MAX_ORDER);
    }

    public static boolean isDirectMemoryCacheAlignmentSupported() {
        return Y.hasUnsafe();
    }

    private static <T> S[] newArenaArray(int i) {
        return new S[i];
    }

    private static long usedMemory(S[] sArr) {
        if (sArr == null) {
            return -1;
        }
        long j7 = 0;
        for (S numActiveBytes : sArr) {
            j7 += numActiveBytes.numActiveBytes();
            if (j7 < 0) {
                return Long.MAX_VALUE;
            }
        }
        return j7;
    }

    private static int validateAndCalculateChunkSize(int i, int i8) {
        if (i8 <= 14) {
            int i9 = i;
            int i10 = i8;
            while (i10 > 0) {
                if (i9 <= 536870912) {
                    i9 <<= 1;
                    i10--;
                } else {
                    throw new IllegalArgumentException(String.format("pageSize (%d) << maxOrder (%d) must not exceed %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i8), Integer.valueOf(b.MAX_POW2)}));
                }
            }
            return i9;
        }
        throw new IllegalArgumentException(C1477r.c(i8, "maxOrder: ", " (expected: 0-14)"));
    }

    private static int validateAndCalculatePageShifts(int i, int i8) {
        if (i < 4096) {
            throw new IllegalArgumentException(C1477r.c(i, "pageSize: ", " (expected: 4096)"));
        } else if (((i - 1) & i) != 0) {
            throw new IllegalArgumentException(C1477r.c(i, "pageSize: ", " (expected: power of 2)"));
        } else if (i >= i8) {
            return 31 - Integer.numberOfLeadingZeros(i);
        } else {
            throw new IllegalArgumentException("Alignment cannot be greater than page size. Alignment: " + i8 + ", page size: " + i + '.');
        }
    }

    @Deprecated
    public final int chunkSize() {
        return this.chunkSize;
    }

    public boolean isDirectBufferPooled() {
        if (this.directArenas != null) {
            return true;
        }
        return false;
    }

    public C0185n newDirectBuffer(int i, int i8) {
        C0185n nVar;
        C0168e0 e0Var = (C0168e0) this.threadCache.get();
        S s8 = e0Var.directArena;
        if (s8 != null) {
            nVar = s8.allocate(e0Var, i, i8);
        } else if (Y.hasUnsafe()) {
            nVar = U0.newUnsafeDirectByteBuf(this, i, i8);
        } else {
            nVar = new M0((C0187o) this, i, i8);
        }
        return C0163c.toLeakAwareBuffer(nVar);
    }

    public C0185n newHeapBuffer(int i, int i8) {
        C0185n nVar;
        C0185n o02;
        C0168e0 e0Var = (C0168e0) this.threadCache.get();
        S s8 = e0Var.heapArena;
        if (s8 != null) {
            nVar = s8.allocate(e0Var, i, i8);
        } else {
            if (Y.hasUnsafe()) {
                o02 = new R0(this, i, i8);
            } else {
                o02 = new O0((C0187o) this, i, i8);
            }
            nVar = o02;
        }
        return C0163c.toLeakAwareBuffer(nVar);
    }

    @Deprecated
    public int normalCacheSize() {
        return this.normalCacheSize;
    }

    @Deprecated
    public int numDirectArenas() {
        return this.directArenaMetrics.size();
    }

    @Deprecated
    public int numHeapArenas() {
        return this.heapArenaMetrics.size();
    }

    @Deprecated
    public int numThreadLocalCaches() {
        S[] sArr = this.heapArenas;
        if (sArr == null) {
            sArr = this.directArenas;
        }
        if (sArr == null) {
            return 0;
        }
        int i = 0;
        for (S s8 : sArr) {
            i += s8.numThreadCaches.get();
        }
        return i;
    }

    @Deprecated
    public int smallCacheSize() {
        return this.smallCacheSize;
    }

    public final C0168e0 threadCache() {
        return (C0168e0) this.threadCache.get();
    }

    public boolean trimCurrentThreadCache() {
        C0168e0 e0Var = (C0168e0) this.threadCache.getIfExists();
        if (e0Var == null) {
            return false;
        }
        e0Var.trim();
        return true;
    }

    public final long usedDirectMemory() {
        return usedMemory(this.directArenas);
    }

    public final long usedHeapMemory() {
        return usedMemory(this.heapArenas);
    }

    @Deprecated
    public C0176i0(boolean z, int i, int i8, int i9, int i10) {
        this(z, i, i8, i9, i10, 0, DEFAULT_SMALL_CACHE_SIZE, DEFAULT_NORMAL_CACHE_SIZE);
    }

    @Deprecated
    public C0176i0(boolean z, int i, int i8, int i9, int i10, int i11, int i12, int i13) {
        this(z, i, i8, i9, i10, i12, i13, DEFAULT_USE_CACHE_FOR_ALL_THREADS, DEFAULT_DIRECT_MEMORY_CACHE_ALIGNMENT);
    }

    public C0176i0(boolean z, int i, int i8, int i9, int i10, int i11, int i12, boolean z6, int i13) {
        super(z);
        this.trimTask = new C0172g0(this);
        this.threadCache = new C0174h0(this, z6);
        this.smallCacheSize = i11;
        this.normalCacheSize = i12;
        if (i13 != 0) {
            if (Y.hasAlignDirectByteBuffer()) {
                i9 = (int) Y.align((long) i9, i13);
            } else {
                throw new UnsupportedOperationException("Buffer alignment is not supported. Either Unsafe or ByteBuffer.alignSlice() must be available.");
            }
        }
        int i14 = i9;
        this.chunkSize = validateAndCalculateChunkSize(i14, i10);
        B.checkPositiveOrZero(i, "nHeapArena");
        B.checkPositiveOrZero(i8, "nDirectArena");
        B.checkPositiveOrZero(i13, "directMemoryCacheAlignment");
        if (i13 > 0 && !isDirectMemoryCacheAlignmentSupported()) {
            throw new IllegalArgumentException("directMemoryCacheAlignment is not supported");
        } else if (((-i13) & i13) == i13) {
            int validateAndCalculatePageShifts = validateAndCalculatePageShifts(i14, i13);
            if (i > 0) {
                S[] newArenaArray = newArenaArray(i);
                this.heapArenas = newArenaArray;
                ArrayList arrayList = new ArrayList(newArenaArray.length);
                for (int i15 = 0; i15 < this.heapArenas.length; i15++) {
                    P p3 = new P(this, i14, validateAndCalculatePageShifts, this.chunkSize);
                    this.heapArenas[i15] = p3;
                    arrayList.add(p3);
                }
                this.heapArenaMetrics = DesugarCollections.unmodifiableList(arrayList);
            } else {
                this.heapArenas = null;
                this.heapArenaMetrics = Collections.emptyList();
            }
            if (i8 > 0) {
                S[] newArenaArray2 = newArenaArray(i8);
                this.directArenas = newArenaArray2;
                ArrayList arrayList2 = new ArrayList(newArenaArray2.length);
                for (int i16 = 0; i16 < this.directArenas.length; i16++) {
                    O o2 = new O(this, i14, validateAndCalculatePageShifts, this.chunkSize, i13);
                    this.directArenas[i16] = o2;
                    arrayList2.add(o2);
                }
                this.directArenaMetrics = DesugarCollections.unmodifiableList(arrayList2);
            } else {
                this.directArenas = null;
                this.directArenaMetrics = Collections.emptyList();
            }
            this.metric = new C0178j0(this);
        } else {
            throw new IllegalArgumentException(C1477r.c(i13, "directMemoryCacheAlignment: ", " (expected: power of two)"));
        }
    }
}
