package androidx.lifecycle;

import P6.f;
import Z1.c;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

public class H extends Fragment {

    /* renamed from: V  reason: collision with root package name */
    public static final /* synthetic */ int f8116V = 0;

    /* renamed from: U  reason: collision with root package name */
    public c f8117U;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final G Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            f.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            f.e(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            f.e(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            f.e(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            f.e(activity, "activity");
            int i = H.f8116V;
            F.a(activity, C0485l.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            f.e(activity, "activity");
            int i = H.f8116V;
            F.a(activity, C0485l.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            f.e(activity, "activity");
            int i = H.f8116V;
            F.a(activity, C0485l.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            f.e(activity, "activity");
            int i = H.f8116V;
            F.a(activity, C0485l.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            f.e(activity, "activity");
            int i = H.f8116V;
            F.a(activity, C0485l.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            f.e(activity, "activity");
            int i = H.f8116V;
            F.a(activity, C0485l.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            f.e(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            f.e(activity, "activity");
            f.e(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            f.e(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            f.e(activity, "activity");
        }
    }

    public final void a(C0485l lVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            f.d(activity, "activity");
            F.a(activity, lVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(C0485l.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(C0485l.ON_DESTROY);
        this.f8117U = null;
    }

    public final void onPause() {
        super.onPause();
        a(C0485l.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        c cVar = this.f8117U;
        if (cVar != null) {
            ((E) cVar.f6955V).b();
        }
        a(C0485l.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        c cVar = this.f8117U;
        if (cVar != null) {
            E e = (E) cVar.f6955V;
            int i = e.f8108U + 1;
            e.f8108U = i;
            if (i == 1 && e.f8111X) {
                e.f8113Z.d(C0485l.ON_START);
                e.f8111X = false;
            }
        }
        a(C0485l.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(C0485l.ON_STOP);
    }
}
