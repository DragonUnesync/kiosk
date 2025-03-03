package v0;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: v0.w  reason: case insensitive filesystem */
public final class C1550w implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: U  reason: collision with root package name */
    public final WeakHashMap f15969U = new WeakHashMap();

    public final void onGlobalLayout() {
        boolean z;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f15969U.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (!view.isShown() || view.getWindowVisibility() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (booleanValue != z) {
                    if (z) {
                        i = 16;
                    } else {
                        i = 32;
                    }
                    C1510H.i(view, i);
                    entry.setValue(Boolean.valueOf(z));
                }
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
