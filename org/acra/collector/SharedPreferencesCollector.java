package org.acra.collector;

import P6.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import org.acra.ReportField;
import org.json.JSONObject;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class SharedPreferencesCollector extends BaseReportFieldCollector {
    public SharedPreferencesCollector() {
        super(ReportField.USER_EMAIL, ReportField.SHARED_PREFERENCES);
    }

    private boolean filteredKey(C1395d dVar, String str) {
        for (String str2 : dVar.f14964f0) {
            f.e(str2, "pattern");
            Pattern compile = Pattern.compile(str2);
            f.d(compile, "compile(...)");
            f.e(str, "input");
            if (compile.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        SharedPreferences sharedPreferences;
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        int i = q.f14294a[reportField.ordinal()];
        if (i == 1) {
            ReportField reportField2 = ReportField.USER_EMAIL;
            String str = dVar.f14953U;
            if (str != null) {
                sharedPreferences = context.getSharedPreferences(str, 0);
                f.b(sharedPreferences);
            } else {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                f.b(sharedPreferences);
            }
            aVar.h(reportField2, sharedPreferences.getString("acra.user.email", (String) null));
        } else if (i == 2) {
            aVar.i(ReportField.SHARED_PREFERENCES, collect(context, dVar));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    private JSONObject collect(Context context, C1395d dVar) {
        JSONObject jSONObject = new JSONObject();
        TreeMap treeMap = new TreeMap();
        treeMap.put("default", PreferenceManager.getDefaultSharedPreferences(context));
        for (String str : dVar.f14961c0) {
            treeMap.put(str, context.getSharedPreferences(str, 0));
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String str2 = (String) entry.getKey();
            Map<String, ?> all = ((SharedPreferences) entry.getValue()).getAll();
            if (all.isEmpty()) {
                jSONObject.put(str2, "empty");
            } else {
                Iterator<String> it = all.keySet().iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    f.d(next, "next(...)");
                    if (filteredKey(dVar, next)) {
                        it.remove();
                    }
                }
                jSONObject.put(str2, new JSONObject(all));
            }
        }
        return jSONObject;
    }
}
