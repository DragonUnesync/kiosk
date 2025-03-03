package a1;

import H3.i0;
import f1.v;

/* renamed from: a1.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0412c implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f7027U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f7028V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f7029W;

    public /* synthetic */ C0412c(v vVar, byte[] bArr, i0 i0Var) {
        this.f7027U = 7;
        this.f7028V = vVar;
        this.f7029W = bArr;
    }

    /* JADX WARNING: type inference failed for: r3v26, types: [java.io.IOException, B2.c] */
    /* JADX WARNING: type inference failed for: r3v54, types: [java.io.IOException] */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r0 = H3.O.p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02da, code lost:
        r0 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:88:0x02ba, B:144:0x0415] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:144:0x0415 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02da A[Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }, ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:88:0x02ba] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            r4 = 301(0x12d, float:4.22E-43)
            r5 = 461(0x1cd, float:6.46E-43)
            r6 = 401(0x191, float:5.62E-43)
            r7 = 200(0xc8, float:2.8E-43)
            r8 = 12
            r9 = 18
            r11 = 0
            r12 = 0
            r13 = 1
            int r14 = r1.f7027U
            switch(r14) {
                case 0: goto L_0x068c;
                case 1: goto L_0x061c;
                case 2: goto L_0x05f2;
                case 3: goto L_0x05de;
                case 4: goto L_0x05ce;
                case 5: goto L_0x05b7;
                case 6: goto L_0x0204;
                case 7: goto L_0x01e8;
                case 8: goto L_0x01d0;
                case 9: goto L_0x01c6;
                case 10: goto L_0x01ba;
                case 11: goto L_0x01ae;
                case 12: goto L_0x018e;
                case 13: goto L_0x0162;
                case 14: goto L_0x012a;
                case 15: goto L_0x011e;
                case 16: goto L_0x0112;
                case 17: goto L_0x00f9;
                case 18: goto L_0x00dc;
                case 19: goto L_0x00a4;
                case 20: goto L_0x0095;
                case 21: goto L_0x0071;
                case 22: goto L_0x0030;
                case 23: goto L_0x0024;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.Object r0 = r1.f7028V
            y4.b r0 = (y4.b) r0
            r0.getClass()
            java.lang.Object r0 = r1.f7029W
            A4.b r0 = (A4.b) r0
            com.bumptech.glide.g r0 = r0.f94a
            throw r11
        L_0x0024:
            java.lang.Object r0 = r1.f7029W
            D.C0 r0 = (D.C0) r0
            java.lang.Object r2 = r1.f7028V
            D.A0 r2 = (D.A0) r2
            r2.a(r0)
            return
        L_0x0030:
            java.lang.Object r0 = r1.f7028V
            u.t r0 = (u.C1479t) r0
            r0.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Use case "
            r2.<init>(r3)
            java.lang.Object r3 = r1.f7029W
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r4 = " INACTIVE"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.u(r2, r11)
            A1.d r2 = r0.f15686U
            java.lang.Object r2 = r2.f36W
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            boolean r4 = r2.containsKey(r3)
            if (r4 != 0) goto L_0x005e
            goto L_0x006d
        L_0x005e:
            java.lang.Object r4 = r2.get(r3)
            D.J0 r4 = (D.J0) r4
            r4.f804f = r12
            boolean r4 = r4.e
            if (r4 != 0) goto L_0x006d
            r2.remove(r3)
        L_0x006d:
            r0.L()
            return
        L_0x0071:
            java.lang.Object r0 = r1.f7028V
            u.t r0 = (u.C1479t) r0
            u.O r2 = r0.f15707q0
            java.lang.Object r3 = r1.f7029W
            a0.j r3 = (a0.j) r3
            if (r2 != 0) goto L_0x0083
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.a(r0)
            goto L_0x0094
        L_0x0083:
            java.lang.String r2 = u.C1479t.x(r2)
            A1.d r0 = r0.f15686U
            boolean r0 = r0.F(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.a(r0)
        L_0x0094:
            return
        L_0x0095:
            java.lang.Object r0 = r1.f7028V
            android.view.Surface r0 = (android.view.Surface) r0
            r0.release()
            java.lang.Object r0 = r1.f7029W
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0
            r0.release()
            return
        L_0x00a4:
            java.lang.Object r0 = r1.f7028V
            u.f r0 = (u.C1465f) r0
            r0.getClass()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.lang.Object r0 = r0.f15614b
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x00b8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00d2
            java.lang.Object r4 = r3.next()
            u.g r4 = (u.C1466g) r4
            java.lang.Object r5 = r1.f7029W
            android.hardware.camera2.TotalCaptureResult r5 = (android.hardware.camera2.TotalCaptureResult) r5
            boolean r5 = r4.b(r5)
            if (r5 == 0) goto L_0x00b8
            r2.add(r4)
            goto L_0x00b8
        L_0x00d2:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x00db
            r0.removeAll(r2)
        L_0x00db:
            return
        L_0x00dc:
            java.lang.Object r0 = r1.f7028V
            u.h r0 = (u.C1467h) r0
            long r2 = r0.k()
            u.e r4 = new u.e
            r4.<init>(r0, r2)
            a0.m r0 = com.bumptech.glide.d.i(r4)
            java.lang.Object r2 = r1.f7029W
            a0.j r2 = (a0.j) r2
            F.a r3 = D7.b.l()
            G.i.e(r13, r0, r2, r3)
            return
        L_0x00f9:
            java.lang.Object r0 = r1.f7028V
            u.h r0 = (u.C1467h) r0
            U.c r0 = r0.f15646q0
            java.lang.Object r2 = r0.f5254b
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.Object r3 = r1.f7029W
            D.l r3 = (D.C0054l) r3
            r2.remove(r3)
            java.lang.Object r0 = r0.f5255c
            android.util.ArrayMap r0 = (android.util.ArrayMap) r0
            r0.remove(r3)
            return
        L_0x0112:
            java.lang.Object r0 = r1.f7029W
            r7.k r0 = (r7.k) r0
            java.lang.Object r2 = r1.f7028V
            android.content.Context r2 = (android.content.Context) r2
            org.acra.config.LimitingReportAdministrator.notifyReportDropped$lambda$8(r2, r0)
            return
        L_0x011e:
            java.lang.Object r0 = r1.f7028V
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f7029W
            org.altbeacon.beacon.service.IntentScanStrategyCoordinator r2 = (org.altbeacon.beacon.service.IntentScanStrategyCoordinator) r2
            org.altbeacon.beacon.service.IntentScanStrategyCoordinator.runBackupScan$lambda$0(r0, r2)
            return
        L_0x012a:
            java.lang.Object r0 = r1.f7028V
            o1.k r0 = (o1.k) r0
            android.graphics.SurfaceTexture r2 = r0.f14194d0
            android.view.Surface r3 = r0.f14195e0
            android.view.Surface r4 = new android.view.Surface
            java.lang.Object r5 = r1.f7029W
            android.graphics.SurfaceTexture r5 = (android.graphics.SurfaceTexture) r5
            r4.<init>(r5)
            r0.f14194d0 = r5
            r0.f14195e0 = r4
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f14188U
            java.util.Iterator r0 = r0.iterator()
        L_0x0145:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0157
            java.lang.Object r5 = r0.next()
            T0.v r5 = (T0.C0229v) r5
            T0.y r5 = r5.f4905U
            r5.S(r4)
            goto L_0x0145
        L_0x0157:
            if (r2 == 0) goto L_0x015c
            r2.release()
        L_0x015c:
            if (r3 == 0) goto L_0x0161
            r3.release()
        L_0x0161:
            return
        L_0x0162:
            java.lang.Object r0 = r1.f7028V
            V0.i r0 = (V0.i) r0
            java.lang.Object r2 = r1.f7029W
            T0.f r2 = (T0.C0214f) r2
            r0.getClass()
            monitor-enter(r2)
            monitor-exit(r2)
            T0.v r0 = r0.f5528c
            int r3 = P0.z.f3748a
            T0.y r0 = r0.f4905U
            U0.d r0 = r0.f4958m0
            u.O r3 = r0.f5327X
            java.lang.Object r3 = r3.e
            h1.B r3 = (h1.C1031B) r3
            U0.a r3 = r0.I(r3)
            B.B r4 = new B.B
            r5 = 24
            r4.<init>((U0.a) r3, (java.lang.Object) r2, (int) r5)
            r2 = 1020(0x3fc, float:1.43E-42)
            r0.L(r3, r2, r4)
            return
        L_0x018e:
            java.lang.Object r0 = r1.f7028V
            V0.i r0 = (V0.i) r0
            r0.getClass()
            int r2 = P0.z.f3748a
            T0.v r0 = r0.f5528c
            T0.y r0 = r0.f4905U
            java.lang.Object r2 = r1.f7029W
            M0.h0 r2 = (M0.h0) r2
            r0.f4941Z0 = r2
            T0.u r3 = new T0.u
            r3.<init>(r2)
            r2 = 25
            P0.k r0 = r0.f4952g0
            r0.e(r2, r3)
            return
        L_0x01ae:
            java.lang.Object r0 = r1.f7028V
            l0.b r0 = (l0.C1169b) r0
            java.lang.Object r2 = r1.f7029W
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            r0.i(r2)
            return
        L_0x01ba:
            java.lang.Object r0 = r1.f7028V
            h1.Q r0 = (h1.Q) r0
            java.lang.Object r2 = r1.f7029W
            p1.z r2 = (p1.z) r2
            r0.D(r2)
            return
        L_0x01c6:
            java.lang.Object r0 = r1.f7028V
            P0.c r0 = (P0.c) r0
            java.lang.Object r2 = r1.f7029W
            r0.accept(r2)
            return
        L_0x01d0:
            java.lang.Object r0 = r1.f7029W
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Object r2 = r1.f7028V
            h.n r2 = (h.n) r2
            r2.getClass()
            r0.run()     // Catch:{ all -> 0x01e2 }
            r2.a()
            return
        L_0x01e2:
            r0 = move-exception
            r3 = r0
            r2.a()
            throw r3
        L_0x01e8:
            java.lang.Object r0 = r1.f7028V
            f1.v r0 = (f1.v) r0
            java.lang.Object r2 = r1.f7029W
            byte[] r2 = (byte[]) r2
            r0.getClass()
            java.io.OutputStream r3 = r0.f11621U     // Catch:{ Exception -> 0x01f9 }
            r3.write(r2)     // Catch:{ Exception -> 0x01f9 }
            goto L_0x0203
        L_0x01f9:
            f1.w r2 = r0.f11624X
            boolean r2 = r2.f11631Z
            if (r2 != 0) goto L_0x0203
            f1.w r0 = r0.f11624X
            de.ozerov.fully.K2 r0 = r0.f11626U
        L_0x0203:
            return
        L_0x0204:
            java.lang.Object r14 = r1.f7028V
            de.ozerov.fully.K2 r14 = (de.ozerov.fully.K2) r14
            java.lang.Object r15 = r1.f7029W
            H3.O r15 = (H3.O) r15
            java.lang.Object r0 = r14.f10051W
            r2 = r0
            f1.k r2 = (f1.k) r2
            r2.getClass()
            java.util.regex.Pattern r0 = f1.x.f11632a
            java.lang.Object r0 = r15.get(r12)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.util.regex.Pattern r10 = f1.x.f11633b
            java.util.regex.Matcher r0 = r10.matcher(r0)
            boolean r0 = r0.matches()
            java.lang.String r10 = "CSeq"
            if (r0 == 0) goto L_0x0459
            java.lang.Object r0 = r15.get(r12)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.util.regex.Pattern r11 = f1.x.f11633b
            java.util.regex.Matcher r0 = r11.matcher(r0)
            boolean r11 = r0.matches()
            P0.l.d(r11)
            java.lang.String r0 = r0.group(r13)
            r0.getClass()
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r11 = ""
            int r11 = r15.indexOf(r11)
            if (r11 <= 0) goto L_0x0253
            r16 = 1
            goto L_0x0255
        L_0x0253:
            r16 = 0
        L_0x0255:
            P0.l.d(r16)
            java.util.List r12 = r15.subList(r13, r11)
            Z1.c r3 = new Z1.c
            r3.<init>((int) r9)
            r3.h(r12)
            f1.l r9 = new f1.l
            r9.<init>(r3)
            G3.e r3 = new G3.e
            java.lang.String r12 = f1.x.f11638h
            r3.<init>(r12)
            int r11 = r11 + r13
            int r12 = r15.size()
            java.util.List r11 = r15.subList(r11, r12)
            java.lang.String r3 = r3.c(r11)
            D2.o r11 = new D2.o
            r11.<init>((int) r0, (int) r8, (java.lang.Object) r9, (java.lang.Object) r3)
            java.lang.Object r0 = r11.f1138W
            f1.l r0 = (f1.l) r0
            java.lang.String r3 = r0.c(r10)
            P0.l.h(r3)
            int r3 = java.lang.Integer.parseInt(r3)
            android.util.SparseArray r8 = r2.f11559Z
            java.lang.Object r8 = r8.get(r3)
            f1.y r8 = (f1.y) r8
            if (r8 != 0) goto L_0x029f
            goto L_0x05b6
        L_0x029f:
            android.util.SparseArray r9 = r2.f11559Z
            r9.remove(r3)
            java.lang.String r3 = "Transport"
            int r9 = r11.f1137V
            int r10 = r8.f11640b
            if (r9 == r7) goto L_0x03c1
            java.lang.String r7 = " "
            if (r9 == r6) goto L_0x0354
            if (r9 == r5) goto L_0x0319
            if (r9 == r4) goto L_0x02e0
            r3 = 302(0x12e, float:4.23E-43)
            if (r9 == r3) goto L_0x02e0
            B2.c r0 = new B2.c     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r3.<init>()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r4 = f1.x.h(r10)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r3.append(r4)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r3.append(r7)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r3.append(r9)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r3 = r3.toString()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r0.<init>(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            f1.k.m(r2, r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x05b6
        L_0x02da:
            r0 = move-exception
            goto L_0x044f
        L_0x02dd:
            r0 = move-exception
            goto L_0x044f
        L_0x02e0:
            int r3 = r2.f11568i0     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r4 = -1
            if (r3 == r4) goto L_0x02e8
            r3 = 0
            r2.f11568i0 = r3     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
        L_0x02e8:
            java.lang.String r3 = "Location"
            java.lang.String r0 = r0.c(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            if (r0 != 0) goto L_0x02fa
            Z1.c r0 = r2.f11554U     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r3 = "Redirection without new location."
            r4 = 0
            r0.u(r3, r4)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x05b6
        L_0x02fa:
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            android.net.Uri r3 = f1.x.f(r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r2.f11561b0 = r3     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            T7.C r0 = f1.x.d(r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r2.f11563d0 = r0     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            D2.o r0 = r2.f11560a0     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            android.net.Uri r3 = r2.f11561b0     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r4 = r2.f11564e0     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r0.p(r3, r4)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x05b6
        L_0x0319:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r0.<init>()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r4 = f1.x.h(r10)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r0.append(r4)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r0.append(r7)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r0.append(r9)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r0 = r0.toString()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            f1.l r4 = r8.f11641c     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r3 = r4.c(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            P0.l.h(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r4 = 10
            if (r10 != r4) goto L_0x034a
            java.lang.String r4 = "TCP"
            boolean r3 = r3.contains(r4)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            if (r3 != 0) goto L_0x034a
            f1.r r3 = new f1.r     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r3.<init>(r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x034f
        L_0x034a:
            B2.c r3 = new B2.c     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r3.<init>(r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
        L_0x034f:
            f1.k.m(r2, r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x05b6
        L_0x0354:
            T7.C r3 = r2.f11563d0     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            if (r3 == 0) goto L_0x03a1
            boolean r3 = r2.f11570k0     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            if (r3 != 0) goto L_0x03a1
            java.lang.String r3 = "WWW-Authenticate"
            r0.getClass()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r3 = f1.l.b(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            H3.Q r0 = r0.f11573a     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            H3.O r0 = r0.d(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            boolean r3 = r0.isEmpty()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            if (r3 != 0) goto L_0x0399
            r12 = 0
        L_0x0372:
            int r3 = r0.size()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            if (r12 >= r3) goto L_0x038e
            java.lang.Object r3 = r0.get(r12)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            P0.q r3 = f1.x.e(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r2.f11567h0 = r3     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            P0.q r3 = r2.f11567h0     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            int r3 = r3.f3727b     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r4 = 2
            if (r3 != r4) goto L_0x038c
            goto L_0x038e
        L_0x038c:
            int r12 = r12 + r13
            goto L_0x0372
        L_0x038e:
            D2.o r0 = r2.f11560a0     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r0.o()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r2.f11570k0 = r13     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x05b6
        L_0x0399:
            java.lang.String r0 = "Missing WWW-Authenticate header in a 401 response."
            r3 = 0
            M0.J r0 = M0.J.b(r3, r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            throw r0     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
        L_0x03a1:
            B2.c r0 = new B2.c     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r3.<init>()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r4 = f1.x.h(r10)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r3.append(r4)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r3.append(r7)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r3.append(r9)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r3 = r3.toString()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r0.<init>(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            f1.k.m(r2, r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x05b6
        L_0x03c1:
            switch(r10) {
                case 1: goto L_0x05b6;
                case 2: goto L_0x043c;
                case 3: goto L_0x05b6;
                case 4: goto L_0x0428;
                case 5: goto L_0x0423;
                case 6: goto L_0x03f0;
                case 7: goto L_0x05b6;
                case 8: goto L_0x05b6;
                case 9: goto L_0x05b6;
                case 10: goto L_0x03ca;
                case 11: goto L_0x05b6;
                case 12: goto L_0x05b6;
                default: goto L_0x03c4;
            }     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
        L_0x03c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r0.<init>()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            throw r0     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
        L_0x03ca:
            java.lang.String r4 = "Session"
            java.lang.String r4 = r0.c(r4)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r0 = r0.c(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            if (r4 == 0) goto L_0x03e8
            if (r0 == 0) goto L_0x03e8
            P5.E r0 = f1.x.c(r4)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            Z1.c r3 = new Z1.c     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r4 = 23
            r3.<init>((int) r4, (java.lang.Object) r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r14.O(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x05b6
        L_0x03e8:
            java.lang.String r0 = "Missing mandatory session or transport header"
            r3 = 0
            M0.J r0 = M0.J.b(r3, r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            throw r0     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
        L_0x03f0:
            java.lang.String r3 = "Range"
            java.lang.String r3 = r0.c(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            if (r3 != 0) goto L_0x03fb
            f1.z r3 = f1.z.f11643c     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x03ff
        L_0x03fb:
            f1.z r3 = f1.z.a(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
        L_0x03ff:
            java.lang.String r4 = "RTP-Info"
            java.lang.String r0 = r0.c(r4)     // Catch:{ J -> 0x0415, IllegalArgumentException -> 0x02da }
            if (r0 != 0) goto L_0x040c
            H3.i0 r0 = H3.O.p()     // Catch:{ J -> 0x0415, IllegalArgumentException -> 0x02da }
            goto L_0x0419
        L_0x040c:
            android.net.Uri r4 = r2.f11561b0     // Catch:{ J -> 0x0415, IllegalArgumentException -> 0x02da }
            H3.i0 r0 = f1.C0882A.a(r4, r0)     // Catch:{ J -> 0x0415, IllegalArgumentException -> 0x02da }
            goto L_0x0419
        L_0x0415:
            H3.i0 r0 = H3.O.p()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
        L_0x0419:
            de.ozerov.fully.K2 r4 = new de.ozerov.fully.K2     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r4.<init>((f1.z) r3, (H3.i0) r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r14.M(r4)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x05b6
        L_0x0423:
            r14.L()     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x05b6
        L_0x0428:
            Z1.c r3 = new Z1.c     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r4 = "Public"
            java.lang.String r0 = r0.c(r4)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            H3.i0 r0 = f1.x.b(r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r3.<init>((H3.i0) r0)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r14.K(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x05b6
        L_0x043c:
            de.ozerov.fully.K2 r3 = new de.ozerov.fully.K2     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.Object r4 = r11.f1139X     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            f1.C r4 = f1.C0885D.a(r4)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r5 = 7
            r3.<init>((java.lang.Object) r0, (int) r5, (java.lang.Object) r4)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            r14.I(r3)     // Catch:{ J -> 0x02dd, IllegalArgumentException -> 0x02da }
            goto L_0x05b6
        L_0x044f:
            B2.c r3 = new B2.c
            r3.<init>(r0)
            f1.k.m(r2, r3)
            goto L_0x05b6
        L_0x0459:
            r0 = 0
            java.lang.Object r3 = r15.get(r0)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.util.regex.Pattern r0 = f1.x.f11632a
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r3 = r0.matches()
            P0.l.d(r3)
            java.lang.String r3 = r0.group(r13)
            r3.getClass()
            f1.x.a(r3)
            r3 = 2
            java.lang.String r0 = r0.group(r3)
            r0.getClass()
            android.net.Uri.parse(r0)
            java.lang.String r0 = ""
            int r3 = r15.indexOf(r0)
            if (r3 <= 0) goto L_0x048c
            r11 = 1
            goto L_0x048d
        L_0x048c:
            r11 = 0
        L_0x048d:
            P0.l.d(r11)
            java.util.List r11 = r15.subList(r13, r3)
            Z1.c r12 = new Z1.c
            r12.<init>((int) r9)
            r12.h(r11)
            f1.l r9 = r12.j()
            G3.e r11 = new G3.e
            java.lang.String r12 = f1.x.f11638h
            r11.<init>(r12)
            int r3 = r3 + r13
            int r12 = r15.size()
            java.util.List r3 = r15.subList(r3, r12)
            r11.c(r3)
            java.lang.String r3 = r9.c(r10)
            r3.getClass()
            int r3 = java.lang.Integer.parseInt(r3)
            D2.o r9 = new D2.o
            Z1.c r10 = new Z1.c
            D2.o r2 = r2.f11560a0
            java.lang.Object r11 = r2.f1139X
            f1.k r11 = (f1.k) r11
            java.lang.String r12 = r11.f11556W
            java.lang.String r14 = r11.f11564e0
            r10.<init>(r3, r12, r14)
            f1.l r10 = r10.j()
            r12 = 405(0x195, float:5.68E-43)
            r9.<init>((int) r12, (int) r8, (java.lang.Object) r10, (java.lang.Object) r0)
            java.lang.Object r0 = r9.f1138W
            f1.l r0 = (f1.l) r0
            java.lang.String r8 = "CSeq"
            java.lang.String r8 = r0.c(r8)
            if (r8 == 0) goto L_0x04e6
            r8 = 1
            goto L_0x04e7
        L_0x04e6:
            r8 = 0
        L_0x04e7:
            P0.l.d(r8)
            H3.L r8 = new H3.L
            r8.<init>()
            int r10 = r9.f1137V
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            if (r10 == r7) goto L_0x0546
            if (r10 == r5) goto L_0x0543
            r5 = 500(0x1f4, float:7.0E-43)
            if (r10 == r5) goto L_0x0540
            r5 = 505(0x1f9, float:7.08E-43)
            if (r10 == r5) goto L_0x053d
            if (r10 == r4) goto L_0x053a
            r4 = 302(0x12e, float:4.23E-43)
            if (r10 == r4) goto L_0x0537
            r4 = 400(0x190, float:5.6E-43)
            if (r10 == r4) goto L_0x0534
            if (r10 == r6) goto L_0x0531
            r4 = 404(0x194, float:5.66E-43)
            if (r10 == r4) goto L_0x052e
            r4 = 405(0x195, float:5.68E-43)
            if (r10 == r4) goto L_0x052b
            switch(r10) {
                case 454: goto L_0x0528;
                case 455: goto L_0x0525;
                case 456: goto L_0x0522;
                case 457: goto L_0x051e;
                default: goto L_0x0518;
            }
        L_0x0518:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x051e:
            java.lang.String r4 = "Invalid Range"
        L_0x0520:
            r5 = 3
            goto L_0x0549
        L_0x0522:
            java.lang.String r4 = "Header Field Not Valid"
            goto L_0x0520
        L_0x0525:
            java.lang.String r4 = "Method Not Valid In This State"
            goto L_0x0520
        L_0x0528:
            java.lang.String r4 = "Session Not Found"
            goto L_0x0520
        L_0x052b:
            java.lang.String r4 = "Method Not Allowed"
            goto L_0x0520
        L_0x052e:
            java.lang.String r4 = "Not Found"
            goto L_0x0520
        L_0x0531:
            java.lang.String r4 = "Unauthorized"
            goto L_0x0520
        L_0x0534:
            java.lang.String r4 = "Bad Request"
            goto L_0x0520
        L_0x0537:
            java.lang.String r4 = "Move Temporarily"
            goto L_0x0520
        L_0x053a:
            java.lang.String r4 = "Move Permanently"
            goto L_0x0520
        L_0x053d:
            java.lang.String r4 = "RTSP Version Not Supported"
            goto L_0x0520
        L_0x0540:
            java.lang.String r4 = "Internal Server Error"
            goto L_0x0520
        L_0x0543:
            java.lang.String r4 = "Unsupported Transport"
            goto L_0x0520
        L_0x0546:
            java.lang.String r4 = "OK"
            goto L_0x0520
        L_0x0549:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "RTSP/1.0"
            r7 = 0
            r5[r7] = r6
            r5[r13] = r12
            r6 = 2
            r5[r6] = r4
            java.lang.String r4 = "%s %s %s"
            java.lang.String r4 = P0.z.n(r4, r5)
            r8.c(r4)
            H3.Q r0 = r0.a()
            H3.U r4 = r0.e()
            H3.x0 r4 = r4.iterator()
        L_0x056a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0598
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            H3.O r6 = r0.d(r5)
            r7 = 0
        L_0x057b:
            int r10 = r6.size()
            if (r7 >= r10) goto L_0x056a
            java.lang.Object r10 = r6.get(r7)
            r12 = 2
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r15 = 0
            r14[r15] = r5
            r14[r13] = r10
            java.lang.String r10 = "%s: %s"
            java.lang.String r10 = P0.z.n(r10, r14)
            r8.c(r10)
            int r7 = r7 + r13
            goto L_0x057b
        L_0x0598:
            java.lang.String r0 = ""
            r8.c(r0)
            java.lang.Object r0 = r9.f1139X
            java.lang.String r0 = (java.lang.String) r0
            r8.c(r0)
            H3.i0 r0 = r8.g()
            f1.w r4 = r11.f11562c0
            r4.l(r0)
            int r0 = r2.f1137V
            int r3 = r3 + r13
            int r0 = java.lang.Math.max(r0, r3)
            r2.f1137V = r0
        L_0x05b6:
            return
        L_0x05b7:
            java.lang.Object r0 = r1.f7028V
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            android.support.v4.media.session.b r2 = r0.k()
            java.lang.Object r3 = r1.f7029W
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r2.H(r3)
            android.support.v4.media.session.b r0 = r0.k()
            r0.G(r13)
            return
        L_0x05ce:
            java.lang.Object r0 = r1.f7028V
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            android.support.v4.media.session.b r0 = r0.k()
            java.lang.Object r2 = r1.f7029W
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            r0.E(r2)
            return
        L_0x05de:
            java.lang.Object r0 = r1.f7029W
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.lang.Object r2 = r1.f7028V
            de.ozerov.fully.d4 r2 = (de.ozerov.fully.C0685d4) r2
            r2.getClass()
            long r2 = r2.f10602U     // Catch:{ InterruptedException -> 0x05f1 }
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x05f1 }
            r0.interrupt()     // Catch:{ InterruptedException -> 0x05f1 }
        L_0x05f1:
            return
        L_0x05f2:
            java.lang.Object r0 = r1.f7028V
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.ArrayList r2 = de.ozerov.fully.C0783u1.a(r0)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x061b
            java.lang.Object r3 = r1.f7029W
            de.ozerov.fully.FullyActivity r3 = (de.ozerov.fully.FullyActivity) r3
            java.lang.String r4 = "Migrating local files..."
            n2.a.b1(r3, r4)
            de.ozerov.fully.C0783u1.b(r3, r0, r2)
            boolean r0 = r3.w()
            if (r0 == 0) goto L_0x061b
            de.ozerov.fully.n0 r0 = new de.ozerov.fully.n0
            r2 = 4
            r0.<init>(r3, r2)
            r3.runOnUiThread(r0)
        L_0x061b:
            return
        L_0x061c:
            java.lang.Object r0 = r1.f7028V
            de.ozerov.fully.c r0 = (de.ozerov.fully.C0674c) r0
            de.ozerov.fully.FullyActivity r2 = r0.f10573a
            boolean r2 = r2.w()
            if (r2 == 0) goto L_0x068b
            d4.k r0 = r0.f10574b
            int r0 = r0.j()
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.<init>(r0, r3)
            r3 = 0
        L_0x0636:
            java.lang.Object r4 = r1.f7029W
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            int r5 = r4.getChildCount()
            if (r3 >= r5) goto L_0x068b
            android.view.View r5 = r4.getChildAt(r3)
            boolean r6 = r5 instanceof android.widget.ImageButton
            boolean r6 = r5 instanceof androidx.appcompat.widget.ActionMenuView
            if (r6 == 0) goto L_0x0682
            r6 = 0
        L_0x064b:
            r7 = r5
            androidx.appcompat.widget.ActionMenuView r7 = (androidx.appcompat.widget.ActionMenuView) r7
            int r8 = r7.getChildCount()
            if (r6 >= r8) goto L_0x0682
            android.view.View r7 = r7.getChildAt(r6)
            boolean r8 = r7 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r8 == 0) goto L_0x067f
            r8 = 0
        L_0x065d:
            r9 = r7
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            android.graphics.drawable.Drawable[] r10 = r9.getCompoundDrawables()
            int r10 = r10.length
            if (r8 >= r10) goto L_0x067f
            android.graphics.drawable.Drawable[] r9 = r9.getCompoundDrawables()
            r9 = r9[r8]
            if (r9 == 0) goto L_0x067c
            P0.g r9 = new P0.g
            r10 = r7
            androidx.appcompat.view.menu.ActionMenuItemView r10 = (androidx.appcompat.view.menu.ActionMenuItemView) r10
            r11 = 3
            r9.<init>((java.lang.Object) r10, (int) r8, (java.lang.Object) r2, (int) r11)
            r7.post(r9)
            goto L_0x067d
        L_0x067c:
            r11 = 3
        L_0x067d:
            int r8 = r8 + r13
            goto L_0x065d
        L_0x067f:
            r11 = 3
            int r6 = r6 + r13
            goto L_0x064b
        L_0x0682:
            r11 = 3
            r4.setTitleTextColor((int) r0)
            r4.setSubtitleTextColor((int) r0)
            int r3 = r3 + r13
            goto L_0x0636
        L_0x068b:
            return
        L_0x068c:
            java.lang.Object r0 = r1.f7028V
            a1.d r0 = (a1.C0413d) r0
            r2 = 0
            r0.f7038c0 = r2
            java.lang.Object r2 = r1.f7029W
            android.net.Uri r2 = (android.net.Uri) r2
            r0.d(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0412c.run():void");
    }

    public /* synthetic */ C0412c(Object obj, int i, Object obj2) {
        this.f7027U = i;
        this.f7028V = obj;
        this.f7029W = obj2;
    }
}
