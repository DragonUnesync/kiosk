package D7;

import G.h;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import j0.C1115d;
import j0.e;
import java.lang.reflect.Method;
import n7.C1247a;
import org.acra.ErrorReporter;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1273U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Activity f1274V;

    public /* synthetic */ d(Activity activity, int i) {
        this.f1273U = i;
        this.f1274V = activity;
    }

    public final void run() {
        boolean z;
        Application application;
        C1115d dVar;
        Handler handler;
        boolean z6;
        Activity activity = this.f1274V;
        switch (this.f1273U) {
            case 0:
                activity.finish();
                ErrorReporter errorReporter = C1247a.f13789a;
                return;
            default:
                if (!activity.isFinishing()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 28) {
                        Class cls = e.f12828a;
                        activity.recreate();
                        return;
                    }
                    Class cls2 = e.f12828a;
                    if (i == 26 || i == 27) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Method method = e.f12832f;
                    if ((!z || method != null) && !(e.e == null && e.f12831d == null)) {
                        try {
                            Object obj = e.f12830c.get(activity);
                            if (obj != null) {
                                Object obj2 = e.f12829b.get(activity);
                                if (obj2 != null) {
                                    application = activity.getApplication();
                                    dVar = new C1115d(activity);
                                    application.registerActivityLifecycleCallbacks(dVar);
                                    handler = e.f12833g;
                                    handler.post(new h(dVar, 4, obj));
                                    if (i == 26 || i == 27) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj2, new Object[]{obj, null, null, 0, bool, null, null, bool, bool});
                                    } else {
                                        activity.recreate();
                                    }
                                    handler.post(new h(application, 5, dVar));
                                    return;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    activity.recreate();
                    return;
                }
                return;
        }
    }
}
