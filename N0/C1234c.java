package n0;

import E.e;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: n0.c  reason: case insensitive filesystem */
public final class C1234c extends Drawable implements Drawable.Callback, C1233b, C1232a {

    /* renamed from: a0  reason: collision with root package name */
    public static final PorterDuff.Mode f13553a0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: b0  reason: collision with root package name */
    public static Method f13554b0;

    /* renamed from: U  reason: collision with root package name */
    public int f13555U;

    /* renamed from: V  reason: collision with root package name */
    public PorterDuff.Mode f13556V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f13557W;

    /* renamed from: X  reason: collision with root package name */
    public C1235d f13558X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f13559Y;

    /* renamed from: Z  reason: collision with root package name */
    public Drawable f13560Z;

    public static void a() {
        if (f13554b0 == null) {
            try {
                f13554b0 = Drawable.class.getDeclaredMethod("isProjected", (Class[]) null);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f13560Z;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, n0.d] */
    public final C1235d c() {
        C1235d dVar = this.f13558X;
        ? constantState = new Drawable.ConstantState();
        constantState.f13563c = null;
        constantState.f13564d = f13553a0;
        if (dVar != null) {
            constantState.f13561a = dVar.f13561a;
            constantState.f13562b = dVar.f13562b;
            constantState.f13563c = dVar.f13563c;
            constantState.f13564d = dVar.f13564d;
        }
        return constantState;
    }

    public final boolean d(int[] iArr) {
        boolean state = this.f13560Z.setState(iArr);
        if (i(iArr) || state) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        this.f13560Z.draw(canvas);
    }

    public final void e(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public final void f(ColorStateList colorStateList) {
        this.f13558X.f13563c = colorStateList;
        i(this.f13560Z.getState());
    }

    public final void g(PorterDuff.Mode mode) {
        this.f13558X.f13564d = mode;
        i(this.f13560Z.getState());
    }

    public final int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        C1235d dVar = this.f13558X;
        if (dVar != null) {
            i = dVar.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.f13560Z.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        C1235d dVar = this.f13558X;
        if (dVar == null || dVar.f13562b == null) {
            return null;
        }
        dVar.f13561a = getChangingConfigurations();
        return this.f13558X;
    }

    public final Drawable getCurrent() {
        return this.f13560Z.getCurrent();
    }

    public final Rect getDirtyBounds() {
        return this.f13560Z.getDirtyBounds();
    }

    public final int getIntrinsicHeight() {
        return this.f13560Z.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f13560Z.getIntrinsicWidth();
    }

    public final int getLayoutDirection() {
        return e.q(this.f13560Z);
    }

    public final int getMinimumHeight() {
        return this.f13560Z.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f13560Z.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f13560Z.getOpacity();
    }

    public final void getOutline(Outline outline) {
        this.f13560Z.getOutline(outline);
    }

    public final boolean getPadding(Rect rect) {
        return this.f13560Z.getPadding(rect);
    }

    public final int[] getState() {
        return this.f13560Z.getState();
    }

    public final Region getTransparentRegion() {
        return this.f13560Z.getTransparentRegion();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.f13560Z;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f13560Z = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C1235d dVar = this.f13558X;
            if (dVar != null) {
                dVar.f13562b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean i(int[] iArr) {
        if (!b()) {
            return false;
        }
        C1235d dVar = this.f13558X;
        ColorStateList colorStateList = dVar.f13563c;
        PorterDuff.Mode mode = dVar.f13564d;
        if (colorStateList == null || mode == null) {
            this.f13557W = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f13557W && colorForState == this.f13555U && mode == this.f13556V)) {
                setColorFilter(colorForState, mode);
                this.f13555U = colorForState;
                this.f13556V = mode;
                this.f13557W = true;
                return true;
            }
        }
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.f13560Z.isAutoMirrored();
    }

    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f13560Z;
        if (drawable == null || (method = f13554b0) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, (Object[]) null)).booleanValue();
        } catch (Exception e) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            return false;
        }
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        C1235d dVar;
        if (!b() || (dVar = this.f13558X) == null) {
            colorStateList = null;
        } else {
            colorStateList = dVar.f13563c;
        }
        if ((colorStateList == null || !colorStateList.isStateful()) && !this.f13560Z.isStateful()) {
            return false;
        }
        return true;
    }

    public final void jumpToCurrentState() {
        this.f13560Z.jumpToCurrentState();
    }

    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f13559Y && super.mutate() == this) {
            this.f13558X = c();
            Drawable drawable = this.f13560Z;
            if (drawable != null) {
                drawable.mutate();
            }
            C1235d dVar = this.f13558X;
            if (dVar != null) {
                Drawable drawable2 = this.f13560Z;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                dVar.f13562b = constantState;
            }
            this.f13559Y = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13560Z;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int i) {
        return e.v(this.f13560Z, i);
    }

    public final boolean onLevelChange(int i) {
        return this.f13560Z.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    public final void setAlpha(int i) {
        this.f13560Z.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        this.f13560Z.setAutoMirrored(z);
    }

    public final void setChangingConfigurations(int i) {
        this.f13560Z.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13560Z.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.f13560Z.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.f13560Z.setFilterBitmap(z);
    }

    public final void setHotspot(float f8, float f9) {
        this.f13560Z.setHotspot(f8, f9);
    }

    public final void setHotspotBounds(int i, int i8, int i9, int i10) {
        this.f13560Z.setHotspotBounds(i, i8, i9, i10);
    }

    public final boolean setState(int[] iArr) {
        if (!d(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setTint(int i) {
        if (b()) {
            e(i);
        } else {
            this.f13560Z.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            f(colorStateList);
        } else {
            this.f13560Z.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            g(mode);
        } else {
            this.f13560Z.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z6) {
        if (super.setVisible(z, z6) || this.f13560Z.setVisible(z, z6)) {
            return true;
        }
        return false;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
