package org.acra.collector;

import D6.b;
import P6.f;
import W6.l;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.ReportField;
import org.json.JSONObject;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class SettingsCollector extends BaseReportFieldCollector {
    public static final o Companion = new Object();
    private static final String ERROR = "Error: ";

    public SettingsCollector() {
        super(ReportField.SETTINGS_SYSTEM, ReportField.SETTINGS_SECURE, ReportField.SETTINGS_GLOBAL);
    }

    private JSONObject collectSettings(Context context, C1395d dVar, Class<?> cls) {
        JSONObject jSONObject = new JSONObject();
        Field[] fields = cls.getFields();
        Class<String> cls2 = String.class;
        Method method = cls.getMethod("getString", new Class[]{ContentResolver.class, cls2});
        b g8 = f.g(fields);
        while (g8.hasNext()) {
            Field field = (Field) g8.next();
            if (!field.isAnnotationPresent(Deprecated.class) && f.a(field.getType(), cls2) && isAuthorized(dVar, field)) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[]{context.getContentResolver(), field.get((Object) null)});
                    if (invoke != null) {
                        jSONObject.put(field.getName(), invoke);
                    }
                } catch (Exception e) {
                    ErrorReporter errorReporter = C1247a.f13789a;
                    a.n1(ERROR, e);
                }
            }
        }
        return jSONObject;
    }

    private boolean isAuthorized(C1395d dVar, Field field) {
        if (field != null) {
            String name = field.getName();
            f.d(name, "getName(...)");
            if (!l.a0(name, "WIFI_AP", false)) {
                for (String str : dVar.f14965g0) {
                    String name2 = field.getName();
                    f.d(name2, "getName(...)");
                    f.e(str, "pattern");
                    Pattern compile = Pattern.compile(str);
                    f.d(compile, "compile(...)");
                    if (compile.matcher(name2).matches()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        int i = p.f14293a[reportField.ordinal()];
        if (i == 1) {
            aVar.i(ReportField.SETTINGS_SYSTEM, collectSettings(context, dVar, Settings.System.class));
        } else if (i == 2) {
            aVar.i(ReportField.SETTINGS_SECURE, collectSettings(context, dVar, Settings.Secure.class));
        } else if (i == 3) {
            aVar.i(ReportField.SETTINGS_GLOBAL, collectSettings(context, dVar, Settings.Global.class));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }
}
