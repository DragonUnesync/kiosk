package androidx.activity;

import O6.a;
import O6.l;
import P6.f;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

public final class q implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f7315a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f7316b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f7317c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f7318d;

    public q(l lVar, l lVar2, a aVar, a aVar2) {
        this.f7315a = lVar;
        this.f7316b = lVar2;
        this.f7317c = aVar;
        this.f7318d = aVar2;
    }

    public final void onBackCancelled() {
        this.f7318d.invoke();
    }

    public final void onBackInvoked() {
        this.f7317c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        f.e(backEvent, "backEvent");
        this.f7316b.a(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        f.e(backEvent, "backEvent");
        this.f7315a.a(new b(backEvent));
    }
}
