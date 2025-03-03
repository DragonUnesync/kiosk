package O5;

import android.content.BroadcastReceiver;
import de.ozerov.fully.FullyActivity;

public final class c extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3666a;

    /* renamed from: b  reason: collision with root package name */
    public FullyActivity f3667b;

    public /* synthetic */ c() {
        this.f3666a = 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:180:0x04fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r17, android.content.Intent r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            java.lang.String r0 = "keyguard"
            r4 = 2
            java.lang.String r5 = "forceSleepIfUnplugged"
            java.lang.String r6 = ""
            r7 = 0
            r8 = 0
            r9 = 1
            int r10 = r1.f3666a
            switch(r10) {
                case 0: goto L_0x0723;
                case 1: goto L_0x06ec;
                case 2: goto L_0x0678;
                case 3: goto L_0x0515;
                case 4: goto L_0x0319;
                case 5: goto L_0x0279;
                case 6: goto L_0x012a;
                case 7: goto L_0x00f6;
                default: goto L_0x0015;
            }
        L_0x0015:
            if (r3 == 0) goto L_0x00f5
            java.lang.String r0 = r18.getAction()
            if (r0 != 0) goto L_0x001f
            goto L_0x00f5
        L_0x001f:
            java.lang.String r0 = r18.getAction()
            java.lang.String r2 = "com.fullykiosk.singleapp.action.motion_detected"
            boolean r0 = r0.equals(r2)
            java.lang.String r2 = "type"
            de.ozerov.fully.FullyActivity r4 = r1.f3667b
            if (r0 == 0) goto L_0x0040
            if (r4 == 0) goto L_0x0040
            de.ozerov.fully.E3 r0 = r4.f9944g1
            boolean r0 = r0.f9883c
            if (r0 != 0) goto L_0x0040
            de.ozerov.fully.c r0 = r4.f9946i1
            java.lang.String r5 = r3.getStringExtra(r2)
            r0.f(r5)
        L_0x0040:
            java.lang.String r0 = r18.getAction()
            java.lang.String r5 = "com.fullykiosk.singleapp.action.darkness_detected"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x009d
            if (r4 == 0) goto L_0x009d
            de.ozerov.fully.E3 r0 = r4.f9944g1
            boolean r0 = r0.f9883c
            if (r0 != 0) goto L_0x009d
            de.ozerov.fully.c r0 = r4.f9946i1
            d4.k r5 = r0.f10574b
            java.lang.Object r6 = r5.f9767W
            Z1.c r6 = (Z1.c) r6
            java.lang.String r10 = "screenOffInDarkness"
            boolean r6 = r6.n(r10, r8)
            de.ozerov.fully.FullyActivity r0 = r0.f10573a
            if (r6 == 0) goto L_0x0093
            java.lang.Boolean r6 = r5.J1()
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0090
            java.lang.Boolean r6 = r5.s1()
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0090
            java.lang.Boolean r6 = r5.t1()
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0090
            java.lang.Boolean r5 = r5.y1()
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r9 = 0
        L_0x0090:
            de.ozerov.fully.C0794w0.J0(r0, r9)
        L_0x0093:
            java.lang.String r5 = "onDarkness"
            de.ozerov.fully.U0.e(r5, r7)
            B3.q r0 = r0.f9935X0
            r0.b0(r5, r7)
        L_0x009d:
            java.lang.String r0 = r18.getAction()
            java.lang.String r5 = "com.fullykiosk.singleapp.action.faces_detected"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00d8
            if (r4 == 0) goto L_0x00d8
            de.ozerov.fully.E3 r0 = r4.f9944g1
            boolean r0 = r0.f9883c
            if (r0 != 0) goto L_0x00d8
            de.ozerov.fully.c r0 = r4.f9946i1
            java.lang.String r5 = "number"
            int r6 = r3.getIntExtra(r5, r8)
            r0.getClass()
            java.lang.String r7 = java.lang.String.valueOf(r6)
            java.util.HashMap r7 = n2.a.E(r5, r7)
            java.lang.String r8 = "facesDetected"
            de.ozerov.fully.U0.e(r8, r7)
            de.ozerov.fully.FullyActivity r0 = r0.f10573a
            B3.q r0 = r0.f9935X0
            java.lang.String r6 = java.lang.String.valueOf(r6)
            org.json.JSONObject r5 = n2.a.D(r5, r6)
            r0.b0(r8, r5)
        L_0x00d8:
            java.lang.String r0 = r18.getAction()
            java.lang.String r5 = "com.fullykiosk.singleapp.action.movement_detected"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00f5
            if (r4 == 0) goto L_0x00f5
            de.ozerov.fully.E3 r0 = r4.f9944g1
            boolean r0 = r0.f9883c
            if (r0 != 0) goto L_0x00f5
            de.ozerov.fully.c r0 = r4.f9946i1
            java.lang.String r2 = r3.getStringExtra(r2)
            r0.g(r2)
        L_0x00f5:
            return
        L_0x00f6:
            if (r3 == 0) goto L_0x0129
            java.lang.String r0 = r18.getAction()
            if (r0 != 0) goto L_0x00ff
            goto L_0x0129
        L_0x00ff:
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            java.lang.String r2 = r18.getAction()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            de.ozerov.fully.FullyActivity r0 = r1.f3667b
            de.ozerov.fully.C0794w0.g0(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3667b
            boolean r0 = r0.f10980u0
            de.ozerov.fully.FullyActivity r0 = r1.f3667b
            de.ozerov.fully.W3 r0 = r0.f9922K0
            r0.e()
            de.ozerov.fully.FullyActivity r0 = r1.f3667b
            de.ozerov.fully.G2 r0 = r0.f9949l1
            r0.a(r9)
            de.ozerov.fully.FullyActivity r0 = r1.f3667b
            de.ozerov.fully.Y3 r0 = r0.f9953p1
            r0.b()
        L_0x0129:
            return
        L_0x012a:
            if (r3 == 0) goto L_0x0278
            java.lang.String r10 = r18.getAction()
            if (r10 != 0) goto L_0x0134
            goto L_0x0278
        L_0x0134:
            java.lang.String r10 = "android.intent.action.SCREEN_ON"
            java.lang.String r3 = r18.getAction()
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0278
            de.ozerov.fully.FullyActivity r3 = r1.f3667b
            de.ozerov.fully.C0794w0.g0(r3)
            de.ozerov.fully.FullyActivity r3 = r1.f3667b
            boolean r3 = r3.f10980u0
            android.content.Context r2 = r17.getApplicationContext()
            de.ozerov.fully.MyApplication r2 = (de.ozerov.fully.MyApplication) r2
            d4.k r3 = new d4.k
            r3.<init>((android.content.Context) r2, (int) r9)
            de.ozerov.fully.FullyActivity r10 = r1.f3667b
            de.ozerov.fully.Y3 r10 = r10.f9953p1
            r10.getClass()
            long r11 = java.lang.System.currentTimeMillis()
            r10.f10521j = r11
            java.lang.String r10 = "reloadOnScreenOn"
            java.lang.Object r11 = r3.f9767W
            Z1.c r11 = (Z1.c) r11
            boolean r10 = r11.n(r10, r8)
            if (r10 == 0) goto L_0x0174
            de.ozerov.fully.FullyActivity r10 = r1.f3667b
            de.ozerov.fully.c r10 = r10.f9951n1
            r10.a()
        L_0x0174:
            java.lang.Boolean r10 = r3.K()
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0185
            de.ozerov.fully.FullyActivity r10 = r1.f3667b
            java.lang.String r11 = "Screen on"
            n2.a.b1(r10, r11)
        L_0x0185:
            de.ozerov.fully.C0794w0.f11028n = r9
            java.lang.Object r9 = r3.f9767W
            Z1.c r9 = (Z1.c) r9
            java.lang.String r10 = "folderCleanupTime"
            java.lang.String r6 = r9.r(r10, r6)
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x01aa
            long r9 = de.ozerov.fully.C0723k0.e
            long r11 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r11
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x01aa
            de.ozerov.fully.FullyActivity r6 = r1.f3667b
            de.ozerov.fully.C0723k0.b(r6, r7)
        L_0x01aa:
            java.lang.Object r6 = r3.f9767W
            Z1.c r6 = (Z1.c) r6
            boolean r5 = r6.n(r5, r8)
            if (r5 == 0) goto L_0x01c5
            boolean r2 = de.ozerov.fully.P.H(r2)
            if (r2 != 0) goto L_0x01c5
            de.ozerov.fully.FullyActivity r0 = r1.f3667b
            de.ozerov.fully.E3 r0 = r0.f9944g1
            r2 = 100
            r0.d(r2)
            goto L_0x0278
        L_0x01c5:
            de.ozerov.fully.FullyActivity r2 = r1.f3667b
            de.ozerov.fully.E3 r2 = r2.f9944g1
            r2.e()
            de.ozerov.fully.FullyActivity r2 = r1.f3667b
            de.ozerov.fully.S r2 = r2.f9960y1
            r2.e(r8, r8)
            java.lang.String r2 = "screenOn"
            de.ozerov.fully.U0.e(r2, r7)
            de.ozerov.fully.FullyActivity r5 = r1.f3667b
            B3.q r5 = r5.f9935X0
            r5.b0(r2, r7)
            boolean r2 = de.ozerov.fully.C0794w0.f11017a
            if (r2 == 0) goto L_0x01f4
            de.ozerov.fully.x0 r2 = de.ozerov.fully.C0794w0.f11018b
            if (r2 != 0) goto L_0x01e8
            goto L_0x01f4
        L_0x01e8:
            de.ozerov.fully.C0794w0.a()
            de.ozerov.fully.x0 r2 = de.ozerov.fully.C0794w0.f11018b
            long r5 = r2.f11057f
            r9 = 1
            long r5 = r5 + r9
            r2.f11057f = r5
        L_0x01f4:
            de.ozerov.fully.FullyActivity r2 = r1.f3667b
            boolean r2 = r2.f10980u0
            if (r2 == 0) goto L_0x0240
            de.ozerov.fully.FullyActivity r2 = r1.f3667b
            de.ozerov.fully.W3 r2 = r2.f9922K0
            d4.k r5 = r2.f10478c
            java.lang.Boolean r6 = r5.Z1()
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0214
            java.lang.Boolean r6 = r5.c2()
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0240
        L_0x0214:
            de.ozerov.fully.FullyActivity r6 = r2.f10477b
            java.lang.String r7 = "preferences"
            boolean r7 = r6.y(r7)
            if (r7 != 0) goto L_0x0240
            java.lang.Boolean r7 = r5.Z1()
            boolean r7 = r7.booleanValue()
            java.lang.Boolean r5 = r5.c2()
            boolean r5 = r5.booleanValue()
            de.ozerov.fully.C0794w0.A0(r6, r7, r5)
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            de.ozerov.fully.T3 r6 = new de.ozerov.fully.T3
            r6.<init>(r2, r4)
            r9 = 3000(0xbb8, double:1.482E-320)
            r5.postDelayed(r6, r9)
        L_0x0240:
            de.ozerov.fully.FullyActivity r2 = r1.f3667b
            de.ozerov.fully.W3 r2 = r2.f9922K0
            r2.e()
            de.ozerov.fully.FullyActivity r2 = r1.f3667b
            r2.onUserInteraction()
            java.lang.String r2 = "forceSwipeUnlock"
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            boolean r2 = r3.n(r2, r8)
            if (r2 == 0) goto L_0x0278
            de.ozerov.fully.FullyActivity r2 = r1.f3667b
            boolean r2 = de.ozerov.fully.C0794w0.g0(r2)
            if (r2 == 0) goto L_0x0278
            de.ozerov.fully.FullyActivity r2 = r1.f3667b
            boolean r3 = n2.a.B0()
            if (r3 == 0) goto L_0x0278
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            if (r0 == 0) goto L_0x0278
            de.ozerov.fully.c0 r3 = new de.ozerov.fully.c0
            r3.<init>()
            r0.requestDismissKeyguard(r2, r3)
        L_0x0278:
            return
        L_0x0279:
            if (r3 == 0) goto L_0x0318
            java.lang.String r0 = r18.getAction()
            if (r0 != 0) goto L_0x0283
            goto L_0x0318
        L_0x0283:
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            java.lang.String r3 = r18.getAction()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0318
            android.content.Context r0 = r17.getApplicationContext()
            de.ozerov.fully.MyApplication r0 = (de.ozerov.fully.MyApplication) r0
            d4.k r2 = new d4.k
            r2.<init>((android.content.Context) r0, (int) r9)
            java.lang.String r3 = "reloadOnScreenOff"
            java.lang.Object r4 = r2.f9767W
            Z1.c r4 = (Z1.c) r4
            boolean r3 = r4.n(r3, r8)
            de.ozerov.fully.FullyActivity r6 = r1.f3667b
            if (r3 == 0) goto L_0x02ad
            de.ozerov.fully.c r3 = r6.f9951n1
            r3.a()
        L_0x02ad:
            java.lang.Boolean r3 = r2.E()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x02db
            boolean r3 = de.ozerov.fully.C0794w0.f11028n
            if (r3 == 0) goto L_0x02db
            b3.a r3 = r6.f9921J0
            boolean r3 = r3.i()
            if (r3 == 0) goto L_0x02db
            boolean r3 = r4.n(r5, r8)
            if (r3 == 0) goto L_0x02cf
            boolean r3 = de.ozerov.fully.P.H(r0)
            if (r3 == 0) goto L_0x02db
        L_0x02cf:
            java.lang.Boolean r0 = r2.Z()
            boolean r0 = r0.booleanValue()
            de.ozerov.fully.C0794w0.K0(r6, r0)
            goto L_0x02fd
        L_0x02db:
            java.lang.Boolean r2 = r2.K()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x02ea
            java.lang.String r2 = "Screen off"
            n2.a.b1(r0, r2)
        L_0x02ea:
            de.ozerov.fully.C0794w0.f11028n = r8
            de.ozerov.fully.i5 r0 = r6.f9917F0
            if (r0 == 0) goto L_0x02fd
            java.lang.String r0 = "pauseWebviewOnScreenOff"
            boolean r0 = r4.n(r0, r9)
            if (r0 == 0) goto L_0x02fd
            de.ozerov.fully.i5 r0 = r6.f9917F0
            r0.o()
        L_0x02fd:
            java.lang.String r0 = "screenOff"
            de.ozerov.fully.U0.e(r0, r7)
            B3.q r2 = r6.f9935X0
            r2.b0(r0, r7)
            de.ozerov.fully.S r0 = r6.f9960y1
            r0.e(r8, r8)
            de.ozerov.fully.W3 r0 = r6.f9922K0
            r0.e()
            de.ozerov.fully.w3 r0 = r6.f9943f1
            android.os.Handler r0 = r0.f11047g
            r0.removeCallbacksAndMessages(r7)
        L_0x0318:
            return
        L_0x0319:
            java.lang.String r0 = "nextIntent component: "
            java.lang.String r5 = "nextIntent not allowed: "
            if (r3 == 0) goto L_0x0514
            java.lang.String r6 = r18.getAction()
            if (r6 != 0) goto L_0x0327
            goto L_0x0514
        L_0x0327:
            r18.getAction()
            r18.getDataString()
            java.lang.String r6 = r18.getAction()
            java.lang.String r10 = "com.android.launcher.action.INSTALL_SHORTCUT"
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x0348
            android.os.Bundle r6 = r18.getExtras()
            java.lang.String r10 = "android.intent.extra.shortcut.INTENT"
            java.lang.Object r6 = r6.get(r10)
            android.content.Intent r6 = (android.content.Intent) r6
            n2.a.o0(r6)
        L_0x0348:
            java.lang.String r6 = r18.getAction()
            java.lang.String r10 = "com.fullykiosk.singleapp.action.install_complete"
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x0360
            java.lang.String r6 = r18.getAction()
            java.lang.String r11 = "com.fullykiosk.singleapp.action.uninstall_complete"
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L_0x0514
        L_0x0360:
            java.lang.String r6 = r18.getAction()
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x036d
            java.lang.String r6 = "Install"
            goto L_0x036f
        L_0x036d:
            java.lang.String r6 = "Uninstall"
        L_0x036f:
            java.lang.String r10 = "android.content.pm.extra.STATUS"
            int r10 = r3.getIntExtra(r10, r9)
            java.lang.String r11 = "android.content.pm.extra.SESSION_ID"
            r12 = -1
            int r11 = r3.getIntExtra(r11, r12)
            java.lang.String r13 = "android.content.pm.extra.PACKAGE_NAME"
            java.lang.String r13 = r3.getStringExtra(r13)
            java.lang.String r14 = "android.content.pm.extra.STATUS_MESSAGE"
            java.lang.String r14 = r3.getStringExtra(r14)
            java.util.HashMap r15 = de.ozerov.fully.C0752p.f10879d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            java.lang.Object r7 = r15.get(r7)
            java.io.File r7 = (java.io.File) r7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r15.remove(r11)
            java.lang.String r11 = " due to "
            java.lang.String r15 = "PackageReceiver3"
            java.lang.String r4 = "APK "
            if (r10 == r12) goto L_0x0425
            if (r10 == 0) goto L_0x03e7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r6)
            java.lang.String r3 = " failed with status "
            r0.append(r3)
            r0.append(r10)
            java.lang.String r3 = " for "
            r0.append(r3)
            if (r13 == 0) goto L_0x03bd
            goto L_0x03bf
        L_0x03bd:
            java.lang.String r13 = "unknown package"
        L_0x03bf:
            r0.append(r13)
            r0.append(r11)
            if (r14 == 0) goto L_0x03c8
            goto L_0x03ca
        L_0x03c8:
            java.lang.String r14 = "unknown reason"
        L_0x03ca:
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r15, r0)
            de.ozerov.fully.C0794w0.q0(r9, r15, r0)
            n2.a.b1(r2, r0)
            boolean r0 = de.ozerov.fully.C0794w0.Z(r17)
            if (r0 == 0) goto L_0x0514
            if (r7 == 0) goto L_0x0514
            de.ozerov.fully.C0752p.f()
            goto L_0x0514
        L_0x03e7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r6)
            java.lang.String r3 = " success for "
            r0.append(r3)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r15, r0)
            de.ozerov.fully.C0794w0.q0(r8, r15, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r3 = "ed "
            r0.append(r3)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            n2.a.b1(r2, r0)
            boolean r0 = de.ozerov.fully.C0794w0.Z(r17)
            if (r0 == 0) goto L_0x0514
            if (r7 == 0) goto L_0x0514
            de.ozerov.fully.C0752p.e(r17)
            goto L_0x0514
        L_0x0425:
            java.lang.String r10 = "android.intent.extra.INTENT"
            android.os.Parcelable r3 = r3.getParcelableExtra(r10)     // Catch:{ Exception -> 0x04db }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ Exception -> 0x04db }
            if (r3 == 0) goto L_0x0514
            android.content.pm.PackageManager r10 = r17.getPackageManager()     // Catch:{ Exception -> 0x0488 }
            android.content.ComponentName r10 = r3.resolveActivity(r10)     // Catch:{ Exception -> 0x0488 }
            de.ozerov.fully.FullyActivity r12 = r1.f3667b
            if (r10 != 0) goto L_0x048a
            if (r7 == 0) goto L_0x045c
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0452 }
            java.lang.String r5 = "android.intent.action.VIEW"
            r0.<init>(r5)     // Catch:{ Exception -> 0x0452 }
            android.net.Uri r5 = android.net.Uri.fromFile(r7)     // Catch:{ Exception -> 0x0452 }
            java.lang.String r7 = "application/vnd.android.package-archive"
            r0.setDataAndType(r5, r7)     // Catch:{ Exception -> 0x0452 }
            r12.startActivity(r0)     // Catch:{ Exception -> 0x0452 }
            r8 = 1
            goto L_0x0456
        L_0x0452:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x0488 }
        L_0x0456:
            if (r8 != 0) goto L_0x0514
            goto L_0x045c
        L_0x0459:
            r7 = r3
            goto L_0x04dd
        L_0x045c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0488 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0488 }
            r0.append(r6)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r5 = " failed for "
            r0.append(r5)     // Catch:{ Exception -> 0x0488 }
            r0.append(r13)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r5 = ". Installation aborted. Next Intent: "
            r0.append(r5)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r5 = n2.a.o0(r3)     // Catch:{ Exception -> 0x0488 }
            r0.append(r5)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0488 }
            android.util.Log.e(r15, r0)     // Catch:{ Exception -> 0x0488 }
            r5 = 2
            de.ozerov.fully.C0794w0.q0(r5, r15, r0)     // Catch:{ Exception -> 0x0488 }
            n2.a.b1(r2, r0)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0514
        L_0x0488:
            r0 = move-exception
            goto L_0x0459
        L_0x048a:
            java.lang.String r7 = r10.getPackageName()     // Catch:{ Exception -> 0x0488 }
            java.lang.String r2 = r17.getPackageName()     // Catch:{ Exception -> 0x0488 }
            boolean r2 = r7.equals(r2)     // Catch:{ Exception -> 0x0488 }
            if (r2 != 0) goto L_0x04b8
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)     // Catch:{ Exception -> 0x0488 }
            r12.startActivity(r3)     // Catch:{ Exception -> 0x0488 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0488 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0488 }
            r0.append(r6)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r2 = " completed, started extra intent for "
            r0.append(r2)     // Catch:{ Exception -> 0x0488 }
            r0.append(r13)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0488 }
            android.util.Log.i(r15, r0)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0514
        L_0x04b8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0488 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r5 = n2.a.o0(r3)     // Catch:{ Exception -> 0x0488 }
            r2.append(r5)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0488 }
            android.util.Log.i(r15, r2)     // Catch:{ Exception -> 0x0488 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0488 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0488 }
            r2.append(r10)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0488 }
            android.util.Log.i(r15, r0)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0514
        L_0x04db:
            r0 = move-exception
            r7 = 0
        L_0x04dd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r3 = " failed to start extra intent for "
            r2.append(r3)
            r2.append(r13)
            r2.append(r11)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            if (r7 == 0) goto L_0x050e
            java.lang.String r2 = " next intent: "
            java.lang.StringBuilder r0 = N.e.B(r0, r2)
            java.lang.String r2 = n2.a.o0(r7)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L_0x050e:
            android.util.Log.w(r15, r0)
            de.ozerov.fully.C0794w0.q0(r9, r15, r0)
        L_0x0514:
            return
        L_0x0515:
            de.ozerov.fully.FullyActivity r4 = r1.f3667b
            if (r3 == 0) goto L_0x0677
            java.lang.String r0 = r18.getAction()
            if (r0 != 0) goto L_0x0521
            goto L_0x0677
        L_0x0521:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "onReceive intent: "
            r0.<init>(r5)
            java.lang.String r5 = r18.getAction()
            r0.append(r5)
            java.lang.String r5 = " data:"
            r0.append(r5)
            java.lang.String r5 = r18.getDataString()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "PackageReceiver2"
            android.util.Log.i(r5, r0)
            d4.k r7 = new d4.k
            r7.<init>((android.content.Context) r2, (int) r9)
            java.lang.String r0 = r18.getAction()
            java.lang.String r10 = "android.intent.action.PACKAGE_ADDED"
            boolean r0 = r0.equals(r10)
            java.lang.String r10 = "android.intent.action.PACKAGE_REPLACED"
            if (r0 != 0) goto L_0x056d
            java.lang.String r0 = r18.getAction()
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x056d
            java.lang.String r0 = r18.getAction()
            java.lang.String r11 = "android.intent.action.PACKAGE_REMOVED"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x065e
        L_0x056d:
            java.lang.String r0 = r18.getDataString()
            java.lang.String r11 = "package:"
            java.lang.String r11 = r0.replace(r11, r6)
            java.lang.String r0 = r18.getAction()
            r12 = 46
            int r0 = r0.lastIndexOf(r12)
            android.content.pm.PackageManager r12 = r4.getPackageManager()     // Catch:{ Exception -> 0x058e }
            r13 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r12 = r12.getPackageInfo(r11, r13)     // Catch:{ Exception -> 0x058e }
            java.lang.String r12 = r12.versionName     // Catch:{ Exception -> 0x058e }
            goto L_0x0590
        L_0x058e:
            r12 = 0
        L_0x0590:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Got broadcast "
            r13.<init>(r14)
            java.lang.String r14 = r18.getAction()
            int r0 = r0 + r9
            java.lang.String r0 = r14.substring(r0)
            r13.append(r0)
            java.lang.String r0 = " for package "
            r13.append(r0)
            r13.append(r11)
            if (r12 == 0) goto L_0x05b3
            java.lang.String r0 = " version "
            java.lang.String r6 = r0.concat(r12)
        L_0x05b3:
            r13.append(r6)
            java.lang.String r0 = r13.toString()
            de.ozerov.fully.C0794w0.q0(r8, r5, r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x05dd }
            r0.<init>()     // Catch:{ Exception -> 0x05dd }
            java.lang.String r6 = "action"
            java.lang.String r13 = r18.getAction()     // Catch:{ Exception -> 0x05dd }
            r0.put(r6, r13)     // Catch:{ Exception -> 0x05dd }
            java.lang.String r6 = "package"
            r0.put(r6, r11)     // Catch:{ Exception -> 0x05dd }
            java.lang.String r6 = "version"
            r0.put(r6, r12)     // Catch:{ Exception -> 0x05dd }
            B3.q r6 = r4.f9935X0     // Catch:{ Exception -> 0x05dd }
            java.lang.String r12 = "onBroadcastReceived"
            r6.b0(r12, r0)     // Catch:{ Exception -> 0x05dd }
            goto L_0x05e8
        L_0x05dd:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r12 = "Failed to send MQTT message onBroadcastReceived due to "
            r6.<init>(r12)
            Q0.g.z(r0, r6, r5)
        L_0x05e8:
            de.ozerov.fully.I1.a(r17)
            de.ozerov.fully.i5 r0 = r4.f9917F0
            java.lang.String r0 = r0.k()
            if (r0 == 0) goto L_0x0611
            de.ozerov.fully.i5 r0 = r4.f9917F0
            java.lang.String r0 = r0.k()
            java.lang.String r6 = "fully://launcher"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0611
            java.lang.String r0 = "Reloading launcher after app install"
            android.util.Log.i(r5, r0)
            de.ozerov.fully.i5 r0 = r4.f9917F0
            de.ozerov.fully.g5 r4 = r0.f10711d
            de.ozerov.fully.MyWebView r4 = r4.f10664g
            r4.f10123c0 = r9
            r0.n(r6, r8)
        L_0x0611:
            java.lang.Boolean r0 = r7.g2()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x065e
            java.lang.Boolean r0 = r7.c0()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x065e
            java.lang.String r0 = r7.e2()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x065e
            java.lang.String r0 = r7.e2()     // Catch:{ Exception -> 0x065a }
            android.content.Intent r0 = n2.a.P0(r0)     // Catch:{ Exception -> 0x065a }
            java.lang.String r0 = de.ozerov.fully.C0794w0.K(r2, r0)     // Catch:{ Exception -> 0x065a }
            if (r0 == 0) goto L_0x065e
            boolean r0 = r0.equals(r11)     // Catch:{ Exception -> 0x065a }
            if (r0 == 0) goto L_0x065e
            java.lang.String r0 = "Starting single app intent after install/upgrade"
            android.util.Log.i(r5, r0)     // Catch:{ Exception -> 0x065a }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Exception -> 0x065a }
            r0.<init>()     // Catch:{ Exception -> 0x065a }
            A.d r4 = new A.d     // Catch:{ Exception -> 0x065a }
            r5 = 27
            r4.<init>(r5, r1)     // Catch:{ Exception -> 0x065a }
            r5 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r4, r5)     // Catch:{ Exception -> 0x065a }
            goto L_0x065e
        L_0x065a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x065e:
            java.lang.String r0 = r18.getAction()
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0677
            boolean r0 = de.ozerov.fully.C0794w0.Z(r17)
            if (r0 == 0) goto L_0x0677
            boolean r0 = n2.a.y0()
            if (r0 != 0) goto L_0x0677
            de.ozerov.fully.C0752p.e(r17)
        L_0x0677:
            return
        L_0x0678:
            if (r3 == 0) goto L_0x06eb
            java.lang.String r4 = r18.getAction()
            if (r4 != 0) goto L_0x0681
            goto L_0x06eb
        L_0x0681:
            java.lang.String r4 = r18.getAction()
            java.lang.String r5 = "android.intent.action.DREAMING_STARTED"
            boolean r4 = r4.equals(r5)
            de.ozerov.fully.FullyActivity r5 = r1.f3667b
            if (r4 == 0) goto L_0x06a1
            java.lang.System.currentTimeMillis()
            de.ozerov.fully.w3 r4 = r5.f9943f1
            r4.f11046f = r9
            java.lang.String r4 = "onDaydreamStart"
            r6 = 0
            de.ozerov.fully.U0.e(r4, r6)
            B3.q r7 = r5.f9935X0
            r7.b0(r4, r6)
        L_0x06a1:
            java.lang.String r3 = r18.getAction()
            java.lang.String r4 = "android.intent.action.DREAMING_STOPPED"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x06eb
            java.lang.System.currentTimeMillis()
            de.ozerov.fully.w3 r3 = r5.f9943f1
            boolean r3 = r3.f11046f
            if (r3 == 0) goto L_0x06eb
            boolean r3 = r5.f9955r1
            if (r3 != 0) goto L_0x06eb
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            if (r0 == 0) goto L_0x06d9
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            if (r0 == 0) goto L_0x06d9
            d4.k r0 = r5.f9961z0
            java.lang.Boolean r0 = r0.S()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x06d9
            U.d r0 = r5.f9919H0
            r0.b()
        L_0x06d9:
            java.lang.String r0 = "onDaydreamStop"
            r2 = 0
            de.ozerov.fully.U0.e(r0, r2)
            B3.q r3 = r5.f9935X0
            r3.b0(r0, r2)
            de.ozerov.fully.w3 r0 = r5.f9943f1
            r0.f11046f = r8
            r0.a()
        L_0x06eb:
            return
        L_0x06ec:
            if (r3 != 0) goto L_0x06ef
            goto L_0x0722
        L_0x06ef:
            n2.a.o0(r18)
            boolean r0 = n2.a.y0()
            if (r0 == 0) goto L_0x0722
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            de.ozerov.fully.FullyActivity r2 = r1.f3667b
            d4.k r3 = r2.f9961z0
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            java.lang.String r4 = "forceDndInKioskMode"
            boolean r3 = r3.n(r4, r8)
            if (r3 == 0) goto L_0x0722
            b3.a r2 = r2.f9921J0
            boolean r2 = r2.i()
            if (r2 == 0) goto L_0x0722
            int r2 = r0.getCurrentInterruptionFilter()
            r3 = 3
            if (r2 == r3) goto L_0x0722
            r0.setInterruptionFilter(3)
        L_0x0722:
            return
        L_0x0723:
            if (r3 == 0) goto L_0x073f
            java.lang.String r0 = r18.getAction()
            if (r0 != 0) goto L_0x072c
            goto L_0x073f
        L_0x072c:
            java.lang.String r0 = "com.fullykiosk.singleapp.action.check_kiosk_pin"
            java.lang.String r2 = r18.getAction()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x073f
            de.ozerov.fully.FullyActivity r0 = r1.f3667b
            b3.a r0 = r0.f9921J0
            r0.b()
        L_0x073f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.c.onReceive(android.content.Context, android.content.Intent):void");
    }

    public /* synthetic */ c(FullyActivity fullyActivity, int i) {
        this.f3666a = i;
        this.f3667b = fullyActivity;
    }
}
