package v0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: v0.y  reason: case insensitive filesystem */
public final class C1552y implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public j0 f15970a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f15971b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1542o f15972c;

    public C1552y(View view, C1542o oVar) {
        this.f15971b = view;
        this.f15972c = oVar;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        j0 g8 = j0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        C1542o oVar = this.f15972c;
        if (i < 30) {
            C1553z.a(windowInsets, this.f15971b);
            if (g8.equals(this.f15970a)) {
                return oVar.i(view, g8).f();
            }
        }
        this.f15970a = g8;
        j0 i8 = oVar.i(view, g8);
        if (i >= 30) {
            return i8.f();
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        C1551x.c(view);
        return i8.f();
    }
}
