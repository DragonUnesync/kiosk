package n7;

import D7.e;
import G5.s;
import P6.f;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import de.ozerov.fully.MyApplication;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Proxy;
import org.acra.ErrorReporter;
import r7.C1395d;
import y7.a;

/* renamed from: n7.a  reason: case insensitive filesystem */
public abstract class C1247a {

    /* renamed from: a  reason: collision with root package name */
    public static ErrorReporter f13789a;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, java.lang.reflect.InvocationHandler] */
    static {
        ? obj = new Object();
        f13789a = (ErrorReporter) Proxy.newProxyInstance(s.class.getClassLoader(), new Class[]{ErrorReporter.class}, obj);
    }

    /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Object, java.lang.reflect.InvocationHandler] */
    public static final void a(MyApplication myApplication, C1395d dVar, boolean z) {
        SharedPreferences sharedPreferences;
        String str;
        boolean z6 = true;
        boolean b8 = b();
        if (f13789a instanceof a) {
            n2.a.m1("ACRA#init called more than once. This might have unexpected side effects. Doing this outside of tests is discouraged.");
            ErrorReporter errorReporter = f13789a;
            f.c(errorReporter, "null cannot be cast to non-null type org.acra.reporter.ErrorReporterImpl");
            Thread.setDefaultUncaughtExceptionHandler(((a) errorReporter).f16403d);
            ? obj = new Object();
            f13789a = (ErrorReporter) Proxy.newProxyInstance(s.class.getClassLoader(), new Class[]{ErrorReporter.class}, obj);
        }
        String str2 = dVar.f14953U;
        if (str2 != null) {
            sharedPreferences = myApplication.getSharedPreferences(str2, 0);
            f.b(sharedPreferences);
        } else {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(myApplication);
            f.b(sharedPreferences);
        }
        if (!b8) {
            try {
                z6 = sharedPreferences.getBoolean("acra.enable", !sharedPreferences.getBoolean("acra.disable", false));
            } catch (Exception unused) {
            }
            if (z6) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            String packageName = myApplication.getPackageName();
            n2.a.l0("ACRA is " + str + " for " + packageName + ", initializing...");
            a aVar = new a(myApplication, dVar, z6, z);
            f13789a = aVar;
            sharedPreferences.registerOnSharedPreferenceChangeListener(aVar);
        }
    }

    public static final boolean b() {
        String str;
        int i;
        boolean z;
        try {
            String a8 = new e(new File("/proc/self/cmdline")).a();
            int length = a8.length() - 1;
            int i8 = 0;
            boolean z6 = false;
            while (true) {
                if (i8 > length) {
                    break;
                }
                if (!z6) {
                    i = i8;
                } else {
                    i = length;
                }
                if (f.f(a8.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z6) {
                    if (!z) {
                        z6 = true;
                    } else {
                        i8++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            str = a8.subSequence(i8, length + 1).toString();
        } catch (IOException unused) {
            str = null;
        }
        if (str == null || !str.endsWith(":acra")) {
            return false;
        }
        return true;
    }
}
