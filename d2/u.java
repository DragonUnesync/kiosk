package D2;

import B.q0;
import F.a;
import S2.f;
import W2.m;
import X2.b;
import X2.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import z3.e;

public final class u implements b {

    /* renamed from: q0  reason: collision with root package name */
    public static final e f1156q0 = new e(17);

    /* renamed from: U  reason: collision with root package name */
    public final t f1157U = new t(0, new ArrayList(2));

    /* renamed from: V  reason: collision with root package name */
    public final d f1158V = new Object();

    /* renamed from: W  reason: collision with root package name */
    public final q f1159W;

    /* renamed from: X  reason: collision with root package name */
    public final q0 f1160X;

    /* renamed from: Y  reason: collision with root package name */
    public final e f1161Y;

    /* renamed from: Z  reason: collision with root package name */
    public final q f1162Z;

    /* renamed from: a0  reason: collision with root package name */
    public final G2.e f1163a0;

    /* renamed from: b0  reason: collision with root package name */
    public final G2.e f1164b0;

    /* renamed from: c0  reason: collision with root package name */
    public final G2.e f1165c0;

    /* renamed from: d0  reason: collision with root package name */
    public final AtomicInteger f1166d0 = new AtomicInteger();

    /* renamed from: e0  reason: collision with root package name */
    public v f1167e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f1168f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f1169g0;

    /* renamed from: h0  reason: collision with root package name */
    public D f1170h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1171i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f1172j0;

    /* renamed from: k0  reason: collision with root package name */
    public y f1173k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f1174l0;

    /* renamed from: m0  reason: collision with root package name */
    public w f1175m0;

    /* renamed from: n0  reason: collision with root package name */
    public l f1176n0;

    /* renamed from: o0  reason: collision with root package name */
    public volatile boolean f1177o0;
    public boolean p0;

    /* JADX WARNING: type inference failed for: r0v1, types: [X2.d, java.lang.Object] */
    public u(G2.e eVar, G2.e eVar2, G2.e eVar3, G2.e eVar4, q qVar, q qVar2, q0 q0Var) {
        e eVar5 = f1156q0;
        this.f1163a0 = eVar;
        this.f1164b0 = eVar2;
        this.f1165c0 = eVar4;
        this.f1162Z = qVar;
        this.f1159W = qVar2;
        this.f1160X = q0Var;
        this.f1161Y = eVar5;
    }

    public final synchronized void a(f fVar, a aVar) {
        try {
            this.f1158V.a();
            t tVar = this.f1157U;
            tVar.getClass();
            ((ArrayList) tVar.f1155V).add(new s(fVar, aVar));
            if (this.f1172j0) {
                e(1);
                r rVar = new r(this, fVar, 1);
                aVar.getClass();
                m.j(rVar);
            } else if (this.f1174l0) {
                e(1);
                r rVar2 = new r(this, fVar, 0);
                aVar.getClass();
                m.j(rVar2);
            } else {
                W2.f.a("Cannot add callbacks to a cancelled EngineJob", !this.f1177o0);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final d b() {
        return this.f1158V;
    }

    public final void c() {
        if (!f()) {
            this.f1177o0 = true;
            l lVar = this.f1176n0;
            lVar.f1123u0 = true;
            C0079h hVar = lVar.f1121s0;
            if (hVar != null) {
                hVar.cancel();
            }
            q qVar = this.f1162Z;
            v vVar = this.f1167e0;
            synchronized (qVar) {
                A a8 = qVar.f1142a;
                a8.getClass();
                HashMap hashMap = a8.f1025a;
                if (equals(hashMap.get(vVar))) {
                    hashMap.remove(vVar);
                }
            }
        }
    }

    public final void d() {
        boolean z;
        w wVar;
        synchronized (this) {
            try {
                this.f1158V.a();
                W2.f.a("Not yet complete!", f());
                int decrementAndGet = this.f1166d0.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                W2.f.a("Can't decrement below 0", z);
                if (decrementAndGet == 0) {
                    wVar = this.f1175m0;
                    i();
                } else {
                    wVar = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (wVar != null) {
            wVar.b();
        }
    }

    public final synchronized void e(int i) {
        w wVar;
        W2.f.a("Not yet complete!", f());
        if (this.f1166d0.getAndAdd(i) == 0 && (wVar = this.f1175m0) != null) {
            wVar.a();
        }
    }

    public final boolean f() {
        if (this.f1174l0 || this.f1172j0 || this.f1177o0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r5.f1162Z.e(r5, r1, (D2.w) null);
        r0 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r0.hasNext() == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        r1 = (D2.s) r0.next();
        r1.f1153b.execute(new D2.r(r5, r1.f1152a, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r5 = this;
            monitor-enter(r5)
            X2.d r0 = r5.f1158V     // Catch:{ all -> 0x000f }
            r0.a()     // Catch:{ all -> 0x000f }
            boolean r0 = r5.f1177o0     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x0011
            r5.i()     // Catch:{ all -> 0x000f }
            monitor-exit(r5)     // Catch:{ all -> 0x000f }
            return
        L_0x000f:
            r0 = move-exception
            goto L_0x0075
        L_0x0011:
            D2.t r0 = r5.f1157U     // Catch:{ all -> 0x000f }
            java.lang.Object r0 = r0.f1155V     // Catch:{ all -> 0x000f }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x000f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x006d
            boolean r0 = r5.f1174l0     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x0065
            r0 = 1
            r5.f1174l0 = r0     // Catch:{ all -> 0x000f }
            D2.v r1 = r5.f1167e0     // Catch:{ all -> 0x000f }
            D2.t r2 = r5.f1157U     // Catch:{ all -> 0x000f }
            r2.getClass()     // Catch:{ all -> 0x000f }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x000f }
            java.lang.Object r2 = r2.f1155V     // Catch:{ all -> 0x000f }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x000f }
            r3.<init>(r2)     // Catch:{ all -> 0x000f }
            int r2 = r3.size()     // Catch:{ all -> 0x000f }
            int r2 = r2 + r0
            r5.e(r2)     // Catch:{ all -> 0x000f }
            monitor-exit(r5)     // Catch:{ all -> 0x000f }
            D2.q r0 = r5.f1162Z
            r2 = 0
            r0.e(r5, r1, r2)
            java.util.Iterator r0 = r3.iterator()
        L_0x0047:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0061
            java.lang.Object r1 = r0.next()
            D2.s r1 = (D2.s) r1
            java.util.concurrent.Executor r2 = r1.f1153b
            D2.r r3 = new D2.r
            S2.f r1 = r1.f1152a
            r4 = 0
            r3.<init>(r5, r1, r4)
            r2.execute(r3)
            goto L_0x0047
        L_0x0061:
            r5.d()
            return
        L_0x0065:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x000f }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x006d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x000f }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x0075:
            monitor-exit(r5)     // Catch:{ all -> 0x000f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.u.g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        r7.f1162Z.e(r7, r0, r1);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r0.hasNext() == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        r1 = (D2.s) r0.next();
        r1.f1153b.execute(new D2.r(r7, r1.f1152a, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r7 = this;
            monitor-enter(r7)
            X2.d r0 = r7.f1158V     // Catch:{ all -> 0x0014 }
            r0.a()     // Catch:{ all -> 0x0014 }
            boolean r0 = r7.f1177o0     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0017
            D2.D r0 = r7.f1170h0     // Catch:{ all -> 0x0014 }
            r0.e()     // Catch:{ all -> 0x0014 }
            r7.i()     // Catch:{ all -> 0x0014 }
            monitor-exit(r7)     // Catch:{ all -> 0x0014 }
            return
        L_0x0014:
            r0 = move-exception
            goto L_0x0092
        L_0x0017:
            D2.t r0 = r7.f1157U     // Catch:{ all -> 0x0014 }
            java.lang.Object r0 = r0.f1155V     // Catch:{ all -> 0x0014 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0014 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x008a
            boolean r0 = r7.f1172j0     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0082
            z3.e r0 = r7.f1161Y     // Catch:{ all -> 0x0014 }
            D2.D r2 = r7.f1170h0     // Catch:{ all -> 0x0014 }
            boolean r3 = r7.f1168f0     // Catch:{ all -> 0x0014 }
            D2.v r5 = r7.f1167e0     // Catch:{ all -> 0x0014 }
            D2.q r6 = r7.f1159W     // Catch:{ all -> 0x0014 }
            r0.getClass()     // Catch:{ all -> 0x0014 }
            D2.w r0 = new D2.w     // Catch:{ all -> 0x0014 }
            r4 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0014 }
            r7.f1175m0 = r0     // Catch:{ all -> 0x0014 }
            r0 = 1
            r7.f1172j0 = r0     // Catch:{ all -> 0x0014 }
            D2.t r1 = r7.f1157U     // Catch:{ all -> 0x0014 }
            r1.getClass()     // Catch:{ all -> 0x0014 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0014 }
            java.lang.Object r1 = r1.f1155V     // Catch:{ all -> 0x0014 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0014 }
            r2.<init>(r1)     // Catch:{ all -> 0x0014 }
            int r1 = r2.size()     // Catch:{ all -> 0x0014 }
            int r1 = r1 + r0
            r7.e(r1)     // Catch:{ all -> 0x0014 }
            D2.v r0 = r7.f1167e0     // Catch:{ all -> 0x0014 }
            D2.w r1 = r7.f1175m0     // Catch:{ all -> 0x0014 }
            monitor-exit(r7)     // Catch:{ all -> 0x0014 }
            D2.q r3 = r7.f1162Z
            r3.e(r7, r0, r1)
            java.util.Iterator r0 = r2.iterator()
        L_0x0064:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007e
            java.lang.Object r1 = r0.next()
            D2.s r1 = (D2.s) r1
            java.util.concurrent.Executor r2 = r1.f1153b
            D2.r r3 = new D2.r
            S2.f r1 = r1.f1152a
            r4 = 1
            r3.<init>(r7, r1, r4)
            r2.execute(r3)
            goto L_0x0064
        L_0x007e:
            r7.d()
            return
        L_0x0082:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x008a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x0092:
            monitor-exit(r7)     // Catch:{ all -> 0x0014 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.u.h():void");
    }

    public final synchronized void i() {
        if (this.f1167e0 != null) {
            ((ArrayList) this.f1157U.f1155V).clear();
            this.f1167e0 = null;
            this.f1175m0 = null;
            this.f1170h0 = null;
            this.f1174l0 = false;
            this.f1177o0 = false;
            this.f1172j0 = false;
            this.p0 = false;
            this.f1176n0.m();
            this.f1176n0 = null;
            this.f1173k0 = null;
            this.f1171i0 = 0;
            this.f1160X.A(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void j(f fVar) {
        try {
            this.f1158V.a();
            t tVar = this.f1157U;
            ((ArrayList) tVar.f1155V).remove(new s(fVar, W2.f.f6163b));
            if (((ArrayList) this.f1157U.f1155V).isEmpty()) {
                c();
                if (!this.f1172j0) {
                    if (this.f1174l0) {
                    }
                }
                if (this.f1166d0.get() == 0) {
                    i();
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void k(l lVar) {
        G2.e eVar;
        this.f1176n0 = lVar;
        int h5 = lVar.h(1);
        if (h5 != 2) {
            if (h5 != 3) {
                if (this.f1169g0) {
                    eVar = this.f1165c0;
                } else {
                    eVar = this.f1164b0;
                }
                eVar.execute(lVar);
            }
        }
        eVar = this.f1163a0;
        eVar.execute(lVar);
    }
}
