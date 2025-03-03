package org.acra.collector;

import D7.b;
import P6.f;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.UUID;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.ReportField;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class SimpleValuesCollector extends BaseReportFieldCollector {
    public static final r Companion = new Object();

    public SimpleValuesCollector() {
        super(ReportField.IS_SILENT, ReportField.REPORT_ID, ReportField.INSTALLATION_ID, ReportField.PACKAGE_NAME, ReportField.PHONE_MODEL, ReportField.ANDROID_VERSION, ReportField.BRAND, ReportField.PRODUCT, ReportField.FILE_PATH, ReportField.USER_IP);
    }

    private String getApplicationFilePath(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        f.d(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        String str;
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        switch (s.f14295a[reportField.ordinal()]) {
            case 1:
                aVar.f(ReportField.IS_SILENT);
                return;
            case 2:
                aVar.h(ReportField.REPORT_ID, UUID.randomUUID().toString());
                return;
            case 3:
                ReportField reportField2 = ReportField.INSTALLATION_ID;
                synchronized (b.class) {
                    try {
                        File file = new File(context.getFilesDir(), "ACRA-INSTALLATION");
                        if (!file.exists()) {
                            String uuid = UUID.randomUUID().toString();
                            f.d(uuid, "toString(...)");
                            a.p1(file, uuid);
                        }
                        str = a.R0(file);
                    } catch (IOException e) {
                        ErrorReporter errorReporter = C1247a.f13789a;
                        String packageName = context.getPackageName();
                        a.n1("Couldn't retrieve InstallationId for " + packageName, e);
                        str = "Couldn't retrieve InstallationId";
                    } catch (RuntimeException e8) {
                        ErrorReporter errorReporter2 = C1247a.f13789a;
                        String packageName2 = context.getPackageName();
                        a.n1("Couldn't retrieve InstallationId for " + packageName2, e8);
                        str = "Couldn't retrieve InstallationId";
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                aVar.h(reportField2, str);
                return;
            case 4:
                aVar.h(ReportField.PACKAGE_NAME, context.getPackageName());
                return;
            case 5:
                aVar.h(ReportField.PHONE_MODEL, Build.MODEL);
                return;
            case 6:
                aVar.h(ReportField.ANDROID_VERSION, Build.VERSION.RELEASE);
                return;
            case 7:
                aVar.h(ReportField.BRAND, Build.BRAND);
                return;
            case 8:
                aVar.h(ReportField.PRODUCT, Build.PRODUCT);
                return;
            case 9:
                aVar.h(ReportField.FILE_PATH, getApplicationFilePath(context));
                return;
            case 10:
                ReportField reportField3 = ReportField.USER_IP;
                Companion.getClass();
                StringBuilder sb = new StringBuilder();
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                boolean z = true;
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress()) {
                            if (!z) {
                                sb.append(10);
                            }
                            sb.append(nextElement.getHostAddress());
                            z = false;
                        }
                    }
                }
                String sb2 = sb.toString();
                f.d(sb2, "toString(...)");
                aVar.h(reportField3, sb2);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    public boolean shouldCollect(Context context, C1395d dVar, ReportField reportField, C1347b bVar) {
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(reportField, "collect");
        f.e(bVar, "reportBuilder");
        if (reportField == ReportField.IS_SILENT || reportField == ReportField.REPORT_ID || super.shouldCollect(context, dVar, reportField, bVar)) {
            return true;
        }
        return false;
    }
}
