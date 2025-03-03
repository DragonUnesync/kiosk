package B7;

import android.content.Context;
import android.os.Bundle;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import s7.C1408a;

public final class f implements h {
    public final void a(Context context, C1408a aVar, Bundle bundle) {
        P6.f.e(context, "context");
        P6.f.e(context, "context");
        ErrorReporter errorReporter = C1247a.f13789a;
        String packageName = context.getPackageName();
        a.m1(packageName + " reports will NOT be sent - no valid ReportSender was found!");
    }
}
