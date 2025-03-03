package x3;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import n0.C1232a;
import z3.k;
import z3.u;

public final class b extends Drawable implements u, C1232a {

    /* renamed from: U  reason: collision with root package name */
    public a f16268U;

    public b(a aVar) {
        this.f16268U = aVar;
    }

    public final void draw(Canvas canvas) {
        a aVar = this.f16268U;
        if (aVar.f16267b) {
            aVar.f16266a.draw(canvas);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f16268U;
    }

    public final int getOpacity() {
        this.f16268U.f16266a.getClass();
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final Drawable mutate() {
        this.f16268U = new a(this.f16268U);
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16268U.f16266a.setBounds(rect);
    }

    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f16268U.f16266a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b8 = d.b(iArr);
        a aVar = this.f16268U;
        if (aVar.f16267b == b8) {
            return onStateChange;
        }
        aVar.f16267b = b8;
        return true;
    }

    public final void setAlpha(int i) {
        this.f16268U.f16266a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f16268U.f16266a.setColorFilter(colorFilter);
    }

    public final void setShapeAppearanceModel(k kVar) {
        this.f16268U.f16266a.setShapeAppearanceModel(kVar);
    }

    public final void setTint(int i) {
        this.f16268U.f16266a.setTint(i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f16268U.f16266a.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f16268U.f16266a.setTintMode(mode);
    }
}
