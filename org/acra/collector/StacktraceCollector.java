package org.acra.collector;

import D6.b;
import P6.f;
import android.content.Context;
import android.text.TextUtils;
import g7.l;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.acra.ReportField;
import org.acra.collector.Collector;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class StacktraceCollector extends BaseReportFieldCollector {
    public StacktraceCollector() {
        super(ReportField.STACK_TRACE, ReportField.STACK_TRACE_HASH);
    }

    private String getStackTrace(String str, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    printWriter.println(str);
                }
            } catch (Throwable th2) {
                l.c(printWriter, th);
                throw th2;
            }
        }
        if (th != null) {
            th.printStackTrace(printWriter);
        }
        String obj = stringWriter.toString();
        l.c(printWriter, (Throwable) null);
        return obj;
    }

    private String getStackTraceHash(Throwable th) {
        StringBuilder sb = new StringBuilder();
        while (th != null) {
            b g8 = f.g(th.getStackTrace());
            while (g8.hasNext()) {
                StackTraceElement stackTraceElement = (StackTraceElement) g8.next();
                sb.append(stackTraceElement.getClassName());
                sb.append(stackTraceElement.getMethodName());
            }
            th = th.getCause();
        }
        String hexString = Integer.toHexString(sb.toString().hashCode());
        f.d(hexString, "toHexString(...)");
        return hexString;
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        int i = t.f14296a[reportField.ordinal()];
        if (i == 1) {
            aVar.h(ReportField.STACK_TRACE, getStackTrace(bVar.f14675a, bVar.f14677c));
        } else if (i == 2) {
            aVar.h(ReportField.STACK_TRACE_HASH, getStackTraceHash(bVar.f14677c));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    public Collector.Order getOrder() {
        return Collector.Order.FIRST;
    }

    public boolean shouldCollect(Context context, C1395d dVar, ReportField reportField, C1347b bVar) {
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(reportField, "collect");
        f.e(bVar, "reportBuilder");
        if (reportField == ReportField.STACK_TRACE || super.shouldCollect(context, dVar, reportField, bVar)) {
            return true;
        }
        return false;
    }
}
