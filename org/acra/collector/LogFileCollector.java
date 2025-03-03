package org.acra.collector;

import D7.e;
import P6.f;
import android.content.Context;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.ReportField;
import org.acra.collector.Collector;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class LogFileCollector extends BaseReportFieldCollector {
    public LogFileCollector() {
        super(ReportField.APPLICATION_LOG);
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        String str = dVar.f14967i0;
        if (str != null) {
            ReportField reportField2 = ReportField.APPLICATION_LOG;
            e eVar = new e(dVar.f14969k0.getFile(context, str));
            eVar.f1276b = dVar.f14968j0;
            aVar.h(reportField2, eVar.a());
            return;
        }
        ErrorReporter errorReporter = C1247a.f13789a;
        ReportField reportField3 = ReportField.APPLICATION_LOG;
        a.m1(reportField3 + " was enabled but applicationLogFile was not set. No application log will be recorded.");
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    public Collector.Order getOrder() {
        return Collector.Order.LATE;
    }
}
