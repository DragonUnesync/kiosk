package de.ozerov.fully;

import android.util.Log;
import android.webkit.ValueCallback;
import n2.a;

public final /* synthetic */ class C3 implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9810a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9811b;

    public /* synthetic */ C3(int i, Object obj) {
        this.f9810a = i;
        this.f9811b = obj;
    }

    public final void onReceiveValue(Object obj) {
        Object obj2 = this.f9811b;
        Boolean bool = (Boolean) obj;
        switch (this.f9810a) {
            case 0:
                E3 e32 = (E3) obj2;
                e32.f9883c = true;
                if (bool.booleanValue()) {
                    Log.i("E3", "Safe Browsing was successfully initialized");
                    return;
                }
                a.b1(e32.f9881a, "Unable to initialize Safe Browsing!");
                Log.e("E3", "Unable to initialize Safe Browsing!");
                return;
            default:
                Runnable runnable = (Runnable) obj2;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
