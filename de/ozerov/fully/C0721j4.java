package de.ozerov.fully;

import Q0.g;
import android.graphics.PointF;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: de.ozerov.fully.j4  reason: case insensitive filesystem */
public final class C0721j4 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final long f10751U;

    /* renamed from: V  reason: collision with root package name */
    public final float f10752V;

    /* renamed from: W  reason: collision with root package name */
    public final float f10753W;

    /* renamed from: X  reason: collision with root package name */
    public final float f10754X;

    /* renamed from: Y  reason: collision with root package name */
    public final float f10755Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f10756Z;

    /* renamed from: a0  reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f10757a0 = new AccelerateDecelerateInterpolator();

    /* renamed from: b0  reason: collision with root package name */
    public final PointF f10758b0;

    /* renamed from: c0  reason: collision with root package name */
    public final PointF f10759c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ TouchImageView f10760d0;

    public C0721j4(TouchImageView touchImageView, float f8, float f9, float f10, boolean z) {
        this.f10760d0 = touchImageView;
        touchImageView.setState(C0751o4.f10874Y);
        this.f10751U = System.currentTimeMillis();
        this.f10752V = touchImageView.f10373U;
        this.f10753W = f8;
        this.f10756Z = z;
        PointF l8 = touchImageView.l(f9, f10, false);
        float f11 = l8.x;
        this.f10754X = f11;
        float f12 = l8.y;
        this.f10755Y = f12;
        this.f10758b0 = TouchImageView.d(touchImageView, f11, f12);
        this.f10759c0 = new PointF((float) (touchImageView.f10388m0 / 2), (float) (touchImageView.f10389n0 / 2));
    }

    public final void run() {
        float interpolation = this.f10757a0.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f10751U)) / 500.0f));
        float f8 = this.f10753W;
        float f9 = this.f10752V;
        TouchImageView touchImageView = this.f10760d0;
        touchImageView.j(((double) g.j(f8, f9, interpolation, f9)) / ((double) touchImageView.f10373U), this.f10754X, this.f10755Y, this.f10756Z);
        PointF pointF = this.f10758b0;
        float f10 = pointF.x;
        PointF pointF2 = this.f10759c0;
        float j7 = g.j(pointF2.x, f10, interpolation, f10);
        float f11 = pointF.y;
        float j8 = g.j(pointF2.y, f11, interpolation, f11);
        PointF d8 = TouchImageView.d(touchImageView, this.f10754X, this.f10755Y);
        touchImageView.f10374V.postTranslate(j7 - d8.x, j8 - d8.y);
        touchImageView.f();
        touchImageView.setImageMatrix(touchImageView.f10374V);
        if (interpolation < 1.0f) {
            touchImageView.postOnAnimation(this);
        } else {
            touchImageView.setState(C0751o4.f10870U);
        }
    }
}
