package org.acra.collector;

import P6.f;
import android.content.Context;
import org.acra.ReportField;
import org.acra.collector.Collector;
import org.json.JSONObject;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class ThreadCollector extends BaseReportFieldCollector {
    public ThreadCollector() {
        super(ReportField.THREAD_DETAILS);
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        Thread thread = bVar.f14676b;
        if (thread != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", thread.getId());
            jSONObject.put("name", thread.getName());
            jSONObject.put("priority", thread.getPriority());
            ThreadGroup threadGroup = thread.getThreadGroup();
            if (threadGroup != null) {
                jSONObject.put("groupName", threadGroup);
            }
            aVar.i(ReportField.THREAD_DETAILS, jSONObject);
            return;
        }
        aVar.h(ReportField.THREAD_DETAILS, (String) null);
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    public Collector.Order getOrder() {
        return Collector.Order.LATE;
    }
}
