package v0;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: v0.A  reason: case insensitive filesystem */
public abstract class C1503A {
    public static j0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        j0 g8 = j0.g((View) null, rootWindowInsets);
        g0 g0Var = g8.f15952a;
        g0Var.p(g8);
        g0Var.d(view.getRootView());
        return g8;
    }

    public static void b(View view, int i, int i8) {
        view.setScrollIndicators(i, i8);
    }
}
