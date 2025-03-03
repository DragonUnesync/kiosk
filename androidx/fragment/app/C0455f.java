package androidx.fragment.app;

import P6.f;
import R2.c;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.f  reason: case insensitive filesystem */
public final class C0455f extends V {

    /* renamed from: c  reason: collision with root package name */
    public final C0456g f7996c;

    public C0455f(C0456g gVar) {
        this.f7996c = gVar;
    }

    public final void a(ViewGroup viewGroup) {
        f.e(viewGroup, "container");
        C0456g gVar = this.f7996c;
        W w2 = (W) gVar.f1328V;
        View view = w2.f7946c.f8045A0;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((W) gVar.f1328V).c(this);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + w2 + " has been cancelled.");
        }
    }

    public final void b(ViewGroup viewGroup) {
        f.e(viewGroup, "container");
        C0456g gVar = this.f7996c;
        boolean i = gVar.i();
        W w2 = (W) gVar.f1328V;
        if (i) {
            w2.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = w2.f7946c.f8045A0;
        f.d(context, "context");
        c p3 = gVar.p(context);
        if (p3 != null) {
            Animation animation = (Animation) p3.f4336V;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (w2.f7944a != 1) {
                view.startAnimation(animation);
                w2.c(this);
            } else {
                viewGroup.startViewTransition(view);
                C0473y yVar = new C0473y(animation, viewGroup, view);
                yVar.setAnimationListener(new C0454e(w2, viewGroup, view, this));
                view.startAnimation(yVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Animation from operation " + w2 + " has started.");
                }
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }
}
