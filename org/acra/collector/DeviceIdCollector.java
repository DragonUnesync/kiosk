package org.acra.collector;

import P6.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import org.acra.ReportField;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;
import u.C1477r;

public class DeviceIdCollector extends BaseReportFieldCollector {
    public DeviceIdCollector() {
        super(ReportField.DEVICE_ID);
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        String str;
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        if (Build.VERSION.SDK_INT <= 28) {
            Object systemService = context.getSystemService("phone");
            if (systemService != null) {
                str = ((TelephonyManager) systemService).getDeviceId();
            } else {
                throw new Exception(C1477r.d("Unable to load SystemService ", "phone"));
            }
        } else {
            str = null;
        }
        aVar.h(ReportField.DEVICE_ID, str);
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldCollect(android.content.Context r2, r7.C1395d r3, org.acra.ReportField r4, p7.C1347b r5) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            P6.f.e(r2, r0)
            java.lang.String r0 = "config"
            P6.f.e(r3, r0)
            java.lang.String r0 = "collect"
            P6.f.e(r4, r0)
            java.lang.String r0 = "reportBuilder"
            P6.f.e(r5, r0)
            boolean r4 = super.shouldCollect(r2, r3, r4, r5)
            r5 = 0
            if (r4 == 0) goto L_0x0052
            java.lang.String r3 = r3.f14953U
            if (r3 == 0) goto L_0x0027
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r5)
            P6.f.b(r3)
            goto L_0x002e
        L_0x0027:
            android.content.SharedPreferences r3 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            P6.f.b(r3)
        L_0x002e:
            java.lang.String r4 = "acra.deviceid.enable"
            r0 = 1
            boolean r3 = r3.getBoolean(r4, r0)
            if (r3 == 0) goto L_0x0052
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            android.content.pm.PackageManager r4 = r2.getPackageManager()
            if (r4 != 0) goto L_0x0041
        L_0x003f:
            r2 = 0
            goto L_0x004f
        L_0x0041:
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x004d }
            int r2 = r4.checkPermission(r3, r2)     // Catch:{ Exception -> 0x004d }
            if (r2 != 0) goto L_0x003f
            r2 = 1
            goto L_0x004f
        L_0x004d:
            goto L_0x003f
        L_0x004f:
            if (r2 == 0) goto L_0x0052
            r5 = 1
        L_0x0052:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.acra.collector.DeviceIdCollector.shouldCollect(android.content.Context, r7.d, org.acra.ReportField, p7.b):boolean");
    }
}
