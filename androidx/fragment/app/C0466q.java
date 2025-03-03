package androidx.fragment.app;

import F.h;
import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.q  reason: case insensitive filesystem */
public final class C0466q extends h {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ C0468t f8016d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ r f8017e0;

    public C0466q(r rVar, C0468t tVar) {
        this.f8017e0 = rVar;
        this.f8016d0 = tVar;
    }

    public final View y(int i) {
        C0468t tVar = this.f8016d0;
        if (tVar.z()) {
            return tVar.y(i);
        }
        Dialog dialog = this.f8017e0.f8029a1;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public final boolean z() {
        if (this.f8016d0.z() || this.f8017e0.f8032d1) {
            return true;
        }
        return false;
    }
}
