package b7;

import c7.k;

/* renamed from: b7.b  reason: case insensitive filesystem */
public final class C0596b extends C0595a {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f8689f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0596b(Object obj, int i, String str) {
        super(str, true);
        this.e = i;
        this.f8689f = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0092, code lost:
        r1 = r6.f8941d;
        P6.f.b(r1);
        Z6.b.d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a0, code lost:
        if (r0.f8956d.isEmpty() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a2, code lost:
        r0.f8954b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r13 = this;
            int r0 = r13.e
            switch(r0) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.f8689f
            f7.o r0 = (f7.o) r0
            r0.getClass()
            r1 = 2
            f7.x r2 = r0.f11759q0     // Catch:{ IOException -> 0x0014 }
            r3 = 0
            r2.p(r1, r3, r3)     // Catch:{ IOException -> 0x0014 }
            goto L_0x0018
        L_0x0014:
            r2 = move-exception
            r0.k(r1, r1, r2)
        L_0x0018:
            r0 = -1
            return r0
        L_0x001b:
            java.lang.Object r0 = r13.f8689f
            c7.k r0 = (c7.k) r0
            long r1 = java.lang.System.nanoTime()
            java.util.concurrent.ConcurrentLinkedQueue r3 = r0.f8956d
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = 0
            r6 = -9223372036854775808
            r7 = r6
            r6 = r5
            r5 = 0
        L_0x0030:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x005c
            java.lang.Object r9 = r3.next()
            c7.j r9 = (c7.j) r9
            java.lang.String r10 = "connection"
            P6.f.d(r9, r10)
            monitor-enter(r9)
            int r10 = r0.b(r9, r1)     // Catch:{ all -> 0x0059 }
            if (r10 <= 0) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0057
        L_0x004b:
            int r4 = r4 + 1
            long r10 = r9.f8952q     // Catch:{ all -> 0x0059 }
            long r10 = r1 - r10
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x0057
            r6 = r9
            r7 = r10
        L_0x0057:
            monitor-exit(r9)
            goto L_0x0030
        L_0x0059:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x005c:
            long r9 = r0.f8953a
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0070
            r3 = 5
            if (r4 <= r3) goto L_0x0066
            goto L_0x0070
        L_0x0066:
            if (r4 <= 0) goto L_0x006a
            long r9 = r9 - r7
            goto L_0x00a7
        L_0x006a:
            if (r5 <= 0) goto L_0x006d
            goto L_0x00a7
        L_0x006d:
            r9 = -1
            goto L_0x00a7
        L_0x0070:
            P6.f.b(r6)
            monitor-enter(r6)
            java.util.ArrayList r3 = r6.f8951p     // Catch:{ all -> 0x00a8 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00a8 }
            r9 = 0
            if (r3 != 0) goto L_0x0080
            monitor-exit(r6)
            goto L_0x00a7
        L_0x0080:
            long r3 = r6.f8952q     // Catch:{ all -> 0x00a8 }
            long r3 = r3 + r7
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0089
            monitor-exit(r6)
            goto L_0x00a7
        L_0x0089:
            r1 = 1
            r6.f8945j = r1     // Catch:{ all -> 0x00a8 }
            java.util.concurrent.ConcurrentLinkedQueue r1 = r0.f8956d     // Catch:{ all -> 0x00a8 }
            r1.remove(r6)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r6)
            java.net.Socket r1 = r6.f8941d
            P6.f.b(r1)
            Z6.b.d(r1)
            java.util.concurrent.ConcurrentLinkedQueue r1 = r0.f8956d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00a7
            b7.c r0 = r0.f8954b
            r0.a()
        L_0x00a7:
            return r9
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x00ab:
            java.lang.Object r0 = r13.f8689f
            f7.k r0 = (f7.k) r0
            r0.invoke()
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.C0596b.a():long");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0596b(k kVar, String str) {
        super(str, true);
        this.e = 1;
        this.f8689f = kVar;
    }
}
