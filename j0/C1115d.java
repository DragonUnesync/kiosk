package j0;

import G.h;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: j0.d  reason: case insensitive filesystem */
public final class C1115d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Object f12823a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f12824b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12825c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12826d = false;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12827f = false;

    public C1115d(Activity activity) {
        this.f12824b = activity;
        this.f12825c = activity.hashCode();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.f12824b == activity) {
            this.f12824b = null;
            this.e = true;
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f12827f && !this.f12826d) {
            Object obj = this.f12823a;
            try {
                Object obj2 = e.f12830c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f12825c) {
                    e.f12833g.postAtFrontOfQueue(new h(e.f12829b.get(activity), 6, obj2));
                    this.f12827f = true;
                    this.f12823a = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        if (this.f12824b == activity) {
            this.f12826d = true;
        }
    }

    public final void onActivityStopped(Activity activity) {
    }
}
