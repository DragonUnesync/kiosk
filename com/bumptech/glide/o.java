package com.bumptech.glide;

import D2.n;
import O2.c;
import S2.a;
import S2.e;
import W2.m;
import a1.C0410a;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.g;
import com.bumptech.glide.manager.h;
import com.bumptech.glide.manager.q;
import com.bumptech.glide.manager.r;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class o implements ComponentCallbacks2, h {

    /* renamed from: e0  reason: collision with root package name */
    public static final e f9086e0 = ((e) ((e) new a().d(Bitmap.class)).j());

    /* renamed from: U  reason: collision with root package name */
    public final b f9087U;

    /* renamed from: V  reason: collision with root package name */
    public final Context f9088V;

    /* renamed from: W  reason: collision with root package name */
    public final g f9089W;

    /* renamed from: X  reason: collision with root package name */
    public final q f9090X;

    /* renamed from: Y  reason: collision with root package name */
    public final C0410a f9091Y;

    /* renamed from: Z  reason: collision with root package name */
    public final r f9092Z = new r();

    /* renamed from: a0  reason: collision with root package name */
    public final C0.e f9093a0;

    /* renamed from: b0  reason: collision with root package name */
    public final b f9094b0;

    /* renamed from: c0  reason: collision with root package name */
    public final CopyOnWriteArrayList f9095c0;

    /* renamed from: d0  reason: collision with root package name */
    public e f9096d0;

    static {
        e eVar = (e) ((e) new a().d(c.class)).j();
        e eVar2 = (e) ((e) ((e) new a().e(n.f1133c)).q()).u(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.bumptech.glide.manager.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.bumptech.glide.manager.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.bumptech.glide.manager.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(com.bumptech.glide.b r7, com.bumptech.glide.manager.g r8, a1.C0410a r9, android.content.Context r10) {
        /*
            r6 = this;
            com.bumptech.glide.manager.q r0 = new com.bumptech.glide.manager.q
            r1 = 7
            r0.<init>((int) r1)
            a1.a r1 = r7.f8975a0
            r6.<init>()
            com.bumptech.glide.manager.r r2 = new com.bumptech.glide.manager.r
            r2.<init>()
            r6.f9092Z = r2
            C0.e r2 = new C0.e
            r3 = 17
            r2.<init>(r3, r6)
            r6.f9093a0 = r2
            r6.f9087U = r7
            r6.f9089W = r8
            r6.f9091Y = r9
            r6.f9090X = r0
            r6.f9088V = r10
            android.content.Context r9 = r10.getApplicationContext()
            com.bumptech.glide.n r10 = new com.bumptech.glide.n
            r10.<init>(r6, r0)
            r1.getClass()
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = j0.f.a(r9, r0)
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            java.lang.String r4 = "ConnectivityMonitor"
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r4, r5)
            if (r5 == 0) goto L_0x0051
            if (r0 == 0) goto L_0x004c
            java.lang.String r5 = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"
            goto L_0x004e
        L_0x004c:
            java.lang.String r5 = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"
        L_0x004e:
            android.util.Log.d(r4, r5)
        L_0x0051:
            if (r0 == 0) goto L_0x0059
            com.bumptech.glide.manager.c r0 = new com.bumptech.glide.manager.c
            r0.<init>(r9, r10)
            goto L_0x005e
        L_0x0059:
            com.bumptech.glide.manager.j r0 = new com.bumptech.glide.manager.j
            r0.<init>()
        L_0x005e:
            r6.f9094b0 = r0
            java.util.ArrayList r9 = r7.f8976b0
            monitor-enter(r9)
            java.util.ArrayList r10 = r7.f8976b0     // Catch:{ all -> 0x00a3 }
            boolean r10 = r10.contains(r6)     // Catch:{ all -> 0x00a3 }
            if (r10 != 0) goto L_0x00a5
            java.util.ArrayList r10 = r7.f8976b0     // Catch:{ all -> 0x00a3 }
            r10.add(r6)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r9)     // Catch:{ all -> 0x00a3 }
            char[] r9 = W2.m.f6173a
            android.os.Looper r9 = android.os.Looper.myLooper()
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            if (r9 != r10) goto L_0x007e
            r1 = 1
        L_0x007e:
            if (r1 != 0) goto L_0x0088
            android.os.Handler r9 = W2.m.f()
            r9.post(r2)
            goto L_0x008b
        L_0x0088:
            r8.a(r6)
        L_0x008b:
            r8.a(r0)
            java.util.concurrent.CopyOnWriteArrayList r8 = new java.util.concurrent.CopyOnWriteArrayList
            com.bumptech.glide.e r9 = r7.f8972X
            java.util.List r9 = r9.e
            r8.<init>(r9)
            r6.f9095c0 = r8
            com.bumptech.glide.e r7 = r7.f8972X
            S2.e r7 = r7.a()
            r6.r(r7)
            return
        L_0x00a3:
            r7 = move-exception
            goto L_0x00ad
        L_0x00a5:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a3 }
            java.lang.String r8 = "Cannot register already registered manager"
            r7.<init>(r8)     // Catch:{ all -> 0x00a3 }
            throw r7     // Catch:{ all -> 0x00a3 }
        L_0x00ad:
            monitor-exit(r9)     // Catch:{ all -> 0x00a3 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.o.<init>(com.bumptech.glide.b, com.bumptech.glide.manager.g, a1.a, android.content.Context):void");
    }

    public final synchronized void c() {
        this.f9092Z.c();
        p();
    }

    public final synchronized void j() {
        q();
        this.f9092Z.j();
    }

    public final synchronized void k() {
        this.f9092Z.k();
        o();
        q qVar = this.f9090X;
        Iterator it = m.e((Set) qVar.f9081W).iterator();
        while (it.hasNext()) {
            qVar.e((S2.c) it.next());
        }
        ((HashSet) qVar.f9082X).clear();
        this.f9089W.b(this);
        this.f9089W.b(this.f9094b0);
        m.f().removeCallbacks(this.f9093a0);
        this.f9087U.c(this);
    }

    public l l(Class cls) {
        return new l(this.f9087U, this, cls, this.f9088V);
    }

    public l m() {
        return l(Bitmap.class).a(f9086e0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        r5.a((S2.c) null);
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(T2.g r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r4.s(r5)
            S2.c r1 = r5.f()
            if (r0 != 0) goto L_0x003b
            com.bumptech.glide.b r0 = r4.f9087U
            java.util.ArrayList r2 = r0.f8976b0
            monitor-enter(r2)
            java.util.ArrayList r0 = r0.f8976b0     // Catch:{ all -> 0x002c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002c }
        L_0x0018:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x002e
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x002c }
            com.bumptech.glide.o r3 = (com.bumptech.glide.o) r3     // Catch:{ all -> 0x002c }
            boolean r3 = r3.s(r5)     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            goto L_0x003b
        L_0x002c:
            r5 = move-exception
            goto L_0x0039
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x003b
            r0 = 0
            r5.a(r0)
            r1.clear()
            goto L_0x003b
        L_0x0039:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r5
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.o.n(T2.g):void");
    }

    public final synchronized void o() {
        try {
            Iterator it = m.e(this.f9092Z.f9083U).iterator();
            while (it.hasNext()) {
                n((T2.g) it.next());
            }
            this.f9092Z.f9083U.clear();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
    }

    public final synchronized void p() {
        q qVar = this.f9090X;
        qVar.f9080V = true;
        Iterator it = m.e((Set) qVar.f9081W).iterator();
        while (it.hasNext()) {
            S2.c cVar = (S2.c) it.next();
            if (cVar.isRunning()) {
                cVar.g();
                ((HashSet) qVar.f9082X).add(cVar);
            }
        }
    }

    public final synchronized void q() {
        q qVar = this.f9090X;
        qVar.f9080V = false;
        Iterator it = m.e((Set) qVar.f9081W).iterator();
        while (it.hasNext()) {
            S2.c cVar = (S2.c) it.next();
            if (!cVar.k() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        ((HashSet) qVar.f9082X).clear();
    }

    public synchronized void r(e eVar) {
        this.f9096d0 = (e) ((e) eVar.clone()).b();
    }

    public final synchronized boolean s(T2.g gVar) {
        S2.c f8 = gVar.f();
        if (f8 == null) {
            return true;
        }
        if (!this.f9090X.e(f8)) {
            return false;
        }
        this.f9092Z.f9083U.remove(gVar);
        gVar.a((S2.c) null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f9090X + ", treeNode=" + this.f9091Y + "}";
    }
}
