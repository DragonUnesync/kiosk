package N5;

import android.content.BroadcastReceiver;

public final class f extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3377a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3378b;

    public /* synthetic */ f(int i, Object obj) {
        this.f3377a = i;
        this.f3378b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            int r0 = r8.f3377a
            switch(r0) {
                case 0: goto L_0x03d8;
                case 1: goto L_0x03cd;
                case 2: goto L_0x034b;
                case 3: goto L_0x0321;
                case 4: goto L_0x0307;
                case 5: goto L_0x02f4;
                case 6: goto L_0x007b;
                case 7: goto L_0x0047;
                case 8: goto L_0x003d;
                case 9: goto L_0x002f;
                case 10: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r9 = r8.f3378b
            I2.b r9 = (I2.b) r9
            r9.g()
            return
        L_0x000d:
            java.lang.String r9 = "android.net.wifi.SCAN_RESULTS"
            java.lang.String r10 = r10.getAction()
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x002e
            java.lang.Object r9 = r8.f3378b
            de.ozerov.fully.m5 r9 = (de.ozerov.fully.m5) r9
            h.j r10 = r9.f9851g1
            N5.f r0 = r9.f10806A1
            r10.unregisterReceiver(r0)
            r9.W()
            h.j r9 = r9.f9851g1
            java.lang.String r10 = "Wifi Scan Finished"
            n2.a.b1(r9, r10)
        L_0x002e:
            return
        L_0x002f:
            java.lang.Object r9 = r8.f3378b
            de.ozerov.fully.ScreensaverActivity r9 = (de.ozerov.fully.ScreensaverActivity) r9
            boolean r10 = r9.isFinishing()
            if (r10 != 0) goto L_0x003c
            r9.finish()
        L_0x003c:
            return
        L_0x003d:
            java.lang.Object r9 = r8.f3378b
            de.ozerov.fully.q3 r9 = (de.ozerov.fully.C0762q3) r9
            de.ozerov.fully.o3 r9 = r9.f10899n1
            r9.f()
            return
        L_0x0047:
            if (r10 == 0) goto L_0x007a
            java.lang.String r9 = r10.getAction()
            if (r9 == 0) goto L_0x007a
            java.lang.Object r9 = r8.f3378b
            o.s1 r9 = (o.s1) r9
            java.lang.Object r0 = r9.f14071b
            d4.k r0 = (d4.k) r0
            java.lang.String r1 = ""
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r2 = "barcodeScanBroadcastExtra"
            java.lang.String r0 = r0.r(r2, r1)
            java.lang.String r0 = r10.getStringExtra(r0)
            org.json.JSONObject r10 = n2.a.O(r10)
            java.lang.String r10 = r10.toString()
            java.lang.Object r1 = r9.f14071b
            d4.k r1 = (d4.k) r1
            java.lang.String r1 = r1.q()
            r9.a(r0, r10, r1)
        L_0x007a:
            return
        L_0x007b:
            java.lang.Object r9 = r8.f3378b
            b3.a r9 = (b3.C0528a) r9
            java.lang.String r0 = "resultCode"
            r1 = 0
            int r0 = r10.getIntExtra(r0, r1)
            java.lang.String r2 = "pin"
            java.lang.String r10 = r10.getStringExtra(r2)
            r9.getClass()
            if (r0 != 0) goto L_0x00b6
            java.lang.Object r2 = r9.e
            d4.k r2 = (d4.k) r2
            java.lang.Boolean r2 = r2.s1()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00b6
            java.lang.Object r2 = r9.e
            d4.k r2 = (d4.k) r2
            java.lang.Boolean r2 = r2.Y1()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00b6
            java.lang.Object r2 = r9.f8656d
            de.ozerov.fully.FullyActivity r2 = (de.ozerov.fully.FullyActivity) r2
            N5.k r2 = r2.f9958x1
            r2.b()
        L_0x00b6:
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L_0x02e0
            if (r10 == 0) goto L_0x02e0
            java.lang.Object r0 = r9.e
            d4.k r0 = (d4.k) r0
            java.lang.String r0 = r0.d0()
            boolean r0 = r10.equals(r0)
            java.lang.String r2 = "KioskManager"
            if (r0 != 0) goto L_0x02cf
            java.lang.Object r0 = r9.e
            d4.k r0 = (d4.k) r0
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r4 = "superPin"
            java.lang.String r5 = ""
            java.lang.String r0 = r0.r(r4, r5)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r9.e
            d4.k r0 = (d4.k) r0
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r0 = r0.r(r4, r5)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f6
            goto L_0x02cf
        L_0x00f6:
            java.lang.Object r0 = r9.e
            d4.k r0 = (d4.k) r0
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r4 = "kioskWifiPin"
            java.lang.String r0 = r0.r(r4, r5)
            boolean r0 = r0.isEmpty()
            java.lang.String r6 = "android.settings.BLUETOOTH_SETTINGS"
            if (r0 != 0) goto L_0x0266
            java.lang.Object r0 = r9.e
            d4.k r0 = (d4.k) r0
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r0 = r0.r(r4, r5)
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0266
            java.lang.Object r10 = r9.e
            d4.k r10 = (d4.k) r10
            java.lang.String r10 = r10.e0()
            java.lang.String r0 = "0"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0137
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r0 = "android.settings.WIFI_SETTINGS"
            r10.<init>(r0)
            goto L_0x021d
        L_0x0137:
            java.lang.Object r10 = r9.e
            d4.k r10 = (d4.k) r10
            java.lang.String r10 = r10.e0()
            java.lang.String r0 = "2"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x014e
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r6)
            goto L_0x021d
        L_0x014e:
            java.lang.Object r10 = r9.e
            d4.k r10 = (d4.k) r10
            java.lang.String r10 = r10.e0()
            java.lang.String r0 = "3"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0167
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r0 = "android.settings.DATA_ROAMING_SETTINGS"
            r10.<init>(r0)
            goto L_0x021d
        L_0x0167:
            java.lang.Object r10 = r9.e
            d4.k r10 = (d4.k) r10
            java.lang.String r10 = r10.e0()
            java.lang.String r0 = "4"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0180
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r0 = "android.settings.WIRELESS_SETTINGS"
            r10.<init>(r0)
            goto L_0x021d
        L_0x0180:
            java.lang.Object r10 = r9.e
            d4.k r10 = (d4.k) r10
            java.lang.String r10 = r10.e0()
            java.lang.String r0 = "5"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0199
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r0 = "android.settings.SYSTEM_UPDATE_SETTINGS"
            r10.<init>(r0)
            goto L_0x021d
        L_0x0199:
            java.lang.Object r10 = r9.e
            d4.k r10 = (d4.k) r10
            java.lang.String r10 = r10.e0()
            java.lang.String r0 = "100"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0200
            java.lang.Object r10 = r9.e
            d4.k r10 = (d4.k) r10
            java.lang.Object r10 = r10.f9767W
            Z1.c r10 = (Z1.c) r10
            java.lang.String r0 = "kioskWifiPinCustomIntent"
            java.lang.String r10 = r10.r(r0, r5)
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0200
            java.lang.Object r10 = r9.e
            d4.k r10 = (d4.k) r10
            java.lang.Object r10 = r10.f9767W
            Z1.c r10 = (Z1.c) r10
            java.lang.String r10 = r10.r(r0, r5)
            java.lang.String r0 = "intent:"
            boolean r0 = r10.startsWith(r0)
            if (r0 == 0) goto L_0x01f6
            android.content.Intent r10 = n2.a.P0(r10)     // Catch:{ Exception -> 0x01e0 }
            java.lang.Object r0 = r9.f8656d     // Catch:{ Exception -> 0x01de }
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0     // Catch:{ Exception -> 0x01de }
            de.ozerov.fully.G2 r0 = r0.f9949l1     // Catch:{ Exception -> 0x01de }
            r0.f9968c = r10     // Catch:{ Exception -> 0x01de }
            goto L_0x021d
        L_0x01de:
            r0 = move-exception
            goto L_0x01e2
        L_0x01e0:
            r0 = move-exception
            r10 = r3
        L_0x01e2:
            java.lang.Object r4 = r9.f8656d
            de.ozerov.fully.FullyActivity r4 = (de.ozerov.fully.FullyActivity) r4
            java.lang.String r5 = "Failed to start Custom Action Intent"
            n2.a.b1(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to start intent "
            r4.<init>(r5)
            Q0.g.z(r0, r4, r2)
            goto L_0x021d
        L_0x01f6:
            java.lang.Object r0 = r9.f8656d
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            de.ozerov.fully.i5 r0 = r0.f9917F0
            r0.n(r10, r1)
            goto L_0x021c
        L_0x0200:
            java.lang.Object r10 = r9.e
            d4.k r10 = (d4.k) r10
            java.lang.String r10 = r10.e0()
            java.lang.String r0 = "1"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x021c
            android.content.Intent r10 = new android.content.Intent
            java.lang.Object r0 = r9.f8656d
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            java.lang.Class<de.ozerov.fully.WifiSelectorActivity> r2 = de.ozerov.fully.WifiSelectorActivity.class
            r10.<init>(r0, r2)
            goto L_0x021d
        L_0x021c:
            r10 = r3
        L_0x021d:
            if (r10 == 0) goto L_0x0261
            java.lang.Object r0 = r9.f8656d
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            boolean r0 = r0.f10980u0
            if (r0 != 0) goto L_0x024e
            java.lang.String r0 = r10.getPackage()
            if (r0 == 0) goto L_0x024e
            java.lang.String r0 = r10.getPackage()
            java.lang.Object r2 = r9.f8656d
            de.ozerov.fully.FullyActivity r2 = (de.ozerov.fully.FullyActivity) r2
            java.lang.String r2 = r2.getPackageName()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0240
            goto L_0x024e
        L_0x0240:
            java.lang.Object r0 = r9.f8656d
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            U.d r0 = r0.f9919H0
            java.lang.String r10 = n2.a.o0(r10)
            r0.k(r10)
            goto L_0x0261
        L_0x024e:
            r0 = 65536(0x10000, float:9.18355E-41)
            r10.setFlags(r0)
            java.lang.Object r0 = r9.f8656d
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            r0.startActivity(r10)
            java.lang.Object r10 = r9.f8656d
            de.ozerov.fully.FullyActivity r10 = (de.ozerov.fully.FullyActivity) r10
            r10.overridePendingTransition(r1, r1)
        L_0x0261:
            r9.c()
            goto L_0x02e0
        L_0x0266:
            java.lang.Object r0 = r9.e
            d4.k r0 = (d4.k) r0
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r1 = "kioskBluetoothPin"
            java.lang.String r0 = r0.r(r1, r5)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x029d
            java.lang.Object r0 = r9.e
            d4.k r0 = (d4.k) r0
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r0 = r0.r(r1, r5)
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x029d
            java.lang.Object r10 = r9.f8656d
            de.ozerov.fully.FullyActivity r10 = (de.ozerov.fully.FullyActivity) r10
            de.ozerov.fully.G2 r10 = r10.f9949l1
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            r10.f9968c = r0
            r9.c()
            goto L_0x02e0
        L_0x029d:
            java.lang.Object r10 = r9.f8656d
            de.ozerov.fully.FullyActivity r10 = (de.ozerov.fully.FullyActivity) r10
            java.lang.String r0 = "PIN wrong"
            n2.a.b1(r10, r0)
            r9.c()
            java.lang.Object r10 = r9.e
            d4.k r10 = (d4.k) r10
            java.lang.Boolean r10 = r10.s1()
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x02e0
            java.lang.Object r10 = r9.e
            d4.k r10 = (d4.k) r10
            java.lang.Boolean r10 = r10.Y1()
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x02e0
            java.lang.Object r9 = r9.f8656d
            de.ozerov.fully.FullyActivity r9 = (de.ozerov.fully.FullyActivity) r9
            N5.k r9 = r9.f9958x1
            r9.b()
            goto L_0x02e0
        L_0x02cf:
            java.lang.Object r10 = r9.f8656d
            de.ozerov.fully.FullyActivity r10 = (de.ozerov.fully.FullyActivity) r10
            java.lang.String r0 = "PIN accepted"
            n2.a.b1(r10, r0)
            java.lang.String r10 = "Kiosk unlocked by PIN"
            de.ozerov.fully.C0794w0.q0(r1, r2, r10)
            r9.a()
        L_0x02e0:
            java.lang.Object r9 = r8.f3378b
            b3.a r9 = (b3.C0528a) r9
            java.lang.Object r9 = r9.f8656d
            de.ozerov.fully.FullyActivity r9 = (de.ozerov.fully.FullyActivity) r9
            de.ozerov.fully.G2 r9 = r9.f9949l1
            android.os.Handler r10 = r9.f9975l
            if (r10 == 0) goto L_0x02f3
            r10.removeCallbacksAndMessages(r3)
            r9.f9975l = r3
        L_0x02f3:
            return
        L_0x02f4:
            java.lang.Object r9 = r8.f3378b
            com.bumptech.glide.manager.p r9 = (com.bumptech.glide.manager.p) r9
            r9.getClass()
            com.bumptech.glide.manager.o r10 = new com.bumptech.glide.manager.o
            r0 = 2
            r10.<init>(r9, r0)
            java.util.concurrent.Executor r9 = com.bumptech.glide.manager.p.f9071a0
            r9.execute(r10)
            return
        L_0x0307:
            boolean r0 = r8.isInitialStickyBroadcast()
            if (r0 != 0) goto L_0x0320
            java.lang.Object r0 = r8.f3378b
            G5.m r0 = (G5.m) r0
            java.lang.Object r1 = r0.f1718j
            M0.e r1 = (M0.C0117e) r1
            java.lang.Object r2 = r0.i
            H3.P r2 = (H3.P) r2
            V0.d r9 = V0.C0339d.c(r9, r10, r1, r2)
            r0.l(r9)
        L_0x0320:
            return
        L_0x0321:
            java.lang.String r9 = r10.getAction()
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x034a
            java.lang.String r9 = "plugged"
            r0 = -1
            int r9 = r10.getIntExtra(r9, r0)
            if (r9 > 0) goto L_0x0338
            r9 = 1
            goto L_0x0339
        L_0x0338:
            r9 = 0
        L_0x0339:
            java.lang.Object r10 = r8.f3378b
            Q3.f r10 = (Q3.f) r10
            java.lang.Object r10 = r10.f4116Y
            android.os.Handler r10 = (android.os.Handler) r10
            A.b r0 = new A.b
            r1 = 4
            r0.<init>(r8, r9, r1)
            r10.post(r0)
        L_0x034a:
            return
        L_0x034b:
            java.lang.String r10 = "connectivity"
            java.lang.Object r10 = r9.getSystemService(r10)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            r0 = 5
            r1 = 0
            if (r10 != 0) goto L_0x0358
            goto L_0x039e
        L_0x0358:
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x039d }
            r2 = 1
            if (r10 == 0) goto L_0x039b
            boolean r3 = r10.isConnected()
            if (r3 != 0) goto L_0x0366
            goto L_0x039b
        L_0x0366:
            int r3 = r10.getType()
            r4 = 2
            r5 = 9
            r6 = 6
            r7 = 4
            if (r3 == 0) goto L_0x0384
            if (r3 == r2) goto L_0x0382
            if (r3 == r7) goto L_0x0384
            if (r3 == r0) goto L_0x0384
            if (r3 == r6) goto L_0x0380
            if (r3 == r5) goto L_0x037e
            r1 = 8
            goto L_0x039e
        L_0x037e:
            r1 = 7
            goto L_0x039e
        L_0x0380:
            r1 = 5
            goto L_0x039e
        L_0x0382:
            r1 = 2
            goto L_0x039e
        L_0x0384:
            int r10 = r10.getSubtype()
            switch(r10) {
                case 1: goto L_0x0398;
                case 2: goto L_0x0398;
                case 3: goto L_0x0396;
                case 4: goto L_0x0396;
                case 5: goto L_0x0396;
                case 6: goto L_0x0396;
                case 7: goto L_0x0396;
                case 8: goto L_0x0396;
                case 9: goto L_0x0396;
                case 10: goto L_0x0396;
                case 11: goto L_0x0396;
                case 12: goto L_0x0396;
                case 13: goto L_0x0380;
                case 14: goto L_0x0396;
                case 15: goto L_0x0396;
                case 16: goto L_0x038b;
                case 17: goto L_0x0396;
                case 18: goto L_0x0382;
                case 19: goto L_0x038b;
                case 20: goto L_0x038d;
                default: goto L_0x038b;
            }
        L_0x038b:
            r1 = 6
            goto L_0x039e
        L_0x038d:
            int r10 = P0.z.f3748a
            r2 = 29
            if (r10 < r2) goto L_0x039e
            r1 = 9
            goto L_0x039e
        L_0x0396:
            r1 = 4
            goto L_0x039e
        L_0x0398:
            r10 = 3
            r1 = 3
            goto L_0x039e
        L_0x039b:
            r1 = 1
            goto L_0x039e
        L_0x039d:
        L_0x039e:
            int r10 = P0.z.f3748a
            r2 = 31
            java.lang.Object r3 = r8.f3378b
            P0.q r3 = (P0.q) r3
            if (r10 < r2) goto L_0x03c9
            if (r1 != r0) goto L_0x03c9
            java.lang.String r10 = "phone"
            java.lang.Object r10 = r9.getSystemService(r10)     // Catch:{ RuntimeException -> 0x03c5 }
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch:{ RuntimeException -> 0x03c5 }
            r10.getClass()     // Catch:{ RuntimeException -> 0x03c5 }
            P0.p r1 = new P0.p     // Catch:{ RuntimeException -> 0x03c5 }
            r1.<init>(r3)     // Catch:{ RuntimeException -> 0x03c5 }
            java.util.concurrent.Executor r9 = r9.getMainExecutor()     // Catch:{ RuntimeException -> 0x03c5 }
            r10.registerTelephonyCallback(r9, r1)     // Catch:{ RuntimeException -> 0x03c5 }
            r10.unregisterTelephonyCallback(r1)     // Catch:{ RuntimeException -> 0x03c5 }
            goto L_0x03cc
        L_0x03c5:
            P0.q.b(r0, r3)
            goto L_0x03cc
        L_0x03c9:
            P0.q.b(r1, r3)
        L_0x03cc:
            return
        L_0x03cd:
            java.lang.Object r9 = r8.f3378b
            N5.p r9 = (N5.p) r9
            long r0 = java.lang.System.currentTimeMillis()
            r9.f3455r = r0
            return
        L_0x03d8:
            java.lang.Object r9 = r8.f3378b
            N5.j r9 = (N5.j) r9
            long r0 = java.lang.System.currentTimeMillis()
            r9.f3414r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.f.onReceive(android.content.Context, android.content.Intent):void");
    }
}
