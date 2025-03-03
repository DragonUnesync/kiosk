package org.acra.startup;

import P6.f;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.plugins.HasConfigPlugin;
import r7.k;

public class LimiterStartupProcessor extends HasConfigPlugin implements StartupProcessor {
    public LimiterStartupProcessor() {
        super(k.class);
    }

    private long getAppVersion(Context context) {
        f.e(context, "context");
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (packageManager != null) {
            try {
                packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                ErrorReporter errorReporter = C1247a.f13789a;
                String packageName = context.getPackageName();
                a.m1("Failed to find PackageInfo for current App : " + packageName);
            } catch (Exception unused2) {
            }
        }
        if (packageInfo == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:12|13|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:29|30|31|32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        r3 = (long) r10.getInt("acra.lastVersionNr", 0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void processReports(android.content.Context r9, r7.C1395d r10, java.util.List<C7.a> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "acra.lastVersionNr"
            java.lang.String r1 = "context"
            P6.f.e(r9, r1)
            java.lang.String r1 = "config"
            P6.f.e(r10, r1)
            java.lang.String r1 = "reports"
            P6.f.e(r11, r1)
            java.lang.Class<r7.k> r1 = r7.k.class
            r7.a r1 = N7.a.k(r10, r1)
            r7.k r1 = (r7.k) r1
            boolean r2 = r1.f15051d0
            boolean r1 = r1.f15050c0
            if (r1 != 0) goto L_0x0021
            if (r2 == 0) goto L_0x00b1
        L_0x0021:
            r3 = 0
            java.lang.String r10 = r10.f14953U
            if (r10 == 0) goto L_0x002e
            android.content.SharedPreferences r10 = r9.getSharedPreferences(r10, r3)
            P6.f.b(r10)
            goto L_0x0035
        L_0x002e:
            android.content.SharedPreferences r10 = android.preference.PreferenceManager.getDefaultSharedPreferences(r9)
            P6.f.b(r10)
        L_0x0035:
            r4 = 0
            long r3 = r10.getLong(r0, r4)     // Catch:{ ClassCastException -> 0x003f }
        L_0x003b:
            r4 = r3
            goto L_0x0045
        L_0x003d:
            goto L_0x0045
        L_0x003f:
            int r3 = r10.getInt(r0, r3)     // Catch:{ Exception -> 0x003d }
            long r3 = (long) r3
            goto L_0x003b
        L_0x0045:
            long r6 = r8.getAppVersion(r9)
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b1
            if (r1 == 0) goto L_0x006e
            android.content.SharedPreferences$Editor r10 = r10.edit()
            android.content.SharedPreferences$Editor r10 = r10.putLong(r0, r6)
            r10.apply()
            java.util.Iterator r10 = r11.iterator()
        L_0x005e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x006e
            java.lang.Object r11 = r10.next()
            C7.a r11 = (C7.a) r11
            r0 = 1
            r11.f725c = r0
            goto L_0x005e
        L_0x006e:
            if (r2 == 0) goto L_0x00b1
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ IOException -> 0x00a9 }
            r10.<init>()     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r11 = "ACRA-limiter.json"
            java.io.File r9 = r9.getFileStreamPath(r11)     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r11 = "getFileStreamPath(...)"
            P6.f.d(r9, r11)     // Catch:{ IOException -> 0x00a9 }
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ IOException -> 0x00a9 }
            r11.<init>(r10)     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r10 = r11.toString()     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r11 = "toString(...)"
            P6.f.d(r10, r11)     // Catch:{ IOException -> 0x00a9 }
            java.io.OutputStreamWriter r11 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x00a9 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00a9 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r9 = "UTF-8"
            r11.<init>(r0, r9)     // Catch:{ IOException -> 0x00a9 }
            r11.write(r10)     // Catch:{ all -> 0x00a4 }
            r11.flush()     // Catch:{ all -> 0x00a4 }
            r11.close()     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00b1
        L_0x00a4:
            r9 = move-exception
            r11.close()     // Catch:{ IOException -> 0x00a8 }
        L_0x00a8:
            throw r9     // Catch:{ IOException -> 0x00a9 }
        L_0x00a9:
            r9 = move-exception
            org.acra.ErrorReporter r10 = n7.C1247a.f13789a
            java.lang.String r10 = "Failed to reset LimiterData"
            n2.a.n1(r10, r9)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.acra.startup.LimiterStartupProcessor.processReports(android.content.Context, r7.d, java.util.List):void");
    }
}
