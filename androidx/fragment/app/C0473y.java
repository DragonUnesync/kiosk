package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import v0.C1544q;

/* renamed from: androidx.fragment.app.y  reason: case insensitive filesystem */
public final class C0473y extends AnimationSet implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final ViewGroup f8097U;

    /* renamed from: V  reason: collision with root package name */
    public final View f8098V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f8099W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f8100X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f8101Y = true;

    public C0473y(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f8097U = viewGroup;
        this.f8098V = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j7, Transformation transformation) {
        this.f8101Y = true;
        if (this.f8099W) {
            return !this.f8100X;
        }
        if (!super.getTransformation(j7, transformation)) {
            this.f8099W = true;
            C1544q.a(this.f8097U, this);
        }
        return true;
    }

    public final void run() {
        boolean z = this.f8099W;
        ViewGroup viewGroup = this.f8097U;
        if (z || !this.f8101Y) {
            viewGroup.endViewTransition(this.f8098V);
            this.f8100X = true;
            return;
        }
        this.f8101Y = false;
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j7, Transformation transformation, float f8) {
        this.f8101Y = true;
        if (this.f8099W) {
            return !this.f8100X;
        }
        if (!super.getTransformation(j7, transformation, f8)) {
            this.f8099W = true;
            C1544q.a(this.f8097U, this);
        }
        return true;
    }
}
