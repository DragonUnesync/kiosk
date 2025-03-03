package androidx.lifecycle;

import P6.f;
import android.app.Activity;
import android.app.Application;

public abstract class C {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        f.e(activity, "activity");
        f.e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
