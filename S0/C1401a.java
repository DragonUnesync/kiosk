package s0;

import P6.f;
import V0.C0336a;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.recyclerview.widget.RecyclerView;
import o.C1280l0;

/* renamed from: s0.a  reason: case insensitive filesystem */
public final class C1401a implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C1402b f15078U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Activity f15079V;

    public C1401a(C1402b bVar, Activity activity) {
        this.f15078U = bVar;
        this.f15079V = activity;
    }

    public final void onChildViewAdded(View view, View view2) {
        if (C0336a.z(view2)) {
            SplashScreenView n4 = C0336a.n(view2);
            this.f15078U.getClass();
            f.e(n4, "child");
            WindowInsets g8 = C1280l0.e().build();
            f.d(g8, "Builder().build()");
            Rect rect = new Rect(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, Integer.MAX_VALUE);
            if (g8 == n4.getRootView().computeSystemWindowInsets(g8, rect)) {
                boolean isEmpty = rect.isEmpty();
            }
            ((ViewGroup) this.f15079V.getWindow().getDecorView()).setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
    }
}
