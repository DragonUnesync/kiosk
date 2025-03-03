package org.acra.collector;

import P6.f;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.ReportField;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class PackageManagerCollector extends BaseReportFieldCollector {
    public PackageManagerCollector() {
        super(ReportField.APP_VERSION_NAME, ReportField.APP_VERSION_CODE);
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        long j7;
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
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
        if (packageInfo != null) {
            int i = l.f14291a[reportField.ordinal()];
            if (i == 1) {
                aVar.h(ReportField.APP_VERSION_NAME, packageInfo.versionName);
            } else if (i == 2) {
                ReportField reportField2 = ReportField.APP_VERSION_CODE;
                if (Build.VERSION.SDK_INT >= 28) {
                    j7 = packageInfo.getLongVersionCode();
                } else {
                    j7 = (long) packageInfo.versionCode;
                }
                aVar.g(reportField2, j7);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new Exception("Failed to get package info");
        }
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }
}
