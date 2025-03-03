package y7;

import B.q0;
import C7.d;
import P6.f;
import android.content.SharedPreferences;
import android.os.Handler;
import de.ozerov.fully.MyApplication;
import java.lang.Thread;
import java.util.Calendar;
import java.util.HashMap;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.collector.ApplicationStartupCollector;
import org.acra.collector.Collector;
import p7.C1346a;
import p7.C1347b;
import p7.c;
import r7.C1395d;
import s7.C1409b;
import v.i;

public final class a implements Thread.UncaughtExceptionHandler, SharedPreferences.OnSharedPreferenceChangeListener, ErrorReporter {

    /* renamed from: a  reason: collision with root package name */
    public final MyApplication f16400a;

    /* renamed from: b  reason: collision with root package name */
    public final c f16401b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f16402c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f16403d;

    public a(MyApplication myApplication, C1395d dVar, boolean z, boolean z6) {
        this.f16400a = myApplication;
        C1409b bVar = new C1409b(myApplication, dVar);
        for (Collector collector : bVar.f15158c) {
            if (collector instanceof ApplicationStartupCollector) {
                try {
                    ((ApplicationStartupCollector) collector).collectApplicationStartUp(bVar.f15156a, bVar.f15157b);
                } catch (Throwable th) {
                    ErrorReporter errorReporter = C1247a.f13789a;
                    n2.a.n1(collector.getClass().getSimpleName().concat(" failed to collect its startup data"), th);
                }
            }
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f16403d = defaultUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(this);
        C1346a aVar = new C1346a(this.f16400a);
        MyApplication myApplication2 = this.f16400a;
        q0 q0Var = new q0((Object) myApplication2, (Object) dVar, (Object) aVar, 5);
        i iVar = new i(myApplication2, dVar);
        c cVar = new c(this.f16400a, dVar, bVar, defaultUncaughtExceptionHandler, q0Var, iVar, aVar);
        this.f16401b = cVar;
        cVar.i = z;
        if (z6) {
            MyApplication myApplication3 = this.f16400a;
            d dVar2 = new d(myApplication3, dVar, iVar);
            Calendar instance = Calendar.getInstance();
            instance.add(12, -1);
            new Handler(myApplication3.getMainLooper()).post(new C7.c(dVar2, instance, z, 0));
        }
    }

    public final String a(String str, String str2) {
        f.e(str2, "value");
        return (String) this.f16402c.put(str, str2);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2;
        f.e(sharedPreferences, "sharedPreferences");
        if ("acra.disable".equals(str) || "acra.enable".equals(str)) {
            boolean z = true;
            try {
                z = sharedPreferences.getBoolean("acra.enable", !sharedPreferences.getBoolean("acra.disable", false));
            } catch (Exception unused) {
            }
            ErrorReporter errorReporter = C1247a.f13789a;
            if (z) {
                str2 = "enabled";
            } else {
                str2 = "disabled";
            }
            String packageName = this.f16400a.getPackageName();
            n2.a.l0("ACRA is " + str2 + " for " + packageName);
            this.f16401b.i = z;
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        f.e(thread, "t");
        f.e(th, "e");
        c cVar = this.f16401b;
        if (!cVar.i) {
            cVar.a(thread, th);
            return;
        }
        try {
            ErrorReporter errorReporter = C1247a.f13789a;
            String simpleName = th.getClass().getSimpleName();
            String packageName = this.f16400a.getPackageName();
            n2.a.B("ACRA caught a " + simpleName + " for " + packageName, th);
            C1347b bVar = new C1347b();
            bVar.f14676b = thread;
            bVar.f14677c = th;
            HashMap hashMap = this.f16402c;
            f.e(hashMap, "customData");
            bVar.f14678d.putAll(hashMap);
            bVar.e = true;
            bVar.a(cVar);
        } catch (Exception e) {
            ErrorReporter errorReporter2 = C1247a.f13789a;
            n2.a.B("ACRA failed to capture the error - handing off to native error reporter", e);
            cVar.a(thread, th);
        }
    }
}
