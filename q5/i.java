package Q5;

import C0.e;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class i implements AutoCloseable {

    /* renamed from: I0  reason: collision with root package name */
    public static int f4144I0;

    /* renamed from: A0  reason: collision with root package name */
    public final HandlerThread f4145A0;

    /* renamed from: B0  reason: collision with root package name */
    public final boolean f4146B0;

    /* renamed from: C0  reason: collision with root package name */
    public final Object f4147C0;

    /* renamed from: D0  reason: collision with root package name */
    public volatile boolean f4148D0;

    /* renamed from: E0  reason: collision with root package name */
    public final Object f4149E0;

    /* renamed from: F0  reason: collision with root package name */
    public volatile boolean f4150F0;

    /* renamed from: G0  reason: collision with root package name */
    public volatile boolean f4151G0;

    /* renamed from: H0  reason: collision with root package name */
    public volatile boolean f4152H0;

    /* renamed from: U  reason: collision with root package name */
    public final Handler f4153U;

    /* renamed from: V  reason: collision with root package name */
    public final String f4154V;

    /* renamed from: W  reason: collision with root package name */
    public final boolean f4155W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean f4156X;

    /* renamed from: Y  reason: collision with root package name */
    public final LinkedList f4157Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f4158Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Process f4159a0;

    /* renamed from: b0  reason: collision with root package name */
    public final DataOutputStream f4160b0;

    /* renamed from: c0  reason: collision with root package name */
    public final k f4161c0;

    /* renamed from: d0  reason: collision with root package name */
    public final k f4162d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Object f4163e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f4164f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f4165g0;

    /* renamed from: h0  reason: collision with root package name */
    public ScheduledThreadPoolExecutor f4166h0;

    /* renamed from: i0  reason: collision with root package name */
    public volatile boolean f4167i0;

    /* renamed from: j0  reason: collision with root package name */
    public volatile boolean f4168j0;

    /* renamed from: k0  reason: collision with root package name */
    public volatile boolean f4169k0;

    /* renamed from: l0  reason: collision with root package name */
    public volatile boolean f4170l0;

    /* renamed from: m0  reason: collision with root package name */
    public volatile boolean f4171m0;

    /* renamed from: n0  reason: collision with root package name */
    public volatile int f4172n0;

    /* renamed from: o0  reason: collision with root package name */
    public volatile int f4173o0;
    public volatile boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Object f4174q0;

    /* renamed from: r0  reason: collision with root package name */
    public final Object f4175r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Object f4176s0;

    /* renamed from: t0  reason: collision with root package name */
    public final ArrayList f4177t0;

    /* renamed from: u0  reason: collision with root package name */
    public volatile int f4178u0;

    /* renamed from: v0  reason: collision with root package name */
    public volatile String f4179v0;

    /* renamed from: w0  reason: collision with root package name */
    public volatile String f4180w0;

    /* renamed from: x0  reason: collision with root package name */
    public volatile b f4181x0;

    /* renamed from: y0  reason: collision with root package name */
    public volatile List f4182y0;

    /* renamed from: z0  reason: collision with root package name */
    public volatile List f4183z0;

    public i(a aVar, boolean z) {
        this.f4159a0 = null;
        this.f4160b0 = null;
        this.f4161c0 = null;
        this.f4162d0 = null;
        this.f4163e0 = new Object();
        this.f4164f0 = false;
        this.f4165g0 = false;
        this.f4166h0 = null;
        this.f4167i0 = false;
        this.f4168j0 = false;
        this.f4169k0 = false;
        this.f4170l0 = true;
        this.f4171m0 = true;
        this.f4172n0 = 0;
        this.p0 = false;
        this.f4174q0 = new Object();
        this.f4175r0 = new Object();
        this.f4176s0 = new Object();
        this.f4177t0 = new ArrayList();
        this.f4178u0 = 0;
        this.f4179v0 = null;
        this.f4180w0 = null;
        this.f4181x0 = null;
        this.f4182y0 = null;
        this.f4183z0 = null;
        String str = (String) aVar.f4124c;
        this.f4154V = str;
        this.f4155W = true;
        this.f4156X = aVar.f4122a;
        LinkedList linkedList = (LinkedList) aVar.f4125d;
        this.f4157Y = linkedList;
        HashMap hashMap = (HashMap) aVar.e;
        this.f4158Z = 0;
        if (Looper.myLooper() == null || ((Handler) aVar.f4123b) != null) {
            this.f4153U = (Handler) aVar.f4123b;
        } else {
            this.f4153U = new Handler();
        }
        this.f4168j0 = true;
        this.f4169k0 = true;
        this.f4158Z = 60;
        linkedList.add(0, new b(j.f4185b, new c(this, aVar)));
        synchronized (this) {
            try {
                str.toUpperCase(Locale.ENGLISH);
                try {
                    if (hashMap.size() == 0) {
                        this.f4159a0 = Runtime.getRuntime().exec(str);
                    } else {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.putAll(System.getenv());
                        hashMap2.putAll(hashMap);
                        String[] strArr = new String[hashMap2.size()];
                        int i = 0;
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            strArr[i] = ((String) entry.getKey()) + "=" + ((String) entry.getValue());
                            i++;
                        }
                        this.f4159a0 = Runtime.getRuntime().exec(this.f4154V, strArr);
                    }
                    if (this.f4159a0 != null) {
                        c cVar = new c(this, 1);
                        this.f4160b0 = new DataOutputStream(this.f4159a0.getOutputStream());
                        StringBuilder sb = new StringBuilder();
                        String str2 = this.f4154V;
                        Locale locale = Locale.ENGLISH;
                        sb.append(str2.toUpperCase(locale));
                        sb.append("-");
                        this.f4161c0 = new k(sb.toString(), this.f4159a0.getInputStream(), new c(this, 2), cVar);
                        this.f4162d0 = new k(this.f4154V.toUpperCase(locale) + "*", this.f4159a0.getErrorStream(), new c(this, 3), cVar);
                        this.f4161c0.start();
                        this.f4162d0.start();
                        this.f4167i0 = true;
                        this.f4171m0 = false;
                        y(true);
                    } else {
                        throw new NullPointerException();
                    }
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public static void k(i iVar, String str, boolean z) {
        synchronized (iVar) {
            if (z) {
                try {
                    if (iVar.f4183z0 != null) {
                        iVar.f4183z0.add(str);
                    } else if (iVar.f4156X && iVar.f4182y0 != null) {
                        iVar.f4182y0.add(str);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            } else if (iVar.f4182y0 != null) {
                iVar.f4182y0.add(str);
            }
        }
    }

    public static void l(i iVar, String str, boolean z) {
        synchronized (iVar) {
        }
    }

    public static void m(i iVar) {
        synchronized (iVar) {
            if (iVar.f4181x0 != null && iVar.f4181x0.f4129c.equals(iVar.f4179v0) && iVar.f4181x0.f4129c.equals(iVar.f4180w0)) {
                iVar.x(iVar.f4181x0, iVar.f4178u0, iVar.f4182y0, iVar.f4183z0);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = iVar.f4166h0;
                if (scheduledThreadPoolExecutor != null) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    iVar.f4166h0 = null;
                }
                iVar.f4181x0 = null;
                iVar.f4182y0 = null;
                iVar.f4183z0 = null;
                iVar.f4170l0 = true;
                iVar.f4169k0 = false;
                iVar.y(true);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|10|11|12|5|4) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A() {
        /*
            r2 = this;
            boolean r0 = r2.u()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.f4174q0
            monitor-enter(r0)
        L_0x0009:
            boolean r1 = r2.f4170l0     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0017
            java.lang.Object r1 = r2.f4174q0     // Catch:{ InterruptedException -> 0x0015 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x0009
        L_0x0013:
            r1 = move-exception
            goto L_0x001c
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            r2.z()
            return
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.i.A():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0009 A[LOOP:0: B:4:0x0009->B:17:0x0009, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B() {
        /*
            r2 = this;
            boolean r0 = r2.u()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r2.f4176s0
            monitor-enter(r0)
        L_0x0009:
            boolean r1 = r2.f4169k0     // Catch:{ all -> 0x0013 }
            if (r1 == 0) goto L_0x0015
            java.lang.Object r1 = r2.f4176s0     // Catch:{ InterruptedException -> 0x0009 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0009 }
            goto L_0x0009
        L_0x0013:
            r1 = move-exception
            goto L_0x0017
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            goto L_0x0019
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        L_0x0019:
            boolean r0 = r2.u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.i.B():boolean");
    }

    public final synchronized boolean C() {
        return this.f4150F0;
    }

    public final void close() {
        if (!this.f4146B0) {
            q(false);
        } else if (this.f4170l0) {
            o(true);
        } else {
            this.p0 = true;
        }
    }

    public final void finalize() {
        if (this.f4146B0) {
            this.f4171m0 = true;
        }
        s();
    }

    public final synchronized void n(Object obj, e eVar) {
        this.f4157Y.add(new b(obj, eVar));
        y(true);
    }

    public final void o(boolean z) {
        if (!this.f4146B0) {
            p(z);
        } else if (z) {
            synchronized (this.f4149E0) {
                try {
                    if (!this.f4150F0) {
                        HashMap hashMap = f.f4138a;
                        this.f4151G0 = false;
                        f.b((i) null);
                    }
                    if (this.f4152H0) {
                        p(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            synchronized (this.f4149E0) {
                try {
                    if (!this.f4150F0) {
                        this.f4150F0 = true;
                        f.a(this);
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            p(false);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:38|39|(1:41)|42|(1:44)|45|(1:49)|50|(1:52)|53|54|56) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        if (u() != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002c, code lost:
        w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        if (r4 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.f4160b0.write("exit\n".getBytes("UTF-8"));
        r3.f4160b0.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0053, code lost:
        if (r4.getMessage().contains("EPIPE") == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        if (r4.getMessage().contains("Stream closed") != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0063, code lost:
        r3.f4159a0.waitFor();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r3.f4160b0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4 = java.lang.Thread.currentThread();
        r1 = r3.f4161c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r4 != r1) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0075, code lost:
        r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0078, code lost:
        r4 = java.lang.Thread.currentThread();
        r1 = r3.f4162d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007e, code lost:
        if (r4 != r1) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0080, code lost:
        r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0093, code lost:
        r3.f4161c0.join();
        r3.f4162d0.join();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009d, code lost:
        r4 = r3.f4166h0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009f, code lost:
        if (r4 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a1, code lost:
        r4.shutdownNow();
        r3.f4166h0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a6, code lost:
        r3.f4159a0.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ab, code lost:
        r3.f4154V.toUpperCase(java.util.Locale.ENGLISH);
        w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b5, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x006d */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[ExcHandler: InterruptedException (unused java.lang.InterruptedException), SYNTHETIC, Splitter:B:28:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(boolean r4) {
        /*
            r3 = this;
            java.io.DataOutputStream r4 = r3.f4160b0
            r0 = 0
            if (r4 == 0) goto L_0x00b8
            Q5.k r4 = r3.f4161c0
            if (r4 == 0) goto L_0x00b8
            Q5.k r4 = r3.f4162d0
            if (r4 == 0) goto L_0x00b8
            java.lang.Process r4 = r3.f4159a0
            if (r4 == 0) goto L_0x00b8
            boolean r4 = r3.t()
            monitor-enter(r3)
            boolean r1 = r3.f4167i0     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001f
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x00b6
        L_0x001f:
            r1 = 0
            r3.f4167i0 = r1     // Catch:{ all -> 0x001c }
            r1 = 1
            r3.f4171m0 = r1     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            boolean r1 = r3.u()
            if (r1 != 0) goto L_0x0030
            r3.w()
            return
        L_0x0030:
            if (r4 != 0) goto L_0x0035
            r3.A()
        L_0x0035:
            java.io.DataOutputStream r4 = r3.f4160b0     // Catch:{ IOException -> 0x0048 }
            java.lang.String r1 = "exit\n"
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch:{ IOException -> 0x0048 }
            r4.write(r1)     // Catch:{ IOException -> 0x0048 }
            java.io.DataOutputStream r4 = r3.f4160b0     // Catch:{ IOException -> 0x0048 }
            r4.flush()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0063
        L_0x0048:
            r4 = move-exception
            java.lang.String r1 = r4.getMessage()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            java.lang.String r2 = "EPIPE"
            boolean r1 = r1.contains(r2)     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            if (r1 != 0) goto L_0x0063
            java.lang.String r1 = r4.getMessage()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            java.lang.String r2 = "Stream closed"
            boolean r1 = r1.contains(r2)     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            if (r1 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            throw r4     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
        L_0x0063:
            java.lang.Process r4 = r3.f4159a0     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            r4.waitFor()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            java.io.DataOutputStream r4 = r3.f4160b0     // Catch:{ IOException -> 0x006d }
            r4.close()     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            Q5.k r1 = r3.f4161c0     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            if (r4 == r1) goto L_0x0078
            r1.a()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
        L_0x0078:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            Q5.k r1 = r3.f4162d0     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            if (r4 == r1) goto L_0x0083
            r1.a()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
        L_0x0083:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            Q5.k r1 = r3.f4161c0     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            if (r4 == r1) goto L_0x009d
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            Q5.k r1 = r3.f4162d0     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            if (r4 == r1) goto L_0x009d
            Q5.k r4 = r3.f4161c0     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            r4.join()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            Q5.k r4 = r3.f4162d0     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            r4.join()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
        L_0x009d:
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r3.f4166h0     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            if (r4 == 0) goto L_0x00a6
            r4.shutdownNow()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            r3.f4166h0 = r0     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
        L_0x00a6:
            java.lang.Process r4 = r3.f4159a0     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
            r4.destroy()     // Catch:{ InterruptedException -> 0x00ab, InterruptedException -> 0x00ab }
        L_0x00ab:
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.String r0 = r3.f4154V
            r0.toUpperCase(r4)
            r3.w()
            return
        L_0x00b6:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        L_0x00b8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.i.p(boolean):void");
    }

    public final void q(boolean z) {
        if (this.f4146B0) {
            synchronized (this.f4149E0) {
                try {
                    if (!this.f4150F0) {
                        this.f4150F0 = true;
                        f.a(this);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (z) {
                this.f4152H0 = true;
            }
        }
        if (this.f4170l0) {
            o(true);
        } else {
            this.p0 = true;
        }
    }

    public final void r() {
        synchronized (this.f4175r0) {
            try {
                this.f4172n0--;
                if (this.f4172n0 == 0) {
                    this.f4175r0.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        super.finalize();
    }

    public final synchronized boolean t() {
        if (!u()) {
            this.f4170l0 = true;
            this.f4169k0 = false;
            synchronized (this.f4174q0) {
                this.f4174q0.notifyAll();
            }
            if (this.f4168j0 && !this.f4169k0) {
                this.f4168j0 = this.f4169k0;
                synchronized (this.f4176s0) {
                    this.f4176s0.notifyAll();
                }
            }
        }
        return this.f4170l0;
    }

    public final boolean u() {
        Process process = this.f4159a0;
        if (process == null) {
            return false;
        }
        try {
            process.exitValue();
            return false;
        } catch (IllegalThreadStateException unused) {
            return true;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final synchronized void v() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.io.DataOutputStream r0 = r3.f4160b0     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x004a
            java.lang.Process r0 = r3.f4159a0     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x004a
            r0 = 0
            r3.f4167i0 = r0     // Catch:{ all -> 0x0015 }
            r1 = 1
            r3.f4171m0 = r1     // Catch:{ all -> 0x0015 }
            java.io.DataOutputStream r2 = r3.f4160b0     // Catch:{ IOException -> 0x0017 }
            r2.close()     // Catch:{ IOException -> 0x0017 }
            goto L_0x0017
        L_0x0015:
            r0 = move-exception
            goto L_0x0050
        L_0x0017:
            java.lang.Process r2 = r3.f4159a0     // Catch:{ Exception -> 0x001c }
            r2.destroy()     // Catch:{ Exception -> 0x001c }
        L_0x001c:
            r3.f4170l0 = r1     // Catch:{ all -> 0x0015 }
            r3.f4169k0 = r0     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r3.f4174q0     // Catch:{ all -> 0x0015 }
            monitor-enter(r0)     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r3.f4174q0     // Catch:{ all -> 0x0047 }
            r1.notifyAll()     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            boolean r0 = r3.f4168j0     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0042
            boolean r0 = r3.f4169k0     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0042
            boolean r0 = r3.f4169k0     // Catch:{ all -> 0x0015 }
            r3.f4168j0 = r0     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r3.f4176s0     // Catch:{ all -> 0x0015 }
            monitor-enter(r0)     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r3.f4176s0     // Catch:{ all -> 0x003f }
            r1.notifyAll()     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0042
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1     // Catch:{ all -> 0x0015 }
        L_0x0042:
            r3.w()     // Catch:{ all -> 0x0015 }
            monitor-exit(r3)
            return
        L_0x0047:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r1     // Catch:{ all -> 0x0015 }
        L_0x004a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0015 }
            r0.<init>()     // Catch:{ all -> 0x0015 }
            throw r0     // Catch:{ all -> 0x0015 }
        L_0x0050:
            monitor-exit(r3)     // Catch:{ all -> 0x0015 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.i.v():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002c, code lost:
        if (r3.f4145A0.isAlive() != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002f, code lost:
        r3.f4153U.post(new C0.e(10, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w() {
        /*
            r3 = this;
            boolean r0 = r3.f4146B0
            r1 = 1
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r3.f4149E0
            monitor-enter(r0)
            boolean r2 = r3.f4150F0     // Catch:{ all -> 0x0012 }
            if (r2 != 0) goto L_0x0014
            r3.f4150F0 = r1     // Catch:{ all -> 0x0012 }
            Q5.f.a(r3)     // Catch:{ all -> 0x0012 }
            goto L_0x0014
        L_0x0012:
            r1 = move-exception
            goto L_0x0016
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            goto L_0x0018
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r1
        L_0x0018:
            java.lang.Object r0 = r3.f4147C0
            monitor-enter(r0)
            boolean r2 = r3.f4148D0     // Catch:{ all -> 0x0021 }
            if (r2 == 0) goto L_0x0023
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            goto L_0x003c
        L_0x0023:
            r3.f4148D0 = r1     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            android.os.HandlerThread r0 = r3.f4145A0
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L_0x002f
            return
        L_0x002f:
            android.os.Handler r0 = r3.f4153U
            C0.e r1 = new C0.e
            r2 = 10
            r1.<init>(r2, r3)
            r0.post(r1)
            return
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.i.w():void");
    }

    public final boolean x(b bVar, int i, List list, List list2) {
        bVar.getClass();
        e eVar = bVar.f4128b;
        if (eVar == null) {
            return true;
        }
        Handler handler = this.f4153U;
        if (handler == null || bVar.f4127a == j.f4185b) {
            ArrayList arrayList = this.f4177t0;
            if (list == null) {
                list = arrayList;
            }
            if (list2 == null) {
                list2 = arrayList;
            }
            eVar.b(i, list, list2);
            return true;
        }
        synchronized (this.f4175r0) {
            this.f4172n0++;
        }
        handler.post(new d(this, bVar, i, list, list2));
        return false;
    }

    public final void y(boolean z) {
        boolean u3 = u();
        if (!u3 || this.f4171m0) {
            this.f4170l0 = true;
            this.f4169k0 = false;
        }
        if (u3 && !this.f4171m0 && this.f4170l0 && this.f4157Y.size() > 0) {
            b bVar = (b) this.f4157Y.get(0);
            this.f4157Y.remove(0);
            this.f4182y0 = null;
            this.f4183z0 = null;
            this.f4178u0 = 0;
            this.f4179v0 = null;
            this.f4180w0 = null;
            if (bVar.f4127a.length <= 0) {
                y(false);
            } else if (!(this.f4160b0 == null || this.f4161c0 == null)) {
                try {
                    if (bVar.f4128b != null) {
                        this.f4182y0 = DesugarCollections.synchronizedList(new ArrayList());
                        this.f4183z0 = DesugarCollections.synchronizedList(new ArrayList());
                    }
                    this.f4170l0 = false;
                    this.f4181x0 = bVar;
                    this.f4161c0.a();
                    if (this.f4158Z != 0) {
                        this.f4173o0 = 0;
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                        this.f4166h0 = scheduledThreadPoolExecutor;
                        scheduledThreadPoolExecutor.scheduleAtFixedRate(new e(9, this), 1, 1, TimeUnit.SECONDS);
                    }
                    for (String str : bVar.f4127a) {
                        this.f4154V.toUpperCase(Locale.ENGLISH);
                        DataOutputStream dataOutputStream = this.f4160b0;
                        dataOutputStream.write((str + "\n").getBytes("UTF-8"));
                    }
                    this.f4160b0.write(("echo " + bVar.f4129c + " $?\n").getBytes("UTF-8"));
                    this.f4160b0.write(("echo " + bVar.f4129c + " >&2\n").getBytes("UTF-8"));
                    this.f4160b0.flush();
                } catch (IOException unused) {
                }
            }
        } else if (!u3 || this.f4171m0) {
            this.f4154V.toUpperCase(Locale.ENGLISH);
            while (this.f4157Y.size() > 0) {
                x((b) this.f4157Y.remove(0), -2, (List) null, (List) null);
            }
            w();
        }
        if (this.f4170l0) {
            if (u3 && this.p0) {
                this.p0 = false;
                o(true);
            }
            if (z) {
                synchronized (this.f4174q0) {
                    this.f4174q0.notifyAll();
                }
            }
        }
        if (this.f4168j0 && !this.f4169k0) {
            this.f4168j0 = this.f4169k0;
            synchronized (this.f4176s0) {
                this.f4176s0.notifyAll();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean z() {
        /*
            r2 = this;
            android.os.Handler r0 = r2.f4153U
            if (r0 == 0) goto L_0x002c
            android.os.Looper r0 = r0.getLooper()
            if (r0 == 0) goto L_0x002c
            android.os.Handler r0 = r2.f4153U
            android.os.Looper r0 = r0.getLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 == r1) goto L_0x002c
            java.lang.Object r0 = r2.f4175r0
            monitor-enter(r0)
        L_0x0019:
            int r1 = r2.f4172n0     // Catch:{ all -> 0x0023 }
            if (r1 <= 0) goto L_0x0028
            java.lang.Object r1 = r2.f4175r0     // Catch:{ InterruptedException -> 0x0025 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0025 }
            goto L_0x0019
        L_0x0023:
            r1 = move-exception
            goto L_0x002a
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            r0 = 0
            return r0
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            goto L_0x002c
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        L_0x002c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.i.z():boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(a aVar) {
        this(aVar, false);
        int i;
        StringBuilder sb = new StringBuilder("Shell.Threaded#");
        synchronized (i.class) {
            i = f4144I0;
            f4144I0 = i + 1;
        }
        sb.append(i);
        HandlerThread handlerThread = new HandlerThread(sb.toString());
        handlerThread.start();
        aVar.f4123b = new Handler(handlerThread.getLooper());
        this.f4147C0 = new Object();
        this.f4148D0 = false;
        this.f4149E0 = new Object();
        this.f4150F0 = false;
        this.f4151G0 = true;
        this.f4152H0 = false;
        this.f4145A0 = (HandlerThread) this.f4153U.getLooper().getThread();
        this.f4146B0 = true;
    }
}
