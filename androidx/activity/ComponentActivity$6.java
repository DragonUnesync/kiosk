package androidx.activity;

import P6.f;
import android.os.Build;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0489p;
import androidx.lifecycle.r;

class ComponentActivity$6 implements C0489p {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ k f7262U;

    public ComponentActivity$6(k kVar) {
        this.f7262U = kVar;
    }

    public final void c(r rVar, C0485l lVar) {
        if (lVar == C0485l.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
            u uVar = this.f7262U.f7293a0;
            OnBackInvokedDispatcher a8 = h.a((k) rVar);
            uVar.getClass();
            f.e(a8, "invoker");
            uVar.e = a8;
            uVar.c(uVar.f7354g);
        }
    }
}
