package v0;

import N7.a;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import q4.k;

public class n0 extends a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowInsetsController f15958a;

    /* renamed from: b  reason: collision with root package name */
    public Window f15959b;

    public n0(WindowInsetsController windowInsetsController, k kVar) {
        this.f15958a = windowInsetsController;
    }

    public final void q(boolean z) {
        Window window = this.f15959b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f15958a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        this.f15958a.setSystemBarsAppearance(0, 16);
    }

    public final void r(boolean z) {
        Window window = this.f15959b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f15958a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        this.f15958a.setSystemBarsAppearance(0, 8);
    }
}
