package f6;

import g6.B;
import g6.n0;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import u.C1477r;

/* renamed from: f6.s  reason: case insensitive filesystem */
public final class C0928s implements ThreadFactory {
    private static final AtomicInteger poolId = new AtomicInteger();
    private final boolean daemon;
    private final AtomicInteger nextId;
    private final String prefix;
    private final int priority;
    protected final ThreadGroup threadGroup;

    public C0928s(Class<?> cls, int i) {
        this(cls, false, i);
    }

    public static String toPoolName(Class<?> cls) {
        B.checkNotNull(cls, "poolType");
        String simpleClassName = n0.simpleClassName(cls);
        int length = simpleClassName.length();
        if (length == 0) {
            return "unknown";
        }
        if (length == 1) {
            return simpleClassName.toLowerCase(Locale.US);
        }
        if (!Character.isUpperCase(simpleClassName.charAt(0)) || !Character.isLowerCase(simpleClassName.charAt(1))) {
            return simpleClassName;
        }
        return Character.toLowerCase(simpleClassName.charAt(0)) + simpleClassName.substring(1);
    }

    public Thread newThread(Runnable runnable) {
        Runnable wrap = C0935z.wrap(runnable);
        Thread newThread = newThread(wrap, this.prefix + this.nextId.incrementAndGet());
        try {
            boolean isDaemon = newThread.isDaemon();
            boolean z = this.daemon;
            if (isDaemon != z) {
                newThread.setDaemon(z);
            }
            int priority2 = newThread.getPriority();
            int i = this.priority;
            if (priority2 != i) {
                newThread.setPriority(i);
            }
        } catch (Exception unused) {
        }
        return newThread;
    }

    public C0928s(String str, int i) {
        this(str, false, i);
    }

    public C0928s(Class<?> cls, boolean z, int i) {
        this(toPoolName(cls), z, i);
    }

    public C0928s(String str, boolean z, int i, ThreadGroup threadGroup2) {
        this.nextId = new AtomicInteger();
        B.checkNotNull(str, "poolName");
        if (i < 1 || i > 10) {
            throw new IllegalArgumentException(C1477r.c(i, "priority: ", " (expected: Thread.MIN_PRIORITY <= priority <= Thread.MAX_PRIORITY)"));
        }
        this.prefix = str + '-' + poolId.incrementAndGet() + '-';
        this.daemon = z;
        this.priority = i;
        this.threadGroup = threadGroup2;
    }

    public Thread newThread(Runnable runnable, String str) {
        return new C0908A(this.threadGroup, runnable, str);
    }

    public C0928s(String str, boolean z, int i) {
        this(str, z, i, (ThreadGroup) null);
    }
}
