package de.ozerov.fully;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import e2.C0832e;

/* renamed from: de.ozerov.fully.h3  reason: case insensitive filesystem */
public final class C0708h3 extends Animation {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10689U = 0;

    /* renamed from: V  reason: collision with root package name */
    public final int f10690V;

    /* renamed from: W  reason: collision with root package name */
    public final int f10691W;

    /* renamed from: X  reason: collision with root package name */
    public final View f10692X;

    public C0708h3(View view, int i, int i8) {
        this.f10692X = view;
        this.f10690V = i8;
        this.f10691W = i;
    }

    public final void applyTransformation(float f8, Transformation transformation) {
        switch (this.f10689U) {
            case 0:
                int i = this.f10691W;
                int i8 = (int) ((((float) (this.f10690V - i)) * f8) + ((float) i));
                View view = this.f10692X;
                view.getLayoutParams().height = i8;
                view.requestLayout();
                return;
            default:
                C0832e eVar = ((SwipeRefreshLayout) this.f10692X).f8595w0;
                int i9 = this.f10690V;
                eVar.setAlpha((int) ((((float) (this.f10691W - i9)) * f8) + ((float) i9)));
                return;
        }
    }

    public boolean willChangeBounds() {
        switch (this.f10689U) {
            case 0:
                return true;
            default:
                return super.willChangeBounds();
        }
    }

    public C0708h3(SwipeRefreshLayout swipeRefreshLayout, int i, int i8) {
        this.f10692X = swipeRefreshLayout;
        this.f10690V = i;
        this.f10691W = i8;
    }
}
