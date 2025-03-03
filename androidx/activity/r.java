package androidx.activity;

import O6.a;
import O6.l;
import P6.f;
import android.window.OnBackInvokedCallback;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f7319a = new Object();

    public final OnBackInvokedCallback a(l lVar, l lVar2, a aVar, a aVar2) {
        f.e(lVar, "onBackStarted");
        f.e(lVar2, "onBackProgressed");
        f.e(aVar, "onBackInvoked");
        f.e(aVar2, "onBackCancelled");
        return new q(lVar, lVar2, aVar, aVar2);
    }
}
