package B;

import a0.j;
import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: B.u  reason: case insensitive filesystem */
public final /* synthetic */ class C0019u implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f318U = 0;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0020v f319V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Executor f320W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ long f321X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f322Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f323Z;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ j f324a0;

    public /* synthetic */ C0019u(C0020v vVar, Context context, Executor executor, int i, j jVar, long j7) {
        this.f319V = vVar;
        this.f323Z = context;
        this.f320W = executor;
        this.f322Y = i;
        this.f324a0 = jVar;
        this.f321X = j7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x010c A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011c A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0161 A[Catch:{ all -> 0x00a5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r1 = r22
            int r0 = r1.f318U
            switch(r0) {
                case 0: goto L_0x0023;
                default: goto L_0x0007;
            }
        L_0x0007:
            int r0 = r1.f322Y
            int r6 = r0 + 1
            a0.j r7 = r1.f324a0
            B.v r3 = r1.f319V
            r3.getClass()
            B.u r0 = new B.u
            android.content.Context r4 = r1.f323Z
            java.util.concurrent.Executor r10 = r1.f320W
            long r8 = r1.f321X
            r2 = r0
            r5 = r10
            r2.<init>((B.C0020v) r3, (android.content.Context) r4, (java.util.concurrent.Executor) r5, (int) r6, (a0.j) r7, (long) r8)
            r10.execute(r0)
            return
        L_0x0023:
            B.v r12 = r1.f319V
            android.content.Context r0 = r1.f323Z
            java.util.concurrent.Executor r13 = r1.f320W
            int r2 = r1.f322Y
            a0.j r3 = r1.f324a0
            long r14 = r1.f321X
            r12.getClass()
            java.lang.String r4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: "
            java.lang.String r5 = "Retry init. Start time "
            java.lang.String r6 = "CX:initAndRetryRecursively"
            java.lang.String r6 = F.h.H(r6)
            android.os.Trace.beginSection(r6)
            android.content.Context r6 = com.bumptech.glide.d.h(r0)
            r7 = 0
            B.w r0 = r12.f329c     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            s.a r0 = r0.b()     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            if (r0 == 0) goto L_0x00ee
            java.util.concurrent.Executor r0 = r12.f330d     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            android.os.Handler r8 = r12.e     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            D.b r9 = new D.b     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r9.<init>(r0, r8)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            B.w r0 = r12.f329c     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            B.s r0 = r0.a()     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            B.w r8 = r12.f329c     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            long r20 = r8.c()     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            u.i r8 = new u.i     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r16 = r8
            r17 = r6
            r18 = r9
            r19 = r0
            r16.<init>(r17, r18, r19, r20)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r12.f331f = r8     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            B.w r8 = r12.f329c     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            s.b r8 = r8.d()     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            if (r8 == 0) goto L_0x00e1
            u.i r8 = r12.f331f     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            v.r r9 = r8.e     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            java.util.ArrayList r8 = r8.f15651f     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r10.<init>(r8)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            de.ozerov.fully.K2 r8 = s.b.a(r6, r9, r10)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r12.f332g = r8     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            B.w r8 = r12.f329c     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            s.c r8 = r8.e()     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            if (r8 == 0) goto L_0x00d4
            u.A r8 = new u.A     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r8.<init>(r6)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r12.f333h = r8     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            boolean r8 = r13 instanceof B.C0015p     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            if (r8 == 0) goto L_0x00ae
            r8 = r13
            B.p r8 = (B.C0015p) r8     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            u.i r9 = r12.f331f     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r8.a(r9)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            goto L_0x00ae
        L_0x00a5:
            r0 = move-exception
            goto L_0x01b4
        L_0x00a8:
            r0 = move-exception
            goto L_0x00fb
        L_0x00aa:
            r0 = move-exception
            goto L_0x00fb
        L_0x00ac:
            r0 = move-exception
            goto L_0x00fb
        L_0x00ae:
            A1.d r8 = r12.f327a     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            u.i r9 = r12.f331f     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r8.D(r9)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            A1.d r8 = r12.f327a     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            D.H.a(r6, r8, r0)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r0 = 1
            if (r2 <= r0) goto L_0x00c9
            boolean r0 = F.h.t()     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = "CX:CameraProvider-RetryStatus"
            r8 = -1
            F.h.B(r8, r0)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
        L_0x00c9:
            r12.c()     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r3.a(r7)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
        L_0x00cf:
            android.os.Trace.endSection()
            goto L_0x01b0
        L_0x00d4:
            B.Y r0 = new B.Y     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            java.lang.String r9 = "Invalid app configuration provided. Missing UseCaseConfigFactory."
            r8.<init>(r9)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r0.<init>(r8)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            throw r0     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
        L_0x00e1:
            B.Y r0 = new B.Y     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            java.lang.String r9 = "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."
            r8.<init>(r9)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r0.<init>(r8)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            throw r0     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
        L_0x00ee:
            B.Y r0 = new B.Y     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            java.lang.String r9 = "Invalid app configuration provided. Missing CameraFactory."
            r8.<init>(r9)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            r0.<init>(r8)     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
            throw r0     // Catch:{ G -> 0x00ac, Y -> 0x00aa, RuntimeException -> 0x00a8 }
        L_0x00fb:
            D.A r8 = new D.A     // Catch:{ all -> 0x00a5 }
            r8.<init>(r14, r0)     // Catch:{ all -> 0x00a5 }
            B.i0 r9 = r12.i     // Catch:{ all -> 0x00a5 }
            B.h0 r9 = r9.a(r8)     // Catch:{ all -> 0x00a5 }
            boolean r10 = F.h.t()     // Catch:{ all -> 0x00a5 }
            if (r10 == 0) goto L_0x0113
            int r8 = r8.f738a     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = "CX:CameraProvider-RetryStatus"
            F.h.B(r8, r10)     // Catch:{ all -> 0x00a5 }
        L_0x0113:
            boolean r8 = r9.f258b     // Catch:{ all -> 0x00a5 }
            if (r8 == 0) goto L_0x0161
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r8) goto L_0x0161
            java.lang.String r4 = "CameraX"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r7.<init>(r5)     // Catch:{ all -> 0x00a5 }
            r7.append(r14)     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = " current time "
            r7.append(r5)     // Catch:{ all -> 0x00a5 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00a5 }
            r7.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x00a5 }
            F.h.J(r4, r5, r0)     // Catch:{ all -> 0x00a5 }
            android.os.Handler r0 = r12.e     // Catch:{ all -> 0x00a5 }
            B.u r4 = new B.u     // Catch:{ all -> 0x00a5 }
            r11 = r4
            r16 = r2
            r17 = r6
            r18 = r3
            r11.<init>((B.C0020v) r12, (java.util.concurrent.Executor) r13, (long) r14, (int) r16, (android.content.Context) r17, (a0.j) r18)     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "retry_token"
            long r5 = r9.f257a     // Catch:{ all -> 0x00a5 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a5 }
            r7 = 28
            if (r3 < r7) goto L_0x0156
            k0.C1131a.l(r0, r4, r5)     // Catch:{ all -> 0x00a5 }
            goto L_0x00cf
        L_0x0156:
            android.os.Message r3 = android.os.Message.obtain(r0, r4)     // Catch:{ all -> 0x00a5 }
            r3.obj = r2     // Catch:{ all -> 0x00a5 }
            r0.sendMessageDelayed(r3, r5)     // Catch:{ all -> 0x00a5 }
            goto L_0x00cf
        L_0x0161:
            java.lang.Object r2 = r12.f328b     // Catch:{ all -> 0x00a5 }
            monitor-enter(r2)     // Catch:{ all -> 0x00a5 }
            r5 = 3
            r12.f335k = r5     // Catch:{ all -> 0x01b1 }
            monitor-exit(r2)     // Catch:{ all -> 0x01b1 }
            boolean r2 = r9.f259c     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x0174
            r12.c()     // Catch:{ all -> 0x00a5 }
            r3.a(r7)     // Catch:{ all -> 0x00a5 }
            goto L_0x00cf
        L_0x0174:
            boolean r2 = r0 instanceof D.G     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x019d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r2.<init>(r4)     // Catch:{ all -> 0x00a5 }
            r4 = r0
            D.G r4 = (D.G) r4     // Catch:{ all -> 0x00a5 }
            int r4 = r4.f772U     // Catch:{ all -> 0x00a5 }
            r2.append(r4)     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = "CameraX"
            F.h.m(r4, r2, r0)     // Catch:{ all -> 0x00a5 }
            B.Y r0 = new B.Y     // Catch:{ all -> 0x00a5 }
            B.t r4 = new B.t     // Catch:{ all -> 0x00a5 }
            r4.<init>(r2)     // Catch:{ all -> 0x00a5 }
            r0.<init>(r4)     // Catch:{ all -> 0x00a5 }
            r3.b(r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x00cf
        L_0x019d:
            boolean r2 = r0 instanceof B.Y     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x01a6
            r3.b(r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x00cf
        L_0x01a6:
            B.Y r2 = new B.Y     // Catch:{ all -> 0x00a5 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a5 }
            r3.b(r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x00cf
        L_0x01b0:
            return
        L_0x01b1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01b1 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x01b4:
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C0019u.run():void");
    }

    public /* synthetic */ C0019u(C0020v vVar, Executor executor, long j7, int i, Context context, j jVar) {
        this.f319V = vVar;
        this.f320W = executor;
        this.f321X = j7;
        this.f322Y = i;
        this.f323Z = context;
        this.f324a0 = jVar;
    }
}
