package I5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.bumptech.glide.d;

public abstract class c extends View {

    /* renamed from: U  reason: collision with root package name */
    public final Paint f2318U;

    /* renamed from: V  reason: collision with root package name */
    public final Paint f2319V;

    /* renamed from: W  reason: collision with root package name */
    public final Rect f2320W = new Rect();

    /* renamed from: a0  reason: collision with root package name */
    public int f2321a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f2322b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Path f2323c0;

    /* renamed from: d0  reason: collision with root package name */
    public Bitmap f2324d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Path f2325e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Paint f2326f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f2327g0;

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2319V = d.k(context);
        this.f2318U = d.l(context);
        this.f2326f0 = d.l(context);
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, TypedValue.applyDimension(1, 7.0f, context.getResources().getDisplayMetrics()), Path.Direction.CW);
        this.f2325e0 = path;
        this.f2323c0 = new Path();
    }

    public abstract int b(float f8);

    public abstract Bitmap c(int i, int i8);

    public abstract void d(float f8);

    public final void e() {
        int i;
        int i8 = this.f2321a0;
        if (i8 > 0 && (i = this.f2322b0) > 0) {
            this.f2324d0 = c(i8, i);
            this.f2326f0.setColor(b(this.f2327g0));
        }
    }

    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        Path path = this.f2323c0;
        canvas.drawPath(path, this.f2319V);
        canvas.drawBitmap(this.f2324d0, (Rect) null, this.f2320W, (Paint) null);
        canvas.drawPath(path, this.f2318U);
        canvas.save();
        int i = this.f2321a0;
        int i8 = this.f2322b0;
        if (i > i8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.translate(((float) i) * this.f2327g0, (float) (i8 / 2));
        } else {
            canvas.translate((float) (i / 2), (1.0f - this.f2327g0) * ((float) i8));
        }
        canvas.drawPath(this.f2325e0, this.f2326f0);
        canvas.restore();
    }

    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        this.f2321a0 = i;
        this.f2322b0 = i8;
        this.f2320W.set(0, 0, i, i8);
        float strokeWidth = this.f2318U.getStrokeWidth() / 2.0f;
        Path path = this.f2323c0;
        path.reset();
        path.addRect(new RectF(strokeWidth, strokeWidth, ((float) i) - strokeWidth, ((float) i8) - strokeWidth), Path.Direction.CW);
        e();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f8;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 2) {
            return super.onTouchEvent(motionEvent);
        }
        float x8 = motionEvent.getX();
        float y8 = motionEvent.getY();
        int i = this.f2321a0;
        int i8 = this.f2322b0;
        if (i > i8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f8 = x8 / ((float) i);
        } else {
            f8 = 1.0f - (y8 / ((float) i8));
        }
        float max = Math.max(0.0f, Math.min(1.0f, f8));
        this.f2327g0 = max;
        this.f2326f0.setColor(b(max));
        d(this.f2327g0);
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void setPos(float f8) {
        this.f2327g0 = f8;
        this.f2326f0.setColor(b(f8));
    }
}
