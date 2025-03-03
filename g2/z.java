package g2;

import a1.C0410a;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static final C0410a f12003a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0949b f12004b = new C0949b(Float.class, "translationAlpha", 5);

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f12003a = new C0410a(28);
        } else if (i >= 23) {
            f12003a = new C0410a(28);
        } else if (i >= 22) {
            f12003a = new C0410a(28);
        } else {
            f12003a = new C0410a(28);
        }
        new C0949b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i8, int i9, int i10) {
        f12003a.v(view, i, i8, i9, i10);
    }

    public static void b(View view, int i) {
        f12003a.y(view, i);
    }
}
