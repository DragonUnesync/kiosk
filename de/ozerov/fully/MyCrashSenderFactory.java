package de.ozerov.fully;

import B7.d;
import B7.h;
import Z1.c;
import android.content.Context;
import d4.k;
import org.acra.data.StringFormat;
import org.acra.sender.HttpSender$Method;
import org.acra.sender.ReportSenderFactory;
import r7.C1395d;

public class MyCrashSenderFactory implements ReportSenderFactory {
    private static final String TAG = "MyCrashSenderFactory";

    public h create(Context context, C1395d dVar) {
        return new d(dVar, HttpSender$Method.POST, StringFormat.KEY_VALUE_LIST, ((c) new k(context, 1).f9767W).r("crashReportUrl", "https://licensing.fully-kiosk.com/api/error_report.php"));
    }

    public boolean enabled(C1395d dVar) {
        return true;
    }
}
