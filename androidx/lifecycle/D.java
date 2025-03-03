package androidx.lifecycle;

import P6.f;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public final class D extends C0479f {
    final /* synthetic */ E this$0;

    public static final class a extends C0479f {
        final /* synthetic */ E this$0;

        public a(E e) {
            this.this$0 = e;
        }

        public void onActivityPostResumed(Activity activity) {
            f.e(activity, "activity");
            this.this$0.b();
        }

        public void onActivityPostStarted(Activity activity) {
            f.e(activity, "activity");
            E e = this.this$0;
            int i = e.f8108U + 1;
            e.f8108U = i;
            if (i == 1 && e.f8111X) {
                e.f8113Z.d(C0485l.ON_START);
                e.f8111X = false;
            }
        }
    }

    public D(E e) {
        this.this$0 = e;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        f.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = H.f8116V;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            f.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((H) findFragmentByTag).f8117U = this.this$0.f8115b0;
        }
    }

    public void onActivityPaused(Activity activity) {
        f.e(activity, "activity");
        E e = this.this$0;
        int i = e.f8109V - 1;
        e.f8109V = i;
        if (i == 0) {
            Handler handler = e.f8112Y;
            f.b(handler);
            handler.postDelayed(e.f8114a0, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        f.e(activity, "activity");
        C.a(activity, new a(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        f.e(activity, "activity");
        E e = this.this$0;
        int i = e.f8108U - 1;
        e.f8108U = i;
        if (i == 0 && e.f8110W) {
            e.f8113Z.d(C0485l.ON_STOP);
            e.f8111X = true;
        }
    }
}
