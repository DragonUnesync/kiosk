package a0;

import L3.b;
import N.e;
import com.bumptech.glide.c;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class i implements b {

    /* renamed from: X  reason: collision with root package name */
    public static final boolean f7004X = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: Y  reason: collision with root package name */
    public static final Logger f7005Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final c f7006Z;

    /* renamed from: a0  reason: collision with root package name */
    public static final Object f7007a0 = new Object();

    /* renamed from: U  reason: collision with root package name */
    public volatile Object f7008U;

    /* renamed from: V  reason: collision with root package name */
    public volatile d f7009V;

    /* renamed from: W  reason: collision with root package name */
    public volatile h f7010W;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: a0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: a0.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: a0.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<a0.h> r0 = a0.h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f7004X = r1
            java.lang.Class<a0.i> r1 = a0.i.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f7005Y = r2
            a0.e r2 = new a0.e     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "W"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<a0.d> r0 = a0.d.class
            java.lang.String r3 = "V"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r3 = "U"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            r0 = 0
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            a0.g r2 = new a0.g
            r2.<init>()
        L_0x004e:
            f7006Z = r2
            if (r0 == 0) goto L_0x005b
            java.util.logging.Logger r1 = f7005Y
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f7007a0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.i.<clinit>():void");
    }

    public static void b(i iVar) {
        h hVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            hVar = iVar.f7010W;
        } while (!f7006Z.f(iVar, hVar, h.f7001c));
        while (true) {
            dVar = null;
            if (hVar == null) {
                break;
            }
            Thread thread = hVar.f7002a;
            if (thread != null) {
                hVar.f7002a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f7003b;
        }
        do {
            dVar2 = iVar.f7009V;
        } while (!f7006Z.d(iVar, dVar2, d.f6992d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f6995c;
            dVar.f6995c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f6995c;
            Runnable runnable = dVar3.f6993a;
            if (!(runnable instanceof f)) {
                c(runnable, dVar3.f6994b);
                dVar3 = dVar4;
            } else {
                runnable.getClass();
                throw new ClassCastException();
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            f7005Y.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof C0409a) {
            CancellationException cancellationException = ((C0409a) obj).f6989a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f6991a);
        } else if (obj == f7007a0) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object f(i iVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = iVar.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        String str;
        try {
            Object f8 = f(this);
            sb.append("SUCCESS, result=[");
            if (f8 == this) {
                str = "this future";
            } else {
                str = String.valueOf(f8);
            }
            sb.append(str);
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final boolean cancel(boolean z) {
        C0409a aVar;
        Object obj = this.f7008U;
        if (obj != null) {
            return false;
        }
        if (f7004X) {
            aVar = new C0409a(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            aVar = C0409a.f6987b;
        } else {
            aVar = C0409a.f6988c;
        }
        if (!f7006Z.e(this, obj, aVar)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f7009V;
        d dVar2 = d.f6992d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f6995c = dVar;
                if (!f7006Z.d(this, dVar, dVar3)) {
                    dVar = this.f7009V;
                } else {
                    return;
                }
            } while (dVar != dVar2);
        }
        c(runnable, executor);
    }

    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final Object get(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        if (!Thread.interrupted()) {
            Object obj = this.f7008U;
            if (obj != null) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.f7010W;
                h hVar2 = h.f7001c;
                if (hVar != hVar2) {
                    h hVar3 = new h();
                    do {
                        c cVar = f7006Z;
                        cVar.t(hVar3, hVar);
                        if (cVar.f(this, hVar, hVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f7008U;
                                    if (obj2 != null) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    h(hVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(hVar3);
                        } else {
                            hVar = this.f7010W;
                        }
                    } while (hVar != hVar2);
                }
                return e(this.f7008U);
            }
            while (nanos > 0) {
                Object obj3 = this.f7008U;
                if (obj3 != null) {
                    return e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String iVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String x8 = e.x(str, " (plus ");
                long j8 = -nanos;
                long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
                long nanos2 = j8 - timeUnit.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str2 = x8 + convert + " " + lowerCase;
                    if (z) {
                        str2 = e.x(str2, ",");
                    }
                    x8 = e.x(str2, " ");
                }
                if (z) {
                    x8 = x8 + nanos2 + " nanoseconds ";
                }
                str = e.x(x8, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(e.x(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + iVar);
        }
        throw new InterruptedException();
    }

    public final void h(h hVar) {
        hVar.f7002a = null;
        while (true) {
            h hVar2 = this.f7010W;
            if (hVar2 != h.f7001c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f7003b;
                    if (hVar2.f7002a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f7003b = hVar4;
                        if (hVar3.f7002a == null) {
                        }
                    } else if (!f7006Z.f(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean i(Throwable th) {
        th.getClass();
        if (!f7006Z.e(this, (Object) null, new c(th))) {
            return false;
        }
        b(this);
        return true;
    }

    public final boolean isCancelled() {
        return this.f7008U instanceof C0409a;
    }

    public final boolean isDone() {
        if (this.f7008U != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f7008U instanceof C0409a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = g();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7008U;
            if (obj2 != null) {
                return e(obj2);
            }
            h hVar = this.f7010W;
            h hVar2 = h.f7001c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    c cVar = f7006Z;
                    cVar.t(hVar3, hVar);
                    if (cVar.f(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7008U;
                            } else {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    hVar = this.f7010W;
                } while (hVar != hVar2);
            }
            return e(this.f7008U);
        }
        throw new InterruptedException();
    }
}
