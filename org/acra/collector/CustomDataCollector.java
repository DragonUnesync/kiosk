package org.acra.collector;

import P6.f;
import android.content.Context;
import java.util.HashMap;
import org.acra.ReportField;
import org.json.JSONObject;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class CustomDataCollector extends BaseReportFieldCollector {
    public CustomDataCollector() {
        super(ReportField.CUSTOM_DATA);
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        aVar.i(ReportField.CUSTOM_DATA, new JSONObject(new HashMap(bVar.f14678d)));
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }
}
