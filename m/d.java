package M;

import u0.C1486a;

public final class d implements C1486a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2730a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2731b;

    public /* synthetic */ d() {
        this.f2730a = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r0 >= r2.size()) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        ((u0.C1486a) r2.get(r0)).accept(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f2730a
            switch(r0) {
                case 0: goto L_0x004c;
                case 1: goto L_0x003a;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0.f r5 = (r0.C1372f) r5
            java.lang.Object r0 = r0.C1373g.f14807c
            monitor-enter(r0)
            Y.i r1 = r0.C1373g.f14808d     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r4.f2731b     // Catch:{ all -> 0x001a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x001a }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            goto L_0x0037
        L_0x001a:
            r5 = move-exception
            goto L_0x0038
        L_0x001c:
            java.lang.Object r3 = r4.f2731b     // Catch:{ all -> 0x001a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x001a }
            r1.remove(r3)     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r0 = 0
        L_0x0025:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x0037
            java.lang.Object r1 = r2.get(r0)
            u0.a r1 = (u0.C1486a) r1
            r1.accept(r5)
            int r0 = r0 + 1
            goto L_0x0025
        L_0x0037:
            return
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r5
        L_0x003a:
            r0.f r5 = (r0.C1372f) r5
            if (r5 != 0) goto L_0x0044
            r0.f r5 = new r0.f
            r0 = -3
            r5.<init>((int) r0)
        L_0x0044:
            java.lang.Object r0 = r4.f2731b
            de.ozerov.fully.K2 r0 = (de.ozerov.fully.K2) r0
            r0.P(r5)
            return
        L_0x004c:
            java.lang.Object r0 = r4.f2731b
            u0.a r0 = (u0.C1486a) r0
            java.lang.String r1 = "Listener is not set."
            P6.f.c(r0, r1)
            java.lang.Object r0 = r4.f2731b
            u0.a r0 = (u0.C1486a) r0
            r0.accept(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M.d.accept(java.lang.Object):void");
    }

    public /* synthetic */ d(int i, Object obj) {
        this.f2730a = i;
        this.f2731b = obj;
    }
}
