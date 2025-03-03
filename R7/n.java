package r7;

import P6.f;
import W6.d;
import org.acra.ReportField;
import org.json.JSONObject;
import s7.C1408a;

public final class n extends JSONObject {
    public n(C1408a aVar) {
        f.e(aVar, "crashReportData");
        String a8 = aVar.a(ReportField.STACK_TRACE);
        put("stacktrace", a8);
        f.b(a8);
        int f02 = d.f0(a8, 10, 0, false, 6);
        if (f02 != -1) {
            a8 = a8.substring(0, f02);
            f.d(a8, "substring(...)");
        }
        int f03 = d.f0(a8, ':', 0, false, 6);
        if (f03 != -1) {
            a8 = a8.substring(0, f03);
            f.d(a8, "substring(...)");
        }
        try {
            Class.forName(a8);
            put("class", a8);
        } catch (ClassNotFoundException unused) {
        }
        put("timestamp", aVar.a(ReportField.USER_CRASH_DATE));
    }
}
