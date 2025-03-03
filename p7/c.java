package p7;

import B.q0;
import P6.f;
import android.util.Log;
import de.ozerov.fully.MyApplication;
import java.lang.Thread;
import java.util.ArrayList;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.config.ReportingAdministrator;
import r7.C1395d;
import s7.C1409b;
import v.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final MyApplication f14679a;

    /* renamed from: b  reason: collision with root package name */
    public final C1395d f14680b;

    /* renamed from: c  reason: collision with root package name */
    public final C1409b f14681c;

    /* renamed from: d  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f14682d;
    public final q0 e;

    /* renamed from: f  reason: collision with root package name */
    public final i f14683f;

    /* renamed from: g  reason: collision with root package name */
    public final C1346a f14684g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f14685h;
    public boolean i;

    public c(MyApplication myApplication, C1395d dVar, C1409b bVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, q0 q0Var, i iVar, C1346a aVar) {
        this.f14679a = myApplication;
        this.f14680b = dVar;
        this.f14681c = bVar;
        this.f14682d = uncaughtExceptionHandler;
        this.e = q0Var;
        this.f14683f = iVar;
        this.f14684g = aVar;
        this.f14685h = ((x7.c) dVar.f14977t0).a(dVar, ReportingAdministrator.class);
    }

    public final void a(Thread thread, Throwable th) {
        f.e(thread, "t");
        f.e(th, "e");
        MyApplication myApplication = this.f14679a;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f14682d;
        if (uncaughtExceptionHandler != null) {
            ErrorReporter errorReporter = C1247a.f13789a;
            a.l0("ACRA is disabled for " + myApplication.getPackageName() + " - forwarding uncaught Exception on to default ExceptionHandler");
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        ErrorReporter errorReporter2 = C1247a.f13789a;
        String str = "ACRA is disabled for " + myApplication.getPackageName() + " - no default ExceptionHandler";
        f.e(str, "msg");
        Log.e("a", str);
        a.B("ACRA caught a " + th.getClass().getSimpleName() + " for " + myApplication.getPackageName(), th);
    }
}
