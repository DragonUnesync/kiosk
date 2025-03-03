package g6;

import h6.C1082c;
import h6.d;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class w0 extends Random {
    private static volatile long initialSeedUniquifier;
    /* access modifiers changed from: private */
    public static final C1082c logger = d.getInstance((Class<?>) w0.class);
    /* access modifiers changed from: private */
    public static volatile long seedGeneratorEndTime;
    private static final long seedGeneratorStartTime;
    private static final Thread seedGeneratorThread;
    /* access modifiers changed from: private */
    public static final BlockingQueue<Long> seedQueue;
    private static final AtomicLong seedUniquifier = new AtomicLong();
    boolean initialized = true;
    private long rnd;

    static {
        initialSeedUniquifier = p0.getLong("io.netty.initialSeedUniquifier", 0);
        if (initialSeedUniquifier != 0) {
            seedGeneratorThread = null;
            seedQueue = null;
            seedGeneratorStartTime = 0;
        } else if (p0.getBoolean("java.util.secureRandomSeed", false)) {
            seedQueue = new LinkedBlockingQueue();
            seedGeneratorStartTime = System.nanoTime();
            u0 u0Var = new u0("initialSeedUniquifierGenerator");
            seedGeneratorThread = u0Var;
            u0Var.setDaemon(true);
            u0Var.setUncaughtExceptionHandler(new v0());
            u0Var.start();
        } else {
            initialSeedUniquifier = mix64(System.currentTimeMillis()) ^ mix64(System.nanoTime());
            seedGeneratorThread = null;
            seedQueue = null;
            seedGeneratorStartTime = 0;
        }
    }

    public w0() {
        super(newSeed());
    }

    public static w0 current() {
        return C0980m.get().random();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        seedGeneratorThread.interrupt();
        logger.warn("Failed to generate a seed from SecureRandom within {} seconds. Not enough entropy?", (java.lang.Object) 3L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getInitialSeedUniquifier() {
        /*
            long r0 = initialSeedUniquifier
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.Class<g6.w0> r0 = g6.w0.class
            monitor-enter(r0)
            long r4 = initialSeedUniquifier     // Catch:{ all -> 0x0014 }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            return r4
        L_0x0014:
            r1 = move-exception
            goto L_0x008f
        L_0x0017:
            long r6 = seedGeneratorStartTime     // Catch:{ all -> 0x0014 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0014 }
            r8 = 3
            long r10 = r1.toNanos(r8)     // Catch:{ all -> 0x0014 }
            long r6 = r6 + r10
        L_0x0022:
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0014 }
            long r10 = r6 - r10
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0035
            java.util.concurrent.BlockingQueue<java.lang.Long> r10 = seedQueue     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Object r10 = r10.poll()     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x003f
        L_0x0035:
            java.util.concurrent.BlockingQueue<java.lang.Long> r12 = seedQueue     // Catch:{ InterruptedException -> 0x005a }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Object r10 = r12.poll(r10, r13)     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ InterruptedException -> 0x005a }
        L_0x003f:
            r11 = 0
            if (r10 == 0) goto L_0x0047
            long r4 = r10.longValue()     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0062
        L_0x0047:
            if (r1 > 0) goto L_0x0022
            java.lang.Thread r1 = seedGeneratorThread     // Catch:{ all -> 0x0014 }
            r1.interrupt()     // Catch:{ all -> 0x0014 }
            h6.c r1 = logger     // Catch:{ all -> 0x0014 }
            java.lang.String r6 = "Failed to generate a seed from SecureRandom within {} seconds. Not enough entropy?"
            java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0014 }
            r1.warn((java.lang.String) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x0014 }
            goto L_0x0062
        L_0x005a:
            h6.c r1 = logger     // Catch:{ all -> 0x0014 }
            java.lang.String r6 = "Failed to generate a seed from SecureRandom due to an InterruptedException."
            r1.warn((java.lang.String) r6)     // Catch:{ all -> 0x0014 }
            r11 = 1
        L_0x0062:
            r6 = 3627065505421648153(0x3255ecdc33bae119, double:3.253008663204319E-66)
            long r4 = r4 ^ r6
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0014 }
            long r6 = java.lang.Long.reverse(r6)     // Catch:{ all -> 0x0014 }
            long r4 = r4 ^ r6
            initialSeedUniquifier = r4     // Catch:{ all -> 0x0014 }
            if (r11 == 0) goto L_0x0081
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0014 }
            r1.interrupt()     // Catch:{ all -> 0x0014 }
            java.lang.Thread r1 = seedGeneratorThread     // Catch:{ all -> 0x0014 }
            r1.interrupt()     // Catch:{ all -> 0x0014 }
        L_0x0081:
            long r6 = seedGeneratorEndTime     // Catch:{ all -> 0x0014 }
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x008d
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0014 }
            seedGeneratorEndTime = r1     // Catch:{ all -> 0x0014 }
        L_0x008d:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            return r4
        L_0x008f:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.w0.getInitialSeedUniquifier():long");
    }

    private static long mix64(long j7) {
        long j8 = (j7 ^ (j7 >>> 33)) * -49064778989728563L;
        long j9 = (j8 ^ (j8 >>> 33)) * -4265267296055464877L;
        return j9 ^ (j9 >>> 33);
    }

    private static long newSeed() {
        AtomicLong atomicLong;
        long j7;
        int i;
        long j8;
        long j9;
        do {
            atomicLong = seedUniquifier;
            j7 = atomicLong.get();
            i = (j7 > 0 ? 1 : (j7 == 0 ? 0 : -1));
            if (i != 0) {
                j8 = j7;
            } else {
                j8 = getInitialSeedUniquifier();
            }
            j9 = 181783497276652981L * j8;
        } while (!atomicLong.compareAndSet(j7, j9));
        if (i == 0) {
            C1082c cVar = logger;
            if (cVar.isDebugEnabled()) {
                if (seedGeneratorEndTime != 0) {
                    cVar.debug(String.format("-Dio.netty.initialSeedUniquifier: 0x%016x (took %d ms)", new Object[]{Long.valueOf(j8), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(seedGeneratorEndTime - seedGeneratorStartTime))}));
                } else {
                    cVar.debug(String.format("-Dio.netty.initialSeedUniquifier: 0x%016x", new Object[]{Long.valueOf(j8)}));
                }
            }
        }
        return System.nanoTime() ^ j9;
    }

    public int next(int i) {
        long j7 = ((this.rnd * 25214903917L) + 11) & 281474976710655L;
        this.rnd = j7;
        return (int) (j7 >>> (48 - i));
    }

    public double nextDouble(double d8) {
        B.checkPositive(d8, "n");
        return nextDouble() * d8;
    }

    public int nextInt(int i, int i8) {
        if (i < i8) {
            return nextInt(i8 - i) + i;
        }
        throw new IllegalArgumentException();
    }

    public long nextLong(long j7) {
        B.checkPositive(j7, "n");
        long j8 = 0;
        while (j7 >= 2147483647L) {
            int next = next(2);
            long j9 = j7 >>> 1;
            if ((next & 2) != 0) {
                j9 = j7 - j9;
            }
            if ((next & 1) == 0) {
                j8 = (j7 - j9) + j8;
            }
            j7 = j9;
        }
        return j8 + ((long) nextInt((int) j7));
    }

    public void setSeed(long j7) {
        if (!this.initialized) {
            this.rnd = (j7 ^ 25214903917L) & 281474976710655L;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public double nextDouble(double d8, double d9) {
        if (d8 < d9) {
            return ((d9 - d8) * nextDouble()) + d8;
        }
        throw new IllegalArgumentException();
    }

    public long nextLong(long j7, long j8) {
        if (j7 < j8) {
            return nextLong(j8 - j7) + j7;
        }
        throw new IllegalArgumentException();
    }
}
