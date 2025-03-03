package m6;

import i5.s;
import java.util.LinkedList;
import v6.m;

public final class a implements b {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f13385U;

    /* renamed from: V  reason: collision with root package name */
    public volatile boolean f13386V;

    /* renamed from: W  reason: collision with root package name */
    public Object f13387W;

    public /* synthetic */ a(int i) {
        this.f13385U = i;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [i5.s, java.lang.Object] */
    private final boolean b(b bVar) {
        if (!this.f13386V) {
            synchronized (this) {
                try {
                    if (!this.f13386V) {
                        s sVar = (s) this.f13387W;
                        s sVar2 = sVar;
                        if (sVar == null) {
                            ? obj = new Object();
                            int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            obj.f12755a = numberOfLeadingZeros - 1;
                            obj.f12757c = (int) (0.75f * ((float) numberOfLeadingZeros));
                            obj.f12758d = new Object[numberOfLeadingZeros];
                            this.f13387W = obj;
                            sVar2 = obj;
                        }
                        sVar2.a(bVar);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        bVar.d();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean e(m6.b r8) {
        /*
            r7 = this;
            boolean r0 = r7.f13386V
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            monitor-enter(r7)
            boolean r0 = r7.f13386V     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r7)     // Catch:{ all -> 0x000d }
            return r1
        L_0x000d:
            r8 = move-exception
            goto L_0x004a
        L_0x000f:
            java.lang.Object r0 = r7.f13387W     // Catch:{ all -> 0x000d }
            i5.s r0 = (i5.s) r0     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x0048
            java.lang.Object[] r2 = r0.f12758d     // Catch:{ all -> 0x000d }
            int r3 = r0.f12755a     // Catch:{ all -> 0x000d }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x000d }
            r5 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r5
            int r5 = r4 >>> 16
            r4 = r4 ^ r5
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x000d }
            if (r5 != 0) goto L_0x002b
            goto L_0x0048
        L_0x002b:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x000d }
            r6 = 1
            if (r5 == 0) goto L_0x0036
            r0.d(r4, r3, r2)     // Catch:{ all -> 0x000d }
            goto L_0x0046
        L_0x0036:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x000d }
            if (r5 != 0) goto L_0x003d
            goto L_0x0048
        L_0x003d:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x000d }
            if (r5 == 0) goto L_0x0036
            r0.d(r4, r3, r2)     // Catch:{ all -> 0x000d }
        L_0x0046:
            monitor-exit(r7)     // Catch:{ all -> 0x000d }
            return r6
        L_0x0048:
            monitor-exit(r7)     // Catch:{ all -> 0x000d }
            return r1
        L_0x004a:
            monitor-exit(r7)     // Catch:{ all -> 0x000d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.a.e(m6.b):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        if (r1 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r1 = r1.f12758d;
        r3 = r1.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        if (r5 >= r3) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        r6 = r1[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        if ((r6 instanceof m6.b) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        ((m6.b) r6).d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        R.e.v(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        if (r2 == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        r2.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        if (r2.size() != 1) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        throw y6.C1638c.a((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
        throw new n6.b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f() {
        /*
            r8 = this;
            boolean r0 = r8.f13386V
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r8)
            boolean r0 = r8.f13386V     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r8)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r0 = move-exception
            goto L_0x005a
        L_0x000e:
            r0 = 1
            r8.f13386V = r0     // Catch:{ all -> 0x000c }
            java.lang.Object r1 = r8.f13387W     // Catch:{ all -> 0x000c }
            i5.s r1 = (i5.s) r1     // Catch:{ all -> 0x000c }
            r2 = 0
            r8.f13387W = r2     // Catch:{ all -> 0x000c }
            monitor-exit(r8)     // Catch:{ all -> 0x000c }
            if (r1 != 0) goto L_0x001c
            goto L_0x0059
        L_0x001c:
            java.lang.Object[] r1 = r1.f12758d
            int r3 = r1.length
            r4 = 0
            r5 = 0
        L_0x0021:
            if (r5 >= r3) goto L_0x0040
            r6 = r1[r5]
            boolean r7 = r6 instanceof m6.b
            if (r7 == 0) goto L_0x003d
            m6.b r6 = (m6.b) r6     // Catch:{ all -> 0x002f }
            r6.d()     // Catch:{ all -> 0x002f }
            goto L_0x003d
        L_0x002f:
            r6 = move-exception
            R.e.v(r6)
            if (r2 != 0) goto L_0x003a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x003a:
            r2.add(r6)
        L_0x003d:
            int r5 = r5 + 1
            goto L_0x0021
        L_0x0040:
            if (r2 == 0) goto L_0x0059
            int r1 = r2.size()
            if (r1 != r0) goto L_0x0053
            java.lang.Object r0 = r2.get(r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = y6.C1638c.a(r0)
            throw r0
        L_0x0053:
            n6.b r0 = new n6.b
            r0.<init>(r2)
            throw r0
        L_0x0059:
            return
        L_0x005a:
            monitor-exit(r8)     // Catch:{ all -> 0x000c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.a.f():void");
    }

    public final boolean a(b bVar) {
        switch (this.f13385U) {
            case 0:
                return b(bVar);
            default:
                if (!this.f13386V) {
                    synchronized (this) {
                        try {
                            if (!this.f13386V) {
                                LinkedList linkedList = (LinkedList) this.f13387W;
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    this.f13387W = linkedList;
                                }
                                linkedList.add(bVar);
                                return true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                bVar.d();
                return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(m6.b r3) {
        /*
            r2 = this;
            int r0 = r2.f13385U
            switch(r0) {
                case 0: goto L_0x0028;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r2.f13386V
            r1 = 0
            if (r0 == 0) goto L_0x000b
            goto L_0x0025
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f13386V     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            goto L_0x0025
        L_0x0012:
            r3 = move-exception
            goto L_0x0026
        L_0x0014:
            java.lang.Object r0 = r2.f13387W     // Catch:{ all -> 0x0012 }
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0024
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0012 }
            if (r3 != 0) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            r1 = 1
            goto L_0x0025
        L_0x0024:
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
        L_0x0025:
            return r1
        L_0x0026:
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            throw r3
        L_0x0028:
            boolean r3 = r2.e(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.a.c(m6.b):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r1 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r1.hasNext() == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        ((m6.b) r1.next()).d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        R.e.v(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        if (r2 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r2.size() != 1) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        throw y6.C1638c.a((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        throw new n6.b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r4 = this;
            int r0 = r4.f13385U
            switch(r0) {
                case 0: goto L_0x0061;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r4.f13386V
            if (r0 == 0) goto L_0x000a
            goto L_0x005e
        L_0x000a:
            monitor-enter(r4)
            boolean r0 = r4.f13386V     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x0013
            monitor-exit(r4)     // Catch:{ all -> 0x0011 }
            goto L_0x005e
        L_0x0011:
            r0 = move-exception
            goto L_0x005f
        L_0x0013:
            r0 = 1
            r4.f13386V = r0     // Catch:{ all -> 0x0011 }
            java.lang.Object r1 = r4.f13387W     // Catch:{ all -> 0x0011 }
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch:{ all -> 0x0011 }
            r2 = 0
            r4.f13387W = r2     // Catch:{ all -> 0x0011 }
            monitor-exit(r4)     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x0021
            goto L_0x005e
        L_0x0021:
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r1.next()
            m6.b r3 = (m6.b) r3
            r3.d()     // Catch:{ all -> 0x0035 }
            goto L_0x0025
        L_0x0035:
            r3 = move-exception
            R.e.v(r3)
            if (r2 != 0) goto L_0x0040
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0040:
            r2.add(r3)
            goto L_0x0025
        L_0x0044:
            if (r2 == 0) goto L_0x005e
            int r1 = r2.size()
            if (r1 != r0) goto L_0x0058
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = y6.C1638c.a(r0)
            throw r0
        L_0x0058:
            n6.b r0 = new n6.b
            r0.<init>(r2)
            throw r0
        L_0x005e:
            return
        L_0x005f:
            monitor-exit(r4)     // Catch:{ all -> 0x0011 }
            throw r0
        L_0x0061:
            r4.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.a.d():void");
    }

    public final boolean g(b bVar) {
        switch (this.f13385U) {
            case 0:
                if (!c(bVar)) {
                    return false;
                }
                bVar.d();
                return true;
            default:
                if (!c(bVar)) {
                    return false;
                }
                ((m) bVar).d();
                return true;
        }
    }
}
