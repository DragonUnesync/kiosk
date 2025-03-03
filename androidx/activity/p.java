package androidx.activity;

import O6.a;
import P6.f;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f7314a = new Object();

    public final OnBackInvokedCallback a(a aVar) {
        f.e(aVar, "onBackInvoked");
        return new o(0, aVar);
    }

    public final void b(Object obj, int i, Object obj2) {
        f.e(obj, "dispatcher");
        f.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        f.e(obj, "dispatcher");
        f.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
