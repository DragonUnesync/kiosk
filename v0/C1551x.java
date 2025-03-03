package v0;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: v0.x  reason: case insensitive filesystem */
public abstract class C1551x {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
