package g2;

import android.os.Build;
import android.view.View;

public class F extends C0946D {

    /* renamed from: d0  reason: collision with root package name */
    public static boolean f11910d0 = true;

    public void y(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.y(view, i);
        } else if (f11910d0) {
            try {
                C0947E.a(view, i);
            } catch (NoSuchMethodError unused) {
                f11910d0 = false;
            }
        }
    }
}
