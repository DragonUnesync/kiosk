package androidx.lifecycle;

import P6.f;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.H;

public abstract class F {
    public static void a(Activity activity, C0485l lVar) {
        f.e(activity, "activity");
        f.e(lVar, "event");
        if (activity instanceof r) {
            t e = ((r) activity).e();
            if (e instanceof t) {
                e.d(lVar);
            }
        }
    }

    public static void b(Activity activity) {
        f.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            H.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new H.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
