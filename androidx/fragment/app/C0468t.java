package androidx.fragment.app;

import F.h;
import android.view.View;

/* renamed from: androidx.fragment.app.t  reason: case insensitive filesystem */
public final class C0468t extends h {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ C0470v f8034d0;

    public C0468t(C0470v vVar) {
        this.f8034d0 = vVar;
    }

    public final View y(int i) {
        C0470v vVar = this.f8034d0;
        View view = vVar.f8045A0;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + vVar + " does not have a view");
    }

    public final boolean z() {
        if (this.f8034d0.f8045A0 != null) {
            return true;
        }
        return false;
    }
}
