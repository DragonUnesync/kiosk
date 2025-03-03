package androidx.fragment.app;

import P6.f;
import R2.c;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.b;

/* renamed from: androidx.fragment.app.i  reason: case insensitive filesystem */
public final class C0458i extends V {

    /* renamed from: c  reason: collision with root package name */
    public final C0456g f8004c;

    /* renamed from: d  reason: collision with root package name */
    public AnimatorSet f8005d;

    public C0458i(C0456g gVar) {
        this.f8004c = gVar;
    }

    public final void a(ViewGroup viewGroup) {
        String str;
        f.e(viewGroup, "container");
        AnimatorSet animatorSet = this.f8005d;
        C0456g gVar = this.f8004c;
        if (animatorSet == null) {
            ((W) gVar.f1328V).c(this);
            return;
        }
        W w2 = (W) gVar.f1328V;
        if (!w2.f7949g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0460k.f8007a.a(animatorSet);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(w2);
            sb.append(" has been canceled");
            if (w2.f7949g) {
                str = " with seeking.";
            } else {
                str = ".";
            }
            sb.append(str);
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    public final void b(ViewGroup viewGroup) {
        f.e(viewGroup, "container");
        W w2 = (W) this.f8004c.f1328V;
        AnimatorSet animatorSet = this.f8005d;
        if (animatorSet == null) {
            w2.c(this);
            return;
        }
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + w2 + " has started.");
        }
    }

    public final void c(b bVar, ViewGroup viewGroup) {
        f.e(bVar, "backEvent");
        f.e(viewGroup, "container");
        C0456g gVar = this.f8004c;
        AnimatorSet animatorSet = this.f8005d;
        W w2 = (W) gVar.f1328V;
        if (animatorSet == null) {
            w2.c(this);
        } else if (Build.VERSION.SDK_INT >= 34 && w2.f7946c.f8071g0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + w2);
            }
            long a8 = C0459j.f8006a.a(animatorSet);
            long j7 = (long) (bVar.f7275c * ((float) a8));
            if (j7 == 0) {
                j7 = 1;
            }
            if (j7 == a8) {
                j7 = a8 - 1;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j7 + " for Animator " + animatorSet + " on operation " + w2);
            }
            C0460k.f8007a.b(animatorSet, j7);
        }
    }

    public final void d(ViewGroup viewGroup) {
        AnimatorSet animatorSet;
        boolean z;
        f.e(viewGroup, "container");
        C0456g gVar = this.f8004c;
        if (!gVar.i()) {
            Context context = viewGroup.getContext();
            f.d(context, "context");
            c p3 = gVar.p(context);
            if (p3 != null) {
                animatorSet = (AnimatorSet) p3.f4337W;
            } else {
                animatorSet = null;
            }
            this.f8005d = animatorSet;
            W w2 = (W) gVar.f1328V;
            C0470v vVar = w2.f7946c;
            if (w2.f7944a == 3) {
                z = true;
            } else {
                z = false;
            }
            View view = vVar.f8045A0;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet2 = this.f8005d;
            if (animatorSet2 != null) {
                animatorSet2.addListener(new C0457h(viewGroup, view, z, w2, this));
            }
            AnimatorSet animatorSet3 = this.f8005d;
            if (animatorSet3 != null) {
                animatorSet3.setTarget(view);
            }
        }
    }
}
