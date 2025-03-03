package s0;

import P6.f;
import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import de.ozerov.fully.G3;

/* renamed from: s0.b  reason: case insensitive filesystem */
public final class C1402b extends G3 {

    /* renamed from: b  reason: collision with root package name */
    public final C1401a f15080b;

    public C1402b(Activity activity) {
        super(activity);
        this.f15080b = new C1401a(this, activity);
    }

    public final void c() {
        Activity activity = this.f9979a;
        Resources.Theme theme = activity.getTheme();
        f.d(theme, "activity.theme");
        d(theme, new TypedValue());
        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f15080b);
    }
}
