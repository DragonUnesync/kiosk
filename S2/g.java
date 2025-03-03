package S2;

public final class g implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final d f4497a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4498b;

    /* renamed from: c  reason: collision with root package name */
    public volatile f f4499c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f4500d;
    public int e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f4501f = 3;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4502g;

    public g(Object obj, d dVar) {
        this.f4498b = obj;
        this.f4497a = dVar;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f4498b) {
            try {
                if (!this.f4500d.a()) {
                    if (!this.f4499c.a()) {
                        z = false;
                    }
                }
                z = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean b(c cVar) {
        boolean z;
        synchronized (this.f4498b) {
            try {
                d dVar = this.f4497a;
                if (dVar == null || dVar.b(this)) {
                    if (!cVar.equals(this.f4499c)) {
                        if (this.e != 4) {
                        }
                    }
                    z = true;
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(S2.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4498b
            monitor-enter(r0)
            S2.c r1 = r2.f4500d     // Catch:{ all -> 0x0010 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0010 }
            r1 = 4
            if (r3 == 0) goto L_0x0012
            r2.f4501f = r1     // Catch:{ all -> 0x0010 }
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x0010:
            r3 = move-exception
            goto L_0x002a
        L_0x0012:
            r2.e = r1     // Catch:{ all -> 0x0010 }
            S2.d r3 = r2.f4497a     // Catch:{ all -> 0x0010 }
            if (r3 == 0) goto L_0x001b
            r3.c(r2)     // Catch:{ all -> 0x0010 }
        L_0x001b:
            int r3 = r2.f4501f     // Catch:{ all -> 0x0010 }
            boolean r3 = Q0.g.h(r3)     // Catch:{ all -> 0x0010 }
            if (r3 != 0) goto L_0x0028
            S2.c r3 = r2.f4500d     // Catch:{ all -> 0x0010 }
            r3.clear()     // Catch:{ all -> 0x0010 }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.g.c(S2.c):void");
    }

    public final void clear() {
        synchronized (this.f4498b) {
            this.f4502g = false;
            this.e = 3;
            this.f4501f = 3;
            this.f4500d.clear();
            this.f4499c.clear();
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.f4498b) {
            if (this.e == 3) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(S2.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4498b
            monitor-enter(r0)
            S2.f r1 = r2.f4499c     // Catch:{ all -> 0x0010 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0010 }
            r1 = 5
            if (r3 != 0) goto L_0x0012
            r2.f4501f = r1     // Catch:{ all -> 0x0010 }
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x0010:
            r3 = move-exception
            goto L_0x001d
        L_0x0012:
            r2.e = r1     // Catch:{ all -> 0x0010 }
            S2.d r3 = r2.f4497a     // Catch:{ all -> 0x0010 }
            if (r3 == 0) goto L_0x001b
            r3.e(r2)     // Catch:{ all -> 0x0010 }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.g.e(S2.c):void");
    }

    public final d f() {
        d dVar;
        synchronized (this.f4498b) {
            try {
                d dVar2 = this.f4497a;
                if (dVar2 != null) {
                    dVar = dVar2.f();
                } else {
                    dVar = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final void g() {
        synchronized (this.f4498b) {
            try {
                if (!Q0.g.h(this.f4501f)) {
                    this.f4501f = 2;
                    this.f4500d.g();
                }
                if (!Q0.g.h(this.e)) {
                    this.e = 2;
                    this.f4499c.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(c cVar) {
        boolean z;
        synchronized (this.f4498b) {
            try {
                d dVar = this.f4497a;
                if ((dVar == null || dVar.h(this)) && cVar.equals(this.f4499c) && this.e != 2) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void i() {
        synchronized (this.f4498b) {
            try {
                this.f4502g = true;
                if (!(this.e == 4 || this.f4501f == 1)) {
                    this.f4501f = 1;
                    this.f4500d.i();
                }
                if (this.f4502g && this.e != 1) {
                    this.e = 1;
                    this.f4499c.i();
                }
                this.f4502g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isRunning() {
        boolean z;
        synchronized (this.f4498b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    public final boolean j(c cVar) {
        boolean z;
        synchronized (this.f4498b) {
            try {
                d dVar = this.f4497a;
                if ((dVar == null || dVar.j(this)) && cVar.equals(this.f4499c) && !a()) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean k() {
        boolean z;
        synchronized (this.f4498b) {
            if (this.e == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(S2.c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof S2.g
            r1 = 0
            if (r0 == 0) goto L_0x002e
            S2.g r4 = (S2.g) r4
            S2.f r0 = r3.f4499c
            if (r0 != 0) goto L_0x0010
            S2.f r0 = r4.f4499c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            S2.f r0 = r3.f4499c
            S2.f r2 = r4.f4499c
            boolean r0 = r0.l(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            S2.c r0 = r3.f4500d
            if (r0 != 0) goto L_0x0023
            S2.c r4 = r4.f4500d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            S2.c r0 = r3.f4500d
            S2.c r4 = r4.f4500d
            boolean r4 = r0.l(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.g.l(S2.c):boolean");
    }
}
