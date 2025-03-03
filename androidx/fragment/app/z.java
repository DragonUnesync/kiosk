package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

public final class z implements View.OnAttachStateChangeListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ Q f8102U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ A f8103V;

    public z(A a8, Q q7) {
        this.f8103V = a8;
        this.f8102U = q7;
    }

    public final void onViewAttachedToWindow(View view) {
        Q q7 = this.f8102U;
        q7.k();
        C0462m.j((ViewGroup) q7.f7926c.f8045A0.getParent(), this.f8103V.f7833U).i();
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
