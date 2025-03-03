package h1;

import K.b;
import M0.C0132u;
import R0.h;
import R0.l;
import R0.z;
import android.net.Uri;
import d4.k;
import java.util.Collections;
import java.util.Map;
import l1.m;
import p1.G;

public final class N implements m {

    /* renamed from: U  reason: collision with root package name */
    public final long f12317U = C1053t.f12513b.getAndIncrement();

    /* renamed from: V  reason: collision with root package name */
    public final Uri f12318V;

    /* renamed from: W  reason: collision with root package name */
    public final z f12319W;

    /* renamed from: X  reason: collision with root package name */
    public final k f12320X;

    /* renamed from: Y  reason: collision with root package name */
    public final Q f12321Y;

    /* renamed from: Z  reason: collision with root package name */
    public final b f12322Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C0132u f12323a0 = new Object();

    /* renamed from: b0  reason: collision with root package name */
    public volatile boolean f12324b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f12325c0 = true;

    /* renamed from: d0  reason: collision with root package name */
    public long f12326d0;

    /* renamed from: e0  reason: collision with root package name */
    public l f12327e0 = a(0);

    /* renamed from: f0  reason: collision with root package name */
    public G f12328f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f12329g0;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Q f12330h0;

    /* JADX WARNING: type inference failed for: r1v2, types: [M0.u, java.lang.Object] */
    public N(Q q7, Uri uri, h hVar, k kVar, Q q8, b bVar) {
        this.f12330h0 = q7;
        this.f12318V = uri;
        this.f12319W = new z(hVar);
        this.f12320X = kVar;
        this.f12321Y = q8;
        this.f12322Z = bVar;
    }

    public final l a(long j7) {
        Collections.emptyMap();
        this.f12330h0.getClass();
        Map map = Q.f12335J0;
        Uri uri = this.f12318V;
        P0.l.l(uri, "The uri must be set.");
        return new l(uri, 1, (byte[]) null, map, j7, -1, (String) null, 6);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x011e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r17 = this;
            r1 = r17
            r0 = 0
            r2 = 0
        L_0x0004:
            if (r2 != 0) goto L_0x0163
            boolean r3 = r1.f12324b0
            if (r3 != 0) goto L_0x0163
            r3 = -1
            r5 = 1
            M0.u r6 = r1.f12323a0     // Catch:{ all -> 0x0053 }
            long r13 = r6.f3050a     // Catch:{ all -> 0x0053 }
            R0.l r6 = r1.a(r13)     // Catch:{ all -> 0x0053 }
            r1.f12327e0 = r6     // Catch:{ all -> 0x0053 }
            R0.z r7 = r1.f12319W     // Catch:{ all -> 0x0053 }
            long r6 = r7.f(r6)     // Catch:{ all -> 0x0053 }
            boolean r8 = r1.f12324b0     // Catch:{ all -> 0x0053 }
            if (r8 == 0) goto L_0x003f
            if (r2 != r5) goto L_0x0024
            goto L_0x0038
        L_0x0024:
            d4.k r0 = r1.f12320X
            long r5 = r0.w()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0038
            M0.u r0 = r1.f12323a0
            d4.k r2 = r1.f12320X
            long r2 = r2.w()
            r0.f3050a = r2
        L_0x0038:
            R0.z r0 = r1.f12319W
            R.e.d(r0)
            goto L_0x0163
        L_0x003f:
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x0051
            long r6 = r6 + r13
            h1.Q r8 = r1.f12330h0     // Catch:{ all -> 0x0053 }
            android.os.Handler r9 = r8.f12362k0     // Catch:{ all -> 0x0053 }
            h1.L r10 = new h1.L     // Catch:{ all -> 0x0053 }
            r11 = 0
            r10.<init>(r8, r11)     // Catch:{ all -> 0x0053 }
            r9.post(r10)     // Catch:{ all -> 0x0053 }
        L_0x0051:
            r15 = r6
            goto L_0x0056
        L_0x0053:
            r0 = move-exception
            goto L_0x0145
        L_0x0056:
            h1.Q r6 = r1.f12330h0     // Catch:{ all -> 0x0053 }
            R0.z r7 = r1.f12319W     // Catch:{ all -> 0x0053 }
            R0.h r7 = r7.f4322U     // Catch:{ all -> 0x0053 }
            java.util.Map r7 = r7.j()     // Catch:{ all -> 0x0053 }
            C1.b r7 = C1.b.k(r7)     // Catch:{ all -> 0x0053 }
            r6.f12364m0 = r7     // Catch:{ all -> 0x0053 }
            R0.z r6 = r1.f12319W     // Catch:{ all -> 0x0053 }
            h1.Q r7 = r1.f12330h0     // Catch:{ all -> 0x0053 }
            C1.b r7 = r7.f12364m0     // Catch:{ all -> 0x0053 }
            if (r7 == 0) goto L_0x008e
            int r7 = r7.f538Z     // Catch:{ all -> 0x0053 }
            r8 = -1
            if (r7 == r8) goto L_0x008e
            h1.s r8 = new h1.s     // Catch:{ all -> 0x0053 }
            r8.<init>(r6, r7, r1)     // Catch:{ all -> 0x0053 }
            h1.Q r6 = r1.f12330h0     // Catch:{ all -> 0x0053 }
            r6.getClass()     // Catch:{ all -> 0x0053 }
            h1.P r7 = new h1.P     // Catch:{ all -> 0x0053 }
            r7.<init>(r0, r5)     // Catch:{ all -> 0x0053 }
            p1.G r6 = r6.C(r7)     // Catch:{ all -> 0x0053 }
            r1.f12328f0 = r6     // Catch:{ all -> 0x0053 }
            M0.r r7 = h1.Q.f12336K0     // Catch:{ all -> 0x0053 }
            r6.c(r7)     // Catch:{ all -> 0x0053 }
            goto L_0x008f
        L_0x008e:
            r8 = r6
        L_0x008f:
            d4.k r7 = r1.f12320X     // Catch:{ all -> 0x0053 }
            android.net.Uri r9 = r1.f12318V     // Catch:{ all -> 0x0053 }
            R0.z r6 = r1.f12319W     // Catch:{ all -> 0x0053 }
            R0.h r6 = r6.f4322U     // Catch:{ all -> 0x0053 }
            java.util.Map r10 = r6.j()     // Catch:{ all -> 0x0053 }
            h1.Q r6 = r1.f12321Y     // Catch:{ all -> 0x0053 }
            r11 = r13
            r3 = r13
            r13 = r15
            r15 = r6
            r7.H2(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x0053 }
            h1.Q r6 = r1.f12330h0     // Catch:{ all -> 0x0053 }
            C1.b r6 = r6.f12364m0     // Catch:{ all -> 0x0053 }
            if (r6 == 0) goto L_0x00bf
            d4.k r6 = r1.f12320X     // Catch:{ all -> 0x0053 }
            java.lang.Object r6 = r6.f9767W     // Catch:{ all -> 0x0053 }
            p1.o r6 = (p1.o) r6     // Catch:{ all -> 0x0053 }
            if (r6 != 0) goto L_0x00b3
            goto L_0x00bf
        L_0x00b3:
            p1.o r6 = r6.c()     // Catch:{ all -> 0x0053 }
            boolean r7 = r6 instanceof I1.d     // Catch:{ all -> 0x0053 }
            if (r7 == 0) goto L_0x00bf
            I1.d r6 = (I1.d) r6     // Catch:{ all -> 0x0053 }
            r6.f2242s = r5     // Catch:{ all -> 0x0053 }
        L_0x00bf:
            boolean r6 = r1.f12325c0     // Catch:{ all -> 0x0053 }
            if (r6 == 0) goto L_0x00d3
            d4.k r6 = r1.f12320X     // Catch:{ all -> 0x0053 }
            long r7 = r1.f12326d0     // Catch:{ all -> 0x0053 }
            java.lang.Object r6 = r6.f9767W     // Catch:{ all -> 0x0053 }
            p1.o r6 = (p1.o) r6     // Catch:{ all -> 0x0053 }
            r6.getClass()     // Catch:{ all -> 0x0053 }
            r6.a(r3, r7)     // Catch:{ all -> 0x0053 }
            r1.f12325c0 = r0     // Catch:{ all -> 0x0053 }
        L_0x00d3:
            r13 = r3
        L_0x00d4:
            if (r2 != 0) goto L_0x0124
            boolean r3 = r1.f12324b0     // Catch:{ all -> 0x0053 }
            if (r3 != 0) goto L_0x0124
            K.b r3 = r1.f12322Z     // Catch:{ InterruptedException -> 0x011e }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x011e }
        L_0x00dd:
            boolean r4 = r3.f2535a     // Catch:{ all -> 0x00e5 }
            if (r4 != 0) goto L_0x00e7
            r3.wait()     // Catch:{ all -> 0x00e5 }
            goto L_0x00dd
        L_0x00e5:
            r0 = move-exception
            goto L_0x011c
        L_0x00e7:
            monitor-exit(r3)     // Catch:{ InterruptedException -> 0x011e }
            d4.k r3 = r1.f12320X     // Catch:{ all -> 0x0053 }
            M0.u r4 = r1.f12323a0     // Catch:{ all -> 0x0053 }
            java.lang.Object r6 = r3.f9767W     // Catch:{ all -> 0x0053 }
            p1.o r6 = (p1.o) r6     // Catch:{ all -> 0x0053 }
            r6.getClass()     // Catch:{ all -> 0x0053 }
            java.lang.Object r3 = r3.f9768X     // Catch:{ all -> 0x0053 }
            p1.l r3 = (p1.l) r3     // Catch:{ all -> 0x0053 }
            r3.getClass()     // Catch:{ all -> 0x0053 }
            int r2 = r6.e(r3, r4)     // Catch:{ all -> 0x0053 }
            d4.k r3 = r1.f12320X     // Catch:{ all -> 0x0053 }
            long r3 = r3.w()     // Catch:{ all -> 0x0053 }
            h1.Q r6 = r1.f12330h0     // Catch:{ all -> 0x0053 }
            long r6 = r6.f12354c0     // Catch:{ all -> 0x0053 }
            long r6 = r6 + r13
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d4
            K.b r6 = r1.f12322Z     // Catch:{ all -> 0x0053 }
            r6.b()     // Catch:{ all -> 0x0053 }
            h1.Q r6 = r1.f12330h0     // Catch:{ all -> 0x0053 }
            android.os.Handler r7 = r6.f12362k0     // Catch:{ all -> 0x0053 }
            h1.L r6 = r6.f12361j0     // Catch:{ all -> 0x0053 }
            r7.post(r6)     // Catch:{ all -> 0x0053 }
            goto L_0x00d3
        L_0x011c:
            monitor-exit(r3)     // Catch:{ all -> 0x00e5 }
            throw r0     // Catch:{ InterruptedException -> 0x011e }
        L_0x011e:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0053 }
            r0.<init>()     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0124:
            if (r2 != r5) goto L_0x0128
            r2 = 0
            goto L_0x013e
        L_0x0128:
            d4.k r3 = r1.f12320X
            long r3 = r3.w()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x013e
            M0.u r3 = r1.f12323a0
            d4.k r4 = r1.f12320X
            long r4 = r4.w()
            r3.f3050a = r4
        L_0x013e:
            R0.z r3 = r1.f12319W
            R.e.d(r3)
            goto L_0x0004
        L_0x0145:
            if (r2 == r5) goto L_0x015d
            d4.k r2 = r1.f12320X
            long r2 = r2.w()
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x015d
            M0.u r2 = r1.f12323a0
            d4.k r3 = r1.f12320X
            long r3 = r3.w()
            r2.f3050a = r3
        L_0x015d:
            R0.z r2 = r1.f12319W
            R.e.d(r2)
            throw r0
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.N.c():void");
    }

    public final void e() {
        this.f12324b0 = true;
    }
}
