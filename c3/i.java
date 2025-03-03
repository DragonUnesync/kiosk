package C3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import z3.g;

public final class i extends g {

    /* renamed from: s0  reason: collision with root package name */
    public static final /* synthetic */ int f590s0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public C0031g f591r0;

    public final void e(Canvas canvas) {
        if (this.f591r0.f589q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f591r0.f589q);
        } else {
            canvas.clipRect(this.f591r0.f589q, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }

    public final Drawable mutate() {
        this.f591r0 = new C0031g(this.f591r0);
        return this;
    }

    public final void n(float f8, float f9, float f10, float f11) {
        RectF rectF = this.f591r0.f589q;
        if (f8 != rectF.left || f9 != rectF.top || f10 != rectF.right || f11 != rectF.bottom) {
            rectF.set(f8, f9, f10, f11);
            invalidateSelf();
        }
    }
}
