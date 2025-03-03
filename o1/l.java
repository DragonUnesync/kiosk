package o1;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C1311c {

    /* renamed from: U  reason: collision with root package name */
    public final PointF f14199U = new PointF();

    /* renamed from: V  reason: collision with root package name */
    public final PointF f14200V = new PointF();

    /* renamed from: W  reason: collision with root package name */
    public final j f14201W;

    /* renamed from: X  reason: collision with root package name */
    public final float f14202X;

    /* renamed from: Y  reason: collision with root package name */
    public final GestureDetector f14203Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile float f14204Z;

    public l(Context context, j jVar) {
        this.f14201W = jVar;
        this.f14202X = 25.0f;
        this.f14203Y = new GestureDetector(context, this);
        this.f14204Z = 3.1415927f;
    }

    public final void a(float[] fArr, float f8) {
        this.f14204Z = -f8;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.f14199U.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        float x8 = (motionEvent2.getX() - this.f14199U.x) / this.f14202X;
        float y8 = motionEvent2.getY();
        PointF pointF = this.f14199U;
        float f10 = (y8 - pointF.y) / this.f14202X;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d8 = (double) this.f14204Z;
        float cos = (float) Math.cos(d8);
        float sin = (float) Math.sin(d8);
        PointF pointF2 = this.f14200V;
        pointF2.x -= (cos * x8) - (sin * f10);
        float f11 = (cos * f10) + (sin * x8) + pointF2.y;
        pointF2.y = f11;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f11));
        j jVar = this.f14201W;
        PointF pointF3 = this.f14200V;
        synchronized (jVar) {
            float f12 = pointF3.y;
            jVar.f14182a0 = f12;
            Matrix.setRotateM(jVar.f14180Y, 0, -f12, (float) Math.cos((double) jVar.f14183b0), (float) Math.sin((double) jVar.f14183b0), 0.0f);
            Matrix.setRotateM(jVar.f14181Z, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f14201W.f14186e0.performClick();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f14203Y.onTouchEvent(motionEvent);
    }
}
