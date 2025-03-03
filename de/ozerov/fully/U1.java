package de.ozerov.fully;

import L0.c;
import P6.f;
import Q0.g;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import de.ozerov.fully.receiver.CrashTestReceiver;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import n7.C1247a;
import org.acra.ErrorReporter;
import p7.C1346a;

public final class U1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10421a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10422b;

    public /* synthetic */ U1(int i, Object obj) {
        this.f10421a = i;
        this.f10422b = obj;
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f10421a) {
            case 0:
                if (!((MyApplication) this.f10422b).f10111Z) {
                    CrashTestReceiver.f10932a = true;
                    try {
                        Intent intent = new Intent((MyApplication) this.f10422b, ForegroundService.class);
                        intent.setAction("com.fullykiosk.singleapp.action.process_started");
                        intent.putExtra("processId", Process.myPid());
                        ((MyApplication) this.f10422b).startService(intent);
                    } catch (Exception e) {
                        int i = MyApplication.f10105b0;
                        g.z(e, new StringBuilder("Failed to send PROCESS_STARTED due to "), "MyApplication");
                    }
                    ((MyApplication) this.f10422b).f10111Z = true;
                    return;
                }
                return;
            default:
                f.e(activity, "activity");
                ErrorReporter errorReporter = C1247a.f13789a;
                ((C1346a) this.f10422b).f14672a.add(activity);
                return;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        Object obj = this.f10422b;
        switch (this.f10421a) {
            case 0:
                ((MyApplication) obj).f10110Y = null;
                return;
            default:
                f.e(activity, "activity");
                ErrorReporter errorReporter = C1247a.f13789a;
                C1346a aVar = (C1346a) obj;
                ReentrantLock reentrantLock = aVar.f14673b;
                reentrantLock.lock();
                try {
                    aVar.f14672a.remove(activity);
                    aVar.f14674c.signalAll();
                    return;
                } finally {
                    reentrantLock.unlock();
                }
        }
    }

    public final void onActivityPaused(Activity activity) {
        switch (this.f10421a) {
            case 0:
                MyApplication myApplication = (MyApplication) this.f10422b;
                myApplication.f10112a0.remove(activity);
                if (myApplication.f10112a0.isEmpty()) {
                    c.a(myApplication.getApplicationContext()).c(new Intent("com.fullykiosk.singleapp.event.background_app"));
                    return;
                }
                return;
            default:
                f.e(activity, "activity");
                ErrorReporter errorReporter = C1247a.f13789a;
                return;
        }
    }

    public final void onActivityResumed(Activity activity) {
        switch (this.f10421a) {
            case 0:
                MyApplication myApplication = (MyApplication) this.f10422b;
                myApplication.f10110Y = activity;
                ArrayList arrayList = myApplication.f10112a0;
                if (arrayList.isEmpty()) {
                    c.a(myApplication.getApplicationContext()).c(new Intent("com.fullykiosk.singleapp.event.foreground_app"));
                }
                arrayList.add(activity);
                int i = MyApplication.f10105b0;
                activity.getClass();
                return;
            default:
                f.e(activity, "activity");
                ErrorReporter errorReporter = C1247a.f13789a;
                return;
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f10421a) {
            case 0:
                return;
            default:
                f.e(activity, "activity");
                f.e(bundle, "outState");
                ErrorReporter errorReporter = C1247a.f13789a;
                return;
        }
    }

    public final void onActivityStarted(Activity activity) {
        switch (this.f10421a) {
            case 0:
                return;
            default:
                f.e(activity, "activity");
                ErrorReporter errorReporter = C1247a.f13789a;
                return;
        }
    }

    public final void onActivityStopped(Activity activity) {
        switch (this.f10421a) {
            case 0:
                return;
            default:
                f.e(activity, "activity");
                ErrorReporter errorReporter = C1247a.f13789a;
                return;
        }
    }
}
