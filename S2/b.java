package S2;

public final class b implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4466a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4467b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f4468c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f4469d;
    public int e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f4470f = 3;

    public b(Object obj, d dVar) {
        this.f4466a = obj;
        this.f4467b = dVar;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f4466a) {
            try {
                if (!this.f4468c.a()) {
                    if (!this.f4469d.a()) {
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

    /* JADX WARNING: type inference failed for: r0v1, types: [S2.d, java.lang.Object] */
    public final boolean b(c cVar) {
        boolean z;
        synchronized (this.f4466a) {
            ? r02 = this.f4467b;
            if (r02 != 0) {
                if (!r02.b(this)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [S2.d, java.lang.Object] */
    public final void c(c cVar) {
        synchronized (this.f4466a) {
            try {
                if (cVar.equals(this.f4468c)) {
                    this.e = 4;
                } else if (cVar.equals(this.f4469d)) {
                    this.f4470f = 4;
                }
                ? r42 = this.f4467b;
                if (r42 != 0) {
                    r42.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clear() {
        synchronized (this.f4466a) {
            try {
                this.e = 3;
                this.f4468c.clear();
                if (this.f4470f != 3) {
                    this.f4470f = 3;
                    this.f4469d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.f4466a) {
            try {
                if (this.e == 3 && this.f4470f == 3) {
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

    /* JADX WARNING: type inference failed for: r3v3, types: [S2.d, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(S2.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4466a
            monitor-enter(r0)
            S2.c r1 = r2.f4469d     // Catch:{ all -> 0x001b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001b }
            r1 = 5
            if (r3 != 0) goto L_0x001f
            r2.e = r1     // Catch:{ all -> 0x001b }
            int r3 = r2.f4470f     // Catch:{ all -> 0x001b }
            r1 = 1
            if (r3 == r1) goto L_0x001d
            r2.f4470f = r1     // Catch:{ all -> 0x001b }
            S2.c r3 = r2.f4469d     // Catch:{ all -> 0x001b }
            r3.i()     // Catch:{ all -> 0x001b }
            goto L_0x001d
        L_0x001b:
            r3 = move-exception
            goto L_0x002a
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001f:
            r2.f4470f = r1     // Catch:{ all -> 0x001b }
            java.lang.Object r3 = r2.f4467b     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0028
            r3.e(r2)     // Catch:{ all -> 0x001b }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.b.e(S2.c):void");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [S2.d, java.lang.Object] */
    public final d f() {
        d dVar;
        synchronized (this.f4466a) {
            try {
                ? r12 = this.f4467b;
                if (r12 != 0) {
                    dVar = r12.f();
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
        synchronized (this.f4466a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.f4468c.g();
                }
                if (this.f4470f == 1) {
                    this.f4470f = 2;
                    this.f4469d.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [S2.d, java.lang.Object] */
    public final boolean h(c cVar) {
        boolean z;
        synchronized (this.f4466a) {
            ? r12 = this.f4467b;
            if ((r12 == 0 || r12.h(this)) && cVar.equals(this.f4468c)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void i() {
        synchronized (this.f4466a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.f4468c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isRunning() {
        boolean z;
        synchronized (this.f4466a) {
            try {
                z = true;
                if (this.e != 1) {
                    if (this.f4470f != 1) {
                        z = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [S2.d, java.lang.Object] */
    public final boolean j(c cVar) {
        boolean z;
        boolean z6;
        int i;
        synchronized (this.f4466a) {
            ? r12 = this.f4467b;
            z = false;
            if (r12 == 0 || r12.j(this)) {
                if (this.e != 5) {
                    z6 = cVar.equals(this.f4468c);
                } else if (!cVar.equals(this.f4469d) || !((i = this.f4470f) == 4 || i == 5)) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (z6) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean k() {
        boolean z;
        synchronized (this.f4466a) {
            try {
                if (this.e != 4) {
                    if (this.f4470f != 4) {
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

    public final boolean l(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        if (!this.f4468c.l(bVar.f4468c) || !this.f4469d.l(bVar.f4469d)) {
            return false;
        }
        return true;
    }
}
