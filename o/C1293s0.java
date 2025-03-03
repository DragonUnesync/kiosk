package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: o.s0  reason: case insensitive filesystem */
public final class C1293s0 extends Drawable implements Drawable.Callback {

    /* renamed from: U  reason: collision with root package name */
    public Drawable f14068U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f14069V;

    public final void a(Canvas canvas) {
        this.f14068U.draw(canvas);
    }

    public final void b(float f8, float f9) {
        this.f14068U.setHotspot(f8, f9);
    }

    public final void c(int i, int i8, int i9, int i10) {
        this.f14068U.setHotspotBounds(i, i8, i9, i10);
    }

    public final boolean d(boolean z, boolean z6) {
        if (super.setVisible(z, z6) || this.f14068U.setVisible(z, z6)) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        if (this.f14069V) {
            a(canvas);
        }
    }

    public final int getChangingConfigurations() {
        return this.f14068U.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f14068U.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f14068U.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f14068U.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f14068U.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f14068U.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f14068U.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f14068U.getPadding(rect);
    }

    public final int[] getState() {
        return this.f14068U.getState();
    }

    public final Region getTransparentRegion() {
        return this.f14068U.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.f14068U.isAutoMirrored();
    }

    public final boolean isStateful() {
        return this.f14068U.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f14068U.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f14068U.setBounds(rect);
    }

    public final boolean onLevelChange(int i) {
        return this.f14068U.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    public final void setAlpha(int i) {
        this.f14068U.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        this.f14068U.setAutoMirrored(z);
    }

    public final void setChangingConfigurations(int i) {
        this.f14068U.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f14068U.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.f14068U.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.f14068U.setFilterBitmap(z);
    }

    public final void setHotspot(float f8, float f9) {
        if (this.f14069V) {
            b(f8, f9);
        }
    }

    public final void setHotspotBounds(int i, int i8, int i9, int i10) {
        if (this.f14069V) {
            c(i, i8, i9, i10);
        }
    }

    public final boolean setState(int[] iArr) {
        if (this.f14069V) {
            return this.f14068U.setState(iArr);
        }
        return false;
    }

    public final void setTint(int i) {
        this.f14068U.setTint(i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f14068U.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f14068U.setTintMode(mode);
    }

    public final boolean setVisible(boolean z, boolean z6) {
        if (this.f14069V) {
            return d(z, z6);
        }
        return false;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
