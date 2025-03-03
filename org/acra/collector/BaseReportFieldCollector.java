package org.acra.collector;

import P6.f;
import android.content.Context;
import org.acra.ReportField;
import org.acra.collector.Collector;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public abstract class BaseReportFieldCollector implements Collector {
    private final ReportField[] reportFields;

    public BaseReportFieldCollector(ReportField... reportFieldArr) {
        f.e(reportFieldArr, "reportFields");
        this.reportFields = reportFieldArr;
    }

    public void collect(Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "crashReportData");
        ReportField[] reportFieldArr = this.reportFields;
        int length = reportFieldArr.length;
        int i = 0;
        while (i < length) {
            ReportField reportField = reportFieldArr[i];
            try {
                if (shouldCollect(context, dVar, reportField, bVar)) {
                    collect(reportField, context, dVar, bVar, aVar);
                }
                i++;
            } catch (Exception e) {
                aVar.h(reportField, (String) null);
                String name = reportField.name();
                String message = e.getMessage();
                throw new Exception("Error while retrieving " + name + " data:" + message, e);
            }
        }
    }

    public abstract void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar);

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    public /* synthetic */ Collector.Order getOrder() {
        return b.b(this);
    }

    public boolean shouldCollect(Context context, C1395d dVar, ReportField reportField, C1347b bVar) {
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(reportField, "collect");
        f.e(bVar, "reportBuilder");
        return dVar.f14958Z.contains(reportField);
    }
}
