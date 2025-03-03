package e2;

import android.animation.Animator;

/* renamed from: e2.c  reason: case insensitive filesystem */
public final class C0830c implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0831d f11167a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0832e f11168b;

    public C0830c(C0832e eVar, C0831d dVar) {
        this.f11168b = eVar;
        this.f11167a = dVar;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
        C0832e eVar = this.f11168b;
        C0831d dVar = this.f11167a;
        eVar.a(1.0f, dVar, true);
        dVar.f11177k = dVar.e;
        dVar.f11178l = dVar.f11173f;
        dVar.f11179m = dVar.f11174g;
        dVar.a((dVar.f11176j + 1) % dVar.i.length);
        if (eVar.f11196Z) {
            eVar.f11196Z = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            if (dVar.f11180n) {
                dVar.f11180n = false;
                return;
            }
            return;
        }
        eVar.f11195Y += 1.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.f11168b.f11195Y = 0.0f;
    }
}
