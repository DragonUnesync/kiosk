package v0;

import N7.a;
import android.view.View;
import android.view.Window;
import q4.k;

public class k0 extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Window f15953a;

    public k0(Window window, k kVar) {
        this.f15953a = window;
    }

    public final void C(int i) {
        View decorView = this.f15953a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
