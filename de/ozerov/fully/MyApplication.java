package de.ozerov.fully;

import Q0.g;
import Q5.j;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import d4.k;
import java.lang.Thread;
import java.util.ArrayList;
import n2.a;

public class MyApplication extends Application {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ int f10105b0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f10106U;

    /* renamed from: V  reason: collision with root package name */
    public k f10107V;

    /* renamed from: W  reason: collision with root package name */
    public long f10108W;

    /* renamed from: X  reason: collision with root package name */
    public final T1 f10109X = new T1(this);

    /* renamed from: Y  reason: collision with root package name */
    public Activity f10110Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f10111Z = false;

    /* renamed from: a0  reason: collision with root package name */
    public final ArrayList f10112a0 = new ArrayList();

    /* JADX WARNING: Can't wrap try/catch for region: R(9:17|18|19|20|21|22|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
        if (r14.exists() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        r14.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ae, code lost:
        if (r14.exists() == false) goto L_0x00b1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0072 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void attachBaseContext(android.content.Context r18) {
        /*
            r17 = this;
            r1 = r17
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 0
            r10 = 1
            java.lang.String r11 = "MyApplication"
            super.attachBaseContext(r18)
            int r0 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            if (r0 >= r12) goto L_0x0016
            goto L_0x00b1
        L_0x0016:
            boolean r0 = me.weishu.reflection.BootstrapClass.exemptAll()
            if (r0 == 0) goto L_0x001e
            goto L_0x00b1
        L_0x001e:
            java.lang.String r0 = "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TGFuZHJvaWQvdXRpbC9Mb2c7ABFMamF2YS9sYW5nL0NsYXNzOwAUTGphdmEvbGFuZy9DbGFzczwqPjsAEkxqYXZhL2xhbmcvT2JqZWN0OwASTGphdmEvbGFuZy9TdHJpbmc7ABJMamF2YS9sYW5nL1N5c3RlbTsAFUxqYXZhL2xhbmcvVGhyb3dhYmxlOwAaTGphdmEvbGFuZy9yZWZsZWN0L01ldGhvZDsAJkxtZS93ZWlzaHUvZnJlZXJlZmxlY3Rpb24vQnVpbGRDb25maWc7ACVMbWUvd2Vpc2h1L3JlZmxlY3Rpb24vQm9vdHN0cmFwQ2xhc3M7ACFMbWUvd2Vpc2h1L3JlZmxlY3Rpb24vUmVmbGVjdGlvbjsAClJlZmxlY3Rpb24AD1JlZmxlY3Rpb24uamF2YQAHU0RLX0lOVAADVEFHAAFWAAxWRVJTSU9OX0NPREUADFZFUlNJT05fTkFNRQACVkwAAVoAAlpMABJbTGphdmEvbGFuZy9DbGFzczsAE1tMamF2YS9sYW5nL09iamVjdDsAE1tMamF2YS9sYW5nL1N0cmluZzsAB2NvbnRleHQAF2RhbHZpay5zeXN0ZW0uVk1SdW50aW1lAAFlAAZleGVtcHQACWV4ZW1wdEFsbAAHZm9yTmFtZQAPZnJlZS1yZWZsZWN0aW9uABJnZXRBcHBsaWNhdGlvbkluZm8AEWdldERlY2xhcmVkTWV0aG9kAApnZXRSdW50aW1lAAZpbnZva2UAC2xvYWRMaWJyYXJ5ABhtZS53ZWlzaHUuZnJlZXJlZmxlY3Rpb24ABm1ldGhvZAAHbWV0aG9kcwAZcmVmbGVjdCBib290c3RyYXAgZmFpbGVkOgAHcmVsZWFzZQAKc1ZtUnVudGltZQAWc2V0SGlkZGVuQXBpRXhlbXB0aW9ucwAQdGFyZ2V0U2RrVmVyc2lvbgAEdGhpcwAGdW5zZWFsAAx1bnNlYWxOYXRpdmUADnZtUnVudGltZUNsYXNzAAYABw4AFgAHDmr/AwEyCwEVEAMCNQvwBAREBhcBEg8DAzYLARsPqQUCBQMFBBkeAwAvCgAOAAcOACwBOgcOADYBOwcsnRriAQEDAC8KHgBIAAcOAA0ABw4AEwEtBx1yGWtaAAYXOBc8HxcABAEXAQEXBgEXHwYAAQACGQEZARkBGQEZARkGgYAEiAcDAAUACBoBCgEKB4iABKAHAYGABLQJAQnMCQGJAfQJAQnMCgEAAwALGgyBgAT4CgEJkAsBigIAAAAADgAAAAAAAAABAAAAAAAAAAEAAABEAAAAcAAAAAIAAAATAAAAgAEAAAMAAAALAAAAzAEAAAQAAAAMAAAAUAIAAAUAAAAPAAAAsAIAAAYAAAADAAAAKAMAAAEgAAAIAAAAiAMAAAEQAAAHAAAA3AUAAAIgAABEAAAAFgYAAAMgAAAIAAAAAwoAAAUgAAADAAAAZgoAAAAgAAADAAAAeAoAAAAQAAABAAAAyAoAAA=="
            byte[] r0 = android.util.Base64.decode(r0, r8)
            r12 = 0
            if (r18 == 0) goto L_0x002c
            java.io.File r13 = r18.getCodeCacheDir()
            goto L_0x0047
        L_0x002c:
            java.lang.String r13 = "java.io.tmpdir"
            java.lang.String r13 = java.lang.System.getProperty(r13)
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 == 0) goto L_0x003a
        L_0x0038:
            r13 = r12
            goto L_0x0047
        L_0x003a:
            java.io.File r14 = new java.io.File
            r14.<init>(r13)
            boolean r13 = r14.exists()
            if (r13 != 0) goto L_0x0046
            goto L_0x0038
        L_0x0046:
            r13 = r14
        L_0x0047:
            if (r13 != 0) goto L_0x004a
            goto L_0x00b1
        L_0x004a:
            java.io.File r14 = new java.io.File
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            r15.append(r2)
            java.lang.String r2 = ".dex"
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            r14.<init>(r13, r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0096 }
            r2.<init>(r14)     // Catch:{ all -> 0x0096 }
            r2.write(r0)     // Catch:{ all -> 0x0098 }
            r2.close()     // Catch:{ all -> 0x0096 }
            r14.setReadOnly()     // Catch:{ all -> 0x0072 }
        L_0x0072:
            dalvik.system.DexFile r0 = new dalvik.system.DexFile     // Catch:{ all -> 0x0096 }
            r0.<init>(r14)     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "me.weishu.reflection.BootstrapClass"
            java.lang.Class r0 = r0.loadClass(r2, r12)     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "exemptAll"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r12)     // Catch:{ all -> 0x0096 }
            java.lang.Object r0 = r0.invoke(r12, r12)     // Catch:{ all -> 0x0096 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0096 }
            r0.getClass()     // Catch:{ all -> 0x0096 }
            boolean r0 = r14.exists()
            if (r0 == 0) goto L_0x00b1
        L_0x0092:
            r14.delete()
            goto L_0x00b1
        L_0x0096:
            r0 = move-exception
            goto L_0x00a7
        L_0x0098:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            r12 = r0
            r2.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a6
        L_0x00a1:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ all -> 0x0096 }
        L_0x00a6:
            throw r12     // Catch:{ all -> 0x0096 }
        L_0x00a7:
            r0.printStackTrace()     // Catch:{ all -> 0x0248 }
            boolean r0 = r14.exists()
            if (r0 == 0) goto L_0x00b1
            goto L_0x0092
        L_0x00b1:
            d4.k r0 = new d4.k
            r0.<init>((android.content.Context) r1, (int) r10)
            r1.f10107V = r0
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00cb }
            java.io.File r2 = r17.getFilesDir()     // Catch:{ Exception -> 0x00cb }
            java.lang.String r2 = r2.getParent()     // Catch:{ Exception -> 0x00cb }
            java.lang.String r3 = "app_ACRA-unapproved"
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x00cb }
            n2.a.C(r0)     // Catch:{ Exception -> 0x00cb }
            goto L_0x00d6
        L_0x00cb:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to delete unsent ACRA reports: "
            r2.<init>(r3)
            Q0.g.x(r0, r2, r11)
        L_0x00d6:
            r0 = 11
            org.acra.ReportField[] r0 = new org.acra.ReportField[r0]     // Catch:{ Exception -> 0x0231 }
            org.acra.ReportField r2 = org.acra.ReportField.REPORT_ID     // Catch:{ Exception -> 0x0231 }
            r0[r9] = r2     // Catch:{ Exception -> 0x0231 }
            org.acra.ReportField r2 = org.acra.ReportField.USER_CRASH_DATE     // Catch:{ Exception -> 0x0231 }
            r0[r10] = r2     // Catch:{ Exception -> 0x0231 }
            org.acra.ReportField r2 = org.acra.ReportField.APP_VERSION_CODE     // Catch:{ Exception -> 0x0231 }
            r0[r8] = r2     // Catch:{ Exception -> 0x0231 }
            org.acra.ReportField r2 = org.acra.ReportField.APP_VERSION_NAME     // Catch:{ Exception -> 0x0231 }
            r0[r7] = r2     // Catch:{ Exception -> 0x0231 }
            org.acra.ReportField r2 = org.acra.ReportField.PACKAGE_NAME     // Catch:{ Exception -> 0x0231 }
            r0[r6] = r2     // Catch:{ Exception -> 0x0231 }
            org.acra.ReportField r2 = org.acra.ReportField.ANDROID_VERSION     // Catch:{ Exception -> 0x0231 }
            r0[r5] = r2     // Catch:{ Exception -> 0x0231 }
            org.acra.ReportField r2 = org.acra.ReportField.PHONE_MODEL     // Catch:{ Exception -> 0x0231 }
            r0[r4] = r2     // Catch:{ Exception -> 0x0231 }
            org.acra.ReportField r2 = org.acra.ReportField.INSTALLATION_ID     // Catch:{ Exception -> 0x0231 }
            r3 = 7
            r0[r3] = r2     // Catch:{ Exception -> 0x0231 }
            org.acra.ReportField r2 = org.acra.ReportField.CUSTOM_DATA     // Catch:{ Exception -> 0x0231 }
            r3 = 8
            r0[r3] = r2     // Catch:{ Exception -> 0x0231 }
            org.acra.ReportField r2 = org.acra.ReportField.STACK_TRACE     // Catch:{ Exception -> 0x0231 }
            r3 = 9
            r0[r3] = r2     // Catch:{ Exception -> 0x0231 }
            org.acra.ReportField r2 = org.acra.ReportField.LOGCAT     // Catch:{ Exception -> 0x0231 }
            r3 = 10
            r0[r3] = r2     // Catch:{ Exception -> 0x0231 }
            r7.f r2 = new r7.f     // Catch:{ Exception -> 0x0231 }
            r2.<init>()     // Catch:{ Exception -> 0x0231 }
            java.lang.Class<de.ozerov.fully.P> r3 = de.ozerov.fully.P.class
            r7.e r12 = r2.f14998p     // Catch:{ Exception -> 0x0231 }
            P6.h[] r13 = r7.C1397f.f14981D     // Catch:{ Exception -> 0x0231 }
            r14 = 14
            r14 = r13[r14]     // Catch:{ Exception -> 0x0231 }
            r12.o(r14, r3)     // Catch:{ Exception -> 0x0231 }
            org.acra.data.StringFormat r3 = org.acra.data.StringFormat.KEY_VALUE_LIST     // Catch:{ Exception -> 0x0231 }
            java.lang.String r12 = "reportFormat"
            P6.f.e(r3, r12)     // Catch:{ Exception -> 0x0231 }
            r7.e r12 = r2.z     // Catch:{ Exception -> 0x0231 }
            r14 = 24
            r14 = r13[r14]     // Catch:{ Exception -> 0x0231 }
            r12.o(r14, r3)     // Catch:{ Exception -> 0x0231 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0231 }
            r7.e r12 = r2.f14991h     // Catch:{ Exception -> 0x0231 }
            r14 = r13[r4]     // Catch:{ Exception -> 0x0231 }
            r12.o(r14, r3)     // Catch:{ Exception -> 0x0231 }
            r7.u r12 = new r7.u     // Catch:{ Exception -> 0x0231 }
            r12.<init>()     // Catch:{ Exception -> 0x0231 }
            r14 = 2131951674(0x7f13003a, float:1.953977E38)
            java.lang.String r14 = r1.getString(r14)     // Catch:{ Exception -> 0x0231 }
            java.lang.String r15 = "text"
            P6.f.e(r14, r15)     // Catch:{ Exception -> 0x0231 }
            r12.f15076c = r14     // Catch:{ Exception -> 0x0231 }
            r7.s r12 = r12.a()     // Catch:{ Exception -> 0x0231 }
            r7.a[] r14 = new r7.C1392a[r10]     // Catch:{ Exception -> 0x0231 }
            r14[r9] = r12     // Catch:{ Exception -> 0x0231 }
            r2.b(r14)     // Catch:{ Exception -> 0x0231 }
            r7.m r12 = new r7.m     // Catch:{ Exception -> 0x0231 }
            r12.<init>()     // Catch:{ Exception -> 0x0231 }
            r14 = 7
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0231 }
            r7.l r15 = r12.f15058d     // Catch:{ Exception -> 0x0231 }
            P6.h[] r16 = r7.m.f15054l     // Catch:{ Exception -> 0x0231 }
            r9 = r16[r8]     // Catch:{ Exception -> 0x0231 }
            r15.o(r9, r14)     // Catch:{ Exception -> 0x0231 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ Exception -> 0x0231 }
            java.lang.String r14 = "periodUnit"
            P6.f.e(r9, r14)     // Catch:{ Exception -> 0x0231 }
            r7.l r14 = r12.f15057c     // Catch:{ Exception -> 0x0231 }
            r15 = r16[r10]     // Catch:{ Exception -> 0x0231 }
            r14.o(r15, r9)     // Catch:{ Exception -> 0x0231 }
            r9 = 25
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0231 }
            r7.l r14 = r12.e     // Catch:{ Exception -> 0x0231 }
            r7 = r16[r7]     // Catch:{ Exception -> 0x0231 }
            r14.o(r7, r9)     // Catch:{ Exception -> 0x0231 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0231 }
            r7.l r9 = r12.f15060g     // Catch:{ Exception -> 0x0231 }
            r14 = r16[r5]     // Catch:{ Exception -> 0x0231 }
            r9.o(r14, r7)     // Catch:{ Exception -> 0x0231 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0231 }
            r7.l r9 = r12.f15059f     // Catch:{ Exception -> 0x0231 }
            r14 = r16[r6]     // Catch:{ Exception -> 0x0231 }
            r9.o(r14, r7)     // Catch:{ Exception -> 0x0231 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0231 }
            r7.l r8 = r12.f15061h     // Catch:{ Exception -> 0x0231 }
            r9 = r16[r4]     // Catch:{ Exception -> 0x0231 }
            r8.o(r9, r7)     // Catch:{ Exception -> 0x0231 }
            java.lang.String r7 = "App stopped working again"
            r7.l r8 = r12.i     // Catch:{ Exception -> 0x0231 }
            r9 = 7
            r9 = r16[r9]     // Catch:{ Exception -> 0x0231 }
            r8.o(r9, r7)     // Catch:{ Exception -> 0x0231 }
            r7.l r7 = r12.f15062j     // Catch:{ Exception -> 0x0231 }
            r8 = 8
            r8 = r16[r8]     // Catch:{ Exception -> 0x0231 }
            r7.o(r8, r3)     // Catch:{ Exception -> 0x0231 }
            r7.l r7 = r12.f15056b     // Catch:{ Exception -> 0x0231 }
            r8 = 0
            r9 = r16[r8]     // Catch:{ Exception -> 0x0231 }
            r7.o(r9, r3)     // Catch:{ Exception -> 0x0231 }
            r7.k r7 = r12.a()     // Catch:{ Exception -> 0x0231 }
            r7.a[] r9 = new r7.C1392a[r10]     // Catch:{ Exception -> 0x0231 }
            r9[r8] = r7     // Catch:{ Exception -> 0x0231 }
            r2.b(r9)     // Catch:{ Exception -> 0x0231 }
            r7.j r7 = new r7.j     // Catch:{ Exception -> 0x0231 }
            r7.<init>()     // Catch:{ Exception -> 0x0231 }
            r8 = 8000(0x1f40, float:1.121E-41)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0231 }
            r7.i r12 = r7.f15032g     // Catch:{ Exception -> 0x0231 }
            P6.h[] r14 = r7.j.f15026r     // Catch:{ Exception -> 0x0231 }
            r6 = r14[r6]     // Catch:{ Exception -> 0x0231 }
            r12.o(r6, r9)     // Catch:{ Exception -> 0x0231 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0231 }
            r7.i r8 = r7.f15033h     // Catch:{ Exception -> 0x0231 }
            r9 = r14[r5]     // Catch:{ Exception -> 0x0231 }
            r8.o(r9, r6)     // Catch:{ Exception -> 0x0231 }
            r7.i r6 = r7.i     // Catch:{ Exception -> 0x0231 }
            r4 = r14[r4]     // Catch:{ Exception -> 0x0231 }
            r6.o(r4, r3)     // Catch:{ Exception -> 0x0231 }
            d4.k r3 = r1.f10107V     // Catch:{ Exception -> 0x0231 }
            java.lang.String r4 = "crashReportUrl"
            java.lang.String r6 = "https://licensing.fully-kiosk.com/api/error_report.php"
            java.lang.Object r3 = r3.f9767W     // Catch:{ Exception -> 0x0231 }
            Z1.c r3 = (Z1.c) r3     // Catch:{ Exception -> 0x0231 }
            java.lang.String r3 = r3.r(r4, r6)     // Catch:{ Exception -> 0x0231 }
            java.lang.String r4 = "uri"
            P6.f.e(r3, r4)     // Catch:{ Exception -> 0x0231 }
            r7.f15029c = r3     // Catch:{ Exception -> 0x0231 }
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0231 }
            r7.i r4 = r7.f15028b     // Catch:{ Exception -> 0x0231 }
            r6 = 0
            r8 = r14[r6]     // Catch:{ Exception -> 0x0231 }
            r4.o(r8, r3)     // Catch:{ Exception -> 0x0231 }
            r7.h r3 = r7.a()     // Catch:{ Exception -> 0x0231 }
            r7.a[] r4 = new r7.C1392a[r10]     // Catch:{ Exception -> 0x0231 }
            r4[r6] = r3     // Catch:{ Exception -> 0x0231 }
            r2.b(r4)     // Catch:{ Exception -> 0x0231 }
            java.util.List r0 = D6.h.H(r0)     // Catch:{ Exception -> 0x0231 }
            r7.e r3 = r2.f14990g     // Catch:{ Exception -> 0x0231 }
            r4 = r13[r5]     // Catch:{ Exception -> 0x0231 }
            r3.o(r4, r0)     // Catch:{ Exception -> 0x0231 }
            org.acra.ErrorReporter r0 = n7.C1247a.f13789a     // Catch:{ Exception -> 0x0231 }
            r7.d r0 = r2.a()     // Catch:{ Exception -> 0x0231 }
            n7.C1247a.a(r1, r0, r10)     // Catch:{ Exception -> 0x0231 }
            goto L_0x023c
        L_0x0231:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to init ACRA due to "
            r2.<init>(r3)
            Q0.g.x(r0, r2, r11)
        L_0x023c:
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            r1.f10106U = r0
            de.ozerov.fully.T1 r0 = r1.f10109X
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)
            return
        L_0x0248:
            r0 = move-exception
            r2 = r0
            boolean r0 = r14.exists()
            if (r0 == 0) goto L_0x0253
            r14.delete()
        L_0x0253:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.MyApplication.attachBaseContext(android.content.Context):void");
    }

    public final void onCreate() {
        boolean z;
        Cursor rawQuery;
        super.onCreate();
        String U8 = a.U(this);
        if (U8 == null || !U8.contains(":")) {
            z = true;
        } else {
            z = false;
        }
        Process.myPid();
        if (a.E0()) {
            String unused = Process.myProcessName();
        }
        Context applicationContext = getApplicationContext();
        C0764r0 r0Var = C0794w0.f11034t;
        if (r0Var != null) {
            r0Var.close();
            C0794w0.f11034t = null;
            C0794w0.f11033s = null;
        }
        try {
            C0764r0 r0Var2 = new C0764r0(applicationContext, "log.db", (SQLiteDatabase.CursorFactory) null, 2, 0);
            C0794w0.f11034t = r0Var2;
            C0794w0.f11033s = r0Var2.getWritableDatabase();
            String U9 = a.U(applicationContext);
            if (U9 == null || !U9.contains(":")) {
                try {
                    rawQuery = C0794w0.f11033s.rawQuery("SELECT MAX(_id) FROM fully_log", (String[]) null);
                    rawQuery.moveToFirst();
                    if (!rawQuery.isAfterLast()) {
                        if (rawQuery.getType(0) != 0) {
                            rawQuery.getLong(0);
                            long j7 = rawQuery.getLong(0) - 32000;
                            if (j7 > 0) {
                                SQLiteDatabase sQLiteDatabase = C0794w0.f11033s;
                                sQLiteDatabase.execSQL("DELETE FROM fully_log WHERE _id<" + j7);
                                Log.i("w0", "Deleting Fully Log entries with id smaller than #" + j7);
                            }
                        }
                    }
                    rawQuery.close();
                } catch (Exception e) {
                    g.x(e, new StringBuilder("Failed to clean the fully_log due to "), "w0");
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            a.U(applicationContext);
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Failed to open database due to "), "w0");
        }
        if (z) {
            this.f10108W = System.currentTimeMillis();
            j.f4184a = false;
            registerActivityLifecycleCallbacks(new U1(0, this));
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
            return;
        }
        return;
        throw th;
    }

    public final void onLowMemory() {
        super.onLowMemory();
        Log.i("MyApplication", "onLowMemory()");
    }
}
