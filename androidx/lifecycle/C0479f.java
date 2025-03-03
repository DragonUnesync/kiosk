package androidx.lifecycle;

import P6.f;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: androidx.lifecycle.f  reason: case insensitive filesystem */
public abstract class C0479f implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        f.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        f.e(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        f.e(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        f.e(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f.e(activity, "activity");
        f.e(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        f.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        f.e(activity, "activity");
    }
}
