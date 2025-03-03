package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0489p;
import androidx.lifecycle.r;
import h.C1022j;

class ComponentActivity$2 implements C0489p {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C1022j f7259U;

    public ComponentActivity$2(C1022j jVar) {
        this.f7259U = jVar;
    }

    public final void c(r rVar, C0485l lVar) {
        View view;
        if (lVar == C0485l.ON_STOP) {
            Window window = this.f7259U.getWindow();
            if (window != null) {
                view = window.peekDecorView();
            } else {
                view = null;
            }
            if (view != null) {
                view.cancelPendingInputEvents();
            }
        }
    }
}
