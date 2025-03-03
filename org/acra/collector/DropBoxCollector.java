package org.acra.collector;

import D6.h;
import D6.i;
import P6.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.DropBoxManager;
import android.preference.PreferenceManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.ReportField;
import org.acra.collector.Collector;
import org.json.JSONException;
import org.json.JSONObject;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class DropBoxCollector extends BaseReportFieldCollector {
    public static final f Companion = new Object();
    private static final String[] SYSTEM_TAGS = {"system_app_anr", "system_app_wtf", "system_app_crash", "system_server_anr", "system_server_wtf", "system_server_crash", "BATTERY_DISCHARGE_INFO", "SYSTEM_RECOVERY_LOG", "SYSTEM_BOOT", "SYSTEM_LAST_KMSG", "APANIC_CONSOLE", "APANIC_THREADS", "SYSTEM_RESTART", "SYSTEM_TOMBSTONE", "data_app_strictmode"};
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.getDefault());

    public DropBoxCollector() {
        super(ReportField.DROPBOX);
    }

    @SuppressLint({"MissingPermission"})
    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        Object systemService = context.getSystemService("dropbox");
        if (systemService != null) {
            DropBoxManager dropBoxManager = (DropBoxManager) systemService;
            Calendar instance = Calendar.getInstance();
            instance.roll(12, -dVar.f14956X);
            long timeInMillis = instance.getTimeInMillis();
            this.dateFormat.format(instance.getTime());
            ArrayList arrayList = new ArrayList();
            if (dVar.f14954V) {
                String[] strArr = SYSTEM_TAGS;
                f.e(strArr, "elements");
                arrayList.addAll(h.A(strArr));
            }
            List U8 = i.U(dVar.f14955W);
            if (!U8.isEmpty()) {
                arrayList.addAll(U8);
            }
            if (!arrayList.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    StringBuilder sb = new StringBuilder();
                    DropBoxManager.Entry nextEntry = dropBoxManager.getNextEntry(str, timeInMillis);
                    if (nextEntry == null) {
                        sb.append("Nothing.\n");
                    } else {
                        while (nextEntry != null) {
                            long timeMillis = nextEntry.getTimeMillis();
                            instance.setTimeInMillis(timeMillis);
                            sb.append('@');
                            sb.append(this.dateFormat.format(instance.getTime()));
                            sb.append(10);
                            String text = nextEntry.getText(500);
                            if (text != null) {
                                sb.append("Text: ");
                                sb.append(text);
                                sb.append(10);
                            } else {
                                sb.append("Not Text!\n");
                            }
                            nextEntry.close();
                            nextEntry = dropBoxManager.getNextEntry(str, timeMillis);
                        }
                        try {
                            jSONObject.put(str, sb.toString());
                        } catch (JSONException e) {
                            ErrorReporter errorReporter = C1247a.f13789a;
                            a.n1("Failed to collect data for tag " + str, e);
                        }
                    }
                }
                aVar.i(ReportField.DROPBOX, jSONObject);
                return;
            }
            return;
        }
        throw new Exception("Unable to load SystemService dropbox");
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
