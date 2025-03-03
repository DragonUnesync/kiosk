package androidx.fragment.app;

import P6.f;
import Q0.g;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.h  reason: case insensitive filesystem */
public final class C0457h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8000a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f8001b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f8002c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ W f8003d;
    public final /* synthetic */ C0458i e;

    public C0457h(ViewGroup viewGroup, View view, boolean z, W w2, C0458i iVar) {
        this.f8000a = viewGroup;
        this.f8001b = view;
        this.f8002c = z;
        this.f8003d = w2;
        this.e = iVar;
    }

    public final void onAnimationEnd(Animator animator) {
        f.e(animator, "anim");
        ViewGroup viewGroup = this.f8000a;
        View view = this.f8001b;
        viewGroup.endViewTransition(view);
        boolean z = this.f8002c;
        W w2 = this.f8003d;
        if (z) {
            int i = w2.f7944a;
            f.d(view, "viewToAnimate");
            g.b(i, view, viewGroup);
        }
        C0458i iVar = this.e;
        ((W) iVar.f8004c.f1328V).c(iVar);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + w2 + " has ended.");
        }
    }
}
