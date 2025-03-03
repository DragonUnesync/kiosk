package g6;

import f6.C0908A;
import h6.C1082c;
import h6.d;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g6.m  reason: case insensitive filesystem */
public final class C0980m extends B0 {
    private static final int STRING_BUILDER_INITIAL_SIZE;
    private static final int STRING_BUILDER_MAX_SIZE;
    public static final Object UNSET = new Object();
    public static final int VARIABLES_TO_REMOVE_INDEX = nextVariableIndex();
    private static final C1082c logger;
    private static final AtomicInteger nextIndex = new AtomicInteger();
    private static final ThreadLocal<C0980m> slowThreadLocalMap = new ThreadLocal<>();
    private Map<Charset, CharsetEncoder> charsetEncoderCache;
    private int futureListenerStackDepth;
    private Map<Class<?>, Boolean> handlerSharableCache;
    private Object[] indexedVariables = newIndexedVariableTable();
    private w0 random;
    private StringBuilder stringBuilder;
    private Map<Class<?>, Map<String, A0>> typeParameterMatcherFindCache;
    private Map<Class<?>, A0> typeParameterMatcherGetCache;

    static {
        int i = p0.getInt("io.netty.threadLocalMap.stringBuilder.initialSize", 1024);
        STRING_BUILDER_INITIAL_SIZE = i;
        int i8 = p0.getInt("io.netty.threadLocalMap.stringBuilder.maxSize", 4096);
        STRING_BUILDER_MAX_SIZE = i8;
        C1082c instance = d.getInstance((Class<?>) C0980m.class);
        logger = instance;
        instance.debug("-Dio.netty.threadLocalMap.stringBuilder.initialSize: {}", (Object) Integer.valueOf(i));
        instance.debug("-Dio.netty.threadLocalMap.stringBuilder.maxSize: {}", (Object) Integer.valueOf(i8));
    }

    private C0980m() {
    }

    private void expandIndexedVariableTableAndSet(int i, Object obj) {
        int i8;
        Object[] objArr = this.indexedVariables;
        int length = objArr.length;
        if (i < 1073741824) {
            int i9 = (i >>> 1) | i;
            int i10 = i9 | (i9 >>> 2);
            int i11 = i10 | (i10 >>> 4);
            int i12 = i11 | (i11 >>> 8);
            i8 = (i12 | (i12 >>> 16)) + 1;
        } else {
            i8 = 2147483639;
        }
        Object[] copyOf = Arrays.copyOf(objArr, i8);
        Arrays.fill(copyOf, length, copyOf.length, UNSET);
        copyOf[i] = obj;
        this.indexedVariables = copyOf;
    }

    private static C0980m fastGet(C0908A a8) {
        C0980m threadLocalMap = a8.threadLocalMap();
        if (threadLocalMap != null) {
            return threadLocalMap;
        }
        C0980m mVar = new C0980m();
        a8.setThreadLocalMap(mVar);
        return mVar;
    }

    public static C0980m get() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C0908A) {
            return fastGet((C0908A) currentThread);
        }
        return slowGet();
    }

    public static C0980m getIfSet() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C0908A) {
            return ((C0908A) currentThread).threadLocalMap();
        }
        return slowThreadLocalMap.get();
    }

    private static Object[] newIndexedVariableTable() {
        Object[] objArr = new Object[32];
        Arrays.fill(objArr, UNSET);
        return objArr;
    }

    public static int nextVariableIndex() {
        AtomicInteger atomicInteger = nextIndex;
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement < 2147483639 && andIncrement >= 0) {
            return andIncrement;
        }
        atomicInteger.set(2147483639);
        throw new IllegalStateException("too many thread-local indexed variables");
    }

    public static void remove() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C0908A) {
            ((C0908A) currentThread).setThreadLocalMap((C0980m) null);
        } else {
            slowThreadLocalMap.remove();
        }
    }

    private static C0980m slowGet() {
        ThreadLocal<C0980m> threadLocal = slowThreadLocalMap;
        C0980m mVar = threadLocal.get();
        if (mVar != null) {
            return mVar;
        }
        C0980m mVar2 = new C0980m();
        threadLocal.set(mVar2);
        return mVar2;
    }

    public Map<Charset, CharsetEncoder> charsetEncoderCache() {
        Map<Charset, CharsetEncoder> map = this.charsetEncoderCache;
        if (map != null) {
            return map;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        this.charsetEncoderCache = identityHashMap;
        return identityHashMap;
    }

    public int futureListenerStackDepth() {
        return this.futureListenerStackDepth;
    }

    public Map<Class<?>, Boolean> handlerSharableCache() {
        Map<Class<?>, Boolean> map = this.handlerSharableCache;
        if (map != null) {
            return map;
        }
        WeakHashMap weakHashMap = new WeakHashMap(4);
        this.handlerSharableCache = weakHashMap;
        return weakHashMap;
    }

    public Object indexedVariable(int i) {
        Object[] objArr = this.indexedVariables;
        if (i < objArr.length) {
            return objArr[i];
        }
        return UNSET;
    }

    public w0 random() {
        w0 w0Var = this.random;
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0();
        this.random = w0Var2;
        return w0Var2;
    }

    public Object removeIndexedVariable(int i) {
        Object[] objArr = this.indexedVariables;
        if (i >= objArr.length) {
            return UNSET;
        }
        Object obj = objArr[i];
        objArr[i] = UNSET;
        return obj;
    }

    public void setFutureListenerStackDepth(int i) {
        this.futureListenerStackDepth = i;
    }

    public boolean setIndexedVariable(int i, Object obj) {
        Object[] objArr = this.indexedVariables;
        if (i < objArr.length) {
            Object obj2 = objArr[i];
            objArr[i] = obj;
            if (obj2 == UNSET) {
                return true;
            }
            return false;
        }
        expandIndexedVariableTableAndSet(i, obj);
        return true;
    }

    public StringBuilder stringBuilder() {
        StringBuilder sb = this.stringBuilder;
        if (sb == null) {
            StringBuilder sb2 = new StringBuilder(STRING_BUILDER_INITIAL_SIZE);
            this.stringBuilder = sb2;
            return sb2;
        }
        if (sb.capacity() > STRING_BUILDER_MAX_SIZE) {
            sb.setLength(STRING_BUILDER_INITIAL_SIZE);
            sb.trimToSize();
        }
        sb.setLength(0);
        return sb;
    }

    public Map<Class<?>, Map<String, A0>> typeParameterMatcherFindCache() {
        Map<Class<?>, Map<String, A0>> map = this.typeParameterMatcherFindCache;
        if (map != null) {
            return map;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        this.typeParameterMatcherFindCache = identityHashMap;
        return identityHashMap;
    }

    public Map<Class<?>, A0> typeParameterMatcherGetCache() {
        Map<Class<?>, A0> map = this.typeParameterMatcherGetCache;
        if (map != null) {
            return map;
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        this.typeParameterMatcherGetCache = identityHashMap;
        return identityHashMap;
    }
}
