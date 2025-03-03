package U0;

import G3.k;
import M0.V;
import M0.W;
import M0.X;
import h1.C1031B;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public final class f {

    /* renamed from: h  reason: collision with root package name */
    public static final k f5339h = new k(2);
    public static final Random i = new Random();

    /* renamed from: a  reason: collision with root package name */
    public final W f5340a = new W();

    /* renamed from: b  reason: collision with root package name */
    public final V f5341b = new V();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f5342c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public h f5343d;
    public X e = X.f2884a;

    /* renamed from: f  reason: collision with root package name */
    public String f5344f;

    /* renamed from: g  reason: collision with root package name */
    public long f5345g = -1;

    public final void a(e eVar) {
        long j7 = eVar.f5335c;
        if (j7 != -1) {
            this.f5345g = j7;
        }
        this.f5344f = null;
    }

    public final synchronized void b(a aVar) {
        h hVar;
        try {
            String str = this.f5344f;
            if (str != null) {
                e eVar = (e) this.f5342c.get(str);
                eVar.getClass();
                a(eVar);
            }
            Iterator it = this.f5342c.values().iterator();
            while (it.hasNext()) {
                e eVar2 = (e) it.next();
                it.remove();
                if (eVar2.e && (hVar = this.f5343d) != null) {
                    hVar.d(aVar, eVar2.f5333a);
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r13 != -1) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final U0.e c(int r17, h1.C1031B r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.HashMap r3 = r0.f5342c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0016:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x009c
            java.lang.Object r8 = r4.next()
            U0.e r8 = (U0.e) r8
            long r9 = r8.f5335c
            r11 = -1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0052
            int r9 = r8.f5334b
            if (r1 != r9) goto L_0x0052
            if (r2 == 0) goto L_0x0052
            U0.f r9 = r8.f5338g
            java.util.HashMap r10 = r9.f5342c
            java.lang.String r13 = r9.f5344f
            java.lang.Object r10 = r10.get(r13)
            U0.e r10 = (U0.e) r10
            if (r10 == 0) goto L_0x0045
            long r13 = r10.f5335c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x0045
            goto L_0x004a
        L_0x0045:
            long r9 = r9.f5345g
            r13 = 1
            long r13 = r13 + r9
        L_0x004a:
            long r9 = r2.f12280d
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x0052
            r8.f5335c = r9
        L_0x0052:
            h1.B r9 = r8.f5336d
            if (r2 != 0) goto L_0x005b
            int r10 = r8.f5334b
            if (r1 != r10) goto L_0x0016
            goto L_0x007e
        L_0x005b:
            long r13 = r2.f12280d
            if (r9 != 0) goto L_0x006c
            boolean r10 = r18.b()
            if (r10 != 0) goto L_0x0016
            long r11 = r8.f5335c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0016
            goto L_0x007e
        L_0x006c:
            long r10 = r9.f12280d
            int r12 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0016
            int r10 = r2.f12278b
            int r11 = r9.f12278b
            if (r10 != r11) goto L_0x0016
            int r10 = r2.f12279c
            int r11 = r9.f12279c
            if (r10 != r11) goto L_0x0016
        L_0x007e:
            long r10 = r8.f5335c
            r12 = -1
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0098
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L_0x008b
            goto L_0x0098
        L_0x008b:
            if (r12 != 0) goto L_0x0016
            int r10 = P0.z.f3748a
            h1.B r10 = r5.f5336d
            if (r10 == 0) goto L_0x0016
            if (r9 == 0) goto L_0x0016
            r5 = r8
            goto L_0x0016
        L_0x0098:
            r5 = r8
            r6 = r10
            goto L_0x0016
        L_0x009c:
            if (r5 != 0) goto L_0x00ae
            G3.k r4 = f5339h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            U0.e r5 = new U0.e
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        L_0x00ae:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.f.c(int, h1.B):U0.e");
    }

    public final synchronized String d(X x8, C1031B b8) {
        return c(x8.g(b8.f12277a, this.f5341b).f2864c, b8).f5333a;
    }

    public final void e(a aVar) {
        C1031B b8;
        boolean p3 = aVar.f5315b.p();
        HashMap hashMap = this.f5342c;
        if (p3) {
            String str = this.f5344f;
            if (str != null) {
                e eVar = (e) hashMap.get(str);
                eVar.getClass();
                a(eVar);
                return;
            }
            return;
        }
        e eVar2 = (e) hashMap.get(this.f5344f);
        int i8 = aVar.f5316c;
        C1031B b9 = aVar.f5317d;
        this.f5344f = c(i8, b9).f5333a;
        f(aVar);
        if (b9 != null && b9.b()) {
            long j7 = b9.f12280d;
            if (eVar2 == null || eVar2.f5335c != j7 || (b8 = eVar2.f5336d) == null || b8.f12278b != b9.f12278b || b8.f12279c != b9.f12279c) {
                c(i8, new C1031B(b9.f12277a, j7));
                this.f5343d.getClass();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fa, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC, Splitter:B:20:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f(U0.a r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            U0.h r0 = r9.f5343d     // Catch:{ all -> 0x0050 }
            r0.getClass()     // Catch:{ all -> 0x0050 }
            M0.X r0 = r10.f5315b     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.p()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r9)
            return
        L_0x0010:
            h1.B r0 = r10.f5317d     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0053
            long r0 = r0.f12280d     // Catch:{ all -> 0x0050 }
            java.util.HashMap r2 = r9.f5342c     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = r9.f5344f     // Catch:{ all -> 0x0050 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0050 }
            U0.e r2 = (U0.e) r2     // Catch:{ all -> 0x0050 }
            r3 = -1
            if (r2 == 0) goto L_0x002b
            long r5 = r2.f5335c     // Catch:{ all -> 0x0050 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            long r5 = r9.f5345g     // Catch:{ all -> 0x0050 }
            r7 = 1
            long r5 = r5 + r7
        L_0x0030:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0036
            monitor-exit(r9)
            return
        L_0x0036:
            java.util.HashMap r0 = r9.f5342c     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = r9.f5344f     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0050 }
            U0.e r0 = (U0.e) r0     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0053
            long r1 = r0.f5335c     // Catch:{ all -> 0x0050 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            int r0 = r0.f5334b     // Catch:{ all -> 0x0050 }
            int r1 = r10.f5316c     // Catch:{ all -> 0x0050 }
            if (r0 == r1) goto L_0x0053
            monitor-exit(r9)
            return
        L_0x0050:
            r10 = move-exception
            goto L_0x00fb
        L_0x0053:
            int r0 = r10.f5316c     // Catch:{ all -> 0x0050 }
            h1.B r1 = r10.f5317d     // Catch:{ all -> 0x0050 }
            U0.e r0 = r9.c(r0, r1)     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = r9.f5344f     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0063
            java.lang.String r1 = r0.f5333a     // Catch:{ all -> 0x0050 }
            r9.f5344f = r1     // Catch:{ all -> 0x0050 }
        L_0x0063:
            h1.B r1 = r10.f5317d     // Catch:{ all -> 0x0050 }
            r2 = 1
            if (r1 == 0) goto L_0x00b2
            boolean r1 = r1.b()     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x00b2
            h1.B r1 = new h1.B     // Catch:{ all -> 0x0050 }
            h1.B r3 = r10.f5317d     // Catch:{ all -> 0x0050 }
            java.lang.Object r4 = r3.f12277a     // Catch:{ all -> 0x0050 }
            long r5 = r3.f12280d     // Catch:{ all -> 0x0050 }
            int r3 = r3.f12278b     // Catch:{ all -> 0x0050 }
            r1.<init>(r4, r5, r3)     // Catch:{ all -> 0x0050 }
            int r3 = r10.f5316c     // Catch:{ all -> 0x0050 }
            U0.e r1 = r9.c(r3, r1)     // Catch:{ all -> 0x0050 }
            boolean r3 = r1.e     // Catch:{ all -> 0x0050 }
            if (r3 != 0) goto L_0x00b2
            r1.e = r2     // Catch:{ all -> 0x0050 }
            M0.X r1 = r10.f5315b     // Catch:{ all -> 0x0050 }
            h1.B r3 = r10.f5317d     // Catch:{ all -> 0x0050 }
            java.lang.Object r3 = r3.f12277a     // Catch:{ all -> 0x0050 }
            M0.V r4 = r9.f5341b     // Catch:{ all -> 0x0050 }
            r1.g(r3, r4)     // Catch:{ all -> 0x0050 }
            M0.V r1 = r9.f5341b     // Catch:{ all -> 0x0050 }
            h1.B r3 = r10.f5317d     // Catch:{ all -> 0x0050 }
            int r3 = r3.f12278b     // Catch:{ all -> 0x0050 }
            r1.d(r3)     // Catch:{ all -> 0x0050 }
            r3 = 0
            long r5 = P0.z.c0(r3)     // Catch:{ all -> 0x0050 }
            M0.V r1 = r9.f5341b     // Catch:{ all -> 0x0050 }
            long r7 = r1.e     // Catch:{ all -> 0x0050 }
            long r7 = P0.z.c0(r7)     // Catch:{ all -> 0x0050 }
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x0050 }
            U0.h r1 = r9.f5343d     // Catch:{ all -> 0x0050 }
            r1.getClass()     // Catch:{ all -> 0x0050 }
        L_0x00b2:
            boolean r1 = r0.e     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x00bd
            r0.e = r2     // Catch:{ all -> 0x0050 }
            U0.h r1 = r9.f5343d     // Catch:{ all -> 0x0050 }
            r1.getClass()     // Catch:{ all -> 0x0050 }
        L_0x00bd:
            java.lang.String r1 = r0.f5333a     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = r9.f5344f     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x00f9
            boolean r1 = r0.f5337f     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x00f9
            r0.f5337f = r2     // Catch:{ all -> 0x0050 }
            U0.h r1 = r9.f5343d     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r0.f5333a     // Catch:{ all -> 0x0050 }
            r1.getClass()     // Catch:{ all -> 0x0050 }
            h1.B r2 = r10.f5317d     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x00df
            boolean r2 = r2.b()     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x00df
            goto L_0x00f9
        L_0x00df:
            r1.b()     // Catch:{ all -> 0x0050 }
            r1.i = r0     // Catch:{ all -> 0x0050 }
            android.media.metrics.PlaybackMetrics$Builder r0 = U0.g.g()     // Catch:{ all -> 0x0050 }
            android.media.metrics.PlaybackMetrics$Builder r0 = r0.setPlayerName("AndroidXMedia3")     // Catch:{ all -> 0x0050 }
            android.media.metrics.PlaybackMetrics$Builder r0 = r0.setPlayerVersion("1.5.0")     // Catch:{ all -> 0x0050 }
            r1.f5354j = r0     // Catch:{ all -> 0x0050 }
            M0.X r0 = r10.f5315b     // Catch:{ all -> 0x0050 }
            h1.B r10 = r10.f5317d     // Catch:{ all -> 0x0050 }
            r1.c(r0, r10)     // Catch:{ all -> 0x0050 }
        L_0x00f9:
            monitor-exit(r9)
            return
        L_0x00fb:
            monitor-exit(r9)     // Catch:{ all -> 0x0050 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.f.f(U0.a):void");
    }

    public final synchronized void g(a aVar, int i8) {
        boolean z;
        try {
            this.f5343d.getClass();
            if (i8 == 0) {
                z = true;
            } else {
                z = false;
            }
            Iterator it = this.f5342c.values().iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar.a(aVar)) {
                    it.remove();
                    if (eVar.e) {
                        boolean equals = eVar.f5333a.equals(this.f5344f);
                        if (z && equals) {
                            boolean z6 = eVar.f5337f;
                        }
                        if (equals) {
                            a(eVar);
                        }
                        this.f5343d.d(aVar, eVar.f5333a);
                    }
                }
            }
            e(aVar);
        } finally {
            while (true) {
            }
        }
    }
}
