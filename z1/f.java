package Z1;

import android.content.Context;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6964U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Context f6965V;

    public /* synthetic */ f(Context context, int i) {
        this.f6964U = i;
        this.f6965V = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r1 != null) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            int r3 = r11.f6964U
            switch(r3) {
                case 0: goto L_0x01b3;
                case 1: goto L_0x01a6;
                case 2: goto L_0x00e0;
                case 3: goto L_0x0088;
                default: goto L_0x0008;
            }
        L_0x0008:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r0 < r3) goto L_0x0085
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.Context r5 = r11.f6965V
            java.lang.String r6 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r4.<init>(r5, r6)
            android.content.pm.PackageManager r6 = r5.getPackageManager()
            int r6 = r6.getComponentEnabledSetting(r4)
            if (r6 == r2) goto L_0x0085
            java.lang.String r6 = "locale"
            if (r0 < r3) goto L_0x005e
            Y.f r0 = h.o.f12227a0
            r0.getClass()
            Y.a r3 = new Y.a
            r3.<init>((Y.f) r0)
        L_0x002f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r3.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            h.o r0 = (h.o) r0
            if (r0 == 0) goto L_0x002f
            h.A r0 = (h.C1000A) r0
            android.content.Context r0 = r0.f12078e0
            if (r0 == 0) goto L_0x002f
            java.lang.Object r1 = r0.getSystemService(r6)
        L_0x004d:
            if (r1 == 0) goto L_0x0063
            android.os.LocaleList r0 = h.C1025m.a(r1)
            q0.d r1 = new q0.d
            q0.g r3 = new q0.g
            r3.<init>(r0)
            r1.<init>(r3)
            goto L_0x0065
        L_0x005e:
            q0.d r1 = h.o.f12223W
            if (r1 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            q0.d r1 = q0.C1357d.f14702b
        L_0x0065:
            q0.f r0 = r1.f14703a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = j0.f.i(r5)
            java.lang.Object r1 = r5.getSystemService(r6)
            if (r1 == 0) goto L_0x007e
            android.os.LocaleList r0 = h.C1024l.a(r0)
            h.C1025m.b(r1, r0)
        L_0x007e:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r0.setComponentEnabledSetting(r4, r2, r2)
        L_0x0085:
            h.o.f12226Z = r2
            return
        L_0x0088:
            android.content.Context r0 = r11.f6965V
            java.lang.Class<de.ozerov.fully.W4> r2 = de.ozerov.fully.W4.class
            monitor-enter(r2)
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00b9 }
            java.io.File r0 = n2.a.c0(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = "fully-single-app-blackhosts.txt"
            r3.<init>(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b9 }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x00b9 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x00b9 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00b9 }
            java.util.HashSet r1 = de.ozerov.fully.W4.f10487a     // Catch:{ Exception -> 0x00b9 }
            r1.clear()     // Catch:{ Exception -> 0x00b9 }
        L_0x00a7:
            java.lang.String r1 = r0.readLine()     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x00bb
            java.util.HashSet r4 = de.ozerov.fully.W4.f10487a     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = r1.trim()     // Catch:{ Exception -> 0x00b9 }
            r4.add(r1)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00a7
        L_0x00b7:
            r0 = move-exception
            goto L_0x00de
        L_0x00b9:
            r0 = move-exception
            goto L_0x00c2
        L_0x00bb:
            r0.close()     // Catch:{ Exception -> 0x00b9 }
            r3.getName()     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00dc
        L_0x00c2:
            java.lang.String r1 = "W4"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r3.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = "Failed reading fully-single-app-blackhosts.txt due to "
            r3.append(r4)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00b7 }
            r3.append(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00b7 }
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x00b7 }
        L_0x00dc:
            monitor-exit(r2)
            return
        L_0x00de:
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            throw r0
        L_0x00e0:
            de.ozerov.fully.X r0 = de.ozerov.fully.Y.f10505a
            android.content.Context r0 = r11.f6965V
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "X"
            de.ozerov.fully.X r2 = de.ozerov.fully.Y.f10505a
            a1.a r3 = de.ozerov.fully.Y.f10507c
            r2.e = r3
            java.lang.Object r3 = r2.f10493d
            android.location.LocationManager r3 = (android.location.LocationManager) r3
            if (r3 != 0) goto L_0x0100
            java.lang.String r3 = "location"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            r2.f10493d = r0
        L_0x0100:
            java.lang.Object r0 = r2.f10493d     // Catch:{ Exception -> 0x0119 }
            android.location.LocationManager r0 = (android.location.LocationManager) r0     // Catch:{ Exception -> 0x0119 }
            java.lang.String r3 = "gps"
            boolean r0 = r0.isProviderEnabled(r3)     // Catch:{ Exception -> 0x0119 }
            r2.f10490a = r0     // Catch:{ Exception -> 0x0119 }
            java.lang.Object r0 = r2.f10493d     // Catch:{ Exception -> 0x0119 }
            android.location.LocationManager r0 = (android.location.LocationManager) r0     // Catch:{ Exception -> 0x0119 }
            java.lang.String r3 = "network"
            boolean r0 = r0.isProviderEnabled(r3)     // Catch:{ Exception -> 0x0119 }
            r2.f10491b = r0     // Catch:{ Exception -> 0x0119 }
            goto L_0x0124
        L_0x0119:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Location isProviderEnabled failed due to "
            r3.<init>(r4)
            Q0.g.x(r0, r3, r1)
        L_0x0124:
            boolean r0 = r2.f10490a
            if (r0 != 0) goto L_0x012e
            boolean r3 = r2.f10491b
            if (r3 != 0) goto L_0x012e
            goto L_0x01a5
        L_0x012e:
            if (r0 == 0) goto L_0x0147
            java.lang.Object r0 = r2.f10493d     // Catch:{ SecurityException -> 0x0145, Exception -> 0x0143 }
            r3 = r0
            android.location.LocationManager r3 = (android.location.LocationManager) r3     // Catch:{ SecurityException -> 0x0145, Exception -> 0x0143 }
            java.lang.String r4 = "gps"
            java.lang.Object r0 = r2.f10495g     // Catch:{ SecurityException -> 0x0145, Exception -> 0x0143 }
            r8 = r0
            de.ozerov.fully.W r8 = (de.ozerov.fully.W) r8     // Catch:{ SecurityException -> 0x0145, Exception -> 0x0143 }
            r5 = 0
            r7 = 0
            r3.requestLocationUpdates(r4, r5, r7, r8)     // Catch:{ SecurityException -> 0x0145, Exception -> 0x0143 }
            goto L_0x0147
        L_0x0143:
            r0 = move-exception
            goto L_0x0185
        L_0x0145:
            r0 = move-exception
            goto L_0x0190
        L_0x0147:
            boolean r0 = r2.f10491b     // Catch:{ SecurityException -> 0x0145, Exception -> 0x0143 }
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r2.f10493d     // Catch:{ SecurityException -> 0x0145, Exception -> 0x0143 }
            r3 = r0
            android.location.LocationManager r3 = (android.location.LocationManager) r3     // Catch:{ SecurityException -> 0x0145, Exception -> 0x0143 }
            java.lang.String r4 = "network"
            java.lang.Object r0 = r2.f10496h     // Catch:{ SecurityException -> 0x0145, Exception -> 0x0143 }
            r8 = r0
            de.ozerov.fully.W r8 = (de.ozerov.fully.W) r8     // Catch:{ SecurityException -> 0x0145, Exception -> 0x0143 }
            r5 = 0
            r7 = 0
            r3.requestLocationUpdates(r4, r5, r7, r8)     // Catch:{ SecurityException -> 0x0145, Exception -> 0x0143 }
        L_0x015d:
            java.lang.Object r0 = r2.f10492c
            java.util.Timer r0 = (java.util.Timer) r0
            if (r0 == 0) goto L_0x016d
            r0.cancel()
            java.lang.Object r0 = r2.f10492c
            java.util.Timer r0 = (java.util.Timer) r0
            r0.purge()
        L_0x016d:
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r2.f10492c = r0
            P5.O r1 = new P5.O     // Catch:{ Exception -> 0x0180 }
            r3 = 4
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x0180 }
            r2 = 20000(0x4e20, double:9.8813E-320)
            r0.schedule(r1, r2)     // Catch:{ Exception -> 0x0180 }
            goto L_0x01a5
        L_0x0180:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x01a5
        L_0x0185:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Exception in requestLocationUpdates due to "
            r2.<init>(r3)
            Q0.g.x(r0, r2, r1)
            goto L_0x01a5
        L_0x0190:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SecurityException in requestLocationUpdates due to "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.e(r1, r0)
        L_0x01a5:
            return
        L_0x01a6:
            Z1.b r1 = new Z1.b
            r1.<init>(r0)
            K1.i r2 = Z1.e.f6956a
            android.content.Context r3 = r11.f6965V
            Z1.e.s(r3, r1, r2, r0)
            return
        L_0x01b3:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r6 = 1
            r7 = 0
            r5 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            Z1.f r1 = new Z1.f
            android.content.Context r3 = r11.f6965V
            r1.<init>(r3, r2)
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.f.run():void");
    }
}
