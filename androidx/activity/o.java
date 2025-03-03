package androidx.activity;

import O6.a;
import P6.f;
import android.window.OnBackInvokedCallback;
import h.C1000A;

public final /* synthetic */ class o implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7312a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7313b;

    public /* synthetic */ o(int i, Object obj) {
        this.f7312a = i;
        this.f7313b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f7312a) {
            case 0:
                a aVar = (a) this.f7313b;
                f.e(aVar, "$onBackInvoked");
                aVar.invoke();
                return;
            case 1:
                ((C1000A) this.f7313b).F();
                return;
            default:
                ((Runnable) this.f7313b).run();
                return;
        }
    }
}
