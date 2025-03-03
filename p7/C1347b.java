package p7;

import java.util.HashMap;

/* renamed from: p7.b  reason: case insensitive filesystem */
public final class C1347b {

    /* renamed from: a  reason: collision with root package name */
    public String f14675a;

    /* renamed from: b  reason: collision with root package name */
    public Thread f14676b;

    /* renamed from: c  reason: collision with root package name */
    public Throwable f14677c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f14678d = new HashMap();
    public boolean e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: org.acra.config.ReportingAdministrator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v75, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: org.acra.config.ReportingAdministrator} */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:179|180|182|183|229) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:182:0x03ed */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(p7.c r25) {
        /*
            r24 = this;
            r7 = r24
            r8 = r25
            java.lang.String r0 = "reportExecutor"
            P6.f.e(r8, r0)
            java.lang.String r0 = r7.f14675a
            if (r0 != 0) goto L_0x0015
            java.lang.Throwable r0 = r7.f14677c
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "Report requested by developer"
            r7.f14675a = r0
        L_0x0015:
            boolean r0 = r8.i
            if (r0 != 0) goto L_0x0022
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a
            java.lang.String r0 = "ACRA is disabled. Report not sent."
            n2.a.m1(r0)
            goto L_0x0413
        L_0x0022:
            java.util.ArrayList r10 = r8.f14685h
            java.util.Iterator r1 = r10.iterator()
            r2 = 0
            r11 = r2
        L_0x002a:
            boolean r0 = r1.hasNext()
            r7.d r12 = r8.f14680b
            de.ozerov.fully.MyApplication r13 = r8.f14679a
            java.lang.String r14 = " threw exception"
            java.lang.String r15 = "ReportingAdministrator "
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r1.next()
            r3 = r0
            org.acra.config.ReportingAdministrator r3 = (org.acra.config.ReportingAdministrator) r3
            boolean r0 = r3.shouldStartCollecting(r13, r12, r7)     // Catch:{ Exception -> 0x0047 }
            if (r0 != 0) goto L_0x002a
            r11 = r3
            goto L_0x002a
        L_0x0047:
            r0 = move-exception
            r4 = r0
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r15)
            r3.append(r0)
            r3.append(r14)
            java.lang.String r0 = r3.toString()
            n2.a.n1(r0, r4)
            goto L_0x002a
        L_0x0066:
            if (r11 != 0) goto L_0x0193
            s7.b r0 = r8.f14681c
            r7.d r1 = r0.f15157b
            boolean r1 = r1.f14976s0
            if (r1 == 0) goto L_0x0076
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newCachedThreadPool()
        L_0x0074:
            r6 = r1
            goto L_0x007b
        L_0x0076:
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor()
            goto L_0x0074
        L_0x007b:
            s7.a r5 = new s7.a
            r5.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.List r2 = r0.f15158c
            java.util.Iterator r2 = r2.iterator()
        L_0x008b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00b7
            java.lang.Object r3 = r2.next()
            r4 = r3
            org.acra.collector.Collector r4 = (org.acra.collector.Collector) r4
            org.acra.collector.Collector$Order r4 = r4.getOrder()     // Catch:{ Exception -> 0x009d }
            goto L_0x009f
        L_0x009d:
            org.acra.collector.Collector$Order r4 = org.acra.collector.Collector.Order.NORMAL
        L_0x009f:
            java.lang.Object r16 = r1.get(r4)
            if (r16 != 0) goto L_0x00af
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r1.put(r4, r9)
            r16 = r9
        L_0x00af:
            r4 = r16
            java.util.List r4 = (java.util.List) r4
            r4.add(r3)
            goto L_0x008b
        L_0x00b7:
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>(r1)
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r9 = r1.iterator()
        L_0x00c4:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0151
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            org.acra.collector.Collector$Order r2 = (org.acra.collector.Collector.Order) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            org.acra.ErrorReporter r2 = n7.C1247a.f13789a
            P6.f.b(r1)
            P6.f.b(r6)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r2 = D6.k.M(r1)
            r4.<init>(r2)
            java.util.Iterator r16 = r1.iterator()
        L_0x00f1:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0124
            java.lang.Object r1 = r16.next()
            r2 = r1
            org.acra.collector.Collector r2 = (org.acra.collector.Collector) r2
            B7.e r3 = new B7.e
            r17 = 7
            r1 = r3
            r18 = r3
            r3 = r0
            r19 = r4
            r4 = r24
            r20 = r5
            r21 = r0
            r0 = r6
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r18
            java.util.concurrent.Future r1 = r0.submit(r1)
            r2 = r19
            r2.add(r1)
            r6 = r0
            r4 = r2
            r0 = r21
            goto L_0x00f1
        L_0x0124:
            r21 = r0
            r2 = r4
            r20 = r5
            r0 = r6
            java.util.Iterator r1 = r2.iterator()
        L_0x012e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0148
            java.lang.Object r2 = r1.next()
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
        L_0x013a:
            boolean r3 = r2.isDone()
            if (r3 != 0) goto L_0x012e
            r2.get()     // Catch:{ InterruptedException -> 0x0146, ExecutionException -> 0x0144 }
            goto L_0x013a
        L_0x0144:
            goto L_0x012e
        L_0x0146:
            goto L_0x013a
        L_0x0148:
            org.acra.ErrorReporter r1 = n7.C1247a.f13789a
            r6 = r0
            r5 = r20
            r0 = r21
            goto L_0x00c4
        L_0x0151:
            r20 = r5
            java.util.Iterator r1 = r10.iterator()
        L_0x0157:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x018f
            java.lang.Object r0 = r1.next()
            r2 = r0
            org.acra.config.ReportingAdministrator r2 = (org.acra.config.ReportingAdministrator) r2
            r3 = r20
            boolean r0 = r2.shouldSendReport(r13, r12, r3)     // Catch:{ Exception -> 0x0170 }
            if (r0 != 0) goto L_0x016d
            r11 = r2
        L_0x016d:
            r20 = r3
            goto L_0x0157
        L_0x0170:
            r0 = move-exception
            r4 = r0
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = r2.toString()
            n2.a.n1(r0, r4)
            goto L_0x016d
        L_0x018f:
            r3 = r20
            r2 = r3
            goto L_0x0195
        L_0x0193:
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a
        L_0x0195:
            boolean r0 = r7.e
            B.q0 r1 = r8.e
            if (r0 == 0) goto L_0x025e
            java.util.Iterator r4 = r10.iterator()
            r5 = 1
        L_0x01a0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r0 = r4.next()
            r6 = r0
            org.acra.config.ReportingAdministrator r6 = (org.acra.config.ReportingAdministrator) r6
            p7.a r0 = r8.f14684g     // Catch:{ Exception -> 0x01b7 }
            boolean r0 = r6.shouldFinishActivity(r13, r12, r0)     // Catch:{ Exception -> 0x01b7 }
            if (r0 != 0) goto L_0x01a0
            r5 = 0
            goto L_0x01a0
        L_0x01b7:
            r0 = move-exception
            org.acra.ErrorReporter r9 = n7.C1247a.f13789a
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r15)
            r9.append(r6)
            r9.append(r14)
            java.lang.String r6 = r9.toString()
            n2.a.n1(r6, r0)
            goto L_0x01a0
        L_0x01d5:
            if (r5 == 0) goto L_0x025e
            java.lang.Thread r0 = r7.f14676b
            org.acra.ErrorReporter r4 = n7.C1247a.f13789a
            java.lang.Object r4 = r1.f302X
            p7.a r4 = (p7.C1346a) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            H3.q r6 = r4.f14672a
            r5.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
            r9 = 0
        L_0x01eb:
            boolean r16 = r5.hasNext()
            if (r16 == 0) goto L_0x021e
            java.lang.Object r16 = r5.next()
            r3 = r16
            android.app.Activity r3 = (android.app.Activity) r3
            r16 = r5
            D7.d r5 = new D7.d
            r23 = r1
            r1 = 0
            r5.<init>(r3, r1)
            android.os.Looper r1 = r3.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 != r1) goto L_0x0215
            r5.run()
            r5 = r16
            r1 = r23
            goto L_0x01eb
        L_0x0215:
            r3.runOnUiThread(r5)
            r5 = r16
            r1 = r23
            r9 = 1
            goto L_0x01eb
        L_0x021e:
            r23 = r1
            if (r9 == 0) goto L_0x0259
            java.util.concurrent.locks.ReentrantLock r1 = r4.f14673b
            r1.lock()
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024e }
            r19 = r17
        L_0x022d:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x024e }
            if (r0 != 0) goto L_0x0250
            r0 = 100
            r3 = r10
            long r9 = (long) r0     // Catch:{ all -> 0x024e }
            long r21 = r17 + r9
            int r0 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0251
            java.util.concurrent.locks.Condition r0 = r4.f14674c     // Catch:{ all -> 0x024e }
            long r19 = r17 - r19
            long r9 = r19 + r9
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x024e }
            r0.await(r9, r5)     // Catch:{ all -> 0x024e }
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024e }
            r10 = r3
            goto L_0x022d
        L_0x024e:
            r0 = move-exception
            goto L_0x0255
        L_0x0250:
            r3 = r10
        L_0x0251:
            r1.unlock()
            goto L_0x025a
        L_0x0255:
            r1.unlock()
            throw r0
        L_0x0259:
            r3 = r10
        L_0x025a:
            r6.clear()
            goto L_0x0261
        L_0x025e:
            r23 = r1
            r3 = r10
        L_0x0261:
            if (r11 != 0) goto L_0x02f3
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskWrites()
            P6.f.b(r2)
            org.acra.ReportField r0 = org.acra.ReportField.USER_CRASH_DATE
            java.lang.String r0 = r2.a(r0)
            org.acra.ReportField r4 = org.acra.ReportField.IS_SILENT
            java.lang.String r4 = r2.a(r4)
            if (r4 == 0) goto L_0x0281
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            if (r4 == 0) goto L_0x0281
            java.lang.String r4 = n7.b.f13790a
            goto L_0x0283
        L_0x0281:
            java.lang.String r4 = ""
        L_0x0283:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = ".stacktrace"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "ACRA-unapproved"
            r6 = 0
            java.io.File r5 = r13.getDir(r5, r6)
            java.lang.String r6 = "getDir(...)"
            P6.f.d(r5, r6)
            r4.<init>(r5, r0)
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a     // Catch:{ Exception -> 0x02cd }
            org.acra.data.StringFormat r17 = org.acra.data.StringFormat.JSON     // Catch:{ JSONException -> 0x02c0, Exception -> 0x02be }
            D6.r r19 = D6.r.f1269U     // Catch:{ JSONException -> 0x02c0, Exception -> 0x02be }
            java.lang.String r20 = ""
            java.lang.String r21 = ""
            r22 = 0
            r18 = r2
            java.lang.String r0 = r17.toFormattedString(r18, r19, r20, r21, r22)     // Catch:{ JSONException -> 0x02c0, Exception -> 0x02be }
            n2.a.p1(r4, r0)     // Catch:{ Exception -> 0x02cd }
            goto L_0x02d5
        L_0x02be:
            r0 = move-exception
            goto L_0x02c2
        L_0x02c0:
            r0 = move-exception
            goto L_0x02cc
        L_0x02c2:
            org.json.JSONException r5 = new org.json.JSONException     // Catch:{ Exception -> 0x02cd }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x02cd }
            r5.<init>(r0)     // Catch:{ Exception -> 0x02cd }
            throw r5     // Catch:{ Exception -> 0x02cd }
        L_0x02cc:
            throw r0     // Catch:{ Exception -> 0x02cd }
        L_0x02cd:
            r0 = move-exception
            org.acra.ErrorReporter r5 = n7.C1247a.f13789a
            java.lang.String r5 = "An error occurred while writing the report file..."
            n2.a.B(r5, r0)
        L_0x02d5:
            d4.k r0 = new d4.k
            r0.<init>((de.ozerov.fully.MyApplication) r13, (r7.C1395d) r12)
            boolean r0 = r0.L2(r4)
            if (r0 == 0) goto L_0x02ef
            boolean r0 = r8.i
            if (r0 == 0) goto L_0x02ea
            v.i r0 = r8.f14683f
            r0.h(r4)
            goto L_0x02ef
        L_0x02ea:
            java.lang.String r0 = "Would be sending reports, but ACRA is disabled"
            n2.a.m1(r0)
        L_0x02ef:
            android.os.StrictMode.setThreadPolicy(r1)
            goto L_0x0319
        L_0x02f3:
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a
            r11.notifyReportDropped(r13, r12)     // Catch:{ Exception -> 0x02f9 }
            goto L_0x0319
        L_0x02f9:
            r0 = move-exception
            r1 = r0
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r15)
            r4.append(r0)
            java.lang.String r0 = " threw exeption"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            n2.a.n1(r0, r1)
        L_0x0319:
            boolean r0 = r7.e
            if (r0 == 0) goto L_0x0413
            java.util.Iterator r1 = r3.iterator()
            r3 = 1
        L_0x0322:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0356
            java.lang.Object r0 = r1.next()
            r4 = r0
            org.acra.config.ReportingAdministrator r4 = (org.acra.config.ReportingAdministrator) r4
            boolean r0 = r4.shouldKillApplication(r13, r12, r7, r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x0322
            r3 = 0
            goto L_0x0322
        L_0x0337:
            r0 = move-exception
            r5 = r0
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r15)
            r4.append(r0)
            r4.append(r14)
            java.lang.String r0 = r4.toString()
            n2.a.n1(r0, r5)
            goto L_0x0322
        L_0x0356:
            if (r3 == 0) goto L_0x0413
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 == 0) goto L_0x0376
            java.lang.Thread r0 = new java.lang.Thread
            de.ozerov.fully.M2 r1 = new de.ozerov.fully.M2
            r2 = 12
            r1.<init>((int) r2, (java.lang.Object) r8)
            r0.<init>(r1)
            r0.start()
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a
            java.lang.String r0 = "Warning: Acra may behave differently with a debugger attached"
            n2.a.m1(r0)
            goto L_0x0413
        L_0x0376:
            java.lang.Thread r0 = r7.f14676b
            java.lang.Throwable r1 = r7.f14677c
            if (r1 != 0) goto L_0x0381
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>()
        L_0x0381:
            if (r0 == 0) goto L_0x0392
            boolean r2 = r12.f14960b0
            if (r2 == 0) goto L_0x0392
            java.lang.Thread$UncaughtExceptionHandler r2 = r8.f14682d
            if (r2 == 0) goto L_0x0392
            org.acra.ErrorReporter r3 = n7.C1247a.f13789a
            r2.uncaughtException(r0, r1)
            goto L_0x0413
        L_0x0392:
            r1 = r23
            java.lang.Object r0 = r1.f300V
            de.ozerov.fully.MyApplication r0 = (de.ozerov.fully.MyApplication) r0
            java.lang.Object r1 = r1.f301W
            r7.d r1 = (r7.C1395d) r1
            boolean r1 = r1.f14971m0
            if (r1 == 0) goto L_0x03ff
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch:{ g -> 0x03eb }
            if (r1 == 0) goto L_0x03f0
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ g -> 0x03eb }
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r1 = r1.getRunningServices(r2)     // Catch:{ g -> 0x03eb }
            int r2 = android.os.Process.myPid()     // Catch:{ g -> 0x03eb }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ g -> 0x03eb }
        L_0x03b9:
            boolean r3 = r1.hasNext()     // Catch:{ g -> 0x03eb }
            if (r3 == 0) goto L_0x03ff
            java.lang.Object r3 = r1.next()     // Catch:{ g -> 0x03eb }
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3     // Catch:{ g -> 0x03eb }
            int r4 = r3.pid     // Catch:{ g -> 0x03eb }
            if (r4 != r2) goto L_0x03b9
            android.content.ComponentName r4 = r3.service     // Catch:{ g -> 0x03eb }
            java.lang.String r4 = r4.getClassName()     // Catch:{ g -> 0x03eb }
            java.lang.String r5 = "getClassName(...)"
            P6.f.d(r4, r5)     // Catch:{ g -> 0x03eb }
            java.lang.String r5 = "org.acra"
            r6 = 0
            boolean r4 = W6.l.a0(r4, r5, r6)     // Catch:{ g -> 0x03eb }
            if (r4 != 0) goto L_0x03b9
            android.content.Intent r4 = new android.content.Intent     // Catch:{ SecurityException -> 0x03ed }
            r4.<init>()     // Catch:{ SecurityException -> 0x03ed }
            android.content.ComponentName r3 = r3.service     // Catch:{ SecurityException -> 0x03ed }
            r4.setComponent(r3)     // Catch:{ SecurityException -> 0x03ed }
            r0.stopService(r4)     // Catch:{ SecurityException -> 0x03ed }
            goto L_0x03b9
        L_0x03eb:
            r0 = move-exception
            goto L_0x03f8
        L_0x03ed:
            org.acra.ErrorReporter r3 = n7.C1247a.f13789a     // Catch:{ g -> 0x03eb }
            goto L_0x03b9
        L_0x03f0:
            D7.g r0 = new D7.g     // Catch:{ g -> 0x03eb }
            java.lang.String r1 = "Unable to load SystemService activity"
            r0.<init>(r1)     // Catch:{ g -> 0x03eb }
            throw r0     // Catch:{ g -> 0x03eb }
        L_0x03f8:
            org.acra.ErrorReporter r1 = n7.C1247a.f13789a
            java.lang.String r1 = "Unable to stop services"
            n2.a.B(r1, r0)
        L_0x03ff:
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            r0 = 10
            java.lang.System.exit(r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "System.exit returned normally, while it was supposed to halt JVM."
            r0.<init>(r1)
            throw r0
        L_0x0413:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C1347b.a(p7.c):void");
    }
}
