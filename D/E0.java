package D;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class E0 implements Runnable {

    /* renamed from: b0  reason: collision with root package name */
    public static final Object f763b0 = new Object();

    /* renamed from: U  reason: collision with root package name */
    public final Executor f764U;

    /* renamed from: V  reason: collision with root package name */
    public final C0047h0 f765V;

    /* renamed from: W  reason: collision with root package name */
    public final AtomicBoolean f766W = new AtomicBoolean(true);

    /* renamed from: X  reason: collision with root package name */
    public final AtomicReference f767X;

    /* renamed from: Y  reason: collision with root package name */
    public Object f768Y = f763b0;

    /* renamed from: Z  reason: collision with root package name */
    public int f769Z = -1;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f770a0 = false;

    public E0(AtomicReference atomicReference, Executor executor, C0047h0 h0Var) {
        this.f767X = atomicReference;
        this.f764U = executor;
        this.f765V = h0Var;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f766W     // Catch:{ all -> 0x000b }
            boolean r0 = r0.get()     // Catch:{ all -> 0x000b }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r2 = move-exception
            goto L_0x002e
        L_0x000d:
            int r0 = r1.f769Z     // Catch:{ all -> 0x000b }
            if (r2 > r0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x0013:
            r1.f769Z = r2     // Catch:{ all -> 0x000b }
            boolean r2 = r1.f770a0     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x001b
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x001b:
            r2 = 1
            r1.f770a0 = r2     // Catch:{ all -> 0x000b }
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            java.util.concurrent.Executor r2 = r1.f764U     // Catch:{ all -> 0x0025 }
            r2.execute(r1)     // Catch:{ all -> 0x0025 }
            goto L_0x002a
        L_0x0025:
            monitor-enter(r1)
            r2 = 0
            r1.f770a0 = r2     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
        L_0x002a:
            return
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r2
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: D.E0.a(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (j$.util.Objects.equals(r5.f768Y, r0) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r5.f768Y = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if ((r0 instanceof D.C0046h) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r3 = r5.f765V;
        ((D.C0046h) r0).getClass();
        r3.a((java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        r5.f765V.H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r2 == r5.f769Z) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r5.f766W.get() != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        r0 = r5.f767X.get();
        r2 = r5.f769Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        r5.f770a0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f766W     // Catch:{ all -> 0x000e }
            boolean r0 = r0.get()     // Catch:{ all -> 0x000e }
            r1 = 0
            if (r0 != 0) goto L_0x0010
            r5.f770a0 = r1     // Catch:{ all -> 0x000e }
            monitor-exit(r5)     // Catch:{ all -> 0x000e }
            return
        L_0x000e:
            r0 = move-exception
            goto L_0x0058
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r0 = r5.f767X     // Catch:{ all -> 0x000e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x000e }
            int r2 = r5.f769Z     // Catch:{ all -> 0x000e }
            monitor-exit(r5)     // Catch:{ all -> 0x000e }
        L_0x0019:
            java.lang.Object r3 = r5.f768Y
            boolean r3 = j$.util.Objects.equals(r3, r0)
            if (r3 != 0) goto L_0x0038
            r5.f768Y = r0
            boolean r3 = r0 instanceof D.C0046h
            if (r3 == 0) goto L_0x0033
            D.h0 r3 = r5.f765V
            D.h r0 = (D.C0046h) r0
            r4 = 0
            r0.getClass()
            r3.a(r4)
            goto L_0x0038
        L_0x0033:
            D.h0 r3 = r5.f765V
            r3.H(r0)
        L_0x0038:
            monitor-enter(r5)
            int r0 = r5.f769Z     // Catch:{ all -> 0x0050 }
            if (r2 == r0) goto L_0x0052
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f766W     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0046
            goto L_0x0052
        L_0x0046:
            java.util.concurrent.atomic.AtomicReference r0 = r5.f767X     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0050 }
            int r2 = r5.f769Z     // Catch:{ all -> 0x0050 }
            monitor-exit(r5)     // Catch:{ all -> 0x0050 }
            goto L_0x0019
        L_0x0050:
            r0 = move-exception
            goto L_0x0056
        L_0x0052:
            r5.f770a0 = r1     // Catch:{ all -> 0x0050 }
            monitor-exit(r5)     // Catch:{ all -> 0x0050 }
            return
        L_0x0056:
            monitor-exit(r5)     // Catch:{ all -> 0x0050 }
            throw r0
        L_0x0058:
            monitor-exit(r5)     // Catch:{ all -> 0x000e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D.E0.run():void");
    }
}
