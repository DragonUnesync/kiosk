package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0489p;
import androidx.lifecycle.r;

class Fragment$6 implements C0489p {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0470v f7845U;

    public Fragment$6(C0470v vVar) {
        this.f7845U = vVar;
    }

    public final void c(r rVar, C0485l lVar) {
        View view;
        if (lVar == C0485l.ON_STOP && (view = this.f7845U.f8045A0) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
