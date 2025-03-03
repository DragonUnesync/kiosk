package n0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: n0.d  reason: case insensitive filesystem */
public final class C1235d extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f13561a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f13562b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f13563c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f13564d;

    public final int getChangingConfigurations() {
        int i;
        int i8 = this.f13561a;
        Drawable.ConstantState constantState = this.f13562b;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i8 | i;
    }

    public final Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [n0.c, android.graphics.drawable.Drawable] */
    public final Drawable newDrawable(Resources resources) {
        ? drawable = new Drawable();
        drawable.f13558X = this;
        Drawable.ConstantState constantState = this.f13562b;
        if (constantState != null) {
            drawable.h(constantState.newDrawable(resources));
        }
        C1234c.a();
        return drawable;
    }
}
