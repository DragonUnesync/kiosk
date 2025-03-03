package v0;

import H.j;
import I0.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.woxthebox.draglistview.R;
import java.util.List;
import v.i;

/* renamed from: v0.Q  reason: case insensitive filesystem */
public final class C1519Q extends C1522U {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final a f15894f = new a(0);

    /* renamed from: g  reason: collision with root package name */
    public static final DecelerateInterpolator f15895g = new DecelerateInterpolator();

    public static void e(View view) {
        j j7 = j(view);
        if (j7 != null) {
            ((View) j7.f1797d).setTranslationY(0.0f);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z) {
        j j7 = j(view);
        if (j7 != null) {
            j7.f1796c = windowInsets;
            if (!z) {
                int[] iArr = (int[]) j7.e;
                ((View) j7.f1797d).getLocationOnScreen(iArr);
                z = true;
                j7.f1794a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    public static void g(View view, j0 j0Var, List list) {
        j j7 = j(view);
        if (j7 != null) {
            j7.e(j0Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), j0Var, list);
            }
        }
    }

    public static void h(View view, i iVar) {
        j j7 = j(view);
        if (j7 != null) {
            View view2 = (View) j7.f1797d;
            int[] iArr = (int[]) j7.e;
            view2.getLocationOnScreen(iArr);
            int i = j7.f1794a - iArr[1];
            j7.f1795b = i;
            view2.setTranslationY((float) i);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                h(viewGroup.getChildAt(i8), iVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static j j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof C1518P) {
            return ((C1518P) tag).f15892a;
        }
        return null;
    }
}
