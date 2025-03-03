package org.acra.sender;

import B7.d;
import B7.h;
import P6.f;
import android.content.Context;
import org.acra.data.StringFormat;
import org.acra.plugins.HasConfigPlugin;
import r7.C1395d;
import r7.C1399h;

public class HttpSenderFactory extends HasConfigPlugin implements ReportSenderFactory {
    public HttpSenderFactory() {
        super(C1399h.class);
    }

    public h create(Context context, C1395d dVar) {
        f.e(context, "context");
        f.e(dVar, "config");
        return new d(dVar, (HttpSender$Method) null, (StringFormat) null, (String) null);
    }
}
