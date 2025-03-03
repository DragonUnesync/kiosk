package e6;

import g6.B;
import g6.C0978k;
import g6.Y;
import g6.n0;
import g6.p0;
import h6.C1082c;
import h6.d;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class P {
    /* access modifiers changed from: private */
    public static final M DEFAULT_LEVEL;
    static final int SAMPLING_INTERVAL = p0.getInt("io.netty.leakDetection.samplingInterval", 128);
    /* access modifiers changed from: private */
    public static final int TARGET_RECORDS;
    /* access modifiers changed from: private */
    public static final AtomicReference<String[]> excludedMethods = new AtomicReference<>(C0978k.EMPTY_STRINGS);
    private static M level;
    private static final C1082c logger;
    private final Set<L> allLeaks;
    private final ReferenceQueue<Object> refQueue;
    private final Set<String> reportedLeaks;
    private final String resourceType;
    private final int samplingInterval;

    static {
        M m8 = M.SIMPLE;
        DEFAULT_LEVEL = m8;
        C1082c instance = d.getInstance((Class<?>) P.class);
        logger = instance;
        boolean z = false;
        if (p0.get("io.netty.noResourceLeakDetection") != null) {
            z = p0.getBoolean("io.netty.noResourceLeakDetection", false);
            instance.debug("-Dio.netty.noResourceLeakDetection: {}", (Object) Boolean.valueOf(z));
            instance.warn("-Dio.netty.noResourceLeakDetection is deprecated. Use '-D{}={}' instead.", "io.netty.leakDetection.level", M.DISABLED.name().toLowerCase());
        }
        if (z) {
            m8 = M.DISABLED;
        }
        M parseLevel = M.parseLevel(p0.get("io.netty.leakDetection.level", p0.get("io.netty.leakDetectionLevel", m8.name())));
        int i = p0.getInt("io.netty.leakDetection.targetRecords", 4);
        TARGET_RECORDS = i;
        level = parseLevel;
        if (instance.isDebugEnabled()) {
            instance.debug("-D{}: {}", "io.netty.leakDetection.level", parseLevel.name().toLowerCase());
            instance.debug("-D{}: {}", "io.netty.leakDetection.targetRecords", Integer.valueOf(i));
        }
    }

    public P(Class<?> cls, int i) {
        this(n0.simpleClassName(cls), i, Long.MAX_VALUE);
    }

    public static void addExclusions(Class cls, String... strArr) {
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length && (!hashSet.remove(declaredMethods[i].getName()) || !hashSet.isEmpty())) {
            i++;
        }
        if (hashSet.isEmpty()) {
            while (true) {
                String[] strArr2 = excludedMethods.get();
                String[] strArr3 = (String[]) Arrays.copyOf(strArr2, (strArr.length * 2) + strArr2.length);
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    int i9 = i8 * 2;
                    strArr3[strArr2.length + i9] = cls.getName();
                    strArr3[strArr2.length + i9 + 1] = strArr[i8];
                }
                AtomicReference<String[]> atomicReference = excludedMethods;
                while (true) {
                    if (!atomicReference.compareAndSet(strArr2, strArr3)) {
                        if (atomicReference.get() != strArr2) {
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Can't find '" + hashSet + "' in " + cls.getName());
        }
    }

    private void clearRefQueue() {
        while (true) {
            L l8 = (L) this.refQueue.poll();
            if (l8 != null) {
                l8.dispose();
            } else {
                return;
            }
        }
    }

    public static M getLevel() {
        return level;
    }

    public static boolean isEnabled() {
        if (getLevel().ordinal() > M.DISABLED.ordinal()) {
            return true;
        }
        return false;
    }

    private void reportLeak() {
        if (!needReport()) {
            clearRefQueue();
            return;
        }
        while (true) {
            L l8 = (L) this.refQueue.poll();
            if (l8 != null) {
                if (l8.dispose()) {
                    String reportAndClearRecords = l8.getReportAndClearRecords();
                    if (this.reportedLeaks.add(reportAndClearRecords)) {
                        if (reportAndClearRecords.isEmpty()) {
                            reportUntracedLeak(this.resourceType);
                        } else {
                            reportTracedLeak(this.resourceType, reportAndClearRecords);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    private L track0(Object obj, boolean z) {
        M m8 = level;
        if (!z && m8 != M.PARANOID && (m8 == M.DISABLED || Y.threadLocalRandom().nextInt(this.samplingInterval) != 0)) {
            return null;
        }
        reportLeak();
        return new L(obj, this.refQueue, this.allLeaks, getInitialHint(this.resourceType));
    }

    public Object getInitialHint(String str) {
        return null;
    }

    public boolean needReport() {
        return logger.isErrorEnabled();
    }

    public void reportTracedLeak(String str, String str2) {
        logger.error("LEAK: {}.release() was not called before it's garbage-collected. See https://netty.io/wiki/reference-counted-objects.html for more information.{}", str, str2);
    }

    public void reportUntracedLeak(String str) {
        logger.error("LEAK: {}.release() was not called before it's garbage-collected. Enable advanced leak reporting to find out where the leak occurred. To enable advanced leak reporting, specify the JVM option '-D{}={}' or call {}.setLevel() See https://netty.io/wiki/reference-counted-objects.html for more information.", str, "io.netty.leakDetection.level", M.ADVANCED.name().toLowerCase(), n0.simpleClassName((Object) this));
    }

    public final U track(Object obj) {
        return track0(obj, false);
    }

    public U trackForcibly(Object obj) {
        return track0(obj, true);
    }

    @Deprecated
    public P(String str, int i, long j7) {
        this.allLeaks = Collections.newSetFromMap(new ConcurrentHashMap());
        this.refQueue = new ReferenceQueue<>();
        this.reportedLeaks = Collections.newSetFromMap(new ConcurrentHashMap());
        this.resourceType = (String) B.checkNotNull(str, "resourceType");
        this.samplingInterval = i;
    }
}
