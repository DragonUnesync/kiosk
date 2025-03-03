package org.acra.collector;

import P6.f;
import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.acra.ReportField;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class TimeCollector extends BaseReportFieldCollector implements ApplicationStartupCollector {
    private Calendar appStartDate;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.ENGLISH);

    public TimeCollector() {
        super(ReportField.USER_APP_START_DATE, ReportField.USER_CRASH_DATE);
    }

    private String getTimeString(Calendar calendar) {
        String format = this.dateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
        f.d(format, "format(...)");
        return format;
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        Calendar calendar;
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        int i = u.f14297a[reportField.ordinal()];
        if (i == 1) {
            calendar = this.appStartDate;
        } else if (i == 2) {
            calendar = new GregorianCalendar();
        } else {
            throw new IllegalArgumentException();
        }
        f.b(calendar);
        aVar.h(reportField, getTimeString(calendar));
    }

    public void collectApplicationStartUp(Context context, C1395d dVar) {
        f.e(context, "context");
        f.e(dVar, "config");
        if (dVar.f14958Z.contains(ReportField.USER_APP_START_DATE)) {
            this.appStartDate = new GregorianCalendar();
        }
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    public boolean shouldCollect(Context context, C1395d dVar, ReportField reportField, C1347b bVar) {
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(reportField, "collect");
        f.e(bVar, "reportBuilder");
        if (reportField == ReportField.USER_CRASH_DATE || super.shouldCollect(context, dVar, reportField, bVar)) {
            return true;
        }
        return false;
    }
}
