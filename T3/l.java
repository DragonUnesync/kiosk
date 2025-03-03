package t3;

import android.view.View;
import java.util.WeakHashMap;
import v0.C1510H;
import v0.C1551x;

public final class l implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = C1510H.f15874a;
        C1551x.c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
