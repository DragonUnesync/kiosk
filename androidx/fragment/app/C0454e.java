package androidx.fragment.app;

import A4.d;
import P6.f;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.e  reason: case insensitive filesystem */
public final class C0454e implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ W f7992a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7993b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f7994c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0455f f7995d;

    public C0454e(W w2, ViewGroup viewGroup, View view, C0455f fVar) {
        this.f7992a = w2;
        this.f7993b = viewGroup;
        this.f7994c = view;
        this.f7995d = fVar;
    }

    public final void onAnimationEnd(Animation animation) {
        f.e(animation, "animation");
        View view = this.f7994c;
        C0455f fVar = this.f7995d;
        ViewGroup viewGroup = this.f7993b;
        viewGroup.post(new d(viewGroup, view, fVar, 10));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f7992a + " has ended.");
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        f.e(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        f.e(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f7992a + " has reached onAnimationStart.");
        }
    }
}
