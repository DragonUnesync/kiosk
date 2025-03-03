package g2;

import a1.C0410a;
import android.view.View;

/* renamed from: g2.D  reason: case insensitive filesystem */
public class C0946D extends C0410a {

    /* renamed from: c0  reason: collision with root package name */
    public static boolean f11909c0 = true;

    public void v(View view, int i, int i8, int i9, int i10) {
        if (f11909c0) {
            try {
                C0945C.a(view, i, i8, i9, i10);
            } catch (NoSuchMethodError unused) {
                f11909c0 = false;
            }
        }
    }
}
