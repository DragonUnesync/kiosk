package P5;

/* renamed from: P5.f  reason: case insensitive filesystem */
public final /* synthetic */ class C0143f implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3904U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f3905V;

    public /* synthetic */ C0143f(int i, Object obj) {
        this.f3904U = i;
        this.f3905V = obj;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:15|16|17|18|19|20|93) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            int r3 = r4.f3904U
            switch(r3) {
                case 0: goto L_0x0254;
                case 1: goto L_0x024c;
                case 2: goto L_0x0240;
                case 3: goto L_0x0234;
                case 4: goto L_0x0228;
                case 5: goto L_0x021a;
                case 6: goto L_0x0200;
                case 7: goto L_0x01ed;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01a6;
                case 11: goto L_0x018e;
                case 12: goto L_0x017e;
                case 13: goto L_0x0172;
                case 14: goto L_0x0168;
                case 15: goto L_0x0154;
                case 16: goto L_0x0148;
                case 17: goto L_0x0132;
                case 18: goto L_0x0128;
                case 19: goto L_0x011c;
                case 20: goto L_0x0110;
                case 21: goto L_0x0104;
                case 22: goto L_0x00f6;
                case 23: goto L_0x00ea;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00b1;
                case 26: goto L_0x00a5;
                case 27: goto L_0x007d;
                case 28: goto L_0x004f;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r0 = r4.f3905V
            P5.O r0 = (P5.O) r0
            r0.getClass()
            java.lang.Object r1 = r0.f3852V     // Catch:{ Exception -> 0x002c }
            P5.P r1 = (P5.P) r1     // Catch:{ Exception -> 0x002c }
            java.net.ServerSocket r2 = r1.f3861b     // Catch:{ Exception -> 0x002c }
            if (r2 == 0) goto L_0x002e
            java.lang.Thread r2 = r1.f3863d     // Catch:{ Exception -> 0x002c }
            if (r2 == 0) goto L_0x002e
            java.net.ServerSocket r2 = r1.f3861b     // Catch:{ Exception -> 0x002c }
            boolean r2 = r2.isClosed()     // Catch:{ Exception -> 0x002c }
            if (r2 != 0) goto L_0x002e
            java.lang.Thread r1 = r1.f3863d     // Catch:{ Exception -> 0x002c }
            boolean r1 = r1.isAlive()     // Catch:{ Exception -> 0x002c }
            if (r1 == 0) goto L_0x002e
            goto L_0x004e
        L_0x002c:
            r0 = move-exception
            goto L_0x0042
        L_0x002e:
            java.lang.Object r1 = r0.f3852V     // Catch:{ Exception -> 0x002c }
            P5.P r1 = (P5.P) r1     // Catch:{ Exception -> 0x002c }
            r1.k()     // Catch:{ Exception -> 0x002c }
            r1 = 3000(0xbb8, double:1.482E-320)
            java.lang.Thread.sleep(r1)     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            java.lang.Object r0 = r0.f3852V     // Catch:{ Exception -> 0x002c }
            P5.P r0 = (P5.P) r0     // Catch:{ Exception -> 0x002c }
            r0.j()     // Catch:{ Exception -> 0x002c }
            goto L_0x004e
        L_0x0042:
            boolean r1 = P5.P.f3858r
            java.lang.String r1 = "P"
            java.lang.String r2 = "Remote admin watchdog fails"
            android.util.Log.e(r1, r2)
            r0.printStackTrace()
        L_0x004e:
            return
        L_0x004f:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            r0.getClass()
            de.ozerov.fully.FullyActivity r1 = r0.f3879b     // Catch:{ Exception -> 0x0064 }
            java.lang.String r3 = "device_policy"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x0064 }
            android.app.admin.DevicePolicyManager r1 = (android.app.admin.DevicePolicyManager) r1     // Catch:{ Exception -> 0x0064 }
            r1.wipeData(r2)     // Catch:{ Exception -> 0x0064 }
            goto L_0x007c
        L_0x0064:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Wiping failed due to "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = r0.f3878a
            android.util.Log.e(r0, r1)
        L_0x007c:
            return
        L_0x007d:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r2 = r0.f3879b
            b3.a r2 = r2.f9921J0
            r2.d()
            de.ozerov.fully.FullyActivity r2 = r0.f3879b
            de.ozerov.fully.w3 r2 = r2.f9943f1
            r2.f()
            de.ozerov.fully.FullyActivity r2 = r0.f3879b
            U.d r2 = r2.f9919H0
            r2.b()
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.Q3 r0 = r0.f9913C0
            r0.c()
            java.lang.String r0 = "Kiosk unlocked by Remote Admin"
            java.lang.String r2 = "ModuleUnlockKiosk"
            de.ozerov.fully.C0794w0.q0(r1, r2, r0)
            return
        L_0x00a5:
            java.lang.Object r1 = r4.f3905V
            P5.y r1 = (P5.y) r1
            de.ozerov.fully.FullyActivity r1 = r1.f3879b
            de.ozerov.fully.c r1 = r1.f9946i1
            r1.f(r0)
            return
        L_0x00b1:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r1 = r0.f3879b
            de.ozerov.fully.G2 r1 = r1.f9949l1
            r1.c()
            de.ozerov.fully.FullyActivity r1 = r0.f3879b
            U.d r1 = r1.f9919H0
            r1.b()
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.w3 r0 = r0.f9943f1
            boolean r1 = r0.f11046f
            if (r1 == 0) goto L_0x00d0
            de.ozerov.fully.FullyActivity r0 = r0.f11042a
            B3.q.s0(r0, r2, r2)
        L_0x00d0:
            return
        L_0x00d1:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.V4 r0 = r0.f9928Q0
            de.ozerov.fully.n r1 = r0.f10445c
            if (r1 == 0) goto L_0x00e9
            r1.h()
            de.ozerov.fully.n r0 = r0.f10445c
            android.widget.FrameLayout r0 = r0.f10820b
            r1 = 8
            r0.setVisibility(r1)
        L_0x00e9:
            return
        L_0x00ea:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.w3 r0 = r0.f9943f1
            r0.f()
            return
        L_0x00f6:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.w3 r0 = r0.f9943f1
            de.ozerov.fully.FullyActivity r0 = r0.f11042a
            B3.q.s0(r0, r2, r2)
            return
        L_0x0104:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.G2 r0 = r0.f9949l1
            r0.e()
            return
        L_0x0110:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.w3 r0 = r0.f9943f1
            r0.e()
            return
        L_0x011c:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.w3 r0 = r0.f9943f1
            r0.d()
            return
        L_0x0128:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.P.O()
            return
        L_0x0132:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r1 = r0.f3879b
            Z1.a r1 = r1.f9942e1
            java.util.HashMap r0 = r0.f3884h
            java.lang.String r2 = "text"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.e(r0)
            return
        L_0x0148:
            java.lang.Object r0 = r4.f3905V
            P5.o r0 = (P5.C0152o) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.E3 r0 = r0.f9952o1
            r0.b()
            return
        L_0x0154:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            d4.k r1 = r0.f9961z0
            java.lang.Boolean r1 = r1.Z()
            boolean r1 = r1.booleanValue()
            de.ozerov.fully.C0794w0.K0(r0, r1)
            return
        L_0x0168:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.C0794w0.J0(r0, r2)
            return
        L_0x0172:
            java.lang.Object r0 = r4.f3905V
            P5.y r0 = (P5.y) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            U.d r0 = r0.f9919H0
            r0.g()
            return
        L_0x017e:
            java.lang.Object r0 = r4.f3905V
            P5.c r0 = (P5.C0140c) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.i5 r0 = r0.f9917F0
            de.ozerov.fully.g5 r0 = r0.f10711d
            if (r0 == 0) goto L_0x018d
            r0.h()
        L_0x018d:
            return
        L_0x018e:
            java.lang.Object r0 = r4.f3905V
            P5.c r0 = (P5.C0140c) r0
            de.ozerov.fully.FullyActivity r1 = r0.f3879b
            r1.C()
            de.ozerov.fully.FullyActivity r1 = r0.f3879b
            de.ozerov.fully.w3 r1 = r1.f9943f1
            r1.f()
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            b3.a r0 = r0.f9921J0
            r0.c()
            return
        L_0x01a6:
            java.lang.Object r0 = r4.f3905V
            P5.c r0 = (P5.C0140c) r0
            de.ozerov.fully.FullyActivity r2 = r0.f3879b
            b3.a r2 = r2.f9921J0
            r2.c()
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.G2 r0 = r0.f9949l1
            r0.a(r1)
            return
        L_0x01b9:
            java.lang.Object r0 = r4.f3905V
            P5.c r0 = (P5.C0140c) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.c r0 = r0.f9951n1
            r0.getClass()
            return
        L_0x01c5:
            java.lang.Object r0 = r4.f3905V
            P5.c r0 = (P5.C0140c) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            U.d r0 = r0.f9919H0
            r0.getClass()
            android.content.Intent r1 = new android.content.Intent
            java.lang.Object r0 = r0.f5257V
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            java.lang.Class<de.ozerov.fully.ForegroundService> r2 = de.ozerov.fully.ForegroundService.class
            r1.<init>(r0, r2)
            java.lang.String r2 = "com.fullykiosk.singleapp.action.kill_main_process"
            r1.setAction(r2)
            java.lang.String r2 = "processId"
            int r3 = android.os.Process.myPid()
            r1.putExtra(r2, r3)
            r0.startService(r1)
            return
        L_0x01ed:
            java.lang.Object r0 = r4.f3905V
            P5.g r0 = (P5.C0144g) r0
            de.ozerov.fully.FullyActivity r1 = r0.f3879b
            de.ozerov.fully.E3 r1 = r1.f9952o1
            r1.b()
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.c r0 = r0.f9951n1
            r0.getClass()
            return
        L_0x0200:
            java.lang.Object r2 = r4.f3905V
            P5.k r2 = (P5.C0148k) r2
            de.ozerov.fully.FullyActivity r2 = r2.f3879b
            de.ozerov.fully.i5 r2 = r2.f9917F0
            if (r2 == 0) goto L_0x0219
            de.ozerov.fully.g5 r3 = r2.f10711d
            if (r3 == 0) goto L_0x0219
            de.ozerov.fully.MyWebView r3 = r3.f10664g
            if (r3 == 0) goto L_0x0219
            r3.f10130j0 = r0
            java.lang.String r0 = "javascript:FullyKiosk.grab('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');"
            r2.n(r0, r1)
        L_0x0219:
            return
        L_0x021a:
            java.lang.Object r0 = r4.f3905V
            P5.c r0 = (P5.C0140c) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            de.ozerov.fully.E3 r0 = r0.f9944g1
            r1 = 100
            r0.d(r1)
            return
        L_0x0228:
            java.lang.Object r0 = r4.f3905V
            P5.c r0 = (P5.C0140c) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            U.d r0 = r0.f9919H0
            r0.d(r2)
            return
        L_0x0234:
            java.lang.Object r0 = r4.f3905V
            P5.c r0 = (P5.C0140c) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            Z1.a r0 = r0.f9942e1
            r0.b()
            return
        L_0x0240:
            java.lang.Object r0 = r4.f3905V
            P5.c r0 = (P5.C0140c) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            Z1.a r0 = r0.f9942e1
            r0.a()
            return
        L_0x024c:
            java.lang.Object r0 = r4.f3905V
            java.io.File r0 = (java.io.File) r0
            n2.a.x(r0)
            return
        L_0x0254:
            java.lang.Object r0 = r4.f3905V
            P5.c r0 = (P5.C0140c) r0
            de.ozerov.fully.FullyActivity r0 = r0.f3879b
            r0.nativeCrash()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.C0143f.run():void");
    }
}
