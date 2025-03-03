package org.acra.collector;

import D6.b;
import D6.r;
import F.h;
import P6.f;
import W6.l;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.acra.ReportField;
import org.json.JSONObject;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class ReflectionCollector extends BaseReportFieldCollector {
    public static final m Companion = new Object();

    public ReflectionCollector() {
        super(ReportField.BUILD, ReportField.BUILD_CONFIG, ReportField.ENVIRONMENT);
    }

    private void collectStaticGettersResults(Class<?> cls, JSONObject jSONObject) {
        b g8 = f.g(cls.getMethods());
        while (g8.hasNext()) {
            Method method = (Method) g8.next();
            Class[] parameterTypes = method.getParameterTypes();
            f.d(parameterTypes, "getParameterTypes(...)");
            if (parameterTypes.length == 0) {
                String name = method.getName();
                f.d(name, "getName(...)");
                if (!l.a0(name, "get", false)) {
                    String name2 = method.getName();
                    f.d(name2, "getName(...)");
                    if (!l.a0(name2, "is", false)) {
                    }
                }
                if (!"getClass".equals(method.getName())) {
                    try {
                        jSONObject.put(method.getName(), method.invoke((Object) null, (Object[]) null));
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                    }
                }
            }
        }
    }

    private Class<?> getBuildConfigClass(Context context, C1395d dVar) {
        Class<?> cls = dVar.f14966h0;
        if (cls != null) {
            return cls;
        }
        String packageName = context.getPackageName();
        return Class.forName(packageName + ".BuildConfig");
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        JSONObject jSONObject = new JSONObject();
        int i = n.f14292a[reportField.ordinal()];
        r rVar = r.f1269U;
        if (i == 1) {
            m mVar = Companion;
            List w2 = h.w("SERIAL");
            mVar.getClass();
            m.a(Build.class, jSONObject, w2);
            JSONObject jSONObject2 = new JSONObject();
            m.a(Build.VERSION.class, jSONObject2, rVar);
            jSONObject.put("VERSION", jSONObject2);
        } else if (i == 2) {
            m mVar2 = Companion;
            Class<?> buildConfigClass = getBuildConfigClass(context, dVar);
            mVar2.getClass();
            m.a(buildConfigClass, jSONObject, rVar);
        } else if (i == 3) {
            collectStaticGettersResults(Environment.class, jSONObject);
        } else {
            throw new IllegalArgumentException();
        }
        aVar.i(reportField, jSONObject);
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }
}
