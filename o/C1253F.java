package o;

import E.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import d4.k;
import g.C0940a;
import v0.C1510H;

/* renamed from: o.F  reason: case insensitive filesystem */
public final class C1253F extends C1248A {
    public final C1252E e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f13807f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f13808g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f13809h = null;
    public boolean i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13810j = false;

    public C1253F(C1252E e8) {
        super((AbsSeekBar) e8);
        this.e = e8;
    }

    public final void b(AttributeSet attributeSet, int i8) {
        super.b(attributeSet, 2130969537);
        C1252E e8 = this.e;
        Context context = e8.getContext();
        int[] iArr = C0940a.f11819g;
        k K22 = k.K2(context, attributeSet, iArr, 2130969537);
        C1510H.o(e8, e8.getContext(), iArr, attributeSet, (TypedArray) K22.f9767W, 2130969537);
        Drawable J8 = K22.J(0);
        if (J8 != null) {
            e8.setThumb(J8);
        }
        Drawable I8 = K22.I(1);
        Drawable drawable = this.f13807f;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f13807f = I8;
        if (I8 != null) {
            I8.setCallback(e8);
            e.v(I8, e8.getLayoutDirection());
            if (I8.isStateful()) {
                I8.setState(e8.getDrawableState());
            }
            f();
        }
        e8.invalidate();
        TypedArray typedArray = (TypedArray) K22.f9767W;
        if (typedArray.hasValue(3)) {
            this.f13809h = C1286o0.c(typedArray.getInt(3, -1), this.f13809h);
            this.f13810j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f13808g = K22.v(2);
            this.i = true;
        }
        K22.M2();
        f();
    }

    public final void f() {
        Drawable drawable = this.f13807f;
        if (drawable == null) {
            return;
        }
        if (this.i || this.f13810j) {
            Drawable z = e.z(drawable.mutate());
            this.f13807f = z;
            if (this.i) {
                z.setTintList(this.f13808g);
            }
            if (this.f13810j) {
                this.f13807f.setTintMode(this.f13809h);
            }
            if (this.f13807f.isStateful()) {
                this.f13807f.setState(this.e.getDrawableState());
            }
        }
    }

    public final void g(Canvas canvas) {
        int i8;
        if (this.f13807f != null) {
            C1252E e8 = this.e;
            int max = e8.getMax();
            int i9 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f13807f.getIntrinsicWidth();
                int intrinsicHeight = this.f13807f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i8 = intrinsicWidth / 2;
                } else {
                    i8 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i9 = intrinsicHeight / 2;
                }
                this.f13807f.setBounds(-i8, -i9, i8, i9);
                float width = ((float) ((e8.getWidth() - e8.getPaddingLeft()) - e8.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) e8.getPaddingLeft(), (float) (e8.getHeight() / 2));
                for (int i10 = 0; i10 <= max; i10++) {
                    this.f13807f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
