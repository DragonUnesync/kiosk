package g2;

import Y.e;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import v0.C1515M;
import v0.C1519Q;
import v0.C1523V;

/* renamed from: g2.j  reason: case insensitive filesystem */
public final class C0957j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11949a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11950b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f11951c;

    public /* synthetic */ C0957j(Object obj, View view, int i) {
        this.f11949a = i;
        this.f11950b = obj;
        this.f11951c = view;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.f11949a) {
            case 1:
                ((C1515M) this.f11950b).b();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f11949a) {
            case 0:
                ((e) this.f11950b).remove(animator);
                ((p) this.f11951c).f11980h0.remove(animator);
                return;
            case 1:
                ((C1515M) this.f11950b).a();
                return;
            default:
                ((C1523V) this.f11950b).f15904a.d(1.0f);
                C1519Q.e((View) this.f11951c);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f11949a) {
            case 0:
                ((p) this.f11951c).f11980h0.add(animator);
                return;
            case 1:
                ((C1515M) this.f11950b).c();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public C0957j(p pVar, e eVar) {
        this.f11949a = 0;
        this.f11951c = pVar;
        this.f11950b = eVar;
    }
}
