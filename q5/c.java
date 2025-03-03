package Q5;

import java.util.List;

public final class c implements e {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f4130U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ i f4131V;

    public /* synthetic */ c(i iVar, int i) {
        this.f4130U = i;
        this.f4131V = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[Catch:{ Exception -> 0x005f, all -> 0x000b }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[SYNTHETIC, Splitter:B:17:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(java.lang.String r7) {
        /*
            r6 = this;
            Q5.i r0 = r6.f4131V
            monitor-enter(r0)
            Q5.i r1 = r6.f4131V     // Catch:{ all -> 0x000b }
            Q5.b r1 = r1.f4181x0     // Catch:{ all -> 0x000b }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r7 = move-exception
            goto L_0x0072
        L_0x000d:
            Q5.i r1 = r6.f4131V     // Catch:{ all -> 0x000b }
            Q5.b r1 = r1.f4181x0     // Catch:{ all -> 0x000b }
            java.lang.String r1 = r1.f4129c     // Catch:{ all -> 0x000b }
            int r1 = r7.indexOf(r1)     // Catch:{ all -> 0x000b }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x001f
        L_0x001b:
            r5 = r3
            r3 = r7
            r7 = r5
            goto L_0x002a
        L_0x001f:
            if (r1 <= 0) goto L_0x002a
            java.lang.String r3 = r7.substring(r2, r1)     // Catch:{ all -> 0x000b }
            java.lang.String r7 = r7.substring(r1)     // Catch:{ all -> 0x000b }
            goto L_0x001b
        L_0x002a:
            if (r7 == 0) goto L_0x0040
            Q5.i r1 = r6.f4131V     // Catch:{ all -> 0x000b }
            Q5.i.k(r1, r7, r2)     // Catch:{ all -> 0x000b }
            Q5.i r1 = r6.f4131V     // Catch:{ all -> 0x000b }
            Q5.i.l(r1, r7, r2)     // Catch:{ all -> 0x000b }
            Q5.i r1 = r6.f4131V     // Catch:{ all -> 0x000b }
            Q5.b r4 = r1.f4181x0     // Catch:{ all -> 0x000b }
            r4.getClass()     // Catch:{ all -> 0x000b }
            Q5.i.l(r1, r7, r2)     // Catch:{ all -> 0x000b }
        L_0x0040:
            if (r3 == 0) goto L_0x0070
            Q5.i r7 = r6.f4131V     // Catch:{ Exception -> 0x005f }
            Q5.b r1 = r7.f4181x0     // Catch:{ Exception -> 0x005f }
            java.lang.String r1 = r1.f4129c     // Catch:{ Exception -> 0x005f }
            int r1 = r1.length()     // Catch:{ Exception -> 0x005f }
            int r1 = r1 + 1
            java.lang.String r1 = r3.substring(r1)     // Catch:{ Exception -> 0x005f }
            r2 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1, r2)     // Catch:{ Exception -> 0x005f }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x005f }
            r7.f4178u0 = r1     // Catch:{ Exception -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r7 = move-exception
            r7.printStackTrace()     // Catch:{ all -> 0x000b }
        L_0x0063:
            Q5.i r7 = r6.f4131V     // Catch:{ all -> 0x000b }
            Q5.b r1 = r7.f4181x0     // Catch:{ all -> 0x000b }
            java.lang.String r1 = r1.f4129c     // Catch:{ all -> 0x000b }
            r7.f4179v0 = r1     // Catch:{ all -> 0x000b }
            Q5.i r7 = r6.f4131V     // Catch:{ all -> 0x000b }
            Q5.i.m(r7)     // Catch:{ all -> 0x000b }
        L_0x0070:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return
        L_0x0072:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.c.c(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r5.f4130U
            switch(r0) {
                case 2: goto L_0x005b;
                default: goto L_0x0005;
            }
        L_0x0005:
            Q5.i r0 = r5.f4131V
            monitor-enter(r0)
            Q5.i r1 = r5.f4131V     // Catch:{ all -> 0x0010 }
            Q5.b r1 = r1.f4181x0     // Catch:{ all -> 0x0010 }
            if (r1 != 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            goto L_0x0058
        L_0x0010:
            r6 = move-exception
            goto L_0x0059
        L_0x0012:
            Q5.i r1 = r5.f4131V     // Catch:{ all -> 0x0010 }
            Q5.b r1 = r1.f4181x0     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = r1.f4129c     // Catch:{ all -> 0x0010 }
            int r1 = r6.indexOf(r1)     // Catch:{ all -> 0x0010 }
            if (r1 != 0) goto L_0x0020
            r6 = 0
            goto L_0x0027
        L_0x0020:
            if (r1 <= 0) goto L_0x0027
            r2 = 0
            java.lang.String r6 = r6.substring(r2, r1)     // Catch:{ all -> 0x0010 }
        L_0x0027:
            if (r6 == 0) goto L_0x0048
            Q5.i r2 = r5.f4131V     // Catch:{ all -> 0x0010 }
            r3 = 1
            Q5.i.k(r2, r6, r3)     // Catch:{ all -> 0x0010 }
            Q5.i r2 = r5.f4131V     // Catch:{ all -> 0x0010 }
            Q5.i.l(r2, r6, r3)     // Catch:{ all -> 0x0010 }
            Q5.i r2 = r5.f4131V     // Catch:{ all -> 0x0010 }
            Q5.b r4 = r2.f4181x0     // Catch:{ all -> 0x0010 }
            r4.getClass()     // Catch:{ all -> 0x0010 }
            Q5.i.l(r2, r6, r3)     // Catch:{ all -> 0x0010 }
            Q5.i r2 = r5.f4131V     // Catch:{ all -> 0x0010 }
            Q5.b r4 = r2.f4181x0     // Catch:{ all -> 0x0010 }
            r4.getClass()     // Catch:{ all -> 0x0010 }
            Q5.i.l(r2, r6, r3)     // Catch:{ all -> 0x0010 }
        L_0x0048:
            if (r1 < 0) goto L_0x0057
            Q5.i r6 = r5.f4131V     // Catch:{ all -> 0x0010 }
            Q5.b r1 = r6.f4181x0     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = r1.f4129c     // Catch:{ all -> 0x0010 }
            r6.f4180w0 = r1     // Catch:{ all -> 0x0010 }
            Q5.i r6 = r5.f4131V     // Catch:{ all -> 0x0010 }
            Q5.i.m(r6)     // Catch:{ all -> 0x0010 }
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
        L_0x0058:
            return
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r6
        L_0x005b:
            r5.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.c.a(java.lang.String):void");
    }

    public void b(int i, List list, List list2) {
        if (i == 0 && !j.c(list, j.b(this.f4131V.f4154V))) {
            this.f4131V.f4170l0 = true;
            this.f4131V.o(false);
        }
        this.f4131V.f4158Z = 0;
    }

    public void d() {
        boolean z;
        i iVar = this.f4131V;
        if (iVar.f4155W || !iVar.u()) {
            if (this.f4131V.f4162d0 != null) {
                Thread currentThread = Thread.currentThread();
                i iVar2 = this.f4131V;
                if (currentThread == iVar2.f4161c0) {
                    iVar2.f4162d0.a();
                }
            }
            if (this.f4131V.f4161c0 != null) {
                Thread currentThread2 = Thread.currentThread();
                i iVar3 = this.f4131V;
                if (currentThread2 == iVar3.f4162d0) {
                    iVar3.f4161c0.a();
                }
            }
            synchronized (this.f4131V.f4163e0) {
                Thread currentThread3 = Thread.currentThread();
                i iVar4 = this.f4131V;
                if (currentThread3 == iVar4.f4161c0) {
                    iVar4.f4164f0 = true;
                }
                Thread currentThread4 = Thread.currentThread();
                i iVar5 = this.f4131V;
                if (currentThread4 == iVar5.f4162d0) {
                    iVar5.f4165g0 = true;
                }
                if (!iVar5.f4164f0 || !iVar5.f4165g0) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                this.f4131V.z();
                synchronized (this.f4131V) {
                    try {
                        if (this.f4131V.f4181x0 != null) {
                            i iVar6 = this.f4131V;
                            iVar6.x(iVar6.f4181x0, -2, this.f4131V.f4182y0, this.f4131V.f4183z0);
                            this.f4131V.f4181x0 = null;
                        }
                        this.f4131V.f4171m0 = true;
                        this.f4131V.f4169k0 = false;
                        this.f4131V.y(true);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public c(i iVar, a aVar) {
        this.f4130U = 0;
        this.f4131V = iVar;
    }
}
