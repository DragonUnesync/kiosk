package B7;

import P6.f;
import java.net.URL;
import org.acra.ReportField;
import org.acra.sender.HttpSender$Method;
import s7.C1408a;

public final class b extends HttpSender$Method {
    public final URL createURL(String str, C1408a aVar) {
        f.e(str, "baseUrl");
        f.e(aVar, "report");
        String a8 = aVar.a(ReportField.REPORT_ID);
        return new URL(str + "/" + a8);
    }
}
