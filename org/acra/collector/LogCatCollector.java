package org.acra.collector;

import D6.i;
import D7.e;
import O6.l;
import P6.f;
import W6.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.ReportField;
import org.acra.collector.Collector;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class LogCatCollector extends BaseReportFieldCollector {
    public static final g Companion = new Object();
    private static final int READ_TIMEOUT = 3000;

    public LogCatCollector() {
        super(ReportField.LOGCAT, ReportField.EVENTSLOG, ReportField.RADIOLOG);
    }

    private String collectLogCat(C1395d dVar, String str) {
        Process.myPid();
        ArrayList arrayList = new ArrayList();
        arrayList.add("logcat");
        if (str != null) {
            arrayList.add("-b");
            arrayList.add(str);
        }
        List U8 = i.U(dVar.f14957Y);
        int indexOf = U8.indexOf("-t");
        int i = -1;
        if (indexOf > -1 && indexOf < U8.size()) {
            i = Integer.parseInt((String) U8.get(indexOf + 1));
        }
        arrayList.addAll(U8);
        Process start = new ProcessBuilder(new String[0]).command(arrayList).redirectErrorStream(true).start();
        ErrorReporter errorReporter = C1247a.f13789a;
        try {
            InputStream inputStream = start.getInputStream();
            f.d(inputStream, "getInputStream(...)");
            return streamToString(dVar, inputStream, (l) null, i);
        } finally {
            start.destroy();
        }
    }

    private static final boolean collectLogCat$lambda$2$lambda$1(String str, String str2) {
        f.e(str2, "it");
        return d.c0(str2, str);
    }

    private String streamToString(C1395d dVar, InputStream inputStream, l lVar, int i) {
        e eVar = new e(inputStream);
        eVar.f1278d = lVar;
        eVar.f1276b = i;
        if (dVar.f14962d0) {
            eVar.f1277c = READ_TIMEOUT;
        }
        return eVar.a();
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        String str;
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        int i = h.f14288a[reportField.ordinal()];
        if (i == 1) {
            str = null;
        } else if (i == 2) {
            str = "events";
        } else if (i == 3) {
            str = "radio";
        } else {
            throw new IllegalArgumentException();
        }
        aVar.h(reportField, collectLogCat(dVar, str));
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    public Collector.Order getOrder() {
        return Collector.Order.FIRST;
    }

    public boolean shouldCollect(Context context, C1395d dVar, ReportField reportField, C1347b bVar) {
        SharedPreferences sharedPreferences;
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(reportField, "collect");
        f.e(bVar, "reportBuilder");
        if (!super.shouldCollect(context, dVar, reportField, bVar)) {
            return false;
        }
        String str = dVar.f14953U;
        if (str != null) {
            sharedPreferences = context.getSharedPreferences(str, 0);
            f.b(sharedPreferences);
        } else {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            f.b(sharedPreferences);
        }
        if (sharedPreferences.getBoolean("acra.syslog.enable", true)) {
            return true;
        }
        return false;
    }
}
