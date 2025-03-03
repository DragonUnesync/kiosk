package v0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.woxthebox.draglistview.R;
import m0.C1197c;

/* renamed from: v0.z  reason: case insensitive filesystem */
public abstract class C1553z {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static j0 b(View view, j0 j0Var, Rect rect) {
        WindowInsets f8 = j0Var.f();
        if (f8 != null) {
            return j0.g(view, view.computeSystemWindowInsets(f8, rect));
        }
        rect.setEmpty();
        return j0Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static j0 f(View view) {
        a0 a0Var;
        if (!C1524W.f15908d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = C1524W.f15905a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) C1524W.f15906b.get(obj);
            Rect rect2 = (Rect) C1524W.f15907c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                a0Var = new C1527Z();
            } else if (i >= 29) {
                a0Var = new C1526Y();
            } else {
                a0Var = new C1525X();
            }
            a0Var.e(C1197c.b(rect.left, rect.top, rect.right, rect.bottom));
            a0Var.g(C1197c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            j0 b8 = a0Var.b();
            b8.f15952a.p(b8);
            b8.f15952a.d(view.getRootView());
            return b8;
        } catch (IllegalAccessException e) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
            return null;
        }
    }

    public static String g(View view) {
        return view.getTransitionName();
    }

    public static float h(View view) {
        return view.getZ();
    }

    public static boolean i(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void j(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void k(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void l(View view, float f8) {
        view.setElevation(f8);
    }

    public static void m(View view, C1542o oVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, oVar);
        }
        if (oVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new C1552y(view, oVar));
        }
    }

    public static void n(View view) {
        view.stopNestedScroll();
    }
}
